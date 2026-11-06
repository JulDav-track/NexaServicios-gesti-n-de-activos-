# NexaActivos: sistema de gestión de activos de Nexa Servicios S.A.S.

Ingeniería de Software II · Uniremington 2026-02 · RUP adaptado · Docente: Gloria Amparo Lora Patiño
Equipo: Julián David Valencia Gamboa y Eliú Marimón Arrieta

Este repositorio es la imagen del plano de carpetas del Documento de Diseño Arquitectónico (sección 3.6 v3_GenC, Tabla 6). Todo lo que aquí se declara es propuesta del equipo, pendiente de validar con la docente; nada está validado por el cliente.

## Estructura

```
(raíz del repositorio)
├── .gitignore                      exclusiones (compilados, IDE, registros, credenciales)
├── .gitattributes                  *.sql -text: Git no altera los scripts SQL
├── README.md
├── db/
│   ├── nexaactivos_ddl.sql         DDL v1.2 aprobado (sección 4.1), copia byte a byte
│   └── datos_prueba.sql            datos de prueba v1.0 (solo INSERT), copia byte a byte
├── docs/                           documentos .md de las Fases 0 y 1 (contexto, objetivos, análisis)
└── src/main/
    ├── java/co/nexaservicios/nexaactivos/
    │   ├── modelo/
    │   │   ├── seguridad_acceso/   Usuario, Auditoria, Rol_Permiso (3)
    │   │   ├── prestamo_equipos/   Solicitud, Aprobacion, Custodio, Asignacion,
    │   │   │                       Acta_De_Entrega, Devolucion, Notificacion_De_Devolucion (7)
    │   │   ├── inventario/         Activo, Reporte_de_Danios, Historial_Mantenimientos (3)
    │   │   ├── catalogos/          Categoria (1)
    │   │   ├── reportes/           Reportes, vista (1)
    │   │   └── enumeraciones/      las 12 enumeraciones del diagrama v6 con CRF-003 (12)
    │   ├── servicio/               15 clases <Entidad>Servicio (Tabla 4 del DDA)
    │   └── controlador/            15 clases <Entidad>Controlador (Tabla 4 del DDA)
    └── resources/
        ├── application.properties  conexión; la clave se lee de NEXA_DB_PASSWORD
        └── templates/              mk01.html a mk13.html (MK-01 a MK-13, mockups 2.5)
```

No hay capa de repositorio (ni JpaRepository ni CrudRepository): el DDA la excluye (supuesto 2); adoptarla sería un cambio al DDA y exigiría un CRF. En esta versión las clases son esqueletos con cabecera de trazabilidad; el código del corte vertical (sección 4.3) se agrega después, un commit por RF.

### Diferencias declaradas con la Tabla 6 del DDA 3.6 v3_GenC

| N.º | Diferencia | Motivo |
| --- | --- | --- |
| 1 | Carpeta `docs/` | Conserva, con su historial (`git mv`), los documentos .md de las Fases 0 y 1 que el repositorio ya tenía. La Tabla 6 no la prevé. |
| 2 | `db/datos_prueba.sql` | La Tabla 6 solo prevé `db/nexaactivos_ddl.sql`; la diferencia ya está declarada en la cabecera del archivo. |
| 3 | `.gitattributes` | Impide que Git cambie los finales de línea de los scripts SQL en Windows. |
| 4 | `src/main/resources/application.properties` | Configuración de la conexión sin clave (IS2, paso 14). |
| 5 | Paquete base `co.nexaservicios.nexaactivos` | La Tabla 6 deja el paquete base para la Fase 3; este nombre es propuesta del equipo. |
| 6 | Nombre de la raíz | La Tabla 6 propone `nexaactivos/`; el repositorio conserva su nombre en GitHub. |
| 7 | Nombres de las plantillas `mk01.html` a `mk13.html` | La Tabla 6 fija una plantilla por pantalla, sin nombre de archivo. |

## Base de datos

Motor: MariaDB 10.4 o superior (probado en 10.4.32, XAMPP en Windows), con `sql_mode` que incluya `STRICT_TRANS_TABLES`. Se ejecuta primero el DDL y después los datos de prueba, desde la carpeta del repositorio:

```
mysql -u root -p --default-character-set=utf8mb4 < db\nexaactivos_ddl.sql > salida_ddl.txt 2>&1
mysql -u root -p --default-character-set=utf8mb4 < db\datos_prueba.sql > salida_datos.txt 2>&1
```

El DDL no contiene sentencias `DELETE` ni `ON DELETE CASCADE`; las 19 FK usan `ON DELETE RESTRICT`. La baja es lógica (columna `activo` o estado). La única eliminación física del sistema es `Rol_Permiso.retirar()` (HU-39, P-78) y se hace desde el código.

## Clave de la base de datos

Ningún archivo del repositorio contiene una clave. `application.properties` lee la clave de la variable de entorno `NEXA_DB_PASSWORD` y, si se define, el usuario de `NEXA_DB_USER` (si no, usa `root`). En Windows se fijan una sola vez desde cmd:

```
setx NEXA_DB_PASSWORD "la_clave_del_usuario_de_MariaDB"
setx NEXA_DB_USER "root"
```

`setx` guarda la variable para las consolas nuevas: después de ejecutarlo hay que cerrar la consola (y el IDE) y abrir una nueva. Para comprobarla: `echo %NEXA_DB_PASSWORD%`. Los archivos `.env` y `application-local.properties` están excluidos en `.gitignore`.

## Reglas del repositorio (gestión de la configuración)

1. La rama de trabajo es `main`. No se reescribe el historial: nunca `git push --force`, `git rebase` sobre commits publicados ni `git commit --amend` de un commit publicado.
2. La línea base LB-1 es el tag anotado `LB-1`. Una línea base no se modifica: después de LB-1 todo cambio entra por un CRF aprobado y, una vez aplicado, produce una nueva línea base (LB-2) con su propio tag anotado.
3. Código del corte vertical: un commit por RF, en el orden de las filas de la matriz de trazabilidad (sección 3.9 v2, Tabla 1), con este formato:

   `HU-xx RF-xx: <Servicio.método()> <descripción breve> [LB-1]`

   Ejemplo de forma (HU-01 y RF-01 según la fila HU-01 de la matriz 3.9 v2): `HU-01 RF-01: ActivoServicio.crear() ... [LB-1]`. Un commit que aplique un cambio posterior a LB-1 cita además su CRF entre corchetes.
4. Cada archivo fuente lleva una cabecera de trazabilidad (HU, RF, RN, CU, MK, CRF y línea base) y su historial de versiones.
5. Los scripts de `db/` llevan cabecera de historial y no se editan sin CRF; `.gitattributes` evita que Git altere sus bytes.
6. `.gitignore` deja fuera compilados (`target/`, `*.class`, `*.jar`), archivos de IDE, registros y credenciales.

## Línea base LB-1

Tag anotado `LB-1` sobre el commit «LB-1: estructura del DDA v3_GenC, DDL v1.2 y datos_prueba v1.0». Congela (nombres de archivo del Proyecto):

| Grupo | Elemento congelado |
| --- | --- |
| (a) Versiones leídas según la Tabla 1 del acta 3.10 v4 | NexaActivos_3_4_Constancia_7b_v3.docx (3.4 v3); NexaActivos_3_5_Diagramas_de_Actividades_v3_GenB.docx (3.5 v3_GenB); NexaActivos_3_6_DDA_v3_GenC.docx (3.6 v3_GenC); NexaActivos_3_7_Diagramas_de_Secuencia_v3.docx (3.7 v3); NexaActivos_3_8_Diagramas_de_Estados_v3_GenA.docx (3.8 v3_GenA); NexaActivos_3_9_Matriz_trazabilidad_v2.docx (3.9 v2); 3.10 v3, versión leída del acta, que el Proyecto no conserva como archivo y que se congela en su versión firmada (grupo b) |
| (b) Acta firmada | NexaActivos_3_10_Acta_lectura_cruzada_v4.docx (3.10 v4) |
| (c) Bases del DDL y del código | Diccionario_y_Clases_corregido_v7.docx; NexaActivos_3_2_MER_y_Modelo_Relacional.docx; NexaActivos_Diagrama_de_clases_v6_CRF003.pdf; NexaActivos_CRF-003_final.docx; NexaActivos_FaseC_Consolidado_46HU.docx; NexaActivos_Mockups_2_5.docx |
| (d) Scripts de la base de datos | `db/nexaactivos_ddl.sql` (DDL v1.2); `db/datos_prueba.sql` (datos_prueba v1.0) |

M2 pendiente de decisión de la docente; la lectura del acta 3.10 v4 fue interna, no por otro equipo.

## Historial de este README

| Versión | Fecha | Autores | Cambio |
| --- | --- | --- | --- |
| 1.0 | 06/11/2026 | Julián David Valencia Gamboa; Eliú Marimón Arrieta | Estructura del DDA, base de datos, clave, reglas GCS y LB-1 (sección 4.2) |
