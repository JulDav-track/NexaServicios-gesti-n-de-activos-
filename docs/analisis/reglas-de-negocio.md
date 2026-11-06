**Sistema de Gestión de Activos (NexaActivos)**
 
**Sección 2.2: Reglas de negocio**
 
Unión final: reglas de negocio de las entidades, trazabilidad, anexos y cuestionario para el cliente
 
## **2.2.1 Introducción**
 
Una regla de negocio (RN), según el curso, es una política que existiría aunque no hubiera software y que podría dictar el negocio, es decir, el cliente. Lo que no cumple esa condición no es RN: el NO NULO, la longitud, el tipo, el ENUM, el formato y la existencia de FK permanecen en el diccionario; la autoridad por rol y las cualidades de seguridad y auditabilidad son requisitos no funcionales (RNF) candidatos; el comportamiento del sistema es requisito funcional (RF) candidato; y lo que el cliente no definió es una pregunta sin regla. La propiedad («solo el dueño accede a lo suyo») sí es RN.
 
El método de depuración aplicó ese filtro, bloque por bloque, a las 257 candidatas de la sección D del consolidado (254 de las entidades y 3 transversales). Cada candidata quedó como RN con ficha propia, fusionada en otra regla o destinada a otro lugar (restricción del diccionario o del UML, RF candidato, RNF candidato, mockup o mensaje, pregunta sin regla, doctrina del curso o límite de alcance). El resultado son 53 códigos RN con 59 fichas (algunos códigos se dividieron en partes con sufijo a, b, c o d, por ejemplo RN-A16a y RN-A16b), 20 candidatas fusionadas y 184 que pasan a otro destino: 53 + 20 + 184 = 257. Los códigos no se renumeran; el hueco de RN-AU10 se conserva porque esa regla pasó a RN-T02.
 
**Cómo se lee la ficha. **Cada ficha tiene cuatro campos. Código: identifica la regla e indica si es una división provisional de otra, qué reglas incluye y si es ancla de una regla de 1.7.3. Enunciado: la regla en una frase. Origen: de dónde nace (el criterio de aceptación de rechazo que la delata y el respaldo documental en 1.7 o en el Alcance 1.2) y su estado, que puede ser detectada en el análisis de documentos, con respaldo parcial del Alcance 1.2 o propuesta del equipo; en todos los casos queda pendiente de validar con el cliente. RF que la vigilan: los requisitos funcionales de la sección C del consolidado que la hacen cumplir; «SIN RF», en rojo, indica que ningún RF la enuncia todavía.
 
**Estado de validación. **Hay 0 RN validadas por el cliente: las 59 fichas están pendientes de validar. Ninguna RN fue dictada por el cliente, porque la encuesta de 1.7 respalda necesidades y no reglas. Además, tres decisiones de Transversales son provisionales: T-2 (la división de RN-T02 en la RN-T02a y un RNF de auditabilidad) y T-11 (la tensión entre la encuesta y el alcance se mantiene como trabajo futuro) están sujetas a validación del docente, y T-9 (se audita solo la consulta de reportes) es provisional, pendiente de la respuesta del cliente a P-90.
 
**Anclas de 1.7.3. **Las cuatro reglas detectadas o implícitas de 1.7.3 quedaron cubiertas así: equipo identificado de forma única, en RN-A03 y RN-A04; decisión atribuible, en RN-AP12a; solo un equipo disponible puede entregarse, en RN-AS07a; y acta firmada por quien recibe, en RN-AC07a.
 
**Alcance de las fuentes. **Varias fichas se apoyan en la adenda CRF-003 (pendiente de integrar en el diagrama v6): sus poscondiciones y el método Solicitud.listarAprobadas() aún no figuran en el diccionario v6 ni en el UML v6, aunque las cuentas del consolidado ya la incluyen (62 métodos públicos + 14 INTERNO = 76). Las notas de cada entidad indican qué fichas dependen de ella.
 
**Organización. **El apartado 2.2.2 presenta los totales y el desglose por bloque; el 2.2.3, el mapa de familias de reglas; el 2.2.4, las fichas de cada entidad con su párrafo «De dónde nace»; y el 2.2.5, la trazabilidad RN → RF de las 59 fichas. Los anexos contienen la clasificación de las 257 candidatas (A), la verificación en reversa de los criterios de aceptación de rechazo (B), la matriz rol–operación (C), las propuestas de regla nueva (D), las notas de alcance (E) y el cuestionario priorizado para el cliente con la correspondencia de las preguntas provisionales (F). Los códigos provisionales de preguntas (P-A1, P-C1, etc.) se conservan en el cuerpo; el anexo F asigna los definitivos desde P-106. Los cambios al modelo derivados de estas reglas (lista 4: 59 ítems MOD, 57 vigentes y 2 retirados, MOD-15 y MOD-22) no forman parte de este documento.
 
## **2.2.2 Resumen numérico**
 
La Tabla 8 presenta los totales finales de la sección y la Tabla 9, el desglose por bloque. El desglose sustituye a los resúmenes numéricos de cada bloque, que no se reproducen: aplica la convención de conteo vigente (por ejemplo, 6 códigos RN y 1 fusionada en Solicitud, y 7 códigos RN y 3 fusionadas en Asignación).
 
**Tabla 8. Totales finales tras Transversales**
 
| **Concepto** | **Cantidad** |
| --- | --- |
| Candidatas de la sección D | 257 (254 de entidad + 3 transversales) |
| Códigos RN con ficha propia | 53 (52 + T02a) |
| Fusionadas | 20 |
| Pasan a otro destino | 184 (182 + T01 + T03) |
| Verificación | 53 + 20 + 184 = 257 |
| Fichas de RN | 59 (58 + T02a) |
| Resolución de las tres transversales | T01: reclasificada a RNF; T02: RN (T02a) y RNF (T02b); T03: RNF / RF |
 
*Fuente: elaboración propia a partir del cuadre global de los bloques de entidad y las decisiones T-1 a T-3.*
 
**Tabla 9. Desglose por bloque**
 
| **Bloque** | **Cand.** | **Cód. RN** | **Fich.** | **Fus.** | **Otro** | **Dicc.** | **RF** | **RNF** | **Mock.** | **Preg.** | **Doc.** | **Alc.** | **Seg.** | **Dup. T** |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
| B0 Activo | 19 | 6 | 7 | 1 | 12 | 6 | 3 | 1 | 1 | 0 | 1 | 0 | 0 | 0 |
| B1 Custodio | 17 | 4 | 6 | 1 | 12 | 7 | 3 | 1 | 1 | 0 | 0 | 0 | 0 | 0 |
| B2a Solicitud | 21 | 6 | 6 | 1 | 14 | 7 | 5 | 1 | 1 | 0 | 0 | 0 | 0 | 0 |
| B2b Aprobacion | 14 | 6 | 6 | 0 | 8 | 6 | 2 | 0 | 0 | 0 | 0 | 0 | 0 | 0 |
| B4a-1 Asignacion | 24 | 7 | 7 | 3 | 14 | 7 | 5 | 1 | 1 | 0 | 0 | 0 | 0 | 0 |
| B4a-2 Acta | 10 | 4 | 5 | 0 | 6 | 4 | 1 | 1 | 0 | 0 | 0 | 0 | 0 | 0 |
| B4b-1 Devolucion | 21 | 5 | 5 | 4 | 12 | 6 | 4 | 1 | 1 | 0 | 0 | 0 | 0 | 0 |
| B4b-2 Notificacion | 10 | 1 | 1 | 0 | 9 | 4 | 3 | 0 | 0 | 1 | 0 | 1 | 0 | 0 |
| B5a Reporte_de_Danios | 19 | 2 | 3 | 3 | 14 | 5 | 6 | 1 | 0 | 1 | 0 | 0 | 0 | 1 |
| B5b Historial_Mantenimientos | 18 | 2 | 2 | 2 | 14 | 8 | 4 | 1 | 0 | 0 | 0 | 1 | 0 | 0 |
| B6a Usuario | 23 | 6 | 6 | 2 | 15 | 5 | 4 | 3 | 1 | 1 | 0 | 0 | 1 | 0 |
| B6b-1 Rol_Permiso | 12 | 0 | 0 | 0 | 12 | 5 | 3 | 1 | 1 | 2 | 0 | 0 | 0 | 0 |
| B6b-2 Categoria | 14 | 3 | 4 | 3 | 8 | 3 | 3 | 1 | 1 | 0 | 0 | 0 | 0 | 0 |
| B7a Auditoria | 16 | 0 | 0 | 0 | 16 | 7 | 3 | 3 | 0 | 3 | 0 | 0 | 0 | 0 |
| B7b Reportes | 16 | 0 | 0 | 0 | 16 | 6 | 1 | 2 | 2 | 5 | 0 | 0 | 0 | 0 |
| Transversales (T01 a T03) | 3 | 1 | 1 | 0 | 2 | 0 | 0 | 2 | 0 | 0 | 0 | 0 | 0 | 0 |
| Total | 257 | 53 | 59 | 20 | 184 | 86 | 50 | 20 | 10 | 13 | 1 | 2 | 1 | 1 |
 
*Fuente: elaboración propia. Cand.: candidatas; Cód. RN: códigos con ficha propia; Fich.: fichas; Fus.: fusionadas; Otro: otro destino; Dicc.: restricción del diccionario o UML; Mock.: mockup o mensaje; Preg.: pregunta sin regla; Doc.: doctrina; Alc.: límite de alcance; Seg.: segregación; Dup. T: duplicada con RN-T. RN-T03 se cuenta como RNF (RNF / RF). Convención de conteo vigente.*
 
## **2.2.3 Mapa de familias de reglas**
 
Las fichas aprobadas se agrupan en familias sin crear códigos nuevos y sin fusionar ninguna ficha (decisión T-4). Cada una de las 59 fichas (53 códigos) aparece al menos una vez; S14 aparece en dos familias.
 
**Tabla 10. Mapa de familias de reglas**
 
| **Familia** | **Reglas (fichas)** | **Observación** |
| --- | --- | --- |
| Solo accede a lo propio (propiedad) | S19, AP14, AS23a, AC10, D07b, RD07b | Por acto propio: RD07a, AC07b, U22. |
| Estado terminal | A18 (con RD08 y H08), C12b, S14, AP06a, AS13b, D11b, U12b, CA09b | S14 aparece también en la familia siguiente. |
| Una sola vez | AS05a, AC06a, D06a |  |
| Solo se opera en el estado correcto | S11, S14, AP09, AS04, AS07a, AS14, AC05, D05, N05 |  |
| Actor o categoría inactiva no se usa | U20a (raíz); AP11a, D14b, H09c, C08a; A09, S07, S09 | U20a es la raíz de «un usuario inactivo no opera» (TRA-21); C08a es distinta. |
| Bloqueos para inactivar o dar de baja | A19, C14a, C14b, U15a, U16, CA12a, CA12b |  |
| Identidad única | A03, A04, C05, U04, CA04 |  |
| Reglas individuales (sin familia) | A16a, A16b, C08b, S10b, AP02b, AP12a, AS08, AC07a, RD15, H07, T02a | Todas las demás fichas; 11 fichas. |
 
*Fuente: elaboración propia a partir de las fichas aprobadas de los bloques de entidad y de RN-T02a.*
 
## **2.2.4 Fichas de RN por entidad**
 
Se presentan, en el orden de los bloques, las fichas oficiales de cada entidad y su párrafo «De dónde nace». Las tablas de clasificación de las candidatas están en el anexo A y la verificación en reversa de los criterios de aceptación de rechazo, en el anexo B. Las entidades Rol_Permiso, Auditoría y Reportes no tienen fichas.
 
### **2.2.4.1 Activo (RN-A01 a RN-A19)**
 
| **Código** | **RN-A03** |
| --- | --- |
| **Enunciado** | No pueden existir dos activos con el mismo número de serie, estén o no dados de baja. |
| **Origen** | HU-01 CA-3 y HU-03 CA-3. Regla implícita de 1.7.3 («Cada equipo se identifica de forma única», análisis documental) y N-01. Detectada en el análisis de documentos; la extensión a activos en Baja es propuesta del equipo. Ambas pendientes de validar con el cliente (P-A1). |
| **RF que la vigilan** | RF-02, RF-51 |
 
| **Código** | **RN-A04** |
| --- | --- |
| **Enunciado** | No pueden existir dos activos con la misma placa de inventario, estén o no dados de baja. |
| **Origen** | HU-01 CA-3 y HU-03 CA-3. Regla implícita de 1.7.3 (análisis documental) y N-01. Detectada en el análisis de documentos; la extensión a activos en Baja es propuesta del equipo. Ambas pendientes de validar con el cliente (P-A1). |
| **RF que la vigilan** | RF-02, RF-51 |
 
| **Código** | **RN-A09** |
| --- | --- |
| **Enunciado** | No se permite clasificar un activo en una categoría inactiva. |
| **Origen** | HU-01 CA-6 y HU-03 CA-4. Sin respaldo en la entrevista. Propuesta del equipo, pendiente de validar con el cliente (P-A2). |
| **RF que la vigilan** | RF-52, RF-53 |
 
| **Código** | **RN-A16a** |
| --- | --- |
| **Enunciado** | No se permite corregir manualmente el estado de un activo que tiene una asignación vigente; su estado solo cambia por un reporte de daño o al cerrarse la asignación. |
| **Origen** | HU-03 CA-5. La respuesta 11 de 1.7 (estado actual, 5 de 19) respalda el dato, no la regla. Propuesta del equipo, pendiente de validar con el cliente (P-04). |
| **RF que la vigilan** | RF-60 |
 
| **Código** | **RN-A16b** |
| --- | --- |
| **Enunciado** | Un activo solo pasa a Asignado al entregarse a un custodio y a Baja al darse de baja; cualquier otra corrección de su estado se limita a Disponible o Dañado. |
| **Origen** | HU-03 CA-5 y HU-03 CA-1. Sin respaldo en la entrevista. Propuesta del equipo, pendiente de validar con el cliente (P-04). |
| **RF que la vigilan** | RF-54, RF-05 |
 
| **Código** | **RN-A18** |
| --- | --- |
| **Enunciado** | Un activo dado de baja no admite ningún cambio ni nuevas operaciones: no se modifica, no se da de baja de nuevo y no se le registran reportes de daño ni mantenimientos. |
| **Origen** | HU-03 CA-6 y HU-04 CA-3. La respuesta 9 de 1.7 (bajas, 7 de 19; N-11) respalda registrar la baja, no su carácter terminal. Propuesta del equipo, pendiente de validar con el cliente (P-04). |
| **RF que la vigilan** | RF-55, RF-57, RF-124, RF-131 |
 
| **Código** | **RN-A19** |
| --- | --- |
| **Enunciado** | No se permite dar de baja un activo que tiene una asignación vigente; primero se cierra la asignación. |
| **Origen** | HU-04 CA-4. La respuesta 9 de 1.7 (bajas, 7 de 19; N-11) respalda la baja, no esta condición. Propuesta del equipo, pendiente de validar con el cliente (P-04, P-A3; relacionada con P-13). |
| **RF que la vigilan** | RF-58 |
 
*Nota: RN-A16a, RN-A16b y RN-A19 se apoyan en la adenda CRF-003 (cambios 3 y 4), cuyas poscondiciones y el método Solicitud.listarAprobadas() aún no figuran en el diccionario v6 ni en el UML v6.*
 
Las RN del bloque las delatan los criterios de rechazo. HU-01 CA-3 y HU-03 CA-3 exigen que serie y placa no se repitan (RN-A03 y RN-A04), regla que coincide con la regla implícita de 1.7.3 «Cada equipo se identifica de forma única»; las otras tres reglas de 1.7.3 (acta firmada, decisión atribuible y solo un equipo disponible puede entregarse) no corresponden a este bloque. HU-01 CA-6 y HU-03 CA-4 rechazan la categoría inactiva (RN-A09). Los rechazos de estado de HU-03 CA-5 dan RN-A16a y RN-A16b; HU-03 CA-6 y HU-04 CA-3 dan RN-A18, que absorbe a RN-A11 por ser consecuencia del estado terminal de la baja; HU-04 CA-4 da RN-A19. El resto no pasa el filtro: los obligatorios, las longitudes, el ENUM, la FK y el estado inicial Disponible (RN-A06, valor por defecto del diccionario) son restricciones del diccionario; la unicidad al actualizar, el orden y la búsqueda son comportamiento del sistema; el aviso de baja es interfaz, «jamás DELETE» es doctrina del curso y la auditoría es una cualidad. Ninguna RN fue dictada por el cliente: el cuestionario de 1.7 respalda necesidades (N-01, N-11), no reglas.
 
### **2.2.4.2 Custodio (RN-C01 a RN-C17)**
 
| **Código** | **RN-C05** |
| --- | --- |
| **Enunciado** | No pueden existir dos custodios con el mismo tipo y número de documento, estén activos o inactivos. |
| **Origen** | HU-05 CA-5 y HU-07 CA-3. Respaldo débil: la pregunta 9 de 1.7 (saber quién tiene cada equipo, 9 de 19; N-02) respalda identificar al custodio, no la unicidad del documento. Propuesta del equipo, pendiente de validar con el cliente (P-11, P-18). |
| **RF que la vigilan** | RF-07, RF-61 |
 
| **Código** | **RN-C08a (división provisional de RN-C08)** |
| --- | --- |
| **Enunciado** | Solo un empleado activo puede ser registrado como custodio. |
| **Origen** | HU-05 CA-6 (fila usuario inactivo). Sin respaldo en la entrevista. Propuesta del equipo, pendiente de validar con el cliente (P-08). |
| **RF que la vigilan** | RF-62 |
 
| **Código** | **RN-C08b (división provisional de RN-C08)** |
| --- | --- |
| **Enunciado** | Solo una persona con el rol Empleado puede ser registrada como custodio. |
| **Origen** | HU-05 CA-6 (fila rol Gerente). Sin respaldo en la entrevista. Propuesta del equipo, pendiente de validar con el cliente (P-08). |
| **RF que la vigilan** | RF-63 |
 
| **Código** | **RN-C12b (división provisional de RN-C12; incluye RN-C13)** |
| --- | --- |
| **Enunciado** | Un custodio inactivo no puede reactivarse ni inactivarse de nuevo. |
| **Origen** | HU-08 CA-1 y HU-08 CA-3. Sin respaldo en la entrevista. Propuesta del equipo, pendiente de validar con el cliente (P-14, P-15). |
| **RF que la vigilan** | RF-64; RF-09 (parcial: no reactivar) |
 
| **Código** | **RN-C14a (división provisional de RN-C14)** |
| --- | --- |
| **Enunciado** | No se permite inactivar a un custodio que tiene asignaciones vigentes; primero se cierran. |
| **Origen** | HU-08 CA-5 (fila asignación Vigente). Sin respaldo en la entrevista. Propuesta del equipo, pendiente de validar con el cliente (P-13). |
| **RF que la vigilan** | RF-65 |
 
| **Código** | **RN-C14b (división provisional de RN-C14)** |
| --- | --- |
| **Enunciado** | No se permite inactivar a un custodio que tiene solicitudes pendientes; primero se cancelan. |
| **Origen** | HU-08 CA-5 (fila solicitud Pendiente). Sin respaldo en la entrevista. Propuesta del equipo, pendiente de validar con el cliente (P-13). |
| **RF que la vigilan** | RF-66 |
 
*Nota: ninguna RN del Bloque 1 depende de la adenda CRF-003. RN-C14a es coherente con RN-A19, que sí depende de ella.*
 
Las RN del bloque las delatan los criterios de rechazo. HU-05 CA-5 y HU-07 CA-3 rechazan el documento ya registrado, incluso el de un custodio inactivo (RN-C05). HU-05 CA-6 rechaza al usuario inactivo y al de rol Gerente (RN-C08a y RN-C08b). HU-08 CA-3 rechaza inactivar de nuevo y el aviso de HU-08 CA-1 declara que no se reactiva (RN-C12b, que absorbe a RN-C13). HU-08 CA-5 rechaza inactivar con asignaciones vigentes o solicitudes pendientes (RN-C14a y RN-C14b). El resto no pasa el filtro: obligatorios, longitudes, ENUM, FK, el UNIQUE estructural del usuario y los valores iniciales son restricciones del diccionario; unicidad al actualizar, campos editables y consultas son comportamiento del sistema; el aviso de inactivar es interfaz y «jamás DELETE» es doctrina del curso. RN-C17 no nace de ningún criterio de rechazo: el actor de cada operación ya está fijado en el «Como [actor]» de cada HU y el modelo lo resuelve con Rol_Permiso, por lo que pasa a RNF candidato (control de acceso por rol). Ninguna RN fue dictada por el cliente y ninguna coincide con las 4 reglas de 1.7.3 (N-02 respalda a RN-C05 de forma débil, pero no figura entre ellas).
 
### **2.2.4.3 Solicitud (RN-S01 a RN-S21)**
 
| **Código** | **RN-S07** |
| --- | --- |
| **Enunciado** | No se permite solicitar un equipo de una categoría inactiva. |
| **Origen** | HU-09 CA-4 y HU-11 CA-2. Sin respaldo en la entrevista. Propuesta del equipo, pendiente de validar con el cliente (P-19). |
| **RF que la vigilan** | RF-68, RF-76 |
 
| **Código** | **RN-S09** |
| --- | --- |
| **Enunciado** | No se permite registrar una solicitud a nombre de un custodio inactivo. |
| **Origen** | HU-09 CA-5 (fila custodio inactivo). Sin respaldo en la entrevista. Propuesta del equipo, pendiente de validar con el cliente (P-19). |
| **RF que la vigilan** | RF-69 |
 
| **Código** | **RN-S10b (división provisional de RN-S10)** |
| --- | --- |
| **Enunciado** | Solo un empleado registrado como custodio puede solicitar equipos. |
| **Origen** | HU-09 CA-5 (fila empleado sin custodio registrado). El Alcance 1.2 («solicitudes de equipos realizadas por los empleados») respalda que el Empleado solicita, no la precondición. Propuesta del equipo, pendiente de validar con el cliente (P-09, P-105). |
| **RF que la vigilan** | RF-70 |
 
| **Código** | **RN-S11** |
| --- | --- |
| **Enunciado** | No se permite actualizar una solicitud que ya fue aprobada, rechazada o cancelada. |
| **Origen** | HU-11 CA-3. La pregunta 6 de 1.7 (las solicitudes son la dificultad alta más frecuente, 6 de 19; N-03) respalda el canal formal, no esta regla. Propuesta del equipo, pendiente de validar con el cliente (P-21). |
| **RF que la vigilan** | RF-13 |
 
| **Código** | **RN-S14 (incluye RN-S13b)** |
| --- | --- |
| **Enunciado** | Solo se puede cancelar una solicitud pendiente de decisión; una solicitud cancelada no puede reactivarse. |
| **Origen** | HU-12 CA-3 y HU-12 CA-1 (aviso). Sin respaldo en la entrevista. Propuesta del equipo, pendiente de validar con el cliente (P-21, P-22, P-S1). |
| **RF que la vigilan** | RF-78; RF-14 (parcial: no reactivar) |
 
| **Código** | **RN-S19 (incluye RN-S10c)** |
| --- | --- |
| **Enunciado** | Un empleado solo puede registrar, consultar, modificar o cancelar solicitudes a su propio nombre. |
| **Origen** | HU-09 CA-5 (fila custodio de otro empleado), HU-10 CA-5, HU-11 CA-5 y HU-12 CA-4. El Alcance 1.2 respalda consultar las propias; el resto es propuesta del equipo, pendiente de validar con el cliente (P-21; para el registro, P-105). |
| **RF que la vigilan** | RF-71, RF-75, RF-77, RF-80 |
 
*Nota: RN-S21 depende de la adenda CRF-003 (cambio 6): Solicitud.listarAprobadas() aún no figura en el diagrama v6. En este bloque queda como RF candidato (S21a) y mensaje (S21b), sin ficha de RN; ninguna ficha del bloque depende de esa adenda.*
 
Las RN del bloque las delatan los criterios de rechazo. HU-09 CA-4 y HU-11 CA-2 rechazan la categoría inactiva (RN-S07); HU-09 CA-5 rechaza al custodio inactivo (RN-S09), al empleado que no está registrado como custodio (RN-S10b) y al custodio de otro empleado (RN-S19). HU-10 CA-5, HU-11 CA-5 y HU-12 CA-4 rechazan el acceso a solicitudes ajenas (RN-S19, propiedad). HU-11 CA-3 rechaza actualizar lo que ya no está pendiente (RN-S11) y HU-12 CA-3 rechaza cancelarlo (RN-S14, que absorbe la no reactivación del aviso de HU-12 CA-1). El resto no pasa el filtro: obligatorios, longitud, ENUM, FK y los valores iniciales son restricciones del diccionario; campos editables, búsquedas y listados son comportamiento del sistema; el aviso de cancelar es interfaz y «jamás DELETE» es doctrina del curso. Las reglas de autoridad por rol (RN-S10a, RN-S20) son RNF candidato; el custodio tomado de la sesión es mecanismo del sistema (RN-T03), a decidir en Transversales. Ninguna RN fue dictada por el cliente y ninguna coincide con las 4 reglas de 1.7.3.
 
### **2.2.4.4 Aprobación (RN-AP01 a RN-AP14)**
 
| **Código** | **RN-AP02b (división provisional de RN-AP02)** |
| --- | --- |
| **Enunciado** | Todo rechazo de una solicitud debe justificarse con un motivo. |
| **Origen** | HU-13 CA-3 (fila rechazo sin motivo). Sin respaldo en la entrevista; N-04 respalda dejar constancia de quién autorizó, no el motivo. Propuesta del equipo, pendiente de validar con el cliente (P-B1, nueva provisional; relacionada con P-26). |
| **RF que la vigilan** | RF-81 |
 
| **Código** | **RN-AP06a (división provisional de RN-AP06)** |
| --- | --- |
| **Enunciado** | La decisión de aprobación o rechazo de una solicitud es definitiva: no se modifica ni se revoca. |
| **Origen** | HU-13 CA-5. N-04 (aprobaciones trazables) respalda la trazabilidad, no la irrevocabilidad. Propuesta del equipo, pendiente de validar con el cliente (P-25). |
| **RF que la vigilan** | RF-16, RF-82 |
 
| **Código** | **RN-AP09** |
| --- | --- |
| **Enunciado** | No se permite decidir sobre una solicitud que ya no está pendiente de decisión. |
| **Origen** | HU-13 CA-5 (solicitud ya decidida) y HU-13 CA-6 (fila solicitud cancelada). Sin respaldo en la entrevista. Propuesta del equipo, pendiente de validar con el cliente (sin P-xx propio; relacionada con P-21 y P-22). |
| **RF que la vigilan** | RF-82 |
 
| **Código** | **RN-AP11a (división provisional de RN-AP11)** |
| --- | --- |
| **Enunciado** | No se permite que decida una solicitud un aprobador inactivo. |
| **Origen** | HU-13 CA-7 (fila aprobador inactivo). Sin respaldo en la entrevista. Propuesta del equipo, pendiente de validar con el cliente (sin P-xx propio; relacionada con P-66 y P-67). |
| **RF que la vigilan** | RF-83 |
 
| **Código** | **RN-AP12a (división provisional de RN-AP12) · ANCLA de la regla de 1.7.3 «decisión atribuible» (N-04)** |
| --- | --- |
| **Enunciado** | Toda decisión de aprobación o rechazo queda atribuida a la persona identificada que la toma. |
| **Origen** | HU-13 CA-7 (fila aprobador distinto del usuario en sesión). Regla implícita de 1.7.3 («Toda solicitud debe tener una decisión de aprobación atribuible a una persona identificada», N-04; análisis documental: aprobaciones informales «ok, proceda»); preguntas 9 (autorizaciones, 6 de 19) y 11 (responsable de aprobación, 3 de 19). Detectada en el análisis de documentos, pendiente de validar con el cliente (sin P-xx propio; relacionada con P-24). |
| **RF que la vigilan** | RF-84 |
 
| **Código** | **RN-AP14** |
| --- | --- |
| **Enunciado** | Un empleado solo puede consultar la decisión de las solicitudes hechas a su nombre. |
| **Origen** | HU-14 CA-5. El Alcance 1.2 respalda consultar el estado de las propias; la extensión a la decisión es propuesta del equipo, pendiente de validar con el cliente (P-21). |
| **RF que la vigilan** | RF-85 |
 
*Nota: ninguna RN del Bloque 2b depende de la adenda CRF-003. RN-AP07 (la solicitud pasa a Aprobada) alimenta la consulta de aprobadas sin asignación (RF-12), que sí depende de ella.*
 
Las RN del bloque las delatan los criterios de rechazo. HU-13 CA-3 rechaza el rechazo sin motivo (RN-AP02b); HU-13 CA-5 rechaza decidir de nuevo una solicitud ya decidida (RN-AP09, porque al decidirse deja de estar pendiente, y RN-AP06a, que hace definitiva la decisión); HU-13 CA-6 rechaza decidir una solicitud cancelada (RN-AP09); HU-13 CA-7 rechaza al aprobador inactivo (RN-AP11a) y a quien no es el usuario en sesión (RN-AP12a, ancla de la regla de 1.7.3 sobre la decisión atribuible); HU-14 CA-5 rechaza consultar la decisión de una solicitud ajena (RN-AP14, propiedad). El resto no pasa el filtro: obligatorios, longitud, ENUM, FK, el UNIQUE estructural 1 a 1 y el valor inicial son restricciones del diccionario; el efecto sobre la solicitud y la consulta son comportamiento del sistema; el rol Aprobador es autoridad por rol (RNF candidato) y el identificador tomado de la sesión es mecanismo (RN-T03). Ninguna RN fue dictada por el cliente; solo RN-AP12a coincide con las 4 reglas de 1.7.3, y las preguntas 9 y 11 respaldan la necesidad de una decisión atribuible (N-04), no el resto de las reglas.
 
### **2.2.4.5 Asignación (RN-AS01 a RN-AS24)**
 
| **Código** | **RN-AS04** |
| --- | --- |
| **Enunciado** | Solo se puede asignar un equipo a una solicitud aprobada. |
| **Origen** | HU-15 CA-3 (filas solicitud pendiente, rechazada y cancelada). El Alcance 1.2 («asignar los activos aprobados») la respalda en parte; pendiente de validar con el cliente (sin P-xx propio). |
| **RF que la vigilan** | RF-87 |
 
| **Código** | **RN-AS05a (división provisional de RN-AS05)** |
| --- | --- |
| **Enunciado** | Una solicitud se atiende con una sola asignación. |
| **Origen** | HU-15 CA-4. Sin respaldo en la entrevista. Propuesta del equipo, pendiente de validar con el cliente (P-AS1, nueva provisional). |
| **RF que la vigilan** | RF-88 |
 
| **Código** | **RN-AS07a (división provisional de RN-AS07) · ANCLA de la regla de 1.7.3 «solo un equipo disponible puede entregarse»** |
| --- | --- |
| **Enunciado** | Solo puede entregarse un equipo disponible. |
| **Origen** | HU-15 CA-5 (filas activo asignado, dañado y dado de baja). Regla implícita de 1.7.3 («Solo un equipo disponible puede entregarse», análisis documental). Detectada en el análisis de documentos, pendiente de validar con el cliente (sin P-xx propio; relacionada con P-32). |
| **RF que la vigilan** | RF-89 |
 
| **Código** | **RN-AS08** |
| --- | --- |
| **Enunciado** | El equipo que se asigna debe ser de la misma categoría que la solicitud. |
| **Origen** | HU-15 CA-6. Sin respaldo en la entrevista. Propuesta del equipo, pendiente de validar con el cliente (P-29). |
| **RF que la vigilan** | RF-90 |
 
| **Código** | **RN-AS13b (división provisional de RN-AS13; incluye RN-AS17 y RN-AS15b)** |
| --- | --- |
| **Enunciado** | Una asignación cerrada es definitiva: no se modifica, no se cierra de nuevo y no puede reactivarse. |
| **Origen** | HU-17 CA-4, HU-18 CA-5 y HU-18 CA-1 (aviso). Sin respaldo en la entrevista. Propuesta del equipo, pendiente de validar con el cliente (sin P-xx propio; relacionada con P-34). |
| **RF que la vigilan** | RF-97, RF-98; RF-20 (parcial: no reactivar) |
 
| **Código** | **RN-AS14** |
| --- | --- |
| **Enunciado** | Una asignación solo se cierra cuando la devolución del equipo está confirmada. |
| **Origen** | HU-18 CA-4 (filas sin devolución registrada y devolución pendiente). Sin respaldo en la entrevista. Propuesta del equipo, pendiente de validar con el cliente (P-34). |
| **RF que la vigilan** | RF-100 |
 
| **Código** | **RN-AS23a (división provisional de RN-AS23)** |
| --- | --- |
| **Enunciado** | Un empleado solo puede consultar las asignaciones hechas a su nombre. |
| **Origen** | HU-16 CA-7 (también CA-6). El Alcance 1.2 respalda consultar «sus asignaciones vigentes»; la restricción a las propias es propuesta del equipo, pendiente de validar con el cliente (sin P-xx propio; relacionada con P-37). |
| **RF que la vigilan** | RF-96 |
 
*Nota: RN-AS14 depende de la adenda CRF-003 (cambio 5); también dependen de ella partes que no son RN: AS11 (cambio 1), AS15c (cambios 2 y 5), AS18 (cambio 3, ya fusionada) y el caso Dañado de AS22 (cambio 3). Ninguna ficha cita la adenda.*
 
Las RN del bloque las delatan los criterios de rechazo. HU-15 CA-3 rechaza asignar una solicitud no aprobada (RN-AS04); CA-4, la que ya tiene asignación (RN-AS05a); CA-5, el equipo que no está disponible (RN-AS07a, ancla de la regla de 1.7.3 sobre entregar solo equipos disponibles); CA-6, la categoría distinta (RN-AS08). HU-17 CA-4 y HU-18 CA-5 rechazan modificar y cerrar de nuevo una asignación cerrada, y el aviso de HU-18 CA-1 declara que no se reactiva (RN-AS13b). HU-18 CA-4 rechaza cerrar sin devolución confirmada (RN-AS14) y HU-16 CA-7 rechaza consultar asignaciones ajenas (RN-AS23a, propiedad). El resto no pasa el filtro: obligatorios, FK, ENUM, valores asignados al crear, el UNIQUE estructural y la coherencia entre fechas son restricciones del diccionario; los efectos sobre el activo, los campos editables y las consultas son comportamiento del sistema; el aviso de cerrar es interfaz, «jamás DELETE» es doctrina del curso y quién ejecuta cada operación es autoridad por rol (RNF candidato). Ninguna RN fue dictada por el cliente; solo RN-AS07a coincide con las 4 reglas de 1.7.3.
 
### **2.2.4.6 Acta de entrega (RN-AC01 a RN-AC10)**
 
| **Código** | **RN-AC05** |
| --- | --- |
| **Enunciado** | Solo se puede firmar el acta de una asignación vigente. |
| **Origen** | HU-19 CA-4 (fila asignación cerrada). Sin respaldo en la entrevista. Propuesta del equipo, pendiente de validar con el cliente (P-40). |
| **RF que la vigilan** | RF-104 |
 
| **Código** | **RN-AC06a (división provisional de RN-AC06)** |
| --- | --- |
| **Enunciado** | Una asignación tiene una sola acta. |
| **Origen** | HU-19 CA-5. Sin respaldo en la entrevista. Propuesta del equipo, pendiente de validar con el cliente (P-AC1, nueva provisional; relacionada con P-41). |
| **RF que la vigilan** | RF-105 |
 
| **Código** | **RN-AC07a (división provisional de RN-AC07) · ANCLA de la regla de 1.7.3 «acta firmada por quien recibe» (N-05)** |
| --- | --- |
| **Enunciado** | Toda entrega de un equipo debe quedar respaldada por un acta firmada por quien lo recibe. |
| **Origen** | Regla implícita de 1.7.3 (N-05; análisis documental); pregunta 10 de 1.7 (firma del acta al entregar: sí 11, a veces 3, no 4, no sabe 1) y Alcance 1.2 (acta digital firmada). Detectada en el análisis de documentos, pendiente de validar con el cliente (P-41). |
| **RF que la vigilan** | RF-102 |
 
| **Código** | **RN-AC07b (división provisional de RN-AC07)** |
| --- | --- |
| **Enunciado** | El acta de entrega solo puede firmarla el custodio que recibe el equipo. |
| **Origen** | HU-19 CA-6. El Alcance 1.2 («firma digital del empleado receptor») respalda que firma el receptor; que solo firme el custodio de esa asignación es propuesta del equipo, pendiente de validar con el cliente (P-41). |
| **RF que la vigilan** | RF-103 |
 
| **Código** | **RN-AC10** |
| --- | --- |
| **Enunciado** | Un empleado solo puede consultar el acta de una asignación hecha a su nombre. |
| **Origen** | HU-20 CA-5. El Alcance 1.2 respalda consultar «sus asignaciones vigentes»; la extensión al acta es propuesta del equipo, pendiente de validar con el cliente (P-40). |
| **RF que la vigilan** | RF-106 |
 
*Nota: ninguna RN del Bloque 4a-2 depende de la adenda CRF-003.*
 
Las RN del bloque nacen de dos orígenes. Los criterios de rechazo delatan tres: HU-19 CA-4 rechaza firmar el acta de una asignación cerrada (RN-AC05); CA-5, firmar una segunda acta para la misma asignación (RN-AC06a); CA-6, que firme alguien distinto del custodio de la asignación (RN-AC07b); y HU-20 CA-5 rechaza consultar el acta de una asignación ajena (RN-AC10, propiedad). La cuarta, RN-AC07a, nace de la regla implícita de 1.7.3 «acta firmada por quien recibe» (N-05) y de la pregunta 10, sin CA de rechazo que la pruebe: es el ancla del bloque y una regla con respaldo documental. El resto no pasa el filtro: obligatorios, longitud, FK, el valor asignado al crear y el UNIQUE estructural son restricciones del diccionario; la generación del identificador y la consulta son comportamiento del sistema; la seguridad de la firma digital (RN-AC08) es una cualidad, mecanismo del ancla. Ninguna RN fue dictada por el cliente; solo RN-AC07a coincide con las 4 reglas de 1.7.3.
 
### **2.2.4.7 Devolución (RN-D01 a RN-D21)**
 
| **Código** | **RN-D05** |
| --- | --- |
| **Enunciado** | Solo se puede registrar la devolución de una asignación vigente. |
| **Origen** | HU-21 CA-5 (fila asignación cerrada). Sin respaldo en la entrevista. Propuesta del equipo, pendiente de validar con el cliente (sin P-xx propio; relacionada con P-34). |
| **RF que la vigilan** | RF-107 |
 
| **Código** | **RN-D06a (división provisional de RN-D06)** |
| --- | --- |
| **Enunciado** | Una asignación se devuelve una sola vez. |
| **Origen** | HU-21 CA-6. Sin respaldo en la entrevista; la encuesta no pregunta por la devolución (N-06 respalda de forma indirecta la fecha de entrega). Propuesta del equipo, pendiente de validar con el cliente (sin P-xx propio; relacionada con P-47). |
| **RF que la vigilan** | RF-108 |
 
| **Código** | **RN-D07b (división provisional de RN-D07; incluye RN-D12 y RN-D20)** |
| --- | --- |
| **Enunciado** | Un empleado solo puede registrar, consultar o modificar devoluciones de asignaciones hechas a su nombre. |
| **Origen** | HU-21 CA-7, HU-22 CA-7 y HU-23 CA-7. El Alcance 1.2 respalda registrar la devolución de los equipos (sin nombrar al actor) y consultar «sus asignaciones vigentes»; la restricción a las propias es propuesta del equipo, pendiente de validar con el cliente (P-42). |
| **RF que la vigilan** | RF-109, RF-112, RF-114 |
 
| **Código** | **RN-D11b (división provisional de RN-D11; incluye RN-D17)** |
| --- | --- |
| **Enunciado** | Una devolución confirmada es definitiva: no se modifica, no se confirma de nuevo y no vuelve a pendiente. |
| **Origen** | HU-23 CA-5 y HU-24 CA-4. Sin respaldo en la entrevista. Propuesta del equipo, pendiente de validar con el cliente (P-49). |
| **RF que la vigilan** | RF-113, RF-115; RF-26 (parcial: no volver a Pendiente) |
 
| **Código** | **RN-D14b (división provisional de RN-D14)** |
| --- | --- |
| **Enunciado** | No se permite que confirme la recepción de un equipo un responsable inactivo. |
| **Origen** | HU-24 CA-6 (fila receptor inactivo). El Alcance 1.2 respalda que el Responsable de Activos confirma la recepción; que esté activo es propuesta del equipo, pendiente de validar con el cliente (sin P-xx propio; relacionada con P-42). |
| **RF que la vigilan** | RF-116 |
 
*Nota: ninguna ficha del Bloque 4b-1 depende de la adenda CRF-003. Sí dependen de ella partes que no son RN: D10 y D15 (cambios 2 y 5).*
 
Las RN del bloque las delatan los criterios de rechazo. HU-21 CA-5 rechaza registrar la devolución de una asignación cerrada (RN-D05); CA-6, una segunda devolución para la misma asignación (RN-D06a); HU-21 CA-7, HU-22 CA-7 y HU-23 CA-7 rechazan operar devoluciones de asignaciones ajenas (RN-D07b, propiedad). HU-23 CA-5 y HU-24 CA-4 rechazan modificar o confirmar de nuevo una devolución confirmada (RN-D11b), y HU-24 CA-6 rechaza al receptor inactivo (RN-D14b). El resto no pasa el filtro: obligatorios, longitud, FK, ENUM, valores asignados al crear y el UNIQUE estructural son restricciones del diccionario; los efectos sobre la asignación y el activo, los campos editables y las consultas son comportamiento del sistema; el aviso de confirmar es interfaz y quién registra y quién confirma es autoridad por rol (RNF candidato). Ninguna RN fue dictada por el cliente, ninguna es ancla nueva de 1.7.3 (las cuatro ya están cubiertas), y la encuesta no pregunta por la devolución.
 
### **2.2.4.8 Notificación de devolución (RN-N01 a RN-N10)**
 
| **Código** | **RN-N05** |
| --- | --- |
| **Enunciado** | Solo se avisa la devolución de un equipo cuya asignación está vigente; la de una asignación cerrada no se avisa. |
| **Origen** | HU-25 CA-4 (fila asignación cerrada). El Alcance 1.2 habla de «próximas devoluciones», lo que excluye lo ya devuelto, pero no lo enuncia; la encuesta no pregunta por el aviso. Propuesta del equipo, pendiente de validar con el cliente (P-46; relacionada con P-44). |
| **RF que la vigilan** | RF-120 |
 
*Nota: ninguna ficha del Bloque 4b-2 depende de la adenda CRF-003 de forma directa. RN-N05 se apoya, por referencia, en que la asignación sigue vigente hasta confirmar la recepción (RN-AS14; cambios 2 y 5; DEP-05).*
 
HU-25 solo tiene dos criterios de rechazo. CA-4 rechaza avisar una asignación cerrada (RN-N05) y CA-5 rechaza una asignación inexistente, que es la FK del diccionario (N02) y no una RN. El resto no pasa el filtro: el identificador, la FK, la ausencia de UNIQUE y el dato derivado son restricciones del diccionario; el disparador automático, el destinatario, la cadena hasta el correo, el envío y el cálculo de días son comportamiento del sistema (RF-28); el plazo y la frecuencia no los definió el cliente y quedan como pregunta (P-44); y «único aviso» es alcance. El aviso al custodio es el contenido de RF-28: no nace de un criterio de rechazo ni tiene respaldo documental suficiente para ser RN.
 
Respaldo en la entrevista (1.7). La pregunta 14 solo ofrece cuatro opciones (acta digital firmada, notificar a TI, cambio automático de responsable y todas las anteriores) y ninguna es el aviso de devolución al custodio: el respaldo directo es 0 de 19. «Notificar a TI» (5) y «todas» (7) suman 12, pero se refieren a avisar a TI (N-07); las alertas preventivas (7, pregunta 7) corresponden a mantenimiento (N-09) y las notificaciones de disponibilidad (1, pregunta 13) son otra cosa. El único respaldo del aviso es el Alcance 1.2, y la Tabla 5 de 1.7.3 pide validarlo con el Responsable de Activos. Ninguna RN fue dictada por el cliente ni es ancla nueva de 1.7.3.
 
### **2.2.4.9 Reporte de daños (RN-RD01 a RN-RD19)**
 
| **Código** | **RN-RD07a** |
| --- | --- |
| **Enunciado** | Un empleado solo puede reportar el daño de un equipo que tiene asignado a su nombre. |
| **Origen** | HU-26 CA-6 (equipo de otro custodio y equipo sin asignación vigente). El Alcance 1.2 respalda reportar daños sin limitar al empleado a lo suyo; esta limitación es propuesta del equipo, pendiente de validar con el cliente (P-51). |
| **RF que la vigilan** | RF-125 |
 
| **Código** | **RN-RD07b** |
| --- | --- |
| **Enunciado** | Un empleado solo puede consultar o actualizar los reportes de daño que él hizo. |
| **Origen** | HU-27 CA-6 (reporte de otro custodio) y HU-28 CA-7. El Alcance 1.2 respalda que el Técnico de Soporte consulte los reportes; que el empleado vea o actualice solo los suyos es una suposición. Propuesta del equipo, pendiente de validar con el cliente (P-55; relacionada con P-RD2). |
| **RF que la vigilan** | RF-127, RF-129 |
 
| **Código** | **RN-RD15** |
| --- | --- |
| **Enunciado** | No se permite modificar un reporte de daño que ya tiene un mantenimiento asociado. |
| **Origen** | HU-28 CA-5. Ni el Alcance 1.2 ni la encuesta la respaldan. Propuesta del equipo, pendiente de validar con el cliente (P-54; cruza con el B5b; DEP-06). |
| **RF que la vigilan** | RF-128 |
 
*Nota: ninguna ficha del Bloque 5a depende de la adenda CRF-003 de forma directa. Sí dependen de ella partes que no son RN: RD09 y RD16 (cambio 3), y RD07a limita el paso de disponible a dañado que ese cambio incluía (P-51).*
 
Las RN las delatan los criterios de rechazo. HU-26 CA-6 da la propiedad sobre el equipo (RD07a); HU-27 CA-6 y HU-28 CA-7 dan la propiedad sobre los reportes (RD07b), a la que se fusionan las candidatas RD13b y RD17, que son la misma regla en otras operaciones. HU-28 CA-5 da RD15, y la fila de baja de HU-26 CA-6 da RD08, que es consecuencia de RN-A18. El resto no pasa el filtro: los obligatorios, longitudes, ENUM y FK son del diccionario; el efecto sobre el activo (RD09, RD16), el listado, los campos editables y el reporte repetido (RD10) son comportamiento del sistema; la autoridad del Técnico es RNF; el custodio de la sesión es el mecanismo de RN-T03. RD09 es el A16c que el B0 ya dejó como RF candidato, así que se consolida sin cambiar ninguna ficha del B0.
 
Respaldo en 1.7. Es débil y solo para la capacidad de reportar, no para ninguna regla: la pregunta 7 da «solicitud fácil de daño» a 3 de 19. «Notificar a TI» (5, más 7 de «todas», 12 de 19) es otro aviso, fuera del alcance. En las preguntas 12 y 13 solo hay menciones indirectas y sin cifra. Ninguna respuesta respalda quién reporta, sobre qué equipos o hasta cuándo se actualiza. Ninguna RN fue dictada por el cliente ni es ancla nueva de 1.7.3.
 
### **2.2.4.10 Historial de mantenimientos (RN-H01 a RN-H18)**
 
| **Código** | **RN-H07** |
| --- | --- |
| **Enunciado** | Un mantenimiento solo puede asociarse a un reporte de daño del mismo equipo. |
| **Origen** | HU-29 CA-6 (reporte de otro activo; M-189). Ni el Alcance 1.2 ni la encuesta la respaldan; es una coherencia entre el mantenimiento y el reporte que propone el equipo, pendiente de validar con el cliente (P-56). |
| **RF que la vigilan** | RF-132 |
 
| **Código** | **RN-H09c (división provisional de RN-H09)** |
| --- | --- |
| **Enunciado** | No se permite que registre un mantenimiento un técnico inactivo. |
| **Origen** | HU-29 CA-7 (usuario inactivo; M-39). Propuesta del equipo, pendiente de validar con el cliente (patrón de RN-AP11a y RN-D14b). |
| **RF que la vigilan** | RF-133 |
 
*Nota: ninguna ficha del Bloque 5b depende de la adenda CRF-003 de forma directa. Sí dependen de ella partes que no son RN: H12 y H18 (cambio 4), y H12b se apoya en A16a y A16b (cambios 3 y 4).*
 
Las RN las delatan los criterios de rechazo. HU-29 CA-6 da H07 (reporte de otro activo) y la fila de baja da H08, consecuencia del estado terminal que dicta RN-A18; HU-29 CA-7 da H09c (técnico inactivo). El resto no pasa el filtro: los obligatorios, longitudes, ENUM, FK y los rangos del costo y la fecha son del diccionario; el efecto sobre el estado del activo (H12a, H18), el listado, la búsqueda y los campos editables son comportamiento del sistema; la devolución manual a Disponible (H12b) es lo que ya dictan A16a y A16b; el rol del técnico y quién consulta son autoridad por rol; el técnico de la sesión es el mecanismo de RN-T03; y el registro simple sin alertas es alcance.
 
Respaldo en 1.7. Respalda la capacidad de consultar el historial (RF-33), pero ninguna regla: la pregunta 7 da «historial de reparaciones» a 8 de 19, la pregunta 11 da «historial de mantenimiento» a 5 de 19 y la pregunta 9 da «mantenimiento» a 4 de 19 (cuenta una respuesta que marcó todas las opciones); el Alcance 1.2 dice que el sistema facilitará consultar el historial de reparaciones de cada activo. Ninguna respuesta respalda quién registra, qué datos se exigen ni la relación con el reporte, el costo o la fecha. Las alertas preventivas (7 de 19) están fuera del alcance. No hay política con respaldo documental real, y que el historial no se elimine es la doctrina del curso. Ninguna RN fue dictada por el cliente ni es ancla nueva de 1.7.3.
 
### **2.2.4.11 Usuario (RN-U01 a RN-U23)**
 
| **Código** | **RN-U04** |
| --- | --- |
| **Enunciado** | No pueden existir dos usuarios con el mismo correo electrónico, estén activos o inactivos. |
| **Origen** | HU-32 CA-4 y HU-34 CA-5. Sin respaldo en la entrevista. El diccionario v6 exige que el correo sea único; que cuente a los usuarios inactivos es propuesta del equipo, pendiente de validar con el cliente (P-63). |
| **RF que la vigilan** | RF-36, RF-137 |
 
| **Código** | **RN-U12b (división provisional de RN-U12; incluye RN-U11 y RN-U13)** |
| --- | --- |
| **Enunciado** | Un usuario inactivo no puede reactivarse, actualizarse ni inactivarse de nuevo. |
| **Origen** | HU-34 CA-6 y CA-7 y HU-35 CA-3. No hay método de reactivación. Sin respaldo en la entrevista. Propuesta del equipo, pendiente de validar con el cliente (P-65, P-69; relacionada con P-14). |
| **RF que la vigilan** | RF-38 (parcial: no reactivar), RF-138, RF-139 |
 
| **Código** | **RN-U15a (división provisional de RN-U15)** |
| --- | --- |
| **Enunciado** | No se permite inactivar a un usuario que tiene un custodio activo; primero se inactiva al custodio. |
| **Origen** | HU-35 CA-5 (fila custodio activo). Sin respaldo en la entrevista. Propuesta del equipo, pendiente de validar con el cliente (P-66; coherente con RN-C14a y RN-C14b). |
| **RF que la vigilan** | RF-140 |
 
| **Código** | **RN-U16** |
| --- | --- |
| **Enunciado** | No se permite inactivar al único aprobador activo mientras existan solicitudes pendientes. |
| **Origen** | HU-35 CA-5 (fila único Aprobador). Sin respaldo en la entrevista. Propuesta del equipo, pendiente de validar con el cliente (P-66, P-67). |
| **RF que la vigilan** | RF-141 |
 
| **Código** | **RN-U20a (división provisional de RN-U20)** |
| --- | --- |
| **Enunciado** | Un usuario inactivo no puede iniciar sesión. |
| **Origen** | HU-36 CA-4. El diccionario define activo como «cuenta activa»; sin respaldo en la entrevista. Propuesta del equipo, pendiente de validar con el cliente (P-71). |
| **RF que la vigilan** | RF-144 |
 
| **Código** | **RN-U22** |
| --- | --- |
| **Enunciado** | Un usuario solo puede cambiar su propia contraseña. |
| **Origen** | HU-37 CA-5 (M-236). La Fase A v6 describe la operación como «cambia la contraseña propia»; el Alcance 1.2 no la menciona. Propuesta del equipo, pendiente de validar con el cliente (relacionada con P-61). |
| **RF que la vigilan** | RF-145 |
 
*Nota: ninguna ficha del Bloque 6a depende de la adenda CRF-003.*
 
Las RN las delatan los criterios de rechazo: HU-32 CA-4 y HU-34 CA-5 dan U04; HU-34 CA-7 y HU-35 CA-3 dan U12b; HU-35 CA-5 da U15a y U16; HU-36 CA-4 da U20a; y HU-37 CA-5 da U22. El resto no pasa el filtro: los obligatorios, longitudes, ENUM y el formato del correo son del diccionario; el cifrado, el mensaje genérico, ocultar la contraseña y que la nueva sea distinta de la actual son requisitos no funcionales de seguridad; la política de contraseña no está definida y queda como pregunta; consultar, actualizar, iniciar sesión y validar la actual son comportamiento del sistema; la auto-inactivación es una instancia de la propuesta transversal de segregación (PRO-02), que además es la única instancia con RF vigilante (RF-39); y el rol del Responsable es autoridad por rol.
 
Respaldo en 1.7. No hay ninguna cifra sobre acceso, usuarios, contraseñas, seguridad ni roles: el único respaldo es el Alcance 1.2, que dice que el sistema permitirá gestionar roles y permisos según el perfil de cada usuario, sin nombrar quién registra usuarios. Respalda la capacidad, no ninguna regla. No hay política con respaldo documental real ni ancla nueva de 1.7.3.
 
### **2.2.4.12 Rol_Permiso (RN-RP01 a RN-RP12)**
 
Sin fichas de RN en el bloque: las 12 candidatas pasan a otro destino.
 
Ningún criterio de rechazo de HU-38 a HU-40 delata una política del negocio. La pareja repetida (HU-38 CA-3) es la clave primaria compuesta y su rechazo es una restricción del diccionario que vigila RF-42 (M-240). Las demás son restricciones del diccionario (clave compuesta, obligatorios y los dos ENUM) o comportamiento del sistema (retirar, verificar existencia, consultar). El aviso de confirmación es mensaje. La eliminación física del retiro no se acepta como excepción a la doctrina: es pregunta (P-78). La matriz inicial no la definió el cliente (P-75) y la autoridad del Responsable es RNF.
 
Respaldo en 1.7. Ninguna pregunta ni respuesta abierta de 1.7 trata permisos ni acceso por rol: no hay cifras. El único respaldo es el Alcance 1.2, que dice que el sistema permitirá gestionar roles y permisos según el perfil de cada usuario, incluida la consulta, por parte del Responsable de Activos, de los permisos asignados a cada rol. Respalda la capacidad y la consulta del Responsable, no una matriz ni una política. No hay política con respaldo documental real ni ancla nueva de 1.7.3.
 
### **2.2.4.13 Categoría (RN-CA01 a RN-CA14)**
 
| **Código** | **RN-CA04** |
| --- | --- |
| **Enunciado** | No pueden existir dos categorías con el mismo nombre, estén activas o inactivas, sin distinguir mayúsculas de minúsculas. |
| **Origen** | HU-41 CA-4 y HU-43 CA-3. Sin respaldo en la entrevista. El diccionario v6 exige que el nombre sea único; que cuente a las inactivas y no distinga mayúsculas es propuesta del equipo, pendiente de validar con el cliente (P-81, P-85). |
| **RF que la vigilan** | RF-147, RF-149 |
 
| **Código** | **RN-CA09b (división provisional de RN-CA09; incluye RN-CA08 y RN-CA10)** |
| --- | --- |
| **Enunciado** | Una categoría inactiva no puede reactivarse, renombrarse ni inactivarse de nuevo. |
| **Origen** | HU-43 CA-4 y CA-5 y HU-44 CA-3. No hay método de reactivación. Sin respaldo en la entrevista. Propuesta del equipo, pendiente de validar con el cliente (P-84, P-85; relacionada con P-14 y P-69). |
| **RF que la vigilan** | RF-47 (parcial: no reactivar), RF-150, RF-151 |
 
| **Código** | **RN-CA12a (división provisional de RN-CA12)** |
| --- | --- |
| **Enunciado** | No se permite inactivar una categoría que tiene activos sin dar de baja (disponibles, asignados o dañados); primero se dan de baja o se reclasifican. Los activos dados de baja no bloquean. |
| **Origen** | HU-44 CA-5 (filas de activo disponible, asignado y dañado; M-261). Sin respaldo en la entrevista. Propuesta del equipo, pendiente de validar con el cliente (P-82; coherente con RN-C14 y RN-U15). |
| **RF que la vigilan** | RF-152 |
 
| **Código** | **RN-CA12b (división provisional de RN-CA12)** |
| --- | --- |
| **Enunciado** | No se permite inactivar una categoría que tiene solicitudes pendientes; primero se resuelven o se cancelan. |
| **Origen** | HU-44 CA-5 (fila solicitud pendiente; M-262). Sin respaldo en la entrevista. Propuesta del equipo, pendiente de validar con el cliente (P-82; coherente con RN-C14 y RN-U15). |
| **RF que la vigilan** | RF-153 |
 
*Nota: ninguna ficha del Bloque 6b-2 depende de la adenda CRF-003. El hueco de las solicitudes aprobadas sin asignación (P-82) se relaciona con RN-S21.*
 
Las RN las delatan los criterios de rechazo: HU-41 CA-4 y HU-43 CA-3 dan CA04; HU-43 CA-4 y CA-5 y HU-44 CA-3 dan CA09b, que recibe a CA08 y CA10; HU-44 CA-5 da CA12a y CA12b; y HU-44 CA-6 verifica RN-A09 y RN-S07, en las que se fusiona CA13. El resto no pasa el filtro: el identificador, los obligatorios y la longitud son del diccionario; listar, consultar y los campos editables son comportamiento del sistema; el aviso de confirmación es mensaje; la gestión de categorías por el Responsable es autoridad por rol; y el catálogo inicial no tiene candidata (P-86, P-CA1).
 
Respaldo en 1.7. No hay cifras sobre categorías ni clasificación de activos. N-01 menciona Categoria solo como entidad, y sus cifras (14 de 19 usan canales informales; el «estado actual» es el dato más relevante para 5) son sobre el registro de equipos, no sobre categorías. La Tabla 5 de 1.7.3 pide una HU de gestión validada con el cliente o datos semilla para el catálogo (P-86). No hay respaldo de ninguna regla ni ancla nueva de 1.7.3.
 
### **2.2.4.14 Auditoría (RN-AU01 a RN-AU17)**
 
Sin fichas de RN en el bloque: las 16 candidatas pasan a otro destino.
 
Ninguno de los tres criterios de rechazo de HU-45 delata una política del negocio: CA-3 (no encontrado) es mensaje, CA-4 (identificador no válido) es validación del tipo y CA-7 (sin permiso) es autoridad por rol. El resto son restricciones del diccionario o comportamiento del sistema. La parte de política vive en las reglas transversales (RN-T01, RN-T02 y RN-T03), que se tratan en Transversales.
 
Respaldo en 1.7 y Alcance 1.2. Ninguna pregunta de la encuesta usa la palabra «auditoría» ni ninguna cifra pide que toda operación quede registrada. Lo que respalda es la capacidad de saber quién hizo qué: en la pregunta 9, «quién tiene cada equipo» 9 de 19, «bajas» 7, «autorizaciones» 6 y «mantenimiento» 4; en la pregunta 11, «fecha de entrega» 6, «estado actual» 5, «historial de mantenimiento» 5 y «responsable de aprobación» 3; en la pregunta 7, «historial de reparaciones» 8 de 19; y en N-10, el cambio automático de responsable 5 (más 7 en «todas»). El análisis documental de 1.1 muestra que no hay trazabilidad. El Alcance 1.2 es el único respaldo de la regla: pide un registro completo de auditoría de las «acciones relevantes (asignaciones, devoluciones, cambios de responsable y bajas)». No hay ancla nueva de 1.7.3.
 
### **2.2.4.15 Reportes (vista) (RN-R01 a RN-R16)**
 
Sin fichas de RN en el bloque: las 16 candidatas pasan a otro destino.
 
Los criterios de rechazo de HU-46 no delatan políticas del negocio: son obligatorios, ENUM, coherencia de fechas (diccionario) y autoridad por rol (RNF). Las definiciones de los cuatro tipos de reporte no las dictó el cliente: el Alcance 1.2 solo nombra los cuatro nombres, y qué filas ni qué fecha filtra cada uno son propuestas (P-101, P-102). Las columnas y el orden son mockup y RF (P-103).
 
Respaldo en 1.7. Respalda la capacidad, no ninguna definición. El Alcance 1.2 pide «generar reportes bajo demanda sobre activos asignados, disponibles, pendientes por devolver y en mal estado». Ninguna pregunta de la encuesta pide reportes como tal; la pregunta 13 lista entre las sugerencias abiertas «reportes e historial en el celular», sin cifra, y la aplicación móvil nativa está fuera del alcance. Respalda la información que muestran la pregunta 9 («quién tiene cada equipo» 9 de 19 y «bajas» 7) y la pregunta 11 («estado actual» 5 y «fecha de entrega» 6). Ninguna cifra respalda qué es «mal estado» ni qué fecha usa cada reporte. No hay ancla nueva de 1.7.3.
 
### **2.2.4.16 Transversales (RN-T01 a RN-T03)**
 
De las tres reglas transversales solo RN-T02a conserva ficha: RN-T01 pasa a requisito no funcional de seguridad (T-1) y RN-T03 es un mecanismo del sistema, RNF / RF (T-3). La ficha de RN-T02a procede de la decisión T-2, provisional y sujeta a validación del docente. La decisión T-9 (se audita solo la consulta de reportes, RF-50) es provisional, pendiente de la respuesta del cliente a P-90.
 
| **Código** | **RN-T02a (división de RN-T02)** |
| --- | --- |
| **Enunciado** | Toda asignación, devolución, cambio de responsable y baja de un equipo queda registrada con quién la realizó y cuándo. |
| **Origen** | Alcance 1.2 (registro de auditoría de las acciones relevantes: asignaciones, devoluciones, cambios de responsable y bajas) y análisis documental de 1.7 (no existe trazabilidad). Detectada en el análisis de documentos, pendiente de validar con el cliente (P-06, P-89). |
| **RF que la vigilan** | RF-160 a RF-164 (condicionada a T-2) |
 
*Nota: «cambio de responsable» no tiene operación en el modelo (MOD-09, P-31).*
 
## **2.2.5 Trazabilidad RN → RF**
 
*Nota de versión: la Tabla 11 y el campo «RF que la vigilan» de las 59 fichas incorporan los RF aprobados de la fase de RF (RF-01 a RF-172); 0 fichas SIN RF.*
 
La Tabla 11 reúne en una sola matriz las 59 fichas de RN, con los RF que las vigilan y la operación cuyo diagrama de actividades lleva el rombo de la regla. «SIN RF», en rojo, marca las fichas que ningún RF enuncia todavía (0 de las 59). La matriz es provisional, pendiente de validar con el cliente: los RF son los aprobados en la fase de RF (RF-01 a RF-172).
 
Tabla 11. Matriz consolidada RN → RF de las 59 fichas (provisional)
 
| **RN** | **RF que la vigilan** | **Operación con el rombo en el diagrama de actividades** |
| --- | --- | --- |
| RN-A03 | RF-02, RF-51 | Registrar activo (HU-01) y Actualizar activo (HU-03) |
| RN-A04 | RF-02, RF-51 | Registrar activo y Actualizar activo |
| RN-A09 | RF-52, RF-53 | Registrar activo y Actualizar activo |
| RN-A16a | RF-60 | Actualizar activo (rombo «¿tiene asignación vigente?») |
| RN-A16b | RF-54, RF-05 | Actualizar activo (rombo «¿estado solicitado permitido?») |
| RN-A18 (incluye A11) | RF-55, RF-57, RF-124, RF-131 | Actualizar activo (rombo «¿activo en baja?») y Dar de baja activo (rombo «¿ya está en baja?») |
| RN-A19 | RF-58 | Dar de baja activo |
| RN-C05 | RF-07, RF-61 | Registrar custodio (HU-05) y Actualizar custodio (HU-07) |
| RN-C08a | RF-62 | Registrar custodio (rombo «¿usuario activo?») |
| RN-C08b | RF-63 | Registrar custodio (rombo «¿tiene el rol Empleado?») |
| RN-C12b (incluye C13) | RF-64; RF-09 (parcial: no reactivar) | Inactivar custodio (rombo «¿ya está inactivo?») |
| RN-C14a | RF-65 | Inactivar custodio (rombo «¿tiene asignaciones vigentes?») |
| RN-C14b | RF-66 | Inactivar custodio (rombo «¿tiene solicitudes pendientes?») |
| RN-S07 | RF-68, RF-76 | Registrar solicitud (HU-09) y Actualizar solicitud (HU-11): rombo «¿categoría activa?» |
| RN-S09 | RF-69 | Registrar solicitud: rombo «¿custodio activo?» |
| RN-S10b | RF-70 | Registrar solicitud: rombo «¿el empleado es custodio registrado?» |
| RN-S11 | RF-13 | Actualizar solicitud: rombo «¿está pendiente?» |
| RN-S14 (incluye S13b) | RF-78; RF-14 (parcial: no reactivar) | Cancelar solicitud: rombo «¿está pendiente?»; la no reactivación se refleja en el aviso (no hay operación de reactivar) |
| RN-S19 (incluye S10c) | RF-71, RF-75, RF-77, RF-80 | Registrar, Consultar, Actualizar y Cancelar solicitud: rombo «¿la solicitud es a nombre del empleado?» |
| RN-AP02b | RF-81 | Registrar decisión (HU-13): rombo «¿rechaza sin motivo?» |
| RN-AP06a | RF-16, RF-82 | Registrar decisión: la definitividad se refleja en que no existe operación de modificar ni revocar la decisión |
| RN-AP09 | RF-82 | Registrar decisión: rombos «¿la solicitud ya tiene decisión?» y, después, «¿está pendiente?» |
| RN-AP11a | RF-83 | Registrar decisión: rombo «¿el aprobador está activo?» |
| RN-AP12a (ancla) | RF-84 | Registrar decisión: la atribución se registra en el flujo; el rombo «¿el aprobador es el usuario en sesión?» corresponde al mecanismo (RN-T03) |
| RN-AP14 | RF-85 | Consultar decisión (HU-14): rombo «¿la solicitud es a nombre del empleado?» |
| RN-AS04 | RF-87 | Asignar equipo (HU-15): rombo «¿la solicitud está aprobada?» |
| RN-AS05a | RF-88 | Asignar equipo: rombo «¿la solicitud ya tiene asignación?» |
| RN-AS07a (ancla) | RF-89 | Asignar equipo: rombo «¿el equipo está disponible?» |
| RN-AS08 | RF-90 | Asignar equipo: rombo «¿la categoría del equipo es la de la solicitud?» |
| RN-AS13b (incluye AS17, AS15b) | RF-97, RF-98; RF-20 (parcial: no reactivar) | Actualizar asignación (HU-17): rombo «¿está cerrada?»; Cerrar asignación (HU-18): rombo «¿ya está cerrada?» |
| RN-AS14 | RF-100 | Cerrar asignación: rombo «¿la devolución está confirmada?» |
| RN-AS23a | RF-96 | Consultar asignaciones (HU-16, empleado): rombo «¿la asignación es a nombre del empleado?» |
| RN-AC05 | RF-104 | Firmar acta (HU-19): rombo «¿la asignación está vigente?» |
| RN-AC06a | RF-105 | Firmar acta: rombo «¿la asignación ya tiene acta?» |
| RN-AC07a (ancla) | RF-102 | Asignar equipo (HU-15) y Cerrar asignación (HU-18): hoy sin rombo propio, porque el flujo no exige el acta; el momento lo decide P-41 |
| RN-AC07b | RF-103 | Firmar acta: rombo «¿quien firma es el custodio de la asignación?» |
| RN-AC10 | RF-106 | Consultar acta (HU-20, empleado): rombo «¿la asignación es a nombre del empleado?» |
| RN-D05 | RF-107 | Registrar devolución (HU-21): rombo «¿la asignación está vigente?» |
| RN-D06a | RF-108 | Registrar devolución: rombo «¿la asignación ya tiene devolución?» |
| RN-D07b (incluye D12, D20) | RF-109, RF-112, RF-114 | Registrar, Consultar y Actualizar devolución (empleado): rombo «¿la devolución es de una asignación a nombre del empleado?» |
| RN-D11b (incluye D17) | RF-113, RF-115; RF-26 (parcial: no volver a Pendiente) | Actualizar devolución (HU-23): rombo «¿está confirmada?»; Confirmar recepción (HU-24): rombo «¿ya está confirmada?» |
| RN-D14b | RF-116 | Confirmar recepción: rombo «¿el receptor está activo?» |
| RN-N05 | RF-120 | Generar aviso (HU-25): rombo «¿la asignación está vigente?» |
| RN-RD07a | RF-125 | Reportar daño: rombo «¿el equipo está asignado a su nombre?» |
| RN-RD07b | RF-127, RF-129 | Consultar reporte: «¿el reporte es suyo?». Actualizar reporte: «¿es el custodio que lo hizo?» |
| RN-RD15 | RF-128 | Actualizar reporte: rombo «¿el reporte tiene mantenimiento asociado?» |
| RN-H07 | RF-132 | Registrar mantenimiento: rombo «¿el reporte es del mismo activo?» |
| RN-H09c | RF-133 | Registrar mantenimiento: rombo «¿el técnico está activo?» |
| RN-U04 | RF-36, RF-137 | Registrar y Actualizar usuario: «¿el correo ya está registrado?» |
| RN-U12b | RF-38 (parcial: no reactivar), RF-138, RF-139 | Actualizar: «¿el usuario está activo?». Inactivar: «¿ya está inactivo?» |
| RN-U15a | RF-140 | Inactivar usuario: «¿tiene un custodio activo?» |
| RN-U16 | RF-141 | Inactivar usuario: «¿es el único aprobador activo con solicitudes pendientes?» |
| RN-U20a | RF-144 | Iniciar sesión: «¿el usuario está activo?» |
| RN-U22 | RF-145 | Cambiar contraseña: «¿la contraseña es la propia?» |
| RN-CA04 | RF-147, RF-149 | Registrar y Actualizar categoría: «¿ya existe una categoría con ese nombre?» |
| RN-CA09b | RF-47 (parcial: no reactivar), RF-150, RF-151 | Actualizar: «¿la categoría está activa?». Inactivar: «¿ya está inactiva?» |
| RN-CA12a | RF-152 | Inactivar categoría: «¿tiene activos sin dar de baja?» |
| RN-CA12b | RF-153 | Inactivar categoría: «¿tiene solicitudes pendientes?» |
| RN-T02a (división de RN-T02) | RF-160 a RF-164 (condicionada a T-2) | Sin rombo propio en las fuentes: la regla recae sobre asignar, devolver y dar de baja (cambio de responsable sin operación en el modelo) |
 
*Fuente: elaboración propia a partir de las matrices RN → RF de cada bloque (fase de RF, RF-01 a RF-172) y de la ficha de RN-T02a, que no tiene matriz propia en las fuentes.*
 
## **Anexo A. Clasificación de las 257 candidatas**
 
Se reproducen, en el orden de los bloques, la introducción del filtro de cada uno y su tabla de clasificación, y al final la de Transversales. Cada candidata aparece una sola vez con su destino final y su justificación.
 
### **A.1 Activo (RN-A01 a RN-A19)**
 
Cada candidata de la sección D del consolidado se evaluó con el filtro del curso: ¿existiría esta política aunque no hubiera software y la podría dictar el negocio? Un UNIQUE que expresa una política de identidad del negocio es RN; NO NULO, longitud, tipo, ENUM y existencia de FK permanecen en el diccionario. Los códigos no se renumeran; las candidatas que mezclan destinos se dividen con sufijos provisionales (a, b, c, d).
 
Tabla 12. Clasificación de las candidatas RN-A01 a RN-A19 (Bloque 0, Activo)
 
| **Código** | **Regla actual (resumida)** | **Destino final** | **Justificación (¿existiría sin software?)** | **¿Se divide?** |
| --- | --- | --- | --- | --- |
| RN-A01 | ID_Activo único, lo genera el sistema, no se modifica | Restricción del diccionario (principal) | Es un identificador técnico (PK sin setter); la política de identificar cada equipo está en RN-A03 y RN-A04. | Sí: A01a Restricción del diccionario (PK sin setter); A01b RF candidato (generación autonumérica, P-07) |
| RN-A02 | Marca, Modelo, Numero_Serie, Placa_Inventario e ID_Categoria son obligatorios; Ubicacion es opcional | Restricción del diccionario | Es NO NULO / NULL del diccionario, no una política dictada por el negocio. | No |
| RN-A03 | Numero_Serie único entre todos los activos, también los que están en Baja | RN (propuesta) | Sin software, dos equipos no comparten el serial de fábrica y el de uno dado de baja no se reutiliza. Es política de identidad del negocio, además de UNIQUE. | No |
| RN-A04 | Placa_Inventario única entre todos los activos, también los que están en Baja | RN (propuesta) | La placa es el código interno de la empresa; dos equipos con la misma placa no se distinguen en el inventario físico. | No |
| RN-A05 | Longitudes máximas: Marca 50, Modelo 50, Numero_Serie 20, Placa_Inventario 11, Ubicacion 100 | Restricción del diccionario | Es la longitud VARCHAR; los mensajes de rechazo van a mockups. | No |
| RN-A06 | Al registrar, Estado = Disponible; la persona no lo elige | Restricción del diccionario (valor por defecto); respaldo RF-01 | El diccionario dice «Valor inicial: Disponible, asignado por el sistema al crear» y el UML lo muestra como valor por defecto; RF-01 lo recoge. | No |
| RN-A07 | Estado solo toma los valores Disponible, Asignado, Dañado y Baja | Restricción del diccionario | Es el ENUM Estado_Activo. | No |
| RN-A08 | ID_Categoria debe corresponder a una categoría existente | Restricción del diccionario | Es la FK hacia Categoria. | No |
| RN-A09 | La categoría asignada debe estar activa | RN (propuesta) | Sin software, la empresa no clasifica un equipo en una categoría que ya no gestiona. | No |
| RN-A10 | La baja cambia el Estado a Baja; el registro nunca se elimina | Doctrina del curso (principal) | «Jamás DELETE» es doctrina del curso; el cambio a Baja ya está en RF-05. | Sí: A10a Doctrina del curso; A10b RF candidato (la baja cambia el estado a Baja) |
| RN-A11 | Un activo que ya está en Baja no se vuelve a dar de baja | Fusionada en RN-A18 | Es consecuencia del estado terminal de la Baja, que dicta RN-A18. | No |
| RN-A12 | Aviso de la consecuencia y confirmación antes de la baja | Mockup / mensaje | Es un aviso de confirmación, propio de la interfaz. | No |
| RN-A13 | Al actualizar, la unicidad de serie y placa se verifica contra los demás activos | RF candidato | Describe lo que el sistema verifica; la RN de fondo son RN-A03 y RN-A04, y RF-02 ya la recoge. | No |
| RN-A14 | Inventario ordenado por placa, con todos los estados y 6 columnas | RF candidato (principal) | Ordenar y listar lo hace el sistema; las columnas son interfaz. | Sí: A14a RF candidato (orden y estados incluidos); A14b Mockup (6 columnas) |
| RN-A15 | La búsqueda por clave devuelve un solo activo con sus 8 campos o informa que no existe | RF candidato (principal) | Es una consulta; «un solo activo» lo garantizan PK y UNIQUE, e «informar» es mensaje. | Sí: A15a RF candidato; A15b Mockup / mensaje |
| RN-A16 | Cambio manual de estado solo entre Disponible y Dañado y sin asignación vigente; excepción por reporte de daño | RN (parcial) | Mezcla cuatro ideas: dos políticas del negocio, un comportamiento del sistema y un mensaje. | Sí: A16a RN; A16b RN; A16c RF candidato (el reporte de daño deja Dañado aunque esté Asignado; ya en RN-RD09 y RF-29); A16d Mockup / mensaje (M-22, M-23, M-26) |
| RN-A17 | Cada alta, actualización y baja de un activo queda registrada en Auditoria | RNF candidato | Es una cualidad de auditabilidad (Alcance 1.2); también cubierta por RN-T02. | No |
| RN-A18 | Un activo en Baja no se edita (estado terminal) | RN (propuesta; incluye A11) | Un equipo dado de baja sale de operación: su ficha no se corrige ni se vuelve a dar de baja. | No |
| RN-A19 | Un activo con asignación vigente no se da de baja hasta cerrar su asignación | RN (propuesta) | Sin software, un equipo en manos de un custodio no se descarta sin recibirlo antes. | No |
 
*Fuente: elaboración propia a partir de la sección D del consolidado, el diccionario v6 y el UML v6.*
 
### **A.2 Custodio (RN-C01 a RN-C17)**
 
Cada candidata de la sección D del consolidado se evaluó con el filtro del curso: ¿existiría esta política aunque no hubiera software y la podría dictar el negocio? Un UNIQUE que expresa una política de identidad del negocio es RN; NO NULO, longitud, tipo, ENUM y existencia de FK permanecen en el diccionario, y un UNIQUE estructural (relación 1 a 1 por diseño) se evalúa caso por caso. Los códigos no se renumeran; las candidatas que mezclan destinos se dividen con sufijos provisionales (a, b, c) y las que son consecuencia de otra se fusionan conservando su código en la tabla.
 
Tabla 13. Clasificación de las candidatas RN-C01 a RN-C17 (Bloque 1, Custodio)
 
| **Código** | **Regla actual (resumida)** | **Destino final** | **Justificación (¿existiría sin software?)** | **¿Se divide?** |
| --- | --- | --- | --- | --- |
| RN-C01 | ID_Custodio único, lo genera el sistema, no se modifica | Restricción del diccionario (principal) | Es un identificador técnico (PK sin setter); la identidad del custodio la dan su persona y su documento (RN-C05). | Sí: C01a Restricción del diccionario (PK sin setter); C01b RF candidato (generación autonumérica; sin P-xx propio, patrón de A01b) |
| RN-C02 | ID_Usuario, tipo_documento, N_documento y Direccion obligatorios | Restricción del diccionario | Es NO NULO del diccionario, no una política dictada por el negocio. | No |
| RN-C03 | N_documento máximo 20 y Direccion máximo 200 caracteres | Restricción del diccionario | Es la longitud VARCHAR; los mensajes van a mockups (M-35, M-44). | No |
| RN-C04 | tipo_documento solo CC, CE o PA | Restricción del diccionario (ENUM) | Es el ENUM Tipo_Documento; su contenido, incluida CE, lo valida P-10. | No |
| RN-C05 | tipo_documento + N_documento únicos como pareja | RN (propuesta; respaldo débil) | Sin software, una persona se identifica por su documento: dos custodios con el mismo tipo y número serían la misma persona. Es política de identidad (UNIQUE compuesto), como RN-01 de Persona. | No |
| RN-C06 | Un usuario es custodio una sola vez (ID_Usuario único) | Restricción del diccionario (UNIQUE estructural) | La relación 1 a 1 usuario–custodio es decisión de diseño: sin software no existiría un registro de custodio aparte del empleado. En el negocio una persona tiene un documento y un solo custodio, y eso ya lo dicta RN-C05. La consecuencia para el usuario de un custodio inactivo es la pregunta P-14. | No |
| RN-C07 | ID_Usuario debe corresponder a un usuario existente | Restricción del diccionario | Es la FK hacia Usuario. | No |
| RN-C08 | El usuario del custodio debe estar activo y tener el rol Empleado | RN (propuesta) | Sin software, solo se registraría como responsable de equipos a un empleado en servicio; el alcance exacto (¿otros roles?) está en P-08. | Sí: C08a RN (usuario activo); C08b RN (rol Empleado) |
| RN-C09 | Al registrar, Fecha_Registro = fecha actual y activo = TRUE | Restricción del diccionario (valor por defecto); respaldo RF-06 | El diccionario define ambos valores como asignados al crear (misma lectura que RN-A06). | No |
| RN-C10 | Al actualizar, el documento del propio custodio no cuenta como duplicado | RF candidato | Describe lo que el sistema verifica; la RN de fondo es RN-C05 (patrón RN-A13); respaldo RF-07. | No |
| RN-C11 | ID_Usuario y Fecha_Registro no se modifican al actualizar | RF candidato | Define qué datos admite la operación actualizar; la decisión de negocio está pendiente en P-12. | No |
| RN-C12 | Inactivar pone activo = FALSE; nunca se elimina; no existe reactivar; activo solo cambia con la baja | RN (parcial) | Mezcla tres ideas: doctrina, política y comportamiento del sistema. | Sí: C12a Doctrina del curso (baja lógica, jamás DELETE); C12b RN (no se reactiva ni se inactiva de nuevo; incluye C13); C12c RF candidato (inactivar pone activo en FALSE; actualizar no lo cambia; ya en RF-10 y RF-09) |
| RN-C13 | Un custodio ya inactivo no se vuelve a inactivar | Fusionada en RN-C12b | Es consecuencia del estado inactivo que dicta C12b (patrón A11 en A18). | No |
| RN-C14 | No se inactiva a un custodio con asignaciones Vigentes ni solicitudes Pendientes (opción A, P-13) | RN (propuesta) | Sin software, a quien aún responde por equipos o tiene solicitudes en trámite no se le da de baja como custodio sin resolverlos. | Sí: C14a RN (asignaciones vigentes); C14b RN (solicitudes pendientes) |
| RN-C15 | Las consultas devuelven el custodio con sus 7 campos, activo o inactivo; por documento exige tipo y número; si no existe, se informa | RF candidato (principal) | Consultar es comportamiento del sistema; los 7 campos y los mensajes son interfaz. | Sí: C15a RF candidato (activos e inactivos; documento con tipo y número); C15b Mockup/mensaje (7 campos; M-46, M-47, M-48) |
| RN-C16 | Antes de inactivar, aviso de consecuencia y opción de desistir | Mockup / mensaje | Es un aviso de confirmación (M-55, M-59). | No |
| RN-C17 | Solo el Responsable de Activos registra, consulta, actualiza e inactiva custodios | RNF candidato (control de acceso por rol) | No nace de ningún CA de rechazo, no tiene respaldo del cliente, el actor ya está fijado en el «Como [actor]» de cada HU y el modelo lo resuelve con Rol_Permiso; se decide una sola vez en Transversales. | No |
 
*Fuente: elaboración propia a partir de la sección D del consolidado, el diccionario v6 y el UML v6.*
 
### **A.3 Solicitud (RN-S01 a RN-S21)**
 
Cada candidata de la sección D del consolidado se evaluó con el filtro del curso: ¿existiría esta política aunque no hubiera software y la podría dictar el negocio? Un UNIQUE que expresa una política de identidad del negocio es RN; NO NULO, longitud, tipo, ENUM y existencia de FK permanecen en el diccionario. Una regla de «solo el actor X puede…» (autoridad por rol, sin CA de rechazo) es RNF candidato; una regla de «solo el dueño accede a lo suyo» (propiedad, con CA de rechazo) es RN. Los códigos no se renumeran; las candidatas que mezclan destinos se dividen con sufijos provisionales y las que son consecuencia de otra se fusionan conservando su código en la tabla.
 
Tabla 14. Clasificación de las candidatas RN-S01 a RN-S21 (Bloque 2a, Solicitud)
 
| **Código** | **Regla actual (resumida)** | **Destino final** | **Justificación (¿existiría sin software?)** | **¿Se divide?** |
| --- | --- | --- | --- | --- |
| RN-S01 | ID_Solicitud único, lo genera el sistema, no se modifica | Restricción del diccionario (principal) | Es un identificador técnico (PK sin setter). | Sí: S01a Restricción (PK sin setter); S01b RF candidato (generación autonumérica; patrón de A01b) |
| RN-S02 | ID_Categoria, Motivo e ID_Custodio obligatorios | Restricción del diccionario | Es NO NULO del diccionario. | No |
| RN-S03 | Motivo máximo 255 caracteres | Restricción del diccionario | Es la longitud VARCHAR; el mensaje va a mockups (M-64). | No |
| RN-S04 | Al registrar, Fecha_Solicitud = fecha y hora actuales y Estado_Solicitud = Pendiente | Restricción del diccionario (valor por defecto); respaldo RF-11 | El diccionario define ambos valores como asignados al crear (misma lectura que RN-A06 y RN-C09). | No |
| RN-S05 | Estado_Solicitud solo toma Pendiente, Aprobada, Rechazada y Cancelada | Restricción del diccionario (ENUM) | Es el ENUM Estado_Solicitud. | No |
| RN-S06 | ID_Categoria debe corresponder a una categoría existente | Restricción del diccionario | Es la FK hacia Categoria. | No |
| RN-S07 | La categoría solicitada debe estar activa | RN (propuesta) | Sin software, la empresa no recibe pedidos de una categoría que ya no gestiona (misma política que RN-A09). | No |
| RN-S08 | ID_Custodio debe corresponder a un custodio existente | Restricción del diccionario | Es la FK hacia Custodio. | No |
| RN-S09 | El custodio que solicita debe estar activo | RN (propuesta) | Sin software, no se atiende un pedido a nombre de quien ya no responde por equipos. | No |
| RN-S10 | La solicitud la registra el Empleado con sesión iniciada, a nombre de su propio custodio, y debe tener un custodio registrado antes de solicitar | RN (parcial; propuesta) | Mezcla tres ideas: quién registra (autoridad por rol), el requisito de estar registrado como custodio y que la solicitud sea a nombre propio (propiedad). | Sí: S10a RNF candidato (autoridad por rol: el Empleado registra; a Transversales); S10b RN (empleado registrado como custodio); S10c Fusionada en RN-S19 (propiedad; el ID_Custodio que sale de la sesión es mecanismo, RN-T03, a decidir en Transversales) |
| RN-S11 | Una solicitud solo se actualiza mientras está Pendiente | RN (propuesta) | Sin software, un pedido ya decidido o retirado no se corrige: el Aprobador decidió con esa información. | No |
| RN-S12 | La actualización solo modifica ID_Categoria y Motivo; el estado cambia con la decisión o la cancelación | RF candidato | Define qué datos admite actualizar (patrón RN-C11); el cambio de estado va al diagrama de estados. | No |
| RN-S13 | Cancelar pone Cancelada; el registro nunca se elimina; no existe reactivar | RN (parcial; la parte RN queda fusionada en RN-S14) | Mezcla tres ideas: doctrina, política y comportamiento del sistema. La política (no reactivar) es consecuencia del estado cancelado que dicta RN-S14 (patrón RN-C12b). | Sí: S13a Doctrina del curso (jamás DELETE); S13b Fusionada en RN-S14; S13c RF candidato (cancelar pone el estado Cancelada; ya en RF-15) |
| RN-S14 | Solo se cancela una solicitud Pendiente; una ya Cancelada no se cancela de nuevo | RN (propuesta; incluye S13b) | Sin software, solo se retira un pedido aún no decidido (qué pasa con uno aprobado es P-22); una cancelada no está pendiente ni se reactiva (estado terminal, patrón RN-C12b). | No |
| RN-S15 | Antes de cancelar, aviso de consecuencia y opción de desistir | Mockup / mensaje | Es un aviso de confirmación (M-77, M-79). | No |
| RN-S16 | La búsqueda por identificador devuelve una sola solicitud con sus 6 campos o informa que no existe | RF candidato (principal) | Es una consulta; «una sola» lo garantiza la PK y «informar» es mensaje. | Sí: S16a RF candidato; S16b Mockup/mensaje (6 campos; M-68) |
| RN-S17 | Las solicitudes del custodio con su estado, incluidas las Canceladas, de la más reciente a la más antigua | RF candidato (principal) | Listar y ordenar lo hace el sistema; el orden está en P-20. | Sí: S17a RF candidato; S17b Mockup/mensaje (6 campos; M-66) |
| RN-S18 | Las solicitudes Pendientes, de la más antigua a la más reciente | RF candidato (principal) | Listar y ordenar lo hace el sistema; el orden está en P-20. | Sí: S18a RF candidato; S18b Mockup/mensaje (6 campos; M-67) |
| RN-S19 | El Empleado solo consulta, actualiza y cancela sus propias solicitudes | RN (propuesta; propiedad; incluye S10c) | Sin software, quien pide un equipo solo pide, ve y gestiona lo que es a su nombre, y hay CA de rechazo (M-69, M-272). Es propiedad del dato, no autoridad por rol. | No |
| RN-S20 | El Aprobador consulta las solicitudes pendientes | RNF candidato (autoridad por rol) | Es una regla de actor; el Alcance 1.2 no la define y P-27 pregunta por el Responsable de Activos. | No |
| RN-S21 | Las solicitudes Aprobadas que aún no tienen asignación, de la más antigua a la más reciente | RF candidato (principal) | Consultar es comportamiento del sistema; el mensaje es interfaz. | Sí: S21a RF candidato; S21b Mockup/mensaje (M-92) |
 
*Fuente: elaboración propia a partir de la sección D del consolidado, el diccionario v6 y el UML v6.*
 
### **A.4 Aprobación (RN-AP01 a RN-AP14)**
 
Cada candidata de la sección D del consolidado se evaluó con el filtro del curso: ¿existiría esta política aunque no hubiera software y la podría dictar el negocio? Un UNIQUE que expresa una política de identidad del negocio es RN, y uno puramente estructural (relación 1 a 1 por diseño) se evalúa caso por caso; NO NULO, longitud, tipo, ENUM y existencia de FK permanecen en el diccionario. La autoridad por rol («solo el actor X puede…») es RNF candidato aunque exista un CA de rechazo que la verifique; la propiedad («solo el dueño accede a lo suyo») es RN. Los códigos no se renumeran; las candidatas que mezclan destinos se dividen con sufijos provisionales y las que son consecuencia de otra se fusionan conservando su código en la tabla.
 
Tabla 15. Clasificación de las candidatas RN-AP01 a RN-AP14 (Bloque 2b, Aprobacion)
 
| **Código** | **Regla actual (resumida)** | **Destino final** | **Justificación (¿existiría sin software?)** | **¿Se divide?** |
| --- | --- | --- | --- | --- |
| RN-AP01 | ID_Aprobacion único, lo genera el sistema, no se modifica | Restricción del diccionario (principal) | Es un identificador técnico (PK sin setter). | Sí: AP01a Restricción (PK sin setter); AP01b RF candidato (generación autonumérica; patrón de A01b) |
| RN-AP02 | ID_Solicitud, ID_Aprobador y Decision obligatorios; Motivo_Rechazo solo obligatorio si Decision = Rechazada | RN (parcial; propuesta) | Mezcla dos ideas: los obligatorios son NO NULO del diccionario; que todo rechazo se justifique es política (sin software, un rechazo sin explicación no se aceptaría). | Sí: AP02a Restricción del diccionario (NO NULO); AP02b RN (todo rechazo se justifica) |
| RN-AP03 | Decision solo toma Aprobada o Rechazada | Restricción del diccionario (ENUM) | Es el ENUM Decision. | No |
| RN-AP04 | Motivo_Rechazo máximo 300 caracteres | Restricción del diccionario | Es la longitud VARCHAR; el mensaje va a mockups (M-84). | No |
| RN-AP05 | Al registrar, Fecha_Decision = fecha y hora actuales | Restricción del diccionario (valor por defecto); respaldo RF-16 | El diccionario lo define como asignado al crear (misma lectura que RN-A06, RN-C09 y RN-S04). | No |
| RN-AP06 | Cada solicitud tiene una sola decisión (ID_Solicitud único) y es irrevocable | RN (parcial; propuesta) | La política (la decisión es definitiva) existiría sin software; «una sola vez» queda cubierta por RN-AP09, porque al decidirse la solicitud deja de estar pendiente; el UNIQUE 1 a 1 es el mecanismo estructural. | Sí: AP06a RN (decisión definitiva); AP06b Restricción del diccionario (UNIQUE estructural 1 a 1) |
| RN-AP07 | Al registrar la decisión, la Solicitud pasa a Aprobada o Rechazada | RF candidato | Describe el efecto del sistema sobre otra entidad (transición de estado); va al RF y al diagrama de estados. | No |
| RN-AP08 | ID_Solicitud debe corresponder a una solicitud existente | Restricción del diccionario | Es la FK hacia Solicitud. | No |
| RN-AP09 | Solo se decide sobre una solicitud Pendiente | RN (propuesta) | Sin software, no se decide un pedido que ya fue decidido o retirado; cubre también «una sola vez», porque la solicitud decidida deja de estar pendiente. Se valida primero «ya tiene decisión» (M-88) y luego «cancelada» (M-89). | No |
| RN-AP10 | ID_Aprobador debe corresponder a un usuario existente | Restricción del diccionario | Es la FK hacia Usuario. | No |
| RN-AP11 | El aprobador debe estar activo y tener el rol Aprobador | RN (parcial; propuesta) | Sin software, solo decide quien está en servicio; que tenga el rol Aprobador es autoridad por rol, resuelta por Rol_Permiso. | Sí: AP11a RN (aprobador activo); AP11b RNF candidato (autoridad por rol; el CA de HU-13 CA-7 verifica el RNF) |
| RN-AP12 | La decisión la registra el Aprobador con sesión iniciada: ID_Aprobador es el usuario en sesión | RN (parcial; ancla de 1.7.3) | Mezcla tres ideas: la política (toda decisión se atribuye a quien la toma), el mecanismo (el ID sale de la sesión) y quién decide (autoridad por rol). | Sí: AP12a RN (ancla de N-04); AP12b duplicada con RN-T03 (mecanismo; se resuelve en Transversales); AP12c Fusionada en RN-AP11b |
| RN-AP13 | La búsqueda por solicitud devuelve la decisión única con sus 6 campos; si no hay decisión o la solicitud no existe, se informa | RF candidato (principal) | Es una consulta; «única» lo garantiza el UNIQUE e «informar» es mensaje. | Sí: AP13a RF candidato; AP13b Mockup/mensaje (6 campos; M-90, M-91, M-74) |
| RN-AP14 | El Empleado solo consulta la decisión de sus propias solicitudes | RN (propuesta; propiedad) | Sin software, quien pidió un equipo solo conoce la decisión de lo que pidió él, y hay CA de rechazo (M-69). Es propiedad del dato. | No |
 
*Fuente: elaboración propia a partir de la sección D del consolidado, el diccionario v6 y el UML v6.*
 
### **A.5 Asignación (RN-AS01 a RN-AS24)**
 
Cada candidata de la sección D del consolidado se evaluó con el filtro del curso: ¿existiría esta política aunque no hubiera software y la podría dictar el negocio? Un UNIQUE que expresa una política de identidad del negocio es RN, y uno puramente estructural (relación 1 a 1 por diseño) se evalúa caso por caso; NO NULO, longitud, tipo, ENUM y existencia de FK permanecen en el diccionario. La autoridad por rol («solo el actor X puede…») es RNF candidato aunque exista un CA de rechazo que la verifique; la propiedad («solo el dueño accede a lo suyo») es RN. Los códigos no se renumeran; las candidatas que mezclan destinos se dividen con sufijos provisionales y las que son consecuencia de otra se fusionan conservando su código en la tabla.
 
Tabla 16. Clasificación de las candidatas RN-AS01 a RN-AS24 (Bloque 4a-1, Asignacion)
 
| **Código** | **Regla actual (resumida)** | **Destino final** | **Justificación (¿existiría sin software?)** | **¿Se divide?** |
| --- | --- | --- | --- | --- |
| RN-AS01 | ID_Asignacion único, lo genera el sistema, no se modifica | Restricción del diccionario (principal) | Es un identificador técnico (PK sin setter). | Sí: AS01a Restricción (PK sin setter); AS01b RF candidato (generación autonumérica; patrón de A01b) |
| RN-AS02 | ID_Solicitud, ID_Activo y Fecha_Devolucion_Esperada obligatorios; Fecha_Entrega, Estado_Asignacion e ID_Custodio los asigna el sistema | Restricción del diccionario (NO NULO y valores asignados al crear); respaldo RF-18 | Es NO NULO y valores por defecto del diccionario, no una política dictada por el negocio. | No |
| RN-AS03 | ID_Solicitud debe corresponder a una solicitud existente | Restricción del diccionario | Es la FK hacia Solicitud. | No |
| RN-AS04 | Solo se asigna una solicitud Aprobada | RN (propuesta) | Sin software, no se entrega un equipo a un pedido que no fue aprobado; el Alcance 1.2 («asignar los activos aprobados») la respalda en parte. | No |
| RN-AS05 | Una solicitud tiene una sola asignación (ID_Solicitud único); el método interno la protege | RN (parcial; propuesta) | La política (una solicitud se atiende con una sola entrega) existiría sin software; el UNIQUE 1 a 1 y el método interno son el mecanismo. | Sí: AS05a RN (una solicitud, una asignación); AS05b Restricción del diccionario (UNIQUE estructural 1 a 1) |
| RN-AS06 | ID_Activo debe corresponder a un activo existente | Restricción del diccionario | Es la FK hacia Activo. | No |
| RN-AS07 | Solo un activo Disponible puede entregarse; un método interno lo verifica | RN (parcial; ancla de 1.7.3) | La política (solo se entrega un equipo disponible) es regla implícita de 1.7.3; la verificación por el sistema es el mecanismo. | Sí: AS07a RN (ancla); AS07b RF candidato (verificación del sistema, apoyo interno) |
| RN-AS08 | La categoría del activo debe ser la de la solicitud | RN (propuesta) | Sin software, a quien pidió un portátil no se le entrega un monitor. | No |
| RN-AS09 | Fecha_Devolucion_Esperada no puede ser anterior a Fecha_Entrega | Restricción del diccionario (coherencia entre fechas; propuesta de incorporarla) | Ninguna empresa fijaría una devolución antes de la entrega: es coherencia entre dos datos, no una política. La política del plazo (mínimo o máximo) está en P-30 y no existe aún. | No |
| RN-AS10 | Al asignar, el sistema asigna Fecha_Entrega y Estado_Asignacion = Vigente y copia el custodio de la solicitud; el custodio no se digita | Restricción del diccionario (valores asignados al crear); respaldo RF-18 | El diccionario define los valores y que ID_Custodio se copia de la Solicitud; no hay CA de rechazo asociado. | No |
| RN-AS11 | Al asignar, el activo pasa a Estado Asignado | RF candidato | Describe el efecto del sistema sobre otra entidad (coherente con RN-A16b); ya en RF-18. | No |
| RN-AS12 | Estado_Asignacion solo toma Vigente y Cerrada | Restricción del diccionario (ENUM) | Es el ENUM Estado_Asignacion. | No |
| RN-AS13 | Actualizar solo modifica la fecha de devolución esperada y solo si la asignación está Vigente; una Cerrada no se actualiza | RN (parcial; propuesta) | Mezcla dos ideas: qué datos admite actualizar (comportamiento del sistema) y que una asignación cerrada es definitiva (política). | Sí: AS13a RF candidato (campos editables; P-31); AS13b RN (asignación cerrada definitiva; incluye AS17 y AS15b) |
| RN-AS14 | Cerrar solo procede si la asignación tiene una devolución Confirmada | RN (propuesta; dependerá de B4b) | Sin software, no se da por entregado un equipo que no se ha recibido. | No |
| RN-AS15 | Cerrar pone Cerrada y el activo vuelve a Disponible salvo que esté Dañado; el registro nunca se elimina y no se reactiva | RN (parcial; la parte RN queda fusionada en AS13b) | Mezcla tres ideas: doctrina, política y comportamiento del sistema. | Sí: AS15a Doctrina del curso (jamás DELETE); AS15b Fusionada en RN-AS13b; AS15c RF candidato (cerrar pone Cerrada y el activo vuelve a Disponible salvo Dañado; ya en RF-21) |
| RN-AS16 | Antes de cerrar, aviso de consecuencia y opción de desistir | Mockup / mensaje | Es un aviso de confirmación (M-117, M-118). | No |
| RN-AS17 | Una asignación ya Cerrada no se cierra de nuevo | Fusionada en RN-AS13b | Es consecuencia del estado cerrado que dicta AS13b (patrón A11 en A18). | No |
| RN-AS18 | Un activo con asignación Vigente no se da de baja ni cambia de estado manualmente, aunque esté Dañado | Fusionada en RN-A16a y RN-A19 (Bloque 0) | Es la misma regla del Bloque 0 vista desde Asignacion. | No |
| RN-AS19 | La búsqueda por identificador devuelve una sola asignación con sus 7 campos o informa; cualquier operación sobre una asignación inexistente lo informa | RF candidato (principal) | Es una consulta; «una sola» lo garantiza la PK e «informar» es mensaje. | Sí: AS19a RF candidato; AS19b Mockup/mensaje (7 campos; M-102, M-108) |
| RN-AS20 | Las vigentes: solo las Vigente, de la más antigua a la más reciente por Fecha_Entrega | RF candidato (principal) | Listar y ordenar lo hace el sistema; el orden está en P-36. | Sí: AS20a RF candidato; AS20b Mockup/mensaje (7 campos; M-103) |
| RN-AS21 | Las asignaciones del custodio (Vigente y Cerrada), de la más reciente a la más antigua | RF candidato (principal) | Listar y ordenar lo hace el sistema; el orden está en P-36. | Sí: AS21a RF candidato; AS21b Mockup/mensaje (7 campos; M-104, M-50) |
| RN-AS22 | La asignación vigente de un activo (quién lo tiene), también si está Dañado | RF candidato (principal) | Es una consulta del sistema; los mensajes son interfaz. | Sí: AS22a RF candidato; AS22b Mockup/mensaje (M-105, M-21) |
| RN-AS23 | El Empleado solo consulta las asignaciones de su propio custodio y ve únicamente las Vigentes | RN (parcial; propiedad) | Sin software, quien tiene un equipo solo ve lo que se le entregó, y hay CA de rechazo (M-106). Ver solo las vigentes es comportamiento del sistema. | Sí: AS23a RN (propiedad); AS23b RF candidato (solo Vigentes; P-37) |
| RN-AS24 | El Responsable de Activos asigna, actualiza, cierra y consulta las asignaciones; el Empleado consulta las suyas | RNF candidato (autoridad por rol) | Es una regla de «solo el actor X…»; el Alcance 1.2 no nombra al actor (P-28). La parte del Empleado queda en AS23a. | No |
 
*Fuente: elaboración propia a partir de la sección D del consolidado, el diccionario v6 y el UML v6.*
 
### **A.6 Acta de entrega (RN-AC01 a RN-AC10)**
 
Cada candidata de la sección D del consolidado se evaluó con el filtro del curso: ¿existiría esta política aunque no hubiera software y la podría dictar el negocio? Un UNIQUE que expresa una política de identidad del negocio es RN, y uno puramente estructural (relación 1 a 1 por diseño) se evalúa caso por caso; NO NULO, longitud, tipo, ENUM y existencia de FK permanecen en el diccionario. La autoridad por rol («solo el actor X puede…») es RNF candidato aunque exista un CA de rechazo que la verifique; la propiedad («solo el dueño accede a lo suyo») es RN. Una regla con respaldo documental es RN aunque ningún CA de rechazo la pruebe: el CA sirve para encontrar reglas, no es requisito para que exista. Los códigos no se renumeran; las candidatas que mezclan destinos se dividen con sufijos provisionales.
 
Tabla 17. Clasificación de las candidatas RN-AC01 a RN-AC10 (Bloque 4a-2, Acta_De_Entrega)
 
| **Código** | **Regla actual (resumida)** | **Destino final** | **Justificación (¿existiría sin software?)** | **¿Se divide?** |
| --- | --- | --- | --- | --- |
| RN-AC01 | ID_Acta único, lo genera el sistema, no se modifica (PK sin setter) | Restricción del diccionario (principal) | Es un identificador técnico (PK sin setter). | Sí: AC01a Restricción (PK sin setter); AC01b RF candidato (generación autonumérica; patrón de A01b) |
| RN-AC02 | ID_Asignacion, Ruta_Acta y Firma_Digital obligatorios; Fecha_Firma la asigna el sistema | Restricción del diccionario (NO NULO y valor asignado al crear); respaldo RF-22 | Es NO NULO y valor por defecto del diccionario, no una política dictada por el negocio. | No |
| RN-AC03 | Ruta_Acta y Firma_Digital máximo 255 caracteres | Restricción del diccionario | Es la longitud VARCHAR; los mensajes van a mockups (M-124, M-126). | No |
| RN-AC04 | ID_Asignacion debe corresponder a una asignación existente | Restricción del diccionario | Es la FK hacia Asignacion. | No |
| RN-AC05 | Solo se firma el acta de una asignación Vigente | RN (propuesta) | Sin software, el acta se firma al recibir el equipo, mientras está en poder del custodio; un acta de una entrega ya devuelta no tiene sentido. | No |
| RN-AC06 | Una asignación tiene una sola acta (ID_Asignacion único); un método interno la protege | RN (parcial; propuesta) | La política (una entrega se respalda con una sola acta) existiría sin software; el UNIQUE 1 a 1 y el método interno son el mecanismo. | Sí: AC06a RN (una asignación, una acta); AC06b Restricción del diccionario (UNIQUE estructural 1 a 1) |
| RN-AC07 | El acta la firma el custodio de la asignación (el receptor del equipo) | RN (parcial; ancla de 1.7.3) | Mezcla dos ideas: la política (toda entrega queda respaldada por un acta firmada por quien recibe, regla implícita de 1.7.3, N-05) y quién puede firmar (propiedad, con CA de rechazo M-129). | Sí: AC07a RN (ancla de 1.7.3); AC07b RN (propiedad; HU-19 CA-6) |
| RN-AC08 | Firma_Digital es un código de validación (hash criptográfico) del receptor; no se define el algoritmo, quién lo genera ni cómo se valida | RNF candidato (seguridad de la firma; mecanismo de la ancla AC07a) | Es una cualidad de seguridad (que la firma sea verificable), no una política del negocio; lo no definido es P-38 y va a la lista de cambios al modelo. | No |
| RN-AC09 | Consultar el acta devuelve la única acta de la asignación (Vigente o Cerrada) con sus 5 campos; si no tiene acta o la asignación no existe, se informa | RF candidato (principal) | Es una consulta; «única» lo garantiza el UNIQUE e «informar» es mensaje. | Sí: AC09a RF candidato (incluye asignaciones cerradas); AC09b Mockup/mensaje (5 campos; M-130, M-108) |
| RN-AC10 | El Empleado solo consulta el acta de su propia asignación | RN (propuesta; propiedad) | Sin software, quien recibió un equipo solo ve su constancia, y hay CA de rechazo (M-131). | No |
 
*Fuente: elaboración propia a partir de la sección D del consolidado, el diccionario v6 y el UML v6.*
 
### **A.7 Devolución (RN-D01 a RN-D21)**
 
Cada candidata de la sección D del consolidado se evaluó con el filtro del curso: ¿existiría esta política aunque no hubiera software y la podría dictar el negocio? Un UNIQUE que expresa una política de identidad del negocio es RN, y uno puramente estructural (relación 1 a 1 por diseño) se evalúa caso por caso; NO NULO, longitud, tipo, ENUM y existencia de FK permanecen en el diccionario. La autoridad por rol («solo el actor X puede…») es RNF candidato aunque exista un CA de rechazo que la verifique; la propiedad («solo el dueño accede a lo suyo») es RN. Una regla con respaldo documental es RN aunque ningún CA de rechazo la pruebe. Los códigos no se renumeran; las candidatas que mezclan destinos se dividen con sufijos provisionales y las que son consecuencia de otra se fusionan conservando su código en la tabla.
 
Tabla 18. Clasificación de las candidatas RN-D01 a RN-D21 (Bloque 4b-1, Devolucion)
 
| **Código** | **Regla actual (resumida)** | **Destino final** | **Justificación (¿existiría sin software?)** | **¿Se divide?** |
| --- | --- | --- | --- | --- |
| RN-D01 | ID_Devolucion único, lo genera el sistema, no se modifica (PK sin setter) | Restricción del diccionario (principal) | Es un identificador técnico (PK sin setter). | Sí: D01a Restricción (PK sin setter); D01b RF candidato (generación autonumérica; patrón de A01b) |
| RN-D02 | ID_Asignacion obligatorio; Observaciones opcional; Fecha_Devolucion, Estado_Recepcion, Fecha_Confirmacion e ID_Receptor no se digitan al registrar | Restricción del diccionario (NO NULO y valores asignados); respaldo RF-24 | Es NO NULO, valores por defecto y campos que se llenan al confirmar, todo del diccionario. | No |
| RN-D03 | Observaciones máximo 255 caracteres | Restricción del diccionario | Es la longitud VARCHAR; el mensaje va a mockups (M-133). | No |
| RN-D04 | ID_Asignacion debe corresponder a una asignación existente | Restricción del diccionario | Es la FK hacia Asignacion. | No |
| RN-D05 | Solo se registra la devolución de una asignación Vigente | RN (propuesta) | Sin software, no se devuelve un equipo cuya asignación ya se cerró. | No |
| RN-D06 | Una asignación tiene una sola devolución (ID_Asignacion único); un método interno la protege | RN (parcial; propuesta) | La política (una asignación se devuelve una sola vez) existiría sin software; el UNIQUE 1 a 1 y el método interno son el mecanismo. | Sí: D06a RN (una asignación, una devolución); D06b Restricción del diccionario (UNIQUE estructural 1 a 1) |
| RN-D07 | La devolución la registra el custodio de la asignación (el Empleado), que solo puede registrar la devolución de su propia asignación | RN (parcial; propuesta) | Mezcla dos ideas: quién registra (autoridad por rol) y que solo registre lo suyo (propiedad, con CA de rechazo M-136). | Sí: D07a RNF candidato (autoridad por rol: el Empleado registra; P-42); D07b RN (propiedad; incluye D12 y D20) |
| RN-D08 | Al registrar, Fecha_Devolucion = fecha y hora actuales y Estado_Recepcion = Pendiente; Fecha_Confirmacion e ID_Receptor quedan vacíos | Restricción del diccionario (valores asignados al crear); respaldo RF-24 | El diccionario define los valores asignados por el sistema (se solapa con D02). | No |
| RN-D09 | Estado_Recepcion solo toma Pendiente y Confirmada | Restricción del diccionario (ENUM) | Es el ENUM Estado_Recepcion. | No |
| RN-D10 | Registrar la devolución no cierra la asignación ni cambia el estado del activo: la asignación sigue Vigente y el activo Asignado hasta confirmar la recepción | Fusionada en RN-AS14 (B4a-1) y RF candidato | Es la misma regla de AS14 vista desde Devolucion: solo la devolución confirmada cierra la asignación. Que el activo no cambie al registrar es comportamiento del sistema. | Sí: D10a Fusionada en RN-AS14; D10b RF candidato (registrar no cambia el estado del activo) |
| RN-D11 | actualizar solo modifica Observaciones y solo mientras la devolución está Pendiente; los demás datos no se modifican; una Confirmada no se actualiza | RN (parcial; propuesta) | Mezcla dos ideas: qué datos admite actualizar (comportamiento del sistema) y que una devolución confirmada es definitiva (política, patrón A18, C12b, S14, AS13b). | Sí: D11a RF candidato (campos editables; P-49); D11b RN (devolución confirmada definitiva; incluye D17) |
| RN-D12 | Solo el custodio de la asignación actualiza su devolución | Fusionada en RN-D07b | Es la misma política de propiedad aplicada a otra operación. | No |
| RN-D13 | Confirmar pasa Estado_Recepcion de Pendiente a Confirmada; asigna Fecha_Confirmacion e ID_Receptor (el usuario en sesión); no se digitan | RF candidato (principal) | Describe lo que hace el sistema; que el receptor salga de la sesión es el mecanismo de RN-T03. | Sí: D13a RF candidato; D13b duplicada con RN-T03 (se resuelve en Transversales) |
| RN-D14 | ID_Receptor debe ser un usuario existente, activo y con el rol Responsable de Activos | RN (parcial; propuesta) | Mezcla tres ideas: existencia (FK), receptor en servicio (política) y rol (autoridad por rol). | Sí: D14a Restricción del diccionario (FK); D14b RN (receptor activo); D14c RNF candidato (autoridad por rol; HU-24 CA-6 verifica el RNF) |
| RN-D15 | Al confirmar, la asignación pasa a Cerrada (invoca el cierre) y el activo a Disponible salvo que esté Dañado | RF candidato | Describe el efecto del sistema sobre otras entidades; duplica RN-AS15c y se apoya en RN-AS14. | No |
| RN-D16 | Antes de confirmar, aviso de consecuencia y opción de desistir | Mockup / mensaje | Es un aviso de confirmación (M-151, M-152). | No |
| RN-D17 | Una devolución ya Confirmada no se confirma de nuevo ni vuelve a Pendiente | Fusionada en RN-D11b | Es consecuencia del estado confirmado que dicta D11b (patrón A11 en A18). | No |
| RN-D18 | La búsqueda por identificador devuelve una sola devolución con sus 7 campos o informa; cualquier operación sobre una devolución inexistente lo informa | RF candidato (principal) | Es una consulta; «una sola» lo garantiza la PK e «informar» es mensaje. | Sí: D18a RF candidato; D18b Mockup/mensaje (7 campos; M-137, M-141) |
| RN-D19 | Las pendientes de recepción: solo las Pendiente, de la más antigua a la más reciente; si no hay, se informa | RF candidato (principal) | Listar y ordenar lo hace el sistema; el orden es propuesta sin pregunta propia. | Sí: D19a RF candidato; D19b Mockup/mensaje (M-138) |
| RN-D20 | El Empleado solo consulta las devoluciones de sus propias asignaciones | Fusionada en RN-D07b | Es la misma política de propiedad aplicada a la consulta (CA de rechazo HU-22 CA-7, M-139). | No |
| RN-D21 | El Responsable de Activos consulta y confirma; el Empleado registra, actualiza y consulta las suyas | RNF candidato (autoridad por rol) | Es una regla de «solo el actor X…»; el Alcance 1.2 respalda al Responsable que confirma, y el resto es supuesto (P-42). | No |
 
*Fuente: elaboración propia a partir de la sección D del consolidado, el diccionario v6 y el UML v6.*
 
### **A.8 Notificación de devolución (RN-N01 a RN-N10)**
 
Cada candidata de la sección D del consolidado se evaluó con el filtro del curso: ¿existiría esta política aunque no hubiera software y la podría dictar el negocio? Un UNIQUE que expresa una política de identidad del negocio es RN, y uno puramente estructural (relación 1 a 1 por diseño) se evalúa caso por caso; NO NULO, longitud, tipo, ENUM y existencia de FK permanecen en el diccionario. La autoridad por rol («solo el actor X puede…») es RNF candidato aunque exista un CA de rechazo que la verifique; la propiedad («solo el dueño accede a lo suyo») es RN. Una regla con respaldo documental es RN aunque ningún CA de rechazo la pruebe. Dos destinos amplían el filtro: «Pregunta sin regla», para un parámetro que el cliente no definió (se convierte en RN cuando lo defina), y «Límite de alcance», para una frase que fija el alcance del proyecto y que va como nota. Los códigos no se renumeran; las candidatas que mezclan destinos se dividen con sufijos provisionales.
 
**Tabla 19. Clasificación de las candidatas RN-N01 a RN-N10 (Bloque 4b-2, Notificacion_De_Devolucion)**
 
| **Código** | **Regla actual (resumida)** | **Destino final** | **Justificación (¿existiría sin software?)** | **¿Se divide?** |
| --- | --- | --- | --- | --- |
| RN-N01 | ID_Notificacion único, lo genera el sistema, no se modifica (PK sin setter) | Restricción del diccionario (principal) | Es un identificador técnico (PK sin setter). | Sí: N01a Restricción (PK sin setter); N01b RF candidato (generación autonumérica; patrón de A01b, HAL-07) |
| RN-N02 | ID_Asignacion obligatorio y de una asignación existente | Restricción del diccionario | Es NO NULO y FK hacia Asignacion; el mensaje de asignación inexistente va a mockups (M-108). | No |
| RN-N03 | ID_Asignacion no es único (varios avisos por asignación); cuándo y cuántas veces se avisa no está definido | Restricción del diccionario (principal) | La ausencia de UNIQUE y la multiplicidad 0..* son del diccionario; la frecuencia no existe como política del negocio. | Sí: N03a Restricción (sin UNIQUE); N03b Pregunta sin regla (frecuencia; P-44) |
| RN-N04 | Dias_Restantes = fecha esperada de devolución − fecha actual; dato derivado, no se almacena | Restricción del diccionario (dato derivado) | Es una fórmula y un atributo derivado; el cálculo es mecanismo. Respaldo en RF-28. | No |
| RN-N05 | Solo se avisa la devolución de una asignación vigente; la de una cerrada no | RN (propuesta) | Sin software, no se recuerda la devolución de un equipo que ya se devolvió; HU-25 CA-4 la delata. | No |
| RN-N06 | El aviso va por correo al Email del usuario del custodio de la asignación (asignación → custodio → usuario) | RF candidato | Que el aviso llegue al custodio es el contenido de RF-28; no nace de un CA de rechazo ni tiene respaldo documental suficiente (el Alcance 1.2 no nombra al destinatario). La cadena hasta el correo y el envío son mecanismo. Otros destinatarios: P-N1. | No |
| RN-N07 | Si el plazo venció, el aviso se genera igual y el correo informa los días de retraso | RF candidato (principal) | El Alcance 1.2 habla de «próximas devoluciones», no de vencidas. Sin respaldo documental ni CA de rechazo, la política no es RN. | Sí: N07a RF candidato (cálculo negativo y correo de plazo vencido; M-158, M-159); N07b Propuesta de regla nueva PRO-06 (P-45) |
| RN-N08 | El umbral de días y la frecuencia del aviso no están definidos | Pregunta sin regla (P-44) | Un parámetro que el cliente no definió no es regla; los 25, 1 y 0 días de los ejemplos de HU-25 son datos de ejemplo. | No |
| RN-N09 | El aviso es automático, sin actor humano que lo solicite | RF candidato | Es el disparador del sistema (Alcance 1.2); no dice qué está permitido o prohibido en el negocio. | No |
| RN-N10 | Es el único aviso automático del sistema; no hay otros | Límite de alcance (nota; no es RN) | Es el alcance del proyecto (1.2), no una política del negocio; no cambia el modelo. | No |
 
*Fuente: elaboración propia a partir de la sección D del consolidado, el diccionario v6, el UML v6 y el Alcance 1.2.*
 
### **A.9 Reporte de daños (RN-RD01 a RN-RD19)**
 
Cada candidata de la sección D del consolidado se evaluó con el filtro del curso: ¿existiría esta política aunque no hubiera software y la podría dictar el negocio? Un UNIQUE que expresa una política de identidad del negocio es RN, y uno puramente estructural se evalúa caso por caso; NO NULO, longitud, tipo, ENUM y existencia de FK permanecen en el diccionario. La autoridad por rol («solo el actor X puede…») es RNF candidato aunque exista un CA de rechazo que la verifique; la propiedad («solo el dueño accede a lo suyo») es RN. Una regla con respaldo documental es RN aunque ningún CA de rechazo la pruebe. Dos destinos amplían el filtro: «Pregunta sin regla», para lo que el cliente no definió, y «Límite de alcance», para una frase que fija el alcance y va como nota. Las candidatas duplicadas con RN-T03 se marcan y se resuelven en Transversales. Los códigos no se renumeran; las candidatas que mezclan destinos se dividen con sufijos provisionales y las consecuencias de un estado terminal se fusionan en la RN que lo dicta.
 
**Tabla 20. Clasificación de las candidatas RN-RD01 a RN-RD19 (Bloque 5a, Reporte_de_Danios)**
 
| **Código** | **Regla actual (resumida)** | **Destino final** | **Justificación (¿existiría sin software?)** | **¿Se divide?** |
| --- | --- | --- | --- | --- |
| RN-RD01 | ID_ReporteDanios único, lo genera el sistema, no se modifica (PK sin setter) | Restricción del diccionario (principal) | Es un identificador técnico (PK sin setter). | Sí: RD01a Restricción; RD01b RF candidato (generación; patrón A01b, HAL-07) |
| RN-RD02 | Descripción, tipo y activo obligatorios; evidencia opcional; fecha asignada por el sistema; custodio de la sesión | Restricción del diccionario | Es NO NULO y valores asignados. La cláusula del custodio de la sesión es la de RD06. | No |
| RN-RD03 | Longitudes máximas (500 y 255); la evidencia guarda la ruta; mecanismo de carga no definido | Restricción del diccionario (principal) | Longitud y tipo son del diccionario; el mecanismo de carga no es una política. | Sí: RD03a Restricción; RD03b Pregunta sin regla (mecanismo de carga; P-52) |
| RN-RD04 | Tipo_Danio solo toma Hardware, Software u Otro | Restricción del diccionario | Es un ENUM. | No |
| RN-RD05 | ID_Activo corresponde a un activo existente | Restricción del diccionario | Es una FK (M-21). | No |
| RN-RD06 | ID_Custodio es el custodio del usuario en sesión; no se digita | Duplicada con RN-T03 | Es el mecanismo «el ID sale de la sesión»; la FK ya está en el diccionario. Se resuelve en Transversales. | No |
| RN-RD07 | Solo se reporta un equipo con asignación vigente a nombre de quien reporta | RN (propuesta; propiedad) | Sin software, quien reporta el daño de un equipo es quien lo tiene a su cargo; HU-26 CA-6 la delata. Se divide por objeto: el equipo (RD07a) y los reportes propios (RD07b, que recibe RD13b y RD17). | Sí: RD07a RN (equipo asignado a su nombre); RD07b RN (reportes propios) |
| RN-RD08 | Un activo en baja no se reporta | Fusionada en RN-A18 | Es consecuencia del estado terminal de la baja (patrón A11→A18); además un activo en baja no tiene asignación vigente (RN-A19), así que RD07a también lo rechaza. | No |
| RN-RD09 | Al crear el reporte, el activo pasa a dañado aunque esté asignado | RF candidato | Es un efecto sobre otra entidad; es el A16c ya clasificado en el B0. El Alcance 1.2 prevé actualizar el estado automáticamente. | No |
| RN-RD10 | Un activo ya dañado admite otro reporte y conserva dañado | RF candidato | Es comportamiento; sin CA de rechazo ni respaldo (P-50). | No |
| RN-RD11 | Buscar un reporte devuelve uno solo o informa que no existe | RF candidato (principal) | Es búsqueda y mensaje. | Sí: RD11a RF candidato; RD11b Mockup / mensaje (M-169, M-173) |
| RN-RD12 | Listar del más reciente al más antiguo; si no hay, se informa | RF candidato (principal) | Es orden y listado. | Sí: RD12a RF candidato; RD12b Mockup / mensaje (M-170) |
| RN-RD13 | El Técnico consulta todos los reportes; el Empleado solo los suyos | Fusionada en RN-RD07b | La parte del Empleado es propiedad y pasa a RD07b; la del Técnico es autoridad por rol (RNF). | Sí: RD13a RNF candidato; RD13b Fusionada en RD07b |
| RN-RD14 | Al actualizar solo cambian descripción, evidencia y tipo | RF candidato | Son campos editables; la PK sin setter ya está en RD01a; los mensajes M-174 a M-177 van a mockups. | No |
| RN-RD15 | Un reporte con mantenimiento asociado no se actualiza | RN (propuesta) | Sin software, un informe que ya motivó un mantenimiento no se reescribe; HU-28 CA-5 la delata. | No |
| RN-RD16 | Actualizar el reporte no cambia el estado del activo | RF candidato | Es un efecto sobre otra entidad. | No |
| RN-RD17 | Solo el custodio que reportó actualiza su reporte | Fusionada en RN-RD07b | Es propiedad en la operación de actualizar (patrón D12→D07b). | No |
| RN-RD18 | El Empleado reporta, actualiza y consulta los suyos; el Técnico consulta todos | RNF candidato | Es autoridad por rol; el reparto es un supuesto. La parte de propiedad queda en RD07a y RD07b. | No |
| RN-RD19 | El modelo no tiene baja de reportes, estado de atención ni «reportes sin atender» | Pregunta sin regla (P-53) | Es una ausencia del modelo, no una política; el cambio de modelo va a MOD-25. | No |
 
*Fuente: elaboración propia a partir de la sección D del consolidado, el diccionario v6, el UML v6 y el Alcance 1.2.*
 
### **A.10 Historial de mantenimientos (RN-H01 a RN-H18)**
 
Cada candidata de la sección D del consolidado se evaluó con el filtro del curso: ¿existiría esta política aunque no hubiera software y la podría dictar el negocio? Un UNIQUE que expresa una política de identidad del negocio es RN, y uno puramente estructural se evalúa caso por caso; NO NULO, longitud, tipo, ENUM, existencia de FK y rangos de un dato permanecen en el diccionario. La autoridad por rol («solo el actor X puede…») es RNF candidato aunque exista un CA de rechazo que la verifique; la propiedad es RN. Una regla con respaldo documental es RN aunque ningún CA de rechazo la pruebe. Dos destinos amplían el filtro: «Pregunta sin regla», para lo que el cliente no definió, y «Límite de alcance», para una frase que fija el alcance y va como nota. Las candidatas duplicadas con RN-T03 se marcan y se resuelven en Transversales. Los códigos no se renumeran; las candidatas que mezclan destinos se dividen con sufijos provisionales y las consecuencias de un estado terminal se fusionan en la RN que lo dicta.
 
**Tabla 21. Clasificación de las candidatas RN-H01 a RN-H18 (Bloque 5b, Historial_Mantenimientos)**
 
| **Código** | **Regla actual (resumida)** | **Destino final** | **Justificación (¿existiría sin software?)** | **¿Se divide?** |
| --- | --- | --- | --- | --- |
| RN-H01 | ID_Mantenimiento único, lo genera el sistema, no se modifica (PK sin setter) | Restricción del diccionario (principal) | Es un identificador técnico (PK sin setter). | Sí: H01a Restricción; H01b RF candidato (generación; patrón A01b, HAL-07) |
| RN-H02 | Activo, tipo, descripción y fecha obligatorios; reporte, costo y evidencia opcionales; la fecha la informa el técnico | Restricción del diccionario | Es NO NULO y opcionales. | No |
| RN-H03 | Longitudes máximas (300 y 255) | Restricción del diccionario | Es longitud. | No |
| RN-H04 | Tipo_Mantenimiento solo Preventivo o Correctivo | Restricción del diccionario | Es un ENUM. Que exista el valor Preventivo no es una regla; la tensión con el alcance va en H13. | No |
| RN-H05 | ID_Activo corresponde a un activo existente | Restricción del diccionario | Es una FK (M-21). | No |
| RN-H06 | Si se informa ID_ReporteDanios, corresponde a un reporte existente | Restricción del diccionario | Es una FK opcional (M-173). | No |
| RN-H07 | El reporte informado debe ser del mismo activo del mantenimiento | RN (propuesta) | Sin software, no se justifica la reparación de un equipo con el reporte de otro; HU-29 CA-6 la delata. | No |
| RN-H08 | Un activo en baja no admite mantenimiento | Fusionada en RN-A18 | Es consecuencia del estado terminal de la baja (patrón RD08). | No |
| RN-H09 | ID_Tecnico es el usuario de la sesión: existe, está activo y tiene el rol Técnico de Soporte | RN (principal, parte H09c) | Mezcla cuatro ideas con destinos distintos. | Sí: H09a Duplicada con RN-T03 (sale de la sesión); H09b Restricción (existe; M-40); H09c RN (técnico activo; M-39); H09d RNF candidato (rol; M-191) |
| RN-H10 | Costo en pesos, sin centavos y no negativo | Restricción del diccionario | Es tipo y rango del dato; «no negativo» se propone incorporarlo (MOD-28; P-58). | No |
| RN-H11 | Fecha_Mantenimiento no puede ser futura | Restricción del diccionario | Es coherencia con la fecha actual; propuesta de incorporarla (patrón AS09; MOD-28; P-58). | No |
| RN-H12 | Registrar un mantenimiento no cambia el estado del activo; el Responsable lo devuelve a Disponible con actualizar | Fusionada en RN-A16a y RN-A16b | Lo primero es un efecto sobre otra entidad (RF); lo segundo es la corrección manual que ya dictan A16a (sin asignación vigente) y A16b (Dañado a Disponible permitido). | Sí: H12a RF candidato; H12b Fusionada en RN-A16a y RN-A16b |
| RN-H13 | Solo registro simple, sin programación ni recordatorios; preventivo avanzado fuera del alcance | Límite de alcance (nota; no es RN) | Es el alcance del proyecto (1.2), no una política del negocio (NAL-04). | No |
| RN-H14 | Buscar un mantenimiento devuelve uno solo o informa que no existe | RF candidato (principal) | Es búsqueda y mensaje. | Sí: H14a RF candidato; H14b Mockup / mensaje (M-192, M-195) |
| RN-H15 | Listar el historial de un activo del más reciente al más antiguo; si no hay o no existe, se informa | RF candidato (principal) | El Alcance 1.2 respalda la capacidad de consultar, no una política. | Sí: H15a RF candidato; H15b Mockup / mensaje (M-193, M-21) |
| RN-H16 | El Técnico de Soporte registra, consulta y actualiza los mantenimientos | RNF candidato | Es autoridad por rol; quién más consulta es un supuesto (P-57). | No |
| RN-H17 | Al actualizar solo cambian descripción, costo y evidencia | RF candidato | Son campos editables; la PK sin setter ya está en H01a; M-196 a M-201 van a mockups. | No |
| RN-H18 | Actualizar el mantenimiento no cambia el estado del activo | RF candidato | Es un efecto sobre otra entidad. | No |
 
*Fuente: elaboración propia a partir de la sección D del consolidado, el diccionario v6, el UML v6 y el Alcance 1.2.*
 
### **A.11 Usuario (RN-U01 a RN-U23)**
 
Cada candidata de la sección D del consolidado se evaluó con el filtro del curso: ¿existiría esta política aunque no hubiera software y la podría dictar el negocio? Un UNIQUE que expresa una política de identidad del negocio es RN, y uno puramente estructural se evalúa caso por caso; NO NULO, longitud, tipo, ENUM, formato y existencia de FK permanecen en el diccionario. La autoridad por rol («solo el actor X puede…») y las cualidades de seguridad son RNF candidato aunque exista un CA de rechazo que las verifique; la propiedad es RN. Una regla con respaldo documental es RN aunque ningún CA de rechazo la pruebe. Dos destinos amplían el filtro: «Pregunta sin regla», para lo que el cliente no definió, y «Límite de alcance», para una frase que fija el alcance y va como nota. La segregación de funciones no se incluye como regla: es una propuesta transversal única (PRO-02) y sus instancias se marcan. Los códigos no se renumeran; las candidatas que mezclan destinos se dividen con sufijos provisionales y las consecuencias de un estado terminal se fusionan en la RN que lo dicta.
 
**Tabla 22. Clasificación de las candidatas RN-U01 a RN-U23 (Bloque 6a, Usuario)**
 
| **Código** | **Regla actual (resumida)** | **Destino final** | **Justificación (¿existiría sin software?)** | **¿Se divide?** |
| --- | --- | --- | --- | --- |
| RN-U01 | ID_Usuario único, lo genera el sistema, no se modifica (PK sin setter) | Restricción del diccionario (principal) | Es un identificador técnico (PK sin setter). | Sí: U01a Restricción; U01b RF candidato (generación; patrón A01b) |
| RN-U02 | Nombre, apellido, correo, contraseña y rol obligatorios; activo lo asigna el sistema | Restricción del diccionario | Es NO NULO y valor inicial. | No |
| RN-U03 | Longitudes: nombre 20, apellido 20, correo 100; contraseña almacenada 255; la digitada no está definida | Restricción del diccionario (principal) | Es longitud y tipo; la longitud digitada es un parámetro no definido. | Sí: U03a Restricción; U03b Pregunta sin regla (P-61) |
| RN-U04 | Correo único entre todos los usuarios, activos e inactivos | RN (propuesta) | Sin software, una persona se identifica por su correo: dos cuentas con el mismo correo serían la misma persona (patrón C05). HU-32 CA-4 la delata. | No |
| RN-U05 | Correo con forma usuario@dominio, sin espacios | Restricción del diccionario | Es un formato de dato; propuesta de incorporarlo (MOD-32; P-63). | No |
| RN-U06 | rol solo toma los 5 valores | Restricción del diccionario | Es un ENUM. | No |
| RN-U07 | La contraseña se guarda cifrada; el mecanismo no está definido | RNF candidato (principal) | Es una cualidad de seguridad. | Sí: U07a RNF candidato; U07b Pregunta sin regla (mecanismo; P-62) |
| RN-U08 | La política de complejidad de la contraseña no está definida; solo no vacía | Pregunta sin regla (P-61) | Lo que el cliente no definió no es regla (CRI-07). | No |
| RN-U09 | Consultar devuelve 6 campos, activos e inactivos, nunca la contraseña; si no existe, se informa | RF candidato (principal) | Es comportamiento; ocultar la contraseña es seguridad. | Sí: U09a RF candidato; U09b RNF candidato (nunca mostrar la contraseña); U09c Mockup / mensaje (M-205, M-214, M-215) |
| RN-U10 | Al actualizar cambian nombre, apellido, correo y rol; el resto no | RF candidato | Son campos editables; los mensajes M-217 a M-219 van a mockups. | No |
| RN-U11 | No se actualiza un usuario inactivo | Fusionada en RN-U12b | Es consecuencia del estado inactivo (patrón C13 en C12b). | No |
| RN-U12 | Inactivar pone activo en FALSE; no se elimina; no se reactiva | RN (parte U12b) | Mezcla tres ideas. | Sí: U12a Doctrina (baja lógica, jamás DELETE); U12b RN (no se reactiva, no se actualiza, no se inactiva de nuevo; incluye U11 y U13); U12c RF candidato (inactivar pone activo en FALSE) |
| RN-U13 | Un usuario inactivo no se vuelve a inactivar | Fusionada en RN-U12b | Es consecuencia del estado inactivo. | No |
| RN-U14 | Antes de inactivar se explica la consecuencia y se permite desistir | Mockup / mensaje | Es un aviso de confirmación (M-221, M-222). | No |
| RN-U15 | No se inactiva a un usuario con custodio activo, asignaciones vigentes o solicitudes pendientes | RN (parte U15a) | Sin software, quien responde por equipos no se da de baja sin resolverlos; HU-35 CA-5 la delata. | Sí: U15a RN (custodio activo; M-226); U15b Fusionada en RN-C14a y RN-C14b (vigentes y pendientes; M-224, M-225 a mockups) |
| RN-U16 | No se inactiva al único aprobador activo con solicitudes pendientes | RN (propuesta) | Sin aprobador, las solicitudes en trámite quedan sin quien las decida; HU-35 CA-5 la delata. | No |
| RN-U17 | Un usuario no inactiva su propio usuario | Propuesta transversal de segregación (PRO-02; instancia) | Instancia de «quien opera no decide sobre lo propio» (criterio 5). Es la única instancia con RF vigilante (RF-39: «ni al propio usuario»); usa el mecanismo de sesión (RN-T03). | No |
| RN-U18 | Iniciar sesión exige correo y contraseña, compara la cifrada e inicia con el rol; los 5 roles pueden | RF candidato (principal) | Es comportamiento. | Sí: U18a RF candidato; U18b Mockup / mensaje (M-205, M-206, M-229) |
| RN-U19 | Si el correo no existe o la contraseña es incorrecta, el mensaje es el mismo | RNF candidato | Es seguridad: no revelar qué correos existen (M-230). | No |
| RN-U20 | Un usuario inactivo no inicia sesión; el mensaje de inactividad solo con credenciales correctas | RN (parte U20a) | La primera parte es política; la segunda es seguridad. | Sí: U20a RN (inactivo no inicia sesión); U20b RNF candidato (mensaje solo con credenciales correctas; P-71) |
| RN-U21 | Cambiar contraseña valida la actual, exige la nueva no vacía y distinta, la guarda cifrada | RF candidato (principal) | Es comportamiento; «distinta de la actual» es política de contraseña (seguridad). | Sí: U21a RF candidato (validar la actual y guardar cifrada; M-232); U21b RNF candidato (nueva distinta de la actual; M-233; P-61); U21c Mockup / mensaje (M-234, M-235; confirmación de interfaz) |
| RN-U22 | Un usuario solo cambia su propia contraseña | RN (propiedad) | Sin software, nadie cambia la clave de otro; HU-37 CA-5 la delata. Usa el mecanismo de RN-T03. | No |
| RN-U23 | El Responsable de Activos gestiona usuarios; cualquiera inicia sesión y cambia su contraseña | RNF candidato | Es autoridad por rol; la parte «su propia contraseña» queda en U22. Supuesto (P-60, P-72). | No |
 
*Fuente: elaboración propia a partir de la sección D del consolidado, el diccionario v6, el UML v6 y el Alcance 1.2.*
 
### **A.12 Rol_Permiso (RN-RP01 a RN-RP12)**
 
Cada candidata de la sección D del consolidado se evaluó con el filtro del curso: ¿existiría esta política aunque no hubiera software y la podría dictar el negocio? Un UNIQUE que expresa una política de identidad del negocio es RN; una unicidad sin sentido de negocio es restricción del diccionario aunque tenga un CA de rechazo (CRI-10). NO NULO, longitud, tipo, ENUM, formato y existencia de FK permanecen en el diccionario. La autoridad por rol («solo el actor X puede…») y las cualidades de seguridad son RNF candidato aunque exista un CA de rechazo que las verifique; la propiedad es RN. La matriz rol–permiso es configuración (dato) que el cliente debe confirmar. Dos destinos amplían el filtro: «Pregunta sin regla», para lo que el cliente no definió, y «Límite de alcance», para una frase que fija el alcance y va como nota. Los códigos no se renumeran y las candidatas que mezclan destinos se dividen con sufijos provisionales.
 
**Tabla 23. Clasificación de las candidatas RN-RP01 a RN-RP12 (Bloque 6b-1, Rol_Permiso)**
 
| **Código** | **Regla actual (resumida)** | **Destino final** | **Justificación (¿existiría sin software?)** | **¿Se divide?** |
| --- | --- | --- | --- | --- |
| RN-RP01 | PK compuesta (rol, permiso), sin FK ni setter; ambos son ENUM | Restricción del diccionario | Es la estructura de la tabla (Caso 4 de 4b). | No |
| RN-RP02 | rol y permiso obligatorios | Restricción del diccionario | Es NO NULO. | No |
| RN-RP03 | rol solo toma los 5 valores | Restricción del diccionario | Es un ENUM. | No |
| RN-RP04 | permiso solo toma los 9 valores | Restricción del diccionario | Es un ENUM. | No |
| RN-RP05 | Un par rol–permiso no se repite | Restricción del diccionario (PK compuesta; mecanismo de RP01) | Un rol tiene o no tiene un permiso: repetir la pareja es semántica de conjunto y no tiene sentido de negocio. HU-38 CA-3 es su rechazo (M-240) y RF-42 lo vigila (CRI-10). | No |
| RN-RP06 | retirar elimina la fila; es la única excepción a «jamás DELETE»; no existe reactivar | Pregunta sin regla (principal; P-78) | No se inventa una excepción a la doctrina: se pregunta y se propone cambio de modelo (MOD-35). | Sí: RP06a Pregunta sin regla (eliminación física frente a la doctrina); RP06b RF candidato (retirar elimina la asignación; para volver a otorgarla se usa asignar) |
| RN-RP07 | Solo se retira una asignación que existe | RF candidato | Es verificación interna y mensaje (M-244). | No |
| RN-RP08 | Antes de retirar, aviso de la consecuencia y opción de desistir | Mockup / mensaje | Es un aviso de confirmación (M-242, M-243). | No |
| RN-RP09 | retirar elimina solo el par indicado | RF candidato | Es el efecto del retiro sobre otras filas. | No |
| RN-RP10 | consultarPermisos devuelve los permisos del rol en el orden de declaración, sin modificar datos; lista vacía con mensaje | RF candidato (principal) | Es comportamiento. | Sí: RP10a RF candidato; RP10b Mockup / mensaje (M-245) |
| RN-RP11 | La matriz inicial de permisos por rol no está definida | Pregunta sin regla (P-75) | Lo que el cliente no definió no es regla (CRI-07); es un dato de configuración. | No |
| RN-RP12 | El Responsable de Activos otorga, retira y consulta permisos por rol | RNF candidato | Es autoridad por rol; el Alcance 1.2 respalda solo la consulta; otorgar y retirar es Supuesto (P-74). | No |
 
*Fuente: elaboración propia a partir de la sección D del consolidado, el diccionario v6, el UML v6 y el Alcance 1.2.*
 
### **A.13 Categoría (RN-CA01 a RN-CA14)**
 
Cada candidata de la sección D del consolidado se evaluó con el filtro del curso: ¿existiría esta política aunque no hubiera software y la podría dictar el negocio? Un UNIQUE que expresa una política de identidad del negocio es RN; una unicidad sin sentido de negocio es restricción del diccionario aunque tenga un CA de rechazo (CRI-10). NO NULO, longitud, tipo, ENUM, formato y existencia de FK permanecen en el diccionario. La autoridad por rol («solo el actor X puede…») y las cualidades de seguridad son RNF candidato aunque exista un CA de rechazo que las verifique; la propiedad es RN. Dos destinos amplían el filtro: «Pregunta sin regla», para lo que el cliente no definió, y «Límite de alcance», para una frase que fija el alcance y va como nota. Los códigos no se renumeran; las candidatas que mezclan destinos se dividen con sufijos provisionales y las consecuencias de un estado terminal se fusionan en la RN que lo dicta.
 
**Tabla 24. Clasificación de las candidatas RN-CA01 a RN-CA14 (Bloque 6b-2, Categoria)**
 
| **Código** | **Regla actual (resumida)** | **Destino final** | **Justificación (¿existiría sin software?)** | **¿Se divide?** |
| --- | --- | --- | --- | --- |
| RN-CA01 | ID_Categoria único, lo genera el sistema, no se modifica (PK sin setter) | Restricción del diccionario (principal) | Es un identificador técnico (PK sin setter). | Sí: CA01a Restricción; CA01b RF candidato (generación; patrón A01b) |
| RN-CA02 | Nombre_Categoria obligatorio; activo lo asigna el sistema | Restricción del diccionario | Es NO NULO y valor inicial. | No |
| RN-CA03 | Longitud máxima de 50 caracteres | Restricción del diccionario | Es longitud. | No |
| RN-CA04 | Nombre único entre todas las categorías, activas e inactivas, sin distinguir mayúsculas | RN (propuesta) | Sin software, dos categorías con el mismo nombre harían ambigua la clasificación de un equipo (patrón U04). HU-41 CA-4 la delata. | No |
| RN-CA05 | listarActivas trae solo las activas, ordenadas por nombre; si no hay, se informa | RF candidato (principal) | Es comportamiento. | Sí: CA05a RF candidato; CA05b Mockup / mensaje (M-251) |
| RN-CA06 | buscarPorId devuelve la categoría con sus 3 campos, activa o inactiva; si no existe, se informa | RF candidato (principal) | Es comportamiento. | Sí: CA06a RF candidato; CA06b Mockup / mensaje (M-250, M-253) |
| RN-CA07 | Al actualizar solo cambia el nombre; ID y activo no | RF candidato | Son campos editables; M-254 y M-255 van a mockups. | No |
| RN-CA08 | No se actualiza una categoría inactiva | Fusionada en RN-CA09b | Es consecuencia del estado inactivo (patrón U11 en U12b). | No |
| RN-CA09 | Inactivar pone activo en FALSE; no se elimina; no se reactiva | RN (parte CA09b) | Mezcla tres ideas. | Sí: CA09a Doctrina (baja lógica, jamás DELETE); CA09b RN (no se reactiva, no se renombra, no se inactiva de nuevo; incluye CA08 y CA10); CA09c RF candidato (inactivar pone activo en FALSE) |
| RN-CA10 | Una categoría ya inactiva no se vuelve a inactivar | Fusionada en RN-CA09b | Es consecuencia del estado inactivo. | No |
| RN-CA11 | Antes de inactivar se explica la consecuencia y se permite desistir | Mockup / mensaje | Es un aviso de confirmación (M-258, M-259). | No |
| RN-CA12 | No se inactiva una categoría con activos sin dar de baja ni solicitudes pendientes | RN (propuesta) | Sin software, un tipo de equipo no se retira del catálogo mientras haya equipos en operación o pedidos en trámite (patrón C14). HU-44 CA-5 la delata. | Sí: CA12a RN (activos sin dar de baja; M-261); CA12b RN (solicitudes pendientes; M-262) |
| RN-CA13 | Una categoría inactiva no admite activos ni solicitudes nuevos | Fusionada en RN-A09 y RN-S07 | Es la misma política ya aprobada en esas reglas, vista desde la categoría. | No |
| RN-CA14 | El Responsable de Activos gestiona categorías; el Empleado consulta las activas al solicitar | RNF candidato | Es autoridad por rol; Supuesto (P-74, P-87). | No |
 
*Fuente: elaboración propia a partir de la sección D del consolidado, el diccionario v6, el UML v6 y el Alcance 1.2.*
 
### **A.14 Auditoría (RN-AU01 a RN-AU17)**
 
Cada candidata de la sección D del consolidado se evaluó con el filtro del curso: ¿existiría esta política aunque no hubiera software y la podría dictar el negocio? Un UNIQUE que expresa una política de identidad del negocio es RN; una unicidad sin sentido de negocio es restricción del diccionario aunque tenga un CA de rechazo (CRI-10). NO NULO, longitud, tipo, ENUM, formato y existencia de FK permanecen en el diccionario. La autoridad por rol y las cualidades de seguridad e integridad son RNF candidato aunque exista un CA de rechazo que las verifique; la propiedad es RN. Dos destinos amplían el filtro: «Pregunta sin regla», para lo que el cliente no definió, y «Límite de alcance», para una frase que fija el alcance y va como nota. Las duplicidades con las reglas transversales (RN-T01, RN-T02 y RN-T03) solo se marcan y se resuelven en Transversales. Los códigos no se renumeran (se conserva el hueco de RN-AU10, que pasó a RN-T02); las candidatas que mezclan destinos se dividen con sufijos provisionales.
 
**Tabla 25. Clasificación de las candidatas RN-AU01 a RN-AU17 (Bloque 7a, Auditoria)**
 
| **Código** | **Regla actual (resumida)** | **Destino final** | **Justificación (¿existiría sin software?)** | **¿Se divide?** |
| --- | --- | --- | --- | --- |
| RN-AU01 | ID_Auditoria único, lo genera el sistema, no se modifica (PK sin setter) | Restricción del diccionario (principal) | Es un identificador técnico (PK sin setter). | Sí: AU01a Restricción; AU01b RF candidato (generación; patrón A01b) |
| RN-AU02 | Los registros los crea registrar() (INTERNO), que invocan las demás operaciones; nadie lo pide | RF candidato | Es el mecanismo del sistema, sin actor ni HU. Duplicada con RN-T02 y con RN-A17 (COR-06). | No |
| RN-AU03 | Usuario, entidad, registro y acción obligatorios; detalle opcional (300); fecha asignada por el sistema | Restricción del diccionario | Es NO NULO, longitud y valor asignado. | No |
| RN-AU04 | ID_Usuario es quien ejecutó la acción (FK); sale de la sesión | Restricción del diccionario (principal) | La FK es del diccionario; que salga de la sesión es el mecanismo de RN-T03. | Sí: AU04a Restricción (FK hacia Usuario); AU04b Duplicada con RN-T03 |
| RN-AU05 | Entidad guarda el nombre de la tabla (50), no es ENUM; lista de valores sin definir | Restricción del diccionario (principal) | Es longitud y tipo; la lista cerrada no está definida. | Sí: AU05a Restricción; AU05b Pregunta sin regla (lista de valores; P-98) |
| RN-AU06 | ID_Registro es referencia lógica sin FK; el registro se conserva y se muestra aunque el afectado ya no exista | Restricción del diccionario | Es una decisión de modelo; el riesgo de integridad va a MOD-38. | No |
| RN-AU07 | Accion solo toma los 10 valores; Inactivar cubre inactivar, darDeBaja, cancelar y cerrar | Restricción del diccionario | Es un ENUM; el valor compartido es un cambio de modelo (MOD-39). | No |
| RN-AU08 | Detalle nunca contiene contraseñas | RNF candidato (seguridad) | Es una cualidad de seguridad; duplicada con RN-T01. | No |
| RN-AU09 | Los registros son inmutables: no hay operación para modificarlos ni borrarlos | RNF candidato (integridad) | Es integridad del rastro. El UML ya solo tiene registrar() y buscarPorId(), y la doctrina cubre el no borrar. Sin CA de rechazo: propuesta, sin ficha. | No |
| RN-AU11 | Auditar no cambia el resultado salvo que falle el registro; qué pasa entonces no está definido | Pregunta sin regla (P-96) | Es un parámetro no definido (CRI-07). | No |
| RN-AU12 | Las operaciones sin valor propio en Accion no se resuelven aquí; se proponen valores | Pregunta sin regla (P-91 a P-95) | Es una decisión pendiente; los cambios de modelo están en MOD-09, MOD-11, MOD-31, MOD-34 y MOD-39. | No |
| RN-AU13 | buscarPorId devuelve un registro con sus 7 campos o informa que no existe | RF candidato (principal) | Es comportamiento. | Sí: AU13a RF candidato; AU13b Mockup / mensaje (M-263) |
| RN-AU14 | ID_Auditoria debe ser un entero positivo; vacío, cero, negativo o no numérico se informa no válido | Restricción del diccionario | Es tipo y validación de entrada (INT); M-264. | No |
| RN-AU15 | Solo el Gerente consulta registros de auditoría | RNF candidato | Es autoridad por rol; Supuesto (P-88). | No |
| RN-AU16 | La consulta muestra el registro aunque su usuario esté inactivo | RF candidato | Es comportamiento, consecuencia de la baja lógica (FK; doctrina). | No |
| RN-AU17 | La consulta de un registro de auditoría no genera otro registro | Pregunta sin regla (P-90) | Es una decisión pendiente sobre auditar consultas. | No |
 
*Fuente: elaboración propia a partir de la sección D del consolidado, el diccionario v6, el UML v6 y el Alcance 1.2.*
 
### **A.15 Reportes (vista) (RN-R01 a RN-R16)**
 
Cada candidata de la sección D del consolidado se evaluó con el filtro del curso: ¿existiría esta política aunque no hubiera software y la podría dictar el negocio? Una definición de término que el cliente no dictó y que ningún CA de rechazo verifica no es RN: va al diccionario, al glosario o a una pregunta. NO NULO, longitud, tipo, ENUM, formato, coherencia entre dos fechas y existencia de FK permanecen en el diccionario. La autoridad por rol y las cualidades de seguridad y auditabilidad son RNF candidato; la propiedad es RN. Dos destinos amplían el filtro: «Pregunta sin regla», para lo que el cliente no definió, y «Límite de alcance», para una frase que fija el alcance y va como nota. Las duplicidades con las reglas transversales (RN-T01, RN-T02 y RN-T03) solo se marcan y se resuelven en Transversales. Los códigos no se renumeran.
 
**Tabla 26. Clasificación de las candidatas RN-R01 a RN-R16 (Bloque 7b, Reportes)**
 
| **Código** | **Regla actual (resumida)** | **Destino final** | **Justificación (¿existiría sin software?)** | **¿Se divide?** |
| --- | --- | --- | --- | --- |
| RN-R01 | Reportes es una vista sobre Activo, Asignacion y Devolucion: no almacena datos, no tiene PK ni FK y refleja datos actuales | Restricción del diccionario / UML | Es la naturaleza de la vista. | No |
| RN-R02 | Fecha_Inicio y Tipo_Reporte obligatorios; Fecha_Fin opcional | Restricción del diccionario | Es NO NULO y opcional (M-266, M-268). | No |
| RN-R03 | Tipo_Reporte solo toma Asignados, Disponibles, Pendientes_Devolucion y Mal_Estado | Restricción del diccionario | Es un ENUM (M-269). | No |
| RN-R04 | Si Fecha_Fin está vacía, el rango llega hasta la fecha actual | Pregunta sin regla (P-104; P-R1) | Es un valor por defecto que el cliente no definió, y para Pendientes_Devolucion «hasta hoy» ocultaría las devoluciones próximas. | No |
| RN-R05 | Fecha_Fin no anterior a Fecha_Inicio; igual es válida | Restricción del diccionario | Es coherencia entre dos fechas (patrón AS09 y MOD-29); M-267; MOD-40. | No |
| RN-R06 | Asignados: asignaciones vigentes con Fecha_Entrega en el rango | Pregunta sin regla (P-101, P-102) | Es una definición de término sin CA de rechazo; el Alcance 1.2 solo nombra «activos asignados». | No |
| RN-R07 | Pendientes_Devolucion: asignaciones vigentes con Fecha_Devolucion_Esperada en el rango, con el estado de recepción si existe | Pregunta sin regla (P-101, P-102) | Es una definición de término sin CA de rechazo. | No |
| RN-R08 | Disponibles: activos disponibles; las fechas no filtran | Pregunta sin regla (P-101) | Es una definición; Activo no tiene fecha de estado. | No |
| RN-R09 | Mal_Estado: activos dañados; las fechas no filtran; un activo en baja no es mal estado | Pregunta sin regla (P-101, P-102) | Es una definición de término sin CA de rechazo. | No |
| RN-R10 | Columnas de cada reporte, tomadas solo de Activo, Asignacion y Devolucion | Mockup / mensaje | Son columnas (P-103). | No |
| RN-R11 | Orden de cada reporte (por fecha de entrega, por fecha esperada o por identificador) | RF candidato | Es ordenar (P-103). | No |
| RN-R12 | Un reporte sin filas se informa con un mensaje informativo | Mockup / mensaje | Es un mensaje (M-270). | No |
| RN-R13 | Cada consulta de reporte se registra en Auditoria (Reportar) | RNF candidato (auditabilidad; duplicada con RN-T02) | Es auditabilidad; solo se marca la duplicidad (HAL-78). | No |
| RN-R14 | Solo el Gerente consulta reportes | RNF candidato | Es autoridad por rol; Supuesto (P-88). | No |
| RN-R15 | consultar() no modifica datos | Restricción del diccionario / UML | Es la vista de solo lectura. | No |
| RN-R16 | El UML declara que consultar() devuelve «Reporte», que no es una clase | Restricción del diccionario / UML (hallazgo; MOD-12) | Es un hallazgo del modelo, ya registrado en MOD-12. | No |
 
*Fuente: elaboración propia a partir de la sección D del consolidado, el diccionario v6, el UML v6 y el Alcance 1.2.*
 
### **A.16 Transversales (RN-T01 a RN-T03)**
 
Las tres reglas transversales se clasifican aplicando las decisiones T-1 a T-3 de la lista maestra: RN-T01 pasa a requisito no funcional de seguridad; RN-T02 se divide en una RN con ficha (T02a) y un RNF de auditabilidad (T02b), de forma provisional hasta la validación del docente; y RN-T03 es un mecanismo del sistema (RNF / RF), cuya política de fondo ya está en RN-AP12a y en RN-T02a.
 
**Tabla 27. Clasificación de RN-T01 a RN-T03 (Transversales)**
 
| **Código** | **Regla actual** | **Destino final** | **Justificación (¿existiría sin software?)** | **¿Se divide?** |
| --- | --- | --- | --- | --- |
| RN-T01 | El campo Detalle de Auditoria nunca contiene contraseñas, ni en texto plano ni cifradas. | RNF de seguridad (Reclasificada a RNF) | Es una cualidad de seguridad, no una política del negocio; está duplicada con RN-AU08 (T-1). | No |
| RN-T02 (antes RN-AU10) | Cada operación auditable de las HU-01 a HU-46 deja un registro en Auditoria con la Accion y la Entidad de la tabla A.6. | RN (parte T02a) y RNF de auditabilidad (parte T02b); provisional, sujeta a validación del docente | La parte sobre asignación, devolución, cambio de responsable y baja tiene respaldo documental (Alcance 1.2 y análisis de 1.7); la extensión a toda operación auditable es auditabilidad (T-2; P-06, P-89). | Sí: T02a RN con ficha; T02b RNF de auditabilidad |
| RN-T03 | ID_Custodio, ID_Aprobador, ID_Receptor e ID_Tecnico salen del usuario en sesión; no se digitan. | RNF / RF (mecanismo) | Es comportamiento del sistema, no política. La política de fondo es RN-AP12a para las decisiones y RN-T02a para asignación, devolución, cambio de responsable y baja. Duplicadas marcadas como consecuencia: S10c, AP12b, D13b, H09a, RD06 y AU04b (y la comparación con la sesión de U17 y U22) (T-3). | No |
 
*Fuente: elaboración propia a partir de la sección D del consolidado, el Alcance 1.2, el análisis documental de 1.7 y las decisiones T-1 a T-3 (T-2 provisional, a la espera de la validación del docente).*
 
## **Anexo B. Verificación en reversa de los criterios de aceptación de rechazo**
 
Cada criterio de aceptación de rechazo de las HU de la entidad se contrasta con el destino de la regla que lo respalda. Transversales no tiene HU propia, por lo que no tiene verificación.
 
### **B.1 Activo (RN-A01 a RN-A19)**
 
Tabla 28. Verificación en reversa de los criterios de aceptación de rechazo (HU-01 a HU-04)
 
| **CA de rechazo** | **Caso** | **Respaldo** |
| --- | --- | --- |
| HU-01 CA-3 | Serie ya registrada (Disponible o Baja) | RN-A03 |
| HU-01 CA-3 | Placa ya registrada (Asignado o Baja) | RN-A04 |
| HU-01 CA-4 | Datos obligatorios vacíos (5 campos) | Restricción del diccionario (NO NULO; A02) |
| HU-01 CA-5 | Longitud superada | Restricción del diccionario (A05) |
| HU-01 CA-6 | Categoría inexistente | Restricción del diccionario (FK; A08) |
| HU-01 CA-6 | Categoría inactiva | RN-A09 |
| HU-02 CA-4 | Activo no encontrado (3 formas de búsqueda) | Mensaje / RF-03 (A15b) |
| HU-02 CA-6 | Inventario vacío (informativo, no es rechazo) | Mensaje / RF-03 (A14) |
| HU-03 CA-3 | Serie o placa de otro activo | RN-A03, RN-A04 (A13 como RF) |
| HU-03 CA-4 | Campos vacíos | Restricción del diccionario (A02) |
| HU-03 CA-4 | Longitud superada | Restricción del diccionario (A05) |
| HU-03 CA-4 | Categoría inexistente | Restricción del diccionario (FK; A08) |
| HU-03 CA-4 | Categoría inactiva | RN-A09 |
| HU-03 CA-5 | Estado «Prestado» | Restricción del diccionario (ENUM; A07) |
| HU-03 CA-5 | Disponible a Baja / Disponible a Asignado | RN-A16b |
| HU-03 CA-5 | Asignado a Dañado / Asignado a Disponible | RN-A16a |
| HU-03 CA-6 | Activo en Baja no editable | RN-A18 |
| HU-03 CA-7 | Activo inexistente | Mensaje / RF-04 |
| HU-03 CA-7 | Modificar ID_Activo | Restricción del diccionario (PK sin setter; A01a) |
| HU-04 CA-3 | Activo ya en Baja | RN-A18 (A11 fusionada) |
| HU-04 CA-4 | Activo con asignación vigente | RN-A19 |
| HU-04 CA-5 | Activo inexistente | Mensaje / RF-05 |
 
*Fuente: elaboración propia a partir de las HU-01 a HU-04 del consolidado. HU-04 CA-2 (desistir de la baja) no es rechazo: corresponde a RN-A12 (mockup / mensaje).*
 
### **B.2 Custodio (RN-C01 a RN-C17)**
 
Tabla 29. Verificación en reversa de los criterios de aceptación de rechazo (HU-05 a HU-08)
 
| **CA de rechazo** | **Caso** | **Respaldo** |
| --- | --- | --- |
| HU-05 CA-2 | Datos obligatorios vacíos (4 campos) | Restricción del diccionario (NO NULO; C02) |
| HU-05 CA-3 | Longitud superada (N_documento 21, Direccion 201) | Restricción del diccionario (C03) |
| HU-05 CA-4 | tipo_documento «TI» no válido | Restricción del diccionario (ENUM; C04) |
| HU-05 CA-5 | Mismo tipo y número de documento | RN-C05 |
| HU-05 CA-5 | El usuario ya es custodio | Restricción del diccionario (UNIQUE estructural; C06) |
| HU-05 CA-6 | Usuario inexistente | Restricción del diccionario (FK; C07) |
| HU-05 CA-6 | Usuario inactivo | RN-C08a |
| HU-05 CA-6 | Usuario con rol Gerente | RN-C08b |
| HU-06 CA-4 | Custodio no encontrado (3 formas) | Mensaje / RF-08 (C15b) |
| HU-07 CA-3 | Documento que ya tiene otro custodio | RN-C05 (C10 como RF) |
| HU-07 CA-4 | Campos vacíos (3) | Restricción del diccionario (C02) |
| HU-07 CA-4 | Longitud superada (2) | Restricción del diccionario (C03) |
| HU-07 CA-4 | tipo_documento «TI» | Restricción del diccionario (C04) |
| HU-07 CA-5 | Cambiar ID_Usuario o Fecha_Registro | RF-09 (C11) y mensaje (M-52, M-53) |
| HU-07 CA-5 | Cambiar activo | RF-09 (C11, C12c) y mensaje (M-51) |
| HU-07 CA-6 | Custodio inexistente | Mensaje / RF-09 (M-50) |
| HU-08 CA-3 | Custodio ya inactivo | RN-C12b (C13 fusionada) |
| HU-08 CA-4 | Custodio inexistente | Mensaje / RF-10 (M-50) |
| HU-08 CA-5 | Con asignación vigente | RN-C14a |
| HU-08 CA-5 | Con solicitud pendiente | RN-C14b |
 
*Fuente: elaboración propia a partir de las HU-05 a HU-08 del consolidado. No son rechazo y se verifican aparte: HU-05 CA-5 («mismo número, otro tipo» se acepta: aclara el alcance de RN-C05), HU-06 CA-5 (consulta de un custodio inactivo: C15a), HU-08 CA-2 (desistir: C16) y HU-08 CA-6 (el custodio no se elimina: C12a).*
 
### **B.3 Solicitud (RN-S01 a RN-S21)**
 
Tabla 30. Verificación en reversa de los criterios de aceptación de rechazo (HU-09 a HU-12)
 
| **CA de rechazo** | **Caso** | **Respaldo** |
| --- | --- | --- |
| HU-09 CA-2 | Datos obligatorios vacíos (3 campos) | Restricción del diccionario (S02) |
| HU-09 CA-3 | Motivo de 256 caracteres | Restricción del diccionario (S03) |
| HU-09 CA-4 | Categoría inexistente | Restricción del diccionario (FK; S06) |
| HU-09 CA-4 | Categoría inactiva | RN-S07 |
| HU-09 CA-5 | Custodio inexistente | Restricción del diccionario (FK; S08) |
| HU-09 CA-5 | Custodio inactivo | RN-S09 |
| HU-09 CA-5 | Empleado sin custodio registrado | RN-S10b |
| HU-09 CA-5 | Custodio de otro empleado | RN-S19 (M-272) |
| HU-10 CA-4 | Solicitud no encontrada por identificador | Mensaje / RF-12 (S16b; M-68) |
| HU-10 CA-4 | Custodio sin solicitudes; sin pendientes; sin aprobadas (informativos) | Mensaje / RF-12 (S17b, S18b, S21b; M-66, M-67, M-92) |
| HU-10 CA-5 | Solicitud de otro custodio | RN-S19 (M-69) |
| HU-11 CA-2 | Campos vacíos (2) | Restricción del diccionario (S02) |
| HU-11 CA-2 | Motivo de 256 caracteres | Restricción del diccionario (S03) |
| HU-11 CA-2 | Categoría inexistente | Restricción del diccionario (FK; S06) |
| HU-11 CA-2 | Categoría inactiva | RN-S07 |
| HU-11 CA-3 | Solicitud Aprobada, Rechazada o Cancelada | RN-S11 |
| HU-11 CA-4 | Cambiar ID_Solicitud | Restricción del diccionario (PK sin setter; S01a) y mensaje (M-72) |
| HU-11 CA-4 | Cambiar ID_Custodio, Fecha_Solicitud o Estado_Solicitud | RF-14 (S12) y mensaje (M-70, M-73, M-71) |
| HU-11 CA-5 | Solicitud inexistente | Mensaje / RF-14 (M-74) |
| HU-11 CA-5 | Solicitud de otro custodio | RN-S19 (M-69) |
| HU-12 CA-3 | Solicitud ya cancelada | RN-S14 (M-78) |
| HU-12 CA-3 | Solicitud Aprobada o Rechazada | RN-S14 (M-81) |
| HU-12 CA-4 | Solicitud inexistente | Mensaje / RF-15 (M-74) |
| HU-12 CA-4 | Solicitud de otro custodio | RN-S19 (M-69) |
 
*Fuente: elaboración propia a partir de las HU-09 a HU-12 del consolidado. No son rechazo y se verifican aparte: HU-12 CA-1 (aviso: no se reactiva; segunda parte de S14), HU-12 CA-2 (desistir: S15), HU-12 CA-5 (la solicitud cancelada no se elimina: S13a), HU-10 CA-3 (pendientes: S18a) y HU-10 CA-6 (aprobadas sin asignación: S21a). Ningún CA de rechazo prueba la no reactivación.*
 
### **B.4 Aprobación (RN-AP01 a RN-AP14)**
 
Tabla 31. Verificación en reversa de los criterios de aceptación de rechazo (HU-13 y HU-14)
 
| **CA de rechazo** | **Caso** | **Respaldo** |
| --- | --- | --- |
| HU-13 CA-3 | Rechazada sin motivo | RN-AP02b (M-83) |
| HU-13 CA-3 | Decisión vacía | Restricción del diccionario (NO NULO; AP02a; M-86) |
| HU-13 CA-3 | Decisión «Pendiente» (no válida) | Restricción del diccionario (ENUM; AP03; M-87) |
| HU-13 CA-4 | Motivo de 301 caracteres | Restricción del diccionario (AP04; M-84) |
| HU-13 CA-5 | Solicitud que ya tiene decisión | RN-AP09 y RN-AP06a (M-88; se valida primero); mecanismo: UNIQUE (AP06b) |
| HU-13 CA-6 | Solicitud inexistente | Restricción del diccionario (FK; AP08) y mensaje (M-74) |
| HU-13 CA-6 | Solicitud cancelada | RN-AP09 (M-89; se valida después de «ya tiene decisión») |
| HU-13 CA-7 | Aprobador inexistente | Restricción del diccionario (FK; AP10) |
| HU-13 CA-7 | Aprobador inactivo | RN-AP11a |
| HU-13 CA-7 | Usuario con rol Empleado | RNF candidato (autoridad por rol; AP11b; M-85) |
| HU-13 CA-7 | Otro aprobador distinto del usuario en sesión | RN-AP12a (política) y duplicada con RN-T03 (mecanismo, AP12b; M-273) |
| HU-14 CA-3 | Solicitud sin decisión (pendiente; cancelada) | Mensaje / RF-17 (AP13b; M-90, M-91) |
| HU-14 CA-4 | Solicitud inexistente | Mensaje / RF-17 (AP13b; M-74) |
| HU-14 CA-5 | Decisión de una solicitud de otro custodio | RN-AP14 (M-69) |
 
*Fuente: elaboración propia a partir de HU-13 y HU-14 del consolidado. Precedencia de validación en HU-13: primero «ya tiene decisión» (M-88) y luego «cancelada» (M-89). No son rechazo y se verifican aparte: HU-13 CA-1 y CA-2 (éxitos), HU-13 CA-4 (motivo de 300 caracteres aceptado) y HU-14 CA-1 y CA-2 (consultas: AP13a).*
 
### **B.5 Asignación (RN-AS01 a RN-AS24)**
 
Tabla 32. Verificación en reversa de los criterios de aceptación de rechazo (HU-15 a HU-18)
 
| **CA de rechazo** | **Caso** | **Respaldo** |
| --- | --- | --- |
| HU-15 CA-2 | Datos obligatorios vacíos (3 campos) | Restricción del diccionario (NO NULO; AS02; M-94, M-95, M-96) |
| HU-15 CA-3 | Solicitud inexistente | Restricción del diccionario (FK; AS03) y mensaje (M-74) |
| HU-15 CA-3 | Solicitud pendiente, rechazada o cancelada | RN-AS04 (M-97) |
| HU-15 CA-4 | Solicitud que ya tiene asignación | RN-AS05a (M-98); mecanismo: UNIQUE (AS05b) |
| HU-15 CA-5 | Activo inexistente | Restricción del diccionario (FK; AS06) y mensaje (M-21) |
| HU-15 CA-5 | Activo asignado, dañado o dado de baja | RN-AS07a (M-99) |
| HU-15 CA-6 | Categoría del activo distinta de la solicitud | RN-AS08 (M-100) |
| HU-15 CA-7 | Fecha esperada anterior a la entrega | Restricción del diccionario (coherencia entre fechas; AS09; M-101) |
| HU-16 CA-5 | Sin resultados o no encontrado (6 formas) | Mensaje / RF-19 (AS19b, AS20b, AS21b, AS22b; M-102, M-103, M-104, M-50, M-105, M-21) |
| HU-16 CA-7 | Asignación de otro custodio | RN-AS23a (M-106) |
| HU-17 CA-2 | Fecha esperada vacía | Restricción del diccionario (NO NULO; AS02; M-96) |
| HU-17 CA-2 | Fecha esperada anterior a la entrega | Restricción del diccionario (coherencia entre fechas; AS09; M-101) |
| HU-17 CA-3 | Cambiar ID_Asignacion | Restricción del diccionario (PK sin setter; AS01a) y mensaje (M-109) |
| HU-17 CA-3 | Cambiar Fecha_Entrega, Estado_Asignacion, ID_Custodio, ID_Activo o ID_Solicitud | RF-20 (AS13a) y mensajes (M-110 a M-114) |
| HU-17 CA-4 | Asignación cerrada | RN-AS13b (M-115) |
| HU-17 CA-5 | Asignación inexistente | Mensaje / RF-20 (M-108) |
| HU-18 CA-4 | Sin devolución registrada o devolución pendiente | RN-AS14 (M-119) |
| HU-18 CA-5 | Asignación ya cerrada | RN-AS13b (M-120) |
| HU-18 CA-6 | Asignación inexistente | Mensaje / RF-21 (M-108) |
 
*Fuente: elaboración propia a partir de HU-15 a HU-18 del consolidado. No son rechazo y se verifican aparte: HU-15 CA-1 y HU-17 CA-1 (éxitos), HU-16 CA-1 a CA-4 y CA-6 (consultas; CA-4 muestra que un activo Dañado puede tener asignación vigente), HU-18 CA-1 (cerrar; aviso de no reactivar: AS13b), CA-2 (cerrar con el activo Dañado: AS15c), CA-3 (desistir: AS16) y CA-7 (la cerrada no se elimina ni figura vigente: AS15a y AS20a).*
 
### **B.6 Acta de entrega (RN-AC01 a RN-AC10)**
 
Tabla 33. Verificación en reversa de los criterios de aceptación de rechazo (HU-19 y HU-20)
 
| **CA de rechazo** | **Caso** | **Respaldo** |
| --- | --- | --- |
| HU-19 CA-2 | Datos obligatorios vacíos (3 campos) | Restricción del diccionario (NO NULO; AC02; M-122, M-123, M-125) |
| HU-19 CA-3 | Ruta_Acta o Firma_Digital de 256 caracteres | Restricción del diccionario (AC03; M-124, M-126) |
| HU-19 CA-4 | Asignación inexistente | Restricción del diccionario (FK; AC04) y mensaje (M-108) |
| HU-19 CA-4 | Asignación cerrada | RN-AC05 (M-127) |
| HU-19 CA-5 | Asignación que ya tiene acta | RN-AC06a (M-128); mecanismo: UNIQUE (AC06b) |
| HU-19 CA-6 | Acta de la asignación de otro custodio | RN-AC07b (M-129) |
| HU-20 CA-3 | Asignación sin acta (informativo) | Mensaje / RF-23 (AC09b; M-130) |
| HU-20 CA-4 | Asignación inexistente | Mensaje / RF-23 (AC09b; M-108) |
| HU-20 CA-5 | Acta de la asignación de otro custodio | RN-AC10 (M-131) |
 
*Fuente: elaboración propia a partir de HU-19 y HU-20 del consolidado. No son rechazo y se verifican aparte: HU-19 CA-1 (éxito; la asignación conserva Vigente), HU-19 CA-3 (255 caracteres aceptados) y HU-20 CA-1 y CA-2 (consultas: AC09a; la consulta no modifica el acta). Ningún CA intenta modificar un acta ya firmada ni prueba que toda entrega tenga acta (RN-AC07a).*
 
### **B.7 Devolución (RN-D01 a RN-D21)**
 
Tabla 34. Verificación en reversa de los criterios de aceptación de rechazo (HU-21 a HU-24)
 
| **CA de rechazo** | **Caso** | **Respaldo** |
| --- | --- | --- |
| HU-21 CA-3 | ID_Asignacion vacío | Restricción del diccionario (NO NULO; D02; M-122) |
| HU-21 CA-4 | Observaciones de 256 caracteres | Restricción del diccionario (D03; M-133) |
| HU-21 CA-5 | Asignación inexistente | Restricción del diccionario (FK; D04) y mensaje (M-108) |
| HU-21 CA-5 | Asignación cerrada | RN-D05 (M-134) |
| HU-21 CA-6 | Asignación que ya tiene devolución | RN-D06a (M-135); mecanismo: UNIQUE (D06b) |
| HU-21 CA-7 | Devolución de la asignación de otro custodio | RN-D07b (M-136) |
| HU-22 CA-3 | Devolución no encontrada | Mensaje / RF-25 (D18b; M-137) |
| HU-22 CA-5 | Sin pendientes de recepción (informativo) | Mensaje / RF-25 (D19b; M-138) |
| HU-22 CA-7 | Devolución de otro custodio | RN-D07b (M-139) |
| HU-23 CA-3 | Observaciones de 256 caracteres | Restricción del diccionario (D03; M-133) |
| HU-23 CA-4 | Cambiar ID_Devolucion | Restricción del diccionario (PK sin setter; D01a; M-142) |
| HU-23 CA-4 | Cambiar Fecha_Devolucion, ID_Asignacion, Estado_Recepcion, Fecha_Confirmacion o ID_Receptor | RF-26 (D11a) y mensajes (M-143 a M-147) |
| HU-23 CA-5 | Devolución confirmada | RN-D11b (M-148) |
| HU-23 CA-6 | Devolución inexistente | Mensaje / RF-26 (D18b; M-141) |
| HU-23 CA-7 | Devolución de otro custodio | RN-D07b (M-149) |
| HU-24 CA-4 | Devolución ya confirmada | RN-D11b (M-153) |
| HU-24 CA-5 | Devolución inexistente | Mensaje / RF-27 (D18b; M-141) |
| HU-24 CA-6 | Receptor inexistente | Restricción del diccionario (FK; D14a; M-40) |
| HU-24 CA-6 | Receptor inactivo | RN-D14b (M-39) |
| HU-24 CA-6 | Usuario sin el rol Responsable de Activos | RNF candidato (autoridad por rol; D14c; M-154) |
 
*Fuente: elaboración propia a partir de HU-21 a HU-24 del consolidado. No son rechazo y se verifican aparte: HU-21 CA-1, CA-2 y CA-4 (255 caracteres aceptados), HU-22 CA-1, CA-2, CA-4 y CA-6 (consultas; CA-6 es la consulta de las propias, D19a y D07b), HU-23 CA-1 a CA-3, HU-24 CA-1 (confirmar: D13a y D15), CA-2 (activo Dañado conserva Dañado: D15 y AS15c), CA-3 (desistir: D16) y CA-7 (flujo normal: cierra la asignación; AS14 y AS15).*
 
### **B.8 Notificación de devolución (RN-N01 a RN-N10)**
 
**Tabla 35. Verificación en reversa de los criterios de aceptación de rechazo (HU-25)**
 
| **CA de rechazo** | **Caso** | **Respaldo** |
| --- | --- | --- |
| HU-25 CA-4 | Asignación cerrada: sin aviso | RN-N05 (M-155) |
| HU-25 CA-5 | Asignación inexistente | Restricción del diccionario (FK; N02) y mensaje (M-108) |
 
*Fuente: elaboración propia a partir de HU-25 del consolidado. No son rechazo y se verifican aparte: CA-1 (flujo normal: N01, N02, N04, N05 y el destinatario como parte de RF-28), CA-2 (cálculo de Dias_Restantes: N04; plazo sin definir en N08), CA-3 (plazo vencido: N07a y PRO-06) y CA-6 (más de un aviso por asignación: N03a y N01).*
 
### **B.9 Reporte de daños (RN-RD01 a RN-RD19)**
 
**Tabla 36. Verificación en reversa de los criterios de aceptación de rechazo (HU-26 a HU-28)**
 
| **CA de rechazo** | **Caso** | **Destino** |
| --- | --- | --- |
| HU-26 CA-3 | Obligatorios vacíos | Restricción del diccionario (RD02); M-95, M-161, M-164 |
| HU-26 CA-4 | Longitud superada | Restricción del diccionario (RD03a); M-162, M-163 |
| HU-26 CA-5 | Tipo fuera del ENUM | Restricción del diccionario (RD04); M-165 |
| HU-26 CA-6 | Activo inexistente | Restricción del diccionario (RD05); M-21 |
| HU-26 CA-6 | Activo de otro custodio | RN-RD07a; M-166 |
| HU-26 CA-6 | Sin asignación vigente | RN-RD07a; M-167 |
| HU-26 CA-6 | Activo en baja | RN-A18 (RD08 fusionada) y también RN-RD07a; M-168 |
| HU-27 CA-2 | Reporte no encontrado | RF candidato y mensaje (RD11); M-169 |
| HU-27 CA-6 | Reporte de otro custodio | RN-RD07b; M-171 |
| HU-28 CA-2 | Obligatorios vacíos o fuera del ENUM | Restricción del diccionario (RD02, RD04); M-161, M-164, M-165 |
| HU-28 CA-3 | Longitud superada | Restricción del diccionario (RD03a); M-162, M-163 |
| HU-28 CA-4 | Campos que no se modifican | RF candidato (RD14) y PK sin setter (RD01a); M-174 a M-177 |
| HU-28 CA-5 | Reporte con mantenimiento asociado | RN-RD15; M-178 |
| HU-28 CA-6 | Reporte inexistente | RF candidato (RD11); M-173 |
| HU-28 CA-7 | Actualiza un reporte ajeno | RN-RD07b; M-179 |
 
*Fuente: elaboración propia a partir de HU-26 a HU-28 del consolidado. No son rechazo y se verifican aparte: HU-26 CA-1, CA-2 y CA-7; HU-27 CA-1, CA-3, CA-4 y CA-5; HU-28 CA-1.*
 
### **B.10 Historial de mantenimientos (RN-H01 a RN-H18)**
 
**Tabla 37. Verificación en reversa de los criterios de aceptación de rechazo (HU-29 a HU-31)**
 
| **CA de rechazo** | **Caso** | **Destino** |
| --- | --- | --- |
| HU-29 CA-3 | Obligatorios vacíos | Restricción del diccionario (H02); M-95, M-181, M-183, M-185 |
| HU-29 CA-4 | Longitud superada | Restricción del diccionario (H03); M-163, M-184 |
| HU-29 CA-5 | Tipo, costo o fecha no válidos | Restricción del diccionario (H04, H10, H11); M-182, M-186 a M-188 |
| HU-29 CA-6 | Activo inexistente | Restricción del diccionario (H05); M-21 |
| HU-29 CA-6 | Reporte inexistente | Restricción del diccionario (H06); M-173 |
| HU-29 CA-6 | Reporte de otro activo | RN-H07; M-189 |
| HU-29 CA-6 | Activo en baja | RN-A18 (H08 fusionada); M-190 |
| HU-29 CA-7 | Técnico inexistente | Restricción del diccionario (H09b); M-40 |
| HU-29 CA-7 | Técnico inactivo | RN-H09c; M-39 |
| HU-29 CA-7 | Sin el rol Técnico de Soporte | RNF candidato (H09d); M-191 |
| HU-30 CA-2 | Mantenimiento no encontrado | RF candidato y mensaje (H14); M-192 |
| HU-30 CA-5 | Historial de un activo inexistente | RF candidato y mensaje (H15b); M-21 |
| HU-31 CA-2 | Descripción obligatoria | Restricción del diccionario (H02); M-183 |
| HU-31 CA-3 | Longitud y valores del costo | Restricción del diccionario (H03, H10); M-163, M-184, M-187, M-188 |
| HU-31 CA-4 | Campos que no se modifican | RF candidato (H17) y PK sin setter (H01a); M-196 a M-201 |
| HU-31 CA-5 | Mantenimiento inexistente | RF candidato y mensaje (H14); M-195 |
 
*Fuente: elaboración propia a partir de HU-29 a HU-31 del consolidado. No son rechazo y se verifican aparte: HU-29 CA-1 y CA-2; HU-30 CA-1, CA-3 y CA-4; HU-31 CA-1.*
 
### **B.11 Usuario (RN-U01 a RN-U23)**
 
**Tabla 38. Verificación en reversa de los criterios de aceptación de rechazo (HU-32 a HU-37)**
 
| **CA de rechazo** | **Caso** | **Destino** |
| --- | --- | --- |
| HU-32 CA-2, HU-34 CA-2 | Obligatorios vacíos | Restricción del diccionario (U02); M-203 a M-207 |
| HU-32 CA-3, HU-34 CA-3 | Longitud superada | Restricción del diccionario (U03a); M-208 a M-210 |
| HU-32 CA-4, HU-34 CA-5 | Correo ya registrado | RN-U04; M-211 |
| HU-32 CA-5, HU-34 CA-4 | Formato de correo | Restricción del diccionario (U05); M-212 |
| HU-32 CA-6, HU-34 CA-4 | Rol fuera del ENUM | Restricción del diccionario (U06); M-213 |
| HU-33 CA-3 | La consulta no muestra la contraseña | RNF candidato (U09b) |
| HU-33 CA-5 | Usuario no encontrado o correo vacío | Mockup / mensaje (U09c); M-205, M-214, M-215 |
| HU-34 CA-6 | Datos que no se modifican | RF candidato (U10) y PK sin setter (U01a); M-217 a M-219 |
| HU-34 CA-7 | Usuario inactivo o inexistente | RN-U12b (U11 fusionada) y mensaje (U09c) |
| HU-35 CA-3 | Usuario ya inactivo | RN-U12b (U13 fusionada); M-223 |
| HU-35 CA-4 | Usuario inexistente | Mockup / mensaje (U09c) |
| HU-35 CA-5 | Custodio activo | RN-U15a; M-226 |
| HU-35 CA-5 | Asignaciones vigentes y solicitudes pendientes | RN-C14a y RN-C14b (U15b fusionada); M-224, M-225 |
| HU-35 CA-5 | Único aprobador con pendientes | RN-U16; M-227 |
| HU-35 CA-6 | Auto-inactivación | Propuesta transversal de segregación (PRO-02; instancia U17); M-228 |
| HU-36 CA-3 | Credenciales inválidas | RNF candidato (U19); M-230 |
| HU-36 CA-4 | Usuario inactivo | RN-U20a; mensaje solo con credenciales correctas: RNF (U20b); M-39 |
| HU-36 CA-5 | Datos obligatorios vacíos | Mockup / mensaje (U18b); M-205, M-206 |
| HU-37 CA-2 | Contraseña actual incorrecta | RF candidato (U21a); M-232 |
| HU-37 CA-3 | Nueva igual a la actual | RNF candidato (U21b); M-233 |
| HU-37 CA-4 | Contraseñas vacías | Mockup / mensaje (U21c); M-234, M-235 |
| HU-37 CA-5 | Solo la contraseña propia | RN-U22; M-236 |
| HU-37 CA-6 | Usuario inexistente | Mockup / mensaje (U09c) |
 
*Fuente: elaboración propia. No son rechazo: HU-32 CA-1; HU-33 CA-1, CA-2 y CA-4; HU-34 CA-1; HU-35 CA-1, CA-2 y CA-7; HU-36 CA-1 y CA-2; HU-37 CA-1.*
 
### **B.12 Rol_Permiso (RN-RP01 a RN-RP12)**
 
**Tabla 39. Verificación en reversa de los criterios de aceptación de rechazo (HU-38 a HU-40)**
 
| **CA de rechazo** | **Caso** | **Destino** |
| --- | --- | --- |
| HU-38 CA-2 | Rol o permiso vacío | Restricción del diccionario (RP02); M-207, M-238 |
| HU-38 CA-3 | La pareja ya existe | Restricción del diccionario (RP05; PK compuesta, mecanismo de RP01); M-240 |
| HU-38 CA-4 | Rol o permiso fuera de la enumeración | Restricción del diccionario (RP03, RP04); M-213, M-239 |
| HU-39 CA-3 | Asignación inexistente | RF candidato (RP07); M-244 |
| HU-39 CA-4 | Rol o permiso vacío o fuera de la enumeración | Restricción del diccionario (RP02 a RP04); M-207, M-213, M-238, M-239 |
| HU-40 CA-4 | Rol vacío o fuera de la enumeración | Restricción del diccionario (RP02, RP03); M-207, M-213 |
 
*Fuente: elaboración propia. No son rechazo: HU-38 CA-1, CA-5 y CA-6; HU-39 CA-1, CA-2 y CA-5; HU-40 CA-1, CA-2, CA-3 y CA-5.*
 
### **B.13 Categoría (RN-CA01 a RN-CA14)**
 
**Tabla 40. Verificación en reversa de los criterios de aceptación de rechazo (HU-41 a HU-44)**
 
| **CA de rechazo** | **Caso** | **Destino** |
| --- | --- | --- |
| HU-41 CA-2 | Nombre vacío | Restricción del diccionario (CA02); M-247 |
| HU-41 CA-3 | Longitud superada | Restricción del diccionario (CA03); M-248 |
| HU-41 CA-4 | Nombre que ya existe | RN-CA04; M-249 |
| HU-42 CA-4 | Categoría inexistente | Mockup / mensaje (CA06b); M-250 |
| HU-43 CA-2 | Nombre vacío y longitud | Restricción del diccionario (CA02, CA03); M-247, M-248 |
| HU-43 CA-3 | Nombre único sin contar a la propia | RN-CA04; M-249 |
| HU-43 CA-4 | Categoría inactiva | RN-CA09b (CA08 fusionada); M-256 |
| HU-43 CA-5 | Datos que no se modifican | RF candidato (CA07) y PK sin setter (CA01a); M-254, M-255 |
| HU-43 CA-6 | Categoría inexistente | Mockup / mensaje (CA06b); M-253 |
| HU-44 CA-3 | Categoría ya inactiva | RN-CA09b (CA10 fusionada); M-260 |
| HU-44 CA-4 | Categoría inexistente | Mockup / mensaje (CA06b); M-253 |
| HU-44 CA-5 | Activos sin dar de baja | RN-CA12a; M-261 |
| HU-44 CA-5 | Solicitudes pendientes | RN-CA12b; M-262 |
| HU-44 CA-6 | La categoría inactiva no admite activos ni solicitudes nuevos | RN-A09 y RN-S07 (CA13 fusionada) |
 
*Fuente: elaboración propia. No son rechazo: HU-41 CA-1 y CA-5; HU-42 CA-1, CA-2, CA-3, CA-5 y CA-6; HU-43 CA-1; HU-44 CA-1, CA-2 y CA-7.*
 
### **B.14 Auditoría (RN-AU01 a RN-AU17)**
 
**Tabla 41. Verificación en reversa de los criterios de aceptación de rechazo (HU-45)**
 
| **CA de rechazo** | **Caso** | **Destino** |
| --- | --- | --- |
| HU-45 CA-3 | Registro no encontrado | RF candidato y mensaje (AU13b); M-263 |
| HU-45 CA-4 | Identificador no válido | Restricción del diccionario (AU14); M-264 |
| HU-45 CA-7 | Actor sin permiso | RNF candidato (AU15); M-265 |
 
*Fuente: elaboración propia. No son rechazo: HU-45 CA-1, CA-2, CA-5 (AU06) y CA-6 (AU04a y AU16).*
 
### **B.15 Reportes (vista) (RN-R01 a RN-R16)**
 
**Tabla 42. Verificación en reversa de los criterios de aceptación de rechazo (HU-46)**
 
| **CA de rechazo** | **Caso** | **Destino** |
| --- | --- | --- |
| HU-46 CA-2 | Fecha_Inicio vacía | Restricción del diccionario (R02); M-266 |
| HU-46 CA-4 | Fecha_Fin anterior a Fecha_Inicio | Restricción del diccionario (R05; MOD-40); M-267 |
| HU-46 CA-5 | Tipo vacío o fuera del ENUM | Restricción del diccionario (R02, R03); M-268, M-269 |
| HU-46 CA-7 | Actor sin permiso | RNF candidato (R14); M-271 |
 
*Fuente: elaboración propia. No son rechazo: HU-46 CA-1, CA-3 (R04, pregunta) y CA-6 (R12; M-270).*
 
## **Anexo C. Matriz rol–operación**
 
Anexo de requisitos no funcionales de autoridad por rol (decisión T-5), pendiente de validar con el cliente (P-74 a P-77, P-88). Tiene una fila por cada método público del UML (61 del UML v6 y Solicitud.listarAprobadas() de la adenda CRF-003, 62 en total) y una fila para el cambio de responsable, que no tiene método (63 filas). Cubre las HU-01 a HU-46; los 14 métodos INTERNO no llevan actor. Donde la operación no tiene un actor o un rol claro se escribe «por definir» con su pregunta.
 
**Tabla 43. Matriz rol–operación**
 
| **HU** | **Operación (método)** | **Actor de la HU** | **Rol(es) que la ejecutan según el diseño actual** | **Permiso genérico más cercano** | **RN asociada** | **Fuente** |
| --- | --- | --- | --- | --- | --- | --- |
| HU-01 | Activo.crear() | Responsable de Activos | Responsable de Activos (según la HU; sin ítem TRA propio) | Crear | — | P-75 |
| HU-02 | Activo.buscarPorId() | Responsable de Activos | Responsable de Activos (según la HU; sin ítem TRA propio) | Consultar | — | P-75 |
| HU-02 | Activo.buscarPorNumeroSerie() | Responsable de Activos | Responsable de Activos (según la HU; sin ítem TRA propio) | Consultar | — | P-75 |
| HU-02 | Activo.buscarPorPlaca() | Responsable de Activos | Responsable de Activos (según la HU; sin ítem TRA propio) | Consultar | — | P-75 |
| HU-02 | Activo.listarInventario() | Responsable de Activos | Responsable de Activos (según la HU; sin ítem TRA propio) | Consultar | — | P-75 |
| HU-03 | Activo.actualizar() | Responsable de Activos | Responsable de Activos (según la HU; sin ítem TRA propio) | Actualizar | — | P-75 |
| HU-04 | Activo.darDeBaja() | Responsable de Activos | Responsable de Activos (según la HU; sin ítem TRA propio) | Inactivar (compartido con cancelar y cerrar) | — | P-75; MOD-39 |
| HU-05 | Custodio.crear() | Responsable de Activos | Responsable de Activos (TRA-01; supuesto) | Crear | — | TRA-01; P-09, P-17 |
| HU-06 | Custodio.buscarPorId() | Responsable de Activos | Responsable de Activos (TRA-01; supuesto) | Consultar | — | TRA-01; P-09, P-17 |
| HU-06 | Custodio.buscarPorUsuario() | Responsable de Activos | Responsable de Activos (TRA-01; supuesto) | Consultar | — | TRA-01; P-09, P-17 |
| HU-06 | Custodio.buscarPorDocumento() | Responsable de Activos | Responsable de Activos (TRA-01; supuesto) | Consultar | — | TRA-01; P-09, P-17 |
| HU-07 | Custodio.actualizar() | Responsable de Activos | Responsable de Activos (TRA-01; supuesto) | Actualizar | — | TRA-01; P-09, P-17 |
| HU-08 | Custodio.inactivar() | Responsable de Activos | Responsable de Activos (TRA-01; supuesto) | Inactivar | — | TRA-01; P-09, P-17 |
| HU-09 | Solicitud.crear() | Empleado | Empleado con sesión iniciada (TRA-02) | Crear | RN-S19 | TRA-02 |
| HU-10 | Solicitud.buscarPorId() | Empleado | Empleado, las suyas; Aprobador, las pendientes (TRA-03) | Consultar | RN-S19 | TRA-02, TRA-03 |
| HU-10 | Solicitud.listarPorCustodio() | Empleado | Empleado, las suyas (TRA-02) | Consultar | RN-S19 | TRA-02 |
| HU-10 | Solicitud.listarPendientes() | Empleado | Aprobador (TRA-03); Responsable de Activos: por definir | Consultar | — | TRA-03; P-27 |
| HU-10 | Solicitud.listarAprobadas() (CRF-003) | Empleado | Responsable de Activos (TRA-04) | Consultar | — | TRA-04; P-27 |
| HU-11 | Solicitud.actualizar() | Empleado | Empleado (TRA-02) | Actualizar | RN-S19 | TRA-02 |
| HU-12 | Solicitud.cancelar() | Empleado | Empleado (TRA-02) | Inactivar (compartido con darDeBaja y cerrar) | RN-S19 | TRA-02; MOD-39 |
| HU-13 | Aprobacion.decidir() | Aprobador | Aprobador (TRA-06) | Aprobar (rechazar no tiene permiso propio) | — (atribución: RN-AP12a) | TRA-06; P-RP1 |
| HU-14 | Aprobacion.buscarPorSolicitud() | Empleado | Empleado, la decisión de su solicitud; otros roles: por definir | Consultar | RN-AP14 | P-74 |
| HU-15 | Asignacion.asignar() | Responsable de Activos | Responsable de Activos (TRA-07) | Asignar | — | TRA-07; P-28 |
| HU-16 | Asignacion.buscarPorId() | Responsable de Activos | Responsable de Activos (TRA-07); Empleado, solo las suyas | Consultar | RN-AS23a | TRA-07 |
| HU-16 | Asignacion.listarVigentes() | Responsable de Activos | Responsable de Activos (TRA-07) | Consultar | — | TRA-07 |
| HU-16 | Asignacion.listarPorCustodio() | Responsable de Activos | Responsable de Activos (TRA-07); Empleado, solo las suyas | Consultar | RN-AS23a | TRA-07 |
| HU-16 | Asignacion.buscarVigentePorActivo() | Responsable de Activos | Responsable de Activos (TRA-07) | Consultar | — | TRA-07 |
| HU-17 | Asignacion.actualizar() | Responsable de Activos | Responsable de Activos (TRA-07) | Actualizar | — | TRA-07; P-31 |
| HU-18 | Asignacion.cerrar() | Responsable de Activos | Responsable de Activos (TRA-07) | Inactivar (compartido con darDeBaja y cancelar) | — | TRA-07; MOD-39 |
| HU-19 | Acta_De_Entrega.firmar() | Empleado | Empleado, el custodio de la asignación | Sin permiso equivalente (más cercano: Crear) | RN-AC07b | TRA-09; P-91 |
| HU-20 | Acta_De_Entrega.buscarPorAsignacion() | Empleado | Empleado, la suya; Responsable de Activos y Gerente: por definir (TRA-08) | Consultar | RN-AC10 | TRA-08; P-40 |
| HU-21 | Devolucion.registrar() | Empleado | Empleado (TRA-10) | Devolver | RN-D07b | TRA-10; P-42 |
| HU-22 | Devolucion.buscarPorId() | Responsable de Activos | Responsable de Activos (TRA-10); Empleado, solo las suyas | Consultar | RN-D07b | TRA-10 |
| HU-22 | Devolucion.listarPendientesDeRecepcion() | Responsable de Activos | Responsable de Activos (TRA-10) | Consultar | — | TRA-10 |
| HU-23 | Devolucion.actualizar() | Empleado | Empleado (TRA-10) | Actualizar | RN-D07b | TRA-10 |
| HU-24 | Devolucion.confirmarRecepcion() | Responsable de Activos | Responsable de Activos (TRA-11) | Sin permiso equivalente (más cercano: Devolver) | — | TRA-11; MOD-34 |
| HU-25 | Notificacion_De_Devolucion.generarAviso() | Empleado (destinatario) | Ningún rol: proceso automático del sistema | Notificar (sin actor humano) | — | TRA-13; P-N3, P-RP2 |
| HU-26 | Reporte_de_Danios.crear() | Empleado | Empleado (TRA-14) | Reportar o Crear (ambiguo) | RN-RD07a | TRA-14; P-RP2 |
| HU-27 | Reporte_de_Danios.buscarPorId() | Técnico de Soporte | Técnico de Soporte, todos (TRA-14); Empleado, solo los suyos | Consultar | RN-RD07b | TRA-14; P-55 |
| HU-27 | Reporte_de_Danios.listarReportes() | Técnico de Soporte | Técnico de Soporte, todos (TRA-14); Empleado, solo los suyos | Consultar | RN-RD07b | TRA-14; P-55 |
| HU-28 | Reporte_de_Danios.actualizar() | Empleado | Empleado (TRA-14) | Actualizar | RN-RD07b | TRA-14; P-RD2 |
| HU-29 | Historial_Mantenimientos.crear() | Técnico de Soporte | Técnico de Soporte (TRA-16) | Crear | — | TRA-16 |
| HU-30 | Historial_Mantenimientos.buscarPorId() | Técnico de Soporte | Técnico de Soporte (TRA-16); otros roles: por definir | Consultar | — | TRA-16; P-57 |
| HU-30 | Historial_Mantenimientos.listarPorActivo() | Técnico de Soporte | Técnico de Soporte (TRA-16); otros roles: por definir | Consultar | — | TRA-16; P-57 |
| HU-31 | Historial_Mantenimientos.actualizar() | Técnico de Soporte | Técnico de Soporte (TRA-16); si solo quien lo registró: por definir | Actualizar | — | TRA-16; P-57 |
| HU-32 | Usuario.crear() | Responsable de Activos | Responsable de Activos (TRA-19) | Crear | — | TRA-19; P-60 |
| HU-33 | Usuario.buscarPorId() | Responsable de Activos | Responsable de Activos (TRA-19) | Consultar | — | TRA-19; P-60 |
| HU-33 | Usuario.buscarPorEmail() | Responsable de Activos | Responsable de Activos (TRA-19) | Consultar | — | TRA-19; P-60 |
| HU-34 | Usuario.actualizar() | Responsable de Activos | Responsable de Activos (TRA-19) | Actualizar | — | TRA-19; P-64 |
| HU-35 | Usuario.inactivar() | Responsable de Activos | Responsable de Activos (TRA-19) | Inactivar | — | TRA-19; PRO-02 (no el propio usuario; P-68) |
| HU-36 | Usuario.iniciarSesion() | Empleado | Cualquier usuario activo (TRA-19) | Sin permiso equivalente | — | TRA-19; P-92 |
| HU-37 | Usuario.cambiarContrasena() | Empleado | Cualquier usuario, la propia (TRA-19) | Sin permiso equivalente (más cercano: Actualizar) | RN-U22 | TRA-19; P-92 |
| HU-38 | Rol_Permiso.asignar() | Responsable de Activos | Responsable de Activos (TRA-24) | Sin permiso equivalente (más cercano: Crear) | — | TRA-24; P-74, P-94 |
| HU-39 | Rol_Permiso.retirar() | Responsable de Activos | Responsable de Activos (TRA-24) | Sin permiso equivalente (más cercano: Inactivar) | — | TRA-24; P-79, P-80 |
| HU-40 | Rol_Permiso.consultarPermisos() | Responsable de Activos | Responsable de Activos (TRA-24) | Consultar | — | TRA-24 |
| HU-41 | Categoria.crear() | Responsable de Activos | Responsable de Activos (TRA-25) | Crear | — | TRA-25; P-87 |
| HU-42 | Categoria.buscarPorId() | Responsable de Activos | Responsable de Activos (TRA-25) | Consultar | — | TRA-25; P-87 |
| HU-42 | Categoria.listarActivas() | Responsable de Activos | Responsable de Activos y Empleado, las activas (TRA-25) | Consultar | — | TRA-25; P-87 |
| HU-43 | Categoria.actualizar() | Responsable de Activos | Responsable de Activos (TRA-25) | Actualizar | — | TRA-25; P-87 |
| HU-44 | Categoria.inactivar() | Responsable de Activos | Responsable de Activos (TRA-25) | Inactivar | — | TRA-25; P-87 |
| HU-45 | Auditoria.buscarPorId() | Gerente | Gerente (RN-AU15) | Consultar | — | P-88; MOD-13 |
| HU-46 | Reportes.consultar() | Gerente | Gerente; Responsable de Activos: por definir (TRA-27) | Reportar | — | TRA-27; P-88 |
| — | Cambio de responsable (sin método) | Por definir | Por definir | Sin permiso equivalente | — | MOD-09; P-16, P-31 |
 
*Fuente: elaboración propia a partir de las HU-01 a HU-46, el UML v6 (más CRF-003), Nombre_Permiso y los ítems TRA-01 a TRA-27 de las listas acumuladas. Pendiente de validar con el cliente.*
 
**Tabla 44. Operaciones sin permiso equivalente o con permiso ambiguo**
 
| **Operación** | **Permiso más cercano** | **Problema** | **Cambio de modelo (lista 4)** |
| --- | --- | --- | --- |
| Acta_De_Entrega.firmar() | Crear (más cercano) | No existe un permiso «Firmar» | MOD-11, MOD-34 (P-91) |
| Devolucion.confirmarRecepcion() | Devolver (más cercano) | «Devolver» no distingue registrar de confirmar | MOD-34 (P-RP2) |
| Usuario.iniciarSesion() | Ninguno | No es un permiso por rol; no tiene valor de Accion | MOD-31 (P-92) |
| Usuario.cambiarContrasena() | Actualizar (más cercano) | Se audita con Actualizar sin valor propio | MOD-31 (P-92) |
| Rol_Permiso.asignar() | Crear (más cercano) | «Asignar» está reservado a la asignación de equipos | MOD-34 (P-94) |
| Rol_Permiso.retirar() | Inactivar (más cercano) | No existe permiso ni valor de Accion para retirar | MOD-34, MOD-35 (P-79, P-93) |
| Cambio de responsable | Ninguno | No existe operación ni valor de Accion | MOD-09 (P-16, P-31) |
| Aprobacion.decidir() (permiso ambiguo) | Aprobar | ¿Cubre también rechazar? Accion sí tiene Rechazar | MOD-34 (P-RP1) |
| Reporte_de_Danios.crear() (permiso ambiguo) | Reportar o Crear | «Reportar» también audita la consulta de reportes | MOD-34 (P-RP2) |
| Notificacion_De_Devolucion.generarAviso() (sin actor) | Notificar | El aviso es automático: ningún rol lo ejerce | MOD-24, MOD-33 (P-RP2) |
 
*Fuente: elaboración propia. De las 63 operaciones, 56 tienen un permiso genérico (3 de ellas con ambigüedad: decidir, crear un reporte de daño y generar el aviso) y 7 no tienen permiso equivalente. Insumo para MOD-33 y MOD-34.*
 
## **Anexo D. Propuestas de regla nueva**
 
Propuestas vivas (decisión T-7). Ninguna es RN: todas esperan la confirmación del cliente. Quedan fuera PRO-03 (absorbida en RN-AC07a), PRO-05 (unificada en PRO-02) y PRO-09 (retirada, fundida en PRO-02).
 
**Tabla 45. Propuestas de regla nueva vivas**
 
| **Código** | **Propuesta** | **Fuente** | **Pregunta asociada** |
| --- | --- | --- | --- |
| PRO-01 | «No se asigna un equipo a un custodio inactivo». | RN-S09 y RN-C08a (ninguna RN exige un custodio activo al asignar) | P-35 |
| PRO-02 | «Quien solicita, devuelve o registra no decide ni confirma lo propio». Instancias: un aprobador no decide solicitudes propias (B2b), quien devuelve no confirma su devolución (B4b-1) y un usuario no inactiva su propio usuario (B6a; RN-U17, única instancia con RF vigilante, RF-39). | Criterio 5 de la clasificación; HU-13, HU-24 y HU-35 CA-6 | P-SF1 (con P-23, P-42 y P-68) |
| PRO-04 | «Un acta firmada es definitiva: no se modifica ni se elimina». | Ausencia de operación de actualizar en el UML; ningún CA la verifica | P-AC1 |
| PRO-06 | «Se sigue avisando la devolución de un equipo después de vencido el plazo». | RN-N07 (parte N07b) | P-45 (relacionada con P-43) |
| PRO-07 | «No se avisa la devolución de una asignación cuya devolución ya está registrada y pendiente de confirmar». | P-46 y RN-AS14 | P-46 |
| PRO-08 | «No se cambia el rol de un usuario que tiene un custodio activo». | RN-C08b (solo verifica al registrar al custodio) y P-64 | P-64 y P-C2 |
| PRO-10 | «No se retira el permiso que le permite al Responsable de Activos otorgar y retirar permisos». | P-80 y la nota de HU-39 | P-80 |
 
*Fuente: elaboración propia a partir de la lista 3 de las listas acumuladas.*
 
## **Anexo E. Notas de alcance y tensión entre la encuesta y el alcance**
 
Las notas de alcance no son reglas de negocio. NAL-01 a NAL-06 recogen lo que el Alcance 1.2 deja fuera o fija como límite.
 
**Tabla 46. Notas de alcance (no son RN)**
 
| **Código** | **Nota** |
| --- | --- |
| NAL-01 | RN-N10: el único aviso automático por correo es el de próximas devoluciones; no hay otros (aprobación o rechazo, equipo listo para recoger, reporte de daño). Es un límite de alcance del Alcance 1.2, no una regla de negocio. |
| NAL-02 | Tensión entre la encuesta y el alcance (se detalla en la Tabla 47). |
| NAL-03 | Reporte de daño: el reporte no avisa al Técnico de Soporte (el aviso por reporte de daño es trabajo futuro en 1.2); el Técnico consulta (HU-27) y no sabe cuáles reportes están sin atender (P-53). Refuerza NAL-02. |
| NAL-04 | RN-H13: solo registro simple de mantenimientos, sin programación ni recordatorios; el mantenimiento preventivo avanzado está fuera del alcance (Alcance 1.2; P-59). |
| NAL-05 | Tensión de alcance en mantenimiento: las alertas preventivas fueron pedidas por 7 de 19 (N-09) y están fuera del alcance, mientras que el valor Preventivo se conserva solo como registro. |
| NAL-06 | Reportes: solo bajo demanda (Alcance 1.2). Los reportes programados y la exportación no figuran en el Alcance ni en el consolidado; confirmar con el cliente. |
 
*Fuente: elaboración propia a partir del Alcance 1.2 y de los bloques de entidad.*
 
**Tabla 47. Tensión entre la encuesta y el alcance**
 
| **Tema** | **Cifras de la encuesta (19 respuestas)** | **Situación** | **Fundamento** |
| --- | --- | --- | --- |
| Notificar a TI | 5 + 7 de «todas» = 12 de 19 (pregunta 14) | Fuera de alcance | Alcance 1.2: única notificación en alcance (NAL-01); el aviso por reporte de daño es trabajo futuro (NAL-03) |
| Cambio automático de responsable | 5 + 7 de «todas» = 12 de 19 (pregunta 14) | Fuera de alcance | No existe operación en el modelo (MOD-09; P-31) |
| Alertas preventivas | 7 de 19 (pregunta 7; N-09) | Fuera de alcance | Mantenimiento preventivo avanzado fuera del alcance (NAL-04, NAL-05) |
| Aviso de próxima devolución | 0 de 19: la pregunta 14 no lo ofrece | En alcance | Alcance 1.2 (HU-25); es el único aviso en alcance (P-48) |
| Acta digital firmada | 2 de 19 + 7 de «todas» (pregunta 14) | En alcance | HU-19 (firma del acta) |
| Solicitud fácil de daño | 3 de 19 (pregunta 7) | En alcance | HU-26 (reportar daño) |
| Historial de reparaciones | 8 de 19 (pregunta 7) | En alcance | HU-30 (consultar el historial de mantenimiento) |
 
*Fuente: elaboración propia a partir de 1.7 (preguntas 7 y 14), el Alcance 1.2 y NAL-01 a NAL-06. La decisión T-11 (mantener la tensión fuera de alcance como «trabajo futuro») es provisional, sujeta a validación del docente.*
 
## **Anexo F. Cuestionario priorizado para el cliente**
 
La Tabla 48 agrupa en diez temas las preguntas prioritarias para el cliente (decisión T-14). Las preguntas P-01 a P-105 son las del consolidado; las que llevan un código con letras (P-A1, P-C1, etc.) son provisionales de los bloques.
 
**Tabla 48. Preguntas prioritarias para el cliente**
 
| **#** | **Tema** | **Preguntas** |
| --- | --- | --- |
| 1 | Equipos no devueltos o personas que se van | P-A3, P-C3, P-13, P-C1, P-35 |
| 2 | Devolución, cierre y equipo recibido dañado | P-32, P-33, P-34, P-47, P-51 |
| 3 | Acta | P-41, P-AC1, P-38, P-39 |
| 4 | Roles y permisos | P-08, P-C2, P-42, P-74 a P-77, P-88 |
| 5 | Segregación de funciones | P-SF1 (relacionadas P-23, P-42, P-68) |
| 6 | Solicitudes | P-22, P-S1, P-B1, P-20, P-AS1 |
| 7 | Aviso de devolución y plazo | P-30, P-43, P-44, P-45, P-46, P-N1 |
| 8 | Unicidad | P-A1, P-63, P-81, P-11 |
| 9 | Reportes | P-101, P-102, P-R1 |
| 10 | Auditoría | P-06, P-89, P-90, P-96 |
 
*Fuente: elaboración propia a partir de las preguntas del consolidado (P-01 a P-105) y de las preguntas provisionales de los bloques (P-A, P-C, P-S, P-B, P-AS, P-AC, P-SF, P-N, P-RD, P-H, P-U, P-RP, P-CA, P-R); los P-xx definitivos se asignan desde P-106 en la unión final.*
 
La Tabla 49 asigna el código definitivo de las 24 preguntas provisionales, a continuación de P-105 (decisión T-15). Los códigos provisionales se conservan en el cuerpo del documento; esta tabla es la que asigna los definitivos.
 
Tabla 49. Correspondencia de las preguntas provisionales con los códigos definitivos (desde P-106)
 
| **Código provisional** | **Código definitivo** | **Pregunta** |
| --- | --- | --- |
| P-A1 | P-106 | ¿se confirma que no pueden existir dos activos con la misma serie ni la misma placa, aunque uno esté dado de baja? (RN-A03, RN-A04) |
| P-A2 | P-107 | ¿puede registrarse o reclasificarse un activo en una categoría inactiva? (RN-A09; relacionada con P-19) |
| P-A3 | P-108 | ¿cómo se da de baja un equipo perdido, robado o irrecuperable que sigue con asignación vigente? (RN-A19) |
| P-C1 | P-109 | ¿puede inactivarse un custodio que tiene solicitudes Aprobadas aún sin asignación? (RN-C14; la pregunta de si puede asignarse un equipo a un custodio inactivo es P-35, ya existente) |
| P-C2 | P-110 | ¿qué debe pasar con un custodio activo cuando el rol de su usuario deja de ser Empleado? (RN-C08b) |
| P-C3 | P-111 | si el Empleado de una solicitud Pendiente o de una asignación Vigente ya no está, ¿quién cancela la solicitud o cierra la asignación? (RN-C14a, RN-C14b; relacionada con P-13 y P-A3) |
| P-S1 | P-112 | ¿puede reactivarse una solicitud cancelada o debe registrarse una nueva? (RN-S14) |
| P-B1 | P-113 | ¿se confirma que todo rechazo de una solicitud debe justificarse con un motivo? (RN-AP02b) |
| P-AS1 | P-114 | ¿una solicitud se atiende con un solo equipo o puede requerir varios (por ejemplo, equipo y accesorios)? (RN-AS05a) |
| P-AC1 | P-115 | si un acta se firmó con error, ¿puede anularse y firmarse otra, o la firmada es definitiva? (RN-AC06a; propuesta PRO-04) |
| P-SF1 | P-116 | ¿se confirma que quien solicita, devuelve o registra algo no puede decidir ni confirmar lo propio (por ejemplo, un aprobador sobre su propia solicitud, quien devuelve un equipo sobre su propia devolución o un usuario sobre su propio usuario)? (propuesta PRO-02; relacionada con P-23, P-42 y P-68) |
| P-N1 | P-117 | ¿además del custodio, debe recibir el aviso de devolución el Responsable de Activos u otro rol? (RN-N06, contenido de RF-28) |
| P-N2 | P-118 | ¿qué debe pasar si el correo no puede enviarse (usuario inactivo, correo inválido o falla del envío): se reintenta, se registra? (RN-N06) |
| P-N3 | P-119 | ¿el aviso debe quedar auditado (Notificar) y quién figura como usuario si lo genera el sistema? (RN-N09; MOD-24; TRA-13) |
| P-RD1 | P-120 | ¿«reportar cuando un equipo requiera mantenimiento» (Alcance 1.2) es un reporte distinto del daño, para un equipo que no está dañado? |
| P-RD2 | P-121 | ¿un custodio puede consultar y actualizar sus reportes después de devolver el equipo (asignación cerrada)? (RN-RD07b) |
| P-H1 | P-122 | ¿hasta cuándo puede corregirse un mantenimiento: siempre, o no si el activo está en baja? (RN-H17) |
| P-H2 | P-123 | ¿la fecha de un mantenimiento asociado a un reporte puede ser anterior a la fecha del reporte? (MOD-29) |
| P-H3 | P-124 | ¿puede registrarse un mantenimiento realizado antes de la baja del activo, ya dado de baja? (RN-H08; DEP-07) |
| P-U1 | P-125 | ¿un usuario inactivado con la sesión abierta debe perder el acceso de inmediato? (RN-U20a; TRA-21) |
| P-RP1 | P-126 | ¿«Aprobar» cubre también rechazar una solicitud, o se agrega «Rechazar» a Nombre_Permiso (Accion_Auditoria sí lo tiene)? (RN-RP04) |
| P-RP2 | P-127 | ¿qué operaciones cubre cada permiso: «Reportar» (¿reportar daños o consultar reportes?), «Devolver» (¿registrar y confirmar?) y «Notificar» (el aviso es automático)? (RN-RP04; relacionada con P-76) |
| P-CA1 | P-128 | ¿cuál es el catálogo inicial de categorías de equipos? Ninguna fuente lo define; Portátiles y Periféricos son ejemplos (P-86). |
| P-R1 | P-129 | para Pendientes_Devolucion, ¿Fecha_Fin vacía significa «sin límite» (incluye devoluciones futuras) en lugar de «hasta hoy»? (RN-R04) |
 
*Fuente: elaboración propia a partir de la lista 3 de las listas acumuladas y la decisión T-15. Cuando una pregunta incluye una referencia a otra pregunta provisional, se mantiene el código provisional.*
