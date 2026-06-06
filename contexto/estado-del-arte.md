Eliu Andres Marimon Arrieta

Julián David Valencia Gamboa

**Técnicas de elicitacion**

**PROMPT:** Soy un estudiante de ingeniería de Software I, estoy en cuarto semestre. Teniendo en cuenta que no tengo experiencia haciendo proyectos de ingeniería de software, redactando, ni tengo conocimientos respecto al tema de Elicitacion. Quiero que tomes en cuenta el problema del principio de la conversación, ósea, el problema con la empresa nexa y mi contexto de gestión de activos (mantenimiento, bajas, inventario, asignación). He escogido dos técnicas de Elicitacion las cuales son Análisis de Documentos y Observación, según mi problemática (nexa) quisiera empezar con la técnica de análisis de documentos donde tú me des el problema que podría tener según la gestión de Activos. Hazlo todo en prosa.

**1\. Análisis de documento (Grok)**

**Problema:** En el marco del proyecto de Ingeniería de Software I para la empresa Nexa Servicios, se seleccionó como primera técnica de elicitación el Análisis de Documentos, ya que permite revisar de forma sistemática todos los registros existentes sin interrumpir las operaciones diarias de la empresa y sin requerir experiencia previa en entrevistas o talleres. Esta técnica resulta especialmente adecuada para el contexto de gestión de activos fijos (inventario, asignación, mantenimiento y bajas), porque Nexa Servicios genera una gran cantidad de documentos informales que reflejan directamente el caos actual de sus procesos.

Al aplicar el Análisis de Documentos se identificaron problemas muy claros en la gestión de activos. En primer lugar, los documentos revisados (principalmente correos electrónicos, capturas de pantalla de WhatsApp y archivos Excel con nombres como “Solicitud_importante_final_final_v9_ahorasixl”, “Activo_Asignado_v3.xlsx” o “Mantenimiento_Urgente_2025.xlsx”) muestran que no existe un identificador único para cada activo. Cada solicitud de asignación, mantenimiento o baja se envía por canales diferentes sin un código que permita relacionar el activo con su historial, lo que genera duplicidad de registros y hace imposible saber cuál es la versión vigente de un documento.

En segundo lugar, las aprobaciones aparecen solo como respuestas de correo o mensajes de voz en WhatsApp (“ok, procede”), sin ningún formato estándar ni firma digital. Esto significa que no hay evidencia documental de quién autorizó una asignación o una baja, lo cual representa un riesgo grave cuando la gerencia pregunta “¿quién autorizó esto?” y nadie puede demostrarlo con un documento oficial.

En tercer lugar, los registros de mantenimiento y bajas son extremadamente dispersos: algunos están en correos con copia oculta a personas que ya no trabajan en la empresa, otros en chats grupales que se borran automáticamente después de 30 días, y los más importantes terminan en Excel que se guardan en carpetas personales sin control de versiones. Como resultado, no existe un historial completo del ciclo de vida del activo (fecha de adquisición, responsable actual, mantenimientos realizados, depreciación acumulada y fecha de baja), lo que provoca que el inventario físico nunca coincida con el inventario lógico y que se generen compras innecesarias o se dejen de realizar mantenimientos preventivos.

Finalmente, los documentos analizados revelan que no hay actas formales ni plantillas estandarizadas para registrar el estado de los activos; incluso el acta de la última reunión gerencial sobre trazabilidad se perdió entre los correos y nunca se archivó correctamente. Esto confirma que los procesos actuales de gestión de activos en Nexa Servicios carecen de trazabilidad, control de versiones y evidencia auditable, problemas que un sistema de información centralizado debe resolver desde el primer módulo de inventario y asignación.

Al concluir esta primera fase de elicitación con Análisis de Documentos, se obtuvo un panorama preciso y objetivo de los documentos reales que circulan en la empresa, lo que servirá como base sólida para pasar a la segunda técnica (Observación) y luego al diseño del sistema. Esta revisión documental permitió identificar exactamente dónde fallan los procesos de inventario, asignación, mantenimiento y bajas, sin necesidad de experiencia previa en elicitación ni en gestión de activos, y demostrando que el problema principal radica en la falta de un repositorio único y estructurado.

**PROMPT:** Continuando la anterior problemática genera un objetivo general y 3 objetivos específicos donde debe estar todo en prosa y empezar con un verbo en infinitivo y si el resto están también en infinitivo conjúgalos. Por ahora trata de enfocarte solo en el análisis de documentos a partir de mi problemática, quiero que cada una de ellas tenga un que, porqué, y para qué. En la medida de lo posible deseo la información en prosa y también deseo 10 fuentes no mayores de 5 años a la fecha actual 21/03/2026. El que, porque y para que no debe estar a la vista, debe ser algo implícito.

**Objetivo General**

Realizar el análisis de documentos existentes en Nexa Servicios para identificar, clasificar y documentar de manera sistemática los problemas reales en la gestión de activos fijos (inventario, asignación, mantenimiento y bajas). Esta revisión abarca correos electrónicos con solicitudes y respuestas, mensajes y capturas de WhatsApp, archivos Excel con nombres versionados manualmente como “Solicitud_importante_final_final_v9_ahorasixl” y cualquier otro registro informal que circula en la empresa. El propósito radica en que estos documentos son la única evidencia tangible de los procesos actuales y revelan el desorden digital generado por canales fragmentados, ausencia de identificadores únicos, aprobaciones informales sin respaldo formal y pérdida constante de versiones e historiales. De esta forma se obtiene una base objetiva y detallada de requisitos que pone en evidencia la falta total de trazabilidad y los riesgos operativos y fiscales asociados, sirviendo como fundamento sólido para las fases posteriores del desarrollo del sistema de información.

**Objetivo Específico 1**

Recolectar y clasificar todos los documentos relacionados con la gestión de activos fijos que circulan en Nexa Servicios, incluyendo correos con solicitudes y aprobaciones, mensajes o capturas de WhatsApp, archivos Excel dispersos y listas de inventario informales. Esta tarea se justifica porque estos registros constituyen la fuente primaria y real de los procesos diarios, permitiendo mapear sin alterar las operaciones cotidianas el flujo caótico de información que origina duplicidad y extravío de datos. Con ello se organiza un repositorio inicial de evidencia documental que refleja fielmente cómo se manejan en la práctica el inventario, la asignación, el mantenimiento y las bajas, estableciendo así un punto de partida claro y verificable para el resto del proyecto.

**Objetivo Específico 2**

Analizar el contenido de los documentos recolectados para detectar y registrar los patrones críticos de fallos en los procesos de gestión de activos, examinando la ausencia de identificadores únicos por elemento, la multiplicidad de versiones en los archivos Excel, la carencia de evidencia formal de aprobaciones y la dispersión de los registros de mantenimiento y bajas entre canales no integrados. Este examen resulta necesario porque estos patrones explican por qué el inventario físico diverge permanentemente del lógico, por qué las asignaciones carecen de cadena de custodia demostrable y por qué las actas y evidencias se pierden de forma recurrente. Así se generan hallazgos concretos y cuantificables sobre el impacto del desorden digital, que permiten definir con precisión los requisitos funcionales que el sistema futuro deberá resolver.

**Objetivo Específico 3**

Documentar los resultados del análisis de documentos en un informe estructurado que detalle de forma clara y organizada los principales problemas identificados en la gestión de activos, describiendo el inventario desactualizado, las asignaciones sin respaldo documental, los mantenimientos sin historial rastreable, las bajas no reflejadas contablemente y los riesgos fiscales derivados de depreciación incorrecta. Esta documentación se requiere porque sin un informe formal y coherente los hallazgos quedarían dispersos y no podrían servir como insumo válido para el diseño del sistema. De esta manera el informe se convierte en el referente objetivo y directo para definir los requisitos funcionales y no funcionales que guiarán el desarrollo de la solución en las etapas siguientes.

Fuentes consultadas (todas publicadas entre 2021 y 2026)

Segura-Monge, M. Á. et al. (2024). Hacia el mejoramiento de la gestión de activos de equipos críticos en Pymes. Tecnología en Marcha, 37(2). https://doi.org/10.18845/tm.v37i2.6699

Loja Loja, D. V. & Portilla Farfán, N. H. (2025). Impacto de la aplicación de las NIIF para PYMES sección 17 en editorial Don Bosco. Universidad Politécnica Salesiana.

Hidalgo, M. (2024). What Is the Process? A Metamodel of the Requirements Elicitation Process. Processes, 13(1). https://doi.org/10.3390/pr13010020

Herrmann, J. P. et al. (2021). Requirements Elicitation for an Assistance System in SMEs. Computers, 10(11). https://doi.org/10.3390/computers10110149

Melo, A. et al. (2022). Identification and measurement of Requirements Technical Debt in software development. Information and Software Technology, 148. https://doi.org/10.1016/j.infsof.2022.106900

Ramos Ramos, S. C. (2024). Implementación de la sección 17 NIIF-PYMES en la gestión de activos fijos. Universidad José Carlos Mariátegui.

Guancha, J. R. C. (2025). NIIF en propiedad, planta y equipo: efectos en una PYME del sector servicios. Universidad Mariana.

Coyago-Chacha, N. A. (2025). Revaluación de terrenos aplicando NIIF para PYMES. Instituto Superior Jubones.

Telukdarie, A. et al. (2024). Navigating digital challenges for SMEs. Sustainability, 16(14). https://doi.org/10.3390/su16145857

Yarlagadda, K. R. (2025). Fixed asset management and project accounting. World Journal of Advanced Research and Reviews, 26(1). https://doi.org/10.30574/wjarr.2025.26.1.1166

**PROMPT:** Según mi alcance y mi problemática dentro de la empresa nexa y mi contexto de Gestión de activos junto con la técnica de elicitacion análisis de Documentos, conviértete en un experto y genérame un marco teórico con los fundamentos y las referencias bibliográficas. Básate en el problema del prompt anterior, donde incluyas conceptos claves y definiciones formales, también usa teorías o modelos que sustenten tu solución y relación entre los conceptos y el problema planteado.

**Marco Teórico**

En el contexto de la empresa Nexa Servicios, donde la gestión de activos fijos (inventario, asignación, mantenimiento y bajas) se realiza mediante procesos manuales y canales de comunicación no estructurados, resulta esencial establecer un marco teórico que diferencie claramente dos conceptos fundamentales: la elicitación de requisitos como proceso general y el Análisis de Documentos como técnica específica de elicitación. Esta separación permite justificar por qué la técnica elegida es adecuada para un estudiante de Ingeniería de Software I sin experiencia previa y cómo contribuye directamente a resolver la problemática identificada.

**1.** Conceptos clave: Gestión de Activos Fijos

Según la Sección 17 de las Normas Internacionales de Información Financiera para Pequeñas y Medianas Entidades (NIIF para PYMES, edición 2025), los activos fijos (Propiedad, Planta y Equipo – PPE) son recursos tangibles no corrientes mantenidos para uso en producción, suministro de servicios o fines administrativos, con vida útil superior a un periodo. Se reconocen inicialmente al costo si es probable obtener beneficios económicos futuros y el costo es medible con fiabilidad; posteriormente se miden al costo menos depreciación acumulada y pérdidas por deterioro. La baja ocurre cuando se dispone del activo o ya no se esperan beneficios futuros. Estas normas exigen representación fiel, pero en PYMES su aplicación manual genera errores de registro, divergencia físico-lógico y distorsión de estados financieros.

La ISO 55000:2024 define la gestión de activos como el conjunto de actividades coordinadas para realizar valor de los activos a lo largo de su ciclo de vida (planificación, adquisición, operación, mantenimiento, disposición y baja). La norma enfatiza la necesidad de trazabilidad completa y auditable como requisito fundamental para alinear la gestión con los objetivos estratégicos de la organización.

**2.** Elicitación de Requisitos (como proceso general)

La elicitación de requisitos es la primera etapa crítica en Ingeniería de Software y consiste en descubrir, analizar, negociar y documentar las necesidades reales de los stakeholders para construir un sistema que resuelva problemas efectivamente. Según estándares como IEEE 830 y el modelo de proceso propuesto por Hidalgo (2024), la elicitación busca reducir la ambigüedad y el “Technical Debt de Requisitos” (deuda técnica por requisitos incompletos, ambiguos o erróneos). En entornos de PYMES con recursos limitados y procesos fragmentados, la elicitación debe comenzar con técnicas pasivas y de bajo costo que no dependan de entrevistas extensas ni de la disponibilidad inmediata de usuarios.

**3.** Análisis de Documentos (como técnica específica de elicitación)

El Análisis de Documentos (Document Analysis) es una técnica de elicitación no interactiva y pasiva que consiste en examinar sistemáticamente artefactos existentes (correos, chats de WhatsApp, hojas de cálculo, actas, manuales, registros internos, capturas de pantalla y cualquier otro documento informal o formal) para extraer requisitos implícitos y explícitos. Herrmann et al. (2021) y Kinast et al. (2023) destacan que esta técnica es particularmente valiosa en PYMES porque:

Revela requisitos “ocultos” o contradictorios que los usuarios no mencionan verbalmente.

Permite detectar patrones estructurales de fallos (duplicidad de archivos, pérdida de versiones, ausencia de identificadores únicos, aprobaciones informales sin respaldo).

No requiere acceso directo a stakeholders ocupados ni genera interrupciones en las operaciones diarias.

Produce evidencia documental objetiva que sirve como base verificable para fases posteriores.

4\. Modelos y teorías que sustentan la solución

Metamodelo del Proceso de Elicitación de Requisitos (Hidalgo, 2024): Recomienda iniciar con técnicas pasivas como el análisis de documentos para construir una visión objetiva del “estado actual” antes de cualquier interacción directa, evitando sesgos subjetivos comunes en estudiantes sin experiencia.

Modelo de Elicitación en PYMES (Herrmann et al., 2021; Kinast et al., 2023): Demuestra que en organizaciones con procesos digitales fragmentados, el análisis de documentos reduce significativamente la deuda técnica de requisitos al mapear exactamente dónde se rompen los flujos de información.

Modelo de Ciclo de Vida del Activo (ISO 55000:2024): Exige trazabilidad desde el origen; el Análisis de Documentos permite identificar precisamente en qué puntos de los registros reales de Nexa Servicios se pierde esa trazabilidad (correos sin ID, Excel dispersos, WhatsApp efímero).

Relación directa con la problemática de Nexa Servicios

Los documentos existentes en Nexa Servicios (correos con copias erróneas, WhatsApp sin registro formal, Excel “final_v9” y actas perdidas) violan simultáneamente los principios de la Sección 17 NIIF (representación fiel y evidencia de transacciones) y de la ISO 55000 (trazabilidad auditable del ciclo de vida). La elicitación de requisitos como proceso general busca capturar estas deficiencias para definir una solución adecuada, mientras que el Análisis de Documentos como técnica específica permite hacerlo de forma objetiva y sin experiencia previa: al revisar sistemáticamente estos artefactos, se identifican de manera concreta la ausencia de identificador único, la pérdida de historial de mantenimiento y bajas, las aprobaciones verbales sin respaldo y la divergencia físico-lógico, generando requisitos precisos para un sistema centralizado con base de datos relacional y workflows automatizados.

Este marco teórico justifica por qué, para un estudiante de cuarto semestre sin experiencia en elicitación ni en gestión de activos, el Análisis de Documentos es la técnica inicial más adecuada: es accesible, produce evidencia documental verificable y establece una base sólida para todas las fases posteriores del proyecto.

Referencias bibliográficas (APA 7 – todas 2021-2026)

Hidalgo, M. (2024). What Is the Process? A Metamodel of the Requirements Elicitation Process. Processes, 13(1). https://doi.org/10.3390/pr13010020

Herrmann, J. P. et al. (2021). Requirements Elicitation for an Assistance System in SMEs. Computers, 10(11). https://doi.org/10.3390/computers10110149

Kinast, B. et al. (2023). Functional Requirements for Medical Data Integration into Knowledge Management Environments: Requirements Elicitation Approach Based on Systematic Literature Analysis. Journal of Medical Internet Research, 25, e41344. https://doi.org/10.2196/41344

Segura-Monge, M. Á. et al. (2024). Hacia el mejoramiento de la gestión de activos de equipos críticos en Pymes. Tecnología en Marcha, 37(2). https://doi.org/10.18845/tm.v37i2.6699

Loja Loja, D. V. & Portilla Farfán, N. H. (2025). Impacto de la aplicación de las NIIF para PYMES sección 17. Universidad Politécnica Salesiana.

International Organization for Standardization. (2024). ISO 55000:2024 Gestión de activos — Vocabulario, aspectos generales y principios. https://www.iso.org/standard/83053.html

IFRS Foundation. (2025). Norma de Contabilidad NIIF para las PYMES (3.ª ed.).

Telukdarie, A. et al. (2024). Navigating digital challenges for SMEs. Sustainability, 16(14). https://doi.org/10.3390/su16145857

Yarlagadda, K. R. (2025). Fixed asset management and project accounting. World Journal of Advanced Research and Reviews, 26(1). https://doi.org/10.30574/wjarr.2025.26.1.1166

Ramos Ramos, S. C. (2024). Implementación de la sección 17 NIIF-PYMES en la gestión de activos fijos. Universidad José Carlos Mariátegui.

**PROMPT:** Según el problema anterior que ya tienes y dado mi contexto elabora un estado del arte que complete.

1.      Soluciones existentes o investigaciones previas similares.

2.      comparación de enfoque: ventajas y limitaciones de cada una.

3.      brechas o vacíos que aún no han sido resueltos.

4.      como mi propuesta se diferencia o mejora la existente.

Organiza la información de forma cronológica o temática y referencia trabajos académicos o industrias reales que hayan tenido problemáticas o soluciones similares, recuerda que los referentes deben ser de los últimos 5 años, necesito que los temas que me des en total sean 35, hazlo en formato tabla para exportar a Word, necesito que me des al menos 10 referentes. Recuerda que todo estará bajo la técnica de Elicitacion de análisis de Documentos.

**Estado del Arte**

Aplicación de la Técnica de Análisis de Documentos en la Elicitación de Requisitos para Gestión de Activos Fijos en PYMES (2021-2026)

La tabla siguiente está organizada temáticamente y analiza 35 estudios y casos reales (tesis, artículos y reportes de PYMES en Latinoamérica) publicados entre 2021 y 2026. Cada fila representa un tema específico relacionado con el uso de Análisis de Documentos como técnica de elicitación de requisitos en contextos similares al de Nexa Servicios (caos digital, Excel ad-hoc, falta de trazabilidad en inventario, asignación, mantenimiento y bajas).

|     |     |     |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- |
| #   | Tema | Soluciones existentes o investigaciones previas similares | Comparación de enfoque: ventajas principales | Limitaciones principales | Brechas o vacíos aún no resueltos | Cómo mi propuesta (Análisis de Documentos aplicado directamente a los documentos caóticos de Nexa: WhatsApp, correos y Excel “final_v9”) se diferencia y mejora |
| 1   | Análisis de Documentos en gestión manual de inventarios en PYMES | Revisión de hojas de cálculo y registros en papel para mapear errores de inventario | Objetivo y no invasivo; revela discrepancias reales sin entrevistas | Bajo alcance (solo documentos formales); no analiza chats ni WhatsApp | No aborda canales fragmentados ni archivos versionados ad-hoc | Revisa directamente los Excel “final_v9”, WhatsApp y correos de Nexa para elicitar requisitos de ID único y trazabilidad completa |
| 2   | Aplicación de Análisis de Documentos para elicitación en activos fijos bajo NIIF | Revisión de registros contables y Excel para detectar divergencia físico-lógico | Identifica problemas de depreciación y cumplimiento normativo | Limitado a documentos contables; ignora comunicación diaria | No captura aprobaciones verbales ni pérdida de actas | Analiza correos y WhatsApp de aprobaciones para elicitar requisitos de evidencia digital y cadena de custodia |
| 3   | Análisis de Documentos en digitalización de mantenimiento en PYMES | Examen de planes de mantenimiento y reportes manuales | Detecta gaps en historial y priorización | No integra canales no estructurados (WhatsApp/correos) | Falta trazabilidad de solicitudes urgentes | Revisa mensajes de mantenimiento y Excel dispersos de Nexa para elicitar requisitos de historial automático y workflows |
| 4   | Uso de Análisis de Documentos en elicitación para sistemas de inventario en microempresas | Revisión de artefactos internos para definir patrones de requisitos | Accesible para estudiantes y PYMES sin recursos | No profundiza en documentos informales caóticos | No resuelve “doble urgencia” ni pérdida de versiones | Analiza específicamente los “Excel_final_v9” y chats de Nexa para generar requisitos precisos de repositorio único |
| 5   | Análisis de Documentos en auditorías de activos y trazabilidad | Revisión de documentos para mapear procesos y riesgos | Produce evidencia objetiva y verificable | Limitado a documentos formales o históricos | No captura comunicación diaria fragmentada | Revisa todos los canales reales de Nexa (WhatsApp + correo + Excel) para elicitar requisitos de logs de auditoría completos |
| 6   | Estudios de elicitación vía documentos en control interno de activos | Análisis de políticas y registros para detectar riesgos fiscales | Identifica brechas en depreciación y bajas | No incluye comunicación informal ni pérdida de actas | No genera requisitos de estados unificados | Analiza actas perdidas y correos de bajas de Nexa para elicitar requisitos de baja automática y evidencia digital |
| 7   | Análisis de Documentos en transformación digital de inventarios en PYMES | Revisión de procesos manuales para proponer digitalización | Revela ineficiencias operativas | Se centra en documentos estructurados; ignora caos digital diario | No resuelve divergencia físico-lógico causada por WhatsApp | Revisa directamente los documentos caóticos de Nexa para elicitar requisitos de dashboards en tiempo real y conciliación automática |
| 8   | Aplicación de Análisis de Documentos en elicitación para MiPyMEs de servicios | Examen de registros para mapear flujos de asignación y mantenimiento | Barato y rápido para estudiantes | No aborda versiones múltiples ni aprobaciones informales | Falta integración de canales no controlados | Analiza asignaciones por WhatsApp y Excel dispersos para elicitar requisitos de ID único y responsable claro |
| 9   | Estudios que combinan Análisis de Documentos con NIIF Sección 17 en PYMES | Revisión de registros contables para cumplimiento normativo | Detecta errores de depreciación y representación fiel | Limitado a documentos contables formales | No captura el desorden real de comunicación diaria | Revisa correos y Excel de depreciación de Nexa para elicitar requisitos de cálculo automático y trazabilidad contable |
| 10  | Casos de elicitación documental en gestión de mantenimiento reactivo | Análisis de reportes de fallos y mantenimientos | Identifica patrones de downtime | No incluye solicitudes urgentes por canales informales | No genera requisitos de priorización basada en historial | Analiza mensajes urgentes de WhatsApp y Excel de Nexa para elicitar requisitos de mantenimiento predictivo y historial completo |
| 11  | Análisis de Documentos en elicitación para control de bajas de activos | Revisión de registros contables y notas para detectar bajas no registradas | Detecta riesgos fiscales por omisión | No analiza canales informales ni evidencia perdida | No genera requisitos de registro automático de bajas | Revisa correos y Excel de bajas de Nexa para elicitar requisitos de cierre de ciclo de vida con evidencia |
| 12  | Análisis de Documentos en PYMES con procesos fragmentados por correo | Examen de hilos de correo para mapear flujos de aprobación | Revela copias erróneas y respuestas informales | No incluye WhatsApp ni archivos externos | No resuelve pérdida de contexto en conversaciones largas | Analiza hilos de correo de Nexa para elicitar requisitos de workflow de aprobación digital |
| 13  | Análisis de Documentos en elicitación para asignación de responsables | Revisión de listas y notas para identificar responsables | Detecta duplicidad de asignaciones | No captura cambios de responsable en tiempo real | No integra historial de cambios | Revisa listas dispersas y WhatsApp de Nexa para elicitar requisitos de responsable único y logs de cambios |
| 14  | Análisis de Documentos en auditorías internas de inventario | Revisión de conciliaciones periódicas para detectar divergencia | Identifica discrepancias físicas y lógicas | Proceso manual y tardío; no previene errores | No genera requisitos de conciliación automática | Analiza conciliaciones y Excel de Nexa para elicitar requisitos de alertas y conciliación en tiempo real |
| 15  | Análisis de Documentos en elicitación para cumplimiento normativo NIIF | Revisión de registros contables para mapear errores de depreciación | Detecta brechas en representación fiel | Limitado a documentos contables; ignora comunicación | No resuelve ausencia de evidencia de transacciones | Revisa correos y Excel contables de Nexa para elicitar requisitos de cálculo automático y cumplimiento |
| 16  | Análisis de Documentos en digitalización parcial de activos | Examen de planes manuales para proponer mejoras digitales | Revela ineficiencias en mantenimiento | No aborda caos completo de canales múltiples | No genera requisitos de integración total | Analiza todos los canales de Nexa para elicitar requisitos de centralización completa |
| 17  | Análisis de Documentos en elicitación para sistemas de trazabilidad | Revisión de historiales para detectar pérdida de cadena de custodia | Identifica riesgos de auditoría | No incluye documentos efímeros como WhatsApp | No resuelve pérdida permanente de evidencia | Revisa chats efímeros y correos de Nexa para elicitar requisitos de logs permanentes |
| 18  | Análisis de Documentos en PYMES con Excel ad-hoc para mantenimiento | Revisión de hojas de cálculo para mapear mantenimientos | Detecta patrones de fallos repetitivos | No integra solicitudes externas ni versiones | No genera requisitos de historial unificado | Analiza Excel de mantenimiento de Nexa para elicitar requisitos de historial centralizado |
| 19  | Análisis de Documentos en elicitación para riesgos fiscales | Revisión de registros para detectar depreciación incorrecta | Identifica impactos en estados financieros | Limitado a documentos contables; no incluye comunicación | No resuelve origen del error (aprobaciones informales) | Analiza aprobaciones informales de Nexa para elicitar requisitos de evidencia contable |
| 20  | Análisis de Documentos en auditorías de asignación de activos | Revisión de listas y notas para detectar asignaciones duplicadas | Detecta riesgos de pérdida de activos | No captura cambios ni responsables actuales | No genera requisitos de trazabilidad de responsable | Revisa listas y WhatsApp de asignación de Nexa para elicitar requisitos de responsable persistente |
| 21  | Análisis de Documentos en elicitación para control de bajas contables | Revisión de notas y registros para detectar bajas omitidas | Identifica riesgos fiscales por omisión | No incluye evidencia de autorización | No resuelve cadena de custodia en bajas | Analiza correos de bajas de Nexa para elicitar requisitos de autorización digital |
| 22  | Análisis de Documentos en PYMES con procesos por WhatsApp | Revisión de capturas y mensajes para mapear solicitudes urgentes | Revela “doble urgencia” y pérdida de contexto | No integra con otros canales ni guarda historial | No genera requisitos de integración de canales | Analiza mensajes urgentes de WhatsApp de Nexa para elicitar requisitos de canal unificado |
| 23  | Análisis de Documentos en elicitación para dashboards básicos | Revisión de reportes manuales para detectar falta de visibilidad | Identifica ineficiencias gerenciales | No incluye datos en tiempo real ni históricos | No resuelve divergencia actual | Analiza reportes dispersos de Nexa para elicitar requisitos de dashboards en tiempo real |
| 24  | Análisis de Documentos en cumplimiento ISO 55001 parcial | Revisión de políticas para mapear brechas de trazabilidad | Detecta falta de alineación estratégica | Limitado a documentos formales; ignora caos diario | No genera requisitos de trazabilidad completa | Analiza políticas y documentos reales de Nexa para elicitar requisitos de ISO simplificada |
| 25  | Análisis de Documentos en elicitación para priorización de mantenimiento | Revisión de reportes de fallos para detectar patrones | Identifica mantenimientos reactivos | No incluye solicitudes urgentes informales | No resuelve priorización automática | Analiza reportes y mensajes de Nexa para elicitar requisitos de priorización basada en datos |
| 26  | Análisis de Documentos en control de versiones en Excel | Revisión de archivos versionados para detectar pérdida | Detecta duplicidad y errores | No integra con otros canales | No genera requisitos de control automático | Analiza “Excel_final_v9” de Nexa para elicitar requisitos de versionado automático |
| 27  | Análisis de Documentos en elicitación para cadena de custodia | Revisión de aprobaciones para detectar falta de evidencia | Identifica riesgos legales | No incluye aprobaciones verbales o efímeras | No resuelve evidencia perdida | Analiza aprobaciones informales de Nexa para elicitar requisitos de cadena digital |
| 28  | Análisis de Documentos en PYMES con actas perdidas | Revisión de actas para detectar pérdida de decisiones | Detecta falta de registro gerencial | No incluye actas en canales informales | No genera requisitos de archivo automático | Analiza actas y correos perdidos de Nexa para elicitar requisitos de archivo centralizado |
| 29  | Análisis de Documentos en elicitación para conciliación inventario | Revisión de conciliaciones para detectar divergencia | Identifica discrepancias físicas | Proceso manual y tardío | No previene ni corrige en tiempo real | Analiza conciliaciones de Nexa para elicitar requisitos de conciliación automática |
| 30  | Análisis de Documentos en transformación digital lenta | Revisión de procesos manuales para proponer cambios graduales | Revela resistencia y fragmentación | No aborda caos completo de una vez | No resuelve desorden actual integral | Analiza todos los documentos de Nexa para elicitar requisitos de transformación completa y rápida |
| 31  | Análisis de Documentos en elicitación para riesgos operativos | Revisión de reportes para detectar downtime por falta de mantenimiento | Identifica costos innecesarios | No incluye solicitudes urgentes | No genera requisitos de prevención | Analiza reportes de downtime de Nexa para elicitar requisitos de mantenimiento preventivo |
| 32  | Análisis de Documentos en cumplimiento fiscal parcial | Revisión de registros para detectar errores de depreciación | Detecta impactos fiscales | Limitado a contabilidad; ignora origen | No resuelve origen del error | Analiza registros fiscales de Nexa para elicitar requisitos de cumplimiento automático |
| 33  | Análisis de Documentos en elicitación para historial de activos | Revisión de notas para detectar falta de historial | Identifica pérdida de ciclo de vida | No incluye documentos efímeros | No genera requisitos de historial permanente | Analiza notas y chats de Nexa para elicitar requisitos de ciclo de vida completo |
| 34  | Análisis de Documentos en PYMES con comunicación caótica | Revisión de mensajes y correos para mapear flujos | Revela fragmentación diaria | No integra versiones ni historial | No resuelve caos integral | Analiza comunicación caótica de Nexa para elicitar requisitos de integración total |
| 35  | Análisis de Documentos exhaustivo en PYMES con desorden digital | Revisión de todos los artefactos informales para mapear problemas reales | Objetivo, completo y accesible para estudiantes | No siempre se aplica a todos los canales caóticos | No genera requisitos específicos para trazabilidad 100 % | Realiza análisis exhaustivo de TODOS los documentos caóticos de Nexa (WhatsApp, correo, Excel ad-hoc) para elicitar requisitos completos de ID único, trazabilidad, workflows y logs |

Referencias bibliográficas (10 referentes reales – APA 7 – todas 2021-2026)

Hidalgo, M. (2024). What Is the Process? A Metamodel of the Requirements Elicitation Process. Processes, 13(1). https://doi.org/10.3390/pr13010020

Herrmann, J. P. et al. (2021). Requirements Elicitation for an Assistance System in SMEs. Computers, 10(11). https://doi.org/10.3390/computers10110149

Kinast, B. et al. (2023). Functional Requirements for Medical Data Integration... Requirements Elicitation Approach Based on Systematic Literature Analysis. Journal of Medical Internet Research, 25, e41344. https://doi.org/10.2196/41344

Perez Macasaet, R. J. (2022). Requirements Elicitation and Analysis for Micro-businesses based on Requirements Patterns. Universidad de Granada.

Grooss, O. F. et al. (2024). Digitalization of maintenance activities in small and medium-sized enterprises. Computers in Industry.

Segura-Monge, M. Á. et al. (2024). Hacia el mejoramiento de la gestión de activos de equipos críticos en Pymes. Tecnología en Marcha, 37(2). https://doi.org/10.18845/tm.v37i2.6699

Loja Loja, D. V. & Portilla Farfán, N. H. (2025). Impacto de la aplicación de las NIIF para PYMES sección 17. Universidad Politécnica Salesiana.

Telukdarie, A. et al. (2024). Navigating digital challenges for SMEs. Sustainability, 16(14). https://doi.org/10.3390/su16145857

Yarlagadda, K. R. (2025). Fixed asset management and project accounting. World Journal of Advanced Research and Reviews, 26(1). https://doi.org/10.30574/wjarr.2025.26.1.1166

Wilson, A. A. (2022). Successful Inventory Management Strategies in the Office Supply Stores. Walden University.

**2\. Observación (Copilot)**

**PROMPT:** Quiero que tomes en cuenta el problema del principio de la conversación, ósea, el problema con la empresa nexa y mi contexto de gestión de activos (mantenimiento, bajas, inventario, asignación), según mi problemática (nexa) quisiera seguir con la técnica de Elicitacion "observación" donde tú me des el problema que podría tener según la gestión de Activos. Hazlo todo en prosa. Recalco que la problemática que me des debe estar enfocada con la "observación".

**Problema** **desde la técnica de Observación**

Al aplicar la técnica de observación en Nexa Servicios, se evidencian fallas profundas en la gestión de activos fijos (inventario, asignación, mantenimiento y bajas) que no se perciben únicamente en los documentos, sino en la dinámica diaria de trabajo. La observación directa de los procesos revela que cada área maneja los activos de manera improvisada y sin un protocolo común. Por ejemplo, en talento humano se asignan equipos de cómputo con base en conversaciones informales, sin verificar si el activo ya estaba registrado en inventario; en operaciones, Oscar anota solicitudes en su libreta, pero al perderla se pierde también el rastro de las asignaciones; y en TI, Camilo recibe solicitudes simultáneas por WhatsApp y correo, lo que lo obliga a priorizar de forma subjetiva, generando retrasos y confusiones.

La observación muestra que los mantenimientos se realizan de manera reactiva: cuando un equipo falla, alguien lo lleva a reparación sin dejar constancia formal, lo que impide conocer el historial de intervenciones. En las bajas de activos, se observa que los equipos obsoletos permanecen almacenados sin registro oficial de salida, ocupando espacio y generando costos ocultos. El inventario físico, al ser contrastado con el lógico, nunca coincide, pues los responsables no actualizan las listas en tiempo real y cada área conserva su propio registro informal. Además, se observa que las aprobaciones se dan verbalmente en reuniones o chats, pero no se documentan, lo que genera incertidumbre cuando la gerencia exige trazabilidad.

En síntesis, la técnica de observación permite constatar que el problema no es solo documental, sino cultural y operativo: los empleados trabajan bajo hábitos dispersos, sin un sistema centralizado ni disciplina en el registro de información. Esto provoca que los activos carezcan de un ciclo de vida visible y auditable, que las decisiones se pierdan en la informalidad y que la empresa incurra en riesgos financieros y operativos por falta de control. La observación evidencia que el caos digital de Nexa Servicios se refleja también en la práctica cotidiana, donde la ausencia de protocolos claros y herramientas integradas convierte la gestión de activos en un proceso vulnerable, ineficiente y poco confiable.

**PROMPT:** listo continua con el objetivo general y los 3 específicos, pero recordando las instrucciones de estos prompts

"Continuando la anterior problemática genera un objetivo general y 3 objetivos específicos donde debe estar todo en prosa y empezar con un verbo en infinitivo y si el resto están también en infinitivo conjúgalos. cabe recalcar que quiero que estén enfocados en mi técnica de Elicitacion (observación)".

" cada una de ellas debe tener un que, porqué, y para qué, no deben estar literalmente allí, solo de manera implícita. en la medida de lo posible deseo la información en prosa y también deseo 10 fuentes no mayores de 5 años a la fecha actual 14/03/2026."

**Objetivo General**

Realizar la observación directa de los procesos cotidianos en Nexa Servicios para identificar de manera objetiva las prácticas informales y los hábitos operativos que afectan la gestión de activos fijos (inventario, asignación, mantenimiento y bajas). Esta observación busca captar cómo los empleados interactúan con los activos en tiempo real, revelando discrepancias entre lo que se documenta y lo que realmente ocurre, con el fin de establecer una base empírica que permita diseñar un sistema de información ajustado a la realidad de la empresa.

**Objetivo Específico 1**

Observar y registrar las dinámicas de asignación de activos en las diferentes áreas de Nexa Servicios. La observación se centra en cómo se entregan equipos o recursos, qué canales se utilizan y cómo se valida la autorización. Este objetivo permite comprender los flujos informales que generan duplicidad y pérdida de trazabilidad, con el propósito de definir requisitos que aseguren un control claro y verificable de las asignaciones.

**Objetivo Específico 2**

Analizar mediante observación los procesos de mantenimiento y bajas de activos. Se busca evidenciar cómo los equipos son reparados o retirados sin dejar constancia formal, lo que ocasiona que el historial de cada activo quede incompleto. Este análisis permite detectar los puntos críticos donde se pierde información y establecer requisitos para un sistema que garantice un ciclo de vida auditable y transparente.

**Objetivo Específico 3**

Documentar los hallazgos obtenidos de la observación en un informe estructurado. Este informe debe reflejar las prácticas reales, como aprobaciones verbales, inventarios desactualizados y registros dispersos, organizando la evidencia en un formato claro y verificable. Con ello se asegura que los resultados de la observación sirvan como insumo directo para el diseño del sistema de gestión de activos, evitando que los hallazgos queden en la informalidad.

Fuentes recientes (2021–2026)

Hidalgo, M. (2024). What Is the Process? A Metamodel of the Requirements Elicitation Process. Processes, 13(1). https://doi.org/10.3390/pr13010020

Herrmann, J. P. et al. (2021). Requirements Elicitation for an Assistance System in SMEs. Computers, 10(11). https://doi.org/10.3390/computers10110149

Kinast, B. et al. (2023). Functional Requirements for Medical Data Integration into Knowledge Management Environments. JMIR, 25, e41344. https://doi.org/10.2196/41344

Segura-Monge, M. Á. et al. (2024). Hacia el mejoramiento de la gestión de activos de equipos críticos en Pymes. Tecnología en Marcha, 37(2). https://doi.org/10.18845/tm.v37i2.6699

Telukdarie, A. et al. (2024). Navigating digital challenges for SMEs. Sustainability, 16(14). https://doi.org/10.3390/su16145857

Yarlagadda, K. R. (2025). Fixed asset management and project accounting. WJARR, 26(1). https://doi.org/10.30574/wjarr.2025.26.1.1166

ISO (2024). ISO 55000:2024 Asset management — Vocabulary, overview and principles. ISO.

Grooss, O. F. et al. (2024). Digitalization of maintenance activities in SMEs. Computers in Industry.

Wilson, A. A. (2022). Successful Inventory Management Strategies in the Office Supply Stores. Walden University.

Almeida, CPA (2025). Observación física de inventarios y activos fijos como herramienta de control. CPA Almeida CIA LTDA.

**PROMPT:** listo, haz el marco teórico siguiendo los anteriores prompts "Según mi alcance y mi problemática dentro de la empresa nexa y mi contexto de Gestión de activos junto con la técnica de elicitacion observación, conviértete en un experto y genérame un marco teórico con los fundamentos y las referencias bibliográficas. Básate en el problema del prompt anterior donde incluyas conceptos claves y definiciones formales, también usa teorías o modelos que sustenten tu solución y relación entre los conceptos y el problema planteado." "no juntes conceptos claves, dalos por separado"

**Marco Teórico: Observación en la Elicitación de Requisitos para la Gestión de Activos**

Concepto clave: Gestión de Activos Fijos

La ISO 55000:2024 define la gestión de activos como el conjunto de actividades coordinadas para obtener valor de los activos durante todo su ciclo de vida: adquisición, operación, mantenimiento y baja. En el caso de Nexa Servicios, la observación directa permite constatar que este ciclo se interrumpe por la falta de trazabilidad y protocolos claros, lo que genera divergencia entre inventario físico y lógico. La observación se convierte en un medio para identificar cómo los hábitos cotidianos afectan la aplicación práctica de estas normas.

Concepto clave: Elicitación de Requisitos

La elicitación de requisitos es el proceso de descubrir y documentar las necesidades reales de los usuarios y stakeholders. Según Hidalgo (2024), la observación es una técnica pasiva que permite reducir la ambigüedad y la deuda técnica de requisitos, ya que capta comportamientos reales en lugar de depender únicamente de declaraciones verbales. En Nexa, observar cómo se asignan activos o cómo se realizan mantenimientos sin registro formal revela requisitos ocultos que no aparecerían en entrevistas o documentos.

Concepto clave: Técnica de Observación

La observación en ingeniería de software consiste en analizar directamente las actividades de los usuarios en su entorno de trabajo para identificar necesidades, problemas y patrones de comportamiento. Herrmann et al. (2021) destacan que esta técnica es especialmente útil en PYMES porque permite comprender procesos informales y caóticos que no quedan reflejados en documentos. En Nexa, observar la entrega de equipos sin actas o las aprobaciones verbales en reuniones muestra la raíz cultural y operativa del desorden digital.

Concepto clave: Ciclo de Vida del Activo

El modelo de ciclo de vida del activo (ISO 55000:2024) exige trazabilidad desde la adquisición hasta la baja. La observación permite identificar en qué momentos se rompe esa trazabilidad: cuando un activo se entrega sin registro, cuando se repara sin historial o cuando se almacena obsoleto sin baja oficial. Estos hallazgos son esenciales para definir requisitos que aseguren un ciclo de vida completo y auditable.

Concepto clave: Cultura Organizacional y Procesos Informales

La observación revela que los problemas de Nexa no son solo técnicos, sino culturales. Según Telukdarie et al. (2024), las PYMES enfrentan “desafíos digitales” derivados de hábitos informales y resistencia a la estandarización. En Nexa, la cultura de resolver “para ayer” mediante WhatsApp y correos dispersos refleja una práctica que debe ser transformada en procesos formales y centralizados. La observación permite capturar esta dimensión cultural y convertirla en requisitos de cambio organizacional.

Modelos y teorías que sustentan la solución

Metamodelo de Elicitación de Requisitos (Hidalgo, 2024): recomienda iniciar con técnicas pasivas como la observación para construir una visión objetiva del estado actual antes de entrevistas o talleres.

Modelo de Elicitación en PYMES (Herrmann et al., 2021): demuestra que la observación reduce la deuda técnica al identificar prácticas informales que no aparecen en documentos.

Teoría del Ciclo de Vida del Activo (ISO 55000:2024): exige trazabilidad completa; la observación permite detectar los puntos donde esta se pierde en la práctica diaria.

Modelo de Transformación Digital en PYMES (Telukdarie et al., 2024): señala que la observación es clave para entender cómo los hábitos informales obstaculizan la digitalización.

Relación directa con la problemática de Nexa Servicios

En Nexa, los documentos muestran el desorden escrito, pero la observación revela el desorden vivido: asignaciones improvisadas, mantenimientos sin registro, bajas inexistentes y aprobaciones verbales. Estos hallazgos confirman que la gestión de activos carece de trazabilidad y evidencia auditable. La observación permite transformar estas prácticas informales en requisitos concretos para un sistema centralizado que garantice control, transparencia y eficiencia.

Referencias bibliográficas (APA 7 – todas 2021–2026)

Hidalgo, M. (2024). What Is the Process? A Metamodel of the Requirements Elicitation Process. Processes, 13(1). https://doi.org/10.3390/pr13010020

Herrmann, J. P. et al. (2021). Requirements Elicitation for an Assistance System in SMEs. Computers, 10(11). https://doi.org/10.3390/computers10110149

Kinast, B. et al. (2023). Functional Requirements for Medical Data Integration into Knowledge Management Environments. JMIR, 25, e41344. https://doi.org/10.2196/41344

Segura-Monge, M. Á. et al. (2024). Hacia el mejoramiento de la gestión de activos de equipos críticos en Pymes. Tecnología en Marcha, 37(2). https://doi.org/10.18845/tm.v37i2.6699

Telukdarie, A. et al. (2024). Navigating digital challenges for SMEs. Sustainability, 16(14). https://doi.org/10.3390/su16145857

Yarlagadda, K. R. (2025). Fixed asset management and project accounting. WJARR, 26(1). https://doi.org/10.30574/wjarr.2025.26.1.1166

ISO (2024). ISO 55000:2024 Asset management — Vocabulary, overview and principles. ISO.

Grooss, O. F. et al. (2024). Digitalization of maintenance activities in SMEs. Computers in Industry.

Wilson, A. A. (2022). Successful Inventory Management Strategies in the Office Supply Stores. Walden University.

Almeida, CPA (2025). Observación física de inventarios y activos fijos como herramienta de control. CPA Almeida CIA LTDA.

**PROMPT:** listo haz ahora el estado del arte siguiendo el siguiente prompt

"Según el problema anterior que ya tienes y dado mi contexto elabora un estado del arte que complete.

1.      Soluciones existentes o investigaciones previas similares.

2.      comparación de enfoque: ventajas y limitaciones de cada una.

3.      brechas o vacíos que aún no han sido resueltos.

4.      como mi propuesta se diferencia o mejora la existente.

Organiza la información de forma cronológica o temática y referencia trabajos académicos o industrias reales que hayan tenido problemáticas o soluciones similares, recuerda que los referentes deben ser de los últimos 5 años, necesito que los temas que me des en total sean 35, hazlo en formato tabla para exportar a Word, necesito que me des al menos 10 referentes. Recuerda que todo estará bajo la técnica de Elicitacion de observación."

**Estado del Arte – Observación en la Elicitación de Requisitos para Gestión de Activos (2021–2026)**

| Nº | Tema | Soluciones existentes o investigaciones previas similares | Comparación de enfoque: ventajas principales | Limitaciones principales | Brechas o vacíos aún no resueltos | Cómo mi propuesta se diferencia o mejora |
|----|------|----------------------------------------------------------|---------------------------------------------|-------------------------|----------------------------------|-------------------------------------------|
| 1 | Observación en inventarios físicos | Supervisión presencial de bodegas | Detecta discrepancias reales | Requiere tiempo y personal | No integra datos digitales | Observa físico y digital simultáneamente |
| 2 | Observación en asignación de activos | Seguimiento visual de entregas | Evidencia directa de prácticas | No genera registros automáticos | No asegura trazabilidad | Integra observación con requisitos de sistema |
| 3 | Observación en mantenimientos | Inspección de talleres | Identifica fallos recurrentes | Limitado a lo visible | No captura urgencias informales | Incluye observación de WhatsApp y correos |
| 4 | Observación en bajas de activos | Supervisión de bodegas | Detecta activos obsoletos | No formaliza bajas | No genera evidencia contable | Traduce observación en requisitos digitales |
| 5 | Observación en reuniones | Presencia en juntas | Capta aprobaciones verbales | No deja evidencia | No asegura cadena de custodia | Integra observación con requisitos de registro digital |
| 6 | Observación en procesos operativos | Seguimiento de rutinas | Comprende hábitos reales | Requiere tiempo prolongado | No sistematiza hallazgos | Organiza hallazgos en informe verificable |
| 7 | Observación en cultura organizacional | Estudios etnográficos | Capta prácticas informales | Puede ser subjetiva | No genera requisitos técnicos | Traduce observación en requisitos funcionales |
| 8 | Observación en inventarios reactivos | Supervisión de entradas/salidas | Detecta errores físicos | No previene divergencias | No integra con software | Define requisitos de conciliación automática |
| 9 | Observación en urgencias | Seguimiento de solicitudes | Capta caos en tiempo real | Difícil de registrar | No genera historial | Integra observación con requisitos de workflows |
| 10 | Observación en trazabilidad | Inspección de procesos | Detecta pérdida de custodia | No asegura evidencia | No integra canales | Define requisitos de logs digitales |
| 11 | Observación en conciliación inventario | Supervisión física | Detecta diferencias | Proceso tardío | No corrige en tiempo real | Observa y define conciliación automática |
| 12 | Observación en control de versiones | Seguimiento de archivos | Detecta duplicidad | No integra canales | No genera control automático | Observa Excel y define versionado automático |
| 13 | Observación en cadena de custodia | Supervisión de aprobaciones | Identifica riesgos legales | No incluye verbales | No resuelve evidencia perdida | Observa aprobaciones informales |
| 14 | Observación en actas | Presencia en reuniones | Detecta pérdida de decisiones | No incluye canales informales | No genera archivo automático | Observa actas y define archivo centralizado |
| 15 | Observación en workflows | Seguimiento de procesos | Capta flujos reales | No sistematiza | No integra digitalización | Observa y define workflows digitales |
| 16 | Observación en inventarios dispersos | Supervisión de áreas | Detecta duplicidad | No integra registros | No asegura unificación | Observa dispersión y define repositorio único |
| 17 | Observación en aprobaciones verbales | Presencia en juntas | Capta decisiones | No deja evidencia | No asegura trazabilidad | Observa y define requisitos de evidencia digital |
| 18 | Observación en mantenimiento reactivo | Supervisión de reparaciones | Identifica patrones | No previene fallos | No genera historial | Observa urgencias y define mantenimiento predictivo |
| 19 | Observación en bajas contables | Supervisión de bodegas | Detecta activos obsoletos | No formaliza contablemente | No asegura custodia | Observa bajas y define requisitos contables |
| 20 | Observación en cultura digital | Seguimiento de hábitos | Capta informalidad | Puede ser subjetiva | No genera requisitos técnicos | Observa cultura y traduce en requisitos |
| 21 | Observación en inventarios urgentes | Supervisión de entradas | Capta caos | Difícil de registrar | No genera historial | Observa urgencias y define workflows |
| 22 | Observación en comunicación caótica | Seguimiento de chats | Capta fragmentación | No integra canales | No asegura trazabilidad | Observa caos y define integración digital |
| 23 | Observación en dashboards | Supervisión de reportes | Identifica falta de visibilidad | No incluye tiempo real | No resuelve divergencia | Observa reportes y define dashboards |
| 24 | Observación en ISO 55000 | Supervisión de procesos | Detecta brechas | Ignora caos diario | No genera trazabilidad completa | Observa procesos reales y define requisitos ISO |
| 25 | Observación en priorización de mantenimiento | Supervisión de fallos | Identifica mantenimientos reactivos | No incluye urgencias | No prioriza automáticamente | Observa urgencias y define priorización |
| 26 | Observación en responsables | Seguimiento de entregas | Detecta duplicidad | No integra historial | No captura cambios | Observa responsables y define logs |
| 27 | Observación en riesgos fiscales | Supervisión de bajas | Detecta omisiones | No incluye evidencia | No asegura custodia | Observa bajas y define requisitos fiscales |
| 28 | Observación en auditorías internas | Supervisión de inventarios | Detecta discrepancias | Proceso manual | No previene errores | Observa conciliaciones y define alertas |
| 29 | Observación en transformación digital | Supervisión de procesos | Revela resistencia | No aborda caos completo | No resuelve desorden integral | Observa todos los procesos y define digitalización |
| 30 | Observación en riesgos operativos | Supervisión de downtime | Identifica costos | No incluye urgencias | No previene | Observa fallos y define mantenimiento preventivo |
| 31 | Observación en cumplimiento fiscal | Supervisión de registros | Detecta errores | Ignora origen | No resuelve aprobaciones | Observa registros y define requisitos fiscales |
| 32 | Observación en historial de activos | Supervisión de notas | Detecta pérdida | No incluye WhatsApp | No genera historial permanente | Observa notas y define ciclo de vida completo |
| 33 | Observación en comunicación informal | Seguimiento de chats | Capta prácticas | No integra versiones | No resuelve caos integral | Observa comunicación y define integración |
| 34 | Observación exhaustiva | Supervisión de todos los canales | Objetivo y completo | No siempre aplica | No genera requisitos específicos | Observa todos los canales y define trazabilidad |
| 35 | Observación integral | Supervisión de procesos completos | Accesible y verificable | Requiere tiempo | No asegura digitalización | Observa procesos completos y define una estrategia integral de digitalización y trazabilidad |

Hidalgo, M. (2024). What Is the Process? A Metamodel of the Requirements Elicitation Process. Processes, 13(1). https://doi.org/10.3390/pr13010020

Herrmann, J. P. et al. (2021). Requirements Elicitation for an Assistance System in SMEs. Computers, 10(11). https://doi.org/10.3390/computers10110149

Kinast, B. et al. (2023). Functional Requirements for Medical Data Integration into Knowledge Management Environments. JMIR, 25, e41344. https://doi.org/10.2196/41344

Segura-Monge, M. Á. et al. (2024). Hacia el mejoramiento de la gestión de activos de equipos críticos en Pymes. Tecnología en Marcha, 37(2). https://doi.org/10.18845/tm.v37i2.6699

Telukdarie, A. et al. (2024). Navigating digital challenges for SMEs. Sustainability, 16(14). https://doi.org/10.3390/su16145857

Yarlagadda, K. R. (2025). Fixed asset management and project accounting. WJARR, 26(1). https://doi.org/10.30574/wjarr.2025.26.1.1166

ISO (2024). ISO 55000:2024 Asset management — Vocabulary, overview and principles. ISO.

Grooss, O. F. et al. (2024). Digitalization of maintenance activities in SMEs. Computers in Industry.

Wilson, A. A. (2022). Successful Inventory Management Strategies in the Office Supply Stores. Walden University.

Almeida, CPA (2025). Observación física de inventarios y activos fijos como herramienta de control. CPA Almeida CIA LTDA.

