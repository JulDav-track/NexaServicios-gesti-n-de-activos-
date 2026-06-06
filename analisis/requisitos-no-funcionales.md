Requisitos No Funcionales (RNF)

| ID | Categoría | Descripción | Métrica |
|----|------------|-------------|----------|
| RNF-01 | Rendimiento | El sistema debe responder a consultas de inventario. | En menos de 3 segundos |
| RNF-02 | Rendimiento | El sistema debe cargar el panel de activos asignados. | En menos de 2 segundos |
| RNF-03 | Rendimiento | El sistema debe generar reportes de 500 registros. | En menos de 8 segundos |
| RNF-04 | Rendimiento | El sistema debe procesar 50 solicitudes simultáneas. | Tiempo promedio menor a 5 segundos |
| RNF-05 | Seguridad | El sistema debe registrar todas las acciones de usuarios con fecha, hora y responsable. | 100% de las acciones registradas |
| RNF-06 | Seguridad | El sistema debe restringir el acceso a funciones según el rol del usuario. | 100% de cumplimiento de roles |
| RNF-07 | Seguridad | El sistema debe proteger los datos de activos y asignaciones mediante encriptación. | Encriptación AES-256 o equivalente |
| RNF-08 | Seguridad | El sistema debe requerir autenticación de dos factores para cambios en el inventario. | 100% de los cambios requieren 2FA |
| RNF-09 | Usabilidad | El sistema debe permitir a un usuario sin experiencia realizar una solicitud de equipo. | En menos de 60 segundos |
| RNF-10 | Usabilidad | El sistema debe mostrar los estados de los equipos mediante colores e íconos reconocibles. | 100% de los estados visualmente diferenciables |
| RNF-11 | Portabilidad | El sistema debe tener una interfaz compatible con computadoras y dispositivos móviles con sistemas operativos posteriores a 2017. | Compatible con Android, iOS y navegadores web posteriores a 2017 |
| RNF-12 | Portabilidad | El sistema debe permitir navegar entre las pantallas principales (Inicio de sesión, Gestión de activos, Solicitudes, Aprobaciones, Reportes e Historial de reparaciones). | Máximo 3 clics |
| RNF-13 | Disponibilidad | El sistema debe estar disponible mínimo el 99% del tiempo durante horas laborales. | Disponibilidad ≥ 99% en horario laboral |
| RNF-14 | Disponibilidad | El sistema debe tener un tiempo de recuperación después de un fallo menor a 15 minutos. | Tiempo de recuperación ≤ 15 minutos |
| RNF-15 | Respaldo | El sistema debe realizar copias de seguridad automáticas. | Cada 24 horas |
| RNF-16 | Rendimiento | El sistema debe soportar hasta 300 usuarios activos simultáneamente. | Hasta 300 usuarios concurrentes |
| RNF-17 | Portabilidad | El sistema debe permitir agregar nuevos tipos de activos sin modificar la estructura principal. | 100% de compatibilidad estructural |
| RNF-18 | Rendimiento | El sistema debe manejar hasta 10.000 activos registrados sin pérdida de rendimiento. | Sin degradación perceptible (<5%) |
| RNF-19 | Portabilidad | El sistema debe permitir aumentar la cantidad de usuarios sin requerir cambios mayores en la arquitectura. | Escalabilidad lineal hasta +100% de usuarios |
| RNF-20 | Portabilidad | El sistema debe permitir agregar nuevos reportes sin necesidad de reprogramar el núcleo. | Integración ≤ 30 minutos sin modificar el núcleo |
| RNF-21 | Mantenibilidad | El sistema debe tener código fuente documentado y modular. | Documentación completa en el 100% de los módulos |
| RNF-22 | Mantenibilidad | El sistema debe permitir realizar actualizaciones sin detener el servicio más de 30 minutos. | Tiempo máximo de parada: 30 minutos |
| RNF-23 | Observabilidad | El sistema debe registrar errores de forma clara para facilitar su diagnóstico. | Registro del 100% de errores con detalle técnico |
