# 3.5 Diagramas de Actividades
 
Esta sección presenta seis diagramas de actividades, uno por cada caso de uso documentado en el Word de casos de uso: CU-01 Registrar activo, CU-09 Registrar solicitud de equipo, CU-13 Registrar decisión sobre una solicitud, CU-15 Asignar equipo a una solicitud aprobada, CU-19 Firmar acta de entrega y CU-24 Confirmar recepción de una devolución. Son las operaciones críticas del recorrido solicitud, aprobación, asignación, entrega firmada y devolución, más el registro del activo que lo alimenta. La selección de operaciones críticas es propuesta del equipo, pendiente de confirmar con la docente. La Tabla 1 resume los diagramas.
 
Cada diagrama tiene dos calles, la del actor del caso de uso y la del Sistema, y nace del flujo básico y de los flujos alternos del caso. El círculo negro es el nodo inicial; los círculos con borde son nodos finales, uno por cada terminación (el éxito y cada rechazo); los rombos son decisiones con guardas [sí] y [no]; las cajas son acciones con el número de paso del caso de uso, y las cajas «include» invocan los casos incluidos CU-47, CU-48 y CU-49 sin descomponerlos. Cada salida lleva el código de su flujo alterno (2a, 3a, …) y los mensajes del caso; «vuelve al paso 2» indica que el actor puede reintentar desde el paso 2 del flujo básico. La referencia «3.8: F2-T2» remite a la transición T2 de la Figura 2 de la sección 3.8.
 
El primer rombo de cada diagrama (R0) verifica que el rol del actor tenga permiso para la operación: lo exige RNF-01 y lo implementa RF-166, no es una regla de negocio numerada, y su mensaje es M-85 en CU-13, M-154 en CU-24 y una propuesta del equipo, pendiente de validar con el cliente y sin número de mensaje, en los otros cuatro casos (sección 2.4.2 del Word de casos de uso). Cada rombo se documenta en una tabla con su condición, la RN con el código de su ficha, el RF, la restricción del Diccionario v7, el flujo del caso y el mensaje. Cuando la condición es una restricción del diccionario se escribe «restricción del diccionario» en la columna de RN, y el signo † marca una RN que no tiene ficha en el documento de RN. Los flujos 2a de CU-01 y CU-13 y 7c de CU-24 se dibujan al final del flujo, después de las verificaciones, porque el caso de uso los cierra con la respuesta del último paso. Nada de lo que aquí se muestra está validado por el cliente.
 
**Tabla ****1****.** *Resumen de los diagramas de actividades de la sección 3.5*
 
| **CU** | **HU** | **Actor** | **Pasos básicos** | **Alternos** | **Rombos** | **Figura** | **Tabla** |
| --- | --- | --- | --- | --- | --- | --- | --- |
| CU-01 Registrar activo | HU-01 | Responsable de Activos | 7 | 5 | 6 | Figura 1 | Tabla 2 |
| CU-09 Registrar solicitud de equipo | HU-09 | Empleado | 7 | 4 | 5 | Figura 2 | Tabla 3 |
| CU-13 Registrar decisión sobre una solicitud | HU-13 | Aprobador | 8 | 6 | 7 | Figura 3 | Tabla 4 |
| CU-15 Asignar equipo a una solicitud aprobada | HU-15 | Responsable de Activos | 9 | 6 | 7 | Figura 4 | Tabla 5 |
| CU-19 Firmar acta de entrega | HU-19 | Empleado | 8 | 5 | 6 | Figura 5 | Tabla 6 |
| CU-24 Confirmar recepción de una devolución | HU-24 | Responsable de Activos | 7 | 6 | 6 | Figura 6 | Tabla 7 |
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de validar con el cliente) a partir del Word de casos de uso (secciones 2.4.3 a 2.4.8). Rombos: incluye el rombo R0 de autoridad por rol.*
 
## 3.5.1 CU-01 Registrar activo
 
La Figura 1 muestra el diagrama de actividades de CU-01 (HU-01), con 7 pasos básicos, 5 flujos alternos (2a, 3a, 4a, 5a, 6a) y 6 rombos; la Tabla 2 documenta cada rombo. Su poscondición deja el activo Disponible, que es la transición T1 de la Figura 1 de la sección 3.8. El alta no se audita (P-89, pregunta abierta).
 
**Figura ****1****.** *Diagrama de actividades de CU-01 Registrar activo*
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de validar con el cliente) a partir del flujo básico y los flujos alternos de CU-01 en el Word de casos de uso, el diagrama de clases (v6 con CRF-003) y el Diccionario v7. † RN sin ficha en el documento de RN. 3.8: F1-T1 = transición T1 de la Figura 1 de la sección 3.8.*
 
**Tabla ****2****.** *Rombos de decisión de CU-01 Registrar activo*
 
| **Rombo** | **Condición** | **RN (con ficha)** | **RF** | **Diccionario v7 (tabla.columna y restricción)** | **Flujo del CU** | **Mensaje (M-xx)** |
| --- | --- | --- | --- | --- | --- | --- |
| R0 | ¿El rol del Responsable de Activos tiene permiso para esta operación? | RNF-01 (no es una RN numerada) | RF-166 (transversal; origen HU-38) | — | Rechazo por rol (2.4.2) | propuesta del equipo, sin número de mensaje (2.4.2) |
| R1 (paso 3) | ¿Marca, Modelo, Numero_Serie, Placa_Inventario e ID_Categoria están informados? | restricción del diccionario | RF-01 | Activo.Marca, Activo.Modelo, Activo.Numero_Serie, Activo.Placa_Inventario, Activo.ID_Categoria: obligatorio | 3a | M-02, M-04, M-07, M-10, M-12 |
| R2 (paso 4) | ¿Ninguna longitud supera el máximo? | restricción del diccionario | RF-01 | Activo.Marca VARCHAR(50), Activo.Modelo VARCHAR(50), Activo.Numero_Serie VARCHAR(20), Activo.Placa_Inventario VARCHAR(11), Activo.Ubicacion VARCHAR(100) | 4a | M-03, M-05, M-11, M-13, M-15 |
| R3 (paso 5, CU-49) | ¿Numero_Serie y Placa_Inventario no están registrados (incluso en activos en Baja)? | RN-A03, RN-A04 | RF-02 | Activo.Numero_Serie: Unique; Activo.Placa_Inventario: Unique | 5a | M-06, M-14 |
| R4 (paso 6, CU-48) | ¿La categoría existe y está activa? | RN-A09 (categoría inactiva); restricción del diccionario (FK) para la inexistente | RF-52; RF-01 | Activo.ID_Categoria: FK hacia Categoria | 6a | M-08, M-09 |
| R5 (paso 7) | ¿Se informó Ubicacion? | restricción del diccionario | RF-01 | Activo.Ubicacion VARCHAR(100): no obligatorio | 2a | M-01 |
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de validar con el cliente) a partir de CU-01 en el Word de casos de uso, el documento de RN (fichas), el documento de RF y el Diccionario v7. † RN sin ficha en el documento de RN.*
 
## 3.5.2 CU-09 Registrar solicitud de equipo
 
La Figura 2 muestra el diagrama de actividades de CU-09 (HU-09), con 7 pasos básicos, 4 flujos alternos (3a, 4a, 5a, 6a) y 5 rombos; la Tabla 3 documenta cada rombo. Su poscondición deja la solicitud Pendiente, que es la transición T1 de la Figura 2 de la sección 3.8.
 
**Figura ****2****.** *Diagrama de actividades de CU-09 Registrar solicitud de equipo*
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de validar con el cliente) a partir del flujo básico y los flujos alternos de CU-09 en el Word de casos de uso, el diagrama de clases (v6 con CRF-003) y el Diccionario v7. † RN sin ficha en el documento de RN. 3.8: F2-T1 = transición T1 de la Figura 2 de la sección 3.8.*
 
**Tabla ****3****.** *Rombos de decisión de CU-09 Registrar solicitud de equipo*
 
| **Rombo** | **Condición** | **RN (con ficha)** | **RF** | **Diccionario v7 (tabla.columna y restricción)** | **Flujo del CU** | **Mensaje (M-xx)** |
| --- | --- | --- | --- | --- | --- | --- |
| R0 | ¿El rol del Empleado tiene permiso para esta operación? | RNF-01 (no es una RN numerada) | RF-166 (transversal; origen HU-38) | — | Rechazo por rol (2.4.2) | propuesta del equipo, sin número de mensaje (2.4.2) |
| R1 (paso 3) | ¿ID_Categoria, Motivo e ID_Custodio están informados? | restricción del diccionario | RF-11 | Solicitud.ID_Categoria, Solicitud.Motivo, Solicitud.ID_Custodio: obligatorio | 3a | M-07, M-60, M-63 |
| R2 (paso 4) | ¿El motivo no supera 255 caracteres? | restricción del diccionario | RF-11 | Solicitud.Motivo VARCHAR(255) | 4a | M-64 |
| R3 (paso 5, CU-48) | ¿La categoría existe y está activa? | RN-S07 (categoría inactiva); restricción del diccionario (FK) para la inexistente | RF-68; RF-11 | Solicitud.ID_Categoria: FK hacia Categoria | 5a | M-08, M-09 |
| R4 (paso 6) | ¿El custodio existe, está activo, está registrado y es del empleado en sesión? | RN-S09, RN-S10b, RN-S19 (incluye RN-S10c†); restricción del diccionario (FK) para el inexistente | RF-69, RF-70, RF-71, RF-168; RF-11 | Solicitud.ID_Custodio: FK hacia Custodio; Custodio.activo BOOLEAN; Custodio.ID_Usuario: FK hacia Usuario, Unique | 6a | M-50, M-61, M-62, M-272 |
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de validar con el cliente) a partir de CU-09 en el Word de casos de uso, el documento de RN (fichas), el documento de RF y el Diccionario v7. † RN sin ficha en el documento de RN.*
 
## 3.5.3 CU-13 Registrar decisión sobre una solicitud
 
La Figura 3 muestra el diagrama de actividades de CU-13 (HU-13), con 8 pasos básicos, 6 flujos alternos (2a, 3a, 4a, 5a, 6a, 7a) y 7 rombos; la Tabla 4 documenta cada rombo. Su poscondición deja la solicitud Aprobada o Rechazada, que son las transiciones T2 y T3 de la Figura 2 de la sección 3.8. El permiso de aprobar y rechazar es una pregunta abierta (P-RP1).
 
**Figura ****3****.** *Diagrama de actividades de CU-13 Registrar decisión sobre una solicitud*
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de validar con el cliente) a partir del flujo básico y los flujos alternos de CU-13 en el Word de casos de uso, el diagrama de clases (v6 con CRF-003) y el Diccionario v7. † RN sin ficha en el documento de RN. 3.8: F2-T2 y F2-T3 = transiciones T2 y T3 de la Figura 2 de la sección 3.8.*
 
**Tabla ****4****.** *Rombos de decisión de CU-13 Registrar decisión sobre una solicitud*
 
| **Rombo** | **Condición** | **RN (con ficha)** | **RF** | **Diccionario v7 (tabla.columna y restricción)** | **Flujo del CU** | **Mensaje (M-xx)** |
| --- | --- | --- | --- | --- | --- | --- |
| R0 | ¿El rol del Aprobador tiene permiso para esta operación? | RNF-01 (no es una RN numerada) | RF-166 (transversal; origen HU-38) | — | Rechazo por rol (2.4.2); caso incluido en 7a | M-85 |
| R1 (paso 3) | ¿Decision está informada y es válida y, si es Rechazada, trae Motivo_Rechazo? | RN-AP02b; valores de Decision: restricción del diccionario | RF-81; RF-16 | Aprobacion.Decision: ENUM (Aprobada, Rechazada), obligatorio; Aprobacion.Motivo_Rechazo: solo obligatorio si Decision = Rechazada | 3a | M-83, M-86, M-87 |
| R2 (paso 4) | ¿Motivo_Rechazo no supera 300 caracteres? | restricción del diccionario | RF-16 | Aprobacion.Motivo_Rechazo VARCHAR(300) | 4a | M-84 |
| R3 (paso 5) | ¿La solicitud aún no tiene decisión? | RN-AP06a | RF-82 | Aprobacion.ID_Solicitud: FK hacia Solicitud, Unique (una decisión por solicitud) | 5a | M-88 |
| R4 (paso 6) | ¿La solicitud existe y está Pendiente? | RN-AP09, RN-AP06a; restricción del diccionario (FK) para la inexistente | RF-82; RF-16 | Aprobacion.ID_Solicitud: FK hacia Solicitud; Solicitud.Estado_Solicitud: ENUM | 6a | M-74, M-89 |
| R5 (paso 7) | ¿El aprobador existe, está activo, tiene el rol Aprobador y es el usuario en sesión? | RN-AP11a, RN-AP12a; el rol lo mide RNF-01 (RF-166) | RF-83, RF-84, RF-169 | Aprobacion.ID_Aprobador: FK hacia Usuario; Usuario.activo BOOLEAN; Usuario.rol: ENUM | 7a | M-39, M-40, M-85, M-273 |
| R6 (paso 8) | ¿Decision = Rechazada? | sin RN; ramifica el flujo (2a) | RF-81, RF-86 | Aprobacion.Decision: ENUM; Solicitud.Estado_Solicitud: ENUM (pasa a Aprobada o Rechazada) | 2a ([sí]); paso 8 ([no]) | M-82 |
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de validar con el cliente) a partir de CU-13 en el Word de casos de uso, el documento de RN (fichas), el documento de RF y el Diccionario v7. † RN sin ficha en el documento de RN.*
 
## 3.5.4 CU-15 Asignar equipo a una solicitud aprobada
 
La Figura 4 muestra el diagrama de actividades de CU-15 (HU-15), con 9 pasos básicos, 6 flujos alternos (3a, 4a, 5a, 6a, 7a, 8a) y 7 rombos; la Tabla 5 documenta cada rombo. Su poscondición deja el activo Asignado, que es la transición T2 de la Figura 1 de la sección 3.8, y crea la asignación Vigente, que es la transición T1 de la Figura 3. La asignación se audita con la acción Asignar (RF-161, RN-T02a; decisión T-2 provisional).
 
**Figura ****4****.** *Diagrama de actividades de CU-15 Asignar equipo a una solicitud aprobada*
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de validar con el cliente) a partir del flujo básico y los flujos alternos de CU-15 en el Word de casos de uso, el diagrama de clases (v6 con CRF-003) y el Diccionario v7. † RN sin ficha en el documento de RN. 3.8: F1-T2 = transición T2 de la Figura 1; F3-T1 = transición T1 de la Figura 3 de la sección 3.8.*
 
**Tabla ****5****.** *Rombos de decisión de CU-15 Asignar equipo a una solicitud aprobada*
 
| **Rombo** | **Condición** | **RN (con ficha)** | **RF** | **Diccionario v7 (tabla.columna y restricción)** | **Flujo del CU** | **Mensaje (M-xx)** |
| --- | --- | --- | --- | --- | --- | --- |
| R0 | ¿El rol del Responsable de Activos tiene permiso para esta operación? | RNF-01 (no es una RN numerada) | RF-166 (transversal; origen HU-38) | — | Rechazo por rol (2.4.2) | propuesta del equipo, sin número de mensaje (2.4.2) |
| R1 (paso 3) | ¿ID_Solicitud, ID_Activo y Fecha_Devolucion_Esperada están informados? | restricción del diccionario | RF-18 | Asignacion.ID_Solicitud, Asignacion.ID_Activo, Asignacion.Fecha_Devolucion_Esperada: obligatorio | 3a | M-94, M-95, M-96 |
| R2 (paso 4) | ¿La solicitud existe y está Aprobada? | RN-AS04; restricción del diccionario (FK) para la inexistente | RF-87; RF-18 | Asignacion.ID_Solicitud: FK hacia Solicitud; Solicitud.Estado_Solicitud: ENUM | 4a | M-74, M-97 |
| R3 (paso 5) | ¿La solicitud aún no tiene asignación? | RN-AS05a | RF-88 | Asignacion.ID_Solicitud: FK hacia Solicitud, Unique (una solicitud, una asignación) | 5a | M-98 |
| R4 (paso 6) | ¿El activo existe y está Disponible? | RN-AS07a; restricción del diccionario (FK) para el inexistente | RF-89; RF-18 | Asignacion.ID_Activo: FK hacia Activo; Activo.Estado: ENUM | 6a | M-21, M-99 |
| R5 (paso 7) | ¿El activo es de la misma categoría que la solicitud? | RN-AS08 | RF-90 | Activo.ID_Categoria y Solicitud.ID_Categoria: FK hacia Categoria | 7a | M-100 |
| R6 (paso 8) | ¿Fecha_Devolucion_Esperada no es anterior a la fecha de entrega? | restricción del diccionario (coherencia entre fechas aún no definida en el Diccionario v7; propuesta MOD-01, pendiente de validar con el cliente) | RF-18 | Asignacion.Fecha_Devolucion_Esperada: DATE, obligatorio; el Diccionario v7 no define su coherencia con Fecha_Entrega | 8a | M-101 |
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de validar con el cliente) a partir de CU-15 en el Word de casos de uso, el documento de RN (fichas), el documento de RF y el Diccionario v7. † RN sin ficha en el documento de RN.*
 
## 3.5.5 CU-19 Firmar acta de entrega
 
La Figura 5 muestra el diagrama de actividades de CU-19 (HU-19), con 8 pasos básicos, 5 flujos alternos (3a, 4a, 5a, 6a, 7a) y 6 rombos; la Tabla 6 documenta cada rombo. La regla de ancla de este caso es RN-AC07a: toda entrega queda respaldada por un acta firmada por quien recibe.
 
**Figura ****5****.** *Diagrama de actividades de CU-19 Firmar acta de entrega*
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de validar con el cliente) a partir del flujo básico y los flujos alternos de CU-19 en el Word de casos de uso, el diagrama de clases (v6 con CRF-003) y el Diccionario v7. † RN sin ficha en el documento de RN.*
 
**Tabla ****6****.** *Rombos de decisión de CU-19 Firmar acta de entrega*
 
| **Rombo** | **Condición** | **RN (con ficha)** | **RF** | **Diccionario v7 (tabla.columna y restricción)** | **Flujo del CU** | **Mensaje (M-xx)** |
| --- | --- | --- | --- | --- | --- | --- |
| R0 | ¿El rol del Empleado tiene permiso para esta operación? | RNF-01 (no es una RN numerada) | RF-166 (transversal; origen HU-38) | — | Rechazo por rol (2.4.2) | propuesta del equipo, sin número de mensaje (2.4.2) |
| R1 (paso 3) | ¿ID_Asignacion, Ruta_Acta y Firma_Digital están informados? | restricción del diccionario | RF-22 | Acta_De_Entrega.ID_Asignacion, Acta_De_Entrega.Ruta_Acta, Acta_De_Entrega.Firma_Digital: obligatorio | 3a | M-122, M-123, M-125 |
| R2 (paso 4) | ¿Ruta_Acta y Firma_Digital no superan 255 caracteres? | restricción del diccionario | RF-22 | Acta_De_Entrega.Ruta_Acta VARCHAR(255); Acta_De_Entrega.Firma_Digital VARCHAR(255) | 4a | M-124, M-126 |
| R3 (paso 5) | ¿La asignación existe y está Vigente? | RN-AC05; restricción del diccionario (FK) para la inexistente | RF-104; RF-22 | Acta_De_Entrega.ID_Asignacion: FK hacia Asignacion; Asignacion.Estado_Asignacion: ENUM | 5a | M-108, M-127 |
| R4 (paso 6) | ¿La asignación aún no tiene acta? | RN-AC06a | RF-105 | Acta_De_Entrega.ID_Asignacion: FK hacia Asignacion, Unique (un acta por asignación) | 6a | M-128 |
| R5 (paso 7) | ¿Firma el custodio de la asignación? | RN-AC07b, RN-AC07a | RF-103, RF-102 | Asignacion.ID_Custodio: FK hacia Custodio | 7a | M-129 |
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de validar con el cliente) a partir de CU-19 en el Word de casos de uso, el documento de RN (fichas), el documento de RF y el Diccionario v7. † RN sin ficha en el documento de RN.*
 
## 3.5.6 CU-24 Confirmar recepción de una devolución
 
La Figura 6 muestra el diagrama de actividades de CU-24 (HU-24), con 7 pasos básicos, 6 flujos alternos (3a, 4a, 5a, 7a, 7b, 7c) y 6 rombos; la Tabla 7 documenta cada rombo. Su poscondición cierra la asignación y libera el activo: es la transición T3 de la Figura 1, la T2 de la Figura 3 y la T2 de la Figura 4 de la sección 3.8. La confirmación se audita con la acción Devolver (RF-163, RN-T02a; ambigüedad en P-89).
 
**Figura ****6****.** *Diagrama de actividades de CU-24 Confirmar recepción de una devolución*
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de validar con el cliente) a partir del flujo básico y los flujos alternos de CU-24 en el Word de casos de uso, el diagrama de clases (v6 con CRF-003) y el Diccionario v7. † RN sin ficha en el documento de RN. 3.8: F1-T3 = transición T3 de la Figura 1; F3-T2 = transición T2 de la Figura 3; F4-T2 = transición T2 de la Figura 4 de la sección 3.8.*
 
**Tabla ****7****.** *Rombos de decisión de CU-24 Confirmar recepción de una devolución*
 
| **Rombo** | **Condición** | **RN (con ficha)** | **RF** | **Diccionario v7 (tabla.columna y restricción)** | **Flujo del CU** | **Mensaje (M-xx)** |
| --- | --- | --- | --- | --- | --- | --- |
| R0 | ¿El rol del Responsable de Activos tiene permiso para esta operación? | RNF-01 (no es una RN numerada) | RF-166 (transversal; origen HU-38) | — | Rechazo por rol (2.4.2); caso incluido en 5a | M-154 |
| R1 (paso 3) | ¿La devolución ya está Confirmada? | RN-D11b | RF-115 | Devolucion.Estado_Recepcion: ENUM (Pendiente, Confirmada) | 3a ([sí]) | M-153 |
| R2 (paso 4) | ¿La devolución existe? | sin RN; condición enunciada por el RF | RF-27 | — | 4a | M-141 |
| R3 (paso 5) | ¿El receptor existe, está activo, tiene el rol Responsable de Activos y es el usuario en sesión? | RN-D14b; el rol lo mide RNF-01 (RF-166) | RF-116, RF-170 | Devolucion.ID_Receptor: FK hacia Usuario; Usuario.activo BOOLEAN; Usuario.rol: ENUM | 5a | M-39, M-40, M-154 |
| R4 (paso 7) | ¿El Responsable de Activos confirma tras el aviso? | sin RN; condición enunciada por el RF | RF-118 | — | 7a ([no]) | M-152 (aviso: M-151) |
| R5 (paso 7, CU-47) | ¿El activo está Dañado al cerrar la asignación? | sin RN; condición enunciada por RF-117 y CRF-003 (A1) | RF-117 | Activo.Estado: ENUM (Disponible, Asignado, Dañado, Baja); Asignacion.Estado_Asignacion: ENUM | 7b ([sí]); 7c ([no]) | M-150; M-105, M-120 (consultas posteriores del 7c) |
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de validar con el cliente) a partir de CU-24 en el Word de casos de uso, el documento de RN (fichas), el documento de RF y el Diccionario v7. † RN sin ficha en el documento de RN.*
 
## 3.5.7 Hallazgos y preguntas abiertas
 
Lo siguiente queda abierto; son propuestas del equipo, pendientes de validar con el cliente, y no se resuelven en esta sección.
 
Docente: la selección de los seis casos de uso como operaciones críticas es propuesta del equipo, pendiente de confirmar.
 
Cliente: la matriz rol–operación (P-75, P-77 y P-100) condiciona el rombo R0 de los seis diagramas; en CU-01, CU-09, CU-15 y CU-19 el rechazo por rol no tiene número de mensaje, y el permiso para aprobar y rechazar en CU-13 es la pregunta P-RP1.
 
Equipo: una regla citada no tiene ficha en el documento de RN: RN-S10c† (incluida en RN-S19, R4 de CU-09).
 
Equipo: el R6 de CU-15 se trata como restricción del diccionario (RF-18), pero el Diccionario v7 solo define Fecha_Devolucion_Esperada como DATE obligatoria; incorporar la coherencia entre fechas es la propuesta MOD-01, pendiente de validar con el cliente. La regla preliminar RN-AS09 es una restricción de datos, no una ficha de RN.
 
Equipo: R2, R4 y R5 de CU-24 y R6 de CU-13 no se apoyan en una RN ni en una restricción del diccionario: R2 y R4 en el enunciado de RF-27 y RF-118, R5 en RF-117 y CRF-003 (A1) y R6 de CU-13 ramifica el flujo (2a). RN-AS14 queda como guarda del cierre (CU-47), no del rombo R5.
 
Cliente: P-89 deja abierto qué operaciones se auditan (el alta del activo en CU-01 no se audita y la auditoría de la devolución en CU-24 es ambigua).
 
Equipo: R0 cita RF-166, un requisito transversal cuya historia de origen es HU-38 y no la del caso de uso.
 
Cliente: P-70 deja sin medida el vencimiento de la sesión (RNF-02), por lo que ningún diagrama dibuja un rombo de sesión vencida.