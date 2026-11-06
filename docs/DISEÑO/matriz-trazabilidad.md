# 3.9 Matriz de Trazabilidad
 
La matriz de trazabilidad recorre, en una fila por historia de usuario, la cadena HU → RF → entidad → clase.método → paso del caso de uso → mensaje de secuencia → pantalla. La Tabla 1 presenta las 46 filas. HU, RF, Entidad y Clase.método se copiaron de la tabla C.1 del Consolidado de 46 HU; el paso del caso de uso, de las tablas de mensajes de la sección 3.7; el mensaje de secuencia, de la Tabla 10 de 3.7 (mensaje por historia de usuario); y la pantalla, de la Tabla 3 de la sección 3.6. Un script comparó cada celda con su fuente y cada método con los 76 del diagrama de clases (PDF v6 con CRF-003). Las celdas que no se pueden completar con una fuente no se rellenan: se marcan y se listan como rupturas en 3.9.2. La matriz es propuesta del equipo, pendiente de validar con la docente y de la lectura cruzada de la sección 3.10.
 
**Tabla ****1****. ***Matriz de trazabilidad HU → RF → entidad → clase.método → paso del CU → mensaje de secuencia → pantalla*
 
| **HU** | **RF** | **Entidad** | **Clase.método** | **Paso CU** | **Mensaje sec.** | **Pantalla** |
| --- | --- | --- | --- | --- | --- | --- |
| HU-01 | RF-01, RF-02, RF-52 | Activo | Activo.crear (+ existeNumeroSerie, existePlaca) | CU-01, paso 7 (mensaje 8, Activo.crear(a); Tabla 8 de 3.7) | ActivoServicio.crear() (Fig. 6) | MK-02 |
| HU-02 | RF-03, RF-56 | Activo | Activo.buscarPorId, buscarPorNumeroSerie, buscarPorPlaca, listarInventario | CU-02 (no documentado) | ActivoServicio.buscarPorId(), ActivoServicio.buscarPorNumeroSerie(), ActivoServicio.buscarPorPlaca(), ActivoServicio.listarInventario() (derivado, sin diagrama) | MK-01 |
| HU-03 | RF-04, RF-51, RF-53, RF-54, RF-55, RF-60 | Activo | Activo.actualizar (+ existeNumeroSerie, existePlaca) | CU-03 (no documentado) | ActivoServicio.actualizar() (derivado, sin diagrama) | MK-10 |
| HU-04 | RF-05, RF-57, RF-58, RF-59, RF-164 | Activo | Activo.darDeBaja | CU-04 (no documentado) | ActivoServicio.darDeBaja() (derivado, sin diagrama) | MK-11 |
| HU-05 | RF-06, RF-07, RF-62, RF-63 | Custodio | Custodio.crear (+ existeCustodioDeUsuario, existeDocumento) | CU-05 (no documentado) | CustodioServicio.crear() (derivado, sin diagrama) | sin pantalla en los mockups 2.5 |
| HU-06 | RF-08 | Custodio | Custodio.buscarPorId, buscarPorUsuario, buscarPorDocumento | CU-06 (no documentado) | CustodioServicio.buscarPorId(), CustodioServicio.buscarPorUsuario(), CustodioServicio.buscarPorDocumento() (derivado, sin diagrama) | sin pantalla en los mockups 2.5 |
| HU-07 | RF-09, RF-61 | Custodio | Custodio.actualizar (+ existeDocumento) | CU-07 (no documentado) | CustodioServicio.actualizar() (derivado, sin diagrama) | sin pantalla en los mockups 2.5 |
| HU-08 | RF-10, RF-64, RF-65, RF-66, RF-67 | Custodio | Custodio.inactivar | CU-08 (no documentado) | CustodioServicio.inactivar() (derivado, sin diagrama) | sin pantalla en los mockups 2.5 |
| HU-09 | RF-11, RF-68, RF-69, RF-70, RF-71, RF-168 | Solicitud | Solicitud.crear | CU-09, paso 7 (mensaje 8, Solicitud.crear(s); Tabla 3 de 3.7) | SolicitudServicio.crear() (Fig. 1) | MK-03 |
| HU-10 | RF-12, RF-72, RF-73, RF-74, RF-75 | Solicitud | Solicitud.buscarPorId, listarPorCustodio, listarPendientes, listarAprobadas (adenda CRF-003) | CU-10 (no documentado) | SolicitudServicio.buscarPorId(), SolicitudServicio.listarPorCustodio(), SolicitudServicio.listarPendientes(), SolicitudServicio.listarAprobadas() (derivado, sin diagrama) | MK-04 |
| HU-11 | RF-13, RF-14, RF-76, RF-77 | Solicitud | Solicitud.actualizar | CU-11 (no documentado) | SolicitudServicio.actualizar() (derivado, sin diagrama) | MK-12 |
| HU-12 | RF-15, RF-78, RF-79, RF-80 | Solicitud | Solicitud.cancelar | CU-12 (no documentado) | SolicitudServicio.cancelar() (derivado, sin diagrama) | MK-12 |
| HU-13 | RF-16, RF-81, RF-82, RF-83, RF-84, RF-86, RF-169 | Aprobacion | Aprobacion.decidir (+ existeDecisionDeSolicitud) | CU-13, paso 8 (mensaje 8, Aprobacion.decidir(a); Tabla 4 de 3.7) | AprobacionServicio.decidir() (Fig. 2) | MK-05 |
| HU-14 | RF-17, RF-85 | Aprobacion | Aprobacion.buscarPorSolicitud | CU-14 (no documentado) | AprobacionServicio.buscarPorSolicitud() (derivado, sin diagrama) | sin pantalla en los mockups 2.5 |
| HU-15 | RF-18, RF-87, RF-88, RF-89, RF-90, RF-91, RF-161 | Asignacion | Asignacion.asignar (+ existeAsignacionDeSolicitud, activoDisponible) | CU-15, paso 9 (mensaje 9, Asignacion.asignar(a); Tabla 5 de 3.7) | AsignacionServicio.asignar() (Fig. 3) | MK-06 |
| HU-16 | RF-19, RF-92, RF-93, RF-94, RF-95, RF-96 | Asignacion | Asignacion.buscarPorId, listarVigentes, listarPorCustodio, buscarVigentePorActivo | CU-16 (no documentado) | AsignacionServicio.buscarPorId(), AsignacionServicio.listarVigentes(), AsignacionServicio.listarPorCustodio(), AsignacionServicio.buscarVigentePorActivo() (derivado, sin diagrama) | MK-13 |
| HU-17 | RF-20, RF-97 | Asignacion | Asignacion.actualizar | CU-17 (no documentado) | AsignacionServicio.actualizar() (derivado, sin diagrama) | sin pantalla en los mockups 2.5 |
| HU-18 | RF-21, RF-98, RF-99, RF-100, RF-101 | Asignacion | Asignacion.cerrar | CU-18 (no documentado) | AsignacionServicio.cerrar() (derivado, sin diagrama) | MK-13 |
| HU-19 | RF-22, RF-102, RF-103, RF-104, RF-105 | Acta_De_Entrega | Acta_De_Entrega.firmar (+ existeActaDeAsignacion) | CU-19, paso 8 (mensaje 8, Acta_De_Entrega.firmar(acta); Tabla 9 de 3.7) | ActaDeEntregaServicio.firmar() (Fig. 7) | MK-07 |
| HU-20 | RF-23, RF-106 | Acta_De_Entrega | Acta_De_Entrega.buscarPorAsignacion | CU-20 (no documentado) | ActaDeEntregaServicio.buscarPorAsignacion() (derivado, sin diagrama) | sin pantalla en los mockups 2.5 |
| HU-21 | RF-24, RF-107, RF-108, RF-109, RF-110, RF-162 | Devolucion | Devolucion.registrar (+ existeDevolucionDeAsignacion) | CU-21 (no documentado) | DevolucionServicio.registrar() (derivado, sin diagrama) | MK-08 |
| HU-22 | RF-25, RF-111, RF-112 | Devolucion | Devolucion.buscarPorId, listarPendientesDeRecepcion | CU-22 (no documentado) | DevolucionServicio.buscarPorId(), DevolucionServicio.listarPendientesDeRecepcion() (derivado, sin diagrama) | MK-08 |
| HU-23 | RF-26, RF-113, RF-114 | Devolucion | Devolucion.actualizar | CU-23 (no documentado) | DevolucionServicio.actualizar() (derivado, sin diagrama) | sin pantalla en los mockups 2.5 |
| HU-24 | RF-27, RF-115, RF-116, RF-117, RF-118, RF-163, RF-170 | Devolucion | Devolucion.confirmarRecepcion (invoca Asignacion.cerrar) | CU-24, paso 7 (mensaje 12, Devolucion.confirmarRecepcion(idDevolucion, idReceptor); Tabla 7 de 3.7) | DevolucionServicio.buscarPorId() (prevalidación, propuesta del equipo) y DevolucionServicio.confirmarRecepcion(); dentro de esta operación, AsignacionServicio.cerrar() (CRF-003) (Figs. 4 y 5) | MK-09 |
| HU-25 | RF-28, RF-119, RF-120, RF-121, RF-167 | Notificacion_De_Devolucion | Notificacion_De_Devolucion.generarAviso (+ calcularDiasRestantes) | CU-25 (no documentado) | NotificacionDeDevolucionServicio.generarAviso() (actor Sistema, sin Vista; sin verificación de permiso, RF-167) (derivado, sin diagrama) | sin pantalla en los mockups 2.5 |
| HU-26 | RF-29, RF-122, RF-123, RF-124, RF-125, RF-171 | Reporte_de_Danios | Reporte_de_Danios.crear | CU-26 (no documentado) | ReporteDeDaniosServicio.crear() (derivado, sin diagrama) | sin pantalla en los mockups 2.5 |
| HU-27 | RF-30, RF-126, RF-127 | Reporte_de_Danios | Reporte_de_Danios.buscarPorId, listarReportes | CU-27 (no documentado) | ReporteDeDaniosServicio.buscarPorId(), ReporteDeDaniosServicio.listarReportes() (derivado, sin diagrama) | sin pantalla en los mockups 2.5 |
| HU-28 | RF-31, RF-128, RF-129, RF-130 | Reporte_de_Danios | Reporte_de_Danios.actualizar | CU-28 (no documentado) | ReporteDeDaniosServicio.actualizar() (derivado, sin diagrama) | sin pantalla en los mockups 2.5 |
| HU-29 | RF-32, RF-131, RF-132, RF-133, RF-134, RF-172 | Historial_Mantenimientos | Historial_Mantenimientos.crear | CU-29 (no documentado) | HistorialMantenimientosServicio.crear() (derivado, sin diagrama) | sin pantalla en los mockups 2.5 |
| HU-30 | RF-33, RF-135 | Historial_Mantenimientos | Historial_Mantenimientos.buscarPorId, listarPorActivo | CU-30 (no documentado) | HistorialMantenimientosServicio.buscarPorId(), HistorialMantenimientosServicio.listarPorActivo() (derivado, sin diagrama) | sin pantalla en los mockups 2.5 |
| HU-31 | RF-34, RF-136 | Historial_Mantenimientos | Historial_Mantenimientos.actualizar | CU-31 (no documentado) | HistorialMantenimientosServicio.actualizar() (derivado, sin diagrama) | sin pantalla en los mockups 2.5 |
| HU-32 | RF-35, RF-36 | Usuario | Usuario.crear (+ existeEmail) | CU-32 (no documentado) | UsuarioServicio.crear() (derivado, sin diagrama) | sin pantalla en los mockups 2.5 |
| HU-33 | RF-37 | Usuario | Usuario.buscarPorId, buscarPorEmail | CU-33 (no documentado) | UsuarioServicio.buscarPorId(), UsuarioServicio.buscarPorEmail() (derivado, sin diagrama) | sin pantalla en los mockups 2.5 |
| HU-34 | RF-38, RF-137, RF-138 | Usuario | Usuario.actualizar (+ existeEmail) | CU-34 (no documentado) | UsuarioServicio.actualizar() (derivado, sin diagrama) | sin pantalla en los mockups 2.5 |
| HU-35 | RF-39, RF-139, RF-140, RF-141, RF-142, RF-143 | Usuario | Usuario.inactivar | CU-35 (no documentado) | UsuarioServicio.inactivar() (derivado, sin diagrama) | sin pantalla en los mockups 2.5 |
| HU-36 | RF-40, RF-144 | Usuario | Usuario.iniciarSesion | CU-36 (no documentado) | UsuarioServicio.iniciarSesion() (derivado, sin diagrama) | sin pantalla en los mockups 2.5 |
| HU-37 | RF-41, RF-145 | Usuario | Usuario.cambiarContrasena | CU-37 (no documentado) | UsuarioServicio.cambiarContrasena() (derivado, sin diagrama) | sin pantalla en los mockups 2.5 |
| HU-38 | RF-42, RF-166 | Rol_Permiso | Rol_Permiso.asignar (+ existeAsignacion) | CU-38 (no documentado) | RolPermisoServicio.asignar() (derivado, sin diagrama) | sin pantalla en los mockups 2.5 |
| HU-39 | RF-43, RF-146 | Rol_Permiso | Rol_Permiso.retirar | CU-39 (no documentado) | RolPermisoServicio.retirar() (derivado, sin diagrama) | sin pantalla en los mockups 2.5 |
| HU-40 | RF-44 | Rol_Permiso | Rol_Permiso.consultarPermisos | CU-40 (no documentado) | RolPermisoServicio.consultarPermisos() (derivado, sin diagrama) | sin pantalla en los mockups 2.5 |
| HU-41 | RF-45, RF-147 | Categoria | Categoria.crear (+ existeNombreCategoria) | CU-41 (no documentado) | CategoriaServicio.crear() (derivado, sin diagrama) | sin pantalla en los mockups 2.5 |
| HU-42 | RF-46, RF-148 | Categoria | Categoria.buscarPorId, listarActivas | CU-42 (no documentado) | CategoriaServicio.buscarPorId(), CategoriaServicio.listarActivas() (derivado, sin diagrama) | sin pantalla en los mockups 2.5 |
| HU-43 | RF-47, RF-149, RF-150 | Categoria | Categoria.actualizar (+ existeNombreCategoria) | CU-43 (no documentado) | CategoriaServicio.actualizar() (derivado, sin diagrama) | sin pantalla en los mockups 2.5 |
| HU-44 | RF-48, RF-151, RF-152, RF-153, RF-154 | Categoria | Categoria.inactivar | CU-44 (no documentado) | CategoriaServicio.inactivar() (derivado, sin diagrama) | sin pantalla en los mockups 2.5 |
| HU-45 | RF-49, RF-160 | Auditoria | Auditoria.buscarPorId (registrar() es INTERNO, sin HU) | CU-45 (no documentado) | AuditoriaServicio.buscarPorId() (derivado, sin diagrama) | sin pantalla en los mockups 2.5 |
| HU-46 | RF-50, RF-155, RF-156, RF-157, RF-158, RF-159, RF-165 | Reportes | Reportes.consultar | CU-46 (no documentado) | ReportesServicio.consultar() (derivado, sin diagrama) | sin pantalla en los mockups 2.5 |
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de validar) a partir de la tabla C.1 del Consolidado de 46 HU (HU, RF, Entidad y Clase.método, sin cambios), de las Tablas 3, 4, 5, 7, 8 y 9 de 3.7 (paso del CU), de la Tabla 10 de 3.7 (mensaje de secuencia) y de la Tabla 3 de 3.6 (pantalla). Fig. N = figura de la sección 3.7.*
 
## 3.9.1 Criterios de lectura
 
HU, RF y Entidad: la historia de usuario, la lista completa de sus RF finales y la entidad, tal como figuran en la tabla C.1; cada RF pertenece a su historia en esa tabla.
 
Clase.método: el método de la tabla C.1, sin cambios. Los métodos entre paréntesis con «+» son INTERNO y los invoca el Servicio dentro del método público. Todos existen entre los 76 métodos del diagrama de clases.
 
Paso CU: para los seis casos de uso documentados (CU-01, CU-09, CU-13, CU-15, CU-19 y CU-24), el paso del flujo básico en que el Servicio invoca el método de la clase, según la columna «Paso o flujo del CU» de las tablas de mensajes de 3.7. «CU-xx (no documentado)» indica que el caso de uso existe en el catálogo con el mismo número de la historia, pero no tiene flujo documentado y por eso no hay paso que citar. Entre paréntesis va el mensaje del Servicio al Modelo de ese paso (número, método y tabla de mensajes de 3.7); la columna «Mensaje sec.» trae la operación del Servicio que la historia invoca.
 
Mensaje sec.: es el mensaje del diagrama de secuencia, con la forma <Entidad>Servicio.<método>(), y no el código M-xx del catálogo de mensajes de interfaz. «Fig. N» remite a la figura de 3.7 donde aparece el mensaje. «Derivado, sin diagrama» indica un mensaje deducido de la convención <Entidad>Servicio del DDA, sin diagrama de secuencia que lo dibuje.
 
Pantalla: el mockup MK-xx que la Tabla 3 de 3.6 asigna a la historia. “Sin pantalla en los mockups 2.5” indica que la historia no tiene mockup; queda para una versión posterior de los mockups.
 
## 3.9.2 Rupturas
 
La Tabla 2 lista las 110 celdas de la matriz que no tienen la cadena completa: 40 de Paso CU (ruptura parcial: el caso de uso existe, pero no está documentado), 40 de Mensaje sec. (trazabilidad parcial: el mensaje existe por convención, sin diagrama) y 30 de Pantalla (ruptura: la historia no tiene mockup). Ninguna celda de HU, RF, Entidad o Clase.método está vacía. La comparación entre la Tabla 3 de 3.6 y la Tabla 29 de los mockups no encontró discrepancias en las 16 historias con pantalla.
 
**Tabla ****2****. ***Rupturas y trazabilidad parcial de la matriz*
 
| **HU** | **Columna** | **Tipo** | **Motivo** | **Fuente consultada** |
| --- | --- | --- | --- | --- |
| HU-02 | Paso CU | Ruptura parcial | CU-02 no tiene flujo documentado; la sección 2.4 documenta CU-01, CU-09, CU-13, CU-15, CU-19 y CU-24 | Word de casos de uso, Tabla 2 |
| HU-03 | Paso CU | Ruptura parcial | CU-03 no tiene flujo documentado; la sección 2.4 documenta CU-01, CU-09, CU-13, CU-15, CU-19 y CU-24 | Word de casos de uso, Tabla 2 |
| HU-04 | Paso CU | Ruptura parcial | CU-04 no tiene flujo documentado; la sección 2.4 documenta CU-01, CU-09, CU-13, CU-15, CU-19 y CU-24 | Word de casos de uso, Tabla 2 |
| HU-05 | Paso CU | Ruptura parcial | CU-05 no tiene flujo documentado; la sección 2.4 documenta CU-01, CU-09, CU-13, CU-15, CU-19 y CU-24 | Word de casos de uso, Tabla 2 |
| HU-06 | Paso CU | Ruptura parcial | CU-06 no tiene flujo documentado; la sección 2.4 documenta CU-01, CU-09, CU-13, CU-15, CU-19 y CU-24 | Word de casos de uso, Tabla 2 |
| HU-07 | Paso CU | Ruptura parcial | CU-07 no tiene flujo documentado; la sección 2.4 documenta CU-01, CU-09, CU-13, CU-15, CU-19 y CU-24 | Word de casos de uso, Tabla 2 |
| HU-08 | Paso CU | Ruptura parcial | CU-08 no tiene flujo documentado; la sección 2.4 documenta CU-01, CU-09, CU-13, CU-15, CU-19 y CU-24 | Word de casos de uso, Tabla 2 |
| HU-10 | Paso CU | Ruptura parcial | CU-10 no tiene flujo documentado; la sección 2.4 documenta CU-01, CU-09, CU-13, CU-15, CU-19 y CU-24 | Word de casos de uso, Tabla 2 |
| HU-11 | Paso CU | Ruptura parcial | CU-11 no tiene flujo documentado; la sección 2.4 documenta CU-01, CU-09, CU-13, CU-15, CU-19 y CU-24 | Word de casos de uso, Tabla 2 |
| HU-12 | Paso CU | Ruptura parcial | CU-12 no tiene flujo documentado; la sección 2.4 documenta CU-01, CU-09, CU-13, CU-15, CU-19 y CU-24 | Word de casos de uso, Tabla 2 |
| HU-14 | Paso CU | Ruptura parcial | CU-14 no tiene flujo documentado; la sección 2.4 documenta CU-01, CU-09, CU-13, CU-15, CU-19 y CU-24 | Word de casos de uso, Tabla 2 |
| HU-16 | Paso CU | Ruptura parcial | CU-16 no tiene flujo documentado; la sección 2.4 documenta CU-01, CU-09, CU-13, CU-15, CU-19 y CU-24 | Word de casos de uso, Tabla 2 |
| HU-17 | Paso CU | Ruptura parcial | CU-17 no tiene flujo documentado; la sección 2.4 documenta CU-01, CU-09, CU-13, CU-15, CU-19 y CU-24 | Word de casos de uso, Tabla 2 |
| HU-18 | Paso CU | Ruptura parcial | CU-18 no tiene flujo documentado; la sección 2.4 documenta CU-01, CU-09, CU-13, CU-15, CU-19 y CU-24 | Word de casos de uso, Tabla 2 |
| HU-20 | Paso CU | Ruptura parcial | CU-20 no tiene flujo documentado; la sección 2.4 documenta CU-01, CU-09, CU-13, CU-15, CU-19 y CU-24 | Word de casos de uso, Tabla 2 |
| HU-21 | Paso CU | Ruptura parcial | CU-21 no tiene flujo documentado; la sección 2.4 documenta CU-01, CU-09, CU-13, CU-15, CU-19 y CU-24 | Word de casos de uso, Tabla 2 |
| HU-22 | Paso CU | Ruptura parcial | CU-22 no tiene flujo documentado; la sección 2.4 documenta CU-01, CU-09, CU-13, CU-15, CU-19 y CU-24 | Word de casos de uso, Tabla 2 |
| HU-23 | Paso CU | Ruptura parcial | CU-23 no tiene flujo documentado; la sección 2.4 documenta CU-01, CU-09, CU-13, CU-15, CU-19 y CU-24 | Word de casos de uso, Tabla 2 |
| HU-25 | Paso CU | Ruptura parcial | CU-25 no tiene flujo documentado; la sección 2.4 documenta CU-01, CU-09, CU-13, CU-15, CU-19 y CU-24 | Word de casos de uso, Tabla 2 |
| HU-26 | Paso CU | Ruptura parcial | CU-26 no tiene flujo documentado; la sección 2.4 documenta CU-01, CU-09, CU-13, CU-15, CU-19 y CU-24 | Word de casos de uso, Tabla 2 |
| HU-27 | Paso CU | Ruptura parcial | CU-27 no tiene flujo documentado; la sección 2.4 documenta CU-01, CU-09, CU-13, CU-15, CU-19 y CU-24 | Word de casos de uso, Tabla 2 |
| HU-28 | Paso CU | Ruptura parcial | CU-28 no tiene flujo documentado; la sección 2.4 documenta CU-01, CU-09, CU-13, CU-15, CU-19 y CU-24 | Word de casos de uso, Tabla 2 |
| HU-29 | Paso CU | Ruptura parcial | CU-29 no tiene flujo documentado; la sección 2.4 documenta CU-01, CU-09, CU-13, CU-15, CU-19 y CU-24 | Word de casos de uso, Tabla 2 |
| HU-30 | Paso CU | Ruptura parcial | CU-30 no tiene flujo documentado; la sección 2.4 documenta CU-01, CU-09, CU-13, CU-15, CU-19 y CU-24 | Word de casos de uso, Tabla 2 |
| HU-31 | Paso CU | Ruptura parcial | CU-31 no tiene flujo documentado; la sección 2.4 documenta CU-01, CU-09, CU-13, CU-15, CU-19 y CU-24 | Word de casos de uso, Tabla 2 |
| HU-32 | Paso CU | Ruptura parcial | CU-32 no tiene flujo documentado; la sección 2.4 documenta CU-01, CU-09, CU-13, CU-15, CU-19 y CU-24 | Word de casos de uso, Tabla 2 |
| HU-33 | Paso CU | Ruptura parcial | CU-33 no tiene flujo documentado; la sección 2.4 documenta CU-01, CU-09, CU-13, CU-15, CU-19 y CU-24 | Word de casos de uso, Tabla 2 |
| HU-34 | Paso CU | Ruptura parcial | CU-34 no tiene flujo documentado; la sección 2.4 documenta CU-01, CU-09, CU-13, CU-15, CU-19 y CU-24 | Word de casos de uso, Tabla 2 |
| HU-35 | Paso CU | Ruptura parcial | CU-35 no tiene flujo documentado; la sección 2.4 documenta CU-01, CU-09, CU-13, CU-15, CU-19 y CU-24 | Word de casos de uso, Tabla 2 |
| HU-36 | Paso CU | Ruptura parcial | CU-36 no tiene flujo documentado; la sección 2.4 documenta CU-01, CU-09, CU-13, CU-15, CU-19 y CU-24 | Word de casos de uso, Tabla 2 |
| HU-37 | Paso CU | Ruptura parcial | CU-37 no tiene flujo documentado; la sección 2.4 documenta CU-01, CU-09, CU-13, CU-15, CU-19 y CU-24 | Word de casos de uso, Tabla 2 |
| HU-38 | Paso CU | Ruptura parcial | CU-38 no tiene flujo documentado; la sección 2.4 documenta CU-01, CU-09, CU-13, CU-15, CU-19 y CU-24 | Word de casos de uso, Tabla 2 |
| HU-39 | Paso CU | Ruptura parcial | CU-39 no tiene flujo documentado; la sección 2.4 documenta CU-01, CU-09, CU-13, CU-15, CU-19 y CU-24 | Word de casos de uso, Tabla 2 |
| HU-40 | Paso CU | Ruptura parcial | CU-40 no tiene flujo documentado; la sección 2.4 documenta CU-01, CU-09, CU-13, CU-15, CU-19 y CU-24 | Word de casos de uso, Tabla 2 |
| HU-41 | Paso CU | Ruptura parcial | CU-41 no tiene flujo documentado; la sección 2.4 documenta CU-01, CU-09, CU-13, CU-15, CU-19 y CU-24 | Word de casos de uso, Tabla 2 |
| HU-42 | Paso CU | Ruptura parcial | CU-42 no tiene flujo documentado; la sección 2.4 documenta CU-01, CU-09, CU-13, CU-15, CU-19 y CU-24 | Word de casos de uso, Tabla 2 |
| HU-43 | Paso CU | Ruptura parcial | CU-43 no tiene flujo documentado; la sección 2.4 documenta CU-01, CU-09, CU-13, CU-15, CU-19 y CU-24 | Word de casos de uso, Tabla 2 |
| HU-44 | Paso CU | Ruptura parcial | CU-44 no tiene flujo documentado; la sección 2.4 documenta CU-01, CU-09, CU-13, CU-15, CU-19 y CU-24 | Word de casos de uso, Tabla 2 |
| HU-45 | Paso CU | Ruptura parcial | CU-45 no tiene flujo documentado; la sección 2.4 documenta CU-01, CU-09, CU-13, CU-15, CU-19 y CU-24 | Word de casos de uso, Tabla 2 |
| HU-46 | Paso CU | Ruptura parcial | CU-46 no tiene flujo documentado; la sección 2.4 documenta CU-01, CU-09, CU-13, CU-15, CU-19 y CU-24 | Word de casos de uso, Tabla 2 |
| HU-02 | Mensaje sec. | Trazabilidad parcial | Mensaje deducido de la convención <Entidad>Servicio del DDA; ningún diagrama de secuencia lo dibuja | 3.7, Tabla 10 |
| HU-03 | Mensaje sec. | Trazabilidad parcial | Mensaje deducido de la convención <Entidad>Servicio del DDA; ningún diagrama de secuencia lo dibuja | 3.7, Tabla 10 |
| HU-04 | Mensaje sec. | Trazabilidad parcial | Mensaje deducido de la convención <Entidad>Servicio del DDA; ningún diagrama de secuencia lo dibuja | 3.7, Tabla 10 |
| HU-05 | Mensaje sec. | Trazabilidad parcial | Mensaje deducido de la convención <Entidad>Servicio del DDA; ningún diagrama de secuencia lo dibuja | 3.7, Tabla 10 |
| HU-06 | Mensaje sec. | Trazabilidad parcial | Mensaje deducido de la convención <Entidad>Servicio del DDA; ningún diagrama de secuencia lo dibuja | 3.7, Tabla 10 |
| HU-07 | Mensaje sec. | Trazabilidad parcial | Mensaje deducido de la convención <Entidad>Servicio del DDA; ningún diagrama de secuencia lo dibuja | 3.7, Tabla 10 |
| HU-08 | Mensaje sec. | Trazabilidad parcial | Mensaje deducido de la convención <Entidad>Servicio del DDA; ningún diagrama de secuencia lo dibuja | 3.7, Tabla 10 |
| HU-10 | Mensaje sec. | Trazabilidad parcial | Mensaje deducido de la convención <Entidad>Servicio del DDA; ningún diagrama de secuencia lo dibuja | 3.7, Tabla 10 |
| HU-11 | Mensaje sec. | Trazabilidad parcial | Mensaje deducido de la convención <Entidad>Servicio del DDA; ningún diagrama de secuencia lo dibuja | 3.7, Tabla 10 |
| HU-12 | Mensaje sec. | Trazabilidad parcial | Mensaje deducido de la convención <Entidad>Servicio del DDA; ningún diagrama de secuencia lo dibuja | 3.7, Tabla 10 |
| HU-14 | Mensaje sec. | Trazabilidad parcial | Mensaje deducido de la convención <Entidad>Servicio del DDA; ningún diagrama de secuencia lo dibuja | 3.7, Tabla 10 |
| HU-16 | Mensaje sec. | Trazabilidad parcial | Mensaje deducido de la convención <Entidad>Servicio del DDA; ningún diagrama de secuencia lo dibuja | 3.7, Tabla 10 |
| HU-17 | Mensaje sec. | Trazabilidad parcial | Mensaje deducido de la convención <Entidad>Servicio del DDA; ningún diagrama de secuencia lo dibuja | 3.7, Tabla 10 |
| HU-18 | Mensaje sec. | Trazabilidad parcial | Mensaje deducido de la convención <Entidad>Servicio del DDA; ningún diagrama de secuencia lo dibuja | 3.7, Tabla 10 |
| HU-20 | Mensaje sec. | Trazabilidad parcial | Mensaje deducido de la convención <Entidad>Servicio del DDA; ningún diagrama de secuencia lo dibuja | 3.7, Tabla 10 |
| HU-21 | Mensaje sec. | Trazabilidad parcial | Mensaje deducido de la convención <Entidad>Servicio del DDA; ningún diagrama de secuencia lo dibuja | 3.7, Tabla 10 |
| HU-22 | Mensaje sec. | Trazabilidad parcial | Mensaje deducido de la convención <Entidad>Servicio del DDA; ningún diagrama de secuencia lo dibuja | 3.7, Tabla 10 |
| HU-23 | Mensaje sec. | Trazabilidad parcial | Mensaje deducido de la convención <Entidad>Servicio del DDA; ningún diagrama de secuencia lo dibuja | 3.7, Tabla 10 |
| HU-25 | Mensaje sec. | Trazabilidad parcial | Mensaje deducido de la convención <Entidad>Servicio del DDA; ningún diagrama de secuencia lo dibuja | 3.7, Tabla 10 |
| HU-26 | Mensaje sec. | Trazabilidad parcial | Mensaje deducido de la convención <Entidad>Servicio del DDA; ningún diagrama de secuencia lo dibuja | 3.7, Tabla 10 |
| HU-27 | Mensaje sec. | Trazabilidad parcial | Mensaje deducido de la convención <Entidad>Servicio del DDA; ningún diagrama de secuencia lo dibuja | 3.7, Tabla 10 |
| HU-28 | Mensaje sec. | Trazabilidad parcial | Mensaje deducido de la convención <Entidad>Servicio del DDA; ningún diagrama de secuencia lo dibuja | 3.7, Tabla 10 |
| HU-29 | Mensaje sec. | Trazabilidad parcial | Mensaje deducido de la convención <Entidad>Servicio del DDA; ningún diagrama de secuencia lo dibuja | 3.7, Tabla 10 |
| HU-30 | Mensaje sec. | Trazabilidad parcial | Mensaje deducido de la convención <Entidad>Servicio del DDA; ningún diagrama de secuencia lo dibuja | 3.7, Tabla 10 |
| HU-31 | Mensaje sec. | Trazabilidad parcial | Mensaje deducido de la convención <Entidad>Servicio del DDA; ningún diagrama de secuencia lo dibuja | 3.7, Tabla 10 |
| HU-32 | Mensaje sec. | Trazabilidad parcial | Mensaje deducido de la convención <Entidad>Servicio del DDA; ningún diagrama de secuencia lo dibuja | 3.7, Tabla 10 |
| HU-33 | Mensaje sec. | Trazabilidad parcial | Mensaje deducido de la convención <Entidad>Servicio del DDA; ningún diagrama de secuencia lo dibuja | 3.7, Tabla 10 |
| HU-34 | Mensaje sec. | Trazabilidad parcial | Mensaje deducido de la convención <Entidad>Servicio del DDA; ningún diagrama de secuencia lo dibuja | 3.7, Tabla 10 |
| HU-35 | Mensaje sec. | Trazabilidad parcial | Mensaje deducido de la convención <Entidad>Servicio del DDA; ningún diagrama de secuencia lo dibuja | 3.7, Tabla 10 |
| HU-36 | Mensaje sec. | Trazabilidad parcial | Mensaje deducido de la convención <Entidad>Servicio del DDA; ningún diagrama de secuencia lo dibuja | 3.7, Tabla 10 |
| HU-37 | Mensaje sec. | Trazabilidad parcial | Mensaje deducido de la convención <Entidad>Servicio del DDA; ningún diagrama de secuencia lo dibuja | 3.7, Tabla 10 |
| HU-38 | Mensaje sec. | Trazabilidad parcial | Mensaje deducido de la convención <Entidad>Servicio del DDA; ningún diagrama de secuencia lo dibuja | 3.7, Tabla 10 |
| HU-39 | Mensaje sec. | Trazabilidad parcial | Mensaje deducido de la convención <Entidad>Servicio del DDA; ningún diagrama de secuencia lo dibuja | 3.7, Tabla 10 |
| HU-40 | Mensaje sec. | Trazabilidad parcial | Mensaje deducido de la convención <Entidad>Servicio del DDA; ningún diagrama de secuencia lo dibuja | 3.7, Tabla 10 |
| HU-41 | Mensaje sec. | Trazabilidad parcial | Mensaje deducido de la convención <Entidad>Servicio del DDA; ningún diagrama de secuencia lo dibuja | 3.7, Tabla 10 |
| HU-42 | Mensaje sec. | Trazabilidad parcial | Mensaje deducido de la convención <Entidad>Servicio del DDA; ningún diagrama de secuencia lo dibuja | 3.7, Tabla 10 |
| HU-43 | Mensaje sec. | Trazabilidad parcial | Mensaje deducido de la convención <Entidad>Servicio del DDA; ningún diagrama de secuencia lo dibuja | 3.7, Tabla 10 |
| HU-44 | Mensaje sec. | Trazabilidad parcial | Mensaje deducido de la convención <Entidad>Servicio del DDA; ningún diagrama de secuencia lo dibuja | 3.7, Tabla 10 |
| HU-45 | Mensaje sec. | Trazabilidad parcial | Mensaje deducido de la convención <Entidad>Servicio del DDA; ningún diagrama de secuencia lo dibuja | 3.7, Tabla 10 |
| HU-46 | Mensaje sec. | Trazabilidad parcial | Mensaje deducido de la convención <Entidad>Servicio del DDA; ningún diagrama de secuencia lo dibuja | 3.7, Tabla 10 |
| HU-05 | Pantalla | Ruptura | La Tabla 3 de 3.6 no tiene fila para esta historia; los mockups 2.5 no la incluyen | 3.6, Tabla 3; mockups 2.5, Tabla 29 |
| HU-06 | Pantalla | Ruptura | La Tabla 3 de 3.6 no tiene fila para esta historia; los mockups 2.5 no la incluyen | 3.6, Tabla 3; mockups 2.5, Tabla 29 |
| HU-07 | Pantalla | Ruptura | La Tabla 3 de 3.6 no tiene fila para esta historia; los mockups 2.5 no la incluyen | 3.6, Tabla 3; mockups 2.5, Tabla 29 |
| HU-08 | Pantalla | Ruptura | La Tabla 3 de 3.6 no tiene fila para esta historia; los mockups 2.5 no la incluyen | 3.6, Tabla 3; mockups 2.5, Tabla 29 |
| HU-14 | Pantalla | Ruptura | La Tabla 3 de 3.6 la registra como «pantalla pendiente en una versión posterior de los mockups»; los mockups 2.5 no la incluyen | 3.6, Tabla 3; mockups 2.5, Tabla 29 |
| HU-17 | Pantalla | Ruptura | La Tabla 3 de 3.6 la registra como «pantalla pendiente en una versión posterior de los mockups»; los mockups 2.5 no la incluyen | 3.6, Tabla 3; mockups 2.5, Tabla 29 |
| HU-20 | Pantalla | Ruptura | La Tabla 3 de 3.6 la registra como «pantalla pendiente en una versión posterior de los mockups»; los mockups 2.5 no la incluyen | 3.6, Tabla 3; mockups 2.5, Tabla 29 |
| HU-23 | Pantalla | Ruptura | La Tabla 3 de 3.6 la registra como «pantalla pendiente en una versión posterior de los mockups»; los mockups 2.5 no la incluyen | 3.6, Tabla 3; mockups 2.5, Tabla 29 |
| HU-25 | Pantalla | Ruptura | La Tabla 3 de 3.6 no tiene fila para esta historia; los mockups 2.5 no la incluyen | 3.6, Tabla 3; mockups 2.5, Tabla 29 |
| HU-26 | Pantalla | Ruptura | La Tabla 3 de 3.6 no tiene fila para esta historia; los mockups 2.5 no la incluyen | 3.6, Tabla 3; mockups 2.5, Tabla 29 |
| HU-27 | Pantalla | Ruptura | La Tabla 3 de 3.6 no tiene fila para esta historia; los mockups 2.5 no la incluyen | 3.6, Tabla 3; mockups 2.5, Tabla 29 |
| HU-28 | Pantalla | Ruptura | La Tabla 3 de 3.6 no tiene fila para esta historia; los mockups 2.5 no la incluyen | 3.6, Tabla 3; mockups 2.5, Tabla 29 |
| HU-29 | Pantalla | Ruptura | La Tabla 3 de 3.6 no tiene fila para esta historia; los mockups 2.5 no la incluyen | 3.6, Tabla 3; mockups 2.5, Tabla 29 |
| HU-30 | Pantalla | Ruptura | La Tabla 3 de 3.6 no tiene fila para esta historia; los mockups 2.5 no la incluyen | 3.6, Tabla 3; mockups 2.5, Tabla 29 |
| HU-31 | Pantalla | Ruptura | La Tabla 3 de 3.6 no tiene fila para esta historia; los mockups 2.5 no la incluyen | 3.6, Tabla 3; mockups 2.5, Tabla 29 |
| HU-32 | Pantalla | Ruptura | La Tabla 3 de 3.6 no tiene fila para esta historia; los mockups 2.5 no la incluyen | 3.6, Tabla 3; mockups 2.5, Tabla 29 |
| HU-33 | Pantalla | Ruptura | La Tabla 3 de 3.6 no tiene fila para esta historia; los mockups 2.5 no la incluyen | 3.6, Tabla 3; mockups 2.5, Tabla 29 |
| HU-34 | Pantalla | Ruptura | La Tabla 3 de 3.6 no tiene fila para esta historia; los mockups 2.5 no la incluyen | 3.6, Tabla 3; mockups 2.5, Tabla 29 |
| HU-35 | Pantalla | Ruptura | La Tabla 3 de 3.6 no tiene fila para esta historia; los mockups 2.5 no la incluyen | 3.6, Tabla 3; mockups 2.5, Tabla 29 |
| HU-36 | Pantalla | Ruptura | La Tabla 3 de 3.6 no tiene fila para esta historia; los mockups 2.5 no la incluyen | 3.6, Tabla 3; mockups 2.5, Tabla 29 |
| HU-37 | Pantalla | Ruptura | La Tabla 3 de 3.6 no tiene fila para esta historia; los mockups 2.5 no la incluyen | 3.6, Tabla 3; mockups 2.5, Tabla 29 |
| HU-38 | Pantalla | Ruptura | La Tabla 3 de 3.6 no tiene fila para esta historia; los mockups 2.5 no la incluyen | 3.6, Tabla 3; mockups 2.5, Tabla 29 |
| HU-39 | Pantalla | Ruptura | La Tabla 3 de 3.6 no tiene fila para esta historia; los mockups 2.5 no la incluyen | 3.6, Tabla 3; mockups 2.5, Tabla 29 |
| HU-40 | Pantalla | Ruptura | La Tabla 3 de 3.6 no tiene fila para esta historia; los mockups 2.5 no la incluyen | 3.6, Tabla 3; mockups 2.5, Tabla 29 |
| HU-41 | Pantalla | Ruptura | La Tabla 3 de 3.6 no tiene fila para esta historia; los mockups 2.5 no la incluyen | 3.6, Tabla 3; mockups 2.5, Tabla 29 |
| HU-42 | Pantalla | Ruptura | La Tabla 3 de 3.6 no tiene fila para esta historia; los mockups 2.5 no la incluyen | 3.6, Tabla 3; mockups 2.5, Tabla 29 |
| HU-43 | Pantalla | Ruptura | La Tabla 3 de 3.6 no tiene fila para esta historia; los mockups 2.5 no la incluyen | 3.6, Tabla 3; mockups 2.5, Tabla 29 |
| HU-44 | Pantalla | Ruptura | La Tabla 3 de 3.6 no tiene fila para esta historia; los mockups 2.5 no la incluyen | 3.6, Tabla 3; mockups 2.5, Tabla 29 |
| HU-45 | Pantalla | Ruptura | La Tabla 3 de 3.6 no tiene fila para esta historia; los mockups 2.5 no la incluyen | 3.6, Tabla 3; mockups 2.5, Tabla 29 |
| HU-46 | Pantalla | Ruptura | La Tabla 3 de 3.6 no tiene fila para esta historia; los mockups 2.5 no la incluyen | 3.6, Tabla 3; mockups 2.5, Tabla 29 |
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de validar) a partir de la Tabla 1 de esta sección. Ruptura parcial: hay caso de uso sin flujo documentado; trazabilidad parcial: mensaje sin diagrama; ruptura: sin pantalla.*
 
## 3.9.3 Verificación
 
La Tabla 3 reúne las comprobaciones. Las cifras se recalcularon con un script sobre la tabla C.1, el diagrama de clases, la sección 3.7 y la Tabla 3 de 3.6; la comparación con la Tabla 2 y la Tabla 27 del Word de casos de uso y con la Tabla 29 de los mockups se hizo leyendo esas tablas.
 
**Tabla ****3****. ***Verificación de la matriz contra sus fuentes*
 
| **Comprobación** | **Esperado** | **Obtenido** |
| --- | --- | --- |
| Filas y HU | 46 filas, HU-01 a HU-46, una vez cada una | 46 filas; HU-01 a HU-46 sin repetir: sí |
| HU, RF, Entidad y Clase.método frente a C.1 | 46 de 46 iguales | 46 de 46 iguales; número de RF igual a la columna «N.º de RF» de C.1 en 46 de 46 |
| Métodos en el diagrama de clases | Todos entre los 76 | 76 métodos leídos del PDF; 0 métodos de la matriz fuera de ellos |
| Paso CU documentado | 6 con «CU-xx, paso N», iguales a 3.7 | 6: CU-01 paso 7 (Tabla 8 de 3.7, mensaje 8); CU-09 paso 7 (Tabla 3 de 3.7, mensaje 8); CU-13 paso 8 (Tabla 4 de 3.7, mensaje 8); CU-15 paso 9 (Tabla 5 de 3.7, mensaje 9); CU-19 paso 8 (Tabla 9 de 3.7, mensaje 8); CU-24 paso 7 (Tabla 7 de 3.7, mensaje 12) |
| Paso CU no documentado | 40 con «CU-xx (no documentado)» | 40 |
| Coherencia con la Tabla 27 | El paso cae en el flujo básico del CA-1 | Por lectura: en los seis casos es el último paso del flujo básico (CA-1: pasos 1 a 7, 1 a 7, 1 a 8, 1 a 9, 1 a 8 y 1 a 7) |
| Mensaje sec. frente a la Tabla 10 de 3.7 | 46 de 46 iguales; 6 con figura y 40 derivados | 46 de 46; 6 con figura y 40 derivados |
| Figuras citadas | Existen en 3.7 | Figuras 1, 2, 3, 4, 5, 6, 7: todas existen |
| Pantalla frente a la Tabla 3 de 3.6 | 16 con MK, iguales; 30 sin pantalla | 16 con MK, iguales; 30 sin pantalla |
| Pantalla frente a la Tabla 29 de los mockups | Lista de discrepancias | Por lectura: 0 discrepancias en las 16 historias con MK; HU-14, HU-17, HU-20 y HU-23 figuran sin pantalla en ambas tablas |
| Rupturas de 3.9.2 | 40 de Paso CU, 40 de Mensaje y 30 de Pantalla | 40, 40 y 30 (110 filas), igual que en la matriz |
 
*Fuente: elaboración propia (propuesta del equipo, pendiente de validar).*
 
## 3.9.4 Supuestos y preguntas abiertas
 
Docente: las 40 historias sin caso de uso documentado y las 40 con mensaje derivado dejan la trazabilidad parcial; se presentan así por decisión del equipo, sin pasos ni diagramas inventados.
 
Docente: las 30 historias sin pantalla quedan como ruptura hasta una versión posterior de los mockups.
 
Docente: en HU-24 el mensaje incluye DevolucionServicio.buscarPorId() como prevalidación, propuesta del equipo descrita en 3.7; la Tabla 3 de 3.6 asigna a MK-09 solo confirmarRecepcion() (hallazgo nuevo propuesto, sin número).
 
Cliente: la autoridad por rol de cada operación sigue pendiente de la matriz rol–operación (P-75 y P-77); la matriz de trazabilidad no la resuelve.
 
Equipo: la lectura cruzada de esta matriz por otro equipo se registra en la sección 3.10 (punto 12b).