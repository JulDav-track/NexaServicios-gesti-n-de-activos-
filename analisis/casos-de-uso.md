Casos de Uso

| ID | Nombre | HU Relacionada | Actor(es) | Descripción | Precondiciones | Postcondiciones |
|----|---------|----------------|-----------|-------------|----------------|-----------------|
| CU-01 | Consultar inventario general de activos | HU-01 | Responsable de Activos | Consulta todos los equipos registrados, ubicación y condición actual. | Usuario autenticado como Responsable de Activos. | Se muestra el inventario completo y actualizado. |
| CU-02 | Consultar responsable actual de cada activo | HU-02 | Responsable de Activos | Visualiza quién tiene asignado cada equipo. | Usuario autenticado como Responsable de Activos. | Se muestra el responsable actual de cada activo. |
| CU-03 | Generar acta digital de entrega | HU-03 | Responsable de Activos | Genera automáticamente el documento de entrega al asignar un equipo. | Debe existir una asignación de equipo. | El acta digital queda generada y registrada. |
| CU-04 | Gestionar notificaciones de devolución | HU-04 | Responsable de Activos | Envía notificaciones automáticas antes y después de la fecha de devolución. | Existen equipos con fecha de devolución configurada. | Las notificaciones son enviadas y registradas. |
| CU-05 | Generar reportes de inventario | HU-05 | Responsable de Activos | Genera reportes de equipos asignados, disponibles y pendientes por devolver. | Usuario autenticado como Responsable de Activos. | Se genera el reporte solicitado. |
| CU-06 | Registrar solicitud de equipo | HU-06 | Empleado | Solicita un equipo mediante el sistema. | Usuario autenticado como Empleado. | La solicitud queda registrada con número de seguimiento. |
| CU-07 | Consultar equipos asignados | HU-07 | Empleado | Consulta equipos asignados, fecha de entrega y estado. | Usuario autenticado como Empleado. | Se muestra la lista de equipos asignados. |
| CU-08 | Registrar devolución de equipo | HU-08 | Empleado | Registra la devolución de un equipo. | El equipo debe estar asignado al empleado. | La devolución queda registrada. |
| CU-09 | Confirmar recepción de devolución | HU-09 | Responsable de Activos | Confirma la recepción física del equipo devuelto. | Existe una devolución pendiente de confirmación. | El equipo pasa a estado "Disponible". |
| CU-10 | Notificar daño al devolver equipo | HU-10 | Empleado | Notifica daños en el equipo devuelto. | El empleado está devolviendo un equipo. | El incidente queda registrado. |
| CU-11 | Firmar acta de entrega | HU-11 | Empleado | Firma digitalmente el acta de entrega. | Existe una asignación pendiente de firma. | La firma queda registrada con fecha y hora. |
| CU-12 | Reportar equipo dañado | HU-12 | Empleado | Reporta un equipo dañado o que requiere revisión. | Usuario autenticado como Empleado. | El reporte queda registrado y notificado. |
| CU-13 | Notificar disponibilidad de equipo | HU-13 | Empleado | Recibe notificación cuando el equipo solicitado está listo para recoger. | Solicitud aprobada y equipo preparado. | El empleado recibe una notificación por correo. |
| CU-14 | Aprobar o rechazar solicitudes | HU-14 | Aprobador | Revisa y aprueba o rechaza solicitudes de equipos. | Existen solicitudes pendientes. | La solicitud cambia de estado. |
| CU-15 | Recibir notificación de daño | HU-15 | Técnico de Soporte | Recibe notificaciones de daños reportados. | Existe un reporte de daño. | El técnico recibe la notificación. |
| CU-16 | Consultar historial de reparaciones | HU-16 | Técnico de Soporte | Consulta el historial de reparaciones de un equipo. | Usuario autenticado como Técnico de Soporte. | Se muestra el historial completo. |
| CU-17 | Consultar reportes gerenciales | HU-17 | Gerente | Consulta reportes consolidados del estado de los activos. | Usuario autenticado como Gerente. | Se muestran los reportes solicitados. |
| CU-18 | Registrar acciones importantes | HU-18 | Responsable de Activos | Registra acciones críticas sobre activos para auditoría. | Se realiza una acción crítica sobre un activo. | La acción queda auditada. |
| CU-19 | Iniciar sesión y controlar acceso | HU-19 | Todos los actores | Permite iniciar sesión y acceder según el rol asignado. | El usuario posee credenciales válidas. | El acceso queda restringido según el rol. |
| CU-20 | Registrar baja de equipo | HU-20 | Responsable de Activos | Registra la baja de un equipo por pérdida, daño irreparable o fin de vida útil. | Usuario autenticado como Responsable de Activos. | El equipo pasa a estado "Baja". |
| CU-21 | Consultar historial completo de un equipo | HU-21 | Responsable de Activos | Consulta el historial completo de asignaciones, devoluciones, reparaciones y cambios. | Usuario autenticado como Responsable de Activos. | Se muestra el historial completo del equipo. |
