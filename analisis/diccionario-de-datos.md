# Diccionario de Datos

## Tabla Activo

| **Elemento**     | **Descripción**                     | **Tipo de Dato**                         | **Longitud** | **Obligatorio** | **Observaciones**  |
| ---------------- | ----------------------------------- | ---------------------------------------- | -----------: | :-------------: | ------------------ |
| **ID_Activo**    | Identificador único del equipo      | INT                                      |           11 |        Sí       | Clave primaria     |
| **Marca_Modelo** | Marca y modelo                      | Varchar                                  |          100 |        Sí       | -                  |
| **Estado**       | Estado actual                       | ENUM(Disponible, Asignado, Dañado, Baja) |            - |        Sí       | Valores Fijos      |
| **Ubicación**    | Ubicación actual                    | Varchar                                  |          100 |        No       | -                  |
| **ID_Categoria** | Identificador único de la categoría | INT                                      |           11 |        Sí       | FK hacia Categoria |

---

## Tabla Rol

| **Elemento**    | **Descripción**                    | **Tipo de Dato**                                                                              | **Longitud** | **Obligatorio** | **Observaciones**                                                         |
| --------------- | ---------------------------------- | --------------------------------------------------------------------------------------------- | -----------: | :-------------: | ------------------------------------------------------------------------- |
| **ID_Rol**      | Identificador único del rol        | INT                                                                                           |           11 |        Sí       | Clave primaria                                                            |
| **Nombre_Rol**  | asignación de rol                  | Emum(barra desplegable)                                                                       |            - |        Sí       | Responsable de Activos, Empleado, Aprobador, Técnico de Soporte, Gerente. |
| **Descripcion** | Sobre lo que trata el rol asignado | Varchar                                                                                       |          100 |        Sí       | -                                                                         |
| **Permisos**    | Cual es el alcance el rol asignado | ENUM(Crear, Consultar, Actualizar, Eliminar, Aprobar, Notificar, Asignar, Devolver, Reportar) |            - |        si       | Valores Fijos                                                             |

---

## Tabla Usuario

| **Elemento**   | **Descripción**                   | **Tipo de Dato**        | **Longitud** | **Obligatorio** | **Observaciones**                         |
| -------------- | --------------------------------- | ----------------------- | -----------: | :-------------: | ----------------------------------------- |
| **ID_Usuario** | Identificador único del Usuario   | INT                     |           11 |        Sí       | Clave primaria                            |
| **Nombre**     | nombre del usuario                | Varchar                 |           20 |        Sí       | -                                         |
| **Apellido**   | Apellido del usuario              | Varchar                 |           20 |        Sí       | -                                         |
| **Email**      | Correo electrónico del usuario    | Varchar                 |          100 |        Si       | Debe ser único, usado para notificaciones |
| **Password**   | Contraseña encriptada del usuario | Varchar                 |          255 |        Sí       | Contraseña encriptada                     |
| **Estado**     | Estado actual                     | ENUM (Activo, Inactivo) |            - |        Sí       | Valores Fijos                             |
| **ID_Rol**     | Identificador único del Rol       | INT                     |           11 |        Sí       | FK hacia Rol                              |

---

## Tabla Categoría

| **Elemento**         | **Descripción**                                             | **Tipo de Dato** | **Longitud** | **Obligatorio** | **Observaciones** |
| -------------------- | ----------------------------------------------------------- | ---------------- | -----------: | :-------------: | ----------------- |
| **ID_Categoria**     | Identificador único de la categoría                         | INT              |           11 |        Sí       | Clave primaria    |
| **Nombre_Categoria** | Nombre de la categoría (Laptop, Celular, Herramienta, etc.) | Varchar          |           50 |        Si       | Valores Únicos    |


## Tabla Auditoria

| **Elemento**     | **Descripción**                               | **Tipo de Dato**                                                           | **Longitud** | **Obligatorio** | **Observaciones**                                             |
| ---------------- | --------------------------------------------- | -------------------------------------------------------------------------- | -----------: | :-------------: | ------------------------------------------------------------- |
| **ID_Auditoria** | Identificador único del registro de auditoría | INT                                                                        |           11 |        Sí       | Clave primaria                                                |
| **ID_Usuario**   | Usuario que ejecutó la acción                 | INT                                                                        |           11 |        Sí       | FK hacia Usuario                                              |
| **Entidad**      | Nombre de la tabla afectada                   | Varchar                                                                    |           50 |        Sí       | Activo, Solicitud, Devolución, .....                          |
| **ID_Registro**  | Identificador del registro afectado           | INT                                                                        |           11 |        Sí       | FK hacia la entidad correspondiente donde se aplicó el cambio |
| **Accion**       | Tipo de operación realizada                   | ENUM(Crear, Consultar, Actualizar, Eliminar, Aprobar, Rechazar, Notificar) |            - |        Sí       | Valores Fijos                                                 |
| **Fecha_Accion** | Fecha y hora de la acción                     | DATETIME                                                                   |            - |        Sí       | -                                                             |
| **Detalle**      | Información adicional sobre la acción         | Varchar                                                                    |          300 |        No       | Ej: “Solicitud #12 rechazada por falta de documentación”      |

---

## Tabla Responsable

| **Elemento**           | **Descripción**                                | **Tipo de Dato** | **Longitud** | **Obligatorio** | **Observaciones**       |
| ---------------------- | ---------------------------------------------- | ---------------- | -----------: | :-------------: | ----------------------- |
| **ID_Responsable**     | Identificador unico del responsable del equipo | INT              |           11 |        Sí       | PK                      |
| **Nombre_Responsable** | Nombre completo del empleado                   | Varchar          |          150 |        Sí       | -                       |
| **Fecha_Asignación**   | Fecha de asignación                            | DATE             |            - |        Sí       | -                       |
| **N_documento**        | número del documento personal del responsable  | INT              |           11 |        Si       | -                       |
| **Direccion**          | Dirección del responsable                      | Varchar          |          200 |        Si       | -                       |
| **ID_TipoDocumento**   | Tipo de documento                              | INT              |           11 |        Sí       | FK hacia Tipo_Documento |

---

## Tabla Tipo_Documento

| **Elemento**         | **Descripción**              | **Tipo de Dato** | **Longitud** | **Obligatorio** | **Observaciones**       |
| -------------------- | ---------------------------- | ---------------- | -----------: | :-------------: | ----------------------- |
| **ID_TipoDocumento** | Identificador del tipo       | INT              |           11 |        Sí       | PK                      |
| **Nombre_Tipo**      | Nombre del tipo de documento | Varchar          |           50 |        Sí       | Cédula, Pasaporte, etc. |

---

## Tabla Acta_De_Entrega

| **Elemento**       | **Descripción**                               | **Tipo de Dato**                  | **Longitud** | **Obligatorio** | **Observaciones**                                              |
| ------------------ | --------------------------------------------- | --------------------------------- | -----------: | :-------------: | -------------------------------------------------------------- |
| **ID_Acta**        | Identificador del acta                        | INT                               |           11 |        Sí       | PK                                                             |
| **ID_Activo**      | Clave foránea que apunta a Activo             | INT                               |           11 |        Si       | FK hacia Activo                                                |
| **ID_Responsable** | Identificador unico del responsable           | INT                               |           11 |        Sí       | FK hacia Responsable                                           |
| **Fecha_Entrega**  | Fecha de entrega                              | DATETIME                          |            - |        Sí       | -                                                              |
| **acta**           | Documento con acta firmada por el responsable | VARCHAR (con la ruta del archivo) |            - |        SI       | -                                                              |
| **Firma_Digital**  | Validación electrónica del receptor           | Varchar /Base64                   |            - |        Sí       | Puede almacenarse como hash criptográfico o archivo encriptado |

---

## Tabla Notificación_De_Devolución

> **Nota:** Dias_Restantes es un campo Variable (puede calcularse a partir de la fecha de devolución).

| **Elemento**        | **Descripción**                           | **Tipo de Dato** | **Longitud** | **Obligatorio** | **Observaciones**     |
| ------------------- | ----------------------------------------- | ---------------- | -----------: | :-------------: | --------------------- |
| **ID_Notificacion** | Código de la notificación                 | INT              |           11 |        Sí       | PK                    |
| **ID_devolucion**   | Identificador de la devolución            | INT              |           11 |        Sí       | FK hacia Devoluciones |
| **Días_Restantes**  | Días restantes para devolución            | INT              |            3 |        Si       | -                     |
| **ID_Activo**       | Identificador unico del activo a devolver | INT              |           10 |        Si       | FK hacia Activo       |

---

## Tabla Reportes (Vista/Consulta)

> **Nota:** Reportes es una vista generada por filtros sobre Activos, Asignaciones y Devoluciones. No almacena datos, solo los consulta.

| **Elemento**     | **Descripción**                 | **Tipo de Dato** | **Longitud** | **Obligatorio** | **Observaciones**     |
| ---------------- | ------------------------------- | ---------------- | -----------: | :-------------: | --------------------- |
| **ID_Reporte**   | Identificador único del reporte | INT              |           11 |        Sí       | PK                    |
| **Fecha_Inicio** | Fecha inicial del filtro        | DATE             |            - |        SI       | -                     |
| **Fecha_Fin**    | Fecha final del filtro          | DATE             |            - |        No       | -                     |
| **Tipo_Reporte** | Tipo de reporte solicitado      | Varchar          |           50 |        Sí       | Asignados, Pendientes |
| **ID_Activo**    | Identificador unico del activo  | INT              |           11 |        No       | FK hacia Activo       |

---

## Tabla Solicitudes

| **Elemento**        | **Descripción**                                | **Tipo de Dato** | **Longitud** | **Obligatorio** | **Observaciones**    |
| ------------------- | ---------------------------------------------- | ---------------- | -----------: | :-------------: | -------------------- |
| **ID_Solicitud**    | Número único de solicitud                      | INT              |           11 |        Sí       | PK                   |
| **ID_Categoria**    | Identificador Categoria                        | INT              |           11 |        Sí       | FK hacia Categoria   |
| **Motivo**          | Justificación de la solicitud                  | Varchar          |          255 |        Sí       | -                    |
| **Fecha_Solicitud** | Fecha de la solicitud                          | DATETIME         |            - |        Sí       | -                    |
| **ID_Responsable**  | Identificador unico del responsable del equipo | INT              |           11 |        Sí       | FK hacia Responsable |


## Tabla Aprobaciones

| **Elemento**        | **Descripción**                            | **Tipo de Dato**          | **Longitud** | **Obligatorio** | **Observaciones**                        |
| ------------------- | ------------------------------------------ | ------------------------- | -----------: | :-------------: | ---------------------------------------- |
| **ID_Aprobaciones** | Identificador unico de                     | INT                       |           11 |        Sí       | PK                                       |
| **ID_Solicitud**    | Identificador De la solicitud              | INT                       |           11 |        Sí       | FK hacia Solicitud                       |
| **ID_Aprobador**    | Identificador unico del Usuario            | INT                       |           11 |        Sí       | FK hacia Usuario                         |
| **Desicion**        | Decisión tomada                            | ENUM(Aprobada, Rechazada) |            - |        Sí       | Valores Fijos                            |
| **Motivo_Rechazo**  | Motivo por el cual se rechazó la Solicitud | Varchar                   |          300 |        No       | Solo obligatorio si Decision = Rechazada |
| **Fecha_Decision**  | Fecha de la decisión tomada                | DATETIME                  |            - |        SI       | -                                        |

---

## Tabla Equipos Asignados

| **Elemento**       | **Descripción**                                | **Tipo de Dato**         | **Longitud** | **Obligatorio** | **Observaciones**     |
| ------------------ | ---------------------------------------------- | ------------------------ | -----------: | :-------------: | --------------------- |
| **ID_Asignado**    | Identificador del equipo asignado              | INT                      |           11 |        Sí       | PK                    |
| **Fecha_Entrega**  | Fecha en que se entregó el equipo              | DATE                     |            - |        Sí       | -                     |
| **Estado_Equipo**  | Estado actual del equipo                       | ENUM (activo o inactivo) |           20 |        Sí       | Valores Fijos         |
| **ID_devolucion**  | Identificador de la devolución                 | INT                      |           11 |        No       | FK hacia Devoluciones |
| **ID_Responsable** | Identificador unico del responsable del equipo | INT                      |           11 |        Sí       | FK hacia Responsable  |

---

## Tabla Devoluciones

| **Elemento**         | **Descripción**                                | **Tipo de Dato** | **Longitud** | **Obligatorio** | **Observaciones**    |
| -------------------- | ---------------------------------------------- | ---------------- | -----------: | :-------------: | -------------------- |
| **ID_devolucion**    | Identificador de la devolución                 | INT              |           11 |        Sí       | PK                   |
| **Fecha_Devolución** | Fecha real de devolución                       | DATETIME         |            - |        Sí       | -                    |
| **Observaciones**    | Notas adicionales de la devolución             | Varchar          |          255 |        No       | -                    |
| **ID_Responsable**   | Identificador unico del responsable del equipo | INT              |           11 |        Sí       | FK hacia Responsable |

---

## Tabla Reporte de Daños

| **Elemento**         | **Descripción**                                | **Tipo de Dato**                  | **Longitud** | **Obligatorio** | **Observaciones**    |
| -------------------- | ---------------------------------------------- | --------------------------------- | -----------: | :-------------: | -------------------- |
| **ID_Reporte Daños** | Identificador del reporte de daños             | INT                               |           11 |        Sí       | PK                   |
| **Descripción_Daño** | Detalle del daño o problema                    | Varchar                           |          500 |        Sí       | -                    |
| **Evidencia**        | Foto o archivo adjunto                         | VARCHAR (con la ruta del archivo) |            - |        No       | -                    |
| **Fecha_Reporte**    | Fecha del reporte de daño                      | DATETIME                          |            - |        Sí       | -                    |
| **ID_Responsable**   | Identificador unico del responsable del equipo | INT                               |           11 |        Sí       | FK hacia Responsable |
| **Tipo_daño**        | Detalles del problema presentado por el activo | ENUM (Hardware, Software, Otro)   |            - |        Si       | Valores Fijos        |
| **ID_Activo**        | Clave foránea que apunta a Activo              | INT                               |           11 |        Si       | FK hacia Activo      |

---

## Historial_Mantenimientos

| **Elemento**            | **Descripción**                                   | **Tipo de Dato**                  | **Longitud** | **Obligatorio** | **Observaciones**         |
| ----------------------- | ------------------------------------------------- | --------------------------------- | -----------: | :-------------: | ------------------------- |
| **ID_Mantenimiento**    | Identificador único del registro de mantenimiento | INT                               |           11 |        Sí       | PK                        |
| **ID_Activo**           | Activo al que se le realiza el mantenimiento      | INT                               |           11 |        Sí       | FK hacia Activo           |
| **Tipo_Mantenimiento**  | Tipo de mantenimiento                             | ENUM(Preventivo, Correctivo)      |            - |        Sí       | Valores Fijos             |
| **Descripcion**         | Detalle del mantenimiento realizado               | Varchar                           |          300 |        Sí       | Ej: “Cambio de batería”   |
| **Fecha_Mantenimiento** | Fecha y hora del mantenimiento                    | DATETIME                          |            - |        Sí       | -                         |
| **Responsable**         | Usuario o técnico que realizó la acción           | INT                               |           11 |        Sí       | FK hacia Usuario          |
| **Costo**               | Valor asociado al mantenimiento                   | INT                               |           10 |        No       | Opcional                  |
| **Evidencia**           | Documento o archivo de soporte                    | VARCHAR (con la ruta del archivo) |            - |        No       | Ej: foto, informe técnico |
