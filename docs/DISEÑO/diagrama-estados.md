# 3.8 Diagramas de Estados
 
Esta sección presenta los diagramas de estados de las cuatro entidades cuyo ciclo de vida lo gobierna una enumeración de estado en el Diccionario v7: Activo (Estado_Activo), Solicitud (Estado_Solicitud), Asignacion (Estado_Asignacion) y Devolucion (Estado_Recepcion), como resume la Tabla 1. Los otros ocho enumerados del modelo (Nombre_Rol, Nombre_Permiso, Accion_Auditoria, Decision, Tipo_Documento, Tipo_Danio, Tipo_Mantenimiento y Tipo_Reporte) clasifican y no describen un ciclo de vida, por lo que no tienen diagrama. Esta selección es propuesta del equipo, pendiente de confirmar con la docente, y nada de lo que se muestra aquí está validado por el cliente.
 
Cada transición se identifica con la letra T y un número, se escribe como evento Clase.método(), lleva entre corchetes las reglas de negocio (RN) que la vigilan y tiene un gestor (HU y RF) o, cuando es consecuencia de otro método, la justificación de transición automática. El círculo negro es el estado inicial que asigna el sistema al crear el registro. Ninguna entidad se elimina: la baja y la cancelación son estados (la excepción documentada, Rol_Permiso.retirar(), RN-RP06†, no tiene ENUM de estado y no entra aquí; † = RN que no tiene ficha en el documento de RN).
 
**Tabla ****1****.** *Resumen de los diagramas de estados de la sección 3.8*
 
| **Entidad.atributo** | **Valores del ENUM** | **Transiciones (con la de creación)** | **Figura** | **Tabla** |
| --- | --- | --- | --- | --- |
| Activo.Estado_Activo | Disponible, Asignado, Dañado, Baja | 8 | Figura 1 | Tabla 2 |
| Solicitud.Estado_Solicitud | Pendiente, Aprobada, Rechazada, Cancelada | 4 | Figura 2 | Tabla 3 |
| Asignacion.Estado_Asignacion | Vigente, Cerrada | 2 | Figura 3 | Tabla 4 |
| Devolucion.Estado_Recepcion | Pendiente, Confirmada | 2 | Figura 4 | Tabla 5 |
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de validar con el cliente) a partir del Diccionario v7 y del diagrama de clases (v6 con CRF-003).*
 
## 3.8.1 Activo.Estado_Activo
 
Un activo nace Disponible (T1). Como muestra la Figura 1, Asignado, Dañado y Disponible se alcanzan por poscondiciones de otras clases (T2, T3 y T4; CRF-003, alternativa A1), automáticas respecto del activo; la corrección manual entre Disponible y Dañado (T5 y T6) y la baja (T7 y T8) las pide el Responsable de Activos. La Tabla 2 detalla las ocho transiciones; Dañado tiene dos salidas documentadas (T6 y T8) y Baja es terminal (RN-A18).
 
**Figura ****1****.** *Diagrama de estados de Activo (Estado_Activo)*
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de validar con el cliente) a partir del Diccionario v7, el diagrama de clases (v6 con CRF-003), el Consolidado de 46 HU y el documento de RN. † RN citada en las HU, en el Consolidado o en esta sección que no tiene ficha en el documento de RN.*
 
**Tabla ****2****.** *Transiciones de Activo.Estado_Activo*
 
| **Origen** | **Evento Clase.método** | **Guarda (RN)** | **Destino** | **Gestor HU/RF o justificación** |
| --- | --- | --- | --- | --- |
| [*] | T1 · Activo.crear() | RN-A03, RN-A04, RN-A09; estado inicial asignado por el sistema (RN-A06†) | Disponible | HU-01 · RF-01. El estado inicial lo asigna el sistema al crear (Diccionario v7). |
| Disponible | T2 · Asignacion.asignar() | RN-AS07a, RN-AS04, RN-A16b; efecto: RN-AS11† | Asignado | HU-15 · RF-91, RF-18. Automática: poscondición de Asignacion.asignar() (CRF-003, A1). |
| Asignado | T3 · Devolucion.confirmarRecepcion() (invoca Asignacion.cerrar()) | RN-AS14, RN-D11b; efecto: RN-D15†, RN-AS15†; si el activo está Dañado conserva Dañado | Disponible | HU-24 · RF-117; HU-18 · RF-99. Automática: poscondición del cierre de la asignación (CRF-003, A1). |
| Asignado | T4 · Reporte_de_Danios.crear() | RN-RD07a, RN-A18; efecto: RN-RD09† | Dañado | HU-26 · RF-122. Automática: poscondición de Reporte_de_Danios.crear() (CRF-003, A1); la asignación sigue Vigente. |
| Disponible | T5 · Activo.actualizar() | RN-A16b, RN-A16a, RN-A18 | Dañado | HU-03 · RF-54, RF-60 (HU-03 CA-5). |
| Dañado | T6 · Activo.actualizar() | RN-A16a (sin asignación Vigente), RN-A16b, RN-A18 | Disponible | HU-03 · RF-54, RF-60 (HU-03 CA-1; CRF-003, cuestión 1.1, alternativa M-a, RN-H12†). |
| Disponible | T7 · Activo.darDeBaja() | RN-A19, RN-A18 | Baja | HU-04 · RF-05, RF-57, RF-58, RF-59. |
| Dañado | T8 · Activo.darDeBaja() | RN-A19 (sin asignación Vigente), RN-A18 | Baja | HU-04 · RF-05, RF-57, RF-58, RF-59 (HU-04 CA-1, ejemplo con activo Dañado). |
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de validar con el cliente) a partir del Diccionario v7, el diagrama de clases (v6 con CRF-003), el Consolidado de 46 HU (tabla C.1 y criterios de aceptación), el documento de RF y el documento de RN. † RN citada en las HU, en el Consolidado o en esta sección que no tiene ficha en el documento de RN. [*] = estado inicial.*
 
## 3.8.2 Solicitud.Estado_Solicitud
 
La Figura 2 muestra que una solicitud nace Pendiente (T1) y sale de ese estado una sola vez: por la decisión del Aprobador, que la deja Aprobada o Rechazada (T2 y T3, automáticas al registrar la Aprobacion), o por la cancelación del empleado (T4). La Tabla 3 detalla las cuatro transiciones. Aprobada, Rechazada y Cancelada no tienen salida documentada.
 
**Figura ****2****.** *Diagrama de estados de Solicitud (Estado_Solicitud)*
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de validar con el cliente) a partir del Diccionario v7, el diagrama de clases (v6 con CRF-003), el Consolidado de 46 HU y el documento de RN. † RN citada en las HU, en el Consolidado o en esta sección que no tiene ficha en el documento de RN.*
 
**Tabla ****3****.** *Transiciones de Solicitud.Estado_Solicitud*
 
| **Origen** | **Evento Clase.método** | **Guarda (RN)** | **Destino** | **Gestor HU/RF o justificación** |
| --- | --- | --- | --- | --- |
| [*] | T1 · Solicitud.crear() | RN-S07, RN-S09, RN-S10b; estado inicial asignado por el sistema | Pendiente | HU-09 · RF-11. El estado inicial lo asigna el sistema al crear (Diccionario v7). |
| Pendiente | T2 · Aprobacion.decidir() con Decision = Aprobada | RN-AP09, RN-AP11a, RN-AP12a | Aprobada | HU-13 · RF-16, RF-86. Automática: al registrar la Aprobacion, la Solicitud pasa a Aprobada (Diccionario v7). |
| Pendiente | T3 · Aprobacion.decidir() con Decision = Rechazada | RN-AP02b (motivo obligatorio), RN-AP09, RN-AP11a | Rechazada | HU-13 · RF-16, RF-81, RF-86. Automática: al registrar la Aprobacion, la Solicitud pasa a Rechazada (Diccionario v7). |
| Pendiente | T4 · Solicitud.cancelar() | RN-S14, RN-S19 | Cancelada | HU-12 · RF-15, RF-78, RF-80. |
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de validar con el cliente) a partir del Diccionario v7, el diagrama de clases (v6 con CRF-003), el Consolidado de 46 HU (tabla C.1 y criterios de aceptación), el documento de RF y el documento de RN. † RN citada en las HU, en el Consolidado o en esta sección que no tiene ficha en el documento de RN. [*] = estado inicial.*
 
## 3.8.3 Asignacion.Estado_Asignacion
 
La Figura 3 muestra el ciclo de la asignación: nace Vigente al asignar el equipo (T1) y pasa a Cerrada con cerrar() (T2), que solo procede con una Devolucion Confirmada. La Tabla 4 detalla las dos transiciones. Cerrada no tiene salida documentada (RN-AS13b).
 
**Figura ****3****.** *Diagrama de estados de Asignacion (Estado_Asignacion)*
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de validar con el cliente) a partir del Diccionario v7, el diagrama de clases (v6 con CRF-003), el Consolidado de 46 HU y el documento de RN. † RN citada en las HU, en el Consolidado o en esta sección que no tiene ficha en el documento de RN.*
 
**Tabla ****4****.** *Transiciones de Asignacion.Estado_Asignacion*
 
| **Origen** | **Evento Clase.método** | **Guarda (RN)** | **Destino** | **Gestor HU/RF o justificación** |
| --- | --- | --- | --- | --- |
| [*] | T1 · Asignacion.asignar() | RN-AS04, RN-AS05a, RN-AS07a; estado inicial: RN-AS10† | Vigente | HU-15 · RF-18. El estado inicial lo asigna el sistema al crear (Diccionario v7). |
| Vigente | T2 · Asignacion.cerrar() (invocado por Devolucion.confirmarRecepcion()) | RN-AS14 (devolución Confirmada), RN-AS13b; efecto: RN-AS15†, RN-D15† | Cerrada | HU-18 · RF-21, RF-100, RF-98, RF-101; HU-24 · RF-117. Automática cuando la invoca confirmarRecepcion() (CRF-003, B-1). |
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de validar con el cliente) a partir del Diccionario v7, el diagrama de clases (v6 con CRF-003), el Consolidado de 46 HU (tabla C.1 y criterios de aceptación), el documento de RF y el documento de RN. † RN citada en las HU, en el Consolidado o en esta sección que no tiene ficha en el documento de RN. [*] = estado inicial.*
 
## 3.8.4 Devolucion.Estado_Recepcion
 
La Figura 4 muestra el ciclo de la devolución: nace Pendiente al registrarla (T1) y pasa a Confirmada cuando el Responsable de Activos confirma la recepción (T2), lo que invoca el cierre de la asignación. La Tabla 5 detalla las dos transiciones. Confirmada no tiene salida documentada (RN-D11b).
 
**Figura ****4****.** *Diagrama de estados de Devolucion (Estado_Recepcion)*
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de validar con el cliente) a partir del Diccionario v7, el diagrama de clases (v6 con CRF-003), el Consolidado de 46 HU y el documento de RN. † RN citada en las HU, en el Consolidado o en esta sección que no tiene ficha en el documento de RN.*
 
**Tabla ****5****.** *Transiciones de Devolucion.Estado_Recepcion*
 
| **Origen** | **Evento Clase.método** | **Guarda (RN)** | **Destino** | **Gestor HU/RF o justificación** |
| --- | --- | --- | --- | --- |
| [*] | T1 · Devolucion.registrar() | RN-D05, RN-D06a, RN-D07b; estado inicial: RN-D08† | Pendiente | HU-21 · RF-24. El estado inicial lo asigna el sistema al crear (Diccionario v7). |
| Pendiente | T2 · Devolucion.confirmarRecepcion() | RN-D14b, RN-D11b; efecto: RN-D13†, RN-D15† | Confirmada | HU-24 · RF-27, RF-115, RF-118. |
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de validar con el cliente) a partir del Diccionario v7, el diagrama de clases (v6 con CRF-003), el Consolidado de 46 HU (tabla C.1 y criterios de aceptación), el documento de RF y el documento de RN. † RN citada en las HU, en el Consolidado o en esta sección que no tiene ficha en el documento de RN. [*] = estado inicial.*
 
## 3.8.5 Estados no modelados y preguntas abiertas
 
Lo siguiente queda fuera de los diagramas porque ningún valor de los cuatro enumerados lo representa; son propuesta del equipo, pendientes de validar con el cliente, y no se resuelven en esta sección.
 
Solicitud atendida (MOD-02): tras asignarse, la solicitud sigue Aprobada porque Estado_Solicitud no tiene un estado de atendida; evaluar agregar uno afectaría RN-S05†, RN-AS04 y RN-AS05†.
 
Recepción con novedad (MOD-20, P-47): Estado_Recepcion solo tiene Pendiente y Confirmada; no hay estado para un equipo recibido incompleto o dañado.
 
Acta_De_Entrega y Reporte_de_Danios (MOD-18, MOD-25): no tienen ENUM de estado (el acta carece de anulación o corrección; el reporte, de estado de atención y de baja), por lo que no tienen diagrama (P-AC1, P-41, P-53, P-56).
 
Equipo no devuelto (P-C3-04): con cerrar() condicionado a una Devolucion Confirmada no existe cierre sin devolución, y RN-A19 bloquea la baja; un equipo perdido o robado no tiene salida documentada.
 
Poscondiciones de Estado_Activo (P-C3-01, P-C3-02, P-C3-03 y P-C3-06): que la confirmación de la recepción deje el activo Disponible salvo que esté Dañado (T3), que el reporte de daño lo deje Dañado aunque esté asignado (T4), quién lo devuelve a Disponible tras un mantenimiento (T6) y que Estado_Activo muestre solo uno de los dos hechos (asignado o dañado).