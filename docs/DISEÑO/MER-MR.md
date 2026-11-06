# 3.2 MER y Modelo Relacional
 
Esta sección presenta el modelo entidad-relación (MER) conceptual de NexaActivos y el modelo relacional derivado de él. El MER se construye a partir del diccionario de datos en tercera forma normal de la sección 3.1 (versión v7) y coincide con las clases y asociaciones del diagrama de clases v6. El modelo relacional es la base del script DDL de la sección 4.1.
 
## 3.2.1 MER conceptual
 
El MER tiene 14 entidades y 19 relaciones. Las enumeraciones (por ejemplo Estado_Activo o Nombre_Rol) no son entidades ni tablas: se modelan como columnas ENUM. Reportes tampoco es una entidad: es una vista de consulta sin clave primaria ni foránea (se explica en la sección 3.2.2).
 
Notación. Todas las figuras usan una sola notación, la de pata de gallo. Cada relación se lee desde la entidad padre (la que aporta la PK) hacia la entidad hija (la que contiene la FK) y sus extremos muestran la cardinalidad mínima y máxima:
 
dos barras: uno y solo uno (1..1);
 
círculo y barra: cero o uno (0..1);
 
círculo y pata: cero o muchos (0..*).
 
La cardinalidad se deriva del diccionario. En el lado padre, el mínimo es 1 si la FK es obligatoria y 0 si es opcional (Devolucion.ID_Receptor e Historial_Mantenimientos.ID_ReporteDanios). En el lado hijo, el máximo es 1 si la FK es UNIQUE (relación uno a uno de diseño) y muchos en los demás casos; el mínimo es 0, porque el esquema no obliga a que un padre tenga hijos. Esta lectura coincide con las multiplicidades del diagrama de clases v6. Los verbos de las relaciones son una propuesta del equipo, pendiente de validar con el cliente.
 
Agrupación. Las entidades se agrupan con los nombres de paquete del diagrama de clases v6:
 
Seguridad y acceso: Usuario, Rol_Permiso, Auditoria.
 
Préstamo de equipos: Custodio, Solicitud, Aprobacion, Asignacion, Acta_De_Entrega, Devolucion, Notificacion_De_Devolucion.
 
Inventario: Activo, Reporte_de_Danios, Historial_Mantenimientos.
 
Catálogos: Categoria.
 
Los grupos Reportes y Enumeraciones del diagrama no contienen entidades. La Figura 1 muestra las 14 entidades con sus claves (PK, FK y UQ) y las 19 relaciones, numeradas de R1 a R19 como en la Tabla 1. Las Figuras 2 a 5 muestran cada grupo con todos sus atributos. Las claves foráneas se muestran en las entidades para que se vea cómo se deriva el modelo relacional, que se dibuja en las Figuras 6 y 7.
 
**Tabla ****1****.** Relaciones del MER (padre → hijo)
 
| **N.º** | **Entidad padre (PK)** | **Entidad hija y FK** | **Verbo (padre → hija)** | **Cardinalidad lado padre** | **Cardinalidad lado hija** |
| --- | --- | --- | --- | --- | --- |
| R1 | Categoria (ID_Categoria) | Activo.ID_Categoria | clasifica | 1..1 | 0..* |
| R2 | Usuario (ID_Usuario) | Custodio.ID_Usuario | tiene perfil | 1..1 | 0..1 |
| R3 | Usuario (ID_Usuario) | Auditoria.ID_Usuario | ejecuta | 1..1 | 0..* |
| R4 | Asignacion (ID_Asignacion) | Acta_De_Entrega.ID_Asignacion | se firma en | 1..1 | 0..1 |
| R5 | Asignacion (ID_Asignacion) | Notificacion_De_Devolucion.ID_Asignacion | genera | 1..1 | 0..* |
| R6 | Categoria (ID_Categoria) | Solicitud.ID_Categoria | es pedida en | 1..1 | 0..* |
| R7 | Custodio (ID_Custodio) | Solicitud.ID_Custodio | realiza | 1..1 | 0..* |
| R8 | Solicitud (ID_Solicitud) | Aprobacion.ID_Solicitud | recibe | 1..1 | 0..1 |
| R9 | Usuario (ID_Usuario) | Aprobacion.ID_Aprobador | decide (rol: aprobador) | 1..1 | 0..* |
| R10 | Custodio (ID_Custodio) | Asignacion.ID_Custodio | recibe | 1..1 | 0..* |
| R11 | Activo (ID_Activo) | Asignacion.ID_Activo | se entrega en | 1..1 | 0..* |
| R12 | Solicitud (ID_Solicitud) | Asignacion.ID_Solicitud | origina | 1..1 | 0..1 |
| R13 | Asignacion (ID_Asignacion) | Devolucion.ID_Asignacion | termina en | 1..1 | 0..1 |
| R14 | Usuario (ID_Usuario) | Devolucion.ID_Receptor | confirma (rol: receptor) | 0..1 | 0..* |
| R15 | Custodio (ID_Custodio) | Reporte_de_Danios.ID_Custodio | reporta | 1..1 | 0..* |
| R16 | Activo (ID_Activo) | Reporte_de_Danios.ID_Activo | afecta a | 1..1 | 0..* |
| R17 | Activo (ID_Activo) | Historial_Mantenimientos.ID_Activo | recibe | 1..1 | 0..* |
| R18 | Reporte_de_Danios (ID_ReporteDanios) | Historial_Mantenimientos.ID_ReporteDanios | motiva | 0..1 | 0..* |
| R19 | Usuario (ID_Usuario) | Historial_Mantenimientos.ID_Tecnico | ejecuta (rol: técnico) | 1..1 | 0..* |
 
*Fuente: *Elaboración propia a partir del Diccionario de Datos v7. Verbos: propuesta del equipo, pendiente de validar con el cliente.
 
*Figura **1**.* MER en pata de gallo con claves: vista general
 
*Fuente: *Elaboración propia a partir del Diccionario de Datos v7 y del diagrama de clases v6 (CRF-003).
 
*Figura **2**.* MER en pata de gallo con claves: Seguridad y acceso
 
*Fuente: *Elaboración propia a partir del Diccionario de Datos v7 y del diagrama de clases v6 (CRF-003).
 
*Figura **3**.* MER en pata de gallo con claves: Préstamo de equipos (solicitud y decisión)
 
*Fuente: *Elaboración propia a partir del Diccionario de Datos v7 y del diagrama de clases v6 (CRF-003).
 
*Figura **4**.* MER en pata de gallo con claves: Préstamo de equipos (entrega y devolución)
 
*Fuente: *Elaboración propia a partir del Diccionario de Datos v7 y del diagrama de clases v6 (CRF-003).
 
*Figura **5**.* MER en pata de gallo con claves: Inventario y Catálogos
 
*Fuente: *Elaboración propia a partir del Diccionario de Datos v7 y del diagrama de clases v6 (CRF-003).
 
## 3.2.2 Modelo relacional
 
El modelo relacional se deriva del MER: cada entidad es una tabla, cada relación es una FK en la tabla hija y cada columna conserva el tipo SQL y la longitud del diccionario de datos, que es la fuente de verdad. Son 14 tablas, 83 columnas almacenadas y 19 FK.
 
Notación. Cada tabla se escribe como Tabla(PK, atributos, FK): la PK va subrayada y las FK van en cursiva, al final. Después de cada notación, una tabla lista las columnas en el orden del diccionario, con su tipo SQL, si admite nulos, sus restricciones y la tabla referenciada o los valores del ENUM. No se definen acciones referenciales (ON DELETE y ON UPDATE): las define el DDL de la sección 4.1.
 
Restricciones UNIQUE. Activo.Numero_Serie, Activo.Placa_Inventario, Usuario.Email, Custodio.ID_Usuario, Categoria.Nombre_Categoria, Acta_De_Entrega.ID_Asignacion, Aprobacion.ID_Solicitud, Asignacion.ID_Solicitud y Devolucion.ID_Asignacion son UNIQUE simples. Custodio tiene además una restricción UNIQUE compuesta sobre (tipo_documento, N_documento), propuesta del equipo pendiente de validar con el cliente. Las relaciones uno a uno salen de esas restricciones: Solicitud con Aprobacion y con Asignacion, y Asignacion con Acta_De_Entrega y con Devolucion; Custodio con Usuario es uno a uno por el UNIQUE de Custodio.ID_Usuario.
 
Las Figuras 6 y 7 muestran el modelo relacional completo: una caja por tabla, con las PK marcadas con * y las FK marcadas con (FK), y las 19 relaciones R1 a R19.
 
*Figura **6**.* Modelo relacional en pata de gallo: Préstamo de equipos (7 tablas)
 
*Fuente: *Elaboración propia a partir del Diccionario de Datos v7 y de la Tabla 1 (relaciones R1 a R19).
 
*Figura **7**.* Modelo relacional en pata de gallo: Seguridad y acceso, Inventario y Catálogos (7 tablas)
 
*Fuente: *Elaboración propia a partir del Diccionario de Datos v7 y de la Tabla 1 (relaciones R1 a R19).
 
### Grupo Seguridad y acceso
 
**Usuario(**ID_Usuario, Nombre, Apellido, Email, Password, activo, rol**)**
 
**Tabla ****2****.** Columnas de Usuario
 
| **Columna** | **Tipo SQL** | **Nulo** | **Restricciones** | **Referencia o valores del ENUM** |
| --- | --- | --- | --- | --- |
| ID_Usuario | INT(11) | NOT NULL | PK | — |
| Nombre | VARCHAR(20) | NOT NULL | — | — |
| Apellido | VARCHAR(20) | NOT NULL | — | — |
| Email | VARCHAR(100) | NOT NULL | UNIQUE | — |
| Password | VARCHAR(255) | NOT NULL | — | — |
| activo | BOOLEAN | NOT NULL | DEFAULT TRUE | — |
| rol | ENUM | NOT NULL | — | Responsable de Activos, Empleado, Aprobador, Técnico de Soporte, Gerente |
 
*Fuente: *Diccionario de Datos v7.
 
**Rol_Permiso(**rol, permiso**)**
 
**Tabla ****3****.** Columnas de Rol_Permiso
 
| **Columna** | **Tipo SQL** | **Nulo** | **Restricciones** | **Referencia o valores del ENUM** |
| --- | --- | --- | --- | --- |
| rol | ENUM | NOT NULL | PK (compuesta) | Responsable de Activos, Empleado, Aprobador, Técnico de Soporte, Gerente |
| permiso | ENUM | NOT NULL | PK (compuesta) | Crear, Consultar, Actualizar, Inactivar, Aprobar, Notificar, Asignar, Devolver, Reportar |
 
*Fuente: *Diccionario de Datos v7.
 
**Auditoria(**ID_Auditoria, Entidad, ID_Registro, Accion, Fecha_Accion, Detalle, *ID_Usuario***)**
 
**Tabla ****4****.** Columnas de Auditoria
 
| **Columna** | **Tipo SQL** | **Nulo** | **Restricciones** | **Referencia o valores del ENUM** |
| --- | --- | --- | --- | --- |
| ID_Auditoria | INT(11) | NOT NULL | PK | — |
| ID_Usuario | INT(11) | NOT NULL | FK | → Usuario(ID_Usuario) |
| Entidad | VARCHAR(50) | NOT NULL | — | — |
| ID_Registro | INT(11) | NOT NULL | — | — |
| Accion | ENUM | NOT NULL | — | Crear, Consultar, Actualizar, Inactivar, Aprobar, Rechazar, Notificar, Asignar, Devolver, Reportar |
| Fecha_Accion | DATETIME | NOT NULL | — | — |
| Detalle | VARCHAR(300) | NULL | — | — |
 
*Fuente: *Diccionario de Datos v7.
 
### Grupo Préstamo de equipos
 
**Custodio(**ID_Custodio, Fecha_Registro, N_documento, Direccion, tipo_documento, activo, *ID_Usuario***)**
 
**Tabla ****5****.** Columnas de Custodio
 
| **Columna** | **Tipo SQL** | **Nulo** | **Restricciones** | **Referencia o valores del ENUM** |
| --- | --- | --- | --- | --- |
| ID_Custodio | INT(11) | NOT NULL | PK | — |
| ID_Usuario | INT(11) | NOT NULL | UNIQUE; FK | → Usuario(ID_Usuario) |
| Fecha_Registro | DATE | NOT NULL | — | — |
| N_documento | VARCHAR(20) | NOT NULL | UNIQUE (tipo_documento, N_documento) | — |
| Direccion | VARCHAR(200) | NOT NULL | — | — |
| tipo_documento | ENUM | NOT NULL | UNIQUE (tipo_documento, N_documento) | CC, CE, PA |
| activo | BOOLEAN | NOT NULL | DEFAULT TRUE | — |
 
*Fuente: *Diccionario de Datos v7.
 
**Solicitud(**ID_Solicitud, Motivo, Fecha_Solicitud, Estado_Solicitud, *ID_Categoria*, *ID_Custodio***)**
 
**Tabla ****6****.** Columnas de Solicitud
 
| **Columna** | **Tipo SQL** | **Nulo** | **Restricciones** | **Referencia o valores del ENUM** |
| --- | --- | --- | --- | --- |
| ID_Solicitud | INT(11) | NOT NULL | PK | — |
| ID_Categoria | INT(11) | NOT NULL | FK | → Categoria(ID_Categoria) |
| Motivo | VARCHAR(255) | NOT NULL | — | — |
| Fecha_Solicitud | DATETIME | NOT NULL | — | — |
| ID_Custodio | INT(11) | NOT NULL | FK | → Custodio(ID_Custodio) |
| Estado_Solicitud | ENUM | NOT NULL | — | Pendiente, Aprobada, Rechazada, Cancelada |
 
*Fuente: *Diccionario de Datos v7.
 
**Aprobacion(**ID_Aprobacion, Decision, Motivo_Rechazo, Fecha_Decision, *ID_Solicitud*, *ID_Aprobador***)**
 
**Tabla ****7****.** Columnas de Aprobacion
 
| **Columna** | **Tipo SQL** | **Nulo** | **Restricciones** | **Referencia o valores del ENUM** |
| --- | --- | --- | --- | --- |
| ID_Aprobacion | INT(11) | NOT NULL | PK | — |
| ID_Solicitud | INT(11) | NOT NULL | UNIQUE; FK | → Solicitud(ID_Solicitud) |
| ID_Aprobador | INT(11) | NOT NULL | FK | → Usuario(ID_Usuario) |
| Decision | ENUM | NOT NULL | — | Aprobada, Rechazada |
| Motivo_Rechazo | VARCHAR(300) | NULL | — | — |
| Fecha_Decision | DATETIME | NOT NULL | — | — |
 
*Fuente: *Diccionario de Datos v7.
 
**Asignacion(**ID_Asignacion, Fecha_Entrega, Fecha_Devolucion_Esperada, Estado_Asignacion, *ID_Custodio*, *ID_Activo*, *ID_Solicitud***)**
 
**Tabla ****8****.** Columnas de Asignacion
 
| **Columna** | **Tipo SQL** | **Nulo** | **Restricciones** | **Referencia o valores del ENUM** |
| --- | --- | --- | --- | --- |
| ID_Asignacion | INT(11) | NOT NULL | PK | — |
| Fecha_Entrega | DATE | NOT NULL | — | — |
| Fecha_Devolucion_Esperada | DATE | NOT NULL | — | — |
| Estado_Asignacion | ENUM | NOT NULL | — | Vigente, Cerrada |
| ID_Custodio | INT(11) | NOT NULL | FK | → Custodio(ID_Custodio) |
| ID_Activo | INT(11) | NOT NULL | FK | → Activo(ID_Activo) |
| ID_Solicitud | INT(11) | NOT NULL | UNIQUE; FK | → Solicitud(ID_Solicitud) |
 
*Fuente: *Diccionario de Datos v7.
 
**Acta_De_Entrega(**ID_Acta, Fecha_Firma, Ruta_Acta, Firma_Digital, *ID_Asignacion***)**
 
**Tabla ****9****.** Columnas de Acta_De_Entrega
 
| **Columna** | **Tipo SQL** | **Nulo** | **Restricciones** | **Referencia o valores del ENUM** |
| --- | --- | --- | --- | --- |
| ID_Acta | INT(11) | NOT NULL | PK | — |
| ID_Asignacion | INT(11) | NOT NULL | UNIQUE; FK | → Asignacion(ID_Asignacion) |
| Fecha_Firma | DATETIME | NOT NULL | — | — |
| Ruta_Acta | VARCHAR(255) | NOT NULL | — | — |
| Firma_Digital | VARCHAR(255) | NOT NULL | — | — |
 
*Fuente: *Diccionario de Datos v7.
 
**Devolucion(**ID_Devolucion, Fecha_Devolucion, Observaciones, Estado_Recepcion, Fecha_Confirmacion, *ID_Asignacion*, *ID_Receptor***)**
 
**Tabla ****10****.** Columnas de Devolucion
 
| **Columna** | **Tipo SQL** | **Nulo** | **Restricciones** | **Referencia o valores del ENUM** |
| --- | --- | --- | --- | --- |
| ID_Devolucion | INT(11) | NOT NULL | PK | — |
| Fecha_Devolucion | DATETIME | NOT NULL | — | — |
| Observaciones | VARCHAR(255) | NULL | — | — |
| ID_Asignacion | INT(11) | NOT NULL | UNIQUE; FK | → Asignacion(ID_Asignacion) |
| Estado_Recepcion | ENUM | NOT NULL | — | Pendiente, Confirmada |
| Fecha_Confirmacion | DATETIME | NULL | — | — |
| ID_Receptor | INT(11) | NULL | FK | → Usuario(ID_Usuario) |
 
*Fuente: *Diccionario de Datos v7.
 
**Notificacion_De_Devolucion(**ID_Notificacion, *ID_Asignacion***)**
 
**Tabla ****11****.** Columnas de Notificacion_De_Devolucion
 
| **Columna** | **Tipo SQL** | **Nulo** | **Restricciones** | **Referencia o valores del ENUM** |
| --- | --- | --- | --- | --- |
| ID_Notificacion | INT(11) | NOT NULL | PK | — |
| ID_Asignacion | INT(11) | NOT NULL | FK | → Asignacion(ID_Asignacion) |
 
*Fuente: *Diccionario de Datos v7.
 
### Grupo Inventario
 
**Activo(**ID_Activo, Marca, Modelo, Estado, Numero_Serie, Placa_Inventario, Ubicacion, *ID_Categoria***)**
 
**Tabla ****12****.** Columnas de Activo
 
| **Columna** | **Tipo SQL** | **Nulo** | **Restricciones** | **Referencia o valores del ENUM** |
| --- | --- | --- | --- | --- |
| ID_Activo | INT(11) | NOT NULL | PK | — |
| Marca | VARCHAR(50) | NOT NULL | — | — |
| Modelo | VARCHAR(50) | NOT NULL | — | — |
| Estado | ENUM | NOT NULL | — | Disponible, Asignado, Dañado, Baja |
| Numero_Serie | VARCHAR(20) | NOT NULL | UNIQUE | — |
| Placa_Inventario | VARCHAR(11) | NOT NULL | UNIQUE | — |
| Ubicacion | VARCHAR(100) | NULL | — | — |
| ID_Categoria | INT(11) | NOT NULL | FK | → Categoria(ID_Categoria) |
 
*Fuente: *Diccionario de Datos v7.
 
**Reporte_de_Danios(**ID_ReporteDanios, Descripcion_Danio, Evidencia, Fecha_Reporte, Tipo_Danio, *ID_Custodio*, *ID_Activo***)**
 
**Tabla ****13****.** Columnas de Reporte_de_Danios
 
| **Columna** | **Tipo SQL** | **Nulo** | **Restricciones** | **Referencia o valores del ENUM** |
| --- | --- | --- | --- | --- |
| ID_ReporteDanios | INT(11) | NOT NULL | PK | — |
| Descripcion_Danio | VARCHAR(500) | NOT NULL | — | — |
| Evidencia | VARCHAR(255) | NULL | — | — |
| Fecha_Reporte | DATETIME | NOT NULL | — | — |
| ID_Custodio | INT(11) | NOT NULL | FK | → Custodio(ID_Custodio) |
| Tipo_Danio | ENUM | NOT NULL | — | Hardware, Software, Otro |
| ID_Activo | INT(11) | NOT NULL | FK | → Activo(ID_Activo) |
 
*Fuente: *Diccionario de Datos v7.
 
**Historial_Mantenimientos(**ID_Mantenimiento, Tipo_Mantenimiento, Descripcion, Fecha_Mantenimiento, Costo, Evidencia, *ID_Activo*, *ID_ReporteDanios*, *ID_Tecnico***)**
 
**Tabla ****14****.** Columnas de Historial_Mantenimientos
 
| **Columna** | **Tipo SQL** | **Nulo** | **Restricciones** | **Referencia o valores del ENUM** |
| --- | --- | --- | --- | --- |
| ID_Mantenimiento | INT(11) | NOT NULL | PK | — |
| ID_Activo | INT(11) | NOT NULL | FK | → Activo(ID_Activo) |
| ID_ReporteDanios | INT(11) | NULL | FK | → Reporte_de_Danios(ID_ReporteDanios) |
| Tipo_Mantenimiento | ENUM | NOT NULL | — | Preventivo, Correctivo |
| Descripcion | VARCHAR(300) | NOT NULL | — | — |
| Fecha_Mantenimiento | DATETIME | NOT NULL | — | — |
| ID_Tecnico | INT(11) | NOT NULL | FK | → Usuario(ID_Usuario) |
| Costo | BIGINT(20) | NULL | — | — |
| Evidencia | VARCHAR(255) | NULL | — | — |
 
*Fuente: *Diccionario de Datos v7.
 
### Grupo Catálogos
 
**Categoria(**ID_Categoria, Nombre_Categoria, activo**)**
 
**Tabla ****15****.** Columnas de Categoria
 
| **Columna** | **Tipo SQL** | **Nulo** | **Restricciones** | **Referencia o valores del ENUM** |
| --- | --- | --- | --- | --- |
| ID_Categoria | INT(11) | NOT NULL | PK | — |
| Nombre_Categoria | VARCHAR(50) | NOT NULL | UNIQUE | — |
| activo | BOOLEAN | NOT NULL | DEFAULT TRUE | — |
 
*Fuente: *Diccionario de Datos v7.
 
### Enumeraciones
 
Las enumeraciones no son tablas ni entidades: cada una es el conjunto de valores de una columna ENUM. La Tabla 16 resume las 12 columnas ENUM de las tablas y la columna Tipo_Reporte de la vista Reportes.
 
**Tabla ****16****.** Columnas ENUM y sus valores
 
| **Columna** | **Enumeración** | **Valores** |
| --- | --- | --- |
| Activo.Estado | Estado_Activo | Disponible, Asignado, Dañado, Baja |
| Rol_Permiso.rol | Nombre_Rol | Responsable de Activos, Empleado, Aprobador, Técnico de Soporte, Gerente |
| Rol_Permiso.permiso | Nombre_Permiso | Crear, Consultar, Actualizar, Inactivar, Aprobar, Notificar, Asignar, Devolver, Reportar |
| Usuario.rol | Nombre_Rol | Responsable de Activos, Empleado, Aprobador, Técnico de Soporte, Gerente |
| Custodio.tipo_documento | Tipo_Documento | CC, CE, PA |
| Auditoria.Accion | Accion_Auditoria | Crear, Consultar, Actualizar, Inactivar, Aprobar, Rechazar, Notificar, Asignar, Devolver, Reportar |
| Reportes.Tipo_Reporte | Tipo_Reporte | Asignados, Disponibles, Pendientes_Devolucion, Mal_Estado |
| Solicitud.Estado_Solicitud | Estado_Solicitud | Pendiente, Aprobada, Rechazada, Cancelada |
| Aprobacion.Decision | Decision | Aprobada, Rechazada |
| Asignacion.Estado_Asignacion | Estado_Asignacion | Vigente, Cerrada |
| Devolucion.Estado_Recepcion | Estado_Recepcion | Pendiente, Confirmada |
| Reporte_de_Danios.Tipo_Danio | Tipo_Danio | Hardware, Software, Otro |
| Historial_Mantenimientos.Tipo_Mantenimiento | Tipo_Mantenimiento | Preventivo, Correctivo |
 
*Fuente: *Diccionario de Datos v7 y diagrama de clases v6.
 
### Por qué Reportes no es una tabla
 
Reportes es una vista de consulta sobre Activo, Asignacion y Devolucion. No almacena datos: sus tres elementos (Fecha_Inicio, Fecha_Fin opcional y Tipo_Reporte) son los parámetros del filtro y no tiene PK ni FK, por lo que no es una entidad del MER ni una tabla del modelo relacional. Cada reporte generado se registra en Auditoria con Accion = Reportar.
 
### Por qué Dias_Restantes no se almacena
 
Notificacion_De_Devolucion./Dias_Restantes es un dato derivado: se calcula como Fecha_Devolucion_Esperada (de Asignacion) menos la fecha actual. Guardarlo lo dejaría desactualizado al día siguiente. Por eso no es una columna del modelo relacional; lo calcula el método calcularDiasRestantes().