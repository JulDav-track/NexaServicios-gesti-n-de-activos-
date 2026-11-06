1.7 Recolección de la información y metodología de trabajo
 
**1.7.1 Instrumento de entrevista. **
 
La información del dominio se recolectó con un cuestionario estructurado, de preguntas mayormente cerradas y dos abiertas, aplicado a empleados de Nexa Servicios S.A.S. de las áreas involucradas en la gestión de activos.
 
**Tabla 1. Ficha de la entrevista**
 
| **Campo** | **Contenido** |
| --- | --- |
| Entrevistados | 19 empleados de Nexa Servicios S.A.S. |
| Rol / área | Talento Humano 8, Área de Operaciones 6, Área de TI 4, Gerencia 1. El cuestionario registra el área del entrevistado. |
| Fecha | Del 23 al 25 de abril de 2026 |
| Medio | Cuestionario en línea (Google Forms) |
| Aplicado por | Equipo del proyecto (Grupo 6) |
 
**Tabla 2. Preguntas aplicadas**
 
| **N.º** | **Pregunta (redacción textual del formulario)** | **Tipo de respuesta** |
| --- | --- | --- |
| 1 | Área a la que pertenece | Selección única: TI, Operaciones, Talento Humano, Gerencia |
| 2 | Nivel de problema con el inventario de equipos | Escala: Nada, Poco, Algo, Mucho, Demasiado |
| 3 | Nivel de problema con el seguimiento de equipos | Escala: Nada, Poco, Algo, Mucho, Demasiado |
| 4 | Acuerdo con el sistema actual | Selección (valores obtenidos: totalmente de acuerdo, totalmente en desacuerdo) |
| 5 | Dificultad para localizar equipos | Escala: Nada, Poco, Algo, Mucho, Demasiado |
| 6 | Dificultad para hacer solicitudes de equipos | Escala: Nada, Poco, Algo, Mucho, Demasiado |
| 7 | Funcionalidad que más desea | Selección con opción abierta (alertas preventivas, historial de reparaciones, otras) |
| 8 | Método actual para gestionar equipos | Selección: verbal, correo electrónico, WhatsApp, sistema de la empresa, Excel compartido |
| 9 | Información más importante | Selección múltiple: quién tiene cada equipo, quién autorizó, mantenimiento, bajas, facilidad de uso |
| 10 | ¿Se firma un acta al entregar un equipo? | Sí, a veces, no, no sé si existe ese proceso |
| 11 | Dato más relevante | Selección: fecha de entrega, estado actual, responsable de aprobación, historial de mantenimiento |
| 12 | Problema principal | Abierta |
| 13 | Sugerencia de mejora | Abierta |
| 14 | Acción automática deseada | Selección: acta digital firmada, notificar a TI, cambio automático de responsable, todas las anteriores |
 
*Fuente: elaboración propia a partir del cuestionario aplicado (abril de 2026).*
 
**1.7.2 Síntesis de las respuestas. **
 
**Tabla 3. Síntesis de resultados (n = 19)**
 
| **Aspecto** | **Resultado** |
| --- | --- |
| Inventario (preguntas 2 y 3) | Dificultad de inventario: Nada 7, Poco 7, Algo 2, Mucho/Demasiado 3. Dificultad de seguimiento: Nada 8, Poco 2, Algo 4, Mucho/Demasiado 5. |
| Localizar equipos y hacer solicitudes (5 y 6) | Localizar: Nada 9, Poco 2, Algo 3, Mucho/Demasiado 5. Solicitudes: Nada 2, Poco 5, Algo 6, Mucho/Demasiado 6 (la dificultad alta más frecuente). |
| Sistema actual (4) | Totalmente de acuerdo 10; totalmente en desacuerdo 9. |
| Método actual (8) | Verbal 5, correo 5, sistema de la empresa 5, WhatsApp 3, Excel compartido 1. |
| Información más importante (9) | Saber quién tiene cada equipo 9; bajas 7; autorizaciones 6; mantenimiento 4; facilidad de uso 4 (cuentan una respuesta que marcó todas las opciones). |
| Firma del acta (10) | Sí 11, a veces 3, no 4, no sabe si existe el proceso 1. |
| Funcionalidad deseada (7) | Historial de reparaciones 8, alertas preventivas 7, solicitud fácil de daño 3, mostrar responsable de atención 1. |
| Dato más relevante (11) | Fecha de entrega 6, estado actual 5, historial de mantenimiento 5, responsable de aprobación 3. |
| Acción automática deseada (14) | Todas las anteriores 7, notificar a TI 5, cambio automático de responsable 5, acta digital firmada 2. |
 
*Fuente: cuestionario aplicado a empleados de **Nexa** Servicios (abril de 2026).*
 
**Problemas señalados (pregunta 12). **Los entrevistados describieron desorden y falta de organización o de control, falta de registro específico, duplicidad y pérdida de tiempo, falta de claridad y confusión en las entregas, dificultad para identificar equipos y responsables, retrasos por falta de inventario, aumento de los tiempos de atención y solicitudes sin prioridad. También pidieron conocer el inventario en tiempo real, encontrar equipos rápidamente y saber cuáles están operativos. Algunas respuestas no aportaron información («X», «Ok», «Reuniones», «Sin problema relevante»).
 
**Sugerencias de mejora (pregunta 13). **Propusieron una plataforma centralizada (con código QR), una base de datos organizada, una mesa de servicios estructurada, organización integral del flujo de trabajo, registro fácil de préstamos, disponibilidad inmediata de los equipos, notificaciones de disponibilidad, un listado ordenado de solicitudes, reportes e historial en el celular, y un sistema simple y rápido. Una respuesta pidió automatización total y otra se calificó a sí misma como una idea poco realista (equipos nuevos siempre).
 
**1.7.3 Análisis de la entrevista. **
 
De las respuestas se detectaron las siguientes necesidades. Cada historia de usuario de la sección 2.1 debe rastrearse hasta una de ellas (identificadas como N-01 a N-11). Cuando la evidencia proviene del análisis documental (correos, capturas de WhatsApp y archivos Excel), se indica.
 
**Tabla 4. Necesidades detectadas y elementos del proyecto que originan**
 
| **ID** | **Necesidad detectada** | **Evidencia** | **Elementos del proyecto** |
| --- | --- | --- | --- |
| N-01 | Tener un registro centralizado de los equipos, con su estado actual y disponibilidad. | 14 de 19 usan canales informales; «estado actual» es el dato más relevante para 5; problemas de desorden y falta de registro; pedidos de inventario en tiempo real y disponibilidad inmediata. Análisis documental: no existe identificador único del activo. | Activo, Categoria, consulta de inventario |
| N-02 | Saber en todo momento quién tiene cada equipo y poder localizarlo. | Es la información más importante (9 respuestas); localizar equipos es dificultad alta para 5; problema de identificación de equipos y responsables. | Custodio, Asignacion |
| N-03 | Solicitar equipos por un canal formal, con orden y prioridad. | Las solicitudes tienen la dificultad alta más frecuente (6 de 19); una respuesta menciona solicitudes sin prioridad y otra pide un listado ordenado. | Solicitud |
| N-04 | Conocer quién autorizó cada solicitud, con aprobaciones trazables. | Autorizaciones señaladas en 6 respuestas; responsable de aprobación es el dato relevante para 3. Análisis documental: aprobaciones informales («ok, proceda»). | Aprobacion |
| N-05 | Que la entrega de equipos quede respaldada por un acta firmada de forma consistente. | 8 de 19 indican que el acta no se firma siempre; 9 piden acta digital firmada (2 directamente y 7 en «todas»); la fecha de entrega es el dato relevante para 6. Análisis documental: no hay actas ni plantillas. | Acta_De_Entrega, Asignacion. |
| N-06 | Registrar préstamos y devoluciones con fechas claras. | Fecha de entrega relevante para 6; una respuesta pide registro fácil de préstamos y otra señala confusión en entregas. | Asignacion, Devolucion |
| N-07 | Reportar daños con facilidad y avisar a TI. | Solicitud fácil de daño (3); notificar a TI (5, más 7 en «todas»); reportar mantenimiento fácil (1). | Reporte_de_Danios; el aviso por correo al reportar un daño queda como trabajo futuro (Alcance 1.2). |
| N-08 | Consultar el historial de reparaciones y mantenimiento de cada equipo. | Historial de reparaciones es la funcionalidad más pedida (8); historial de mantenimiento es dato relevante para 5. Análisis documental: registros dispersos. | Historial_Mantenimientos |
| N-09 | Recibir alertas preventivas antes de que un equipo falle. | 7 de 19. Tensión con el alcance: el mantenimiento preventivo avanzado está fuera del proyecto. Decisión pendiente. | Historial_Mantenimientos  (Tipo_Mantenimiento: Preventivo o Correctivo); las alertas preventivas están fuera del alcance (Alcance 1.2). Decisión pendiente de confirmar con el cliente. |
| N-10 | Cambiar automáticamente el responsable de un equipo. | Cambio automático de responsable (5, más 7 en «todas»). | Asignacion, Custodio, Auditoria. el modelo no tiene un método de cambio de responsable |
| N-11 | Registrar las bajas de equipos de forma clara. | Bajas señaladas como información importante en 7 respuestas (incluye una que marcó todas). | Activo (estado Baja) |
 
*Fuente: elaboración propia a partir del cuestionario y del análisis de documentos.*
 
**Reglas de negocio detectadas o implícitas**
 
Se numerarán como RN en la sección 2.2 y deben validarse con el cliente:
 
- Toda entrega de un equipo debe quedar respaldada por un acta firmada por quien lo recibe (N-05).
 
- Toda solicitud debe tener una decisión de aprobación atribuible a una persona identificada (N-04).
 
- Cada equipo se identifica de forma única (análisis documental).
 
- Solo un equipo disponible puede entregarse (implícita en las respuestas sobre disponibilidad).
 
**Restricciones**
 
- Quedan fuera del alcance: compras, valuación o depreciación contable, integración con nómina o ERP, aplicación móvil nativa, accesorios o consumibles y mantenimiento preventivo avanzado.
 
- El proyecto dispone de 16 semanas con 12 horas semanales por integrante (192 horas) y un equipo de dos personas.
 
- El modelo de datos y el diagrama de clases ya definidos acotan las funcionalidades que se pueden describir.
 
**Capacidades sin respaldo directo en la encuesta**
 
Algunas partes del modelo no se preguntaron en el cuestionario. Según el protocolo de subsanación de la plantilla, deben respaldarse con elicitación complementaria, con otra fuente documentada (alcance, observación) o con validación del cliente; de lo contrario se consideran funcionalidad inventada.
 
**Tabla 5. Capacidades por respaldar**
 
| **Capacidad (clases)** | **Situación** | **Tratamiento propuesto** |
| --- | --- | --- |
| Usuarios, roles y permisos (clases Usuario y Rol_Permiso; enumeraciones Nombre_Rol y Nombre_Permiso, ENUM sin tabla) | Figura en el alcance del proyecto; la encuesta no pregunta por ello. | Citar el alcance como fuente y validarlo con el cliente. |
| Catálogos (clase Categoria; enumeración Tipo_Documento, ENUM sin tabla) | Son entidades maestras; alguien debe gestionar sus registros. | Categoria: ya existen las HU-41 a HU-44 (registrar, consultar, actualizar e inactivar), propuesta del equipo, pendiente de validar con el cliente. Tipo_Documento (ENUM): sin HU de gestión; sus valores CC, CE y PA se declaran en el script DDL, y CE es propuesta del equipo, pendiente de validar con el cliente. |
| Auditoría (Auditoria) | Figura en el alcance; la encuesta no la menciona. | Citar el alcance y validar con el cliente. |
| Reportes bajo demanda (Reportes) | Figura en el alcance; la encuesta solo menciona reportes en el celular (1 respuesta). | Entrevista complementaria breve con el Responsable de Activos. |
| Notificaciones de devolución (Notificacion_De_Devolucion) | Figura en el alcance; la encuesta solo menciona notificaciones de disponibilidad (1 respuesta). | Entrevista complementaria breve con el Responsable de Activos. |
 
**Limitaciones de la información**
 
- El instrumento es un cuestionario de preguntas mayormente cerradas, con poca profundidad cualitativa.
 
- La muestra es pequeña (19 respuestas); Gerencia tiene una sola, y los roles de Aprobador y Técnico de Soporte no se distinguen con claridad.
 
- Varias respuestas abiertas no aportan información, y las escalas se contestaron en valores extremos en algunas preguntas.
 
- Por lo anterior, los hallazgos se complementarán con observación del proceso y con entrevistas complementarias.
 
**1.7.4 Metodología de trabajo. **
 
**Metodología seleccionada: RUP (Proceso Unificado), adaptado al contexto académico. **RUP es un proceso iterativo e incremental, dirigido por casos de uso y centrado en la arquitectura, organizado en cuatro fases: Inicio, Elaboración, Construcción y Transición. En este proyecto se aplica en versión ligera (equipo de dos personas, 16 semanas y entregable documental integral) y se ejecuta sobre la Ruta Oficial del Curso: un plan con fases y entregables definidos, puntos de control, requisitos capturados con historias de usuario y criterios de aceptación, y gestión de la configuración transversal (líneas base y CRF).
 
**Alternativas consideradas**
 
Se compararon tres enfoques frente a las características reales del proyecto: una ruta con compuerta de control antes de programar, un entregable documental único, un equipo pequeño y requisitos que todavía se están afinando.
 
**Tabla 6. Comparación de metodologías candidatas**
 
| **Criterio** | **Waterfall (cascada)** | **Scrum** | **RUP adaptado** |
| --- | --- | --- | --- |
| Ajuste con la ruta del curso | Parcial: comparte fases y compuertas, pero no admite retorno a fases previas ni entrega incremental. | Bajo: el diseño surge sprint a sprint; la ruta exige diseño cerrado antes del código. | Alto: las fases 0–3 y la compuerta M2 equivalen a Inicio, Elaboración, hito de arquitectura y Construcción. |
| Manejo del cambio de requisitos | Deficiente: los cambios se descubren tarde, en pruebas. | Excelente, pero sin la disciplina documental que exige la asignatura. | Bueno: iteraciones controladas con gestión del cambio (CRF) y líneas base. |
| Documentación y diseño previo | Alta, pero sin realimentación. | Mínima por diseño. | Alta y trazable (casos de uso, clases, secuencia, matriz de trazabilidad). |
| Roles requeridos | Roles secuenciales por fase. | Product Owner, Scrum Master y equipo de 3 a 9 personas; difícil de sostener en un equipo reducido. | Roles flexibles que se pueden combinar en un equipo pequeño. |
| Riesgo principal en este proyecto | Validar tarde un sistema que no resuelve el problema real. | Programar sin el modelo cerrado, contradiciendo la compuerta M2. | Exceso de formalismo si no se adapta (mitigado con la versión ligera). |
 
*Fuente: elaboración propia a partir de la ruta oficial del curso y de las características del proyecto.*
 
**Justificación**
 
- **Coincidencia con la ruta oficial. **Cada tramo de la ruta del curso tiene un equivalente directo en RUP (Tabla 7), por lo que la metodología no contradice la estructura de la asignatura.
 
- **Trazabilidad como necesidad central. **El análisis documental y la encuesta coinciden en que el problema es la falta de trazabilidad (quién tiene cada equipo, quién autorizó, qué mantenimiento se hizo). RUP, dirigido por casos de uso y con artefactos vinculados entre sí, responde a esa necesidad.
 
- **Requisitos aún en evolución. **La encuesta reveló demandas que no estaban en el alcance inicial (alertas preventivas, notificación a TI, priorización de solicitudes). El carácter iterativo de RUP permite absorberlas de forma controlada y no descubrirlas al final, como ocurriría en Waterfall.
 
- **Diversidad de interesados. **Participan al menos cinco perfiles (Responsable de Activos, Empleado, Aprobador, Técnico de Soporte y Gerente) con necesidades distintas. Los casos de uso por actor son el mecanismo natural para ordenarlas.
 
- **Gestión del riesgo. **RUP incorpora el análisis de riesgos desde el Inicio, útil para el principal riesgo detectado: la presión por ampliar el alcance más allá de lo acordado.
 
**Por qué no Waterfall ni Scrum. **Waterfall puro asume que no hay retorno a fases previas y prueba al final, mientras que la propia ruta incluye correcciones hacia atrás, gestión del cambio y un corte vertical temprano. Scrum supone Product Owner, Scrum Master y un equipo de tres a nueve personas, y su diseño emergente contradice la compuerta M2, que exige diseño cerrado antes de programar.
 
**Adaptación de RUP al proyecto**
 
**Tabla 7. Correspondencia entre RUP, la ruta del curso y los objetivos específicos**
 
| **Fase de RUP** | **Ruta del curso** | **Objetivo específico** | **Hito de control** |
| --- | --- | --- | --- |
| Inicio | Fase 0 — Concepción: problema, alcance, objetivos, marco teórico, recolección de información, cronograma. | OE1 (parcial) | Alcance y objetivos acordados. |
| Elaboración | Fase 1 — Análisis y Fase 2 — Diseño: HU, requisitos, casos de uso, mockups, diccionario, MER, clases, actividades, DDA, secuencia, estados, matriz de trazabilidad. | OE1 y OE2 | Compuerta M2: matriz de trazabilidad cerrada y leída. |
| Construcción | Fase 3 — Construcción: script SQL, repositorio Git, código MVC empezando por un corte vertical (vertical slice). | OE3 | Arquitectura ejecutable y luego incrementos por iteración. |
| Transición | Pruebas funcionales del corte vertical y ajustes finales. | OE4 (parcial en el semestre) | Validación frente a los requisitos y criterios de aceptación. |
 
*Fuente: elaboración propia.*
 
Adaptaciones concretas frente al RUP completo:
 
- **Versión ligera: **solo se producen los artefactos que exige la plantilla del curso; se omiten los que RUP prevé para proyectos de gran escala.
 
- **Captura de requisitos: **historias de usuario con criterios de aceptación en el formato oficial, trazables hacia atrás (a las necesidades de la sección 1.7.3) y hacia adelante (a los RF y casos de uso).
 
- **Puntos de control: **auditoría cruzada del diccionario, el MER y las clases (7b), lectura cruzada entre equipos (12b) y la compuerta M2, según la cual sin la matriz de trazabilidad cerrada y leída no se escribe código.
 
- **Iteraciones cortas en Construcción: **se trabaja en iteraciones de una a dos semanas sobre un backlog de historias de usuario priorizado con el método Alta/Media/Baja
 
- **Gestión del cambio y de la configuración, transversal: **todo cambio entra mediante una solicitud de cambio (CRF), los documentos llevan historial y control de versiones, las líneas base se congelan al cerrar cada hito, y en Git cada commit cita su CRF y la etiqueta es la línea base.
 
- **Roles combinados: **los dos integrantes combinan los roles de analista, diseñador, desarrollador y verificador, con revisión cruzada de artefactos (ver sección 1.8).
 
**Riesgo y mitigación. **El riesgo de RUP en un equipo pequeño es el exceso de formalismo, que se mitiga con la versión ligera. El riesgo de descubrir tarde errores o requisitos faltantes se mitiga con los puntos de control, el control de cambios mediante CRF y líneas base, la elicitación complementaria prevista en 1.7.3 y el corte vertical temprano de la Fase 3.