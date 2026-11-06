Flujo Principal (Camino Feliz) 

## CU-01 – Consultar inventario general de activos

| Paso | Actor | Acción |
|------|--------|---------|
| 1 | Responsable de Activos | Inicia sesión y accede a la opción "Inventario General". |
| 2 | Sistema | Muestra la lista completa de todos los activos registrados con su código, tipo, marca, modelo, estado y ubicación. |
| 3 | Responsable de Activos | Aplica filtros o realiza búsqueda por código, tipo o estado. |
| 4 | Sistema | Muestra la información detallada del activo seleccionado. |

## CU-02 – Consultar responsable actual de cada activo

| Paso | Actor | Acción |
|------|--------|---------|
| 1 | Responsable de Activos | Accede a la opción "Responsables Actuales" desde el inventario. |
| 2 | Sistema | Muestra la lista de activos con el nombre del responsable actual y fecha de asignación. |
| 3 | Responsable de Activos | Selecciona un activo para ver más detalles. |
| 4 | Sistema | Muestra información completa del responsable actual. |

## CU-03 – Generar acta digital de entrega

| Paso | Actor | Acción |
|------|--------|---------|
| 1 | Responsable de Activos | Selecciona una solicitud aprobada y elige un equipo disponible para asignar. |
| 2 | Sistema | Muestra los datos del equipo y del empleado. |
| 3 | Responsable de Activos | Define la fecha de devolución y confirma la asignación. |
| 4 | Sistema | Genera automáticamente el acta digital de entrega y la registra en el sistema. |

## CU-04 – Gestionar notificaciones de devolución

| Paso | Actor | Acción |
|------|--------|---------|
| 1 | Sistema | Detecta que un equipo está próximo a su fecha de devolución (2 días antes). |
| 2 | Sistema | Envía notificación automática al Responsable de Activos. |
| 3 | Sistema | Si se supera la fecha de devolución, envía una nueva notificación de vencimiento. |

## CU-05 – Generar reportes de inventario

| Paso | Actor | Acción |
|------|--------|---------|
| 1 | Responsable de Activos | Accede a la opción "Generar Reportes". |
| 2 | Sistema | Muestra las opciones de reportes disponibles. |
| 3 | Responsable de Activos | Selecciona el tipo de reporte y aplica filtros. |
| 4 | Sistema | Genera y muestra el reporte con opción de exportación a PDF. |

## CU-06 – Registrar solicitud de equipo

| Paso | Actor | Acción |
|------|--------|---------|
| 1 | Empleado | Inicia sesión y accede a "Nueva Solicitud". |
| 2 | Sistema | Muestra el formulario con tipos de equipo disponibles. |
| 3 | Empleado | Selecciona el tipo de equipo, ingresa el motivo y envía la solicitud. |
| 4 | Sistema | Asigna un número de seguimiento único y registra la solicitud como "Pendiente". |
| 5 | Sistema | Notifica al Aprobador. |

## CU-07 – Consultar equipos asignados

| Paso | Actor | Acción |
|------|--------|---------|
| 1 | Empleado | Inicia sesión y accede a "Mis Equipos Asignados". |
| 2 | Sistema | Muestra la lista de equipos asignados con fecha de entrega y estado actual. |
| 3 | Empleado | Selecciona un equipo para ver detalles. |
| 4 | Sistema | Muestra información completa del equipo. |

## CU-08 – Registrar devolución de equipo

| Paso | Actor | Acción |
|------|--------|---------|
| 1 | Empleado | Accede a "Mis Equipos Asignados" y selecciona el equipo a devolver. |
| 2 | Sistema | Muestra la opción para registrar devolución. |
| 3 | Empleado | Confirma la devolución y adjunta evidencia si es necesario. |
| 4 | Sistema | Registra la devolución y notifica al Responsable de Activos. |

## CU-09 – Confirmar recepción de devolución

| Paso | Actor | Acción |
|------|--------|---------|
| 1 | Responsable de Activos | Accede a "Devoluciones Pendientes". |
| 2 | Sistema | Muestra las devoluciones registradas pendientes de confirmación. |
| 3 | Responsable de Activos | Verifica físicamente el equipo y confirma la recepción. |
| 4 | Sistema | Actualiza el estado del equipo a "Disponible" y libera la responsabilidad del empleado. |

## CU-10 – Notificar daño al devolver equipo

| Paso | Actor | Acción |
|------|--------|---------|
| 1 | Empleado | Durante el proceso de devolución, marca el equipo como dañado. |
| 2 | Empleado | Describe el daño y adjunta evidencia. |
| 3 | Sistema | Registra el incidente y notifica al Técnico de Soporte y al Responsable de Activos. |

## CU-11 – Firmar acta de entrega

| Paso | Actor | Acción |
|------|--------|---------|
| 1 | Empleado | Recibe notificación y accede al acta de entrega pendiente. |
| 2 | Sistema | Muestra el acta digital con los datos del equipo. |
| 3 | Empleado | Verifica la información y firma digitalmente. |
| 4 | Sistema | Registra la firma con fecha y hora y actualiza la responsabilidad. |

## CU-12 – Reportar equipo dañado

| Paso | Actor | Acción |
|------|--------|---------|
| 1 | Empleado | Accede al equipo asignado y selecciona "Reportar Daño". |
| 2 | Sistema | Muestra el formulario de reporte. |
| 3 | Empleado | Describe el problema, adjunta evidencia y envía el reporte. |
| 4 | Sistema | Registra el reporte y notifica al Técnico de Soporte. |

## CU-13 – Notificar disponibilidad de equipo

| Paso | Actor | Acción |
|------|--------|---------|
| 1 | Sistema | Cambia el estado del equipo solicitado a "Listo para recoger". |
| 2 | Sistema | Envía una notificación por correo electrónico al empleado solicitante. |
| 3 | Sistema | Incluye ubicación de entrega y datos del equipo en la notificación. |

## CU-14 – Aprobar o rechazar solicitudes

| Paso | Actor | Acción |
|------|--------|---------|
| 1 | Aprobador | Accede a la bandeja de "Solicitudes Pendientes". |
| 2 | Sistema | Muestra la lista de solicitudes con sus detalles. |
| 3 | Aprobador | Revisa y selecciona "Aprobar" o "Rechazar" con observaciones. |
| 4 | Sistema | Actualiza el estado de la solicitud y notifica a las partes involucradas. |

## CU-15 – Recibir notificación de daño

| Paso | Actor | Acción |
|------|--------|---------|
| 1 | Sistema | Detecta un nuevo reporte de daño. |
| 2 | Sistema | Envía notificación al Técnico de Soporte con los datos del equipo y descripción del problema. |

## CU-16 – Consultar historial de reparaciones

| Paso | Actor | Acción |
|------|--------|---------|
| 1 | Técnico de Soporte | Busca un equipo en el sistema. |
| 2 | Sistema | Muestra el historial completo de reparaciones y mantenimientos. |
| 3 | Técnico de Soporte | Consulta los detalles de cada reparación registrada. |

## CU-17 – Consultar reportes gerenciales

| Paso | Actor | Acción |
|------|--------|---------|
| 1 | Gerente | Inicia sesión y accede a "Reportes Gerenciales". |
| 2 | Sistema | Muestra reportes consolidados de activos. |
| 3 | Gerente | Aplica filtros según necesidad. |

## CU-18 – Registrar acciones importantes

| Paso | Actor | Acción |
|------|--------|---------|
| 1 | Sistema | Detecta que se realiza una acción crítica (asignación, devolución, baja, etc.). |
| 2 | Sistema | Registra automáticamente la acción con fecha, hora y usuario responsable. |

## CU-19 – Iniciar sesión y controlar acceso

| Paso | Actor | Acción |
|------|--------|---------|
| 1 | Usuario | Ingresa sus credenciales en la pantalla de inicio de sesión. |
| 2 | Sistema | Valida las credenciales y asigna el rol correspondiente. |
| 3 | Sistema | Redirige al usuario al dashboard según sus permisos. |

## CU-20 – Registrar baja de equipo

| Paso | Actor | Acción |
|------|--------|---------|
| 1 | Responsable de Activos | Busca el equipo y selecciona "Registrar Baja". |
| 2 | Responsable de Activos | Indica el motivo de la baja. |
| 3 | Sistema | Actualiza el estado del equipo a "Baja" y registra la acción en el historial. |

## CU-21 – Consultar historial completo de un equipo

| Paso | Actor | Acción |
|------|--------|---------|
| 1 | Responsable de Activos | Busca un equipo en el inventario. |
| 2 | Sistema | Muestra el historial completo del equipo. |
| 3 | Responsable de Activos | Consulta los detalles de cualquier registro del historial. |



Flujos Alternativos 

| ID | Descripción | Caso de Uso |
|----|-------------|--------------|
| FA-01 | El sistema no encuentra activos registrados o el inventario está vacío. Muestra un mensaje informativo: "No hay activos registrados en el sistema." | CU-01 |
| FA-02 | No existe ningún responsable actual asignado a un activo. El sistema muestra: "Este equipo no tiene responsable asignado actualmente." | CU-02 |
| FA-03 | No hay solicitudes aprobadas disponibles para generar acta. El sistema informa que no hay asignaciones pendientes. | CU-03 |
| FA-04 | No hay equipos con fecha de devolución próxima o vencida. El sistema muestra: "No hay notificaciones de devolución pendientes en este momento." | CU-04 |
| FA-05 | No hay datos suficientes para generar reportes o los filtros no arrojan resultados. El sistema muestra: "No se encontraron registros con los criterios seleccionados." | CU-05 |
| FA-06 | El empleado intenta registrar una solicitud pero no hay equipos del tipo solicitado disponibles. El sistema informa la falta de stock. | CU-06 |
| FA-07 | El empleado no tiene equipos asignados actualmente. El sistema muestra: "Actualmente no tienes equipos asignados." | CU-07 |
| FA-08 | El empleado intenta registrar la devolución de un equipo que ya fue devuelto previamente. El sistema indica que el equipo no está asignado a él. | CU-08 |
| FA-09 | No hay devoluciones pendientes de confirmación. El sistema muestra: "No existen devoluciones pendientes de validación." | CU-09 |
| FA-10 | El empleado intenta notificar daño pero el equipo ya tiene un reporte activo. El sistema vincula el nuevo reporte al existente. | CU-10 |
| FA-11 | El empleado intenta firmar el acta pero el equipo ya fue firmado previamente. El sistema informa que la firma ya está registrada. | CU-11 |
| FA-12 | El empleado reporta un daño pero el equipo no está asignado a él. El sistema rechaza el reporte y muestra un mensaje de error. | CU-12 |
| FA-13 | No hay solicitudes listas para recoger. El sistema muestra: "No tienes equipos disponibles para recoger en este momento." | CU-13 |
| FA-14 | No hay solicitudes pendientes de aprobación. El sistema informa: "No existen solicitudes pendientes para revisar." | CU-14 |
| FA-15 | No hay reportes de daño nuevos. El sistema muestra: "No hay notificaciones de equipos dañados pendientes." | CU-15 |
| FA-16 | El equipo no tiene historial de reparaciones. El sistema muestra: "Este equipo no tiene reparaciones registradas." | CU-16 |
| FA-17 | No hay reportes consolidados disponibles o el gerente no tiene permisos. El sistema muestra: "No se encontraron reportes disponibles." | CU-17 |
| FA-18 | No se ha realizado ninguna acción importante sobre los activos. El sistema muestra: "No hay acciones auditadas registradas aún." | CU-18 |
| FA-19 | El usuario ingresa credenciales correctas pero su cuenta está inactiva. El sistema bloquea el acceso y muestra el mensaje correspondiente. | CU-19 |
| FA-20 | El equipo que se intenta dar de baja ya está en estado "Baja". El sistema informa que el equipo ya fue dado de baja previamente. | CU-20 |
| FA-21 | El equipo no tiene historial completo porque es nuevo. El sistema muestra: "Este equipo no tiene movimientos registrados aún." | CU-21 |


Flujos de Excepción 

| ID | Descripción | Caso de Uso |
|----|-------------|--------------|
| FE-01 | El sistema no puede cargar el inventario por error en la base de datos. Muestra el mensaje: "Error al cargar el inventario. Intente nuevamente más tarde." y registra el error en los logs. | CU-01 |
| FE-02 | El sistema no encuentra información del responsable de un activo. Muestra: "No se pudo obtener la información del responsable actual." | CU-02 |
| FE-03 | Error al generar el acta digital de entrega (problema con la plantilla o base de datos). Muestra: "Error al generar el documento. Contacte al administrador." | CU-03 |
| FE-04 | Fallo en el servicio de notificaciones (no se puede enviar correo). El sistema registra el fallo y muestra: "No se pudo enviar la notificación. Se intentará más tarde." | CU-04 |
| FE-05 | Error al generar reportes (tiempo de respuesta excedido o datos corruptos). Muestra: "Error al generar el reporte. Inténtelo de nuevo." | CU-05 |
| FE-06 | El empleado intenta registrar una solicitud pero el sistema falla por problemas de conexión. Muestra: "Error al registrar la solicitud. Verifique su conexión." | CU-06 |
| FE-07 | Error al consultar los equipos asignados al empleado (fallo en la consulta). Muestra: "No se pudo cargar sus equipos asignados. Intente más tarde." | CU-07 |
| FE-08 | El sistema falla al intentar registrar una devolución. Muestra: "Error al procesar la devolución. Contacte al Responsable de Activos." | CU-08 |
| FE-09 | Error al confirmar la recepción de una devolución (problema de actualización). Muestra: "Error al actualizar el estado del equipo. Intente nuevamente." | CU-09 |
| FE-10 | Fallo al adjuntar evidencia en un reporte de daño (archivo demasiado grande o corrupto). Muestra: "Error al adjuntar evidencia. Verifique el archivo." | CU-10 |
| FE-11 | Error en el proceso de firma digital (firma no válida o problema con el certificado). Muestra: "Error en la firma digital. Intente nuevamente." | CU-11 |
| FE-12 | El sistema falla al registrar un reporte de daño. Muestra: "Error al enviar el reporte de daño. Intente más tarde." | CU-12 |
| FE-13 | Fallo en el envío de la notificación de equipo listo para recoger. El sistema registra el error y avisa al Responsable de Activos. | CU-13 |
| FE-14 | Error al intentar aprobar o rechazar una solicitud (problema de permisos o conexión). Muestra: "Error al procesar la solicitud. Intente nuevamente." | CU-14 |
| FE-15 | Fallo en el envío de la notificación al Técnico de Soporte. El sistema registra el incidente en los logs. | CU-15 |
| FE-16 | Error al cargar el historial de reparaciones de un equipo. Muestra: "No se pudo cargar el historial. Intente más tarde." | CU-16 |
| FE-17 | Error al generar reportes gerenciales (acceso denegado o datos insuficientes). Muestra: "Error al cargar los reportes. Contacte al administrador." | CU-17 |
| FE-18 | Fallo al registrar una acción importante en la auditoría. El sistema muestra una advertencia y registra el error. | CU-18 |
| FE-19 | El sistema detecta múltiples intentos fallidos de inicio de sesión. Bloquea temporalmente la cuenta y muestra: "Demasiados intentos. Cuenta bloqueada por 15 minutos." | CU-19 |
| FE-20 | Error al registrar la baja de un equipo (el equipo no existe o ya fue dado de baja). Muestra: "Error al procesar la baja del equipo." | CU-20 |
| FE-21 | Error al consultar el historial completo de un equipo (problema de consulta en la base de datos). Muestra: "Error al cargar el historial. Intente nuevamente." | CU-21 |
