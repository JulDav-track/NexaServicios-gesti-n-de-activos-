**Diccionario de Datos y Diagrama de Clases**
 
Eliu Marimon y Julian Valencia
 
Facultad de Ingeniería, Uniremington
 
Ingeniería de Software 2
 
Docente: Gloria Lora
 
Versión v7
 
01 de noviembre de 2026
 
**Diccionario de Datos**
 
**Tabla Activo**
 
| **Elemento** | **Descripción** | **Tipo de Dato** | **Longitud** | **Obligatorio** | **Observaciones** |
| --- | --- | --- | --- | --- | --- |
| ID_Activo | Identificador único del equipo | INT | 11 | Sí | PK |
| Marca | Marca del equipo | VARCHAR | 50 | Sí | - |
| Modelo | Modelo del equipo | VARCHAR | 50 | Sí | - |
| Estado | Estado actual | ENUM (Disponible, Asignado, Dañado, Baja) | - | Sí | Valores Fijos. Valor inicial: Disponible (asignado por el sistema al crear). Quién lo cambia (CRF-003, RN propuestas, pendientes de validar con el cliente): Asignacion.asignar() pasa un activo Disponible a Asignado; Devolucion.confirmarRecepcion() pasa a Disponible un activo que esté Asignado (si está Dañado, sigue Dañado); Reporte_de_Danios.crear() lo pasa a Dañado, aunque tenga una asignación Vigente (guarda un solo valor); registrar un mantenimiento no lo cambia: el Responsable de Activos lo devuelve a Disponible con Activo.actualizar() |
| Numero_Serie | identificador del producto a nivel global | VARCHAR | 20 | Sí | Unique |
| Placa_Inventario | código interno asignado por la empresa | VARCHAR | 11 | Sí | Unique |
| Ubicacion | Ubicación actual | VARCHAR | 100 | No | - |
| ID_Categoria | Identificador único de la categoría | INT | 11 | Sí | FK hacia Categoria |

 
**Tabla ****Rol_Permiso**
 
*// Método consultarPermisos(rol : Nombre_Rol) : List**<**Nombre_Permiso**>** — devuelve la lista de permisos (Nombre_Permiso) asignados al rol indicado. Solo consulta: no modifica datos. //*
 
| **Elemento** | **Descripción** | **Tipo de Dato** | **Longitud** | **Obligatorio** | **Observaciones** |
| --- | --- | --- | --- | --- | --- |
| rol | Rol al que se otorga el permiso | ENUM (Responsable de Activos, Empleado, Aprobador, Técnico de Soporte, Gerente) | - | Sí | Valores Fijos. Parte de la PK compuesta |
| permiso | Permiso que se otorga al rol | ENUM (Crear, Consultar, Actualizar, Inactivar, Aprobar, Notificar, Asignar, Devolver, Reportar) | - | Sí | Valores Fijos. Parte de la PK compuesta. Sin FK (Caso 4 de 4b) |
| PK compuesta | Clave primaria compuesta | - | - | Sí | (rol, permiso) |
 
**Tabla Usuario**
 
| **Elemento** | **Descripción** | **Tipo de Dato** | **Longitud** | **Obligatorio** | **Observaciones** |
| --- | --- | --- | --- | --- | --- |
| ID_Usuario | Identificador único del Usuario | INT | 11 | Sí | PK |
| Nombre | nombre del usuario | VARCHAR | 20 | Sí | - |
| Apellido | Apellido del usuario | VARCHAR | 20 | Sí | - |
| Email | Correo electrónico del usuario | VARCHAR | 100 | Sí | Unique. Usado para notificaciones |
| Password | Contraseña encriptada del usuario | VARCHAR | 255 | Sí | Contraseña encriptada |
| activo | Indica si la cuenta está activa (baja lógica, jamás DELETE) | BOOLEAN | - | Sí | NOT NULL DEFAULT TRUE. Valor inicial: TRUE (asignado por el sistema al crear) |
| rol | Rol (perfil) del usuario en el sistema | ENUM (Responsable de Activos, Empleado, Aprobador, Técnico de Soporte, Gerente) | - | Sí | Valores Fijos (los 5 actores del Alcance 1.2) |
 
**Tabla Custodio**
 
| **Elemento** | **Descripción** | **Tipo de Dato** | **Longitud** | **Obligatorio** | **Observaciones** |
| --- | --- | --- | --- | --- | --- |
| ID_Custodio | Identificador único del custodio (empleado que tiene equipos a su cargo) | INT | 11 | Sí | PK |
| ID_Usuario | Cuenta de usuario asociada al custodio | INT | 11 | Sí | FK hacia Usuario. Unique |
| Fecha_Registro | Fecha en que el empleado fue registrado como custodio | DATE | - | Sí | Asignado por el sistema: fecha actual al crear |
| N_documento | Número del documento personal del custodio | VARCHAR | 20 | Sí | Unique junto con tipo_documento (un documento, un custodio). RN propuesta, pendiente de validar con el cliente |
| Direccion | Dirección del custodio | VARCHAR | 200 | Sí | - |
| tipo_documento | Tipo de documento del custodio (se guarda el código) | ENUM ('CC','CE','PA') | - | Sí | Valores Fijos. Etiquetas: CC = Cédula, CE = Cédula de extranjería, PA = Pasaporte. CC y PA vienen del diccionario v5 («Cédula, Pasaporte»); CE es propuesta, pendiente de validar con el cliente. Unique junto con N_documento (RN propuesta, pendiente de validar con el cliente) |
| activo | Indica si el custodio está activo (baja lógica, jamás DELETE) | BOOLEAN | - | Sí | NOT NULL DEFAULT TRUE. Valor inicial: TRUE (asignado por el sistema al crear) |
 
**Tabla Categoria**
 
| **Elemento** | **Descripción** | **Tipo de Dato** | **Longitud** | **Obligatorio** | **Observaciones** |
| --- | --- | --- | --- | --- | --- |
| ID_Categoria | Identificador único de la categoría | INT | 11 | Sí | PK |
| Nombre_Categoria | Nombre de la categoría (Laptop, Celular, Herramienta, etc.) | VARCHAR | 50 | Sí | Unique |
| activo | Indica si la categoría está activa (baja lógica, jamás DELETE) | BOOLEAN | - | Sí | NOT NULL DEFAULT TRUE. Valor inicial: TRUE (asignado por el sistema al crear) |
 
**Tabla Auditoria**
 
| **Elemento** | **Descripción** | **Tipo de Dato** | **Longitud** | **Obligatorio** | **Observaciones** |
| --- | --- | --- | --- | --- | --- |
| ID_Auditoria | Identificador único del registro de auditoría | INT | 11 | Sí | PK |
| ID_Usuario | Usuario que ejecutó la acción | INT | 11 | Sí | FK hacia Usuario |
| Entidad | Nombre de la tabla afectada | VARCHAR | 50 | Sí | Nombre de la entidad auditada. Ej: Activo, Solicitud, Devolucion |
| ID_Registro | Identificador del registro afectado | INT | 11 | Sí | Referencia lógica al registro de la entidad indicada en Entidad (no es una FK física) |
| Accion | Tipo de operación realizada | ENUM (Crear, Consultar, Actualizar, Inactivar, Aprobar, Rechazar, Notificar, Asignar, Devolver, Reportar) | - | Sí | Valores Fijos. Inactivar cubre inactivar, darDeBaja, cancelar y cerrar |
| Fecha_Accion | Fecha y hora de la acción | DATETIME | - | Sí | Asignado por el sistema: fecha y hora actuales al crear |
| Detalle | Información adicional sobre la acción | VARCHAR | 300 | No | Ej: “Solicitud #12 rechazada por falta de documentación” |
 
**Tabla ****Acta_De_Entrega**
 
| **Elemento** | **Descripción** | **Tipo de Dato** | **Longitud** | **Obligatorio** | **Observaciones** |
| --- | --- | --- | --- | --- | --- |
| ID_Acta | Identificador del acta | INT | 11 | Sí | PK |
| ID_Asignacion | Identificador de la asignación que respalda el acta | INT | 11 | Sí | FK hacia Asignacion. Unique (un acta por asignación) |
| Fecha_Firma | Fecha y hora en que el custodio firmó el acta | DATETIME | - | Sí | Asignado por el sistema: fecha y hora actuales al crear |
| Ruta_Acta | Documento con acta firmada por el custodio | VARCHAR | 255 | Sí | Ruta del archivo del acta firmada |
| Firma_Digital | Validación electrónica del receptor | VARCHAR | 255 | Sí | Código de validación (hash criptográfico) del receptor |
 
**Tabla Notificacion_De_Devolucion**
 
*// Notificacion_De_Devolucion es el único tipo de notificación automática del sistema (aviso por correo de próximas devoluciones). //Dias_Restantes es un campo variable //se calcula a partir de la fecha de devolución esperada (tabla Asignacion)//*
 
| **Elemento** | **Descripción** | **Tipo de Dato** | **Longitud** | **Obligatorio** | **Observaciones** |
| --- | --- | --- | --- | --- | --- |
| ID_Notificacion | Código de la notificación | INT | 11 | Sí | PK |
| ID_Asignacion | Identificador de la asignación cuya devolución se avisa | INT | 11 | Sí | FK hacia Asignacion |
| /Dias_Restantes | Días restantes para devolución | INT | - | - | Dato derivado, no se almacena: Fecha_Devolucion_Esperada (Asignacion) menos la fecha actual |
 
**Vista Reportes (parámetros de consulta, no es una tabla)**
 
*// Reportes es una vista (consulta) sobre Activo, Asignacion y Devolucion. No almacena datos: los elementos siguientes son los parámetros del filtro y cada reporte generado se registra en Auditoria (Accion = Reportar). //*
 
| **Elemento** | **Descripción** | **Tipo de Dato** | **Longitud** | **Obligatorio** | **Observaciones** |
| --- | --- | --- | --- | --- | --- |
| Fecha_Inicio | Fecha inicial del filtro | DATE | - | Sí | - |
| Fecha_Fin | Fecha final del filtro | DATE | - | No | - |
| Tipo_Reporte | Tipo de reporte solicitado | ENUM (Asignados, Disponibles, Pendientes_Devolucion, Mal_Estado) | - | Sí | Valores Fijos (según el alcance 1.2) |
 
**Tabla Solicitud**
 
| **Elemento** | **Descripción** | **Tipo de Dato** | **Longitud** | **Obligatorio** | **Observaciones** |
| --- | --- | --- | --- | --- | --- |
| ID_Solicitud | Número único de solicitud | INT | 11 | Sí | PK |
| ID_Categoria | Identificador Categoria | INT | 11 | Sí | FK hacia Categoria |
| Motivo | Justificación de la solicitud | VARCHAR | 255 | Sí | - |
| Fecha_Solicitud | Fecha de la solicitud | DATETIME | - | Sí | Asignado por el sistema: fecha y hora actuales al crear |
| ID_Custodio | Identificador único del custodio que solicita el equipo | INT | 11 | Sí | FK hacia Custodio |
| Estado_Solicitud | Estado de la solicitud | ENUM (Pendiente, Aprobada, Rechazada, Cancelada) | - | Sí | Valores Fijos. Valor inicial: Pendiente (asignado por el sistema al crear). Pasa a Aprobada o Rechazada al registrar la aprobación y a Cancelada al cancelar la solicitud con cancelar() |
 
**Tabla Aprobacion**
 
| **Elemento** | **Descripción** | **Tipo de Dato** | **Longitud** | **Obligatorio** | **Observaciones** |
| --- | --- | --- | --- | --- | --- |
| ID_Aprobacion | Identificador unico de la aprobación | INT | 11 | Sí | PK |
| ID_Solicitud | Identificador de la solicitud | INT | 11 | Sí | FK hacia Solicitud. Unique (una decisión por solicitud) |
| ID_Aprobador | Identificador unico del Usuario | INT | 11 | Sí | FK hacia Usuario |
| Decision | Decisión tomada | ENUM (Aprobada, Rechazada) | - | Sí | Valores Fijos |
| Motivo_Rechazo | Motivo por el cual se rechazó la Solicitud | VARCHAR | 300 | No | Solo obligatorio si Decision = Rechazada |
| Fecha_Decision | Fecha de la decisión tomada | DATETIME | - | Sí | Asignado por el sistema: fecha y hora actuales al registrar la decisión. Al registrarse, la Solicitud pasa a Aprobada o Rechazada según la decisión |
 
**Tabla Asignacion**
 
| **Elemento** | **Descripción** | **Tipo de Dato** | **Longitud** | **Obligatorio** | **Observaciones** |
| --- | --- | --- | --- | --- | --- |
| ID_Asignacion | Identificador de la asignación | INT | 11 | Sí | PK |
| Fecha_Entrega | Fecha en que se entregó el equipo | DATE | - | Sí | Asignado por el sistema: fecha actual al crear |
| Fecha_Devolucion_Esperada | Fecha de devolucion esperada | DATE | - | Sí | - |
| Estado_Asignacion | Estado de la asignación (Vigente mientras el equipo está en poder del custodio) | ENUM (Vigente, Cerrada) | - | Sí | Valores Fijos. Valor inicial: Vigente (asignado por el sistema al crear). Pasa a Cerrada con cerrar(), solo si existe una Devolucion en estado Confirmada; lo invoca confirmarRecepcion() (CRF-003) |
| ID_Custodio | Identificador único del custodio que recibe el equipo | INT | 11 | Sí | FK hacia Custodio. Al crear se copia de la Solicitud asociada |
| ID_Activo | Identificador del activo asignado | INT | 11 | Sí | FK hacia Activo |
| ID_Solicitud | Número único de la solicitud aprobada | INT | 11 | Sí | FK hacia Solicitud. Unique (una solicitud, una asignación) |
 
**Tabla Devolucion**
 
| **Elemento** | **Descripción** | **Tipo de Dato** | **Longitud** | **Obligatorio** | **Observaciones** |
| --- | --- | --- | --- | --- | --- |
| ID_Devolucion | Identificador de la devolución | INT | 11 | Sí | PK |
| Fecha_Devolucion | Fecha real de devolución | DATETIME | - | Sí | Asignado por el sistema: fecha y hora actuales al crear |
| Observaciones | Notas adicionales de la devolución | VARCHAR | 255 | No | - |
| ID_Asignacion | Identificador de la asignación que se devuelve | INT | 11 | Sí | FK hacia Asignacion. Unique (una devolución por asignación). RN propuesta, pendiente de validar con el cliente |
| Estado_Recepcion | Estado de la confirmación de recepción | ENUM (Pendiente, Confirmada) | - | Sí | Valores Fijos. Valor inicial: Pendiente (asignado por el sistema al crear). Al confirmar la recepción pasa a Confirmada e invoca Asignacion.cerrar() (CRF-003) |
| Fecha_Confirmacion | Fecha y hora en que se confirmó la recepción | DATETIME | - | No | Se llena al confirmar la recepción |
| ID_Receptor | Responsable de Activos que confirma la recepción | INT | 11 | No | FK hacia Usuario. Se llena al confirmar la recepción |
 
**Tabla Reporte_de_Danios**
 
| **Elemento** | **Descripción** | **Tipo de Dato** | **Longitud** | **Obligatorio** | **Observaciones** |
| --- | --- | --- | --- | --- | --- |
| ID_ReporteDanios | Identificador del reporte de daños | INT | 11 | Sí | PK |
| Descripcion_Danio | Detalle del daño o problema | VARCHAR | 500 | Sí | - |
| Evidencia | Foto o archivo adjunto | VARCHAR | 255 | No | Ruta del archivo |
| Fecha_Reporte | Fecha del reporte de daño | DATETIME | - | Sí | Asignado por el sistema: fecha y hora actuales al crear |
| ID_Custodio | Identificador único del custodio que reporta el daño | INT | 11 | Sí | FK hacia Custodio |
| Tipo_Danio | Detalles del problema presentado por el activo | ENUM (Hardware, Software, Otro) | - | Sí | Valores Fijos |
| ID_Activo | Clave foránea que apunta a Activo | INT | 11 | Sí | FK hacia Activo. Al crear el reporte, el Activo pasa a Dañado (CRF-003) |
 
**Tabla Historial_Mantenimientos**
 
| **Elemento** | **Descripción** | **Tipo de Dato** | **Longitud** | **Obligatorio** | **Observaciones** |
| --- | --- | --- | --- | --- | --- |
| ID_Mantenimiento | Identificador único del registro de mantenimiento | INT | 11 | Sí | PK |
| ID_Activo | Activo al que se le realiza el mantenimiento | INT | 11 | Sí | FK hacia Activo. Registrar un mantenimiento no cambia el Estado del Activo (CRF-003) |
| ID_ReporteDanios | Reporte de daño que originó el mantenimiento | INT | 11 | No | FK hacia Reporte_de_Danios. Opcional (puede estar vacío) |
| Tipo_Mantenimiento | Tipo de mantenimiento | ENUM (Preventivo, Correctivo) | - | Sí | Valores Fijos |
| Descripcion | Detalle del mantenimiento realizado | VARCHAR | 300 | Sí | Ej: “Cambio de batería” |
| Fecha_Mantenimiento | Fecha y hora del mantenimiento | DATETIME | - | Sí | - |
| ID_Tecnico | Usuario (rol Técnico de Soporte) que realizó el mantenimiento | INT | 11 | Sí | FK hacia Usuario |
| Costo | Valor asociado al mantenimiento | BIGINT | 20 | No | Opcional. Valor en pesos, sin centavos |
| Evidencia | Documento o archivo de soporte | VARCHAR | 255 | No | Ej: foto, informe técnico |
 
**Registro de correcciones del diccionario (auditoría cruzada)**
 
Cambios aplicados sobre la versión anterior del diccionario (original → versión actual). Los tipos de dato son tipos SQL compatibles con MariaDB.
 
| **Tabla.Campo** | **Antes** | **Después** | **Por qué** | **Para qué** | **Tipo** |
| --- | --- | --- | --- | --- | --- |
| Custodio (antes Responsable) | Tabla Responsable; ID_Responsable en las tablas que lo usan | Tabla Custodio; ID_Custodio; + Estado (Activo/Inactivo); Fecha_Asignación pasa a Fecha_Registro | El nombre se confundía con el rol "Responsable de Activos". Un custodio solo se registra cuando solicita un equipo; lo registra el Responsable de Activos. | Nombre fácil de identificar; el Estado da sentido a Custodio.deactivate(). | Decisión |
| Singular en todas las tablas | Solicitudes, Aprobaciones, Equipos_Asignados, Devoluciones | Solicitud, Aprobacion, Asignacion, Devolucion (y sus ID) | En UML una clase representa un solo elemento; Asignacion nombra mejor el registro que Equipos_Asignados. | Mismos nombres en diccionario, UML y SQL. | Decisión |
| Activo.Marca_Modelo | Un solo campo | Marca y Modelo (VARCHAR 50) | Dos datos en un campo no cumplen la primera forma normal. | Cumplir 3FN y poder filtrar por marca. | Decisión |
| Estado en Categoria y Tipo_Documento | Sin estado | Estado ENUM (Activo, Inactivo) | Se conservan sus deactivate() y necesitan un estado donde guardarlo. | Baja lógica sin perder historial. | Decisión |
| Solicitud.Estado_Solicitud | Pendiente, Aprobada, Rechazada | + Cancelada | Solicitud.deactivate() equivale a cancelar y no existía ese estado. | Dar sentido al método y a la transición del diagrama de estados (3.8). | Decisión |
| Asignacion.ID_Solicitud | FK sin restricción | FK Unique | Regla acordada: una solicitud aprobada genera una sola asignación (un equipo por solicitud). | Cadena trazable solicitud → aprobación → asignación → acta → devolución. | Decisión |
| Devolucion.ID_Custodio | Campo presente | Eliminado | El custodio ya se deduce de la asignación (Devolucion → Asignacion → Custodio); era un dato repetido. | Cumplir 3FN y evitar custodios contradictorios. | Decisión |
| Aprobacion.ID_Solicitud | FK sin restricción | FK Unique | La decisión es irrevocable: una sola por solicitud. | Evitar decisiones contradictorias. | Decisión |
| Acta_De_Entrega | ID_Activo, ID_Responsable, Fecha_Entrega, acta | ID_Asignacion (Unique), Fecha_Firma, Ruta_Acta; Firma_Digital VARCHAR(255) | Activo y custodio ya se deducen de la asignación (datos repetidos); la fecha de entrega ya está en Asignacion y la del acta es la de la firma; la firma es un código de validación, no una imagen. | Evitar datos repetidos (3FN) y mostrar el flujo asignar → acta → firma. | Decisión |
| Notificacion_De_Devolucion.ID_devoluciones | FK hacia Devoluciones | ID_Asignacion, FK hacia Asignacion | El aviso se necesita antes de devolver, pero una devolución solo existe después; la fecha esperada vive en Asignacion. | Poder calcular Dias_Restantes (tipo INT, derivado). | Estructural |
| Devolucion: confirmación de recepción | Sin campos | Estado_Recepcion, Fecha_Confirmacion, ID_Receptor (FK a Usuario) | El alcance prevé que el Responsable de Activos confirme la recepción y ningún campo la registraba. | Cerrar la asignación y liberar el equipo con evidencia de quién confirmó. | Decisión |
| Historial_Mantenimientos.ID_ReporteDanios | Sin vínculo | FK opcional hacia Reporte_de_Danios | No se podía saber qué mantenimiento atendió cada reporte; es opcional porque un mantenimiento preventivo no nace de un reporte. | Trazabilidad reporte → mantenimiento y consulta de reportes sin atender. | Decisión |
| Reportes | Tabla con ID_Reporte, ID_Activo y filtros | Vista; solo parámetros Fecha_Inicio, Fecha_Fin y Tipo_Reporte (Asignados, Disponibles, Pendientes_Devolucion, Mal_Estado) | Una vista no tiene PK ni FK; el alcance pide además equipos disponibles y en mal estado. | Datos siempre actuales, sin duplicar; cada reporte se registra en Auditoria. | Decisión |
| Permiso.Nombre_Permiso y Auditoria.Accion | Incluían "Eliminar" | "Desactivar"; Accion suma Asignar, Devolver y Reportar | El sistema solo hace baja lógica; el alcance pide auditar asignaciones y devoluciones. | Coherencia entre permisos, acciones y métodos. | Decisión |
| Responsable.ID_Usuario (descripción) | Usuario que ejecutó la acción | Cuenta de usuario asociada al custodio | Descripción copiada de Auditoria. | Que describa lo que realmente es. | Error |
| Custodio.N_documento | INT(11) | VARCHAR(20) | INT no admite ceros ni letras (pasaportes) y se desborda con cédulas de 10 dígitos. | Guardar cualquier documento sin pérdida. | Error |
| Historial_Mantenimientos.Costo | INT(10) | BIGINT(20), valor en pesos sin centavos | INT(10) se queda corto para valores altos; el peso colombiano no se maneja con centavos. | Reportes de costo correctos. | Error |
| Historial_Mantenimientos.Responsable | Responsable, FK a Usuario | ID_Tecnico, FK a Usuario | Se llamaba como una tabla a la que no apunta. | Nombre que indica a qué apunta. | Consistencia |
| Asignacion.Estado_Equipo | ENUM (activo o inactivo), longitud 20 | Estado_Asignacion, ENUM (Activo, Inactivo) | Se confundía con Activo.Estado; un ENUM no lleva longitud. | Dar sentido a Asignacion.deactivate(). | Consistencia |
| Permiso.Permisos | Permisos | Nombre_Permiso | Plural para un solo valor. | Mismo patrón que Nombre_Rol. | Consistencia |
| Aprobacion.Desicion | Desicion | Decision | Ortografía; Motivo_Rechazo ya la citaba bien. | Coherencia en el SQL. | Error |
| Auditoria.ID_Registro | FK a la entidad | Referencia lógica (no FK física) | Un campo no puede ser FK de todas las tablas a la vez. | DDL correcto y diagrama sin asociaciones falsas. | Error |
| Ruta_Acta y Evidencia | VARCHAR sin longitud; campo "acta" | VARCHAR(255); Ruta_Acta | Un VARCHAR sin longitud no compila en SQL. | Script DDL ejecutable. | Error |
| Identificadores con tilde o ñ | Ubicación, Fecha_Devolución, Descripción_Daño, Tipo_daño… | Ubicacion, Fecha_Devolucion, Descripcion_Danio, Tipo_Danio… | Dan problemas en SQL y código. | Mismos nombres en diccionario, UML y SQL. | Consistencia |
| Formato general | "Si", "si", "SI", "Varchar", "Enum" | "Sí", "VARCHAR", "ENUM" | Estaba escrito de varias formas. | Lectura uniforme. | Consistencia |
| Notificacion_De_Devolucion (nota de la tabla) y Alcance 1.2 | Sin aclarar el tipo de notificación; el Alcance prometía además avisos por aprobación de solicitud, equipo listo para recoger y reporte de daño | Se aclara que es el único tipo de notificación automática del sistema. El Alcance se reduce a ese aviso y suma consultas: Solicitud.read y Asignacion.read (Empleado) y Reporte_de_Danios.read (Técnico de Soporte). Los demás avisos pasan a "Fuera del alcance" como trabajo futuro. El UML no cambia. | El modelo solo tiene Notificacion_De_Devolucion: las demás notificaciones no tenían método que las soportara. | Que Alcance, diccionario y UML prometan lo mismo. | Decisión |
| Rol_Permiso (método consultarPermisos) | Solo asignar() y retirar(); UML con 57 métodos | Se agrega consultarPermisos(idRol): Permiso[] (solo consulta, no modifica datos), documentado en una nota de la tabla; UML con 58 métodos y el Alcance suma que el Responsable de Activos consulta los permisos de cada rol. | No existía forma de consultar qué permisos tiene un rol. | Poder verificar la configuración de roles y permisos. | Decisión |
| Valores iniciales y asignados por el sistema (17 campos en 12 tablas) | Los create() no recibían ciertos estados ni fechas y el diccionario no decía con qué valor nacen | Columna Observaciones indica el valor inicial o asignado por el sistema: Usuario, Custodio y Categoria: activo = TRUE; Asignacion.Estado_Asignacion = Vigente; Activo.Estado = Disponible; Solicitud.Estado_Solicitud y Devolucion.Estado_Recepcion = Pendiente; fechas (Custodio.Fecha_Registro, Asignacion.Fecha_Entrega) = fecha del sistema; fechas y horas (Solicitud, Aprobacion, Acta, Devolucion, Reporte_de_Danios, Auditoria) = momento del sistema; Asignacion.ID_Custodio se copia de la Solicitud; al registrar una Aprobacion la Solicitud pasa a Aprobada o Rechazada. En el UML se muestran como valor por defecto. | Sin esos valores el diagrama de estados, los DEFAULT del script SQL y el corte vertical quedaban ambiguos. | Estados y fechas consistentes en diccionario, UML y SQL. | Decisión |
| Usuario, Custodio y Categoria: Estado → activo | Estado ENUM (Activo, Inactivo) con valor inicial Activo (CRF-001) | activo BOOLEAN NOT NULL DEFAULT TRUE (valor inicial TRUE al crear) | Doctrina del ejemplo del curso: baja lógica con activo, jamás DELETE. Reemplaza el valor inicial de CRF-001 en estas tres tablas. | Baja lógica uniforme y valores DEFAULT claros en el script SQL. | Decisión (CRF-002) |
| Tipo_Documento (tabla eliminada) y Custodio.tipo_documento | Tabla Tipo_Documento (Nombre_Tipo, Estado) y Custodio.ID_TipoDocumento (FK) | Custodio.tipo_documento ENUM Tipo_Documento ('CC','CE','PA'). CE (Cédula de extranjería) es propuesta, pendiente de validar con el cliente. | Nadie gestionaría ese catálogo (FK sin productor): ajuste de diseño del Caso 4 del protocolo 4b, sin HU nueva. | Menos tablas y 4 métodos sin respaldo menos. | Decisión (CRF-002) |
| Rol (tabla eliminada), Usuario.rol y Rol_Permiso.rol | Tabla Rol (ID_Rol, Nombre_Rol, Descripcion); Usuario.ID_Rol y Rol_Permiso.ID_Rol como FK | ENUM Nombre_Rol (los 5 actores) en Usuario.rol y Rol_Permiso.rol; PK compuesta (rol, permiso). Rol.Descripcion ya no se almacena. | Los 5 roles son fijos (actores del Alcance 1.2): catálogo sin productor, Caso 4 de 4b. | Elimina la tabla Rol y 3 métodos. | Decisión (CRF-002) |
| Rol_Permiso.consultarPermisos (nota de la tabla) | consultarPermisos(idRol): Permiso[] (CRF-001) | consultarPermisos(rol : Nombre_Rol) : List<Nombre_Permiso> | El rol y el permiso pasaron a ser enumeraciones. | Firma coherente con el nuevo tipo. | Consistencia (CRF-002) |
| Enumeración Estado_Registro (UML) | Usada por Usuario, Custodio, Categoria, Tipo_Documento y Asignacion | Renombrada Estado_Asignacion (solo la usa Asignacion); valores Vigente y Cerrada (ver la entrada de Asignacion.Estado_Asignacion). | Dejó de usarse en las demás clases. | Nombre que indica a quién pertenece. | Consistencia (CRF-002) |
| Métodos de todas las clases (UML y tabla método → HU padre) | 58 métodos genéricos (create, read, update, deactivate…) | 61 métodos públicos, cada uno con una HU padre, y 14 auxiliares INTERNO (75 en total). Nombres específicos en español; reciben el objeto de la entidad. | Doctrina del ejemplo: una HU por operación; los INTERNO protegen una RN dentro de crear() y actualizar() o son de apoyo (Auditoria.registrar). | Trazabilidad método → HU sin métodos huérfanos. | Decisión (CRF-002) |
| Permiso (tabla eliminada) y Nombre_Permiso | Tabla Permiso (ID_Permiso, Nombre_Permiso, Descripcion) con 4 métodos públicos y 1 INTERNO | ENUM Nombre_Permiso (Crear, Consultar, Actualizar, Inactivar, Aprobar, Notificar, Asignar, Devolver, Reportar). Permiso.Descripcion ya no se almacena. | Caso 4 de 4b (FK sin productor): un permiso nuevo solo surge al programar una función nueva. La «gestión de roles y permisos» del Alcance 1.2 se cumple con otorgar, retirar y consultar permisos por rol. Reversible. | Elimina la tabla Permiso, 5 métodos y 3 HU provisionales. | Decisión (CRF-002) |
| Rol_Permiso.ID_Permiso → permiso | ID_Permiso INT(11), FK hacia Permiso; PK compuesta (rol, ID_Permiso) | permiso ENUM Nombre_Permiso, sin FK; PK compuesta (rol, permiso). Métodos: asignar(rp : Rol_Permiso), existeAsignacion(rol, permiso) INTERNO, retirar(rol, permiso) y consultarPermisos(rol). | El permiso pasó a ser una enumeración. | Firmas coherentes con el nuevo tipo y sin FK. | Consistencia (CRF-002) |
| Asignacion.Estado_Asignacion (valores) | ENUM (Activo, Inactivo); valor inicial Activo | ENUM (Vigente, Cerrada); valor inicial Vigente. cerrar() la pone Cerrada y listarVigentes() filtra Vigente. | Activo e Inactivo se parecían al booleano activo y chocaban con el nombre de la clase Activo; es un estado de proceso. | Vocabulario que describe el punto del proceso. | Decisión (CRF-002) |
| Auditoria.Accion | ENUM con el valor Desactivar | ENUM con el valor Inactivar (10 valores). Inactivar cubre inactivar, darDeBaja, cancelar y cerrar. | Los métodos de baja lógica se llaman inactivar() y el atributo es activo. | Mismo vocabulario en acciones, permisos y métodos. | Consistencia (CRF-002) |
| Devolucion.ID_Asignacion | FK hacia Asignacion | FK hacia Asignacion. Unique (una devolución por asignación). RN propuesta, pendiente de validar con el cliente. Método INTERNO existeDevolucionDeAsignacion(idAsignacion) dentro de registrar(). | Coherente con la multiplicidad 0..1 del UML y con las demás claves únicas; evita devolver dos veces la misma asignación. | Integridad de la devolución. | Decisión (CRF-002) |
| Auditoria.registrar() | Método público con HU provisional | Método INTERNO (apoyo, lo invocan las demás operaciones), sin HU. Auditoria queda con un método público (buscarPorId). La regla se documenta como RN/RNF para numerar en 2.2. | La auditoría la dispara el sistema; ningún actor pide «registrar auditoría». Alcance 1.2: registro completo de auditoría de las acciones relevantes. | Sin HU huérfana; la regla queda como RN/RNF. | Decisión (CRF-002) |
| Notificacion_De_Devolucion.buscarPorId() | Método público con HU provisional | Eliminado. La clase queda con generarAviso() (público) y calcularDiasRestantes() (INTERNO). | Sin valor propio: el aviso llega por correo. | Un método y una HU menos sin respaldo. | Decisión (CRF-002) |
| Custodio.tipo_documento + N_documento | N_documento sin restricción de unicidad | Unique (tipo_documento, N_documento). RN propuesta, pendiente de validar con el cliente. Métodos: existeDocumento(tipo, nDocumento) INTERNO y buscarPorDocumento(tipo, nDocumento) público (HU-06). | Dos custodios con el mismo documento serían la misma persona duplicada; poder localizarlo (N-02). | Evita duplicados y permite buscar al custodio por su documento. | Decisión (CRF-002) |
| Tipo_Documento (códigos en BD) | ENUM TipoDocumento (Cédula, Pasaporte, Cédula de extranjería) | ENUM Tipo_Documento ('CC','CE','PA'); etiquetas Cédula, Cédula de extranjería y Pasaporte. CE sigue siendo propuesta, pendiente de validar con el cliente. | Códigos estables y compactos en la BD; nombre con guion bajo como las demás enumeraciones. | Mismo estilo de nombres que el UML. | Consistencia (CRF-002) |
| Activo.Estado (transiciones) | Sin responsable definido para Asignado, para volver a Disponible al devolver ni para Dañado tras un reporte de daño | Poscondiciones en las observaciones: asignar() pasa a Asignado; confirmarRecepcion() pasa a Disponible (si está Dañado, sigue Dañado); Reporte_de_Danios.crear() pasa a Dañado; un mantenimiento no cambia el estado. Observaciones también en Reporte_de_Danios.ID_Activo e Historial_Mantenimientos.ID_Activo | Cuatro cambios de Estado_Activo sin responsable (CRF-003, cuestión 1: A1 + M-a). RN propuestas, pendientes de validar con el cliente | Documentar quién fija cada valor sin métodos nuevos. Sin cambio de atributos, tipos, ENUM ni FK (14 tablas y la vista Reportes) | Decisión (CRF-003) |
| Asignacion.cerrar() (Estado_Asignacion) | cerrar() y confirmarRecepcion() con el mismo efecto sobre la asignación (HU-18 y HU-24) | cerrar() sigue público bajo HU-18, solo procede si existe una Devolucion Confirmada y lo invoca confirmarRecepcion() (HU-24). Observaciones en Asignacion.Estado_Asignacion y Devolucion.Estado_Recepcion | Dos HU con el mismo efecto (CRF-003, cuestión 2: B-1). No existe cierre sin devolución; un equipo que no se devuelve no tiene salida (P-C3-04) | Mantener la numeración de HU y la intención del diccionario: la confirmación cierra la asignación y libera el equipo | Decisión (CRF-003) |
| Solicitud.listarAprobadas() | Ningún método lista las solicitudes Aprobadas que aún no tienen asignación | Método público listarAprobadas() : List<Solicitud>, padre HU-10, de la más antigua a la más reciente (RN propuesta, pendiente de validar con el cliente). No cambia ningún ENUM | HU-15 no tenía cómo encontrar qué solicitud asignar (CRF-003, cuestión 3: C1a) | Que el Responsable de Activos encuentre las solicitudes por asignar. 62 públicos + 14 INTERNO = 76 | Decisión (CRF-003) |
| Solicitud.Estado_Solicitud | Pasa a Cancelada «al desactivar la solicitud» | Pasa a Cancelada «al cancelar la solicitud con cancelar()» | «Desactivar» ya fue reemplazado por «Inactivar» en el registro y el método vigente es cancelar() | Que la observación use el nombre del método del diagrama | Consistencia |
| Usuario.Email y Categoria.Nombre_Categoria (unicidad) | «Debe ser único, usado para notificaciones» y «Valores Únicos» | «Unique. Usado para notificaciones» y «Unique» | La unicidad se escribía de tres maneras; Activo y Custodio ya usan «Unique» | Una sola redacción de unicidad en todo el diccionario | Consistencia |
| Auditoria.Entidad | «Activo, Solicitud, Devolucion, .....» (lista incompleta) | «Nombre de la entidad auditada. Ej: Activo, Solicitud, Devolucion» | Los puntos suspensivos dejaban la observación sin terminar | Describir el campo sin una lista que parezca cerrada. Tipo y longitud no cambian | Consistencia |
