Marco Teorico

En el contexto de la empresa Nexa Servicios, donde la gestión de activos fijos (inventario, asignación, mantenimiento y bajas) se realiza mediante procesos manuales y canales de comunicación no estructurados, resulta esencial establecer un marco teórico que diferencie claramente dos conceptos fundamentales: la elicitación de requisitos como proceso general y el Análisis de Documentos como técnica específica de elicitación. Esta separación permite justificar por qué la técnica elegida es adecuada para un estudiante de Ingeniería de Software I sin experiencia previa y cómo contribuye directamente a resolver la problemática identificada.


1. Conceptos clave: Gestión de Activos Fijos
Según la Sección 17 de las Normas Internacionales de Información Financiera para Pequeñas y Medianas Entidades (NIIF para PYMES, edición 2025), los activos fijos (Propiedad, Planta y Equipo – PPE) son recursos tangibles no corrientes mantenidos para uso en producción, suministro de servicios o fines administrativos, con vida útil superior a un periodo. Se reconocen inicialmente al costo si es probable obtener beneficios económicos futuros y el costo es medible con fiabilidad; posteriormente se miden al costo menos depreciación acumulada y pérdidas por deterioro. La baja ocurre cuando se dispone del activo o ya no se esperan beneficios futuros. Estas normas exigen representación fiel, pero en PYMES su aplicación manual genera errores de registro, divergencia físico-lógico y distorsión de estados financieros.
La ISO 55000:2024 define la gestión de activos como el conjunto de actividades coordinadas para realizar valor de los activos a lo largo de su ciclo de vida (planificación, adquisición, operación, mantenimiento, disposición y baja). La norma enfatiza la necesidad de trazabilidad completa y auditable como requisito fundamental para alinear la gestión con los objetivos estratégicos de la organización.


2. Elicitación de Requisitos (como proceso general)
La elicitación de requisitos es la primera etapa crítica en Ingeniería de Software y consiste en descubrir, analizar, negociar y documentar las necesidades reales de los stakeholders para construir un sistema que resuelva problemas efectivamente. Según estándares como IEEE 830 y el modelo de proceso propuesto por Hidalgo (2024), la elicitación busca reducir la ambigüedad y el “Technical Debt de Requisitos” (deuda técnica por requisitos incompletos, ambiguos o erróneos). En entornos de PYMES con recursos limitados y procesos fragmentados, la elicitación debe comenzar con técnicas pasivas y de bajo costo que no dependan de entrevistas extensas ni de la disponibilidad inmediata de usuarios.


3. Análisis de Documentos (como técnica específica de elicitación)
El Análisis de Documentos (Document Analysis) es una técnica de elicitación no interactiva y pasiva que consiste en examinar sistemáticamente artefactos existentes (correos, chats de WhatsApp, hojas de cálculo, actas, manuales, registros internos, capturas de pantalla y cualquier otro documento informal o formal) para extraer requisitos implícitos y explícitos. Herrmann et al. (2021) y Kinast et al. (2023) destacan que esta técnica es particularmente valiosa en PYMES porque:

Revela requisitos “ocultos” o contradictorios que los usuarios no mencionan verbalmente.
Permite detectar patrones estructurales de fallos (duplicidad de archivos, pérdida de versiones, ausencia de identificadores únicos, aprobaciones informales sin respaldo).
No requiere acceso directo a stakeholders ocupados ni genera interrupciones en las operaciones diarias.
Produce evidencia documental objetiva que sirve como base verificable para fases posteriores.


4. Modelos y teorías que sustentan la solución
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

