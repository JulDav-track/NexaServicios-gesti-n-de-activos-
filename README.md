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
├── pom.xml                         construcción con Maven (D-08)
├── db/
│   ├── nexaactivos_ddl.sql         DDL v1.2 aprobado (sección 4.1), copia byte a byte
│   └── datos_prueba.sql            datos de prueba v1.0 (solo INSERT), copia byte a byte
├── docs/                           documentos .md de las Fases 0 y 1 (contexto, objetivos, análisis)
└── src/main/
    ├── java/co/nexaservicios/nexaactivos/
    │   ├── NexaActivosAplicacion.java  arranque de Spring Boot (D-09)
    │   ├── soporte/                ConexionBD (D-10) y SesionActual (D-11)
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

No hay capa de repositorio (ni JpaRepository ni CrudRepository): el DDA la excluye (supuesto 2); adoptarla sería un cambio al DDA y exigiría un CRF. Las clases que no entran en el corte vertical siguen como esqueletos con cabecera de trazabilidad; el código del corte (sección 4.3) se agrega un commit por RF (ver «Corte vertical»).

### Diferencias declaradas con la Tabla 6 del DDA 3.6 v3_GenC

En las cabeceras de los archivos fuente cada fila se cita como D-01 a D-17 (por ejemplo, la fila 8 es D-08).

| N.º | Diferencia | Motivo |
| --- | --- | --- |
| 1 | Carpeta `docs/` | Conserva, con su historial (`git mv`), los documentos .md de las Fases 0 y 1 que el repositorio ya tenía. La Tabla 6 no la prevé. |
| 2 | `db/datos_prueba.sql` | La Tabla 6 solo prevé `db/nexaactivos_ddl.sql`; la diferencia ya está declarada en la cabecera del archivo. |
| 3 | `.gitattributes` | Impide que Git cambie los finales de línea de los scripts SQL en Windows. |
| 4 | `src/main/resources/application.properties` | Configuración de la conexión sin clave (IS2, paso 14). |
| 5 | Paquete base `co.nexaservicios.nexaactivos` | La Tabla 6 deja el paquete base para la Fase 3; este nombre es propuesta del equipo. |
| 6 | Nombre de la raíz | La Tabla 6 propone `nexaactivos/`; el repositorio conserva su nombre en GitHub. |
| 7 | Nombres de las plantillas `mk01.html` a `mk13.html` | La Tabla 6 fija una plantilla por pantalla, sin nombre de archivo. |
| 8 | `pom.xml` | Construcción con Maven: Spring Boot (web y Thymeleaf), Spring JDBC y el controlador de MariaDB; sin `spring-boot-starter-data-jpa`. Versiones: propuesta del equipo. |
| 9 | `NexaActivosAplicacion.java` en el paquete base | Clase de arranque que exige Spring Boot; no tiene lógica. |
| 10 | `soporte/ConexionBD.java` | Entrega el `JdbcTemplate` a los métodos de las clases del modelo, donde el DDA deja el acceso a datos (Tabla 1), y comprueba al arrancar que la sesión tenga `STRICT_TRANS_TABLES`. No es un repositorio ni valida RN. |
| 11 | `soporte/SesionActual.java` | Guarda por sesión HTTP el ID_Usuario y el rol del usuario con sesión (RNF-02; en 3.7 llegan con la petición). Mientras P-62 siga abierta, cada sesión toma un usuario de prueba de `application.properties`. |
| 12 | Spring JDBC en lugar de JPA | El supuesto 1 del DDA propone Spring Boot, Thymeleaf y JPA sin fijarlos. Con JPA el acceso a datos suele salir del modelo hacia repositorios o un `EntityManager`; con Spring JDBC queda dentro de los métodos de las clases del modelo, como pide la Tabla 1, y sin capa de repositorio. Pendiente de la docente. |
| 13 | Accesores get/set y constructores | Convención Java para leer y escribir los atributos privados; no son operaciones del diagrama. Las PK `{PK, readOnly}` no tienen setter: se fijan en el constructor. |
| 14 | Modo estricto por `connection-init-sql` | Cada conexión fija `sql_mode` con `STRICT_TRANS_TABLES` (equivale a `sessionVariables` en la URL JDBC, pero sin el problema de las comas dentro del valor). |
| 15 | Rechazos como excepciones estándar | El Servicio rechaza con `IllegalArgumentException` (texto M-xx) o `SecurityException` (rechazo por rol); los textos M-xx son constantes `M_xx` de cada Servicio, idénticas al catálogo E del Consolidado. |
| 16 | Constantes de `Nombre_Rol` con guion bajo | Java no admite espacios: `Responsable_de_Activos` y `Técnico_de_Soporte` se guardan en la base como 'Responsable de Activos' y 'Técnico de Soporte'. |
| 17 | Métodos GET del Controlador con el mismo nombre | Para mostrar MK-02, MK-10 y MK-11 antes de enviar, el Controlador tiene métodos GET con el nombre de la operación y otros parámetros (por ejemplo `crear(Model)` y `crear(Activo, Model)`). |

## Corte vertical (sección 4.3)

Propuesta del equipo, pendiente de validar con la docente. Entidad Activo, CU-01 (Tabla 8 y Figura 6 de 3.7) y HU-01 a HU-04, con las pantallas MK-01, MK-02, MK-10 y MK-11. Además, del resto del modelo solo se implementan los métodos que el corte invoca: `CategoriaServicio.buscarPorId()` («include» CU-48), `AsignacionServicio.buscarVigentePorActivo()` (asignación vigente, RN-A16a y RN-A19), `AuditoriaServicio.registrar()` (baja, RF-164) y `RolPermisoServicio.consultarPermisos()` (RF-166). Las demás clases siguen como esqueletos.

- Cadena: Vista (Thymeleaf) → `ActivoControlador` → `ActivoServicio` → `Activo`, en el orden de la Tabla 8 de 3.7. Las RN viven solo en los Servicios; el Controlador y las plantillas no validan RN.
- Baja lógica: `Activo.darDeBaja()` hace `UPDATE Activo SET Estado = 'Baja'`; el código no tiene ningún `DELETE`.
- Un commit por RF, en el orden de las filas HU-01 a HU-04 de la matriz 3.9 v2, y al final RF-166 (fila HU-38, transversal). Antes va un commit de base técnica sin RF (D-08 a D-17).
- Usuario con sesión: nadie puede iniciar sesión mientras P-62 siga abierta (contraseñas «SIN_DEFINIR_P-62»). La sesión de prueba toma el usuario de `nexa.sesion-prueba.id-usuario` y el rol de `nexa.sesion-prueba.rol` (por omisión 1, Responsable de Activos). Para probar el rechazo por rol, antes de arrancar: `set NEXA_SESION_ID_USUARIO=2` y `set NEXA_SESION_ROL=Empleado` (el Empleado no tiene permisos en `datos_prueba.sql`).
- Observación (pendiente de la docente): HU-04 CA-3 y CA-4 piden no mostrar el aviso M-30 cuando el activo ya está en Baja o está asignado. El diagrama v6 no tiene un método de prevalidación y la Vista no valida RN, así que MK-11 muestra el aviso y el rechazo (M-32 o M-31) llega al confirmar.

Compilar y correr (Windows, JDK 17 o superior y Maven 3.9; la base ya creada con `db\nexaactivos_ddl.sql` y `db\datos_prueba.sql`):

```
mvn -q -DskipTests package > salida_compilacion.txt 2>&1
mvn spring-boot:run > salida_ejecucion.txt 2>&1
```

Luego abrir `http://localhost:8080/activos`. Las salidas `salida_*.txt` están excluidas en `.gitignore`.

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
| 1.1 | 06/11/2026 | Julián David Valencia Gamboa; Eliú Marimón Arrieta | Corte vertical (sección 4.3): diferencias D-08 a D-17, sesión de prueba, compilar y correr |
