**Sistema de Gestión de Activos (NexaActivos)**
 
**Sección 2.2: Requisitos funcionales**
 
Fase de RF: 172 requisitos funcionales, trazabilidad y anexo de notas
 
# **2.2.6 Requisitos funcionales**
 
## **2.2.6.1 Introducción**
 
Un requisito funcional (RF) enuncia una acción que el sistema debe ejecutar y que se puede verificar. La definición oficial de la ficha es «El sistema debe [acción verificable]. (Origen: HU-YY)»: cada RF enuncia una sola acción y cita una sola HU de origen. Los 172 RF (RF-01 a RF-172) se numeran de forma continua, sin saltos ni duplicados; el siguiente código libre es RF-173. Los RF-01 a RF-50 se conservan, reescritos en el formato oficial, y los RF-51 a RF-172 son nuevos.
 
**Criterios vigentes. **Atomicidad: un RF, una acción y una HU de origen; por eso se partieron RF-02, RF-07, RF-13 y RF-36. Restricciones del diccionario: el NO NULO, la longitud, el tipo, el ENUM, el formato y la existencia de FK permanecen en el diccionario y los RF las toman por referencia. Propiedad: las restricciones de propiedad («solo el dueño accede a lo suyo») se enuncian en RF propios (2.2.6.7). Auditoría, control de acceso y sesión: se enuncian una sola vez, en los RF transversales RF-160 a RF-172 (2.2.6.8), y no se repiten en cada operación. Eliminación lógica: toda eliminación es lógica (R4); la excepción del retiro de un permiso se redacta por su resultado en RF-43 y su tensión con esa regla queda en HAL-100, P-78 y MOD-35. Honestidad: lo que el cliente no dictó se marca «propuesta del equipo, pendiente de validar».
 
**Estado de validación. **Hay 0 RN y 0 RF validados por el cliente: las 172 fichas de RF y las 59 fichas de RN son propuesta del equipo, pendientes de validar. Las condiciones que dependen de una decisión abierta se indican en cada ficha de trabajo (Anexo RF-A) y en 2.2.6.9.
 
**Organización. **El apartado 2.2.6.2 presenta el resumen numérico; el 2.2.6.3, el criterio de prioridad; el 2.2.6.4, las fichas de RF por bloque con los seis campos oficiales (Código, Nombre corto, Descripción, HU de origen, RN que hace cumplir y Prioridad); el 2.2.6.5, la cobertura de las 46 HU; el 2.2.6.6, la trazabilidad RF → RN; el 2.2.6.7, las anclas de 1.7.3 y la propiedad; el 2.2.6.8, la auditoría, el control de acceso y la sesión; y el 2.2.6.9, las decisiones abiertas. El Anexo RF-A reúne las notas de trazabilidad de cada RF. Las fichas de RN y la matriz rol–operación están en el documento de reglas de negocio (Anexo C) y los RNF candidatos, en las listas acumuladas.
 
## **2.2.6.2 Resumen numérico**
 
La primera tabla presenta los totales de la fase de RF y la segunda, el desglose por bloque y prioridad. Todas las cifras se calculan desde las fichas aprobadas del archivo de estado.
 
**Tabla 50. Totales de la fase de RF**
 
| **Concepto** | **Cantidad** |
| --- | --- |
| Total de RF | 172 (RF-01 a RF-172) |
| RF reescritos en formato oficial (RF-01 a RF-50) | 50 |
| RF nuevos (RF-51 a RF-172) | 122 |
| Prioridad Alta | 11 |
| Prioridad Media | 123 |
| Prioridad Baja | 38 |
| HU cubiertas | 46 de 46 (HU-01 a HU-46) |
| Fichas de RN vigiladas por al menos un RF | 59 de 59 (RN-T02a condicionada a T-2) |
| Fichas de RN sin RF | 0 |
| RF que hacen cumplir una ficha de RN | 88 |
| RF sin ficha de RN asociada (ninguna) | 84 |
| RN validadas por el cliente | 0 |
| RF validados por el cliente | 0 |
 
*Fuente: elaboración propia a partir de las fichas de RF aprobadas del archivo de estado y de las 59 fichas de RN del documento de reglas de negocio.*
 
**Tabla 51. Requisitos funcionales por bloque y prioridad**
 
| **Bloque** | **RF** | **Alta** | **Media** | **Baja** |
| --- | --- | --- | --- | --- |
| B0 Activo (15 RF) | 15 | 2 | 11 | 2 |
| B1 Custodio (12 RF) | 12 | 0 | 11 | 1 |
| B2 Solicitud + Aprobación (26 RF) | 26 | 4 | 15 | 7 |
| B4a Asignación + Acta (26 RF) | 26 | 4 | 14 | 8 |
| B4b Devolución + Notificación (20 RF) | 20 | 0 | 17 | 3 |
| B5 Reporte de daños + Mantenimiento (21 RF) | 21 | 0 | 16 | 5 |
| B6a Usuario (16 RF) | 16 | 0 | 15 | 1 |
| B6b Rol_Permiso + Categoría (16 RF) | 16 | 0 | 13 | 3 |
| B7 Auditoría + Reportes (7 RF) | 7 | 0 | 0 | 7 |
| Transversales (13 RF) | 13 | 1 | 11 | 1 |
| Total | 172 | 11 | 123 | 38 |
 
*Fuente: elaboración propia a partir de las fichas de RF aprobadas del archivo de estado.*
 
## **2.2.6.3 Criterio de prioridad (propuesta del equipo)**
 
Alta = el RF ejecuta un paso del corte vertical solicitud→aprobación→asignación o hace cumplir una ancla de 1.7.3, o es el mecanismo que sostiene una ancla de 1.7.3 (RF-169). Media = completa el ciclo de vida o mantiene datos maestros (custodio, categoría, usuario, rol-permiso, devolución, notificación, acta, daños, mantenimiento) y las validaciones que protegen un paso del corte, aunque sean precondición del corte, además del registro de auditoría de acciones, el control de acceso por rol y la identificación del actor por sesión. Baja = consultas de apoyo, reportes y consulta de auditoría, incluidas las restricciones de propiedad sobre consultas.
 
## **2.2.6.4 Fichas de RF por bloque**
 
Cada bloque presenta una tabla con los seis campos oficiales de la ficha. La columna de notas de trabajo y el criterio de cada prioridad no forman parte de la ficha oficial y están en el Anexo RF-A. Todas las fichas son propuesta del equipo, pendientes de validar con el cliente.
 
### **2.2.6.4.1 B0 Activo (15 RF)**
 
**Tabla 52. Fichas de RF del bloque B0 Activo (15 RF)**
 
| **Código** | **Nombre corto** | **Descripción** | **HU de origen** | **RN que hace cumplir** | **Prioridad** |
| --- | --- | --- | --- | --- | --- |
| RF-01 | Registrar activo | El sistema debe registrar un activo con marca, modelo, número de serie, placa de inventario, categoría y, opcionalmente, ubicación, asignándole un identificador único generado por el sistema y el estado inicial Disponible, y validar los datos obligatorios, las longitudes y la existencia de la categoría según el diccionario. | HU-01 | ninguna | Media |
| RF-02 | Verificar unicidad al registrar | El sistema debe rechazar el registro de un activo cuyo número de serie o cuya placa de inventario ya pertenezca a un activo ya registrado, incluidos los activos dados de baja. | HU-01 | RN-A03, RN-A04 | Alta |
| RF-03 | Consultar activo por clave | El sistema debe consultar un activo, de cualquier estado, por su identificador, su número de serie o su placa de inventario, devolviendo todos sus datos sin modificarlo, e informar cuando no exista un activo con la clave indicada. | HU-02 | ninguna | Baja |
| RF-04 | Actualizar activo | El sistema debe actualizar la marca, el modelo, el número de serie, la placa de inventario, la ubicación (que puede quedar vacía), la categoría y el estado de un activo existente, sin permitir modificar su identificador, y validar los datos obligatorios, las longitudes y los valores permitidos según el diccionario; si el activo no existe, debe informarlo. | HU-03 | ninguna | Media |
| RF-05 | Dar de baja activo | El sistema debe dar de baja un activo cambiando su estado a Baja y conservando el registro y todos sus demás datos, e informar cuando el activo no exista. | HU-04 | RN-A16b | Media |
| RF-51 | Verificar unicidad al actualizar | El sistema debe rechazar la actualización de un activo cuyo nuevo número de serie o nueva placa de inventario ya pertenezca a otro activo, incluidos los dados de baja, sin contar como duplicado al propio activo que se actualiza. | HU-03 | RN-A03, RN-A04 | Alta |
| RF-52 | Validar categoría activa al registrar | El sistema debe rechazar el registro de un activo en una categoría inactiva. | HU-01 | RN-A09 | Media |
| RF-53 | Validar categoría activa al actualizar | El sistema debe rechazar la actualización de un activo hacia una categoría inactiva. | HU-03 | RN-A09 | Media |
| RF-54 | Validar estados permitidos del cambio manual | El sistema debe admitir como corrección manual del estado de un activo únicamente el paso entre Disponible y Dañado; Asignado solo se establece al entregar el equipo y Baja solo al darlo de baja. | HU-03 | RN-A16b | Media |
| RF-55 | Rechazar actualización de activo en Baja | El sistema debe rechazar cualquier modificación de un activo cuyo estado sea Baja, dejándolo sin cambios. | HU-03 | RN-A18 | Media |
| RF-56 | Listar inventario | El sistema debe listar los activos del inventario, de cualquier estado, ordenados por placa de inventario de menor a mayor, e informar cuando no haya activos registrados. | HU-02 | ninguna | Baja |
| RF-57 | Rechazar baja de activo ya en Baja | El sistema debe rechazar la baja de un activo que ya esté en estado Baja, sin solicitar confirmación y dejándolo sin cambios. | HU-04 | RN-A18 | Media |
| RF-58 | Rechazar baja con asignación vigente | El sistema debe rechazar la baja de un activo que tenga una asignación vigente, sin solicitar confirmación y dejándolo sin cambios, hasta que esa asignación se cierre. | HU-04 | RN-A19 | Media |
| RF-59 | Confirmar la baja | El sistema debe informar al Responsable de Activos la consecuencia de la baja de un activo y aplicarla únicamente cuando él la confirme; si desiste, debe dejar el activo sin modificar. | HU-04 | ninguna | Media |
| RF-60 | Rechazar cambio de estado con asignación vigente | El sistema debe rechazar la corrección manual del estado de un activo que tenga una asignación vigente, sin impedir por ello la actualización de sus demás datos. | HU-03 | RN-A16a | Media |
 
*Fuente: elaboración propia a partir de las fichas de RF aprobadas del archivo de estado (ficha de 6 campos).*
 
### **2.2.6.4.2 B1 Custodio (12 RF)**
 
**Tabla 53. Fichas de RF del bloque B1 Custodio (12 RF)**
 
| **Código** | **Nombre corto** | **Descripción** | **HU de origen** | **RN que hace cumplir** | **Prioridad** |
| --- | --- | --- | --- | --- | --- |
| RF-06 | Registrar custodio | El sistema debe registrar como custodio a un usuario existente, con su tipo y número de documento y su dirección, asignándole un identificador único generado por el sistema, la fecha de registro actual y el estado activo, y validar los datos obligatorios, las longitudes, los tipos de documento permitidos, la existencia del usuario y que el usuario no esté ya registrado como custodio, aunque ese custodio esté inactivo, según el diccionario. | HU-05 | ninguna | Media |
| RF-07 | Verificar unicidad del documento al registrar | El sistema debe rechazar el registro de un custodio cuyo tipo y número de documento ya pertenezcan a un custodio registrado, esté activo o inactivo; el mismo número con otro tipo de documento es válido. | HU-05 | RN-C05 | Media |
| RF-08 | Consultar custodio | El sistema debe consultar un custodio, activo o inactivo, por su identificador, por su usuario o por su tipo y número de documento, devolviendo todos sus datos sin modificarlo, e informar cuando no exista un custodio con la clave indicada. | HU-06 | ninguna | Baja |
| RF-09 | Actualizar custodio | El sistema debe actualizar el tipo de documento, el número de documento y la dirección de un custodio existente, sin permitir modificar su identificador, su usuario, su fecha de registro ni su estado de actividad (incluida su reactivación), y validar los datos obligatorios, las longitudes y los tipos de documento permitidos según el diccionario; si el custodio no existe, debe informarlo. | HU-07 | RN-C12b (parcial: no reactivar) | Media |
| RF-10 | Inactivar custodio | El sistema debe inactivar a un custodio cambiando su estado a inactivo y conservando el registro y todos sus demás datos, e informar cuando el custodio no exista. | HU-08 | ninguna | Media |
| RF-61 | Verificar unicidad del documento al actualizar | El sistema debe rechazar la actualización de un custodio cuyo nuevo tipo y número de documento ya pertenezcan a otro custodio, esté activo o inactivo, sin contar como duplicado al propio custodio que se actualiza. | HU-07 | RN-C05 | Media |
| RF-62 | Validar usuario activo al registrar custodio | El sistema debe rechazar el registro como custodio de un usuario que esté inactivo. | HU-05 | RN-C08a | Media |
| RF-63 | Validar rol Empleado al registrar custodio | El sistema debe rechazar el registro como custodio de un usuario cuyo rol no sea Empleado. | HU-05 | RN-C08b | Media |
| RF-64 | Rechazar inactivación de custodio ya inactivo | El sistema debe rechazar la inactivación de un custodio que ya esté inactivo, sin solicitar confirmación y dejándolo sin cambios. | HU-08 | RN-C12b | Media |
| RF-65 | Rechazar inactivación con asignaciones vigentes | El sistema debe rechazar la inactivación de un custodio que tenga asignaciones vigentes, sin solicitar confirmación y dejándolo sin cambios, hasta que se cierren. | HU-08 | RN-C14a | Media |
| RF-66 | Rechazar inactivación con solicitudes pendientes | El sistema debe rechazar la inactivación de un custodio que tenga solicitudes pendientes, sin solicitar confirmación y dejándolo sin cambios, hasta que se cancelen. | HU-08 | RN-C14b | Media |
| RF-67 | Confirmar la inactivación | El sistema debe informar al Responsable de Activos la consecuencia de inactivar a un custodio y aplicarla únicamente cuando él la confirme; si desiste, debe dejar al custodio sin modificar. | HU-08 | ninguna | Media |
 
*Fuente: elaboración propia a partir de las fichas de RF aprobadas del archivo de estado (ficha de 6 campos).*
 
### **2.2.6.4.3 B2 Solicitud + Aprobación (26 RF)**
 
**Tabla 54. Fichas de RF del bloque B2 Solicitud + Aprobación (26 RF)**
 
| **Código** | **Nombre corto** | **Descripción** | **HU de origen** | **RN que hace cumplir** | **Prioridad** |
| --- | --- | --- | --- | --- | --- |
| RF-11 | Registrar solicitud | El sistema debe registrar la solicitud de un equipo con la categoría solicitada, el motivo y el custodio solicitante, asignándole un identificador único generado por el sistema, la fecha y hora actuales y el estado Pendiente, y validar los datos obligatorios, la longitud del motivo y la existencia de la categoría y del custodio según el diccionario. | HU-09 | ninguna | Alta |
| RF-12 | Consultar solicitudes de un custodio | El sistema debe consultar las solicitudes de un custodio, de cualquier estado incluidas las canceladas, de la más reciente a la más antigua, e informar cuando el custodio no tenga solicitudes. | HU-10 | ninguna | Baja |
| RF-13 | Rechazar actualización de solicitud no pendiente | El sistema debe rechazar la actualización de una solicitud que no esté en estado Pendiente, dejándola sin cambios. | HU-11 | RN-S11 | Media |
| RF-14 | Actualizar solicitud | El sistema debe actualizar la categoría y el motivo de una solicitud existente, sin permitir modificar su identificador, su custodio, su fecha ni su estado, y validar los datos obligatorios, la longitud del motivo y la existencia de la categoría según el diccionario; si la solicitud no existe, debe informarlo. | HU-11 | RN-S14 (parcial: no reactivar) | Media |
| RF-15 | Cancelar solicitud | El sistema debe cancelar una solicitud cambiando su estado a Cancelada y conservando el registro y todos sus demás datos, e informar cuando la solicitud no exista. | HU-12 | ninguna | Media |
| RF-16 | Registrar decisión | El sistema debe registrar la decisión de aprobar o rechazar una solicitud, con el aprobador que la toma, la fecha y hora actuales y, si la rechaza, el motivo, asignándole un identificador único generado por el sistema y manteniéndola como definitiva, sin permitir modificarla ni revocarla, y validar los datos obligatorios, los valores permitidos de la decisión, la longitud del motivo y la existencia de la solicitud y del aprobador según el diccionario. | HU-13 | RN-AP06a | Alta |
| RF-17 | Consultar decisión de una solicitud | El sistema debe consultar la decisión de una solicitud, devolviendo el aprobador, la decisión, el motivo del rechazo y la fecha sin modificarla, e informar cuando la solicitud no exista, aún no tenga decisión o haya sido cancelada. | HU-14 | ninguna | Baja |
| RF-68 | Validar categoría activa al registrar solicitud | El sistema debe rechazar el registro de una solicitud de una categoría inactiva. | HU-09 | RN-S07 | Media |
| RF-69 | Validar custodio activo al registrar solicitud | El sistema debe rechazar el registro de una solicitud a nombre de un custodio inactivo. | HU-09 | RN-S09 | Media |
| RF-70 | Validar empleado registrado como custodio | El sistema debe rechazar el registro de una solicitud de un empleado que no esté registrado como custodio. | HU-09 | RN-S10b | Media |
| RF-71 | Restringir el registro de solicitudes al propio empleado | El sistema debe rechazar el registro de una solicitud a nombre de un custodio que no corresponda al empleado que la registra. | HU-09 | RN-S19 (incluye S10c) | Media |
| RF-72 | Consultar solicitud por identificador | El sistema debe consultar una solicitud por su identificador, devolviendo todos sus datos sin modificarla, e informar cuando no exista. | HU-10 | ninguna | Baja |
| RF-73 | Listar solicitudes pendientes | El sistema debe listar únicamente las solicitudes en estado Pendiente, de la más antigua a la más reciente, e informar cuando no haya ninguna. | HU-10 | ninguna | Baja |
| RF-74 | Listar solicitudes aprobadas sin asignación | El sistema debe listar únicamente las solicitudes en estado Aprobada que aún no tengan una asignación, de la más antigua a la más reciente, e informar cuando no haya ninguna. | HU-10 | ninguna | Baja |
| RF-75 | Restringir la consulta de solicitudes al propio empleado | El sistema debe impedir que un empleado consulte una solicitud que no sea a nombre de su propio custodio, sin mostrar ninguno de sus datos. | HU-10 | RN-S19 | Baja |
| RF-76 | Validar categoría activa al actualizar solicitud | El sistema debe rechazar la actualización de una solicitud hacia una categoría inactiva. | HU-11 | RN-S07 | Media |
| RF-77 | Restringir la actualización de solicitudes al propio empleado | El sistema debe rechazar la actualización de una solicitud que no sea a nombre del propio custodio del empleado que la actualiza. | HU-11 | RN-S19 | Media |
| RF-78 | Rechazar cancelación de solicitud no pendiente | El sistema debe rechazar la cancelación de una solicitud que no esté en estado Pendiente, incluida la que ya esté cancelada, sin solicitar confirmación y dejándola sin cambios. | HU-12 | RN-S14 | Media |
| RF-79 | Confirmar la cancelación | El sistema debe informar al empleado la consecuencia de cancelar una solicitud y aplicarla únicamente cuando él la confirme; si desiste, debe dejar la solicitud sin modificar. | HU-12 | ninguna | Media |
| RF-80 | Restringir la cancelación de solicitudes al propio empleado | El sistema debe rechazar la cancelación de una solicitud que no sea a nombre del propio custodio del empleado que la cancela. | HU-12 | RN-S19 | Media |
| RF-81 | Exigir motivo del rechazo | El sistema debe rechazar la decisión de rechazar una solicitud cuando no se indique el motivo del rechazo. | HU-13 | RN-AP02b | Media |
| RF-82 | Rechazar decisión sobre solicitud no pendiente | El sistema debe rechazar la decisión sobre una solicitud que no esté en estado Pendiente, verificando primero si la solicitud ya tiene una decisión y después si fue cancelada, e informando cuál de los dos casos ocurre. | HU-13 | RN-AP09, RN-AP06a | Media |
| RF-83 | Validar aprobador activo | El sistema debe rechazar la decisión registrada por un aprobador inactivo. | HU-13 | RN-AP11a | Media |
| RF-84 | Atribuir la decisión al aprobador identificado | El sistema debe registrar cada decisión de aprobación o rechazo atribuida a la persona identificada que la toma, de modo que se sepa quién autorizó cada solicitud. | HU-13 | RN-AP12a (ancla de 1.7.3) | Alta |
| RF-85 | Restringir la consulta de la decisión al propio empleado | El sistema debe impedir que un empleado consulte la decisión de una solicitud que no sea a nombre de su propio custodio, sin mostrar ninguno de sus datos. | HU-14 | RN-AP14 | Baja |
| RF-86 | Actualizar el estado de la solicitud según la decisión | El sistema debe dejar la solicitud en estado Aprobada o Rechazada, según la decisión registrada, al registrar la decisión. | HU-13 | ninguna | Alta |
 
*Fuente: elaboración propia a partir de las fichas de RF aprobadas del archivo de estado (ficha de 6 campos).*
 
### **2.2.6.4.4 B4a Asignación + Acta (26 RF)**
 
**Tabla 55. Fichas de RF del bloque B4a Asignación + Acta (26 RF)**
 
| **Código** | **Nombre corto** | **Descripción** | **HU de origen** | **RN que hace cumplir** | **Prioridad** |
| --- | --- | --- | --- | --- | --- |
| RF-18 | Asignar equipo | El sistema debe asignar un activo a una solicitud aprobada, indicando la fecha de devolución esperada, registrando la asignación con un identificador único generado por el sistema, la fecha de entrega actual, el estado Vigente y el custodio copiado de la solicitud, y validar los datos obligatorios, la existencia de la solicitud y del activo y que la fecha de devolución esperada no sea anterior a la fecha de entrega. | HU-15 | ninguna | Alta |
| RF-19 | Consultar asignación vigente de un activo | El sistema debe consultar la asignación vigente de un activo, aunque el activo esté Dañado, devolviendo todos sus datos sin modificarla, e informar cuando el activo no exista o no tenga una asignación vigente. | HU-16 | ninguna | Baja |
| RF-20 | Actualizar fecha de devolución esperada | El sistema debe actualizar la fecha de devolución esperada de una asignación existente, sin permitir modificar ningún otro dato de la asignación (identificador, fecha de entrega, estado, custodio, activo ni solicitud), y validar que la fecha sea obligatoria y no anterior a la fecha de entrega; si la asignación no existe, debe informarlo. | HU-17 | RN-AS13b (parcial: no reactivar) | Media |
| RF-21 | Cerrar asignación | El sistema debe cerrar una asignación cambiando su estado a Cerrada y conservando el registro y todos sus demás datos, e informar cuando la asignación no exista. | HU-18 | ninguna | Media |
| RF-22 | Firmar acta de entrega | El sistema debe registrar el acta de entrega de una asignación, con la ruta del acta y la firma digital, asignándole un identificador único generado por el sistema y la fecha y hora de firma actuales, y validar los datos obligatorios, las longitudes máximas y la existencia de la asignación según el diccionario. | HU-19 | ninguna | Media |
| RF-23 | Consultar acta de una asignación | El sistema debe consultar el acta de una asignación, vigente o cerrada, devolviendo todos sus datos sin modificarla, e informar cuando la asignación no exista o aún no tenga acta. | HU-20 | ninguna | Baja |
| RF-87 | Rechazar asignación de solicitud no aprobada | El sistema debe rechazar la asignación de una solicitud que no esté en estado Aprobada, sin crear la asignación. | HU-15 | RN-AS04 | Media |
| RF-88 | Rechazar segunda asignación de una solicitud | El sistema debe rechazar la asignación de una solicitud que ya tenga una asignación, sin crear otra. | HU-15 | RN-AS05a | Media |
| RF-89 | Rechazar la entrega de un activo no disponible | El sistema debe rechazar la asignación de un activo que no esté en estado Disponible, incluidos los que estén Asignado, Dañado o de Baja. | HU-15 | RN-AS07a (ancla de 1.7.3) | Alta |
| RF-90 | Rechazar asignación con categoría distinta | El sistema debe rechazar la asignación de un activo cuya categoría no sea la de la solicitud. | HU-15 | RN-AS08 | Media |
| RF-91 | Dejar el activo asignado | El sistema debe dejar el activo en estado Asignado al registrar su asignación. | HU-15 | ninguna | Alta |
| RF-92 | Consultar asignación por identificador | El sistema debe consultar una asignación por su identificador, vigente o cerrada, devolviendo todos sus datos sin modificarla, e informar cuando no exista. | HU-16 | ninguna | Baja |
| RF-93 | Listar asignaciones vigentes | El sistema debe listar únicamente las asignaciones vigentes, de la más antigua a la más reciente por fecha de entrega, e informar cuando no haya ninguna. | HU-16 | ninguna | Baja |
| RF-94 | Consultar asignaciones de un custodio | El sistema debe consultar las asignaciones de un custodio, vigentes y cerradas, de la más reciente a la más antigua por fecha de entrega, e informar cuando el custodio no exista o no tenga asignaciones. | HU-16 | ninguna | Baja |
| RF-95 | Limitar al empleado a sus asignaciones vigentes | El sistema debe limitar la consulta de asignaciones de un empleado a las asignaciones vigentes de su propio custodio. | HU-16 | ninguna | Baja |
| RF-96 | Restringir la consulta de asignaciones al propio empleado | El sistema debe impedir que un empleado consulte una asignación que no sea a nombre de su propio custodio, sin mostrar ninguno de sus datos. | HU-16 | RN-AS23a | Baja |
| RF-97 | Rechazar actualización de asignación cerrada | El sistema debe rechazar la actualización de una asignación que esté Cerrada, dejándola sin cambios. | HU-17 | RN-AS13b | Media |
| RF-98 | Rechazar cierre de asignación ya cerrada | El sistema debe rechazar el cierre de una asignación que ya esté Cerrada, sin solicitar confirmación y dejándola sin cambios. | HU-18 | RN-AS13b (incluye AS17) | Media |
| RF-99 | Liberar el activo al cerrar la asignación | El sistema debe dejar el activo en estado Disponible al cerrar su asignación, salvo que esté Dañado, en cuyo caso debe conservar ese estado. | HU-18 | ninguna | Media |
| RF-100 | Rechazar cierre sin devolución confirmada | El sistema debe rechazar el cierre de una asignación cuya devolución no esté registrada o esté pendiente de confirmar, sin solicitar confirmación y dejándola sin cambios. | HU-18 | RN-AS14 | Media |
| RF-101 | Confirmar el cierre | El sistema debe informar al Responsable de Activos la consecuencia de cerrar una asignación y aplicarla únicamente cuando él la confirme; si desiste, debe dejar la asignación y el activo sin modificar. | HU-18 | ninguna | Media |
| RF-102 | Exigir el acta firmada por quien recibe | El sistema debe exigir que toda entrega de un equipo quede respaldada por un acta firmada por el custodio que lo recibe. | HU-19 | RN-AC07a (ancla de 1.7.3) | Alta |
| RF-103 | Restringir la firma del acta al custodio de la asignación | El sistema debe rechazar la firma del acta de una asignación por una persona que no sea el custodio de esa asignación. | HU-19 | RN-AC07b | Media |
| RF-104 | Rechazar firma del acta de asignación no vigente | El sistema debe rechazar la firma del acta de una asignación que no esté Vigente. | HU-19 | RN-AC05 | Media |
| RF-105 | Rechazar segunda acta de una asignación | El sistema debe rechazar la firma de una segunda acta para una asignación que ya tiene acta, dejando el acta existente sin cambios. | HU-19 | RN-AC06a | Media |
| RF-106 | Restringir la consulta del acta al propio empleado | El sistema debe impedir que un empleado consulte el acta de una asignación que no sea a nombre de su propio custodio, sin mostrar ninguno de sus datos. | HU-20 | RN-AC10 | Baja |
 
*Fuente: elaboración propia a partir de las fichas de RF aprobadas del archivo de estado (ficha de 6 campos).*
 
### **2.2.6.4.5 B4b Devolución + Notificación (20 RF)**
 
**Tabla 56. Fichas de RF del bloque B4b Devolución + Notificación (20 RF)**
 
| **Código** | **Nombre corto** | **Descripción** | **HU de origen** | **RN que hace cumplir** | **Prioridad** |
| --- | --- | --- | --- | --- | --- |
| RF-24 | Registrar devolución | El sistema debe registrar la devolución de un equipo para una asignación, con observaciones opcionales, asignándole un identificador único generado por el sistema, la fecha y hora actuales y el estado de recepción Pendiente, y dejando vacías la fecha de confirmación y el receptor, y validar la obligatoriedad de la asignación, la longitud de las observaciones y la existencia de la asignación según el diccionario. | HU-21 | ninguna | Media |
| RF-25 | Listar devoluciones pendientes de recepción | El sistema debe listar únicamente las devoluciones cuya recepción esté Pendiente, de la más antigua a la más reciente por fecha de devolución, e informar cuando no haya ninguna. | HU-22 | ninguna | Baja |
| RF-26 | Actualizar observaciones de la devolución | El sistema debe actualizar las observaciones de una devolución existente, que pueden quedar vacías, sin permitir modificar ningún otro dato de la devolución (identificador, fecha de devolución, asignación, estado de recepción, fecha de confirmación ni receptor), y validar la longitud de las observaciones según el diccionario; si la devolución no existe, debe informarlo. | HU-23 | RN-D11b (parcial: no volver a Pendiente) | Media |
| RF-27 | Confirmar recepción de la devolución | El sistema debe confirmar la recepción de una devolución cambiando su estado de recepción a Confirmada y registrando la fecha y hora de confirmación actuales y el receptor que la confirma, conservando sus demás datos, validar la existencia del receptor según el diccionario e informar cuando la devolución no exista. | HU-24 | ninguna | Media |
| RF-28 | Generar aviso de devolución | El sistema debe generar de forma automática el aviso de próxima devolución de una asignación vigente, registrando la notificación con un identificador único generado por el sistema y la asignación a la que corresponde, y hacerlo llegar al custodio de esa asignación; si la asignación no existe, debe informarlo. | HU-25 | ninguna | Media |
| RF-107 | Rechazar devolución de asignación no vigente | El sistema debe rechazar el registro de la devolución de una asignación que no esté Vigente, sin crear la devolución. | HU-21 | RN-D05 | Media |
| RF-108 | Rechazar segunda devolución de una asignación | El sistema debe rechazar el registro de una segunda devolución para una asignación que ya tiene una, dejando la existente sin cambios. | HU-21 | RN-D06a | Media |
| RF-109 | Restringir el registro de devoluciones al custodio de la asignación | El sistema debe rechazar el registro de la devolución de una asignación hecha a nombre de otro custodio cuando la registra un empleado. | HU-21 | RN-D07b | Media |
| RF-110 | Mantener la asignación y el activo al registrar la devolución | El sistema debe conservar la asignación en estado Vigente y el activo en estado Asignado al registrar la devolución, hasta que se confirme su recepción. | HU-21 | ninguna | Media |
| RF-111 | Consultar devolución por identificador | El sistema debe consultar una devolución por su identificador, pendiente o confirmada, devolviendo todos sus datos sin modificarla, e informar cuando no exista. | HU-22 | ninguna | Baja |
| RF-112 | Restringir la consulta de devoluciones al propio empleado | El sistema debe limitar las devoluciones que consulta un empleado a las de asignaciones a nombre de su propio custodio, sin mostrar ninguno de los datos de las demás. | HU-22 | RN-D07b | Baja |
| RF-113 | Rechazar actualización de devolución confirmada | El sistema debe rechazar la actualización de una devolución cuya recepción esté Confirmada, dejándola sin cambios. | HU-23 | RN-D11b | Media |
| RF-114 | Restringir la actualización de devoluciones al custodio de la asignación | El sistema debe rechazar la actualización de una devolución de una asignación hecha a nombre de otro custodio cuando la actualiza un empleado. | HU-23 | RN-D07b | Media |
| RF-115 | Rechazar confirmación de devolución ya confirmada | El sistema debe rechazar la confirmación de la recepción de una devolución que ya esté Confirmada, sin solicitar confirmación y dejándola sin cambios. | HU-24 | RN-D11b | Media |
| RF-116 | Validar receptor activo | El sistema debe rechazar la confirmación de la recepción por un receptor que esté inactivo, dejando la devolución y la asignación sin cambios. | HU-24 | RN-D14b | Media |
| RF-117 | Cerrar la asignación al confirmar la recepción | El sistema debe cerrar la asignación de la devolución al confirmar su recepción, con los mismos efectos que su cierre directo, sin requerir cerrarla por separado. | HU-24 | ninguna | Media |
| RF-118 | Avisar la consecuencia antes de confirmar la recepción | El sistema debe informar al Responsable de Activos la consecuencia de confirmar la recepción de una devolución y aplicarla únicamente cuando él la confirme; si desiste, debe dejar la devolución, la asignación y el activo sin modificar. | HU-24 | ninguna | Media |
| RF-119 | Calcular los días restantes | El sistema debe calcular los días restantes hasta la devolución de una asignación como la diferencia entre su fecha de devolución esperada y la fecha actual, sin almacenar ese valor. | HU-25 | ninguna | Media |
| RF-120 | No avisar asignaciones no vigentes | El sistema debe abstenerse de generar el aviso de una asignación que no esté Vigente, sin crear notificación ni hacer llegar aviso alguno, e informar que la asignación no está vigente. | HU-25 | RN-N05 | Media |
| RF-121 | Avisar el plazo vencido | El sistema debe generar el aviso de una asignación vigente cuyo plazo de devolución ya venció, indicando al custodio que el plazo venció y los días de retraso. | HU-25 | ninguna | Media |
 
*Fuente: elaboración propia a partir de las fichas de RF aprobadas del archivo de estado (ficha de 6 campos).*
 
### **2.2.6.4.6 B5 Reporte de daños + Mantenimiento (21 RF)**
 
**Tabla 57. Fichas de RF del bloque B5 Reporte de daños + Mantenimiento (21 RF)**
 
| **Código** | **Nombre corto** | **Descripción** | **HU de origen** | **RN que hace cumplir** | **Prioridad** |
| --- | --- | --- | --- | --- | --- |
| RF-29 | Registrar reporte de daño | El sistema debe registrar el reporte de daño de un equipo con su tipo, la descripción del daño y, opcionalmente, la evidencia, asignándole un identificador único generado por el sistema, la fecha y hora actuales y el custodio que reporta, y validar los datos obligatorios, las longitudes máximas, los tipos de daño permitidos y la existencia del activo y del custodio según el diccionario. | HU-26 | ninguna | Media |
| RF-30 | Listar reportes de daño | El sistema debe listar los reportes de daño, de cualquier activo, del más reciente al más antiguo por fecha de reporte, e informar cuando no haya reportes registrados. | HU-27 | ninguna | Baja |
| RF-31 | Actualizar reporte de daño | El sistema debe actualizar la descripción, la evidencia y el tipo de daño de un reporte existente, sin permitir modificar su identificador, su fecha, su custodio ni su activo, y validar la obligatoriedad de la descripción y del tipo, las longitudes máximas y los tipos permitidos según el diccionario; si el reporte no existe, debe informarlo. | HU-28 | ninguna | Media |
| RF-32 | Registrar mantenimiento | El sistema debe registrar el mantenimiento de un activo con su tipo, su descripción, su fecha y, opcionalmente, el reporte de daño asociado, el costo y la evidencia, asignándole un identificador único generado por el sistema y el técnico que lo registra, y validar según el diccionario los datos obligatorios, las longitudes máximas, los tipos permitidos, el costo en pesos sin centavos y la existencia del activo, del reporte y del técnico; y, como propuesta pendiente de incorporar al diccionario, rechazar un costo negativo y una fecha futura. | HU-29 | ninguna | Media |
| RF-33 | Listar historial de mantenimiento de un activo | El sistema debe listar los mantenimientos de un activo, del más reciente al más antiguo por fecha de mantenimiento, e informar cuando el activo no exista o no tenga mantenimientos. | HU-30 | ninguna | Baja |
| RF-34 | Actualizar mantenimiento | El sistema debe actualizar la descripción, el costo y la evidencia de un mantenimiento existente, sin permitir modificar su identificador, su activo, su reporte, su tipo, su fecha ni su técnico, y validar la obligatoriedad de la descripción, las longitudes máximas y el costo según el diccionario; si el mantenimiento no existe, debe informarlo. | HU-31 | ninguna | Media |
| RF-122 | Dejar el activo dañado al reportar el daño | El sistema debe dejar el activo en estado Dañado al registrar su reporte de daño, aunque estuviera Asignado, conservando vigente su asignación. | HU-26 | ninguna | Media |
| RF-123 | Admitir otro reporte de un activo ya dañado | El sistema debe admitir el registro de otro reporte de daño de un activo que ya esté Dañado, conservando sus reportes anteriores y su estado. | HU-26 | ninguna | Media |
| RF-124 | Rechazar reporte de un activo en Baja | El sistema debe rechazar el reporte de daño de un activo que esté en estado Baja, sin crear el reporte. | HU-26 | RN-A18 | Media |
| RF-125 | Restringir el reporte al equipo asignado al empleado | El sistema debe rechazar el reporte de daño de un equipo que no tenga una asignación vigente a nombre del custodio, cuando lo reporta un empleado. | HU-26 | RN-RD07a | Media |
| RF-126 | Consultar reporte de daño por identificador | El sistema debe consultar un reporte de daño por su identificador, devolviendo todos sus datos sin modificarlo ni cambiar el estado del activo, e informar cuando no exista. | HU-27 | ninguna | Baja |
| RF-127 | Restringir la consulta de reportes al propio empleado | El sistema debe limitar los reportes de daño que consulta un empleado a los que él hizo, sin mostrar ninguno de los datos de los demás. | HU-27 | RN-RD07b | Baja |
| RF-128 | Rechazar actualización de reporte con mantenimiento asociado | El sistema debe rechazar la actualización de un reporte de daño que ya tenga un mantenimiento asociado, dejándolo sin cambios. | HU-28 | RN-RD15 | Media |
| RF-129 | Restringir la actualización de reportes al custodio que reportó | El sistema debe rechazar la actualización de un reporte de daño hecho por otro custodio, cuando la solicita un empleado. | HU-28 | RN-RD07b | Media |
| RF-130 | Conservar el estado del activo al actualizar el reporte | El sistema debe conservar el estado del activo al actualizar un reporte de daño. | HU-28 | ninguna | Media |
| RF-131 | Rechazar mantenimiento de un activo en Baja | El sistema debe rechazar el registro de un mantenimiento de un activo que esté en estado Baja, sin crear el mantenimiento. | HU-29 | RN-A18 | Media |
| RF-132 | Rechazar mantenimiento con reporte de otro activo | El sistema debe rechazar el registro de un mantenimiento asociado a un reporte de daño que no corresponda al mismo activo, sin crear el mantenimiento. | HU-29 | RN-H07 | Media |
| RF-133 | Validar técnico activo | El sistema debe rechazar el registro de un mantenimiento por un técnico que esté inactivo, sin crear el mantenimiento. | HU-29 | RN-H09c | Media |
| RF-134 | Conservar el estado del activo al registrar el mantenimiento | El sistema debe conservar el estado del activo al registrar un mantenimiento. | HU-29 | ninguna | Media |
| RF-135 | Consultar mantenimiento por identificador | El sistema debe consultar un mantenimiento por su identificador, devolviendo todos sus datos sin modificarlo ni cambiar el estado del activo, e informar cuando no exista. | HU-30 | ninguna | Baja |
| RF-136 | Conservar el estado del activo al actualizar el mantenimiento | El sistema debe conservar el estado del activo al actualizar un mantenimiento. | HU-31 | ninguna | Media |
 
*Fuente: elaboración propia a partir de las fichas de RF aprobadas del archivo de estado (ficha de 6 campos).*
 
### **2.2.6.4.7 B6a Usuario (16 RF)**
 
**Tabla 58. Fichas de RF del bloque B6a Usuario (16 RF)**
 
| **Código** | **Nombre corto** | **Descripción** | **HU de origen** | **RN que hace cumplir** | **Prioridad** |
| --- | --- | --- | --- | --- | --- |
| RF-35 | Registrar usuario | El sistema debe registrar un usuario con nombre, apellido, correo electrónico, contraseña y rol, asignándole un identificador único generado por el sistema y el estado activo, y validar los datos obligatorios, las longitudes máximas y que el rol sea uno de los cinco roles permitidos según el diccionario y, como propuesta del equipo pendiente de incorporar al diccionario (MOD-32; P-63), que el correo electrónico tenga la forma usuario@dominio, sin espacios. | HU-32 | ninguna | Media |
| RF-36 | Verificar unicidad del correo al registrar | El sistema debe rechazar el registro de un usuario cuyo correo electrónico ya pertenezca a otro usuario, esté este activo o inactivo. | HU-32 | RN-U04 | Media |
| RF-37 | Consultar usuario | El sistema debe consultar un usuario, activo o inactivo, por su identificador o por su correo electrónico, devolviendo su identificador, nombre, apellido, correo electrónico, estado de actividad y rol, sin devolver la contraseña ni modificar al usuario, e informar cuando no exista un usuario con la clave indicada o cuando no se indique la clave. | HU-33 | ninguna | Baja |
| RF-38 | Actualizar usuario | El sistema debe actualizar el nombre, el apellido, el correo electrónico y el rol de un usuario existente, sin permitir modificar su identificador, su contraseña ni su estado de actividad (incluida su reactivación), y validar los datos obligatorios, las longitudes máximas y los roles permitidos según el diccionario y, como propuesta del equipo pendiente de incorporar al diccionario (MOD-32; P-63), que el correo electrónico tenga la forma usuario@dominio, sin espacios; si el usuario no existe, debe informarlo. | HU-34 | RN-U12b (parcial: no reactivar) | Media |
| RF-39 | Inactivar usuario | El sistema debe inactivar a un usuario cambiando su estado a inactivo y conservando el registro y todos sus demás datos, e informar cuando el usuario no exista. | HU-35 | ninguna | Media |
| RF-40 | Iniciar sesión | El sistema debe iniciar la sesión de un usuario registrado que indique su correo electrónico y su contraseña correctos, dejándola con el rol que ese usuario tiene asignado, sea cual sea de los cinco roles; debe validar que ambos datos se indiquen y rechazar el inicio de sesión cuando el correo electrónico no corresponda a un usuario o la contraseña no coincida. | HU-36 | ninguna | Media |
| RF-41 | Cambiar contraseña | El sistema debe cambiar la contraseña de un usuario cuando se indique la contraseña actual correcta y una contraseña nueva, conservando todos sus demás datos; debe validar que ambas se indiquen, rechazar el cambio si la actual no coincide con la registrada e informar cuando el usuario no exista. | HU-37 | ninguna | Media |
| RF-137 | Verificar unicidad del correo al actualizar | El sistema debe rechazar la actualización de un usuario cuyo nuevo correo electrónico ya pertenezca a otro usuario, activo o inactivo, sin contar como duplicado al propio usuario que se actualiza. | HU-34 | RN-U04 | Media |
| RF-138 | Rechazar actualización de usuario inactivo | El sistema debe rechazar la actualización de un usuario que esté inactivo, dejándolo sin cambios. | HU-34 | RN-U12b | Media |
| RF-139 | Rechazar inactivación de usuario ya inactivo | El sistema debe rechazar la inactivación de un usuario que ya esté inactivo, sin solicitar confirmación y dejándolo sin cambios. | HU-35 | RN-U12b | Media |
| RF-140 | Rechazar inactivación con custodio activo | El sistema debe rechazar la inactivación de un usuario que tenga un custodio activo, sin solicitar confirmación y dejándolo sin cambios, hasta que se inactive a ese custodio. | HU-35 | RN-U15a | Media |
| RF-141 | Proteger al único Aprobador activo | El sistema debe rechazar la inactivación de un usuario con rol Aprobador que sea el único Aprobador activo mientras existan solicitudes pendientes, sin solicitar confirmación y dejándolo sin cambios. | HU-35 | RN-U16 | Media |
| RF-142 | Rechazar la auto-inactivación | El sistema debe rechazar que un usuario inactive su propio usuario, sin solicitar confirmación y dejándolo sin cambios. | HU-35 | ninguna (instancia de PRO-02, propuesta del equipo) | Media |
| RF-143 | Confirmar la inactivación | El sistema debe informar al Responsable de Activos la consecuencia de inactivar a un usuario y aplicarla únicamente cuando él la confirme; si desiste, debe dejar al usuario sin modificar. | HU-35 | ninguna | Media |
| RF-144 | Rechazar inicio de sesión de usuario inactivo | El sistema debe rechazar el inicio de sesión de un usuario inactivo cuyas credenciales sean correctas, sin iniciar la sesión. | HU-36 | RN-U20a | Media |
| RF-145 | Restringir el cambio de contraseña al propio usuario | El sistema debe rechazar el cambio de contraseña de un usuario solicitado por una persona distinta de ese mismo usuario, dejando la contraseña sin cambios. | HU-37 | RN-U22 | Media |
 
*Fuente: elaboración propia a partir de las fichas de RF aprobadas del archivo de estado (ficha de 6 campos).*
 
### **2.2.6.4.8 B6b Rol_Permiso + Categoría (16 RF)**
 
**Tabla 59. Fichas de RF del bloque B6b Rol_Permiso + Categoría (16 RF)**
 
| **Código** | **Nombre corto** | **Descripción** | **HU de origen** | **RN que hace cumplir** | **Prioridad** |
| --- | --- | --- | --- | --- | --- |
| RF-42 | Otorgar permiso a un rol | El sistema debe otorgar un permiso a un rol, registrando el par rol–permiso sin modificar los demás permisos de los roles, y validar que el rol y el permiso se indiquen, que sean valores permitidos de sus enumeraciones y que el par no exista ya, según el diccionario. | HU-38 | ninguna | Media |
| RF-43 | Retirar permiso a un rol | El sistema debe retirar un permiso a un rol, de modo que el rol deje de tener ese permiso y pueda volver a otorgársele, sin modificar los demás permisos del rol ni los de otros roles; debe validar que el rol y el permiso se indiquen y sean valores permitidos según el diccionario e informar cuando el rol no tenga ese permiso. | HU-39 | ninguna | Media |
| RF-44 | Consultar permisos de un rol | El sistema debe consultar los permisos asignados a un rol, devolviéndolos en el orden en que el diccionario declara los permisos, sin devolver los de otros roles ni modificar las asignaciones, validar que el rol se indique y sea un valor permitido según el diccionario e informar cuando el rol no tenga permisos asignados. | HU-40 | ninguna | Baja |
| RF-146 | Confirmar el retiro | El sistema debe informar al Responsable de Activos la consecuencia de retirar un permiso a un rol y aplicarla únicamente cuando él la confirme; si desiste, debe dejar al rol con el permiso. | HU-39 | ninguna | Media |
| RF-45 | Registrar categoría | El sistema debe registrar una categoría de equipos con su nombre, asignándole un identificador único generado por el sistema y el estado activo, y validar el dato obligatorio y la longitud máxima del nombre según el diccionario. | HU-41 | ninguna | Media |
| RF-147 | Verificar unicidad del nombre al registrar | El sistema debe rechazar el registro de una categoría cuyo nombre ya pertenezca a otra categoría, esté activa o inactiva, sin distinguir mayúsculas de minúsculas. | HU-41 | RN-CA04 | Media |
| RF-46 | Consultar categoría | El sistema debe consultar una categoría, activa o inactiva, por su identificador, devolviendo su identificador, nombre y estado de actividad sin modificarla, e informar cuando no exista una categoría con ese identificador. | HU-42 | ninguna | Baja |
| RF-148 | Listar categorías activas | El sistema debe listar únicamente las categorías activas, ordenadas por nombre, e informar cuando no haya categorías activas. | HU-42 | ninguna | Baja |
| RF-47 | Actualizar categoría | El sistema debe actualizar el nombre de una categoría existente, sin permitir modificar su identificador ni su estado de actividad (incluida su reactivación), y validar el dato obligatorio y la longitud máxima del nombre según el diccionario; si la categoría no existe, debe informarlo. | HU-43 | RN-CA09b (parcial: no reactivar) | Media |
| RF-149 | Verificar unicidad del nombre al actualizar | El sistema debe rechazar la actualización de una categoría cuyo nuevo nombre ya pertenezca a otra categoría, esté activa o inactiva, sin distinguir mayúsculas de minúsculas y sin contar como duplicado a la propia categoría que se actualiza, incluso cuando solo cambian las mayúsculas. | HU-43 | RN-CA04 | Media |
| RF-150 | Rechazar actualización de categoría inactiva | El sistema debe rechazar la actualización de una categoría que esté inactiva, dejándola sin cambios. | HU-43 | RN-CA09b | Media |
| RF-48 | Inactivar categoría | El sistema debe inactivar una categoría cambiando su estado a inactivo y conservando el registro y todos sus demás datos, e informar cuando la categoría no exista. | HU-44 | ninguna | Media |
| RF-151 | Rechazar inactivación de categoría ya inactiva | El sistema debe rechazar la inactivación de una categoría que ya esté inactiva, sin solicitar confirmación y dejándola sin cambios. | HU-44 | RN-CA09b | Media |
| RF-152 | Rechazar inactivación con activos sin dar de baja | El sistema debe rechazar la inactivación de una categoría que tenga activos Disponibles, Asignados o Dañados, sin contar los dados de baja, sin solicitar confirmación y dejándola sin cambios, hasta que esos activos se den de baja o se reclasifiquen. | HU-44 | RN-CA12a | Media |
| RF-153 | Rechazar inactivación con solicitudes pendientes | El sistema debe rechazar la inactivación de una categoría que tenga solicitudes pendientes, sin solicitar confirmación y dejándola sin cambios, hasta que se resuelvan o se cancelen. | HU-44 | RN-CA12b | Media |
| RF-154 | Confirmar la inactivación | El sistema debe informar al Responsable de Activos la consecuencia de inactivar una categoría y aplicarla únicamente cuando él la confirme; si desiste, debe dejar la categoría sin modificar. | HU-44 | ninguna | Media |
 
*Fuente: elaboración propia a partir de las fichas de RF aprobadas del archivo de estado (ficha de 6 campos).*
 
### **2.2.6.4.9 B7 Auditoría + Reportes (7 RF)**
 
**Tabla 60. Fichas de RF del bloque B7 Auditoría + Reportes (7 RF)**
 
| **Código** | **Nombre corto** | **Descripción** | **HU de origen** | **RN que hace cumplir** | **Prioridad** |
| --- | --- | --- | --- | --- | --- |
| RF-49 | Consultar registro de auditoría | El sistema debe consultar un registro de auditoría por su identificador, devolviendo el usuario que ejecutó la acción, la entidad y el registro afectados, la acción, la fecha y el detalle cuando exista, tal como se guardó —aunque el usuario esté inactivo o el registro afectado ya no exista— y sin modificarlo; debe validar que el identificador sea un entero positivo según el diccionario e informar cuando no exista un registro con ese identificador. | HU-45 | ninguna | Baja |
| RF-50 | Consultar reporte | El sistema debe generar, bajo demanda, el reporte del tipo solicitado (Asignados, Disponibles, Pendientes_Devolucion o Mal_Estado) para el rango de fechas indicado, sin modificar ningún dato; debe validar que el tipo y la fecha de inicio se indiquen, que el tipo sea uno de los cuatro permitidos y, como propuesta del equipo pendiente de incorporar al diccionario (MOD-40), que la fecha de fin, si se indica, no sea anterior a la de inicio (igual es válida), e informar cuando el reporte no tenga filas. | HU-46 | ninguna | Baja |
| RF-155 | Reporte de activos asignados | El sistema debe incluir en el reporte de tipo Asignados las asignaciones Vigentes cuya fecha de entrega esté dentro del rango, incluidos sus extremos, de la más reciente a la más antigua por fecha de entrega. | HU-46 | ninguna | Baja |
| RF-156 | Reporte de pendientes de devolución | El sistema debe incluir en el reporte de tipo Pendientes_Devolucion las asignaciones Vigentes cuya fecha de devolución esperada esté dentro del rango, incluidos sus extremos, de la más próxima a la más lejana por fecha de devolución esperada, indicando el estado de recepción de su devolución cuando exista. | HU-46 | ninguna | Baja |
| RF-157 | Reporte de activos disponibles | El sistema debe incluir en el reporte de tipo Disponibles los activos en estado Disponible, sin filtrarlos por las fechas del rango, por identificador ascendente. | HU-46 | ninguna | Baja |
| RF-158 | Reporte de activos en mal estado | El sistema debe incluir en el reporte de tipo Mal_Estado los activos en estado Dañado, sin filtrarlos por las fechas del rango y sin incluir los dados de baja, por identificador ascendente. | HU-46 | ninguna | Baja |
| RF-159 | Aplicar la fecha actual como fin del rango | El sistema debe tomar la fecha actual como fin del rango del reporte cuando no se indique la fecha de fin. | HU-46 | ninguna | Baja |
 
*Fuente: elaboración propia a partir de las fichas de RF aprobadas del archivo de estado (ficha de 6 campos).*
 
### **2.2.6.4.10 Transversales (13 RF)**
 
**Tabla 61. Fichas de RF del bloque Transversales (13 RF)**
 
| **Código** | **Nombre corto** | **Descripción** | **HU de origen** | **RN que hace cumplir** | **Prioridad** |
| --- | --- | --- | --- | --- | --- |
| RF-160 | Registrar la acción en la auditoría | El sistema debe registrar en la auditoría cada acción auditable, con un identificador único generado por el sistema, el usuario que la ejecutó, la entidad y el registro afectados, la acción, la fecha y hora actuales y, opcionalmente, un detalle breve. | HU-45 | RN-T02a (cita también RN-T02) | Media |
| RF-161 | Auditar la asignación de un equipo | El sistema debe registrar en la auditoría cada asignación de un equipo, con la acción Asignar y la asignación afectada. | HU-15 | RN-T02a | Media |
| RF-162 | Auditar el registro de una devolución | El sistema debe registrar en la auditoría cada devolución registrada, con la acción Devolver y la devolución afectada. | HU-21 | RN-T02a | Media |
| RF-163 | Auditar la confirmación de recepción | El sistema debe registrar en la auditoría cada confirmación de recepción de una devolución, con la acción Devolver y la devolución afectada. | HU-24 | RN-T02a (devolución; ambigüedad en P-89) | Media |
| RF-164 | Auditar la baja de un equipo | El sistema debe registrar en la auditoría cada baja de un equipo, con la acción Inactivar y el activo afectado. | HU-04 | RN-T02a | Media |
| RF-165 | Auditar la consulta de reportes | El sistema debe registrar en la auditoría cada consulta de reporte, con la acción Reportar, el usuario que la realizó y la fecha en que se hizo. | HU-46 | ninguna (RN-R13 es RNFC-17) | Baja |
| RF-166 | Verificar el permiso del rol | El sistema debe ejecutar una operación solo cuando el rol del usuario con sesión iniciada la tenga permitida según la matriz rol–operación, y rechazarla, sin ejecutarla ni mostrar ningún dato, informando que no tiene permiso, cuando no la tenga. | HU-38 | ninguna | Media |
| RF-167 | Atribuir las acciones automáticas | El sistema debe atribuir a un usuario propio del sistema, y no a una persona, las acciones que ejecuta de forma automática sin un usuario con sesión iniciada. | HU-25 | ninguna | Media |
| RF-168 | Tomar el custodio solicitante de la sesión | El sistema debe tomar el custodio de la solicitud del custodio del usuario con sesión iniciada, sin admitir que se indique otro. | HU-09 | ninguna (RN-T03; S10c; refuerza RN-S19, vigilada por RF-71) | Media |
| RF-169 | Tomar el aprobador de la sesión | El sistema debe tomar el aprobador de la decisión del usuario con sesión iniciada, sin admitir que se indique otro. | HU-13 | ninguna (RN-T03; AP12b; sostiene RN-AP12a, vigilada por RF-84) | Alta |
| RF-170 | Tomar el receptor de la sesión | El sistema debe tomar el receptor de la devolución del usuario con sesión iniciada que confirma la recepción, sin admitir que se indique otro. | HU-24 | ninguna (RN-T03; D13b) | Media |
| RF-171 | Tomar el custodio del reporte de daño de la sesión | El sistema debe tomar el custodio del reporte de daño del custodio del usuario con sesión iniciada, sin admitir que se indique otro. | HU-26 | ninguna (RN-T03; RD06) | Media |
| RF-172 | Tomar el técnico de la sesión | El sistema debe tomar el técnico del mantenimiento del usuario con sesión iniciada, sin admitir que se indique otro. | HU-29 | ninguna (RN-T03; H09a) | Media |
 
*Fuente: elaboración propia a partir de las fichas de RF aprobadas del archivo de estado (ficha de 6 campos).*
 
## **2.2.6.5 Cobertura HU → RF**
 
La tabla relaciona las 46 HU con los RF que citan cada una como origen, calculada desde el campo «HU de origen» de las fichas. Las 46 HU tienen al menos un RF.
 
**Excepción de los RF transversales. **Los RF transversales se asignan a la HU más cercana: RF-160 cita HU-45; RF-166 cita HU-38 y RF-167 cita HU-25, porque no existe una HU propia del control de acceso ni de las acciones automáticas (decisión D-T2). Por eso HU-45, HU-38 y HU-25 incluyen RF transversales además de los de su propia entidad.
 
**Tabla 62. Cobertura de las 46 HU por los RF**
 
| **HU** | **RF que la citan como origen** | **Cantidad** |
| --- | --- | --- |
| HU-01 | RF-01, RF-02, RF-52 | 3 |
| HU-02 | RF-03, RF-56 | 2 |
| HU-03 | RF-04, RF-51, RF-53 a RF-55, RF-60 | 6 |
| HU-04 | RF-05, RF-57 a RF-59, RF-164 | 5 |
| HU-05 | RF-06, RF-07, RF-62, RF-63 | 4 |
| HU-06 | RF-08 | 1 |
| HU-07 | RF-09, RF-61 | 2 |
| HU-08 | RF-10, RF-64 a RF-67 | 5 |
| HU-09 | RF-11, RF-68 a RF-71, RF-168 | 6 |
| HU-10 | RF-12, RF-72 a RF-75 | 5 |
| HU-11 | RF-13, RF-14, RF-76, RF-77 | 4 |
| HU-12 | RF-15, RF-78 a RF-80 | 4 |
| HU-13 | RF-16, RF-81 a RF-84, RF-86, RF-169 | 7 |
| HU-14 | RF-17, RF-85 | 2 |
| HU-15 | RF-18, RF-87 a RF-91, RF-161 | 7 |
| HU-16 | RF-19, RF-92 a RF-96 | 6 |
| HU-17 | RF-20, RF-97 | 2 |
| HU-18 | RF-21, RF-98 a RF-101 | 5 |
| HU-19 | RF-22, RF-102 a RF-105 | 5 |
| HU-20 | RF-23, RF-106 | 2 |
| HU-21 | RF-24, RF-107 a RF-110, RF-162 | 6 |
| HU-22 | RF-25, RF-111, RF-112 | 3 |
| HU-23 | RF-26, RF-113, RF-114 | 3 |
| HU-24 | RF-27, RF-115 a RF-118, RF-163, RF-170 | 7 |
| HU-25 | RF-28, RF-119 a RF-121, RF-167 | 5 |
| HU-26 | RF-29, RF-122 a RF-125, RF-171 | 6 |
| HU-27 | RF-30, RF-126, RF-127 | 3 |
| HU-28 | RF-31, RF-128 a RF-130 | 4 |
| HU-29 | RF-32, RF-131 a RF-134, RF-172 | 6 |
| HU-30 | RF-33, RF-135 | 2 |
| HU-31 | RF-34, RF-136 | 2 |
| HU-32 | RF-35, RF-36 | 2 |
| HU-33 | RF-37 | 1 |
| HU-34 | RF-38, RF-137, RF-138 | 3 |
| HU-35 | RF-39, RF-139 a RF-143 | 6 |
| HU-36 | RF-40, RF-144 | 2 |
| HU-37 | RF-41, RF-145 | 2 |
| HU-38 | RF-42, RF-166 | 2 |
| HU-39 | RF-43, RF-146 | 2 |
| HU-40 | RF-44 | 1 |
| HU-41 | RF-45, RF-147 | 2 |
| HU-42 | RF-46, RF-148 | 2 |
| HU-43 | RF-47, RF-149, RF-150 | 3 |
| HU-44 | RF-48, RF-151 a RF-154 | 5 |
| HU-45 | RF-49, RF-160 | 2 |
| HU-46 | RF-50, RF-155 a RF-159, RF-165 | 7 |
| Total |  | 172 |
 
*Fuente: elaboración propia, calculada desde el campo «HU de origen» de las fichas de RF del archivo de estado.*
 
## **2.2.6.6 Trazabilidad RF → RN**
 
La tabla reúne los 88 RF que hacen cumplir una ficha de RN, con la ficha que vigilan tal como la cita su campo «RN que hace cumplir»; las 59 fichas tienen al menos un RF. RN-T02a queda condicionada a T-2 (validación del docente).
 
**Tabla 63. RF que hacen cumplir una ficha de RN**
 
| **RF** | **Nombre corto** | **Ficha de RN que vigila** | **HU** |
| --- | --- | --- | --- |
| RF-02 | Verificar unicidad al registrar | RN-A03, RN-A04 | HU-01 |
| RF-05 | Dar de baja activo | RN-A16b | HU-04 |
| RF-51 | Verificar unicidad al actualizar | RN-A03, RN-A04 | HU-03 |
| RF-52 | Validar categoría activa al registrar | RN-A09 | HU-01 |
| RF-53 | Validar categoría activa al actualizar | RN-A09 | HU-03 |
| RF-54 | Validar estados permitidos del cambio manual | RN-A16b | HU-03 |
| RF-55 | Rechazar actualización de activo en Baja | RN-A18 | HU-03 |
| RF-57 | Rechazar baja de activo ya en Baja | RN-A18 | HU-04 |
| RF-58 | Rechazar baja con asignación vigente | RN-A19 | HU-04 |
| RF-60 | Rechazar cambio de estado con asignación vigente | RN-A16a | HU-03 |
| RF-07 | Verificar unicidad del documento al registrar | RN-C05 | HU-05 |
| RF-09 | Actualizar custodio | RN-C12b (parcial: no reactivar) | HU-07 |
| RF-61 | Verificar unicidad del documento al actualizar | RN-C05 | HU-07 |
| RF-62 | Validar usuario activo al registrar custodio | RN-C08a | HU-05 |
| RF-63 | Validar rol Empleado al registrar custodio | RN-C08b | HU-05 |
| RF-64 | Rechazar inactivación de custodio ya inactivo | RN-C12b | HU-08 |
| RF-65 | Rechazar inactivación con asignaciones vigentes | RN-C14a | HU-08 |
| RF-66 | Rechazar inactivación con solicitudes pendientes | RN-C14b | HU-08 |
| RF-13 | Rechazar actualización de solicitud no pendiente | RN-S11 | HU-11 |
| RF-14 | Actualizar solicitud | RN-S14 (parcial: no reactivar) | HU-11 |
| RF-16 | Registrar decisión | RN-AP06a | HU-13 |
| RF-68 | Validar categoría activa al registrar solicitud | RN-S07 | HU-09 |
| RF-69 | Validar custodio activo al registrar solicitud | RN-S09 | HU-09 |
| RF-70 | Validar empleado registrado como custodio | RN-S10b | HU-09 |
| RF-71 | Restringir el registro de solicitudes al propio empleado | RN-S19 (incluye S10c) | HU-09 |
| RF-75 | Restringir la consulta de solicitudes al propio empleado | RN-S19 | HU-10 |
| RF-76 | Validar categoría activa al actualizar solicitud | RN-S07 | HU-11 |
| RF-77 | Restringir la actualización de solicitudes al propio empleado | RN-S19 | HU-11 |
| RF-78 | Rechazar cancelación de solicitud no pendiente | RN-S14 | HU-12 |
| RF-80 | Restringir la cancelación de solicitudes al propio empleado | RN-S19 | HU-12 |
| RF-81 | Exigir motivo del rechazo | RN-AP02b | HU-13 |
| RF-82 | Rechazar decisión sobre solicitud no pendiente | RN-AP09, RN-AP06a | HU-13 |
| RF-83 | Validar aprobador activo | RN-AP11a | HU-13 |
| RF-84 | Atribuir la decisión al aprobador identificado | RN-AP12a (ancla de 1.7.3) | HU-13 |
| RF-85 | Restringir la consulta de la decisión al propio empleado | RN-AP14 | HU-14 |
| RF-20 | Actualizar fecha de devolución esperada | RN-AS13b (parcial: no reactivar) | HU-17 |
| RF-87 | Rechazar asignación de solicitud no aprobada | RN-AS04 | HU-15 |
| RF-88 | Rechazar segunda asignación de una solicitud | RN-AS05a | HU-15 |
| RF-89 | Rechazar la entrega de un activo no disponible | RN-AS07a (ancla de 1.7.3) | HU-15 |
| RF-90 | Rechazar asignación con categoría distinta | RN-AS08 | HU-15 |
| RF-96 | Restringir la consulta de asignaciones al propio empleado | RN-AS23a | HU-16 |
| RF-97 | Rechazar actualización de asignación cerrada | RN-AS13b | HU-17 |
| RF-98 | Rechazar cierre de asignación ya cerrada | RN-AS13b (incluye AS17) | HU-18 |
| RF-100 | Rechazar cierre sin devolución confirmada | RN-AS14 | HU-18 |
| RF-102 | Exigir el acta firmada por quien recibe | RN-AC07a (ancla de 1.7.3) | HU-19 |
| RF-103 | Restringir la firma del acta al custodio de la asignación | RN-AC07b | HU-19 |
| RF-104 | Rechazar firma del acta de asignación no vigente | RN-AC05 | HU-19 |
| RF-105 | Rechazar segunda acta de una asignación | RN-AC06a | HU-19 |
| RF-106 | Restringir la consulta del acta al propio empleado | RN-AC10 | HU-20 |
| RF-26 | Actualizar observaciones de la devolución | RN-D11b (parcial: no volver a Pendiente) | HU-23 |
| RF-107 | Rechazar devolución de asignación no vigente | RN-D05 | HU-21 |
| RF-108 | Rechazar segunda devolución de una asignación | RN-D06a | HU-21 |
| RF-109 | Restringir el registro de devoluciones al custodio de la asignación | RN-D07b | HU-21 |
| RF-112 | Restringir la consulta de devoluciones al propio empleado | RN-D07b | HU-22 |
| RF-113 | Rechazar actualización de devolución confirmada | RN-D11b | HU-23 |
| RF-114 | Restringir la actualización de devoluciones al custodio de la asignación | RN-D07b | HU-23 |
| RF-115 | Rechazar confirmación de devolución ya confirmada | RN-D11b | HU-24 |
| RF-116 | Validar receptor activo | RN-D14b | HU-24 |
| RF-120 | No avisar asignaciones no vigentes | RN-N05 | HU-25 |
| RF-124 | Rechazar reporte de un activo en Baja | RN-A18 | HU-26 |
| RF-125 | Restringir el reporte al equipo asignado al empleado | RN-RD07a | HU-26 |
| RF-127 | Restringir la consulta de reportes al propio empleado | RN-RD07b | HU-27 |
| RF-128 | Rechazar actualización de reporte con mantenimiento asociado | RN-RD15 | HU-28 |
| RF-129 | Restringir la actualización de reportes al custodio que reportó | RN-RD07b | HU-28 |
| RF-131 | Rechazar mantenimiento de un activo en Baja | RN-A18 | HU-29 |
| RF-132 | Rechazar mantenimiento con reporte de otro activo | RN-H07 | HU-29 |
| RF-133 | Validar técnico activo | RN-H09c | HU-29 |
| RF-36 | Verificar unicidad del correo al registrar | RN-U04 | HU-32 |
| RF-38 | Actualizar usuario | RN-U12b (parcial: no reactivar) | HU-34 |
| RF-137 | Verificar unicidad del correo al actualizar | RN-U04 | HU-34 |
| RF-138 | Rechazar actualización de usuario inactivo | RN-U12b | HU-34 |
| RF-139 | Rechazar inactivación de usuario ya inactivo | RN-U12b | HU-35 |
| RF-140 | Rechazar inactivación con custodio activo | RN-U15a | HU-35 |
| RF-141 | Proteger al único Aprobador activo | RN-U16 | HU-35 |
| RF-144 | Rechazar inicio de sesión de usuario inactivo | RN-U20a | HU-36 |
| RF-145 | Restringir el cambio de contraseña al propio usuario | RN-U22 | HU-37 |
| RF-147 | Verificar unicidad del nombre al registrar | RN-CA04 | HU-41 |
| RF-47 | Actualizar categoría | RN-CA09b (parcial: no reactivar) | HU-43 |
| RF-149 | Verificar unicidad del nombre al actualizar | RN-CA04 | HU-43 |
| RF-150 | Rechazar actualización de categoría inactiva | RN-CA09b | HU-43 |
| RF-151 | Rechazar inactivación de categoría ya inactiva | RN-CA09b | HU-44 |
| RF-152 | Rechazar inactivación con activos sin dar de baja | RN-CA12a | HU-44 |
| RF-153 | Rechazar inactivación con solicitudes pendientes | RN-CA12b | HU-44 |
| RF-160 | Registrar la acción en la auditoría | RN-T02a (cita también RN-T02) | HU-45 |
| RF-161 | Auditar la asignación de un equipo | RN-T02a | HU-15 |
| RF-162 | Auditar el registro de una devolución | RN-T02a | HU-21 |
| RF-163 | Auditar la confirmación de recepción | RN-T02a (devolución; ambigüedad en P-89) | HU-24 |
| RF-164 | Auditar la baja de un equipo | RN-T02a | HU-04 |
 
*Fuente: elaboración propia a partir del campo «RN que hace cumplir» de las fichas de RF y de las fichas del documento de reglas de negocio.*
 
## **2.2.6.7 Anclas de 1.7.3 y propiedad**
 
Las cuatro reglas implícitas o detectadas de 1.7.3 tienen un RF explícito. Las cifras de la encuesta son solo las de 1.7 (n = 19); donde 1.7 no tiene cifra, se dice. Todos los RF de las anclas son propuesta del equipo, pendientes de validar con el cliente.
 
**Tabla 64. Anclas de 1.7.3, ficha de RN, RF que las hacen cumplir y respaldo en 1.7**
 
| **Ancla de 1.7.3** | **Ficha de RN** | **RF explícito** | **Respaldo en 1.7** |
| --- | --- | --- | --- |
| Cada equipo se identifica de forma única | RN-A03 y RN-A04 | RF-02 y RF-51 | N-02: saber en todo momento quién tiene cada equipo es lo más importante para 9 respuestas (pregunta 9) y localizar equipos es dificultad alta para 5. No hay cifra de 1.7 sobre la unicidad de la serie y la placa. |
| Decisión atribuible a una persona identificada | RN-AP12a | RF-84 (con RF-169, que toma el aprobador de la sesión) | Pregunta 9: autorizaciones, 6 de 19. Pregunta 11: responsable de aprobación, 3 de 19. |
| Solo un equipo disponible puede entregarse | RN-AS07a | RF-89 | No hay cifra en 1.7: la regla viene del análisis documental. |
| Acta firmada por quien recibe | RN-AC07a | RF-102 (propuesta del equipo) | Pregunta 10: Sí 11, a veces 3, no 4, no sabe 1 (19); 8 de 19 no la firman siempre. Pregunta 14: acta digital firmada 2 y «todas las anteriores» 7, es decir, 9 de 19 piden acta digital. |
 
*Fuente: elaboración propia a partir de las fichas de RF, las fichas de RN del documento de reglas de negocio y la síntesis de resultados de 1.7.2.*
 
La tabla siguiente reúne los RF que enuncian las reglas de propiedad (la familia «propiedad» del mapa de familias del documento de reglas de negocio y las de acto propio RN-RD07a, RN-AC07b y RN-U22).
 
**Tabla 65. RF que enuncian la propiedad**
 
| **Ficha de RN** | **Enunciado** | **RF que la enuncian** |
| --- | --- | --- |
| RN-S19 | Un empleado solo puede registrar, consultar, modificar o cancelar solicitudes a su propio nombre. | RF-71 (incluye S10c); RF-75; RF-77; RF-80 |
| RN-AP14 | Un empleado solo puede consultar la decisión de las solicitudes hechas a su nombre. | RF-85 |
| RN-AS23a | Un empleado solo puede consultar las asignaciones hechas a su nombre. | RF-96 |
| RN-AC10 | Un empleado solo puede consultar el acta de una asignación hecha a su nombre. | RF-106 |
| RN-D07b | Un empleado solo puede registrar, consultar o modificar devoluciones de asignaciones hechas a su nombre. | RF-109; RF-112; RF-114 |
| RN-RD07b | Un empleado solo puede consultar o actualizar los reportes de daño que él hizo. | RF-127; RF-129 |
| RN-RD07a | Un empleado solo puede reportar el daño de un equipo que tiene asignado a su nombre. | RF-125 |
| RN-AC07b | El acta de entrega solo puede firmarla el custodio que recibe el equipo. | RF-103 |
| RN-U22 | Un usuario solo puede cambiar su propia contraseña. | RF-145 |
 
*Fuente: elaboración propia a partir de las fichas de RN del documento de reglas de negocio y del campo «RN que hace cumplir» de las fichas de RF.*
 
## **2.2.6.8 Auditoría, control de acceso y sesión**
 
Estas tres capacidades se enuncian una sola vez, en los RF transversales RF-160 a RF-172, y no se repiten en cada operación. Resumen:
 
**RF-160 Registrar la acción en la auditoría** (HU-45; prioridad Media)
 
**RF-161 Auditar la asignación de un equipo** (HU-15; prioridad Media)
 
**RF-162 Auditar el registro de una devolución** (HU-21; prioridad Media)
 
**RF-163 Auditar la confirmación de recepción** (HU-24; prioridad Media)
 
**RF-164 Auditar la baja de un equipo** (HU-04; prioridad Media)
 
**RF-165 Auditar la consulta de reportes** (HU-46; prioridad Baja). Condicionada a T-9 (provisional, respuesta del cliente a P-90).
 
**RF-166 Verificar el permiso del rol** (HU-38; prioridad Media). Condicionada a P-75, P-77, P-100, P-RP1 y P-RP2.
 
**RF-167 Atribuir las acciones automáticas** (HU-25; prioridad Media). Condicionada a T-8 (opción A como inclinación, provisional).
 
**RF-168 Tomar el custodio solicitante de la sesión** (HU-09; prioridad Media). Condicionado a la respuesta de P-105.
 
**RF-169 Tomar el aprobador de la sesión** (HU-13; prioridad Alta). Condicionado a la respuesta de P-105
 
**RF-170 Tomar el receptor de la sesión** (HU-24; prioridad Media). Condicionado a la respuesta de P-105.
 
**RF-171 Tomar el custodio del reporte de daño de la sesión** (HU-26; prioridad Media). Condicionado a la respuesta de P-105
 
**RF-172 Tomar el técnico de la sesión** (HU-29; prioridad Media). Condicionado a la respuesta de P-105.
 
La matriz rol–operación (63 filas, una por método público y una para el cambio de responsable) está en el Anexo C del documento de reglas de negocio y sirve de referencia a RF-166; los requisitos no funcionales candidatos de autoridad por rol, seguridad y auditabilidad están en la sección de RNFC de las listas acumuladas (RNFC-01 a RNFC-30). RN-T02a queda vigilada por RF-160 a RF-164, condicionada a T-2. El cambio de responsable no tiene RF (HAL-109).
 
## **2.2.6.9 Decisiones abiertas**
 
**Decisiones del cliente. **Cada pregunta indica su tema y los RF cuya redacción o condición depende de ella. El texto completo de las preguntas P-01 a P-105 está en la sección H del consolidado y los códigos definitivos de las preguntas provisionales, en el Anexo F del documento de reglas de negocio.
 
**P-02** (Activo): RF-02
 
**P-04** (Activo): RF-54, RF-55, RF-57, RF-58, RF-60
 
**P-05** (Activo): RF-04, RF-60
 
**P-07** (Activo): RF-01, RF-06
 
**P-08** (Custodio): RF-62, RF-63
 
**P-09** (Custodio / Solicitud): RF-11, RF-70
 
**P-10** (Custodio): RF-06
 
**P-11** (Custodio): RF-07
 
**P-12** (Custodio): RF-09
 
**P-13** (Custodio): RF-58, RF-65 a RF-67, RF-140
 
**P-14** (Custodio): RF-06, RF-10, RF-64, RF-67
 
**P-15** (Custodio): RF-09, RF-64
 
**P-16** (Custodio): RF-10
 
**P-17** (Custodio): RF-08
 
**P-18** (Custodio): RF-07
 
**P-19** (Solicitud): RF-68, RF-69, RF-76
 
**P-20** (Solicitud): RF-12, RF-73, RF-74
 
**P-21** (Solicitud): RF-13, RF-71, RF-75, RF-77, RF-80, RF-85
 
**P-22** (Solicitud): RF-15, RF-78
 
**P-23** (Aprobación): RF-83, RF-84
 
**P-24** (Aprobación): RF-17
 
**P-25** (Aprobación): RF-16, RF-82
 
**P-26** (Aprobación): RF-16, RF-81
 
**P-27** (¿El custodio y el aprobador se toman de la sesión o se digitan?): RF-73, RF-74
 
**P-28** (Asignación): RF-18
 
**P-29** (Asignación): RF-90
 
**P-30** (Asignación): RF-18, RF-20
 
**P-31** (Asignación): RF-20
 
**P-32** (Asignación / Activo): RF-54, RF-89, RF-91, RF-99, RF-122, RF-134
 
**P-33** (Asignación): RF-99, RF-134
 
**P-34** (Asignación): RF-21, RF-100, RF-117
 
**P-36** (Asignación): RF-93, RF-94
 
**P-37** (Asignación): RF-95, RF-96
 
**P-38** (Acta): RF-22
 
**P-39** (Acta): RF-22
 
**P-40** (Acta): RF-23, RF-104, RF-106
 
**P-41** (Acta): RF-102, RF-103, RF-105
 
**P-42** (Devolución): RF-24, RF-27, RF-109, RF-112, RF-114, RF-116
 
**P-43** (Devolución): RF-24
 
**P-44** (Notificación): RF-28, RF-120
 
**P-45** (Notificación): RF-121
 
**P-46** (Notificación): RF-120
 
**P-47** (Devolución): RF-24, RF-27, RF-108
 
**P-48** (Notificación): RF-28
 
**P-49** (Devolución): RF-26, RF-113, RF-115
 
**P-50** (Reporte de daños): RF-123
 
**P-51** (Reporte de daños): RF-122, RF-125, RF-134
 
**P-52** (Reporte de daños): RF-29
 
**P-53** (Reporte de daños): RF-30
 
**P-54** (Reporte de daños): RF-128
 
**P-55** (Reporte de daños): RF-30, RF-127, RF-129
 
**P-56** (Mantenimiento): RF-32, RF-132
 
**P-57** (Mantenimiento): RF-33, RF-34
 
**P-58** (Mantenimiento): RF-32
 
**P-60** (Usuario): RF-35, RF-37
 
**P-61** (Usuario): RF-35, RF-41
 
**P-63** (Usuario): RF-36, RF-137
 
**P-64** (Usuario): RF-38
 
**P-65** (Usuario): RF-138
 
**P-66** (Usuario): RF-140, RF-141
 
**P-67** (Usuario): RF-141
 
**P-68** (Usuario): RF-142
 
**P-69** (Usuario): RF-38, RF-39, RF-138, RF-139
 
**P-70** (Usuario): RF-40
 
**P-71** (Usuario): RF-144
 
**P-72** (Usuario): RF-37
 
**P-73** (Usuario): RF-35
 
**P-74** (Rol_Permiso / Categoria): RF-42, RF-45, RF-166
 
**P-75** (Rol_Permiso): RF-42, RF-44, RF-166
 
**P-76** (Rol_Permiso): RF-42
 
**P-77** (Rol_Permiso): RF-42, RF-166
 
**P-78** (Rol_Permiso): RF-43
 
**P-80** (Rol_Permiso): RF-43, RF-146
 
**P-81** (Categoria): RF-147, RF-149
 
**P-82** (Categoria): RF-152, RF-153
 
**P-83** (Categoria): RF-46, RF-148
 
**P-84** (Categoria): RF-47, RF-150
 
**P-85** (Categoria): RF-47, RF-48, RF-147, RF-149 a RF-151
 
**P-86** (Categoria): RF-45
 
**P-87** (Categoria): RF-148
 
**P-88** (Auditoría y Reportes): RF-49, RF-50, RF-166
 
**P-89** (Auditoría): RF-160, RF-163
 
**P-90** (Auditoría): RF-49, RF-165
 
**P-96** (Auditoría): RF-160
 
**P-97** (Auditoría): RF-160, RF-165
 
**P-98** (Auditoría): RF-160, RF-165
 
**P-99** (Auditoría): RF-49
 
**P-100** (Auditoría): RF-166
 
**P-101** (Reportes): RF-155 a RF-158
 
**P-102** (Reportes): RF-155, RF-156, RF-158
 
**P-103** (Reportes): RF-155, RF-156
 
**P-104** (Reportes): RF-50, RF-159
 
**P-105** (Sesión (transversal)): RF-11, RF-16, RF-70, RF-71, RF-84, RF-168 a RF-172
 
**P-A1** (pregunta provisional; código definitivo P-106): RF-02
 
**P-A2** (pregunta provisional; código definitivo P-107): RF-52, RF-53
 
**P-A3** (pregunta provisional; código definitivo P-108): RF-58
 
**P-AC1** (pregunta provisional; código definitivo P-115): RF-102, RF-105
 
**P-AS1** (pregunta provisional; código definitivo P-114): RF-88
 
**P-B1** (pregunta provisional; código definitivo P-113): RF-81
 
**P-C1** (pregunta provisional; código definitivo P-109): RF-66, RF-153
 
**P-C2** (pregunta provisional; código definitivo P-110): RF-38, RF-63
 
**P-C3** (pregunta provisional; código definitivo P-111): RF-65, RF-66
 
**P-CA1** (pregunta provisional; código definitivo P-128): RF-45
 
**P-H1** (pregunta provisional; código definitivo P-122): RF-34
 
**P-H2** (pregunta provisional; código definitivo P-123): RF-132
 
**P-N1** (pregunta provisional; código definitivo P-117): RF-28
 
**P-N2** (pregunta provisional; código definitivo P-118): RF-28
 
**P-N3** (pregunta provisional; código definitivo P-119): RF-167
 
**P-R1** (pregunta provisional; código definitivo P-129): RF-159
 
**P-RD1** (pregunta provisional; código definitivo P-120): RF-29, RF-125
 
**P-RD2** (pregunta provisional; código definitivo P-121): RF-127, RF-129
 
**P-RP1** (pregunta provisional; código definitivo P-126): RF-42, RF-166
 
**P-RP2** (pregunta provisional; código definitivo P-127): RF-42, RF-166
 
**P-S1** (pregunta provisional; código definitivo P-112): RF-14, RF-78
 
**P-SF1** (pregunta provisional; código definitivo P-116): RF-142
 
**P-U1** (pregunta provisional; código definitivo P-125): RF-144
 
**Decisiones del docente. **T-2: RN-T02 se divide en la RN-T02a, con ficha, y un RNF de auditabilidad (T02b); es provisional, sujeta a validación del docente, y condiciona RF-160 a RF-164. T-11: la tensión entre la encuesta y el alcance (NAL-02, NAL-03 y NAL-05) se mantiene fuera de alcance como trabajo futuro; es provisional, sujeta a validación del docente. Numeración de los RNF candidatos: las diez partes RNF se numeran RNFC-21 a RNFC-30 (decisión D-T4 modificada), sin renumerar los veinte vigentes; pendiente de validación del docente.
 
**Decisiones provisionales con pregunta. **T-9: se audita solo la consulta de reportes (RF-165); es provisional, pendiente de la respuesta del cliente a P-90. T-8: el usuario de sistema para las acciones automáticas (RF-167) sigue la opción A como inclinación, provisional.
 
## **Anexo RF-A. Notas de trazabilidad por RF**
 
La tabla recoge, para cada RF, el criterio de prioridad, las preguntas, MOD, HAL y COR relacionados y las marcas de propuesta o de condición que figuran en la columna de notas del archivo de estado. Todas las fichas son propuesta del equipo, pendientes de validar con el cliente; la última columna recoge solo las marcas específicas de cada RF y, para RN-A16a y RN-A16b, los RF relacionados que no vigilan.
 
**Tabla 66. Notas de trazabilidad por RF**
 
| **RF** | **Criterio de prioridad** | **Preguntas, MOD, HAL y COR relacionados** | **Marca de propuesta o condición** |
| --- | --- | --- | --- |
| RF-01 | mantiene datos maestros, aunque sea precondición del corte | P-07 | depende de RF-02 y RF-52 |
| RF-02 | ancla de 1.7.3 | P-A1, P-02 | — |
| RF-03 | consulta de apoyo | — | — |
| RF-04 | mantiene datos maestros | P-05 | depende de RF-51, RF-53, RF-54, RF-55 y RF-60 |
| RF-05 | ciclo de vida del activo | — | — |
| RF-51 | ancla de 1.7.3 | MOD-42 | — |
| RF-52 | mantiene datos maestros | P-A2 | — |
| RF-53 | mantiene datos maestros | P-A2 | — |
| RF-54 | ciclo de vida del activo | P-04, P-32 | Vigila RN-A16b. Relacionado, sin vigilar: RF-91 (Asignado solo al asignar). |
| RF-55 | ciclo de vida del activo | P-04 | — |
| RF-56 | consulta de apoyo | — | — |
| RF-57 | ciclo de vida del activo | P-04 | — |
| RF-58 | ciclo de vida del activo | P-04, P-A3, P-13 | — |
| RF-59 | ciclo de vida del activo | COR-84 | — |
| RF-60 | ciclo de vida del activo | P-04, P-05 | Vigila RN-A16a. Relacionados, sin vigilar: RF-122 (el reporte deja el activo Dañado) y RF-99 (al cerrar queda Disponible salvo Dañado). |
| RF-06 | mantiene datos maestros | P-07, P-10, P-14 | la cláusula «aunque esté inactivo» es propuesta del equipo, pendiente de validar (P-14) |
| RF-07 | mantiene datos maestros | P-11, P-18 | — |
| RF-08 | consulta de apoyo | P-17 | — |
| RF-09 | mantiene datos maestros | P-12, P-15 | — |
| RF-10 | mantiene datos maestros | P-14, P-16 | — |
| RF-61 | mantiene datos maestros | MOD-44 | — |
| RF-62 | mantiene datos maestros | P-08 | — |
| RF-63 | mantiene datos maestros | P-08, P-C2 | — |
| RF-64 | mantiene datos maestros | P-14, P-15 | — |
| RF-65 | mantiene datos maestros | P-13, P-C3 | — |
| RF-66 | mantiene datos maestros | P-13, P-C1, P-C3 | — |
| RF-67 | mantiene datos maestros | P-13, P-14, COR-87 | — |
| RF-11 | ejecuta el primer paso del corte | P-09, P-105 | — |
| RF-12 | consulta de apoyo | P-20 | — |
| RF-13 | actualizar solicitud no es un paso del corte | P-21 | — |
| RF-14 | actualizar solicitud no es un paso del corte | P-S1 | — |
| RF-15 | cancelar no es un paso del corte | P-22 | — |
| RF-16 | ejecuta el paso «aprobación» del corte | P-25, P-26, P-105 | — |
| RF-17 | consulta de apoyo | P-24, MOD-07 | — |
| RF-68 | validación que protege un paso del corte | P-19 | — |
| RF-69 | validación que protege un paso del corte | P-19 | — |
| RF-70 | validación que protege un paso del corte | P-09, P-105 | — |
| RF-71 | validación que protege un paso del corte | P-21, P-105 | — |
| RF-72 | consulta de apoyo | — | — |
| RF-73 | consulta de apoyo | P-27, P-20 | — |
| RF-74 | consulta de apoyo; D-RF9 | P-27, P-20, MOD-02 | — |
| RF-75 | restricción de propiedad sobre una consulta | P-21 | — |
| RF-76 | validación | P-19 | — |
| RF-77 | validación | P-21 | — |
| RF-78 | validación | P-22, P-S1 | — |
| RF-79 | cancelar no es un paso del corte | COR-90 | — |
| RF-80 | validación | P-21 | — |
| RF-81 | validación que protege un paso del corte | P-B1, P-26 | — |
| RF-82 | validación que protege un paso del corte | HAL-28, P-25 | — |
| RF-83 | validación que protege un paso del corte | P-23 | — |
| RF-84 | ancla de 1.7.3 | P-105, P-23 | — |
| RF-85 | restricción de propiedad sobre una consulta | P-21 | — |
| RF-86 | paso que habilita la asignación | MOD-46, MOD-02 | — |
| RF-18 | ejecuta el paso «asignación» del corte | P-28, P-30, MOD-01 | — |
| RF-19 | consulta de apoyo | — | — |
| RF-20 | completa el ciclo de la asignación | P-31, P-30, MOD-01 | — |
| RF-21 | ciclo de vida | P-34 | — |
| RF-22 | mantiene datos maestros: acta | P-38, P-39 | — |
| RF-23 | consulta de apoyo | P-40 | — |
| RF-87 | validación que protege un paso del corte | MOD-02 | — |
| RF-88 | validación que protege un paso del corte | P-AS1 | — |
| RF-89 | ancla de 1.7.3 | P-32 | — |
| RF-90 | validación que protege un paso del corte | P-29 | — |
| RF-91 | parte del paso «asignación» del corte | MOD-03, P-32 | Relacionado con RN-A16b, sin vigilar: Asignado solo al asignar. |
| RF-92 | consulta de apoyo | — | — |
| RF-93 | consulta de apoyo | P-36 | — |
| RF-94 | consulta de apoyo | P-36 | — |
| RF-95 | consulta de apoyo | P-37 | — |
| RF-96 | restricción de propiedad sobre una consulta | P-37 | — |
| RF-97 | completa el ciclo de la asignación | — | — |
| RF-98 | ciclo de vida | — | — |
| RF-99 | ciclo de vida del activo | P-32, P-33, MOD-10 | Relacionado con RN-A16a, sin vigilar: al cerrar queda Disponible salvo Dañado. |
| RF-100 | ciclo de vida | P-34, MOD-48 | — |
| RF-101 | ciclo de vida | COR-93 | — |
| RF-102 | ancla de 1.7.3 | P-41, P-AC1, MOD-18, HAL-44 | Propuesta del equipo, pendiente de validar (D-RF12). |
| RF-103 | mantiene datos maestros: acta | P-41 | — |
| RF-104 | mantiene datos maestros: acta | P-40 | — |
| RF-105 | mantiene datos maestros: acta | P-AC1, P-41 | — |
| RF-106 | restricción de propiedad sobre una consulta | P-40 | — |
| RF-24 | mantiene datos maestros: devolución | P-42, P-43, P-47, MOD-19 | — |
| RF-25 | consulta de apoyo | — | Orden: propuesta sin pregunta propia |
| RF-26 | mantiene datos maestros: devolución | P-49 | — |
| RF-27 | mantiene datos maestros: devolución | P-42, P-47 | — |
| RF-28 | mantiene datos maestros: notificación | P-44, P-N1, P-N2, P-48, MOD-23 | — |
| RF-107 | mantiene datos maestros: devolución | — | — |
| RF-108 | mantiene datos maestros: devolución | P-47 | — |
| RF-109 | mantiene datos maestros: devolución | P-42 | — |
| RF-110 | ciclo de vida | — | — |
| RF-111 | consulta de apoyo | — | — |
| RF-112 | restricción de propiedad sobre una consulta | P-42, MOD-50 | — |
| RF-113 | mantiene datos maestros: devolución | P-49 | — |
| RF-114 | mantiene datos maestros: devolución | P-42 | — |
| RF-115 | mantiene datos maestros: devolución | P-49 | — |
| RF-116 | mantiene datos maestros: devolución | P-42 | — |
| RF-117 | ciclo de vida | P-34, MOD-48, HAL-54 | CRF-003 cambios 2 y 5 (propuesta, sin aplicar); |
| RF-118 | mantiene datos maestros: devolución | COR-97 | — |
| RF-119 | mantiene datos maestros: notificación | — | — |
| RF-120 | validación | P-46, P-44 | — |
| RF-121 | mantiene datos maestros: notificación | P-45 | Propuesta del equipo, pendiente de validar (PRO-06, P-45) |
| RF-29 | mantiene datos maestros: daños | P-52, P-RD1 | — |
| RF-30 | consulta de apoyo | P-53, P-55 | — |
| RF-31 | mantiene datos maestros: daños | — | Depende de RF-128, RF-129 y RF-130 |
| RF-32 | mantiene datos maestros: mantenimiento | MOD-28, P-58, P-56 | Propuesta del equipo, pendiente de validar: costo no negativo y fecha no futura (MOD-28, P-58); |
| RF-33 | consulta de apoyo | P-57 | — |
| RF-34 | mantiene datos maestros: mantenimiento | P-57, P-H1 | — |
| RF-122 | ciclo de vida del activo | P-32, P-51, MOD-03 | Relacionado con RN-A16a, sin vigilar: el reporte deja el activo Dañado. |
| RF-123 | mantiene datos maestros: daños | P-50 | Propuesta del equipo, pendiente de validar (P-50). |
| RF-124 | ciclo de vida del activo | HAL-58, HAL-89 | — |
| RF-125 | validación | P-51, P-RD1 | — |
| RF-126 | consulta de apoyo | — | — |
| RF-127 | restricción de propiedad sobre una consulta | P-55, P-RD2 | — |
| RF-128 | validación | P-54, MOD-27 | — |
| RF-129 | validación | P-55, P-RD2 | — |
| RF-130 | ciclo de vida del activo | — | — |
| RF-131 | ciclo de vida del activo | HAL-62, HAL-90 | — |
| RF-132 | validación | P-56, P-H2, MOD-29 | — |
| RF-133 | validación | — | — |
| RF-134 | ciclo de vida del activo | P-32, P-33, P-51, MOD-10, HAL-64 | — |
| RF-135 | consulta de apoyo | — | — |
| RF-136 | ciclo de vida del activo | — | — |
| RF-35 | mantiene datos maestros: usuario | MOD-53, P-60, P-61, P-73 | El formato es RN-U05 (restricción del diccionario por incorporar): propuesta pendiente de validar. |
| RF-36 | mantiene datos maestros: usuario | P-63, MOD-42 | — |
| RF-37 | consulta de apoyo | P-60, P-72 | — |
| RF-38 | mantiene datos maestros: usuario | P-64, P-69, P-C2, HAL-94 | El formato es RN-U05 por incorporar: propuesta pendiente de validar. |
| RF-39 | mantiene datos maestros: usuario | P-69 | — |
| RF-40 | precondición del corte, no un paso | P-70, MOD-55, MOD-31 | — |
| RF-41 | mantiene datos maestros: usuario | P-61, MOD-55, HAL-93 | — |
| RF-137 | mantiene datos maestros: usuario | MOD-42, P-63 | — |
| RF-138 | validación | P-65, P-69 | — |
| RF-139 | validación | P-69 | — |
| RF-140 | validación | P-66, P-13, HAL-96 | — |
| RF-141 | validación | P-66, P-67, MOD-54 | — |
| RF-142 | validación | P-68, P-SF1, COR-103 | — |
| RF-143 | mantiene datos maestros: usuario | COR-102 | — |
| RF-144 | validación | P-71, P-U1, HAL-95 | — |
| RF-145 | validación | HAL-93 | — |
| RF-42 | mantiene datos maestros: rol-permiso | P-74, P-75, P-76, P-77, P-RP1, P-RP2, MOD-14, MOD-34, HAL-71 | — |
| RF-43 | mantiene datos maestros: rol-permiso | HAL-100, P-78, MOD-35, P-80 | — |
| RF-44 | consulta de apoyo; la respalda el Alcance 1.2 | P-75 | Orden: propuesta del equipo, pendiente de validar (P-75) |
| RF-146 | mantiene datos maestros: rol-permiso | COR-106, P-80 | — |
| RF-45 | mantiene datos maestros: categoría, aunque sea precondición del corte | MOD-56, P-CA1, P-74, P-86 | — |
| RF-147 | validación | P-81, P-85, MOD-42, MOD-57 | Propuesta del equipo, pendiente de validar (P-81, P-85). |
| RF-46 | consulta de apoyo | P-83, MOD-37 | — |
| RF-148 | consulta de apoyo | P-83, P-87 | Orden: propuesta del equipo (Fase A v6). |
| RF-47 | mantiene datos maestros: categoría | P-84, P-85 | — |
| RF-149 | validación | P-81, P-85, MOD-42, MOD-57 | Propuesta del equipo, pendiente de validar (P-81, P-85). |
| RF-150 | validación | P-84, P-85 | — |
| RF-48 | mantiene datos maestros: categoría | P-85 | — |
| RF-151 | validación | P-85 | — |
| RF-152 | validación | P-82, HAL-81, MOD-36 | — |
| RF-153 | validación | P-82, P-C1, MOD-36 | — |
| RF-154 | mantiene datos maestros: categoría | COR-107 | — |
| RF-49 | consulta de auditoría | P-88, P-99, P-90, MOD-13, MOD-38, HAL-108 | — |
| RF-50 | reportes | MOD-12, P-88, P-104, MOD-41, HAL-79, HAL-103, HAL-107 | — |
| RF-155 | reportes | P-101, P-102, P-103 | Propuesta del equipo, pendiente de validar (P-101, P-102, P-103). |
| RF-156 | reportes | P-101, P-102, P-103, HAL-107 | Propuesta del equipo, pendiente de validar (P-101, P-102, P-103). |
| RF-157 | reportes | P-101, MOD-41, HAL-107 | Propuesta del equipo, pendiente de validar (P-101). |
| RF-158 | reportes | P-101, P-102, MOD-41, HAL-107 | Propuesta del equipo, pendiente de validar (P-101, P-102). |
| RF-159 | reportes | P-104, P-R1, HAL-106 | Propuesta del equipo, pendiente de validar (P-104, P-R1; |
| RF-160 | el registro de auditoría de acciones lo exige el Alcance 1.2; no es paso del corte ni ancla | MOD-58, MOD-24, MOD-31, MOD-38, MOD-39, P-89, P-96, P-97, P-98, HAL-101, HAL-110 | Depende de T-2 (docente) |
| RF-161 | registro de auditoría de acciones | HAL-38 | Depende de T-2 (docente) |
| RF-162 | registro de auditoría de acciones | HAL-52 | Depende de T-2 (docente) |
| RF-163 | registro de auditoría de acciones | HAL-52, HAL-111 | Depende de T-2 (docente) |
| RF-164 | registro de auditoría de acciones | HAL-08, MOD-39 | Depende de T-2 (docente) |
| RF-165 | reportes | P-90, HAL-104, HAL-105, P-97, P-98, COR-111, COR-112 | Condicionada a T-9 (provisional, respuesta del cliente a P-90). |
| RF-166 | control de acceso por rol | P-75, P-77, P-100, P-RP1, P-RP2, P-74, P-88, MOD-14, MOD-33, MOD-34, HAL-73, HAL-112, HAL-113 | Condicionada a P-75, P-77, P-100, P-RP1 y P-RP2. |
| RF-167 | registro de auditoría de acciones | MOD-24, MOD-31, MOD-59, P-N3, HAL-57, HAL-115 | Condicionada a T-8 (opción A como inclinación, provisional). |
| RF-168 | identificación del actor por sesión | P-105, HAL-19, HAL-114 | Condicionado a la respuesta de P-105. |
| RF-169 | mecanismo que sostiene una ancla de 1.7.3 | P-105 | Condicionado a la respuesta de P-105 |
| RF-170 | identificación del actor por sesión | P-105, HAL-50 | Condicionado a la respuesta de P-105. |
| RF-171 | identificación del actor por sesión | P-105 | Condicionado a la respuesta de P-105 |
| RF-172 | identificación del actor por sesión | P-105, HAL-62 | Condicionado a la respuesta de P-105. |
 
*Fuente: elaboración propia a partir de la columna de notas de las fichas de RF aprobadas del archivo de estado y del ajuste a la trazabilidad RN → RF (RN-A16a y RN-A16b).*
