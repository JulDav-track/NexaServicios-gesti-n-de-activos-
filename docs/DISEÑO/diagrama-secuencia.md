# 3.7 Diagramas de Secuencia
 
Esta sección presenta los diagramas de secuencia de los seis casos de uso documentados en dos bloques. El bloque 1 (3.7.1 a 3.7.5) cubre tres de ellos: CU-09 Registrar solicitud de equipo, CU-13 Registrar decisión sobre una solicitud y CU-15 Asignar equipo a una solicitud aprobada, que forman el recorrido solicitud, decisión y asignación. Hay un diagrama por caso de uso y cada uno sigue el diagrama de actividades del mismo caso en la sección 3.5 (Figuras 2, 3 y 4 de 3.5): cada rombo de 3.5 aparece aquí como un fragmento alt. La Tabla 1 resume los tres diagramas. Todo lo que se muestra es propuesta del equipo, pendiente de validar con la docente y con el cliente.
 
Cada diagrama sigue la cadena actor → Vista → Controlador → Servicio → clase del modelo. La Vista es la pantalla de los mockups 2.5 que la Tabla 3 de 3.6 asigna a la historia de usuario, y los nombres de Controlador y Servicio son los de la Tabla 4 de 3.6. Propuesta del equipo, pendiente de confirmar con la docente: el Servicio forma parte de la lógica del modelo, porque expone las mismas operaciones públicas que su clase del diagrama de clases (v6 con CRF-003), valida ahí las reglas de negocio (RN) y el permiso del rol, e invoca a la clase del modelo; por eso el Controlador recibe la operación con el mismo nombre que la clase (por ejemplo, AsignacionControlador recibe asignar(a)). Además de esas cinco líneas de vida aparecen RolPermisoServicio, que responde la verificación de permiso (RF-166), AuditoriaServicio cuando el caso registra auditoría, y los Servicios de las otras entidades que el caso consulta.
 
Regla de oro: ningún mensaje invoca un método que no exista en el diagrama de clases. Cada mensaje es un método de los 76 del diagrama (62 públicos y 14 INTERNO); los métodos INTERNO solo los invoca el Servicio de su clase, salvo Auditoria.registrar(), que los Servicios de las demás entidades invocan a través de AuditoriaServicio. La flecha llena numerada es una llamada; la flecha discontinua es una respuesta. Los retornos de las llamadas no se dibujan: el valor devuelto se nombra antes del signo igual (por ejemplo, s = buscarPorId(idSolicitud)). El mensaje 1 es la acción del actor en la pantalla y no es un método. Cada fragmento alt tiene dos operandos: el de rechazo, con la guarda, el flujo alterno, la RN y la respuesta con el mensaje M-xx, que vuelve por el Controlador y la Vista al actor (el caso vuelve al paso 2, salvo el rechazo por rol, que termina el caso), y el operando [else], que continúa con el paso siguiente. Las notas amarillas indican el estado que resulta y la transición de la sección 3.8 (F2-T1 = transición T1 de la Figura 2 de 3.8). El caso incluido CU-48 se dibuja como una invocación marcada «include». El rol y el identificador del usuario en sesión llegan con la petición (RNF-02); esto también es propuesta del equipo.
 
**Tabla ****1****.*** Resumen de los diagramas de secuencia del bloque 1*
 
| **CU** | **HU** | **Actor** | **Vista** | **Controlador** | **Servicio** | **Clase del modelo** | **Otros servicios** | **Mensajes** | **Fragmentos alt** | **Figura** | **Tabla** |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
| CU-09 Registrar solicitud de equipo | HU-09 | Empleado | MK-03 Registrar solicitud de equipo | SolicitudControlador | SolicitudServicio | Solicitud | RolPermisoServicio, CategoriaServicio, CustodioServicio | 8 | 5 | Figura 1 | Tabla 3 |
| CU-13 Registrar decisión sobre una solicitud | HU-13 | Aprobador | MK-05 Registrar decisión | AprobacionControlador | AprobacionServicio | Aprobacion | RolPermisoServicio, SolicitudServicio, UsuarioServicio | 8 | 7 | Figura 2 | Tabla 4 |
| CU-15 Asignar equipo a una solicitud aprobada | HU-15 | Responsable de Activos | MK-06 Asignar equipo | AsignacionControlador | AsignacionServicio | Asignacion | RolPermisoServicio, SolicitudServicio, ActivoServicio, AuditoriaServicio | 10 | 7 | Figura 3 | Tabla 5 |
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de validar) a partir de la Tabla 3 y la Tabla 4 de 3.6, de 3.5 y del diagrama de clases (v6 con CRF-003). Mensajes: llamadas numeradas, incluida la acción del actor; los fragmentos alt incluyen el de rechazo por rol.*
 
El bloque 2 (3.7.6 a 3.7.10) presenta los diagramas de secuencia de CU-24 Confirmar recepción de una devolución, CU-01 Registrar activo y CU-19 Firmar acta de entrega, con la misma notación de 3.7.1 a 3.7.3, y la tabla de mensaje por historia de usuario. La Tabla 2 resume los diagramas. Se agregan dos elementos de notación: la flecha discontinua de la Vista al actor representa un aviso que muestra la pantalla sin invocar al Controlador (aviso M-151 de CU-24), y un fragmento alt cuya respuesta sale de la Vista (flujo 7a de CU-24). Cuando un rombo de 3.5 no se apoya en una RN ni en una restricción del diccionario, la guarda lleva «sin RN» y el RF que enuncia la condición. CU-24 se presenta en dos figuras porque el diagrama completo no cabe en 22,8 x 14 cm con letra de 9 pt o más; propuesta del equipo, pendiente de la docente. Todo lo que se muestra es propuesta del equipo, pendiente de validar con la docente y con el cliente.
 
**Tabla ****2****.*** Resumen de los diagramas de secuencia del bloque 2*
 
| **CU** | **HU** | **Actor** | **Vista** | **Controlador** | **Servicio** | **Clase del modelo** | **Otros servicios** | **Mensajes** | **Fragmentos alt** | **Figura** | **Tabla** |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
| CU-24 Confirmar recepción de una devolución | HU-24 | Responsable de Activos | MK-09 Confirmar recepción (aviso de consecuencia) | DevolucionControlador | DevolucionServicio | Devolucion | RolPermisoServicio, UsuarioServicio, AsignacionServicio, AuditoriaServicio | 14 | 7 | Figuras 4 y 5 (un diagrama en dos figuras) | Tabla 7 |
| CU-01 Registrar activo | HU-01 | Responsable de Activos | MK-02 Registrar activo | ActivoControlador | ActivoServicio | Activo | RolPermisoServicio, CategoriaServicio | 8 | 6 | Figura 6 | Tabla 8 |
| CU-19 Firmar acta de entrega | HU-19 | Empleado | MK-07 Firmar acta de entrega | ActaDeEntregaControlador | ActaDeEntregaServicio | Acta_De_Entrega | RolPermisoServicio, AsignacionServicio, CustodioServicio | 8 | 6 | Figura 7 | Tabla 9 |
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de validar) a partir de la Tabla 3 y la Tabla 4 de 3.6, de 3.5 y del diagrama de clases (v6 con CRF-003). Mensajes: llamadas numeradas, incluidas las acciones del actor; los fragmentos alt incluyen el de rechazo por rol.*
 
## 3.7.1 CU-09 Registrar solicitud de equipo
 
La Figura 1 muestra la secuencia de CU-09 (HU-09). El Empleado registra la solicitud en MK-03; SolicitudServicio verifica el permiso, los datos obligatorios y la longitud del motivo, ejecuta el caso incluido CU-48 con CategoriaServicio.buscarPorId(), verifica el custodio con CustodioServicio y, si todo se cumple, invoca Solicitud.crear(), que deja la solicitud Pendiente. La Tabla 3 detalla cada mensaje con su paso del caso, su RN y su RF.
 
**Figura ****1****.*** Diagrama de secuencia de CU-09 Registrar solicitud de equipo*
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de validar) a partir de CU-09 en el Word de casos de uso, la Figura 2 y la Tabla 3 de 3.5, las Tablas 3, 4 y 5 de 3.6, el diagrama de clases (v6 con CRF-003) y la sección 3.8. restr. dicc. = restricción del diccionario de datos.*
 
El caso de uso trata ID_Custodio como dato que el Empleado digita, mientras RF-168 toma el responsable de la sesión (COR-23, P-105); el diagrama conserva el dato digitado y lo compara con el custodio del usuario en sesión (mensajes 6 y 7). CU-09 no registra auditoría, porque ninguno de sus RF la enuncia (HAL-24; P-89).
 
**Tabla ****3****.*** Mensajes del diagrama de secuencia de CU-09*
 
| **N.º** | **Emisor → receptor** | **Mensaje** | **Paso o flujo del CU** | **RN (ficha) y RF** | **M-xx** |
| --- | --- | --- | --- | --- | --- |
| 1 | Empleado → MK-03 | Acción en la pantalla: registra ID_Categoria, Motivo e ID_Custodio (no es un método) | Pasos 1 y 2 | RF-11 | — |
| 2 | MK-03 → SolicitudControlador | SolicitudControlador.crear(s) | Paso 2 | RF-11 | — |
| 3 | SolicitudControlador → SolicitudServicio | SolicitudServicio.crear(s) | Paso 2 | RF-11 | — |
| 4 | SolicitudServicio → RolPermisoServicio | RolPermisoServicio.consultarPermisos(rol) | Precondición (R0) | RNF-01 (no es RN numerada); RF-166 (transversal, origen HU-38) | — |
| alt | SolicitudServicio → SolicitudControlador → MK-03 → Empleado | [el rol no tiene el permiso] (respuesta de rechazo) | Rechazo por rol (2.4.2); termina el caso | RNF-01 (no es RN numerada); RF-166 | Mensaje propuesto, sin número (2.4.2) |
| alt | SolicitudServicio → SolicitudControlador → MK-03 → Empleado | [ID_Categoria, Motivo o ID_Custodio vacío] (respuesta de rechazo) | 3a; vuelve al paso 2 | restricción del diccionario; RF-11 | M-07, M-60, M-63 |
| alt | SolicitudServicio → SolicitudControlador → MK-03 → Empleado | [Motivo supera 255 caracteres] (respuesta de rechazo) | 4a; vuelve al paso 2 | restricción del diccionario; RF-11 | M-64 |
| 5 | SolicitudServicio → CategoriaServicio | CategoriaServicio.buscarPorId(idCategoria) («include» CU-48) | Paso 5 («include» CU-48) | RF-68; RF-11 | — |
| alt | SolicitudServicio → SolicitudControlador → MK-03 → Empleado | [categoría inexistente o inactiva] (respuesta de rechazo) | 5a; vuelve al paso 2 | RN-S07 (inactiva); restricción del diccionario (FK) para la inexistente; RF-68, RF-11 | M-08, M-09 |
| 6 | SolicitudServicio → CustodioServicio | CustodioServicio.buscarPorUsuario(idUsuario) | Paso 6 (usuario en sesión) | RF-70, RF-168 | — |
| 7 | SolicitudServicio → CustodioServicio | CustodioServicio.buscarPorId(idCustodio) | Paso 6 | RF-69, RF-71; RF-11 | — |
| alt | SolicitudServicio → SolicitudControlador → MK-03 → Empleado | [custodio inexistente, inactivo, sin registrar o de otro empleado] (respuesta de rechazo) | 6a; vuelve al paso 2 | RN-S09, RN-S10b, RN-S19 (incluye RN-S10c†); restricción del diccionario (FK) para el inexistente; RF-69, RF-70, RF-71, RF-168, RF-11 | M-50, M-61, M-62, M-272 |
| 8 | SolicitudServicio → Solicitud | Solicitud.crear(s) | Paso 7 | RF-11 | — |
| — | SolicitudServicio → SolicitudControlador → MK-03 → Empleado | Respuesta de éxito: M-65 Solicitud registrada correctamente. | Paso 7 | RF-11 | M-65 |
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de validar) a partir de CU-09 en el Word de casos de uso, la Tabla 3 de 3.5, el documento de RN (fichas), la tabla C.1 del Consolidado de 46 HU y la Tabla 53 (mensajes M-01 a M-273). † = RN sin ficha en el documento de RN. RF-166 es transversal: su historia de origen es HU-38, no la del caso.*
 
## 3.7.2 CU-13 Registrar decisión sobre una solicitud
 
La Figura 2 muestra la secuencia de CU-13 (HU-13). El Aprobador registra la decisión en MK-05; AprobacionServicio verifica el permiso, la decisión y el motivo, usa el método INTERNO Aprobacion.existeDecisionDeSolicitud(), consulta la solicitud con SolicitudServicio y al aprobador con UsuarioServicio, e invoca Aprobacion.decidir(). El último fragmento alt no es un rechazo: distingue la decisión Aprobada (paso 8) de la Rechazada (flujo 2a), que deja la solicitud en uno u otro estado. La Tabla 4 detalla cada mensaje.
 
**Figura ****2****.*** Diagrama de secuencia de CU-13 Registrar decisión sobre una solicitud*
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de validar) a partir de CU-13 en el Word de casos de uso, la Figura 3 y la Tabla 4 de 3.5, las Tablas 3, 4 y 5 de 3.6, el diagrama de clases (v6 con CRF-003) y la sección 3.8. restr. dicc. = restricción del diccionario de datos.*
 
El cambio de la solicitud a Aprobada o Rechazada ocurre dentro de Aprobacion.decidir(), como indica la nota del diagrama de clases; no se dibuja un mensaje aparte porque el diagrama de clases no tiene un método de Solicitud para ese cambio. CU-13 no registra auditoría, porque ninguno de sus RF la enuncia (HAL-31; P-89). El permiso para rechazar sigue abierto (P-RP1).
 
**Tabla ****4****.*** Mensajes del diagrama de secuencia de CU-13*
 
| **N.º** | **Emisor → receptor** | **Mensaje** | **Paso o flujo del CU** | **RN (ficha) y RF** | **M-xx** |
| --- | --- | --- | --- | --- | --- |
| 1 | Aprobador → MK-05 | Acción en la pantalla: registra ID_Solicitud, ID_Aprobador, Decision y Motivo_Rechazo (no es un método) | Pasos 1 y 2 | RF-16 | — |
| 2 | MK-05 → AprobacionControlador | AprobacionControlador.decidir(a) | Paso 2 | RF-16 | — |
| 3 | AprobacionControlador → AprobacionServicio | AprobacionServicio.decidir(a) | Paso 2 | RF-16 | — |
| 4 | AprobacionServicio → RolPermisoServicio | RolPermisoServicio.consultarPermisos(rol) | Precondición (R0) | RNF-01 (no es RN numerada); RF-166 (transversal, origen HU-38) | — |
| alt | AprobacionServicio → AprobacionControlador → MK-05 → Aprobador | [el rol no tiene el permiso] (respuesta de rechazo) | Rechazo por rol (2.4.2); termina el caso | RNF-01 (no es RN numerada); RF-166 | M-85 |
| alt | AprobacionServicio → AprobacionControlador → MK-05 → Aprobador | [Decision vacía o no válida, o Rechazada sin Motivo_Rechazo] (respuesta de rechazo) | 3a; vuelve al paso 2 | RN-AP02b; valores de Decision: restricción del diccionario; RF-81, RF-16 | M-83, M-86, M-87 |
| alt | AprobacionServicio → AprobacionControlador → MK-05 → Aprobador | [Motivo_Rechazo supera 300 caracteres] (respuesta de rechazo) | 4a; vuelve al paso 2 | restricción del diccionario; RF-16 | M-84 |
| 5 | AprobacionServicio → Aprobacion | Aprobacion.existeDecisionDeSolicitud(idSolicitud) | Paso 5 | RF-82 | — |
| alt | AprobacionServicio → AprobacionControlador → MK-05 → Aprobador | [la solicitud ya tiene decisión] (respuesta de rechazo) | 5a; vuelve al paso 2 | RN-AP06a; RF-82 | M-88 |
| 6 | AprobacionServicio → SolicitudServicio | SolicitudServicio.buscarPorId(idSolicitud) | Paso 6 | RF-82; RF-16 | — |
| alt | AprobacionServicio → AprobacionControlador → MK-05 → Aprobador | [solicitud inexistente o no Pendiente] (respuesta de rechazo) | 6a; vuelve al paso 2 | RN-AP09, RN-AP06a; restricción del diccionario (FK) para la inexistente; RF-82, RF-16 | M-74, M-89 |
| 7 | AprobacionServicio → UsuarioServicio | UsuarioServicio.buscarPorId(idAprobador) | Paso 7 | RF-83, RF-84, RF-169 | — |
| alt | AprobacionServicio → AprobacionControlador → MK-05 → Aprobador | [aprobador inexistente, inactivo, sin rol Aprobador o distinto del usuario en sesión] (respuesta de rechazo) | 7a; vuelve al paso 2 | RN-AP11a, RN-AP12a; el rol lo mide RNF-01 (RF-166); RF-83, RF-84, RF-169 | M-39, M-40, M-85, M-273 |
| 8 | AprobacionServicio → Aprobacion | Aprobacion.decidir(a) | Paso 8 | RF-16, RF-86 | — |
| alt | — | [Decision = Aprobada] / [Decision = Rechazada] (ramifica el estado resultante) | Paso 8 y 2a | sin RN; ramifica el flujo (2a); RF-81, RF-86 | M-82 |
| — | AprobacionServicio → AprobacionControlador → MK-05 → Aprobador | Respuesta de éxito: M-82 Decisión registrada correctamente. | Paso 8 y 2a | RF-16 | M-82 |
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de validar) a partir de CU-13 en el Word de casos de uso, la Tabla 4 de 3.5, el documento de RN (fichas), la tabla C.1 del Consolidado de 46 HU y la Tabla 53 (mensajes M-01 a M-273). † = RN sin ficha en el documento de RN. RF-166 es transversal: su historia de origen es HU-38, no la del caso.*
 
## 3.7.3 CU-15 Asignar equipo a una solicitud aprobada
 
La Figura 3 muestra la secuencia de CU-15 (HU-15). El Responsable de Activos registra la asignación en MK-06; AsignacionServicio verifica el permiso y los datos, consulta la solicitud y el activo, usa los métodos INTERNO Asignacion.existeAsignacionDeSolicitud() y Asignacion.activoDisponible(), invoca Asignacion.asignar() y registra la auditoría con la acción Asignar (RF-161, RN-T02a; decisión T-2 provisional). La Tabla 5 detalla cada mensaje.
 
**Figura ****3****.*** Diagrama de secuencia de CU-15 Asignar equipo a una solicitud aprobada*
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de validar) a partir de CU-15 en el Word de casos de uso, la Figura 4 y la Tabla 5 de 3.5, las Tablas 3, 4 y 5 de 3.6, el diagrama de clases (v6 con CRF-003) y la sección 3.8. restr. dicc. = restricción del diccionario de datos.*
 
El paso del activo a Asignado y la copia de ID_Custodio desde la solicitud son poscondiciones de Asignacion.asignar() (CRF-003, alternativa A1; 3.8: F1-T2), por lo que no hay un mensaje a ActivoServicio para cambiar el estado. La existencia del activo se verifica con ActivoServicio.buscarPorId() y su disponibilidad con el método INTERNO Asignacion.activoDisponible(); la categoría (flujo 7a) se compara con los objetos ya obtenidos en los mensajes 5 y 7.
 
**Tabla ****5****.*** Mensajes del diagrama de secuencia de CU-15*
 
| **N.º** | **Emisor → receptor** | **Mensaje** | **Paso o flujo del CU** | **RN (ficha) y RF** | **M-xx** |
| --- | --- | --- | --- | --- | --- |
| 1 | Responsable de Activos → MK-06 | Acción en la pantalla: registra ID_Solicitud, ID_Activo y Fecha_Devolucion_Esperada (no es un método) | Pasos 1 y 2 | RF-18 | — |
| 2 | MK-06 → AsignacionControlador | AsignacionControlador.asignar(a) | Paso 2 | RF-18 | — |
| 3 | AsignacionControlador → AsignacionServicio | AsignacionServicio.asignar(a) | Paso 2 | RF-18 | — |
| 4 | AsignacionServicio → RolPermisoServicio | RolPermisoServicio.consultarPermisos(rol) | Precondición (R0) | RNF-01 (no es RN numerada); RF-166 (transversal, origen HU-38) | — |
| alt | AsignacionServicio → AsignacionControlador → MK-06 → Responsable de Activos | [el rol no tiene el permiso] (respuesta de rechazo) | Rechazo por rol (2.4.2); termina el caso | RNF-01 (no es RN numerada); RF-166 | Mensaje propuesto, sin número (2.4.2) |
| alt | AsignacionServicio → AsignacionControlador → MK-06 → Responsable de Activos | [ID_Solicitud, ID_Activo o Fecha_Devolucion_Esperada vacío] (respuesta de rechazo) | 3a; vuelve al paso 2 | restricción del diccionario; RF-18 | M-94, M-95, M-96 |
| 5 | AsignacionServicio → SolicitudServicio | SolicitudServicio.buscarPorId(idSolicitud) | Paso 4 | RF-87; RF-18 | — |
| alt | AsignacionServicio → AsignacionControlador → MK-06 → Responsable de Activos | [solicitud inexistente o no Aprobada] (respuesta de rechazo) | 4a; vuelve al paso 2 | RN-AS04; restricción del diccionario (FK) para la inexistente; RF-87, RF-18 | M-74, M-97 |
| 6 | AsignacionServicio → Asignacion | Asignacion.existeAsignacionDeSolicitud(idSolicitud) | Paso 5 | RF-88 | — |
| alt | AsignacionServicio → AsignacionControlador → MK-06 → Responsable de Activos | [la solicitud ya tiene asignación] (respuesta de rechazo) | 5a; vuelve al paso 2 | RN-AS05a; RF-88 | M-98 |
| 7 | AsignacionServicio → ActivoServicio | ActivoServicio.buscarPorId(idActivo) | Paso 6 | RF-89; RF-18 | — |
| 8 | AsignacionServicio → Asignacion | Asignacion.activoDisponible(idActivo) | Paso 6 | RF-89 | — |
| alt | AsignacionServicio → AsignacionControlador → MK-06 → Responsable de Activos | [activo inexistente o no Disponible] (respuesta de rechazo) | 6a; vuelve al paso 2 | RN-AS07a; restricción del diccionario (FK) para el inexistente; RF-89, RF-18 | M-21, M-99 |
| alt | AsignacionServicio → AsignacionControlador → MK-06 → Responsable de Activos | [la categoría del activo no es la de la solicitud] (respuesta de rechazo) | 7a; vuelve al paso 2 | RN-AS08; RF-90 | M-100 |
| alt | AsignacionServicio → AsignacionControlador → MK-06 → Responsable de Activos | [Fecha_Devolucion_Esperada anterior a la fecha de entrega] (respuesta de rechazo) | 8a; vuelve al paso 2 | sin RN; condición enunciada por RF-18; la coherencia entre fechas no está en el Diccionario v7 (propuesta MOD-01) | M-101 |
| 9 | AsignacionServicio → Asignacion | Asignacion.asignar(a) | Paso 9 | RF-18, RF-91 | — |
| 10 | AsignacionServicio → AuditoriaServicio | AuditoriaServicio.registrar(aud) | Poscondición (Accion = Asignar) | RN-T02a; RF-161 | — |
| — | AsignacionServicio → AsignacionControlador → MK-06 → Responsable de Activos | Respuesta de éxito: M-93 Equipo asignado correctamente. | Paso 9 | RF-18, RF-91 | M-93 |
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de validar) a partir de CU-15 en el Word de casos de uso, la Tabla 5 de 3.5, el documento de RN (fichas), la tabla C.1 del Consolidado de 46 HU y la Tabla 53 (mensajes M-01 a M-273). † = RN sin ficha en el documento de RN. RF-166 es transversal: su historia de origen es HU-38, no la del caso.*
 
## 3.7.4 Observaciones
 
Cantidad de diagramas: en la clase del 23/10/2026 la docente sugirió de palabra que podrían documentarse 4 casos por el tiempo disponible; el equipo decidió mantener los 6 casos documentados. Es una sugerencia verbal, no un requisito escrito.
 
Esta sección no usa los métodos propuestos en CRF-004 (MOD-30) ni cambios de tipo de retorno: todos los mensajes son métodos del diagrama de clases v6 con CRF-003. Ningún diagrama de este bloque necesitó un método nuevo.
 
Las llamadas de un Servicio a otro (por ejemplo, de SolicitudServicio a CustodioServicio) no repiten la verificación de permiso: el permiso se verifica una sola vez por petición del actor (en CU-24, una en cada una de sus dos peticiones, mensajes 4 y 9), para el usuario con sesión y la operación del caso (CRI-01, RF-166). Propuesta del equipo, pendiente de la docente.
 
El orden de las verificaciones sigue el orden de los pasos de cada caso de uso; la precedencia entre rechazos no está fijada en los RF (HAL-28, HAL-37), por lo que el orden mostrado es propuesta del equipo.
 
Si la versión aprobada de la sección 3.5 cambia un rombo, el fragmento alt correspondiente se ajustará en esta sección. Propuesta del equipo, pendiente de la docente.
 
## 3.7.5 Supuestos y preguntas abiertas del bloque 1
 
La Tabla 6 reúne los supuestos de esta sección y las preguntas que siguen abiertas, con quién debe resolverlas; ninguna se resuelve aquí.
 
**Tabla ****6****.*** Supuestos y preguntas abiertas de los diagramas de secuencia (bloque 1)*
 
| **N.º** | **Supuesto o pregunta abierta** | **Corresponde a** |
| --- | --- | --- |
| 1 | El Servicio como parte de la lógica del modelo y el Controlador que recibe la operación con el mismo nombre que la clase. | Docente |
| 2 | Matriz rol–operación sin validar: condiciona el fragmento de rechazo por rol de los tres diagramas (P-75, P-77, P-100); el rechazo por rol de CU-09 y CU-15 no tiene número de mensaje, y el permiso para rechazar en CU-13 es P-RP1. | Cliente |
| 3 | ID_Custodio digitado frente a tomado de la sesión en CU-09 (COR-23, RF-168, P-105). | Cliente; equipo |
| 4 | Qué operaciones se auditan: CU-09 y CU-13 no registran auditoría; CU-15 la registra con la acción Asignar (P-89; decisión T-2 provisional). | Cliente; docente |
| 5 | Coherencia entre Fecha_Devolucion_Esperada y Fecha_Entrega en CU-15 (flujo 8a): el Diccionario v7 no la define; propuesta MOD-01. | Cliente |
| 6 | Llamadas entre Servicios sin nueva verificación de permiso. | Docente; equipo |
| 7 | El rol y el identificador del usuario en sesión llegan con la petición; el vencimiento de la sesión no se dibuja (RNF-02, P-70). | Cliente |
| 8 | Mantener 6 diagramas frente a la sugerencia verbal de reducir a 4. | Docente |
 
*Fuente: elaboración propia. Nada de lo anterior está validado por el cliente ni por la docente.*
 
## 3.7.6 CU-24 Confirmar recepción de una devolución
 
El diagrama de CU-24 (HU-24) se presenta en dos figuras. La Figura 4 muestra la primera llamada: MK-09 invoca DevolucionControlador.buscarPorId() y DevolucionServicio verifica el permiso y la devolución con Devolucion.buscarPorId(); si la devolución ya está Confirmada (flujo 3a) o no existe (flujo 4a) se responde M-153 o M-141 y no se muestra el aviso. Solo si está Pendiente, MK-09 muestra el aviso M-151, y el desistimiento (flujo 7a) lo responde la Vista sin llamar al Controlador. La Figura 5 muestra la segunda llamada, DevolucionServicio.confirmarRecepcion(), que vuelve a verificar el permiso, la devolución y el receptor (UsuarioServicio.buscarPorId()), invoca Devolucion.confirmarRecepcion(), cierra la asignación con AsignacionServicio.cerrar() como invocación del caso incluido CU-47, ramifica por el estado del activo (flujos 7b y 7c) y registra la auditoría con la acción Devolver (RF-163, RN-T02a). Ni el Controlador ni la Vista validan RN. La numeración de los mensajes sigue de una figura a la otra y la Tabla 7 reúne todos los mensajes con la figura en que aparece cada uno.
 
**Figura ****4****.*** Diagrama de secuencia de CU-24 Confirmar recepción de una devolución (1 de 2)*
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de validar) a partir de CU-24 en el Word de casos de uso, la Figura 6 y la Tabla 7 de 3.5, las Tablas 3, 4 y 5 de 3.6, el diagrama de clases (v6 con CRF-003), los mockups 2.5 y la sección 3.8.*
 
**Figura ****5****.*** Diagrama de secuencia de CU-24 Confirmar recepción de una devolución (2 de 2)*
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de validar) a partir de CU-24 en el Word de casos de uso, la Figura 6 y la Tabla 7 de 3.5, las Tablas 3, 4 y 5 de 3.6, el diagrama de clases (v6 con CRF-003), los mockups 2.5 y la sección 3.8.*
 
El aviso M-151 se muestra después de las verificaciones de la devolución, como en el caso de uso (pasos 3 a 6 y flujo 3a). Tres puntos quedan abiertos y se recogen en la Tabla 11. (a) Usar buscarPorId() como prevalidación es propuesta del equipo, pendiente de la docente: el diagrama de clases v6 no tiene un método dedicado. (b) La precedencia entre el paso 3 y el paso 4 de CU-24 está abierta (HAL-51); el diagrama sigue el orden del caso de uso. (c) La Tabla 3 de 3.6 asigna a MK-09 solo confirmarRecepcion(); la diferencia se propone como hallazgo nuevo (HAL), sin número. La dependencia del diagrama de clases entre Devolucion.confirmarRecepcion() y Asignacion.cerrar() (CRF-003) se dibuja como una invocación de DevolucionServicio a AsignacionServicio, como indica 3.6.4. Devolucion.buscarPorId() no figura en la fila de CU-24 de la Tabla 27 del Word de casos de uso; se usa para verificar la existencia y el estado de la devolución.
 
**Tabla ****7****.*** Mensajes del diagrama de secuencia de CU-24*
 
| **N.º** | **Emisor → receptor** | **Mensaje** | **Paso o flujo del CU** | **RN (ficha) y RF** | **M-xx** | **Figura** |
| --- | --- | --- | --- | --- | --- | --- |
| 1 | Responsable de Activos → MK-09 | Acción en la pantalla: la devolución que confirma (MK-09 se abre desde MK-08) (no es un método) | Pasos 1 y 2 | RF-27 | — | Fig. 4 |
| 2 | MK-09 → DevolucionControlador | DevolucionControlador.buscarPorId(idDevolucion) (prevalidación; propuesta del equipo) | Pasos 3 y 4 | RF-115; RF-27 | — | Fig. 4 |
| 3 | DevolucionControlador → DevolucionServicio | DevolucionServicio.buscarPorId(idDevolucion) | Pasos 3 y 4 | RF-115; RF-27 | — | Fig. 4 |
| 4 | DevolucionServicio → RolPermisoServicio | RolPermisoServicio.consultarPermisos(rol) | Precondición (R0) | RNF-01 (no es RN numerada); RF-166 (transversal, origen HU-38) | — | Fig. 4 |
| alt | DevolucionServicio → DevolucionControlador → MK-09 → Responsable de Activos | [el rol no tiene el permiso] (respuesta) | Rechazo por rol (2.4.2); termina el caso | RNF-01 (no es RN numerada); RF-166 | M-154 | Fig. 4 |
| 5 | DevolucionServicio → Devolucion | Devolucion.buscarPorId(idDevolucion) | Pasos 3 y 4 | RF-115; RF-27 | — | Fig. 4 |
| alt | DevolucionServicio → DevolucionControlador → MK-09 → Responsable de Activos | [la devolución ya está Confirmada] (respuesta; no se muestra el aviso) | 3a; vuelve al paso 2 | RN-D11b; RF-115 | M-153 | Fig. 4 |
| alt | DevolucionServicio → DevolucionControlador → MK-09 → Responsable de Activos | [la devolución no existe] (respuesta; no se muestra el aviso) | 4a; vuelve al paso 2 | sin RN; condición enunciada por el RF; RF-27 | M-141 | Fig. 4 |
| — | DevolucionServicio → DevolucionControlador → MK-09 | Respuesta: la devolución Pendiente (d) | Pasos 3 y 4 | RF-27 | — | Fig. 4 |
| — | MK-09 → Responsable de Activos | Aviso en pantalla (no es un método; sin llamada al Controlador) | Paso 6 | RF-118 | M-151 | Fig. 4 |
| alt | MK-09 → Responsable de Activos | [el Responsable de Activos desiste] (respuesta de la Vista, sin llamada al Servicio) | 7a; termina sin cambios | sin RN; condición enunciada por el RF; RF-118 | M-152 | Fig. 4 |
| 6 | Responsable de Activos → MK-09 | Acción en la pantalla: la confirmación tras el aviso (no es un método) | Paso 7 | RF-118 | — | Fig. 5 |
| 7 | MK-09 → DevolucionControlador | DevolucionControlador.confirmarRecepcion(idDevolucion, idReceptor) | Paso 7 | RF-27, RF-170 | — | Fig. 5 |
| 8 | DevolucionControlador → DevolucionServicio | DevolucionServicio.confirmarRecepcion(idDevolucion, idReceptor) | Paso 7 | RF-27, RF-170 | — | Fig. 5 |
| 9 | DevolucionServicio → RolPermisoServicio | RolPermisoServicio.consultarPermisos(rol) | Precondición (R0), nueva verificación | RNF-01 (no es RN numerada); RF-166 (transversal, origen HU-38) | — | Fig. 5 |
| alt | DevolucionServicio → DevolucionControlador → MK-09 → Responsable de Activos | [el rol no tiene el permiso] (respuesta) | Rechazo por rol (2.4.2); termina el caso | RNF-01 (no es RN numerada); RF-166 | M-154 | Fig. 5 |
| 10 | DevolucionServicio → Devolucion | Devolucion.buscarPorId(idDevolucion) (se vuelve a validar) | Paso 3, nueva verificación | RF-115 | — | Fig. 5 |
| alt | DevolucionServicio → DevolucionControlador → MK-09 → Responsable de Activos | [la devolución ya está Confirmada] (respuesta) | 3a; vuelve al paso 2 | RN-D11b; RF-115 | M-153 | Fig. 5 |
| 11 | DevolucionServicio → UsuarioServicio | UsuarioServicio.buscarPorId(idReceptor) | Paso 5 (usuario en sesión) | RF-116, RF-170 | — | Fig. 5 |
| alt | DevolucionServicio → DevolucionControlador → MK-09 → Responsable de Activos | [receptor inexistente, inactivo, sin el rol Responsable de Activos o distinto del usuario en sesión] (respuesta) | 5a; vuelve al paso 2 | RN-D14b; el rol lo mide RNF-01 (RF-166); RF-116, RF-170, RF-27 (existencia del receptor) | M-39, M-40, M-154 | Fig. 5 |
| 12 | DevolucionServicio → Devolucion | Devolucion.confirmarRecepcion(idDevolucion, idReceptor) | Paso 7 | RF-27, RF-170 | — | Fig. 5 |
| 13 | DevolucionServicio → AsignacionServicio | AsignacionServicio.cerrar(idAsignacion) («include» CU-47) | Paso 7 («include» CU-47) | RN-AS14 (guarda del cierre); RF-117 | — | Fig. 5 |
| alt | — | [activo Dañado] / [activo no Dañado] (ramifica el estado resultante) | 7b y 7c | sin RN; condición enunciada por RF-117 y CRF-003 (A1); RF-117 | M-150; M-105, M-120 (consultas posteriores del 7c) | Fig. 5 |
| 14 | DevolucionServicio → AuditoriaServicio | AuditoriaServicio.registrar(aud) | Poscondición (Accion = Devolver) | RN-T02a; RF-163 | — | Fig. 5 |
| — | DevolucionServicio → DevolucionControlador → MK-09 → Responsable de Activos | Respuesta de éxito: M-150 Recepción confirmada correctamente. | Paso 7 | RF-27, RF-117 | M-150 | Fig. 5 |
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de validar) a partir de CU-24 en el Word de casos de uso, la Tabla 7 de 3.5, el documento de RN (fichas), la tabla C.1 del Consolidado de 46 HU y la Tabla 53 (mensajes M-01 a M-273). RF-166 es transversal: su historia de origen es HU-38, no la del caso.*
 
## 3.7.7 CU-01 Registrar activo
 
La Figura 6 muestra la secuencia de CU-01 (HU-01). El Responsable de Activos registra el activo en MK-02; ActivoServicio verifica el permiso, los datos obligatorios y las longitudes, ejecuta el caso incluido CU-49 con los métodos INTERNO Activo.existeNumeroSerie() y Activo.existePlaca(), ejecuta el caso incluido CU-48 con CategoriaServicio.buscarPorId() e invoca Activo.crear(), que deja el activo Disponible. El último fragmento alt no es un rechazo: distingue el registro con ubicación (paso 7) del registro sin ella (flujo 2a). La Tabla 8 detalla cada mensaje.
 
**Figura ****6****.*** Diagrama de secuencia de CU-01 Registrar activo*
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de validar) a partir de CU-01 en el Word de casos de uso, la Figura 1 y la Tabla 2 de 3.5, las Tablas 3, 4 y 5 de 3.6, el diagrama de clases (v6 con CRF-003), los mockups 2.5 y la sección 3.8.*
 
CU-01 no registra auditoría: el alta del activo no se audita y la pregunta sigue abierta (P-89; HAL-08).
 
**Tabla ****8****.*** Mensajes del diagrama de secuencia de CU-01*
 
| **N.º** | **Emisor → receptor** | **Mensaje** | **Paso o flujo del CU** | **RN (ficha) y RF** | **M-xx** |
| --- | --- | --- | --- | --- | --- |
| 1 | Responsable de Activos → MK-02 | Acción en la pantalla: Marca, Modelo, Numero_Serie, Placa_Inventario, Ubicacion e ID_Categoria (no es un método) | Pasos 1 y 2 | RF-01 | — |
| 2 | MK-02 → ActivoControlador | ActivoControlador.crear(a) | Paso 2 | RF-01 | — |
| 3 | ActivoControlador → ActivoServicio | ActivoServicio.crear(a) | Paso 2 | RF-01 | — |
| 4 | ActivoServicio → RolPermisoServicio | RolPermisoServicio.consultarPermisos(rol) | Precondición (R0) | RNF-01 (no es RN numerada); RF-166 (transversal, origen HU-38) | — |
| alt | ActivoServicio → ActivoControlador → MK-02 → Responsable de Activos | [el rol no tiene el permiso] (respuesta) | Rechazo por rol (2.4.2); termina el caso | RNF-01 (no es RN numerada); RF-166 | Mensaje propuesto, sin número (2.4.2) |
| alt | ActivoServicio → ActivoControlador → MK-02 → Responsable de Activos | [Marca, Modelo, Numero_Serie, Placa_Inventario o ID_Categoria vacío] (respuesta) | 3a; vuelve al paso 2 | restricción del diccionario; RF-01 | M-02, M-04, M-07, M-10, M-12 |
| alt | ActivoServicio → ActivoControlador → MK-02 → Responsable de Activos | [alguna longitud supera el máximo] (respuesta) | 4a; vuelve al paso 2 | restricción del diccionario; RF-01 | M-03, M-05, M-11, M-13, M-15 |
| 5 | ActivoServicio → Activo | Activo.existeNumeroSerie(numeroSerie) («include» CU-49) | Paso 5 («include» CU-49) | RF-02 | — |
| 6 | ActivoServicio → Activo | Activo.existePlaca(placa) («include» CU-49) | Paso 5 («include» CU-49) | RF-02 | — |
| alt | ActivoServicio → ActivoControlador → MK-02 → Responsable de Activos | [Numero_Serie o Placa_Inventario ya registrados] (respuesta) | 5a; vuelve al paso 2 | RN-A03, RN-A04; RF-02 | M-06, M-14 |
| 7 | ActivoServicio → CategoriaServicio | CategoriaServicio.buscarPorId(idCategoria) («include» CU-48) | Paso 6 («include» CU-48) | RF-52; RF-01 | — |
| alt | ActivoServicio → ActivoControlador → MK-02 → Responsable de Activos | [categoría inexistente o inactiva] (respuesta) | 6a; vuelve al paso 2 | RN-A09 (inactiva); restricción del diccionario (FK) para la inexistente; RF-52, RF-01 | M-08, M-09 |
| 8 | ActivoServicio → Activo | Activo.crear(a) | Paso 7 | RF-01 | — |
| alt | — | [Ubicacion informada] / [Ubicacion vacía] (ramifica el estado resultante) | Paso 7 y 2a | restricción del diccionario (Ubicacion opcional); RF-01 | M-01 |
| — | ActivoServicio → ActivoControlador → MK-02 → Responsable de Activos | Respuesta de éxito: M-01 Activo registrado correctamente. | Paso 7 y 2a | RF-01 | M-01 |
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de validar) a partir de CU-01 en el Word de casos de uso, la Tabla 2 de 3.5, el documento de RN (fichas), la tabla C.1 del Consolidado de 46 HU y la Tabla 53 (mensajes M-01 a M-273). RF-166 es transversal: su historia de origen es HU-38, no la del caso.*
 
## 3.7.8 CU-19 Firmar acta de entrega
 
La Figura 7 muestra la secuencia de CU-19 (HU-19). El Empleado firma el acta en MK-07, que se abre desde MK-13 con la asignación precargada; ActaDeEntregaServicio verifica el permiso, los datos y las longitudes, consulta la asignación con AsignacionServicio.buscarPorId(), usa el método INTERNO Acta_De_Entrega.existeActaDeAsignacion(), compara el custodio del usuario en sesión (CustodioServicio.buscarPorUsuario()) con el de la asignación e invoca Acta_De_Entrega.firmar(). La Tabla 9 detalla cada mensaje.
 
**Figura ****7****.*** Diagrama de secuencia de CU-19 Firmar acta de entrega*
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de validar) a partir de CU-19 en el Word de casos de uso, la Figura 5 y la Tabla 6 de 3.5, las Tablas 3, 4 y 5 de 3.6, el diagrama de clases (v6 con CRF-003), los mockups 2.5 y la sección 3.8. restr. dicc. = restricción del diccionario de datos.*
 
Firmar el acta no cambia ningún estado: Acta_De_Entrega no tiene ENUM de estado y la asignación sigue Vigente. CU-19 no registra auditoría, porque ninguno de sus RF la enuncia (HAL-46).
 
**Tabla ****9****.*** Mensajes del diagrama de secuencia de CU-19*
 
| **N.º** | **Emisor → receptor** | **Mensaje** | **Paso o flujo del CU** | **RN (ficha) y RF** | **M-xx** |
| --- | --- | --- | --- | --- | --- |
| 1 | Empleado → MK-07 | Acción en la pantalla: ID_Asignacion (precargado desde MK-13), Ruta_Acta y Firma_Digital (no es un método) | Pasos 1 y 2 | RF-22 | — |
| 2 | MK-07 → ActaDeEntregaControlador | ActaDeEntregaControlador.firmar(acta) | Paso 2 | RF-22 | — |
| 3 | ActaDeEntregaControlador → ActaDeEntregaServicio | ActaDeEntregaServicio.firmar(acta) | Paso 2 | RF-22 | — |
| 4 | ActaDeEntregaServicio → RolPermisoServicio | RolPermisoServicio.consultarPermisos(rol) | Precondición (R0) | RNF-01 (no es RN numerada); RF-166 (transversal, origen HU-38) | — |
| alt | ActaDeEntregaServicio → ActaDeEntregaControlador → MK-07 → Empleado | [el rol no tiene el permiso] (respuesta) | Rechazo por rol (2.4.2); termina el caso | RNF-01 (no es RN numerada); RF-166 | Mensaje propuesto, sin número (2.4.2) |
| alt | ActaDeEntregaServicio → ActaDeEntregaControlador → MK-07 → Empleado | [ID_Asignacion, Ruta_Acta o Firma_Digital vacío] (respuesta) | 3a; vuelve al paso 2 | restricción del diccionario; RF-22 | M-122, M-123, M-125 |
| alt | ActaDeEntregaServicio → ActaDeEntregaControlador → MK-07 → Empleado | [Ruta_Acta o Firma_Digital supera 255 caracteres] (respuesta) | 4a; vuelve al paso 2 | restricción del diccionario; RF-22 | M-124, M-126 |
| 5 | ActaDeEntregaServicio → AsignacionServicio | AsignacionServicio.buscarPorId(idAsignacion) | Paso 5 | RF-104; RF-22 | — |
| alt | ActaDeEntregaServicio → ActaDeEntregaControlador → MK-07 → Empleado | [asignación inexistente o no Vigente] (respuesta) | 5a; vuelve al paso 2 | RN-AC05; restricción del diccionario (FK) para la inexistente; RF-104, RF-22 | M-108, M-127 |
| 6 | ActaDeEntregaServicio → Acta_De_Entrega | Acta_De_Entrega.existeActaDeAsignacion(idAsignacion) | Paso 6 | RF-105 | — |
| alt | ActaDeEntregaServicio → ActaDeEntregaControlador → MK-07 → Empleado | [la asignación ya tiene acta] (respuesta) | 6a; vuelve al paso 2 | RN-AC06a; RF-105 | M-128 |
| 7 | ActaDeEntregaServicio → CustodioServicio | CustodioServicio.buscarPorUsuario(idUsuario) | Paso 7 (usuario en sesión) | RF-103, RF-102 | — |
| alt | ActaDeEntregaServicio → ActaDeEntregaControlador → MK-07 → Empleado | [quien firma no es el custodio de la asignación] (respuesta) | 7a; vuelve al paso 2 | RN-AC07b, RN-AC07a; RF-103, RF-102 | M-129 |
| 8 | ActaDeEntregaServicio → Acta_De_Entrega | Acta_De_Entrega.firmar(acta) | Paso 8 | RF-22, RF-102 | — |
| — | ActaDeEntregaServicio → ActaDeEntregaControlador → MK-07 → Empleado | Respuesta de éxito: M-121 Acta firmada correctamente. | Paso 8 | RF-22 | M-121 |
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de validar) a partir de CU-19 en el Word de casos de uso, la Tabla 6 de 3.5, el documento de RN (fichas), la tabla C.1 del Consolidado de 46 HU y la Tabla 53 (mensajes M-01 a M-273). RF-166 es transversal: su historia de origen es HU-38, no la del caso.*
 
## 3.7.9 Mensaje por historia de usuario
 
La Tabla 10 da, para cada una de las 46 historias de usuario, la Clase.método de la tabla C.1 del Consolidado, sin cambios, y el mensaje de secuencia que la atiende, con la forma <Entidad>Servicio.<método público>() de la Tabla 5 de 3.6. En la columna Mensaje los métodos INTERNO no se listan como mensaje de la historia, porque los invoca el propio Servicio; sí aparecen como mensajes del Servicio al Modelo dentro de los diagramas de CU-01, CU-19 y CU-24. Si la historia tiene varios métodos públicos, se listan todos. Seis historias tienen diagrama; en las otras 40 el mensaje se deriva de la convención del DDA y la columna «Figura» dice «derivado, sin diagrama»: es trazabilidad parcial, propuesta del equipo, pendiente de validar. El aviso automático (HU-25) lo dispara el actor «Sistema», sin Vista, y no pasa por la verificación de permiso (RF-167).
 
**Tabla ****10****.*** Mensaje de secuencia por historia de usuario (propuesta del equipo, pendiente de validar)*
 
| **HU** | **Clase.método (tabla C.1)** | **Mensaje (Servicio.método())** | **Figura** |
| --- | --- | --- | --- |
| HU-01 | Activo.crear (+ existeNumeroSerie, existePlaca) | ActivoServicio.crear() | Fig. 6 |
| HU-02 | Activo.buscarPorId, buscarPorNumeroSerie, buscarPorPlaca, listarInventario | ActivoServicio.buscarPorId(), ActivoServicio.buscarPorNumeroSerie(), ActivoServicio.buscarPorPlaca(), ActivoServicio.listarInventario() | derivado, sin diagrama |
| HU-03 | Activo.actualizar (+ existeNumeroSerie, existePlaca) | ActivoServicio.actualizar() | derivado, sin diagrama |
| HU-04 | Activo.darDeBaja | ActivoServicio.darDeBaja() | derivado, sin diagrama |
| HU-05 | Custodio.crear (+ existeCustodioDeUsuario, existeDocumento) | CustodioServicio.crear() | derivado, sin diagrama |
| HU-06 | Custodio.buscarPorId, buscarPorUsuario, buscarPorDocumento | CustodioServicio.buscarPorId(), CustodioServicio.buscarPorUsuario(), CustodioServicio.buscarPorDocumento() | derivado, sin diagrama |
| HU-07 | Custodio.actualizar (+ existeDocumento) | CustodioServicio.actualizar() | derivado, sin diagrama |
| HU-08 | Custodio.inactivar | CustodioServicio.inactivar() | derivado, sin diagrama |
| HU-09 | Solicitud.crear | SolicitudServicio.crear() | Fig. 1 |
| HU-10 | Solicitud.buscarPorId, listarPorCustodio, listarPendientes, listarAprobadas (adenda CRF-003) | SolicitudServicio.buscarPorId(), SolicitudServicio.listarPorCustodio(), SolicitudServicio.listarPendientes(), SolicitudServicio.listarAprobadas() | derivado, sin diagrama |
| HU-11 | Solicitud.actualizar | SolicitudServicio.actualizar() | derivado, sin diagrama |
| HU-12 | Solicitud.cancelar | SolicitudServicio.cancelar() | derivado, sin diagrama |
| HU-13 | Aprobacion.decidir (+ existeDecisionDeSolicitud) | AprobacionServicio.decidir() | Fig. 2 |
| HU-14 | Aprobacion.buscarPorSolicitud | AprobacionServicio.buscarPorSolicitud() | derivado, sin diagrama |
| HU-15 | Asignacion.asignar (+ existeAsignacionDeSolicitud, activoDisponible) | AsignacionServicio.asignar() | Fig. 3 |
| HU-16 | Asignacion.buscarPorId, listarVigentes, listarPorCustodio, buscarVigentePorActivo | AsignacionServicio.buscarPorId(), AsignacionServicio.listarVigentes(), AsignacionServicio.listarPorCustodio(), AsignacionServicio.buscarVigentePorActivo() | derivado, sin diagrama |
| HU-17 | Asignacion.actualizar | AsignacionServicio.actualizar() | derivado, sin diagrama |
| HU-18 | Asignacion.cerrar | AsignacionServicio.cerrar() | derivado, sin diagrama |
| HU-19 | Acta_De_Entrega.firmar (+ existeActaDeAsignacion) | ActaDeEntregaServicio.firmar() | Fig. 7 |
| HU-20 | Acta_De_Entrega.buscarPorAsignacion | ActaDeEntregaServicio.buscarPorAsignacion() | derivado, sin diagrama |
| HU-21 | Devolucion.registrar (+ existeDevolucionDeAsignacion) | DevolucionServicio.registrar() | derivado, sin diagrama |
| HU-22 | Devolucion.buscarPorId, listarPendientesDeRecepcion | DevolucionServicio.buscarPorId(), DevolucionServicio.listarPendientesDeRecepcion() | derivado, sin diagrama |
| HU-23 | Devolucion.actualizar | DevolucionServicio.actualizar() | derivado, sin diagrama |
| HU-24 | Devolucion.confirmarRecepcion (invoca Asignacion.cerrar) | DevolucionServicio.buscarPorId() (prevalidación, propuesta del equipo) y DevolucionServicio.confirmarRecepcion(); dentro de esta operación, AsignacionServicio.cerrar() (CRF-003) | Figs. 4 y 5 |
| HU-25 | Notificacion_De_Devolucion.generarAviso (+ calcularDiasRestantes) | NotificacionDeDevolucionServicio.generarAviso() (actor Sistema, sin Vista; sin verificación de permiso, RF-167) | derivado, sin diagrama |
| HU-26 | Reporte_de_Danios.crear | ReporteDeDaniosServicio.crear() | derivado, sin diagrama |
| HU-27 | Reporte_de_Danios.buscarPorId, listarReportes | ReporteDeDaniosServicio.buscarPorId(), ReporteDeDaniosServicio.listarReportes() | derivado, sin diagrama |
| HU-28 | Reporte_de_Danios.actualizar | ReporteDeDaniosServicio.actualizar() | derivado, sin diagrama |
| HU-29 | Historial_Mantenimientos.crear | HistorialMantenimientosServicio.crear() | derivado, sin diagrama |
| HU-30 | Historial_Mantenimientos.buscarPorId, listarPorActivo | HistorialMantenimientosServicio.buscarPorId(), HistorialMantenimientosServicio.listarPorActivo() | derivado, sin diagrama |
| HU-31 | Historial_Mantenimientos.actualizar | HistorialMantenimientosServicio.actualizar() | derivado, sin diagrama |
| HU-32 | Usuario.crear (+ existeEmail) | UsuarioServicio.crear() | derivado, sin diagrama |
| HU-33 | Usuario.buscarPorId, buscarPorEmail | UsuarioServicio.buscarPorId(), UsuarioServicio.buscarPorEmail() | derivado, sin diagrama |
| HU-34 | Usuario.actualizar (+ existeEmail) | UsuarioServicio.actualizar() | derivado, sin diagrama |
| HU-35 | Usuario.inactivar | UsuarioServicio.inactivar() | derivado, sin diagrama |
| HU-36 | Usuario.iniciarSesion | UsuarioServicio.iniciarSesion() | derivado, sin diagrama |
| HU-37 | Usuario.cambiarContrasena | UsuarioServicio.cambiarContrasena() | derivado, sin diagrama |
| HU-38 | Rol_Permiso.asignar (+ existeAsignacion) | RolPermisoServicio.asignar() | derivado, sin diagrama |
| HU-39 | Rol_Permiso.retirar | RolPermisoServicio.retirar() | derivado, sin diagrama |
| HU-40 | Rol_Permiso.consultarPermisos | RolPermisoServicio.consultarPermisos() | derivado, sin diagrama |
| HU-41 | Categoria.crear (+ existeNombreCategoria) | CategoriaServicio.crear() | derivado, sin diagrama |
| HU-42 | Categoria.buscarPorId, listarActivas | CategoriaServicio.buscarPorId(), CategoriaServicio.listarActivas() | derivado, sin diagrama |
| HU-43 | Categoria.actualizar (+ existeNombreCategoria) | CategoriaServicio.actualizar() | derivado, sin diagrama |
| HU-44 | Categoria.inactivar | CategoriaServicio.inactivar() | derivado, sin diagrama |
| HU-45 | Auditoria.buscarPorId (registrar() es INTERNO, sin HU) | AuditoriaServicio.buscarPorId() | derivado, sin diagrama |
| HU-46 | Reportes.consultar | ReportesServicio.consultar() | derivado, sin diagrama |
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de validar) a partir de la tabla C.1 del Consolidado de 46 HU (columna Clase.método, sin cambios) y de las Tablas 4 y 5 de 3.6. «Derivado, sin diagrama»: mensaje deducido de la convención **<**Entidad**>**Servicio del DDA, sin diagrama de secuencia (trazabilidad parcial).*
 
## 3.7.10 Supuestos y preguntas abiertas del bloque 2
 
La Tabla 11 reúne los supuestos de esta parte y las preguntas que siguen abiertas, con quién debe resolverlas; ninguna se resuelve aquí.
 
**Tabla ****11****.*** Supuestos y preguntas abiertas de los diagramas de secuencia (bloque 2)*
 
| **N.º** | **Supuesto o pregunta abierta** | **Corresponde a** |
| --- | --- | --- |
| 1 | CU-24 se presenta en dos figuras porque el diagrama completo no cabe en 22,8 x 14 cm con letra de 9 pt o más; propuesta del equipo, pendiente de la docente. | Docente |
| 2 | CU-24: (a) DevolucionServicio.buscarPorId() como prevalidación antes del aviso M-151 es propuesta del equipo, pendiente de la docente; el diagrama de clases v6 no tiene un método dedicado. (b) La precedencia entre el paso 3 (devolución ya confirmada) y el paso 4 (devolución inexistente) está abierta (HAL-51); el diagrama sigue el caso de uso. (c) La Tabla 3 de 3.6 asigna a MK-09 solo confirmarRecepcion(); la diferencia se propone como HAL nuevo, sin número. | Docente; equipo |
| 3 | CU-24: DevolucionServicio invoca AsignacionServicio.cerrar() para realizar la dependencia Devolucion.confirmarRecepcion() → Asignacion.cerrar() del diagrama de clases (CRF-003; 3.6.4). | Docente |
| 4 | CU-24: Devolucion.buscarPorId() se usa para verificar la devolución (pasos 3 y 4) y no figura en la fila de CU-24 de la Tabla 27. | Equipo |
| 5 | Mensaje por HU: 40 de las 46 filas son mensajes derivados de la convención del DDA, sin diagrama (trazabilidad parcial). | Docente |
| 6 | Auditoría: CU-24 la registra con la acción Devolver (RF-163); CU-01 y CU-19 no la registran (P-89; HAL-08, HAL-46). | Cliente; docente |
| 7 | Matriz rol–operación sin validar (P-75); el rechazo por rol de CU-01 y CU-19 no tiene número de mensaje, y el permiso más cercano para confirmar la recepción es Devolver (P-RP2). | Cliente |
| 8 | HU-25: el aviso automático lo dispara el actor «Sistema», sin Vista y sin verificación de permiso (RF-167; decisión T-8 provisional; P-44). | Cliente |
| 9 | CU-01 y CU-19 incluyen mensajes que la Tabla 27 del Word de CU no lista para sus HU: CategoriaServicio.buscarPorId() (CU-48; RF-52), AsignacionServicio.buscarPorId() (RF-104) y CustodioServicio.buscarPorUsuario() (RF-103, RF-102); propuesta del equipo, pendiente de la docente. | Equipo |
 