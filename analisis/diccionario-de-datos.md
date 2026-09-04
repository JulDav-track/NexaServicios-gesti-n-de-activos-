# Diccionario

## CU-01 Activo

| **Elemento**     | **Descripción**                     | **Tipo de Dato** | **Longitud** | **Obligatorio** | **Observaciones**                  |
| ---------------- | ----------------------------------- | ---------------- | -----------: | :-------------: | ---------------------------------- |
| **ID_Activo**    | Identificador único del equipo      | Alfanumérico     |           11 |        Sí       | Clave primaria                     |
| **Marca_Modelo** | Marca y modelo                      | Texto            |          100 |        Sí       | -                                  |
| **Estado**       | Estado actual                       | Texto            |           20 |        Sí       | Disponible, Asignado, Dañado, Baja |
| **Ubicación**    | Ubicación actual                    | Texto            |          100 |        No       | -                                  |
| **ID_Categoria** | Identificador único de la categoría | Alfanumérico     |           11 |        Sí       | FK hacia Categoria                 |

### Tabla Categoría

| **Elemento**         | **Descripción**                                             | **Tipo de Dato** | **Longitud** | **Obligatorio** | **Observaciones** |
| -------------------- | ----------------------------------------------------------- | ---------------- | -----------: | :-------------: | ----------------- |
| **ID_Categoria**     | Identificador único de la categoría                         | Alfanumérico     |           11 |        Sí       | Clave primaria    |
| **Nombre_Categoria** | Nombre de la categoría (Laptop, Celular, Herramienta, etc.) | Texto            |           50 |        Si       | Valores Únicos    |

---

## CU-02 Responsable

| **Elemento**           | **Descripción**                                | **Tipo de Dato** | **Longitud** | **Obligatorio** | **Observaciones**       |
| ---------------------- | ---------------------------------------------- | ---------------- | -----------: | :-------------: | ----------------------- |
| **ID_Responsable**     | Identificador unico del responsable del equipo | Alfanumérico     |           11 |        Sí       | PK                      |
| **Nombre_Responsable** | Nombre completo del empleado                   | Texto            |          150 |        Sí       | -                       |
| **Fecha_Asignación**   | Fecha de asignación                            | Fecha            |            - |        Sí       | -                       |
| **ID_devolucion**      | Identificador de la devolución                 | Alfanumérico     |           11 |        Sí       | FK hacia Devoluciones   |
| **N_documento**        | número del documento personal del responsable  | numerico         |           11 |        Si       | -                       |
| **Direccion**          | Dirección del responsable                      | Texto            |          200 |        Si       | -                       |
| **ID_TipoDocumento**   | Tipo de documento                              | Alfanumérico     |           11 |        Sí       | FK hacia Tipo_Documento |
| **ID_Activo**          | Identificador Unico                            | Alfanumerico     |           11 |        Si       | FK hacia Activo         |

### Tabla Tipo_Documento

| **Elemento**         | **Descripción**              | **Tipo de Dato** | **Longitud** | **Obligatorio** | **Observaciones**       |
| -------------------- | ---------------------------- | ---------------- | -----------: | :-------------: | ----------------------- |
| **ID_TipoDocumento** | Identificador del tipo       | Alfanumérico     |           11 |        Sí       | PK                      |
| **Nombre_Tipo**      | Nombre del tipo de documento | Texto            |           50 |        Sí       | Cédula, Pasaporte, etc. |

---

## CU-03 Acta de Entrega

| **Elemento**       | **Descripción**                               | **Tipo de Dato** | **Longitud** | **Obligatorio** | **Observaciones**    |
| ------------------ | --------------------------------------------- | ---------------- | -----------: | :-------------: | -------------------- |
| **ID_Acta**        | Identificador del acta                        | Alfanumérico     |           11 |        Sí       | PK                   |
| **ID_Activo**      | Clave foránea que apunta a Activo             | Alfanumerico     |           11 |        Si       | FK hacia Activo      |
| **ID_Responsable** | Identificador unico del responsable           | Alfanumerico     |           11 |        Sí       | FK hacia Responsable |
| **Fecha_Entrega**  | Fecha de entrega                              | Fecha/Hora       |            - |        Sí       | -                    |
| **acta**           | Documento con acta firmada por el responsable | archivo          |            - |        SI       | -                    |


## CU-04 Notificación de Devolución

| **Elemento**       | **Descripción**                           | **Tipo de Dato** | **Longitud** | **Obligatorio** | **Observaciones**     |
| ------------------ | ----------------------------------------- | ---------------- | -----------: | :-------------: | --------------------- |
| **ID_Devolucion**  | Codigo de la notificacion                 | Alfanumérico     |           11 |        Sí       | PK                    |
| **ID_devolucion**  | Identificador de la devolución            | Alfanumérico     |           11 |        Sí       | FK hacia Devoluciones |
| **Días_Restantes** | Días restantes para devolución            | Numérico         |            3 |        Si       | -                     |
| **ID_Activo**      | Identificador unico del activo a devolver | Alfanumerico     |           10 |        Si       | FK hacia Activo       |

---

## CU-05 Reportes

| **Elemento**           | **Descripción**                   | **Tipo de Dato** | **Longitud** | **Obligatorio** | **Observaciones**     |
| ---------------------- | --------------------------------- | ---------------- | -----------: | :-------------: | --------------------- |
| **ID_Reporte**         | Identificador único del reporte   | Alfanumérico     |           11 |        Sí       | PK                    |
| **Fecha_Inicio**       | Fecha inicial del filtro          | Fecha            |            - |        SI       | -                     |
| **Fecha_Fin**          | Fecha final del filtro            | Fecha            |            - |        No       | -                     |
| **Cantidad_Registros** | Número de registros en el reporte | Numérico         |            5 |        No       | -                     |
| **Tipo_Reporte**       | Tipo de reporte solicitado        | Texto            |           50 |        Sí       | Asignados, Pendientes |
| **ID_Activo**          | Identificador unico del activo    | Alfanumérico     |           11 |        Sí       | FK hacia Activo       |

---

## CU-06 Solicitudes

| **Elemento**        | **Descripción**                                | **Tipo de Dato** | **Longitud** | **Obligatorio** | **Observaciones**    |
| ------------------- | ---------------------------------------------- | ---------------- | -----------: | :-------------: | -------------------- |
| **ID_Solicitud**    | Número único de solicitud                      | Alfanumérico     |           11 |        Sí       | PK                   |
| **ID_Categoria**    | Identificador Categoria                        | Alfanumérico     |           11 |        Sí       | FK hacia Categoria   |
| **Motivo**          | Justificación de la solicitud                  | Texto            |          255 |        Sí       | -                    |
| **Fecha_Solicitud** | Fecha de registro de la solicitud              | Fecha/Hora       |            - |        Sí       | -                    |
| **ID_Responsable**  | Identificador unico del responsable del equipo | Alfanumérico     |           11 |        Sí       | FK hacia Responsable |

---

## CU-07 Equipos Asignados

| **Elemento**       | **Descripción**                                | **Tipo de Dato** | **Longitud** | **Obligatorio** | **Observaciones**                     |
| ------------------ | ---------------------------------------------- | ---------------- | -----------: | :-------------: | ------------------------------------- |
| **ID_Asignado**    | Identificador del equipo asignado              | Alfanumérico     |           11 |        Sí       | PK                                    |
| **Fecha_Entrega**  | Fecha en que se entregó el equipo              | Fecha            |            - |        Sí       | -                                     |
| **Estado_Equipo**  | Estado actual del equipo                       | Texto            |           20 |        Sí       | Descripcion unica (activo o inactivo) |
| **ID_devolucion**  | Identificador de la devolución                 | Alfanumérico     |           11 |        Sí       | FK hacia Devoluciones                 |
| **ID_Responsable** | Identificador unico del responsable del equipo | Alfanumérico     |           11 |        Sí       | FK hacia Responsable                  |

---

## CU-08 Devoluciones

| **Elemento**         | **Descripción**                                | **Tipo de Dato** | **Longitud** | **Obligatorio** | **Observaciones**    |
| -------------------- | ---------------------------------------------- | ---------------- | -----------: | :-------------: | -------------------- |
| **ID_devolucion**    | Identificador de la devolución                 | Alfanumérico     |           11 |        Sí       | PK                   |
| **Fecha_Devolución** | Fecha real de devolución                       | Fecha/Hora       |            - |        Sí       | -                    |
| **Observaciones**    | Notas adicionales de la devolución             | Texto            |          255 |        No       | -                    |
| **ID_Responsable**   | Identificador unico del responsable del equipo | Alfanumérico     |           11 |        Sí       | FK hacia Responsable |

---

## CU-10 Reporte de Daños

| **Elemento**         | **Descripción**                                | **Tipo de Dato**         | **Longitud** | **Obligatorio** | **Observaciones**      |
| -------------------- | ---------------------------------------------- | ------------------------ | -----------: | :-------------: | ---------------------- |
| **ID_Reporte Daños** | Identificador del reporte de daños             | Alfanumérico             |           11 |        Sí       | PK                     |
| **Descripción_Daño** | Detalle del daño o problema                    | Texto                    |          500 |        Sí       | -                      |
| **Evidencia**        | Foto o archivo adjunto                         | Archivo                  |            - |        No       | -                      |
| **Fecha_Reporte**    | Fecha del reporte de daño                      | Fecha/Hora               |            - |        Sí       | -                      |
| **ID_Responsable**   | Identificador unico del responsable del equipo | Alfanumérico             |           11 |        Sí       | FK hacia Responsable   |
| **Tipo_daño**        | Detalles del problema presentado por el activo | ENUM (barra desplegable) |            - |        Si       | Preventivo, correctivo |
| **ID_Activo**        | Clave foránea que apunta a Activo              | Alfanumerico             |           11 |        Si       | FK hacia Activo        |
