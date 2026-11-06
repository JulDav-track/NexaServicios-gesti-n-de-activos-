**Sistema de Gestión de Activos (NexaActivos)**
 
**Sección 2.5 — Mockups (UI/UX)**
 
*Wireframes de las pantallas críticas, con su trazabilidad a historias, casos de uso y diagrama de clases*
 
# **2.5 Mockups (UI/UX)**
 
## **2.5.1 Cómo se leen los mockups**
 
Cada mockup es un wireframe de baja fidelidad de una pantalla crítica. Lleva su código MK-xx, declara la historia de usuario (HU) y el caso de uso (CU) que atiende, usa los nombres y los tipos del diccionario de datos v6, muestra el camino triste (los mensajes de rechazo) y explica la consecuencia en los avisos. Se presentan trece pantallas: las de los seis casos de uso documentados (CU-01, CU-09, CU-13, CU-15, CU-19 y CU-24), las pantallas de entrada que esos flujos necesitan (CU-02, CU-10 y CU-22) y las que completan el ciclo de vida del activo, de la solicitud, de la asignación y de la devolución (CU-03, CU-04, CU-11, CU-12, CU-16, CU-18 y CU-21). Los demás casos de uso no tienen pantalla en esta entrega.
 
Las llamadas de color son círculos numerados: cada uno señala una zona de la pantalla y su número remite a la columna lateral, donde se indica de dónde nace esa zona (Tabla 1).
 
**Tabla 1. Llamadas de color de las figuras**
 
| **Color** | **Qué señala** |
| --- | --- |
| **Verde** | Campo del diccionario de datos v6, con su tipo y longitud. |
| **Azul** | Método de la clase con su RF, o navegación a otra pantalla («navega a MK-xx»). |
| **Naranja** | Regla de negocio (RN) con ficha, o el destino de una RN sin ficha. |
| **Rojo** | Mensaje de rechazo del catálogo (M-01 a M-273), o el rechazo por rol. |
| **Violeta** | Valor que asigna el sistema o que se toma de la sesión (RF-168 a RF-172): solo lectura, con su RF. |
| **Gris** | Propuesta o asunto pendiente, pendiente de validar con el cliente. |
| **Verde azulado** | Mensaje de éxito o aviso de consecuencia. |
 
*Fuente: elaboración propia.*
 
**Criterios de lectura.** Los campos y sus tipos salen del diccionario v6; los valores que asigna el sistema se muestran en solo lectura o no se muestran, y se cita su origen. Los mensajes son los del catálogo de las historias de usuario. El rechazo por rol usa el texto «No tiene permiso para realizar esta operación.», que es una propuesta, pendiente de validar con el cliente (RNF-01, RF-166), salvo en MK-05 (M-85) y MK-09 (M-154). Los botones que abren otra pantalla se rotulan «navega a MK-xx» y su RF se cita en la ficha de la pantalla de destino. La firma digital no se diseña (P-38). La barra de sesión muestra usuario y rol (RNF-02); el vencimiento y el cierre de la sesión no se dibujan (P-70). Todo lo que no está definido en las fuentes se marca como propuesta, pendiente de validar con el cliente.
 
## **2.5.2 Lista de pantallas y navegación**
 
**Tabla 2. Lista de pantallas**
 
| **Código** | **Pantalla** | **HU / CU** | **Modos** | **Navega a** |
| --- | --- | --- | --- | --- |
| **MK-01** | Activos: listado y búsqueda | HU-02 / CU-02 | (a) consultar inventario; (b) seleccionar activo | MK-02, MK-06, MK-10, MK-11 |
| **MK-02** | Registrar activo | HU-01 / CU-01 | Registrar | MK-01 |
| **MK-03** | Registrar solicitud de equipo | HU-09 / CU-09 | Registrar | MK-04 |
| **MK-04** | Solicitudes: listados | HU-10 / CU-10 | (a) mis solicitudes; (b) pendientes; (c) aprobadas sin asignación | MK-03, MK-05, MK-06, MK-12 |
| **MK-05** | Registrar decisión | HU-13 / CU-13 | Aprobar o rechazar | MK-04 |
| **MK-06** | Asignar equipo | HU-15 / CU-15 | Asignar | MK-01 (modo b), MK-04 |
| **MK-07** | Firmar acta de entrega | HU-19 / CU-19 | Firmar | — (se abre desde MK-13) |
| **MK-08** | Devoluciones: pendientes, consulta y registro | HU-22 y HU-21 / CU-22 y CU-21 | (a) lista de pendientes; (b) búsqueda por ID de las propias; (c) registrar devolución | MK-09 |
| **MK-09** | Confirmar recepción (aviso) | HU-24 / CU-24 | Confirmar o desistir | MK-08 |
| **MK-10** | Actualizar activo | HU-03 / CU-03 | Actualizar | MK-01, MK-11 |
| **MK-11** | Dar de baja activo (aviso) | HU-04 / CU-04 | Confirmar la baja o desistir | — |
| **MK-12** | Solicitud: actualizar y cancelar | HU-11 y HU-12 / CU-11 y CU-12 | (a) actualizar; (b) cancelar, con aviso | MK-04 |
| **MK-13** | Asignaciones: listados y cierre | HU-16 y HU-18 / CU-16 y CU-18 | (a) vigentes, con cierre; (b) por custodio o propias, con «Firmar acta» | MK-07 |
 
*Fuente: elaboración propia a partir de las historias de usuario y de los casos de uso documentados.*
 
*Figura 1. Mapa de navegación entre los trece mockups.*
 
*Fuente: elaboración propia.*
 
## **2.5.3 MK-01 Activos: listado y búsqueda**
 
*Figura 2. MK-01 Activos: listado y búsqueda. Las llamadas de color señalan de dónde nace cada zona de la pantalla.*
 
*Fuente: elaboración propia a partir de la HU-02, del diccionario v6 y del catálogo de mensajes.*
 
**Tabla 3. Ficha del mockup MK-01**
 
| **Campo de la ficha** | **MK-01 Activos: listado y búsqueda** |
| --- | --- |
| **Código** | MK-01 |
| **Pantalla** | Activos: listado y búsqueda Modos: (a) consultar inventario; (b) seleccionar activo, llamado desde MK-06 (propuesta, pendiente de validar con el cliente). |
| **Atiende (HU / CU)** | HU-02 / CU-02 Consultar activos (CU no documentado en esta entrega). Pantalla de entrada a CU-01 («+ Registrar activo», navega a MK-02), a CU-03 («Editar», navega a MK-10), a CU-04 («Dar de baja», navega a MK-11) y, en el modo (b), a CU-15 («Seleccionar», navega a MK-06). |
| **Campos ↔ Diccionario** | • Criterio de búsqueda (tabla Activo): ID_Activo INT(11), Numero_Serie VARCHAR(20) o Placa_Inventario VARCHAR(11). • Tabla de 6 columnas, ordenada por Placa_Inventario: Placa_Inventario VARCHAR(11), ID_Activo INT(11), Marca VARCHAR(50), Modelo VARCHAR(50), Numero_Serie VARCHAR(20) y Estado ENUM (Disponible, Asignado, Dañado, Baja). • Columna de acciones por fila: «Editar» y «Dar de baja» (botones; no son campos del diccionario). • Ficha del activo encontrado, con los 8 campos: los seis anteriores más Ubicacion VARCHAR(100) y ID_Categoria INT(11). |
| **Botones ↔ Eventos (método y RF)** | • «Buscar» → buscarPorId(), buscarPorNumeroSerie() o buscarPorPlaca() (RF-03). • La tabla se llena con listarInventario() (RF-56). • «+ Registrar activo»: navega a MK-02. • «Editar» (en cada fila): navega a MK-10. • «Dar de baja» (en cada fila): navega a MK-11. • «Seleccionar» (modo b): navega a MK-06. |
| **RN visibles** | • RN-A14: «Inventario ordenado por placa, con todos los estados y 6 columnas». Sin ficha; destino: RF-56 y mockup. MK-01 la muestra: tabla de 6 columnas, ordenada por Placa_Inventario, con todos los estados. • RN-A15: «La búsqueda por clave devuelve un solo activo con sus 8 campos o informa que no existe». Sin ficha; destino: RF-03 y mockup/mensaje. MK-01 la muestra: ficha de 8 campos y los mensajes M-17, M-18 y M-19. |
 
*Fuente: elaboración propia a partir de la HU-02, del diccionario v6, del diagrama de clases v6 (con CRF-003) y de los documentos de RF y RN.*
 
**Tabla 4. Caminos tristes y mensajes de MK-01**
 
| **Camino** | **Mensaje del catálogo (M-xx)** | **Dónde se ve** |
| --- | --- | --- |
| Búsqueda por ID_Activo sin resultado | M-18 «No se encontró ningún activo con ese identificador.» | Criterio de búsqueda |
| Búsqueda por Numero_Serie sin resultado | M-19 «No se encontró ningún activo con ese número de serie.» | Criterio de búsqueda |
| Búsqueda por Placa_Inventario sin resultado | M-17 «No se encontró ningún activo con esa placa de inventario.» | Criterio de búsqueda |
| Inventario sin activos | M-16 «No hay activos registrados.» | Tabla |
| Rol sin permiso para la operación | Sin código M-xx: «No tiene permiso para realizar esta operación.» (propuesta, pendiente de validar con el cliente; RNF-01, RF-166) | Aviso al intentar la operación |
 
*Fuente: catálogo de mensajes M-01 a M-273 de las historias de usuario.*
 
## **2.5.4 MK-02 Registrar activo**
 
*Figura 3. MK-02 Registrar activo. Las llamadas de color señalan de dónde nace cada zona de la pantalla.*
 
*Fuente: elaboración propia a partir de la HU-01, del diccionario v6 y del catálogo de mensajes.*
 
**Tabla 5. Ficha del mockup MK-02**
 
| **Campo de la ficha** | **MK-02 Registrar activo** |
| --- | --- |
| **Código** | MK-02 |
| **Pantalla** | Registrar activo Un solo modo: registrar. |
| **Atiende (HU / CU)** | HU-01 / CU-01 Registrar activo. Se abre desde MK-01 («+ Registrar activo»). |
| **Campos ↔ Diccionario** | • Marca VARCHAR(50), obligatoria. • Modelo VARCHAR(50), obligatorio. • Numero_Serie VARCHAR(20), obligatorio. • Placa_Inventario VARCHAR(11), obligatoria. • Ubicacion VARCHAR(100), opcional. • ID_Categoria INT(11), obligatorio; campo numérico sin ayuda de búsqueda (propuesta, pendiente de validar con el cliente). • Estado ENUM (Disponible, Asignado, Dañado, Baja): solo lectura, «Disponible»; lo asigna el sistema (violeta). ID_Activo INT(11) no se muestra (automático). |
| **Botones ↔ Eventos (método y RF)** | • «Guardar» → crear() (RF-01); antes existeNumeroSerie() y existePlaca() (RF-02, INTERNO, incluido CU-49) y la validación de categoría (incluido CU-48, RF-52). • «Cancelar»: navega a MK-01. |
| **RN visibles** | • RN-A03: Numero_Serie único, también entre los activos dados de baja (RF-02). • RN-A04: Placa_Inventario única, también entre los activos dados de baja (RF-02). • RN-A09: la categoría debe estar activa (RF-52). • Las demás reglas de los criterios de aceptación son restricciones del diccionario (campos obligatorios y longitudes). El alta del activo no se audita (P-89, abierta). |
 
*Fuente: elaboración propia a partir de la HU-01, del diccionario v6, del diagrama de clases v6 (con CRF-003) y de los documentos de RF y RN.*
 
**Tabla 6. Caminos tristes y mensajes de MK-02**
 
| **Camino** | **Mensaje del catálogo (M-xx)** | **Dónde se ve** |
| --- | --- | --- |
| Marca obligatoria / más de 50 caracteres | M-10 «La marca es obligatoria.» M-11 «La marca no puede superar 50 caracteres.» | Marca |
| Modelo obligatorio / más de 50 caracteres | M-02 «El modelo es obligatorio.» M-03 «El modelo no puede superar 50 caracteres.» | Modelo |
| Numero_Serie obligatorio / más de 20 caracteres / ya registrado | M-04 «El número de serie es obligatorio.» M-05 «El número de serie no puede superar 20 caracteres.» M-06 «El número de serie ya está registrado.» | Numero_Serie |
| Placa_Inventario obligatoria / más de 11 caracteres / ya registrada | M-12 «La placa de inventario es obligatoria.» M-13 «La placa de inventario no puede superar 11 caracteres.» M-14 «La placa de inventario ya está registrada.» | Placa_Inventario |
| Ubicacion de más de 100 caracteres | M-15 «La ubicación no puede superar 100 caracteres.» | Ubicacion |
| ID_Categoria obligatoria / inexistente / inactiva | M-07 «La categoría es obligatoria.» M-09 «La categoría seleccionada no existe.» M-08 «La categoría seleccionada está inactiva.» | ID_Categoria |
| Rol sin permiso para la operación | Sin código M-xx: «No tiene permiso para realizar esta operación.» (propuesta, pendiente de validar con el cliente; RNF-01, RF-166) | Aviso al intentar la operación |
| Operación correcta | M-01 «Activo registrado correctamente.» Consecuencia: el activo queda guardado con Estado Disponible. | Aviso de éxito |
 
*Fuente: catálogo de mensajes M-01 a M-273 de las historias de usuario.*
 
## **2.5.5 MK-03 Registrar solicitud de equipo**
 
*Figura 4. MK-03 Registrar solicitud de equipo. Las llamadas de color señalan de dónde nace cada zona de la pantalla.*
 
*Fuente: elaboración propia a partir de la HU-09, del diccionario v6 y del catálogo de mensajes.*
 
**Tabla 7. Ficha del mockup MK-03**
 
| **Campo de la ficha** | **MK-03 Registrar solicitud de equipo** |
| --- | --- |
| **Código** | MK-03 |
| **Pantalla** | Registrar solicitud de equipo Un solo modo: registrar. |
| **Atiende (HU / CU)** | HU-09 / CU-09 Registrar solicitud de equipo. Se abre desde MK-04, modo (a) («+ Nueva solicitud»). |
| **Campos ↔ Diccionario** | • ID_Categoria INT(11), obligatorio; campo numérico sin ayuda de búsqueda (propuesta, pendiente de validar con el cliente). • Motivo VARCHAR(255), obligatorio. • ID_Custodio INT(11): solo lectura; se toma del custodio del usuario en sesión (RF-168). • ID_Solicitud INT(11), Fecha_Solicitud DATETIME y Estado_Solicitud ENUM (Pendiente, Aprobada, Rechazada, Cancelada): no se muestran; los asigna el sistema (Estado_Solicitud = Pendiente). |
| **Botones ↔ Eventos (método y RF)** | • «Enviar solicitud» → crear() (RF-11); incluye la validación de categoría (CU-48, RF-68). • «Cancelar»: navega a MK-04. |
| **RN visibles** | • RN-S07: la categoría debe estar activa (RF-68). • RN-S09 y RN-S10b: el custodio existe, está activo y está registrado (RF-69, RF-70). • RN-S19 (incluye RN-S10c): la solicitud se registra a nombre del propio custodio (RF-71). |
 
*Fuente: elaboración propia a partir de la HU-09, del diccionario v6, del diagrama de clases v6 (con CRF-003) y de los documentos de RF y RN.*
 
**Tabla 8. Caminos tristes y mensajes de MK-03**
 
| **Camino** | **Mensaje del catálogo (M-xx)** | **Dónde se ve** |
| --- | --- | --- |
| ID_Categoria obligatoria / inexistente / inactiva | M-07 «La categoría es obligatoria.» M-09 «La categoría seleccionada no existe.» M-08 «La categoría seleccionada está inactiva.» | ID_Categoria |
| Motivo obligatorio / más de 255 caracteres | M-63 «El motivo es obligatorio.» M-64 «El motivo no puede superar 255 caracteres.» | Motivo |
| Custodio inactivo / empleado no registrado como custodio | M-61 «El custodio está inactivo.» M-62 «El empleado no está registrado como custodio.» | ID_Custodio |
| Sin camino en esta pantalla (el custodio viene de la sesión, RF-168) | M-60 «El custodio es obligatorio.» M-272 «El custodio no corresponde al empleado que solicita.» M-50 «El custodio no existe.» | ID_Custodio |
| Rol sin permiso para la operación | Sin código M-xx: «No tiene permiso para realizar esta operación.» (propuesta, pendiente de validar con el cliente; RNF-01, RF-166) | Aviso al intentar la operación |
| Operación correcta | M-65 «Solicitud registrada correctamente.» Consecuencia: la solicitud queda Pendiente. | Aviso de éxito |
 
*Fuente: catálogo de mensajes M-01 a M-273 de las historias de usuario. Los códigos M-07, M-08 y M-09 están asignados en el catálogo a HU-01 y HU-03; el CA-4 de HU-09 usa el mismo texto. M-50 está asignado en el catálogo a HU-07, HU-08 y HU-16; el CU-09 lo usa en su flujo 6a.*
 
## **2.5.6 MK-04 Solicitudes: listados**
 
*Figura 5. MK-04 Solicitudes: listados. Las llamadas de color señalan de dónde nace cada zona de la pantalla.*
 
*Fuente: elaboración propia a partir de la HU-10, del diccionario v6 y del catálogo de mensajes.*
 
**Tabla 9. Ficha del mockup MK-04**
 
| **Campo de la ficha** | **MK-04 Solicitudes: listados** |
| --- | --- |
| **Código** | MK-04 |
| **Pantalla** | Solicitudes: listados Modos: (a) mis solicitudes (Empleado); (b) pendientes (Aprobador); (c) aprobadas sin asignación (Responsable de Activos, CRF-003); propuesta, pendiente de validar con el cliente (P-27, P-C3-05). |
| **Atiende (HU / CU)** | HU-10 / CU-10 Consultar solicitudes (CU no documentado en esta entrega). Pantalla de entrada a CU-09 (MK-03), CU-11 y CU-12 (MK-12), CU-13 (MK-05) y CU-15 (MK-06). |
| **Campos ↔ Diccionario** | • Criterio de búsqueda (tabla Solicitud): ID_Solicitud INT(11). • Tabla de 6 columnas: ID_Solicitud INT(11), ID_Categoria INT(11), Motivo VARCHAR(255), Fecha_Solicitud DATETIME, ID_Custodio INT(11) y Estado_Solicitud ENUM (Pendiente, Aprobada, Rechazada, Cancelada). • Columna de acciones por modo: «Editar» y «Cancelar» (a), «Decidir» (b) y «Asignar» (c); son botones, no campos del diccionario. |
| **Botones ↔ Eventos (método y RF)** | • «Buscar» → buscarPorId() (RF-72). • Modo (a): listarPorCustodio() (RF-12). Modo (b): listarPendientes() (RF-73). Modo (c): listarAprobadas() (RF-74, CRF-003). • «+ Nueva solicitud» (modo a): navega a MK-03. • «Editar» (modo a): navega a MK-12, modo (a). «Cancelar» (modo a): navega a MK-12, modo (b). • «Decidir» (modo b): navega a MK-05. «Asignar» (modo c): navega a MK-06. |
| **RN visibles** | • RN-S19: el Empleado solo ve sus propias solicitudes (RF-75). • RN-S16, RN-S17, RN-S18 y RN-S21: sin ficha; destino: RF y mockup/mensaje (esta tabla y los mensajes M-66, M-67, M-68, M-92). • RN-S20: sin ficha; requisito no funcional candidato (autoridad por rol). • El orden de los listados es propuesto (P-20, P-C3-05). |
 
*Fuente: elaboración propia a partir de la HU-10, del diccionario v6, del diagrama de clases v6 (con CRF-003) y de los documentos de RF y RN.*
 
**Tabla 10. Caminos tristes y mensajes de MK-04**
 
| **Camino** | **Mensaje del catálogo (M-xx)** | **Dónde se ve** |
| --- | --- | --- |
| Búsqueda por ID_Solicitud sin resultado | M-68 «No se encontró ninguna solicitud con ese identificador.» | Criterio de búsqueda |
| Solicitud de otro custodio (Empleado) | M-69 «No tiene acceso a esa solicitud.» | Criterio de búsqueda |
| Empleado sin solicitudes (modo a) | M-66 «El custodio no tiene solicitudes.» | Tabla |
| Sin solicitudes pendientes (modo b) | M-67 «No hay solicitudes pendientes.» | Tabla |
| Sin solicitudes aprobadas pendientes de asignación (modo c) | M-92 «No hay solicitudes aprobadas pendientes de asignación.» (adenda de CRF-003) | Tabla |
| Rol sin permiso para la operación | Sin código M-xx: «No tiene permiso para realizar esta operación.» (propuesta, pendiente de validar con el cliente; RNF-01, RF-166) | Aviso al intentar la operación |
 
*Fuente: catálogo de mensajes M-01 a M-273 de las historias de usuario.*
 
## **2.5.7 MK-05 Registrar decisión**
 
*Figura 6. MK-05 Registrar decisión. Las llamadas de color señalan de dónde nace cada zona de la pantalla.*
 
*Fuente: elaboración propia a partir de la HU-13, del diccionario v6 y del catálogo de mensajes.*
 
**Tabla 11. Ficha del mockup MK-05**
 
| **Campo de la ficha** | **MK-05 Registrar decisión** |
| --- | --- |
| **Código** | MK-05 |
| **Pantalla** | Registrar decisión Un solo modo: aprobar o rechazar, según Decision. |
| **Atiende (HU / CU)** | HU-13 / CU-13 Registrar decisión sobre una solicitud. Se abre desde MK-04, modo (b) («Decidir»). |
| **Campos ↔ Diccionario** | • ID_Solicitud INT(11), obligatorio; llega precargado desde MK-04 (propuesta, pendiente de validar con el cliente). • ID_Aprobador INT(11): solo lectura; se toma del usuario en sesión (RF-169). • Decision ENUM (Aprobada, Rechazada), obligatorio. • Motivo_Rechazo VARCHAR(300), opcional; obligatorio si Decision = Rechazada. • ID_Aprobacion INT(11) y Fecha_Decision DATETIME: no se muestran; los asigna el sistema. |
| **Botones ↔ Eventos (método y RF)** | • «Registrar decisión» → decidir() (RF-16); verifica con existeDecisionDeSolicitud() (RF-82, INTERNO). Al registrar, el estado de la solicitud pasa a Aprobada o Rechazada según Decision (RF-86). • «Cancelar»: navega a MK-04. |
| **RN visibles** | • RN-AP02b: decisión y motivo del rechazo (RF-81). • RN-AP06a y RN-AP09: la solicitud existe, está pendiente y no tiene ya una decisión (RF-82). • RN-AP11a y RN-AP12a (ancla de 1.7.3): el aprobador está activo y la decisión se atribuye a quien la registra (RF-83, RF-84). • Rechazar no tiene permiso propio en el modelo (P-100, P-RP1, abiertas). |
 
*Fuente: elaboración propia a partir de la HU-13, del diccionario v6, del diagrama de clases v6 (con CRF-003) y de los documentos de RF y RN.*
 
**Tabla 12. Caminos tristes y mensajes de MK-05**
 
| **Camino** | **Mensaje del catálogo (M-xx)** | **Dónde se ve** |
| --- | --- | --- |
| Decision obligatoria / valor no válido | M-86 «La decisión es obligatoria.» M-87 «La decisión no es válida.» | Decision |
| Motivo del rechazo obligatorio / más de 300 caracteres | M-83 «El motivo del rechazo es obligatorio.» M-84 «El motivo del rechazo no puede superar 300 caracteres.» | Motivo_Rechazo |
| Solicitud ya decidida | M-88 «La solicitud ya tiene una decisión.» | ID_Solicitud |
| Solicitud inexistente / no pendiente | M-74 «La solicitud no existe.» M-89 «Solo se puede decidir sobre una solicitud pendiente.» | ID_Solicitud |
| Rechazo por rol del Aprobador (RNF-01, RF-166; CA-7 de HU-13) | M-85 «El usuario no tiene el rol Aprobador.» | Aviso al intentar la operación |
| Sin camino en esta pantalla (el aprobador viene de la sesión, RF-169) | M-273 «El aprobador debe ser el usuario con sesión iniciada.» M-39 «El usuario está inactivo.» M-40 «El usuario no existe.» | ID_Aprobador |
| Operación correcta | M-82 «Decisión registrada correctamente.» Consecuencia: la solicitud pasa a Aprobada o Rechazada, según Decision (RF-86). | Aviso de éxito |
 
*Fuente: catálogo de mensajes M-01 a M-273 de las historias de usuario. M-39 y M-40 están asignados en el catálogo a HU-05, HU-24 y HU-29; el CU-13 los usa en su flujo 7a.*
 
## **2.5.8 MK-06 Asignar equipo**
 
*Figura 7. MK-06 Asignar equipo. Las llamadas de color señalan de dónde nace cada zona de la pantalla.*
 
*Fuente: elaboración propia a partir de la HU-15, del diccionario v6 y del catálogo de mensajes.*
 
**Tabla 13. Ficha del mockup MK-06**
 
| **Campo de la ficha** | **MK-06 Asignar equipo** |
| --- | --- |
| **Código** | MK-06 |
| **Pantalla** | Asignar equipo Un solo modo: asignar. |
| **Atiende (HU / CU)** | HU-15 / CU-15 Asignar equipo a una solicitud aprobada. Se abre desde MK-04, modo (c) («Asignar»); el activo se elige con «Buscar en inventario» (MK-01, modo b). |
| **Campos ↔ Diccionario** | • ID_Solicitud INT(11), obligatorio; llega precargado desde MK-04 (propuesta, pendiente de validar con el cliente). • ID_Activo INT(11), obligatorio. • Fecha_Devolucion_Esperada DATE, obligatoria. • Fecha_Entrega DATE: solo lectura; la asigna el sistema (fecha actual). • ID_Custodio INT(11): solo lectura; se copia de la solicitud. • Estado_Asignacion ENUM (Vigente, Cerrada): solo lectura, «Vigente»; lo asigna el sistema. ID_Asignacion INT(11) no se muestra (automático). |
| **Botones ↔ Eventos (método y RF)** | • «Asignar equipo» → asignar() (RF-18); verifica con existeAsignacionDeSolicitud() (RF-88) y activoDisponible() (RF-89), ambos INTERNO. Al asignar, el activo queda Asignado (RF-91) y la asignación se audita (RF-161). • «Buscar en inventario»: navega a MK-01, modo (b). • «Cancelar»: navega a MK-04. |
| **RN visibles** | • RN-AS04: la solicitud existe y está aprobada (RF-87). • RN-AS05a: la solicitud no tiene ya una asignación (RF-88). • RN-AS07a (ancla de 1.7.3): solo un activo Disponible puede entregarse (RF-89). • RN-AS08: el activo es de la categoría de la solicitud (RF-90). • RN-T02a: la asignación se audita (RF-161). • Coherencia entre fechas: restricción del diccionario, que RF-18 enuncia. |
 
*Fuente: elaboración propia a partir de la HU-15, del diccionario v6, del diagrama de clases v6 (con CRF-003) y de los documentos de RF y RN.*
 
**Tabla 14. Caminos tristes y mensajes de MK-06**
 
| **Camino** | **Mensaje del catálogo (M-xx)** | **Dónde se ve** |
| --- | --- | --- |
| ID_Solicitud obligatoria / inexistente / no aprobada / ya asignada | M-94 «La solicitud es obligatoria.» M-74 «La solicitud no existe.» M-97 «Solo se puede asignar una solicitud aprobada.» M-98 «La solicitud ya tiene una asignación.» | ID_Solicitud |
| ID_Activo obligatorio / inexistente / no disponible / categoría distinta | M-95 «El activo es obligatorio.» M-21 «El activo no existe.» M-99 «El activo no está disponible.» M-100 «La categoría del activo no coincide con la de la solicitud.» | ID_Activo |
| Fecha de devolución esperada obligatoria / anterior a la entrega | M-96 «La fecha de devolución esperada es obligatoria.» M-101 «La fecha de devolución esperada no puede ser anterior a la fecha de entrega.» | Fecha_Devolucion_Esperada |
| Rol sin permiso para la operación | Sin código M-xx: «No tiene permiso para realizar esta operación.» (propuesta, pendiente de validar con el cliente; RNF-01, RF-166) | Aviso al intentar la operación |
| Operación correcta | M-93 «Equipo asignado correctamente.» Consecuencia: la asignación queda Vigente y el activo pasa a Estado Asignado (RF-91). | Aviso de éxito |
 
*Fuente: catálogo de mensajes M-01 a M-273 de las historias de usuario.*
 
## **2.5.9 MK-07 Firmar acta de entrega**
 
*Figura 8. MK-07 Firmar acta de entrega. Las llamadas de color señalan de dónde nace cada zona de la pantalla.*
 
*Fuente: elaboración propia a partir de la HU-19, del diccionario v6 y del catálogo de mensajes.*
 
**Tabla 15. Ficha del mockup MK-07**
 
| **Campo de la ficha** | **MK-07 Firmar acta de entrega** |
| --- | --- |
| **Código** | MK-07 |
| **Pantalla** | Firmar acta de entrega Un solo modo: firmar. |
| **Atiende (HU / CU)** | HU-19 / CU-19 Firmar acta de entrega. Se abre desde MK-13, modo (b), con «Firmar acta» en la fila del Empleado; el ID_Asignacion llega precargado desde MK-13 y ya no se digita (propuesta, pendiente de validar con el cliente). |
| **Campos ↔ Diccionario** | • ID_Asignacion INT(11), obligatorio; solo lectura, precargado desde MK-13. • Ruta_Acta VARCHAR(255), obligatoria; caja de texto, como dice CU-19. Mecanismo pendiente (P-38). • Firma_Digital VARCHAR(255), obligatoria; caja de texto, como dice CU-19. Mecanismo y algoritmo pendientes (P-38); la pantalla no los diseña. • ID_Acta INT(11) y Fecha_Firma DATETIME: no se muestran; los asigna el sistema al firmar. |
| **Botones ↔ Eventos (método y RF)** | • «Firmar acta» → firmar() (RF-22); verifica con existeActaDeAsignacion() (RF-105, INTERNO). • «Cancelar»: cierra la pantalla sin cambios. |
| **RN visibles** | • RN-AC06a: la asignación no tiene ya un acta (RF-105). • RN-AC05 (RF-104), RN-AC07a (ancla de 1.7.3) y RN-AC07b (RF-102, RF-103): se cumplen en la lista de MK-13, que solo ofrece las asignaciones vigentes y propias; la pantalla no las rechaza. • Estado resultante tras firmar: acta firmada; la asignación sigue Vigente. |
 
*Fuente: elaboración propia a partir de la HU-19, del diccionario v6, del diagrama de clases v6 (con CRF-003) y de los documentos de RF y RN.*
 
**Tabla 16. Caminos tristes y mensajes de MK-07**
 
| **Camino** | **Mensaje del catálogo (M-xx)** | **Dónde se ve** |
| --- | --- | --- |
| Asignación que ya tiene un acta | M-128 «La asignación ya tiene un acta.» | ID_Asignacion |
| Ruta_Acta obligatoria / más de 255 caracteres | M-123 «La ruta del acta es obligatoria.» M-124 «La ruta del acta no puede superar 255 caracteres.» | Ruta_Acta |
| Firma_Digital obligatoria / más de 255 caracteres | M-125 «La firma digital es obligatoria.» M-126 «La firma digital no puede superar 255 caracteres.» | Firma_Digital |
| Sin camino en esta pantalla (el ID_Asignacion llega precargado desde MK-13, que ofrece solo asignaciones vigentes y propias) | M-122 «La asignación es obligatoria.» M-108 «La asignación no existe.» M-127 «Solo se puede firmar el acta de una asignación vigente.» M-129 «Solo el custodio de la asignación puede firmar su acta.» | ID_Asignacion |
| Rol sin permiso para la operación | Sin código M-xx: «No tiene permiso para realizar esta operación.» (propuesta, pendiente de validar con el cliente; RNF-01, RF-166) | Aviso al intentar la operación |
| Operación correcta | M-121 «Acta firmada correctamente.» Consecuencia: acta firmada; la asignación sigue Vigente. | Aviso de éxito |
 
*Fuente: catálogo de mensajes M-01 a M-273 de las historias de usuario.*
 
## **2.5.10 MK-08 Devoluciones: pendientes, consulta y registro**
 
*Figura 9. MK-08 Devoluciones: pendientes, consulta y registro, modos (a) y (b). Las llamadas de color señalan de dónde nace cada zona de la pantalla.*
 
*Fuente: elaboración propia a partir de las HU-22 y HU-21, del diccionario v6 y del catálogo de mensajes.*
 
*Figura 10. MK-08 Devoluciones: pendientes, consulta y registro, modo (c). Las llamadas de color señalan de dónde nace cada zona de la pantalla.*
 
*Fuente: elaboración propia a partir de las HU-22 y HU-21, del diccionario v6 y del catálogo de mensajes.*
 
**Tabla 17. Ficha del mockup MK-08**
 
| **Campo de la ficha** | **MK-08 Devoluciones: pendientes, consulta y registro** |
| --- | --- |
| **Código** | MK-08 |
| **Pantalla** | Devoluciones: pendientes, consulta y registro Modos: (a) lista de pendientes (Responsable de Activos); (b) búsqueda por ID de las propias devoluciones, sin lista (Empleado); (c) registrar devolución (Empleado). Propuesta, pendiente de validar con el cliente (P-42). |
| **Atiende (HU / CU)** | HU-22 / CU-22 Consultar devoluciones pendientes de recepción y HU-21 / CU-21 Registrar devolución (CU no documentados en esta entrega). Pantalla de entrada a CU-24 (botón «Confirmar», navega a MK-09). |
| **Campos ↔ Diccionario** | • Criterio de búsqueda (tabla Devolucion): ID_Devolucion INT(11). • Tabla de 7 campos: ID_Devolucion INT(11), Fecha_Devolucion DATETIME, Observaciones VARCHAR(255), ID_Asignacion INT(11), Estado_Recepcion ENUM (Pendiente, Confirmada), Fecha_Confirmacion DATETIME e ID_Receptor INT(11). • Modo (c): ID_Asignacion INT(11), obligatorio; Observaciones VARCHAR(255), opcional. • ID_Devolucion INT(11), Fecha_Devolucion DATETIME y Estado_Recepcion ENUM (Pendiente, Confirmada): no se muestran en el modo (c); los asigna el sistema (Estado_Recepcion = Pendiente). Fecha_Confirmacion DATETIME e ID_Receptor INT(11) quedan vacíos. |
| **Botones ↔ Eventos (método y RF)** | • «Buscar» → buscarPorId() (RF-111). • Modo (a): la tabla se llena con listarPendientesDeRecepcion() (RF-25). Modo (b): no hay lista; solo «Buscar» (RF-111), y el Empleado solo ve devoluciones de sus asignaciones (RF-112). • «Confirmar» (modo a): navega a MK-09. • «Registrar devolución» (modo c) → registrar() (RF-24); verifica con existeDevolucionDeAsignacion() (RF-108, INTERNO). Al registrar, la asignación y el activo no cambian (RF-110) y la devolución se audita (RF-162). |
| **RN visibles** | • RN-D07b (incluye RN-D20): el Empleado solo ve devoluciones de sus asignaciones (RF-112) y solo registra las del propio custodio (RF-109). • RN-D05: solo se devuelve una asignación vigente (RF-107). RN-D06a: una sola devolución por asignación (RF-108). RN-T02a: se audita el registro (RF-162). • RN-D18 y RN-D19: sin ficha; destino: RF y mockup/mensaje (esta tabla y los mensajes M-137 y M-138). • RN-D21: sin ficha; requisito no funcional candidato (autoridad por rol). • HU-22 CA-6, «Ver las propias devoluciones pendientes (actor secundario: Empleado)», cita listarPendientesDeRecepcion() (RN-D19 y RN-D21, sin ficha; RN-D20, incluida en RN-D07b). Ese método no recibe el custodio en el diagrama v6 y el Anexo C del documento de RN lo concede solo al Responsable de Activos (TRA-10); por eso el modo (b) no dibuja lista (propuesta, pendiente de validar con el cliente). • HU-22 CA-7, «Devolución de otro custodio», cita buscarPorId() (RN-D20, incluida en RN-D07b): el sistema responde «No tiene acceso a esa devolución.» (M-139) y no muestra ningún dato. |
 
*Fuente: elaboración propia a partir de las HU-22 y HU-21, del diccionario v6, del diagrama de clases v6 (con CRF-003) y de los documentos de RF y RN.*
 
**Tabla 18. Caminos tristes y mensajes de MK-08**
 
| **Camino** | **Mensaje del catálogo (M-xx)** | **Dónde se ve** |
| --- | --- | --- |
| Búsqueda por ID_Devolucion sin resultado | M-137 «No se encontró ninguna devolución con ese identificador.» | Criterio de búsqueda |
| Sin devoluciones pendientes de recepción | M-138 «No hay devoluciones pendientes de recepción.» | Tabla |
| Devolución de otro custodio (Empleado) | M-139 «No tiene acceso a esa devolución.» | Criterio de búsqueda |
| Modo (c): ID_Asignacion obligatoria / inexistente / no vigente / ya devuelta / de otro custodio | M-122 «La asignación es obligatoria.» M-108 «La asignación no existe.» M-134 «Solo se puede registrar la devolución de una asignación vigente.» M-135 «La asignación ya tiene una devolución.» M-136 «Solo el custodio de la asignación puede registrar su devolución.» | ID_Asignacion |
| Modo (c): Observaciones de más de 255 caracteres | M-133 «Las observaciones no pueden superar 255 caracteres.» | Observaciones |
| Rol sin permiso para la operación | Sin código M-xx: «No tiene permiso para realizar esta operación.» (propuesta, pendiente de validar con el cliente; RNF-01, RF-166) | Aviso al intentar la operación |
| Operación correcta | M-132 «Devolución registrada correctamente.» Consecuencia: la devolución queda Pendiente; la asignación sigue Vigente y el activo sigue Asignado hasta confirmar la recepción (RF-110). | Aviso de éxito |
 
*Fuente: catálogo de mensajes M-01 a M-273 de las historias de usuario.*
 
## **2.5.11 MK-09 Confirmar recepción (aviso de consecuencia)**
 
*Figura 11. MK-09 Confirmar recepción (aviso de consecuencia). Las llamadas de color señalan de dónde nace cada zona de la pantalla.*
 
*Fuente: elaboración propia a partir de la HU-24, del diccionario v6 y del catálogo de mensajes.*
 
**Tabla 19. Ficha del mockup MK-09**
 
| **Campo de la ficha** | **MK-09 Confirmar recepción (aviso de consecuencia)** |
| --- | --- |
| **Código** | MK-09 |
| **Pantalla** | Confirmar recepción (aviso de consecuencia) Aviso modal sobre MK-08: confirmar o desistir. |
| **Atiende (HU / CU)** | HU-24 / CU-24 Confirmar recepción de una devolución. Se abre desde MK-08, modo (a) («Confirmar»), como aviso modal. |
| **Campos ↔ Diccionario** | • Datos de la devolución, solo lectura, recibidos de MK-08: ID_Devolucion INT(11), Fecha_Devolucion DATETIME, Observaciones VARCHAR(255), ID_Asignacion INT(11) y Estado_Recepcion ENUM (Pendiente, Confirmada). • Fecha_Confirmacion DATETIME: solo lectura; la asigna el sistema al confirmar y hoy está vacía. • ID_Receptor INT(11): solo lectura; se toma del usuario en sesión (RF-170). • Aviso M-151, con los marcadores rellenados con la devolución, la asignación y la placa del activo. |
| **Botones ↔ Eventos (método y RF)** | • «Confirmar recepción» → confirmarRecepcion() (RF-27); ejecuta el incluido CU-47 «Cerrar la asignación» (RF-117). La confirmación se audita (RF-163). • «Desistir»: cierra el aviso sin cambios (RF-118). |
| **RN visibles** | • RN-D11b: solo se confirma una devolución pendiente (RF-115). • RN-D14b: el receptor está activo (RF-116, RF-170). • RN-AS14: la asignación solo se cierra con una devolución confirmada. • RN-T02a: se audita la confirmación (RF-163). • El aviso de consecuencia cumple la regla destinada a RF-118. Permiso para confirmar: el más cercano es Devolver (P-RP2, abierta). Preguntas abiertas: P-C3-01 y P-C3-04. |
 
*Fuente: elaboración propia a partir de la HU-24, del diccionario v6, del diagrama de clases v6 (con CRF-003) y de los documentos de RF y RN.*
 
**Tabla 20. Caminos tristes y mensajes de MK-09**
 
| **Camino** | **Mensaje del catálogo (M-xx)** | **Dónde se ve** |
| --- | --- | --- |
| Devolución ya confirmada | M-153 «La devolución ya está confirmada.» | Aviso |
| Devolución inexistente | M-141 «La devolución no existe.» | Aviso |
| Desistir de la confirmación | M-152 «Se desistió de confirmar la recepción. La devolución no fue modificada.» | Botón «Desistir» |
| Rechazo por rol del Responsable de Activos (RNF-01, RF-166; CA-6 de HU-24) | M-154 «El usuario no tiene el rol Responsable de Activos.» | Aviso al intentar la operación |
| Después de confirmar: consulta de la asignación vigente del activo (CA-7 de HU-24) | M-105 «El activo no tiene una asignación vigente.» | Consulta posterior (Figura 11, llamada 12) |
| Después de confirmar: nuevo cierre de la asignación (CA-7 de HU-24) | M-120 «La asignación ya está cerrada.» | Consulta posterior (Figura 11, llamada 12) |
| Sin camino en esta pantalla (el receptor viene de la sesión, RF-170) | M-39 «El usuario está inactivo.» M-40 «El usuario no existe.» | ID_Receptor |
| Operación correcta | M-150 «Recepción confirmada correctamente.» Aviso M-151: «La recepción de la devolución <id> quedará Confirmada, la asignación <asignación> pasará a estado Cerrada y el activo <placa> quedará Disponible, salvo que esté Dañado. La confirmación no se puede deshacer. ¿Desea continuar?» Consecuencia: devolución Confirmada, asignación Cerrada y activo Disponible, salvo que esté Dañado. | Aviso de éxito |
 
*Fuente: catálogo de mensajes M-01 a M-273 de las historias de usuario.*
 
## **2.5.12 MK-10 Actualizar activo**
 
*Figura 12. MK-10 Actualizar activo. Las llamadas de color señalan de dónde nace cada zona de la pantalla.*
 
*Fuente: elaboración propia a partir de la HU-03, del diccionario v6 y del catálogo de mensajes.*
 
**Tabla 21. Ficha del mockup MK-10**
 
| **Campo de la ficha** | **MK-10 Actualizar activo** |
| --- | --- |
| **Código** | MK-10 |
| **Pantalla** | Actualizar activo Un solo modo: actualizar. |
| **Atiende (HU / CU)** | HU-03 / CU-03 Actualizar activo (CU no documentado en esta entrega). Se abre desde MK-01 («Editar»). |
| **Campos ↔ Diccionario** | • ID_Activo INT(11): solo lectura; es la clave y no se modifica. • Marca VARCHAR(50), Modelo VARCHAR(50), Numero_Serie VARCHAR(20), Placa_Inventario VARCHAR(11): obligatorios (los dos últimos, únicos). • Ubicacion VARCHAR(100), opcional. • ID_Categoria INT(11), obligatorio; campo numérico sin ayuda de búsqueda (propuesta, pendiente de validar con el cliente). • Estado ENUM (Disponible, Asignado, Dañado, Baja), obligatorio; lista editable para que los cambios no permitidos se rechacen con su mensaje. |
| **Botones ↔ Eventos (método y RF)** | • «Guardar cambios» → actualizar() (RF-04); verifica con existeNumeroSerie() y existePlaca() (RF-51, INTERNO), con la categoría (RF-53), con los estados permitidos (RF-54), con el activo en Baja (RF-55) y con la asignación vigente (RF-60). • «Cancelar»: navega a MK-01. • «Dar de baja»: navega a MK-11. |
| **RN visibles** | • RN-A03 y RN-A04: serie y placa únicas, ignorando el propio activo (RF-51). • RN-A09: la categoría debe estar activa (RF-53). • RN-A16b: el cambio manual de estado solo es entre Disponible y Dañado (RF-54); RN-A16a: no cambia con asignación vigente (RF-60). • RN-A18: un activo en Baja no se edita (RF-55). |
 
*Fuente: elaboración propia a partir de la HU-03, del diccionario v6, del diagrama de clases v6 (con CRF-003) y de los documentos de RF y RN.*
 
**Tabla 22. Caminos tristes y mensajes de MK-10**
 
| **Camino** | **Mensaje del catálogo (M-xx)** | **Dónde se ve** |
| --- | --- | --- |
| Marca obligatoria / más de 50 caracteres | M-10 «La marca es obligatoria.» M-11 «La marca no puede superar 50 caracteres.» | Marca |
| Modelo obligatorio / más de 50 caracteres | M-02 «El modelo es obligatorio.» M-03 «El modelo no puede superar 50 caracteres.» | Modelo |
| Numero_Serie obligatorio / más de 20 caracteres / ya registrado | M-04 «El número de serie es obligatorio.» M-05 «El número de serie no puede superar 20 caracteres.» M-06 «El número de serie ya está registrado.» | Numero_Serie |
| Placa_Inventario obligatoria / más de 11 caracteres / ya registrada | M-12 «La placa de inventario es obligatoria.» M-13 «La placa de inventario no puede superar 11 caracteres.» M-14 «La placa de inventario ya está registrada.» | Placa_Inventario |
| Ubicacion de más de 100 caracteres | M-15 «La ubicación no puede superar 100 caracteres.» | Ubicacion |
| ID_Categoria obligatoria / inexistente / inactiva | M-07 «La categoría es obligatoria.» M-09 «La categoría seleccionada no existe.» M-08 «La categoría seleccionada está inactiva.» | ID_Categoria |
| Cambio de Estado no permitido | M-22 «El estado Asignado solo se asigna al entregar el equipo.» M-23 «El estado Baja solo se asigna dando de baja el activo.» M-24 «El estado no es válido.» M-26 «Un activo asignado no puede cambiar de estado hasta cerrar su asignación.» | Estado |
| Activo en Baja | M-27 «Un activo en baja no se puede editar.» | Aviso |
| Activo inexistente | M-21 «El activo no existe.» | Aviso |
| Sin camino en esta pantalla (ID_Activo es solo lectura) | M-25 «El identificador del activo no se puede modificar.» | ID_Activo |
| Rol sin permiso para la operación | Sin código M-xx: «No tiene permiso para realizar esta operación.» (propuesta, pendiente de validar con el cliente; RNF-01, RF-166) | Aviso al intentar la operación |
| Operación correcta | M-20 «Activo actualizado correctamente.» Consecuencia: el activo conserva su ID_Activo y guarda los datos nuevos. | Aviso de éxito |
 
*Fuente: catálogo de mensajes M-01 a M-273 de las historias de usuario.*
 
## **2.5.13 MK-11 Dar de baja activo (aviso de consecuencia)**
 
*Figura 13. MK-11 Dar de baja activo (aviso de consecuencia). Las llamadas de color señalan de dónde nace cada zona de la pantalla.*
 
*Fuente: elaboración propia a partir de la HU-04, del diccionario v6 y del catálogo de mensajes.*
 
**Tabla 23. Ficha del mockup MK-11**
 
| **Campo de la ficha** | **MK-11 Dar de baja activo (aviso de consecuencia)** |
| --- | --- |
| **Código** | MK-11 |
| **Pantalla** | Dar de baja activo (aviso de consecuencia) Aviso modal sobre MK-01 o MK-10: confirmar la baja o desistir. |
| **Atiende (HU / CU)** | HU-04 / CU-04 Dar de baja activo (CU no documentado en esta entrega). Se abre desde MK-01 («Dar de baja») o desde MK-10 («Dar de baja»). |
| **Campos ↔ Diccionario** | • Datos del activo, solo lectura, recibidos de MK-01 o MK-10: Placa_Inventario VARCHAR(11), Estado ENUM (Disponible, Asignado, Dañado, Baja), Marca VARCHAR(50) y Modelo VARCHAR(50). • Aviso M-30, con el marcador rellenado con la placa del activo. |
| **Botones ↔ Eventos (método y RF)** | • «Confirmar baja» → darDeBaja() (RF-05); la baja se confirma con el aviso (RF-59) y se audita (RF-164). Nunca se borra el registro. • «Desistir»: cierra el aviso sin cambios. |
| **RN visibles** | • RN-A18: un activo ya en Baja no se vuelve a dar de baja (RF-57). • RN-A19: un activo con asignación vigente no se da de baja (RF-58). • RN-A16b: la baja lleva el activo al estado Baja (RF-05). RN-T02a: se audita la baja (RF-164). • RN-A10: sin ficha; doctrina del curso (jamás DELETE). RN-A12: sin ficha; destino: mockup/mensaje (el aviso M-30). |
 
*Fuente: elaboración propia a partir de la HU-04, del diccionario v6, del diagrama de clases v6 (con CRF-003) y de los documentos de RF y RN.*
 
**Tabla 24. Caminos tristes y mensajes de MK-11**
 
| **Camino** | **Mensaje del catálogo (M-xx)** | **Dónde se ve** |
| --- | --- | --- |
| Activo con asignación vigente | M-31 «El activo está asignado. Cierre su asignación antes de darlo de baja.» | Aviso |
| Activo ya dado de baja | M-32 «El activo ya está dado de baja.» | Aviso |
| Activo inexistente | M-21 «El activo no existe.» | Aviso |
| Desistir de la baja | M-29 «Baja cancelada. El activo no fue modificado.» | Botón «Desistir» |
| Rol sin permiso para la operación | Sin código M-xx: «No tiene permiso para realizar esta operación.» (propuesta, pendiente de validar con el cliente; RNF-01, RF-166) | Aviso al intentar la operación |
| Operación correcta | M-28 «Activo dado de baja correctamente.» Aviso M-30: «El activo <placa> pasará a estado Baja y dejará de estar disponible para asignarse. El registro no se elimina. ¿Desea continuar?» Consecuencia: Estado = Baja; los demás campos conservan su valor y el activo sigue visible en las búsquedas de MK-01. | Aviso de éxito |
 
*Fuente: catálogo de mensajes M-01 a M-273 de las historias de usuario.*
 
## **2.5.14 MK-12 Solicitud: actualizar y cancelar**
 
*Figura 14. MK-12 Solicitud: actualizar y cancelar, modo (a): actualizar. Las llamadas de color señalan de dónde nace cada zona de la pantalla.*
 
*Fuente: elaboración propia a partir de las HU-11 y HU-12, del diccionario v6 y del catálogo de mensajes.*
 
*Figura 15. MK-12 Solicitud: actualizar y cancelar, modo (b): cancelar. Las llamadas de color señalan de dónde nace cada zona de la pantalla.*
 
*Fuente: elaboración propia a partir de las HU-11 y HU-12, del diccionario v6 y del catálogo de mensajes.*
 
**Tabla 25. Ficha del mockup MK-12**
 
| **Campo de la ficha** | **MK-12 Solicitud: actualizar y cancelar** |
| --- | --- |
| **Código** | MK-12 |
| **Pantalla** | Solicitud: actualizar y cancelar Modos: (a) actualizar solicitud; (b) cancelar solicitud, con aviso de consecuencia. |
| **Atiende (HU / CU)** | HU-11 / CU-11 Actualizar solicitud y HU-12 / CU-12 Cancelar solicitud (CU no documentados en esta entrega). Se abre desde MK-04, modo (a): «Editar» (modo a) y «Cancelar» (modo b). |
| **Campos ↔ Diccionario** | • ID_Solicitud INT(11), Fecha_Solicitud DATETIME, ID_Custodio INT(11) y Estado_Solicitud ENUM (Pendiente, Aprobada, Rechazada, Cancelada): solo lectura; los asigna el sistema o se toman de la sesión. • ID_Categoria INT(11), obligatorio; campo numérico sin ayuda de búsqueda (propuesta, pendiente de validar con el cliente). • Motivo VARCHAR(255), obligatorio. • Modo (b): datos de la solicitud en solo lectura y aviso M-77, con el marcador rellenado con el identificador. |
| **Botones ↔ Eventos (método y RF)** | • «Guardar cambios» (modo a) → actualizar() (RF-14); solo si la solicitud está pendiente (RF-13) y es del propio custodio (RF-77). • «Cancelar solicitud» (modo a): navega a MK-12, modo (b). «Volver»: navega a MK-04. • «Confirmar cancelación» (modo b) → cancelar() (RF-15); la cancelación se confirma con el aviso (RF-79), solo si está pendiente (RF-78) y es del propio custodio (RF-80). «Desistir»: cierra el aviso sin cambios. |
| **RN visibles** | • RN-S07: la categoría debe estar activa (RF-76). • RN-S11: solo se actualiza una solicitud pendiente (RF-13). RN-S14 (incluye la parte RN de RN-S13): solo se cancela una solicitud pendiente (RF-14, RF-78). • RN-S19: el Empleado solo actualiza y cancela las suyas (RF-77, RF-80). • RN-S12: sin ficha; destino: RF (qué datos admite actualizar). RN-S15: sin ficha; destino: mockup/mensaje (el aviso M-77). |
 
*Fuente: elaboración propia a partir de las HU-11 y HU-12, del diccionario v6, del diagrama de clases v6 (con CRF-003) y de los documentos de RF y RN.*
 
**Tabla 26. Caminos tristes y mensajes de MK-12**
 
| **Camino** | **Mensaje del catálogo (M-xx)** | **Dónde se ve** |
| --- | --- | --- |
| ID_Categoria obligatoria / inexistente / inactiva | M-07 «La categoría es obligatoria.» M-09 «La categoría seleccionada no existe.» M-08 «La categoría seleccionada está inactiva.» | ID_Categoria |
| Motivo obligatorio / más de 255 caracteres | M-63 «El motivo es obligatorio.» M-64 «El motivo no puede superar 255 caracteres.» | Motivo |
| Actualizar una solicitud no pendiente | M-76 «Solo se puede actualizar una solicitud pendiente.» | Aviso (modo a) |
| Cancelar una solicitud no pendiente / ya cancelada | M-81 «Solo se puede cancelar una solicitud pendiente.» M-78 «La solicitud ya está cancelada.» | Aviso (modo b) |
| Solicitud de otro custodio / inexistente | M-69 «No tiene acceso a esa solicitud.» M-74 «La solicitud no existe.» | Aviso |
| Desistir de la cancelación | M-79 «Operación cancelada. La solicitud no fue modificada.» | Botón «Desistir» |
| Sin camino en esta pantalla (los campos están bloqueados) | M-70 «El custodio de la solicitud no se puede modificar.» M-71 «El estado de la solicitud cambia con la decisión o la cancelación.» M-72 «El identificador de la solicitud no se puede modificar.» M-73 «La fecha de la solicitud no se puede modificar.» | ID_Custodio, Estado_Solicitud, ID_Solicitud, Fecha_Solicitud |
| Rol sin permiso para la operación | Sin código M-xx: «No tiene permiso para realizar esta operación.» (propuesta, pendiente de validar con el cliente; RNF-01, RF-166) | Aviso al intentar la operación |
| Operación correcta | M-75 «Solicitud actualizada correctamente.» M-80 «Solicitud cancelada correctamente.» Aviso M-77: «La solicitud <id> pasará a estado Cancelada. El registro no se elimina y no se puede reactivar. ¿Desea continuar?» Consecuencia: modo (a): la solicitud sigue Pendiente, con la misma fecha; modo (b): Estado_Solicitud = Cancelada, sin eliminar ni reactivar el registro. | Aviso de éxito |
 
*Fuente: catálogo de mensajes M-01 a M-273 de las historias de usuario. Los códigos M-07, M-08 y M-09 están asignados en el catálogo a HU-01 y HU-03; el CA-4 de HU-11 usa el mismo texto.*
 
## **2.5.15 MK-13 Asignaciones: listados y cierre**
 
*Figura 16. MK-13 Asignaciones: listados y cierre. Las llamadas de color señalan de dónde nace cada zona de la pantalla.*
 
*Fuente: elaboración propia a partir de las HU-16 y HU-18, del diccionario v6 y del catálogo de mensajes.*
 
**Tabla 27. Ficha del mockup MK-13**
 
| **Campo de la ficha** | **MK-13 Asignaciones: listados y cierre** |
| --- | --- |
| **Código** | MK-13 |
| **Pantalla** | Asignaciones: listados y cierre Modos: (a) asignaciones vigentes, con cierre (Responsable de Activos); (b) asignaciones de un custodio, o las vigentes propias del Empleado, con «Firmar acta» (propuesta, pendiente de validar con el cliente). |
| **Atiende (HU / CU)** | HU-16 / CU-16 Consultar asignaciones y HU-18 / CU-18 Cerrar asignación (CU no documentados en esta entrega); el CA-7 de HU-18 cita buscarPorId() y listarVigentes(). Pantalla de entrada a CU-19 («Firmar acta», navega a MK-07). |
| **Campos ↔ Diccionario** | • Criterio de búsqueda (tabla Asignacion): ID_Asignacion INT(11) o ID_Activo INT(11). • Tabla de 7 campos: ID_Asignacion INT(11), Fecha_Entrega DATE, Fecha_Devolucion_Esperada DATE, Estado_Asignacion ENUM (Vigente, Cerrada), ID_Custodio INT(11), ID_Activo INT(11) e ID_Solicitud INT(11). • Aviso M-117, con los marcadores rellenados con la asignación y la placa del activo. |
| **Botones ↔ Eventos (método y RF)** | • «Buscar» → buscarPorId() (RF-92) o buscarVigentePorActivo() (RF-19). • Modo (a): listarVigentes() (RF-93). Modo (b): listarPorCustodio() (RF-94); el Empleado solo ve sus asignaciones vigentes (RF-95) y las propias (RF-96). • «Cerrar» (modo a): muestra el aviso M-117 (RF-101). • «Confirmar cierre» → cerrar() (RF-21); al cerrar, el activo se libera (RF-99); una asignación ya cerrada se rechaza (RF-98) y una sin devolución confirmada también (RF-100). «Desistir»: cierra el aviso sin cambios. • «Firmar acta» (modo b): navega a MK-07 con el ID_Asignacion precargado. |
| **RN visibles** | • RN-AS23a: el Empleado solo consulta las asignaciones de su custodio (RF-96). • RN-AS14: la asignación solo se cierra con una devolución confirmada (RF-100). RN-AS13b (incluye RN-AS17): una asignación cerrada no se cierra de nuevo (RF-98). • RN-AS19, RN-AS20, RN-AS21 y RN-AS22: sin ficha; destino: RF y mockup/mensaje. RN-AS24: sin ficha; requisito no funcional candidato (autoridad por rol). RN-AS16: sin ficha; destino: mockup/mensaje (el aviso M-117). • El cierre directo por el Responsable frente al cierre desde la confirmación de la recepción: P-34, abierta. |
 
*Fuente: elaboración propia a partir de las HU-16 y HU-18, del diccionario v6, del diagrama de clases v6 (con CRF-003) y de los documentos de RF y RN.*
 
**Tabla 28. Caminos tristes y mensajes de MK-13**
 
| **Camino** | **Mensaje del catálogo (M-xx)** | **Dónde se ve** |
| --- | --- | --- |
| Búsqueda por ID_Asignacion sin resultado | M-102 «No se encontró ninguna asignación con ese identificador.» | Criterio de búsqueda |
| El activo no tiene asignación vigente | M-105 «El activo no tiene una asignación vigente.» | Criterio de búsqueda |
| Activo inexistente | M-21 «El activo no existe.» | Criterio de búsqueda |
| Sin asignaciones vigentes | M-103 «No hay asignaciones vigentes.» | Tabla |
| Custodio sin asignaciones / custodio inexistente | M-104 «El custodio no tiene asignaciones.» M-50 «El custodio no existe.» | Tabla |
| Asignación de otro custodio (Empleado) | M-106 «No tiene acceso a esa asignación.» | Criterio de búsqueda |
| Cierre sin devolución confirmada | M-119 «La asignación no se puede cerrar sin una devolución confirmada.» | Aviso |
| Asignación ya cerrada | M-120 «La asignación ya está cerrada.» | Aviso |
| Asignación inexistente | M-108 «La asignación no existe.» | Aviso |
| Desistir del cierre | M-118 «Se desistió de cerrar la asignación. La asignación no fue modificada.» | Botón «Desistir» |
| Rol sin permiso para la operación | Sin código M-xx: «No tiene permiso para realizar esta operación.» (propuesta, pendiente de validar con el cliente; RNF-01, RF-166) | Aviso al intentar la operación |
| Operación correcta | M-116 «Asignación cerrada correctamente.» Aviso M-117: «La asignación <id> pasará a estado Cerrada y el activo <placa> quedará Disponible, salvo que esté Dañado. El registro no se elimina y no se puede reactivar. ¿Desea continuar?» Consecuencia: asignación Cerrada y activo Disponible, salvo que esté Dañado (RF-99). | Aviso de éxito |
 
*Fuente: catálogo de mensajes M-01 a M-273 de las historias de usuario.*
 
## **2.5.16 Cobertura: método del diagrama de clases → pantalla**
 
La tabla cubre los 37 métodos de las seis clases de las historias del alcance (Activo, Solicitud, Aprobacion, Asignacion, Acta_De_Entrega y Devolucion), según el diagrama de clases v6 y CRF-003 (que agrega Solicitud.listarAprobadas()). Treinta y tres métodos aterrizan en una pantalla: 26 públicos y 7 INTERNO, que se declaran dentro del botón que los invoca. Los otros 4 no tienen pantalla en esta entrega, porque su historia está fuera de las pantallas críticas.
 
Las otras nueve clases (Custodio, Notificacion_De_Devolucion, Reporte_de_Danios, Historial_Mantenimientos, Usuario, Rol_Permiso, Auditoria, Categoria y Reportes; 39 métodos) no entran en esta entrega. Con ellas, el diagrama suma 76 métodos: 62 públicos y 14 INTERNO. El método cerrar() (HU-18) aterriza en MK-13; MK-09 también lo ejecuta mediante el caso de uso incluido CU-47 «Cerrar la asignación» (RF-117).
 
**Tabla 29. Método del diagrama de clases → padre HU / RF → CRUD → dónde aterriza**
 
| **Método** | **Clase** | **Padre HU / RF** | **CRUD** | **Pantalla** |
| --- | --- | --- | --- | --- |
| **crear()** | Activo | HU-01 / RF-01 | C | MK-02 |
| **existeNumeroSerie()** | Activo | HU-01 / RF-02 (apoyo) | apoyo (INTERNO) | INTERNO dentro de «Guardar» (MK-02) y «Guardar cambios» (MK-10) |
| **existePlaca()** | Activo | HU-01 / RF-02 (apoyo) | apoyo (INTERNO) | INTERNO dentro de «Guardar» (MK-02) y «Guardar cambios» (MK-10) |
| **buscarPorId()** | Activo | HU-02 / RF-03 | R | MK-01 |
| **buscarPorNumeroSerie()** | Activo | HU-02 / RF-03 | R | MK-01 |
| **buscarPorPlaca()** | Activo | HU-02 / RF-03 | R | MK-01 |
| **listarInventario()** | Activo | HU-02 / RF-56 | R | MK-01 |
| **actualizar()** | Activo | HU-03 / RF-04 | U | MK-10 |
| **darDeBaja()** | Activo | HU-04 / RF-05 | D lógico | MK-11 |
| **crear()** | Solicitud | HU-09 / RF-11 | C | MK-03 |
| **buscarPorId()** | Solicitud | HU-10 / RF-72 | R | MK-04 |
| **listarPorCustodio()** | Solicitud | HU-10 / RF-12 | R | MK-04 |
| **listarPendientes()** | Solicitud | HU-10 / RF-73 | R | MK-04 |
| **listarAprobadas()** | Solicitud | HU-10 / RF-74 | R | MK-04 |
| **actualizar()** | Solicitud | HU-11 / RF-14 | U | MK-12 |
| **cancelar()** | Solicitud | HU-12 / RF-15 | D lógico | MK-12 |
| **decidir()** | Aprobacion | HU-13 / RF-16 | Proceso | MK-05 |
| **existeDecisionDeSolicitud()** | Aprobacion | HU-13 / RF-82 (apoyo) | apoyo (INTERNO) | INTERNO dentro de «Registrar decisión» (MK-05) |
| **buscarPorSolicitud()** | Aprobacion | HU-14 / RF de la HU: RF-17, RF-85 | R | Sin pantalla en esta entrega (HU fuera de las pantallas críticas) |
| **asignar()** | Asignacion | HU-15 / RF-18 | Proceso | MK-06 |
| **existeAsignacionDeSolicitud()** | Asignacion | HU-15 / RF-88 (apoyo) | apoyo (INTERNO) | INTERNO dentro de «Asignar equipo» (MK-06) |
| **activoDisponible()** | Asignacion | HU-15 / RF-89 (apoyo) | apoyo (INTERNO) | INTERNO dentro de «Asignar equipo» (MK-06) |
| **buscarPorId()** | Asignacion | HU-16 / RF-92 | R | MK-13 |
| **listarVigentes()** | Asignacion | HU-16 / RF-93 | R | MK-13 |
| **listarPorCustodio()** | Asignacion | HU-16 / RF-94 | R | MK-13 |
| **buscarVigentePorActivo()** | Asignacion | HU-16 / RF-19 | R | MK-13 |
| **actualizar()** | Asignacion | HU-17 / RF de la HU: RF-20, RF-97 | U | Sin pantalla en esta entrega (HU fuera de las pantallas críticas) |
| **cerrar()** | Asignacion | HU-18 / RF-21 | D lógico | MK-13 |
| **firmar()** | Acta_De_Entrega | HU-19 / RF-22 | Proceso | MK-07 |
| **existeActaDeAsignacion()** | Acta_De_Entrega | HU-19 / RF-105 (apoyo) | apoyo (INTERNO) | INTERNO dentro de «Firmar acta» (MK-07) |
| **buscarPorAsignacion()** | Acta_De_Entrega | HU-20 / RF de la HU: RF-23, RF-106 | R | Sin pantalla en esta entrega (HU fuera de las pantallas críticas) |
| **registrar()** | Devolucion | HU-21 / RF-24 | C | MK-08 |
| **existeDevolucionDeAsignacion()** | Devolucion | HU-21 / RF-108 (apoyo) | apoyo (INTERNO) | INTERNO dentro de «Registrar devolución» (MK-08) |
| **buscarPorId()** | Devolucion | HU-22 / RF-111 | R | MK-08 |
| **listarPendientesDeRecepcion()** | Devolucion | HU-22 / RF-25 | R | MK-08 |
| **actualizar()** | Devolucion | HU-23 / RF de la HU: RF-26, RF-113, RF-114 | U | Sin pantalla en esta entrega (HU fuera de las pantallas críticas) |
| **confirmarRecepcion()** | Devolucion | HU-24 / RF-27 | Proceso | MK-09 |
 
*Fuente: diagrama de clases v6, CRF-003, documento de RF y catálogo de casos de uso.*
 
## **2.5.17 Cadena completa de trazabilidad**
 
Cada fila recorre la cadena historia → criterios de aceptación → requisitos funcionales → reglas de negocio → requisitos no funcionales → casos de uso (pasos y flujos) → mensajes → método → pantalla. Las diez historias que no corresponden a los seis casos de uso documentados (HU-02, HU-03, HU-04, HU-10, HU-11, HU-12, HU-16, HU-18, HU-21 y HU-22) no tienen caso de uso documentado en esta entrega.
 
**Tabla 30. Cadena de trazabilidad: historia → método → pantalla**
 
| **HU / CU** | **CA** | **RF (cada uno con su HU)** | **RN (fichas) y destino de las demás** | **RNF** | **CU: pasos y flujos** | **Mensajes** | **Método → Pantalla** |
| --- | --- | --- | --- | --- | --- | --- | --- |
| **HU-01 CU-01** | CA-1 a CA-6 | RF-01, RF-02, RF-52 | RN-A03, RN-A04 (CA-3), RN-A09 (CA-6); A01, A02, A05, A06, A08: restricciones del diccionario | RNF-01, RNF-02 | CA-1: pasos 1 a 7; CA-2: 2a; CA-3: 5a (CU-49); CA-4: 3a; CA-5: 4a; CA-6: 6a (CU-48) | M-01 a M-15 | crear(), existeNumeroSerie(), existePlaca() → MK-02 |
| **HU-02 CU-02** | CA-1 a CA-6 | RF-03, RF-56 | RN-A14, RN-A15 (sin ficha; destino: RF y mockup/mensaje) | RNF-01, RNF-02 | CU-02 (no documentado en esta entrega) | M-16 a M-19 | buscarPorId(), buscarPorNumeroSerie(), buscarPorPlaca(), listarInventario() → MK-01 |
| **HU-03 CU-03** | CA-1 a CA-7 | RF-04, RF-51, RF-53, RF-54, RF-55, RF-60 | RN-A03 (CA-3); RN-A04 (CA-3); RN-A09 (CA-4); RN-A16a (CA-1, CA-5); RN-A16b (CA-1, CA-5); RN-A18 (CA-6); sin ficha: RN-A10 (doctrina del curso), RN-A13 (destino: RF), RN-A15 (destino: RF); restricciones del diccionario: A01, A02, A05, A07, A08 | RNF-01, RNF-02 | CU-03 (no documentado en esta entrega) | M-02 a M-15, M-20 a M-27 | actualizar(), existeNumeroSerie(), existePlaca() → MK-10 |
| **HU-04 CU-04** | CA-1 a CA-6 | RF-05, RF-57, RF-58, RF-59, RF-164 | RN-A19 (CA-4); sin ficha: RN-A10 (doctrina del curso), RN-A11 (fusionada en RN-A18), RN-A12 (destino: mockup/mensaje), RN-A15 (destino: RF) | RNF-01, RNF-02 | CU-04 (no documentado en esta entrega) | M-21, M-28 a M-32 | darDeBaja() → MK-11 |
| **HU-09 CU-09** | CA-1 a CA-5 | RF-11, RF-68, RF-69, RF-70, RF-71, RF-168 | RN-S07 (CA-4), RN-S09, RN-S10b, RN-S19 (CA-5); S01 a S04, S06, S08: restricciones del diccionario | RNF-01, RNF-02 | CA-1: pasos 1 a 7; CA-2: 3a; CA-3: 4a; CA-4: 5a (CU-48); CA-5: 6a | M-07, M-08, M-09, M-50, M-60 a M-65, M-272 | crear() → MK-03 |
| **HU-10 CU-10** | CA-1 a CA-6 | RF-12, RF-72, RF-73, RF-74, RF-75 | RN-S19; S16, S17, S18 y S21 (sin ficha; destino: RF y mockup/mensaje); S20 (requisito no funcional candidato) | RNF-01, RNF-02 | CU-10 (no documentado en esta entrega) | M-66 a M-69, M-92 | buscarPorId(), listarPorCustodio(), listarPendientes(), listarAprobadas() → MK-04 |
| **HU-11 CU-11** | CA-1 a CA-5 | RF-13, RF-14, RF-76, RF-77 | RN-S07 (CA-2); RN-S11 (CA-1, CA-3); RN-S19 (CA-5); sin ficha: RN-S12 (destino: RF); restricciones del diccionario: S01, S02, S03, S05, S06 | RNF-01, RNF-02 | CU-11 (no documentado en esta entrega) | M-63, M-64, M-69 a M-76 | actualizar() → MK-12 |
| **HU-12 CU-12** | CA-1 a CA-5 | RF-15, RF-78, RF-79, RF-80 | RN-S14 (CA-3); RN-S19 (CA-4); sin ficha: RN-S13 (parte RN fusionada en otra ficha), RN-S15 (destino: mockup/mensaje); restricciones del diccionario: S05 | RNF-01, RNF-02 | CU-12 (no documentado en esta entrega) | M-69, M-74, M-77 a M-81 | cancelar() → MK-12 |
| **HU-13 CU-13** | CA-1 a CA-7 | RF-16, RF-81, RF-82, RF-83, RF-84, RF-86, RF-169 | RN-AP02b (CA-2, CA-3), RN-AP06a (CA-5, CA-6), RN-AP09, RN-AP11a, RN-AP12a (CA-7); AP01, AP03 a AP05, AP08, AP10: restricciones del diccionario; AP07: RF-86 | RNF-01 (CA-7), RNF-02 | CA-1: pasos 1 a 8; CA-2: 2a; CA-3: 3a; CA-4: 4a; CA-5: 5a; CA-6: 6a; CA-7: 7a | M-39, M-40, M-74, M-82 a M-89, M-273 | decidir(), existeDecisionDeSolicitud() → MK-05 |
| **HU-15 CU-15** | CA-1 a CA-7 | RF-18, RF-87, RF-88, RF-89, RF-90, RF-91, RF-161 | RN-AS04 (CA-3), RN-AS05a (CA-4), RN-AS07a (CA-5), RN-AS08 (CA-6), RN-T02a; AS01 a AS03, AS06, AS09, AS10: restricciones del diccionario; AS11: RF-91 | RNF-01, RNF-02 | CA-1: pasos 1 a 9; CA-2: 3a; CA-3: 4a; CA-4: 5a; CA-5: 6a; CA-6: 7a; CA-7: 8a (especificación del RF-18) | M-21, M-74, M-93 a M-101 | asignar(), existeAsignacionDeSolicitud(), activoDisponible() → MK-06 |
| **HU-16 CU-16** | CA-1 a CA-7 | RF-19, RF-92, RF-93, RF-94, RF-95, RF-96 | RN-AS23a (CA-6, CA-7); sin ficha: RN-AS18 (fusionada en RN-A16a y RN-A19), RN-AS19 (destino: RF), RN-AS20 (destino: RF), RN-AS21 (destino: RF), RN-AS22 (destino: RF), RN-AS24 (requisito no funcional candidato) | RNF-01, RNF-02 | CU-16 (no documentado en esta entrega) | M-21, M-50, M-102 a M-106 | buscarPorId(), listarVigentes(), listarPorCustodio(), buscarVigentePorActivo() → MK-13 |
| **HU-18 CU-18** | CA-1 a CA-7 | RF-21, RF-98, RF-99, RF-100, RF-101 | RN-AS14 (CA-1, CA-4); sin ficha: RN-AS15 (parte RN fusionada en otra ficha), RN-AS16 (destino: mockup/mensaje), RN-AS17 (fusionada en RN-AS13b), RN-AS19 (destino: RF), RN-AS20 (destino: RF) | RNF-01, RNF-02 | CU-18 (no documentado en esta entrega) | M-108, M-116 a M-120 | cerrar() → MK-13 |
| **HU-19 CU-19** | CA-1 a CA-6 | RF-22, RF-102, RF-103, RF-104, RF-105 | RN-AC05 (CA-4), RN-AC06a (CA-5), RN-AC07a y RN-AC07b (CA-6); AC01 a AC04: restricciones del diccionario; AC08: requisito no funcional candidato | RNF-01, RNF-02 | CA-1: pasos 1 a 8; CA-2: 3a; CA-3: 4a; CA-4: 5a; CA-5: 6a; CA-6: 7a | M-108, M-121 a M-129 | firmar(), existeActaDeAsignacion() → MK-07 (se abre desde MK-13, modo b) |
| **HU-21 CU-21** | CA-1 a CA-7 | RF-24, RF-107, RF-108, RF-109, RF-110, RF-162 | RN-D05 (CA-5); RN-D06a (CA-6); RN-D07b (CA-1, CA-7); sin ficha: RN-D10 (fusionada en RN-AS14); restricciones del diccionario: D01, D02, D03, D04, D08 | RNF-01, RNF-02 | CU-21 (no documentado en esta entrega) | M-108, M-122, M-132 a M-136 | registrar(), existeDevolucionDeAsignacion() → MK-08 |
| **HU-22 CU-22** | CA-1 a CA-7 | RF-25, RF-111, RF-112 | RN-D07b (incluye RN-D20); D18 y D19 (sin ficha; destino: RF y mockup/mensaje); D21 (requisito no funcional candidato) | RNF-01, RNF-02 | CU-22 (no documentado en esta entrega) | M-137 a M-139 | buscarPorId(), listarPendientesDeRecepcion() → MK-08 |
| **HU-24 CU-24** | CA-1 a CA-7 | RF-27, RF-115, RF-116, RF-117, RF-118, RF-163, RF-170 | RN-D11b (CA-4), RN-D14b (CA-6), RN-AS14 (CA-7), RN-T02a; D09: restricción del diccionario; D13, D15, D18: RF-27 y RF-117; D16: RF-118; D17: fusionada en RN-D11b | RNF-01 (CA-6), RNF-02 | CA-1: pasos 1 a 7 (CU-47); CA-2: 7b; CA-3: 7a; CA-4: 3a; CA-5: 4a; CA-6: 5a; CA-7: 7c (CU-47) | M-39, M-40, M-105, M-120, M-141, M-150 a M-154 | confirmarRecepcion() → MK-09 |
 
*Fuente: elaboración propia a partir de las historias de usuario, del documento de RF, del documento de RN, del documento de RNF y del documento de casos de uso.*
 
## **2.5.18 Preguntas abiertas citadas**
 
Las preguntas siguientes se citan en los mockups y permanecen abiertas; ninguna se resuelve aquí.
 
**Tabla 31. Preguntas abiertas citadas en los mockups**
 
| **Pregunta** | **Asunto** | **Citada en** |
| --- | --- | --- |
| **P-34** | Cierre directo de la asignación por el Responsable de Activos frente al cierre desde la confirmación de la recepción. | MK-13 |
| **P-38** | Falta el mecanismo y el algoritmo de la firma digital: quién genera el código de Firma_Digital y cómo se valida. | MK-07 |
| **P-75** | Matriz inicial de permisos por rol: ninguna fuente la define. | Barra de sesión de todas las pantallas |
| **P-77** | El modelo no define cómo se hace cumplir un permiso (dónde se verifica y qué mensaje se muestra). | Barra de sesión de todas las pantallas; rechazo por rol |
| **P-100** | Rechazar una solicitud no tiene permiso propio entre los permisos del modelo. | Barra de sesión de todas las pantallas; MK-05 |
| **P-RP1** | Permiso que cubre aprobar y rechazar una solicitud. | MK-05 |
| **P-RP2** | El permiso Devolver no distingue registrar una devolución de confirmar su recepción. | MK-09 |
| **P-70** | Expiración y cierre de la sesión: sin medida definida; las figuras no dibujan temporizador ni cierre de sesión. | Barra de sesión de todas las pantallas |
| **P-20** | Orden de los listados (el orden dibujado es propuesto). | MK-04, MK-08, MK-13 |
| **P-27** | Si el Responsable de Activos consulta las solicitudes pendientes y las aprobadas sin asignación. | MK-04 |
| **P-C3-05** | Listado de las solicitudes aprobadas sin asignar y su orden (CRF-003). | MK-04, modo (c) |
| **P-42** | Quién registra y actualiza la devolución. | MK-08, modos (b) y (c) |
| **P-C3-01** | Efecto del aviso de confirmación: el equipo vuelve a Disponible salvo que esté Dañado (CRF-003). | MK-09 |
| **P-C3-04** | Cierre de la asignación cuando el equipo no se devuelve (CRF-003). | MK-09 |
| **P-89** | Qué operaciones se auditan: el alta del activo no se audita. | MK-02 |
 
*Fuente: documento de listas acumuladas, documento de RN (Anexo C) y CRF-003.*
 
NexaActivos — Mockups (2.5) · Página 
 
NexaActivos — Mockups (2.5) · Página 
 
NexaActivos — Mockups (2.5) · Página 
 
NexaActivos — Mockups (2.5) · Página 
 
NexaActivos — Mockups (2.5) · Página 
 
NexaActivos — Mockups (2.5) · Página 
 
NexaActivos — Mockups (2.5) · Página 
 
NexaActivos — Mockups (2.5) · Página 
 
NexaActivos — Mockups (2.5) · Página 
 
NexaActivos — Mockups (2.5) · Página 
 
NexaActivos — Mockups (2.5) · Página 
 
NexaActivos — Mockups (2.5) · Página 
 
NexaActivos — Mockups (2.5) · Página 
 
NexaActivos — Mockups (2.5) · Página 
 
NexaActivos — Mockups (2.5) · Página 
 
NexaActivos — Mockups (2.5) · Página 
 
NexaActivos — Mockups (2.5) · Página 
 
NexaActivos — Mockups (2.5) · Página 
 
NexaActivos — Mockups (2.5) · Página 
 
NexaActivos — Mockups (2.5) · Página 
 
NexaActivos — Mockups (2.5) · Página 
 
NexaActivos — Mockups (2.5) · Página 
 
NexaActivos — Mockups (2.5) · Página 
 
NexaActivos — Mockups (2.5) · Página 
 
NexaActivos — Mockups (2.5) · Página 
 
NexaActivos — Mockups (2.5) · Página 
 
NexaActivos — Mockups (2.5) · Página 
 
NexaActivos — Mockups (2.5) · Página 
 
NexaActivos — Mockups (2.5) · Página 
 
NexaActivos — Mockups (2.5) · Página 
 
NexaActivos — Mockups (2.5) · Página
