**Sistema de Gestión de Activos (NexaActivos)**
 
**Secciones 2.3 y 2.4 — Casos de uso**
 
*Diagrama de casos de uso general y casos de uso documentados*
 
# **2.3 Diagrama de casos de uso general (completo)**
 
## **2.3.1 Cómo se construyó**
 
Un caso de uso (CU) describe una interacción entre un actor y el sistema que produce un resultado verificable. Esta sección presenta el diagrama general de NexaActivos (2.3) y la documentación detallada de seis casos de uso críticos (2.4). Se construyó con el siguiente criterio:
 
- **Un CU por historia de usuario.** CU-01 a CU-46 llevan el mismo número y título que HU-01 a HU-46. El flujo básico sale del CA-1 de la historia; cada escenario restante es un flujo alternativo, y ningún escenario queda sin un paso o un flujo que lo recoja.
 
- **Requisitos funcionales.** Se citan RF-01 a RF-172. Cada RF tiene una sola historia de origen, y cada CU cita solo los RF cuya historia de origen es la suya.
 
- **Reglas de negocio.** Se citan únicamente los códigos de las fichas del documento de RN. Las reglas preliminares de los criterios de aceptación que no son RN se citan por su destino: restricción del diccionario de datos, especificación del RF o requisito no funcional.
 
- **Requisitos no funcionales.** RNF-01 (rechazo por rol, Anexo C del documento de RN, RF-166) y RNF-02 (sesión obligatoria) se citan en la precondición de cada CU documentado.
 
- **Casos de uso incluidos.** Los CU-47 a CU-52 («incluido») son una propuesta del equipo, pendiente de validar con la docente. Ninguno tiene RF propio: cada CU que los ejecuta cita su propio RF.
 
- **Mensajes y datos de ejemplo.** Provienen del catálogo M-01 a M-273 y de los escenarios de las historias de usuario.
 
- **Lo que no está definido en las fuentes** se marca como propuesta, pendiente de validar con el cliente. Las preguntas abiertas se citan sin resolverlas (Tabla 28). Ninguna regla, requisito o matriz de permisos está validada aún por el cliente.
 
- **Pantallas.** Los mockups (MK-xx) están pendientes (sección 2.5); por eso la columna «Método → Pantalla» de la cadena completa queda pendiente.
 
## **2.3.2 Actores**
 
El Alcance 1.2 define cinco actores humanos. El diagrama agrega un sexto, el Sistema, que dispara el aviso automático de próximas devoluciones (CU-25); el Empleado es quien lo recibe. El nombre «Sistema» es una propuesta del equipo.
 
**Tabla 1. Actores del sistema**
 
| **Actor** | **Participación** | **CU principales** | **Total** |
| --- | --- | --- | --- |
| **Responsable de Activos** | Administra el inventario, los custodios, las asignaciones, los usuarios, los permisos y las categorías; confirma las recepciones. | CU-01 a CU-08, CU-15 a CU-18, CU-22, CU-24, CU-32 a CU-35, CU-38 a CU-44 | 25 |
| **Empleado** | Solicita equipos, firma el acta de entrega, registra devoluciones, reporta daños, inicia sesión y cambia su contraseña; recibe el aviso de devolución. | CU-09 a CU-12, CU-14, CU-19 a CU-21, CU-23, CU-26, CU-28, CU-36, CU-37 | 13 |
| **Aprobador** | Decide sobre las solicitudes; actor secundario de CU-10. | CU-13 | 1 |
| **Técnico de Soporte** | Consulta los reportes de daño y registra el mantenimiento. | CU-27, CU-29 a CU-31 | 4 |
| **Gerente** | Consulta la auditoría y los reportes (actor supuesto; pregunta abierta P-88). | CU-45, CU-46 | 2 |
| **Sistema (nombre propuesto por el equipo)** | Dispara el aviso automático de próximas devoluciones, sin sesión (RF-167). | CU-25 | 1 |
| **Total** |  |  | 46 |
 
*Fuente: elaboración propia a partir del Alcance 1.2 y de las historias de usuario HU-01 a HU-46.*
 
## **2.3.3 Diagrama general**
 
La Figura 1 (página siguiente) muestra el límite del sistema, los seis actores y los 52 casos de uso: los 46 de las historias, agrupados por actor y, dentro del Responsable de Activos, por entidad, y los 6 incluidos, con línea punteada y la etiqueta «incluido». Las líneas de un mismo actor se agrupan en una barra vertical.
 
*Figura 1. Diagrama general de casos de uso de NexaActivos (46 casos de uso, 6 incluidos y 6 actores).*
 
*Fuente: elaboración propia. Los nombres de los óvalos se abrevian; el nombre completo está en la Tabla 2. El Empleado recibe el aviso de CU-25.*
 
## **2.3.4 Catálogo de casos de uso**
 
El catálogo reúne los 46 casos de uso de las historias y los 6 incluidos propuestos. La prioridad y el actor de cada CU repiten la ficha de su historia; «supuesto» indica que el actor o el permiso depende de una pregunta abierta.
 
**Tabla 2. Catálogo de casos de uso**
 
| **CU** | **Nombre** | **Entidad** | **Actor** | **HU** | **CRUD** | **Prioridad** |
| --- | --- | --- | --- | --- | --- | --- |
| CU-01 | Registrar activo | Activo | Responsable de Activos | HU-01 | C | Alta |
| CU-02 | Consultar activos | Activo | Responsable de Activos | HU-02 | R | Alta |
| CU-03 | Actualizar activo | Activo | Responsable de Activos | HU-03 | U | Media |
| CU-04 | Dar de baja activo | Activo | Responsable de Activos | HU-04 | D lógico | Media |
| CU-05 | Registrar custodio | Custodio | Responsable de Activos | HU-05 | C | Alta |
| CU-06 | Consultar custodios | Custodio | Responsable de Activos | HU-06 | R | Alta |
| CU-07 | Actualizar custodio | Custodio | Responsable de Activos | HU-07 | U | Media |
| CU-08 | Inactivar custodio | Custodio | Responsable de Activos | HU-08 | D lógico | Media |
| CU-09 | Registrar solicitud de equipo | Solicitud | Empleado | HU-09 | C | Alta |
| CU-10 | Consultar solicitudes | Solicitud | Empleado (secundarios: Aprobador, Responsable de Activos) | HU-10 | R | Alta |
| CU-11 | Actualizar solicitud | Solicitud | Empleado | HU-11 | U | Media |
| CU-12 | Cancelar solicitud | Solicitud | Empleado | HU-12 | D lógico | Media |
| CU-13 | Registrar decisión sobre una solicitud | Aprobacion | Aprobador | HU-13 | Proceso | Alta |
| CU-14 | Consultar decisión de una solicitud | Aprobacion | Empleado | HU-14 | R | Alta |
| CU-15 | Asignar equipo a una solicitud aprobada | Asignacion | Responsable de Activos | HU-15 | Proceso | Alta |
| CU-16 | Consultar asignaciones | Asignacion | Responsable de Activos | HU-16 | R | Alta |
| CU-17 | Actualizar asignación | Asignacion | Responsable de Activos | HU-17 | U | Media |
| CU-18 | Cerrar asignación | Asignacion | Responsable de Activos | HU-18 | D lógico | Media |
| CU-19 | Firmar acta de entrega | Acta de Entrega | Empleado | HU-19 | Proceso | Alta |
| CU-20 | Consultar acta de entrega | Acta de Entrega | Empleado | HU-20 | R | Alta |
| CU-21 | Registrar devolución de un equipo | Devolucion | Empleado (supuesto) | HU-21 | C | Alta |
| CU-22 | Consultar devoluciones | Devolucion | Responsable de Activos | HU-22 | R | Alta |
| CU-23 | Actualizar devolución | Devolucion | Empleado | HU-23 | U | Media |
| CU-24 | Confirmar recepción de una devolución | Devolucion | Responsable de Activos | HU-24 | Proceso | Alta |
| CU-25 | Generar aviso de próxima devolución | Notificacion de Devolucion | Sistema* (dispara el aviso); el Empleado lo recibe | HU-25 | Proceso | Media |
| CU-26 | Reportar daño de un equipo | Reporte de Danios | Empleado | HU-26 | C | Alta |
| CU-27 | Consultar reportes de daño | Reporte de Danios | Técnico de Soporte | HU-27 | R | Alta |
| CU-28 | Actualizar reporte de daño | Reporte de Danios | Empleado | HU-28 | U | Media |
| CU-29 | Registrar mantenimiento | Historial Mantenimientos | Técnico de Soporte | HU-29 | C | Alta |
| CU-30 | Consultar historial de mantenimiento | Historial Mantenimientos | Técnico de Soporte (supuesto) | HU-30 | R | Alta |
| CU-31 | Actualizar mantenimiento | Historial Mantenimientos | Técnico de Soporte | HU-31 | U | Media |
| CU-32 | Registrar usuario | Usuario | Responsable de Activos (supuesto) | HU-32 | C | Alta |
| CU-33 | Consultar usuario | Usuario | Responsable de Activos (supuesto) | HU-33 | R | Alta |
| CU-34 | Actualizar usuario | Usuario | Responsable de Activos (supuesto) | HU-34 | U | Media |
| CU-35 | Inactivar usuario | Usuario | Responsable de Activos (supuesto) | HU-35 | D lógico | Media |
| CU-36 | Iniciar sesión | Usuario | Empleado | HU-36 | Proceso | Alta |
| CU-37 | Cambiar contraseña | Usuario | Empleado | HU-37 | Proceso | Media |
| CU-38 | Asignar permiso a un rol | Rol Permiso | Responsable de Activos (supuesto) | HU-38 | C | Alta |
| CU-39 | Retirar permiso a un rol | Rol Permiso | Responsable de Activos (supuesto) | HU-39 | D (excepción) | Media |
| CU-40 | Consultar permisos de un rol | Rol Permiso | Responsable de Activos | HU-40 | R | Alta |
| CU-41 | Registrar categoría | Categoria | Responsable de Activos (supuesto) | HU-41 | C | Alta |
| CU-42 | Consultar categorías | Categoria | Responsable de Activos (supuesto) | HU-42 | R | Alta |
| CU-43 | Actualizar categoría | Categoria | Responsable de Activos (supuesto) | HU-43 | U | Media |
| CU-44 | Inactivar categoría | Categoria | Responsable de Activos (supuesto) | HU-44 | D lógico | Media |
| CU-45 | Consultar registro de auditoría | Auditoria | Gerente (supuesto) | HU-45 | R | Alta |
| CU-46 | Consultar reportes | Reportes | Gerente (supuesto) | HU-46 | R | Alta |
| CU-47 | Cerrar la asignación (incluido) | — | Lo ejecutan CU-18, CU-24 | HU-18, HU-24 | Proceso | — |
| CU-48 | Validar categoría activa (incluido) | — | Lo ejecutan CU-01, CU-03, CU-09, CU-11 | HU-01, HU-03, HU-09, HU-11 | Proceso | — |
| CU-49 | Verificar unicidad de serie y placa (incluido) | — | Lo ejecutan CU-01, CU-03 | HU-01, HU-03 | Proceso | — |
| CU-50 | Verificar unicidad del documento del custodio (incluido) | — | Lo ejecutan CU-05, CU-07 | HU-05, HU-07 | Proceso | — |
| CU-51 | Verificar unicidad del correo (incluido) | — | Lo ejecutan CU-32, CU-34 | HU-32, HU-34 | Proceso | — |
| CU-52 | Verificar unicidad del nombre de categoría (incluido) | — | Lo ejecutan CU-41, CU-43 | HU-41, HU-43 | Proceso | — |
 
*Fuente: elaboración propia a partir de las fichas de las historias de usuario. Los CU-47 a CU-52 son una propuesta del equipo, pendiente de validar con la docente.*
 
## **2.3.5 Relaciones «include» y «extend»**
 
**Criterio.** Un comportamiento se dibuja como caso de uso incluido solo si cumple tres condiciones: (1) se repite como paso en dos o más CU; (2) cada uno de esos CU lo cita con su propio RF y su propia historia, y el óvalo incluido no tiene RF propio; (3) no es una condición transversal que toque casi todos los CU. Con este criterio resultan seis casos de uso incluidos, propuesta del equipo pendiente de validar con la docente.
 
**Tabla 3. Casos de uso incluidos («include»)**
 
| **CU incluido** | **CU que lo ejecutan** | **RF de cada CU (cada RF con su HU)** | **RN** | **Procedencia** |
| --- | --- | --- | --- | --- |
| CU-47 Cerrar la asignación | CU-18 (HU-18); CU-24 (HU-24) | CU-18: RF-21; CU-24: RF-117 | RN-AS14 | RF-117 exige que la confirmación cierre la asignación con los mismos efectos que su cierre directo; CRF-003 deja confirmarRecepcion() invocando cerrar() |
| CU-48 Validar categoría activa | CU-01 (HU-01); CU-03 (HU-03); CU-09 (HU-09); CU-11 (HU-11) | CU-01: RF-52; CU-03: RF-53; CU-09: RF-68; CU-11: RF-76 | RN-A09 (CU-01, CU-03); RN-S07 (CU-09, CU-11) | Los cuatro RF enuncian la misma validación sobre la categoría |
| CU-49 Verificar unicidad de serie y placa | CU-01 (HU-01); CU-03 (HU-03) | CU-01: RF-02; CU-03: RF-51 | RN-A03, RN-A04 | Misma verificación al registrar y al actualizar el activo |
| CU-50 Verificar unicidad del documento del custodio | CU-05 (HU-05); CU-07 (HU-07) | CU-05: RF-07; CU-07: RF-61 | RN-C05 | Misma verificación al registrar y al actualizar el custodio |
| CU-51 Verificar unicidad del correo | CU-32 (HU-32); CU-34 (HU-34) | CU-32: RF-36; CU-34: RF-137 | RN-U04 | Misma verificación al registrar y al actualizar el usuario |
| CU-52 Verificar unicidad del nombre de categoría | CU-41 (HU-41); CU-43 (HU-43) | CU-41: RF-147; CU-43: RF-149 | RN-CA04 | Misma verificación al registrar y al actualizar la categoría |
 
*Fuente: elaboración propia a partir del documento de RF, del documento de RN y de CRF-003.*
 
**«extend».** No se propone ninguno: entre los 172 RF no hay un comportamiento opcional con condición, punto de extensión y historia propia. «Desistir» en CU-24 es un flujo alternativo, y el paso del reporte de daño (CU-26) al mantenimiento (CU-29) es un vínculo de datos entre dos casos de uso independientes.
 
**Lo que no se dibuja.** Cuatro comportamientos no tienen óvalo propio:
 
- tomar el responsable de la sesión (RF-168 a RF-172): es un paso del flujo de CU-09, CU-13, CU-24, CU-26 y CU-29;
 
- auditar (RF-160 a RF-165): es una poscondición de las operaciones auditables;
 
- verificar permiso y sesión (RF-166, RNF-02): es la precondición de cada caso de uso;
 
- el cambio de responsable: no tiene operación en el modelo de clases (MOD-09, P-31).
 
## **2.3.6 Correspondencia con el Alcance 1.2**
 
**Tabla 4. Funciones del Alcance 1.2 y casos de uso que las cubren**
 
| **Función del Alcance 1.2** | **Casos de uso** |
| --- | --- |
| Registrar y consultar el inventario de activos; baja lógica | CU-01 a CU-04 |
| Gestionar los custodios | CU-05 a CU-08 |
| Gestionar las solicitudes de equipos | CU-09 a CU-12 |
| Aprobar o rechazar solicitudes | CU-13, CU-14 |
| Asignar activos aprobados | CU-15 a CU-18 (la solicitud aprobada se encuentra con CU-10) |
| Registrar la firma digital del empleado receptor en el acta de entrega | CU-19, CU-20 |
| Registrar devoluciones y confirmar su recepción | CU-21 a CU-24 |
| Aviso automático de próximas devoluciones: «una única notificación automática por correo electrónico» | CU-25 (actor Sistema) |
| Reportar daños y registrar el mantenimiento; historial de reparaciones | CU-26 a CU-31 |
| Gestionar usuarios, sesión y contraseña | CU-32 a CU-37 |
| Gestionar los permisos de cada rol y consultar los asignados | CU-38 a CU-40 |
| Gestionar las categorías | CU-41 a CU-44 |
| Auditoría y reportes bajo demanda | CU-45, CU-46; RF-160 a RF-165 como poscondiciones |
| Actualización automática del estado de los activos | Poscondiciones de CU-04, CU-15, CU-24 y CU-26; sin óvalo propio |
 
*Fuente: elaboración propia a partir del Alcance 1.2. La generación automática del archivo del acta no tiene método propio en el diagrama de clases v6 y no se dibuja.*
 
## **2.3.7 Diagramas y tablas por entidad**
 
Para cada una de las 15 entidades del diagrama de clases v6 se presenta el diagrama de sus casos de uso y una tabla con el caso de uso, su nombre, la operación (CRUD), la historia de la que nace y los RF que implementa; cada caso de uso cita solo los RF cuya historia de origen es la suya. Los casos de uso incluidos (CU-47 a CU-52) aparecen como filas «(incluido)» en las entidades donde algún caso de uso los ejecuta, con los RF de cada caso de uso que los ejecuta y sin RF propio.
 
### **2.3.7.1 Entidad Activo (HU-01 a HU-04)**
 
*Figura 2. Diagrama de casos de uso de la entidad Activo: C = CU-01, R = CU-02, U = CU-03, D lógico = CU-04; los «include» son CU-48 (RF-52 y RF-53) y CU-49 (RF-02 y RF-51).*
 
*Fuente: elaboración propia a partir de las historias de usuario y del diagrama de clases v6.*
 
**Tabla 5. Casos de uso de la entidad Activo**
 
| **Caso de uso** | **Nombre** | **CRUD** | **Nace de** | **Implementa** |
| --- | --- | --- | --- | --- |
| CU-01 | Registrar activo | C | HU-01 | RF-01, RF-02, RF-52 |
| CU-02 | Consultar activos | R | HU-02 | RF-03, RF-56 |
| CU-03 | Actualizar activo | U | HU-03 | RF-04, RF-51, RF-53, RF-54, RF-55, RF-60 |
| CU-04 | Dar de baja activo | D lógico | HU-04 | RF-05, RF-57, RF-58, RF-59, RF-164 |
| CU-48 (incluido) | Validar categoría activa | Proceso | HU-01 CA-6, HU-03 CA-4 | CU-01: RF-52; CU-03: RF-53 |
| CU-49 (incluido) | Verificar unicidad de serie y placa | Proceso | HU-01 CA-3, HU-03 CA-3 | CU-01: RF-02; CU-03: RF-51 |
 
*Fuente: elaboración propia a partir de las historias de usuario y del documento de RF.*
 
### **2.3.7.2 Entidad Custodio (HU-05 a HU-08)**
 
*Figura 3. Diagrama de casos de uso de la entidad Custodio: C = CU-05, R = CU-06, U = CU-07, D lógico = CU-08; los «include» son CU-50 (RF-07 y RF-61).*
 
*Fuente: elaboración propia a partir de las historias de usuario y del diagrama de clases v6.*
 
**Tabla 6. Casos de uso de la entidad Custodio**
 
| **Caso de uso** | **Nombre** | **CRUD** | **Nace de** | **Implementa** |
| --- | --- | --- | --- | --- |
| CU-05 | Registrar custodio | C | HU-05 | RF-06, RF-07, RF-62, RF-63 |
| CU-06 | Consultar custodios | R | HU-06 | RF-08 |
| CU-07 | Actualizar custodio | U | HU-07 | RF-09, RF-61 |
| CU-08 | Inactivar custodio | D lógico | HU-08 | RF-10, RF-64, RF-65, RF-66, RF-67 |
| CU-50 (incluido) | Verificar unicidad del documento del custodio | Proceso | HU-05 CA-5, HU-07 CA-3 | CU-05: RF-07; CU-07: RF-61 |
 
*Fuente: elaboración propia a partir de las historias de usuario y del documento de RF.*
 
### **2.3.7.3 Entidad Solicitud (HU-09 a HU-12)**
 
*Figura 4. Diagrama de casos de uso de la entidad Solicitud: C = CU-09, R = CU-10, U = CU-11, D lógico = CU-12; los «include» son CU-48 (RF-68 y RF-76).*
 
*Fuente: elaboración propia a partir de las historias de usuario y del diagrama de clases v6.*
 
**Tabla 7. Casos de uso de la entidad Solicitud**
 
| **Caso de uso** | **Nombre** | **CRUD** | **Nace de** | **Implementa** |
| --- | --- | --- | --- | --- |
| CU-09 | Registrar solicitud de equipo | C | HU-09 | RF-11, RF-68, RF-69, RF-70, RF-71, RF-168 |
| CU-10 | Consultar solicitudes | R | HU-10 | RF-12, RF-72, RF-73, RF-74, RF-75 |
| CU-11 | Actualizar solicitud | U | HU-11 | RF-13, RF-14, RF-76, RF-77 |
| CU-12 | Cancelar solicitud | D lógico | HU-12 | RF-15, RF-78, RF-79, RF-80 |
| CU-48 (incluido) | Validar categoría activa | Proceso | HU-09 CA-4, HU-11 CA-2 | CU-09: RF-68; CU-11: RF-76 |
 
*Fuente: elaboración propia a partir de las historias de usuario y del documento de RF.*
 
### **2.3.7.4 Entidad Aprobacion (HU-13 a HU-14)**
 
*Figura 5. Diagrama de casos de uso de la entidad Aprobacion: Proceso = CU-13, R = CU-14.*
 
*Fuente: elaboración propia a partir de las historias de usuario y del diagrama de clases v6.*
 
**Tabla 8. Casos de uso de la entidad Aprobacion**
 
| **Caso de uso** | **Nombre** | **CRUD** | **Nace de** | **Implementa** |
| --- | --- | --- | --- | --- |
| CU-13 | Registrar decisión sobre una solicitud | Proceso | HU-13 | RF-16, RF-81, RF-82, RF-83, RF-84, RF-86, RF-169 |
| CU-14 | Consultar decisión de una solicitud | R | HU-14 | RF-17, RF-85 |
 
*Fuente: elaboración propia a partir de las historias de usuario y del documento de RF.*
 
### **2.3.7.5 Entidad Asignacion (HU-15 a HU-18)**
 
*Figura 6. Diagrama de casos de uso de la entidad Asignacion: Proceso = CU-15, R = CU-16, U = CU-17, D lógico = CU-18; los «include» son CU-47 (RF-21).*
 
*Fuente: elaboración propia a partir de las historias de usuario y del diagrama de clases v6.*
 
**Tabla 9. Casos de uso de la entidad Asignacion**
 
| **Caso de uso** | **Nombre** | **CRUD** | **Nace de** | **Implementa** |
| --- | --- | --- | --- | --- |
| CU-15 | Asignar equipo a una solicitud aprobada | Proceso | HU-15 | RF-18, RF-87, RF-88, RF-89, RF-90, RF-91, RF-161 |
| CU-16 | Consultar asignaciones | R | HU-16 | RF-19, RF-92, RF-93, RF-94, RF-95, RF-96 |
| CU-17 | Actualizar asignación | U | HU-17 | RF-20, RF-97 |
| CU-18 | Cerrar asignación | D lógico | HU-18 | RF-21, RF-98, RF-99, RF-100, RF-101 |
| CU-47 (incluido) | Cerrar la asignación | Proceso | HU-18 CA-1 | CU-18: RF-21 |
 
*Fuente: elaboración propia a partir de las historias de usuario y del documento de RF.*
 
### **2.3.7.6 Entidad Acta de Entrega (HU-19 a HU-20)**
 
*Figura 7. Diagrama de casos de uso de la entidad Acta de Entrega: Proceso = CU-19, R = CU-20.*
 
*Fuente: elaboración propia a partir de las historias de usuario y del diagrama de clases v6.*
 
**Tabla 10. Casos de uso de la entidad Acta de Entrega**
 
| **Caso de uso** | **Nombre** | **CRUD** | **Nace de** | **Implementa** |
| --- | --- | --- | --- | --- |
| CU-19 | Firmar acta de entrega | Proceso | HU-19 | RF-22, RF-102, RF-103, RF-104, RF-105 |
| CU-20 | Consultar acta de entrega | R | HU-20 | RF-23, RF-106 |
 
*Fuente: elaboración propia a partir de las historias de usuario y del documento de RF.*
 
### **2.3.7.7 Entidad Devolucion (HU-21 a HU-24)**
 
*Figura 8. Diagrama de casos de uso de la entidad Devolucion: C = CU-21, R = CU-22, U = CU-23, Proceso = CU-24; los «include» son CU-47 (RF-117).*
 
*Fuente: elaboración propia a partir de las historias de usuario y del diagrama de clases v6.*
 
**Tabla 11. Casos de uso de la entidad Devolucion**
 
| **Caso de uso** | **Nombre** | **CRUD** | **Nace de** | **Implementa** |
| --- | --- | --- | --- | --- |
| CU-21 | Registrar devolución de un equipo | C | HU-21 | RF-24, RF-107, RF-108, RF-109, RF-110, RF-162 |
| CU-22 | Consultar devoluciones | R | HU-22 | RF-25, RF-111, RF-112 |
| CU-23 | Actualizar devolución | U | HU-23 | RF-26, RF-113, RF-114 |
| CU-24 | Confirmar recepción de una devolución | Proceso | HU-24 | RF-27, RF-115, RF-116, RF-117, RF-118, RF-163, RF-170 |
| CU-47 (incluido) | Cerrar la asignación | Proceso | HU-24 CA-7 | CU-24: RF-117 |
 
*Fuente: elaboración propia a partir de las historias de usuario y del documento de RF.*
 
### **2.3.7.8 Entidad Notificacion de Devolucion (HU-25)**
 
*Figura 9. Diagrama de casos de uso de la entidad Notificacion de Devolucion: Proceso = CU-25.*
 
*Fuente: elaboración propia a partir de las historias de usuario y del diagrama de clases v6.*
 
**Tabla 12. Casos de uso de la entidad Notificacion de Devolucion**
 
| **Caso de uso** | **Nombre** | **CRUD** | **Nace de** | **Implementa** |
| --- | --- | --- | --- | --- |
| CU-25 | Generar aviso de próxima devolución | Proceso | HU-25 | RF-28, RF-119, RF-120, RF-121, RF-167 |
 
*Fuente: elaboración propia a partir de las historias de usuario y del documento de RF.*
 
### **2.3.7.9 Entidad Reporte de Danios (HU-26 a HU-28)**
 
*Figura 10. Diagrama de casos de uso de la entidad Reporte de Danios: C = CU-26, R = CU-27, U = CU-28.*
 
*Fuente: elaboración propia a partir de las historias de usuario y del diagrama de clases v6.*
 
**Tabla 13. Casos de uso de la entidad Reporte de Danios**
 
| **Caso de uso** | **Nombre** | **CRUD** | **Nace de** | **Implementa** |
| --- | --- | --- | --- | --- |
| CU-26 | Reportar daño de un equipo | C | HU-26 | RF-29, RF-122, RF-123, RF-124, RF-125, RF-171 |
| CU-27 | Consultar reportes de daño | R | HU-27 | RF-30, RF-126, RF-127 |
| CU-28 | Actualizar reporte de daño | U | HU-28 | RF-31, RF-128, RF-129, RF-130 |
 
*Fuente: elaboración propia a partir de las historias de usuario y del documento de RF.*
 
### **2.3.7.10 Entidad Historial Mantenimientos (HU-29 a HU-31)**
 
*Figura 11. Diagrama de casos de uso de la entidad Historial Mantenimientos: C = CU-29, R = CU-30, U = CU-31.*
 
*Fuente: elaboración propia a partir de las historias de usuario y del diagrama de clases v6.*
 
**Tabla 14. Casos de uso de la entidad Historial Mantenimientos**
 
| **Caso de uso** | **Nombre** | **CRUD** | **Nace de** | **Implementa** |
| --- | --- | --- | --- | --- |
| CU-29 | Registrar mantenimiento | C | HU-29 | RF-32, RF-131, RF-132, RF-133, RF-134, RF-172 |
| CU-30 | Consultar historial de mantenimiento | R | HU-30 | RF-33, RF-135 |
| CU-31 | Actualizar mantenimiento | U | HU-31 | RF-34, RF-136 |
 
*Fuente: elaboración propia a partir de las historias de usuario y del documento de RF.*
 
### **2.3.7.11 Entidad Usuario (HU-32 a HU-37)**
 
*Figura 12. Diagrama de casos de uso de la entidad Usuario: C = CU-32, R = CU-33, U = CU-34, D lógico = CU-35, Proceso = CU-36, Proceso = CU-37; los «include» son CU-51 (RF-36 y RF-137).*
 
*Fuente: elaboración propia a partir de las historias de usuario y del diagrama de clases v6.*
 
**Tabla 15. Casos de uso de la entidad Usuario**
 
| **Caso de uso** | **Nombre** | **CRUD** | **Nace de** | **Implementa** |
| --- | --- | --- | --- | --- |
| CU-32 | Registrar usuario | C | HU-32 | RF-35, RF-36 |
| CU-33 | Consultar usuario | R | HU-33 | RF-37 |
| CU-34 | Actualizar usuario | U | HU-34 | RF-38, RF-137, RF-138 |
| CU-35 | Inactivar usuario | D lógico | HU-35 | RF-39, RF-139, RF-140, RF-141, RF-142, RF-143 |
| CU-36 | Iniciar sesión | Proceso | HU-36 | RF-40, RF-144 |
| CU-37 | Cambiar contraseña | Proceso | HU-37 | RF-41, RF-145 |
| CU-51 (incluido) | Verificar unicidad del correo | Proceso | HU-32 CA-4, HU-34 CA-5 | CU-32: RF-36; CU-34: RF-137 |
 
*Fuente: elaboración propia a partir de las historias de usuario y del documento de RF.*
 
### **2.3.7.12 Entidad Rol Permiso (HU-38 a HU-40)**
 
*Figura 13. Diagrama de casos de uso de la entidad Rol Permiso: C = CU-38, D (excepción) = CU-39, R = CU-40.*
 
*Fuente: elaboración propia a partir de las historias de usuario y del diagrama de clases v6.*
 
**Tabla 16. Casos de uso de la entidad Rol Permiso**
 
| **Caso de uso** | **Nombre** | **CRUD** | **Nace de** | **Implementa** |
| --- | --- | --- | --- | --- |
| CU-38 | Asignar permiso a un rol | C | HU-38 | RF-42, RF-166 |
| CU-39 | Retirar permiso a un rol | D (excepción) | HU-39 | RF-43, RF-146 |
| CU-40 | Consultar permisos de un rol | R | HU-40 | RF-44 |
 
*Fuente: elaboración propia a partir de las historias de usuario y del documento de RF.*
 
### **2.3.7.13 Entidad Categoria (HU-41 a HU-44)**
 
*Figura 14. Diagrama de casos de uso de la entidad Categoria: C = CU-41, R = CU-42, U = CU-43, D lógico = CU-44; los «include» son CU-52 (RF-147 y RF-149).*
 
*Fuente: elaboración propia a partir de las historias de usuario y del diagrama de clases v6.*
 
**Tabla 17. Casos de uso de la entidad Categoria**
 
| **Caso de uso** | **Nombre** | **CRUD** | **Nace de** | **Implementa** |
| --- | --- | --- | --- | --- |
| CU-41 | Registrar categoría | C | HU-41 | RF-45, RF-147 |
| CU-42 | Consultar categorías | R | HU-42 | RF-46, RF-148 |
| CU-43 | Actualizar categoría | U | HU-43 | RF-47, RF-149, RF-150 |
| CU-44 | Inactivar categoría | D lógico | HU-44 | RF-48, RF-151, RF-152, RF-153, RF-154 |
| CU-52 (incluido) | Verificar unicidad del nombre de categoría | Proceso | HU-41 CA-4, HU-43 CA-3 | CU-41: RF-147; CU-43: RF-149 |
 
*Fuente: elaboración propia a partir de las historias de usuario y del documento de RF.*
 
### **2.3.7.14 Entidad Auditoria (HU-45)**
 
*Figura 15. Diagrama de casos de uso de la entidad Auditoria: R = CU-45.*
 
*Fuente: elaboración propia a partir de las historias de usuario y del diagrama de clases v6.*
 
**Tabla 18. Casos de uso de la entidad Auditoria**
 
| **Caso de uso** | **Nombre** | **CRUD** | **Nace de** | **Implementa** |
| --- | --- | --- | --- | --- |
| CU-45 | Consultar registro de auditoría | R | HU-45 | RF-49, RF-160 |
 
*Fuente: elaboración propia a partir de las historias de usuario y del documento de RF.*
 
### **2.3.7.15 Entidad Reportes (HU-46)**
 
*Figura 16. Diagrama de casos de uso de la entidad Reportes: R = CU-46.*
 
*Fuente: elaboración propia a partir de las historias de usuario y del diagrama de clases v6.*
 
**Tabla 19. Casos de uso de la entidad Reportes**
 
| **Caso de uso** | **Nombre** | **CRUD** | **Nace de** | **Implementa** |
| --- | --- | --- | --- | --- |
| CU-46 | Consultar reportes | R | HU-46 | RF-50, RF-155, RF-156, RF-157, RF-158, RF-159, RF-165 |
 
*Fuente: elaboración propia a partir de las historias de usuario y del documento de RF.*
 
# **2.4 Casos de uso documentados y justificación de la selección**
 
## **2.4.1 Justificación de la selección**
 
De los 46 casos de uso se documentan seis: CU-01, CU-09, CU-13, CU-15, CU-19 y CU-24. Los tres criterios de selección son **provisionales** hasta contar con el Instructivo Oficial de casos de uso, y se anclan en documentos del proyecto: (1) el flujo central del Alcance 1.2; (2) la cobertura de las anclas de 1.7.3; (3) el cruce de entidades y actores y su utilidad para los diagramas de secuencia y el corte vertical.
 
El primer criterio reúne el recorrido solicitud, aprobación, asignación, entrega firmada y devolución, más el registro del activo que lo alimenta. El segundo criterio queda cubierto por completo: RN-A03 y RN-A04 («equipo identificado de forma única») en CU-01, RN-AP12a («decisión atribuible») en CU-13, RN-AS07a («solo un equipo disponible puede entregarse») en CU-15 y RN-AC07a («acta firmada por quien recibe») en CU-19. En el tercero, los seis casos cruzan seis entidades (Activo, Solicitud, Aprobación, Asignación, Acta y Devolución); CU-09, CU-13 y CU-15 forman el corte vertical sugerido en el cronograma (semana 15), y CU-24 cierra el ciclo con el cierre de la asignación y la liberación del activo.
 
**Alcance de la selección.** Los seis casos cubren tres actores: Responsable de Activos (CU-01, CU-15, CU-24), Empleado (CU-09, CU-19) y Aprobador (CU-13). El Técnico de Soporte y el Gerente no quedan cubiertos: sus casos (CU-27, CU-29 a CU-31, CU-45 y CU-46) no se documentan en esta entrega, y tampoco el resto de los 40 casos no seleccionados.
 
**Tabla 20. Selección de los casos de uso documentados**
 
| **CU** | **Criterio 1: flujo central** | **Criterio 2: anclas de 1.7.3** | **Criterio 3: entidades y actores** | **Observación** |
| --- | --- | --- | --- | --- |
| **CU-01** | Registro del activo que alimenta el flujo | RN-A03, RN-A04 | Activo; Responsable de Activos | Ejecuta CU-48 y CU-49 |
| **CU-09** | Inicio del flujo: solicitud de equipo | Sin ancla (RN-S09, RN-S19) | Solicitud, Custodio, Categoría; Empleado | Primer paso del corte vertical |
| **CU-13** | Aprobar o rechazar | RN-AP12a | Aprobación, Solicitud; Aprobador | Segundo paso del corte vertical |
| **CU-15** | Asignar el activo aprobado | RN-AS07a | Asignación, Solicitud, Activo; Responsable de Activos | Tercer paso del corte; el activo pasa a Asignado |
| **CU-19** | Acta y firma del empleado receptor | RN-AC07a | Acta, Asignación; Empleado | Respalda la entrega |
| **CU-24** | Confirmar la recepción | Sin ancla (RN-D11b, RN-D14b) | Devolución, Asignación, Activo; Responsable de Activos | Ejecuta CU-47; cierra el ciclo |
 
*Fuente: elaboración propia. Criterios provisionales hasta contar con el Instructivo Oficial.*
 
## **2.4.2 Precondiciones de sesión y de autoridad**
 
**Sesión.** Toda precondición declara que el actor inició sesión (RNF-02). Las excepciones son HU-36 (iniciar sesión) y HU-25 (aviso automático, RF-167). El vencimiento de la sesión depende de la pregunta abierta P-70.
 
**Autoridad.** La precondición declara que el rol del actor tiene permitida la operación según la matriz rol–operación (Anexo C del documento de RN, pendiente de validar con el cliente), exigida por RNF-01 e implementada por RF-166. RF-166 es transversal: su historia de origen es HU-38, y se aplica a todos los casos de uso. La matriz depende de P-75, P-77 y P-100. La autoridad no se apoya en ninguna regla de negocio numerada; las RN de propiedad y de atribución (por ejemplo RN-S19 y RN-AP12a) se citan en los pasos donde se aplican.
 
**Rechazo por rol.** En CU-13 el flujo 7a cita M-85 y en CU-24 el flujo 5a cita M-154, porque sus historias tienen un escenario para ello. En CU-01, CU-09, CU-15 y CU-19 la historia no tiene escenario ni mensaje para el rechazo por rol: por RNF-01 (prueba PV-01) y RF-166, el sistema no ejecuta la operación y informa que no tiene permiso. El texto «No tiene permiso para realizar esta operación.» es una propuesta, pendiente de validar con el cliente; no se le asigna número de mensaje.
 
## **2.4.3 CU-01 Registrar activo**
 
**Tabla 21. CU-01 Registrar activo**
 
| **CU-01** | **Registrar activo** | **Procedencia** |
| --- | --- | --- |
| **Actor** | Responsable de Activos | *Historia de la HU-01* |
| **Precondición** | El Responsable de Activos ha iniciado sesión (RNF-02). Su rol tiene permitida esta operación según la matriz rol–operación (Anexo C del documento de RN, pendiente de validar con el cliente; RNF-01, implementado por RF-166; P-75). Existe la categoría 1 (Portátiles, activa). | *Antecedentes de la HU-01 y «Dado» del CA-1; RNF-02 (sesión); RNF-01 y RF-166 (autoridad)* |
| **Flujo básico (Evento / Respuesta)** | **1. **El Responsable de Activos solicita registrar activo. / El sistema presenta el formulario. **2. **El Responsable de Activos registra el activo con los datos: Marca = Dell, Modelo = Latitude 5420, Numero_Serie = 9H4TQ63, Placa_Inventario = NEX-000104, Ubicacion = Oficina 205, ID_Categoria = 1. / El sistema recibe los datos. **3. **— / El sistema verifica «Datos obligatorios vacíos» (restricción del diccionario). **4. **— / El sistema verifica «Longitud máxima aceptada y superada» (restricción del diccionario). **5. **— / El sistema ejecuta el caso de uso incluido CU-49 «Verificar unicidad de serie y placa» («include», RF-02, RN-A03, RN-A04). **6. **— / El sistema ejecuta el caso de uso incluido CU-48 «Validar categoría activa» («include», RF-52, RN-A09). **7. **— / El sistema responde «Activo registrado correctamente.»; el activo queda guardado con: ID_Activo = (automático), Marca = Dell, Modelo = Latitude 5420, Numero_Serie = 9H4TQ63, Placa_Inventario = NEX-000104, Estado = Disponible, Ubicacion = Oficina 205, ID_Categoria = 1. | *ES el CA-1 (RF-01)* *Pasos 3 y 4: restricciones del diccionario (RF-01)* *Paso 5: «include» CU-49 (RF-02)* *Paso 6: «include» CU-48 (RF-52)* *Estado inicial Disponible: restricción del diccionario (valor por defecto; respaldo RF-01)* |
| **Flujo alternativo 2a** | Registrar un activo sin ubicación: El sistema responde «Activo registrado correctamente.»; el activo queda con Ubicacion vacía y Estado Disponible. El caso de uso termina. | *ES el CA-2 · Valida la restricción del diccionario (Ubicacion es opcional; RF-01)* |
| **Flujo alternativo 3a** | Datos obligatorios vacíos: El sistema responde según el caso; no se crea el activo: (Marca → «La marca es obligatoria.»); (Modelo → «El modelo es obligatorio.»); (Numero_Serie → «El número de serie es obligatorio.»); (Placa_Inventario → «La placa de inventario es obligatoria.»); (ID_Categoria → «La categoría es obligatoria.»). Vuelve al paso 2. | *ES el CA-4 · Valida la restricción del diccionario (NO NULO; RF-01)* |
| **Flujo alternativo 4a** | Longitud máxima aceptada y superada: El sistema responde según el caso: (Numero_Serie, valor: 9H4TQ63L8M2P5R7T1V3X, longitud: 20, máximo: 20 → «Activo registrado correctamente.»); (Placa_Inventario, valor: NEX-0001045, longitud: 11, máximo: 11 → «Activo registrado correctamente.»); (Marca, valor: texto de 51 caracteres, longitud: 51, máximo: 50 → «La marca no puede superar 50 caracteres.»); (Modelo, valor: texto de 51 caracteres, longitud: 51, máximo: 50 → «El modelo no puede superar 50 caracteres.»); (Numero_Serie, valor: 9H4TQ63L8M2P5R7T1V3XZ, longitud: 21, máximo: 20 → «El número de serie no puede superar 20 caracteres.»); (Placa_Inventario, valor: NEX-00010456, longitud: 12, máximo: 11 → «La placa de inventario no puede superar 11 caracteres.»); (Ubicacion, valor: texto de 101 caracteres, longitud: 101, máximo: 100 → «La ubicación no puede superar 100 caracteres.»). Vuelve al paso 2. | *ES el CA-5 · Valida la restricción del diccionario (longitud; RF-01)* |
| **Flujo alternativo 5a** | Número de serie o placa ya registrados: El sistema responde según el caso; no se crea el activo: (Numero_Serie, valor: 5CD2171NQ7, lo tiene el activo: 1 (Disponible) → «El número de serie ya está registrado.»); (Numero_Serie, valor: X4LZ1203918, lo tiene el activo: 4 (Baja) → «El número de serie ya está registrado.»); (Placa_Inventario, valor: NEX-000102, lo tiene el activo: 2 (Asignado) → «La placa de inventario ya está registrada.»); (Placa_Inventario, valor: NEX-000090, lo tiene el activo: 4 (Baja) → «La placa de inventario ya está registrada.»). Vuelve al paso 2. | *ES el CA-3 · Valida RN-A03, RN-A04 (RF-02) · «include» CU-49* |
| **Flujo alternativo 6a** | Categoría inexistente o inactiva: El sistema responde según el caso; no se crea el activo: (categoria: 99 (no existe) → «La categoría seleccionada no existe.»); (categoria: 3 (Proyectores, inactiva) → «La categoría seleccionada está inactiva.»). Vuelve al paso 2. | *ES el CA-6 · Valida RN-A09 para la categoría inactiva (RF-52) y la restricción del diccionario (FK) para la inexistente (RF-01) · «include» CU-48* |
| **Poscondición** | El activo queda guardado con: ID_Activo = (automático), Marca = Dell, Modelo = Latitude 5420, Numero_Serie = 9H4TQ63, Placa_Inventario = NEX-000104, Estado = Disponible, Ubicacion = Oficina 205, ID_Categoria = 1. | *Entonces y Y del CA-1* |
| **Requisitos y reglas** | **RF:** RF-01, RF-02, RF-52. **RN:** RN-A03, RN-A04, RN-A09 (las demás reglas preliminares del CA son restricciones del diccionario). **RNF:** RNF-01 (RF-166), RNF-02. **Mensajes:** M-01, M-02, M-03, M-04, M-05, M-06, M-07, M-08, M-09, M-10, M-11, M-12, M-13, M-14, M-15. El alta del activo no se audita (P-89, pregunta abierta). Rechazo por rol: RNF-01, RF-166 y PV-01; mensaje propuesto en 2.4.2, pendiente de validar con el cliente. | *Documentos de RF, RN y RNF; catálogo de mensajes M-01 a M-273* |
 
*Fuente: elaboración propia a partir de la HU-01, del documento de RF, del documento de RN y de los RNF.*
 
## **2.4.4 CU-09 Registrar solicitud de equipo**
 
**Tabla 22. CU-09 Registrar solicitud de equipo**
 
| **CU-09** | **Registrar solicitud de equipo** | **Procedencia** |
| --- | --- | --- |
| **Actor** | Empleado | *Historia de la HU-09* |
| **Precondición** | El Empleado ha iniciado sesión (RNF-02). Su rol tiene permitida esta operación según la matriz rol–operación (Anexo C del documento de RN, pendiente de validar con el cliente; RNF-01, implementado por RF-166; P-75). Existe la categoría 1 (Portátiles, activa). El Empleado tiene el custodio 3 (usuario 7, activo). | *Antecedentes de la HU-09 y «Dado» del CA-1; RNF-02 (sesión); RNF-01 y RF-166 (autoridad)* |
| **Flujo básico (Evento / Respuesta)** | **1. **El Empleado solicita registrar solicitud de equipo. / El sistema presenta el formulario. **2. **El Empleado registra la solicitud con los datos: ID_Categoria = 1, Motivo = Portátil para trabajo en campo, ID_Custodio = 3. / El sistema recibe los datos. **3. **— / El sistema verifica «Datos obligatorios vacíos» (restricción del diccionario). **4. **— / El sistema verifica «Longitud máxima del motivo aceptada y superada» (restricción del diccionario). **5. **— / El sistema ejecuta el caso de uso incluido CU-48 «Validar categoría activa» («include», RF-68, RN-S07). **6. **— / El sistema verifica «Custodio inexistente, inactivo, sin registrar o de otro empleado» (RN-S09, RN-S10b, RN-S19). **7. **— / El sistema responde «Solicitud registrada correctamente.»; la solicitud queda guardada con: ID_Solicitud = (automático), ID_Categoria = 1, Motivo = Portátil para trabajo en campo, Fecha_Solicitud = (fecha y hora actuales), ID_Custodio = 3, Estado_Solicitud = Pendiente; ID_Solicitud, Fecha_Solicitud y Estado_Solicitud los asignó el sistema. | *ES el CA-1 (RF-11)* *Pasos 3 y 4: restricciones del diccionario (RF-11)* *Paso 5: «include» CU-48 (RF-68)* *Paso 6: RF-69, RF-70, RF-71 y RF-168* *Valores asignados al crear: restricción del diccionario (respaldo RF-11)* |
| **Flujo alternativo 3a** | Datos obligatorios vacíos: El sistema responde según el caso; no se crea la solicitud: (ID_Categoria → «La categoría es obligatoria.»); (Motivo → «El motivo es obligatorio.»); (ID_Custodio → «El custodio es obligatorio.»). Vuelve al paso 2. | *ES el CA-2 · Valida la restricción del diccionario (NO NULO; RF-11)* |
| **Flujo alternativo 4a** | Longitud máxima del motivo aceptada y superada: El sistema responde según el caso: (valor: texto de 255 caracteres, longitud: 255, máximo: 255 → «Solicitud registrada correctamente.»); (valor: texto de 256 caracteres, longitud: 256, máximo: 255 → «El motivo no puede superar 255 caracteres.»). Vuelve al paso 2. | *ES el CA-3 · Valida la restricción del diccionario (longitud; RF-11)* |
| **Flujo alternativo 5a** | Categoría inexistente o inactiva: El sistema responde según el caso; no se crea la solicitud: (categoria: 99 (no existe) → «La categoría seleccionada no existe.»); (categoria: 3 (Proyectores, inactiva) → «La categoría seleccionada está inactiva.»). Vuelve al paso 2. | *ES el CA-4 · Valida RN-S07 para la categoría inactiva (RF-68) y la restricción del diccionario (FK) para la inexistente (RF-11) · «include» CU-48* |
| **Flujo alternativo 6a** | Custodio inexistente, inactivo, sin registrar o de otro empleado: El sistema responde según el caso; no se crea la solicitud: (ID_Custodio 99 (no existe) → «El custodio no existe.»); (ID_Custodio 2 (inactivo) → «El custodio está inactivo.»); (un Empleado sin custodio registrado → «El empleado no está registrado como custodio.»); (ID_Custodio 1 (de otro empleado) → «El custodio no corresponde al empleado que solicita.»). Vuelve al paso 2. | *ES el CA-5 · Valida RN-S09 (RF-69), RN-S10b (RF-70) y RN-S19, que incluye RN-S10c (RF-71, RF-168); la existencia del custodio es restricción del diccionario (FK; RF-11)* |
| **Poscondición** | La solicitud queda guardada con: ID_Solicitud = (automático), ID_Categoria = 1, Motivo = Portátil para trabajo en campo, Fecha_Solicitud = (fecha y hora actuales), ID_Custodio = 3, Estado_Solicitud = Pendiente; ID_Solicitud, Fecha_Solicitud y Estado_Solicitud los asignó el sistema. | *Entonces y Y del CA-1* |
| **Requisitos y reglas** | **RF:** RF-11, RF-68, RF-69, RF-70, RF-71, RF-168. **RN:** RN-S07, RN-S09, RN-S10b, RN-S19 (incluye RN-S10c). **RNF:** RNF-01 (RF-166), RNF-02. **Mensajes:** M-07, M-08, M-09, M-50, M-60, M-61, M-62, M-63, M-64, M-65, M-272. Rechazo por rol: RNF-01, RF-166 y PV-01; mensaje propuesto en 2.4.2, pendiente de validar con el cliente. | *Documentos de RF, RN y RNF; catálogo de mensajes M-01 a M-273* |
 
*Fuente: elaboración propia a partir de la HU-09, del documento de RF, del documento de RN y de los RNF.*
 
## **2.4.5 CU-13 Registrar decisión sobre una solicitud**
 
**Tabla 23. CU-13 Registrar decisión sobre una solicitud**
 
| **CU-13** | **Registrar decisión sobre una solicitud** | **Procedencia** |
| --- | --- | --- |
| **Actor** | Aprobador | *Historia de la HU-13* |
| **Precondición** | El Aprobador ha iniciado sesión (RNF-02). Su rol tiene permitida esta operación según la matriz rol–operación (Anexo C del documento de RN, pendiente de validar con el cliente; RNF-01, implementado por RF-166; Anexo C: permiso genérico Aprobar; P-75, P-RP1). Existe la solicitud 1 en estado Pendiente (custodio 3, categoría 1). | *Antecedentes de la HU-13 y «Dado» del CA-1; RNF-02 (sesión); RNF-01 y RF-166 (autoridad)* |
| **Flujo básico (Evento / Respuesta)** | **1. **El Aprobador solicita registrar decisión sobre una solicitud. / El sistema presenta el formulario. **2. **El Aprobador registra la decisión con los datos: ID_Solicitud = 1, ID_Aprobador = 9, Decision = Aprobada. / El sistema recibe los datos. **3. **— / El sistema verifica «Decisión y motivo del rechazo» (RN-AP02b). **4. **— / El sistema verifica «Longitud máxima del motivo del rechazo aceptada y superada» (restricción del diccionario). **5. **— / El sistema verifica «Solicitud que ya tiene decisión» (RN-AP06a). **6. **— / El sistema verifica «Solicitud inexistente o no pendiente» (RN-AP09, RN-AP06a). **7. **— / El sistema verifica «Aprobador inexistente, inactivo, sin rol Aprobador o distinto del usuario en sesión» (RN-AP11a, RN-AP12a). **8. **— / El sistema responde «Decisión registrada correctamente.»; la decisión queda guardada con: ID_Aprobacion = (automático), ID_Solicitud = 1, ID_Aprobador = 9, Decision = Aprobada, Motivo_Rechazo = (vacío), Fecha_Decision = (fecha y hora actuales); la solicitud 1 pasa a estado Aprobada. | *ES el CA-1 (RF-16, RF-86)* *Paso 3: RF-81* *Pasos 5 y 6: RF-82* *Paso 7: RF-83, RF-84 (RN-AP12a, ancla de 1.7.3) y RF-169; el rol Aprobador, RNF-01 (RF-166)* *Paso 8: el estado de la solicitud, RF-86* |
| **Flujo alternativo 2a** | Rechazar una solicitud pendiente con motivo: El sistema responde «Decisión registrada correctamente.»; la decisión queda guardada con: ID_Aprobacion = (automático), ID_Solicitud = 1, ID_Aprobador = 9, Decision = Rechazada, Motivo_Rechazo = Sin disponibilidad en la categoría, Fecha_Decision = (fecha y hora actuales); la solicitud 1 pasa a estado Rechazada. El caso de uso termina. | *ES el CA-2 · Valida RN-AP02b (RF-81); estado de la solicitud, RF-86* |
| **Flujo alternativo 3a** | Decisión y motivo del rechazo: El sistema responde según el caso: (decision: Aprobada, motivo: (vacío) → «Decisión registrada correctamente.»); (decision: Rechazada, motivo: Sin disponibilidad en la categoría → «Decisión registrada correctamente.»); (decision: Rechazada, motivo: (vacío) → «El motivo del rechazo es obligatorio.»); (decision: (vacía), motivo: (vacío) → «La decisión es obligatoria.»); (decision: Pendiente, motivo: (vacío) → «La decisión no es válida.»). Vuelve al paso 2. | *ES el CA-3 · Valida RN-AP02b (RF-81); valores de Decision: restricción del diccionario (ENUM; RF-16)* |
| **Flujo alternativo 4a** | Longitud máxima del motivo del rechazo aceptada y superada: El sistema responde según el caso: (valor: texto de 300 caracteres, longitud: 300, máximo: 300 → «Decisión registrada correctamente.»); (valor: texto de 301 caracteres, longitud: 301, máximo: 300 → «El motivo del rechazo no puede superar 300 caracteres.»). Vuelve al paso 2. | *ES el CA-4 · Valida la restricción del diccionario (longitud; RF-16)* |
| **Flujo alternativo 5a** | Solicitud que ya tiene decisión: El sistema responde «La solicitud ya tiene una decisión.»; la decisión existente no cambia. Según el caso: (id: 2, decisión existente: Aprobada); (id: 3, decisión existente: Rechazada). Vuelve al paso 2. | *ES el CA-5 · Valida RN-AP06a (RF-82)* |
| **Flujo alternativo 6a** | Solicitud inexistente o no pendiente: El sistema responde según el caso; no se registra ninguna decisión: (id: 99, no existe → «La solicitud no existe.»); (id: 4, Cancelada → «Solo se puede decidir sobre una solicitud pendiente.»). Vuelve al paso 2. | *ES el CA-6 · Valida RN-AP09 y RN-AP06a (RF-82); existencia: restricción del diccionario (FK; RF-16)* |
| **Flujo alternativo 7a** | Aprobador inexistente, inactivo, sin rol Aprobador o distinto del usuario en sesión: El sistema responde según el caso; no se registra ninguna decisión: (aprobador: 99, no existe → «El usuario no existe.»); (aprobador: 12, inactivo → «El usuario está inactivo.»); (aprobador: 7, rol Empleado → «El usuario no tiene el rol Aprobador.»); (aprobador: 13, otro Aprobador activo, distinto del usuario en sesión (9) → «El aprobador debe ser el usuario con sesión iniciada.»). Vuelve al paso 2. | *ES el CA-7 · Valida RN-AP11a (RF-83), RN-AP12a (RF-84) y RF-169; la condición «sin rol Aprobador» la mide RNF-01 (RF-166)* |
| **Poscondición** | La decisión queda guardada con: ID_Aprobacion = (automático), ID_Solicitud = 1, ID_Aprobador = 9, Decision = Aprobada, Motivo_Rechazo = (vacío), Fecha_Decision = (fecha y hora actuales); la solicitud 1 pasa a estado Aprobada. | *Entonces y Y del CA-1* |
| **Requisitos y reglas** | **RF:** RF-16, RF-81, RF-82, RF-83, RF-84, RF-86, RF-169. **RN:** RN-AP02b, RN-AP06a, RN-AP09, RN-AP11a, RN-AP12a (ancla de 1.7.3). **RNF:** RNF-01 (RF-166; CA-7), RNF-02. **Mensajes:** M-39, M-40, M-74, M-82, M-83, M-84, M-85, M-86, M-87, M-88, M-89, M-273. | *Documentos de RF, RN y RNF; catálogo de mensajes M-01 a M-273* |
 
*Fuente: elaboración propia a partir de la HU-13, del documento de RF, del documento de RN y de los RNF.*
 
## **2.4.6 CU-15 Asignar equipo a una solicitud aprobada**
 
**Tabla 24. CU-15 Asignar equipo a una solicitud aprobada**
 
| **CU-15** | **Asignar equipo a una solicitud aprobada** | **Procedencia** |
| --- | --- | --- |
| **Actor** | Responsable de Activos | *Historia de la HU-15* |
| **Precondición** | El Responsable de Activos ha iniciado sesión (RNF-02). Su rol tiene permitida esta operación según la matriz rol–operación (Anexo C del documento de RN, pendiente de validar con el cliente; RNF-01, implementado por RF-166; Anexo C: permiso genérico Asignar). La fecha actual es 2026-10-06. Existe la solicitud 6 (categoría 1, custodio 3, Aprobada, sin asignación) y el activo 1 (HP ProBook 450 G8, placa NEX-000101, categoría 1, Disponible). | *Antecedentes de la HU-15 y «Dado» del CA-1; RNF-02 (sesión); RNF-01 y RF-166 (autoridad)* |
| **Flujo básico (Evento / Respuesta)** | **1. **El Responsable de Activos solicita asignar equipo a una solicitud aprobada. / El sistema presenta el formulario. **2. **El Responsable de Activos registra la asignación con los datos: ID_Solicitud = 6, ID_Activo = 1, Fecha_Devolucion_Esperada = 2026-12-04. / El sistema recibe los datos. **3. **— / El sistema verifica «Datos obligatorios vacíos» (restricción del diccionario). **4. **— / El sistema verifica «Solicitud inexistente o no aprobada» (RN-AS04). **5. **— / El sistema verifica «Solicitud que ya tiene una asignación» (RN-AS05a). **6. **— / El sistema verifica «Activo inexistente o no disponible» (RN-AS07a). **7. **— / El sistema verifica «Categoría del activo distinta de la de la solicitud» (RN-AS08). **8. **— / El sistema verifica «Fecha de devolución esperada anterior a la fecha de entrega» (restricción del diccionario; RF-18). **9. **— / El sistema responde «Equipo asignado correctamente.»; la asignación queda guardada con: ID_Asignacion = (automático), Fecha_Entrega = 2026-10-06, Fecha_Devolucion_Esperada = 2026-12-04, Estado_Asignacion = Vigente, ID_Custodio = 3, ID_Activo = 1, ID_Solicitud = 6; ID_Asignacion, Fecha_Entrega y Estado_Asignacion los asignó el sistema e ID_Custodio se copió de la solicitud 6; el activo 1 pasa a Estado Asignado y conserva sus demás datos: ID_Activo = 1, Marca = HP, Modelo = ProBook 450 G8, Numero_Serie = 5CD2171NQ7, Placa_Inventario = NEX-000101, Estado = Asignado, Ubicacion = Bodega principal, ID_Categoria = 1; la solicitud 6 conserva Estado_Solicitud Aprobada. | *ES el CA-1 (RF-18, RF-91)* *Paso 3: restricción del diccionario (RF-18)* *Paso 4: RF-87* *Paso 5: RF-88* *Paso 6: RF-89 (RN-AS07a, ancla de 1.7.3)* *Paso 7: RF-90* *Paso 8: coherencia entre fechas; la nombra RF-18* *Paso 9: el activo queda Asignado, RF-91* |
| **Flujo alternativo 3a** | Datos obligatorios vacíos: El sistema responde según el caso; no se crea la asignación: (ID_Solicitud → «La solicitud es obligatoria.»); (ID_Activo → «El activo es obligatorio.»); (Fecha_Devolucion_Esperada → «La fecha de devolución esperada es obligatoria.»). Vuelve al paso 2. | *ES el CA-2 · Valida la restricción del diccionario (NO NULO; RF-18)* |
| **Flujo alternativo 4a** | Solicitud inexistente o no aprobada: El sistema responde según el caso; no se crea la asignación y el activo 1 conserva Estado Disponible: (id: 99, no existe → «La solicitud no existe.»); (id: 1, Pendiente → «Solo se puede asignar una solicitud aprobada.»); (id: 3, Rechazada → «Solo se puede asignar una solicitud aprobada.»); (id: 4, Cancelada → «Solo se puede asignar una solicitud aprobada.»). Vuelve al paso 2. | *ES el CA-3 · Valida RN-AS04 (RF-87); existencia: RF-18* |
| **Flujo alternativo 5a** | Solicitud que ya tiene una asignación: El sistema responde «La solicitud ya tiene una asignación.»; no se crea otra asignación y el activo 1 conserva Estado Disponible. Vuelve al paso 2. | *ES el CA-4 · Valida RN-AS05a (RF-88)* |
| **Flujo alternativo 6a** | Activo inexistente o no disponible: El sistema responde según el caso; no se crea la asignación y el activo conserva su estado: (id: 99, no existe → «El activo no existe.»); (id: 2, Asignado → «El activo no está disponible.»); (id: 8, Dañado → «El activo no está disponible.»); (id: 9, Baja → «El activo no está disponible.»). Vuelve al paso 2. | *ES el CA-5 · Valida RN-AS07a (RF-89); existencia: RF-18* |
| **Flujo alternativo 7a** | Categoría del activo distinta de la de la solicitud: El sistema responde «La categoría del activo no coincide con la de la solicitud.»; no se crea la asignación y el activo 10 conserva Estado Disponible. Vuelve al paso 2. | *ES el CA-6 · Valida RN-AS08 (RF-90)* |
| **Flujo alternativo 8a** | Fecha de devolución esperada anterior a la fecha de entrega: El sistema responde «La fecha de devolución esperada no puede ser anterior a la fecha de entrega.»; no se crea la asignación. Vuelve al paso 2. | *ES el CA-7 · Es una especificación del RF-18, que enuncia la validación; la regla preliminar RN-AS09 es una restricción del diccionario (coherencia entre fechas), no una ficha de RN* |
| **Poscondición** | La asignación queda guardada con: ID_Asignacion = (automático), Fecha_Entrega = 2026-10-06, Fecha_Devolucion_Esperada = 2026-12-04, Estado_Asignacion = Vigente, ID_Custodio = 3, ID_Activo = 1, ID_Solicitud = 6; ID_Asignacion, Fecha_Entrega y Estado_Asignacion los asignó el sistema e ID_Custodio se copió de la solicitud 6; el activo 1 pasa a Estado Asignado y conserva sus demás datos: ID_Activo = 1, Marca = HP, Modelo = ProBook 450 G8, Numero_Serie = 5CD2171NQ7, Placa_Inventario = NEX-000101, Estado = Asignado, Ubicacion = Bodega principal, ID_Categoria = 1; la solicitud 6 conserva Estado_Solicitud Aprobada. La asignación queda registrada en la auditoría con la acción Asignar (RF-161, RN-T02a; decisión T-2 provisional). | *Entonces y Y del CA-1; la auditoría: RF-161* |
| **Requisitos y reglas** | **RF:** RF-18, RF-87, RF-88, RF-89, RF-90, RF-91, RF-161. **RN:** RN-AS04, RN-AS05a, RN-AS07a (ancla de 1.7.3), RN-AS08, RN-T02a. **RNF:** RNF-01 (RF-166), RNF-02. **Mensajes:** M-21, M-74, M-93, M-94, M-95, M-96, M-97, M-98, M-99, M-100, M-101. Rechazo por rol: RNF-01, RF-166 y PV-01; mensaje propuesto en 2.4.2, pendiente de validar con el cliente. | *Documentos de RF, RN y RNF; catálogo de mensajes M-01 a M-273* |
 
*Fuente: elaboración propia a partir de la HU-15, del documento de RF, del documento de RN y de los RNF.*
 
## **2.4.7 CU-19 Firmar acta de entrega**
 
**Tabla 25. CU-19 Firmar acta de entrega**
 
| **CU-19** | **Firmar acta de entrega** | **Procedencia** |
| --- | --- | --- |
| **Actor** | Empleado | *Historia de la HU-19* |
| **Precondición** | El Empleado ha iniciado sesión (RNF-02). Su rol tiene permitida esta operación según la matriz rol–operación (Anexo C del documento de RN, pendiente de validar con el cliente; RNF-01, implementado por RF-166; P-75). Existe la asignación 1 Vigente del custodio 3 del Empleado y no tiene acta. | *Antecedentes de la HU-19 y «Dado» del CA-1; RNF-02 (sesión); RNF-01 y RF-166 (autoridad)* |
| **Flujo básico (Evento / Respuesta)** | **1. **El Empleado solicita firmar acta de entrega. / El sistema presenta el formulario. **2. **El Empleado firma el acta con los datos: ID_Asignacion = 1, Ruta_Acta = actas/asignacion-0001.pdf, Firma_Digital = CODIGO-EJEMPLO-0001. / El sistema recibe los datos. **3. **— / El sistema verifica «Datos obligatorios vacíos» (restricción del diccionario). **4. **— / El sistema verifica «Longitud máxima aceptada y superada» (restricción del diccionario). **5. **— / El sistema verifica «Asignación inexistente o no vigente» (RN-AC05). **6. **— / El sistema verifica «Asignación que ya tiene un acta» (RN-AC06a). **7. **— / El sistema verifica «Solo el custodio de la asignación firma su acta» (RN-AC07b, RN-AC07a). **8. **— / El sistema responde «Acta firmada correctamente.»; el acta queda guardada con: ID_Acta = (automático), ID_Asignacion = 1, Fecha_Firma = (fecha y hora actuales), Ruta_Acta = actas/asignacion-0001.pdf, Firma_Digital = CODIGO-EJEMPLO-0001; ID_Acta y Fecha_Firma los asignó el sistema; la asignación 1 conserva Estado_Asignacion Vigente. | *ES el CA-1 (RF-22, RF-102)* *Pasos 3 y 4: restricciones del diccionario (RF-22)* *Paso 5: RF-104; la existencia, RF-22* *Paso 6: RF-105* *Paso 7: RF-103 y RF-102 (RN-AC07a, ancla de 1.7.3)* |
| **Flujo alternativo 3a** | Datos obligatorios vacíos: El sistema responde según el caso; no se crea el acta: (ID_Asignacion → «La asignación es obligatoria.»); (Ruta_Acta → «La ruta del acta es obligatoria.»); (Firma_Digital → «La firma digital es obligatoria.»). Vuelve al paso 2. | *ES el CA-2 · Valida la restricción del diccionario (NO NULO; RF-22)* |
| **Flujo alternativo 4a** | Longitud máxima aceptada y superada: El sistema responde según el caso: (Ruta_Acta, valor: texto de 255 caracteres, longitud: 255, máximo: 255 → «Acta firmada correctamente.»); (Ruta_Acta, valor: texto de 256 caracteres, longitud: 256, máximo: 255 → «La ruta del acta no puede superar 255 caracteres.»); (Firma_Digital, valor: texto de 255 caracteres, longitud: 255, máximo: 255 → «Acta firmada correctamente.»); (Firma_Digital, valor: texto de 256 caracteres, longitud: 256, máximo: 255 → «La firma digital no puede superar 255 caracteres.»). Vuelve al paso 2. | *ES el CA-3 · Valida la restricción del diccionario (longitud; RF-22)* |
| **Flujo alternativo 5a** | Asignación inexistente o no vigente: El sistema responde según el caso; no se crea el acta: (id: 99, no existe → «La asignación no existe.»); (id: 3, Cerrada → «Solo se puede firmar el acta de una asignación vigente.»). Vuelve al paso 2. | *ES el CA-4 · Valida RN-AC05 (RF-104); existencia: RF-22* |
| **Flujo alternativo 6a** | Asignación que ya tiene un acta: El sistema responde «La asignación ya tiene un acta.»; no se crea otra acta y el acta 1 conserva sus datos. Vuelve al paso 2. | *ES el CA-5 · Valida RN-AC06a (RF-105)* |
| **Flujo alternativo 7a** | Solo el custodio de la asignación firma su acta: El sistema responde «Solo el custodio de la asignación puede firmar su acta.»; no se crea el acta. Vuelve al paso 2. | *ES el CA-6 · Valida RN-AC07b (RF-103) y RN-AC07a (RF-102; ancla de 1.7.3)* |
| **Poscondición** | El acta queda guardada con: ID_Acta = (automático), ID_Asignacion = 1, Fecha_Firma = (fecha y hora actuales), Ruta_Acta = actas/asignacion-0001.pdf, Firma_Digital = CODIGO-EJEMPLO-0001; ID_Acta y Fecha_Firma los asignó el sistema; la asignación 1 conserva Estado_Asignacion Vigente. | *Entonces y Y del CA-1* |
| **Requisitos y reglas** | **RF:** RF-22, RF-102, RF-103, RF-104, RF-105. **RN:** RN-AC05, RN-AC06a, RN-AC07a (ancla de 1.7.3), RN-AC07b. **RNF:** RNF-01 (RF-166), RNF-02. **Mensajes:** M-108, M-121, M-122, M-123, M-124, M-125, M-126, M-127, M-128, M-129. Rechazo por rol: RNF-01, RF-166 y PV-01; mensaje propuesto en 2.4.2, pendiente de validar con el cliente. | *Documentos de RF, RN y RNF; catálogo de mensajes M-01 a M-273* |
 
*Fuente: elaboración propia a partir de la HU-19, del documento de RF, del documento de RN y de los RNF.*
 
## **2.4.8 CU-24 Confirmar recepción de una devolución**
 
**Tabla 26. CU-24 Confirmar recepción de una devolución**
 
| **CU-24** | **Confirmar recepción de una devolución** | **Procedencia** |
| --- | --- | --- |
| **Actor** | Responsable de Activos | *Historia de la HU-24* |
| **Precondición** | El Responsable de Activos ha iniciado sesión (RNF-02). Su rol tiene permitida esta operación según la matriz rol–operación (Anexo C del documento de RN, pendiente de validar con el cliente; RNF-01, implementado por RF-166; Anexo C: sin permiso genérico equivalente, el más cercano es Devolver). La fecha actual es 2026-10-06 y el Responsable de Activos es el usuario 2. Existe la devolución 1 (Pendiente) de la asignación 1, que está Vigente, y el activo 5 (placa NEX-000105) está en Estado Asignado. | *Antecedentes de la HU-24 y «Dado» del CA-1; RNF-02 (sesión); RNF-01 y RF-166 (autoridad)* |
| **Flujo básico (Evento / Respuesta)** | **1. **El Responsable de Activos solicita confirmar recepción de una devolución. / El sistema presenta el formulario. **2. **El Responsable de Activos solicita confirmar la recepción de la devolución 1. / El sistema recibe los datos. **3. **— / El sistema verifica «Devolución ya confirmada» (RN-D11b). **4. **— / El sistema verifica «Devolución inexistente» (RF-27). **5. **— / El sistema verifica «Receptor inexistente, inactivo o sin el rol Responsable de Activos»; el receptor es el usuario en sesión (RN-D14b). **6. **— / El sistema muestra el aviso «La recepción de la devolución 1 quedará Confirmada, la asignación 1 pasará a estado Cerrada y el activo NEX-000105 quedará Disponible, salvo que esté Dañado. La confirmación no se puede deshacer. ¿Desea continuar?» **7. **El Responsable de Activos confirma la recepción. / El sistema ejecuta el caso de uso incluido CU-47 «Cerrar la asignación» («include», RF-117) y responde «Recepción confirmada correctamente.»; la devolución 1 queda con: ID_Devolucion = 1, Fecha_Devolucion = 2026-10-05 16:40, Observaciones = Con cargador y funda, ID_Asignacion = 1, Estado_Recepcion = Confirmada, Fecha_Confirmacion = (fecha y hora actuales), ID_Receptor = 2; Fecha_Confirmacion la asignó el sistema e ID_Receptor es el usuario en sesión (2), que no se digitó; ID_Devolucion, Fecha_Devolucion, Observaciones e ID_Asignacion conservan su valor; la asignación 1 queda con Estado_Asignacion Cerrada y el activo 5 pasa a Estado Disponible. | *ES el CA-1 (RF-27, RF-117, RF-118, RF-170)* *Paso 3: RF-115* *Paso 4: RF-27* *Paso 5: RF-116 y RF-170; el rol, RNF-01 (RF-166)* *Paso 6: RF-118* *Paso 7: «include» CU-47 (RF-117); la solicitud de cierre solo procede con una devolución confirmada (RN-AS14)* |
| **Flujo alternativo 3a** | Devolución ya confirmada: El sistema responde «La devolución ya está confirmada.»; no muestra el aviso de confirmación y la devolución 3 no cambia. Vuelve al paso 2. | *ES el CA-4 · Valida RN-D11b (RF-115)* |
| **Flujo alternativo 4a** | Devolución inexistente: El sistema responde «La devolución no existe.» Vuelve al paso 2. | *ES el CA-5 · Especificación del RF-27, que enuncia informar cuando la devolución no exista* |
| **Flujo alternativo 5a** | Receptor inexistente, inactivo o sin el rol Responsable de Activos: El sistema responde según el caso; la devolución 1 conserva Estado_Recepcion Pendiente y la asignación 1 conserva Estado_Asignacion Vigente: (receptor: 99, no existe → «El usuario no existe.»); (receptor: 11, inactivo → «El usuario está inactivo.»); (receptor: 7, sin el rol (Empleado) → «El usuario no tiene el rol Responsable de Activos.»); (receptor: 9, sin el rol (Aprobador) → «El usuario no tiene el rol Responsable de Activos.»); (receptor: 5, sin el rol (Gerente) → «El usuario no tiene el rol Responsable de Activos.»). Vuelve al paso 2. | *ES el CA-6 · Valida RN-D14b (RF-116) y RF-170; la condición «sin el rol Responsable de Activos» la mide RNF-01 (RF-166); existencia del receptor: RF-27* |
| **Flujo alternativo 7a** | Desistir de la confirmación: El sistema muestra el aviso «La recepción de la devolución 1 quedará Confirmada, la asignación 1 pasará a estado Cerrada y el activo NEX-000105 quedará Disponible, salvo que esté Dañado. La confirmación no se puede deshacer. ¿Desea continuar?»; el sistema responde «Se desistió de confirmar la recepción. La devolución no fue modificada.»; la devolución 1 conserva Estado_Recepcion Pendiente, con Fecha_Confirmacion e ID_Receptor vacíos, la asignación 1 conserva Estado_Asignacion Vigente y el activo 5 conserva Estado Asignado. El caso de uso termina sin cambios. | *ES el CA-3 · Valida RF-118* |
| **Flujo alternativo 7b** | Confirmar la recepción de un activo Dañado: El sistema responde «Recepción confirmada correctamente.»; la devolución 1 queda con Estado_Recepcion Confirmada y la asignación 1 con Estado_Asignacion Cerrada; el activo 5 conserva Estado Dañado (no es una transición). El caso de uso termina. | *ES el CA-2 · Valida RF-117 (cierre con los mismos efectos que el cierre directo) · «include» CU-47; el activo Dañado conserva su estado según CRF-003* |
| **Flujo alternativo 7c** | Flujo normal: la confirmación deja la asignación Cerrada y el activo Disponible: El Responsable de Activos ve la asignación con Estado_Asignacion Cerrada y sus demás datos intactos; el activo 5 está en Estado Disponible y la asignación 1 ya no figura entre las asignaciones vigentes; al consultar la asignación vigente del activo 5, el sistema responde «El activo no tiene una asignación vigente.»; no hace falta cerrar la asignación por separado: si solicita cerrar la asignación 1 (HU-18), el sistema responde «La asignación ya está cerrada.» Vuelve al paso 2. | *ES el CA-7 · Valida RF-117 y RN-AS14 · «include» CU-47* |
| **Poscondición** | La devolución 1 queda con: ID_Devolucion = 1, Fecha_Devolucion = 2026-10-05 16:40, Observaciones = Con cargador y funda, ID_Asignacion = 1, Estado_Recepcion = Confirmada, Fecha_Confirmacion = (fecha y hora actuales), ID_Receptor = 2; Fecha_Confirmacion la asignó el sistema e ID_Receptor es el usuario en sesión (2), que no se digitó; ID_Devolucion, Fecha_Devolucion, Observaciones e ID_Asignacion conservan su valor; la asignación 1 queda con Estado_Asignacion Cerrada y el activo 5 pasa a Estado Disponible. La confirmación queda registrada en la auditoría con la acción Devolver (RF-163, RN-T02a; ambigüedad en P-89). | *Entonces y Y del CA-1; la auditoría: RF-163* |
| **Requisitos y reglas** | **RF:** RF-27, RF-115, RF-116, RF-117, RF-118, RF-163, RF-170. **RN:** RN-D11b, RN-D14b, RN-AS14 (aplicada por el cierre incluido), RN-T02a. **RNF:** RNF-01 (RF-166; CA-6), RNF-02. **Mensajes:** M-39, M-40, M-105, M-120, M-141, M-150, M-151, M-152, M-153, M-154. | *Documentos de RF, RN y RNF; catálogo de mensajes M-01 a M-273* |
 
*Fuente: elaboración propia a partir de la HU-24, del documento de RF, del documento de RN y de los RNF.*
 
## **2.4.9 Cadena de trazabilidad de los casos de uso documentados**
 
Cada fila recorre la cadena historia → criterios de aceptación → requisitos funcionales → reglas de negocio → requisitos no funcionales → casos de uso (pasos y flujos) → mensajes. La columna «Método → Pantalla» lista los métodos de la clase de cada historia según el diagrama de clases v6; la pantalla queda pendiente hasta contar con los mockups (2.5).
 
**Tabla 27. Cadena de trazabilidad de los seis casos de uso documentados**
 
| **HU / CU** | **CA** | **RF (cada uno con su HU)** | **RN (fichas) y destino de las demás** | **RNF** | **CU: pasos y flujos** | **Mensajes** | **Método → Pantalla** |
| --- | --- | --- | --- | --- | --- | --- | --- |
| **HU-01 CU-01** | CA-1 a CA-6 | RF-01, RF-02, RF-52 | RN-A03, RN-A04 (CA-3), RN-A09 (CA-6); A01, A02, A05, A06, A08: restricciones del diccionario | RNF-01, RNF-02 | CA-1: pasos 1 a 7; CA-2: 2a; CA-3: 5a (CU-49); CA-4: 3a; CA-5: 4a; CA-6: 6a (CU-48) | M-01 a M-15 | crear(), existeNumeroSerie(), existePlaca() → pantalla pendiente (mockups) |
| **HU-09 CU-09** | CA-1 a CA-5 | RF-11, RF-68, RF-69, RF-70, RF-71, RF-168 | RN-S07 (CA-4), RN-S09, RN-S10b, RN-S19 (CA-5); S01 a S04, S06, S08: restricciones del diccionario | RNF-01, RNF-02 | CA-1: pasos 1 a 7; CA-2: 3a; CA-3: 4a; CA-4: 5a (CU-48); CA-5: 6a | M-07, M-08, M-09, M-50, M-60 a M-65, M-272 | crear() → pantalla pendiente (mockups) |
| **HU-13 CU-13** | CA-1 a CA-7 | RF-16, RF-81, RF-82, RF-83, RF-84, RF-86, RF-169 | RN-AP02b (CA-2, CA-3), RN-AP06a (CA-5, CA-6), RN-AP09, RN-AP11a, RN-AP12a (CA-7); AP01, AP03 a AP05, AP08, AP10: restricciones del diccionario; AP07: RF-86 | RNF-01 (CA-7), RNF-02 | CA-1: pasos 1 a 8; CA-2: 2a; CA-3: 3a; CA-4: 4a; CA-5: 5a; CA-6: 6a; CA-7: 7a | M-39, M-40, M-74, M-82 a M-89, M-273 | decidir(), existeDecisionDeSolicitud() → pantalla pendiente (mockups) |
| **HU-15 CU-15** | CA-1 a CA-7 | RF-18, RF-87, RF-88, RF-89, RF-90, RF-91, RF-161 | RN-AS04 (CA-3), RN-AS05a (CA-4), RN-AS07a (CA-5), RN-AS08 (CA-6), RN-T02a; AS01 a AS03, AS06, AS09, AS10: restricciones del diccionario; AS11: RF-91 | RNF-01, RNF-02 | CA-1: pasos 1 a 9; CA-2: 3a; CA-3: 4a; CA-4: 5a; CA-5: 6a; CA-6: 7a; CA-7: 8a (especificación del RF-18) | M-21, M-74, M-93 a M-101 | asignar(), existeAsignacionDeSolicitud(), activoDisponible() → pantalla pendiente (mockups) |
| **HU-19 CU-19** | CA-1 a CA-6 | RF-22, RF-102, RF-103, RF-104, RF-105 | RN-AC05 (CA-4), RN-AC06a (CA-5), RN-AC07a y RN-AC07b (CA-6); AC01 a AC04: restricciones del diccionario; AC08: requisito no funcional candidato | RNF-01, RNF-02 | CA-1: pasos 1 a 8; CA-2: 3a; CA-3: 4a; CA-4: 5a; CA-5: 6a; CA-6: 7a | M-108, M-121 a M-129 | firmar(), existeActaDeAsignacion() → pantalla pendiente (mockups) |
| **HU-24 CU-24** | CA-1 a CA-7 | RF-27, RF-115, RF-116, RF-117, RF-118, RF-163, RF-170 | RN-D11b (CA-4), RN-D14b (CA-6), RN-AS14 (CA-7), RN-T02a; D09: restricción del diccionario; D13, D15, D18: RF-27 y RF-117; D16: RF-118; D17: fusionada en RN-D11b | RNF-01 (CA-6), RNF-02 | CA-1: pasos 1 a 7 (CU-47); CA-2: 7b; CA-3: 7a; CA-4: 3a; CA-5: 4a; CA-6: 5a; CA-7: 7c (CU-47) | M-39, M-40, M-105, M-120, M-141, M-150 a M-154 | confirmarRecepcion() → pantalla pendiente (mockups) |
 
*Fuente: elaboración propia a partir de las historias de usuario, del documento de RF (Tabla de cobertura), del documento de RN (Anexo A) y del documento de RNF.*
 
## **2.4.10 Preguntas abiertas citadas**
 
Las preguntas siguientes se citan en los casos de uso documentados y permanecen abiertas.
 
**Tabla 28. Preguntas abiertas citadas en los casos de uso**
 
| **Pregunta** | **Asunto** | **Citada en** |
| --- | --- | --- |
| **P-75** | Matriz rol–operación (Anexo C del documento de RN); condiciona RNF-01 y RF-166 | Precondición de CU-01, CU-09, CU-13 y CU-19; sección 2.4.2 |
| **P-77** | Matriz rol–operación (Anexo C del documento de RN); condiciona RNF-01 y RF-166 | Sección 2.4.2; aplica a los seis CU |
| **P-100** | Condición adicional de RF-166 | Sección 2.4.2; aplica a los seis CU |
| **P-RP1** | Permiso para aprobar y rechazar (el rechazo no tiene permiso propio) | CU-13 |
| **P-70** | Vencimiento de la sesión, sin medida definida (RNF-02) | Sección 2.4.2; aplica a los seis CU |
| **P-89** | Qué operaciones se auditan: el alta del activo no se audita y la auditoría de la devolución es ambigua | CU-01, CU-24 |
| **P-88** | Funciones del Gerente (actor supuesto) | Actores (Tabla 1) |
| **P-31, MOD-09** | Cambio de responsable sin operación en el modelo | 2.3.5 |
 
*Fuente: documento de listas acumuladas, documento de RF y documento de RN.*
 
NexaActivos — Casos de uso (2.3 y 2.4) · Página 
 
NexaActivos — Casos de uso (2.3 y 2.4) · Página 
 
NexaActivos — Casos de uso (2.3 y 2.4) · Página 
 
NexaActivos — Casos de uso (2.3 y 2.4) · Página
