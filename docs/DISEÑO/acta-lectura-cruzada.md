3.10 Acta de lectura cruzada (punto 12b)
 
La lectura cruzada es el punto de control con que cierra la Fase 2: otro equipo lee el Documento de Ingeniería del Proyecto consolidado (secciones 1 a 3, en la versión que anota el equipo lector), aplica las ocho preguntas de rastreo de la guía de la docente, responde con evidencia (página y código) y firma. Según la guía de la docente, la compuerta M2 se abre solo con «matriz cerrada (sin celdas vacías) + constancia 12b firmada por el equipo lector + hallazgos corregidos hacia atrás»; la matriz es la de la sección 3.9, y sin esta acta firmada no se abre la sección 4. La Tabla 1 registra quién leyó y qué versión; la Tabla 2 trae las preguntas; la Tabla 3 lista lo que el equipo ya declaró como pendiente; la Tabla 4 recoge las observaciones del lector, y la Tabla 5 el resultado y las firmas. El acta es propuesta del equipo, pendiente de validar con la docente.
 
**Tabla**** ****1****. ***Datos de la lectura*
 
| **Equipo leído** | **Equipo lector (integrantes)** | **Fecha** | **Versión del documento leído** |
| --- | --- | --- | --- |
| Equipo NexaActivos: Eliú Marimón Arrieta y Julián David Valencia Gamboa | Julián David Valencia Gamboa (lectura interna, integrante del equipo leído). Lectura por otro equipo: no realizada. | 05/11/2026 | 3.4 v3; 3.5 v3_GenB; 3.6 v3_GenC; 3.7 v3; 3.8 v3_GenA; 3.9 v2; 3.10 v3 |
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de validar). Nombres del equipo leído según la portada de la plantilla del Documento de Ingeniería del Proyecto (actividad 12b del cronograma de 16 semanas); las demás celdas las llena el equipo lector.*
 
La Tabla 2 transcribe las ocho preguntas de la guía del paso 12b. El equipo lector escoge el elemento (la HU, el rombo, el mensaje, la transición, el botón o la clase), responde, anota la página o sección y los códigos que rastreó, y marca si la pregunta quedó resuelta.
 
**Tabla**** ****2****. ***Preguntas de rastreo*
 
| **N.º** | **Pregunta (transcrita de la guía de la docente)** | **Respuesta del ****equipo**** lector** | **Página o sección** | **Código(s) rastreado(s)** | **Resuelta (Sí/No)** |
| --- | --- | --- | --- | --- | --- |
| 1 | **Tome una HU al azar y siga su fila en la matriz** ¿Llega a una pantalla real del documento? ¿El método existe en la clase? | HU-09: la fila de la matriz coincide con C.1 (6 RF; Solicitud.crear). El paso 7 de CU-09 corresponde al mensaje 8, Solicitud.crear(s), que existe en la clase Solicitud; la operación del Servicio es SolicitudServicio.crear() (Fig. 1). Llega a MK-03, cuyo botón «Enviar solicitud» llama a crear(). | 3.9, Tabla 1; 3.7, Tabla 3 y Figura 1; 2.5, MK-03 | HU-09, RF-11, CU-09, MK-03 | Sí |
| 2 | **Tome un rombo de un diagrama de actividades** ¿Cita una RN? ¿Esa RN tiene RF y aparece en el diccionario como restricción? | CU-15, rombo de la categoría (flujo 7a): cita RN-AS08, que tiene ficha y respalda la condición; su RF es RF-90, de la lista C.1 de HU-15. En el diccionario solo figuran las FK Activo.ID_Categoria y Solicitud.ID_Categoria; la coincidencia de categorías es RN, no restricción del diccionario. | 3.5, Tabla 5; 3.7, Tabla 5; Diccionario v7 | RN-AS08, RF-90, M-100 | Sí (parcial) |
| 3 | **Tome un mensaje de un diagrama de secuencia** ¿Está en el diagrama de clases con ese nombre? (regla de oro) | CU-13, mensaje 8: Aprobacion.decidir(a). Existe en la clase Aprobacion como decidir(a : Aprobacion), con el mismo nombre. | 3.7, Tabla 4 y Figura 2; 3.6, Tabla 5 | HU-13, RF-16 | Sí |
| 4 | **Tome una transición del diagrama de estados** ¿Tiene gestor HU/RF? ¿Las automáticas están justificadas? | Solicitud, Pendiente → Cancelada, evento Solicitud.cancelar(); manual. Gestor: HU-12 con RF-15, RF-78 y RF-80 (los tres en C.1 de HU-12). | 3.8, Tabla 3, transición T4 | HU-12, RF-15, RF-78, RF-80 | Sí |
| 5 | **Tome un botón de un mockup** ¿A qué CU pertenece? ¿Qué método llama? (ninguna pantalla sin padre) | MK-06, botón «Asignar equipo»: pertenece a CU-15 y llama a asignar() (RF-18); el Servicio invoca dentro existeAsignacionDeSolicitud() y activoDisponible(), ambos INTERNO. | 2.5, Tabla 13; 3.6, Tabla 3 | MK-06, CU-15, RF-18, RF-88, RF-89 | Sí |
| 6 | **Tome una clase del DDA** ¿En qué paquete MVC vive? ¿Las RN se validan en servicio y no en la vista? | AsignacionServicio vive en la capa Servicio (servicio/); su clase Asignacion está en Préstamo de equipos. Valida RN-AS04, RN-AS05a, RN-AS07a y RN-AS08 en los fragmentos alt; la Vista y el Controlador no validan RN. | 3.6, Tablas 2, 4 y 6; 3.7, Tabla 5 y Figura 3 | RN-AS04, RN-AS05a, RN-AS07a, RN-AS08 | Sí |
| 7 | **Busque la palabra 'eliminar' o 'borrar'** ¿Es eliminación lógica (activo / estado)? ¿El aviso explica la consecuencia? | La baja de activo es lógica: el aviso M-30 dice que el activo pasará a estado Baja y que el registro no se elimina. La única eliminación física es Rol_Permiso.retirar(), con el aviso M-242, declarada en la Tabla 3, fila 10. | 2.5, Tabla 24; 3.10, Tabla 3, fila 10 | HU-04, M-30, HU-39, M-242, P-78 | Sí |
| 8 | **Cuente los métodos sin RF y las pantallas sin CU** Huérfanos y fantasmas: cero es la meta | De los 76 métodos, uno no tiene HU: Auditoria.registrar(), INTERNO, declarado en C.1 (fila HU-45). Las 13 pantallas MK-01 a MK-13 tienen CU. Resultado: 0 huérfanos sin justificar y 0 fantasmas. | C.1; 3.7, Tabla 10; 2.5, Tabla 2 | HU-45, RF-160, MK-01 a MK-13 | Sí |
 
*Fuente: guía de la docente, paso 12b «Lectura cruzada entre equipos y Compuerta M2» (preguntas transcritas textualmente); columnas de respuesta para el equipo lector.*
 
La Tabla 3 copia, sin agregar nada, los pendientes que el equipo ya declaró en sus secciones: las rupturas de la matriz (3.9.2), los hallazgos de la auditoría cruzada (Tabla 5 de 3.4), los supuestos y preguntas abiertas de 3.7 (Tablas 6 y 11, y la fila HU-45 de la Tabla 10), de 3.8 (3.8.5) y de 3.5 (3.5.7), y la excepción a la baja lógica de la Tabla 7 de 3.6. El equipo lector no necesita volver a reportarlos, salvo que encuentre algo distinto de lo que dice la tabla.
 
**Tabla ****3****. ***Pendientes declarados por el equipo antes de la lectura*
 
| **N.º** | **Pendiente** | **Dónde está** | **A quién corresponde** |
| --- | --- | --- | --- |
| 1 | 3.9.2: 40 celdas de la columna Paso CU marcadas como ruptura parcial | 3.9, Tabla 2 (3.9.2) | Docente |
| 2 | 3.9.2: 40 celdas de la columna Mensaje sec. marcadas como trazabilidad parcial | 3.9, Tabla 2 (3.9.2) | Docente |
| 3 | 3.9.2: 30 celdas de la columna Pantalla marcadas como ruptura | 3.9, Tabla 2 (3.9.2) | Docente |
| 4 | H-01 (Media): HAL nuevo: registrar Asignacion.ID_Custodio como desnormalización deliberada, con la condición de coherencia Asignacion.ID_Custodio = Solicitud.ID_Custodio, y explicar por qué se conserva aquí y no en Devolucion. | 3.4, Tabla 5 | Pendiente de docente |
| 5 | H-02 (Baja): COR: cuando el diagrama pase a llamarse v7, cambiar a la vez el título del PDF y las menciones «diagrama de clases v6» de 3.2; mientras tanto, citar el diagrama como «v6 con CRF-003». | 3.4, Tabla 5 | Abierto (equipo) |
| 6 | H-03 (Baja): COR: quitar la nota del método de la tabla Rol_Permiso (queda en el diagrama de clases) o pasarla a Observaciones con redacción de diccionario. | 3.4, Tabla 5 | Abierto (equipo) |
| 7 | H-04 (Baja): COR: escribir INT(11) y BIGINT(20) en el diagrama, o declarar en 3.3 que se omite el número entre paréntesis. | 3.4, Tabla 5 | Pendiente de docente (junto con H-05) |
| 8 | H-05 (— (decisión)): Ninguna en los archivos; confirmar la convención con la docente y dejarla escrita en 3.3. | 3.4, Tabla 5 | Pendiente de docente |
| 9 | CU-24: (a) DevolucionServicio.buscarPorId() como prevalidación antes del aviso M-151 es propuesta del equipo, pendiente de la docente; el diagrama de clases v6 no tiene un método dedicado. (b) La precedencia entre el paso 3 (devolución ya confirmada) y el paso 4 (devolución inexistente) está abierta (HAL-51); el diagrama sigue el caso de uso. (c) La Tabla 3 de 3.6 asigna a MK-09 solo confirmarRecepcion(); la diferencia se propone como HAL nuevo, sin número. | 3.7, Tabla 11, fila 2 | Docente; equipo |
| 10 | Rol_Permiso.retirar() elimina la fila, única excepción a la baja lógica (RN-RP06†; P-78; MOD-35). | 3.6, Tabla 7, fila 8 | Cliente |
| 11 | El Servicio como parte de la lógica del modelo y el Controlador que recibe la operación con el mismo nombre que la clase. | 3.7, Tabla 6, fila 1 | Docente |
| 12 | Matriz rol–operación sin validar: condiciona el fragmento de rechazo por rol de los tres diagramas (P-75, P-77, P-100); el rechazo por rol de CU-09 y CU-15 no tiene número de mensaje, y el permiso para rechazar en CU-13 es P-RP1. | 3.7, Tabla 6, fila 2 | Cliente |
| 13 | ID_Custodio digitado frente a tomado de la sesión en CU-09 (COR-23, RF-168, P-105). | 3.7, Tabla 6, fila 3 | Cliente; equipo |
| 14 | Qué operaciones se auditan: CU-09 y CU-13 no registran auditoría; CU-15 la registra con la acción Asignar (P-89; decisión T-2 provisional). | 3.7, Tabla 6, fila 4 | Cliente; docente |
| 15 | Coherencia entre Fecha_Devolucion_Esperada y Fecha_Entrega en CU-15 (flujo 8a): el Diccionario v7 no la define; propuesta MOD-01. | 3.7, Tabla 6, fila 5 | Cliente |
| 16 | Llamadas entre Servicios sin nueva verificación de permiso. | 3.7, Tabla 6, fila 6 | Docente; equipo |
| 17 | El rol y el identificador del usuario en sesión llegan con la petición; el vencimiento de la sesión no se dibuja (RNF-02, P-70). | 3.7, Tabla 6, fila 7 | Cliente |
| 18 | Mantener 6 diagramas frente a la sugerencia verbal de reducir a 4. | 3.7, Tabla 6, fila 8 | Docente |
| 19 | CU-24 se presenta en dos figuras porque el diagrama completo no cabe en 22,8 x 14 cm con letra de 9 pt o más; propuesta del equipo, pendiente de la docente. | 3.7, Tabla 11, fila 1 | Docente |
| 20 | CU-24: DevolucionServicio invoca AsignacionServicio.cerrar() para realizar la dependencia Devolucion.confirmarRecepcion() → Asignacion.cerrar() del diagrama de clases (CRF-003; 3.6.4). | 3.7, Tabla 11, fila 3 | Docente |
| 21 | CU-24: Devolucion.buscarPorId() se usa para verificar la devolución (pasos 3 y 4) y no figura en la fila de CU-24 de la Tabla 27. | 3.7, Tabla 11, fila 4 | Equipo |
| 22 | Auditoría: CU-24 la registra con la acción Devolver (RF-163); CU-01 y CU-19 no la registran (P-89; HAL-08, HAL-46). | 3.7, Tabla 11, fila 6 | Cliente; docente |
| 23 | Matriz rol–operación sin validar (P-75); el rechazo por rol de CU-01 y CU-19 no tiene número de mensaje, y el permiso más cercano para confirmar la recepción es Devolver (P-RP2). | 3.7, Tabla 11, fila 7 | Cliente |
| 24 | HU-25: el aviso automático lo dispara el actor «Sistema», sin Vista y sin verificación de permiso (RF-167; decisión T-8 provisional; P-44). | 3.7, Tabla 11, fila 8 | Cliente |
| 25 | CU-01 y CU-19 incluyen mensajes que la Tabla 27 del Word de CU no lista para sus HU: CategoriaServicio.buscarPorId() (CU-48; RF-52), AsignacionServicio.buscarPorId() (RF-104) y CustodioServicio.buscarPorUsuario() (RF-103, RF-102); propuesta del equipo, pendiente de la docente. | 3.7, Tabla 11, fila 9 | Equipo |
| 26 | La autoridad por rol de cada operación sigue pendiente de la matriz rol–operación (P-75 y P-77); la matriz de trazabilidad no la resuelve. | 3.9, apartado 3.9.4, viñeta 4 | Cliente |
| 27 | La lectura cruzada de esta matriz por otro equipo se registra en la sección 3.10 (punto 12b). | 3.9, apartado 3.9.4, viñeta 5 | Equipo |
| 28 | Solicitud atendida (MOD-02): tras asignarse, la solicitud sigue Aprobada porque Estado_Solicitud no tiene un estado de atendida; evaluar agregar uno afectaría RN-S05†, RN-AS04 y RN-AS05†. | 3.8, apartado 3.8.5, párrafo 2 | Cliente |
| 29 | Recepción con novedad (MOD-20, P-47): Estado_Recepcion solo tiene Pendiente y Confirmada; no hay estado para un equipo recibido incompleto o dañado. | 3.8, apartado 3.8.5, párrafo 3 | Cliente |
| 30 | Acta_De_Entrega y Reporte_de_Danios (MOD-18, MOD-25): no tienen ENUM de estado (el acta carece de anulación o corrección; el reporte, de estado de atención y de baja), por lo que no tienen diagrama (P-AC1, P-41, P-53, P-56). | 3.8, apartado 3.8.5, párrafo 4 | Cliente |
| 31 | Equipo no devuelto (P-C3-04): con cerrar() condicionado a una Devolucion Confirmada no existe cierre sin devolución, y RN-A19 bloquea la baja; un equipo perdido o robado no tiene salida documentada. | 3.8, apartado 3.8.5, párrafo 5 | Cliente |
| 32 | Poscondiciones de Estado_Activo (P-C3-01, P-C3-02, P-C3-03 y P-C3-06): que la confirmación de la recepción deje el activo Disponible salvo que esté Dañado (T3), que el reporte de daño lo deje Dañado aunque esté asignado (T4), quién lo devuelve a Disponible tras un mantenimiento (T6) y que Estado_Activo muestre solo uno de los dos hechos (asignado o dañado). | 3.8, apartado 3.8.5, párrafo 6 | Cliente |
| 33 | La selección de los seis casos de uso como operaciones críticas es propuesta del equipo, pendiente de confirmar. | 3.5, apartado 3.5.7, párrafo 2 | Docente |
| 34 | La matriz rol–operación (P-75, P-77 y P-100) condiciona el rombo R0 de los seis diagramas; en CU-01, CU-09, CU-15 y CU-19 el rechazo por rol no tiene número de mensaje, y el permiso para aprobar y rechazar en CU-13 es la pregunta P-RP1. | 3.5, apartado 3.5.7, párrafo 3 | Cliente |
| 35 | Una regla citada no tiene ficha en el documento de RN: RN-S10c† (incluida en RN-S19, R4 de CU-09). | 3.5, apartado 3.5.7, párrafo 4 | Equipo |
| 36 | El R6 de CU-15 se trata como restricción del diccionario (RF-18), pero el Diccionario v7 solo define Fecha_Devolucion_Esperada como DATE obligatoria; incorporar la coherencia entre fechas es la propuesta MOD-01, pendiente de validar con el cliente. La regla preliminar RN-AS09 es una restricción de datos, no una ficha de RN. | 3.5, apartado 3.5.7, párrafo 5 | Equipo |
| 37 | R2, R4 y R5 de CU-24 y R6 de CU-13 no se apoyan en una RN ni en una restricción del diccionario: R2 y R4 en el enunciado de RF-27 y RF-118, R5 en RF-117 y CRF-003 (A1) y R6 de CU-13 ramifica el flujo (2a). RN-AS14 queda como guarda del cierre (CU-47), no del rombo R5. | 3.5, apartado 3.5.7, párrafo 6 | Equipo |
| 38 | P-89 deja abierto qué operaciones se auditan (el alta del activo en CU-01 no se audita y la auditoría de la devolución en CU-24 es ambigua). | 3.5, apartado 3.5.7, párrafo 7 | Cliente |
| 39 | R0 cita RF-166, un requisito transversal cuya historia de origen es HU-38 y no la del caso de uso. | 3.5, apartado 3.5.7, párrafo 8 | Equipo |
| 40 | P-70 deja sin medida el vencimiento de la sesión (RNF-02), por lo que ningún diagrama dibuja un rombo de sesión vencida. | 3.5, apartado 3.5.7, párrafo 9 | Cliente |
| 41 | Auditoria.registrar() es INTERNO y no tiene HU en la tabla C.1 (fila HU-45: «registrar() es INTERNO, sin HU»). | 3.7, Tabla 10, fila HU-45 | Equipo |
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de validar) a partir de 3.9 (3.9.2 y 3.9.4), de la Tabla 5 de 3.4, de las Tablas 6, 10 y 11 de 3.7, de 3.8 (3.8.5), de 3.5 (3.5.7) y de la Tabla 7 de 3.6. † = RN sin ficha en el documento de RN.*
 
En la Tabla 4 el equipo lector anota cada observación con su gravedad. CRÍTICO: rompe la cadena de trazabilidad o contradice una fuente aprobada (por ejemplo, un mensaje que invoca un método que no existe); impide abrir la compuerta M2 hasta corregirla. MAYOR: falta o error que afecta la lectura de un artefacto sin romper la cadena (por ejemplo, una figura sin mención en el texto); también debe corregirse antes de M2. MENOR: forma o redacción; puede corregirse después. Si hacen falta más filas, se agregan.
 
**Tabla**** ****4****. ***Observaciones del equipo lector*
 
| **N.º** | **Observación** | **Sección o código** | **Gravedad (CRÍTICO / MAYOR / MENOR)** | **Estado (corregida / pendiente)** | **Quién corrige** |
| --- | --- | --- | --- | --- | --- |
| 1 | La guarda de la coherencia entre fechas citaba «restricción del diccionario», pero el Diccionario v7 no la contiene. | 3.7, Tabla 5 (flujo 8a) | MAYOR | Corregida (3.7 v3) | Equipo |
| 2 | El documento de RN (B.5, Tabla 32) clasifica esa coherencia como restricción del diccionario (AS09), pero el Diccionario v7 no la incluye. | 3.7, Tabla 6, fila 5; MOD-01 | MENOR | Pendiente (hallazgo nuevo, sin número) | Docente |
| 3 | El símbolo † tiene dos significados: INTERNO en la Tabla 3 y RN sin ficha en 3.6.1 y en la Tabla 7. | 3.6 v3_GenC | MENOR | Pendiente | Equipo |
| 4 | Un párrafo usa comillas inglesas en lugar de latinas. | 3.9, apartado 3.9.1 | MENOR | Pendiente | Equipo |
| 5 | La columna Paso CU no traía el número de mensaje. | 3.9, Tabla 1 | MENOR | Corregida (3.9 v2) | Equipo |
| 6 | Se citaban unos «mockups v4» que no existen. | 3.9 y 3.6 | MENOR | Corregida (3.9 v2 y 3.6 v3_GenC) | Equipo |
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de validar); la llena el equipo lector.*
 
La Tabla 5 cierra la lectura: el equipo lector marca si leyó la matriz de 3.9, si las observaciones CRÍTICO y MAYOR quedaron corregidas y el estado de la compuerta M2; luego firman los integrantes de los dos equipos.
 
**Tabla ****5****. ***Resultado de la lectura y firmas*
 
| **Matriz**** 3.9 ****leída**** (****Sí****/No)** | **Observaciones CRÍTICO y MAYOR corregidas (Sí/No)** | **Compuerta**** M2 (****abierta**** / ****cerrada****)** |  |
| --- | --- | --- | --- |
| Sí | Sí | Pendiente de decisión de la docente: lectura interna, no de otro equipo |  |
| **Nombre** | **Rol (lector o leído)** | **Fecha** | **Firma** |
| Julián David Valencia Gamboa | Lector (lectura interna) | 05/11/2026 |  |
| Eliú Marimón Arrieta | Leído | 05/11/2026 |  |
|  |  |  |  |
|  |  |  |  |
|  |  |  |  |
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de validar). Nombres del equipo leído según la portada de la plantilla del Documento de Ingeniería del Proyecto; las filas del equipo lector quedan en blanco y se agregan si hacen falta.*
 
Cierre de la Fase 2
 
Según la guía de la docente, la entrada a la Fase 3 solo se da con «matriz cerrada (sin celdas vacías) + constancia 12b firmada por el equipo lector + hallazgos corregidos hacia atrás». Para cerrar la Fase 2 se necesita:
 
La constancia de auditoría cruzada 7b (sección 3.4) firmada por el equipo lector.
 
La matriz de trazabilidad de la sección 3.9 cerrada, con las rupturas de 3.9.2 declaradas.
 
Las observaciones CRÍTICO y MAYOR de la Tabla 4 de esta acta corregidas.
 
Los hallazgos se corrigen en la sección donde nacen (hacia atrás), no solo en el acta.
 
Esta acta firmada por los dos equipos.
 
La LB-1 declarada en la sección 5.2 después de firmar, según la plantilla: «La LB-1 se declara al cerrar la matriz de trazabilidad (compuerta M2).»