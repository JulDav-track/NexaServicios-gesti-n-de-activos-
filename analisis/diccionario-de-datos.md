Diccionario

## CU-01

| Elemento | Descripción | Tipo de Dato | Longitud | Obligatorio | Observaciones |
|-----------|-------------|--------------|-----------|-------------|--------------|
| Código_Activo | Identificador único del equipo | Alfanumérico | 20 | Sí | Clave primaria |
| Tipo_Activo | Tipo de equipo | Texto | 30 | Sí | Laptop, Celular, Herramienta |
| Marca_Modelo | Marca y modelo | Texto | 100 | Sí | - |
| Estado | Estado actual | Texto | 20 | Sí | Disponible, Asignado, Dañado, Baja |
| Ubicación | Ubicación actual | Texto | 100 | No | - |

## CU-02

| Elemento | Descripción | Tipo de Dato | Longitud | Obligatorio | Observaciones |
|-----------|-------------|--------------|-----------|-------------|--------------|
| Código_Activo | Identificador del equipo | Alfanumérico | 20 | Sí | - |
| Nombre_Responsable | Nombre completo del empleado | Texto | 150 | Sí | - |
| Fecha_Asignación | Fecha de asignación | Fecha | - | Sí | - |
| Fecha_Devolución | Fecha esperada de devolución | Fecha | - | No | - |

## CU-03

| Elemento | Descripción | Tipo de Dato | Longitud | Obligatorio | Observaciones |
|-----------|-------------|--------------|-----------|-------------|--------------|
| ID_Acta | Identificador del acta | Alfanumérico | 15 | Sí | - |
| Código_Activo | Identificador del equipo | Alfanumérico | 20 | Sí | - |
| Nombre_Empleado | Nombre del empleado que recibe | Texto | 150 | Sí | - |
| Fecha_Entrega | Fecha de entrega | Fecha/Hora | - | Sí | - |

## CU-04

| Elemento | Descripción | Tipo de Dato | Longitud | Obligatorio | Observaciones |
|-----------|-------------|--------------|-----------|-------------|--------------|
| Código_Activo | Identificador del equipo | Alfanumérico | 20 | Sí | - |
| Fecha_Devolución | Fecha esperada de devolución | Fecha | - | Sí | - |
| Días_Restantes | Días restantes para devolución | Numérico | 3 | No | - |

## CU-05

| Elemento | Descripción | Tipo de Dato | Longitud | Obligatorio | Observaciones |
|-----------|-------------|--------------|-----------|-------------|--------------|
| Tipo_Reporte | Tipo de reporte solicitado | Texto | 50 | Sí | Asignados, Disponibles, Pendientes |
| Fecha_Inicio | Fecha inicial del filtro | Fecha | - | No | - |
| Fecha_Fin | Fecha final del filtro | Fecha | - | No | - |
| Cantidad_Registros | Número de registros en el reporte | Numérico | 5 | No | - |

## CU-06

| Elemento | Descripción | Tipo de Dato | Longitud | Obligatorio | Observaciones |
|-----------|-------------|--------------|-----------|-------------|--------------|
| ID_Solicitud | Número único de seguimiento | Alfanumérico | 15 | Sí | - |
| Tipo_Equipo | Tipo de equipo solicitado | Texto | 30 | Sí | Laptop, Celular, etc. |
| Motivo | Justificación de la solicitud | Texto | 255 | Sí | - |
| Fecha_Solicitud | Fecha de registro de la solicitud | Fecha/Hora | - | Sí | - |

## CU-07

| Elemento | Descripción | Tipo de Dato | Longitud | Obligatorio | Observaciones |
|-----------|-------------|--------------|-----------|-------------|--------------|
| Código_Activo | Identificador del equipo | Alfanumérico | 20 | Sí | - |
| Fecha_Entrega | Fecha en que se entregó el equipo | Fecha | - | Sí | - |
| Estado_Equipo | Estado actual del equipo | Texto | 20 | Sí | - |
| Fecha_Devolución | Fecha esperada de devolución | Fecha | - | No | - |

## CU-08

| Elemento | Descripción | Tipo de Dato | Longitud | Obligatorio | Observaciones |
|-----------|-------------|--------------|-----------|-------------|--------------|
| Código_Activo | Identificador del equipo a devolver | Alfanumérico | 20 | Sí | - |
| Fecha_Devolución | Fecha real de devolución | Fecha/Hora | - | Sí | - |
| Observaciones | Notas adicionales de la devolución | Texto | 255 | No | - |

## CU-09

| Elemento | Descripción | Tipo de Dato | Longitud | Obligatorio | Observaciones |
|-----------|-------------|--------------|-----------|-------------|--------------|
| Código_Activo | Identificador del equipo devuelto | Alfanumérico | 20 | Sí | - |
| Estado_Verificado | Estado físico verificado | Texto | 30 | Sí | Bueno, Dañado, etc. |
| Fecha_Confirmación | Fecha de confirmación de devolución | Fecha/Hora | - | Sí | - |

## CU-10

| Elemento | Descripción | Tipo de Dato | Longitud | Obligatorio | Observaciones |
|-----------|-------------|--------------|-----------|-------------|--------------|
| Código_Activo | Identificador del equipo | Alfanumérico | 20 | Sí | - |
| Descripción_Daño | Detalle del daño o problema | Texto | 500 | Sí | - |
| Evidencia | Foto o archivo adjunto | Archivo | - | No | - |
| Fecha_Reporte | Fecha del reporte de daño | Fecha/Hora | - | Sí | - |

## CU-11

| Elemento | Descripción | Tipo de Dato | Longitud | Obligatorio | Observaciones |
|-----------|-------------|--------------|-----------|-------------|--------------|
| ID_Acta | Identificador del acta de entrega | Alfanumérico | 15 | Sí | - |
| Código_Activo | Identificador del equipo | Alfanumérico | 20 | Sí | - |
| Nombre_Empleado | Nombre del empleado que firma | Texto | 150 | Sí | - |
| Fecha_Firma | Fecha y hora de la firma | Fecha/Hora | - | Sí | - |
| Estado_Recibido | Condición en que se recibe el equipo | Texto | 30 | Sí | Bueno / Con observaciones |

## CU-12

| Elemento | Descripción | Tipo de Dato | Longitud | Obligatorio | Observaciones |
|-----------|-------------|--------------|-----------|-------------|--------------|
| Código_Activo | Identificador del equipo dañado | Alfanumérico | 20 | Sí | - |
| Descripción_Problema | Detalle del daño o falla | Texto | 500 | Sí | - |
| Fecha_Reporte | Fecha del reporte | Fecha/Hora | - | Sí | - |
| Evidencia | Archivo adjunto (foto/video) | Archivo | - | No | - |

## CU-13

| Elemento | Descripción | Tipo de Dato | Longitud | Obligatorio | Observaciones |
|-----------|-------------|--------------|-----------|-------------|--------------|
| ID_Solicitud | Número de la solicitud | Alfanumérico | 15 | Sí | - |
| Código_Activo | Identificador del equipo | Alfanumérico | 20 | Sí | - |
| Ubicación_Entrega | Lugar donde recoger el equipo | Texto | 100 | Sí | - |
| Fecha_Notificación | Fecha en que se envía la notificación | Fecha/Hora | - | Sí | - |

## CU-14

| Elemento | Descripción | Tipo de Dato | Longitud | Obligatorio | Observaciones |
|-----------|-------------|--------------|-----------|-------------|--------------|
| ID_Solicitud | Número de la solicitud | Alfanumérico | 15 | Sí | - |
| Decisión | Aprobada o Rechazada | Texto | 20 | Sí | - |
| Motivo_Rechazo | Justificación en caso de rechazo | Texto | 300 | No | Solo si se rechaza |
| Fecha_Decisión | Fecha de la aprobación/rechazo | Fecha/Hora | - | Sí | - |
