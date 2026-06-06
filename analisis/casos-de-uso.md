Casos de Usos

| ID Actor | Nombre del Actor | Tipo | Descripción | Responsabilidades | Permisos / Rol | CU Relacionados | HU Relacionadas | Restricciones |
|-----------|------------------|------|-------------|-------------------|----------------|-----------------|-----------------|---------------|
| ACT-01 | Responsable de Activos | Primario | Persona del Área de Talento Humano responsable del control total del inventario de activos de la empresa. | Control total del inventario, asignaciones, devoluciones, bajas, reportes, seguimiento y auditoría de los activos. | Administrador (Alto) | CU-01, CU-02, CU-03, CU-04, CU-05, CU-09, CU-15, CU-18, CU-20, CU-21 | HU-01, HU-02, HU-03, HU-04, HU-05, HU-09, HU-18, HU-19, HU-20, HU-21 | Único rol autorizado para registrar bajas de activos y realizar modificaciones críticas en el inventario. |
| ACT-02 | Empleado | Primario | Colaborador de la empresa que utiliza los activos para su labor diaria. | Solicitar equipos, consultar asignaciones, reportar daños, registrar devoluciones y firmar actas. | Usuario Final (Medio) | CU-06, CU-07, CU-08, CU-10, CU-11, CU-12, CU-13 | HU-06, HU-07, HU-08, HU-10, HU-11, HU-12, HU-13, HU-19 | Solo puede visualizar y gestionar sus propios activos asignados. Máximo 3 equipos simultáneos. |
| ACT-03 | Aprobador | Primario | Persona con autoridad para revisar solicitudes de equipos. | Revisar, aprobar o rechazar solicitudes de asignación de equipos. | Aprobador (Medio - Alto) | CU-14, CU-19 | HU-14, HU-19 | No puede realizar asignaciones directas ni modificaciones en el inventario. |
| ACT-04 | Técnico de Soporte | Primario | Personal del Área de TI responsable del soporte técnico y mantenimiento de equipos. | Recibir reportes de daños, revisar historial de reparaciones y realizar mantenimiento. | Soporte Técnico (Medio) | CU-15, CU-16, CU-19 | HU-15, HU-16, HU-19 | Solo puede modificar información relacionada con reportes de daño y mantenimientos. |
| ACT-05 | Gerente | Primario | Personal de Gerencia que requiere visibilidad general del estado de los activos. | Consultar reportes consolidados y conocer el estado general de los activos. | Consulta (Alto) | CU-05, CU-17, CU-19 | HU-17, HU-19 | Acceso exclusivamente de consulta. No puede realizar modificaciones. |


Tabla Resumen de Actores

| ID | Nombre del Actor | Tipo | Permisos / Rol | CU Relacionados |
|----|------------------|------|----------------|-----------------|
| ACT-01 | Responsable de Activos | Primario | Administrador (Alto) | CU-01, CU-02, CU-03, CU-04, CU-05, CU-09, CU-15, CU-18, CU-20, CU-21 |
| ACT-02 | Empleado | Primario | Usuario Final (Medio) | CU-06, CU-07, CU-08, CU-10, CU-11, CU-12, CU-13 |
| ACT-03 | Aprobador | Primario | Aprobador (Medio - Alto) | CU-14, CU-19 |
| ACT-04 | Técnico de Soporte | Primario | Soporte Técnico (Medio) | CU-15, CU-16, CU-19 |
| ACT-05 | Gerente | Primario | Consulta (Alto) | CU-05, CU-17, CU-19 |
