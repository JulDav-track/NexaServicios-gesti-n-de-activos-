# Diccionario de Datos

## Tabla Activo

| **Elemento**     | **Descripción**                           | **Tipo de Dato**                          | **Longitud** | **Obligatorio** | **Observaciones**  |
| :--------------- | :---------------------------------------- | :---------------------------------------- | :----------: | :-------------: | :----------------- |
| ID_Activo        | Identificador único del equipo            | INT                                       |      11      |        Sí       | PK                 |
| Marca_Modelo     | Marca y modelo                            | Varchar                                   |      100     |        Sí       | -                  |
| Estado           | Estado actual                             | ENUM (Disponible, Asignado, Dañado, Baja) |       -      |        Sí       | Valores Fijos      |
| Numero_Serie     | identificador del producto a nivel global | VARCHAR                                   |      20      |        Sí       | Unique             |
| Placa_Inventario | código interno asignado por la empresa    | VARCHAR                                   |      11      |        Sí       | Unique             |
| Ubicación        | Ubicación actual                          | Varchar                                   |      100     |        No       | -                  |
| ID_Categoria     | Identificador único de la categoría       | INT                                       |      11      |        Sí       | FK hacia Categoria |

---

                                                            

## Tabla Rol

| **Elemento** | **Descripción**                    | **Tipo de Dato**                                                                 | **Longitud** | **Obligatorio** | **Observaciones** |
| :----------- | :--------------------------------- | :------------------------------------------------------------------------------- | :----------: | :-------------: | :---------------- |
| ID_Rol       | Identificador único del rol        | INT                                                                              |      11      |        Sí       | PK                |
| Nombre_Rol   | asignación de rol                  | Enum (Responsable de Activos, Empleado, Aprobador, Técnico de Soporte, Gerente.) |       -      |        Sí       | Valores Fijos     |
| Descripcion  | Sobre lo que trata el rol asignado | Varchar                                                                          |      100     |        Sí       | -                 |


---

## Tabla Rol_Permiso

| **Elemento** | **Descripción** | **Tipo de Dato** | **Longitud** | **Obligatorio** | **Observaciones** |
| ------------ | --------------- | ---------------- | ------------ | --------------- | ---------------- |
| ID_Rol | Identificador del rol | INT | 11 | Sí | FK hacia Rol |
| ID_Permiso | Identificador del permiso | INT | 11 | Sí | FK hacia Permiso |
| PK compuesta | Clave primaria compuesta | - | - | Sí | (ID_Rol, ID_Permiso) |


---

## Tabla Permiso

| **Elemento** | **Descripción**                    | **Tipo de Dato** | **Longitud** | **Obligatorio** | **Observaciones**                                                                                                     |
| ------------ | ---------------------------------- | ---------------- | ------------ | --------------- | --------------------------------------------------------------------------------------------------------------------- |
| ID_Permiso   | Identificador único del permiso    | INT              | 11           | Sí              | PK                                                                                                                    |
| Permisos     | Cuál es el alcance el rol asignado | VARCHAR          | 50           | Sí              | Unique. Valores del catálogo: Crear, Consultar, Actualizar, Eliminar, Aprobar, Notificar, Asignar, Devolver, Reportar |
| Descripcion  | Explicación breve del permiso      | VARCHAR          | 100          | No              | Texto libre                                                                                                           |


---

## Tabla Usuario

| **Elemento** | **Descripción** | **Tipo de Dato** | **Longitud** | **Obligatorio** | **Observaciones** |
| ------------ | --------------- | ---------------- | ------------ | --------------- | ---------------- |
| ID_Usuario | Identificador único del Usuario | INT | 11 | Sí | PK |
| Nombre | nombre del usuario | Varchar | 20 | Sí | - |
| Apellido | Apellido del usuario | Varchar | 20 | Sí | - |
| Email | Correo electrónico del usuario | Varchar | 100 | Sí | Debe ser único, usado para notificaciones |
| Password | Contraseña encriptada del usuario | Varchar | 255 | Sí | Contraseña encriptada |
| Estado | Estado actual | ENUM (Activo, Inactivo) | - | Sí | Valores Fijos |
| ID_Rol | Identificador único del Rol | INT | 11 | Sí | FK hacia Rol |

---

## Tabla Responsable

| **Elemento** | **Descripción** | **Tipo de Dato** | **Longitud** | **Obligatorio** | **Observaciones** |
| ------------ | --------------- | ---------------- | ------------ | --------------- | ---------------- |
| ID_Responsable | Identificador unico del responsable del equipo | INT | 11 | Sí | PK |
| ID_Usuario | Usuario que ejecutó la acción | INT | 11 | Sí | FK hacia Usuario Unique |
| Fecha_Asignación | Fecha de asignación | DATE | - | Sí | - |
| N_documento | número del documento personal del responsable | INT | 11 | Sí | - |
| Direccion | Dirección del responsable | Varchar | 200 | Sí | - |
| ID_TipoDocumento | Tipo de documento | INT | 11 | Sí | FK hacia Tipo_Documento |

---

## Tabla Categoría

| **Elemento** | **Descripción** | **Tipo de Dato** | **Longitud** | **Obligatorio** | **Observaciones** |
| ------------ | --------------- | ---------------- | ------------ | --------------- | ---------------- |
| ID_Categoria | Identificador único de la categoría | INT | 11 | Sí | PK |
| Nombre_Categoria | Nombre de la categoría (Laptop, Celular, Herramienta, etc.) | Varchar | 50 | Sí | Valores Únicos |

---

## Tabla Auditoria

| **Elemento** | **Descripción** | **Tipo de Dato** | **Longitud** | **Obligatorio** | **Observaciones** |
| ------------ | --------------- | ---------------- | ------------ | --------------- | ---------------- |
| ID_Auditoria | Identificador único del registro de auditoría | INT | 11 | Sí | PK |
| ID_Usuario | Usuario que ejecutó la acción | INT | 11 | Sí | FK hacia Usuario |
| Entidad | Nombre de la tabla afectada | Varchar | 50 | Sí | Activo, Solicitud, Devolución, ..... |
| ID_Registro | Identificador del registro afectado | INT | 11 | Sí | FK hacia la entidad correspondiente donde se aplicó el cambio |
| Accion | Tipo de operación realizada | ENUM (Crear, Consultar, Actualizar, Eliminar, Aprobar, Rechazar, Notificar) | - | Sí | Valores Fijos |
| Fecha_Accion | Fecha y hora de la acción | DATETIME | - | Sí | - |
| Detalle | Información adicional sobre la acción | Varchar | 300 | No | Ej: “Solicitud #12 rechazada por falta de documentación” |

---

## Tabla Tipo_Documento

| **Elemento** | **Descripción** | **Tipo de Dato** | **Longitud** | **Obligatorio** | **Observaciones** |
| ------------ | --------------- | ---------------- | ------------ | --------------- | ---------------- |
| ID_TipoDocumento | Identificador del tipo | INT | 11 | Sí | PK |
| Nombre_Tipo | Nombre del tipo de documento | Varchar | 50 | Sí | Cédula, Pasaporte, etc. |

---

### Tabla Acta_De_Entrega

| **Elemento** | **Descripción** | **Tipo de Dato** | **Longitud** | **Obligatorio** | **Observaciones** |
| ------------ | --------------- | ---------------- | ------------ | --------------- | ---------------- |
| ID_Acta | Identificador del acta | INT | 11 | Sí | PK |
| ID_Activo | Clave foránea que apunta a Activo | INT | 11 | Sí | FK hacia Activo |
| ID_Responsable | Identificador unico del responsable | INT | 11 | Sí | FK hacia Responsable |
| Fecha_Entrega | Fecha de entrega | DATETIME | - | Sí | - |
| acta | Documento con acta firmada por el responsable | VARCHAR (con la ruta del archivo) | - | Sí | - |
| Firma_Digital | Validación electrónica del receptor | Varchar /Base64 | - | Sí | Puede almacenarse como hash criptográfico o archivo encriptado |

---

## Tabla Notificación_De_Devolución
//Dias_Restantes es un campo Variable //puede calcularse a partir de la fecha de devolución//

| **Elemento**     | **Descripción**                    | **Tipo de Dato** | **Longitud** | **Obligatorio** | **Observaciones**                                      |
| :--------------- | :--------------------------------- | :--------------- | :----------: | :-------------: | :----------------------------------------------------- |
| ID_Notificacion  | Código de la notificación          | INT              |      11      |        Sí       | PK                                                     |
| ID_devoluciones  | Identificador de la devolución    | INT              |      11      |        Sí       | FK hacia Devoluciones                                  |
| Dias_Restantes   | Días restantes para devolución    | -                |       -      |        -        | Dato derivado: se calcula a partir de la fecha de devolución |
---

## Tabla Reportes (Vista/Consulta)
// Reportes es una vista generada por filtros sobre Activos, Asignaciones y Devoluciones. No almacena datos, solo los consulta. //

| **Elemento**    | **Descripción**                    | **Tipo de Dato** | **Longitud** | **Obligatorio** | **Observaciones**              |
| :-------------- | :--------------------------------- | :--------------- | :----------: | :-------------: | :----------------------------- |
| ID_Reporte      | Identificador único del reporte   | INT              |      11      |        Sí       | PK                             |
| Fecha_Inicio    | Fecha inicial del filtro          | DATE             |       -      |        Sí       | -                              |
| Fecha_Fin       | Fecha final del filtro            | DATE             |       -      |        No       | -                              |
| Tipo_Reporte    | Tipo de reporte solicitado        | Varchar          |      50      |        Sí       | Asignados, Pendientes          |
| ID_Activo       | Identificador único del activo    | INT              |      11      |        No       | FK hacia Activo                |

---

## Tabla Solicitudes

| **Elemento**       | **Descripción**                                  | **Tipo de Dato**                          | **Longitud** | **Obligatorio** | **Observaciones**       |
| :----------------- | :----------------------------------------------- | :---------------------------------------- | :----------: | :-------------: | :---------------------- |
| ID_Solicitudes     | Número único de solicitud                        | INT                                       |      11      |        Sí       | PK                      |
| ID_Categoria       | Identificador Categoria                          | INT                                       |      11      |        Sí       | FK hacia Categoria      |
| Motivo             | Justificación de la solicitud                    | Varchar                                   |     255      |        Sí       | -                       |
| Fecha_Solicitud    | Fecha de la solicitud                            | DATETIME                                  |       -      |        Sí       | -                       |
| ID_Responsable     | Identificador único del responsable del equipo   | INT                                       |      11      |        Sí       | FK hacia Responsable    |
| Estado_Solicitud   | Estado de la solicitud                           | ENUM (Pendiente, Aprobada, Rechazada)    |       -      |        Sí       | Valores Fijos           |

---

## Tabla Aprobaciones

| **Elemento**      | **Descripción**                                  | **Tipo de Dato**                     | **Longitud** | **Obligatorio** | **Observaciones**                          |
| :---------------- | :----------------------------------------------- | :----------------------------------- | :----------: | :-------------: | :----------------------------------------- |
| ID_Aprobaciones   | Identificador único de la aprobación             | INT                                  |      11      |        Sí       | PK                                         |
| ID_Solicitudes    | Identificador de la solicitud                    | INT                                  |      11      |        Sí       | FK hacia Solicitudes                       |
| ID_Aprobador      | Identificador único del Usuario                  | INT                                  |      11      |        Sí       | FK hacia Usuario                           |
| Desicion          | Decisión tomada                                  | ENUM (Aprobada, Rechazada)           |       -      |        Sí       | Valores Fijos                              |
| Motivo_Rechazo    | Motivo por el cual se rechazó la Solicitud      | Varchar                              |     300      |        No       | Solo obligatorio si Decision = Rechazada  |
| Fecha_Decision    | Fecha de la decisión tomada                     | DATETIME                             |       -      |        Sí       | -                                          |

---

## Tabla Equipos_Asignados

| **Elemento**              | **Descripción**                                | **Tipo de Dato**              | **Longitud** | **Obligatorio** | **Observaciones**          |
| :------------------------ | :--------------------------------------------- | :---------------------------- | :----------: | :-------------: | :------------------------- |
| ID_Asignado               | Identificador del equipo asignado              | INT                           |      11      |        Sí       | PK                         |
| Fecha_Entrega             | Fecha en que se entregó el equipo              | DATE                          |       -      |        Sí       | -                          |
| Fecha_Devolucion_Esperada | Fecha de devolución esperada                   | DATE                          |       -      |        Sí       | -                          |
| Estado_Equipo             | Estado actual del equipo                       | ENUM (activo o inactivo)      |      20      |        Sí       | Valores Fijos              |
| ID_Responsable            | Identificador único del responsable del equipo | INT                           |      11      |        Sí       | FK hacia Responsable       |
| ID_Activo                 | Identificador único del activo a devolver      | INT                           |      11      |        Sí       | FK hacia Activo            |
| ID_Solicitudes            | Número único de solicitud                      | INT                           |      11      |        Sí       | FK hacia Solicitudes       |

---

## Tabla Devoluciones

| **Elemento**      | **Descripción**                                | **Tipo de Dato** | **Longitud** | **Obligatorio** | **Observaciones**          |
| :---------------- | :--------------------------------------------- | :--------------- | :----------: | :-------------: | :------------------------- |
| ID_devolucion     | Identificador de la devolución                 | INT              |      11      |        Sí       | PK                         |
| Fecha_Devolución  | Fecha real de devolución                       | DATETIME         |       -      |        Sí       | -                          |
| Observaciones     | Notas adicionales de la devolución            | Varchar          |     255      |        No       | -                          |
| ID_Responsable    | Identificador único del responsable del equipo | INT              |      11      |        Sí       | FK hacia Responsable       |
| ID_Asignado       | Identificador del equipo asignado              | INT              |      11      |        Sí       | FK hacia Equipos_Asignados |

---

## Tabla Reporte de Daños

| **Elemento**       | **Descripción**                                | **Tipo de Dato**                  | **Longitud** | **Obligatorio** | **Observaciones**          |
| :----------------- | :--------------------------------------------- | :-------------------------------- | :----------: | :-------------: | :------------------------- |
| ID_ReporteDaños    | Identificador del reporte de daños             | INT                               |      11      |        Sí       | PK                         |
| Descripción_Daño   | Detalle del daño o problema                    | Varchar                           |     500      |        Sí       | -                          |
| Evidencia          | Foto o archivo adjunto                         | VARCHAR (con la ruta del archivo) |       -      |        No       | -                          |
| Fecha_Reporte      | Fecha del reporte de daño                      | DATETIME                          |       -      |        Sí       | -                          |
| ID_Responsable     | Identificador único del responsable del equipo | INT                               |      11      |        Sí       | FK hacia Responsable       |
| Tipo_daño          | Detalles del problema presentado por el activo | ENUM (Hardware, Software, Otro)  |       -      |        Sí       | Valores Fijos              |
| ID_Activo          | Clave foránea que apunta a Activo              | INT                               |      11      |        Sí       | FK hacia Activo            |

---

## Tabla Historial_Mantenimientos

| **Elemento**           | **Descripción**                                | **Tipo de Dato**                  | **Longitud** | **Obligatorio** | **Observaciones**       |
| :--------------------- | :--------------------------------------------- | :-------------------------------- | :----------: | :-------------: | :---------------------- |
| ID_Mantenimiento       | Identificador único del registro de mantenimiento | INT                           |      11      |        Sí       | PK                      |
| ID_Activo              | Activo al que se le realiza el mantenimiento  | INT                               |      11      |        Sí       | FK hacia Activo         |
| Tipo_Mantenimiento     | Tipo de mantenimiento                         | ENUM (Preventivo, Correctivo)    |       -      |        Sí       | Valores Fijos           |
| Descripcion            | Detalle del mantenimiento realizado           | Varchar                           |     300      |        Sí       | Ej: “Cambio de batería” |
| Fecha_Mantenimiento    | Fecha y hora del mantenimiento                | DATETIME                          |       -      |        Sí       | -                       |
| Responsable             | Usuario o técnico que realizó la acción       | INT                               |      11      |        Sí       | FK hacia Usuario        |
| Costo                  | Valor asociado al mantenimiento               | INT                               |      10      |        No       | Opcional                |
| Evidencia              | Documento o archivo de soporte                | VARCHAR (con la ruta del archivo) |       -      |        No       | Ej: foto, informe técnico |
| **Evidencia**           | Documento o archivo de soporte                    | VARCHAR (con la ruta del archivo) |            - |        No       | Ej: foto, informe técnico |

---
