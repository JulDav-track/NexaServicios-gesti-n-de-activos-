3.4 Constancia de auditoría cruzada (punto 7b)
 
Esta constancia registra la auditoría cruzada entre el diccionario de datos (sección 3.1, versión v7), el MER y el modelo relacional (sección 3.2) y el diagrama de clases (PDF v6 con CRF-003, que la sección 3.3 presentará sin cambios). Se hicieron tres comparaciones: diccionario contra MER (Comparación 1), diccionario contra clases (Comparación 2) y MER contra clases (Comparación 3). Todas las cifras se recalcularon con scripts y no se copiaron de otro documento. La Tabla 1 resume las fuentes y los scripts; las Tablas 2 a 4 presentan las comparaciones y la Tabla 5 los hallazgos con su corrección propuesta. La constancia es propuesta del equipo, pendiente de validar con la docente.
 
3.4.1 Alcance y método
 
Se compararon las tablas del diccionario v7 y de la sección 3.2 columna por columna (nombre, tipo, longitud, obligatorio y claves). El diagrama de clases se leyó del PDF de dos formas: el texto, con pdftotext, para clases, atributos, métodos y enumeraciones, y la geometría, con la biblioteca pdfplumber de Python, para las 19 asociaciones: cada línea continua de asociación se toma con sus dos extremos, la caja de clase que toca cada extremo y la etiqueta de multiplicidad más cercana. El script de comparación cruza los tres resultados campo por campo. La Tabla 1 lista lo que se extrajo de cada fuente.
 
**Tabla ****1****. ***Fuentes comparadas y scripts usados*
 
| **Fuente** | **Archivo y versión** | **Qué se extrajo** | **Script** |
| --- | --- | --- | --- |
| Diccionario de datos | Diccionario_y_Clases_corregido_v7.docx (Versión v7, 01/11/2026) | 15 elementos (14 tablas y la vista Reportes): columnas, tipo, longitud, obligatorio, PK, FK, Unique, valores ENUM y notas de tabla | aud7b.py (lectura de tablas) |
| MER y modelo relacional | NexaActivos_3_2_MER_y_Modelo_Relacional.docx | Tabla 1 (R1 a R19 con cardinalidades), tablas de columnas de las 14 tablas, párrafo de UNIQUE y Tabla 16 (columnas ENUM) | aud7b.py (lectura de tablas) |
| Diagrama de clases | NexaActivos_Diagrama_de_clases_v6_CRF003.pdf (título: «Diagrama de clases v6 (CRF-002 y CRF-003)») | Clases, atributos con tipo, [0..1], {PK}, {FK}, {UNIQUE}, métodos con «INTERNO», enumeraciones y valores | pdftotext y aud7b.py |
| Diagrama de clases (asociaciones) | Mismo PDF | 19 líneas continuas de asociación, clase de cada extremo, multiplicidad y nombre de rol | asoc.py (pdfplumber) |
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de validar). Scripts en Python 3; **pdftotext** del paquete **poppler-utils**; **pdfplumber** para la geometría del PDF.*
 
3.4.2 Comparación 1: diccionario frente al MER
 
La Tabla 2 compara las 14 tablas del diccionario con el modelo relacional de 3.2: columnas, tipos, nulos, claves, las 19 FK contra las relaciones R1 a R19, las restricciones UNIQUE y las columnas ENUM. También se comprueba que la cardinalidad de cada relación sale del diccionario: lado padre 0..1 si la FK es opcional y 1..1 si es obligatoria; lado hijo 0..1 si la FK es UNIQUE y 0..* en los demás casos. No se encontró ninguna diferencia.
 
**Tabla ****2****. ***Comparación 1: diccionario v7 frente al MER y modelo relacional*
 
| **Elemento** | **Diccionario** | **MER** | **Clases** | **Resultado** |
| --- | --- | --- | --- | --- |
| Tablas | 14 | 14 | — (se compara en la Comparación 2) | Coincide |
| Columnas almacenadas | 83 | 83 | — | Coincide (0 columnas solo en un lado) |
| Tipo y longitud de las 83 columnas | 83 columnas | 83 columnas | — | Coincide (0 diferencias de tipo, nulo, PK, FK, UNIQUE o ENUM) |
| Columnas obligatorias / NOT NULL | Obligatorio = Sí / No | NOT NULL / NULL | — | Coincide |
| PK | 13 PK simples y 1 compuesta (rol, permiso) = 15 columnas | 15 columnas PK (Rol_Permiso: PK compuesta) | — | Coincide |
| FK | 19 («FK hacia …») | 19 columnas FK; R1 a R19 = 19 | — | Coincide (mismas 19 parejas columna → tabla en las tres listas) |
| UNIQUE simples | 9: Acta_De_Entrega.ID_Asignacion, Activo.Numero_Serie, Activo.Placa_Inventario, Aprobacion.ID_Solicitud, Asignacion.ID_Solicitud, Categoria.Nombre_Categoria, Custodio.ID_Usuario, Devolucion.ID_Asignacion, Usuario.Email | 9 (mismas columnas) | — | Coincide |
| UNIQUE compuesto | 1: Custodio (tipo_documento, N_documento) | 1: Custodio (tipo_documento, N_documento) | — | Coincide |
| Columnas ENUM y valores | 13 (12 en tablas y Reportes.Tipo_Reporte) | 13 (Tabla 16) | — | Coincide (valores iguales y en el mismo orden) |
| Cardinalidad de R1 a R19 | Derivada de obligatorio y UNIQUE de cada FK | Tabla 1 de 3.2 | — | Coincide (19 de 19) |
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de validar) con aud7b.py sobre el diccionario v7 y la sección 3.2. Unique en el diccionario = UNIQUE en el MER.*
 
3.4.3 Comparación 2: diccionario frente al diagrama de clases
 
La Tabla 3 compara los 15 elementos del diccionario con las 15 clases del diagrama: atributos, tipos, opcionalidad ([0..1] frente a Obligatorio = No), claves, enumeraciones, el dato derivado /Dias_Restantes y la vista Reportes, que no se almacenan. Coinciden nombres, tipos base, opcionalidad, claves y las 12 enumeraciones con sus valores. La única diferencia es de presentación: 34 atributos almacenados INT y BIGINT aparecen en el diagrama sin el número entre paréntesis que sí tienen el diccionario y el MER (hallazgo H-04); el derivado /Dias_Restantes : INT también aparece sin número y no se cuenta.
 
**Tabla ****3****. ***Comparación 2: diccionario v7 frente al diagrama de clases v6*
 
| **Elemento** | **Diccionario** | **MER** | **Clases** | **Resultado** |
| --- | --- | --- | --- | --- |
| Elementos y clases | 15 (14 tablas y la vista Reportes) | 14 entidades (Reportes no es entidad) | 15 clases (Reportes con «view») | Coincide (mismos 15 nombres en diccionario y clases) |
| Atributos almacenados | 83 | 83 | 83 (y 4 no almacenados: /Dias_Restantes y 3 de Reportes) | Coincide |
| Tipo base de los atributos | INT, VARCHAR, BIGINT, DATE, DATETIME, BOOLEAN, ENUM | Igual (Comparación 1) | Mismo tipo SQL; las columnas ENUM usan la enumeración como tipo | Coincide |
| Longitud de VARCHAR | VARCHAR(n) | VARCHAR(n) | VARCHAR(n) | Coincide |
| Longitud de INT y BIGINT | INT 11 y BIGINT 20 (34 columnas) | INT(11) y BIGINT(20) | INT y BIGINT, sin número | Difiere en la presentación: H-04 |
| Opcionales | Obligatorio = No | NULL | [0..1] | Coincide (mismas columnas) |
| PK, FK y UNIQUE | PK, «FK hacia …», Unique | PK, FK, UNIQUE | {PK, readOnly}, {FK}, {UNIQUE} | Coincide (Auditoria.ID_Registro: «referencia lógica, no FK» en diccionario y clases) |
| Enumeraciones | 12 tipos de ENUM en las columnas | 12 enumeraciones en la Tabla 16 | 12 «enumeration» | Coincide (12 de 12 con los mismos valores; Tipo_Documento: códigos CC, CE y PA) |
| Dato derivado | /Dias_Restantes: «Dato derivado, no se almacena» | No es columna (3.2) | /Dias_Restantes : INT {derivado, no se almacena} | Coincide |
| Vista Reportes | 3 parámetros (Fecha_Inicio, Fecha_Fin, Tipo_Reporte); no es tabla | No es entidad ni tabla | «view» con los mismos 3 atributos; Fecha_Fin [0..1] | Coincide |
| Métodos | — (fuera del alcance del diccionario) | — | 76 (62 públicos y 14 INTERNO); la leyenda dice 62 + 14 = 76 | Coincide (conteo igual a la leyenda) |
| Convención de tipos | Tipos SQL | Tipos SQL | Atributos con tipos SQL y métodos con tipos Java | Aplicada sin excepciones (0 atributos con tipo Java, 0 métodos con tipo SQL); decisión abierta: H-05 |
| Asignacion.ID_Custodio | INT 11, FK hacia Custodio; «Al crear se copia de la Solicitud asociada» | INT(11), FK → Custodio (R10) | ID_Custodio : INT = Solicitud.ID_Custodio {FK} | Coincide en los tres; desnormalización por registrar: H-01 |
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de validar) con aud7b.py sobre el diccionario v7, la sección 3.2 y el texto del PDF del diagrama de clases (**pdftotext**).*
 
3.4.4 Comparación 3: MER frente al diagrama de clases
 
La Tabla 4 compara las 14 entidades del MER con las clases y cada relación R1 a R19 con su asociación en el diagrama. Para cada asociación, el script tomó del PDF la clase de cada extremo y su multiplicidad; las 19 asociaciones unen las mismas parejas de clases que R1 a R19 y tienen las mismas multiplicidades (en el diagrama, «1» equivale a «1..1» del MER). Los nombres de rol aprobador, receptor y técnico quedan sobre las asociaciones de R9, R14 y R19, como en el MER. La única clase sin entidad es Reportes, que es una vista.
 
**Tabla ****4****. ***Comparación 3: relaciones R1 a R19 del MER frente a las asociaciones del diagrama de clases*
 
| **Elemento (padre → ****hija****)** | **Diccionario** | **MER (padre / hija)** | **Clases (padre / hija)** | **Resultado** |
| --- | --- | --- | --- | --- |
| Entidades y clases | 14 tablas | 14 entidades | 15 clases | Coincide (la clase Reportes es la vista; no es entidad) |
| R1: Categoria → Activo | FK obligatoria | 1..1 / 0..* | 1 / 0..* | Coincide |
| R2: Usuario → Custodio | FK obligatoria | 1..1 / 0..1 | 1 / 0..1 | Coincide |
| R3: Usuario → Auditoria | FK obligatoria | 1..1 / 0..* | 1 / 0..* | Coincide |
| R4: Asignacion → Acta_De_Entrega | FK obligatoria | 1..1 / 0..1 | 1 / 0..1 | Coincide |
| R5: Asignacion → Notificacion_De_Devolucion | FK obligatoria | 1..1 / 0..* | 1 / 0..* | Coincide |
| R6: Categoria → Solicitud | FK obligatoria | 1..1 / 0..* | 1 / 0..* | Coincide |
| R7: Custodio → Solicitud | FK obligatoria | 1..1 / 0..* | 1 / 0..* | Coincide |
| R8: Solicitud → Aprobacion | FK obligatoria | 1..1 / 0..1 | 1 / 0..1 | Coincide |
| R9: Usuario → Aprobacion (rol aprobador) | FK obligatoria | 1..1 / 0..* | 1 / 0..* | Coincide |
| R10: Custodio → Asignacion | FK obligatoria | 1..1 / 0..* | 1 / 0..* | Coincide |
| R11: Activo → Asignacion | FK obligatoria | 1..1 / 0..* | 1 / 0..* | Coincide |
| R12: Solicitud → Asignacion | FK obligatoria | 1..1 / 0..1 | 1 / 0..1 | Coincide |
| R13: Asignacion → Devolucion | FK obligatoria | 1..1 / 0..1 | 1 / 0..1 | Coincide |
| R14: Usuario → Devolucion (rol receptor) | FK opcional | 0..1 / 0..* | 0..1 / 0..* | Coincide |
| R15: Custodio → Reporte_de_Danios | FK obligatoria | 1..1 / 0..* | 1 / 0..* | Coincide |
| R16: Activo → Reporte_de_Danios | FK obligatoria | 1..1 / 0..* | 1 / 0..* | Coincide |
| R17: Activo → Historial_Mantenimientos | FK obligatoria | 1..1 / 0..* | 1 / 0..* | Coincide |
| R18: Reporte_de_Danios → Historial_Mantenimientos | FK opcional | 0..1 / 0..* | 0..1 / 0..* | Coincide |
| R19: Usuario → Historial_Mantenimientos (rol técnico) | FK obligatoria | 1..1 / 0..* | 1 / 0..* | Coincide |
| Total de relaciones y asociaciones | 19 FK | 19 (R1 a R19) | 19 asociaciones | Coincide (19 de 19) |
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de validar) con asoc.py (geometría del PDF con **pdfplumber**) y aud7b.py sobre la Tabla 1 de 3.2. Diccionario: obligatoriedad de la FK de la tabla hija.*
 
3.4.5 Hallazgos y corrección propuesta
 
Las comparaciones no encontraron diferencias de estructura: tablas, columnas, tipos base, claves, relaciones, multiplicidades y enumeraciones coinciden en los tres modelos. La Tabla 5 lista cinco hallazgos de documentación y de criterio, cada uno con el archivo y el lugar donde aparece. Las correcciones se proponen como COR o HAL sin número; el número lo asigna el asesor al integrar. Ninguna se aplicó en los archivos fuente: esta constancia no modifica el diccionario, el MER ni el diagrama.
 
**Tabla ****5****. ***Hallazgos de la auditoría cruzada*
 
| **Id** | **Comparación** | **Qué difiere (archivo y lugar)** | **Severidad** | **Corrección propuesta (COR o HAL, sin numerar)** | **Estado** |
| --- | --- | --- | --- | --- | --- |
| H-01 | Comparaciones 2 y 3 | Asignacion.ID_Custodio aparece igual en los tres modelos: diccionario v7, tabla Asignacion, fila ID_Custodio («Al crear se copia de la Solicitud asociada»); diagrama v6, clase Asignacion («ID_Custodio : INT = Solicitud.ID_Custodio {FK}»); 3.2, Tabla 1, R10 y tabla de columnas de Asignacion. Su valor se puede deducir por R12 (Asignacion.ID_Solicitud es UNIQUE) y R7. El registro de correcciones del diccionario eliminó Devolucion.ID_Custodio con el mismo argumento («el custodio ya se deduce»). Como ID_Solicitud es UNIQUE y obligatorio, la tabla sigue en 3FN; lo que hay es un dato repetido entre tablas. | Media | HAL nuevo: registrar Asignacion.ID_Custodio como desnormalización deliberada, con la condición de coherencia Asignacion.ID_Custodio = Solicitud.ID_Custodio, y explicar por qué se conserva aquí y no en Devolucion. | Pendiente de docente |
| H-02 | Comparaciones 1, 2 y 3 | Versión del diagrama de clases: el PDF se titula «Diagrama de clases v6 (CRF-002 y CRF-003)»; 3.2 cita el «diagrama de clases v6» (párrafo inicial de 3.2.1 y fuentes de las Figuras 1 a 5 y de la Tabla 16) y el «diccionario (versión v7)»; el archivo del diccionario se titula «Diccionario de Datos y Diagrama de Clases», versión v7. Hoy las menciones al diagrama coinciden (v6), pero el título del diccionario incluye «Diagrama de Clases» con otra versión, y el equipo tiene previsto llamar v7 al diagrama. | Baja | COR: cuando el diagrama pase a llamarse v7, cambiar a la vez el título del PDF y las menciones «diagrama de clases v6» de 3.2; mientras tanto, citar el diagrama como «v6 con CRF-003». | Abierto (equipo) |
| H-03 | Comparación 2 | Diccionario v7, tabla Rol_Permiso: una nota entre barras dobles («// Método consultarPermisos(rol : Nombre_Rol) : List<Nombre_Permiso> — … //») documenta un método dentro del diccionario de datos. Ese método ya está en la clase Rol_Permiso con la misma firma. Las notas de Notificacion_De_Devolucion y de la vista Reportes usan el mismo formato, pero explican datos de la tabla. | Baja | COR: quitar la nota del método de la tabla Rol_Permiso (queda en el diagrama de clases) o pasarla a Observaciones con redacción de diccionario. | Abierto (equipo) |
| H-04 | Comparación 2 | Diagrama v6: 34 atributos almacenados INT y BIGINT sin el número entre paréntesis (por ejemplo, «ID_Activo : INT {PK, readOnly}», «Costo : BIGINT [0..1]»), mientras el diccionario (columna Longitud: 11 y 20) y 3.2 (INT(11), BIGINT(20)) lo muestran; el derivado /Dias_Restantes : INT también aparece sin número y no se cuenta. El número no cambia el rango del tipo, pero la plantilla pide en 3.3 «los tipos exactos del diccionario». | Baja | COR: escribir INT(11) y BIGINT(20) en el diagrama, o declarar en 3.3 que se omite el número entre paréntesis. | Pendiente de docente (junto con H-05) |
| H-05 | Comparación 2 | Convención del diagrama v6 (leyenda del PDF): atributos con tipos SQL y métodos con tipos Java. El script la encontró aplicada sin excepciones. No es una inconsistencia entre modelos: es una decisión que la docente aún no confirma. | — (decisión) | Ninguna en los archivos; confirmar la convención con la docente y dejarla escrita en 3.3. | Pendiente de docente |
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de validar) a partir de aud7b.py y asoc.py. Severidad: Media = afecta la integridad de los datos si no se controla; Baja = afecta la documentación o la presentación.*
 
3.4.6 Cierre
 
Se hicieron tres comparaciones. La Comparación 1 cubrió 14 tablas, 83 columnas, 15 columnas PK, 19 FK, 9 UNIQUE simples, 1 UNIQUE compuesto y 13 columnas ENUM, sin diferencias. La Comparación 2 cubrió 15 elementos contra 15 clases, 83 atributos almacenados, 4 no almacenados, 12 enumeraciones y 76 métodos; solo difiere la presentación de INT y BIGINT. La Comparación 3 cubrió las relaciones R1 a R19 contra 19 asociaciones, todas con los mismos extremos y multiplicidades. Quedan cinco hallazgos: dos abiertos para el equipo (H-02 y H-03) y tres pendientes de la docente (H-01, H-04 y H-05). Ninguno está cerrado, porque esta constancia no modifica los archivos fuente. Ningún hallazgo cambia tablas, columnas, claves ni relaciones, así que el script DDL de la sección 4.1 puede derivarse del modelo relacional de 3.2 tal como está.
 
3.4.7 Responsables de la auditoría
 
La auditoría cruzada la realizaron Eliú Marimón y Julián Valencia (cronograma de 16 semanas, actividad 7b). En la Tabla 6 el equipo indica quién elaboró y quién revisó, con la fecha y la firma. La lectura por otro equipo corresponde a la sección 3.10 (punto 12b).
 
**Tabla ****6****. ***Responsables de la auditoría cruzada*
 
| **Rol** | **Nombre** | **Fecha** | **Firma** |
| --- | --- | --- | --- |
| Elaboró | Julián Valencia | 4/11/2026 |  |
| Revisó | Eliú Marimón | 4/11/2026 |  |
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de validar) a partir del cronograma de 16 semanas (actividad 7b, Eliu Marimon y Julian Valencia).*