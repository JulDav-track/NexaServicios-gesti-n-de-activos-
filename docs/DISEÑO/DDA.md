# 3.6 DDA: Documento de Diseño Arquitectónico
 
Esta sección declara cómo se organiza NexaActivos en capas y en qué paquete vive cada clase del diagrama de clases (v6 con CRF-003: 15 clases, 12 enumeraciones, 19 asociaciones y 76 métodos, 62 públicos y 14 INTERNO). Los nombres de Controlador y Servicio definidos aquí son los que usarán los diagramas de secuencia (3.7) y la columna «Mensaje» de la matriz 3.9. Todo es propuesta del equipo, pendiente de confirmar con la docente; nada está validado por el cliente.
 
## 3.6.1 Declaración MVC
 
NexaActivos sigue el patrón Modelo-Vista-Controlador con una capa de Servicio entre el Controlador y el Modelo, como en el ejemplo de la docente: las reglas de negocio (RN) se validan en el Servicio. La tecnología del ejemplo (Spring Boot, Thymeleaf y JPA) no está fijada en ningún documento del equipo; se presenta como propuesta del equipo, pendiente de confirmar con la docente, sin versiones. La Tabla 1 resume qué es cada capa.
 
**Tabla ****1****.** *Capas de NexaActivos y su responsabilidad*
 
| **Capa** | **Qué es en NexaActivos** | **Qué no hace** |
| --- | --- | --- |
| **Modelo** | Las 15 clases del diagrama v6 (14 de negocio y la vista Reportes) y sus 12 enumeraciones, en 6 subpaquetes, con sus atributos y los 76 métodos. El acceso a datos queda en los métodos de las clases (sin repositorio). | No conoce a las demás capas y no recibe peticiones de pantalla. |
| **Vista** | Las 13 pantallas MK-01 a MK-13 de los mockups 2.5. Muestra datos y recoge la acción del actor. | No valida RN ni invoca el Modelo. |
| **Controlador** | Una clase <Entidad>Controlador por entidad. Recibe la acción de la Vista, invoca al Servicio y devuelve el resultado. | No valida RN ni accede a datos. |
| **Servicio** | Una clase <Entidad>Servicio por entidad. Expone las mismas operaciones públicas de la clase del modelo, valida las RN y el permiso del rol, invoca al Modelo y registra la auditoría. | No dibuja pantallas. |
 
*Fuente: elaboración propia (propuesta del equipo) a partir del diagrama de clases (v6 con CRF-003) y de los mockups 2.5. † = RN sin ficha en el documento de RN.*
 
Los 14 métodos INTERNO solo los invoca el Servicio; Auditoria.registrar() lo invocan los Servicios de las demás entidades. La autoridad por rol se decide una sola vez (CRI-01, RF-166): antes de ejecutar una operación, el Servicio consulta RolPermisoServicio.consultarPermisos(rol) (propuesta del equipo; la matriz rol–operación sigue abierta: P-75, P-77, P-100, P-RP1 y P-RP2). Ninguna entidad se elimina: la baja es lógica, salvo RolPermisoServicio.retirar(), que elimina la fila (RN-RP06†, P-78).
 
## 3.6.2 Diagrama de paquetes y clases por paquete
 
La Tabla 2 asigna cada clase y cada enumeración a un único paquete. La Figura 1 muestra la vista general: las capas Vista, Controlador, Servicio y Modelo, con los seis subpaquetes del Modelo que toma el diagrama de clases (Seguridad y acceso, Préstamo de equipos, Inventario, Catálogos, Reportes y Enumeraciones). La Figura 2 detalla las clases de cada subpaquete con su número de métodos públicos e INTERNO. Las flechas «use» van de cada paquete cuyas clases tienen atributos de tipo enumeración (todos menos Catálogos) a Enumeraciones.
 
**Tabla ****2****.** *Clase o enumeración, paquete y capa*
 
| **N.º** | **Clase o enumeración** | **Tipo** | **Paquete del diagrama v6** | **Paquete de código (propuesta)** | **Capa** |
| --- | --- | --- | --- | --- | --- |
| 1 | Activo | Clase | Inventario | modelo.inventario | Modelo |
| 2 | Custodio | Clase | Préstamo de equipos | modelo.prestamo_equipos | Modelo |
| 3 | Solicitud | Clase | Préstamo de equipos | modelo.prestamo_equipos | Modelo |
| 4 | Aprobacion | Clase | Préstamo de equipos | modelo.prestamo_equipos | Modelo |
| 5 | Asignacion | Clase | Préstamo de equipos | modelo.prestamo_equipos | Modelo |
| 6 | Acta_De_Entrega | Clase | Préstamo de equipos | modelo.prestamo_equipos | Modelo |
| 7 | Devolucion | Clase | Préstamo de equipos | modelo.prestamo_equipos | Modelo |
| 8 | Notificacion_De_Devolucion | Clase | Préstamo de equipos | modelo.prestamo_equipos | Modelo |
| 9 | Reporte_de_Danios | Clase | Inventario | modelo.inventario | Modelo |
| 10 | Historial_Mantenimientos | Clase | Inventario | modelo.inventario | Modelo |
| 11 | Usuario | Clase | Seguridad y acceso | modelo.seguridad_acceso | Modelo |
| 12 | Rol_Permiso | Clase | Seguridad y acceso | modelo.seguridad_acceso | Modelo |
| 13 | Auditoria | Clase | Seguridad y acceso | modelo.seguridad_acceso | Modelo |
| 14 | Categoria | Clase | Catálogos | modelo.catalogos | Modelo |
| 15 | Reportes | Clase «view» | Reportes | modelo.reportes | Modelo |
| 16 | Nombre_Rol | Enumeración | Enumeraciones | modelo.enumeraciones | Modelo |
| 17 | Accion_Auditoria | Enumeración | Enumeraciones | modelo.enumeraciones | Modelo |
| 18 | Nombre_Permiso | Enumeración | Enumeraciones | modelo.enumeraciones | Modelo |
| 19 | Decision | Enumeración | Enumeraciones | modelo.enumeraciones | Modelo |
| 20 | Tipo_Documento | Enumeración | Enumeraciones | modelo.enumeraciones | Modelo |
| 21 | Estado_Recepcion | Enumeración | Enumeraciones | modelo.enumeraciones | Modelo |
| 22 | Estado_Solicitud | Enumeración | Enumeraciones | modelo.enumeraciones | Modelo |
| 23 | Estado_Asignacion | Enumeración | Enumeraciones | modelo.enumeraciones | Modelo |
| 24 | Estado_Activo | Enumeración | Enumeraciones | modelo.enumeraciones | Modelo |
| 25 | Tipo_Danio | Enumeración | Enumeraciones | modelo.enumeraciones | Modelo |
| 26 | Tipo_Mantenimiento | Enumeración | Enumeraciones | modelo.enumeraciones | Modelo |
| 27 | Tipo_Reporte | Enumeración | Enumeraciones | modelo.enumeraciones | Modelo |
 
*Fuente: elaboración propia (propuesta del equipo) a partir del diagrama de clases (v6 con CRF-003). Total: 15 clases y 12 enumeraciones, cada una en un solo paquete.*
 
**Figura ****1****.** *Diagrama de paquetes de NexaActivos: vista general*
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de confirmar con la docente) a partir del diagrama de clases (v6 con CRF-003).*
 
**Figura ****2****.** *Subpaquetes del modelo y clases que contiene cada uno*
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de confirmar con la docente) a partir del diagrama de clases (v6 con CRF-003). Entre paréntesis: métodos públicos / INTERNO.*
 
## 3.6.3 Vistas y controladores
 
La Tabla 3 asigna a cada una de las 13 pantallas de los mockups 2.5 su Controlador, con la historia de usuario (HU) y los métodos de la Tabla 30 de ese documento. Los métodos marcados con † son INTERNO: los invoca el Servicio y no la pantalla. Cuatro operaciones del diagrama no tienen pantalla en los mockups 2.5 (HU-14, HU-17, HU-20 y HU-23) y se anotan como «pantalla pendiente en una versión posterior de los mockups (los vigentes son los 2.5)»; no se les asigna un MK. En total, 30 de las 46 HU no tienen pantalla; esa situación no se resuelve en esta sección.
 
**Tabla ****3****.** *Vista, controlador, historia de usuario y métodos del modelo*
 
| **Pantalla** | **Nombre de la pantalla (mockups 2.5)** | **Controlador** | **HU** | **Métodos del modelo invocados por el Servicio** |
| --- | --- | --- | --- | --- |
| **MK-01** | Activos: listado y búsqueda | ActivoControlador | HU-02 | buscarPorId(), buscarPorNumeroSerie(), buscarPorPlaca(), listarInventario() |
| **MK-02** | Registrar activo | ActivoControlador | HU-01 | crear(), existeNumeroSerie()†, existePlaca()† |
| **MK-03** | Registrar solicitud de equipo | SolicitudControlador | HU-09 | crear() |
| **MK-04** | Solicitudes: listados | SolicitudControlador | HU-10 | buscarPorId(), listarPorCustodio(), listarPendientes(), listarAprobadas() |
| **MK-05** | Registrar decisión | AprobacionControlador | HU-13 | decidir(), existeDecisionDeSolicitud()† |
| **MK-06** | Asignar equipo | AsignacionControlador | HU-15 | asignar(), existeAsignacionDeSolicitud()†, activoDisponible()† |
| **MK-07** | Firmar acta de entrega (se abre desde MK-13, modo b) | ActaDeEntregaControlador | HU-19 | firmar(), existeActaDeAsignacion()† |
| **MK-08** | Devoluciones: pendientes, consulta y registro | DevolucionControlador | HU-21, HU-22 | registrar(), existeDevolucionDeAsignacion()†, buscarPorId(), listarPendientesDeRecepcion() |
| **MK-09** | Confirmar recepción (aviso de consecuencia) | DevolucionControlador | HU-24 | confirmarRecepcion() |
| **MK-10** | Actualizar activo | ActivoControlador | HU-03 | actualizar(), existeNumeroSerie()†, existePlaca()† |
| **MK-11** | Dar de baja activo (aviso de consecuencia) | ActivoControlador | HU-04 | darDeBaja() |
| **MK-12** | Solicitud: actualizar y cancelar | SolicitudControlador | HU-11, HU-12 | actualizar(), cancelar() |
| **MK-13** | Asignaciones: listados y cierre | AsignacionControlador | HU-16, HU-18 | buscarPorId(), listarVigentes(), listarPorCustodio(), buscarVigentePorActivo(), cerrar() |
| **Sin MK** | pantalla pendiente en una versión posterior de los mockups (los vigentes son los 2.5) | AprobacionControlador | HU-14 | buscarPorSolicitud() |
| **Sin MK** | pantalla pendiente en una versión posterior de los mockups (los vigentes son los 2.5) | AsignacionControlador | HU-17 | actualizar() |
| **Sin MK** | pantalla pendiente en una versión posterior de los mockups (los vigentes son los 2.5) | ActaDeEntregaControlador | HU-20 | buscarPorAsignacion() |
| **Sin MK** | pantalla pendiente en una versión posterior de los mockups (los vigentes son los 2.5) | DevolucionControlador | HU-23 | actualizar() |
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de confirmar con la docente) a partir de la Tabla 30 de los mockups 2.5 (MK-01 a MK-13). † = INTERNO.*
 
## 3.6.4 Controladores, servicios y clases del modelo
 
La convención propuesta es <Entidad>Controlador y <Entidad>Servicio, uno de cada uno por entidad; la vista Reportes y Notificacion_De_Devolucion también los tienen, aunque no tengan pantalla. La Tabla 4 relaciona cada Controlador con su Servicio, su clase del modelo y su paquete, y señala dónde están documentados el CU (3.5) y el ciclo de vida (3.8). La Tabla 5 lista, por Servicio, las operaciones públicas que expone, idénticas a las de su clase, y los métodos INTERNO que solo él invoca. La Figura 3 resume la cadena Vista, Controlador, Servicio y Modelo.
 
**Tabla ****4****.** *Controlador, servicio, clase del modelo y paquete*
 
| **N.º** | **Controlador** | **Servicio** | **Clase del modelo** | **Paquete** | **Púb.** | **INT.** | **Pantallas** | **Documentado en** |
| --- | --- | --- | --- | --- | --- | --- | --- | --- |
| 1 | ActivoControlador | ActivoServicio | Activo | Inventario | 7 | 2 | MK-01, MK-02, MK-10, MK-11 | 3.5: Fig. 1 (CU-01); 3.8: Fig. 1 |
| 2 | CustodioControlador | CustodioServicio | Custodio | Préstamo de equipos | 6 | 2 | sin pantalla | — |
| 3 | SolicitudControlador | SolicitudServicio | Solicitud | Préstamo de equipos | 7 | 0 | MK-03, MK-04, MK-12 | 3.5: Fig. 2 (CU-09); 3.8: Fig. 2 |
| 4 | AprobacionControlador | AprobacionServicio | Aprobacion | Préstamo de equipos | 2 | 1 | MK-05 | 3.5: Fig. 3 (CU-13) |
| 5 | AsignacionControlador | AsignacionServicio | Asignacion | Préstamo de equipos | 7 | 2 | MK-06, MK-13 | 3.5: Fig. 4 (CU-15); 3.8: Fig. 3 |
| 6 | ActaDeEntregaControlador | ActaDeEntregaServicio | Acta_De_Entrega | Préstamo de equipos | 2 | 1 | MK-07 | 3.5: Fig. 5 (CU-19) |
| 7 | DevolucionControlador | DevolucionServicio | Devolucion | Préstamo de equipos | 5 | 1 | MK-08, MK-09 | 3.5: Fig. 6 (CU-24); 3.8: Fig. 4 |
| 8 | NotificacionDeDevolucionControlador | NotificacionDeDevolucionServicio | Notificacion_De_Devolucion | Préstamo de equipos | 1 | 1 | sin pantalla | — |
| 9 | ReporteDeDaniosControlador | ReporteDeDaniosServicio | Reporte_de_Danios | Inventario | 4 | 0 | sin pantalla | — |
| 10 | HistorialMantenimientosControlador | HistorialMantenimientosServicio | Historial_Mantenimientos | Inventario | 4 | 0 | sin pantalla | — |
| 11 | UsuarioControlador | UsuarioServicio | Usuario | Seguridad y acceso | 7 | 1 | sin pantalla | — |
| 12 | RolPermisoControlador | RolPermisoServicio | Rol_Permiso | Seguridad y acceso | 3 | 1 | sin pantalla | — |
| 13 | AuditoriaControlador | AuditoriaServicio | Auditoria | Seguridad y acceso | 1 | 1 | sin pantalla | — |
| 14 | CategoriaControlador | CategoriaServicio | Categoria | Catálogos | 5 | 1 | sin pantalla | — |
| 15 | ReportesControlador | ReportesServicio | Reportes | Reportes | 1 | 0 | sin pantalla | — |
|  | **Total** | 15 Servicios | 15 clases | 6 paquetes | **62** | **14** | 13 MK |  |
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de confirmar con la docente) a partir del diagrama de clases (v6 con CRF-003), de los mockups 2.5, de 3.5 y de 3.8. Púb. = métodos públicos; INT. = métodos INTERNO.*
 
Dos dependencias entre Servicios merecen mención. Por CRF-003, Devolucion.confirmarRecepcion() invoca a Asignacion.cerrar(), de modo que DevolucionServicio usa a AsignacionServicio. Y como Auditoria.registrar() es INTERNO, todos los Servicios que auditan invocan a AuditoriaServicio.
 
**Tabla ****5****.** *Operaciones públicas y métodos INTERNO de cada servicio*
 
| **Servicio** | **Operaciones públicas (mismas de la clase del modelo)** | **Métodos INTERNO (los invoca el Servicio de su clase; Auditoria.registrar() lo invocan los Servicios de las demás entidades)** |
| --- | --- | --- |
| ActivoServicio | crear(a : Activo); buscarPorId(idActivo : int); buscarPorNumeroSerie(numeroSerie : String); buscarPorPlaca(placa : String); listarInventario(); actualizar(a : Activo); darDeBaja(idActivo : int) | existeNumeroSerie(numeroSerie : String); existePlaca(placa : String) |
| CustodioServicio | crear(c : Custodio); buscarPorId(idCustodio : int); buscarPorUsuario(idUsuario : int); buscarPorDocumento(tipo : Tipo_Documento, nDocumento : String); actualizar(c : Custodio); inactivar(idCustodio : int) | existeCustodioDeUsuario(idUsuario : int); existeDocumento(tipo : Tipo_Documento, nDocumento : String) |
| SolicitudServicio | crear(s : Solicitud); buscarPorId(idSolicitud : int); listarPorCustodio(idCustodio : int); listarPendientes(); listarAprobadas(); actualizar(s : Solicitud); cancelar(idSolicitud : int) | — |
| AprobacionServicio | decidir(a : Aprobacion); buscarPorSolicitud(idSolicitud : int) | existeDecisionDeSolicitud(idSolicitud : int) |
| AsignacionServicio | asignar(a : Asignacion); buscarPorId(idAsignacion : int); listarVigentes(); listarPorCustodio(idCustodio : int); buscarVigentePorActivo(idActivo : int); actualizar(a : Asignacion); cerrar(idAsignacion : int) | existeAsignacionDeSolicitud(idSolicitud : int); activoDisponible(idActivo : int) |
| ActaDeEntregaServicio | firmar(acta : Acta_De_Entrega); buscarPorAsignacion(idAsignacion : int) | existeActaDeAsignacion(idAsignacion : int) |
| DevolucionServicio | registrar(d : Devolucion); buscarPorId(idDevolucion : int); listarPendientesDeRecepcion(); actualizar(d : Devolucion); confirmarRecepcion(idDevolucion : int, idReceptor : int) | existeDevolucionDeAsignacion(idAsignacion : int) |
| NotificacionDeDevolucionServicio | generarAviso(n : Notificacion_De_Devolucion) | calcularDiasRestantes(idAsignacion : int) |
| ReporteDeDaniosServicio | crear(r : Reporte_de_Danios); buscarPorId(idReporteDanios : int); listarReportes(); actualizar(r : Reporte_de_Danios) | — |
| HistorialMantenimientosServicio | crear(m : Historial_Mantenimientos); buscarPorId(idMantenimiento : int); listarPorActivo(idActivo : int); actualizar(m : Historial_Mantenimientos) | — |
| UsuarioServicio | crear(u : Usuario); buscarPorId(idUsuario : int); buscarPorEmail(email : String); actualizar(u : Usuario); inactivar(idUsuario : int); iniciarSesion(email : String, password : String); cambiarContrasena(idUsuario : int, actual : String, nueva : String) | existeEmail(email : String) |
| RolPermisoServicio | asignar(rp : Rol_Permiso); retirar(rol : Nombre_Rol, permiso : Nombre_Permiso); consultarPermisos(rol : Nombre_Rol) | existeAsignacion(rol : Nombre_Rol, permiso : Nombre_Permiso) |
| AuditoriaServicio | buscarPorId(idAuditoria : int) | registrar(a : Auditoria) |
| CategoriaServicio | crear(c : Categoria); buscarPorId(idCategoria : int); listarActivas(); actualizar(c : Categoria); inactivar(idCategoria : int) | existeNombreCategoria(nombre : String) |
| ReportesServicio | consultar(tipo : Tipo_Reporte, fechaInicio : LocalDate, fechaFin : LocalDate) | — |
 
*Fuente: elaboración propia (propuesta del equipo) a partir del diagrama de clases (v6 con CRF-003). Total: 62 operaciones públicas y 14 INTERNO (76 métodos).*
 
**Figura ****3****.** *Cadena Vista, Controlador, Servicio y clase del modelo*
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de confirmar con la docente) a partir del diagrama de clases (v6 con CRF-003) y de los mockups 2.5.*
 
## 3.6.5 Aviso automático de próximas devoluciones
 
El aviso de próximas devoluciones (CU-25, HU-25; RF-28, RF-119, RF-120, RF-121 y RF-167) lo dispara el actor «Sistema» (nombre propuesto por el equipo), sin sesión iniciada y sin pantalla. Vive en NotificacionDeDevolucionServicio.generarAviso(), que corresponde a Notificacion_De_Devolucion.generarAviso(); ese Servicio calcula los días restantes con calcularDiasRestantes() (INTERNO), aplica RN-N05 (solo se avisa una asignación vigente; propuesta del equipo) y registra la acción con AuditoriaServicio.registrar(). NotificacionDeDevolucionControlador es el punto de entrada que el disparador automático invoca; no es una Vista.
 
Según RF-167, la acción se atribuye a un usuario propio del sistema y no a una persona (decisión T-8, opción A como inclinación, provisional). El disparador, la frecuencia y el umbral de días no están definidos (P-44, P-45 y P-48), por lo que este documento no fija el mecanismo técnico del disparo ni su tecnología: se decide en la Fase 3, cuando el cliente responda.
 
Propuesta del equipo, pendiente de validar con el cliente: la verificación de permiso (RF-166) aplica al usuario con sesión; el aviso automático no pasa por esa verificación, porque no hay un rol de sistema en Nombre_Rol, que tiene solo los cinco roles humanos, y su acción se atribuye al usuario del sistema (RF-167, T-8 opción A, provisional). Esto sigue condicionado a MOD-24 y MOD-31 y a la respuesta del cliente.
 
## 3.6.6 Plano de carpetas del proyecto
 
La Tabla 6 es el plano de carpetas propuesto. Los paquetes de código reproducen los de la Tabla 2 y los de la Tabla 4, y será la imagen exacta del repositorio de la sección 4.2. El script SQL (DDL) se produce en la Fase 3 y se ubica a nivel de la raíz, en la carpeta db/.
 
**Tabla ****6****.** *Plano de carpetas del proyecto*
 
| **Carpeta o archivo** | **Contenido** | **Archivos** |
| --- | --- | --- |
| **nexaactivos/** | Raíz del repositorio (nombre propuesto) | — |
| db/ | Script SQL (DDL) del Modelo Relacional de 3.2: nexaactivos_ddl.sql. Se produce en la Fase 3. | 1 |
| .gitignore | Exclusiones del control de versiones (sección 4.2) | 1 |
| src/main/java/<paquete_base>/ | Código fuente; el paquete base se define en la Fase 3 | — |
| modelo/seguridad_acceso/ | Usuario, Auditoria, Rol_Permiso | 3 |
| modelo/prestamo_equipos/ | Solicitud, Aprobacion, Custodio, Asignacion, Acta_De_Entrega, Devolucion, Notificacion_De_Devolucion | 7 |
| modelo/inventario/ | Activo, Reporte_de_Danios, Historial_Mantenimientos | 3 |
| modelo/catalogos/ | Categoria | 1 |
| modelo/reportes/ | Reportes (vista) | 1 |
| modelo/enumeraciones/ | Las 12 enumeraciones del diagrama v6 | 12 |
| servicio/ | Una clase <Entidad>Servicio por entidad (15) | 15 |
| controlador/ | Una clase <Entidad>Controlador por entidad (15) | 15 |
| src/main/resources/templates/ | Una plantilla por pantalla, MK-01 a MK-13, de los mockups 2.5 | 13 |
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de confirmar con la docente). Archivos de código: 15 + 12 + 15 + 15 = 57 clases y enumeraciones, más 13 plantillas.*
 
## 3.6.7 Supuestos y preguntas abiertas
 
La Tabla 7 reúne los supuestos que adoptó el equipo y las preguntas que siguen abiertas, con quién debe resolverlas; ninguna se resuelve en este documento.
 
**Tabla ****7****.** *Supuestos y preguntas abiertas del DDA*
 
| **N.º** | **Supuesto o pregunta abierta** | **Corresponde a** |
| --- | --- | --- |
| 1 | Tecnología (Spring Boot, Thymeleaf y JPA, tomadas del ejemplo de la docente): ningún documento del equipo la fija. La P-Q5 (dispositivos y navegadores) puede condicionar la Vista. | Docente; cliente (P-Q5) |
| 2 | Convención <Entidad>Controlador y <Entidad>Servicio, capa de Servicio aparte y sin capa de repositorio. Si la Fase 3 adoptara repositorios (por ejemplo, con JPA), se anotaría como cambio al DDA. | Docente; equipo |
| 3 | El Servicio verifica el permiso del rol con RolPermisoServicio.consultarPermisos() (CRI-01, RF-166). La matriz rol–operación está pendiente (P-75, P-77, P-100, P-RP1, P-RP2). | Cliente; equipo |
| 4 | Aviso automático: disparador, frecuencia y umbral sin definir (P-44, P-45, P-48). El usuario de sistema de RF-167 (T-8) implica un cambio al modelo (MOD-24 y MOD-31) que no está en el diagrama v6. La verificación de permiso (RF-166) no aplica al aviso automático, que no tiene rol de sistema en Nombre_Rol y se atribuye al usuario del sistema (RF-167; propuesta del equipo). | Cliente; equipo |
| 5 | Cuatro operaciones sin pantalla (HU-14, HU-17, HU-20, HU-23) y 30 de las 46 HU sin pantalla en los mockups 2.5: pendientes de una versión posterior de los mockups (los vigentes son los 2.5). | Equipo |
| 6 | Ubicación del script SQL: el ejemplo de la docente lo ubica en db/ en la raíz del repositorio, y la plantilla de 4.2 lo pide en la raíz. Aquí va en db/, en la raíz. | Docente |
| 7 | La vista Reportes y Notificacion_De_Devolucion tienen Controlador y Servicio aunque no tengan pantalla. | Equipo; docente |
| 8 | Rol_Permiso.retirar() elimina la fila, única excepción a la baja lógica (RN-RP06†; P-78; MOD-35). | Cliente |
 
*Fuente: elaboración propia. Nada de lo anterior está validado por el cliente ni por la docente. † = RN sin ficha en el documento de RN.*