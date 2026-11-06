**Sistema de Gestión de Activos (NexaActivos)**
 
**Sección 2.2: Requisitos no funcionales**
 
Fase de RNF: 9 requisitos no funcionales, cobertura de los 30 RNFC y matriz de verificación
 
# **2.2.7 Requisitos no funcionales**
 
## **2.2.7.1 Definición, categorías y reglas de medida**
 
Un requisito no funcional (RNF) es una cualidad medible del sistema; sin una medida verificable no es un RNF. La ficha oficial lleva Código (RNF-__), Categoría (Rendimiento, Seguridad, Usabilidad, Disponibilidad o Compatibilidad), Enunciado con medida y Origen (RNFC, RN, RF, HU, pregunta o tabla de 1.7, o Alcance 1.2). Las fichas de este documento agregan el tipo de medida, el RF que lo implementa, la verificación (un CA existente o una prueba nombrada PV-xx) y la condición.
 
**Estado de validación. **Ningún RNF está validado por el cliente: los 9 RNF (RNF-01 a RNF-09) son propuesta del equipo, pendientes de validar. Las condiciones que dependen de una decisión abierta se indican en cada ficha y en 2.2.7.9.
 
**Tipos de medida. **Cada RNF declara uno de tres tipos de medida, que explica la Tabla 67: del cliente con cita exacta, binaria verificable por prueba, o propuesta del equipo pendiente de validar con el cliente. Ningún número propio se presenta como dato del cliente.
 
**Tabla 67. Tipos de medida de los RNF**
 
| **Tipo de medida** | **Cuándo se usa** | **Uso en este documento** |
| --- | --- | --- |
| Del cliente, con cita exacta | La medida sale de una cifra o frase de 1.7 (pregunta, tabla, N-xx) o del Alcance 1.2, citada tal cual. | Ninguno de los 9 RNF toma su medida de una cifra del cliente: la encuesta no trae cifras de seguridad, rendimiento, disponibilidad ni compatibilidad. Solo trae la pregunta 9 «facilidad de uso» (4 respuestas, una marcó todas las opciones), N-03 (6 de 19) y N-07 (3), que se citan como origen y no como meta. |
| Binaria, verificable por prueba | La medida es cumplir o no cumplir, y un CA existente o una prueba nombrada (PV-xx) la verifica. | RNF-01 a RNF-07, y la primera oración de RNF-05 y de RNF-08. Ejemplo: «el 100 % de los intentos de un rol no autorizado son rechazados». |
| Propuesta del equipo, pendiente de validar con el cliente | No hay una medida defendible del cliente; el equipo propone un valor con justificación y lo marca. El número nunca se presenta como dato del cliente. | RNF-07 (inmutabilidad), la segunda oración de RNF-05, la segunda oración de RNF-08 (2 minutos) y RNF-09 (1.000 activos y 3 segundos). |
 
*Fuente: elaboración propia a partir de la definición oficial de RNF de la Plantilla de RF y otros y de la sección 1.7.*
 
**Insumo y cobertura. **La fase parte de los 30 RNFC (RNFC-01 a RNFC-30) de la lista de RNFC; cada uno termina con un destino explícito y la tabla de cobertura (2.2.7.6) cierra 30 de 30. Los 9 RNF son 7 de Seguridad, 1 de Usabilidad y 1 de Rendimiento. Disponibilidad y Compatibilidad no llevan ficha: no tienen origen real ni medida defendible y quedan como pregunta (2.2.7.5). La docente decide si exige ficha en las cinco categorías.
 
**Organización. **El apartado 2.2.7.2 presenta las fichas de Seguridad; el 2.2.7.3, la de Usabilidad; el 2.2.7.4, la de Rendimiento; el 2.2.7.5, las categorías sin ficha; el 2.2.7.6, la cobertura de los RNFC; el 2.2.7.7, la matriz de trazabilidad; el 2.2.7.8, las pruebas de verificación; el 2.2.7.9, las preguntas y decisiones abiertas; y el 2.2.7.10, las cuentas finales y la verificación cruzada. Las tablas se numeran de la 67 a la 84; la última tabla del documento de RF es la 66.
 
## **2.2.7.2 Fichas de RNF de Seguridad**
 
Las siete fichas de Seguridad agrupan el control de acceso (RNF-01), la sesión y las credenciales (RNF-02 a RNF-05) y el rastro de auditoría (RNF-06 y RNF-07). La autoridad por rol se decide una sola vez (CRI-01): RF-166 verifica el permiso del rol y el Anexo C del documento de RN es la matriz.
 
### **2.2.7.2.1 RNF-01 Control de acceso por rol**
 
**Tabla 68. Ficha de RNF-01: control de acceso por rol**
 
| **Campo** | **Contenido** |
| --- | --- |
| **Código** | RNF-01 |
| **Categoría** | Seguridad |
| **Enunciado con medida** | El 100 % de los intentos de ejecutar una operación por un usuario con sesión iniciada cuyo rol no la tiene permitida en el Anexo C, para las operaciones con rol definido, son rechazados, sin ejecutar la operación, sin mostrar datos y con un mensaje que informa que no tiene permiso. |
| **Tipo de medida** | Binaria verificable por prueba. El número no es del cliente. El actor por fila tiene respaldo parcial del Alcance 1.2 y el resto es supuesto, pendiente de validar con el cliente. |
| **Origen** | RNFC-02, 03, 04, 06, 07, 08, 11, 12, 13, 16, 18, 21, 22, 23, 24, 25 y 26; TRA-01, 02, 03, 04, 06, 07, 08, 10, 11, 14, 16, 19, 24, 25 y 27; CRI-01; T-5. Alcance 1.2: «gestionar roles y permisos según el perfil de cada usuario»; el Empleado consulta «el estado de sus solicitudes y sus asignaciones vigentes» y el Técnico de Soporte «los reportes de daño registrados». TRA-04 es la definición del actor de HU-10 CA-6 (no figura como RNF candidato); TRA-08 sí. |
| **Implementado por** | RF-166. RNF-01 mide el cumplimiento de RF-166; RF-166 no es su origen. |
| **Verificación** | **PV-01**: para cada una de las 52 filas, ejecutar la operación con cada rol no listado y comprobar rechazo, ausencia de datos y mensaje; en las 7 filas parciales, solo con los roles ya definidos. De las 62 filas con método del Anexo C, 52 son verificables por completo, 7 solo en la parte del rol definido y 3 no se miden por rol (generarAviso(), iniciarSesion() y cambiarContrasena()). CA que lo verifican en parte: HU-13 CA-7 (condición «sin rol Aprobador»), HU-24 CA-6 («sin el rol Responsable de Activos»), HU-29 CA-7 («sin el rol Técnico de Soporte»), HU-45 CA-7 y HU-46 CA-7. |
| **Condición** | La matriz está pendiente de validar con el cliente (P-75, P-77). Los conteos 52 / 7 / 3 cambian con P-75 y P-77; si P-55 deja abiertas las dos filas de reportes de daño, quedan 50 / 9 / 3. RNFC-16 y RNFC-18 son supuestos y están condicionados a P-88. Las 12 filas del Anexo C sin RNFC de origen (Activo 7, Acta 2, HU-14, listarAprobadas() y generarAviso()) las cubre este RNF porque mide contra todo el Anexo C. La fila «Cambio de responsable (sin método)» no tiene operación que probar. |
 
*Fuente: elaboración propia a partir de los RNFC de la lista de RNFC, el Anexo C (Tabla 43) del documento de RN, el consolidado de 46 HU y el Alcance 1.2.*
 
### **2.2.7.2.2 RNF-02 Sesión obligatoria**
 
**Tabla 69. Ficha de RNF-02: sesión obligatoria**
 
| **Campo** | **Contenido** |
| --- | --- |
| **Código** | RNF-02 |
| **Categoría** | Seguridad |
| **Enunciado con medida** | El 100 % de los intentos de ejecutar una operación sin sesión iniciada son rechazados, sin ejecutar la operación ni mostrar datos, salvo Usuario.iniciarSesion() y las acciones automáticas atribuidas al usuario de sistema (RF-167). |
| **Tipo de medida** | Binaria verificable por prueba. |
| **Origen** | RNFC-20; RN-T03 (T-3); TRA-05 y TRA-20; HU-36 CA-1 (la sesión queda iniciada con el rol del usuario). Antecedentes de las HU: 44 de las 46 HU declaran «Dado que …, [rol], inició sesión»; las dos excepciones son HU-36 («no tiene una sesión iniciada») y HU-25 («sin que ningún usuario lo solicite»), que coinciden con las excepciones del RNF. Precedente: ejemplo oficial de Persona, Parte 2, RNF-02, que deriva «solo los usuarios autenticados» de los Antecedentes de todas las HU, sin RF. |
| **Implementado por** | Ningún RF específico: RF-40 inicia la sesión y RF-167 atribuye las acciones automáticas. |
| **Verificación** | **PV-02**: invocar cada una de las 60 operaciones públicas (62 menos iniciarSesion() y generarAviso()) sin sesión y comprobar el rechazo. No hay CA de rechazo sin sesión; HU-36 CA-1 solo verifica el inicio. |
| **Condición** | El vencimiento y el cierre de la sesión no tienen medida (P-70; P-Q2 para el cierre explícito). P-105 define de dónde salen los ID, no el vencimiento. |
 
*Fuente: elaboración propia a partir de RNFC-20, RN-T03, los Antecedentes del consolidado de 46 HU y el ejemplo oficial de Persona, Parte 2.*
 
### **2.2.7.2.3 RNF-03 Contraseña almacenada cifrada**
 
**Tabla 70. Ficha de RNF-03: contraseña almacenada cifrada**
 
| **Campo** | **Contenido** |
| --- | --- |
| **Código** | RNF-03 |
| **Categoría** | Seguridad |
| **Enunciado con medida** | En el 100 % de los usuarios registrados o con contraseña cambiada, el valor almacenado en Password es distinto de la contraseña en texto plano indicada: se guarda cifrada. |
| **Tipo de medida** | Binaria. Respaldo del diccionario: Password = «Contraseña encriptada del usuario», VARCHAR(255). El diccionario no trae cifra ni algoritmo. |
| **Origen** | RNFC-09; RN-U07a; diccionario (Usuario.Password); TRA-20; CRI-08. |
| **Implementado por** | RF-35 y RF-41. Ninguno de los dos dice «cifrada»: lo dice el diccionario. |
| **Verificación** | HU-32 CA-1 (el usuario queda guardado con «(valor cifrado)») y HU-37 CA-1 (el valor almacenado es distinto de la contraseña nueva). **PV-03**: inspeccionar la columna Password completa tras registrar y tras cambiar; 0 valores iguales al texto plano. Alcance de PV-03: descarta el texto plano, pero no prueba irreversibilidad ni algoritmo (P-62). |
| **Condición** | Mecanismo y si la contraseña es recuperable: P-62. |
 
*Fuente: elaboración propia a partir de RNFC-09, el diccionario de datos v6 y el consolidado de 46 HU.*
 
### **2.2.7.2.4 RNF-04 La contraseña no aparece**
 
**Tabla 71. Ficha de RNF-04: la contraseña no aparece**
 
| **Campo** | **Contenido** |
| --- | --- |
| **Código** | RNF-04 |
| **Categoría** | Seguridad |
| **Enunciado con medida** | En el 100 % de las consultas, respuestas, mensajes y Detalles de auditoría del sistema, la contraseña no aparece, ni en texto plano ni cifrada. |
| **Tipo de medida** | Binaria. |
| **Origen** | RNFC-27, RNFC-14 y RNFC-19; RN-U09b, RN-AU08 y RN-T01 (T-1); TRA-20; CRI-08; P-98 (propuesta: Detalle «sin datos sensibles ni contraseñas») y P-92 (cambio de contraseña auditado como Actualizar con un Detalle sin contraseñas). |
| **Implementado por** | RF-37 implementa la parte de consulta (no es su origen); RF-160 (Detalle opcional). |
| **Verificación** | HU-33 CA-3 y HU-36 CA-1. **PV-04**, ampliado a los Detalles de auditoría: tras registrar un usuario y cambiar una contraseña, 0 apariciones de la contraseña en texto plano o cifrada en ninguna columna de Auditoria. |
| **Condición** | T-1. RNFC-14 y RNFC-19 son duplicadas y quedan absorbidas aquí; no hay RNF aparte para el Detalle de auditoría. |
 
*Fuente: elaboración propia a partir de RNFC-14, RNFC-19 y RNFC-27, los documentos de RN y de RF y el consolidado de 46 HU.*
 
### **2.2.7.2.5 RNF-05 Mensajes de inicio de sesión**
 
**Tabla 72. Ficha de RNF-05: mensajes de inicio de sesión**
 
| **Campo** | **Contenido** |
| --- | --- |
| **Código** | RNF-05 |
| **Categoría** | Seguridad |
| **Enunciado con medida** | En el 100 % de los intentos de inicio de sesión con correo inexistente o contraseña incorrecta, el sistema responde con el mismo mensaje, sin revelar cuál de los dos datos falló ni que el usuario existe o está inactivo. El mensaje de usuario inactivo solo se muestra cuando el correo y la contraseña son correctos. |
| **Tipo de medida** | Binaria; la segunda oración es propuesta del equipo (RN propuesta, P-71). |
| **Origen** | RNFC-10 y RNFC-28; RN-U19 y RN-U20b; M-230; TRA-20; CRI-08. |
| **Implementado por** | RF-40 y RF-144. Ninguno de los dos fija el texto del mensaje. |
| **Verificación** | HU-36 CA-3 (correo inexistente y contraseña incorrecta devuelven «Correo o contraseña incorrectos.») y HU-36 CA-4 (credenciales correctas de un usuario inactivo devuelven «El usuario está inactivo.»; con contraseña incorrecta devuelve el mensaje genérico). |
| **Condición** | La segunda oración es propuesta del equipo, pendiente de validar con el cliente (P-71). Si el cliente responde que el inicio de sesión debe responder igual en todos los casos, esa parte cambia. |
 
*Fuente: elaboración propia a partir de RNFC-10 y RNFC-28, el catálogo de mensajes y el consolidado de 46 HU (HU-36).*
 
### **2.2.7.2.6 RNF-06 Auditabilidad**
 
**Tabla 73. Ficha de RNF-06: auditabilidad**
 
| **Campo** | **Contenido** |
| --- | --- |
| **Código** | RNF-06 |
| **Categoría** | Seguridad |
| **Enunciado con medida** | El 100 % de las asignaciones, devoluciones registradas, confirmaciones de recepción y bajas de equipos que el sistema completa deja al menos un registro en Auditoria con el usuario que la ejecutó, la acción, la entidad y el registro afectados y la fecha y hora. |
| **Tipo de medida** | Binaria verificable por prueba. El «100 %» no es dato del cliente. |
| **Origen** | RNFC-30 (ancla), RNFC-01 (baja) y RNFC-17 (reportes); RN-T02a y RN-T02b; T-2. Alcance 1.2: «mantener un registro completo de auditoría de todas las acciones relevantes (asignaciones, devoluciones, cambios de responsable y bajas)»; 1.7, análisis documental: no existe trazabilidad. Precedente: ejemplo de Persona, RNF-02 («queda registrada con el usuario y la fecha»); allí autenticación y auditoría van en un solo RNF y aquí se separan (RNF-02 y RNF-06) para que cada una tenga una sola medida. |
| **Implementado por** | RF-160 a RF-164 (RF-165 condicionado). |
| **Verificación** | **PV-05**, sin CA: ejecutar cada una de las 4 operaciones y comprobar en Auditoria el registro con sus datos. HU-39 CA-5, HU-44 CA-7 y HU-46 CA-7 no verifican un registro de Auditoria; HU-45 solo consulta registros y la nota de HU-46 declara la auditoría «regla transversal» que no se repite en los criterios. |
| **Condición** | T-2 (validación de la docente). La consulta de reportes está condicionada a T-9 y P-90; el registro contiene la acción Reportar, el usuario y la fecha (RF-165); Entidad e ID_Registro de una vista están sin definir (HAL-105; P-97, P-98, MOD-38). «Al menos un registro» porque confirmar la recepción puede producir uno o dos (HAL-111, P-89, MOD-39). Quedan fuera los «cambios de responsable»: no hay operación (HAL-109; P-95). El alcance de RNF-06 (D-N3) es más estrecho que «toda operación auditable de la tabla G» de RNFC-30 y RN-T02b; la ampliación depende de T-2 y P-89. Alta y actualización del activo: P-89 y P-06. |
 
*Fuente: elaboración propia a partir de RNFC-01, RNFC-17 y RNFC-30, RN-T02a, el Alcance 1.2, la sección G del consolidado de 46 HU y RF-160 a RF-165.*
 
### **2.2.7.2.7 RNF-07 Inmutabilidad del rastro de auditoría**
 
**Tabla 74. Ficha de RNF-07: inmutabilidad del rastro de auditoría**
 
| **Campo** | **Contenido** |
| --- | --- |
| **Código** | RNF-07 |
| **Categoría** | Seguridad (integridad del rastro) |
| **Enunciado con medida** | Auditoria tiene 0 operaciones públicas de modificación o eliminación (inspección del UML v6) y, tras ejecutar las pruebas de las demás operaciones, 0 registros de Auditoria quedan alterados. |
| **Tipo de medida** | Binaria; propuesta del equipo, pendiente de validar con el cliente (RN-AU09 no tiene ficha ni CA de rechazo). |
| **Origen** | RNFC-15; RN-AU09; HAL-78, punto 3 (inmutabilidad, RNF de integridad); UML v6; doctrina del curso (baja lógica, jamás DELETE). |
| **Implementado por** | Ningún RF: es una restricción del UML v6 sobre Auditoria. |
| **Verificación** | **PV-06**: (a) inspección del UML v6: Auditoria tiene 2 métodos públicos, registrar() («INTERNO», solo crea) y buscarPorId() (solo lee), y 0 de modificación o borrado; el CRF-003 no cambia Auditoria. (b) Comparar los registros previos de Auditoria antes y después de ejecutar las pruebas PV-01 a PV-05 y los CA de las demás operaciones: 0 alterados. |
| **Condición** | Más allá de esa inspección no hay una medida defendible: un candado en la base de datos es una decisión de diseño que el DDA no ha tomado. La medida no garantiza que alguien con acceso directo a la base de datos no pueda alterar un registro. |
 
*Fuente: elaboración propia a partir de RNFC-15, RN-AU09, el diagrama de clases v6 y la adenda CRF-003.*
 
## **2.2.7.3 Ficha de RNF de Usabilidad**
 
RNF-08 es una propuesta del equipo: la encuesta muestra que la facilidad de uso importa, pero sus cifras no sustentan ninguna meta numérica.
 
**Tabla 75. Ficha de RNF-08: usabilidad de los mensajes y del registro de solicitudes**
 
| **Campo** | **Contenido** |
| --- | --- |
| **Código** | RNF-08 |
| **Categoría** | Usabilidad |
| **Enunciado con medida** | El 100 % de los mensajes de rechazo del catálogo de mensajes indica el motivo del rechazo, excepto el mensaje genérico de inicio de sesión (M-230, RNF-05). Un Empleado capacitado registra una solicitud completa en máximo 2 minutos (propuesta del equipo, pendiente de validar con el cliente). |
| **Tipo de medida** | Primera oración: binaria, verificable por inspección del catálogo. Segunda oración: propuesta del equipo, pendiente de validar con el cliente. Los «2 minutos» son el mismo valor del ejemplo oficial de Persona (RNF-03), no un dato de Nexa. |
| **Origen** | 1.7: pregunta 9 «facilidad de uso», 4 respuestas (una marcó todas las opciones); N-03, solicitudes con dificultad alta en 6 de 19; N-07, reportar daños con facilidad, 3 respuestas; pregunta 13: «registro fácil de préstamos». Esas cifras muestran que la facilidad importa, pero no sustentan ninguna meta numérica. |
| **Implementado por** | Ningún RF: se mide sobre el catálogo de mensajes de todos los RF. |
| **Verificación** | **PV-07**: (a) inspección del catálogo de mensajes con el criterio «nombra el campo u objeto y la condición incumplida». Mensajes límite revisados, todos conformes: M-71 (HU-11 CA-4; objeto: estado de la solicitud; condición: cambia solo con la decisión o la cancelación), M-189 (HU-29; reporte de daño; no corresponde al activo) y M-272 (HU-09; custodio; no corresponde al empleado que solicita). Cifras del catálogo: 273 mensajes (M-01 a M-273), 207 de tipo Error, incluidos 2 pendientes de P-13 (M-56 y M-57, opción A). (b) Prueba cronometrada del registro de una solicitud por un Empleado capacitado. |
| **Condición** | Si el cliente no valida la meta de tiempo, solo queda la inspección. «Capacitado» no está definido. Tiempo de registrar una solicitud: P-Q3. |
 
*Fuente: elaboración propia a partir de la sección 1.7 (preguntas 9 y 13, N-03 y N-07), el catálogo de mensajes del consolidado de 46 HU y el ejemplo oficial de Persona, RNF-03.*
 
## **2.2.7.4 Ficha de RNF de Rendimiento**
 
RNF-09 es una propuesta del equipo: la encuesta pide «un sistema simple y rápido» sin cifra y no trae el tamaño de Nexa, por lo que el volumen y el umbral de tiempo son del equipo.
 
**Tabla 76. Ficha de RNF-09: tiempo de respuesta de las consultas de inventario y asignaciones**
 
| **Campo** | **Contenido** |
| --- | --- |
| **Código** | RNF-09 |
| **Categoría** | Rendimiento |
| **Enunciado con medida** | Con hasta 1.000 activos registrados (volumen asumido, propuesta del equipo, pendiente de validar con el cliente, P-Q3), la consulta del inventario (Activo.listarInventario()), la búsqueda de un activo por placa o por número de serie y la consulta de las asignaciones vigentes (Asignacion.listarVigentes()) responden en menos de 3 segundos en todas las mediciones de la prueba. |
| **Tipo de medida** | Propuesta del equipo, pendiente de validar con el cliente, tanto el volumen (1.000) como el umbral (3 segundos). El umbral coincide con el del ejemplo de la Plantilla oficial; no sale de la encuesta. |
| **Origen** | 1.7, pregunta 13: «un sistema simple y rápido», sin cifra. N-02 (quién tiene cada equipo, 9 respuestas) y N-01 (estado actual, 5 respuestas) indican qué consultas importan, pero no dan un tiempo. 1.7 no trae el tamaño de Nexa (solo 19 encuestados), por eso el volumen de 1.000 activos y los 3 segundos son propuesta del equipo. «Inventario en tiempo real» no se usa como medida de tiempo de respuesta. |
| **Implementado por** | RF-56, RF-03 y RF-93. |
| **Verificación** | **PV-08**: cargar 1.000 activos de prueba, ejecutar cada consulta y medir el tiempo en el equipo de pruebas del proyecto. |
| **Condición** | Concurrencia sin definir (se mide con un usuario a la vez) y equipo de pruebas sin definir. Si P-Q3 trae otro volumen o tiempo, cambia el enunciado. |
 
*Fuente: elaboración propia a partir de la sección 1.7 (pregunta 13, N-01 y N-02), la Plantilla oficial de RF y otros y los RF de consulta de inventario y asignaciones.*
 
## **2.2.7.5 Disponibilidad y Compatibilidad: solo pregunta**
 
Las categorías Disponibilidad y Compatibilidad no tienen RNFC y no llevan ficha de RNF. Ninguna cifra del cliente las sustenta y cualquier número sería inventado, por lo que se registra la brecha y se pregunta al cliente. Si la docente exige ficha en las cinco categorías, lo decide ella (2.2.7.9).
 
**Tabla 77. Categorías sin ficha de RNF y su pregunta**
 
| **Categoría** | **Origen disponible** | **Motivo para no redactar RNF** | **Pregunta** |
| --- | --- | --- | --- |
| Disponibilidad | 1.7, pregunta 13: «disponibilidad inmediata» de los equipos. Antecedente de HU-36: «el sistema está disponible», sin medida. | No hay origen real: «disponibilidad inmediata» habla de la disponibilidad de los equipos, no del sistema; ninguna fuente trae un horario ni un tiempo tolerable sin servicio. | P-Q4: ¿en qué horario necesita Nexa Servicios usar el sistema y cuánto tiempo sin servicio puede tolerar? |
| Compatibilidad | 1.7, pregunta 13: «reportes e historial en el celular» (1 respuesta de 19). Alcance 1.2: sin aplicación móvil nativa. | Una sola respuesta, que choca con el Alcance 1.2; el DDA no ha decidido la arquitectura del sistema. | P-Q5: ¿desde qué dispositivos y navegadores debe usarse el sistema (equipo de escritorio, celular), sabiendo que el Alcance 1.2 deja fuera la aplicación móvil nativa? |
 
*Fuente: elaboración propia a partir de la sección 1.7 (pregunta 13 y 1.7.3), el Alcance 1.2 y el consolidado de 46 HU.*
 
## **2.2.7.6 Cobertura de los 30 RNFC**
 
Cada uno de los 30 RNFC termina con un destino explícito. La cobertura es 30 de 30: 17 en RNF-01 (14 directos y 3 cubiertos por RNF-01 y RF-166), 1 en RNF-02, 1 en RNF-03, 3 en RNF-04, 2 en RNF-05, 3 en RNF-06, 1 en RNF-07, 1 en la pregunta P-38 y 1 en el hallazgo HAL-116. No se crea RNFC-31.
 
**Tabla 78. Cobertura final de los 30 RNFC**
 
| **RNFC** | **Regla de origen** | **Destino** | **Condición** |
| --- | --- | --- | --- |
| RNFC-01 | RN-A17, auditabilidad de alta, actualización y baja del activo | RNF-06 (solo la baja, RF-164); alta y actualización del activo: P-89 y P-06 | T-2 |
| RNFC-02 | RN-C17, control de acceso sobre custodios | RNF-01 | Supuesto (TRA-01; P-17) |
| RNFC-03 | RN-S20, el Aprobador consulta las solicitudes pendientes | RNF-01 | Supuesto; fila parcial (P-27) |
| RNFC-04 | RN-AS24, autoridad por rol sobre asignaciones | RNF-01 | Supuesto (P-28) |
| RNFC-05 | RN-AC08, seguridad de la firma digital | P-38, sin RNF ni algoritmo | Algoritmo y validación sin definir; el no nulo ya es restricción del diccionario |
| RNFC-06 | RN-D21, autoridad por rol en devolución | RNF-01 | Supuesto (P-42) |
| RNFC-07 | RN-RD18, autoridad por rol sobre reportes de daño | RNF-01 | Supuesto (P-55) |
| RNFC-08 | RN-H16, el Técnico de Soporte gestiona los mantenimientos | RNF-01 | Supuesto; 3 filas parciales (P-57) |
| RNFC-09 | RN-U07a, la contraseña no se almacena en claro | RNF-03 | Mecanismo en P-62 |
| RNFC-10 | RN-U19, el mensaje de credenciales inválidas no revela cuál dato falló | RNF-05 | M-230 |
| RNFC-11 | RN-U23, autoridad por rol sobre usuarios | RNF-01 | Supuesto (P-60, P-72, P-73); 2 filas sin prueba por rol |
| RNFC-12 | RN-RP12, autoridad por rol sobre permisos | RNF-01 | El Alcance 1.2 respalda solo la consulta (P-74, P-80) |
| RNFC-13 | RN-CA14, autoridad por rol sobre categorías | RNF-01 | Supuesto (P-74, P-87) |
| RNFC-14 | RN-AU08, el Detalle de auditoría nunca contiene contraseñas | RNF-04 (absorbida; duplicada con RNFC-19) | T-1 |
| RNFC-15 | RN-AU09, los registros de auditoría son inmutables | RNF-07 | Propuesta del equipo; sin CA de rechazo |
| RNFC-16 | RN-AU15, solo el Gerente consulta registros de auditoría | RNF-01 | Condicionado, supuesto (P-88) |
| RNFC-17 | RN-R13, auditabilidad de las consultas de reportes | RNF-06 (instancia, en la Condición) | Condicionada a T-9 y P-90 |
| RNFC-18 | RN-R14, solo el Gerente consulta reportes | RNF-01 | Condicionado, supuesto (P-88); fila parcial |
| RNFC-19 | RN-T01, el Detalle de auditoría nunca contiene contraseñas, ni en texto plano ni cifradas | RNF-04 (ancla) | T-1 |
| RNFC-20 | RN-T03, mecanismo de sesión | RNF-02; vencimiento en P-70; cierre explícito en P-Q2 | P-105 |
| RNFC-21 | RN-S10a, el Empleado registra las solicitudes con sesión iniciada | RNF-01 | TRA-02 |
| RNFC-22 | RN-AP11b, solo un usuario con el rol Aprobador decide solicitudes | Cubierto por RNF-01 y RF-166, verificado por HU-13 CA-7 | TRA-06 |
| RNFC-23 | RN-D07a, el Empleado registra la devolución | RNF-01 (parte de RNFC-06) | P-42 |
| RNFC-24 | RN-D14c, solo un usuario con el rol Responsable de Activos confirma la recepción | Cubierto por RNF-01 y RF-166, verificado por HU-24 CA-6 | TRA-11 |
| RNFC-25 | RN-RD13a, el Técnico de Soporte consulta todos los reportes de daño | RNF-01 (parte de RNFC-07) | P-55 |
| RNFC-26 | RN-H09d, el técnico del mantenimiento tiene el rol Técnico de Soporte | Cubierto por RNF-01 y RF-166, verificado por HU-29 CA-7 | TRA-16 |
| RNFC-27 | RN-U09b, la contraseña nunca se muestra | RNF-04 | HU-33 CA-3 |
| RNFC-28 | RN-U20b, el mensaje de usuario inactivo solo se muestra con credenciales correctas | RNF-05 (segunda oración) | Propuesta (P-71) |
| RNFC-29 | RN-U21b, la contraseña nueva debe ser distinta de la actual | Sin RNF ni RF: HAL-116 | La docente decide si se abre RF-173 (HU-37 CA-3; P-61) |
| RNFC-30 | RN-T02b, auditabilidad | RNF-06 (ancla) | T-2; P-89 |
 
*Fuente: elaboración propia a partir de la lista de RNFC (sección 5 del documento de listas) y de las fichas de RNF-01 a RNF-09.*
 
**Nota de cobertura. **Las 12 filas del Anexo C sin RNFC de origen (Activo 7, Acta 2, HU-14, listarAprobadas() y generarAviso()) las cubre RNF-01 porque mide contra todo el Anexo C; TRA-04 y TRA-08 se citan en su Origen. RNFC-31 no se crea.
 
## **2.2.7.7 Matriz de trazabilidad de los RNF**
 
La matriz relaciona cada RNF con el RF que lo implementa, las RN de origen, el CA o la prueba PV que lo verifica, las preguntas abiertas y su condición. Los 9 RNF tienen al menos un CA o una prueba nombrada.
 
**Tabla 79. Matriz RNF → RF, RN de origen, CA o PV, pregunta y condición**
 
| **RNF** | **RF que lo implementa** | **RN de origen** | **CA o PV** | **Pregunta** | **Condición** |
| --- | --- | --- | --- | --- | --- |
| RNF-01 | RF-166 | RN-C17, S20, AS24, D21, RD18, H16, U23, RP12, CA14, AU15, R14, S10a, AP11b, D07a, D14c, RD13a y H09d | PV-01; HU-13 CA-7 (sin rol Aprobador), HU-24 CA-6, HU-29 CA-7, HU-45 CA-7, HU-46 CA-7 | P-75, P-77, P-27, P-40, P-57, P-88, P-16/P-31, P-Q1, P-55 | Matriz pendiente; conteos 52 / 7 / 3 (50 / 9 / 3 si P-55 deja abiertas dos filas) |
| RNF-02 | Ninguno específico; RF-40 inicia la sesión y RF-167 atribuye las acciones automáticas | RN-T03 | PV-02; HU-36 CA-1 (solo el inicio) | P-70, P-105, P-Q2 | Vencimiento y cierre sin medida |
| RNF-03 | RF-35 y RF-41 | RN-U07a | HU-32 CA-1, HU-37 CA-1; PV-03 | P-62 | PV-03 descarta el texto plano; no prueba irreversibilidad ni algoritmo |
| RNF-04 | RF-37; RF-160 (Detalle opcional) | RN-U09b, RN-AU08, RN-T01 | HU-33 CA-3, HU-36 CA-1; PV-04 | P-92, P-98 | T-1 |
| RNF-05 | RF-40 y RF-144 (no fijan el texto del mensaje) | RN-U19, RN-U20b | HU-36 CA-3 y CA-4 | P-71 | Segunda oración: propuesta del equipo |
| RNF-06 | RF-160 a RF-164 (RF-165 condicionado) | RN-T02a, RN-T02b, RN-A17, RN-R13 | PV-05 (sin CA) | P-89, P-06, P-90, P-97, P-98 | T-2; T-9; MOD-38 |
| RNF-07 | Ninguno (restricción del UML v6 sobre Auditoria) | RN-AU09 | PV-06 | Ninguna | Propuesta del equipo |
| RNF-08 | Ninguno (catálogo de mensajes de todos los RF) | Ninguna | PV-07 | P-Q3 | Propuesta del equipo; los 2 minutos son el valor de Persona |
| RNF-09 | RF-56, RF-03 y RF-93 | Ninguna | PV-08 | P-Q3 | Propuesta del equipo: 1.000 activos y 3 segundos |
 
*Fuente: elaboración propia a partir de las fichas de RNF-01 a RNF-09, los documentos de RN y de RF y el consolidado de 46 HU.*
 
## **2.2.7.8 Pruebas de verificación**
 
Las pruebas PV-01 a PV-08 se definen solo en este documento; no forman una lista aparte en el documento de listas. Cada una indica qué se prueba y el alcance de lo que demuestra.
 
**Tabla 80. Pruebas de verificación de los RNF**
 
| **PV** | **RNF** | **Qué se prueba** | **Alcance** |
| --- | --- | --- | --- |
| PV-01 | RNF-01 | Para cada fila del Anexo C con rol definido, ejecutar la operación con cada rol no listado y comprobar el rechazo, la ausencia de datos y el mensaje de falta de permiso. | 52 filas completas y 7 parciales (solo los roles definidos); 3 filas sin prueba por rol. |
| PV-02 | RNF-02 | Invocar las 60 operaciones públicas (62 menos iniciarSesion() y generarAviso()) sin sesión y comprobar el rechazo. | No cubre el vencimiento ni el cierre de la sesión (P-70, P-Q2). |
| PV-03 | RNF-03 | Inspeccionar la columna Password completa tras registrar y tras cambiar la contraseña: 0 valores iguales al texto plano. | Descarta el texto plano; no prueba irreversibilidad ni algoritmo (P-62). |
| PV-04 | RNF-04 | Tras registrar un usuario y cambiar una contraseña, revisar consultas, respuestas, mensajes y todas las columnas de Auditoria: 0 apariciones de la contraseña en texto plano o cifrada. | Complementa HU-33 CA-3 y HU-36 CA-1. |
| PV-05 | RNF-06 | Ejecutar una asignación, una devolución registrada, una confirmación de recepción y una baja, y comprobar en Auditoria el registro con usuario, acción, entidad, registro afectado, fecha y hora. | Sin CA; la consulta de reportes queda condicionada a T-9 y P-90. |
| PV-06 | RNF-07 | (a) Inspeccionar el UML v6: 0 operaciones públicas de modificación o eliminación sobre Auditoria. (b) Comparar los registros previos de Auditoria antes y después de ejecutar PV-01 a PV-05 y los CA de las demás operaciones: 0 alterados. | No cubre el acceso directo a la base de datos. |
| PV-07 | RNF-08 | (a) Inspeccionar el catálogo de mensajes: todo mensaje de tipo Error nombra el campo u objeto y la condición incumplida, salvo M-230. (b) Prueba cronometrada del registro de una solicitud por un Empleado capacitado. | Mensajes límite M-71, M-189 y M-272 conformes. Catálogo: 273 mensajes, 207 de tipo Error, incluidos 2 pendientes de P-13. |
| PV-08 | RNF-09 | Cargar 1.000 activos de prueba, ejecutar cada consulta y medir el tiempo en el equipo de pruebas del proyecto. | Un usuario a la vez; equipo de pruebas sin definir. |
 
*Fuente: elaboración propia a partir de las fichas de RNF-01 a RNF-09.*
 
## **2.2.7.9 Preguntas y decisiones abiertas**
 
Las preguntas nuevas de la fase de RNF llevan el prefijo P-Q y se numeran de P-Q1 a P-Q5. Antes de abrir cada una se buscó una pregunta existente equivalente y se cita la que se descartó.
 
**Tabla 81. Preguntas nuevas de la fase de RNF**
 
| **P-Q** | **Pregunta** | **Origen** | **P-xx equivalente descartada** | **Estado** |
| --- | --- | --- | --- | --- |
| P-Q1 | ¿Qué otros roles (Aprobador, Responsable de Activos, Gerente) consultan la decisión de una solicitud, además del Empleado dueño de la solicitud? | HU-14; RN-AP14; fila HU-14 de la Tabla 43 (COR-117) | P-21 trata de Solicitud (RN-S11, S14, S19); P-24, de si el Empleado ve el nombre del aprobador; P-74, de permisos y categorías | Aprobada |
| P-Q2 | ¿La sesión debe poder cerrarse de forma explícita (cerrar sesión), además de vencer por inactividad (P-70)? | RNFC-20; RNF-02 | P-70 trata de la expiración, no del cierre explícito | Abierta, sin cambio al modelo |
| P-Q3 | ¿Cuántos activos y cuántos usuarios tendrá registrados el sistema de Nexa Servicios, qué tiempo de respuesta es aceptable para consultar el inventario y las asignaciones vigentes y cuánto tiempo debería tomar registrar una solicitud? | RNF-08 y RNF-09; 1.7, pregunta 13 | P-90 trata del volumen de registros de auditoría; P-44, de los días del aviso | Aprobada |
| P-Q4 | ¿En qué horario necesita Nexa Servicios usar el sistema y cuánto tiempo sin servicio puede tolerar? | Categoría Disponibilidad | P-48 trata del correo automático; P-70, de la sesión | Aprobada |
| P-Q5 | ¿Desde qué dispositivos y navegadores debe usarse el sistema (equipo de escritorio, celular), sabiendo que el Alcance 1.2 deja fuera la aplicación móvil nativa? | Categoría Compatibilidad; 1.7, pregunta 13 | Ninguna existente trata de plataforma | Aprobada |
 
*Fuente: elaboración propia a partir del apartado 3.2 del documento de listas y de la sección H del consolidado de 46 HU.*
 
**Tabla 82. Decisiones abiertas para el cliente y para la docente**
 
| **Para** | **Decisión o respuesta pendiente** | **Ítems** | **Efecto en los RNF** |
| --- | --- | --- | --- |
| Cliente | Las cinco preguntas nuevas de la fase de RNF | P-Q1 a P-Q5 | RNF-01 (fila HU-14), RNF-02, RNF-08 y RNF-09; Disponibilidad y Compatibilidad |
| Cliente | Matriz rol–operación y filas con rol por definir | P-75, P-77, P-27, P-40, P-57, P-88, P-16/P-31, P-55 | RNF-01 (conteos 52 / 7 / 3) |
| Cliente | Firma, cifrado, política de contraseña, sesión y mensaje de usuario inactivo | P-38, P-62, P-61, P-70, P-71 | RNF-02, RNF-03 y RNF-05; RNFC-05 queda en P-38 |
| Cliente | Qué se audita y qué contiene el registro | P-89, P-06, P-90 (T-9), P-97, P-98, P-92 | RNF-04 y RNF-06 |
| Docente | T-2: auditabilidad separada de RN-T02a | T-2 | RNF-06 |
| Docente | T-11: tensión entre la encuesta y el alcance | T-11 | Origen de RNF-08 y RNF-09 y de las categorías sin ficha |
| Docente | Si se abre RF-173 para la contraseña nueva distinta de la actual | HAL-116 (HU-37 CA-3, RNFC-29) | Ninguno: RNFC-29 no es RNF |
| Docente | Si exige ficha de RNF en las cinco categorías | Disponibilidad y Compatibilidad | Se redactarían RNF solo si hay origen o respuesta del cliente |
| Docente | Validar las propuestas del equipo | RNF-07, RNF-08, RNF-09 | Los tres siguen pendientes de validar |
 
*Fuente: elaboración propia a partir de los ítems abiertos de la fase de RNF y del documento de listas.*
 
## **2.2.7.10 Cuentas finales y verificación cruzada**
 
**Tabla 83. Cuentas finales de la fase de RNF**
 
| **Concepto** | **Valor** |
| --- | --- |
| **RNF totales** | 9 (RNF-01 a RNF-09) |
| **RNF por categoría** | Seguridad 7; Usabilidad 1; Rendimiento 1; Disponibilidad 0; Compatibilidad 0 |
| **RNFC cubiertos** | 30 de 30 |
| **Preguntas P-Q nuevas** | 5 (P-Q1 a P-Q5) |
| **Correcciones nuevas (COR)** | 3 (COR-116 a COR-118); la lista llega a COR-118 |
| **Hallazgos nuevos (HAL)** | 1 (HAL-116); la lista llega a HAL-116 |
| **Cambios al modelo (MOD)** | 0; la lista queda en MOD-59 |
| **Pruebas de verificación** | 8 (PV-01 a PV-08) |
| **RF candidatos acumulados** | 0 (RNFC-29 quedó en HAL-116) |
| **Tablas del documento** | 18 (Tabla 67 a Tabla 84) |
 
*Fuente: elaboración propia a partir de las fichas de RNF, la tabla de cobertura y el documento de listas.*
 
**Tabla 84. Verificación cruzada de la fase de RNF**
 
| **Verificación** | **Resultado** |
| --- | --- |
| **Todo RNF con al menos un CA o una PV** | 9 de 9. Los CA citados existen en el consolidado de 46 HU: HU-13 CA-7, HU-24 CA-6, HU-29 CA-7, HU-45 CA-7, HU-46 CA-7, HU-32 CA-1, HU-37 CA-1, HU-33 CA-3, HU-36 CA-1, CA-3 y CA-4. |
| **Sin contradicción con RN ni RF** | 0 contradicciones nuevas. RNF-01 y RNF-02 usan el mismo rechazo y las mismas excepciones que RF-166, RF-40 y RF-167. RNF-03 no contradice a RF-35 ni a RF-41: la cifra la dice el diccionario. RNF-05 complementa a RF-40 y RF-144. RNF-06 queda acotado a RF-160 a RF-164; su diferencia con RN-T02b y RNFC-30 se declara en la cobertura y en la Condición. Diferencias ya registradas: HAL-104, COR-116, COR-117 y COR-118. |
| **Códigos continuos** | RNF-01 a RNF-09; PV-01 a PV-08; P-Q1 a P-Q5; COR-116 a COR-118; HAL-116; Tablas 67 a 84. |
| **0 números propios presentados como datos del cliente** | Cumple. Son del equipo y están marcados: 1.000 activos, 3 segundos y 2 minutos. El «100 %» es una medida binaria y los conteos 52 / 7 / 3 y 60 salen del Anexo C. Las únicas cifras del cliente citadas son la pregunta 9 (4 respuestas), N-03 (6 de 19), N-07 (3), N-02 (9), N-01 (5), 1 respuesta sobre el celular y 19 encuestados, y ninguna se usa como meta. |
| **Partes pendientes de validar** | 6 de los 9 RNF tienen alguna parte pendiente de validar con el cliente o con la docente: RNF-01 (matriz), RNF-05 (segunda oración), RNF-06 (T-2 y T-9), RNF-07, RNF-08 y RNF-09. |
 
*Fuente: elaboración propia a partir de las fichas de RNF, el consolidado de 46 HU y los documentos de RN, de RF y de listas.*
