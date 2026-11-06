**NexaActivos — Fase C: documento consolidado de las 46 HU**

01 de noviembre de 2026

Cierre de la Fase C. Reúne en un solo documento las 46 historias de usuario (HU-01 a HU-46) del piloto de Activo y de los Bloques 1, 2, 4a, 4b, 5, 6a, 6b y 7. Fuentes: diccionario v6, UML v6, Fase A v6, CRF-002 y CRF-003 (adoptado: Asignacion.cerrar() se conserva bajo HU-18 y se agregó Solicitud.listarAprobadas() bajo HU-10; 62 públicos + 14 INTERNO = 76).

El documento se armó por script: las fichas de 7 campos se copiaron de cada bloque y solo se aplicaron los cambios listados en J.3 (la actualización del 01/11/2026 es la fila 9). Los datos de ejemplo son inventados y los mensajes son propuestos. Las prioridades son propuestas, pendientes de acordar con el cliente. Lo que no está en las fuentes es RN propuesta, pendiente de validar con el cliente. Las secciones de entidad (atributos, métodos, UML y reglas de cada entidad) no se repiten: quedan en los Word de cada bloque, referenciados como anexos.

Actualizado el 01/11/2026: los campos «RF derivados» y la sección C usan los RF finales (RF-01 a RF-172) y se incorporó CRF-003.

**Contenido**

| **Sección** | **Contenido**                                                                         |
|-------------|---------------------------------------------------------------------------------------|
| **A**       | Tabla resumen de las 46 HU (sección 2.1)                                              |
| **B**       | Las 46 HU, con su ficha de 7 campos                                                   |
| **C**       | Requisitos funcionales (RF-01 a RF-172) y trazabilidad (sección 2.2)                  |
| **D**       | Reglas de negocio con su fuente y su estado (sección 3.9)                             |
| **E**       | Catálogo de mensajes (M-01 a M-273)                                                   |
| **F**       | Transiciones de Estado_Activo, Estado_Solicitud, Estado_Asignacion y Estado_Recepcion |
| **G**       | Operaciones auditables                                                                |
| **H**       | Preguntas para el cliente (P-01 a P-105)                                              |
| **I**       | Conteos y cobertura de métodos                                                        |
| **J**       | Observaciones de ingeniería y CRF-003                                                 |
| **K**       | Tabla de equivalencias de códigos, fila por fila                                      |

**Convenciones: reparto fijo de personas de ejemplo**

| **Actor**                  | **Persona de ejemplo** | **Cargo de ejemplo**   |
|----------------------------|------------------------|------------------------|
| **Responsable de Activos** | Marta Rojas            | Responsable de Activos |
| **Empleado**               | Carlos Mejía           | Analista comercial     |
| **Aprobador**              | Laura Gómez            | Jefa de Operaciones    |
| **Técnico de Soporte**     | Andrés Pineda          | Técnico de soporte     |
| **Gerente**                | Sofía Herrera          | Gerente general        |

*Fecha de referencia de los ejemplos: 2026-10-06. Usuarios de ejemplo: Marta Rojas es el usuario 2, Sofía Herrera el 5, Andrés Pineda el 6, Carlos Mejía el 7, Laura Gómez el 9, Pablo Duarte (Responsable de Activos inactivo) el 11 y Rosa Quintero (Aprobador inactiva) el 12.*

**Anexos: documentos de cada bloque**

| **Anexo**   | **Documento**                                                          | **Contenido que se queda en el anexo**                                                                               |
|-------------|------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------|
| **Anexo 1** | NexaActivos_FaseB_Piloto_HU_Activo.docx                                | Activo (HU-01 a HU-04): atributos, métodos, UML y reglas de la entidad                                               |
| **Anexo 2** | NexaActivos_FaseC_Bloque1_Custodio.docx                                | Custodio (HU-05 a HU-08): atributos, métodos, UML y reglas de la entidad                                             |
| **Anexo 3** | NexaActivos_FaseC_Bloque2_Solicitud_Aprobacion.docx                    | Solicitud y Aprobacion (HU-09 a HU-14): atributos, métodos, UML y reglas de la entidad                               |
| **Anexo 4** | NexaActivos_FaseC_Bloque4a_Asignacion_Acta.docx                        | Asignacion y Acta_De_Entrega (HU-15 a HU-20); adenda y anexo CRF-003: atributos, métodos, UML y reglas de la entidad |
| **Anexo 5** | NexaActivos_FaseC_Bloque4b_Devolucion_Notificacion.docx                | Devolucion y Notificacion_De_Devolucion (HU-21 a HU-25): atributos, métodos, UML y reglas de la entidad              |
| **Anexo 6** | NexaActivos_FaseC_Bloque5_Reporte_Danios_Historial_Mantenimientos.docx | Reporte_de_Danios e Historial_Mantenimientos (HU-26 a HU-31): atributos, métodos, UML y reglas de la entidad         |
| **Anexo 7** | NexaActivos_FaseC_Bloque6a_Usuario.docx                                | Usuario (HU-32 a HU-37): atributos, métodos, UML y reglas de la entidad                                              |
| **Anexo 8** | NexaActivos_FaseC_Bloque6b_RolPermiso_Categoria.docx                   | Rol_Permiso y Categoria (HU-38 a HU-44): atributos, métodos, UML y reglas de la entidad                              |
| **Anexo 9** | NexaActivos_FaseC_Bloque7_Auditoria_Reportes.docx                      | Auditoria y Reportes (HU-45 y HU-46): atributos, métodos, UML y reglas de la entidad                                 |

**A. Tabla resumen de las 46 HU (sección 2.1)**

Cada dato sale de la ficha de la HU; los métodos padre salen de las tablas de métodos de cada bloque. «(Supuesto)» marca el actor que la ficha declara como Supuesto, con la pregunta que lo deja abierto. «Alcance 1.2» es el Alcance 1.2 – Tabla 5; las HU sin N-xx solo tienen el Alcance como origen. Las prioridades son propuestas, pendientes de acordar con el cliente.

| **HU**    | **Título corto**                        | **Entidad · métodos padre**                                                             | **Actor**                                                                               | **Necesidad / Origen**                                    | **Prioridad**                               |
|-----------|-----------------------------------------|-----------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------|-----------------------------------------------------------|---------------------------------------------|
| **HU-01** | Registrar activo                        | Activo · crear                                                                          | Responsable de Activos                                                                  | N-01                                                      | Alta — pendiente de acordar con el cliente  |
| **HU-02** | Consultar activos                       | Activo · buscarPorId, buscarPorNumeroSerie, buscarPorPlaca, listarInventario            | Responsable de Activos                                                                  | N-01, N-02                                                | Alta — pendiente de acordar con el cliente  |
| **HU-03** | Actualizar activo                       | Activo · actualizar                                                                     | Responsable de Activos                                                                  | N-01                                                      | Media — pendiente de acordar con el cliente |
| **HU-04** | Dar de baja activo                      | Activo · darDeBaja                                                                      | Responsable de Activos                                                                  | N-11                                                      | Media — pendiente de acordar con el cliente |
| **HU-05** | Registrar custodio                      | Custodio · crear                                                                        | Responsable de Activos                                                                  | N-02                                                      | Alta — pendiente de acordar con el cliente  |
| **HU-06** | Consultar custodios                     | Custodio · buscarPorId, buscarPorUsuario, buscarPorDocumento                            | Responsable de Activos                                                                  | N-02                                                      | Alta — pendiente de acordar con el cliente  |
| **HU-07** | Actualizar custodio                     | Custodio · actualizar                                                                   | Responsable de Activos                                                                  | N-02                                                      | Media — pendiente de acordar con el cliente |
| **HU-08** | Inactivar custodio                      | Custodio · inactivar                                                                    | Responsable de Activos                                                                  | N-02                                                      | Media — pendiente de acordar con el cliente |
| **HU-09** | Registrar solicitud de equipo           | Solicitud · crear                                                                       | Empleado                                                                                | N-03                                                      | Alta — pendiente de acordar con el cliente  |
| **HU-10** | Consultar solicitudes                   | Solicitud · buscarPorId, listarPorCustodio, listarPendientes, listarAprobadas (CRF-003) | Empleado (actor sec.: Aprobador; con la adenda CRF-003, también Responsable de Activos) | N-03                                                      | Alta — pendiente de acordar con el cliente  |
| **HU-11** | Actualizar solicitud                    | Solicitud · actualizar                                                                  | Empleado                                                                                | N-03                                                      | Media — pendiente de acordar con el cliente |
| **HU-12** | Cancelar solicitud                      | Solicitud · cancelar                                                                    | Empleado                                                                                | N-03                                                      | Media — pendiente de acordar con el cliente |
| **HU-13** | Registrar decisión sobre una solicitud  | Aprobacion · decidir                                                                    | Aprobador                                                                               | N-04                                                      | Alta — pendiente de acordar con el cliente  |
| **HU-14** | Consultar decisión de una solicitud     | Aprobacion · buscarPorSolicitud                                                         | Empleado                                                                                | N-04                                                      | Alta — pendiente de acordar con el cliente  |
| **HU-15** | Asignar equipo a una solicitud aprobada | Asignacion · asignar                                                                    | Responsable de Activos                                                                  | N-02, N-06, N-10                                          | Alta — pendiente de acordar con el cliente  |
| **HU-16** | Consultar asignaciones                  | Asignacion · buscarPorId, listarVigentes, listarPorCustodio, buscarVigentePorActivo     | Responsable de Activos (actor sec.: Empleado)                                           | N-02                                                      | Alta — pendiente de acordar con el cliente  |
| **HU-17** | Actualizar asignación                   | Asignacion · actualizar                                                                 | Responsable de Activos                                                                  | N-06                                                      | Media — pendiente de acordar con el cliente |
| **HU-18** | Cerrar asignación                       | Asignacion · cerrar                                                                     | Responsable de Activos                                                                  | N-02, N-10                                                | Media — pendiente de acordar con el cliente |
| **HU-19** | Firmar acta de entrega                  | Acta_De_Entrega · firmar                                                                | Empleado                                                                                | N-05                                                      | Alta — pendiente de acordar con el cliente  |
| **HU-20** | Consultar acta de entrega               | Acta_De_Entrega · buscarPorAsignacion                                                   | Empleado                                                                                | N-05                                                      | Alta — pendiente de acordar con el cliente  |
| **HU-21** | Registrar devolución de un equipo       | Devolucion · registrar                                                                  | Empleado (Supuesto; P-42)                                                               | N-06                                                      | Alta — pendiente de acordar con el cliente  |
| **HU-22** | Consultar devoluciones                  | Devolucion · buscarPorId, listarPendientesDeRecepcion                                   | Responsable de Activos (actor sec.: Empleado)                                           | N-06 + Alcance 1.2                                        | Alta — pendiente de acordar con el cliente  |
| **HU-23** | Actualizar devolución                   | Devolucion · actualizar                                                                 | Empleado                                                                                | N-06                                                      | Media — pendiente de acordar con el cliente |
| **HU-24** | Confirmar recepción de una devolución   | Devolucion · confirmarRecepcion                                                         | Responsable de Activos                                                                  | N-06 + Alcance 1.2                                        | Alta — pendiente de acordar con el cliente  |
| **HU-25** | Generar aviso de próxima devolución     | Notificacion_De_Devolucion · generarAviso                                               | Empleado                                                                                | Alcance 1.2 – Tabla 5, pendiente de validación (sin N-xx) | Media — pendiente de acordar con el cliente |
| **HU-26** | Reportar daño de un equipo              | Reporte_de_Danios · crear                                                               | Empleado                                                                                | N-07                                                      | Alta — pendiente de acordar con el cliente  |
| **HU-27** | Consultar reportes de daño              | Reporte_de_Danios · buscarPorId, listarReportes                                         | Técnico de Soporte (actor sec.: Empleado)                                               | N-07 + Alcance 1.2                                        | Alta — pendiente de acordar con el cliente  |
| **HU-28** | Actualizar reporte de daño              | Reporte_de_Danios · actualizar                                                          | Empleado                                                                                | N-07                                                      | Media — pendiente de acordar con el cliente |
| **HU-29** | Registrar mantenimiento                 | Historial_Mantenimientos · crear                                                        | Técnico de Soporte                                                                      | N-08                                                      | Alta — pendiente de acordar con el cliente  |
| **HU-30** | Consultar historial de mantenimiento    | Historial_Mantenimientos · buscarPorId, listarPorActivo                                 | Técnico de Soporte (otros consultores: Supuesto; P-57)                                  | N-08 + Alcance 1.2                                        | Alta — pendiente de acordar con el cliente  |
| **HU-31** | Actualizar mantenimiento                | Historial_Mantenimientos · actualizar                                                   | Técnico de Soporte                                                                      | N-08                                                      | Media — pendiente de acordar con el cliente |
| **HU-32** | Registrar usuario                       | Usuario · crear                                                                         | Responsable de Activos (Supuesto; P-60)                                                 | Alcance 1.2 – Tabla 5, pendiente de validación (sin N-xx) | Alta — pendiente de acordar con el cliente  |
| **HU-33** | Consultar usuario                       | Usuario · buscarPorId, buscarPorEmail                                                   | Responsable de Activos (Supuesto; P-60)                                                 | Alcance 1.2 – Tabla 5, pendiente de validación (sin N-xx) | Alta — pendiente de acordar con el cliente  |
| **HU-34** | Actualizar usuario                      | Usuario · actualizar                                                                    | Responsable de Activos (Supuesto; P-60)                                                 | Alcance 1.2 – Tabla 5, pendiente de validación (sin N-xx) | Media — pendiente de acordar con el cliente |
| **HU-35** | Inactivar usuario                       | Usuario · inactivar                                                                     | Responsable de Activos (Supuesto; P-60)                                                 | Alcance 1.2 – Tabla 5, pendiente de validación (sin N-xx) | Media — pendiente de acordar con el cliente |
| **HU-36** | Iniciar sesión                          | Usuario · iniciarSesion                                                                 | Empleado                                                                                | Alcance 1.2 – Tabla 5, pendiente de validación (sin N-xx) | Alta — pendiente de acordar con el cliente  |
| **HU-37** | Cambiar contraseña                      | Usuario · cambiarContrasena                                                             | Empleado                                                                                | Alcance 1.2 – Tabla 5, pendiente de validación (sin N-xx) | Media — pendiente de acordar con el cliente |
| **HU-38** | Asignar permiso a un rol                | Rol_Permiso · asignar                                                                   | Responsable de Activos (Supuesto; P-74)                                                 | Alcance 1.2 – Tabla 5, pendiente de validación (sin N-xx) | Alta — pendiente de acordar con el cliente  |
| **HU-39** | Retirar permiso a un rol                | Rol_Permiso · retirar                                                                   | Responsable de Activos (Supuesto; P-74)                                                 | Alcance 1.2 – Tabla 5, pendiente de validación (sin N-xx) | Media — pendiente de acordar con el cliente |
| **HU-40** | Consultar permisos de un rol            | Rol_Permiso · consultarPermisos                                                         | Responsable de Activos                                                                  | Alcance 1.2 – Tabla 5, pendiente de validación (sin N-xx) | Alta — pendiente de acordar con el cliente  |
| **HU-41** | Registrar categoría                     | Categoria · crear                                                                       | Responsable de Activos (Supuesto; P-74)                                                 | Alcance 1.2 – Tabla 5, pendiente de validación (sin N-xx) | Alta — pendiente de acordar con el cliente  |
| **HU-42** | Consultar categorías                    | Categoria · buscarPorId, listarActivas                                                  | Responsable de Activos (Supuesto; P-74) (actor sec.: Empleado, Supuesto)                | Alcance 1.2 – Tabla 5, pendiente de validación (sin N-xx) | Alta — pendiente de acordar con el cliente  |
| **HU-43** | Actualizar categoría                    | Categoria · actualizar                                                                  | Responsable de Activos (Supuesto; P-74)                                                 | Alcance 1.2 – Tabla 5, pendiente de validación (sin N-xx) | Media — pendiente de acordar con el cliente |
| **HU-44** | Inactivar categoría                     | Categoria · inactivar                                                                   | Responsable de Activos (Supuesto; P-74)                                                 | Alcance 1.2 – Tabla 5, pendiente de validación (sin N-xx) | Media — pendiente de acordar con el cliente |
| **HU-45** | Consultar registro de auditoría         | Auditoria · buscarPorId                                                                 | Gerente (Supuesto; P-88)                                                                | Alcance 1.2 – Tabla 5, pendiente de validación (sin N-xx) | Alta — pendiente de acordar con el cliente  |
| **HU-46** | Consultar reportes                      | Reportes · consultar                                                                    | Gerente (Supuesto; P-88)                                                                | Alcance 1.2 – Tabla 5, pendiente de validación (sin N-xx) | Alta — pendiente de acordar con el cliente  |

*Prioridades: 28 Alta y 18 Media. HU-10 lleva listarAprobadas() por el CRF-003 (adenda del Bloque 4a).*

**B. Las 46 HU, con su ficha de 7 campos**

Las fichas se copiaron literalmente de cada bloque, con los códigos renumerados (tabla K) y los cambios de J.3 (HU-10, HU-18 y HU-24). Cada ficha lleva debajo su nota.

**Activo — Anexo 1**

**HU-01 Registrar activo**

<table>
<colgroup>
<col style="width: 16%" />
<col style="width: 83%" />
</colgroup>
<tbody>
<tr class="odd">
<td><strong>Código</strong></td>
<td><strong>HU-01</strong></td>
</tr>
<tr class="even">
<td><strong>Título corto</strong></td>
<td>Registrar activo</td>
</tr>
<tr class="odd">
<td><strong>Historia</strong></td>
<td><strong>Como</strong> Marta Rojas, Responsable de Activos, <strong>quiero</strong> registrar un equipo nuevo con número de serie y placa de inventario únicos, <strong>para</strong> identificarlo de forma única y poder localizarlo después.</td>
</tr>
<tr class="even">
<td><strong>Criterios de aceptación</strong></td>
<td><p><strong>Antecedentes</strong> (comunes a todos los escenarios)</p>
<blockquote>
<p><strong>Dado</strong> que Marta Rojas, Responsable de Activos, inició sesión</p>
</blockquote>
<p><strong>Escenario: CA-1 Registrar un activo con todos sus datos</strong></p>
<p><em># crear() · RN-A01, RN-A02, RN-A06</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la categoría 1 (Portátiles, activa)</p>
<p><strong>Cuando</strong> registra el activo con los datos:</p>
<p>│ Campo │ Valor │</p>
<p>├──────────────────┼───────────────┤</p>
<p>│ Marca │ Dell │</p>
<p>│ Modelo │ Latitude 5420 │</p>
<p>│ Numero_Serie │ 9H4TQ63 │</p>
<p>│ Placa_Inventario │ NEX-000104 │</p>
<p>│ Ubicacion │ Oficina 205 │</p>
<p>│ ID_Categoria │ 1 │</p>
<p><strong>Entonces</strong> el sistema responde «Activo registrado correctamente.»</p>
<p><strong>Y</strong> el activo queda guardado con:</p>
<p>│ ID_Activo │ Marca │ Modelo │ Numero_Serie │ Placa_Inventario │ Estado │ Ubicacion │ ID_Categoria │</p>
<p>├──────────────┼───────┼───────────────┼──────────────┼──────────────────┼────────────┼─────────────┼──────────────┤</p>
<p>│ (automático) │ Dell │ Latitude 5420 │ 9H4TQ63 │ NEX-000104 │ Disponible │ Oficina 205 │ 1 │</p>
</blockquote>
<p><strong>Escenario: CA-2 Registrar un activo sin ubicación</strong></p>
<p><em># crear() · RN-A02</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la categoría 1 (Portátiles, activa)</p>
<p><strong>Cuando</strong> registra un activo con Marca Lenovo, Modelo ThinkPad L14, Numero_Serie PF4N7R1K, Placa_Inventario NEX-000105, ID_Categoria 1 y sin Ubicacion</p>
<p><strong>Entonces</strong> el sistema responde «Activo registrado correctamente.»</p>
<p><strong>Y</strong> el activo queda con Ubicacion vacía y Estado Disponible</p>
</blockquote>
<p><strong>Esquema del escenario: CA-3 Número de serie o placa ya registrados</strong></p>
<p><em># existeNumeroSerie(), existePlaca() · RN-A03, RN-A04</em></p>
<blockquote>
<p><strong>Dado</strong> que existen los activos:</p>
<p>│ ID_Activo │ Numero_Serie │ Placa_Inventario │ Estado │</p>
<p>├───────────┼──────────────┼──────────────────┼────────────┤</p>
<p>│ 1 │ 5CD2171NQ7 │ NEX-000101 │ Disponible │</p>
<p>│ 2 │ PF3K8M2Z │ NEX-000102 │ Asignado │</p>
<p>│ 4 │ X4LZ1203918 │ NEX-000090 │ Baja │</p>
<p><strong>Y</strong> que existe la categoría 1 (Portátiles, activa)</p>
<p><strong>Cuando</strong> registra un activo con &lt;campo&gt; &lt;valor&gt; y los demás datos válidos y distintos de los existentes</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> no se crea el activo</p>
<p><strong>Ejemplos:</strong></p>
<p>│ campo │ valor │ lo tiene el activo │ mensaje │</p>
<p>├──────────────────┼─────────────┼────────────────────┼──────────────────────────────────────────────┤</p>
<p>│ Numero_Serie │ 5CD2171NQ7 │ 1 (Disponible) │ «El número de serie ya está registrado.» │</p>
<p>│ Numero_Serie │ X4LZ1203918 │ 4 (Baja) │ «El número de serie ya está registrado.» │</p>
<p>│ Placa_Inventario │ NEX-000102 │ 2 (Asignado) │ «La placa de inventario ya está registrada.» │</p>
<p>│ Placa_Inventario │ NEX-000090 │ 4 (Baja) │ «La placa de inventario ya está registrada.» │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-4 Datos obligatorios vacíos</strong></p>
<p><em># crear() · RN-A02</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la categoría 1 (Portátiles, activa)</p>
<p><strong>Cuando</strong> registra un activo con &lt;campo&gt; vacío y los demás datos válidos</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> no se crea el activo</p>
<p><strong>Ejemplos:</strong></p>
<p>│ campo │ mensaje │</p>
<p>├──────────────────┼──────────────────────────────────────────┤</p>
<p>│ Marca │ «La marca es obligatoria.» │</p>
<p>│ Modelo │ «El modelo es obligatorio.» │</p>
<p>│ Numero_Serie │ «El número de serie es obligatorio.» │</p>
<p>│ Placa_Inventario │ «La placa de inventario es obligatoria.» │</p>
<p>│ ID_Categoria │ «La categoría es obligatoria.» │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-5 Longitud máxima aceptada y superada</strong></p>
<p><em># crear() · RN-A05</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la categoría 1 (Portátiles, activa)</p>
<p><strong>Cuando</strong> registra un activo con &lt;campo&gt; de &lt;valor&gt; y los demás datos válidos</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Ejemplos:</strong></p>
<p>│ campo │ valor │ longitud │ máximo │ mensaje │</p>
<p>├──────────────────┼─────────────────────────┼──────────┼────────┼──────────────────────────────────────────────────────────┤</p>
<p>│ Numero_Serie │ 9H4TQ63L8M2P5R7T1V3X │ 20 │ 20 │ «Activo registrado correctamente.» │</p>
<p>│ Placa_Inventario │ NEX-0001045 │ 11 │ 11 │ «Activo registrado correctamente.» │</p>
<p>│ Marca │ texto de 51 caracteres │ 51 │ 50 │ «La marca no puede superar 50 caracteres.» │</p>
<p>│ Modelo │ texto de 51 caracteres │ 51 │ 50 │ «El modelo no puede superar 50 caracteres.» │</p>
<p>│ Numero_Serie │ 9H4TQ63L8M2P5R7T1V3XZ │ 21 │ 20 │ «El número de serie no puede superar 20 caracteres.» │</p>
<p>│ Placa_Inventario │ NEX-00010456 │ 12 │ 11 │ «La placa de inventario no puede superar 11 caracteres.» │</p>
<p>│ Ubicacion │ texto de 101 caracteres │ 101 │ 100 │ «La ubicación no puede superar 100 caracteres.» │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-6 Categoría inexistente o inactiva</strong></p>
<p><em># crear() · RN-A08, RN-A09</em></p>
<blockquote>
<p><strong>Dado</strong> que existen las categorías:</p>
<p>│ ID_Categoria │ Nombre_Categoria │ activo │</p>
<p>├──────────────┼──────────────────┼────────┤</p>
<p>│ 1 │ Portátiles │ TRUE │</p>
<p>│ 3 │ Proyectores │ FALSE │</p>
<p><strong>Cuando</strong> registra un activo con los datos válidos de Dell Latitude 5420 y ID_Categoria &lt;categoria&gt;</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> no se crea el activo</p>
<p><strong>Ejemplos:</strong></p>
<p>│ categoria │ mensaje │</p>
<p>├───────────────────────────┼────────────────────────────────────────────┤</p>
<p>│ 99 (no existe) │ «La categoría seleccionada no existe.» │</p>
<p>│ 3 (Proyectores, inactiva) │ «La categoría seleccionada está inactiva.» │</p>
</blockquote></td>
</tr>
<tr class="odd">
<td><strong>Origen de la necesidad</strong></td>
<td>Pregunta 8 de la encuesta: 14 de 19 usan canales informales (verbal 5, correo 5, WhatsApp 3, Excel compartido 1); Pregunta 12: 4 respuestas señalan desorden, falta de registro o falta de control. N-01.</td>
</tr>
<tr class="even">
<td><strong>RF derivados</strong></td>
<td>RF-01, RF-02, RF-52</td>
</tr>
<tr class="odd">
<td><strong>Prioridad</strong></td>
<td>Alta</td>
</tr>
</tbody>
</table>

**HU-02 Consultar activos**

<table>
<colgroup>
<col style="width: 16%" />
<col style="width: 83%" />
</colgroup>
<tbody>
<tr class="odd">
<td><strong>Código</strong></td>
<td><strong>HU-02</strong></td>
</tr>
<tr class="even">
<td><strong>Título corto</strong></td>
<td>Consultar activos</td>
</tr>
<tr class="odd">
<td><strong>Historia</strong></td>
<td><strong>Como</strong> Marta Rojas, Responsable de Activos, <strong>quiero</strong> consultar un activo por su identificador, número de serie o placa de inventario y ver el inventario ordenado por placa, <strong>para</strong> localizar un equipo y conocer su estado actual de forma rápida.</td>
</tr>
<tr class="even">
<td><strong>Criterios de aceptación</strong></td>
<td><p><strong>Antecedentes</strong> (comunes a todos los escenarios)</p>
<blockquote>
<p><strong>Dado</strong> que Marta Rojas, Responsable de Activos, inició sesión</p>
</blockquote>
<p><strong>Escenario: CA-1 Consultar un activo por su identificador</strong></p>
<p><em># buscarPorId() · RN-A15</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el activo:</p>
<p>│ ID_Activo │ Marca │ Modelo │ Numero_Serie │ Placa_Inventario │ Estado │ Ubicacion │ ID_Categoria │</p>
<p>├───────────┼───────┼────────┼──────────────┼──────────────────┼────────┼──────────────────┼──────────────┤</p>
<p>│ 3 │ Dell │ P2422H │ CN0X9Y4B71 │ NEX-000103 │ Dañado │ Bodega principal │ 2 │</p>
<p><strong>Cuando</strong> consulta por ID_Activo 3</p>
<p><strong>Entonces</strong> ve el activo con sus 8 campos: ID_Activo 3, Marca Dell, Modelo P2422H, Numero_Serie CN0X9Y4B71, Placa_Inventario NEX-000103, Estado Dañado, Ubicacion Bodega principal e ID_Categoria 2</p>
<p><strong>Y</strong> la consulta no modifica el activo</p>
</blockquote>
<p><strong>Escenario: CA-2 Consultar un activo por su número de serie</strong></p>
<p><em># buscarPorNumeroSerie() · RN-A03, RN-A15</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el activo:</p>
<p>│ ID_Activo │ Marca │ Modelo │ Numero_Serie │ Placa_Inventario │ Estado │ Ubicacion │ ID_Categoria │</p>
<p>├───────────┼────────┼──────────────┼──────────────┼──────────────────┼──────────┼─────────────┼──────────────┤</p>
<p>│ 2 │ Lenovo │ ThinkPad E14 │ PF3K8M2Z │ NEX-000102 │ Asignado │ Oficina 301 │ 1 │</p>
<p><strong>Cuando</strong> consulta por Numero_Serie PF3K8M2Z</p>
<p><strong>Entonces</strong> ve un solo activo, con sus 8 campos: ID_Activo 2, Marca Lenovo, Modelo ThinkPad E14, Numero_Serie PF3K8M2Z, Placa_Inventario NEX-000102, Estado Asignado, Ubicacion Oficina 301 e ID_Categoria 1</p>
</blockquote>
<p><strong>Escenario: CA-3 Consultar un activo por su placa de inventario</strong></p>
<p><em># buscarPorPlaca() · RN-A04, RN-A15</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el activo:</p>
<p>│ ID_Activo │ Marca │ Modelo │ Numero_Serie │ Placa_Inventario │ Estado │ Ubicacion │ ID_Categoria │</p>
<p>├───────────┼───────┼───────────────┼──────────────┼──────────────────┼────────┼───────────┼──────────────┤</p>
<p>│ 4 │ Epson │ PowerLite X49 │ X4LZ1203918 │ NEX-000090 │ Baja │ (vacío) │ 3 │</p>
<p><strong>Cuando</strong> consulta por Placa_Inventario NEX-000090</p>
<p><strong>Entonces</strong> ve un solo activo, con sus 8 campos: ID_Activo 4, Marca Epson, Modelo PowerLite X49, Numero_Serie X4LZ1203918, Placa_Inventario NEX-000090, Estado Baja, Ubicacion vacía e ID_Categoria 3</p>
</blockquote>
<p><strong>Esquema del escenario: CA-4 Activo no encontrado</strong></p>
<p><em># buscarPorId(), buscarPorNumeroSerie(), buscarPorPlaca() · RN-A15</em></p>
<blockquote>
<p><strong>Dado</strong> que el inventario no contiene ningún activo con &lt;forma&gt; &lt;valor&gt;</p>
<p><strong>Cuando</strong> consulta por &lt;forma&gt; &lt;valor&gt;</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> no se muestra ningún activo</p>
<p><strong>Ejemplos:</strong></p>
<p>│ forma │ valor │ mensaje │</p>
<p>├──────────────────┼────────────┼─────────────────────────────────────────────────────────────┤</p>
<p>│ ID_Activo │ 99 │ «No se encontró ningún activo con ese identificador.» │</p>
<p>│ Numero_Serie │ ZZ9999 │ «No se encontró ningún activo con ese número de serie.» │</p>
<p>│ Placa_Inventario │ NEX-009999 │ «No se encontró ningún activo con esa placa de inventario.» │</p>
</blockquote>
<p><strong>Escenario: CA-5 Ver el inventario ordenado por placa</strong></p>
<p><em># listarInventario() · RN-A14</em></p>
<blockquote>
<p><strong>Dado</strong> que el inventario contiene los activos:</p>
<p>│ ID_Activo │ Marca │ Modelo │ Numero_Serie │ Placa_Inventario │ Estado │ Ubicacion │ ID_Categoria │</p>
<p>├───────────┼────────┼────────────────┼──────────────┼──────────────────┼────────────┼──────────────────┼──────────────┤</p>
<p>│ 1 │ HP │ ProBook 450 G8 │ 5CD2171NQ7 │ NEX-000101 │ Disponible │ Bodega principal │ 1 │</p>
<p>│ 2 │ Lenovo │ ThinkPad E14 │ PF3K8M2Z │ NEX-000102 │ Asignado │ Oficina 301 │ 1 │</p>
<p>│ 3 │ Dell │ P2422H │ CN0X9Y4B71 │ NEX-000103 │ Dañado │ Bodega principal │ 2 │</p>
<p>│ 4 │ Epson │ PowerLite X49 │ X4LZ1203918 │ NEX-000090 │ Baja │ (vacío) │ 3 │</p>
<p><strong>Cuando</strong> consulta el inventario</p>
<p><strong>Entonces</strong> ve los 4 activos en 6 columnas (Placa_Inventario, ID_Activo, Marca, Modelo, Numero_Serie y Estado), ordenados por Placa_Inventario de menor a mayor, aunque su ID_Activo no siga ese orden:</p>
<p>│ Placa_Inventario │ ID_Activo │ Marca │ Modelo │ Numero_Serie │ Estado │</p>
<p>├──────────────────┼───────────┼────────┼────────────────┼──────────────┼────────────┤</p>
<p>│ NEX-000090 │ 4 │ Epson │ PowerLite X49 │ X4LZ1203918 │ Baja │</p>
<p>│ NEX-000101 │ 1 │ HP │ ProBook 450 G8 │ 5CD2171NQ7 │ Disponible │</p>
<p>│ NEX-000102 │ 2 │ Lenovo │ ThinkPad E14 │ PF3K8M2Z │ Asignado │</p>
<p>│ NEX-000103 │ 3 │ Dell │ P2422H │ CN0X9Y4B71 │ Dañado │</p>
</blockquote>
<p><strong>Escenario: CA-6 Inventario sin activos</strong></p>
<p><em># listarInventario() · RN-A14</em></p>
<blockquote>
<p><strong>Dado</strong> que el inventario no contiene ningún activo</p>
<p><strong>Cuando</strong> consulta el inventario</p>
<p><strong>Entonces</strong> el sistema responde «No hay activos registrados.»</p>
</blockquote></td>
</tr>
<tr class="odd">
<td><strong>Origen de la necesidad</strong></td>
<td>Pregunta 11 de la encuesta: «estado actual» es el dato más relevante para 5 de 19; Pregunta 5: localizar equipos es dificultad alta para 5 de 19. Pregunta 12: 3 respuestas piden inventario en tiempo real, encontrar equipos rápido y saber cuáles están operativos. N-01 y N-02.</td>
</tr>
<tr class="even">
<td><strong>RF derivados</strong></td>
<td>RF-03, RF-56</td>
</tr>
<tr class="odd">
<td><strong>Prioridad</strong></td>
<td>Alta</td>
</tr>
</tbody>
</table>

*Nota: N-02: «poder localizarlo». Las consultas por clave muestran los 8 campos; el listado muestra 6 columnas por espacio (RN-A14).*

**HU-03 Actualizar activo**

<table>
<colgroup>
<col style="width: 16%" />
<col style="width: 83%" />
</colgroup>
<tbody>
<tr class="odd">
<td><strong>Código</strong></td>
<td><strong>HU-03</strong></td>
</tr>
<tr class="even">
<td><strong>Título corto</strong></td>
<td>Actualizar activo</td>
</tr>
<tr class="odd">
<td><strong>Historia</strong></td>
<td><strong>Como</strong> Marta Rojas, Responsable de Activos, <strong>quiero</strong> corregir los datos de un activo registrado sin perder la unicidad de su número de serie ni de su placa, <strong>para</strong> mantener el inventario correcto y actualizado.</td>
</tr>
<tr class="even">
<td><strong>Criterios de aceptación</strong></td>
<td><p><strong>Antecedentes</strong> (comunes a todos los escenarios)</p>
<blockquote>
<p><strong>Dado</strong> que Marta Rojas, Responsable de Activos, inició sesión</p>
</blockquote>
<p><strong>Escenario: CA-1 Actualizar todos los datos editables de un activo</strong></p>
<p><em># actualizar() · RN-A01, RN-A02, RN-A07, RN-A16</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el activo 3 con los valores de la columna Antes y la categoría 4 (Periféricos, activa)</p>
<p><strong>Cuando</strong> actualiza el activo 3 con los valores de la columna Después:</p>
<p>│ Campo │ Antes │ Después │</p>
<p>├──────────────────┼──────────────────┼───────────────────┤</p>
<p>│ Marca │ Dell │ Dell Technologies │</p>
<p>│ Modelo │ P2422H │ P2422HE │</p>
<p>│ Numero_Serie │ CN0X9Y4B71 │ CN0X9Y4B72 │</p>
<p>│ Placa_Inventario │ NEX-000103 │ NEX-000106 │</p>
<p>│ Estado │ Dañado │ Disponible │</p>
<p>│ Ubicacion │ Bodega principal │ Oficina 118 │</p>
<p>│ ID_Categoria │ 2 │ 4 │</p>
<p>│ ID_Activo │ 3 │ 3 (sin cambio) │</p>
<p><strong>Entonces</strong> el sistema responde «Activo actualizado correctamente.»</p>
<p><strong>Y</strong> el activo 3 queda con los valores de la columna Después</p>
</blockquote>
<p><strong>Escenario: CA-2 Dejar vacía la ubicación y conservar su propia serie y placa</strong></p>
<p><em># actualizar(), existeNumeroSerie(), existePlaca() · RN-A02, RN-A13</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el activo 1 (HP ProBook 450 G8, serie 5CD2171NQ7, placa NEX-000101, estado Disponible, ubicación Bodega principal, categoría 1)</p>
<p><strong>Cuando</strong> actualiza el activo 1 dejando la Ubicacion vacía y manteniendo Numero_Serie 5CD2171NQ7 y Placa_Inventario NEX-000101</p>
<p><strong>Entonces</strong> el sistema responde «Activo actualizado correctamente.»</p>
<p><strong>Y</strong> el activo 1 queda con Ubicacion vacía y los demás datos sin cambio</p>
</blockquote>
<p><strong>Esquema del escenario: CA-3 Número de serie o placa que ya tiene otro activo</strong></p>
<p><em># existeNumeroSerie(), existePlaca() · RN-A03, RN-A04, RN-A13</em></p>
<blockquote>
<p><strong>Dado</strong> que existen los activos:</p>
<p>│ ID_Activo │ Numero_Serie │ Placa_Inventario │ Estado │</p>
<p>├───────────┼──────────────┼──────────────────┼────────────┤</p>
<p>│ 1 │ 5CD2171NQ7 │ NEX-000101 │ Disponible │</p>
<p>│ 2 │ PF3K8M2Z │ NEX-000102 │ Asignado │</p>
<p>│ 4 │ X4LZ1203918 │ NEX-000090 │ Baja │</p>
<p><strong>Cuando</strong> actualiza el activo 1 con &lt;campo&gt; &lt;valor&gt;</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> el activo 1 conserva sus datos anteriores</p>
<p><strong>Ejemplos:</strong></p>
<p>│ campo │ valor │ lo tiene el activo │ mensaje │</p>
<p>├──────────────────┼─────────────┼────────────────────┼──────────────────────────────────────────────┤</p>
<p>│ Numero_Serie │ 5CD2171NQ7 │ 1 (Disponible) │ «El número de serie ya está registrado.» │</p>
<p>│ Numero_Serie │ X4LZ1203918 │ 4 (Baja) │ «El número de serie ya está registrado.» │</p>
<p>│ Placa_Inventario │ NEX-000102 │ 2 (Asignado) │ «La placa de inventario ya está registrada.» │</p>
<p>│ Placa_Inventario │ NEX-000090 │ 4 (Baja) │ «La placa de inventario ya está registrada.» │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-4 Datos inválidos</strong></p>
<p><em># actualizar() · RN-A02, RN-A05, RN-A08, RN-A09</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el activo 1 (HP ProBook 450 G8, serie 5CD2171NQ7, placa NEX-000101, estado Disponible, ubicación Bodega principal, categoría 1) y las categorías 1 (activa) y 3 (Proyectores, inactiva)</p>
<p><strong>Cuando</strong> actualiza el activo 1 con &lt;campo&gt; &lt;valor&gt;</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> el activo 1 conserva sus datos anteriores</p>
<p><strong>Ejemplos:</strong></p>
<p>│ campo │ valor │ mensaje │</p>
<p>├──────────────────┼────────────────────────────┼──────────────────────────────────────────────────────────┤</p>
<p>│ Marca │ (vacío) │ «La marca es obligatoria.» │</p>
<p>│ Modelo │ (vacío) │ «El modelo es obligatorio.» │</p>
<p>│ Numero_Serie │ (vacío) │ «El número de serie es obligatorio.» │</p>
<p>│ Placa_Inventario │ (vacío) │ «La placa de inventario es obligatoria.» │</p>
<p>│ ID_Categoria │ (vacío) │ «La categoría es obligatoria.» │</p>
<p>│ Marca │ texto de 51 caracteres │ «La marca no puede superar 50 caracteres.» │</p>
<p>│ Modelo │ texto de 51 caracteres │ «El modelo no puede superar 50 caracteres.» │</p>
<p>│ Numero_Serie │ 9H4TQ63L8M2P5R7T1V3XZ (21) │ «El número de serie no puede superar 20 caracteres.» │</p>
<p>│ Placa_Inventario │ NEX-00010456 (12) │ «La placa de inventario no puede superar 11 caracteres.» │</p>
<p>│ Ubicacion │ texto de 101 caracteres │ «La ubicación no puede superar 100 caracteres.» │</p>
<p>│ ID_Categoria │ 99 (no existe) │ «La categoría seleccionada no existe.» │</p>
<p>│ ID_Categoria │ 3 (Proyectores, inactiva) │ «La categoría seleccionada está inactiva.» │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-5 Cambio de estado: permitido y no permitido</strong></p>
<p><em># actualizar() · RN-A07, RN-A10, RN-A16</em></p>
<blockquote>
<p><strong>Dado</strong> que existen los activos 1 (Disponible) y 2 (Asignado)</p>
<p><strong>Cuando</strong> actualiza el activo &lt;activo&gt; cambiando su Estado de &lt;actual&gt; a &lt;solicitado&gt;</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> el activo queda con Estado &lt;estado_final&gt;</p>
<p><strong>Ejemplos:</strong></p>
<p>│ activo │ actual │ solicitado │ mensaje │ estado_final │</p>
<p>├────────┼────────────┼────────────┼─────────────────────────────────────────────────────────────────────────────┼──────────────┤</p>
<p>│ 1 │ Disponible │ Dañado │ «Activo actualizado correctamente.» │ Dañado │</p>
<p>│ 1 │ Disponible │ Prestado │ «El estado no es válido.» │ Disponible │</p>
<p>│ 1 │ Disponible │ Baja │ «El estado Baja solo se asigna dando de baja el activo.» │ Disponible │</p>
<p>│ 1 │ Disponible │ Asignado │ «El estado Asignado solo se asigna al entregar el equipo.» │ Disponible │</p>
<p>│ 2 │ Asignado │ Dañado │ «Un activo asignado no puede cambiar de estado hasta cerrar su asignación.» │ Asignado │</p>
<p>│ 2 │ Asignado │ Disponible │ «Un activo asignado no puede cambiar de estado hasta cerrar su asignación.» │ Asignado │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-6 Activo en baja no editable</strong></p>
<p><em># actualizar() · RN-A18</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el activo 4 (Epson PowerLite X49, placa NEX-000090, estado Baja, sin ubicación)</p>
<p><strong>Cuando</strong> intenta actualizar su &lt;campo&gt; a &lt;valor&gt;</p>
<p><strong>Entonces</strong> el sistema responde «Un activo en baja no se puede editar.»</p>
<p><strong>Y</strong> el activo 4 conserva sus datos anteriores</p>
<p><strong>Ejemplos:</strong></p>
<p>│ campo │ valor │</p>
<p>├───────────┼─────────────┤</p>
<p>│ Ubicacion │ Oficina 301 │</p>
<p>│ Estado │ Disponible │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-7 Activo inexistente o identificador modificado</strong></p>
<p><em># actualizar() · RN-A01, RN-A15</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el activo 1 y no existe el activo 99</p>
<p><strong>Cuando</strong> &lt;intento&gt;</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Ejemplos:</strong></p>
<p>│ intento │ mensaje │</p>
<p>├──────────────────────────────────────────────────┼──────────────────────────────────────────────────────┤</p>
<p>│ actualiza el activo con ID_Activo 99 │ «El activo no existe.» │</p>
<p>│ intenta cambiar el ID_Activo del activo 1 por 10 │ «El identificador del activo no se puede modificar.» │</p>
</blockquote></td>
</tr>
<tr class="odd">
<td><strong>Origen de la necesidad</strong></td>
<td>Pregunta 11 de la encuesta: «estado actual» es el dato más relevante para 5 de 19; Pregunta 3: el seguimiento es dificultad alta para 5 de 19. N-01.</td>
</tr>
<tr class="even">
<td><strong>RF derivados</strong></td>
<td>RF-04, RF-51, RF-53, RF-54, RF-55, RF-60</td>
</tr>
<tr class="odd">
<td><strong>Prioridad</strong></td>
<td>Media</td>
</tr>
</tbody>
</table>

*Nota: Las reglas RN-A16, RN-A18 y RN-A19 son propuestas del equipo, pendientes de validar con el cliente.*

**HU-04 Dar de baja activo**

<table>
<colgroup>
<col style="width: 16%" />
<col style="width: 83%" />
</colgroup>
<tbody>
<tr class="odd">
<td><strong>Código</strong></td>
<td><strong>HU-04</strong></td>
</tr>
<tr class="even">
<td><strong>Título corto</strong></td>
<td>Dar de baja activo</td>
</tr>
<tr class="odd">
<td><strong>Historia</strong></td>
<td><strong>Como</strong> Marta Rojas, Responsable de Activos, <strong>quiero</strong> dar de baja un activo sin eliminarlo del inventario, conociendo antes la consecuencia, <strong>para</strong> que un equipo fuera de servicio deje de ofrecerse para asignación sin perder su historial.</td>
</tr>
<tr class="even">
<td><strong>Criterios de aceptación</strong></td>
<td><p><strong>Antecedentes</strong> (comunes a todos los escenarios)</p>
<blockquote>
<p><strong>Dado</strong> que Marta Rojas, Responsable de Activos, inició sesión</p>
</blockquote>
<p><strong>Esquema del escenario: CA-1 Dar de baja un activo con confirmación</strong></p>
<p><em># darDeBaja() · RN-A10, RN-A12</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el activo &lt;id&gt; (placa &lt;placa&gt;) en estado &lt;estado&gt;</p>
<p><strong>Cuando</strong> solicita la baja del activo &lt;id&gt;</p>
<p><strong>Entonces</strong> el sistema muestra el aviso «El activo &lt;placa&gt; pasará a estado Baja y dejará de estar disponible para asignarse. El registro no se elimina. ¿Desea continuar?»</p>
<p><strong>Cuando</strong> confirma la baja</p>
<p><strong>Entonces</strong> el sistema responde «Activo dado de baja correctamente.»</p>
<p><strong>Y</strong> el activo queda con Estado Baja</p>
<p><strong>Y</strong> ID_Activo, Marca, Modelo, Numero_Serie, Placa_Inventario, Ubicacion e ID_Categoria conservan su valor</p>
<p><strong>Ejemplos:</strong></p>
<p>│ id │ placa │ estado │</p>
<p>├────┼────────────┼────────────┤</p>
<p>│ 1 │ NEX-000101 │ Disponible │</p>
<p>│ 3 │ NEX-000103 │ Dañado │</p>
</blockquote>
<p><strong>Escenario: CA-2 Desistir de la baja</strong></p>
<p><em># darDeBaja() · RN-A12</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el activo 1 (placa NEX-000101) en estado Disponible</p>
<p><strong>Cuando</strong> solicita la baja del activo 1</p>
<p><strong>Entonces</strong> el sistema muestra el aviso «El activo NEX-000101 pasará a estado Baja y dejará de estar disponible para asignarse. El registro no se elimina. ¿Desea continuar?»</p>
<p><strong>Cuando</strong> decide no continuar</p>
<p><strong>Entonces</strong> el sistema responde «Baja cancelada. El activo no fue modificado.»</p>
<p><strong>Y</strong> el activo 1 conserva su Estado Disponible</p>
</blockquote>
<p><strong>Escenario: CA-3 Activo que ya está en baja</strong></p>
<p><em># darDeBaja() · RN-A11</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el activo 4 (placa NEX-000090) en estado Baja</p>
<p><strong>Cuando</strong> solicita la baja del activo 4</p>
<p><strong>Entonces</strong> el sistema responde «El activo ya está dado de baja.»</p>
<p><strong>Y</strong> no muestra el aviso de confirmación y el activo 4 no cambia</p>
</blockquote>
<p><strong>Escenario: CA-4 Activo asignado no se puede dar de baja</strong></p>
<p><em># darDeBaja() · RN-A19</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el activo 2 (placa NEX-000102) en estado Asignado, con su asignación vigente</p>
<p><strong>Cuando</strong> solicita la baja del activo 2</p>
<p><strong>Entonces</strong> el sistema responde «El activo está asignado. Cierre su asignación antes de darlo de baja.»</p>
<p><strong>Y</strong> no muestra el aviso de confirmación y el activo 2 conserva su Estado Asignado</p>
</blockquote>
<p><strong>Escenario: CA-5 Activo inexistente</strong></p>
<p><em># darDeBaja() · RN-A15</em></p>
<blockquote>
<p><strong>Dado</strong> que no existe el activo 99</p>
<p><strong>Cuando</strong> solicita la baja del activo 99</p>
<p><strong>Entonces</strong> el sistema responde «El activo no existe.»</p>
</blockquote>
<p><strong>Escenario: CA-6 El activo dado de baja no se elimina</strong></p>
<p><em># buscarPorPlaca(), darDeBaja() · RN-A10</em></p>
<blockquote>
<p><strong>Dado</strong> que el activo 1 (placa NEX-000101) fue dado de baja</p>
<p><strong>Cuando</strong> consulta por Placa_Inventario NEX-000101</p>
<p><strong>Entonces</strong> ve el activo 1 con Estado Baja y sus demás datos intactos</p>
</blockquote></td>
</tr>
<tr class="odd">
<td><strong>Origen de la necesidad</strong></td>
<td>Pregunta 9 de la encuesta: «bajas» aparece en 7 de 19 respuestas (una marcó todas las opciones). N-11.</td>
</tr>
<tr class="even">
<td><strong>RF derivados</strong></td>
<td>RF-05, RF-57, RF-58, RF-59, RF-164</td>
</tr>
<tr class="odd">
<td><strong>Prioridad</strong></td>
<td>Media</td>
</tr>
</tbody>
</table>

*Nota: N-11: la baja con motivo quedó como punto menor; por eso Dar de baja no pide motivo en el piloto. RN-A19 es una propuesta del equipo, pendiente de validar con el cliente.*

**Custodio — Anexo 2**

**HU-05 Registrar custodio**

<table>
<colgroup>
<col style="width: 16%" />
<col style="width: 83%" />
</colgroup>
<tbody>
<tr class="odd">
<td><strong>Código</strong></td>
<td><strong>HU-05</strong></td>
</tr>
<tr class="even">
<td><strong>Título corto</strong></td>
<td>Registrar custodio</td>
</tr>
<tr class="odd">
<td><strong>Historia</strong></td>
<td><strong>Como</strong> Marta Rojas, Responsable de Activos, <strong>quiero</strong> registrar como custodio a un empleado que solicita equipos, con su tipo y número de documento y su dirección, <strong>para</strong> dejarlo identificado como la persona a quien se le podrán asignar equipos.</td>
</tr>
<tr class="even">
<td><strong>Criterios de aceptación</strong></td>
<td><p><strong>Antecedentes</strong> (comunes a todos los escenarios)</p>
<blockquote>
<p><strong>Dado</strong> que Marta Rojas, Responsable de Activos, inició sesión</p>
</blockquote>
<p><strong>Escenario: CA-1 Registrar un custodio con todos sus datos</strong></p>
<p><em># crear() · RN-C01, RN-C02, RN-C09</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el usuario 7 (Carlos Mejía, rol Empleado, activo) y no es custodio</p>
<p><strong>Cuando</strong> registra al custodio con los datos:</p>
<p>│ Campo │ Valor │</p>
<p>├────────────────┼────────────────────────────┤</p>
<p>│ ID_Usuario │ 7 │</p>
<p>│ tipo_documento │ CC │</p>
<p>│ N_documento │ 1036648201 │</p>
<p>│ Direccion │ Calle 45 # 80-12, Medellín │</p>
<p><strong>Entonces</strong> el sistema responde «Custodio registrado correctamente.»</p>
<p><strong>Y</strong> el custodio queda guardado con:</p>
<p>│ ID_Custodio │ ID_Usuario │ Fecha_Registro │ N_documento │ Direccion │ tipo_documento │ activo │</p>
<p>├──────────────┼────────────┼────────────────┼─────────────┼────────────────────────────┼────────────────┼────────┤</p>
<p>│ (automático) │ 7 │ (fecha actual) │ 1036648201 │ Calle 45 # 80-12, Medellín │ CC │ TRUE │</p>
<p><strong>Y</strong> ID_Custodio, Fecha_Registro y activo los asignó el sistema</p>
</blockquote>
<p><strong>Esquema del escenario: CA-2 Datos obligatorios vacíos</strong></p>
<p><em># crear() · RN-C02</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el usuario 7 (Carlos Mejía, rol Empleado, activo) y no es custodio</p>
<p><strong>Cuando</strong> registra un custodio con &lt;campo&gt; vacío y los demás datos válidos</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> no se crea el custodio</p>
<p><strong>Ejemplos:</strong></p>
<p>│ campo │ mensaje │</p>
<p>├────────────────┼──────────────────────────────────────────┤</p>
<p>│ ID_Usuario │ «El usuario es obligatorio.» │</p>
<p>│ tipo_documento │ «El tipo de documento es obligatorio.» │</p>
<p>│ N_documento │ «El número de documento es obligatorio.» │</p>
<p>│ Direccion │ «La dirección es obligatoria.» │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-3 Longitud máxima aceptada y superada</strong></p>
<p><em># crear() · RN-C03</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el usuario 7 (Carlos Mejía, rol Empleado, activo) y no es custodio</p>
<p><strong>Cuando</strong> registra un custodio con &lt;campo&gt; de &lt;valor&gt; y los demás datos válidos</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Ejemplos:</strong></p>
<p>│ campo │ valor │ longitud │ máximo │ mensaje │</p>
<p>├─────────────┼─────────────────────────┼──────────┼────────┼──────────────────────────────────────────────────────────┤</p>
<p>│ N_documento │ 12345678901234567890 │ 20 │ 20 │ «Custodio registrado correctamente.» │</p>
<p>│ Direccion │ texto de 200 caracteres │ 200 │ 200 │ «Custodio registrado correctamente.» │</p>
<p>│ N_documento │ 123456789012345678901 │ 21 │ 20 │ «El número de documento no puede superar 20 caracteres.» │</p>
<p>│ Direccion │ texto de 201 caracteres │ 201 │ 200 │ «La dirección no puede superar 200 caracteres.» │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-4 Tipo de documento válido o no válido</strong></p>
<p><em># crear() · RN-C04</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el usuario 7 (Carlos Mejía, rol Empleado, activo) y no es custodio</p>
<p><strong>Cuando</strong> registra un custodio con tipo_documento &lt;tipo&gt;, N_documento &lt;numero&gt; y los demás datos válidos</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Ejemplos:</strong></p>
<p>│ tipo │ numero │ mensaje │</p>
<p>├──────┼────────────┼──────────────────────────────────────┤</p>
<p>│ CC │ 1036648201 │ «Custodio registrado correctamente.» │</p>
<p>│ CE │ E1234567 │ «Custodio registrado correctamente.» │</p>
<p>│ PA │ AB987654 │ «Custodio registrado correctamente.» │</p>
<p>│ TI │ 1036648201 │ «El tipo de documento no es válido.» │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-5 Documento o usuario ya registrados</strong></p>
<p><em># existeDocumento(), existeCustodioDeUsuario() · RN-C05, RN-C06</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el custodio:</p>
<p>│ ID_Custodio │ ID_Usuario │ Fecha_Registro │ N_documento │ Direccion │ tipo_documento │ activo │</p>
<p>├─────────────┼────────────┼────────────────┼─────────────┼──────────────────────────────┼────────────────┼────────┤</p>
<p>│ 1 │ 3 │ 2026-09-14 │ 1017234567 │ Carrera 70 # 32-15, Medellín │ CC │ TRUE │</p>
<p><strong>Y</strong> que existe el usuario 7 (Carlos Mejía, rol Empleado, activo) y no es custodio</p>
<p><strong>Cuando</strong> registra un custodio con ID_Usuario &lt;usuario&gt;, tipo_documento &lt;tipo&gt; y N_documento &lt;numero&gt;</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Ejemplos:</strong></p>
<p>│ usuario │ tipo │ numero │ caso │ mensaje │</p>
<p>├─────────┼──────┼────────────┼───────────────────────────┼─────────────────────────────────────────────────────────────┤</p>
<p>│ 7 │ CC │ 1017234567 │ mismo tipo y número │ «Ya existe un custodio con ese tipo y número de documento.» │</p>
<p>│ 7 │ PA │ 1017234567 │ mismo número, otro tipo │ «Custodio registrado correctamente.» │</p>
<p>│ 3 │ CC │ 1036648201 │ el usuario ya es custodio │ «El usuario ya está registrado como custodio.» │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-6 Usuario inexistente, inactivo o sin rol Empleado</strong></p>
<p><em># crear() · RN-C07, RN-C08</em></p>
<blockquote>
<p><strong>Dado</strong> que existen los usuarios:</p>
<p>│ ID_Usuario │ Nombre │ Apellido │ activo │ rol │</p>
<p>├────────────┼────────┼──────────┼────────┼──────────┤</p>
<p>│ 8 │ Diego │ Salazar │ FALSE │ Empleado │</p>
<p>│ 5 │ Sofía │ Herrera │ TRUE │ Gerente │</p>
<p><strong>Cuando</strong> registra un custodio con ID_Usuario &lt;usuario&gt; y los demás datos válidos</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> no se crea el custodio</p>
<p><strong>Ejemplos:</strong></p>
<p>│ usuario │ caso │ mensaje │</p>
<p>├─────────┼─────────────┼────────────────────────────────────────┤</p>
<p>│ 99 │ no existe │ «El usuario no existe.» │</p>
<p>│ 8 │ inactivo │ «El usuario está inactivo.» │</p>
<p>│ 5 │ rol Gerente │ «El usuario no tiene el rol Empleado.» │</p>
</blockquote></td>
</tr>
<tr class="odd">
<td><strong>Origen de la necesidad</strong></td>
<td>Pregunta 9: «saber quién tiene cada equipo» en 9 de 19 (cuenta una respuesta que marcó todas las opciones); Pregunta 5: localizar equipos es dificultad alta para 5 de 19. N-02.</td>
</tr>
<tr class="even">
<td><strong>RF derivados</strong></td>
<td>RF-06, RF-07, RF-62, RF-63</td>
</tr>
<tr class="odd">
<td><strong>Prioridad</strong></td>
<td>Alta</td>
</tr>
</tbody>
</table>

*Nota: El CRF-002 califica de débil el respaldo de N-02 para la unicidad del documento (RN-C05). CE (Cédula de extranjería) es propuesta. Cifras contrastadas con 1.7.2.*

**HU-06 Consultar custodios**

<table>
<colgroup>
<col style="width: 16%" />
<col style="width: 83%" />
</colgroup>
<tbody>
<tr class="odd">
<td><strong>Código</strong></td>
<td><strong>HU-06</strong></td>
</tr>
<tr class="even">
<td><strong>Título corto</strong></td>
<td>Consultar custodios</td>
</tr>
<tr class="odd">
<td><strong>Historia</strong></td>
<td><strong>Como</strong> Marta Rojas, Responsable de Activos, <strong>quiero</strong> consultar un custodio por su identificador, su usuario o su documento, <strong>para</strong> identificar con certeza a un custodio por su identificador, su usuario o su documento.</td>
</tr>
<tr class="even">
<td><strong>Criterios de aceptación</strong></td>
<td><p><strong>Antecedentes</strong> (comunes a todos los escenarios)</p>
<blockquote>
<p><strong>Dado</strong> que Marta Rojas, Responsable de Activos, inició sesión</p>
</blockquote>
<p><strong>Escenario: CA-1 Consultar un custodio por su identificador</strong></p>
<p><em># buscarPorId() · RN-C15</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el custodio:</p>
<p>│ ID_Custodio │ ID_Usuario │ Fecha_Registro │ N_documento │ Direccion │ tipo_documento │ activo │</p>
<p>├─────────────┼────────────┼────────────────┼─────────────┼──────────────────────────────┼────────────────┼────────┤</p>
<p>│ 1 │ 3 │ 2026-09-14 │ 1017234567 │ Carrera 70 # 32-15, Medellín │ CC │ TRUE │</p>
<p><strong>Cuando</strong> consulta por ID_Custodio 1</p>
<p><strong>Entonces</strong> ve el custodio con sus 7 campos: ID_Custodio 1, ID_Usuario 3, Fecha_Registro 2026-09-14, N_documento 1017234567, Direccion Carrera 70 # 32-15, Medellín, tipo_documento CC y activo TRUE</p>
<p><strong>Y</strong> la consulta no modifica el custodio</p>
</blockquote>
<p><strong>Escenario: CA-2 Consultar un custodio por su usuario</strong></p>
<p><em># buscarPorUsuario() · RN-C06, RN-C15</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el custodio:</p>
<p>│ ID_Custodio │ ID_Usuario │ Fecha_Registro │ N_documento │ Direccion │ tipo_documento │ activo │</p>
<p>├─────────────┼────────────┼────────────────┼─────────────┼──────────────────────────────┼────────────────┼────────┤</p>
<p>│ 1 │ 3 │ 2026-09-14 │ 1017234567 │ Carrera 70 # 32-15, Medellín │ CC │ TRUE │</p>
<p><strong>Cuando</strong> consulta por ID_Usuario 3</p>
<p><strong>Entonces</strong> ve un solo custodio, con sus 7 campos: ID_Custodio 1, ID_Usuario 3, Fecha_Registro 2026-09-14, N_documento 1017234567, Direccion Carrera 70 # 32-15, Medellín, tipo_documento CC y activo TRUE</p>
</blockquote>
<p><strong>Escenario: CA-3 Consultar un custodio por su documento</strong></p>
<p><em># buscarPorDocumento() · RN-C05, RN-C15</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el custodio:</p>
<p>│ ID_Custodio │ ID_Usuario │ Fecha_Registro │ N_documento │ Direccion │ tipo_documento │ activo │</p>
<p>├─────────────┼────────────┼────────────────┼─────────────┼──────────────────────────────┼────────────────┼────────┤</p>
<p>│ 1 │ 3 │ 2026-09-14 │ 1017234567 │ Carrera 70 # 32-15, Medellín │ CC │ TRUE │</p>
<p><strong>Cuando</strong> consulta por tipo_documento CC y N_documento 1017234567</p>
<p><strong>Entonces</strong> ve un solo custodio, con sus 7 campos: ID_Custodio 1, ID_Usuario 3, Fecha_Registro 2026-09-14, N_documento 1017234567, Direccion Carrera 70 # 32-15, Medellín, tipo_documento CC y activo TRUE</p>
</blockquote>
<p><strong>Esquema del escenario: CA-4 Custodio no encontrado</strong></p>
<p><em># buscarPorId(), buscarPorUsuario(), buscarPorDocumento() · RN-C05, RN-C15</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el custodio:</p>
<p>│ ID_Custodio │ ID_Usuario │ Fecha_Registro │ N_documento │ Direccion │ tipo_documento │ activo │</p>
<p>├─────────────┼────────────┼────────────────┼─────────────┼──────────────────────────────┼────────────────┼────────┤</p>
<p>│ 1 │ 3 │ 2026-09-14 │ 1017234567 │ Carrera 70 # 32-15, Medellín │ CC │ TRUE │</p>
<p><strong>Cuando</strong> consulta por &lt;forma&gt; &lt;valor&gt;</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> no se muestra ningún custodio</p>
<p><strong>Ejemplos:</strong></p>
<p>│ forma │ valor │ mensaje │</p>
<p>├──────────────────────────────┼───────────────┼─────────────────────────────────────────────────────────┤</p>
<p>│ ID_Custodio │ 99 │ «No se encontró ningún custodio con ese identificador.» │</p>
<p>│ ID_Usuario │ 99 │ «No se encontró ningún custodio para ese usuario.» │</p>
<p>│ tipo_documento y N_documento │ PA 1017234567 │ «No se encontró ningún custodio con ese documento.» │</p>
</blockquote>
<p><strong>Escenario: CA-5 Consultar un custodio inactivo</strong></p>
<p><em># buscarPorId() · RN-C15</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el custodio inactivo:</p>
<p>│ ID_Custodio │ ID_Usuario │ Fecha_Registro │ N_documento │ Direccion │ tipo_documento │ activo │</p>
<p>├─────────────┼────────────┼────────────────┼─────────────┼────────────────────────────┼────────────────┼────────┤</p>
<p>│ 2 │ 4 │ 2026-09-21 │ AB123456 │ Calle 10 # 43-50, Medellín │ PA │ FALSE │</p>
<p><strong>Cuando</strong> consulta por ID_Custodio 2</p>
<p><strong>Entonces</strong> ve el custodio con sus 7 campos: ID_Custodio 2, ID_Usuario 4, Fecha_Registro 2026-09-21, N_documento AB123456, Direccion Calle 10 # 43-50, Medellín, tipo_documento PA y activo FALSE</p>
</blockquote></td>
</tr>
<tr class="odd">
<td><strong>Origen de la necesidad</strong></td>
<td>Pregunta 9: «saber quién tiene cada equipo» en 9 de 19 (cuenta una respuesta que marcó todas las opciones); Pregunta 5: localizar equipos es dificultad alta para 5 de 19. N-02.</td>
</tr>
<tr class="even">
<td><strong>RF derivados</strong></td>
<td>RF-08</td>
</tr>
<tr class="odd">
<td><strong>Prioridad</strong></td>
<td>Alta</td>
</tr>
</tbody>
</table>

*Nota: Las consultas por ID_Usuario y por documento atienden a N-02 («poder localizarlo»). Cifras contrastadas con 1.7.2.*

**HU-07 Actualizar custodio**

<table>
<colgroup>
<col style="width: 16%" />
<col style="width: 83%" />
</colgroup>
<tbody>
<tr class="odd">
<td><strong>Código</strong></td>
<td><strong>HU-07</strong></td>
</tr>
<tr class="even">
<td><strong>Título corto</strong></td>
<td>Actualizar custodio</td>
</tr>
<tr class="odd">
<td><strong>Historia</strong></td>
<td><strong>Como</strong> Marta Rojas, Responsable de Activos, <strong>quiero</strong> corregir los datos de un custodio sin duplicar su documento, <strong>para</strong> mantener correcto el registro de quién responde por cada equipo.</td>
</tr>
<tr class="even">
<td><strong>Criterios de aceptación</strong></td>
<td><p><strong>Antecedentes</strong> (comunes a todos los escenarios)</p>
<blockquote>
<p><strong>Dado</strong> que Marta Rojas, Responsable de Activos, inició sesión</p>
</blockquote>
<p><strong>Escenario: CA-1 Actualizar todos los datos editables de un custodio</strong></p>
<p><em># actualizar() · RN-C02, RN-C04, RN-C11</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el custodio 1 con los valores de la columna Antes</p>
<p><strong>Cuando</strong> actualiza el custodio 1 con los valores de la columna Después:</p>
<p>│ Campo │ Antes │ Después │</p>
<p>├────────────────┼──────────────────────────────┼────────────────────────────┤</p>
<p>│ tipo_documento │ CC │ PA │</p>
<p>│ N_documento │ 1017234567 │ AB123456 │</p>
<p>│ Direccion │ Carrera 70 # 32-15, Medellín │ Calle 10 # 43-50, Medellín │</p>
<p>│ ID_Custodio │ 1 │ 1 (sin cambio) │</p>
<p>│ ID_Usuario │ 3 │ 3 (sin cambio) │</p>
<p>│ Fecha_Registro │ 2026-09-14 │ 2026-09-14 (sin cambio) │</p>
<p>│ activo │ TRUE │ TRUE (sin cambio) │</p>
<p><strong>Entonces</strong> el sistema responde «Custodio actualizado correctamente.»</p>
<p><strong>Y</strong> el custodio 1 queda con los valores de la columna Después</p>
</blockquote>
<p><strong>Escenario: CA-2 Conservar su propio documento no es duplicado</strong></p>
<p><em># existeDocumento(), actualizar() · RN-C05, RN-C10</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el custodio:</p>
<p>│ ID_Custodio │ ID_Usuario │ Fecha_Registro │ N_documento │ Direccion │ tipo_documento │ activo │</p>
<p>├─────────────┼────────────┼────────────────┼─────────────┼──────────────────────────────┼────────────────┼────────┤</p>
<p>│ 1 │ 3 │ 2026-09-14 │ 1017234567 │ Carrera 70 # 32-15, Medellín │ CC │ TRUE │</p>
<p><strong>Cuando</strong> actualiza el custodio 1 cambiando solo la Direccion a Calle 10 # 43-50, Medellín y manteniendo tipo_documento CC y N_documento 1017234567</p>
<p><strong>Entonces</strong> el sistema responde «Custodio actualizado correctamente.»</p>
</blockquote>
<p><strong>Esquema del escenario: CA-3 Documento que ya tiene otro custodio</strong></p>
<p><em># existeDocumento() · RN-C05, RN-C10</em></p>
<blockquote>
<p><strong>Dado</strong> que existen los custodios:</p>
<p>│ ID_Custodio │ ID_Usuario │ Fecha_Registro │ N_documento │ Direccion │ tipo_documento │ activo │</p>
<p>├─────────────┼────────────┼────────────────┼─────────────┼──────────────────────────────┼────────────────┼────────┤</p>
<p>│ 1 │ 3 │ 2026-09-14 │ 1017234567 │ Carrera 70 # 32-15, Medellín │ CC │ TRUE │</p>
<p>│ 2 │ 4 │ 2026-09-21 │ AB123456 │ Calle 10 # 43-50, Medellín │ PA │ FALSE │</p>
<p><strong>Cuando</strong> actualiza el custodio 1 con tipo_documento &lt;tipo&gt; y N_documento &lt;numero&gt;</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Ejemplos:</strong></p>
<p>│ tipo │ numero │ caso │ mensaje │</p>
<p>├──────┼──────────┼─────────────────────────┼─────────────────────────────────────────────────────────────┤</p>
<p>│ PA │ AB123456 │ lo tiene el custodio 2 │ «Ya existe un custodio con ese tipo y número de documento.» │</p>
<p>│ CE │ AB123456 │ mismo número, otro tipo │ «Custodio actualizado correctamente.» │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-4 Datos inválidos</strong></p>
<p><em># actualizar() · RN-C02, RN-C03, RN-C04</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el custodio:</p>
<p>│ ID_Custodio │ ID_Usuario │ Fecha_Registro │ N_documento │ Direccion │ tipo_documento │ activo │</p>
<p>├─────────────┼────────────┼────────────────┼─────────────┼──────────────────────────────┼────────────────┼────────┤</p>
<p>│ 1 │ 3 │ 2026-09-14 │ 1017234567 │ Carrera 70 # 32-15, Medellín │ CC │ TRUE │</p>
<p><strong>Cuando</strong> actualiza el custodio 1 con &lt;campo&gt; &lt;valor&gt;</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> el custodio 1 conserva sus datos anteriores</p>
<p><strong>Ejemplos:</strong></p>
<p>│ campo │ valor │ mensaje │</p>
<p>├────────────────┼─────────────────────────┼──────────────────────────────────────────────────────────┤</p>
<p>│ tipo_documento │ (vacío) │ «El tipo de documento es obligatorio.» │</p>
<p>│ N_documento │ (vacío) │ «El número de documento es obligatorio.» │</p>
<p>│ Direccion │ (vacío) │ «La dirección es obligatoria.» │</p>
<p>│ N_documento │ 123456789012345678901 │ «El número de documento no puede superar 20 caracteres.» │</p>
<p>│ Direccion │ texto de 201 caracteres │ «La dirección no puede superar 200 caracteres.» │</p>
<p>│ tipo_documento │ TI │ «El tipo de documento no es válido.» │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-5 Datos que no se modifican</strong></p>
<p><em># actualizar() · RN-C11, RN-C12</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el custodio:</p>
<p>│ ID_Custodio │ ID_Usuario │ Fecha_Registro │ N_documento │ Direccion │ tipo_documento │ activo │</p>
<p>├─────────────┼────────────┼────────────────┼─────────────┼──────────────────────────────┼────────────────┼────────┤</p>
<p>│ 1 │ 3 │ 2026-09-14 │ 1017234567 │ Carrera 70 # 32-15, Medellín │ CC │ TRUE │</p>
<p><strong>Cuando</strong> intenta cambiar &lt;campo&gt; del custodio 1 a &lt;valor&gt;</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> el custodio 1 conserva sus datos anteriores</p>
<p><strong>Ejemplos:</strong></p>
<p>│ campo │ valor │ mensaje │</p>
<p>├────────────────┼────────────┼──────────────────────────────────────────────────┤</p>
<p>│ ID_Usuario │ 5 │ «El usuario del custodio no se puede modificar.» │</p>
<p>│ Fecha_Registro │ 2026-10-01 │ «La fecha de registro no se puede modificar.» │</p>
<p>│ activo │ FALSE │ «El custodio solo se inactiva con la baja.» │</p>
</blockquote>
<p><strong>Escenario: CA-6 Custodio inexistente</strong></p>
<p><em># actualizar() · RN-C15</em></p>
<blockquote>
<p><strong>Dado</strong> que no existe el custodio 99</p>
<p><strong>Cuando</strong> actualiza el custodio con ID_Custodio 99</p>
<p><strong>Entonces</strong> el sistema responde «El custodio no existe.»</p>
</blockquote></td>
</tr>
<tr class="odd">
<td><strong>Origen de la necesidad</strong></td>
<td>Pregunta 9: «saber quién tiene cada equipo» en 9 de 19 (cuenta una respuesta que marcó todas las opciones). N-02.</td>
</tr>
<tr class="even">
<td><strong>RF derivados</strong></td>
<td>RF-09, RF-61</td>
</tr>
<tr class="odd">
<td><strong>Prioridad</strong></td>
<td>Media</td>
</tr>
</tbody>
</table>

*Nota: La Pregunta 14 (cambio automático de responsable: 5 de 19 y 7 más en «todas») no se aplica aquí: el modelo no tiene transferencia de custodio (ver P-16).*

**HU-08 Inactivar custodio**

<table>
<colgroup>
<col style="width: 16%" />
<col style="width: 83%" />
</colgroup>
<tbody>
<tr class="odd">
<td><strong>Código</strong></td>
<td><strong>HU-08</strong></td>
</tr>
<tr class="even">
<td><strong>Título corto</strong></td>
<td>Inactivar custodio</td>
</tr>
<tr class="odd">
<td><strong>Historia</strong></td>
<td><strong>Como</strong> Marta Rojas, Responsable de Activos, <strong>quiero</strong> inactivar a un custodio sin eliminar su registro, conociendo antes la consecuencia, <strong>para</strong> que quien ya no responde por equipos deje de figurar como custodio activo sin perder su historial.</td>
</tr>
<tr class="even">
<td><strong>Criterios de aceptación</strong></td>
<td><p><strong>Antecedentes</strong> (comunes a todos los escenarios)</p>
<blockquote>
<p><strong>Dado</strong> que Marta Rojas, Responsable de Activos, inició sesión</p>
</blockquote>
<p><strong>Escenario: CA-1 Inactivar un custodio con confirmación</strong></p>
<p><em># inactivar() · RN-C12, RN-C16</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el custodio 1 (CC 1017234567, activo), sin asignaciones vigentes ni solicitudes pendientes</p>
<p><strong>Cuando</strong> solicita inactivar al custodio 1</p>
<p><strong>Entonces</strong> el sistema muestra el aviso «El custodio con documento CC 1017234567 pasará a estado inactivo. El registro no se elimina, no se puede reactivar y su usuario no podrá registrarse de nuevo como custodio. ¿Desea continuar?»</p>
<p><strong>Cuando</strong> confirma la baja</p>
<p><strong>Entonces</strong> el sistema responde «Custodio inactivado correctamente.»</p>
<p><strong>Y</strong> el custodio queda con activo FALSE</p>
<p><strong>Y</strong> ID_Custodio, ID_Usuario, Fecha_Registro, N_documento, Direccion y tipo_documento conservan su valor</p>
</blockquote>
<p><strong>Escenario: CA-2 Desistir de la inactivación</strong></p>
<p><em># inactivar() · RN-C16</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el custodio 1 (CC 1017234567, activo)</p>
<p><strong>Cuando</strong> solicita inactivar al custodio 1</p>
<p><strong>Entonces</strong> el sistema muestra el aviso «El custodio con documento CC 1017234567 pasará a estado inactivo. El registro no se elimina, no se puede reactivar y su usuario no podrá registrarse de nuevo como custodio. ¿Desea continuar?»</p>
<p><strong>Cuando</strong> decide no continuar</p>
<p><strong>Entonces</strong> el sistema responde «Inactivación cancelada. El custodio no fue modificado.»</p>
<p><strong>Y</strong> el custodio 1 conserva activo TRUE</p>
</blockquote>
<p><strong>Escenario: CA-3 Custodio que ya está inactivo</strong></p>
<p><em># inactivar() · RN-C13</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el custodio 2 (PA AB123456) con activo FALSE</p>
<p><strong>Cuando</strong> solicita inactivar al custodio 2</p>
<p><strong>Entonces</strong> el sistema responde «El custodio ya está inactivo.»</p>
<p><strong>Y</strong> no muestra el aviso de confirmación y el custodio 2 no cambia</p>
</blockquote>
<p><strong>Escenario: CA-4 Custodio inexistente</strong></p>
<p><em># inactivar() · RN-C15</em></p>
<blockquote>
<p><strong>Dado</strong> que no existe el custodio 99</p>
<p><strong>Cuando</strong> solicita inactivar al custodio 99</p>
<p><strong>Entonces</strong> el sistema responde «El custodio no existe.»</p>
</blockquote>
<p><strong>Esquema del escenario: CA-5 Custodio con asignaciones vigentes o solicitudes pendientes</strong></p>
<p><em># inactivar() · RN-C14</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el custodio 1 (activo) con &lt;situacion&gt;</p>
<p><strong>Cuando</strong> solicita inactivar al custodio 1</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> no muestra el aviso de confirmación y el custodio 1 conserva activo TRUE</p>
<p><strong>Ejemplos:</strong></p>
<p>│ situacion │ mensaje │</p>
<p>├───────────────────────────────────┼──────────────────────────────────────────────────────────────────────────────┤</p>
<p>│ una asignación en estado Vigente │ «El custodio tiene asignaciones vigentes. Ciérrelas antes de inactivarlo.» │</p>
<p>│ una solicitud en estado Pendiente │ «El custodio tiene solicitudes pendientes. Cancélelas antes de inactivarlo.» │</p>
<p><em>Opción A, pendiente de P-13. Con la opción B, M-56 y M-57 pasarían a avisos de confirmación y este escenario verificaría que la inactivación se completa tras confirmar.</em></p>
</blockquote>
<p><strong>Escenario: CA-6 El custodio inactivado no se elimina</strong></p>
<p><em># buscarPorId(), inactivar() · RN-C12</em></p>
<blockquote>
<p><strong>Dado</strong> que el custodio 1 (CC 1017234567) fue inactivado</p>
<p><strong>Cuando</strong> consulta por ID_Custodio 1</p>
<p><strong>Entonces</strong> ve el custodio con activo FALSE y sus demás datos intactos</p>
</blockquote></td>
</tr>
<tr class="odd">
<td><strong>Origen de la necesidad</strong></td>
<td>Pregunta 9: «saber quién tiene cada equipo» en 9 de 19 (cuenta una respuesta que marcó todas las opciones). N-02.</td>
</tr>
<tr class="even">
<td><strong>RF derivados</strong></td>
<td>RF-10, RF-64, RF-65, RF-66, RF-67</td>
</tr>
<tr class="odd">
<td><strong>Prioridad</strong></td>
<td>Media</td>
</tr>
</tbody>
</table>

*Nota: Como ID_Usuario es único y no existe reactivar, el usuario de un custodio inactivo no podría volver a registrarse como custodio: la frase «su usuario no podrá registrarse de nuevo como custodio» del aviso (M-55) depende de P-14. El bloqueo por asignaciones vigentes o solicitudes pendientes (CA-5, M-56 y M-57) es la opción A, pendiente de P-13; con la opción B el sistema avisaría y permitiría continuar tras confirmar: M-56 y M-57 pasarían de errores a avisos de confirmación y CA-5 verificaría que la inactivación se completa.*

**Solicitud — Anexo 3**

**HU-09 Registrar solicitud de equipo**

<table>
<colgroup>
<col style="width: 16%" />
<col style="width: 83%" />
</colgroup>
<tbody>
<tr class="odd">
<td><strong>Código</strong></td>
<td><strong>HU-09</strong></td>
</tr>
<tr class="even">
<td><strong>Título corto</strong></td>
<td>Registrar solicitud de equipo</td>
</tr>
<tr class="odd">
<td><strong>Historia</strong></td>
<td><strong>Como</strong> Carlos Mejía, Empleado, <strong>quiero</strong> solicitar un equipo indicando la categoría que necesito y el motivo, <strong>para</strong> pedirlo por un canal formal y dejar constancia de lo que solicito.</td>
</tr>
<tr class="even">
<td><strong>Criterios de aceptación</strong></td>
<td><p><strong>Antecedentes</strong> (comunes a todos los escenarios)</p>
<blockquote>
<p><strong>Dado</strong> que Carlos Mejía, Empleado, inició sesión</p>
</blockquote>
<p><strong>Escenario: CA-1 Registrar una solicitud con todos sus datos</strong></p>
<p><em># crear() · RN-S01, RN-S02, RN-S04, RN-S10</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la categoría 1 (Portátiles, activa)</p>
<p><strong>Y</strong> que Carlos Mejía tiene el custodio 3 (usuario 7, activo)</p>
<p><strong>Cuando</strong> registra la solicitud con los datos:</p>
<p>│ Campo │ Valor │</p>
<p>├──────────────┼────────────────────────────────┤</p>
<p>│ ID_Categoria │ 1 │</p>
<p>│ Motivo │ Portátil para trabajo en campo │</p>
<p>│ ID_Custodio │ 3 │</p>
<p><strong>Entonces</strong> el sistema responde «Solicitud registrada correctamente.»</p>
<p><strong>Y</strong> la solicitud queda guardada con:</p>
<p>│ ID_Solicitud │ ID_Categoria │ Motivo │ Fecha_Solicitud │ ID_Custodio │ Estado_Solicitud │</p>
<p>├──────────────┼──────────────┼────────────────────────────────┼─────────────────────────┼─────────────┼──────────────────┤</p>
<p>│ (automático) │ 1 │ Portátil para trabajo en campo │ (fecha y hora actuales) │ 3 │ Pendiente │</p>
<p><strong>Y</strong> ID_Solicitud, Fecha_Solicitud y Estado_Solicitud los asignó el sistema</p>
</blockquote>
<p><strong>Esquema del escenario: CA-2 Datos obligatorios vacíos</strong></p>
<p><em># crear() · RN-S02</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la categoría 1 (Portátiles, activa)</p>
<p><strong>Y</strong> que Carlos Mejía tiene el custodio 3 (usuario 7, activo)</p>
<p><strong>Cuando</strong> registra una solicitud con &lt;campo&gt; vacío y los demás datos válidos</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> no se crea la solicitud</p>
<p><strong>Ejemplos:</strong></p>
<p>│ campo │ mensaje │</p>
<p>├──────────────┼────────────────────────────────┤</p>
<p>│ ID_Categoria │ «La categoría es obligatoria.» │</p>
<p>│ Motivo │ «El motivo es obligatorio.» │</p>
<p>│ ID_Custodio │ «El custodio es obligatorio.» │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-3 Longitud máxima del motivo aceptada y superada</strong></p>
<p><em># crear() · RN-S03</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la categoría 1 (Portátiles, activa)</p>
<p><strong>Y</strong> que Carlos Mejía tiene el custodio 3 (usuario 7, activo)</p>
<p><strong>Cuando</strong> registra una solicitud con un Motivo de &lt;valor&gt; y los demás datos válidos</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Ejemplos:</strong></p>
<p>│ valor │ longitud │ máximo │ mensaje │</p>
<p>├─────────────────────────┼──────────┼────────┼──────────────────────────────────────────────┤</p>
<p>│ texto de 255 caracteres │ 255 │ 255 │ «Solicitud registrada correctamente.» │</p>
<p>│ texto de 256 caracteres │ 256 │ 255 │ «El motivo no puede superar 255 caracteres.» │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-4 Categoría inexistente o inactiva</strong></p>
<p><em># crear() · RN-S06, RN-S07</em></p>
<blockquote>
<p><strong>Dado</strong> que existen las categorías:</p>
<p>│ ID_Categoria │ Nombre_Categoria │ activo │</p>
<p>├──────────────┼──────────────────┼────────┤</p>
<p>│ 1 │ Portátiles │ TRUE │</p>
<p>│ 3 │ Proyectores │ FALSE │</p>
<p><strong>Y</strong> que Carlos Mejía tiene el custodio 3 (usuario 7, activo)</p>
<p><strong>Cuando</strong> registra una solicitud con ID_Categoria &lt;categoria&gt; y los demás datos válidos</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> no se crea la solicitud</p>
<p><strong>Ejemplos:</strong></p>
<p>│ categoria │ mensaje │</p>
<p>├───────────────────────────┼────────────────────────────────────────────┤</p>
<p>│ 99 (no existe) │ «La categoría seleccionada no existe.» │</p>
<p>│ 3 (Proyectores, inactiva) │ «La categoría seleccionada está inactiva.» │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-5 Custodio inexistente, inactivo, sin registrar o de otro empleado</strong></p>
<p><em># crear() · RN-S08, RN-S09, RN-S10</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la categoría 1 (Portátiles, activa), el custodio 2 (usuario 4) está inactivo y el custodio 1 pertenece a Valentina Ríos (usuario 3)</p>
<p><strong>Cuando</strong> registra una solicitud con &lt;caso&gt; y los demás datos válidos</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> no se crea la solicitud</p>
<p><strong>Ejemplos:</strong></p>
<p>│ caso │ mensaje │</p>
<p>├─────────────────────────────────────┼────────────────────────────────────────────────────────┤</p>
<p>│ ID_Custodio 99 (no existe) │ «El custodio no existe.» │</p>
<p>│ ID_Custodio 2 (inactivo) │ «El custodio está inactivo.» │</p>
<p>│ un Empleado sin custodio registrado │ «El empleado no está registrado como custodio.» │</p>
<p>│ ID_Custodio 1 (de otro empleado) │ «El custodio no corresponde al empleado que solicita.» │</p>
</blockquote></td>
</tr>
<tr class="odd">
<td><strong>Origen de la necesidad</strong></td>
<td>Pregunta 6: las solicitudes son la dificultad alta más frecuente (6 de 19). N-03.</td>
</tr>
<tr class="even">
<td><strong>RF derivados</strong></td>
<td>RF-11, RF-68, RF-69, RF-70, RF-71, RF-168</td>
</tr>
<tr class="odd">
<td><strong>Prioridad</strong></td>
<td>Alta</td>
</tr>
</tbody>
</table>

*Nota: Quien solicita es el Empleado (Alcance 1.2). La secuencia de registro del custodio previa a la primera solicitud sigue abierta (P-09); si el custodio se toma de la sesión o se digita: P-105. N-03 pide «orden y prioridad»; el modelo no tiene campo de prioridad (P-20). Cifras contrastadas con 1.7.2.*

**HU-10 Consultar solicitudes**

<table>
<colgroup>
<col style="width: 16%" />
<col style="width: 83%" />
</colgroup>
<tbody>
<tr class="odd">
<td><strong>Código</strong></td>
<td><strong>HU-10</strong></td>
</tr>
<tr class="even">
<td><strong>Título corto</strong></td>
<td>Consultar solicitudes</td>
</tr>
<tr class="odd">
<td><strong>Historia</strong></td>
<td><strong>Como</strong> Carlos Mejía, Empleado, <strong>quiero</strong> consultar el estado de mis solicitudes de equipos, <strong>para</strong> saber en qué punto está cada pedido.</td>
</tr>
<tr class="even">
<td><strong>Criterios de aceptación</strong></td>
<td><p><strong>Antecedentes</strong> (comunes a todos los escenarios)</p>
<blockquote>
<p><strong>Dado</strong> que Carlos Mejía, Empleado, inició sesión</p>
</blockquote>
<p><strong>Esquema del escenario: CA-1 Consultar una solicitud propia por su identificador</strong></p>
<p><em># buscarPorId() · RN-S16</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la solicitud &lt;id&gt; del custodio 3 de Carlos Mejía</p>
<p><strong>Cuando</strong> consulta la solicitud &lt;id&gt;</p>
<p><strong>Entonces</strong> ve la solicitud con sus 6 campos, según la fila de Ejemplos</p>
<p><strong>Y</strong> la consulta no modifica la solicitud</p>
<p><strong>Ejemplos:</strong></p>
<p>│ ID_Solicitud │ ID_Categoria │ Motivo │ Fecha_Solicitud │ ID_Custodio │ Estado_Solicitud │</p>
<p>├──────────────┼──────────────┼────────────────────────────────┼──────────────────┼─────────────┼──────────────────┤</p>
<p>│ 1 │ 1 │ Portátil para trabajo en campo │ 2026-09-28 09:15 │ 3 │ Pendiente │</p>
<p>│ 3 │ 1 │ Reemplazo de portátil dañado │ 2026-09-30 08:05 │ 3 │ Rechazada │</p>
</blockquote>
<p><strong>Escenario: CA-2 Ver las solicitudes de un custodio con su estado</strong></p>
<p><em># listarPorCustodio() · RN-S17</em></p>
<blockquote>
<p><strong>Dado</strong> que el custodio 3 de Carlos Mejía tiene las solicitudes:</p>
<p>│ ID_Solicitud │ ID_Categoria │ Motivo │ Fecha_Solicitud │ ID_Custodio │ Estado_Solicitud │</p>
<p>├──────────────┼──────────────┼─────────────────────────────────────┼──────────────────┼─────────────┼──────────────────┤</p>
<p>│ 1 │ 1 │ Portátil para trabajo en campo │ 2026-09-28 09:15 │ 3 │ Pendiente │</p>
<p>│ 2 │ 2 │ Segundo monitor para conciliaciones │ 2026-09-29 14:40 │ 3 │ Aprobada │</p>
<p>│ 3 │ 1 │ Reemplazo de portátil dañado │ 2026-09-30 08:05 │ 3 │ Rechazada │</p>
<p>│ 4 │ 4 │ Teclado y mouse ergonómicos │ 2026-10-01 10:20 │ 3 │ Cancelada │</p>
<p><strong>Cuando</strong> consulta sus solicitudes</p>
<p><strong>Entonces</strong> ve las 4 solicitudes con sus 6 campos y su estado, de la más reciente a la más antigua:</p>
<p>│ ID_Solicitud │ ID_Categoria │ Motivo │ Fecha_Solicitud │ ID_Custodio │ Estado_Solicitud │</p>
<p>├──────────────┼──────────────┼─────────────────────────────────────┼──────────────────┼─────────────┼──────────────────┤</p>
<p>│ 4 │ 4 │ Teclado y mouse ergonómicos │ 2026-10-01 10:20 │ 3 │ Cancelada │</p>
<p>│ 3 │ 1 │ Reemplazo de portátil dañado │ 2026-09-30 08:05 │ 3 │ Rechazada │</p>
<p>│ 2 │ 2 │ Segundo monitor para conciliaciones │ 2026-09-29 14:40 │ 3 │ Aprobada │</p>
<p>│ 1 │ 1 │ Portátil para trabajo en campo │ 2026-09-28 09:15 │ 3 │ Pendiente │</p>
</blockquote>
<p><strong>Escenario: CA-3 Ver las solicitudes pendientes (actor secundario: Aprobador)</strong></p>
<p><em># listarPendientes() · RN-S18, RN-S20</em></p>
<blockquote>
<p><strong>Dado</strong> que Laura Gómez, Aprobador, inició sesión</p>
<p><strong>Y</strong> que existen las solicitudes:</p>
<p>│ ID_Solicitud │ ID_Categoria │ Motivo │ Fecha_Solicitud │ ID_Custodio │ Estado_Solicitud │</p>
<p>├──────────────┼──────────────┼─────────────────────────────────────┼──────────────────┼─────────────┼──────────────────┤</p>
<p>│ 1 │ 1 │ Portátil para trabajo en campo │ 2026-09-28 09:15 │ 3 │ Pendiente │</p>
<p>│ 2 │ 2 │ Segundo monitor para conciliaciones │ 2026-09-29 14:40 │ 3 │ Aprobada │</p>
<p>│ 5 │ 1 │ Portátil para capacitación │ 2026-10-02 11:00 │ 1 │ Pendiente │</p>
<p><strong>Cuando</strong> consulta las solicitudes pendientes</p>
<p><strong>Entonces</strong> ve solo las solicitudes en estado Pendiente, con sus 6 campos, de la más antigua a la más reciente:</p>
<p>│ ID_Solicitud │ ID_Categoria │ Motivo │ Fecha_Solicitud │ ID_Custodio │ Estado_Solicitud │</p>
<p>├──────────────┼──────────────┼────────────────────────────────┼──────────────────┼─────────────┼──────────────────┤</p>
<p>│ 1 │ 1 │ Portátil para trabajo en campo │ 2026-09-28 09:15 │ 3 │ Pendiente │</p>
<p>│ 5 │ 1 │ Portátil para capacitación │ 2026-10-02 11:00 │ 1 │ Pendiente │</p>
<p><em>Actor secundario: el Aprobador consulta las pendientes (RN-S20, propuesta).</em></p>
</blockquote>
<p><strong>Esquema del escenario: CA-4 Solicitud no encontrada o sin resultados</strong></p>
<p><em># buscarPorId(), listarPorCustodio(), listarPendientes(), listarAprobadas() · RN-S16, RN-S17, RN-S18, RN-S21</em></p>
<blockquote>
<p><strong>Dado</strong> que no hay solicitudes que coincidan con &lt;forma&gt; &lt;valor&gt;</p>
<p><strong>Cuando</strong> consulta por &lt;forma&gt; &lt;valor&gt;</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Ejemplos:</strong></p>
<p>│ forma │ valor │ mensaje │</p>
<p>├──────────────────────────┼───────────┼───────────────────────────────────────────────────────────┤</p>
<p>│ identificador │ 99 │ «No se encontró ninguna solicitud con ese identificador.» │</p>
<p>│ custodio │ 2 │ «El custodio no tiene solicitudes.» │</p>
<p>│ pendientes │ (ninguna) │ «No hay solicitudes pendientes.» │</p>
<p>│ aprobadas sin asignación │ (ninguna) │ «No hay solicitudes aprobadas pendientes de asignación.» │</p>
</blockquote>
<p><strong>Escenario: CA-5 Solicitud de otro custodio</strong></p>
<p><em># buscarPorId() · RN-S19</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la solicitud:</p>
<p>│ ID_Solicitud │ ID_Categoria │ Motivo │ Fecha_Solicitud │ ID_Custodio │ Estado_Solicitud │</p>
<p>├──────────────┼──────────────┼────────────────────────────┼──────────────────┼─────────────┼──────────────────┤</p>
<p>│ 5 │ 1 │ Portátil para capacitación │ 2026-10-02 11:00 │ 1 │ Pendiente │</p>
<p><strong>Cuando</strong> Carlos Mejía (custodio 3) consulta la solicitud 5</p>
<p><strong>Entonces</strong> el sistema responde «No tiene acceso a esa solicitud.»</p>
<p><strong>Y</strong> no se muestra ningún dato de la solicitud 5</p>
</blockquote>
<p><strong>Escenario: CA-6 Ver las solicitudes aprobadas pendientes de asignación (actor secundario: Responsable de Activos)</strong></p>
<p><em># listarAprobadas() · RN-S21</em></p>
<blockquote>
<p><strong>Dado</strong> que quien consulta es Marta Rojas, Responsable de Activos, en lugar del Empleado</p>
<p><strong>Y</strong> que la solicitud 2 ya tiene la asignación 1 y existen las solicitudes:</p>
<p>│ ID_Solicitud │ ID_Categoria │ Motivo │ Fecha_Solicitud │ ID_Custodio │ Estado_Solicitud │</p>
<p>├──────────────┼──────────────┼─────────────────────────────────────┼──────────────────┼─────────────┼──────────────────┤</p>
<p>│ 1 │ 1 │ Portátil para trabajo en campo │ 2026-09-28 09:15 │ 3 │ Pendiente │</p>
<p>│ 2 │ 2 │ Segundo monitor para conciliaciones │ 2026-09-29 14:40 │ 3 │ Aprobada │</p>
<p>│ 6 │ 1 │ Portátil para teletrabajo │ 2026-09-29 17:05 │ 3 │ Aprobada │</p>
<p>│ 7 │ 2 │ Monitor para diseño gráfico │ 2026-10-02 15:30 │ 1 │ Aprobada │</p>
<p><strong>Cuando</strong> consulta las solicitudes aprobadas pendientes de asignación</p>
<p><strong>Entonces</strong> ve solo las solicitudes 6 y 7, con sus 6 campos, de la más antigua a la más reciente:</p>
<p>│ ID_Solicitud │ ID_Categoria │ Motivo │ Fecha_Solicitud │ ID_Custodio │ Estado_Solicitud │</p>
<p>├──────────────┼──────────────┼─────────────────────────────┼──────────────────┼─────────────┼──────────────────┤</p>
<p>│ 6 │ 1 │ Portátil para teletrabajo │ 2026-09-29 17:05 │ 3 │ Aprobada │</p>
<p>│ 7 │ 2 │ Monitor para diseño gráfico │ 2026-10-02 15:30 │ 1 │ Aprobada │</p>
<p><strong>Y</strong> no ve la solicitud 2 (ya tiene asignación) ni la 1 (Pendiente)</p>
<p><em>Actor secundario: el Responsable de Activos consulta las aprobadas sin asignación (RN-S21, propuesta; CRF-003, cambio 6).</em></p>
</blockquote></td>
</tr>
<tr class="odd">
<td><strong>Origen de la necesidad</strong></td>
<td>Pregunta 6: las solicitudes son la dificultad alta más frecuente (6 de 19). N-03.</td>
</tr>
<tr class="even">
<td><strong>RF derivados</strong></td>
<td>RF-12, RF-72, RF-73, RF-74, RF-75</td>
</tr>
<tr class="odd">
<td><strong>Prioridad</strong></td>
<td>Alta</td>
</tr>
</tbody>
</table>

*Nota: Actor principal: el Empleado (Alcance 1.2: consulta «el estado de sus solicitudes»). El Aprobador consulta las pendientes como actor secundario (RN-S20, propuesta). Orden de los listados: propuesta (P-20).*

**HU-11 Actualizar solicitud**

<table>
<colgroup>
<col style="width: 16%" />
<col style="width: 83%" />
</colgroup>
<tbody>
<tr class="odd">
<td><strong>Código</strong></td>
<td><strong>HU-11</strong></td>
</tr>
<tr class="even">
<td><strong>Título corto</strong></td>
<td>Actualizar solicitud</td>
</tr>
<tr class="odd">
<td><strong>Historia</strong></td>
<td><strong>Como</strong> Carlos Mejía, Empleado, <strong>quiero</strong> corregir la categoría o el motivo de una solicitud que aún no se ha decidido, <strong>para</strong> que el Aprobador decida con la información correcta.</td>
</tr>
<tr class="even">
<td><strong>Criterios de aceptación</strong></td>
<td><p><strong>Antecedentes</strong> (comunes a todos los escenarios)</p>
<blockquote>
<p><strong>Dado</strong> que Carlos Mejía, Empleado, inició sesión</p>
</blockquote>
<p><strong>Escenario: CA-1 Actualizar la categoría y el motivo de una solicitud pendiente</strong></p>
<p><em># actualizar() · RN-S02, RN-S11, RN-S12</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la solicitud 1 de Carlos Mejía con los valores de la columna Antes y la categoría 4 (Periféricos, activa)</p>
<p><strong>Cuando</strong> actualiza la solicitud 1 con los valores de la columna Después:</p>
<p>│ Campo │ Antes │ Después │</p>
<p>├──────────────────┼────────────────────────────────┼─────────────────────────────────────────┤</p>
<p>│ ID_Categoria │ 1 │ 4 │</p>
<p>│ Motivo │ Portátil para trabajo en campo │ Monitor y teclado para trabajo en campo │</p>
<p>│ ID_Solicitud │ 1 │ 1 (sin cambio) │</p>
<p>│ Fecha_Solicitud │ 2026-09-28 09:15 │ 2026-09-28 09:15 (sin cambio) │</p>
<p>│ ID_Custodio │ 3 │ 3 (sin cambio) │</p>
<p>│ Estado_Solicitud │ Pendiente │ Pendiente (sin cambio) │</p>
<p><strong>Entonces</strong> el sistema responde «Solicitud actualizada correctamente.»</p>
<p><strong>Y</strong> la solicitud 1 queda con los valores de la columna Después</p>
</blockquote>
<p><strong>Esquema del escenario: CA-2 Datos inválidos</strong></p>
<p><em># actualizar() · RN-S02, RN-S03, RN-S06, RN-S07</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la solicitud 1 de Carlos Mejía en estado Pendiente y las categorías 1 (activa) y 3 (Proyectores, inactiva)</p>
<p><strong>Cuando</strong> actualiza la solicitud 1 con &lt;campo&gt; &lt;valor&gt;</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> la solicitud 1 conserva sus datos anteriores</p>
<p><strong>Ejemplos:</strong></p>
<p>│ campo │ valor │ mensaje │</p>
<p>├──────────────┼───────────────────────────┼──────────────────────────────────────────────┤</p>
<p>│ ID_Categoria │ (vacío) │ «La categoría es obligatoria.» │</p>
<p>│ Motivo │ (vacío) │ «El motivo es obligatorio.» │</p>
<p>│ Motivo │ texto de 256 caracteres │ «El motivo no puede superar 255 caracteres.» │</p>
<p>│ ID_Categoria │ 99 (no existe) │ «La categoría seleccionada no existe.» │</p>
<p>│ ID_Categoria │ 3 (Proyectores, inactiva) │ «La categoría seleccionada está inactiva.» │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-3 Solicitud que ya no está pendiente</strong></p>
<p><em># actualizar() · RN-S05, RN-S11</em></p>
<blockquote>
<p><strong>Dado</strong> que existen las solicitudes de Carlos Mejía:</p>
<p>│ ID_Solicitud │ ID_Categoria │ Motivo │ Fecha_Solicitud │ ID_Custodio │ Estado_Solicitud │</p>
<p>├──────────────┼──────────────┼─────────────────────────────────────┼──────────────────┼─────────────┼──────────────────┤</p>
<p>│ 2 │ 2 │ Segundo monitor para conciliaciones │ 2026-09-29 14:40 │ 3 │ Aprobada │</p>
<p>│ 3 │ 1 │ Reemplazo de portátil dañado │ 2026-09-30 08:05 │ 3 │ Rechazada │</p>
<p>│ 4 │ 4 │ Teclado y mouse ergonómicos │ 2026-10-01 10:20 │ 3 │ Cancelada │</p>
<p><strong>Cuando</strong> actualiza la solicitud &lt;id&gt; (estado &lt;estado&gt;)</p>
<p><strong>Entonces</strong> el sistema responde «Solo se puede actualizar una solicitud pendiente.»</p>
<p><strong>Y</strong> la solicitud &lt;id&gt; conserva sus datos anteriores</p>
<p><strong>Ejemplos:</strong></p>
<p>│ id │ estado │</p>
<p>├────┼───────────┤</p>
<p>│ 2 │ Aprobada │</p>
<p>│ 3 │ Rechazada │</p>
<p>│ 4 │ Cancelada │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-4 Datos que no se modifican</strong></p>
<p><em># actualizar() · RN-S01, RN-S12</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la solicitud 1 de Carlos Mejía en estado Pendiente</p>
<p><strong>Cuando</strong> intenta cambiar &lt;campo&gt; de la solicitud 1 a &lt;valor&gt;</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> la solicitud 1 conserva sus datos anteriores</p>
<p><strong>Ejemplos:</strong></p>
<p>│ campo │ valor │ mensaje │</p>
<p>├──────────────────┼──────────────────┼──────────────────────────────────────────────────────────────────────┤</p>
<p>│ ID_Solicitud │ 10 │ «El identificador de la solicitud no se puede modificar.» │</p>
<p>│ ID_Custodio │ 1 │ «El custodio de la solicitud no se puede modificar.» │</p>
<p>│ Fecha_Solicitud │ 2026-10-05 08:00 │ «La fecha de la solicitud no se puede modificar.» │</p>
<p>│ Estado_Solicitud │ Aprobada │ «El estado de la solicitud cambia con la decisión o la cancelación.» │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-5 Solicitud inexistente o de otro custodio</strong></p>
<p><em># actualizar() · RN-S19</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la solicitud 5 del custodio 1 y no existe la solicitud 99</p>
<p><strong>Cuando</strong> Carlos Mejía (custodio 3) actualiza la solicitud &lt;id&gt;</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Ejemplos:</strong></p>
<p>│ id │ mensaje │</p>
<p>├────┼────────────────────────────────────┤</p>
<p>│ 99 │ «La solicitud no existe.» │</p>
<p>│ 5 │ «No tiene acceso a esa solicitud.» │</p>
</blockquote></td>
</tr>
<tr class="odd">
<td><strong>Origen de la necesidad</strong></td>
<td>Pregunta 6: las solicitudes son la dificultad alta más frecuente (6 de 19). N-03.</td>
</tr>
<tr class="even">
<td><strong>RF derivados</strong></td>
<td>RF-13, RF-14, RF-76, RF-77</td>
</tr>
<tr class="odd">
<td><strong>Prioridad</strong></td>
<td>Media</td>
</tr>
</tbody>
</table>

**HU-12 Cancelar solicitud**

<table>
<colgroup>
<col style="width: 16%" />
<col style="width: 83%" />
</colgroup>
<tbody>
<tr class="odd">
<td><strong>Código</strong></td>
<td><strong>HU-12</strong></td>
</tr>
<tr class="even">
<td><strong>Título corto</strong></td>
<td>Cancelar solicitud</td>
</tr>
<tr class="odd">
<td><strong>Historia</strong></td>
<td><strong>Como</strong> Carlos Mejía, Empleado, <strong>quiero</strong> cancelar una solicitud que ya no necesito sin eliminarla, <strong>para</strong> que no quede pendiente de decisión.</td>
</tr>
<tr class="even">
<td><strong>Criterios de aceptación</strong></td>
<td><p><strong>Antecedentes</strong> (comunes a todos los escenarios)</p>
<blockquote>
<p><strong>Dado</strong> que Carlos Mejía, Empleado, inició sesión</p>
</blockquote>
<p><strong>Escenario: CA-1 Cancelar una solicitud pendiente con confirmación</strong></p>
<p><em># cancelar() · RN-S13, RN-S15</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la solicitud 1 de Carlos Mejía en estado Pendiente</p>
<p><strong>Cuando</strong> solicita cancelar la solicitud 1</p>
<p><strong>Entonces</strong> el sistema muestra el aviso «La solicitud 1 pasará a estado Cancelada. El registro no se elimina y no se puede reactivar. ¿Desea continuar?»</p>
<p><strong>Cuando</strong> confirma la cancelación</p>
<p><strong>Entonces</strong> el sistema responde «Solicitud cancelada correctamente.»</p>
<p><strong>Y</strong> la solicitud queda con Estado_Solicitud Cancelada</p>
<p><strong>Y</strong> ID_Solicitud, ID_Categoria, Motivo, Fecha_Solicitud e ID_Custodio conservan su valor</p>
</blockquote>
<p><strong>Escenario: CA-2 Desistir de la cancelación</strong></p>
<p><em># cancelar() · RN-S15</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la solicitud 1 de Carlos Mejía en estado Pendiente</p>
<p><strong>Cuando</strong> solicita cancelar la solicitud 1</p>
<p><strong>Entonces</strong> el sistema muestra el aviso «La solicitud 1 pasará a estado Cancelada. El registro no se elimina y no se puede reactivar. ¿Desea continuar?»</p>
<p><strong>Cuando</strong> decide no continuar</p>
<p><strong>Entonces</strong> el sistema responde «Operación cancelada. La solicitud no fue modificada.»</p>
<p><strong>Y</strong> la solicitud 1 conserva su Estado_Solicitud Pendiente</p>
</blockquote>
<p><strong>Esquema del escenario: CA-3 Solicitud que no se puede cancelar</strong></p>
<p><em># cancelar() · RN-S05, RN-S14</em></p>
<blockquote>
<p><strong>Dado</strong> que existen las solicitudes de Carlos Mejía:</p>
<p>│ ID_Solicitud │ ID_Categoria │ Motivo │ Fecha_Solicitud │ ID_Custodio │ Estado_Solicitud │</p>
<p>├──────────────┼──────────────┼─────────────────────────────────────┼──────────────────┼─────────────┼──────────────────┤</p>
<p>│ 2 │ 2 │ Segundo monitor para conciliaciones │ 2026-09-29 14:40 │ 3 │ Aprobada │</p>
<p>│ 3 │ 1 │ Reemplazo de portátil dañado │ 2026-09-30 08:05 │ 3 │ Rechazada │</p>
<p>│ 4 │ 4 │ Teclado y mouse ergonómicos │ 2026-10-01 10:20 │ 3 │ Cancelada │</p>
<p><strong>Cuando</strong> solicita cancelar la solicitud &lt;id&gt; (estado &lt;estado&gt;)</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> no muestra el aviso de confirmación y la solicitud &lt;id&gt; no cambia</p>
<p><strong>Ejemplos:</strong></p>
<p>│ id │ estado │ mensaje │</p>
<p>├────┼───────────┼───────────────────────────────────────────────────┤</p>
<p>│ 4 │ Cancelada │ «La solicitud ya está cancelada.» │</p>
<p>│ 2 │ Aprobada │ «Solo se puede cancelar una solicitud pendiente.» │</p>
<p>│ 3 │ Rechazada │ «Solo se puede cancelar una solicitud pendiente.» │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-4 Solicitud inexistente o de otro custodio</strong></p>
<p><em># cancelar() · RN-S19</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la solicitud 5 del custodio 1 y no existe la solicitud 99</p>
<p><strong>Cuando</strong> Carlos Mejía (custodio 3) solicita cancelar la solicitud &lt;id&gt;</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Ejemplos:</strong></p>
<p>│ id │ mensaje │</p>
<p>├────┼────────────────────────────────────┤</p>
<p>│ 99 │ «La solicitud no existe.» │</p>
<p>│ 5 │ «No tiene acceso a esa solicitud.» │</p>
</blockquote>
<p><strong>Escenario: CA-5 La solicitud cancelada no se elimina</strong></p>
<p><em># buscarPorId(), cancelar() · RN-S13</em></p>
<blockquote>
<p><strong>Dado</strong> que la solicitud 1 de Carlos Mejía fue cancelada</p>
<p><strong>Cuando</strong> consulta la solicitud 1</p>
<p><strong>Entonces</strong> ve la solicitud con Estado_Solicitud Cancelada y sus demás datos intactos</p>
</blockquote></td>
</tr>
<tr class="odd">
<td><strong>Origen de la necesidad</strong></td>
<td>Pregunta 6: las solicitudes son la dificultad alta más frecuente (6 de 19). N-03.</td>
</tr>
<tr class="even">
<td><strong>RF derivados</strong></td>
<td>RF-15, RF-78, RF-79, RF-80</td>
</tr>
<tr class="odd">
<td><strong>Prioridad</strong></td>
<td>Media</td>
</tr>
</tbody>
</table>

*Nota: Cancelar no tiene reactivación en el modelo. La observación de Estado_Solicitud en el diccionario dice «al desactivar la solicitud»; el método es cancelar().*

**Aprobacion — Anexo 3**

**HU-13 Registrar decisión sobre una solicitud**

<table>
<colgroup>
<col style="width: 16%" />
<col style="width: 83%" />
</colgroup>
<tbody>
<tr class="odd">
<td><strong>Código</strong></td>
<td><strong>HU-13</strong></td>
</tr>
<tr class="even">
<td><strong>Título corto</strong></td>
<td>Registrar decisión sobre una solicitud</td>
</tr>
<tr class="odd">
<td><strong>Historia</strong></td>
<td><strong>Como</strong> Laura Gómez, Aprobador, <strong>quiero</strong> aprobar o rechazar una solicitud pendiente dejando constancia de mi decisión y, si la rechazo, del motivo, <strong>para</strong> que cada solicitud tenga una decisión atribuible a una persona identificada.</td>
</tr>
<tr class="even">
<td><strong>Criterios de aceptación</strong></td>
<td><p><strong>Antecedentes</strong> (comunes a todos los escenarios)</p>
<blockquote>
<p><strong>Dado</strong> que Laura Gómez, Aprobador, inició sesión</p>
</blockquote>
<p><strong>Escenario: CA-1 Aprobar una solicitud pendiente</strong></p>
<p><em># decidir() · RN-AP01, RN-AP02, RN-AP05, RN-AP07</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la solicitud 1 en estado Pendiente (custodio 3, categoría 1)</p>
<p><strong>Cuando</strong> registra la decisión con los datos:</p>
<p>│ Campo │ Valor │</p>
<p>├──────────────┼──────────┤</p>
<p>│ ID_Solicitud │ 1 │</p>
<p>│ ID_Aprobador │ 9 │</p>
<p>│ Decision │ Aprobada │</p>
<p><strong>Entonces</strong> el sistema responde «Decisión registrada correctamente.»</p>
<p><strong>Y</strong> la decisión queda guardada con:</p>
<p>│ ID_Aprobacion │ ID_Solicitud │ ID_Aprobador │ Decision │ Motivo_Rechazo │ Fecha_Decision │</p>
<p>├───────────────┼──────────────┼──────────────┼──────────┼────────────────┼─────────────────────────┤</p>
<p>│ (automático) │ 1 │ 9 │ Aprobada │ (vacío) │ (fecha y hora actuales) │</p>
<p><strong>Y</strong> la solicitud 1 pasa a estado Aprobada</p>
</blockquote>
<p><strong>Escenario: CA-2 Rechazar una solicitud pendiente con motivo</strong></p>
<p><em># decidir() · RN-AP01, RN-AP02, RN-AP05, RN-AP07</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la solicitud 1 en estado Pendiente (custodio 3, categoría 1)</p>
<p><strong>Cuando</strong> registra la decisión con los datos:</p>
<p>│ Campo │ Valor │</p>
<p>├────────────────┼────────────────────────────────────┤</p>
<p>│ ID_Solicitud │ 1 │</p>
<p>│ ID_Aprobador │ 9 │</p>
<p>│ Decision │ Rechazada │</p>
<p>│ Motivo_Rechazo │ Sin disponibilidad en la categoría │</p>
<p><strong>Entonces</strong> el sistema responde «Decisión registrada correctamente.»</p>
<p><strong>Y</strong> la decisión queda guardada con:</p>
<p>│ ID_Aprobacion │ ID_Solicitud │ ID_Aprobador │ Decision │ Motivo_Rechazo │ Fecha_Decision │</p>
<p>├───────────────┼──────────────┼──────────────┼───────────┼────────────────────────────────────┼─────────────────────────┤</p>
<p>│ (automático) │ 1 │ 9 │ Rechazada │ Sin disponibilidad en la categoría │ (fecha y hora actuales) │</p>
<p><strong>Y</strong> la solicitud 1 pasa a estado Rechazada</p>
</blockquote>
<p><strong>Esquema del escenario: CA-3 Decisión y motivo del rechazo</strong></p>
<p><em># decidir() · RN-AP02, RN-AP03</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la solicitud 1 en estado Pendiente (custodio 3, categoría 1)</p>
<p><strong>Cuando</strong> registra la decisión &lt;decision&gt; con Motivo_Rechazo &lt;motivo&gt;</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Ejemplos:</strong></p>
<p>│ decision │ motivo │ mensaje │</p>
<p>├───────────┼────────────────────────────────────┼─────────────────────────────────────────┤</p>
<p>│ Aprobada │ (vacío) │ «Decisión registrada correctamente.» │</p>
<p>│ Rechazada │ Sin disponibilidad en la categoría │ «Decisión registrada correctamente.» │</p>
<p>│ Rechazada │ (vacío) │ «El motivo del rechazo es obligatorio.» │</p>
<p>│ (vacía) │ (vacío) │ «La decisión es obligatoria.» │</p>
<p>│ Pendiente │ (vacío) │ «La decisión no es válida.» │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-4 Longitud máxima del motivo del rechazo aceptada y superada</strong></p>
<p><em># decidir() · RN-AP04</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la solicitud 1 en estado Pendiente (custodio 3, categoría 1)</p>
<p><strong>Cuando</strong> registra la decisión Rechazada con un Motivo_Rechazo de &lt;valor&gt;</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Ejemplos:</strong></p>
<p>│ valor │ longitud │ máximo │ mensaje │</p>
<p>├─────────────────────────┼──────────┼────────┼──────────────────────────────────────────────────────────┤</p>
<p>│ texto de 300 caracteres │ 300 │ 300 │ «Decisión registrada correctamente.» │</p>
<p>│ texto de 301 caracteres │ 301 │ 300 │ «El motivo del rechazo no puede superar 300 caracteres.» │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-5 Solicitud que ya tiene decisión</strong></p>
<p><em># existeDecisionDeSolicitud(), decidir() · RN-AP06</em></p>
<blockquote>
<p><strong>Dado</strong> que existen las decisiones:</p>
<p>│ ID_Aprobacion │ ID_Solicitud │ ID_Aprobador │ Decision │ Motivo_Rechazo │ Fecha_Decision │</p>
<p>├───────────────┼──────────────┼──────────────┼───────────┼────────────────────────────────────┼──────────────────┤</p>
<p>│ 1 │ 2 │ 9 │ Aprobada │ (vacío) │ 2026-09-30 09:00 │</p>
<p>│ 2 │ 3 │ 9 │ Rechazada │ Sin disponibilidad en la categoría │ 2026-10-01 16:30 │</p>
<p><strong>Cuando</strong> registra una nueva decisión sobre la solicitud &lt;id&gt;</p>
<p><strong>Entonces</strong> el sistema responde «La solicitud ya tiene una decisión.»</p>
<p><strong>Y</strong> la decisión existente no cambia</p>
<p><strong>Ejemplos:</strong></p>
<p>│ id │ decisión existente │</p>
<p>├────┼────────────────────┤</p>
<p>│ 2 │ Aprobada │</p>
<p>│ 3 │ Rechazada │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-6 Solicitud inexistente o no pendiente</strong></p>
<p><em># decidir() · RN-AP08, RN-AP09</em></p>
<blockquote>
<p><strong>Dado</strong> que la solicitud 4 está Cancelada y no existe la solicitud 99</p>
<p><strong>Cuando</strong> registra la decisión Aprobada sobre la solicitud &lt;id&gt;</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> no se registra ninguna decisión</p>
<p><strong>Ejemplos:</strong></p>
<p>│ id │ caso │ mensaje │</p>
<p>├────┼───────────┼────────────────────────────────────────────────────────┤</p>
<p>│ 99 │ no existe │ «La solicitud no existe.» │</p>
<p>│ 4 │ Cancelada │ «Solo se puede decidir sobre una solicitud pendiente.» │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-7 Aprobador inexistente, inactivo, sin rol Aprobador o distinto del usuario en sesión</strong></p>
<p><em># decidir() · RN-AP10, RN-AP11, RN-AP12</em></p>
<blockquote>
<p><strong>Dado</strong> que Laura Gómez (usuario 9) tiene la sesión iniciada y existen los usuarios:</p>
<p>│ ID_Usuario │ Nombre │ Apellido │ activo │ rol │</p>
<p>├────────────┼────────┼──────────┼────────┼───────────┤</p>
<p>│ 12 │ Rosa │ Quintero │ FALSE │ Aprobador │</p>
<p>│ 7 │ Carlos │ Mejía │ TRUE │ Empleado │</p>
<p>│ 13 │ Julio │ Peña │ TRUE │ Aprobador │</p>
<p><strong>Y</strong> que existe la solicitud 1 en estado Pendiente</p>
<p><strong>Cuando</strong> registra la decisión Aprobada sobre la solicitud 1 con ID_Aprobador &lt;aprobador&gt;</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> no se registra ninguna decisión</p>
<p><strong>Ejemplos:</strong></p>
<p>│ aprobador │ caso │ mensaje │</p>
<p>├───────────┼───────────────────────────────────────────────────────────┼─────────────────────────────────────────────────────────┤</p>
<p>│ 99 │ no existe │ «El usuario no existe.» │</p>
<p>│ 12 │ inactivo │ «El usuario está inactivo.» │</p>
<p>│ 7 │ rol Empleado │ «El usuario no tiene el rol Aprobador.» │</p>
<p>│ 13 │ otro Aprobador activo, distinto del usuario en sesión (9) │ «El aprobador debe ser el usuario con sesión iniciada.» │</p>
</blockquote></td>
</tr>
<tr class="odd">
<td><strong>Origen de la necesidad</strong></td>
<td>Pregunta 9: autorizaciones en 6 de 19 (cuenta una respuesta que marcó todas las opciones); Pregunta 11: responsable de aprobación es el dato más relevante para 3 de 19. N-04.</td>
</tr>
<tr class="even">
<td><strong>RF derivados</strong></td>
<td>RF-16, RF-81, RF-82, RF-83, RF-84, RF-86, RF-169</td>
</tr>
<tr class="odd">
<td><strong>Prioridad</strong></td>
<td>Alta</td>
</tr>
</tbody>
</table>

*Nota: HU de proceso: sin ella no hay asignación, por eso la prioridad es Alta. La decisión es irrevocable (RN-AP06); cómo corregir una decisión equivocada: P-25; si el aprobador se toma de la sesión o se digita: P-105.*

**HU-14 Consultar decisión de una solicitud**

<table>
<colgroup>
<col style="width: 16%" />
<col style="width: 83%" />
</colgroup>
<tbody>
<tr class="odd">
<td><strong>Código</strong></td>
<td><strong>HU-14</strong></td>
</tr>
<tr class="even">
<td><strong>Título corto</strong></td>
<td>Consultar decisión de una solicitud</td>
</tr>
<tr class="odd">
<td><strong>Historia</strong></td>
<td><strong>Como</strong> Carlos Mejía, Empleado, <strong>quiero</strong> consultar la decisión tomada sobre mi solicitud, <strong>para</strong> saber si fue aprobada o rechazada, por qué y quién la decidió.</td>
</tr>
<tr class="even">
<td><strong>Criterios de aceptación</strong></td>
<td><p><strong>Antecedentes</strong> (comunes a todos los escenarios)</p>
<blockquote>
<p><strong>Dado</strong> que Carlos Mejía, Empleado, inició sesión</p>
</blockquote>
<p><strong>Escenario: CA-1 Consultar la decisión de una solicitud aprobada</strong></p>
<p><em># buscarPorSolicitud() · RN-AP13</em></p>
<blockquote>
<p><strong>Dado</strong> que la solicitud 2 de Carlos Mejía tiene la decisión:</p>
<p>│ ID_Aprobacion │ ID_Solicitud │ ID_Aprobador │ Decision │ Motivo_Rechazo │ Fecha_Decision │</p>
<p>├───────────────┼──────────────┼──────────────┼──────────┼────────────────┼──────────────────┤</p>
<p>│ 1 │ 2 │ 9 │ Aprobada │ (vacío) │ 2026-09-30 09:00 │</p>
<p><strong>Cuando</strong> consulta la decisión de la solicitud 2</p>
<p><strong>Entonces</strong> ve la decisión con sus 6 campos: ID_Aprobacion 1, ID_Solicitud 2, ID_Aprobador 9, Decision Aprobada, Motivo_Rechazo vacío y Fecha_Decision 2026-09-30 09:00</p>
<p><strong>Y</strong> la consulta no modifica la decisión</p>
</blockquote>
<p><strong>Escenario: CA-2 Consultar la decisión de una solicitud rechazada</strong></p>
<p><em># buscarPorSolicitud() · RN-AP13</em></p>
<blockquote>
<p><strong>Dado</strong> que la solicitud 3 de Carlos Mejía tiene la decisión:</p>
<p>│ ID_Aprobacion │ ID_Solicitud │ ID_Aprobador │ Decision │ Motivo_Rechazo │ Fecha_Decision │</p>
<p>├───────────────┼──────────────┼──────────────┼───────────┼────────────────────────────────────┼──────────────────┤</p>
<p>│ 2 │ 3 │ 9 │ Rechazada │ Sin disponibilidad en la categoría │ 2026-10-01 16:30 │</p>
<p><strong>Cuando</strong> consulta la decisión de la solicitud 3</p>
<p><strong>Entonces</strong> ve la decisión con sus 6 campos: ID_Aprobacion 2, ID_Solicitud 3, ID_Aprobador 9, Decision Rechazada, Motivo_Rechazo Sin disponibilidad en la categoría y Fecha_Decision 2026-10-01 16:30</p>
</blockquote>
<p><strong>Esquema del escenario: CA-3 Solicitud que aún no tiene decisión</strong></p>
<p><em># buscarPorSolicitud() · RN-AP13</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la solicitud &lt;id&gt; de Carlos Mejía en estado &lt;estado&gt; y sin decisión</p>
<p><strong>Cuando</strong> consulta la decisión de la solicitud &lt;id&gt;</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Ejemplos:</strong></p>
<p>│ id │ estado │ mensaje │</p>
<p>├────┼───────────┼───────────────────────────────────────────────────┤</p>
<p>│ 1 │ Pendiente │ «La solicitud aún no tiene decisión.» │</p>
<p>│ 4 │ Cancelada │ «La solicitud fue cancelada y no tiene decisión.» │</p>
</blockquote>
<p><strong>Escenario: CA-4 Solicitud inexistente</strong></p>
<p><em># buscarPorSolicitud() · RN-AP13</em></p>
<blockquote>
<p><strong>Dado</strong> que no existe la solicitud 99</p>
<p><strong>Cuando</strong> consulta la decisión de la solicitud 99</p>
<p><strong>Entonces</strong> el sistema responde «La solicitud no existe.»</p>
</blockquote>
<p><strong>Escenario: CA-5 Decisión de una solicitud de otro custodio</strong></p>
<p><em># buscarPorSolicitud() · RN-AP14</em></p>
<blockquote>
<p><strong>Dado</strong> que la solicitud 5 es del custodio 1</p>
<p><strong>Cuando</strong> Carlos Mejía (custodio 3) consulta la decisión de la solicitud 5</p>
<p><strong>Entonces</strong> el sistema responde «No tiene acceso a esa solicitud.»</p>
<p><strong>Y</strong> no se muestra ningún dato de la decisión</p>
</blockquote></td>
</tr>
<tr class="odd">
<td><strong>Origen de la necesidad</strong></td>
<td>Pregunta 9: autorizaciones en 6 de 19 (cuenta una respuesta que marcó todas las opciones); Pregunta 11: responsable de aprobación es el dato más relevante para 3 de 19. N-04.</td>
</tr>
<tr class="even">
<td><strong>RF derivados</strong></td>
<td>RF-17, RF-85</td>
</tr>
<tr class="odd">
<td><strong>Prioridad</strong></td>
<td>Alta</td>
</tr>
</tbody>
</table>

*Nota: N-04 pide conocer quién autorizó: se muestra ID_Aprobador; si el Empleado ve el nombre es la pregunta P-24.*

**Asignacion — Anexo 4**

**HU-15 Asignar equipo a una solicitud aprobada**

<table>
<colgroup>
<col style="width: 16%" />
<col style="width: 83%" />
</colgroup>
<thead>
<tr class="header">
<th><strong>Código</strong></th>
<th><strong>HU-15</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><strong>Título corto</strong></td>
<td>Asignar equipo a una solicitud aprobada</td>
</tr>
<tr class="even">
<td><strong>Historia</strong></td>
<td><strong>Como</strong> Marta Rojas, Responsable de Activos, <strong>quiero</strong> asignar un equipo disponible a una solicitud aprobada, indicando cuándo debe devolverse, <strong>para</strong> dejar registrado quién tiene cada equipo y desde cuándo.</td>
</tr>
<tr class="odd">
<td><strong>Criterios de aceptación</strong></td>
<td><p><strong>Antecedentes</strong> (comunes a todos los escenarios)</p>
<blockquote>
<p><strong>Dado</strong> que Marta Rojas, Responsable de Activos, inició sesión</p>
</blockquote>
<p><strong>Escenario: CA-1 Asignar un equipo disponible a una solicitud aprobada</strong></p>
<p><em># asignar() · RN-AS01, RN-AS02, RN-AS10, RN-AS11</em></p>
<blockquote>
<p><strong>Dado</strong> que la fecha actual es 2026-10-06 y existe la solicitud:</p>
<p>│ ID_Solicitud │ ID_Categoria │ Motivo │ Fecha_Solicitud │ ID_Custodio │ Estado_Solicitud │</p>
<p>├──────────────┼──────────────┼───────────────────────────┼──────────────────┼─────────────┼──────────────────┤</p>
<p>│ 6 │ 1 │ Portátil para teletrabajo │ 2026-09-29 17:05 │ 3 │ Aprobada │</p>
<p><strong>Y</strong> que la solicitud 6 no tiene asignación y existe el activo:</p>
<p>│ ID_Activo │ Marca │ Modelo │ Numero_Serie │ Placa_Inventario │ Estado │ Ubicacion │ ID_Categoria │</p>
<p>├───────────┼───────┼────────────────┼──────────────┼──────────────────┼────────────┼──────────────────┼──────────────┤</p>
<p>│ 1 │ HP │ ProBook 450 G8 │ 5CD2171NQ7 │ NEX-000101 │ Disponible │ Bodega principal │ 1 │</p>
<p><strong>Cuando</strong> registra la asignación con los datos:</p>
<p>│ Campo │ Valor │</p>
<p>├───────────────────────────┼────────────┤</p>
<p>│ ID_Solicitud │ 6 │</p>
<p>│ ID_Activo │ 1 │</p>
<p>│ Fecha_Devolucion_Esperada │ 2026-12-04 │</p>
<p><strong>Entonces</strong> el sistema responde «Equipo asignado correctamente.»</p>
<p><strong>Y</strong> la asignación queda guardada con:</p>
<p>│ ID_Asignacion │ Fecha_Entrega │ Fecha_Devolucion_Esperada │ Estado_Asignacion │ ID_Custodio │ ID_Activo │ ID_Solicitud │</p>
<p>├───────────────┼───────────────┼───────────────────────────┼───────────────────┼─────────────┼───────────┼──────────────┤</p>
<p>│ (automático) │ 2026-10-06 │ 2026-12-04 │ Vigente │ 3 │ 1 │ 6 │</p>
<p><strong>Y</strong> ID_Asignacion, Fecha_Entrega y Estado_Asignacion los asignó el sistema e ID_Custodio se copió de la solicitud 6</p>
<p><strong>Y</strong> el activo 1 pasa a Estado Asignado y conserva sus demás datos:</p>
<p>│ ID_Activo │ Marca │ Modelo │ Numero_Serie │ Placa_Inventario │ Estado │ Ubicacion │ ID_Categoria │</p>
<p>├───────────┼───────┼────────────────┼──────────────┼──────────────────┼──────────┼──────────────────┼──────────────┤</p>
<p>│ 1 │ HP │ ProBook 450 G8 │ 5CD2171NQ7 │ NEX-000101 │ Asignado │ Bodega principal │ 1 │</p>
<p><strong>Y</strong> la solicitud 6 conserva Estado_Solicitud Aprobada</p>
</blockquote>
<p><strong>Esquema del escenario: CA-2 Datos obligatorios vacíos</strong></p>
<p><em># asignar() · RN-AS02</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la solicitud 6 Aprobada sin asignación y el activo 1 Disponible</p>
<p><strong>Cuando</strong> registra una asignación con &lt;campo&gt; vacío y los demás datos válidos</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> no se crea la asignación</p>
<p><strong>Ejemplos:</strong></p>
<p>│ campo │ mensaje │</p>
<p>├───────────────────────────┼───────────────────────────────────────────────────┤</p>
<p>│ ID_Solicitud │ «La solicitud es obligatoria.» │</p>
<p>│ ID_Activo │ «El activo es obligatorio.» │</p>
<p>│ Fecha_Devolucion_Esperada │ «La fecha de devolución esperada es obligatoria.» │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-3 Solicitud inexistente o no aprobada</strong></p>
<p><em># asignar() · RN-AS03, RN-AS04</em></p>
<blockquote>
<p><strong>Dado</strong> que existen las solicitudes:</p>
<p>│ ID_Solicitud │ ID_Categoria │ Motivo │ Fecha_Solicitud │ ID_Custodio │ Estado_Solicitud │</p>
<p>├──────────────┼──────────────┼────────────────────────────────┼──────────────────┼─────────────┼──────────────────┤</p>
<p>│ 1 │ 1 │ Portátil para trabajo en campo │ 2026-09-28 09:15 │ 3 │ Pendiente │</p>
<p>│ 3 │ 1 │ Reemplazo de portátil dañado │ 2026-09-30 08:05 │ 3 │ Rechazada │</p>
<p>│ 4 │ 4 │ Teclado y mouse ergonómicos │ 2026-10-01 10:20 │ 3 │ Cancelada │</p>
<p><strong>Y</strong> que existe el activo 1 Disponible</p>
<p><strong>Cuando</strong> registra la asignación de la solicitud &lt;id&gt; al activo 1</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> no se crea la asignación y el activo 1 conserva Estado Disponible</p>
<p><strong>Ejemplos:</strong></p>
<p>│ id │ caso │ mensaje │</p>
<p>├────┼───────────┼─────────────────────────────────────────────────┤</p>
<p>│ 99 │ no existe │ «La solicitud no existe.» │</p>
<p>│ 1 │ Pendiente │ «Solo se puede asignar una solicitud aprobada.» │</p>
<p>│ 3 │ Rechazada │ «Solo se puede asignar una solicitud aprobada.» │</p>
<p>│ 4 │ Cancelada │ «Solo se puede asignar una solicitud aprobada.» │</p>
</blockquote>
<p><strong>Escenario: CA-4 Solicitud que ya tiene una asignación</strong></p>
<p><em># existeAsignacionDeSolicitud(), asignar() · RN-AS05</em></p>
<blockquote>
<p><strong>Dado</strong> que la solicitud 2 está Aprobada y ya tiene la asignación:</p>
<p>│ ID_Asignacion │ Fecha_Entrega │ Fecha_Devolucion_Esperada │ Estado_Asignacion │ ID_Custodio │ ID_Activo │ ID_Solicitud │</p>
<p>├───────────────┼───────────────┼───────────────────────────┼───────────────────┼─────────────┼───────────┼──────────────┤</p>
<p>│ 1 │ 2026-10-01 │ 2026-10-31 │ Vigente │ 3 │ 5 │ 2 │</p>
<p><strong>Y</strong> que existe el activo 1 Disponible</p>
<p><strong>Cuando</strong> registra la asignación de la solicitud 2 al activo 1</p>
<p><strong>Entonces</strong> el sistema responde «La solicitud ya tiene una asignación.»</p>
<p><strong>Y</strong> no se crea otra asignación y el activo 1 conserva Estado Disponible</p>
</blockquote>
<p><strong>Esquema del escenario: CA-5 Activo inexistente o no disponible</strong></p>
<p><em># activoDisponible(), asignar() · RN-AS06, RN-AS07</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la solicitud 6 Aprobada sin asignación (categoría 1) y los activos:</p>
<p>│ ID_Activo │ Marca │ Modelo │ Numero_Serie │ Placa_Inventario │ Estado │ Ubicacion │ ID_Categoria │</p>
<p>├───────────┼────────┼──────────────────┼──────────────┼──────────────────┼──────────┼──────────────────┼──────────────┤</p>
<p>│ 2 │ Lenovo │ ThinkPad E14 │ PF3K8M2Z │ NEX-000102 │ Asignado │ Oficina 301 │ 1 │</p>
<p>│ 8 │ Lenovo │ ThinkPad T14 │ PF4N7Q1A │ NEX-000108 │ Dañado │ Bodega principal │ 1 │</p>
<p>│ 9 │ HP │ EliteBook 840 G8 │ 5CG1190ZK2 │ NEX-000109 │ Baja │ (vacío) │ 1 │</p>
<p><strong>Cuando</strong> registra la asignación de la solicitud 6 al activo &lt;id&gt;</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> no se crea la asignación y el activo &lt;id&gt; conserva su estado</p>
<p><strong>Ejemplos:</strong></p>
<p>│ id │ caso │ mensaje │</p>
<p>├────┼───────────┼─────────────────────────────────┤</p>
<p>│ 99 │ no existe │ «El activo no existe.» │</p>
<p>│ 2 │ Asignado │ «El activo no está disponible.» │</p>
<p>│ 8 │ Dañado │ «El activo no está disponible.» │</p>
<p>│ 9 │ Baja │ «El activo no está disponible.» │</p>
</blockquote>
<p><strong>Escenario: CA-6 Categoría del activo distinta de la de la solicitud</strong></p>
<p><em># asignar() · RN-AS08</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la solicitud 6 Aprobada sin asignación (categoría 1) y el activo:</p>
<p>│ ID_Activo │ Marca │ Modelo │ Numero_Serie │ Placa_Inventario │ Estado │ Ubicacion │ ID_Categoria │</p>
<p>├───────────┼───────┼────────┼──────────────┼──────────────────┼────────────┼──────────────────┼──────────────┤</p>
<p>│ 10 │ Dell │ P2422H │ CN0X9Y4C02 │ NEX-000110 │ Disponible │ Bodega principal │ 2 │</p>
<p><strong>Cuando</strong> registra la asignación de la solicitud 6 al activo 10</p>
<p><strong>Entonces</strong> el sistema responde «La categoría del activo no coincide con la de la solicitud.»</p>
<p><strong>Y</strong> no se crea la asignación y el activo 10 conserva Estado Disponible</p>
</blockquote>
<p><strong>Escenario: CA-7 Fecha de devolución esperada anterior a la fecha de entrega</strong></p>
<p><em># asignar() · RN-AS09</em></p>
<blockquote>
<p><strong>Dado</strong> que la fecha actual es 2026-10-06 y existen la solicitud 6 Aprobada sin asignación y el activo 1 Disponible</p>
<p><strong>Cuando</strong> registra la asignación con Fecha_Devolucion_Esperada 2026-10-05</p>
<p><strong>Entonces</strong> el sistema responde «La fecha de devolución esperada no puede ser anterior a la fecha de entrega.»</p>
<p><strong>Y</strong> no se crea la asignación</p>
</blockquote></td>
</tr>
<tr class="even">
<td><strong>Origen de la necesidad</strong></td>
<td>Pregunta 9: «saber quién tiene cada equipo» en 9 de 19 (cuenta una respuesta que marcó todas las opciones); Pregunta 11: la fecha de entrega es el dato más relevante para 6 de 19; Pregunta 14 y N-10: cambio automático de responsable en 5 de 19 y 7 más en «todas las anteriores». N-02, N-06 y N-10.</td>
</tr>
<tr class="odd">
<td><strong>RF derivados</strong></td>
<td>RF-18, RF-87, RF-88, RF-89, RF-90, RF-91, RF-161</td>
</tr>
<tr class="even">
<td><strong>Prioridad</strong></td>
<td>Alta</td>
</tr>
</tbody>
</table>

*Nota: HU de proceso: sin asignación no hay entrega, por eso la prioridad es Alta. ID_Custodio se copia de la solicitud y no se digita. El efecto sobre el activo (Asignado) es el CRF-003, cambio 1 (propuesta, sin aplicar). La solicitud sigue Aprobada: el modelo no tiene un estado «Asignada» y las aprobadas sin asignación se listan con listarAprobadas() (CRF-003, cambio 6). Categoría del activo igual a la de la solicitud y fecha esperada no anterior a la entrega: propuestas (P-29, P-30). Cifras contrastadas con 1.7.2.*

**HU-16 Consultar asignaciones**

<table>
<colgroup>
<col style="width: 16%" />
<col style="width: 83%" />
</colgroup>
<thead>
<tr class="header">
<th><strong>Código</strong></th>
<th><strong>HU-16</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><strong>Título corto</strong></td>
<td>Consultar asignaciones</td>
</tr>
<tr class="even">
<td><strong>Historia</strong></td>
<td><strong>Como</strong> Marta Rojas, Responsable de Activos, <strong>quiero</strong> consultar las asignaciones por identificador, las vigentes, las de un custodio y la vigente de un equipo, <strong>para</strong> saber en todo momento quién tiene cada equipo y poder localizarlo.</td>
</tr>
<tr class="odd">
<td><strong>Criterios de aceptación</strong></td>
<td><p><strong>Antecedentes</strong> (comunes a todos los escenarios)</p>
<blockquote>
<p><strong>Dado</strong> que Marta Rojas, Responsable de Activos, inició sesión</p>
</blockquote>
<p><strong>Esquema del escenario: CA-1 Consultar una asignación por su identificador</strong></p>
<p><em># buscarPorId() · RN-AS19</em></p>
<blockquote>
<p><strong>Dado</strong> que existen las asignaciones:</p>
<p>│ ID_Asignacion │ Fecha_Entrega │ Fecha_Devolucion_Esperada │ Estado_Asignacion │ ID_Custodio │ ID_Activo │ ID_Solicitud │</p>
<p>├───────────────┼───────────────┼───────────────────────────┼───────────────────┼─────────────┼───────────┼──────────────┤</p>
<p>│ 1 │ 2026-10-01 │ 2026-10-31 │ Vigente │ 3 │ 5 │ 2 │</p>
<p>│ 2 │ 2026-09-15 │ 2026-10-15 │ Vigente │ 1 │ 2 │ 8 │</p>
<p>│ 3 │ 2026-08-20 │ 2026-09-20 │ Cerrada │ 3 │ 6 │ 9 │</p>
<p><strong>Cuando</strong> consulta por ID_Asignacion &lt;id&gt;</p>
<p><strong>Entonces</strong> ve la asignación con sus 7 campos, según la fila de Ejemplos</p>
<p><strong>Y</strong> la consulta no modifica la asignación</p>
<p><strong>Ejemplos:</strong></p>
<p>│ ID_Asignacion │ Fecha_Entrega │ Fecha_Devolucion_Esperada │ Estado_Asignacion │ ID_Custodio │ ID_Activo │ ID_Solicitud │</p>
<p>├───────────────┼───────────────┼───────────────────────────┼───────────────────┼─────────────┼───────────┼──────────────┤</p>
<p>│ 1 │ 2026-10-01 │ 2026-10-31 │ Vigente │ 3 │ 5 │ 2 │</p>
<p>│ 3 │ 2026-08-20 │ 2026-09-20 │ Cerrada │ 3 │ 6 │ 9 │</p>
</blockquote>
<p><strong>Escenario: CA-2 Ver las asignaciones vigentes</strong></p>
<p><em># listarVigentes() · RN-AS20</em></p>
<blockquote>
<p><strong>Dado</strong> que existen las asignaciones:</p>
<p>│ ID_Asignacion │ Fecha_Entrega │ Fecha_Devolucion_Esperada │ Estado_Asignacion │ ID_Custodio │ ID_Activo │ ID_Solicitud │</p>
<p>├───────────────┼───────────────┼───────────────────────────┼───────────────────┼─────────────┼───────────┼──────────────┤</p>
<p>│ 1 │ 2026-10-01 │ 2026-10-31 │ Vigente │ 3 │ 5 │ 2 │</p>
<p>│ 2 │ 2026-09-15 │ 2026-10-15 │ Vigente │ 1 │ 2 │ 8 │</p>
<p>│ 3 │ 2026-08-20 │ 2026-09-20 │ Cerrada │ 3 │ 6 │ 9 │</p>
<p><strong>Cuando</strong> consulta las asignaciones vigentes</p>
<p><strong>Entonces</strong> ve solo las asignaciones en estado Vigente, con sus 7 campos, de la más antigua a la más reciente por Fecha_Entrega:</p>
<p>│ ID_Asignacion │ Fecha_Entrega │ Fecha_Devolucion_Esperada │ Estado_Asignacion │ ID_Custodio │ ID_Activo │ ID_Solicitud │</p>
<p>├───────────────┼───────────────┼───────────────────────────┼───────────────────┼─────────────┼───────────┼──────────────┤</p>
<p>│ 2 │ 2026-09-15 │ 2026-10-15 │ Vigente │ 1 │ 2 │ 8 │</p>
<p>│ 1 │ 2026-10-01 │ 2026-10-31 │ Vigente │ 3 │ 5 │ 2 │</p>
<p><strong>Y</strong> no ve la asignación 3, que está Cerrada</p>
</blockquote>
<p><strong>Escenario: CA-3 Ver las asignaciones de un custodio</strong></p>
<p><em># listarPorCustodio() · RN-AS21</em></p>
<blockquote>
<p><strong>Dado</strong> que existen las asignaciones:</p>
<p>│ ID_Asignacion │ Fecha_Entrega │ Fecha_Devolucion_Esperada │ Estado_Asignacion │ ID_Custodio │ ID_Activo │ ID_Solicitud │</p>
<p>├───────────────┼───────────────┼───────────────────────────┼───────────────────┼─────────────┼───────────┼──────────────┤</p>
<p>│ 1 │ 2026-10-01 │ 2026-10-31 │ Vigente │ 3 │ 5 │ 2 │</p>
<p>│ 2 │ 2026-09-15 │ 2026-10-15 │ Vigente │ 1 │ 2 │ 8 │</p>
<p>│ 3 │ 2026-08-20 │ 2026-09-20 │ Cerrada │ 3 │ 6 │ 9 │</p>
<p><strong>Cuando</strong> consulta las asignaciones del custodio 3</p>
<p><strong>Entonces</strong> ve las asignaciones del custodio 3 con su estado, de la más reciente a la más antigua por Fecha_Entrega:</p>
<p>│ ID_Asignacion │ Fecha_Entrega │ Fecha_Devolucion_Esperada │ Estado_Asignacion │ ID_Custodio │ ID_Activo │ ID_Solicitud │</p>
<p>├───────────────┼───────────────┼───────────────────────────┼───────────────────┼─────────────┼───────────┼──────────────┤</p>
<p>│ 1 │ 2026-10-01 │ 2026-10-31 │ Vigente │ 3 │ 5 │ 2 │</p>
<p>│ 3 │ 2026-08-20 │ 2026-09-20 │ Cerrada │ 3 │ 6 │ 9 │</p>
<p><strong>Y</strong> no ve la asignación 2, que es del custodio 1</p>
</blockquote>
<p><strong>Esquema del escenario: CA-4 Ver la asignación vigente de un equipo</strong></p>
<p><em># buscarVigentePorActivo() · RN-AS22, RN-AS18</em></p>
<blockquote>
<p><strong>Dado</strong> que existen las asignaciones Vigentes 1 (activo 5) y 2 (activo 2) y el activo &lt;id&gt; está en Estado &lt;estado&gt;</p>
<p><strong>Cuando</strong> consulta la asignación vigente del activo &lt;id&gt;</p>
<p><strong>Entonces</strong> ve la asignación &lt;asignacion&gt; con sus 7 campos</p>
<p><strong>Y</strong> el activo sigue con asignación Vigente aunque esté Dañado</p>
<p><strong>Ejemplos:</strong></p>
<p>│ id │ estado │ asignacion │</p>
<p>├────┼──────────┼────────────┤</p>
<p>│ 5 │ Asignado │ 1 │</p>
<p>│ 2 │ Dañado │ 2 │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-5 Sin resultados o no encontrado</strong></p>
<p><em># buscarPorId(), listarVigentes(), listarPorCustodio(), buscarVigentePorActivo() · RN-AS19, RN-AS20, RN-AS21, RN-AS22</em></p>
<blockquote>
<p><strong>Dado</strong> que no hay asignaciones que coincidan con &lt;forma&gt; &lt;valor&gt;</p>
<p><strong>Cuando</strong> consulta por &lt;forma&gt; &lt;valor&gt;</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Ejemplos:</strong></p>
<p>│ forma │ valor │ mensaje │</p>
<p>├───────────────────────────────┼────────────────────────────┼────────────────────────────────────────────────────────────┤</p>
<p>│ identificador │ 99 │ «No se encontró ninguna asignación con ese identificador.» │</p>
<p>│ vigentes │ (ninguna) │ «No hay asignaciones vigentes.» │</p>
<p>│ custodio │ 2 (sin asignaciones) │ «El custodio no tiene asignaciones.» │</p>
<p>│ custodio │ 99 (no existe) │ «El custodio no existe.» │</p>
<p>│ activo con asignación vigente │ 1 (sin asignación vigente) │ «El activo no tiene una asignación vigente.» │</p>
<p>│ activo con asignación vigente │ 99 (no existe) │ «El activo no existe.» │</p>
</blockquote>
<p><strong>Escenario: CA-6 Ver las propias asignaciones vigentes (actor secundario: Empleado)</strong></p>
<p><em># listarPorCustodio() · RN-AS21, RN-AS23, RN-AS24</em></p>
<blockquote>
<p><strong>Dado</strong> que quien consulta es Carlos Mejía, Empleado, en lugar del Responsable de Activos</p>
<p><strong>Y</strong> que existen las asignaciones:</p>
<p>│ ID_Asignacion │ Fecha_Entrega │ Fecha_Devolucion_Esperada │ Estado_Asignacion │ ID_Custodio │ ID_Activo │ ID_Solicitud │</p>
<p>├───────────────┼───────────────┼───────────────────────────┼───────────────────┼─────────────┼───────────┼──────────────┤</p>
<p>│ 1 │ 2026-10-01 │ 2026-10-31 │ Vigente │ 3 │ 5 │ 2 │</p>
<p>│ 2 │ 2026-09-15 │ 2026-10-15 │ Vigente │ 1 │ 2 │ 8 │</p>
<p>│ 3 │ 2026-08-20 │ 2026-09-20 │ Cerrada │ 3 │ 6 │ 9 │</p>
<p><strong>Cuando</strong> consulta sus asignaciones</p>
<p><strong>Entonces</strong> ve solo sus asignaciones Vigentes, con sus 7 campos:</p>
<p>│ ID_Asignacion │ Fecha_Entrega │ Fecha_Devolucion_Esperada │ Estado_Asignacion │ ID_Custodio │ ID_Activo │ ID_Solicitud │</p>
<p>├───────────────┼───────────────┼───────────────────────────┼───────────────────┼─────────────┼───────────┼──────────────┤</p>
<p>│ 1 │ 2026-10-01 │ 2026-10-31 │ Vigente │ 3 │ 5 │ 2 │</p>
<p><strong>Y</strong> no ve la asignación 3, que está Cerrada, ni la 2, que es de otro custodio</p>
<p><em>Actor secundario: el Empleado consulta sus asignaciones vigentes (RN-AS23, propuesta; P-37).</em></p>
</blockquote>
<p><strong>Esquema del escenario: CA-7 Asignación de otro custodio</strong></p>
<p><em># buscarPorId(), listarPorCustodio() · RN-AS23</em></p>
<blockquote>
<p><strong>Dado</strong> que quien consulta es Carlos Mejía (custodio 3), en lugar del Responsable de Activos, y existe la asignación:</p>
<p>│ ID_Asignacion │ Fecha_Entrega │ Fecha_Devolucion_Esperada │ Estado_Asignacion │ ID_Custodio │ ID_Activo │ ID_Solicitud │</p>
<p>├───────────────┼───────────────┼───────────────────────────┼───────────────────┼─────────────┼───────────┼──────────────┤</p>
<p>│ 2 │ 2026-09-15 │ 2026-10-15 │ Vigente │ 1 │ 2 │ 8 │</p>
<p><strong>Cuando</strong> consulta por &lt;forma&gt; &lt;valor&gt;</p>
<p><strong>Entonces</strong> el sistema responde «No tiene acceso a esa asignación.»</p>
<p><strong>Y</strong> no se muestra ningún dato de la asignación 2</p>
<p><strong>Ejemplos:</strong></p>
<p>│ forma │ valor │</p>
<p>├───────────────┼───────┤</p>
<p>│ ID_Asignacion │ 2 │</p>
<p>│ custodio │ 1 │</p>
</blockquote></td>
</tr>
<tr class="even">
<td><strong>Origen de la necesidad</strong></td>
<td>Pregunta 9: «saber quién tiene cada equipo» en 9 de 19 (cuenta una respuesta que marcó todas las opciones); Pregunta 5: localizar equipos es dificultad alta para 5 de 19. N-02.</td>
</tr>
<tr class="odd">
<td><strong>RF derivados</strong></td>
<td>RF-19, RF-92, RF-93, RF-94, RF-95, RF-96</td>
</tr>
<tr class="even">
<td><strong>Prioridad</strong></td>
<td>Alta</td>
</tr>
</tbody>
</table>

*Nota: HU-16 agrupa dos actores: el Rol principal es el Responsable de Activos y el Empleado consulta sus asignaciones vigentes como actor secundario (CA-6 y CA-7; RN-AS23 y RN-AS24). Un activo Dañado puede tener una asignación Vigente (CRF-003, cambio 3). Orden de los listados: propuesta (P-36). Cifras contrastadas con 1.7.2.*

**HU-17 Actualizar asignación**

<table>
<colgroup>
<col style="width: 16%" />
<col style="width: 83%" />
</colgroup>
<thead>
<tr class="header">
<th><strong>Código</strong></th>
<th><strong>HU-17</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><strong>Título corto</strong></td>
<td>Actualizar asignación</td>
</tr>
<tr class="even">
<td><strong>Historia</strong></td>
<td><strong>Como</strong> Marta Rojas, Responsable de Activos, <strong>quiero</strong> corregir la fecha de devolución esperada de una asignación vigente, <strong>para</strong> que el plazo registrado sea el acordado con el custodio.</td>
</tr>
<tr class="odd">
<td><strong>Criterios de aceptación</strong></td>
<td><p><strong>Antecedentes</strong> (comunes a todos los escenarios)</p>
<blockquote>
<p><strong>Dado</strong> que Marta Rojas, Responsable de Activos, inició sesión</p>
</blockquote>
<p><strong>Escenario: CA-1 Actualizar la fecha de devolución esperada de una asignación vigente</strong></p>
<p><em># actualizar() · RN-AS13</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la asignación 1 Vigente con los valores de la columna Antes</p>
<p><strong>Cuando</strong> actualiza la asignación 1 con los valores de la columna Después:</p>
<p>│ Campo │ Antes │ Después │</p>
<p>├───────────────────────────┼────────────┼─────────────────────────┤</p>
<p>│ Fecha_Devolucion_Esperada │ 2026-10-31 │ 2026-11-15 │</p>
<p>│ ID_Asignacion │ 1 │ 1 (sin cambio) │</p>
<p>│ Fecha_Entrega │ 2026-10-01 │ 2026-10-01 (sin cambio) │</p>
<p>│ Estado_Asignacion │ Vigente │ Vigente (sin cambio) │</p>
<p>│ ID_Custodio │ 3 │ 3 (sin cambio) │</p>
<p>│ ID_Activo │ 5 │ 5 (sin cambio) │</p>
<p>│ ID_Solicitud │ 2 │ 2 (sin cambio) │</p>
<p><strong>Entonces</strong> el sistema responde «Asignación actualizada correctamente.»</p>
<p><strong>Y</strong> la asignación 1 queda con los valores de la columna Después</p>
</blockquote>
<p><strong>Esquema del escenario: CA-2 Fecha de devolución esperada vacía o anterior a la entrega</strong></p>
<p><em># actualizar() · RN-AS02, RN-AS09</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la asignación:</p>
<p>│ ID_Asignacion │ Fecha_Entrega │ Fecha_Devolucion_Esperada │ Estado_Asignacion │ ID_Custodio │ ID_Activo │ ID_Solicitud │</p>
<p>├───────────────┼───────────────┼───────────────────────────┼───────────────────┼─────────────┼───────────┼──────────────┤</p>
<p>│ 1 │ 2026-10-01 │ 2026-10-31 │ Vigente │ 3 │ 5 │ 2 │</p>
<p><strong>Cuando</strong> actualiza la asignación 1 con Fecha_Devolucion_Esperada &lt;valor&gt;</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> la asignación 1 conserva sus datos anteriores</p>
<p><strong>Ejemplos:</strong></p>
<p>│ valor │ mensaje │</p>
<p>├────────────┼────────────────────────────────────────────────────────────────────────────────┤</p>
<p>│ (vacío) │ «La fecha de devolución esperada es obligatoria.» │</p>
<p>│ 2026-09-30 │ «La fecha de devolución esperada no puede ser anterior a la fecha de entrega.» │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-3 Datos que no se modifican</strong></p>
<p><em># actualizar() · RN-AS01, RN-AS12, RN-AS13</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la asignación:</p>
<p>│ ID_Asignacion │ Fecha_Entrega │ Fecha_Devolucion_Esperada │ Estado_Asignacion │ ID_Custodio │ ID_Activo │ ID_Solicitud │</p>
<p>├───────────────┼───────────────┼───────────────────────────┼───────────────────┼─────────────┼───────────┼──────────────┤</p>
<p>│ 1 │ 2026-10-01 │ 2026-10-31 │ Vigente │ 3 │ 5 │ 2 │</p>
<p><strong>Cuando</strong> intenta cambiar &lt;campo&gt; de la asignación 1 a &lt;valor&gt;</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> la asignación 1 conserva sus datos anteriores</p>
<p><strong>Ejemplos:</strong></p>
<p>│ campo │ valor │ mensaje │</p>
<p>├───────────────────┼────────────┼────────────────────────────────────────────────────────────┤</p>
<p>│ ID_Asignacion │ 9 │ «El identificador de la asignación no se puede modificar.» │</p>
<p>│ Fecha_Entrega │ 2026-10-02 │ «La fecha de entrega no se puede modificar.» │</p>
<p>│ Estado_Asignacion │ Cerrada │ «El estado de la asignación solo cambia al cerrarla.» │</p>
<p>│ ID_Custodio │ 1 │ «El custodio de la asignación no se puede modificar.» │</p>
<p>│ ID_Activo │ 2 │ «El activo de la asignación no se puede modificar.» │</p>
<p>│ ID_Solicitud │ 6 │ «La solicitud de la asignación no se puede modificar.» │</p>
</blockquote>
<p><strong>Escenario: CA-4 Asignación cerrada</strong></p>
<p><em># actualizar() · RN-AS13</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la asignación:</p>
<p>│ ID_Asignacion │ Fecha_Entrega │ Fecha_Devolucion_Esperada │ Estado_Asignacion │ ID_Custodio │ ID_Activo │ ID_Solicitud │</p>
<p>├───────────────┼───────────────┼───────────────────────────┼───────────────────┼─────────────┼───────────┼──────────────┤</p>
<p>│ 3 │ 2026-08-20 │ 2026-09-20 │ Cerrada │ 3 │ 6 │ 9 │</p>
<p><strong>Cuando</strong> actualiza la asignación 3 con Fecha_Devolucion_Esperada 2026-10-30</p>
<p><strong>Entonces</strong> el sistema responde «Una asignación cerrada no se puede modificar.»</p>
<p><strong>Y</strong> la asignación 3 conserva sus datos anteriores</p>
</blockquote>
<p><strong>Escenario: CA-5 Asignación inexistente</strong></p>
<p><em># actualizar() · RN-AS19</em></p>
<blockquote>
<p><strong>Dado</strong> que no existe la asignación 99</p>
<p><strong>Cuando</strong> actualiza la asignación con ID_Asignacion 99</p>
<p><strong>Entonces</strong> el sistema responde «La asignación no existe.»</p>
</blockquote></td>
</tr>
<tr class="even">
<td><strong>Origen de la necesidad</strong></td>
<td>Pregunta 11: la fecha de entrega es el dato más relevante para 6 de 19. N-06.</td>
</tr>
<tr class="odd">
<td><strong>RF derivados</strong></td>
<td>RF-20, RF-97</td>
</tr>
<tr class="even">
<td><strong>Prioridad</strong></td>
<td>Media</td>
</tr>
</tbody>
</table>

*Nota: La Fase A v6 describe actualizar() como «modifica la fecha de devolución esperada o cambia el custodio»; aquí solo se actualiza la fecha, y solo si la asignación está Vigente (propuesta; P-31). Cifras contrastadas con 1.7.2.*

**HU-18 Cerrar asignación**

<table>
<colgroup>
<col style="width: 16%" />
<col style="width: 83%" />
</colgroup>
<thead>
<tr class="header">
<th><strong>Código</strong></th>
<th><strong>HU-18</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><strong>Título corto</strong></td>
<td>Cerrar asignación</td>
</tr>
<tr class="even">
<td><strong>Historia</strong></td>
<td><strong>Como</strong> Marta Rojas, Responsable de Activos, <strong>quiero</strong> cerrar una asignación cuya devolución ya fue confirmada, conociendo antes la consecuencia, <strong>para</strong> que el equipo deje de figurar en poder del custodio y vuelva a estar disponible.</td>
</tr>
<tr class="odd">
<td><strong>Criterios de aceptación</strong></td>
<td><p><strong>Antecedentes</strong> (comunes a todos los escenarios)</p>
<blockquote>
<p><strong>Dado</strong> que Marta Rojas, Responsable de Activos, inició sesión</p>
</blockquote>
<p><strong>Escenario: CA-1 Cerrar una asignación con confirmación</strong></p>
<p><em># cerrar() · RN-AS14, RN-AS15, RN-AS16</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la asignación:</p>
<p>│ ID_Asignacion │ Fecha_Entrega │ Fecha_Devolucion_Esperada │ Estado_Asignacion │ ID_Custodio │ ID_Activo │ ID_Solicitud │</p>
<p>├───────────────┼───────────────┼───────────────────────────┼───────────────────┼─────────────┼───────────┼──────────────┤</p>
<p>│ 1 │ 2026-10-01 │ 2026-10-31 │ Vigente │ 3 │ 5 │ 2 │</p>
<p><strong>Y</strong> que su devolución está Confirmada (se muestran los campos que importan):</p>
<p>│ ID_Devolucion │ ID_Asignacion │ Estado_Recepcion │</p>
<p>├───────────────┼───────────────┼──────────────────┤</p>
<p>│ 1 │ 1 │ Confirmada │</p>
<p><strong>Y</strong> que el activo 5 está en Estado Asignado</p>
<p><strong>Cuando</strong> solicita cerrar la asignación 1</p>
<p><strong>Entonces</strong> el sistema muestra el aviso «La asignación 1 pasará a estado Cerrada y el activo NEX-000105 quedará Disponible, salvo que esté Dañado. El registro no se elimina y no se puede reactivar. ¿Desea continuar?»</p>
<p><strong>Cuando</strong> confirma el cierre</p>
<p><strong>Entonces</strong> el sistema responde «Asignación cerrada correctamente.»</p>
<p><strong>Y</strong> la asignación queda con Estado_Asignacion Cerrada</p>
<p><strong>Y</strong> ID_Asignacion, Fecha_Entrega, Fecha_Devolucion_Esperada, ID_Custodio, ID_Activo e ID_Solicitud conservan su valor</p>
<p><strong>Y</strong> el activo 5 pasa a Estado Disponible</p>
</blockquote>
<p><strong>Escenario: CA-2 Cerrar la asignación de un activo Dañado</strong></p>
<p><em># cerrar() · RN-AS15</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la asignación:</p>
<p>│ ID_Asignacion │ Fecha_Entrega │ Fecha_Devolucion_Esperada │ Estado_Asignacion │ ID_Custodio │ ID_Activo │ ID_Solicitud │</p>
<p>├───────────────┼───────────────┼───────────────────────────┼───────────────────┼─────────────┼───────────┼──────────────┤</p>
<p>│ 1 │ 2026-10-01 │ 2026-10-31 │ Vigente │ 3 │ 5 │ 2 │</p>
<p><strong>Y</strong> que su devolución está Confirmada (se muestran los campos que importan):</p>
<p>│ ID_Devolucion │ ID_Asignacion │ Estado_Recepcion │</p>
<p>├───────────────┼───────────────┼──────────────────┤</p>
<p>│ 1 │ 1 │ Confirmada │</p>
<p><strong>Y</strong> que el activo 5 está en Estado Dañado por un reporte de daño</p>
<p><strong>Cuando</strong> solicita cerrar la asignación 1 y confirma el cierre</p>
<p><strong>Entonces</strong> el sistema responde «Asignación cerrada correctamente.»</p>
<p><strong>Y</strong> la asignación queda con Estado_Asignacion Cerrada</p>
<p><strong>Y</strong> el activo 5 conserva Estado Dañado (no es una transición)</p>
</blockquote>
<p><strong>Escenario: CA-3 Desistir del cierre</strong></p>
<p><em># cerrar() · RN-AS16</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la asignación:</p>
<p>│ ID_Asignacion │ Fecha_Entrega │ Fecha_Devolucion_Esperada │ Estado_Asignacion │ ID_Custodio │ ID_Activo │ ID_Solicitud │</p>
<p>├───────────────┼───────────────┼───────────────────────────┼───────────────────┼─────────────┼───────────┼──────────────┤</p>
<p>│ 1 │ 2026-10-01 │ 2026-10-31 │ Vigente │ 3 │ 5 │ 2 │</p>
<p><strong>Y</strong> que su devolución está Confirmada y el activo 5 está en Estado Asignado</p>
<p><strong>Cuando</strong> solicita cerrar la asignación 1</p>
<p><strong>Entonces</strong> el sistema muestra el aviso «La asignación 1 pasará a estado Cerrada y el activo NEX-000105 quedará Disponible, salvo que esté Dañado. El registro no se elimina y no se puede reactivar. ¿Desea continuar?»</p>
<p><strong>Cuando</strong> decide no continuar</p>
<p><strong>Entonces</strong> el sistema responde «Se desistió de cerrar la asignación. La asignación no fue modificada.»</p>
<p><strong>Y</strong> la asignación 1 conserva Estado_Asignacion Vigente y el activo 5 conserva Estado Asignado</p>
</blockquote>
<p><strong>Esquema del escenario: CA-4 Asignación sin devolución confirmada</strong></p>
<p><em># cerrar() · RN-AS14</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la asignación:</p>
<p>│ ID_Asignacion │ Fecha_Entrega │ Fecha_Devolucion_Esperada │ Estado_Asignacion │ ID_Custodio │ ID_Activo │ ID_Solicitud │</p>
<p>├───────────────┼───────────────┼───────────────────────────┼───────────────────┼─────────────┼───────────┼──────────────┤</p>
<p>│ 1 │ 2026-10-01 │ 2026-10-31 │ Vigente │ 3 │ 5 │ 2 │</p>
<p><strong>Y</strong> que &lt;situacion&gt;</p>
<p><strong>Cuando</strong> solicita cerrar la asignación 1</p>
<p><strong>Entonces</strong> el sistema responde «La asignación no se puede cerrar sin una devolución confirmada.»</p>
<p><strong>Y</strong> no muestra el aviso de confirmación y la asignación 1 conserva Estado_Asignacion Vigente</p>
<p><strong>Ejemplos:</strong></p>
<p>│ situacion │</p>
<p>├─────────────────────────────────────────────────────────────────────┤</p>
<p>│ la asignación 1 no tiene devolución registrada │</p>
<p>│ la devolución de la asignación 1 está en Estado_Recepcion Pendiente │</p>
</blockquote>
<p><strong>Escenario: CA-5 Asignación que ya está cerrada</strong></p>
<p><em># cerrar() · RN-AS17</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la asignación:</p>
<p>│ ID_Asignacion │ Fecha_Entrega │ Fecha_Devolucion_Esperada │ Estado_Asignacion │ ID_Custodio │ ID_Activo │ ID_Solicitud │</p>
<p>├───────────────┼───────────────┼───────────────────────────┼───────────────────┼─────────────┼───────────┼──────────────┤</p>
<p>│ 3 │ 2026-08-20 │ 2026-09-20 │ Cerrada │ 3 │ 6 │ 9 │</p>
<p><strong>Cuando</strong> solicita cerrar la asignación 3</p>
<p><strong>Entonces</strong> el sistema responde «La asignación ya está cerrada.»</p>
<p><strong>Y</strong> no muestra el aviso de confirmación y la asignación 3 no cambia</p>
</blockquote>
<p><strong>Escenario: CA-6 Asignación inexistente</strong></p>
<p><em># cerrar() · RN-AS19</em></p>
<blockquote>
<p><strong>Dado</strong> que no existe la asignación 99</p>
<p><strong>Cuando</strong> solicita cerrar la asignación 99</p>
<p><strong>Entonces</strong> el sistema responde «La asignación no existe.»</p>
</blockquote>
<p><strong>Escenario: CA-7 La asignación cerrada no se elimina ni figura como vigente</strong></p>
<p><em># buscarPorId(), listarVigentes(), cerrar() · RN-AS15, RN-AS20</em></p>
<blockquote>
<p><strong>Dado</strong> que la asignación 1 fue cerrada</p>
<p><strong>Cuando</strong> consulta por ID_Asignacion 1</p>
<p><strong>Entonces</strong> ve la asignación con Estado_Asignacion Cerrada y sus demás datos intactos</p>
<p><strong>Y</strong> la asignación 1 ya no figura entre las asignaciones vigentes</p>
</blockquote></td>
</tr>
<tr class="even">
<td><strong>Origen de la necesidad</strong></td>
<td>Pregunta 14 y N-10: cambio automático de responsable en 5 de 19 y 7 más en «todas las anteriores»; Pregunta 9: «saber quién tiene cada equipo» en 9 de 19 (cuenta una respuesta que marcó todas las opciones). N-02 y N-10.</td>
</tr>
<tr class="odd">
<td><strong>RF derivados</strong></td>
<td>RF-21, RF-98, RF-99, RF-100, RF-101</td>
</tr>
<tr class="even">
<td><strong>Prioridad</strong></td>
<td>Media</td>
</tr>
</tbody>
</table>

*Nota: cerrar() es la operación de cierre: HU-24 (confirmarRecepcion) la invoca y HU-18 solo procede con una Devolucion Confirmada (CRF-003, cambios 2 y 5; sin métodos nuevos). En el flujo normal el cierre ocurre al confirmar la recepción; CA-1 describe la invocación directa por el Responsable (P-34). Es la baja por estado de la asignación (no usa activo): prioridad Media. Cifras contrastadas con 1.7.2.*

**Acta_De_Entrega — Anexo 4**

**HU-19 Firmar acta de entrega**

<table>
<colgroup>
<col style="width: 16%" />
<col style="width: 83%" />
</colgroup>
<thead>
<tr class="header">
<th><strong>Código</strong></th>
<th><strong>HU-19</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><strong>Título corto</strong></td>
<td>Firmar acta de entrega</td>
</tr>
<tr class="even">
<td><strong>Historia</strong></td>
<td><strong>Como</strong> Carlos Mejía, Empleado, <strong>quiero</strong> firmar el acta de entrega del equipo que recibí, <strong>para</strong> que la entrega quede respaldada por un acta firmada por quien lo recibe.</td>
</tr>
<tr class="odd">
<td><strong>Criterios de aceptación</strong></td>
<td><p><strong>Antecedentes</strong> (comunes a todos los escenarios)</p>
<blockquote>
<p><strong>Dado</strong> que Carlos Mejía, Empleado, inició sesión</p>
</blockquote>
<p><strong>Escenario: CA-1 Firmar el acta de una asignación vigente</strong></p>
<p><em># firmar() · RN-AC01, RN-AC02, RN-AC07, RN-AC08</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la asignación 1 Vigente del custodio 3 de Carlos Mejía y no tiene acta</p>
<p><strong>Cuando</strong> firma el acta con los datos:</p>
<p>│ Campo │ Valor │</p>
<p>├───────────────┼───────────────────────────┤</p>
<p>│ ID_Asignacion │ 1 │</p>
<p>│ Ruta_Acta │ actas/asignacion-0001.pdf │</p>
<p>│ Firma_Digital │ CODIGO-EJEMPLO-0001 │</p>
<p><strong>Entonces</strong> el sistema responde «Acta firmada correctamente.»</p>
<p><strong>Y</strong> el acta queda guardada con:</p>
<p>│ ID_Acta │ ID_Asignacion │ Fecha_Firma │ Ruta_Acta │ Firma_Digital │</p>
<p>├──────────────┼───────────────┼─────────────────────────┼───────────────────────────┼─────────────────────┤</p>
<p>│ (automático) │ 1 │ (fecha y hora actuales) │ actas/asignacion-0001.pdf │ CODIGO-EJEMPLO-0001 │</p>
<p><strong>Y</strong> ID_Acta y Fecha_Firma los asignó el sistema</p>
<p><strong>Y</strong> la asignación 1 conserva Estado_Asignacion Vigente</p>
</blockquote>
<p><strong>Esquema del escenario: CA-2 Datos obligatorios vacíos</strong></p>
<p><em># firmar() · RN-AC02</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la asignación 1 Vigente del custodio 3 de Carlos Mejía y no tiene acta</p>
<p><strong>Cuando</strong> firma el acta con &lt;campo&gt; vacío y los demás datos válidos</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> no se crea el acta</p>
<p><strong>Ejemplos:</strong></p>
<p>│ campo │ mensaje │</p>
<p>├───────────────┼────────────────────────────────────┤</p>
<p>│ ID_Asignacion │ «La asignación es obligatoria.» │</p>
<p>│ Ruta_Acta │ «La ruta del acta es obligatoria.» │</p>
<p>│ Firma_Digital │ «La firma digital es obligatoria.» │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-3 Longitud máxima aceptada y superada</strong></p>
<p><em># firmar() · RN-AC03, RN-AC08</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la asignación 1 Vigente del custodio 3 de Carlos Mejía y no tiene acta</p>
<p><strong>Cuando</strong> firma el acta con &lt;campo&gt; de &lt;valor&gt; y los demás datos válidos</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Ejemplos:</strong></p>
<p>│ campo │ valor │ longitud │ máximo │ mensaje │</p>
<p>├───────────────┼─────────────────────────┼──────────┼────────┼─────────────────────────────────────────────────────┤</p>
<p>│ Ruta_Acta │ texto de 255 caracteres │ 255 │ 255 │ «Acta firmada correctamente.» │</p>
<p>│ Ruta_Acta │ texto de 256 caracteres │ 256 │ 255 │ «La ruta del acta no puede superar 255 caracteres.» │</p>
<p>│ Firma_Digital │ texto de 255 caracteres │ 255 │ 255 │ «Acta firmada correctamente.» │</p>
<p>│ Firma_Digital │ texto de 256 caracteres │ 256 │ 255 │ «La firma digital no puede superar 255 caracteres.» │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-4 Asignación inexistente o no vigente</strong></p>
<p><em># firmar() · RN-AC04, RN-AC05</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la asignación 3 con Estado_Asignacion Cerrada y no existe la asignación 99</p>
<p><strong>Cuando</strong> firma el acta de la asignación &lt;id&gt; con los demás datos válidos</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> no se crea el acta</p>
<p><strong>Ejemplos:</strong></p>
<p>│ id │ caso │ mensaje │</p>
<p>├────┼───────────┼───────────────────────────────────────────────────────────┤</p>
<p>│ 99 │ no existe │ «La asignación no existe.» │</p>
<p>│ 3 │ Cerrada │ «Solo se puede firmar el acta de una asignación vigente.» │</p>
</blockquote>
<p><strong>Escenario: CA-5 Asignación que ya tiene un acta</strong></p>
<p><em># existeActaDeAsignacion(), firmar() · RN-AC06</em></p>
<blockquote>
<p><strong>Dado</strong> que la asignación 1 Vigente del custodio 3 de Carlos Mejía ya tiene el acta:</p>
<p>│ ID_Acta │ ID_Asignacion │ Fecha_Firma │ Ruta_Acta │ Firma_Digital │</p>
<p>├─────────┼───────────────┼──────────────────┼───────────────────────────┼─────────────────────┤</p>
<p>│ 1 │ 1 │ 2026-10-01 10:30 │ actas/asignacion-0001.pdf │ CODIGO-EJEMPLO-0001 │</p>
<p><strong>Cuando</strong> firma otra acta de la asignación 1 con datos válidos</p>
<p><strong>Entonces</strong> el sistema responde «La asignación ya tiene un acta.»</p>
<p><strong>Y</strong> no se crea otra acta y el acta 1 conserva sus datos</p>
</blockquote>
<p><strong>Escenario: CA-6 Solo el custodio de la asignación firma su acta</strong></p>
<p><em># firmar() · RN-AC07</em></p>
<blockquote>
<p><strong>Dado</strong> que Carlos Mejía es el custodio 3 y existe la asignación 2 Vigente del custodio 1 sin acta</p>
<p><strong>Cuando</strong> intenta firmar el acta de la asignación 2 con datos válidos</p>
<p><strong>Entonces</strong> el sistema responde «Solo el custodio de la asignación puede firmar su acta.»</p>
<p><strong>Y</strong> no se crea el acta</p>
</blockquote></td>
</tr>
<tr class="even">
<td><strong>Origen de la necesidad</strong></td>
<td>Pregunta 10: firma del acta al entregar un equipo: sí 11, a veces 3, no 4, no sabe si existe el proceso 1; Pregunta 14: acta digital firmada en 2 de 19 y 7 más en «todas las anteriores». N-05.</td>
</tr>
<tr class="odd">
<td><strong>RF derivados</strong></td>
<td>RF-22, RF-102, RF-103, RF-104, RF-105</td>
</tr>
<tr class="even">
<td><strong>Prioridad</strong></td>
<td>Alta</td>
</tr>
</tbody>
</table>

*Nota: HU de proceso; prioridad Alta porque N-05 exige que toda entrega quede respaldada por un acta firmada. Quien firma es el custodio (el «receptor» de Firma_Digital; en Devolucion.ID_Receptor el receptor es el Responsable de Activos). Los valores de Ruta_Acta y Firma_Digital son datos de ejemplo: el algoritmo del código de validación y quién lo genera no están definidos (P-38), ni cómo llega el archivo del acta (P-39). Cifras contrastadas con 1.7.2.*

**HU-20 Consultar acta de entrega**

<table>
<colgroup>
<col style="width: 16%" />
<col style="width: 83%" />
</colgroup>
<thead>
<tr class="header">
<th><strong>Código</strong></th>
<th><strong>HU-20</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><strong>Título corto</strong></td>
<td>Consultar acta de entrega</td>
</tr>
<tr class="even">
<td><strong>Historia</strong></td>
<td><strong>Como</strong> Carlos Mejía, Empleado, <strong>quiero</strong> consultar el acta de entrega de mi asignación, <strong>para</strong> tener la constancia de lo que recibí y de cuándo la firmé.</td>
</tr>
<tr class="odd">
<td><strong>Criterios de aceptación</strong></td>
<td><p><strong>Antecedentes</strong> (comunes a todos los escenarios)</p>
<blockquote>
<p><strong>Dado</strong> que Carlos Mejía, Empleado, inició sesión</p>
</blockquote>
<p><strong>Escenario: CA-1 Consultar el acta de una asignación vigente</strong></p>
<p><em># buscarPorAsignacion() · RN-AC09</em></p>
<blockquote>
<p><strong>Dado</strong> que la asignación 1 Vigente del custodio 3 de Carlos Mejía tiene el acta:</p>
<p>│ ID_Acta │ ID_Asignacion │ Fecha_Firma │ Ruta_Acta │ Firma_Digital │</p>
<p>├─────────┼───────────────┼──────────────────┼───────────────────────────┼─────────────────────┤</p>
<p>│ 1 │ 1 │ 2026-10-01 10:30 │ actas/asignacion-0001.pdf │ CODIGO-EJEMPLO-0001 │</p>
<p><strong>Cuando</strong> consulta el acta de la asignación 1</p>
<p><strong>Entonces</strong> ve el acta con sus 5 campos: ID_Acta 1, ID_Asignacion 1, Fecha_Firma 2026-10-01 10:30, Ruta_Acta actas/asignacion-0001.pdf y Firma_Digital CODIGO-EJEMPLO-0001</p>
<p><strong>Y</strong> la consulta no modifica el acta</p>
</blockquote>
<p><strong>Escenario: CA-2 Consultar el acta de una asignación cerrada</strong></p>
<p><em># buscarPorAsignacion() · RN-AC09</em></p>
<blockquote>
<p><strong>Dado</strong> que la asignación 3 del custodio 3 de Carlos Mejía está Cerrada y tiene el acta:</p>
<p>│ ID_Acta │ ID_Asignacion │ Fecha_Firma │ Ruta_Acta │ Firma_Digital │</p>
<p>├─────────┼───────────────┼──────────────────┼───────────────────────────┼─────────────────────┤</p>
<p>│ 2 │ 3 │ 2026-08-20 11:00 │ actas/asignacion-0003.pdf │ CODIGO-EJEMPLO-0003 │</p>
<p><strong>Cuando</strong> consulta el acta de la asignación 3</p>
<p><strong>Entonces</strong> ve el acta con sus 5 campos: ID_Acta 2, ID_Asignacion 3, Fecha_Firma 2026-08-20 11:00, Ruta_Acta actas/asignacion-0003.pdf y Firma_Digital CODIGO-EJEMPLO-0003</p>
</blockquote>
<p><strong>Escenario: CA-3 Asignación sin acta</strong></p>
<p><em># buscarPorAsignacion() · RN-AC09</em></p>
<blockquote>
<p><strong>Dado</strong> que la asignación 1 Vigente del custodio 3 de Carlos Mejía no tiene acta</p>
<p><strong>Cuando</strong> consulta el acta de la asignación 1</p>
<p><strong>Entonces</strong> el sistema responde «La asignación aún no tiene acta.»</p>
</blockquote>
<p><strong>Escenario: CA-4 Asignación inexistente</strong></p>
<p><em># buscarPorAsignacion() · RN-AC09</em></p>
<blockquote>
<p><strong>Dado</strong> que no existe la asignación 99</p>
<p><strong>Cuando</strong> consulta el acta de la asignación 99</p>
<p><strong>Entonces</strong> el sistema responde «La asignación no existe.»</p>
</blockquote>
<p><strong>Escenario: CA-5 Acta de la asignación de otro custodio</strong></p>
<p><em># buscarPorAsignacion() · RN-AC10</em></p>
<blockquote>
<p><strong>Dado</strong> que Carlos Mejía es el custodio 3 y la asignación 2 del custodio 1 tiene el acta 3</p>
<p><strong>Cuando</strong> consulta el acta de la asignación 2</p>
<p><strong>Entonces</strong> el sistema responde «No tiene acceso a esa acta.»</p>
<p><strong>Y</strong> no se muestra ningún dato del acta</p>
</blockquote></td>
</tr>
<tr class="even">
<td><strong>Origen de la necesidad</strong></td>
<td>Pregunta 10: firma del acta al entregar un equipo: sí 11, a veces 3, no 4, no sabe si existe el proceso 1; Pregunta 14: acta digital firmada en 2 de 19 y 7 más en «todas las anteriores». N-05.</td>
</tr>
<tr class="odd">
<td><strong>RF derivados</strong></td>
<td>RF-23, RF-106</td>
</tr>
<tr class="even">
<td><strong>Prioridad</strong></td>
<td>Alta</td>
</tr>
</tbody>
</table>

*Nota: El Empleado consulta la suya (RN-AC10, propuesta); quién más consulta actas sigue abierto (P-40). Cifras contrastadas con 1.7.2.*

**Devolucion — Anexo 5**

**HU-21 Registrar devolución de un equipo**

<table>
<colgroup>
<col style="width: 16%" />
<col style="width: 83%" />
</colgroup>
<thead>
<tr class="header">
<th><strong>Código</strong></th>
<th><strong>HU-21</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><strong>Título corto</strong></td>
<td>Registrar devolución de un equipo</td>
</tr>
<tr class="even">
<td><strong>Historia</strong></td>
<td><strong>Como</strong> Carlos Mejía, Empleado, <strong>quiero</strong> registrar la devolución del equipo que tengo asignado, con mis observaciones, <strong>para</strong> dejar constancia de que lo devolví y que el Responsable de Activos pueda confirmar su recepción.</td>
</tr>
<tr class="odd">
<td><strong>Criterios de aceptación</strong></td>
<td><p><strong>Antecedentes</strong> (comunes a todos los escenarios)</p>
<blockquote>
<p><strong>Dado</strong> que Carlos Mejía, Empleado, inició sesión</p>
</blockquote>
<p><strong>Escenario: CA-1 Registrar la devolución de una asignación vigente con todos los datos</strong></p>
<p><em># registrar() · RN-D01, RN-D02, RN-D07, RN-D08, RN-D10</em></p>
<blockquote>
<p><strong>Dado</strong> que la fecha actual es 2026-10-06 y existe la asignación 1 Vigente del custodio 3 de Carlos Mejía, sin devolución:</p>
<p>│ ID_Asignacion │ Fecha_Entrega │ Fecha_Devolucion_Esperada │ Estado_Asignacion │ ID_Custodio │ ID_Activo │ ID_Solicitud │</p>
<p>├───────────────┼───────────────┼───────────────────────────┼───────────────────┼─────────────┼───────────┼──────────────┤</p>
<p>│ 1 │ 2026-10-01 │ 2026-10-31 │ Vigente │ 3 │ 5 │ 2 │</p>
<p><strong>Y</strong> que el activo 5 está en Estado Asignado</p>
<p><strong>Cuando</strong> registra la devolución con los datos:</p>
<p>│ Campo │ Valor │</p>
<p>├───────────────┼──────────────────────┤</p>
<p>│ ID_Asignacion │ 1 │</p>
<p>│ Observaciones │ Con cargador y funda │</p>
<p><strong>Entonces</strong> el sistema responde «Devolución registrada correctamente.»</p>
<p><strong>Y</strong> la devolución queda guardada con:</p>
<p>│ ID_Devolucion │ Fecha_Devolucion │ Observaciones │ ID_Asignacion │ Estado_Recepcion │ Fecha_Confirmacion │ ID_Receptor │</p>
<p>├───────────────┼─────────────────────────┼──────────────────────┼───────────────┼──────────────────┼────────────────────┼─────────────┤</p>
<p>│ (automático) │ (fecha y hora actuales) │ Con cargador y funda │ 1 │ Pendiente │ (vacío) │ (vacío) │</p>
<p><strong>Y</strong> ID_Devolucion, Fecha_Devolucion y Estado_Recepcion los asignó el sistema, y Fecha_Confirmacion e ID_Receptor quedan vacíos hasta que se confirme la recepción</p>
<p><strong>Y</strong> la asignación 1 conserva Estado_Asignacion Vigente y el activo 5 conserva Estado Asignado (se cierran al confirmar la recepción)</p>
</blockquote>
<p><strong>Escenario: CA-2 Registrar la devolución sin observaciones</strong></p>
<p><em># registrar() · RN-D02, RN-D08</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la asignación 1 Vigente del custodio 3 de Carlos Mejía y no tiene devolución</p>
<p><strong>Cuando</strong> registra la devolución de la asignación 1 sin Observaciones</p>
<p><strong>Entonces</strong> el sistema responde «Devolución registrada correctamente.»</p>
<p><strong>Y</strong> la devolución queda con Observaciones vacía, Estado_Recepcion Pendiente, Fecha_Confirmacion vacía e ID_Receptor vacío</p>
</blockquote>
<p><strong>Escenario: CA-3 ID_Asignacion vacío</strong></p>
<p><em># registrar() · RN-D02</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la asignación 1 Vigente del custodio 3 de Carlos Mejía y no tiene devolución</p>
<p><strong>Cuando</strong> registra una devolución con ID_Asignacion vacío y Observaciones Con cargador y funda</p>
<p><strong>Entonces</strong> el sistema responde «La asignación es obligatoria.»</p>
<p><strong>Y</strong> no se crea la devolución</p>
</blockquote>
<p><strong>Esquema del escenario: CA-4 Longitud máxima de las observaciones aceptada y superada</strong></p>
<p><em># registrar() · RN-D03</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la asignación 1 Vigente del custodio 3 de Carlos Mejía y no tiene devolución</p>
<p><strong>Cuando</strong> registra la devolución de la asignación 1 con Observaciones de &lt;valor&gt;</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Ejemplos:</strong></p>
<p>│ campo │ valor │ longitud │ máximo │ mensaje │</p>
<p>├───────────────┼─────────────────────────┼──────────┼────────┼───────────────────────────────────────────────────────┤</p>
<p>│ Observaciones │ texto de 255 caracteres │ 255 │ 255 │ «Devolución registrada correctamente.» │</p>
<p>│ Observaciones │ texto de 256 caracteres │ 256 │ 255 │ «Las observaciones no pueden superar 255 caracteres.» │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-5 Asignación inexistente o no vigente</strong></p>
<p><em># registrar() · RN-D04, RN-D05</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la asignación 3 con Estado_Asignacion Cerrada, del custodio 3 de Carlos Mejía, y no existe la asignación 99</p>
<p><strong>Cuando</strong> registra la devolución de la asignación &lt;id&gt; con datos válidos</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> no se crea la devolución</p>
<p><strong>Ejemplos:</strong></p>
<p>│ id │ caso │ mensaje │</p>
<p>├────┼───────────┼────────────────────────────────────────────────────────────────────┤</p>
<p>│ 99 │ no existe │ «La asignación no existe.» │</p>
<p>│ 3 │ Cerrada │ «Solo se puede registrar la devolución de una asignación vigente.» │</p>
</blockquote>
<p><strong>Escenario: CA-6 Asignación que ya tiene una devolución</strong></p>
<p><em># existeDevolucionDeAsignacion(), registrar() · RN-D06</em></p>
<blockquote>
<p><strong>Dado</strong> que la asignación 1 Vigente del custodio 3 de Carlos Mejía ya tiene la devolución:</p>
<p>│ ID_Devolucion │ Fecha_Devolucion │ Observaciones │ ID_Asignacion │ Estado_Recepcion │ Fecha_Confirmacion │ ID_Receptor │</p>
<p>├───────────────┼──────────────────┼──────────────────────┼───────────────┼──────────────────┼────────────────────┼─────────────┤</p>
<p>│ 1 │ 2026-10-05 16:40 │ Con cargador y funda │ 1 │ Pendiente │ (vacío) │ (vacío) │</p>
<p><strong>Cuando</strong> registra otra devolución de la asignación 1 con datos válidos</p>
<p><strong>Entonces</strong> el sistema responde «La asignación ya tiene una devolución.»</p>
<p><strong>Y</strong> no se crea otra devolución y la devolución 1 conserva sus datos</p>
</blockquote>
<p><strong>Escenario: CA-7 Solo el custodio de la asignación registra su devolución</strong></p>
<p><em># registrar() · RN-D07</em></p>
<blockquote>
<p><strong>Dado</strong> que Carlos Mejía es el custodio 3 y existe la asignación 2 Vigente del custodio 1, sin devolución</p>
<p><strong>Cuando</strong> intenta registrar la devolución de la asignación 2 con datos válidos</p>
<p><strong>Entonces</strong> el sistema responde «Solo el custodio de la asignación puede registrar su devolución.»</p>
<p><strong>Y</strong> no se crea la devolución</p>
</blockquote></td>
</tr>
<tr class="even">
<td><strong>Origen de la necesidad</strong></td>
<td>Pregunta 11 de la encuesta: la fecha de entrega es el dato más relevante para 6 de 19; Pregunta 13: una respuesta pide registro fácil de préstamos; Pregunta 12: una respuesta señala confusión en las entregas. N-06.</td>
</tr>
<tr class="odd">
<td><strong>RF derivados</strong></td>
<td>RF-24, RF-107, RF-108, RF-109, RF-110, RF-162</td>
</tr>
<tr class="even">
<td><strong>Prioridad</strong></td>
<td>Alta</td>
</tr>
</tbody>
</table>

*Nota: HU de proceso: sin el registro de la devolución no hay nada que confirmar, por eso la prioridad es Alta. Quien devuelve es el custodio de la asignación, el Empleado (RN-D07, Supuesto; P-42). Registrar no cierra la asignación ni cambia el activo: eso ocurre al confirmar la recepción (HU-24; CRF-003, cambios 2 y 5, propuesta, sin aplicar). Sin reglas de devolución tardía: las fuentes no las definen y registrar() no compara Fecha_Devolucion con Fecha_Devolucion_Esperada (P-43). Una devolución por asignación es una RN propuesta (CRF-002, cambio 0.7). La encuesta no pregunta por la devolución: el respaldo de N-06 es indirecto (la fecha de entrega). Cifras contrastadas con 1.7.2.*

**HU-22 Consultar devoluciones**

<table>
<colgroup>
<col style="width: 16%" />
<col style="width: 83%" />
</colgroup>
<thead>
<tr class="header">
<th><strong>Código</strong></th>
<th><strong>HU-22</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><strong>Título corto</strong></td>
<td>Consultar devoluciones</td>
</tr>
<tr class="even">
<td><strong>Historia</strong></td>
<td><strong>Como</strong> Marta Rojas, Responsable de Activos, <strong>quiero</strong> consultar una devolución por su identificador y ver las devoluciones pendientes de recepción, <strong>para</strong> saber qué equipos devueltos debo confirmar.</td>
</tr>
<tr class="odd">
<td><strong>Criterios de aceptación</strong></td>
<td><p><strong>Antecedentes</strong> (comunes a todos los escenarios)</p>
<blockquote>
<p><strong>Dado</strong> que Marta Rojas, Responsable de Activos, inició sesión</p>
</blockquote>
<p><strong>Escenario: CA-1 Consultar una devolución por su identificador</strong></p>
<p><em># buscarPorId() · RN-D18</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la devolución:</p>
<p>│ ID_Devolucion │ Fecha_Devolucion │ Observaciones │ ID_Asignacion │ Estado_Recepcion │ Fecha_Confirmacion │ ID_Receptor │</p>
<p>├───────────────┼──────────────────┼──────────────────────┼───────────────┼──────────────────┼────────────────────┼─────────────┤</p>
<p>│ 1 │ 2026-10-05 16:40 │ Con cargador y funda │ 1 │ Pendiente │ (vacío) │ (vacío) │</p>
<p><strong>Cuando</strong> consulta por ID_Devolucion 1</p>
<p><strong>Entonces</strong> ve la devolución con sus 7 campos: ID_Devolucion 1, Fecha_Devolucion 2026-10-05 16:40, Observaciones Con cargador y funda, ID_Asignacion 1, Estado_Recepcion Pendiente, Fecha_Confirmacion vacía e ID_Receptor vacío</p>
<p><strong>Y</strong> la consulta no modifica la devolución</p>
</blockquote>
<p><strong>Escenario: CA-2 Consultar una devolución confirmada</strong></p>
<p><em># buscarPorId() · RN-D13, RN-D18</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la devolución:</p>
<p>│ ID_Devolucion │ Fecha_Devolucion │ Observaciones │ ID_Asignacion │ Estado_Recepcion │ Fecha_Confirmacion │ ID_Receptor │</p>
<p>├───────────────┼──────────────────┼───────────────┼───────────────┼──────────────────┼────────────────────┼─────────────┤</p>
<p>│ 3 │ 2026-09-18 15:20 │ Sin novedad │ 3 │ Confirmada │ 2026-09-19 09:10 │ 2 │</p>
<p><strong>Cuando</strong> consulta por ID_Devolucion 3</p>
<p><strong>Entonces</strong> ve la devolución con sus 7 campos: ID_Devolucion 3, Fecha_Devolucion 2026-09-18 15:20, Observaciones Sin novedad, ID_Asignacion 3, Estado_Recepcion Confirmada, Fecha_Confirmacion 2026-09-19 09:10 e ID_Receptor 2</p>
</blockquote>
<p><strong>Escenario: CA-3 Devolución no encontrada</strong></p>
<p><em># buscarPorId() · RN-D18</em></p>
<blockquote>
<p><strong>Dado</strong> que no existe la devolución 99</p>
<p><strong>Cuando</strong> consulta por ID_Devolucion 99</p>
<p><strong>Entonces</strong> el sistema responde «No se encontró ninguna devolución con ese identificador.»</p>
<p><strong>Y</strong> no se muestra ninguna devolución</p>
</blockquote>
<p><strong>Escenario: CA-4 Ver las devoluciones pendientes de recepción</strong></p>
<p><em># listarPendientesDeRecepcion() · RN-D19</em></p>
<blockquote>
<p><strong>Dado</strong> que existen las devoluciones:</p>
<p>│ ID_Devolucion │ Fecha_Devolucion │ Observaciones │ ID_Asignacion │ Estado_Recepcion │ Fecha_Confirmacion │ ID_Receptor │</p>
<p>├───────────────┼──────────────────┼──────────────────────┼───────────────┼──────────────────┼────────────────────┼─────────────┤</p>
<p>│ 1 │ 2026-10-05 16:40 │ Con cargador y funda │ 1 │ Pendiente │ (vacío) │ (vacío) │</p>
<p>│ 2 │ 2026-10-04 11:05 │ Rayón en la tapa │ 2 │ Pendiente │ (vacío) │ (vacío) │</p>
<p>│ 3 │ 2026-09-18 15:20 │ Sin novedad │ 3 │ Confirmada │ 2026-09-19 09:10 │ 2 │</p>
<p><strong>Cuando</strong> consulta las devoluciones pendientes de recepción</p>
<p><strong>Entonces</strong> ve solo las devoluciones 2 y 1, con sus 7 campos, de la más antigua a la más reciente por Fecha_Devolucion, aunque su ID_Devolucion no siga ese orden:</p>
<p>│ ID_Devolucion │ Fecha_Devolucion │ Observaciones │ ID_Asignacion │ Estado_Recepcion │ Fecha_Confirmacion │ ID_Receptor │</p>
<p>├───────────────┼──────────────────┼──────────────────────┼───────────────┼──────────────────┼────────────────────┼─────────────┤</p>
<p>│ 2 │ 2026-10-04 11:05 │ Rayón en la tapa │ 2 │ Pendiente │ (vacío) │ (vacío) │</p>
<p>│ 1 │ 2026-10-05 16:40 │ Con cargador y funda │ 1 │ Pendiente │ (vacío) │ (vacío) │</p>
<p><strong>Y</strong> no ve la devolución 3, que está Confirmada</p>
</blockquote>
<p><strong>Escenario: CA-5 Sin devoluciones pendientes de recepción</strong></p>
<p><em># listarPendientesDeRecepcion() · RN-D19</em></p>
<blockquote>
<p><strong>Dado</strong> que la única devolución es la 3, con Estado_Recepcion Confirmada</p>
<p><strong>Cuando</strong> consulta las devoluciones pendientes de recepción</p>
<p><strong>Entonces</strong> el sistema responde «No hay devoluciones pendientes de recepción.»</p>
</blockquote>
<p><strong>Escenario: CA-6 Ver las propias devoluciones pendientes (actor secundario: Empleado)</strong></p>
<p><em># listarPendientesDeRecepcion() · RN-D19, RN-D20, RN-D21</em></p>
<blockquote>
<p><strong>Dado</strong> que quien consulta es Carlos Mejía, Empleado, en lugar del Responsable de Activos</p>
<p><strong>Y</strong> que la asignación 1 es del custodio 3 de Carlos Mejía, la asignación 2 es del custodio 1 y existen las devoluciones:</p>
<p>│ ID_Devolucion │ Fecha_Devolucion │ Observaciones │ ID_Asignacion │ Estado_Recepcion │ Fecha_Confirmacion │ ID_Receptor │</p>
<p>├───────────────┼──────────────────┼──────────────────────┼───────────────┼──────────────────┼────────────────────┼─────────────┤</p>
<p>│ 1 │ 2026-10-05 16:40 │ Con cargador y funda │ 1 │ Pendiente │ (vacío) │ (vacío) │</p>
<p>│ 2 │ 2026-10-04 11:05 │ Rayón en la tapa │ 2 │ Pendiente │ (vacío) │ (vacío) │</p>
<p><strong>Cuando</strong> consulta sus devoluciones pendientes de recepción</p>
<p><strong>Entonces</strong> ve solo la devolución 1, con sus 7 campos:</p>
<p>│ ID_Devolucion │ Fecha_Devolucion │ Observaciones │ ID_Asignacion │ Estado_Recepcion │ Fecha_Confirmacion │ ID_Receptor │</p>
<p>├───────────────┼──────────────────┼──────────────────────┼───────────────┼──────────────────┼────────────────────┼─────────────┤</p>
<p>│ 1 │ 2026-10-05 16:40 │ Con cargador y funda │ 1 │ Pendiente │ (vacío) │ (vacío) │</p>
<p><strong>Y</strong> no ve la devolución 2, que es de la asignación de otro custodio</p>
<p><em>Actor secundario: el Empleado consulta las devoluciones de sus asignaciones (RN-D20, propuesta; P-42).</em></p>
</blockquote>
<p><strong>Escenario: CA-7 Devolución de otro custodio</strong></p>
<p><em># buscarPorId() · RN-D20</em></p>
<blockquote>
<p><strong>Dado</strong> que quien consulta es Carlos Mejía (custodio 3), en lugar del Responsable de Activos, y existe la devolución 2 de la asignación 2, del custodio 1</p>
<p><strong>Cuando</strong> consulta por ID_Devolucion 2</p>
<p><strong>Entonces</strong> el sistema responde «No tiene acceso a esa devolución.»</p>
<p><strong>Y</strong> no se muestra ningún dato de la devolución 2</p>
</blockquote></td>
</tr>
<tr class="even">
<td><strong>Origen de la necesidad</strong></td>
<td>Pregunta 11 de la encuesta: la fecha de entrega es el dato más relevante para 6 de 19; Pregunta 12: una respuesta señala confusión en las entregas. Alcance 1.2 («confirmar su recepción por parte del responsable de activos»). N-06.</td>
</tr>
<tr class="odd">
<td><strong>RF derivados</strong></td>
<td>RF-25, RF-111, RF-112</td>
</tr>
<tr class="even">
<td><strong>Prioridad</strong></td>
<td>Alta</td>
</tr>
</tbody>
</table>

*Nota: HU-22 agrupa dos actores: el Responsable de Activos es el rol principal y el Empleado consulta las devoluciones de sus asignaciones como actor secundario (CA-6 y CA-7; RN-D20 y RN-D21, propuestas). listarPendientesDeRecepcion() alimenta HU-24: lo pendiente es lo que el Responsable debe confirmar; por eso la prioridad es Alta. Orden del listado: propuesta. Cifras contrastadas con 1.7.2.*

**HU-23 Actualizar devolución**

<table>
<colgroup>
<col style="width: 16%" />
<col style="width: 83%" />
</colgroup>
<thead>
<tr class="header">
<th><strong>Código</strong></th>
<th><strong>HU-23</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><strong>Título corto</strong></td>
<td>Actualizar devolución</td>
</tr>
<tr class="even">
<td><strong>Historia</strong></td>
<td><strong>Como</strong> Carlos Mejía, Empleado, <strong>quiero</strong> corregir las observaciones de la devolución que registré mientras su recepción no haya sido confirmada, <strong>para</strong> que el Responsable de Activos reciba el equipo con la información correcta.</td>
</tr>
<tr class="odd">
<td><strong>Criterios de aceptación</strong></td>
<td><p><strong>Antecedentes</strong> (comunes a todos los escenarios)</p>
<blockquote>
<p><strong>Dado</strong> que Carlos Mejía, Empleado, inició sesión</p>
</blockquote>
<p><strong>Escenario: CA-1 Actualizar las observaciones de una devolución pendiente</strong></p>
<p><em># actualizar() · RN-D01, RN-D11</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la devolución 1 Pendiente de la asignación 1 del custodio 3 de Carlos Mejía, con los valores de la columna Antes</p>
<p><strong>Cuando</strong> actualiza la devolución 1 con los valores de la columna Después:</p>
<p>│ Campo │ Antes │ Después │</p>
<p>├────────────────────┼──────────────────────┼───────────────────────────────┤</p>
<p>│ ID_Devolucion │ 1 │ 1 (sin cambio) │</p>
<p>│ Fecha_Devolucion │ 2026-10-05 16:40 │ 2026-10-05 16:40 (sin cambio) │</p>
<p>│ Observaciones │ Con cargador y funda │ Con cargador, funda y mouse │</p>
<p>│ ID_Asignacion │ 1 │ 1 (sin cambio) │</p>
<p>│ Estado_Recepcion │ Pendiente │ Pendiente (sin cambio) │</p>
<p>│ Fecha_Confirmacion │ (vacío) │ (vacío) (sin cambio) │</p>
<p>│ ID_Receptor │ (vacío) │ (vacío) (sin cambio) │</p>
<p><strong>Entonces</strong> el sistema responde «Devolución actualizada correctamente.»</p>
<p><strong>Y</strong> la devolución 1 queda con los valores de la columna Después</p>
</blockquote>
<p><strong>Escenario: CA-2 Dejar vacías las observaciones</strong></p>
<p><em># actualizar() · RN-D02, RN-D11</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la devolución 1 Pendiente de la asignación 1 del custodio 3 de Carlos Mejía, con Observaciones Con cargador y funda</p>
<p><strong>Cuando</strong> actualiza la devolución 1 dejando la Observaciones vacía</p>
<p><strong>Entonces</strong> el sistema responde «Devolución actualizada correctamente.»</p>
<p><strong>Y</strong> la devolución 1 queda con Observaciones vacía y los demás datos sin cambio</p>
</blockquote>
<p><strong>Esquema del escenario: CA-3 Longitud máxima de las observaciones aceptada y superada</strong></p>
<p><em># actualizar() · RN-D03, RN-D11</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la devolución 1 Pendiente de la asignación 1 del custodio 3 de Carlos Mejía</p>
<p><strong>Cuando</strong> actualiza la devolución 1 con Observaciones de &lt;valor&gt;</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Ejemplos:</strong></p>
<p>│ campo │ valor │ longitud │ máximo │ mensaje │</p>
<p>├───────────────┼─────────────────────────┼──────────┼────────┼───────────────────────────────────────────────────────┤</p>
<p>│ Observaciones │ texto de 255 caracteres │ 255 │ 255 │ «Devolución actualizada correctamente.» │</p>
<p>│ Observaciones │ texto de 256 caracteres │ 256 │ 255 │ «Las observaciones no pueden superar 255 caracteres.» │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-4 Campos que no se modifican</strong></p>
<p><em># actualizar() · RN-D01, RN-D09, RN-D11</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la devolución:</p>
<p>│ ID_Devolucion │ Fecha_Devolucion │ Observaciones │ ID_Asignacion │ Estado_Recepcion │ Fecha_Confirmacion │ ID_Receptor │</p>
<p>├───────────────┼──────────────────┼──────────────────────┼───────────────┼──────────────────┼────────────────────┼─────────────┤</p>
<p>│ 1 │ 2026-10-05 16:40 │ Con cargador y funda │ 1 │ Pendiente │ (vacío) │ (vacío) │</p>
<p><strong>Cuando</strong> intenta cambiar el &lt;campo&gt; de la devolución 1 a &lt;valor&gt;</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> la devolución 1 conserva sus datos anteriores</p>
<p><strong>Ejemplos:</strong></p>
<p>│ campo │ valor │ mensaje │</p>
<p>├────────────────────┼──────────────────┼────────────────────────────────────────────────────────────┤</p>
<p>│ ID_Devolucion │ 10 │ «El identificador de la devolución no se puede modificar.» │</p>
<p>│ Fecha_Devolucion │ 2026-10-07 09:00 │ «La fecha de devolución no se puede modificar.» │</p>
<p>│ ID_Asignacion │ 2 │ «La asignación de la devolución no se puede modificar.» │</p>
<p>│ Estado_Recepcion │ Confirmada │ «El estado de la recepción solo cambia al confirmarla.» │</p>
<p>│ Fecha_Confirmacion │ 2026-10-06 10:00 │ «La fecha de confirmación no se puede modificar.» │</p>
<p>│ ID_Receptor │ 2 │ «El receptor de la devolución no se puede modificar.» │</p>
</blockquote>
<p><strong>Escenario: CA-5 Devolución confirmada no editable</strong></p>
<p><em># actualizar() · RN-D11</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la devolución 3 Confirmada de la asignación 3 del custodio 3 de Carlos Mejía, con Observaciones Sin novedad</p>
<p><strong>Cuando</strong> intenta actualizar sus Observaciones a Con rayones</p>
<p><strong>Entonces</strong> el sistema responde «Una devolución confirmada no se puede modificar.»</p>
<p><strong>Y</strong> la devolución 3 conserva sus datos anteriores</p>
</blockquote>
<p><strong>Escenario: CA-6 Devolución inexistente</strong></p>
<p><em># actualizar() · RN-D18</em></p>
<blockquote>
<p><strong>Dado</strong> que no existe la devolución 99</p>
<p><strong>Cuando</strong> actualiza la devolución 99 con Observaciones Con cargador</p>
<p><strong>Entonces</strong> el sistema responde «La devolución no existe.»</p>
</blockquote>
<p><strong>Escenario: CA-7 Solo el custodio de la asignación actualiza su devolución</strong></p>
<p><em># actualizar() · RN-D12</em></p>
<blockquote>
<p><strong>Dado</strong> que Carlos Mejía es el custodio 3 y existe la devolución 2 Pendiente de la asignación 2, del custodio 1</p>
<p><strong>Cuando</strong> intenta actualizar las Observaciones de la devolución 2 a Con cargador</p>
<p><strong>Entonces</strong> el sistema responde «Solo el custodio de la asignación puede actualizar su devolución.»</p>
<p><strong>Y</strong> la devolución 2 conserva sus datos anteriores</p>
</blockquote></td>
</tr>
<tr class="even">
<td><strong>Origen de la necesidad</strong></td>
<td>Pregunta 11 de la encuesta: la fecha de entrega es el dato más relevante para 6 de 19; Pregunta 12: una respuesta señala confusión en las entregas. N-06.</td>
</tr>
<tr class="odd">
<td><strong>RF derivados</strong></td>
<td>RF-26, RF-113, RF-114</td>
</tr>
<tr class="even">
<td><strong>Prioridad</strong></td>
<td>Media</td>
</tr>
</tbody>
</table>

*Nota: La Fase A v6 describe actualizar() como «corrige las observaciones de una devolución» y propone que solo proceda mientras la recepción está Pendiente; por eso solo se actualizan las Observaciones y las demás columnas no se modifican (RN-D11, propuesta; P-49). Una devolución Confirmada es un registro cerrado: no se actualiza. Prioridad Media: corregir una observación no detiene el proceso. Cifras contrastadas con 1.7.2.*

**HU-24 Confirmar recepción de una devolución**

<table>
<colgroup>
<col style="width: 16%" />
<col style="width: 83%" />
</colgroup>
<thead>
<tr class="header">
<th><strong>Código</strong></th>
<th><strong>HU-24</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><strong>Título corto</strong></td>
<td>Confirmar recepción de una devolución</td>
</tr>
<tr class="even">
<td><strong>Historia</strong></td>
<td><strong>Como</strong> Marta Rojas, Responsable de Activos, <strong>quiero</strong> confirmar la recepción de un equipo devuelto, conociendo antes la consecuencia, <strong>para</strong> dejar registrado que lo recibí, cerrar su asignación y que el equipo vuelva a estar disponible.</td>
</tr>
<tr class="odd">
<td><strong>Criterios de aceptación</strong></td>
<td><p><strong>Antecedentes</strong> (comunes a todos los escenarios)</p>
<blockquote>
<p><strong>Dado</strong> que Marta Rojas, Responsable de Activos, inició sesión</p>
</blockquote>
<p><strong>Escenario: CA-1 Confirmar la recepción con confirmación</strong></p>
<p><em># confirmarRecepcion() · RN-D09, RN-D13, RN-D14, RN-D15, RN-D16</em></p>
<blockquote>
<p><strong>Dado</strong> que la fecha actual es 2026-10-06, Marta Rojas es el usuario 2 y existe la devolución:</p>
<p>│ ID_Devolucion │ Fecha_Devolucion │ Observaciones │ ID_Asignacion │ Estado_Recepcion │ Fecha_Confirmacion │ ID_Receptor │</p>
<p>├───────────────┼──────────────────┼──────────────────────┼───────────────┼──────────────────┼────────────────────┼─────────────┤</p>
<p>│ 1 │ 2026-10-05 16:40 │ Con cargador y funda │ 1 │ Pendiente │ (vacío) │ (vacío) │</p>
<p><strong>Y</strong> que la asignación 1 está Vigente y el activo 5 (placa NEX-000105) está en Estado Asignado</p>
<p><strong>Cuando</strong> solicita confirmar la recepción de la devolución 1</p>
<p><strong>Entonces</strong> el sistema muestra el aviso «La recepción de la devolución 1 quedará Confirmada, la asignación 1 pasará a estado Cerrada y el activo NEX-000105 quedará Disponible, salvo que esté Dañado. La confirmación no se puede deshacer. ¿Desea continuar?»</p>
<p><strong>Cuando</strong> confirma la recepción</p>
<p><strong>Entonces</strong> el sistema responde «Recepción confirmada correctamente.»</p>
<p><strong>Y</strong> la devolución 1 queda con:</p>
<p>│ ID_Devolucion │ Fecha_Devolucion │ Observaciones │ ID_Asignacion │ Estado_Recepcion │ Fecha_Confirmacion │ ID_Receptor │</p>
<p>├───────────────┼──────────────────┼──────────────────────┼───────────────┼──────────────────┼─────────────────────────┼─────────────┤</p>
<p>│ 1 │ 2026-10-05 16:40 │ Con cargador y funda │ 1 │ Confirmada │ (fecha y hora actuales) │ 2 │</p>
<p><strong>Y</strong> Fecha_Confirmacion la asignó el sistema e ID_Receptor es el usuario en sesión (2), que no se digitó</p>
<p><strong>Y</strong> ID_Devolucion, Fecha_Devolucion, Observaciones e ID_Asignacion conservan su valor</p>
<p><strong>Y</strong> la asignación 1 queda con Estado_Asignacion Cerrada y el activo 5 pasa a Estado Disponible</p>
</blockquote>
<p><strong>Escenario: CA-2 Confirmar la recepción de un activo Dañado</strong></p>
<p><em># confirmarRecepcion() · RN-D15</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la devolución 1 Pendiente de la asignación 1 Vigente y que el activo 5 está en Estado Dañado por un reporte de daño</p>
<p><strong>Cuando</strong> solicita confirmar la recepción de la devolución 1 y confirma</p>
<p><strong>Entonces</strong> el sistema responde «Recepción confirmada correctamente.»</p>
<p><strong>Y</strong> la devolución 1 queda con Estado_Recepcion Confirmada y la asignación 1 con Estado_Asignacion Cerrada</p>
<p><strong>Y</strong> el activo 5 conserva Estado Dañado (no es una transición)</p>
</blockquote>
<p><strong>Escenario: CA-3 Desistir de la confirmación</strong></p>
<p><em># confirmarRecepcion() · RN-D16</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la devolución 1 Pendiente de la asignación 1 Vigente y que el activo 5 (placa NEX-000105) está en Estado Asignado</p>
<p><strong>Cuando</strong> solicita confirmar la recepción de la devolución 1</p>
<p><strong>Entonces</strong> el sistema muestra el aviso «La recepción de la devolución 1 quedará Confirmada, la asignación 1 pasará a estado Cerrada y el activo NEX-000105 quedará Disponible, salvo que esté Dañado. La confirmación no se puede deshacer. ¿Desea continuar?»</p>
<p><strong>Cuando</strong> decide no continuar</p>
<p><strong>Entonces</strong> el sistema responde «Se desistió de confirmar la recepción. La devolución no fue modificada.»</p>
<p><strong>Y</strong> la devolución 1 conserva Estado_Recepcion Pendiente, con Fecha_Confirmacion e ID_Receptor vacíos, la asignación 1 conserva Estado_Asignacion Vigente y el activo 5 conserva Estado Asignado</p>
</blockquote>
<p><strong>Escenario: CA-4 Devolución ya confirmada</strong></p>
<p><em># confirmarRecepcion() · RN-D17</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la devolución:</p>
<p>│ ID_Devolucion │ Fecha_Devolucion │ Observaciones │ ID_Asignacion │ Estado_Recepcion │ Fecha_Confirmacion │ ID_Receptor │</p>
<p>├───────────────┼──────────────────┼───────────────┼───────────────┼──────────────────┼────────────────────┼─────────────┤</p>
<p>│ 3 │ 2026-09-18 15:20 │ Sin novedad │ 3 │ Confirmada │ 2026-09-19 09:10 │ 2 │</p>
<p><strong>Cuando</strong> solicita confirmar la recepción de la devolución 3</p>
<p><strong>Entonces</strong> el sistema responde «La devolución ya está confirmada.»</p>
<p><strong>Y</strong> no muestra el aviso de confirmación y la devolución 3 no cambia</p>
</blockquote>
<p><strong>Escenario: CA-5 Devolución inexistente</strong></p>
<p><em># confirmarRecepcion() · RN-D18</em></p>
<blockquote>
<p><strong>Dado</strong> que no existe la devolución 99</p>
<p><strong>Cuando</strong> solicita confirmar la recepción de la devolución 99</p>
<p><strong>Entonces</strong> el sistema responde «La devolución no existe.»</p>
</blockquote>
<p><strong>Esquema del escenario: CA-6 Receptor inexistente, inactivo o sin el rol Responsable de Activos</strong></p>
<p><em># confirmarRecepcion() · RN-D14</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la devolución 1 Pendiente de la asignación 1 Vigente y existen los usuarios:</p>
<p>│ ID_Usuario │ Nombre │ Apellido │ activo │ rol │</p>
<p>├────────────┼────────┼──────────┼────────┼────────────────────────┤</p>
<p>│ 2 │ Marta │ Rojas │ TRUE │ Responsable de Activos │</p>
<p>│ 11 │ Pablo │ Duarte │ FALSE │ Responsable de Activos │</p>
<p>│ 7 │ Carlos │ Mejía │ TRUE │ Empleado │</p>
<p>│ 9 │ Laura │ Gómez │ TRUE │ Aprobador │</p>
<p>│ 5 │ Sofía │ Herrera │ TRUE │ Gerente │</p>
<p><strong>Cuando</strong> se confirma la recepción de la devolución 1 con el usuario &lt;receptor&gt; como receptor</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> la devolución 1 conserva Estado_Recepcion Pendiente y la asignación 1 conserva Estado_Asignacion Vigente</p>
<p><strong>Ejemplos:</strong></p>
<p>│ receptor │ caso │ mensaje │</p>
<p>├──────────┼────────────────────────┼──────────────────────────────────────────────────────┤</p>
<p>│ 99 │ no existe │ «El usuario no existe.» │</p>
<p>│ 11 │ inactivo │ «El usuario está inactivo.» │</p>
<p>│ 7 │ sin el rol (Empleado) │ «El usuario no tiene el rol Responsable de Activos.» │</p>
<p>│ 9 │ sin el rol (Aprobador) │ «El usuario no tiene el rol Responsable de Activos.» │</p>
<p>│ 5 │ sin el rol (Gerente) │ «El usuario no tiene el rol Responsable de Activos.» │</p>
</blockquote>
<p><strong>Escenario: CA-7 Flujo normal: la confirmación deja la asignación Cerrada y el activo Disponible</strong></p>
<p><em># confirmarRecepcion(), cerrar(), buscarPorId(), listarVigentes(), buscarVigentePorActivo() · RN-D15, RN-AS14, RN-AS15</em></p>
<blockquote>
<p><strong>Dado</strong> que Marta Rojas confirmó la recepción de la devolución 1, de la asignación 1 (activo 5, placa NEX-000105), cuando el activo estaba en Estado Asignado</p>
<p><strong>Cuando</strong> consulta la asignación 1 por ID_Asignacion</p>
<p><strong>Entonces</strong> ve la asignación con Estado_Asignacion Cerrada y sus demás datos intactos</p>
<p><strong>Y</strong> el activo 5 está en Estado Disponible y la asignación 1 ya no figura entre las asignaciones vigentes</p>
<p><strong>Y</strong> al consultar la asignación vigente del activo 5, el sistema responde «El activo no tiene una asignación vigente.»</p>
<p><strong>Y</strong> no hace falta cerrar la asignación por separado: si solicita cerrar la asignación 1 (HU-18), el sistema responde «La asignación ya está cerrada.»</p>
</blockquote></td>
</tr>
<tr class="even">
<td><strong>Origen de la necesidad</strong></td>
<td>Pregunta 11 de la encuesta: la fecha de entrega es el dato más relevante para 6 de 19; Pregunta 12: una respuesta señala confusión en las entregas. Alcance 1.2 («confirmar su recepción por parte del responsable de activos»). N-06.</td>
</tr>
<tr class="odd">
<td><strong>RF derivados</strong></td>
<td>RF-27, RF-115, RF-116, RF-117, RF-118, RF-163, RF-170</td>
</tr>
<tr class="even">
<td><strong>Prioridad</strong></td>
<td>Alta</td>
</tr>
</tbody>
</table>

*Nota: HU de proceso: es el cierre de la devolución y el paso que deja la asignación Cerrada y el equipo otra vez Disponible, por eso la prioridad es Alta. Efectos del CRF-003 (cambios 2 y 5; propuesta, sin aplicar): confirmarRecepcion() invoca Asignacion.cerrar() y el activo pasa a Disponible salvo que esté Dañado, sin métodos nuevos. HU-18 CA-1 (cerrar una asignación cuya devolución ya está Confirmada) es la vía de recuperación si una asignación queda Vigente tras confirmarse la recepción (P-34). ID_Receptor es el usuario en sesión (Marta Rojas): no se digita; que exista, esté activo y tenga el rol Responsable de Activos son RN propuestas (RN-D13 y RN-D14). Aquí el receptor es el Responsable de Activos; en Acta_De_Entrega (HU-19) el receptor es el custodio. Ningún método marca «recibido dañado» (P-33, P-47). Cifras contrastadas con 1.7.2.*

**Notificacion_De_Devolucion — Anexo 5**

**HU-25 Generar aviso de próxima devolución**

<table>
<colgroup>
<col style="width: 16%" />
<col style="width: 83%" />
</colgroup>
<thead>
<tr class="header">
<th><strong>Código</strong></th>
<th><strong>HU-25</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><strong>Título corto</strong></td>
<td>Generar aviso de próxima devolución</td>
</tr>
<tr class="even">
<td><strong>Historia</strong></td>
<td><strong>Como</strong> Carlos Mejía, Empleado, <strong>quiero</strong> recibir por correo el aviso de la próxima devolución de mi equipo, con los días que me quedan, <strong>para</strong> devolverlo a tiempo.</td>
</tr>
<tr class="odd">
<td><strong>Criterios de aceptación</strong></td>
<td><p><strong>Antecedentes</strong> (comunes a todos los escenarios)</p>
<blockquote>
<p><strong>Dado</strong> que el sistema genera el aviso de forma automática, sin que ningún usuario lo solicite</p>
<p><strong>Y</strong> que el custodio 3 es Carlos Mejía, usuario 7, con Email carlos.mejia@ejemplo.com</p>
</blockquote>
<p><strong>Escenario: CA-1 Generar el aviso de una asignación vigente</strong></p>
<p><em># generarAviso(), calcularDiasRestantes() · RN-N01, RN-N02, RN-N04, RN-N05, RN-N06</em></p>
<blockquote>
<p><strong>Dado</strong> que la fecha actual es 2026-10-06 y existe la asignación 1 Vigente, del activo 5 (placa NEX-000105):</p>
<p>│ ID_Asignacion │ Fecha_Entrega │ Fecha_Devolucion_Esperada │ Estado_Asignacion │ ID_Custodio │ ID_Activo │ ID_Solicitud │</p>
<p>├───────────────┼───────────────┼───────────────────────────┼───────────────────┼─────────────┼───────────┼──────────────┤</p>
<p>│ 1 │ 2026-10-01 │ 2026-10-31 │ Vigente │ 3 │ 5 │ 2 │</p>
<p><strong>Cuando</strong> el sistema genera el aviso de la asignación 1</p>
<p><strong>Entonces</strong> la notificación queda guardada con:</p>
<p>│ ID_Notificacion │ ID_Asignacion │</p>
<p>├─────────────────┼───────────────┤</p>
<p>│ (automático) │ 1 │</p>
<p><strong>Y</strong> Dias_Restantes se calcula como 25 (2026-10-31 − 2026-10-06) y no se almacena</p>
<p><strong>Y</strong> el sistema envía un correo a carlos.mejia@ejemplo.com con el asunto «Aviso de devolución de equipo»</p>
<p><strong>Y</strong> el texto del correo es «Hola Carlos: el equipo NEX-000105 que tiene asignado debe devolverse el 2026-10-31. Días restantes: 25.»</p>
</blockquote>
<p><strong>Esquema del escenario: CA-2 Dias_Restantes se calcula con la fecha actual y no se almacena</strong></p>
<p><em># calcularDiasRestantes(), generarAviso() · RN-N04, RN-N08</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la asignación 1 Vigente con Fecha_Devolucion_Esperada 2026-10-31</p>
<p><strong>Cuando</strong> el sistema genera el aviso de la asignación 1 el &lt;fecha_actual&gt;</p>
<p><strong>Entonces</strong> Dias_Restantes es &lt;dias&gt;</p>
<p><strong>Y</strong> la notificación guarda solo ID_Notificacion e ID_Asignacion</p>
<p><strong>Ejemplos:</strong></p>
<p>│ fecha_actual │ dias │</p>
<p>├──────────────┼──────┤</p>
<p>│ 2026-10-06 │ 25 │</p>
<p>│ 2026-10-30 │ 1 │</p>
<p>│ 2026-10-31 │ 0 │</p>
<p><em>Los días de los ejemplos muestran el cálculo; no son un umbral de aviso (RN-N08, P-44).</em></p>
</blockquote>
<p><strong>Escenario: CA-3 Plazo ya vencido (RN propuesta)</strong></p>
<p><em># generarAviso(), calcularDiasRestantes() · RN-N04, RN-N06, RN-N07</em></p>
<blockquote>
<p><strong>Dado</strong> que la fecha actual es 2026-11-03 y existe la asignación 1 Vigente, del activo 5 (placa NEX-000105):</p>
<p>│ ID_Asignacion │ Fecha_Entrega │ Fecha_Devolucion_Esperada │ Estado_Asignacion │ ID_Custodio │ ID_Activo │ ID_Solicitud │</p>
<p>├───────────────┼───────────────┼───────────────────────────┼───────────────────┼─────────────┼───────────┼──────────────┤</p>
<p>│ 1 │ 2026-10-01 │ 2026-10-31 │ Vigente │ 3 │ 5 │ 2 │</p>
<p><strong>Cuando</strong> el sistema genera el aviso de la asignación 1</p>
<p><strong>Entonces</strong> la notificación queda guardada con ID_Notificacion (automático) e ID_Asignacion 1</p>
<p><strong>Y</strong> Dias_Restantes se calcula como -3 (2026-10-31 − 2026-11-03) y no se almacena</p>
<p><strong>Y</strong> el sistema envía un correo a carlos.mejia@ejemplo.com con el asunto «Devolución de equipo vencida»</p>
<p><strong>Y</strong> el texto del correo es «Hola Carlos: el plazo para devolver el equipo NEX-000105 venció el 2026-10-31. Días de retraso: 3.»</p>
</blockquote>
<p><strong>Escenario: CA-4 Asignación cerrada: sin aviso</strong></p>
<p><em># generarAviso() · RN-N05</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la asignación:</p>
<p>│ ID_Asignacion │ Fecha_Entrega │ Fecha_Devolucion_Esperada │ Estado_Asignacion │ ID_Custodio │ ID_Activo │ ID_Solicitud │</p>
<p>├───────────────┼───────────────┼───────────────────────────┼───────────────────┼─────────────┼───────────┼──────────────┤</p>
<p>│ 3 │ 2026-08-20 │ 2026-09-20 │ Cerrada │ 3 │ 6 │ 9 │</p>
<p><strong>Cuando</strong> el sistema genera el aviso de la asignación 3</p>
<p><strong>Entonces</strong> el sistema responde «La asignación no está vigente. No se genera el aviso de devolución.»</p>
<p><strong>Y</strong> no se crea ninguna notificación y no se envía ningún correo</p>
</blockquote>
<p><strong>Escenario: CA-5 Asignación inexistente</strong></p>
<p><em># generarAviso() · RN-N02</em></p>
<blockquote>
<p><strong>Dado</strong> que no existe la asignación 99</p>
<p><strong>Cuando</strong> el sistema genera el aviso de la asignación 99</p>
<p><strong>Entonces</strong> el sistema responde «La asignación no existe.»</p>
<p><strong>Y</strong> no se crea ninguna notificación y no se envía ningún correo</p>
</blockquote>
<p><strong>Escenario: CA-6 Una asignación puede tener más de un aviso</strong></p>
<p><em># generarAviso() · RN-N01, RN-N03</em></p>
<blockquote>
<p><strong>Dado</strong> que la asignación 1 Vigente ya tiene la notificación:</p>
<p>│ ID_Notificacion │ ID_Asignacion │</p>
<p>├─────────────────┼───────────────┤</p>
<p>│ 1 │ 1 │</p>
<p><strong>Cuando</strong> el sistema genera otro aviso de la asignación 1</p>
<p><strong>Entonces</strong> se crea la notificación 2 con ID_Asignacion 1</p>
<p><strong>Y</strong> la notificación 1 conserva sus datos</p>
<p><em>ID_Asignacion no es único en Notificacion_De_Devolucion; cuándo y cuántas veces se avisa no está definido (RN-N03, P-44).</em></p>
</blockquote></td>
</tr>
<tr class="even">
<td><strong>Origen de la necesidad</strong></td>
<td>Alcance 1.2 – Tabla 5, pendiente de validación.</td>
</tr>
<tr class="odd">
<td><strong>RF derivados</strong></td>
<td>RF-28, RF-119, RF-120, RF-121, RF-167</td>
</tr>
<tr class="even">
<td><strong>Prioridad</strong></td>
<td>Media</td>
</tr>
</tbody>
</table>

*Nota: HU de proceso automático: el disparador es el sistema y Carlos Mejía recibe el aviso por correo, en el Email de su Usuario (RN-N06, propuesta). Es el único aviso automático del sistema (RN-N10; ver B.6). El umbral de días y la frecuencia NO están definidos: los 25, 1 y 0 días de los ejemplos son datos de ejemplo, no una regla (RN-N08, P-44). Plazo vencido (RN-N07, P-45) y asignación Vigente con la devolución ya registrada (P-46) quedan abiertos. Prioridad Media, propuesta pendiente de acordar con el cliente: el proceso central funciona sin el aviso, pero figura en el Alcance 1.2 y la Tabla 5 pide validarlo. Los textos del correo son propuestos (P-48). Sin cifras de la encuesta en el Origen.*

**Reporte_de_Danios — Anexo 6**

**HU-26 Reportar daño de un equipo**

<table>
<colgroup>
<col style="width: 16%" />
<col style="width: 83%" />
</colgroup>
<thead>
<tr class="header">
<th><strong>Código</strong></th>
<th><strong>HU-26</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><strong>Título corto</strong></td>
<td>Reportar daño de un equipo</td>
</tr>
<tr class="even">
<td><strong>Historia</strong></td>
<td><strong>Como</strong> Carlos Mejía, Empleado, <strong>quiero</strong> reportar el daño del equipo que tengo asignado, indicando qué le pasa y, si tengo, una evidencia, <strong>para</strong> que el daño quede registrado y el Técnico de Soporte pueda atenderlo.</td>
</tr>
<tr class="odd">
<td><strong>Criterios de aceptación</strong></td>
<td><p><strong>Antecedentes</strong> (comunes a todos los escenarios)</p>
<blockquote>
<p><strong>Dado</strong> que Carlos Mejía, Empleado, inició sesión</p>
</blockquote>
<p><strong>Escenario: CA-1 Reportar el daño de un equipo asignado con todos los datos</strong></p>
<p><em># crear() · RN-RD01, RN-RD02, RN-RD04, RN-RD06, RN-RD07, RN-RD09</em></p>
<blockquote>
<p><strong>Dado</strong> que la fecha actual es 2026-10-06, Carlos Mejía es el custodio 3 y existe su asignación Vigente:</p>
<p>│ ID_Asignacion │ Fecha_Entrega │ Fecha_Devolucion_Esperada │ Estado_Asignacion │ ID_Custodio │ ID_Activo │ ID_Solicitud │</p>
<p>├───────────────┼───────────────┼───────────────────────────┼───────────────────┼─────────────┼───────────┼──────────────┤</p>
<p>│ 1 │ 2026-10-01 │ 2026-10-31 │ Vigente │ 3 │ 5 │ 2 │</p>
<p><strong>Y</strong> que el activo 5 (placa NEX-000105) está en Estado Asignado</p>
<p><strong>Cuando</strong> reporta el daño con los datos:</p>
<p>│ Campo │ Valor │</p>
<p>├───────────────────┼─────────────────────────────────┤</p>
<p>│ ID_Activo │ 5 │</p>
<p>│ Tipo_Danio │ Hardware │</p>
<p>│ Descripcion_Danio │ La pantalla parpadea y se apaga │</p>
<p>│ Evidencia │ evidencias/danio-pantalla.jpg │</p>
<p><strong>Entonces</strong> el sistema responde «Reporte de daño registrado correctamente.»</p>
<p><strong>Y</strong> el reporte queda guardado con:</p>
<p>│ ID_ReporteDanios │ Descripcion_Danio │ Evidencia │ Fecha_Reporte │ ID_Custodio │ Tipo_Danio │ ID_Activo │</p>
<p>├──────────────────┼─────────────────────────────────┼───────────────────────────────┼─────────────────────────┼─────────────┼────────────┼───────────┤</p>
<p>│ (automático) │ La pantalla parpadea y se apaga │ evidencias/danio-pantalla.jpg │ (fecha y hora actuales) │ 3 │ Hardware │ 5 │</p>
<p><strong>Y</strong> ID_ReporteDanios y Fecha_Reporte los asignó el sistema e ID_Custodio es el custodio de la sesión (3), que no se digitó</p>
<p><strong>Y</strong> el activo 5 pasa a Estado Dañado, aunque estaba Asignado, y la asignación 1 conserva Estado_Asignacion Vigente</p>
</blockquote>
<p><strong>Escenario: CA-2 Reportar el daño sin evidencia</strong></p>
<p><em># crear() · RN-RD02, RN-RD09</em></p>
<blockquote>
<p><strong>Dado</strong> que Carlos Mejía es el custodio 3, tiene la asignación 1 Vigente del activo 5 y el activo 5 está en Estado Asignado</p>
<p><strong>Cuando</strong> reporta el daño del activo 5 con Tipo_Danio Software y Descripcion_Danio El sistema se reinicia solo, sin Evidencia</p>
<p><strong>Entonces</strong> el sistema responde «Reporte de daño registrado correctamente.»</p>
<p><strong>Y</strong> el reporte queda con Evidencia vacía y el activo 5 pasa a Estado Dañado</p>
</blockquote>
<p><strong>Esquema del escenario: CA-3 Datos obligatorios vacíos</strong></p>
<p><em># crear() · RN-RD02</em></p>
<blockquote>
<p><strong>Dado</strong> que Carlos Mejía es el custodio 3, tiene la asignación 1 Vigente del activo 5 y el activo 5 está en Estado Asignado</p>
<p><strong>Cuando</strong> reporta un daño con &lt;campo&gt; vacío y los demás datos válidos</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> no se crea el reporte y el activo 5 conserva Estado Asignado</p>
<p><strong>Ejemplos:</strong></p>
<p>│ campo │ mensaje │</p>
<p>├───────────────────┼───────────────────────────────────────────┤</p>
<p>│ ID_Activo │ «El activo es obligatorio.» │</p>
<p>│ Tipo_Danio │ «El tipo de daño es obligatorio.» │</p>
<p>│ Descripcion_Danio │ «La descripción del daño es obligatoria.» │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-4 Longitud máxima aceptada y superada</strong></p>
<p><em># crear() · RN-RD03</em></p>
<blockquote>
<p><strong>Dado</strong> que Carlos Mejía es el custodio 3, tiene la asignación 1 Vigente del activo 5 y el activo 5 está en Estado Asignado</p>
<p><strong>Cuando</strong> reporta el daño del activo 5 con &lt;campo&gt; de &lt;valor&gt; y los demás datos válidos</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Ejemplos:</strong></p>
<p>│ campo │ valor │ longitud │ máximo │ mensaje │</p>
<p>├───────────────────┼─────────────────────────┼──────────┼────────┼────────────────────────────────────────────────────────────┤</p>
<p>│ Descripcion_Danio │ texto de 500 caracteres │ 500 │ 500 │ «Reporte de daño registrado correctamente.» │</p>
<p>│ Descripcion_Danio │ texto de 501 caracteres │ 501 │ 500 │ «La descripción del daño no puede superar 500 caracteres.» │</p>
<p>│ Evidencia │ texto de 255 caracteres │ 255 │ 255 │ «Reporte de daño registrado correctamente.» │</p>
<p>│ Evidencia │ texto de 256 caracteres │ 256 │ 255 │ «La evidencia no puede superar 255 caracteres.» │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-5 Tipo de daño dentro y fuera del ENUM</strong></p>
<p><em># crear() · RN-RD04</em></p>
<blockquote>
<p><strong>Dado</strong> que Carlos Mejía es el custodio 3, tiene la asignación 1 Vigente del activo 5 y el activo 5 está en Estado Asignado</p>
<p><strong>Cuando</strong> reporta el daño del activo 5 con Tipo_Danio &lt;valor&gt; y los demás datos válidos</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Ejemplos:</strong></p>
<p>│ valor │ caso │ mensaje │</p>
<p>├───────────┼────────────────┼─────────────────────────────────────────────┤</p>
<p>│ Hardware │ válido │ «Reporte de daño registrado correctamente.» │</p>
<p>│ Software │ válido │ «Reporte de daño registrado correctamente.» │</p>
<p>│ Otro │ válido │ «Reporte de daño registrado correctamente.» │</p>
<p>│ Eléctrico │ fuera del ENUM │ «El tipo de daño no es válido.» │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-6 Activo inexistente, ajeno, sin asignación vigente o en baja</strong></p>
<p><em># crear() · RN-RD05, RN-RD07, RN-RD08</em></p>
<blockquote>
<p><strong>Dado</strong> que Carlos Mejía es el custodio 3 y existen las asignaciones y los activos:</p>
<p>│ ID_Activo │ Estado │ asignación │</p>
<p>├───────────┼─────────────┼───────────────────────────┤</p>
<p>│ 2 │ Asignado │ 2 Vigente, del custodio 1 │</p>
<p>│ 1 │ Disponible │ (ninguna) │</p>
<p>│ 9 │ Baja │ (ninguna) │</p>
<p>│ 99 │ (no existe) │ (ninguna) │</p>
<p><strong>Cuando</strong> reporta el daño del activo &lt;id&gt; con datos válidos</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> no se crea el reporte y el activo conserva su estado</p>
<p><strong>Ejemplos:</strong></p>
<p>│ id │ caso │ mensaje │</p>
<p>├────┼──────────────────────────┼────────────────────────────────────────────────────────┤</p>
<p>│ 99 │ no existe │ «El activo no existe.» │</p>
<p>│ 2 │ asignado a otro custodio │ «El activo está asignado a otro custodio.» │</p>
<p>│ 1 │ sin asignación Vigente │ «Solo se puede reportar un equipo que tiene asignado.» │</p>
<p>│ 9 │ en Baja │ «Un activo en baja no se puede reportar.» │</p>
</blockquote>
<p><strong>Escenario: CA-7 Activo que ya está Dañado (RN propuesta)</strong></p>
<p><em># crear() · RN-RD09, RN-RD10</em></p>
<blockquote>
<p><strong>Dado</strong> que Carlos Mejía es el custodio 3, tiene la asignación 1 Vigente del activo 5 y el activo 5 está en Estado Dañado por el reporte 1</p>
<p><strong>Cuando</strong> reporta otro daño del activo 5 con Tipo_Danio Hardware y Descripcion_Danio El cargador no carga la batería</p>
<p><strong>Entonces</strong> el sistema responde «Reporte de daño registrado correctamente.»</p>
<p><strong>Y</strong> se crea el reporte 2 con ID_Activo 5 e ID_Custodio 3, el reporte 1 conserva sus datos y el activo 5 conserva Estado Dañado</p>
</blockquote></td>
</tr>
<tr class="even">
<td><strong>Origen de la necesidad</strong></td>
<td>Pregunta 7 de la encuesta: «solicitud fácil de daño» es la funcionalidad más deseada para 3 de 19 (contrastada con 1.7.2); respaldo débil: es una minoría y la notificación a TI (5 respuestas, más 7 en «todas») queda fuera del alcance. N-07.</td>
</tr>
<tr class="odd">
<td><strong>RF derivados</strong></td>
<td>RF-29, RF-122, RF-123, RF-124, RF-125, RF-171</td>
</tr>
<tr class="even">
<td><strong>Prioridad</strong></td>
<td>Alta</td>
</tr>
</tbody>
</table>

*Nota: HU de proceso: sin el reporte el Técnico no se entera del daño, por eso la prioridad es Alta. Efecto sobre el activo: CRF-003, cambio 3 (propuesta, sin aplicar): crear() deja el activo en Dañado, también si estaba Asignado, y la asignación sigue Vigente. Con RN-RD07 (propuesta) solo se reporta el equipo con una asignación Vigente a nombre del custodio; por eso, con esta regla, el reporte no lleva un activo Disponible a Dañado (queda solo Activo.actualizar(); P-51). ID_Custodio es el usuario en sesión: no se digita. El mecanismo para adjuntar la evidencia no está definido: solo se guarda la ruta (P-52). Qué hacer con un activo ya Dañado es una propuesta (admitir otro reporte; P-50). El respaldo de N-07 es débil (3 de 19). Cifras contrastadas con 1.7.2.*

**HU-27 Consultar reportes de daño**

<table>
<colgroup>
<col style="width: 16%" />
<col style="width: 83%" />
</colgroup>
<thead>
<tr class="header">
<th><strong>Código</strong></th>
<th><strong>HU-27</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><strong>Título corto</strong></td>
<td>Consultar reportes de daño</td>
</tr>
<tr class="even">
<td><strong>Historia</strong></td>
<td><strong>Como</strong> Andrés Pineda, Técnico de Soporte, <strong>quiero</strong> consultar un reporte de daño por su identificador y ver los reportes registrados, del más reciente al más antiguo, <strong>para</strong> saber qué equipos están dañados y qué les pasa.</td>
</tr>
<tr class="odd">
<td><strong>Criterios de aceptación</strong></td>
<td><p><strong>Antecedentes</strong> (comunes a todos los escenarios)</p>
<blockquote>
<p><strong>Dado</strong> que Andrés Pineda, Técnico de Soporte, inició sesión</p>
</blockquote>
<p><strong>Esquema del escenario: CA-1 Consultar un reporte de daño por su identificador</strong></p>
<p><em># buscarPorId() · RN-RD11</em></p>
<blockquote>
<p><strong>Dado</strong> que existen los reportes:</p>
<p>│ ID_ReporteDanios │ Descripcion_Danio │ Evidencia │ Fecha_Reporte │ ID_Custodio │ Tipo_Danio │ ID_Activo │</p>
<p>├──────────────────┼──────────────────────────────────────────────────┼───────────────────────────────┼──────────────────┼─────────────┼────────────┼───────────┤</p>
<p>│ 1 │ La pantalla parpadea y se apaga │ evidencias/danio-pantalla.jpg │ 2026-10-05 14:20 │ 3 │ Hardware │ 5 │</p>
<p>│ 2 │ El sistema se reinicia al abrir hojas de cálculo │ (vacío) │ 2026-10-06 08:50 │ 1 │ Software │ 2 │</p>
<p>│ 3 │ El cargador no carga la batería │ (vacío) │ 2026-10-06 11:30 │ 3 │ Hardware │ 5 │</p>
<p><strong>Cuando</strong> consulta por ID_ReporteDanios &lt;id&gt;</p>
<p><strong>Entonces</strong> ve el reporte con sus 7 campos, según la fila de Ejemplos</p>
<p><strong>Y</strong> la consulta no modifica el reporte ni el estado del activo</p>
<p><strong>Ejemplos:</strong></p>
<p>│ ID_ReporteDanios │ Descripcion_Danio │ Evidencia │ Fecha_Reporte │ ID_Custodio │ Tipo_Danio │ ID_Activo │</p>
<p>├──────────────────┼──────────────────────────────────────────────────┼───────────────────────────────┼──────────────────┼─────────────┼────────────┼───────────┤</p>
<p>│ 1 │ La pantalla parpadea y se apaga │ evidencias/danio-pantalla.jpg │ 2026-10-05 14:20 │ 3 │ Hardware │ 5 │</p>
<p>│ 2 │ El sistema se reinicia al abrir hojas de cálculo │ (vacío) │ 2026-10-06 08:50 │ 1 │ Software │ 2 │</p>
</blockquote>
<p><strong>Escenario: CA-2 Reporte de daño no encontrado</strong></p>
<p><em># buscarPorId() · RN-RD11</em></p>
<blockquote>
<p><strong>Dado</strong> que no existe el reporte 99</p>
<p><strong>Cuando</strong> consulta por ID_ReporteDanios 99</p>
<p><strong>Entonces</strong> el sistema responde «No se encontró ningún reporte de daño con ese identificador.»</p>
<p><strong>Y</strong> no se muestra ningún reporte</p>
</blockquote>
<p><strong>Escenario: CA-3 Ver los reportes de daño del más reciente al más antiguo</strong></p>
<p><em># listarReportes() · RN-RD12</em></p>
<blockquote>
<p><strong>Dado</strong> que existen los reportes:</p>
<p>│ ID_ReporteDanios │ Descripcion_Danio │ Evidencia │ Fecha_Reporte │ ID_Custodio │ Tipo_Danio │ ID_Activo │</p>
<p>├──────────────────┼──────────────────────────────────────────────────┼───────────────────────────────┼──────────────────┼─────────────┼────────────┼───────────┤</p>
<p>│ 1 │ La pantalla parpadea y se apaga │ evidencias/danio-pantalla.jpg │ 2026-10-05 14:20 │ 3 │ Hardware │ 5 │</p>
<p>│ 2 │ El sistema se reinicia al abrir hojas de cálculo │ (vacío) │ 2026-10-06 08:50 │ 1 │ Software │ 2 │</p>
<p>│ 3 │ El cargador no carga la batería │ (vacío) │ 2026-10-06 11:30 │ 3 │ Hardware │ 5 │</p>
<p><strong>Cuando</strong> consulta los reportes de daño</p>
<p><strong>Entonces</strong> ve los reportes 3, 2 y 1, con sus 7 campos, del más reciente al más antiguo por Fecha_Reporte, aunque su ID_ReporteDanios no siga ese orden:</p>
<p>│ ID_ReporteDanios │ Descripcion_Danio │ Evidencia │ Fecha_Reporte │ ID_Custodio │ Tipo_Danio │ ID_Activo │</p>
<p>├──────────────────┼──────────────────────────────────────────────────┼───────────────────────────────┼──────────────────┼─────────────┼────────────┼───────────┤</p>
<p>│ 3 │ El cargador no carga la batería │ (vacío) │ 2026-10-06 11:30 │ 3 │ Hardware │ 5 │</p>
<p>│ 2 │ El sistema se reinicia al abrir hojas de cálculo │ (vacío) │ 2026-10-06 08:50 │ 1 │ Software │ 2 │</p>
<p>│ 1 │ La pantalla parpadea y se apaga │ evidencias/danio-pantalla.jpg │ 2026-10-05 14:20 │ 3 │ Hardware │ 5 │</p>
</blockquote>
<p><strong>Escenario: CA-4 Sin reportes de daño registrados</strong></p>
<p><em># listarReportes() · RN-RD12</em></p>
<blockquote>
<p><strong>Dado</strong> que no hay reportes de daño registrados</p>
<p><strong>Cuando</strong> consulta los reportes de daño</p>
<p><strong>Entonces</strong> el sistema responde «No hay reportes de daño registrados.»</p>
</blockquote>
<p><strong>Escenario: CA-5 Ver los propios reportes (actor secundario: Empleado)</strong></p>
<p><em># listarReportes() · RN-RD12, RN-RD13, RN-RD18</em></p>
<blockquote>
<p><strong>Dado</strong> que quien consulta es Carlos Mejía, Empleado (custodio 3), en lugar del Técnico de Soporte</p>
<p><strong>Y</strong> que existen los reportes:</p>
<p>│ ID_ReporteDanios │ Descripcion_Danio │ Evidencia │ Fecha_Reporte │ ID_Custodio │ Tipo_Danio │ ID_Activo │</p>
<p>├──────────────────┼──────────────────────────────────────────────────┼───────────────────────────────┼──────────────────┼─────────────┼────────────┼───────────┤</p>
<p>│ 1 │ La pantalla parpadea y se apaga │ evidencias/danio-pantalla.jpg │ 2026-10-05 14:20 │ 3 │ Hardware │ 5 │</p>
<p>│ 2 │ El sistema se reinicia al abrir hojas de cálculo │ (vacío) │ 2026-10-06 08:50 │ 1 │ Software │ 2 │</p>
<p>│ 3 │ El cargador no carga la batería │ (vacío) │ 2026-10-06 11:30 │ 3 │ Hardware │ 5 │</p>
<p><strong>Cuando</strong> consulta sus reportes de daño</p>
<p><strong>Entonces</strong> ve solo los reportes 3 y 1, con sus 7 campos, del más reciente al más antiguo:</p>
<p>│ ID_ReporteDanios │ Descripcion_Danio │ Evidencia │ Fecha_Reporte │ ID_Custodio │ Tipo_Danio │ ID_Activo │</p>
<p>├──────────────────┼─────────────────────────────────┼───────────────────────────────┼──────────────────┼─────────────┼────────────┼───────────┤</p>
<p>│ 3 │ El cargador no carga la batería │ (vacío) │ 2026-10-06 11:30 │ 3 │ Hardware │ 5 │</p>
<p>│ 1 │ La pantalla parpadea y se apaga │ evidencias/danio-pantalla.jpg │ 2026-10-05 14:20 │ 3 │ Hardware │ 5 │</p>
<p><strong>Y</strong> no ve el reporte 2, que es de otro custodio</p>
<p><em>Actor secundario: el Empleado consulta los reportes que hizo (RN-RD13, propuesta; P-55).</em></p>
</blockquote>
<p><strong>Escenario: CA-6 Reporte de daño de otro custodio</strong></p>
<p><em># buscarPorId() · RN-RD13</em></p>
<blockquote>
<p><strong>Dado</strong> que quien consulta es Carlos Mejía (custodio 3), en lugar del Técnico de Soporte, y existe el reporte 2, del custodio 1</p>
<p><strong>Cuando</strong> consulta por ID_ReporteDanios 2</p>
<p><strong>Entonces</strong> el sistema responde «No tiene acceso a ese reporte de daño.»</p>
<p><strong>Y</strong> no se muestra ningún dato del reporte 2</p>
</blockquote></td>
</tr>
<tr class="even">
<td><strong>Origen de la necesidad</strong></td>
<td>Pregunta 7 de la encuesta: «solicitud fácil de daño» es la funcionalidad más deseada para 3 de 19 (contrastada con 1.7.2); respaldo débil: es una minoría y la notificación a TI (5 respuestas, más 7 en «todas») queda fuera del alcance. N-07. Alcance 1.2 (el Técnico de Soporte consulta los reportes de daño registrados).</td>
</tr>
<tr class="odd">
<td><strong>RF derivados</strong></td>
<td>RF-30, RF-126, RF-127</td>
</tr>
<tr class="even">
<td><strong>Prioridad</strong></td>
<td>Alta</td>
</tr>
</tbody>
</table>

*Nota: HU-27 agrupa dos actores: el Técnico de Soporte es el rol principal y el Empleado consulta solo los reportes que hizo como actor secundario (CA-5 y CA-6; RN-RD13 y RN-RD18, propuestas). Orden del listado, del más reciente al más antiguo: propuesta de la Fase A v6. El modelo no tiene baja de reportes, estado de atención ni un método de «reportes sin atender»: no se inventan (RN-RD19; P-53). Prioridad Alta: es lo que el Técnico necesita para atender los daños. Cifras contrastadas con 1.7.2.*

**HU-28 Actualizar reporte de daño**

<table>
<colgroup>
<col style="width: 16%" />
<col style="width: 83%" />
</colgroup>
<thead>
<tr class="header">
<th><strong>Código</strong></th>
<th><strong>HU-28</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><strong>Título corto</strong></td>
<td>Actualizar reporte de daño</td>
</tr>
<tr class="even">
<td><strong>Historia</strong></td>
<td><strong>Como</strong> Carlos Mejía, Empleado, <strong>quiero</strong> complementar o corregir la descripción, la evidencia y el tipo de un reporte de daño que hice, <strong>para</strong> que el Técnico de Soporte reciba la información correcta del daño.</td>
</tr>
<tr class="odd">
<td><strong>Criterios de aceptación</strong></td>
<td><p><strong>Antecedentes</strong> (comunes a todos los escenarios)</p>
<blockquote>
<p><strong>Dado</strong> que Carlos Mejía, Empleado, inició sesión</p>
</blockquote>
<p><strong>Escenario: CA-1 Actualizar descripción, evidencia y tipo de un reporte sin mantenimiento</strong></p>
<p><em># actualizar() · RN-RD14, RN-RD16</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el reporte 1, del custodio 3 de Carlos Mejía, sin mantenimiento asociado, con los valores de la columna Antes, y el activo 5 está en Estado Dañado</p>
<p><strong>Cuando</strong> actualiza el reporte 1 con los valores de la columna Después:</p>
<p>│ Campo │ Antes │ Después │</p>
<p>├───────────────────┼─────────────────────────────────┼─────────────────────────────────────────────────┤</p>
<p>│ ID_ReporteDanios │ 1 │ 1 (sin cambio) │</p>
<p>│ Descripcion_Danio │ La pantalla parpadea y se apaga │ La pantalla parpadea y se apaga a los 5 minutos │</p>
<p>│ Evidencia │ evidencias/danio-pantalla.jpg │ evidencias/danio-pantalla-2.jpg │</p>
<p>│ Fecha_Reporte │ 2026-10-05 14:20 │ 2026-10-05 14:20 (sin cambio) │</p>
<p>│ ID_Custodio │ 3 │ 3 (sin cambio) │</p>
<p>│ Tipo_Danio │ Hardware │ Software │</p>
<p>│ ID_Activo │ 5 │ 5 (sin cambio) │</p>
<p><strong>Entonces</strong> el sistema responde «Reporte de daño actualizado correctamente.»</p>
<p><strong>Y</strong> el reporte 1 queda con los valores de la columna Después</p>
<p><strong>Y</strong> el activo 5 conserva Estado Dañado</p>
</blockquote>
<p><strong>Esquema del escenario: CA-2 Datos obligatorios vacíos o fuera del ENUM</strong></p>
<p><em># actualizar() · RN-RD02, RN-RD04, RN-RD14</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el reporte 1, del custodio 3 de Carlos Mejía, sin mantenimiento asociado</p>
<p><strong>Cuando</strong> actualiza el reporte 1 con &lt;campo&gt; &lt;valor&gt; y los demás datos válidos</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Ejemplos:</strong></p>
<p>│ campo │ valor │ mensaje │</p>
<p>├───────────────────┼───────────┼──────────────────────────────────────────────┤</p>
<p>│ Descripcion_Danio │ vacía │ «La descripción del daño es obligatoria.» │</p>
<p>│ Tipo_Danio │ vacío │ «El tipo de daño es obligatorio.» │</p>
<p>│ Tipo_Danio │ Eléctrico │ «El tipo de daño no es válido.» │</p>
<p>│ Evidencia │ vacía │ «Reporte de daño actualizado correctamente.» │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-3 Longitud máxima aceptada y superada</strong></p>
<p><em># actualizar() · RN-RD03</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el reporte 1, del custodio 3 de Carlos Mejía, sin mantenimiento asociado</p>
<p><strong>Cuando</strong> actualiza el reporte 1 con &lt;campo&gt; de &lt;valor&gt; y los demás datos válidos</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Ejemplos:</strong></p>
<p>│ campo │ valor │ longitud │ máximo │ mensaje │</p>
<p>├───────────────────┼─────────────────────────┼──────────┼────────┼────────────────────────────────────────────────────────────┤</p>
<p>│ Descripcion_Danio │ texto de 500 caracteres │ 500 │ 500 │ «Reporte de daño actualizado correctamente.» │</p>
<p>│ Descripcion_Danio │ texto de 501 caracteres │ 501 │ 500 │ «La descripción del daño no puede superar 500 caracteres.» │</p>
<p>│ Evidencia │ texto de 255 caracteres │ 255 │ 255 │ «Reporte de daño actualizado correctamente.» │</p>
<p>│ Evidencia │ texto de 256 caracteres │ 256 │ 255 │ «La evidencia no puede superar 255 caracteres.» │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-4 Campos que no se modifican</strong></p>
<p><em># actualizar() · RN-RD01, RN-RD14</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el reporte:</p>
<p>│ ID_ReporteDanios │ Descripcion_Danio │ Evidencia │ Fecha_Reporte │ ID_Custodio │ Tipo_Danio │ ID_Activo │</p>
<p>├──────────────────┼─────────────────────────────────┼───────────────────────────────┼──────────────────┼─────────────┼────────────┼───────────┤</p>
<p>│ 1 │ La pantalla parpadea y se apaga │ evidencias/danio-pantalla.jpg │ 2026-10-05 14:20 │ 3 │ Hardware │ 5 │</p>
<p><strong>Cuando</strong> intenta cambiar el &lt;campo&gt; del reporte 1 a &lt;valor&gt;</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> el reporte 1 conserva sus datos anteriores</p>
<p><strong>Ejemplos:</strong></p>
<p>│ campo │ valor │ mensaje │</p>
<p>├──────────────────┼──────────────────┼───────────────────────────────────────────────────────┤</p>
<p>│ ID_ReporteDanios │ 10 │ «El identificador del reporte no se puede modificar.» │</p>
<p>│ ID_Activo │ 1 │ «El activo del reporte no se puede modificar.» │</p>
<p>│ ID_Custodio │ 1 │ «El custodio del reporte no se puede modificar.» │</p>
<p>│ Fecha_Reporte │ 2026-10-07 09:00 │ «La fecha del reporte no se puede modificar.» │</p>
</blockquote>
<p><strong>Escenario: CA-5 Reporte con mantenimiento asociado (RN propuesta)</strong></p>
<p><em># actualizar() · RN-RD15</em></p>
<blockquote>
<p><strong>Dado</strong> que el reporte 1 es del custodio 3 de Carlos Mejía y el mantenimiento 1 tiene ID_ReporteDanios 1</p>
<p><strong>Cuando</strong> intenta actualizar la Descripcion_Danio del reporte 1</p>
<p><strong>Entonces</strong> el sistema responde «Un reporte con mantenimiento asociado no se puede modificar.»</p>
<p><strong>Y</strong> el reporte 1 conserva sus datos anteriores</p>
</blockquote>
<p><strong>Escenario: CA-6 Reporte inexistente</strong></p>
<p><em># actualizar() · RN-RD11</em></p>
<blockquote>
<p><strong>Dado</strong> que no existe el reporte 99</p>
<p><strong>Cuando</strong> actualiza el reporte 99 con datos válidos</p>
<p><strong>Entonces</strong> el sistema responde «El reporte de daño no existe.»</p>
</blockquote>
<p><strong>Escenario: CA-7 Solo el custodio que reportó actualiza su reporte</strong></p>
<p><em># actualizar() · RN-RD17</em></p>
<blockquote>
<p><strong>Dado</strong> que Carlos Mejía es el custodio 3 y existe el reporte 2, del custodio 1, sin mantenimiento asociado</p>
<p><strong>Cuando</strong> intenta actualizar la Descripcion_Danio del reporte 2 con datos válidos</p>
<p><strong>Entonces</strong> el sistema responde «Solo el custodio que reportó el daño puede actualizar su reporte.»</p>
<p><strong>Y</strong> el reporte 2 conserva sus datos anteriores</p>
</blockquote></td>
</tr>
<tr class="even">
<td><strong>Origen de la necesidad</strong></td>
<td>Pregunta 7 de la encuesta: «solicitud fácil de daño» es la funcionalidad más deseada para 3 de 19 (contrastada con 1.7.2); respaldo débil: es una minoría y la notificación a TI (5 respuestas, más 7 en «todas») queda fuera del alcance. N-07.</td>
</tr>
<tr class="odd">
<td><strong>RF derivados</strong></td>
<td>RF-31, RF-128, RF-129, RF-130</td>
</tr>
<tr class="even">
<td><strong>Prioridad</strong></td>
<td>Media</td>
</tr>
</tbody>
</table>

*Nota: la Fase A v6 describe actualizar() como «complementa o corrige descripción, evidencia y tipo»; por eso solo esos tres campos se actualizan y el resto es inmutable (RN-RD14). Hasta cuándo se puede actualizar es una propuesta: mientras el reporte no tenga un mantenimiento asociado (RN-RD15; P-54); se verifica con la consulta de mantenimientos del activo (listarPorActivo()), sin métodos nuevos. Actualizar no cambia Estado_Activo (RN-RD16). Prioridad Media: corregir un reporte no detiene el proceso. Cifras contrastadas con 1.7.2.*

**Historial_Mantenimientos — Anexo 6**

**HU-29 Registrar mantenimiento**

<table>
<colgroup>
<col style="width: 16%" />
<col style="width: 83%" />
</colgroup>
<thead>
<tr class="header">
<th><strong>Código</strong></th>
<th><strong>HU-29</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><strong>Título corto</strong></td>
<td>Registrar mantenimiento</td>
</tr>
<tr class="even">
<td><strong>Historia</strong></td>
<td><strong>Como</strong> Andrés Pineda, Técnico de Soporte, <strong>quiero</strong> registrar el mantenimiento que hice a un equipo, con su fecha, descripción, costo y evidencia, <strong>para</strong> que el equipo tenga un historial de lo que se le ha hecho.</td>
</tr>
<tr class="odd">
<td><strong>Criterios de aceptación</strong></td>
<td><p><strong>Antecedentes</strong> (comunes a todos los escenarios)</p>
<blockquote>
<p><strong>Dado</strong> que Andrés Pineda, Técnico de Soporte, usuario 6, inició sesión</p>
</blockquote>
<p><strong>Escenario: CA-1 Registrar un mantenimiento correctivo con todos los datos</strong></p>
<p><em># crear() · RN-H01, RN-H02, RN-H04, RN-H06, RN-H07, RN-H09, RN-H10, RN-H12</em></p>
<blockquote>
<p><strong>Dado</strong> que la fecha actual es 2026-10-06, existe el reporte 1 del activo 5 y el activo 5 (placa NEX-000105) está en Estado Dañado por ese reporte:</p>
<p>│ ID_ReporteDanios │ Descripcion_Danio │ Evidencia │ Fecha_Reporte │ ID_Custodio │ Tipo_Danio │ ID_Activo │</p>
<p>├──────────────────┼─────────────────────────────────┼───────────────────────────────┼──────────────────┼─────────────┼────────────┼───────────┤</p>
<p>│ 1 │ La pantalla parpadea y se apaga │ evidencias/danio-pantalla.jpg │ 2026-10-05 14:20 │ 3 │ Hardware │ 5 │</p>
<p><strong>Cuando</strong> registra el mantenimiento con los datos:</p>
<p>│ Campo │ Valor │</p>
<p>├─────────────────────┼────────────────────────┤</p>
<p>│ ID_Activo │ 5 │</p>
<p>│ ID_ReporteDanios │ 1 │</p>
<p>│ Tipo_Mantenimiento │ Correctivo │</p>
<p>│ Descripcion │ Cambio de pantalla │</p>
<p>│ Fecha_Mantenimiento │ 2026-10-06 09:15 │</p>
<p>│ Costo │ 350000 │</p>
<p>│ Evidencia │ informes/mant-0001.pdf │</p>
<p><strong>Entonces</strong> el sistema responde «Mantenimiento registrado correctamente.»</p>
<p><strong>Y</strong> el mantenimiento queda guardado con:</p>
<p>│ ID_Mantenimiento │ ID_Activo │ ID_ReporteDanios │ Tipo_Mantenimiento │ Descripcion │ Fecha_Mantenimiento │ ID_Tecnico │ Costo │ Evidencia │</p>
<p>├──────────────────┼───────────┼──────────────────┼────────────────────┼────────────────────┼─────────────────────┼────────────┼────────┼────────────────────────┤</p>
<p>│ (automático) │ 5 │ 1 │ Correctivo │ Cambio de pantalla │ 2026-10-06 09:15 │ 6 │ 350000 │ informes/mant-0001.pdf │</p>
<p><strong>Y</strong> ID_Mantenimiento lo asignó el sistema e ID_Tecnico es el usuario de la sesión (6), que no se digitó</p>
<p><strong>Y</strong> el activo 5 conserva Estado Dañado: el mantenimiento no cambia el estado (el Responsable de Activos lo devuelve a Disponible con Activo.actualizar(), sin asignación Vigente)</p>
</blockquote>
<p><strong>Escenario: CA-2 Registrar un mantenimiento preventivo sin reporte, costo ni evidencia</strong></p>
<p><em># crear() · RN-H02, RN-H06, RN-H12, RN-H13</em></p>
<blockquote>
<p><strong>Dado</strong> que la fecha actual es 2026-10-06 y el activo 1 (placa NEX-000101) está en Estado Disponible</p>
<p><strong>Cuando</strong> registra el mantenimiento con ID_Activo 1, Tipo_Mantenimiento Preventivo, Descripcion Limpieza y revisión y Fecha_Mantenimiento 2026-10-06 08:00, sin ID_ReporteDanios, Costo ni Evidencia</p>
<p><strong>Entonces</strong> el sistema responde «Mantenimiento registrado correctamente.»</p>
<p><strong>Y</strong> el mantenimiento queda con ID_ReporteDanios, Costo y Evidencia vacíos e ID_Tecnico 6</p>
<p><strong>Y</strong> el activo 1 conserva Estado Disponible</p>
</blockquote>
<p><strong>Esquema del escenario: CA-3 Datos obligatorios vacíos</strong></p>
<p><em># crear() · RN-H02</em></p>
<blockquote>
<p><strong>Dado</strong> que el activo 5 existe y está en Estado Dañado</p>
<p><strong>Cuando</strong> registra un mantenimiento con &lt;campo&gt; vacío y los demás datos válidos</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> no se crea el mantenimiento</p>
<p><strong>Ejemplos:</strong></p>
<p>│ campo │ mensaje │</p>
<p>├─────────────────────┼────────────────────────────────────────────────────┤</p>
<p>│ ID_Activo │ «El activo es obligatorio.» │</p>
<p>│ Tipo_Mantenimiento │ «El tipo de mantenimiento es obligatorio.» │</p>
<p>│ Descripcion │ «La descripción del mantenimiento es obligatoria.» │</p>
<p>│ Fecha_Mantenimiento │ «La fecha del mantenimiento es obligatoria.» │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-4 Longitud máxima aceptada y superada</strong></p>
<p><em># crear() · RN-H03</em></p>
<blockquote>
<p><strong>Dado</strong> que el activo 5 existe y está en Estado Dañado</p>
<p><strong>Cuando</strong> registra un mantenimiento del activo 5 con &lt;campo&gt; de &lt;valor&gt; y los demás datos válidos</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Ejemplos:</strong></p>
<p>│ campo │ valor │ longitud │ máximo │ mensaje │</p>
<p>├─────────────┼─────────────────────────┼──────────┼────────┼─────────────────────────────────────────────────────────────────────┤</p>
<p>│ Descripcion │ texto de 300 caracteres │ 300 │ 300 │ «Mantenimiento registrado correctamente.» │</p>
<p>│ Descripcion │ texto de 301 caracteres │ 301 │ 300 │ «La descripción del mantenimiento no puede superar 300 caracteres.» │</p>
<p>│ Evidencia │ texto de 255 caracteres │ 255 │ 255 │ «Mantenimiento registrado correctamente.» │</p>
<p>│ Evidencia │ texto de 256 caracteres │ 256 │ 255 │ «La evidencia no puede superar 255 caracteres.» │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-5 Tipo, costo y fecha no válidos</strong></p>
<p><em># crear() · RN-H04, RN-H10, RN-H11</em></p>
<blockquote>
<p><strong>Dado</strong> que la fecha actual es 2026-10-06 y el activo 5 existe y está en Estado Dañado</p>
<p><strong>Cuando</strong> registra un mantenimiento del activo 5 con &lt;campo&gt; &lt;valor&gt; y los demás datos válidos</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Ejemplos:</strong></p>
<p>│ campo │ valor │ mensaje │</p>
<p>├─────────────────────┼──────────────────┼──────────────────────────────────────────────────────┤</p>
<p>│ Tipo_Mantenimiento │ Predictivo │ «El tipo de mantenimiento no es válido.» │</p>
<p>│ Costo │ -1000 │ «El costo no puede ser negativo.» │</p>
<p>│ Costo │ 1500.50 │ «El costo debe ser un valor en pesos, sin centavos.» │</p>
<p>│ Fecha_Mantenimiento │ 2026-10-07 09:00 │ «La fecha del mantenimiento no puede ser futura.» │</p>
<p>│ Costo │ 0 │ «Mantenimiento registrado correctamente.» │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-6 Activo o reporte inválidos</strong></p>
<p><em># crear() · RN-H05, RN-H06, RN-H07, RN-H08</em></p>
<blockquote>
<p><strong>Dado</strong> que existen los reportes:</p>
<p>│ ID_ReporteDanios │ Descripcion_Danio │ Evidencia │ Fecha_Reporte │ ID_Custodio │ Tipo_Danio │ ID_Activo │</p>
<p>├──────────────────┼──────────────────────────────────────────────────┼───────────────────────────────┼──────────────────┼─────────────┼────────────┼───────────┤</p>
<p>│ 1 │ La pantalla parpadea y se apaga │ evidencias/danio-pantalla.jpg │ 2026-10-05 14:20 │ 3 │ Hardware │ 5 │</p>
<p>│ 2 │ El sistema se reinicia al abrir hojas de cálculo │ (vacío) │ 2026-10-06 08:50 │ 1 │ Software │ 2 │</p>
<p><strong>Y</strong> que el activo 9 está en Estado Baja y el activo 5 está en Estado Dañado</p>
<p><strong>Cuando</strong> registra un mantenimiento con ID_Activo &lt;activo&gt; e ID_ReporteDanios &lt;reporte&gt; y los demás datos válidos</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> no se crea el mantenimiento</p>
<p><strong>Ejemplos:</strong></p>
<p>│ activo │ reporte │ caso │ mensaje │</p>
<p>├────────┼─────────┼────────────────────────┼────────────────────────────────────────────────┤</p>
<p>│ 99 │ (vacío) │ activo inexistente │ «El activo no existe.» │</p>
<p>│ 9 │ (vacío) │ activo en Baja │ «Un activo en baja no admite mantenimiento.» │</p>
<p>│ 5 │ 99 │ reporte inexistente │ «El reporte de daño no existe.» │</p>
<p>│ 5 │ 2 │ reporte de otro activo │ «El reporte de daño no corresponde al activo.» │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-7 Técnico inexistente, inactivo o sin el rol Técnico de Soporte</strong></p>
<p><em># crear() · RN-H09</em></p>
<blockquote>
<p><strong>Dado</strong> que existen los usuarios:</p>
<p>│ ID_Usuario │ Nombre │ Apellido │ activo │ rol │</p>
<p>├────────────┼────────┼──────────┼────────┼────────────────────────┤</p>
<p>│ 6 │ Andrés │ Pineda │ TRUE │ Técnico de Soporte │</p>
<p>│ 13 │ Hugo │ Vargas │ FALSE │ Técnico de Soporte │</p>
<p>│ 7 │ Carlos │ Mejía │ TRUE │ Empleado │</p>
<p>│ 2 │ Marta │ Rojas │ TRUE │ Responsable de Activos │</p>
<p><strong>Cuando</strong> el usuario &lt;usuario&gt; de la sesión intenta registrar un mantenimiento válido del activo 5, en lugar de Andrés Pineda</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> no se crea el mantenimiento</p>
<p><strong>Ejemplos:</strong></p>
<p>│ usuario │ caso │ mensaje │</p>
<p>├─────────┼────────────────────────────┼──────────────────────────────────────────────────┤</p>
<p>│ 99 │ no existe │ «El usuario no existe.» │</p>
<p>│ 13 │ inactivo │ «El usuario está inactivo.» │</p>
<p>│ 7 │ rol Empleado │ «El usuario no tiene el rol Técnico de Soporte.» │</p>
<p>│ 2 │ rol Responsable de Activos │ «El usuario no tiene el rol Técnico de Soporte.» │</p>
</blockquote></td>
</tr>
<tr class="even">
<td><strong>Origen de la necesidad</strong></td>
<td>Pregunta 7 de la encuesta: «historial de reparaciones» es la funcionalidad más deseada, 8 de 19; Pregunta 11: «historial de mantenimiento» es el dato más relevante para 5 de 19; Pregunta 9: «mantenimiento» es la información más importante para 4 de 19 (cuenta una respuesta que marcó todas las opciones). N-08.</td>
</tr>
<tr class="odd">
<td><strong>RF derivados</strong></td>
<td>RF-32, RF-131, RF-132, RF-133, RF-134, RF-172</td>
</tr>
<tr class="even">
<td><strong>Prioridad</strong></td>
<td>Alta</td>
</tr>
</tbody>
</table>

*Nota: HU de proceso: el historial nace aquí; prioridad Alta porque el historial de reparaciones es lo más pedido (8 de 19). Efecto sobre el activo: CRF-003, cambio 4 (propuesta, sin aplicar): crear() no cambia Estado_Activo. Fecha_Mantenimiento la informa el técnico (el sistema no la asigna) y no puede ser futura (RN-H11, propuesta). Si un mantenimiento Correctivo debe exigir un reporte de daños no está en las fuentes: ID_ReporteDanios es opcional y no se decide (P-56). Solo registro simple: el mantenimiento preventivo avanzado está fuera del alcance (sin programación ni recordatorios; RN-H13, P-59). ID_Tecnico es el usuario en sesión: no se digita. Costo (RN-H10): en pesos sin centavos (diccionario) y no negativo (propuesta; P-58). Cifras contrastadas con 1.7.2.*

**HU-30 Consultar historial de mantenimiento**

<table>
<colgroup>
<col style="width: 16%" />
<col style="width: 83%" />
</colgroup>
<thead>
<tr class="header">
<th><strong>Código</strong></th>
<th><strong>HU-30</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><strong>Título corto</strong></td>
<td>Consultar historial de mantenimiento</td>
</tr>
<tr class="even">
<td><strong>Historia</strong></td>
<td><strong>Como</strong> Andrés Pineda, Técnico de Soporte, <strong>quiero</strong> consultar un mantenimiento por su identificador y el historial de mantenimiento de un equipo, del más reciente al más antiguo, <strong>para</strong> saber qué se le ha hecho antes a un equipo antes de intervenirlo.</td>
</tr>
<tr class="odd">
<td><strong>Criterios de aceptación</strong></td>
<td><p><strong>Antecedentes</strong> (comunes a todos los escenarios)</p>
<blockquote>
<p><strong>Dado</strong> que Andrés Pineda, Técnico de Soporte, inició sesión</p>
</blockquote>
<p><strong>Esquema del escenario: CA-1 Consultar un mantenimiento por su identificador</strong></p>
<p><em># buscarPorId() · RN-H14</em></p>
<blockquote>
<p><strong>Dado</strong> que existen los mantenimientos:</p>
<p>│ ID_Mantenimiento │ ID_Activo │ ID_ReporteDanios │ Tipo_Mantenimiento │ Descripcion │ Fecha_Mantenimiento │ ID_Tecnico │ Costo │ Evidencia │</p>
<p>├──────────────────┼───────────┼──────────────────┼────────────────────┼─────────────────────┼─────────────────────┼────────────┼─────────┼────────────────────────┤</p>
<p>│ 1 │ 5 │ 1 │ Correctivo │ Cambio de pantalla │ 2026-10-06 09:15 │ 6 │ 350000 │ informes/mant-0001.pdf │</p>
<p>│ 2 │ 8 │ (vacío) │ Preventivo │ Limpieza y revisión │ 2026-09-28 09:00 │ 6 │ (vacío) │ (vacío) │</p>
<p>│ 3 │ 2 │ 2 │ Correctivo │ Reinstalar sistema │ 2026-10-06 08:30 │ 6 │ (vacío) │ (vacío) │</p>
<p>│ 4 │ 5 │ (vacío) │ Preventivo │ Revisión de batería │ 2026-08-10 09:00 │ 6 │ 80000 │ (vacío) │</p>
<p><strong>Cuando</strong> consulta por ID_Mantenimiento &lt;id&gt;</p>
<p><strong>Entonces</strong> ve el mantenimiento con sus 9 campos, según la fila de Ejemplos</p>
<p><strong>Y</strong> la consulta no modifica el mantenimiento ni el estado del activo</p>
<p><strong>Ejemplos:</strong></p>
<p>│ ID_Mantenimiento │ ID_Activo │ ID_ReporteDanios │ Tipo_Mantenimiento │ Descripcion │ Fecha_Mantenimiento │ ID_Tecnico │ Costo │ Evidencia │</p>
<p>├──────────────────┼───────────┼──────────────────┼────────────────────┼─────────────────────┼─────────────────────┼────────────┼─────────┼────────────────────────┤</p>
<p>│ 1 │ 5 │ 1 │ Correctivo │ Cambio de pantalla │ 2026-10-06 09:15 │ 6 │ 350000 │ informes/mant-0001.pdf │</p>
<p>│ 2 │ 8 │ (vacío) │ Preventivo │ Limpieza y revisión │ 2026-09-28 09:00 │ 6 │ (vacío) │ (vacío) │</p>
</blockquote>
<p><strong>Escenario: CA-2 Mantenimiento no encontrado</strong></p>
<p><em># buscarPorId() · RN-H14</em></p>
<blockquote>
<p><strong>Dado</strong> que no existe el mantenimiento 99</p>
<p><strong>Cuando</strong> consulta por ID_Mantenimiento 99</p>
<p><strong>Entonces</strong> el sistema responde «No se encontró ningún mantenimiento con ese identificador.»</p>
<p><strong>Y</strong> no se muestra ningún mantenimiento</p>
</blockquote>
<p><strong>Escenario: CA-3 Ver el historial de un activo, del más reciente al más antiguo</strong></p>
<p><em># listarPorActivo() · RN-H15</em></p>
<blockquote>
<p><strong>Dado</strong> que existen los mantenimientos:</p>
<p>│ ID_Mantenimiento │ ID_Activo │ ID_ReporteDanios │ Tipo_Mantenimiento │ Descripcion │ Fecha_Mantenimiento │ ID_Tecnico │ Costo │ Evidencia │</p>
<p>├──────────────────┼───────────┼──────────────────┼────────────────────┼─────────────────────┼─────────────────────┼────────────┼─────────┼────────────────────────┤</p>
<p>│ 1 │ 5 │ 1 │ Correctivo │ Cambio de pantalla │ 2026-10-06 09:15 │ 6 │ 350000 │ informes/mant-0001.pdf │</p>
<p>│ 2 │ 8 │ (vacío) │ Preventivo │ Limpieza y revisión │ 2026-09-28 09:00 │ 6 │ (vacío) │ (vacío) │</p>
<p>│ 3 │ 2 │ 2 │ Correctivo │ Reinstalar sistema │ 2026-10-06 08:30 │ 6 │ (vacío) │ (vacío) │</p>
<p>│ 4 │ 5 │ (vacío) │ Preventivo │ Revisión de batería │ 2026-08-10 09:00 │ 6 │ 80000 │ (vacío) │</p>
<p><strong>Cuando</strong> consulta el historial del activo 5</p>
<p><strong>Entonces</strong> ve solo los mantenimientos 1 y 4, con sus 9 campos, del más reciente al más antiguo por Fecha_Mantenimiento, aunque su ID_Mantenimiento no siga ese orden:</p>
<p>│ ID_Mantenimiento │ ID_Activo │ ID_ReporteDanios │ Tipo_Mantenimiento │ Descripcion │ Fecha_Mantenimiento │ ID_Tecnico │ Costo │ Evidencia │</p>
<p>├──────────────────┼───────────┼──────────────────┼────────────────────┼─────────────────────┼─────────────────────┼────────────┼────────┼────────────────────────┤</p>
<p>│ 1 │ 5 │ 1 │ Correctivo │ Cambio de pantalla │ 2026-10-06 09:15 │ 6 │ 350000 │ informes/mant-0001.pdf │</p>
<p>│ 4 │ 5 │ (vacío) │ Preventivo │ Revisión de batería │ 2026-08-10 09:00 │ 6 │ 80000 │ (vacío) │</p>
<p><strong>Y</strong> no ve los mantenimientos 2 y 3, que son de otros activos</p>
</blockquote>
<p><strong>Escenario: CA-4 Activo sin mantenimientos</strong></p>
<p><em># listarPorActivo() · RN-H15</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el activo 1 y no tiene mantenimientos</p>
<p><strong>Cuando</strong> consulta el historial del activo 1</p>
<p><strong>Entonces</strong> el sistema responde «El activo no tiene mantenimientos registrados.»</p>
</blockquote>
<p><strong>Escenario: CA-5 Historial de un activo inexistente</strong></p>
<p><em># listarPorActivo() · RN-H15</em></p>
<blockquote>
<p><strong>Dado</strong> que no existe el activo 99</p>
<p><strong>Cuando</strong> consulta el historial del activo 99</p>
<p><strong>Entonces</strong> el sistema responde «El activo no existe.»</p>
</blockquote></td>
</tr>
<tr class="even">
<td><strong>Origen de la necesidad</strong></td>
<td>Pregunta 7 de la encuesta: «historial de reparaciones» es la funcionalidad más deseada, 8 de 19; Pregunta 11: «historial de mantenimiento» es el dato más relevante para 5 de 19. Alcance 1.2 («consultar el historial de reparaciones de cada activo»). N-08.</td>
</tr>
<tr class="odd">
<td><strong>RF derivados</strong></td>
<td>RF-33, RF-135</td>
</tr>
<tr class="even">
<td><strong>Prioridad</strong></td>
<td>Alta</td>
</tr>
</tbody>
</table>

*Nota: el Técnico de Soporte consulta el historial; quién más lo consulta (Responsable de Activos, Gerente) sigue abierto (RN-H16, Supuesto; P-57). Orden del historial, del más reciente al más antiguo: propuesta. El modelo no tiene baja de mantenimientos. Prioridad Alta: el historial es la funcionalidad más pedida (8 de 19). Cifras contrastadas con 1.7.2.*

**HU-31 Actualizar mantenimiento**

<table>
<colgroup>
<col style="width: 16%" />
<col style="width: 83%" />
</colgroup>
<thead>
<tr class="header">
<th><strong>Código</strong></th>
<th><strong>HU-31</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><strong>Título corto</strong></td>
<td>Actualizar mantenimiento</td>
</tr>
<tr class="even">
<td><strong>Historia</strong></td>
<td><strong>Como</strong> Andrés Pineda, Técnico de Soporte, <strong>quiero</strong> corregir la descripción, el costo y la evidencia de un mantenimiento registrado, <strong>para</strong> que el historial del equipo refleje lo que realmente se hizo.</td>
</tr>
<tr class="odd">
<td><strong>Criterios de aceptación</strong></td>
<td><p><strong>Antecedentes</strong> (comunes a todos los escenarios)</p>
<blockquote>
<p><strong>Dado</strong> que Andrés Pineda, Técnico de Soporte, inició sesión</p>
</blockquote>
<p><strong>Escenario: CA-1 Actualizar descripción, costo y evidencia de un mantenimiento</strong></p>
<p><em># actualizar() · RN-H17, RN-H18</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el mantenimiento 1 con los valores de la columna Antes y el activo 5 está en Estado Dañado</p>
<p><strong>Cuando</strong> actualiza el mantenimiento 1 con los valores de la columna Después:</p>
<p>│ Campo │ Antes │ Después │</p>
<p>├─────────────────────┼────────────────────────┼───────────────────────────────┤</p>
<p>│ ID_Mantenimiento │ 1 │ 1 (sin cambio) │</p>
<p>│ ID_Activo │ 5 │ 5 (sin cambio) │</p>
<p>│ ID_ReporteDanios │ 1 │ 1 (sin cambio) │</p>
<p>│ Tipo_Mantenimiento │ Correctivo │ Correctivo (sin cambio) │</p>
<p>│ Descripcion │ Cambio de pantalla │ Cambio de pantalla y cable │</p>
<p>│ Fecha_Mantenimiento │ 2026-10-06 09:15 │ 2026-10-06 09:15 (sin cambio) │</p>
<p>│ ID_Tecnico │ 6 │ 6 (sin cambio) │</p>
<p>│ Costo │ 350000 │ 420000 │</p>
<p>│ Evidencia │ informes/mant-0001.pdf │ informes/mant-0001-v2.pdf │</p>
<p><strong>Entonces</strong> el sistema responde «Mantenimiento actualizado correctamente.»</p>
<p><strong>Y</strong> el mantenimiento 1 queda con los valores de la columna Después</p>
<p><strong>Y</strong> el activo 5 conserva Estado Dañado</p>
</blockquote>
<p><strong>Esquema del escenario: CA-2 Descripción obligatoria; costo y evidencia opcionales</strong></p>
<p><em># actualizar() · RN-H02, RN-H17</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el mantenimiento 1, con Costo 350000 y Evidencia informes/mant-0001.pdf</p>
<p><strong>Cuando</strong> actualiza el mantenimiento 1 con &lt;campo&gt; vacío y los demás datos válidos</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Ejemplos:</strong></p>
<p>│ campo │ mensaje │</p>
<p>├─────────────┼────────────────────────────────────────────────────┤</p>
<p>│ Descripcion │ «La descripción del mantenimiento es obligatoria.» │</p>
<p>│ Costo │ «Mantenimiento actualizado correctamente.» │</p>
<p>│ Evidencia │ «Mantenimiento actualizado correctamente.» │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-3 Longitud y valores del costo</strong></p>
<p><em># actualizar() · RN-H03, RN-H10</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el mantenimiento 1</p>
<p><strong>Cuando</strong> actualiza el mantenimiento 1 con &lt;campo&gt; de &lt;valor&gt; y los demás datos válidos</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Ejemplos:</strong></p>
<p>│ campo │ valor │ mensaje │</p>
<p>├─────────────┼─────────────────────────┼─────────────────────────────────────────────────────────────────────┤</p>
<p>│ Descripcion │ texto de 300 caracteres │ «Mantenimiento actualizado correctamente.» │</p>
<p>│ Descripcion │ texto de 301 caracteres │ «La descripción del mantenimiento no puede superar 300 caracteres.» │</p>
<p>│ Evidencia │ texto de 255 caracteres │ «Mantenimiento actualizado correctamente.» │</p>
<p>│ Evidencia │ texto de 256 caracteres │ «La evidencia no puede superar 255 caracteres.» │</p>
<p>│ Costo │ -1000 │ «El costo no puede ser negativo.» │</p>
<p>│ Costo │ 1500.50 │ «El costo debe ser un valor en pesos, sin centavos.» │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-4 Campos que no se modifican</strong></p>
<p><em># actualizar() · RN-H01, RN-H17</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el mantenimiento:</p>
<p>│ ID_Mantenimiento │ ID_Activo │ ID_ReporteDanios │ Tipo_Mantenimiento │ Descripcion │ Fecha_Mantenimiento │ ID_Tecnico │ Costo │ Evidencia │</p>
<p>├──────────────────┼───────────┼──────────────────┼────────────────────┼────────────────────┼─────────────────────┼────────────┼────────┼────────────────────────┤</p>
<p>│ 1 │ 5 │ 1 │ Correctivo │ Cambio de pantalla │ 2026-10-06 09:15 │ 6 │ 350000 │ informes/mant-0001.pdf │</p>
<p><strong>Cuando</strong> intenta cambiar el &lt;campo&gt; del mantenimiento 1 a &lt;valor&gt;</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> el mantenimiento 1 conserva sus datos anteriores</p>
<p><strong>Ejemplos:</strong></p>
<p>│ campo │ valor │ mensaje │</p>
<p>├─────────────────────┼──────────────────┼───────────────────────────────────────────────────────────────┤</p>
<p>│ ID_Mantenimiento │ 10 │ «El identificador del mantenimiento no se puede modificar.» │</p>
<p>│ ID_Activo │ 1 │ «El activo del mantenimiento no se puede modificar.» │</p>
<p>│ ID_ReporteDanios │ 2 │ «El reporte de daño del mantenimiento no se puede modificar.» │</p>
<p>│ Tipo_Mantenimiento │ Preventivo │ «El tipo de mantenimiento no se puede modificar.» │</p>
<p>│ Fecha_Mantenimiento │ 2026-10-05 09:00 │ «La fecha del mantenimiento no se puede modificar.» │</p>
<p>│ ID_Tecnico │ 7 │ «El técnico del mantenimiento no se puede modificar.» │</p>
</blockquote>
<p><strong>Escenario: CA-5 Mantenimiento inexistente</strong></p>
<p><em># actualizar() · RN-H14</em></p>
<blockquote>
<p><strong>Dado</strong> que no existe el mantenimiento 99</p>
<p><strong>Cuando</strong> actualiza el mantenimiento 99 con datos válidos</p>
<p><strong>Entonces</strong> el sistema responde «El mantenimiento no existe.»</p>
</blockquote></td>
</tr>
<tr class="even">
<td><strong>Origen de la necesidad</strong></td>
<td>Pregunta 7 de la encuesta: «historial de reparaciones» es la funcionalidad más deseada, 8 de 19; Pregunta 11: «historial de mantenimiento» es el dato más relevante para 5 de 19. N-08.</td>
</tr>
<tr class="odd">
<td><strong>RF derivados</strong></td>
<td>RF-34, RF-136</td>
</tr>
<tr class="even">
<td><strong>Prioridad</strong></td>
<td>Media</td>
</tr>
</tbody>
</table>

*Nota: la Fase A v6 describe actualizar() como «corrige descripción, costo y evidencia»; por eso solo esos tres campos se actualizan y el resto es inmutable (RN-H17, propuesta para los inmutables). Actualizar no cambia Estado_Activo (RN-H18). Quién puede actualizar (¿solo el técnico que lo registró?) sigue abierto (P-57). Prioridad Media: corregir un registro no detiene el proceso. Cifras contrastadas con 1.7.2.*

**Usuario — Anexo 7**

**HU-32 Registrar usuario**

<table>
<colgroup>
<col style="width: 16%" />
<col style="width: 83%" />
</colgroup>
<thead>
<tr class="header">
<th><strong>Código</strong></th>
<th><strong>HU-32</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><strong>Título corto</strong></td>
<td>Registrar usuario</td>
</tr>
<tr class="even">
<td><strong>Historia</strong></td>
<td><strong>Como</strong> Marta Rojas, Responsable de Activos, <strong>quiero</strong> registrar a una persona como usuario del sistema, con su correo, su contraseña y su rol, <strong>para</strong> que pueda ingresar al sistema con el perfil que le corresponde.</td>
</tr>
<tr class="odd">
<td><strong>Criterios de aceptación</strong></td>
<td><p><strong>Antecedentes</strong> (comunes a todos los escenarios)</p>
<blockquote>
<p><strong>Dado</strong> que Marta Rojas, Responsable de Activos, inició sesión</p>
</blockquote>
<p><strong>Escenario: CA-1 Registrar un usuario con todos sus datos</strong></p>
<p><em># crear() · RN-U01, RN-U02, RN-U07</em></p>
<blockquote>
<p><strong>Dado</strong> que no existe un usuario con el correo andres.pineda@ejemplo.com</p>
<p><strong>Cuando</strong> registra al usuario con los datos:</p>
<p>│ Campo │ Valor │</p>
<p>├──────────┼───────────────────────────┤</p>
<p>│ Nombre │ Andrés │</p>
<p>│ Apellido │ Pineda │</p>
<p>│ Email │ andres.pineda@ejemplo.com │</p>
<p>│ Password │ Clave-Ejemplo-1 │</p>
<p>│ rol │ Técnico de Soporte │</p>
<p><strong>Entonces</strong> el sistema responde «Usuario registrado correctamente.»</p>
<p><strong>Y</strong> el usuario queda guardado con:</p>
<p>│ ID_Usuario │ Nombre │ Apellido │ Email │ Password │ activo │ rol │</p>
<p>├──────────────┼────────┼──────────┼───────────────────────────┼─────────────────┼────────┼────────────────────┤</p>
<p>│ (automático) │ Andrés │ Pineda │ andres.pineda@ejemplo.com │ (valor cifrado) │ TRUE │ Técnico de Soporte │</p>
<p><strong>Y</strong> ID_Usuario y activo los asignó el sistema</p>
<p><strong>Y</strong> el valor almacenado en Password es distinto de Clave-Ejemplo-1: se guardó cifrado, no en texto plano</p>
</blockquote>
<p><strong>Esquema del escenario: CA-2 Datos obligatorios vacíos</strong></p>
<p><em># crear() · RN-U02, RN-U08</em></p>
<blockquote>
<p><strong>Dado</strong> que no existe un usuario con el correo andres.pineda@ejemplo.com</p>
<p><strong>Cuando</strong> registra un usuario con &lt;campo&gt; vacío y los demás datos válidos</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> no se crea el usuario</p>
<p><strong>Ejemplos:</strong></p>
<p>│ campo │ mensaje │</p>
<p>├──────────┼─────────────────────────────────┤</p>
<p>│ Nombre │ «El nombre es obligatorio.» │</p>
<p>│ Apellido │ «El apellido es obligatorio.» │</p>
<p>│ Email │ «El correo es obligatorio.» │</p>
<p>│ Password │ «La contraseña es obligatoria.» │</p>
<p>│ rol │ «El rol es obligatorio.» │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-3 Longitud máxima aceptada y superada</strong></p>
<p><em># crear() · RN-U03</em></p>
<blockquote>
<p><strong>Dado</strong> que no existe un usuario con el correo andres.pineda@ejemplo.com</p>
<p><strong>Cuando</strong> registra un usuario con &lt;campo&gt; de &lt;valor&gt; y los demás datos válidos</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Ejemplos:</strong></p>
<p>│ campo │ valor │ longitud │ máximo │ mensaje │</p>
<p>├──────────┼─────────────────────────────────┼──────────┼────────┼───────────────────────────────────────────────┤</p>
<p>│ Nombre │ texto de 20 caracteres │ 20 │ 20 │ «Usuario registrado correctamente.» │</p>
<p>│ Apellido │ texto de 20 caracteres │ 20 │ 20 │ «Usuario registrado correctamente.» │</p>
<p>│ Email │ correo válido de 100 caracteres │ 100 │ 100 │ «Usuario registrado correctamente.» │</p>
<p>│ Nombre │ texto de 21 caracteres │ 21 │ 20 │ «El nombre no puede superar 20 caracteres.» │</p>
<p>│ Apellido │ texto de 21 caracteres │ 21 │ 20 │ «El apellido no puede superar 20 caracteres.» │</p>
<p>│ Email │ correo válido de 101 caracteres │ 101 │ 100 │ «El correo no puede superar 100 caracteres.» │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-4 Correo ya registrado</strong></p>
<p><em># existeEmail(), crear() · RN-U04</em></p>
<blockquote>
<p><strong>Dado</strong> que existen los usuarios:</p>
<p>│ ID_Usuario │ Nombre │ Apellido │ Email │ activo │ rol │</p>
<p>├────────────┼────────┼──────────┼──────────────────────────┼────────┼────────────────────────┤</p>
<p>│ 7 │ Carlos │ Mejía │ carlos.mejia@ejemplo.com │ TRUE │ Empleado │</p>
<p>│ 11 │ Pablo │ Duarte │ pablo.duarte@ejemplo.com │ FALSE │ Responsable de Activos │</p>
<p><strong>Cuando</strong> registra un usuario con Email &lt;correo&gt; y los demás datos válidos</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> no se crea otro usuario</p>
<p><strong>Ejemplos:</strong></p>
<p>│ correo │ caso │ mensaje │</p>
<p>├──────────────────────────┼──────────────────┼─────────────────────────────────┤</p>
<p>│ carlos.mejia@ejemplo.com │ usuario activo │ «El correo ya está registrado.» │</p>
<p>│ pablo.duarte@ejemplo.com │ usuario inactivo │ «El correo ya está registrado.» │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-5 Formato de correo no válido (RN propuesta)</strong></p>
<p><em># crear() · RN-U05</em></p>
<blockquote>
<p><strong>Dado</strong> que no existe un usuario con el correo andres.pineda@ejemplo.com</p>
<p><strong>Cuando</strong> registra un usuario con Email &lt;correo&gt; y los demás datos válidos</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> no se crea el usuario</p>
<p><strong>Ejemplos:</strong></p>
<p>│ correo │ defecto │ mensaje │</p>
<p>├───────────────────────────┼───────────────────────┼─────────────────────────────────────────┤</p>
<p>│ andres.pineda.ejemplo.com │ sin arroba │ «El correo no tiene un formato válido.» │</p>
<p>│ andres.pineda@ │ sin dominio │ «El correo no tiene un formato válido.» │</p>
<p>│ @ejemplo.com │ sin nombre de usuario │ «El correo no tiene un formato válido.» │</p>
<p>│ andres pineda@ejemplo.com │ con espacio │ «El correo no tiene un formato válido.» │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-6 Rol válido y rol fuera de la enumeración</strong></p>
<p><em># crear() · RN-U06</em></p>
<blockquote>
<p><strong>Dado</strong> que no existe un usuario con el correo andres.pineda@ejemplo.com</p>
<p><strong>Cuando</strong> registra un usuario con rol &lt;rol&gt; y los demás datos válidos</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Ejemplos:</strong></p>
<p>│ rol │ mensaje │</p>
<p>├────────────────────────┼─────────────────────────────────────┤</p>
<p>│ Responsable de Activos │ «Usuario registrado correctamente.» │</p>
<p>│ Empleado │ «Usuario registrado correctamente.» │</p>
<p>│ Aprobador │ «Usuario registrado correctamente.» │</p>
<p>│ Técnico de Soporte │ «Usuario registrado correctamente.» │</p>
<p>│ Gerente │ «Usuario registrado correctamente.» │</p>
<p>│ Administrador │ «El rol no es válido.» │</p>
<p>│ Contratista │ «El rol no es válido.» │</p>
</blockquote></td>
</tr>
<tr class="even">
<td><strong>Origen de la necesidad</strong></td>
<td>Alcance 1.2 – Tabla 5, pendiente de validación.</td>
</tr>
<tr class="odd">
<td><strong>RF derivados</strong></td>
<td>RF-35, RF-36</td>
</tr>
<tr class="even">
<td><strong>Prioridad</strong></td>
<td>Alta</td>
</tr>
</tbody>
</table>

*Nota: El Alcance 1.2 dice que el sistema permite «gestionar roles y permisos según el perfil de cada usuario» y no nombra quién registra usuarios: Marta Rojas actúa como Supuesto (P-60). La política de complejidad de la contraseña NO está definida: solo se exige que no esté vacía; Clave-Ejemplo-1 es un dato de ejemplo, no una regla (P-61). El mecanismo de cifrado tampoco está definido (P-62). El formato del correo es propuesta (P-63). El primer usuario del sistema queda abierto (P-73). Sin cifras de la encuesta en el Origen.*

**HU-33 Consultar usuario**

<table>
<colgroup>
<col style="width: 16%" />
<col style="width: 83%" />
</colgroup>
<thead>
<tr class="header">
<th><strong>Código</strong></th>
<th><strong>HU-33</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><strong>Título corto</strong></td>
<td>Consultar usuario</td>
</tr>
<tr class="even">
<td><strong>Historia</strong></td>
<td><strong>Como</strong> Marta Rojas, Responsable de Activos, <strong>quiero</strong> consultar un usuario por su identificador o por su correo, <strong>para</strong> verificar sus datos, su rol y si su cuenta está activa.</td>
</tr>
<tr class="odd">
<td><strong>Criterios de aceptación</strong></td>
<td><p><strong>Antecedentes</strong> (comunes a todos los escenarios)</p>
<blockquote>
<p><strong>Dado</strong> que Marta Rojas, Responsable de Activos, inició sesión</p>
</blockquote>
<p><strong>Escenario: CA-1 Consultar un usuario por su identificador</strong></p>
<p><em># buscarPorId() · RN-U09</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el usuario:</p>
<p>│ ID_Usuario │ Nombre │ Apellido │ Email │ activo │ rol │</p>
<p>├────────────┼────────┼──────────┼──────────────────────────┼────────┼──────────┤</p>
<p>│ 7 │ Carlos │ Mejía │ carlos.mejia@ejemplo.com │ TRUE │ Empleado │</p>
<p><strong>Cuando</strong> consulta por ID_Usuario 7</p>
<p><strong>Entonces</strong> ve el usuario con sus 6 campos: ID_Usuario 7, Nombre Carlos, Apellido Mejía, Email carlos.mejia@ejemplo.com, activo TRUE y rol Empleado</p>
<p><strong>Y</strong> la consulta no modifica el usuario</p>
</blockquote>
<p><strong>Escenario: CA-2 Consultar un usuario por su correo</strong></p>
<p><em># buscarPorEmail() · RN-U09</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el usuario:</p>
<p>│ ID_Usuario │ Nombre │ Apellido │ Email │ activo │ rol │</p>
<p>├────────────┼────────┼──────────┼─────────────────────────┼────────┼───────────┤</p>
<p>│ 9 │ Laura │ Gómez │ laura.gomez@ejemplo.com │ TRUE │ Aprobador │</p>
<p><strong>Cuando</strong> consulta por Email laura.gomez@ejemplo.com</p>
<p><strong>Entonces</strong> ve el usuario con sus 6 campos: ID_Usuario 9, Nombre Laura, Apellido Gómez, Email laura.gomez@ejemplo.com, activo TRUE y rol Aprobador</p>
</blockquote>
<p><strong>Esquema del escenario: CA-3 La consulta nunca muestra la contraseña (RN propuesta)</strong></p>
<p><em># buscarPorId(), buscarPorEmail() · RN-U09</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el usuario 7 con su Password almacenada cifrada:</p>
<p>│ ID_Usuario │ Nombre │ Apellido │ Email │ Password │ activo │ rol │</p>
<p>├────────────┼────────┼──────────┼──────────────────────────┼───────────┼────────┼──────────┤</p>
<p>│ 7 │ Carlos │ Mejía │ carlos.mejia@ejemplo.com │ (cifrada) │ TRUE │ Empleado │</p>
<p><strong>Cuando</strong> consulta por &lt;forma&gt; &lt;valor&gt;</p>
<p><strong>Entonces</strong> ve el usuario con sus 6 campos: ID_Usuario, Nombre, Apellido, Email, activo y rol</p>
<p><strong>Y</strong> no ve Password, ni en texto plano ni cifrada</p>
<p><strong>Ejemplos:</strong></p>
<p>│ forma │ valor │</p>
<p>├────────────┼──────────────────────────┤</p>
<p>│ ID_Usuario │ 7 │</p>
<p>│ Email │ carlos.mejia@ejemplo.com │</p>
</blockquote>
<p><strong>Escenario: CA-4 Consultar un usuario inactivo</strong></p>
<p><em># buscarPorId() · RN-U09</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el usuario:</p>
<p>│ ID_Usuario │ Nombre │ Apellido │ Email │ activo │ rol │</p>
<p>├────────────┼────────┼──────────┼──────────────────────────┼────────┼────────────────────────┤</p>
<p>│ 11 │ Pablo │ Duarte │ pablo.duarte@ejemplo.com │ FALSE │ Responsable de Activos │</p>
<p><strong>Cuando</strong> consulta por ID_Usuario 11</p>
<p><strong>Entonces</strong> ve el usuario con activo FALSE y sus demás datos intactos</p>
</blockquote>
<p><strong>Esquema del escenario: CA-5 Usuario no encontrado o correo vacío</strong></p>
<p><em># buscarPorId(), buscarPorEmail() · RN-U09</em></p>
<blockquote>
<p><strong>Dado</strong> que existen los usuarios:</p>
<p>│ ID_Usuario │ Nombre │ Apellido │ Email │ activo │ rol │</p>
<p>├────────────┼────────┼──────────┼──────────────────────────┼────────┼────────────────────────┤</p>
<p>│ 2 │ Marta │ Rojas │ marta.rojas@ejemplo.com │ TRUE │ Responsable de Activos │</p>
<p>│ 7 │ Carlos │ Mejía │ carlos.mejia@ejemplo.com │ TRUE │ Empleado │</p>
<p><strong>Cuando</strong> consulta por &lt;forma&gt; &lt;valor&gt;</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> no se muestra ningún usuario</p>
<p><strong>Ejemplos:</strong></p>
<p>│ forma │ valor │ mensaje │</p>
<p>├────────────┼───────────────────┼────────────────────────────────────────────────────────┤</p>
<p>│ ID_Usuario │ 99 │ «No se encontró ningún usuario con ese identificador.» │</p>
<p>│ Email │ nadie@ejemplo.com │ «No se encontró ningún usuario con ese correo.» │</p>
<p>│ Email │ (vacío) │ «El correo es obligatorio.» │</p>
</blockquote></td>
</tr>
<tr class="even">
<td><strong>Origen de la necesidad</strong></td>
<td>Alcance 1.2 – Tabla 5, pendiente de validación.</td>
</tr>
<tr class="odd">
<td><strong>RF derivados</strong></td>
<td>RF-37</td>
</tr>
<tr class="even">
<td><strong>Prioridad</strong></td>
<td>Alta</td>
</tr>
</tbody>
</table>

*Nota: Marta Rojas actúa como Supuesto (P-60); quién más consulta usuarios sigue abierto (P-72). Las consultas nunca muestran la contraseña (RN propuesta) y devuelven también a los usuarios inactivos. Sin cifras de la encuesta en el Origen.*

**HU-34 Actualizar usuario**

<table>
<colgroup>
<col style="width: 16%" />
<col style="width: 83%" />
</colgroup>
<thead>
<tr class="header">
<th><strong>Código</strong></th>
<th><strong>HU-34</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><strong>Título corto</strong></td>
<td>Actualizar usuario</td>
</tr>
<tr class="even">
<td><strong>Historia</strong></td>
<td><strong>Como</strong> Marta Rojas, Responsable de Activos, <strong>quiero</strong> corregir el nombre, el apellido, el correo o el rol de un usuario activo, <strong>para</strong> mantener sus datos y su perfil al día sin tocar su contraseña.</td>
</tr>
<tr class="odd">
<td><strong>Criterios de aceptación</strong></td>
<td><p><strong>Antecedentes</strong> (comunes a todos los escenarios)</p>
<blockquote>
<p><strong>Dado</strong> que Marta Rojas, Responsable de Activos, inició sesión</p>
</blockquote>
<p><strong>Escenario: CA-1 Actualizar los datos de un usuario activo</strong></p>
<p><em># actualizar() · RN-U02, RN-U10</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el usuario 9 activo con los valores de la columna Antes</p>
<p><strong>Cuando</strong> actualiza el usuario 9 con los valores de la columna Después:</p>
<p>│ Campo │ Antes │ Después │</p>
<p>├────────────┼─────────────────────────┼──────────────────────────────┤</p>
<p>│ Nombre │ Laura │ Laura María │</p>
<p>│ Apellido │ Gómez │ Gómez Ríos │</p>
<p>│ Email │ laura.gomez@ejemplo.com │ laura.gomez.rios@ejemplo.com │</p>
<p>│ rol │ Aprobador │ Gerente │</p>
<p>│ ID_Usuario │ 9 │ 9 (sin cambio) │</p>
<p>│ Password │ (cifrada) │ (cifrada) (sin cambio) │</p>
<p>│ activo │ TRUE │ TRUE (sin cambio) │</p>
<p><strong>Entonces</strong> el sistema responde «Usuario actualizado correctamente.»</p>
<p><strong>Y</strong> el usuario 9 queda con los valores de la columna Después</p>
<p><strong>Y</strong> Password conserva su valor almacenado</p>
</blockquote>
<p><strong>Esquema del escenario: CA-2 Datos obligatorios vacíos</strong></p>
<p><em># actualizar() · RN-U02</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el usuario:</p>
<p>│ ID_Usuario │ Nombre │ Apellido │ Email │ activo │ rol │</p>
<p>├────────────┼────────┼──────────┼─────────────────────────┼────────┼───────────┤</p>
<p>│ 9 │ Laura │ Gómez │ laura.gomez@ejemplo.com │ TRUE │ Aprobador │</p>
<p><strong>Cuando</strong> actualiza el usuario 9 con &lt;campo&gt; vacío y los demás datos válidos</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> el usuario 9 conserva sus datos anteriores</p>
<p><strong>Ejemplos:</strong></p>
<p>│ campo │ mensaje │</p>
<p>├──────────┼───────────────────────────────┤</p>
<p>│ Nombre │ «El nombre es obligatorio.» │</p>
<p>│ Apellido │ «El apellido es obligatorio.» │</p>
<p>│ Email │ «El correo es obligatorio.» │</p>
<p>│ rol │ «El rol es obligatorio.» │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-3 Longitud máxima aceptada y superada</strong></p>
<p><em># actualizar() · RN-U03</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el usuario:</p>
<p>│ ID_Usuario │ Nombre │ Apellido │ Email │ activo │ rol │</p>
<p>├────────────┼────────┼──────────┼─────────────────────────┼────────┼───────────┤</p>
<p>│ 9 │ Laura │ Gómez │ laura.gomez@ejemplo.com │ TRUE │ Aprobador │</p>
<p><strong>Cuando</strong> actualiza el usuario 9 con &lt;campo&gt; de &lt;valor&gt; y los demás datos válidos</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Ejemplos:</strong></p>
<p>│ campo │ valor │ longitud │ máximo │ mensaje │</p>
<p>├──────────┼─────────────────────────────────┼──────────┼────────┼───────────────────────────────────────────────┤</p>
<p>│ Nombre │ texto de 20 caracteres │ 20 │ 20 │ «Usuario actualizado correctamente.» │</p>
<p>│ Apellido │ texto de 20 caracteres │ 20 │ 20 │ «Usuario actualizado correctamente.» │</p>
<p>│ Email │ correo válido de 100 caracteres │ 100 │ 100 │ «Usuario actualizado correctamente.» │</p>
<p>│ Nombre │ texto de 21 caracteres │ 21 │ 20 │ «El nombre no puede superar 20 caracteres.» │</p>
<p>│ Apellido │ texto de 21 caracteres │ 21 │ 20 │ «El apellido no puede superar 20 caracteres.» │</p>
<p>│ Email │ correo válido de 101 caracteres │ 101 │ 100 │ «El correo no puede superar 100 caracteres.» │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-4 Formato de correo y rol no válidos</strong></p>
<p><em># actualizar() · RN-U05, RN-U06</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el usuario:</p>
<p>│ ID_Usuario │ Nombre │ Apellido │ Email │ activo │ rol │</p>
<p>├────────────┼────────┼──────────┼─────────────────────────┼────────┼───────────┤</p>
<p>│ 9 │ Laura │ Gómez │ laura.gomez@ejemplo.com │ TRUE │ Aprobador │</p>
<p><strong>Cuando</strong> actualiza el usuario 9 con &lt;campo&gt; &lt;valor&gt; y los demás datos válidos</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> el usuario 9 conserva sus datos anteriores</p>
<p><strong>Ejemplos:</strong></p>
<p>│ campo │ valor │ mensaje │</p>
<p>├───────┼─────────────────────────┼─────────────────────────────────────────┤</p>
<p>│ Email │ laura.gomez.ejemplo.com │ «El correo no tiene un formato válido.» │</p>
<p>│ Email │ laura gomez@ejemplo.com │ «El correo no tiene un formato válido.» │</p>
<p>│ rol │ Contratista │ «El rol no es válido.» │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-5 Correo único, sin contar al propio usuario</strong></p>
<p><em># existeEmail(), actualizar() · RN-U04</em></p>
<blockquote>
<p><strong>Dado</strong> que existen los usuarios:</p>
<p>│ ID_Usuario │ Nombre │ Apellido │ Email │ activo │ rol │</p>
<p>├────────────┼────────┼──────────┼──────────────────────────┼────────┼────────────────────────┤</p>
<p>│ 7 │ Carlos │ Mejía │ carlos.mejia@ejemplo.com │ TRUE │ Empleado │</p>
<p>│ 9 │ Laura │ Gómez │ laura.gomez@ejemplo.com │ TRUE │ Aprobador │</p>
<p>│ 11 │ Pablo │ Duarte │ pablo.duarte@ejemplo.com │ FALSE │ Responsable de Activos │</p>
<p><strong>Cuando</strong> actualiza el usuario 9 con Email &lt;correo&gt; y los demás datos válidos</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Ejemplos:</strong></p>
<p>│ correo │ caso │ mensaje │</p>
<p>├──────────────────────────┼──────────────────────────────┼──────────────────────────────────────┤</p>
<p>│ carlos.mejia@ejemplo.com │ de otro usuario activo │ «El correo ya está registrado.» │</p>
<p>│ pablo.duarte@ejemplo.com │ de un usuario inactivo │ «El correo ya está registrado.» │</p>
<p>│ laura.gomez@ejemplo.com │ el propio correo, sin cambio │ «Usuario actualizado correctamente.» │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-6 Datos que no se modifican</strong></p>
<p><em># actualizar() · RN-U01, RN-U10</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el usuario:</p>
<p>│ ID_Usuario │ Nombre │ Apellido │ Email │ Password │ activo │ rol │</p>
<p>├────────────┼────────┼──────────┼─────────────────────────┼───────────┼────────┼───────────┤</p>
<p>│ 9 │ Laura │ Gómez │ laura.gomez@ejemplo.com │ (cifrada) │ TRUE │ Aprobador │</p>
<p><strong>Cuando</strong> intenta cambiar &lt;campo&gt; del usuario 9 a &lt;valor&gt;</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> el usuario 9 conserva sus datos anteriores</p>
<p><strong>Ejemplos:</strong></p>
<p>│ campo │ valor │ mensaje │</p>
<p>├────────────┼───────────────┼─────────────────────────────────────────────────────────────────┤</p>
<p>│ ID_Usuario │ 20 │ «El identificador del usuario no se puede modificar.» │</p>
<p>│ activo │ FALSE │ «El estado del usuario solo cambia al inactivarlo.» │</p>
<p>│ Password │ Clave-Nueva-2 │ «La contraseña no se cambia aquí. Use el cambio de contraseña.» │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-7 Usuario inactivo o inexistente</strong></p>
<p><em># actualizar() · RN-U09, RN-U11</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el usuario 11 con activo FALSE y no existe el usuario 99</p>
<p><strong>Cuando</strong> actualiza el usuario &lt;id&gt; con datos válidos</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> no se modifica ningún usuario</p>
<p><strong>Ejemplos:</strong></p>
<p>│ id │ caso │ mensaje │</p>
<p>├────┼───────────┼─────────────────────────────┤</p>
<p>│ 11 │ inactivo │ «El usuario está inactivo.» │</p>
<p>│ 99 │ no existe │ «El usuario no existe.» │</p>
</blockquote></td>
</tr>
<tr class="even">
<td><strong>Origen de la necesidad</strong></td>
<td>Alcance 1.2 – Tabla 5, pendiente de validación.</td>
</tr>
<tr class="odd">
<td><strong>RF derivados</strong></td>
<td>RF-38, RF-137, RF-138</td>
</tr>
<tr class="even">
<td><strong>Prioridad</strong></td>
<td>Media</td>
</tr>
</tbody>
</table>

*Nota: La Fase A v6 dice que actualizar() «modifica nombre, apellido, correo y rol de una cuenta (no la contraseña)»: el rol es editable; qué pasa con un custodio cuyo usuario deja de ser Empleado queda abierto (P-64). No se actualiza un usuario inactivo (RN propuesta; P-65). La contraseña se cambia solo con HU-37. Marta Rojas actúa como Supuesto (P-60). Sin cifras de la encuesta en el Origen.*

**HU-35 Inactivar usuario**

<table>
<colgroup>
<col style="width: 16%" />
<col style="width: 83%" />
</colgroup>
<thead>
<tr class="header">
<th><strong>Código</strong></th>
<th><strong>HU-35</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><strong>Título corto</strong></td>
<td>Inactivar usuario</td>
</tr>
<tr class="even">
<td><strong>Historia</strong></td>
<td><strong>Como</strong> Marta Rojas, Responsable de Activos, <strong>quiero</strong> inactivar a un usuario sin eliminar su registro, conociendo antes las consecuencias, <strong>para</strong> que la persona deje de acceder al sistema sin perder el historial.</td>
</tr>
<tr class="odd">
<td><strong>Criterios de aceptación</strong></td>
<td><p><strong>Antecedentes</strong> (comunes a todos los escenarios)</p>
<blockquote>
<p><strong>Dado</strong> que Marta Rojas, Responsable de Activos, inició sesión</p>
</blockquote>
<p><strong>Escenario: CA-1 Inactivar un usuario con confirmación</strong></p>
<p><em># inactivar() · RN-U12, RN-U14</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el usuario 7 (Carlos Mejía, Empleado, activo) cuyo custodio 3 está inactivo, sin asignaciones vigentes ni solicitudes pendientes</p>
<p><strong>Cuando</strong> solicita inactivar al usuario 7</p>
<p><strong>Entonces</strong> el sistema muestra el aviso «El usuario Carlos Mejía (carlos.mejia@ejemplo.com) pasará a estado inactivo. No podrá iniciar sesión, el registro no se elimina y no se puede reactivar. ¿Desea continuar?»</p>
<p><strong>Cuando</strong> confirma la baja</p>
<p><strong>Entonces</strong> el sistema responde «Usuario inactivado correctamente.»</p>
<p><strong>Y</strong> el usuario queda con activo FALSE y ya no puede iniciar sesión</p>
<p><strong>Y</strong> ID_Usuario, Nombre, Apellido, Email, Password y rol conservan su valor</p>
</blockquote>
<p><strong>Escenario: CA-2 Desistir de la inactivación</strong></p>
<p><em># inactivar() · RN-U14</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el usuario 7 (Carlos Mejía, Empleado, activo) cuyo custodio 3 está inactivo, sin asignaciones vigentes ni solicitudes pendientes</p>
<p><strong>Cuando</strong> solicita inactivar al usuario 7</p>
<p><strong>Entonces</strong> el sistema muestra el aviso «El usuario Carlos Mejía (carlos.mejia@ejemplo.com) pasará a estado inactivo. No podrá iniciar sesión, el registro no se elimina y no se puede reactivar. ¿Desea continuar?»</p>
<p><strong>Cuando</strong> decide no continuar</p>
<p><strong>Entonces</strong> el sistema responde «Inactivación cancelada. El usuario no fue modificado.»</p>
<p><strong>Y</strong> el usuario 7 conserva activo TRUE</p>
</blockquote>
<p><strong>Escenario: CA-3 Usuario que ya está inactivo</strong></p>
<p><em># inactivar() · RN-U13</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el usuario 11 (Pablo Duarte) con activo FALSE</p>
<p><strong>Cuando</strong> solicita inactivar al usuario 11</p>
<p><strong>Entonces</strong> el sistema responde «El usuario ya está inactivo.»</p>
<p><strong>Y</strong> no muestra el aviso de confirmación y el usuario 11 no cambia</p>
</blockquote>
<p><strong>Escenario: CA-4 Usuario inexistente</strong></p>
<p><em># inactivar() · RN-U09</em></p>
<blockquote>
<p><strong>Dado</strong> que no existe el usuario 99</p>
<p><strong>Cuando</strong> solicita inactivar al usuario 99</p>
<p><strong>Entonces</strong> el sistema responde «El usuario no existe.»</p>
</blockquote>
<p><strong>Esquema del escenario: CA-5 Usuario con custodio activo o único Aprobador con solicitudes pendientes</strong></p>
<p><em># inactivar() · RN-U15, RN-U16</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el usuario &lt;usuario&gt; activo, con &lt;situacion&gt;</p>
<p><strong>Cuando</strong> solicita inactivar al usuario &lt;usuario&gt;</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> no muestra el aviso de confirmación y el usuario &lt;usuario&gt; conserva activo TRUE</p>
<p><strong>Ejemplos:</strong></p>
<p>│ usuario │ situacion │ mensaje │</p>
<p>├─────────┼──────────────────────────────────────────────────────────────────────────────────────┼────────────────────────────────────────────────────────────────────────────────────────────────────────────┤</p>
<p>│ 7 │ custodio 3 activo con la asignación 1 en estado Vigente │ «El usuario tiene asignaciones vigentes a nombre de su custodio. Ciérrelas antes de inactivarlo.» │</p>
<p>│ 7 │ custodio 3 activo con la solicitud 1 en estado Pendiente y sin asignaciones vigentes │ «El usuario tiene solicitudes pendientes a nombre de su custodio. Cancélelas antes de inactivarlo.» │</p>
<p>│ 7 │ custodio 3 activo, sin asignaciones vigentes ni solicitudes pendientes │ «El usuario tiene un custodio activo. Inactive primero al custodio.» │</p>
<p>│ 9 │ rol Aprobador, único Aprobador activo, y la solicitud 1 en estado Pendiente │ «Es el único Aprobador activo y hay solicitudes pendientes. Registre otro Aprobador antes de inactivarlo.» │</p>
<p><em>Opción A, pendiente de P-66. Orden de verificación: asignaciones vigentes, solicitudes pendientes, custodio activo y único Aprobador. Con la opción B, M-224 a M-227 pasarían a avisos de confirmación.</em></p>
</blockquote>
<p><strong>Escenario: CA-6 Auto-inactivación (RN propuesta)</strong></p>
<p><em># inactivar() · RN-U17</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el usuario 2 (Marta Rojas, Responsable de Activos, activo), que es quien tiene la sesión iniciada</p>
<p><strong>Cuando</strong> solicita inactivar al usuario 2</p>
<p><strong>Entonces</strong> el sistema responde «No se puede inactivar el propio usuario.»</p>
<p><strong>Y</strong> no muestra el aviso de confirmación y el usuario 2 conserva activo TRUE</p>
</blockquote>
<p><strong>Escenario: CA-7 El usuario inactivado no se elimina</strong></p>
<p><em># buscarPorId(), inactivar() · RN-U12</em></p>
<blockquote>
<p><strong>Dado</strong> que el usuario 7 (Carlos Mejía) fue inactivado</p>
<p><strong>Cuando</strong> consulta por ID_Usuario 7</p>
<p><strong>Entonces</strong> ve el usuario con activo FALSE y sus demás datos intactos</p>
</blockquote></td>
</tr>
<tr class="even">
<td><strong>Origen de la necesidad</strong></td>
<td>Alcance 1.2 – Tabla 5, pendiente de validación.</td>
</tr>
<tr class="odd">
<td><strong>RF derivados</strong></td>
<td>RF-39, RF-139, RF-140, RF-141, RF-142, RF-143</td>
</tr>
<tr class="even">
<td><strong>Prioridad</strong></td>
<td>Media</td>
</tr>
</tbody>
</table>

*Nota: Marta Rojas actúa como Supuesto (P-60). Los bloqueos son la opción A, alineada con RN-C14 del Bloque 1 (no se inactiva un custodio con asignaciones Vigentes ni solicitudes Pendientes): primero se inactiva al custodio, lo que a su vez exige cerrar sus asignaciones y cancelar sus solicitudes. La opción B (avisar y permitir) queda en P-66; proteger al único Aprobador activo y la auto-inactivación son propuestas (P-67, P-68). El usuario inactivo no vuelve a activarse porque el modelo no tiene método de reactivación (P-69). Sin cifras de la encuesta en el Origen.*

**HU-36 Iniciar sesión**

<table>
<colgroup>
<col style="width: 16%" />
<col style="width: 83%" />
</colgroup>
<thead>
<tr class="header">
<th><strong>Código</strong></th>
<th><strong>HU-36</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><strong>Título corto</strong></td>
<td>Iniciar sesión</td>
</tr>
<tr class="even">
<td><strong>Historia</strong></td>
<td><strong>Como</strong> Carlos Mejía, Empleado, <strong>quiero</strong> iniciar sesión con mi correo y mi contraseña, <strong>para</strong> acceder al sistema con las opciones de mi rol.</td>
</tr>
<tr class="odd">
<td><strong>Criterios de aceptación</strong></td>
<td><p><strong>Antecedentes</strong> (comunes a todos los escenarios)</p>
<blockquote>
<p><strong>Dado</strong> que Carlos Mejía, Empleado, no tiene una sesión iniciada y el sistema está disponible</p>
</blockquote>
<p><strong>Escenario: CA-1 Iniciar sesión con credenciales correctas</strong></p>
<p><em># iniciarSesion() · RN-U18</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el usuario:</p>
<p>│ ID_Usuario │ Nombre │ Apellido │ Email │ Password │ activo │ rol │</p>
<p>├────────────┼────────┼──────────┼──────────────────────────┼───────────┼────────┼──────────┤</p>
<p>│ 7 │ Carlos │ Mejía │ carlos.mejia@ejemplo.com │ (cifrada) │ TRUE │ Empleado │</p>
<p><strong>Y</strong> que su contraseña es Clave-Ejemplo-1 y está almacenada cifrada</p>
<p><strong>Cuando</strong> ingresa el correo carlos.mejia@ejemplo.com y la contraseña Clave-Ejemplo-1</p>
<p><strong>Entonces</strong> el sistema responde «Sesión iniciada correctamente.»</p>
<p><strong>Y</strong> la sesión queda iniciada para el usuario 7 con el rol Empleado</p>
<p><strong>Y</strong> la contraseña almacenada no se muestra ni se modifica</p>
</blockquote>
<p><strong>Esquema del escenario: CA-2 Los cinco roles pueden iniciar sesión</strong></p>
<p><em># iniciarSesion() · RN-U18</em></p>
<blockquote>
<p><strong>Dado</strong> que existe un usuario activo con el correo &lt;correo&gt; y el rol &lt;rol&gt;, cuya contraseña es Clave-Ejemplo-1</p>
<p><strong>Cuando</strong> ingresa ese correo y la contraseña Clave-Ejemplo-1</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> la sesión queda iniciada con el rol &lt;rol&gt;</p>
<p><strong>Ejemplos:</strong></p>
<p>│ correo │ rol │ mensaje │</p>
<p>├───────────────────────────┼────────────────────────┼──────────────────────────────────┤</p>
<p>│ marta.rojas@ejemplo.com │ Responsable de Activos │ «Sesión iniciada correctamente.» │</p>
<p>│ carlos.mejia@ejemplo.com │ Empleado │ «Sesión iniciada correctamente.» │</p>
<p>│ laura.gomez@ejemplo.com │ Aprobador │ «Sesión iniciada correctamente.» │</p>
<p>│ andres.pineda@ejemplo.com │ Técnico de Soporte │ «Sesión iniciada correctamente.» │</p>
<p>│ sofia.herrera@ejemplo.com │ Gerente │ «Sesión iniciada correctamente.» │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-3 Credenciales inválidas: mensaje genérico (RN propuesta)</strong></p>
<p><em># iniciarSesion() · RN-U19</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el usuario carlos.mejia@ejemplo.com activo, cuya contraseña es Clave-Ejemplo-1, y no existe el correo nadie@ejemplo.com</p>
<p><strong>Cuando</strong> ingresa el correo &lt;correo&gt; y la contraseña &lt;contraseña&gt;</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> no se inicia la sesión y el mensaje no revela si falló el correo o la contraseña</p>
<p><strong>Ejemplos:</strong></p>
<p>│ correo │ contraseña │ caso │ mensaje │</p>
<p>├──────────────────────────┼────────────────────┼───────────────────────┼────────────────────────────────────┤</p>
<p>│ carlos.mejia@ejemplo.com │ Clave-Incorrecta-9 │ contraseña incorrecta │ «Correo o contraseña incorrectos.» │</p>
<p>│ nadie@ejemplo.com │ Clave-Ejemplo-1 │ correo inexistente │ «Correo o contraseña incorrectos.» │</p>
<p>│ nadie@ejemplo.com │ Clave-Incorrecta-9 │ ambos incorrectos │ «Correo o contraseña incorrectos.» │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-4 Usuario inactivo (RN propuesta)</strong></p>
<p><em># iniciarSesion() · RN-U19, RN-U20</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el usuario:</p>
<p>│ ID_Usuario │ Nombre │ Apellido │ Email │ activo │ rol │</p>
<p>├────────────┼────────┼──────────┼──────────────────────────┼────────┼────────────────────────┤</p>
<p>│ 11 │ Pablo │ Duarte │ pablo.duarte@ejemplo.com │ FALSE │ Responsable de Activos │</p>
<p><strong>Y</strong> que su contraseña es Clave-Ejemplo-1</p>
<p><strong>Cuando</strong> ingresa el correo pablo.duarte@ejemplo.com y la contraseña &lt;contraseña&gt;</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> no se inicia la sesión</p>
<p><strong>Ejemplos:</strong></p>
<p>│ contraseña │ caso │ mensaje │</p>
<p>├────────────────────┼────────────────────────┼────────────────────────────────────┤</p>
<p>│ Clave-Ejemplo-1 │ credenciales correctas │ «El usuario está inactivo.» │</p>
<p>│ Clave-Incorrecta-9 │ contraseña incorrecta │ «Correo o contraseña incorrectos.» │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-5 Datos obligatorios vacíos</strong></p>
<p><em># iniciarSesion() · RN-U18</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el usuario carlos.mejia@ejemplo.com activo</p>
<p><strong>Cuando</strong> intenta iniciar sesión con &lt;campo&gt; vacío y el otro dato válido</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> no se inicia la sesión</p>
<p><strong>Ejemplos:</strong></p>
<p>│ campo │ mensaje │</p>
<p>├────────────┼─────────────────────────────────┤</p>
<p>│ correo │ «El correo es obligatorio.» │</p>
<p>│ contraseña │ «La contraseña es obligatoria.» │</p>
</blockquote></td>
</tr>
<tr class="even">
<td><strong>Origen de la necesidad</strong></td>
<td>Alcance 1.2 – Tabla 5, pendiente de validación.</td>
</tr>
<tr class="odd">
<td><strong>RF derivados</strong></td>
<td>RF-40, RF-144</td>
</tr>
<tr class="even">
<td><strong>Prioridad</strong></td>
<td>Alta</td>
</tr>
</tbody>
</table>

*Nota: HU sin sesión previa: cualquiera de los 5 roles inicia sesión (Carlos Mejía es el ejemplo principal). Credenciales inválidas: mensaje genérico que no revela cuál falló (RN propuesta). El mensaje de usuario inactivo solo se muestra con credenciales correctas, para no revelar qué correos existen (RN propuesta; P-71). NO se definen bloqueo por intentos fallidos, expiración de sesión ni recuperación de contraseña: las fuentes no los mencionan (P-70). Sin cifras de la encuesta en el Origen.*

**HU-37 Cambiar contraseña**

<table>
<colgroup>
<col style="width: 16%" />
<col style="width: 83%" />
</colgroup>
<thead>
<tr class="header">
<th><strong>Código</strong></th>
<th><strong>HU-37</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><strong>Título corto</strong></td>
<td>Cambiar contraseña</td>
</tr>
<tr class="even">
<td><strong>Historia</strong></td>
<td><strong>Como</strong> Carlos Mejía, Empleado, <strong>quiero</strong> cambiar mi contraseña indicando la actual y la nueva, <strong>para</strong> mantener mi acceso protegido.</td>
</tr>
<tr class="odd">
<td><strong>Criterios de aceptación</strong></td>
<td><p><strong>Antecedentes</strong> (comunes a todos los escenarios)</p>
<blockquote>
<p><strong>Dado</strong> que Carlos Mejía, Empleado, inició sesión</p>
</blockquote>
<p><strong>Escenario: CA-1 Cambiar la contraseña con la actual correcta</strong></p>
<p><em># cambiarContrasena() · RN-U07, RN-U21</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el usuario:</p>
<p>│ ID_Usuario │ Nombre │ Apellido │ Email │ Password │ activo │ rol │</p>
<p>├────────────┼────────┼──────────┼──────────────────────────┼───────────┼────────┼──────────┤</p>
<p>│ 7 │ Carlos │ Mejía │ carlos.mejia@ejemplo.com │ (cifrada) │ TRUE │ Empleado │</p>
<p><strong>Y</strong> que su contraseña actual es Clave-Ejemplo-1, almacenada cifrada</p>
<p><strong>Cuando</strong> cambia la contraseña con los datos:</p>
<p>│ Campo │ Valor │</p>
<p>├───────────┼─────────────────┤</p>
<p>│ idUsuario │ 7 │</p>
<p>│ actual │ Clave-Ejemplo-1 │</p>
<p>│ nueva │ Clave-Nueva-2 │</p>
<p><strong>Entonces</strong> el sistema responde «Contraseña cambiada correctamente.»</p>
<p><strong>Y</strong> el valor almacenado en Password cambió y es distinto de Clave-Nueva-2: se guardó cifrado, no en texto plano</p>
<p><strong>Y</strong> con Clave-Nueva-2 se puede iniciar sesión y con Clave-Ejemplo-1 ya no</p>
<p><strong>Y</strong> ID_Usuario, Nombre, Apellido, Email, activo y rol conservan su valor</p>
</blockquote>
<p><strong>Escenario: CA-2 Contraseña actual incorrecta</strong></p>
<p><em># cambiarContrasena() · RN-U21</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el usuario 7 con la contraseña Clave-Ejemplo-1</p>
<p><strong>Cuando</strong> cambia la contraseña con actual Clave-Incorrecta-9 y nueva Clave-Nueva-2</p>
<p><strong>Entonces</strong> el sistema responde «La contraseña actual es incorrecta.»</p>
<p><strong>Y</strong> Password conserva su valor almacenado</p>
</blockquote>
<p><strong>Escenario: CA-3 Nueva contraseña igual a la actual (RN propuesta)</strong></p>
<p><em># cambiarContrasena() · RN-U21</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el usuario 7 con la contraseña Clave-Ejemplo-1</p>
<p><strong>Cuando</strong> cambia la contraseña con actual Clave-Ejemplo-1 y nueva Clave-Ejemplo-1</p>
<p><strong>Entonces</strong> el sistema responde «La nueva contraseña debe ser distinta de la actual.»</p>
<p><strong>Y</strong> Password conserva su valor almacenado</p>
</blockquote>
<p><strong>Esquema del escenario: CA-4 Contraseñas vacías</strong></p>
<p><em># cambiarContrasena() · RN-U08, RN-U21</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el usuario 7 con la contraseña Clave-Ejemplo-1</p>
<p><strong>Cuando</strong> cambia la contraseña con &lt;campo&gt; vacía y el otro dato válido</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> Password conserva su valor almacenado</p>
<p><strong>Ejemplos:</strong></p>
<p>│ campo │ mensaje │</p>
<p>├────────┼────────────────────────────────────────┤</p>
<p>│ actual │ «La contraseña actual es obligatoria.» │</p>
<p>│ nueva │ «La nueva contraseña es obligatoria.» │</p>
</blockquote>
<p><strong>Escenario: CA-5 Solo se cambia la contraseña propia</strong></p>
<p><em># cambiarContrasena() · RN-U22</em></p>
<blockquote>
<p><strong>Dado</strong> que Carlos Mejía es el usuario 7 y existe el usuario 9 (Laura Gómez) con la contraseña Clave-Ejemplo-1</p>
<p><strong>Cuando</strong> intenta cambiar la contraseña del usuario 9 con actual Clave-Ejemplo-1 y nueva Clave-Nueva-2</p>
<p><strong>Entonces</strong> el sistema responde «Solo se puede cambiar la contraseña propia.»</p>
<p><strong>Y</strong> Password del usuario 9 conserva su valor almacenado</p>
</blockquote>
<p><strong>Escenario: CA-6 Usuario inexistente</strong></p>
<p><em># cambiarContrasena() · RN-U09</em></p>
<blockquote>
<p><strong>Dado</strong> que no existe el usuario 99</p>
<p><strong>Cuando</strong> cambia la contraseña con idUsuario 99, actual Clave-Ejemplo-1 y nueva Clave-Nueva-2</p>
<p><strong>Entonces</strong> el sistema responde «El usuario no existe.»</p>
</blockquote></td>
</tr>
<tr class="even">
<td><strong>Origen de la necesidad</strong></td>
<td>Alcance 1.2 – Tabla 5, pendiente de validación.</td>
</tr>
<tr class="odd">
<td><strong>RF derivados</strong></td>
<td>RF-41, RF-145</td>
</tr>
<tr class="even">
<td><strong>Prioridad</strong></td>
<td>Media</td>
</tr>
</tbody>
</table>

*Nota: La Fase A v6 dice que cambiarContrasena() «cambia la contraseña propia validando la actual». La política de complejidad de la nueva contraseña NO está definida: solo se exige que no esté vacía y sea distinta de la actual (P-61). La confirmación de la nueva contraseña (digitarla dos veces) es de interfaz, no del método. Sin cifras de la encuesta en el Origen.*

**Rol_Permiso — Anexo 8**

**HU-38 Asignar permiso a un rol**

<table>
<colgroup>
<col style="width: 16%" />
<col style="width: 83%" />
</colgroup>
<thead>
<tr class="header">
<th><strong>Código</strong></th>
<th><strong>HU-38</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><strong>Título corto</strong></td>
<td>Asignar permiso a un rol</td>
</tr>
<tr class="even">
<td><strong>Historia</strong></td>
<td><strong>Como</strong> Marta Rojas, Responsable de Activos, <strong>quiero</strong> otorgar un permiso a un rol, <strong>para</strong> definir qué puede hacer cada perfil en el sistema.</td>
</tr>
<tr class="odd">
<td><strong>Criterios de aceptación</strong></td>
<td><p><strong>Antecedentes</strong> (comunes a todos los escenarios)</p>
<blockquote>
<p><strong>Dado</strong> que Marta Rojas, Responsable de Activos, inició sesión</p>
</blockquote>
<p><strong>Escenario: CA-1 Asignar un permiso a un rol</strong></p>
<p><em># asignar() · RN-RP01, RN-RP02</em></p>
<blockquote>
<p><strong>Dado</strong> que el rol Gerente no tiene el permiso Reportar</p>
<p><strong>Cuando</strong> asigna el permiso con los datos:</p>
<p>│ Campo │ Valor │</p>
<p>├─────────┼──────────┤</p>
<p>│ rol │ Gerente │</p>
<p>│ permiso │ Reportar │</p>
<p><strong>Entonces</strong> el sistema responde «Permiso asignado correctamente.»</p>
<p><strong>Y</strong> la asignación queda guardada con sus 2 campos:</p>
<p>│ rol │ permiso │</p>
<p>├─────────┼──────────┤</p>
<p>│ Gerente │ Reportar │</p>
<p><strong>Y</strong> los demás permisos de los roles conservan su valor</p>
</blockquote>
<p><strong>Esquema del escenario: CA-2 Rol o permiso vacío</strong></p>
<p><em># asignar() · RN-RP02</em></p>
<blockquote>
<p><strong>Dado</strong> que el rol Gerente no tiene el permiso Reportar</p>
<p><strong>Cuando</strong> asigna un permiso con &lt;campo&gt; vacío y el otro dato válido</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> no se crea la asignación</p>
<p><strong>Ejemplos:</strong></p>
<p>│ campo │ mensaje │</p>
<p>├─────────┼──────────────────────────────┤</p>
<p>│ rol │ «El rol es obligatorio.» │</p>
<p>│ permiso │ «El permiso es obligatorio.» │</p>
</blockquote>
<p><strong>Escenario: CA-3 Asignación que ya existe</strong></p>
<p><em># existeAsignacion(), asignar() · RN-RP05</em></p>
<blockquote>
<p><strong>Dado</strong> que el rol Gerente ya tiene el permiso Reportar:</p>
<p>│ rol │ permiso │</p>
<p>├─────────┼──────────┤</p>
<p>│ Gerente │ Reportar │</p>
<p><strong>Cuando</strong> asigna el permiso Reportar al rol Gerente</p>
<p><strong>Entonces</strong> el sistema responde «El rol ya tiene ese permiso.»</p>
<p><strong>Y</strong> no se crea otra asignación del mismo par</p>
</blockquote>
<p><strong>Esquema del escenario: CA-4 Rol o permiso fuera de la enumeración</strong></p>
<p><em># asignar() · RN-RP03, RN-RP04</em></p>
<blockquote>
<p><strong>Dado</strong> que no existe la asignación del par que se intenta crear</p>
<p><strong>Cuando</strong> asigna un permiso con rol &lt;rol&gt; y permiso &lt;permiso&gt;</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> no se crea la asignación</p>
<p><strong>Ejemplos:</strong></p>
<p>│ rol │ permiso │ mensaje │</p>
<p>├─────────────┼───────────┼────────────────────────────┤</p>
<p>│ Contratista │ Consultar │ «El rol no es válido.» │</p>
<p>│ Gerente │ Eliminar │ «El permiso no es válido.» │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-5 Todos los valores de las dos enumeraciones se aceptan</strong></p>
<p><em># asignar() · RN-RP03, RN-RP04</em></p>
<blockquote>
<p><strong>Dado</strong> que no existe la asignación del par que se va a crear</p>
<p><strong>Cuando</strong> asigna el permiso &lt;permiso&gt; al rol &lt;rol&gt;</p>
<p><strong>Entonces</strong> el sistema responde «Permiso asignado correctamente.»</p>
<p><strong>Y</strong> la asignación queda guardada con rol &lt;rol&gt; y permiso &lt;permiso&gt;</p>
<p><strong>Ejemplos:</strong></p>
<p>│ rol │ permiso │</p>
<p>├────────────────────────┼────────────┤</p>
<p>│ Responsable de Activos │ Consultar │</p>
<p>│ Empleado │ Consultar │</p>
<p>│ Aprobador │ Consultar │</p>
<p>│ Técnico de Soporte │ Consultar │</p>
<p>│ Gerente │ Consultar │</p>
<p>│ Gerente │ Crear │</p>
<p>│ Gerente │ Actualizar │</p>
<p>│ Gerente │ Inactivar │</p>
<p>│ Gerente │ Aprobar │</p>
<p>│ Gerente │ Notificar │</p>
<p>│ Gerente │ Asignar │</p>
<p>│ Gerente │ Devolver │</p>
<p>│ Gerente │ Reportar │</p>
<p><em>Cubre los 5 valores de Nombre_Rol y los 9 de Nombre_Permiso. Los pares son datos de ejemplo, no la matriz inicial (P-75).</em></p>
</blockquote>
<p><strong>Escenario: CA-6 El permiso otorgado aparece en la consulta del rol</strong></p>
<p><em># asignar(), consultarPermisos() · RN-RP10</em></p>
<blockquote>
<p><strong>Dado</strong> que el rol Gerente no tiene permisos asignados</p>
<p><strong>Cuando</strong> asigna el permiso Reportar al rol Gerente y consulta los permisos del rol Gerente</p>
<p><strong>Entonces</strong> ve la lista con el permiso Reportar</p>
</blockquote></td>
</tr>
<tr class="even">
<td><strong>Origen de la necesidad</strong></td>
<td>Alcance 1.2 – Tabla 5, pendiente de validación.</td>
</tr>
<tr class="odd">
<td><strong>RF derivados</strong></td>
<td>RF-42, RF-166</td>
</tr>
<tr class="even">
<td><strong>Prioridad</strong></td>
<td>Alta</td>
</tr>
</tbody>
</table>

*Nota: El Alcance 1.2 dice «gestionar roles y permisos», pero Permiso es ahora el ENUM Nombre_Permiso y no tiene HU de gestión (CRF-002, cambio 0.4): la gestión se cumple otorgando, retirando y consultando permisos por rol (HU-38 a HU-40). El Alcance 1.2 solo nombra al Responsable de Activos para la consulta de permisos; quién otorga y retira permisos es Supuesto (P-74). Los pares rol–permiso de los ejemplos son datos de ejemplo y no son la matriz inicial, que no está definida (P-75). Los 9 permisos son verbos sin entidad: su alcance no está definido (P-76) y el modelo no define cómo se hace cumplir un permiso (P-77). Sin cifras de la encuesta en el Origen.*

**HU-39 Retirar permiso a un rol**

<table>
<colgroup>
<col style="width: 16%" />
<col style="width: 83%" />
</colgroup>
<thead>
<tr class="header">
<th><strong>Código</strong></th>
<th><strong>HU-39</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><strong>Título corto</strong></td>
<td>Retirar permiso a un rol</td>
</tr>
<tr class="even">
<td><strong>Historia</strong></td>
<td><strong>Como</strong> Marta Rojas, Responsable de Activos, <strong>quiero</strong> retirar un permiso a un rol, conociendo antes la consecuencia, <strong>para</strong> que ese perfil deje de tener esa capacidad.</td>
</tr>
<tr class="odd">
<td><strong>Criterios de aceptación</strong></td>
<td><p><strong>Antecedentes</strong> (comunes a todos los escenarios)</p>
<blockquote>
<p><strong>Dado</strong> que Marta Rojas, Responsable de Activos, inició sesión</p>
</blockquote>
<p><strong>Escenario: CA-1 Retirar un permiso con confirmación</strong></p>
<p><em># retirar() · RN-RP06, RN-RP08, RN-RP09</em></p>
<blockquote>
<p><strong>Dado</strong> que el rol Gerente tiene los permisos:</p>
<p>│ rol │ permiso │</p>
<p>├─────────┼───────────┤</p>
<p>│ Gerente │ Consultar │</p>
<p>│ Gerente │ Reportar │</p>
<p><strong>Cuando</strong> solicita retirar el permiso Reportar al rol Gerente</p>
<p><strong>Entonces</strong> el sistema muestra el aviso «El rol Gerente perderá el permiso Reportar. La asignación se elimina del sistema y, para recuperarla, hay que otorgar el permiso de nuevo. ¿Desea continuar?»</p>
<p><strong>Cuando</strong> confirma el retiro</p>
<p><strong>Entonces</strong> el sistema responde «Permiso retirado correctamente.»</p>
<p><strong>Y</strong> la asignación Gerente–Reportar ya no existe</p>
<p><strong>Y</strong> el rol Gerente conserva el permiso Consultar</p>
</blockquote>
<p><strong>Escenario: CA-2 Desistir del retiro</strong></p>
<p><em># retirar() · RN-RP08</em></p>
<blockquote>
<p><strong>Dado</strong> que el rol Gerente tiene el permiso Reportar</p>
<p><strong>Cuando</strong> solicita retirar el permiso Reportar al rol Gerente</p>
<p><strong>Entonces</strong> el sistema muestra el aviso «El rol Gerente perderá el permiso Reportar. La asignación se elimina del sistema y, para recuperarla, hay que otorgar el permiso de nuevo. ¿Desea continuar?»</p>
<p><strong>Cuando</strong> decide no continuar</p>
<p><strong>Entonces</strong> el sistema responde «Retiro cancelado. El rol conserva el permiso.»</p>
<p><strong>Y</strong> el rol Gerente conserva el permiso Reportar</p>
</blockquote>
<p><strong>Escenario: CA-3 Asignación inexistente</strong></p>
<p><em># retirar() · RN-RP07</em></p>
<blockquote>
<p><strong>Dado</strong> que el rol Gerente no tiene el permiso Reportar</p>
<p><strong>Cuando</strong> solicita retirar el permiso Reportar al rol Gerente</p>
<p><strong>Entonces</strong> el sistema responde «El rol no tiene ese permiso.»</p>
<p><strong>Y</strong> no muestra el aviso de confirmación</p>
</blockquote>
<p><strong>Esquema del escenario: CA-4 Rol o permiso vacío o fuera de la enumeración</strong></p>
<p><em># retirar() · RN-RP02, RN-RP03, RN-RP04</em></p>
<blockquote>
<p><strong>Dado</strong> que el rol Gerente tiene el permiso Reportar</p>
<p><strong>Cuando</strong> solicita retirar un permiso con rol &lt;rol&gt; y permiso &lt;permiso&gt;</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> no muestra el aviso de confirmación y no se elimina ninguna asignación</p>
<p><strong>Ejemplos:</strong></p>
<p>│ rol │ permiso │ mensaje │</p>
<p>├─────────────┼──────────┼──────────────────────────────┤</p>
<p>│ (vacío) │ Reportar │ «El rol es obligatorio.» │</p>
<p>│ Gerente │ (vacío) │ «El permiso es obligatorio.» │</p>
<p>│ Contratista │ Reportar │ «El rol no es válido.» │</p>
<p>│ Gerente │ Eliminar │ «El permiso no es válido.» │</p>
</blockquote>
<p><strong>Escenario: CA-5 El retiro elimina la fila y el permiso se puede otorgar de nuevo</strong></p>
<p><em># retirar(), asignar() · RN-RP06, RN-RP05</em></p>
<blockquote>
<p><strong>Dado</strong> que el permiso Reportar del rol Gerente fue retirado</p>
<p><strong>Cuando</strong> asigna otra vez el permiso Reportar al rol Gerente</p>
<p><strong>Entonces</strong> el sistema responde «Permiso asignado correctamente.»</p>
<p><strong>Y</strong> no responde que el rol ya tiene el permiso, porque el retiro no dejó ningún registro de la asignación anterior</p>
</blockquote></td>
</tr>
<tr class="even">
<td><strong>Origen de la necesidad</strong></td>
<td>Alcance 1.2 – Tabla 5, pendiente de validación.</td>
</tr>
<tr class="odd">
<td><strong>RF derivados</strong></td>
<td>RF-43, RF-146</td>
</tr>
<tr class="even">
<td><strong>Prioridad</strong></td>
<td>Media</td>
</tr>
</tbody>
</table>

*Nota: El Alcance 1.2 dice «gestionar roles y permisos», pero Permiso es ahora el ENUM Nombre_Permiso y no tiene HU de gestión (CRF-002, cambio 0.4): la gestión se cumple otorgando, retirando y consultando permisos por rol (HU-38 a HU-40). retirar() elimina la fila porque Rol_Permiso no tiene columna activo ni historial propio: es la única excepción propuesta a «jamás DELETE» (RN-RP06; P-78). Accion_Auditoria no cubre retirar: se propone un valor nuevo (P-79). Qué pasa si se retira un permiso crítico del Responsable de Activos queda abierto, sin decidir (P-80). Sin cifras de la encuesta en el Origen.*

**HU-40 Consultar permisos de un rol**

<table>
<colgroup>
<col style="width: 16%" />
<col style="width: 83%" />
</colgroup>
<thead>
<tr class="header">
<th><strong>Código</strong></th>
<th><strong>HU-40</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><strong>Título corto</strong></td>
<td>Consultar permisos de un rol</td>
</tr>
<tr class="even">
<td><strong>Historia</strong></td>
<td><strong>Como</strong> Marta Rojas, Responsable de Activos, <strong>quiero</strong> consultar los permisos asignados a un rol, <strong>para</strong> saber qué puede hacer cada perfil en el sistema.</td>
</tr>
<tr class="odd">
<td><strong>Criterios de aceptación</strong></td>
<td><p><strong>Antecedentes</strong> (comunes a todos los escenarios)</p>
<blockquote>
<p><strong>Dado</strong> que Marta Rojas, Responsable de Activos, inició sesión</p>
</blockquote>
<p><strong>Escenario: CA-1 Consultar los permisos de un rol, en el orden de la enumeración</strong></p>
<p><em># consultarPermisos() · RN-RP10</em></p>
<blockquote>
<p><strong>Dado</strong> que el rol Gerente tiene los permisos Reportar y Consultar</p>
<p><strong>Cuando</strong> consulta los permisos del rol Gerente</p>
<p><strong>Entonces</strong> ve la lista de permisos del rol, en el orden en que se declara Nombre_Permiso:</p>
<p>│ permiso │</p>
<p>├───────────┤</p>
<p>│ Consultar │</p>
<p>│ Reportar │</p>
<p><strong>Y</strong> no ve los permisos de otros roles</p>
</blockquote>
<p><strong>Esquema del escenario: CA-2 Consultar los permisos de distintos roles</strong></p>
<p><em># consultarPermisos() · RN-RP10</em></p>
<blockquote>
<p><strong>Dado</strong> que el rol Empleado tiene el permiso Consultar y el rol Aprobador tiene los permisos Consultar y Aprobar</p>
<p><strong>Cuando</strong> consulta los permisos del rol &lt;rol&gt;</p>
<p><strong>Entonces</strong> ve la lista con &lt;permisos&gt;</p>
<p><strong>Ejemplos:</strong></p>
<p>│ rol │ permisos │</p>
<p>├───────────┼─────────────────────┤</p>
<p>│ Empleado │ Consultar │</p>
<p>│ Aprobador │ Consultar y Aprobar │</p>
</blockquote>
<p><strong>Escenario: CA-3 Rol sin permisos</strong></p>
<p><em># consultarPermisos() · RN-RP10, RN-RP11</em></p>
<blockquote>
<p><strong>Dado</strong> que el rol Técnico de Soporte no tiene permisos asignados</p>
<p><strong>Cuando</strong> consulta los permisos del rol Técnico de Soporte</p>
<p><strong>Entonces</strong> ve una lista vacía y el sistema responde «El rol no tiene permisos asignados.»</p>
</blockquote>
<p><strong>Esquema del escenario: CA-4 Rol vacío o fuera de la enumeración</strong></p>
<p><em># consultarPermisos() · RN-RP03</em></p>
<blockquote>
<p><strong>Dado</strong> que existen los 5 roles de la enumeración</p>
<p><strong>Cuando</strong> consulta los permisos del rol &lt;rol&gt;</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> no se muestra ninguna lista</p>
<p><strong>Ejemplos:</strong></p>
<p>│ rol │ mensaje │</p>
<p>├─────────────┼──────────────────────────┤</p>
<p>│ (vacío) │ «El rol es obligatorio.» │</p>
<p>│ Contratista │ «El rol no es válido.» │</p>
</blockquote>
<p><strong>Escenario: CA-5 La consulta no modifica las asignaciones</strong></p>
<p><em># consultarPermisos() · RN-RP10</em></p>
<blockquote>
<p><strong>Dado</strong> que el rol Gerente tiene los permisos Consultar y Reportar</p>
<p><strong>Cuando</strong> consulta los permisos del rol Gerente</p>
<p><strong>Entonces</strong> ve la lista de permisos del rol</p>
<p><strong>Y</strong> el rol Gerente conserva exactamente los permisos Consultar y Reportar</p>
</blockquote></td>
</tr>
<tr class="even">
<td><strong>Origen de la necesidad</strong></td>
<td>Alcance 1.2 – Tabla 5, pendiente de validación.</td>
</tr>
<tr class="odd">
<td><strong>RF derivados</strong></td>
<td>RF-44</td>
</tr>
<tr class="even">
<td><strong>Prioridad</strong></td>
<td>Alta</td>
</tr>
</tbody>
</table>

*Nota: El Alcance 1.2 dice «gestionar roles y permisos», pero Permiso es ahora el ENUM Nombre_Permiso y no tiene HU de gestión (CRF-002, cambio 0.4): la gestión se cumple otorgando, retirando y consultando permisos por rol (HU-38 a HU-40). Esta es la HU que el Alcance 1.2 respalda directamente: «consulta, por parte del Responsable de Activos, de los permisos asignados a cada rol». El orden de la lista (el de declaración de Nombre_Permiso) es propuesta (P-75). Los pares rol–permiso de los ejemplos son datos de ejemplo y no son la matriz inicial, que no está definida (P-75). Sin cifras de la encuesta en el Origen.*

**Categoria — Anexo 8**

**HU-41 Registrar categoría**

<table>
<colgroup>
<col style="width: 16%" />
<col style="width: 83%" />
</colgroup>
<thead>
<tr class="header">
<th><strong>Código</strong></th>
<th><strong>HU-41</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><strong>Título corto</strong></td>
<td>Registrar categoría</td>
</tr>
<tr class="even">
<td><strong>Historia</strong></td>
<td><strong>Como</strong> Marta Rojas, Responsable de Activos, <strong>quiero</strong> registrar una categoría de equipos con su nombre, <strong>para</strong> que los equipos y las solicitudes se clasifiquen con un catálogo único.</td>
</tr>
<tr class="odd">
<td><strong>Criterios de aceptación</strong></td>
<td><p><strong>Antecedentes</strong> (comunes a todos los escenarios)</p>
<blockquote>
<p><strong>Dado</strong> que Marta Rojas, Responsable de Activos, inició sesión</p>
</blockquote>
<p><strong>Escenario: CA-1 Registrar una categoría con todos sus datos</strong></p>
<p><em># crear() · RN-CA01, RN-CA02</em></p>
<blockquote>
<p><strong>Dado</strong> que existen las categorías:</p>
<p>│ ID_Categoria │ Nombre_Categoria │ activo │</p>
<p>├──────────────┼──────────────────┼────────┤</p>
<p>│ 1 │ Portátiles │ TRUE │</p>
<p>│ 3 │ Proyectores │ FALSE │</p>
<p>│ 4 │ Periféricos │ TRUE │</p>
<p><strong>Cuando</strong> registra la categoría con los datos:</p>
<p>│ Campo │ Valor │</p>
<p>├──────────────────┼──────────┤</p>
<p>│ Nombre_Categoria │ Tabletas │</p>
<p><strong>Entonces</strong> el sistema responde «Categoría registrada correctamente.»</p>
<p><strong>Y</strong> la categoría queda guardada con:</p>
<p>│ ID_Categoria │ Nombre_Categoria │ activo │</p>
<p>├──────────────┼──────────────────┼────────┤</p>
<p>│ (automático) │ Tabletas │ TRUE │</p>
<p><strong>Y</strong> ID_Categoria y activo los asignó el sistema</p>
</blockquote>
<p><strong>Escenario: CA-2 Nombre vacío</strong></p>
<p><em># crear() · RN-CA02</em></p>
<blockquote>
<p><strong>Dado</strong> que existen las categorías:</p>
<p>│ ID_Categoria │ Nombre_Categoria │ activo │</p>
<p>├──────────────┼──────────────────┼────────┤</p>
<p>│ 1 │ Portátiles │ TRUE │</p>
<p>│ 3 │ Proyectores │ FALSE │</p>
<p>│ 4 │ Periféricos │ TRUE │</p>
<p><strong>Cuando</strong> registra una categoría con Nombre_Categoria vacío</p>
<p><strong>Entonces</strong> el sistema responde «El nombre de la categoría es obligatorio.»</p>
<p><strong>Y</strong> no se crea la categoría</p>
</blockquote>
<p><strong>Esquema del escenario: CA-3 Longitud máxima aceptada y superada</strong></p>
<p><em># crear() · RN-CA03</em></p>
<blockquote>
<p><strong>Dado</strong> que existen las categorías:</p>
<p>│ ID_Categoria │ Nombre_Categoria │ activo │</p>
<p>├──────────────┼──────────────────┼────────┤</p>
<p>│ 1 │ Portátiles │ TRUE │</p>
<p>│ 3 │ Proyectores │ FALSE │</p>
<p>│ 4 │ Periféricos │ TRUE │</p>
<p><strong>Cuando</strong> registra una categoría con Nombre_Categoria de &lt;valor&gt;</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Ejemplos:</strong></p>
<p>│ campo │ valor │ longitud │ máximo │ mensaje │</p>
<p>├──────────────────┼────────────────────────┼──────────┼────────┼─────────────────────────────────────────────────────────────┤</p>
<p>│ Nombre_Categoria │ texto de 50 caracteres │ 50 │ 50 │ «Categoría registrada correctamente.» │</p>
<p>│ Nombre_Categoria │ texto de 51 caracteres │ 51 │ 50 │ «El nombre de la categoría no puede superar 50 caracteres.» │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-4 Nombre que ya existe (RN propuesta sobre mayúsculas)</strong></p>
<p><em># existeNombreCategoria(), crear() · RN-CA04</em></p>
<blockquote>
<p><strong>Dado</strong> que existen las categorías:</p>
<p>│ ID_Categoria │ Nombre_Categoria │ activo │</p>
<p>├──────────────┼──────────────────┼────────┤</p>
<p>│ 1 │ Portátiles │ TRUE │</p>
<p>│ 3 │ Proyectores │ FALSE │</p>
<p>│ 4 │ Periféricos │ TRUE │</p>
<p><strong>Cuando</strong> registra una categoría con Nombre_Categoria &lt;nombre&gt;</p>
<p><strong>Entonces</strong> el sistema responde «Ya existe una categoría con ese nombre.»</p>
<p><strong>Y</strong> no se crea otra categoría</p>
<p><strong>Ejemplos:</strong></p>
<p>│ nombre │ caso │</p>
<p>├─────────────┼─────────────────────────────────────┤</p>
<p>│ Portátiles │ igual a una categoría activa │</p>
<p>│ Proyectores │ igual a una categoría inactiva │</p>
<p>│ portátiles │ igual salvo mayúsculas y minúsculas │</p>
</blockquote>
<p><strong>Escenario: CA-5 La categoría nueva queda disponible</strong></p>
<p><em># crear(), listarActivas() · RN-CA05</em></p>
<blockquote>
<p><strong>Dado</strong> que se registró la categoría Tabletas</p>
<p><strong>Cuando</strong> consulta las categorías activas</p>
<p><strong>Entonces</strong> la lista incluye la categoría Tabletas con activo TRUE</p>
</blockquote></td>
</tr>
<tr class="even">
<td><strong>Origen de la necesidad</strong></td>
<td>Alcance 1.2 – Tabla 5, pendiente de validación.</td>
</tr>
<tr class="odd">
<td><strong>RF derivados</strong></td>
<td>RF-45, RF-147</td>
</tr>
<tr class="even">
<td><strong>Prioridad</strong></td>
<td>Alta</td>
</tr>
</tbody>
</table>

*Nota: Categoria es el único catálogo gestionable: Rol, Permiso y Tipo_Documento son ENUM (CRF-002). La Tabla 5 de 1.7.3 pide una «HU de gestión validada con el cliente, o datos semilla declarados en el script DDL» (P-86); Marta Rojas actúa como Supuesto (P-74). La sensibilidad a mayúsculas en el nombre es propuesta (P-81). Sin cifras de la encuesta en el Origen.*

**HU-42 Consultar categorías**

<table>
<colgroup>
<col style="width: 16%" />
<col style="width: 83%" />
</colgroup>
<thead>
<tr class="header">
<th><strong>Código</strong></th>
<th><strong>HU-42</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><strong>Título corto</strong></td>
<td>Consultar categorías</td>
</tr>
<tr class="even">
<td><strong>Historia</strong></td>
<td><strong>Como</strong> Marta Rojas, Responsable de Activos, <strong>quiero</strong> consultar una categoría por su identificador y ver las categorías activas, <strong>para</strong> elegir la categoría correcta al registrar equipos y revisar el catálogo.</td>
</tr>
<tr class="odd">
<td><strong>Criterios de aceptación</strong></td>
<td><p><strong>Antecedentes</strong> (comunes a todos los escenarios)</p>
<blockquote>
<p><strong>Dado</strong> que Marta Rojas, Responsable de Activos, inició sesión</p>
</blockquote>
<p><strong>Escenario: CA-1 Consultar una categoría activa por su identificador</strong></p>
<p><em># buscarPorId() · RN-CA06</em></p>
<blockquote>
<p><strong>Dado</strong> que existen las categorías:</p>
<p>│ ID_Categoria │ Nombre_Categoria │ activo │</p>
<p>├──────────────┼──────────────────┼────────┤</p>
<p>│ 1 │ Portátiles │ TRUE │</p>
<p>│ 3 │ Proyectores │ FALSE │</p>
<p>│ 4 │ Periféricos │ TRUE │</p>
<p><strong>Cuando</strong> consulta por ID_Categoria 1</p>
<p><strong>Entonces</strong> ve la categoría con sus 3 campos: ID_Categoria 1, Nombre_Categoria Portátiles y activo TRUE</p>
<p><strong>Y</strong> la consulta no modifica la categoría</p>
</blockquote>
<p><strong>Escenario: CA-2 Consultar una categoría inactiva por su identificador</strong></p>
<p><em># buscarPorId() · RN-CA06</em></p>
<blockquote>
<p><strong>Dado</strong> que existen las categorías:</p>
<p>│ ID_Categoria │ Nombre_Categoria │ activo │</p>
<p>├──────────────┼──────────────────┼────────┤</p>
<p>│ 1 │ Portátiles │ TRUE │</p>
<p>│ 3 │ Proyectores │ FALSE │</p>
<p>│ 4 │ Periféricos │ TRUE │</p>
<p><strong>Cuando</strong> consulta por ID_Categoria 3</p>
<p><strong>Entonces</strong> ve la categoría con sus 3 campos: ID_Categoria 3, Nombre_Categoria Proyectores y activo FALSE</p>
</blockquote>
<p><strong>Escenario: CA-3 Ver las categorías activas, ordenadas por nombre</strong></p>
<p><em># listarActivas() · RN-CA05</em></p>
<blockquote>
<p><strong>Dado</strong> que existen las categorías:</p>
<p>│ ID_Categoria │ Nombre_Categoria │ activo │</p>
<p>├──────────────┼──────────────────┼────────┤</p>
<p>│ 1 │ Portátiles │ TRUE │</p>
<p>│ 3 │ Proyectores │ FALSE │</p>
<p>│ 4 │ Periféricos │ TRUE │</p>
<p><strong>Cuando</strong> consulta las categorías activas</p>
<p><strong>Entonces</strong> ve solo las categorías activas, con sus 3 campos, ordenadas por Nombre_Categoria:</p>
<p>│ ID_Categoria │ Nombre_Categoria │ activo │</p>
<p>├──────────────┼──────────────────┼────────┤</p>
<p>│ 4 │ Periféricos │ TRUE │</p>
<p>│ 1 │ Portátiles │ TRUE │</p>
<p><strong>Y</strong> no ve la categoría 3 (Proyectores), que está inactiva</p>
</blockquote>
<p><strong>Escenario: CA-4 Categoría inexistente</strong></p>
<p><em># buscarPorId() · RN-CA06</em></p>
<blockquote>
<p><strong>Dado</strong> que no existe la categoría 99</p>
<p><strong>Cuando</strong> consulta por ID_Categoria 99</p>
<p><strong>Entonces</strong> el sistema responde «No se encontró ninguna categoría con ese identificador.»</p>
<p><strong>Y</strong> no se muestra ninguna categoría</p>
</blockquote>
<p><strong>Escenario: CA-5 Sin categorías activas</strong></p>
<p><em># listarActivas() · RN-CA05</em></p>
<blockquote>
<p><strong>Dado</strong> que todas las categorías están inactivas</p>
<p><strong>Cuando</strong> consulta las categorías activas</p>
<p><strong>Entonces</strong> el sistema responde «No hay categorías activas.»</p>
</blockquote>
<p><strong>Escenario: CA-6 Ver las categorías activas al solicitar un equipo (actor secundario: Empleado)</strong></p>
<p><em># listarActivas() · RN-CA05, RN-CA14</em></p>
<blockquote>
<p><strong>Dado</strong> que quien consulta es Carlos Mejía, Empleado, en lugar del Responsable de Activos</p>
<p><strong>Y</strong> que existen las categorías:</p>
<p>│ ID_Categoria │ Nombre_Categoria │ activo │</p>
<p>├──────────────┼──────────────────┼────────┤</p>
<p>│ 1 │ Portátiles │ TRUE │</p>
<p>│ 3 │ Proyectores │ FALSE │</p>
<p>│ 4 │ Periféricos │ TRUE │</p>
<p><strong>Cuando</strong> consulta las categorías activas para elegir la de su solicitud</p>
<p><strong>Entonces</strong> ve solo las categorías activas, ordenadas por Nombre_Categoria:</p>
<p>│ ID_Categoria │ Nombre_Categoria │ activo │</p>
<p>├──────────────┼──────────────────┼────────┤</p>
<p>│ 4 │ Periféricos │ TRUE │</p>
<p>│ 1 │ Portátiles │ TRUE │</p>
<p><em>Actor secundario: el Empleado elige la categoría al solicitar (RN-CA14, Supuesto; P-87).</em></p>
</blockquote></td>
</tr>
<tr class="even">
<td><strong>Origen de la necesidad</strong></td>
<td>Alcance 1.2 – Tabla 5, pendiente de validación.</td>
</tr>
<tr class="odd">
<td><strong>RF derivados</strong></td>
<td>RF-46, RF-148</td>
</tr>
<tr class="even">
<td><strong>Prioridad</strong></td>
<td>Alta</td>
</tr>
</tbody>
</table>

*Nota: HU-42 agrupa dos actores: el Rol principal es el Responsable de Activos (necesidad N-01, categoría del equipo) y el Empleado consulta las categorías activas al solicitar un equipo en CA-6 (necesidad N-03; Supuesto). listarActivas() no lista las categorías inactivas y ningún método las lista todas: solo se ven por identificador (P-83). El orden por nombre es RN propuesta de la Fase A v6. Sin cifras de la encuesta en el Origen.*

**HU-43 Actualizar categoría**

<table>
<colgroup>
<col style="width: 16%" />
<col style="width: 83%" />
</colgroup>
<thead>
<tr class="header">
<th><strong>Código</strong></th>
<th><strong>HU-43</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><strong>Título corto</strong></td>
<td>Actualizar categoría</td>
</tr>
<tr class="even">
<td><strong>Historia</strong></td>
<td><strong>Como</strong> Marta Rojas, Responsable de Activos, <strong>quiero</strong> corregir el nombre de una categoría activa, <strong>para</strong> mantener el catálogo claro sin crear categorías duplicadas.</td>
</tr>
<tr class="odd">
<td><strong>Criterios de aceptación</strong></td>
<td><p><strong>Antecedentes</strong> (comunes a todos los escenarios)</p>
<blockquote>
<p><strong>Dado</strong> que Marta Rojas, Responsable de Activos, inició sesión</p>
</blockquote>
<p><strong>Escenario: CA-1 Actualizar el nombre de una categoría activa</strong></p>
<p><em># actualizar() · RN-CA02, RN-CA07</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la categoría 1 activa con los valores de la columna Antes</p>
<p><strong>Cuando</strong> actualiza la categoría 1 con los valores de la columna Después:</p>
<p>│ Campo │ Antes │ Después │</p>
<p>├──────────────────┼────────────┼─────────────────────────┤</p>
<p>│ Nombre_Categoria │ Portátiles │ Computadores portátiles │</p>
<p>│ ID_Categoria │ 1 │ 1 (sin cambio) │</p>
<p>│ activo │ TRUE │ TRUE (sin cambio) │</p>
<p><strong>Entonces</strong> el sistema responde «Categoría actualizada correctamente.»</p>
<p><strong>Y</strong> la categoría 1 queda con los valores de la columna Después</p>
</blockquote>
<p><strong>Esquema del escenario: CA-2 Nombre vacío y longitud máxima</strong></p>
<p><em># actualizar() · RN-CA02, RN-CA03</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la categoría:</p>
<p>│ ID_Categoria │ Nombre_Categoria │ activo │</p>
<p>├──────────────┼──────────────────┼────────┤</p>
<p>│ 1 │ Portátiles │ TRUE │</p>
<p><strong>Cuando</strong> actualiza la categoría 1 con Nombre_Categoria &lt;valor&gt;</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Ejemplos:</strong></p>
<p>│ valor │ mensaje │</p>
<p>├────────────────────────┼─────────────────────────────────────────────────────────────┤</p>
<p>│ (vacío) │ «El nombre de la categoría es obligatorio.» │</p>
<p>│ texto de 50 caracteres │ «Categoría actualizada correctamente.» │</p>
<p>│ texto de 51 caracteres │ «El nombre de la categoría no puede superar 50 caracteres.» │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-3 Nombre único, sin contar a la propia categoría</strong></p>
<p><em># existeNombreCategoria(), actualizar() · RN-CA04</em></p>
<blockquote>
<p><strong>Dado</strong> que existen las categorías:</p>
<p>│ ID_Categoria │ Nombre_Categoria │ activo │</p>
<p>├──────────────┼──────────────────┼────────┤</p>
<p>│ 1 │ Portátiles │ TRUE │</p>
<p>│ 3 │ Proyectores │ FALSE │</p>
<p>│ 4 │ Periféricos │ TRUE │</p>
<p><strong>Cuando</strong> actualiza la categoría 1 con Nombre_Categoria &lt;nombre&gt;</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Ejemplos:</strong></p>
<p>│ nombre │ caso │ mensaje │</p>
<p>├─────────────┼───────────────────────────────────────────────┼───────────────────────────────────────────┤</p>
<p>│ Periféricos │ igual a otra categoría activa │ «Ya existe una categoría con ese nombre.» │</p>
<p>│ Proyectores │ igual a una categoría inactiva │ «Ya existe una categoría con ese nombre.» │</p>
<p>│ Portátiles │ el propio nombre, sin cambio │ «Categoría actualizada correctamente.» │</p>
<p>│ portátiles │ el propio nombre, solo cambian las mayúsculas │ «Categoría actualizada correctamente.» │</p>
</blockquote>
<p><strong>Escenario: CA-4 Categoría inactiva (RN propuesta)</strong></p>
<p><em># actualizar() · RN-CA08</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la categoría:</p>
<p>│ ID_Categoria │ Nombre_Categoria │ activo │</p>
<p>├──────────────┼──────────────────┼────────┤</p>
<p>│ 3 │ Proyectores │ FALSE │</p>
<p><strong>Cuando</strong> actualiza la categoría 3 con Nombre_Categoria Proyectores portátiles</p>
<p><strong>Entonces</strong> el sistema responde «La categoría está inactiva.»</p>
<p><strong>Y</strong> la categoría 3 conserva sus datos anteriores</p>
</blockquote>
<p><strong>Esquema del escenario: CA-5 Datos que no se modifican</strong></p>
<p><em># actualizar() · RN-CA01, RN-CA07</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la categoría:</p>
<p>│ ID_Categoria │ Nombre_Categoria │ activo │</p>
<p>├──────────────┼──────────────────┼────────┤</p>
<p>│ 1 │ Portátiles │ TRUE │</p>
<p><strong>Cuando</strong> intenta cambiar &lt;campo&gt; de la categoría 1 a &lt;valor&gt;</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> la categoría 1 conserva sus datos anteriores</p>
<p><strong>Ejemplos:</strong></p>
<p>│ campo │ valor │ mensaje │</p>
<p>├──────────────┼───────┼───────────────────────────────────────────────────────────┤</p>
<p>│ ID_Categoria │ 9 │ «El identificador de la categoría no se puede modificar.» │</p>
<p>│ activo │ FALSE │ «El estado de la categoría solo cambia al inactivarla.» │</p>
</blockquote>
<p><strong>Escenario: CA-6 Categoría inexistente</strong></p>
<p><em># actualizar() · RN-CA06</em></p>
<blockquote>
<p><strong>Dado</strong> que no existe la categoría 99</p>
<p><strong>Cuando</strong> actualiza la categoría con ID_Categoria 99</p>
<p><strong>Entonces</strong> el sistema responde «La categoría no existe.»</p>
</blockquote></td>
</tr>
<tr class="even">
<td><strong>Origen de la necesidad</strong></td>
<td>Alcance 1.2 – Tabla 5, pendiente de validación.</td>
</tr>
<tr class="odd">
<td><strong>RF derivados</strong></td>
<td>RF-47, RF-149, RF-150</td>
</tr>
<tr class="even">
<td><strong>Prioridad</strong></td>
<td>Media</td>
</tr>
</tbody>
</table>

*Nota: La Fase A v6 dice que actualizar() solo «modifica el nombre de una categoría». No se actualiza una categoría inactiva (RN propuesta; P-84). La sensibilidad a mayúsculas es propuesta (P-81). Marta Rojas actúa como Supuesto (P-74). Sin cifras de la encuesta en el Origen.*

**HU-44 Inactivar categoría**

<table>
<colgroup>
<col style="width: 16%" />
<col style="width: 83%" />
</colgroup>
<thead>
<tr class="header">
<th><strong>Código</strong></th>
<th><strong>HU-44</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><strong>Título corto</strong></td>
<td>Inactivar categoría</td>
</tr>
<tr class="even">
<td><strong>Historia</strong></td>
<td><strong>Como</strong> Marta Rojas, Responsable de Activos, <strong>quiero</strong> inactivar una categoría sin eliminar su registro, conociendo antes la consecuencia, <strong>para</strong> que deje de usarse en equipos y solicitudes nuevos sin perder el historial.</td>
</tr>
<tr class="odd">
<td><strong>Criterios de aceptación</strong></td>
<td><p><strong>Antecedentes</strong> (comunes a todos los escenarios)</p>
<blockquote>
<p><strong>Dado</strong> que Marta Rojas, Responsable de Activos, inició sesión</p>
</blockquote>
<p><strong>Escenario: CA-1 Inactivar una categoría con confirmación</strong></p>
<p><em># inactivar() · RN-CA09, RN-CA11</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la categoría 4 (Periféricos, activa) cuyo único activo está en estado Baja y que no tiene solicitudes pendientes</p>
<p><strong>Cuando</strong> solicita inactivar la categoría 4</p>
<p><strong>Entonces</strong> el sistema muestra el aviso «La categoría Periféricos pasará a estado inactivo. No se podrán registrar activos ni solicitudes con ella, el registro no se elimina y no se puede reactivar. ¿Desea continuar?»</p>
<p><strong>Cuando</strong> confirma la baja</p>
<p><strong>Entonces</strong> el sistema responde «Categoría inactivada correctamente.»</p>
<p><strong>Y</strong> la categoría queda con activo FALSE</p>
<p><strong>Y</strong> ID_Categoria y Nombre_Categoria conservan su valor</p>
</blockquote>
<p><strong>Escenario: CA-2 Desistir de la inactivación</strong></p>
<p><em># inactivar() · RN-CA11</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la categoría 4 (Periféricos, activa) sin activos ni solicitudes pendientes</p>
<p><strong>Cuando</strong> solicita inactivar la categoría 4</p>
<p><strong>Entonces</strong> el sistema muestra el aviso «La categoría Periféricos pasará a estado inactivo. No se podrán registrar activos ni solicitudes con ella, el registro no se elimina y no se puede reactivar. ¿Desea continuar?»</p>
<p><strong>Cuando</strong> decide no continuar</p>
<p><strong>Entonces</strong> el sistema responde «Inactivación cancelada. La categoría no fue modificada.»</p>
<p><strong>Y</strong> la categoría 4 conserva activo TRUE</p>
</blockquote>
<p><strong>Escenario: CA-3 Categoría que ya está inactiva</strong></p>
<p><em># inactivar() · RN-CA10</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la categoría:</p>
<p>│ ID_Categoria │ Nombre_Categoria │ activo │</p>
<p>├──────────────┼──────────────────┼────────┤</p>
<p>│ 3 │ Proyectores │ FALSE │</p>
<p><strong>Cuando</strong> solicita inactivar la categoría 3</p>
<p><strong>Entonces</strong> el sistema responde «La categoría ya está inactiva.»</p>
<p><strong>Y</strong> no muestra el aviso de confirmación y la categoría 3 no cambia</p>
</blockquote>
<p><strong>Escenario: CA-4 Categoría inexistente</strong></p>
<p><em># inactivar() · RN-CA06</em></p>
<blockquote>
<p><strong>Dado</strong> que no existe la categoría 99</p>
<p><strong>Cuando</strong> solicita inactivar la categoría 99</p>
<p><strong>Entonces</strong> el sistema responde «La categoría no existe.»</p>
</blockquote>
<p><strong>Esquema del escenario: CA-5 Categoría con activos sin baja o con solicitudes pendientes</strong></p>
<p><em># inactivar() · RN-CA12</em></p>
<blockquote>
<p><strong>Dado</strong> que existe la categoría 1 (Portátiles, activa), con &lt;situacion&gt;</p>
<p><strong>Cuando</strong> solicita inactivar la categoría 1</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> no muestra el aviso de confirmación y la categoría 1 conserva activo TRUE</p>
<p><strong>Ejemplos:</strong></p>
<p>│ situacion │ mensaje │</p>
<p>├────────────────────────────────────────────────────────────────┼────────────────────────────────────────────────────────────────────────────────────────────────────────────┤</p>
<p>│ el activo 1 en estado Disponible │ «La categoría tiene activos sin dar de baja. Dé de baja o reclasifique esos activos antes de inactivarla.» │</p>
<p>│ el activo 2 en estado Asignado │ «La categoría tiene activos sin dar de baja. Dé de baja o reclasifique esos activos antes de inactivarla.» │</p>
<p>│ un activo en estado Dañado │ «La categoría tiene activos sin dar de baja. Dé de baja o reclasifique esos activos antes de inactivarla.» │</p>
<p>│ la solicitud 1 en estado Pendiente y todos sus activos en Baja │ «La categoría tiene solicitudes pendientes. Resuélvalas o cancélelas antes de inactivarla.» │</p>
<p><em>Opción A, pendiente de P-82. Orden de verificación: activos sin baja y después solicitudes pendientes. Con la opción B, M-261 y M-262 pasarían a avisos de confirmación.</em></p>
</blockquote>
<p><strong>Esquema del escenario: CA-6 La categoría inactivada no admite activos ni solicitudes nuevos</strong></p>
<p><em># crear(), inactivar() · RN-CA13</em></p>
<blockquote>
<p><strong>Dado</strong> que la categoría 4 (Periféricos) fue inactivada</p>
<p><strong>Cuando</strong> registra &lt;operacion&gt; con ID_Categoria 4 y los demás datos válidos</p>
<p><strong>Entonces</strong> el sistema responde «La categoría seleccionada está inactiva.»</p>
<p><strong>Y</strong> no se crea el registro</p>
<p><strong>Ejemplos:</strong></p>
<p>│ operacion │ regla que lo aplica │</p>
<p>├───────────────┼─────────────────────┤</p>
<p>│ un activo │ RN-A09 (piloto) │</p>
<p>│ una solicitud │ RN-S07 (Bloque 2) │</p>
</blockquote>
<p><strong>Escenario: CA-7 La categoría inactivada no se elimina ni figura entre las activas</strong></p>
<p><em># buscarPorId(), listarActivas(), inactivar() · RN-CA05, RN-CA09</em></p>
<blockquote>
<p><strong>Dado</strong> que la categoría 4 (Periféricos) fue inactivada</p>
<p><strong>Cuando</strong> consulta por ID_Categoria 4 y consulta las categorías activas</p>
<p><strong>Entonces</strong> ve la categoría 4 con activo FALSE y su nombre intacto</p>
<p><strong>Y</strong> la categoría 4 no figura en la lista de categorías activas</p>
</blockquote></td>
</tr>
<tr class="even">
<td><strong>Origen de la necesidad</strong></td>
<td>Alcance 1.2 – Tabla 5, pendiente de validación.</td>
</tr>
<tr class="odd">
<td><strong>RF derivados</strong></td>
<td>RF-48, RF-151, RF-152, RF-153, RF-154</td>
</tr>
<tr class="even">
<td><strong>Prioridad</strong></td>
<td>Media</td>
</tr>
</tbody>
</table>

*Nota: Los bloqueos son la opción A, alineada con RN-C14 (Bloque 1) y RN-U15 (Bloque 6a): no se inactiva una categoría con activos sin dar de baja ni con solicitudes Pendientes; la opción B (avisar y permitir) y las solicitudes Aprobadas sin asignación quedan en P-82. Una categoría inactiva ya no admite activos ni solicitudes nuevos por RN-A09 (piloto) y RN-S07 (Bloque 2). No existe reactivar (P-85). Marta Rojas actúa como Supuesto (P-74). Sin cifras de la encuesta en el Origen.*

**Auditoria — Anexo 9**

**HU-45 Consultar registro de auditoría**

<table>
<colgroup>
<col style="width: 16%" />
<col style="width: 83%" />
</colgroup>
<thead>
<tr class="header">
<th><strong>Código</strong></th>
<th><strong>HU-45</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><strong>Título corto</strong></td>
<td>Consultar registro de auditoría</td>
</tr>
<tr class="even">
<td><strong>Historia</strong></td>
<td><strong>Como</strong> Sofía Herrera, Gerente, <strong>quiero</strong> consultar un registro de auditoría por su identificador, <strong>para</strong> verificar quién ejecutó una acción, sobre qué registro y cuándo.</td>
</tr>
<tr class="odd">
<td><strong>Criterios de aceptación</strong></td>
<td><p><strong>Antecedentes</strong> (comunes a todos los escenarios)</p>
<blockquote>
<p><strong>Dado</strong> que Sofía Herrera, Gerente, inició sesión</p>
</blockquote>
<p><strong>Esquema del escenario: CA-1 Consultar un registro de auditoría por su identificador</strong></p>
<p><em># buscarPorId() · RN-AU01, RN-AU03, RN-AU09, RN-AU13</em></p>
<blockquote>
<p><strong>Dado</strong> que existen los registros de auditoría:</p>
<p>│ ID_Auditoria │ ID_Usuario │ Entidad │ ID_Registro │ Accion │ Fecha_Accion │ Detalle │</p>
<p>├──────────────┼────────────┼────────────┼─────────────┼──────────┼──────────────────┼─────────────────────────────────┤</p>
<p>│ 1 │ 2 │ Activo │ 5 │ Crear │ 2026-09-30 08:45 │ Activo NEX-000105 registrado │</p>
<p>│ 5 │ 7 │ Devolucion │ 1 │ Devolver │ 2026-10-05 16:40 │ Devolución 1 de la asignación 1 │</p>
<p><strong>Cuando</strong> consulta por ID_Auditoria &lt;id&gt;</p>
<p><strong>Entonces</strong> ve el registro con sus 7 campos, según la fila de Ejemplos</p>
<p><strong>Y</strong> la consulta no modifica el registro</p>
<p><strong>Ejemplos:</strong></p>
<p>│ ID_Auditoria │ ID_Usuario │ Entidad │ ID_Registro │ Accion │ Fecha_Accion │ Detalle │</p>
<p>├──────────────┼────────────┼────────────┼─────────────┼──────────┼──────────────────┼─────────────────────────────────┤</p>
<p>│ 1 │ 2 │ Activo │ 5 │ Crear │ 2026-09-30 08:45 │ Activo NEX-000105 registrado │</p>
<p>│ 5 │ 7 │ Devolucion │ 1 │ Devolver │ 2026-10-05 16:40 │ Devolución 1 de la asignación 1 │</p>
</blockquote>
<p><strong>Escenario: CA-2 Consultar un registro sin detalle</strong></p>
<p><em># buscarPorId() · RN-AU03</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el registro de auditoría:</p>
<p>│ ID_Auditoria │ ID_Usuario │ Entidad │ ID_Registro │ Accion │ Fecha_Accion │ Detalle │</p>
<p>├──────────────┼────────────┼───────────┼─────────────┼─────────┼──────────────────┼─────────┤</p>
<p>│ 2 │ 9 │ Solicitud │ 8 │ Aprobar │ 2026-10-01 10:05 │ (vacío) │</p>
<p><strong>Cuando</strong> consulta por ID_Auditoria 2</p>
<p><strong>Entonces</strong> ve el registro con sus 7 campos: ID_Auditoria 2, ID_Usuario 9, Entidad Solicitud, ID_Registro 8, Accion Aprobar, Fecha_Accion 2026-10-01 10:05 y Detalle vacío</p>
</blockquote>
<p><strong>Escenario: CA-3 Registro de auditoría no encontrado</strong></p>
<p><em># buscarPorId() · RN-AU13</em></p>
<blockquote>
<p><strong>Dado</strong> que no existe el registro de auditoría 99</p>
<p><strong>Cuando</strong> consulta por ID_Auditoria 99</p>
<p><strong>Entonces</strong> el sistema responde «No se encontró ningún registro de auditoría con ese identificador.»</p>
<p><strong>Y</strong> no se muestra ningún registro</p>
</blockquote>
<p><strong>Esquema del escenario: CA-4 Identificador no válido (RN propuesta)</strong></p>
<p><em># buscarPorId() · RN-AU14</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el registro de auditoría 1</p>
<p><strong>Cuando</strong> consulta por ID_Auditoria &lt;valor&gt;</p>
<p><strong>Entonces</strong> el sistema responde «El identificador del registro de auditoría no es válido.»</p>
<p><strong>Y</strong> no se muestra ningún registro</p>
<p><strong>Ejemplos:</strong></p>
<p>│ valor │ caso │</p>
<p>├─────────┼─────────────┤</p>
<p>│ 0 │ cero │</p>
<p>│ -5 │ negativo │</p>
<p>│ abc │ no numérico │</p>
<p>│ (vacío) │ vacío │</p>
</blockquote>
<p><strong>Escenario: CA-5 Registro cuyo ID_Registro ya no existe en su entidad</strong></p>
<p><em># buscarPorId() · RN-AU06</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el registro de auditoría:</p>
<p>│ ID_Auditoria │ ID_Usuario │ Entidad │ ID_Registro │ Accion │ Fecha_Accion │ Detalle │</p>
<p>├──────────────┼────────────┼───────────┼─────────────┼────────┼──────────────────┼──────────────────────────┤</p>
<p>│ 4 │ 2 │ Solicitud │ 99 │ Crear │ 2026-09-20 09:00 │ Solicitud #99 registrada │</p>
<p><strong>Y</strong> que la solicitud 99 ya no existe en Solicitud</p>
<p><strong>Cuando</strong> consulta por ID_Auditoria 4</p>
<p><strong>Entonces</strong> ve el registro con sus 7 campos, con ID_Registro 99 tal como se guardó</p>
<p><strong>Y</strong> el sistema no valida ID_Registro contra Solicitud: es una referencia lógica, no una FK</p>
</blockquote>
<p><strong>Escenario: CA-6 Registro cuyo usuario está inactivo</strong></p>
<p><em># buscarPorId() · RN-AU04, RN-AU16</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el registro de auditoría:</p>
<p>│ ID_Auditoria │ ID_Usuario │ Entidad │ ID_Registro │ Accion │ Fecha_Accion │ Detalle │</p>
<p>├──────────────┼────────────┼───────────┼─────────────┼──────────┼──────────────────┼────────────────────────────────────────────────────┤</p>
<p>│ 3 │ 12 │ Solicitud │ 3 │ Rechazar │ 2026-09-30 15:20 │ Solicitud #3 rechazada por falta de disponibilidad │</p>
<p><strong>Y</strong> que el usuario 12 está inactivo:</p>
<p>│ ID_Usuario │ Nombre │ Apellido │ activo │ rol │</p>
<p>├────────────┼────────┼──────────┼────────┼───────────┤</p>
<p>│ 12 │ Rosa │ Quintero │ FALSE │ Aprobador │</p>
<p><strong>Cuando</strong> consulta por ID_Auditoria 3</p>
<p><strong>Entonces</strong> ve el registro con sus 7 campos, con ID_Usuario 12</p>
</blockquote>
<p><strong>Esquema del escenario: CA-7 Actor sin permiso (RN propuesta)</strong></p>
<p><em># buscarPorId() · RN-AU15</em></p>
<blockquote>
<p><strong>Dado</strong> que existe el registro de auditoría 1 y existen los usuarios:</p>
<p>│ ID_Usuario │ Nombre │ Apellido │ activo │ rol │</p>
<p>├────────────┼────────┼──────────┼────────┼────────────────────┤</p>
<p>│ 7 │ Carlos │ Mejía │ TRUE │ Empleado │</p>
<p>│ 9 │ Laura │ Gómez │ TRUE │ Aprobador │</p>
<p>│ 6 │ Andrés │ Pineda │ TRUE │ Técnico de Soporte │</p>
<p><strong>Cuando</strong> el usuario &lt;usuario&gt;, en lugar de Sofía Herrera, consulta por ID_Auditoria 1</p>
<p><strong>Entonces</strong> el sistema responde «No tiene permiso para consultar la auditoría.»</p>
<p><strong>Y</strong> no se muestra ningún dato del registro</p>
<p><strong>Ejemplos:</strong></p>
<p>│ usuario │ rol │</p>
<p>├─────────┼────────────────────┤</p>
<p>│ 7 │ Empleado │</p>
<p>│ 9 │ Aprobador │</p>
<p>│ 6 │ Técnico de Soporte │</p>
</blockquote></td>
</tr>
<tr class="even">
<td><strong>Origen de la necesidad</strong></td>
<td>Alcance 1.2 – Tabla 5, pendiente de validación.</td>
</tr>
<tr class="odd">
<td><strong>RF derivados</strong></td>
<td>RF-49, RF-160</td>
</tr>
<tr class="even">
<td><strong>Prioridad</strong></td>
<td>Alta</td>
</tr>
</tbody>
</table>

*Nota: el Alcance 1.2 pide «mantener un registro completo de auditoría de todas las acciones relevantes» pero no nombra a quien lo consulta; Sofía Herrera (Gerente) actúa como Supuesto (RN-AU15; P-88). Marta Rojas no se incluye como actor secundario: el Alcance no lo respalda (P-88). Opción A: la HU se redacta con el único método existente, buscarPorId(), por lo que hay que conocer el identificador del registro; la alternativa B (listado filtrado) se describe en C.8 y no se aplica. Los registros son inmutables: Auditoria solo tiene registrar() (INTERNO) y buscarPorId(), sin operación para modificarlos ni borrarlos (RN-AU09, propuesta). El Detalle nunca contiene contraseñas (RN-AU08). registrar() es INTERNO y no tiene HU: la regla transversal que lo invoca está en A.6. Sin cifras de la encuesta en el Origen.*

**Reportes — Anexo 9**

**HU-46 Consultar reportes**

<table>
<colgroup>
<col style="width: 16%" />
<col style="width: 83%" />
</colgroup>
<thead>
<tr class="header">
<th><strong>Código</strong></th>
<th><strong>HU-46</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><strong>Título corto</strong></td>
<td>Consultar reportes</td>
</tr>
<tr class="even">
<td><strong>Historia</strong></td>
<td><strong>Como</strong> Sofía Herrera, Gerente, <strong>quiero</strong> consultar el reporte de activos asignados, disponibles, pendientes de devolución o en mal estado, para un rango de fechas, <strong>para</strong> conocer la situación de los equipos de Nexa Servicios sin depender de listas dispersas.</td>
</tr>
<tr class="odd">
<td><strong>Criterios de aceptación</strong></td>
<td><p><strong>Antecedentes</strong> (comunes a todos los escenarios)</p>
<blockquote>
<p><strong>Dado</strong> que Sofía Herrera, Gerente, inició sesión</p>
</blockquote>
<p><strong>Esquema del escenario: CA-1 Consultar el reporte de cada tipo</strong></p>
<p><em># consultar() · RN-R01, RN-R02, RN-R03, RN-R06, RN-R07, RN-R08, RN-R09, RN-R10, RN-R11, RN-R15, RN-R16</em></p>
<blockquote>
<p><strong>Dado</strong> que la fecha actual es 2026-10-06 y existen los activos:</p>
<p>│ ID_Activo │ Marca │ Modelo │ Placa_Inventario │ Estado │ Ubicacion │ ID_Categoria │</p>
<p>├───────────┼────────┼──────────────────┼──────────────────┼────────────┼──────────────────┼──────────────┤</p>
<p>│ 1 │ HP │ ProBook 450 G8 │ NEX-000101 │ Disponible │ Bodega principal │ 1 │</p>
<p>│ 2 │ Lenovo │ ThinkPad E14 │ NEX-000102 │ Asignado │ Oficina 301 │ 1 │</p>
<p>│ 5 │ Lenovo │ ThinkPad L14 │ NEX-000105 │ Asignado │ (vacío) │ 1 │</p>
<p>│ 8 │ Lenovo │ ThinkPad T14 │ NEX-000108 │ Dañado │ Bodega principal │ 1 │</p>
<p>│ 9 │ HP │ EliteBook 840 G8 │ NEX-000109 │ Baja │ (vacío) │ 1 │</p>
<p>│ 10 │ Dell │ P2422H │ NEX-000110 │ Disponible │ Bodega principal │ 2 │</p>
<p><strong>Y</strong> que existen las asignaciones:</p>
<p>│ ID_Asignacion │ Fecha_Entrega │ Fecha_Devolucion_Esperada │ Estado_Asignacion │ ID_Custodio │ ID_Activo │ ID_Solicitud │</p>
<p>├───────────────┼───────────────┼───────────────────────────┼───────────────────┼─────────────┼───────────┼──────────────┤</p>
<p>│ 1 │ 2026-10-01 │ 2026-10-31 │ Vigente │ 3 │ 5 │ 2 │</p>
<p>│ 2 │ 2026-09-15 │ 2026-10-15 │ Vigente │ 1 │ 2 │ 8 │</p>
<p>│ 3 │ 2026-08-20 │ 2026-09-20 │ Cerrada │ 3 │ 6 │ 9 │</p>
<p><strong>Y</strong> que el activo 6, de la asignación 3, está en Estado Baja y existe la devolución:</p>
<p>│ ID_Devolucion │ Fecha_Devolucion │ Observaciones │ ID_Asignacion │ Estado_Recepcion │ Fecha_Confirmacion │ ID_Receptor │</p>
<p>├───────────────┼──────────────────┼──────────────────────┼───────────────┼──────────────────┼────────────────────┼─────────────┤</p>
<p>│ 1 │ 2026-10-05 16:40 │ Con cargador y funda │ 1 │ Pendiente │ (vacío) │ (vacío) │</p>
<p><strong>Cuando</strong> solicita el reporte de tipo &lt;tipo&gt; con Fecha_Inicio 2026-08-01 y Fecha_Fin 2026-10-31</p>
<p><strong>Entonces</strong> ve solo las filas de la fila de Ejemplos, en ese orden, con las columnas del resultado esperado de su tipo</p>
<p><strong>Y</strong> el reporte no modifica ningún dato</p>
<p><strong>Ejemplos:</strong></p>
<p>│ tipo │ filas, en orden │ orden │</p>
<p>├───────────────────────┼────────────────────┼───────────────────────────────────────────────────┤</p>
<p>│ Asignados │ asignaciones 1 y 2 │ Fecha_Entrega, la más reciente primero │</p>
<p>│ Pendientes_Devolucion │ asignaciones 2 y 1 │ Fecha_Devolucion_Esperada, la más próxima primero │</p>
<p>│ Disponibles │ activos 1 y 10 │ ID_Activo, ascendente │</p>
<p>│ Mal_Estado │ activo 8 │ ID_Activo, ascendente │</p>
<p><em>Resultado esperado de Asignados (asignaciones Vigentes con Fecha_Entrega en el rango; la asignación 3 está Cerrada y no aparece):</em></p>
<p>│ ID_Asignacion │ ID_Activo │ Placa_Inventario │ Marca │ Modelo │ ID_Custodio │ Fecha_Entrega │ Fecha_Devolucion_Esperada │</p>
<p>├───────────────┼───────────┼──────────────────┼────────┼──────────────┼─────────────┼───────────────┼───────────────────────────┤</p>
<p>│ 1 │ 5 │ NEX-000105 │ Lenovo │ ThinkPad L14 │ 3 │ 2026-10-01 │ 2026-10-31 │</p>
<p>│ 2 │ 2 │ NEX-000102 │ Lenovo │ ThinkPad E14 │ 1 │ 2026-09-15 │ 2026-10-15 │</p>
<p><em>Resultado esperado de Pendientes_Devolucion (asignaciones Vigentes con Fecha_Devolucion_Esperada en el rango):</em></p>
<p>│ ID_Asignacion │ ID_Activo │ Placa_Inventario │ ID_Custodio │ Fecha_Devolucion_Esperada │ Estado_Recepcion │</p>
<p>├───────────────┼───────────┼──────────────────┼─────────────┼───────────────────────────┼──────────────────┤</p>
<p>│ 2 │ 2 │ NEX-000102 │ 1 │ 2026-10-15 │ (sin devolución) │</p>
<p>│ 1 │ 5 │ NEX-000105 │ 3 │ 2026-10-31 │ Pendiente │</p>
<p><em>Resultado esperado de Disponibles (activos en Estado Disponible; las fechas no filtran):</em></p>
<p>│ ID_Activo │ Placa_Inventario │ Marca │ Modelo │ Estado │ Ubicacion │</p>
<p>├───────────┼──────────────────┼───────┼────────────────┼────────────┼──────────────────┤</p>
<p>│ 1 │ NEX-000101 │ HP │ ProBook 450 G8 │ Disponible │ Bodega principal │</p>
<p>│ 10 │ NEX-000110 │ Dell │ P2422H │ Disponible │ Bodega principal │</p>
<p><em>Resultado esperado de Mal_Estado (activos en Estado Dañado; las fechas no filtran; el activo 9, en Baja, no es mal estado):</em></p>
<p>│ ID_Activo │ Placa_Inventario │ Marca │ Modelo │ Estado │ Ubicacion │</p>
<p>├───────────┼──────────────────┼────────┼──────────────┼────────┼──────────────────┤</p>
<p>│ 8 │ NEX-000108 │ Lenovo │ ThinkPad T14 │ Dañado │ Bodega principal │</p>
</blockquote>
<p><strong>Escenario: CA-2 Fecha_Inicio vacía</strong></p>
<p><em># consultar() · RN-R02</em></p>
<blockquote>
<p><strong>Dado</strong> que existen activos y asignaciones</p>
<p><strong>Cuando</strong> solicita el reporte de tipo Asignados con Fecha_Inicio vacía y Fecha_Fin 2026-10-31</p>
<p><strong>Entonces</strong> el sistema responde «La fecha de inicio es obligatoria.»</p>
<p><strong>Y</strong> no se genera el reporte</p>
</blockquote>
<p><strong>Escenario: CA-3 Fecha_Fin vacía: el rango llega hasta hoy (RN propuesta)</strong></p>
<p><em># consultar() · RN-R04, RN-R06</em></p>
<blockquote>
<p><strong>Dado</strong> que la fecha actual es 2026-10-06 y existen los activos 2 y 5 y las asignaciones:</p>
<p>│ ID_Asignacion │ Fecha_Entrega │ Fecha_Devolucion_Esperada │ Estado_Asignacion │ ID_Custodio │ ID_Activo │ ID_Solicitud │</p>
<p>├───────────────┼───────────────┼───────────────────────────┼───────────────────┼─────────────┼───────────┼──────────────┤</p>
<p>│ 1 │ 2026-10-01 │ 2026-10-31 │ Vigente │ 3 │ 5 │ 2 │</p>
<p>│ 2 │ 2026-09-15 │ 2026-10-15 │ Vigente │ 1 │ 2 │ 8 │</p>
<p><strong>Cuando</strong> solicita el reporte de tipo Asignados con Fecha_Inicio 2026-09-20 y sin Fecha_Fin</p>
<p><strong>Entonces</strong> ve solo la asignación 1, con las columnas del reporte de Asignados:</p>
<p>│ ID_Asignacion │ ID_Activo │ Placa_Inventario │ Marca │ Modelo │ ID_Custodio │ Fecha_Entrega │ Fecha_Devolucion_Esperada │</p>
<p>├───────────────┼───────────┼──────────────────┼────────┼──────────────┼─────────────┼───────────────┼───────────────────────────┤</p>
<p>│ 1 │ 5 │ NEX-000105 │ Lenovo │ ThinkPad L14 │ 3 │ 2026-10-01 │ 2026-10-31 │</p>
<p><strong>Y</strong> no ve la asignación 2, entregada el 2026-09-15, antes de Fecha_Inicio</p>
</blockquote>
<p><strong>Esquema del escenario: CA-4 Fecha_Fin anterior a Fecha_Inicio (RN propuesta)</strong></p>
<p><em># consultar() · RN-R05</em></p>
<blockquote>
<p><strong>Dado</strong> que la fecha actual es 2026-10-06 y existen los activos 2 y 5 y las asignaciones:</p>
<p>│ ID_Asignacion │ Fecha_Entrega │ Fecha_Devolucion_Esperada │ Estado_Asignacion │ ID_Custodio │ ID_Activo │ ID_Solicitud │</p>
<p>├───────────────┼───────────────┼───────────────────────────┼───────────────────┼─────────────┼───────────┼──────────────┤</p>
<p>│ 1 │ 2026-10-01 │ 2026-10-31 │ Vigente │ 3 │ 5 │ 2 │</p>
<p>│ 2 │ 2026-09-15 │ 2026-10-15 │ Vigente │ 1 │ 2 │ 8 │</p>
<p><strong>Cuando</strong> solicita el reporte de tipo &lt;tipo&gt; con Fecha_Inicio &lt;inicio&gt; y Fecha_Fin &lt;fin&gt;</p>
<p><strong>Entonces</strong> el sistema responde &lt;resultado&gt;</p>
<p><strong>Ejemplos:</strong></p>
<p>│ tipo │ inicio │ fin │ resultado │</p>
<p>├───────────────────────┼────────────┼────────────┼───────────────────────────────────────────────────────────────┤</p>
<p>│ Asignados │ 2026-10-31 │ 2026-10-30 │ «La fecha de fin no puede ser anterior a la fecha de inicio.» │</p>
<p>│ Pendientes_Devolucion │ 2026-10-06 │ 2026-10-05 │ «La fecha de fin no puede ser anterior a la fecha de inicio.» │</p>
<p>│ Asignados │ 2026-10-01 │ 2026-10-01 │ el reporte con la asignación 1 │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-5 Tipo de reporte vacío o fuera del ENUM</strong></p>
<p><em># consultar() · RN-R02, RN-R03</em></p>
<blockquote>
<p><strong>Dado</strong> que existen activos y asignaciones</p>
<p><strong>Cuando</strong> solicita el reporte con Tipo_Reporte &lt;tipo&gt;, Fecha_Inicio 2026-08-01 y Fecha_Fin 2026-10-31</p>
<p><strong>Entonces</strong> el sistema responde &lt;mensaje&gt;</p>
<p><strong>Y</strong> no se genera el reporte</p>
<p><strong>Ejemplos:</strong></p>
<p>│ tipo │ mensaje │</p>
<p>├──────────┼──────────────────────────────────────┤</p>
<p>│ (vacío) │ «El tipo de reporte es obligatorio.» │</p>
<p>│ Vencidos │ «El tipo de reporte no es válido.» │</p>
<p>│ Todos │ «El tipo de reporte no es válido.» │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-6 Reporte sin resultados</strong></p>
<p><em># consultar() · RN-R12</em></p>
<blockquote>
<p><strong>Dado</strong> que la fecha actual es 2026-10-06 y existen los activos 2 (Asignado), 5 (Asignado) y 9 (Baja) y las asignaciones:</p>
<p>│ ID_Asignacion │ Fecha_Entrega │ Fecha_Devolucion_Esperada │ Estado_Asignacion │ ID_Custodio │ ID_Activo │ ID_Solicitud │</p>
<p>├───────────────┼───────────────┼───────────────────────────┼───────────────────┼─────────────┼───────────┼──────────────┤</p>
<p>│ 1 │ 2026-10-01 │ 2026-10-31 │ Vigente │ 3 │ 5 │ 2 │</p>
<p>│ 2 │ 2026-09-15 │ 2026-10-15 │ Vigente │ 1 │ 2 │ 8 │</p>
<p><strong>Cuando</strong> solicita el reporte de tipo &lt;tipo&gt; con Fecha_Inicio 2026-01-01 y Fecha_Fin 2026-01-31</p>
<p><strong>Entonces</strong> el sistema responde «No hay resultados para el reporte solicitado.»</p>
<p><strong>Y</strong> no se muestra ninguna fila</p>
<p><strong>Ejemplos:</strong></p>
<p>│ tipo │ motivo │</p>
<p>├───────────────────────┼─────────────────────────────────────────────────┤</p>
<p>│ Asignados │ ninguna asignación tiene Fecha_Entrega en enero │</p>
<p>│ Pendientes_Devolucion │ ninguna Fecha_Devolucion_Esperada cae en enero │</p>
<p>│ Disponibles │ no hay activos Disponibles │</p>
<p>│ Mal_Estado │ no hay activos Dañados │</p>
</blockquote>
<p><strong>Esquema del escenario: CA-7 Actor sin permiso (RN propuesta)</strong></p>
<p><em># consultar() · RN-R14</em></p>
<blockquote>
<p><strong>Dado</strong> que existen los usuarios:</p>
<p>│ ID_Usuario │ Nombre │ Apellido │ activo │ rol │</p>
<p>├────────────┼────────┼──────────┼────────┼────────────────────┤</p>
<p>│ 7 │ Carlos │ Mejía │ TRUE │ Empleado │</p>
<p>│ 9 │ Laura │ Gómez │ TRUE │ Aprobador │</p>
<p>│ 6 │ Andrés │ Pineda │ TRUE │ Técnico de Soporte │</p>
<p><strong>Cuando</strong> el usuario &lt;usuario&gt;, en lugar de Sofía Herrera, solicita el reporte de tipo Asignados con Fecha_Inicio 2026-08-01</p>
<p><strong>Entonces</strong> el sistema responde «No tiene permiso para consultar reportes.»</p>
<p><strong>Y</strong> no se genera el reporte</p>
<p><strong>Ejemplos:</strong></p>
<p>│ usuario │ rol │</p>
<p>├─────────┼────────────────────┤</p>
<p>│ 7 │ Empleado │</p>
<p>│ 9 │ Aprobador │</p>
<p>│ 6 │ Técnico de Soporte │</p>
</blockquote></td>
</tr>
<tr class="even">
<td><strong>Origen de la necesidad</strong></td>
<td>Alcance 1.2 – Tabla 5, pendiente de validación.</td>
</tr>
<tr class="odd">
<td><strong>RF derivados</strong></td>
<td>RF-50, RF-155, RF-156, RF-157, RF-158, RF-159, RF-165</td>
</tr>
<tr class="even">
<td><strong>Prioridad</strong></td>
<td>Alta</td>
</tr>
</tbody>
</table>

*Nota: el Alcance 1.2 pide «generar reportes bajo demanda sobre activos asignados, disponibles, pendientes por devolver y en mal estado» sin nombrar al actor: Sofía Herrera (Gerente) actúa como Supuesto (RN-R14; P-88); Marta Rojas no se incluye como actor secundario porque el Alcance no lo respalda. Reportes es una vista: no almacena datos y usa Activo, Asignacion y Devolucion (RN-R01). El UML declara que consultar() devuelve «Reporte», que no es una clase del modelo: la HU se redacta como un listado de filas (C.8). Qué fecha filtra cada tipo, las columnas y el orden son propuestas (RN-R06 a RN-R11; P-101 a P-103); Fecha_Inicio es obligatoria para los cuatro tipos aunque Disponibles y Mal_Estado no tienen una fecha natural. Cada consulta se registra en Auditoria con Accion = Reportar (RN-R13, regla transversal que no se repite en los criterios). Sin cifras de la encuesta en el Origen.*

**C. Requisitos funcionales y trazabilidad (sección 2.2)**

**C.1 Trazabilidad HU → RF (RF-01 a RF-172)**

| **HU**    | **RF finales**                                        | **N.º de RF** | **Entidad**                | **Clase.método**                                                                             |
|-----------|-------------------------------------------------------|---------------|----------------------------|----------------------------------------------------------------------------------------------|
| **HU-01** | RF-01, RF-02, RF-52                                   | 3             | Activo                     | Activo.crear (+ existeNumeroSerie, existePlaca)                                              |
| **HU-02** | RF-03, RF-56                                          | 2             | Activo                     | Activo.buscarPorId, buscarPorNumeroSerie, buscarPorPlaca, listarInventario                   |
| **HU-03** | RF-04, RF-51, RF-53, RF-54, RF-55, RF-60              | 6             | Activo                     | Activo.actualizar (+ existeNumeroSerie, existePlaca)                                         |
| **HU-04** | RF-05, RF-57, RF-58, RF-59, RF-164                    | 5             | Activo                     | Activo.darDeBaja                                                                             |
| **HU-05** | RF-06, RF-07, RF-62, RF-63                            | 4             | Custodio                   | Custodio.crear (+ existeCustodioDeUsuario, existeDocumento)                                  |
| **HU-06** | RF-08                                                 | 1             | Custodio                   | Custodio.buscarPorId, buscarPorUsuario, buscarPorDocumento                                   |
| **HU-07** | RF-09, RF-61                                          | 2             | Custodio                   | Custodio.actualizar (+ existeDocumento)                                                      |
| **HU-08** | RF-10, RF-64, RF-65, RF-66, RF-67                     | 5             | Custodio                   | Custodio.inactivar                                                                           |
| **HU-09** | RF-11, RF-68, RF-69, RF-70, RF-71, RF-168             | 6             | Solicitud                  | Solicitud.crear                                                                              |
| **HU-10** | RF-12, RF-72, RF-73, RF-74, RF-75                     | 5             | Solicitud                  | Solicitud.buscarPorId, listarPorCustodio, listarPendientes, listarAprobadas (adenda CRF-003) |
| **HU-11** | RF-13, RF-14, RF-76, RF-77                            | 4             | Solicitud                  | Solicitud.actualizar                                                                         |
| **HU-12** | RF-15, RF-78, RF-79, RF-80                            | 4             | Solicitud                  | Solicitud.cancelar                                                                           |
| **HU-13** | RF-16, RF-81, RF-82, RF-83, RF-84, RF-86, RF-169      | 7             | Aprobacion                 | Aprobacion.decidir (+ existeDecisionDeSolicitud)                                             |
| **HU-14** | RF-17, RF-85                                          | 2             | Aprobacion                 | Aprobacion.buscarPorSolicitud                                                                |
| **HU-15** | RF-18, RF-87, RF-88, RF-89, RF-90, RF-91, RF-161      | 7             | Asignacion                 | Asignacion.asignar (+ existeAsignacionDeSolicitud, activoDisponible)                         |
| **HU-16** | RF-19, RF-92, RF-93, RF-94, RF-95, RF-96              | 6             | Asignacion                 | Asignacion.buscarPorId, listarVigentes, listarPorCustodio, buscarVigentePorActivo            |
| **HU-17** | RF-20, RF-97                                          | 2             | Asignacion                 | Asignacion.actualizar                                                                        |
| **HU-18** | RF-21, RF-98, RF-99, RF-100, RF-101                   | 5             | Asignacion                 | Asignacion.cerrar                                                                            |
| **HU-19** | RF-22, RF-102, RF-103, RF-104, RF-105                 | 5             | Acta_De_Entrega            | Acta_De_Entrega.firmar (+ existeActaDeAsignacion)                                            |
| **HU-20** | RF-23, RF-106                                         | 2             | Acta_De_Entrega            | Acta_De_Entrega.buscarPorAsignacion                                                          |
| **HU-21** | RF-24, RF-107, RF-108, RF-109, RF-110, RF-162         | 6             | Devolucion                 | Devolucion.registrar (+ existeDevolucionDeAsignacion)                                        |
| **HU-22** | RF-25, RF-111, RF-112                                 | 3             | Devolucion                 | Devolucion.buscarPorId, listarPendientesDeRecepcion                                          |
| **HU-23** | RF-26, RF-113, RF-114                                 | 3             | Devolucion                 | Devolucion.actualizar                                                                        |
| **HU-24** | RF-27, RF-115, RF-116, RF-117, RF-118, RF-163, RF-170 | 7             | Devolucion                 | Devolucion.confirmarRecepcion (invoca Asignacion.cerrar)                                     |
| **HU-25** | RF-28, RF-119, RF-120, RF-121, RF-167                 | 5             | Notificacion_De_Devolucion | Notificacion_De_Devolucion.generarAviso (+ calcularDiasRestantes)                            |
| **HU-26** | RF-29, RF-122, RF-123, RF-124, RF-125, RF-171         | 6             | Reporte_de_Danios          | Reporte_de_Danios.crear                                                                      |
| **HU-27** | RF-30, RF-126, RF-127                                 | 3             | Reporte_de_Danios          | Reporte_de_Danios.buscarPorId, listarReportes                                                |
| **HU-28** | RF-31, RF-128, RF-129, RF-130                         | 4             | Reporte_de_Danios          | Reporte_de_Danios.actualizar                                                                 |
| **HU-29** | RF-32, RF-131, RF-132, RF-133, RF-134, RF-172         | 6             | Historial_Mantenimientos   | Historial_Mantenimientos.crear                                                               |
| **HU-30** | RF-33, RF-135                                         | 2             | Historial_Mantenimientos   | Historial_Mantenimientos.buscarPorId, listarPorActivo                                        |
| **HU-31** | RF-34, RF-136                                         | 2             | Historial_Mantenimientos   | Historial_Mantenimientos.actualizar                                                          |
| **HU-32** | RF-35, RF-36                                          | 2             | Usuario                    | Usuario.crear (+ existeEmail)                                                                |
| **HU-33** | RF-37                                                 | 1             | Usuario                    | Usuario.buscarPorId, buscarPorEmail                                                          |
| **HU-34** | RF-38, RF-137, RF-138                                 | 3             | Usuario                    | Usuario.actualizar (+ existeEmail)                                                           |
| **HU-35** | RF-39, RF-139, RF-140, RF-141, RF-142, RF-143         | 6             | Usuario                    | Usuario.inactivar                                                                            |
| **HU-36** | RF-40, RF-144                                         | 2             | Usuario                    | Usuario.iniciarSesion                                                                        |
| **HU-37** | RF-41, RF-145                                         | 2             | Usuario                    | Usuario.cambiarContrasena                                                                    |
| **HU-38** | RF-42, RF-166                                         | 2             | Rol_Permiso                | Rol_Permiso.asignar (+ existeAsignacion)                                                     |
| **HU-39** | RF-43, RF-146                                         | 2             | Rol_Permiso                | Rol_Permiso.retirar                                                                          |
| **HU-40** | RF-44                                                 | 1             | Rol_Permiso                | Rol_Permiso.consultarPermisos                                                                |
| **HU-41** | RF-45, RF-147                                         | 2             | Categoria                  | Categoria.crear (+ existeNombreCategoria)                                                    |
| **HU-42** | RF-46, RF-148                                         | 2             | Categoria                  | Categoria.buscarPorId, listarActivas                                                         |
| **HU-43** | RF-47, RF-149, RF-150                                 | 3             | Categoria                  | Categoria.actualizar (+ existeNombreCategoria)                                               |
| **HU-44** | RF-48, RF-151, RF-152, RF-153, RF-154                 | 5             | Categoria                  | Categoria.inactivar                                                                          |
| **HU-45** | RF-49, RF-160                                         | 2             | Auditoria                  | Auditoria.buscarPorId (registrar() es INTERNO, sin HU)                                       |
| **HU-46** | RF-50, RF-155, RF-156, RF-157, RF-158, RF-159, RF-165 | 7             | Reportes                   | Reportes.consultar                                                                           |

*Generada desde la columna «HU de origen» del Word de RF (sección 2.2.6): 46 HU y 172 RF, cada RF en una sola HU. RF-74 (HU-10) cubre Solicitud.listarAprobadas() del CRF-003: lista las solicitudes Aprobadas sin asignación, de la más antigua a la más reciente.*

**D. Reglas de negocio con su fuente y su estado (sección 3.9)**

257 RN: 254 de entidad (prefijos A, C, AP, S, AC, AS, D, N, H, RD, U, CA, RP, AU y R) y 3 transversales (RN-T01 a RN-T03). Filas resaltadas: redacción nueva por el CRF-003 (RN-A16, RN-A19, RN-S21) y reglas transversales. RN-T01 es la ex RN-T6A-01; RN-T02 es la ex RN-AU10; RN-T03 es la regla de sesión del cambio 7.

<table>
<colgroup>
<col style="width: 7%" />
<col style="width: 40%" />
<col style="width: 21%" />
<col style="width: 14%" />
<col style="width: 16%" />
</colgroup>
<thead>
<tr class="header">
<th><strong>Código</strong></th>
<th><strong>Regla</strong></th>
<th><strong>Fuente</strong></th>
<th><strong>Estado</strong></th>
<th><strong>Verificada en</strong></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><strong>RN-A01</strong></td>
<td>ID_Activo identifica de forma única al activo; lo genera el sistema y no se modifica (PK sin setter).</td>
<td>Diccionario v6 (PK) y UML v6 (PK sin setter). Generación automática: propuesta</td>
<td>Diccionario v6 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-01 CA-1, HU-03 CA-1, HU-03 CA-7</td>
</tr>
<tr class="even">
<td><strong>RN-A02</strong></td>
<td>Marca, Modelo, Numero_Serie, Placa_Inventario e ID_Categoria son obligatorios; Ubicacion es opcional.</td>
<td>Diccionario v6 (Obligatorio Sí / No)</td>
<td>Diccionario v6</td>
<td>HU-01 CA-1, HU-01 CA-2, HU-01 CA-4, HU-03 CA-1, HU-03 CA-2, HU-03 CA-4</td>
</tr>
<tr class="odd">
<td><strong>RN-A03</strong></td>
<td>Numero_Serie es único entre todos los activos, también los que están en Baja.</td>
<td>Diccionario v6 (Unique)</td>
<td>Diccionario v6</td>
<td>HU-01 CA-3, HU-02 CA-2, HU-03 CA-3</td>
</tr>
<tr class="even">
<td><strong>RN-A04</strong></td>
<td>Placa_Inventario es única entre todos los activos, también los que están en Baja.</td>
<td>Diccionario v6 (Unique)</td>
<td>Diccionario v6</td>
<td>HU-01 CA-3, HU-02 CA-3, HU-03 CA-3</td>
</tr>
<tr class="odd">
<td><strong>RN-A05</strong></td>
<td>Longitudes máximas: Marca 50, Modelo 50, Numero_Serie 20, Placa_Inventario 11, Ubicacion 100 caracteres.</td>
<td>Diccionario v6 (Longitud)</td>
<td>Diccionario v6</td>
<td>HU-01 CA-5, HU-03 CA-4</td>
</tr>
<tr class="even">
<td><strong>RN-A06</strong></td>
<td>Al registrar, el sistema asigna el Estado Disponible; la persona no lo elige.</td>
<td>Diccionario v6 («Valor inicial: Disponible, asignado por el sistema al crear»)</td>
<td>Diccionario v6</td>
<td>HU-01 CA-1</td>
</tr>
<tr class="odd">
<td><strong>RN-A07</strong></td>
<td>Estado solo toma los valores Disponible, Asignado, Dañado y Baja.</td>
<td>Diccionario v6 (ENUM, Valores Fijos)</td>
<td>Diccionario v6</td>
<td>HU-03 CA-1, HU-03 CA-5</td>
</tr>
<tr class="even">
<td><strong>RN-A08</strong></td>
<td>ID_Categoria debe corresponder a una categoría existente.</td>
<td>Diccionario v6 (FK hacia Categoria)</td>
<td>Diccionario v6</td>
<td>HU-01 CA-6, HU-03 CA-4</td>
</tr>
<tr class="odd">
<td><strong>RN-A09</strong></td>
<td>La categoría asignada debe estar activa (activo = TRUE).</td>
<td>Propuesta: coherente con Categoria.inactivar() y listarActivas() (Fase A v6)</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-01 CA-6, HU-03 CA-4</td>
</tr>
<tr class="even">
<td><strong>RN-A10</strong></td>
<td>La baja cambia el Estado a Baja; el registro nunca se elimina (jamás DELETE).</td>
<td>Fase A v6 (darDeBaja: D por estado) y diccionario v6 (valor Baja)</td>
<td>Fase A v6 + diccionario v6</td>
<td>HU-03 CA-5, HU-04 CA-1, HU-04 CA-6</td>
</tr>
<tr class="odd">
<td><strong>RN-A11</strong></td>
<td>Un activo que ya está en Baja no se vuelve a dar de baja.</td>
<td>Propuesta</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-04 CA-3</td>
</tr>
<tr class="even">
<td><strong>RN-A12</strong></td>
<td>Antes de la baja el sistema explica la consecuencia y permite desistir; solo se da de baja al confirmar.</td>
<td>Propuesta</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-04 CA-1, HU-04 CA-2</td>
</tr>
<tr class="odd">
<td><strong>RN-A13</strong></td>
<td>Al actualizar, la unicidad de Numero_Serie y Placa_Inventario se verifica contra los demás activos, no contra el propio.</td>
<td>Diccionario v6 (Unique); excluir el propio registro: propuesta</td>
<td>Diccionario v6 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-03 CA-2, HU-03 CA-3</td>
</tr>
<tr class="even">
<td><strong>RN-A14</strong></td>
<td>El inventario se lista ordenado por Placa_Inventario, de menor a mayor, e incluye los activos en cualquier estado; muestra 6 columnas (Placa_Inventario, ID_Activo, Marca, Modelo, Numero_Serie y Estado).</td>
<td>Fase A v6 (listarInventario [Nuevo]). Orden y columnas: propuesta</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-02 CA-5, HU-02 CA-6</td>
</tr>
<tr class="odd">
<td><strong>RN-A15</strong></td>
<td>La búsqueda por ID_Activo, Numero_Serie o Placa_Inventario devuelve un solo activo, con sus 8 campos, o informa que no existe.</td>
<td>Diccionario v6 (PK, Unique) y Fase A v6 (métodos de búsqueda)</td>
<td>Diccionario v6 + Fase A v6; mensajes: propuesta</td>
<td>HU-02 CA-1, HU-02 CA-2, HU-02 CA-3, HU-02 CA-4, HU-03 CA-7, HU-04 CA-5</td>
</tr>
<tr class="even">
<td><strong>RN-A16</strong></td>
<td>actualizar() solo permite pasar entre Disponible y Dañado, y solo si el activo no tiene una Asignacion con Estado_Asignacion = Vigente (buscarVigentePorActivo). Baja y Asignado no se fijan con actualizar() (los fijan darDeBaja() y asignar()). Excepción: Reporte_de_Danios.crear() deja el activo en Dañado aunque esté Asignado, y los cambios manuales de actualizar() se conservan. Un activo Dañado vuelve a Disponible con actualizar() solo sin asignación Vigente.</td>
<td>Propuesta del equipo, pendiente de validar con el cliente; redacción nueva: CRF-003, cambios 3 y 4 (propuesta). M-22, M-23 y M-26 no cambian</td>
<td>RN propuesta, pendiente de validar con el cliente (redacción de la adenda CRF-003)</td>
<td>HU-03 CA-1, HU-03 CA-5</td>
</tr>
<tr class="odd">
<td><strong>RN-A17</strong></td>
<td>Transversal (RN/RNF): cada alta, actualización y baja de un activo queda registrada en Auditoria (acciones Crear, Actualizar e Inactivar). No se repite en los criterios de aceptación.</td>
<td>Alcance 1.2 («mantener un registro completo de auditoría de todas las acciones relevantes») y Fase A v6 (0.8). Cuáles son «relevantes»: propuesta</td>
<td>Alcance 1.2 + RN propuesta, pendiente de validar con el cliente</td>
<td>Todas (transversal)</td>
</tr>
<tr class="even">
<td><strong>RN-A18</strong></td>
<td>Un activo en Baja no se puede editar (estado terminal).</td>
<td>Propuesta del equipo, pendiente de validar con el cliente</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-03 CA-6</td>
</tr>
<tr class="odd">
<td><strong>RN-A19</strong></td>
<td>Un activo con una asignación Vigente (buscarVigentePorActivo) no se puede dar de baja hasta cerrar su asignación, esté Asignado o Dañado.</td>
<td>Propuesta del equipo, pendiente de validar con el cliente; redacción nueva: CRF-003, cambio 3 (regla derivada; propuesta). M-31 no cambia</td>
<td>RN propuesta, pendiente de validar con el cliente (redacción de la adenda CRF-003)</td>
<td>HU-04 CA-4</td>
</tr>
<tr class="even">
<td><strong>RN-C01</strong></td>
<td>ID_Custodio identifica de forma única al custodio; lo genera el sistema y no se modifica (PK sin setter).</td>
<td>Diccionario v6 (PK) y UML v6 (PK sin setter). Generación automática: propuesta</td>
<td>Diccionario v6 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-05 CA-1</td>
</tr>
<tr class="odd">
<td><strong>RN-C02</strong></td>
<td>ID_Usuario, tipo_documento, N_documento y Direccion son obligatorios.</td>
<td>Diccionario v6 (Obligatorio Sí)</td>
<td>Diccionario v6</td>
<td>HU-05 CA-1, HU-05 CA-2, HU-07 CA-1, HU-07 CA-4</td>
</tr>
<tr class="even">
<td><strong>RN-C03</strong></td>
<td>Longitudes máximas: N_documento 20 y Direccion 200 caracteres.</td>
<td>Diccionario v6 (Longitud)</td>
<td>Diccionario v6</td>
<td>HU-05 CA-3, HU-07 CA-4</td>
</tr>
<tr class="odd">
<td><strong>RN-C04</strong></td>
<td>tipo_documento solo toma los códigos CC, CE y PA (etiquetas Cédula, Cédula de extranjería y Pasaporte).</td>
<td>Diccionario v6 (ENUM) y CRF-002 (cambios 0.2 y 0.11). CE: propuesta</td>
<td>Diccionario v6 + CRF-002; CE: RN propuesta, pendiente de validar con el cliente</td>
<td>HU-05 CA-4, HU-07 CA-1, HU-07 CA-4</td>
</tr>
<tr class="even">
<td><strong>RN-C05</strong></td>
<td>tipo_documento + N_documento son únicos como pareja; el mismo número con otro tipo es válido.</td>
<td>CRF-002 (cambio 0.10); respaldo débil en N-02</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-05 CA-5, HU-06 CA-3, HU-06 CA-4, HU-07 CA-2, HU-07 CA-3</td>
</tr>
<tr class="odd">
<td><strong>RN-C06</strong></td>
<td>Un usuario puede ser custodio una sola vez (ID_Usuario único).</td>
<td>Diccionario v6 (FK hacia Usuario, Unique)</td>
<td>Diccionario v6</td>
<td>HU-05 CA-5, HU-06 CA-2</td>
</tr>
<tr class="even">
<td><strong>RN-C07</strong></td>
<td>ID_Usuario debe corresponder a un usuario existente.</td>
<td>Diccionario v6 (FK hacia Usuario)</td>
<td>Diccionario v6</td>
<td>HU-05 CA-6</td>
</tr>
<tr class="odd">
<td><strong>RN-C08</strong></td>
<td>El usuario del custodio debe estar activo y tener el rol Empleado.</td>
<td>Propuesta</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-05 CA-6</td>
</tr>
<tr class="even">
<td><strong>RN-C09</strong></td>
<td>Al registrar, el sistema asigna Fecha_Registro (fecha actual) y activo = TRUE.</td>
<td>Diccionario v6 (valores asignados por el sistema)</td>
<td>Diccionario v6</td>
<td>HU-05 CA-1</td>
</tr>
<tr class="odd">
<td><strong>RN-C10</strong></td>
<td>Al actualizar, el documento del propio custodio no cuenta como duplicado.</td>
<td>Propuesta (misma lógica que RN-A13)</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-07 CA-2, HU-07 CA-3</td>
</tr>
<tr class="even">
<td><strong>RN-C11</strong></td>
<td>ID_Usuario y Fecha_Registro no se modifican al actualizar.</td>
<td>Propuesta</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-07 CA-1, HU-07 CA-5</td>
</tr>
<tr class="odd">
<td><strong>RN-C12</strong></td>
<td>Inactivar pone activo = FALSE; el registro nunca se elimina (jamás DELETE) y no existe reactivar. activo solo cambia con la baja.</td>
<td>Diccionario v6 (activo: baja lógica) y Fase A v6 (inactivar; sin método de reactivación). Que actualizar no cambie activo: propuesta</td>
<td>Diccionario v6 + Fase A v6 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-07 CA-5, HU-08 CA-1, HU-08 CA-6</td>
</tr>
<tr class="even">
<td><strong>RN-C13</strong></td>
<td>Un custodio que ya está inactivo no se vuelve a inactivar.</td>
<td>Propuesta (patrón RN-A11)</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-08 CA-3</td>
</tr>
<tr class="odd">
<td><strong>RN-C14</strong></td>
<td>No se puede inactivar un custodio con asignaciones Vigentes ni solicitudes Pendientes (opción A; ver P-13).</td>
<td>Propuesta (coherente con RN-A19)</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-08 CA-5</td>
</tr>
<tr class="even">
<td><strong>RN-C15</strong></td>
<td>Las consultas devuelven el custodio con sus 7 campos, esté activo o inactivo; buscarPorDocumento exige tipo y número; si no existe, se informa.</td>
<td>Fase A v6 (métodos de búsqueda). Incluir inactivos y mensajes: propuesta</td>
<td>Fase A v6 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-06 CA-1, HU-06 CA-2, HU-06 CA-3, HU-06 CA-4, HU-06 CA-5, HU-07 CA-6, HU-08 CA-4</td>
</tr>
<tr class="odd">
<td><strong>RN-C16</strong></td>
<td>Antes de inactivar, el sistema explica la consecuencia (incluido que no se puede reactivar) y permite desistir.</td>
<td>Propuesta (patrón RN-A12)</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-08 CA-1, HU-08 CA-2</td>
</tr>
<tr class="even">
<td><strong>RN-C17</strong></td>
<td>El Responsable de Activos registra al custodio; actualizar, inactivar y consultar los hace el mismo actor.</td>
<td>Diccionario v6 (registro: «lo registra el Responsable de Activos»). El Alcance 1.2 y la Tabla 5 (1.7.3) no definen quién gestiona custodios; consultar, actualizar e inactivar: Supuesto</td>
<td>Diccionario v6 + Supuesto, pendiente de validar con el cliente</td>
<td>Antecedentes de las 4 HU (actor)</td>
</tr>
<tr class="odd">
<td><strong>RN-S01</strong></td>
<td>ID_Solicitud identifica de forma única la solicitud; lo genera el sistema y no se modifica (PK sin setter).</td>
<td>Diccionario v6 (PK) y UML v6 (PK sin setter). Generación automática: propuesta</td>
<td>Diccionario v6 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-09 CA-1, HU-11 CA-4</td>
</tr>
<tr class="even">
<td><strong>RN-S02</strong></td>
<td>ID_Categoria, Motivo e ID_Custodio son obligatorios.</td>
<td>Diccionario v6 (Obligatorio Sí)</td>
<td>Diccionario v6</td>
<td>HU-09 CA-1, HU-09 CA-2, HU-11 CA-1, HU-11 CA-2</td>
</tr>
<tr class="odd">
<td><strong>RN-S03</strong></td>
<td>Longitud máxima: Motivo 255 caracteres.</td>
<td>Diccionario v6 (Longitud)</td>
<td>Diccionario v6</td>
<td>HU-09 CA-3, HU-11 CA-2</td>
</tr>
<tr class="even">
<td><strong>RN-S04</strong></td>
<td>Al registrar, el sistema asigna Fecha_Solicitud (fecha y hora actuales) y Estado_Solicitud = Pendiente.</td>
<td>Diccionario v6 (valores asignados por el sistema)</td>
<td>Diccionario v6</td>
<td>HU-09 CA-1</td>
</tr>
<tr class="odd">
<td><strong>RN-S05</strong></td>
<td>Estado_Solicitud solo toma los valores Pendiente, Aprobada, Rechazada y Cancelada.</td>
<td>Diccionario v6 (ENUM)</td>
<td>Diccionario v6</td>
<td>HU-11 CA-3, HU-12 CA-3</td>
</tr>
<tr class="even">
<td><strong>RN-S06</strong></td>
<td>ID_Categoria debe corresponder a una categoría existente.</td>
<td>Diccionario v6 (FK hacia Categoria)</td>
<td>Diccionario v6</td>
<td>HU-09 CA-4, HU-11 CA-2</td>
</tr>
<tr class="odd">
<td><strong>RN-S07</strong></td>
<td>La categoría solicitada debe estar activa.</td>
<td>Propuesta (coherente con RN-A09)</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-09 CA-4, HU-11 CA-2</td>
</tr>
<tr class="even">
<td><strong>RN-S08</strong></td>
<td>ID_Custodio debe corresponder a un custodio existente.</td>
<td>Diccionario v6 (FK hacia Custodio)</td>
<td>Diccionario v6</td>
<td>HU-09 CA-5</td>
</tr>
<tr class="odd">
<td><strong>RN-S09</strong></td>
<td>El custodio que solicita debe estar activo.</td>
<td>Propuesta</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-09 CA-5</td>
</tr>
<tr class="even">
<td><strong>RN-S10</strong></td>
<td>La solicitud la registra el Empleado con sesión iniciada, a nombre de su propio custodio (ID_Custodio es el custodio de su usuario); el Empleado debe tener un custodio registrado antes de solicitar.</td>
<td>Alcance 1.2 («solicitudes de equipos realizadas por los empleados»). Que sea a nombre de su propio custodio y la precondición: propuesta (P-09, P-105)</td>
<td>Alcance 1.2 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-09 CA-1, HU-09 CA-5</td>
</tr>
<tr class="odd">
<td><strong>RN-S11</strong></td>
<td>Una solicitud solo se actualiza mientras está Pendiente.</td>
<td>Fase A v6 (actualizar: RN propuesta)</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-11 CA-1, HU-11 CA-3</td>
</tr>
<tr class="even">
<td><strong>RN-S12</strong></td>
<td>actualizar() solo modifica ID_Categoria y Motivo; ID_Solicitud, ID_Custodio, Fecha_Solicitud y Estado_Solicitud no se modifican (el estado cambia con la decisión o la cancelación).</td>
<td>Fase A v6 (actualizar modifica la categoría o el motivo) y diccionario v6 (Estado_Solicitud)</td>
<td>Fase A v6 + diccionario v6</td>
<td>HU-11 CA-1, HU-11 CA-4</td>
</tr>
<tr class="odd">
<td><strong>RN-S13</strong></td>
<td>Cancelar pone Estado_Solicitud en Cancelada; el registro nunca se elimina (jamás DELETE) y no existe reactivar.</td>
<td>Fase A v6 (cancelar: D por estado) y diccionario v6 (valor Cancelada). Que no exista reactivar: Fase A v6 (sin método)</td>
<td>Fase A v6 + diccionario v6</td>
<td>HU-12 CA-1, HU-12 CA-5</td>
</tr>
<tr class="even">
<td><strong>RN-S14</strong></td>
<td>Solo se cancela una solicitud Pendiente; una solicitud ya Cancelada no se cancela de nuevo.</td>
<td>Propuesta</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-12 CA-3</td>
</tr>
<tr class="odd">
<td><strong>RN-S15</strong></td>
<td>Antes de cancelar, el sistema explica la consecuencia (incluido que no se puede reactivar) y permite desistir.</td>
<td>Propuesta (patrón RN-A12)</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-12 CA-1, HU-12 CA-2</td>
</tr>
<tr class="even">
<td><strong>RN-S16</strong></td>
<td>La búsqueda por ID_Solicitud devuelve una sola solicitud con sus 6 campos o informa que no existe.</td>
<td>Diccionario v6 (PK) y Fase A v6 (buscarPorId). Mensajes: propuesta</td>
<td>Diccionario v6 + Fase A v6; mensajes: propuesta</td>
<td>HU-10 CA-1, HU-10 CA-4</td>
</tr>
<tr class="odd">
<td><strong>RN-S17</strong></td>
<td>listarPorCustodio trae las solicitudes del custodio con su estado (incluidas las Canceladas), de la más reciente a la más antigua; si no tiene, se informa.</td>
<td>Fase A v6 (listarPorCustodio [Nuevo]: «con su estado»). Orden y mensaje: propuesta</td>
<td>Fase A v6 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-10 CA-2, HU-10 CA-4</td>
</tr>
<tr class="even">
<td><strong>RN-S18</strong></td>
<td>listarPendientes trae solo las solicitudes Pendiente, de la más antigua a la más reciente; si no hay, se informa.</td>
<td>Fase A v6 (listarPendientes [Nuevo]; orden: RN propuesta)</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-10 CA-3, HU-10 CA-4</td>
</tr>
<tr class="odd">
<td><strong>RN-S19</strong></td>
<td>El Empleado solo consulta, actualiza y cancela sus propias solicitudes.</td>
<td>Alcance 1.2 (el Empleado consulta «el estado de sus solicitudes»). Actualizar y cancelar solo las propias: propuesta</td>
<td>Alcance 1.2 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-10 CA-5, HU-11 CA-5, HU-12 CA-4</td>
</tr>
<tr class="even">
<td><strong>RN-S20</strong></td>
<td>El Aprobador consulta las solicitudes pendientes (actor secundario de HU-10).</td>
<td>Propuesta: el Alcance 1.2 le asigna aprobar o rechazar, no define su listado</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-10 CA-3</td>
</tr>
<tr class="odd">
<td><strong>RN-AP01</strong></td>
<td>ID_Aprobacion identifica de forma única la decisión; lo genera el sistema y no se modifica (PK sin setter).</td>
<td>Diccionario v6 (PK) y UML v6 (PK sin setter). Generación automática: propuesta</td>
<td>Diccionario v6 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-13 CA-1, HU-13 CA-2</td>
</tr>
<tr class="even">
<td><strong>RN-AP02</strong></td>
<td>ID_Solicitud, ID_Aprobador y Decision son obligatorios; Motivo_Rechazo solo es obligatorio si Decision = Rechazada.</td>
<td>Diccionario v6 (Obligatorio; observación de Motivo_Rechazo)</td>
<td>Diccionario v6</td>
<td>HU-13 CA-1, HU-13 CA-2, HU-13 CA-3</td>
</tr>
<tr class="odd">
<td><strong>RN-AP03</strong></td>
<td>Decision solo toma los valores Aprobada y Rechazada.</td>
<td>Diccionario v6 (ENUM)</td>
<td>Diccionario v6</td>
<td>HU-13 CA-3</td>
</tr>
<tr class="even">
<td><strong>RN-AP04</strong></td>
<td>Longitud máxima: Motivo_Rechazo 300 caracteres.</td>
<td>Diccionario v6 (Longitud)</td>
<td>Diccionario v6</td>
<td>HU-13 CA-4</td>
</tr>
<tr class="odd">
<td><strong>RN-AP05</strong></td>
<td>Al registrar, el sistema asigna Fecha_Decision (fecha y hora actuales).</td>
<td>Diccionario v6 (valor asignado por el sistema)</td>
<td>Diccionario v6</td>
<td>HU-13 CA-1, HU-13 CA-2</td>
</tr>
<tr class="even">
<td><strong>RN-AP06</strong></td>
<td>Cada solicitud tiene una sola decisión (ID_Solicitud único) y la decisión es irrevocable.</td>
<td>Diccionario v6 (Unique) y su registro de correcciones («La decisión es irrevocable»)</td>
<td>Diccionario v6</td>
<td>HU-13 CA-5</td>
</tr>
<tr class="odd">
<td><strong>RN-AP07</strong></td>
<td>Al registrar la decisión, la Solicitud pasa a Aprobada o Rechazada según la decisión.</td>
<td>Diccionario v6 (Fecha_Decision y Estado_Solicitud)</td>
<td>Diccionario v6</td>
<td>HU-13 CA-1, HU-13 CA-2</td>
</tr>
<tr class="even">
<td><strong>RN-AP08</strong></td>
<td>ID_Solicitud debe corresponder a una solicitud existente.</td>
<td>Diccionario v6 (FK hacia Solicitud)</td>
<td>Diccionario v6</td>
<td>HU-13 CA-6</td>
</tr>
<tr class="odd">
<td><strong>RN-AP09</strong></td>
<td>Solo se decide sobre una solicitud Pendiente.</td>
<td>Propuesta</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-13 CA-6</td>
</tr>
<tr class="even">
<td><strong>RN-AP10</strong></td>
<td>ID_Aprobador debe corresponder a un usuario existente.</td>
<td>Diccionario v6 (FK hacia Usuario)</td>
<td>Diccionario v6</td>
<td>HU-13 CA-7</td>
</tr>
<tr class="odd">
<td><strong>RN-AP11</strong></td>
<td>El aprobador debe estar activo y tener el rol Aprobador.</td>
<td>Propuesta</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-13 CA-7</td>
</tr>
<tr class="even">
<td><strong>RN-AP12</strong></td>
<td>La decisión la registra el Aprobador con sesión iniciada: ID_Aprobador es el usuario en sesión.</td>
<td>Alcance 1.2 («aprobar o rechazar dichas solicitudes»). Que ID_Aprobador sea el usuario en sesión: propuesta (P-105)</td>
<td>Alcance 1.2 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-13 CA-7</td>
</tr>
<tr class="odd">
<td><strong>RN-AP13</strong></td>
<td>buscarPorSolicitud devuelve la decisión única de la solicitud con sus 6 campos; si no hay decisión o la solicitud no existe, se informa.</td>
<td>Diccionario v6 (Unique) y Fase A v6 (buscarPorSolicitud). Mensajes: propuesta</td>
<td>Diccionario v6 + Fase A v6; mensajes: propuesta</td>
<td>HU-14 CA-1, HU-14 CA-2, HU-14 CA-3, HU-14 CA-4</td>
</tr>
<tr class="even">
<td><strong>RN-AP14</strong></td>
<td>El Empleado solo consulta la decisión de sus propias solicitudes.</td>
<td>Alcance 1.2 («el estado de sus solicitudes»); extensión a la decisión: propuesta</td>
<td>Alcance 1.2 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-14 CA-5</td>
</tr>
<tr class="odd">
<td><strong>RN-AS01</strong></td>
<td>ID_Asignacion identifica de forma única la asignación; lo genera el sistema y no se modifica (PK sin setter).</td>
<td>Diccionario v6 (PK) y UML v6 (PK sin setter). Generación automática: propuesta</td>
<td>Diccionario v6 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-15 CA-1, HU-17 CA-3</td>
</tr>
<tr class="even">
<td><strong>RN-AS02</strong></td>
<td>ID_Solicitud, ID_Activo y Fecha_Devolucion_Esperada son obligatorios al asignar; Fecha_Entrega, Estado_Asignacion e ID_Custodio los asigna el sistema.</td>
<td>Diccionario v6 (Obligatorio y valores asignados por el sistema)</td>
<td>Diccionario v6</td>
<td>HU-15 CA-1, HU-15 CA-2, HU-17 CA-2</td>
</tr>
<tr class="odd">
<td><strong>RN-AS03</strong></td>
<td>ID_Solicitud debe corresponder a una solicitud existente.</td>
<td>Diccionario v6 (FK hacia Solicitud)</td>
<td>Diccionario v6</td>
<td>HU-15 CA-3</td>
</tr>
<tr class="even">
<td><strong>RN-AS04</strong></td>
<td>Solo se asigna una solicitud Aprobada.</td>
<td>Diccionario v6 (ID_Solicitud: «solicitud aprobada») y Alcance 1.2 («asignar los activos aprobados»)</td>
<td>Diccionario v6 + Alcance 1.2</td>
<td>HU-15 CA-3</td>
</tr>
<tr class="odd">
<td><strong>RN-AS05</strong></td>
<td>Una solicitud tiene una sola asignación (ID_Solicitud único); existeAsignacionDeSolicitud() (INTERNO) protege la regla dentro de asignar().</td>
<td>Diccionario v6 (Unique) y Fase A v6 (INTERNO)</td>
<td>Diccionario v6 + Fase A v6</td>
<td>HU-15 CA-4</td>
</tr>
<tr class="even">
<td><strong>RN-AS06</strong></td>
<td>ID_Activo debe corresponder a un activo existente.</td>
<td>Diccionario v6 (FK hacia Activo)</td>
<td>Diccionario v6</td>
<td>HU-15 CA-5</td>
</tr>
<tr class="odd">
<td><strong>RN-AS07</strong></td>
<td>Solo un activo Disponible puede entregarse; activoDisponible() (INTERNO) lo verifica dentro de asignar().</td>
<td>Fase A v6 (activoDisponible: RN propuesta) y regla implícita de 1.7.3 («Solo un equipo disponible puede entregarse»)</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-15 CA-5</td>
</tr>
<tr class="even">
<td><strong>RN-AS08</strong></td>
<td>La categoría del activo debe ser la de la solicitud.</td>
<td>Propuesta</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-15 CA-6</td>
</tr>
<tr class="odd">
<td><strong>RN-AS09</strong></td>
<td>Fecha_Devolucion_Esperada no puede ser anterior a Fecha_Entrega.</td>
<td>Propuesta: el diccionario solo la define como DATE obligatoria</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-15 CA-7, HU-17 CA-2</td>
</tr>
<tr class="even">
<td><strong>RN-AS10</strong></td>
<td>Al asignar, el sistema asigna Fecha_Entrega (fecha actual) y Estado_Asignacion = Vigente, y copia ID_Custodio de la Solicitud; el custodio no se digita.</td>
<td>Diccionario v6 (valores asignados por el sistema; ID_Custodio «se copia de la Solicitud asociada»)</td>
<td>Diccionario v6</td>
<td>HU-15 CA-1</td>
</tr>
<tr class="odd">
<td><strong>RN-AS11</strong></td>
<td>Al asignar, el Activo pasa a Estado Asignado (poscondición de asignar()).</td>
<td>CRF-003, cambio 1</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-15 CA-1</td>
</tr>
<tr class="even">
<td><strong>RN-AS12</strong></td>
<td>Estado_Asignacion solo toma los valores Vigente y Cerrada.</td>
<td>Diccionario v6 (ENUM)</td>
<td>Diccionario v6</td>
<td>HU-17 CA-3</td>
</tr>
<tr class="odd">
<td><strong>RN-AS13</strong></td>
<td>actualizar() solo modifica Fecha_Devolucion_Esperada y solo mientras la asignación está Vigente; ID_Asignacion, Fecha_Entrega, Estado_Asignacion, ID_Custodio, ID_Activo e ID_Solicitud no se modifican, y una asignación Cerrada no se actualiza.</td>
<td>Fase A v6 (actualizar: «modifica la fecha de devolución esperada o cambia el custodio»). Solo la fecha y solo si está Vigente: propuesta (ver P-31)</td>
<td>Fase A v6 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-17 CA-1, HU-17 CA-3, HU-17 CA-4</td>
</tr>
<tr class="even">
<td><strong>RN-AS14</strong></td>
<td>cerrar() solo procede si la asignación tiene una Devolucion en estado Confirmada.</td>
<td>CRF-003, cambio 5</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-18 CA-1, HU-18 CA-4</td>
</tr>
<tr class="odd">
<td><strong>RN-AS15</strong></td>
<td>Cerrar pone Estado_Asignacion en Cerrada y el Activo en Disponible, salvo que esté Dañado (conserva Dañado); el registro nunca se elimina (jamás DELETE) y no existe reactivar.</td>
<td>Diccionario v6 («cerrar() la pone Cerrada») y Fase A v6 (cerrar: D por estado; sin reactivar). Efecto sobre el Activo: CRF-003, cambios 2 y 5</td>
<td>Diccionario v6 + Fase A v6 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-18 CA-1, HU-18 CA-2, HU-18 CA-7</td>
</tr>
<tr class="even">
<td><strong>RN-AS16</strong></td>
<td>Antes de cerrar, el sistema explica la consecuencia y permite desistir.</td>
<td>Propuesta (patrón RN-A12 y RN-S15)</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-18 CA-1, HU-18 CA-3</td>
</tr>
<tr class="odd">
<td><strong>RN-AS17</strong></td>
<td>Una asignación ya Cerrada no se cierra de nuevo.</td>
<td>Propuesta (patrón RN-A11 y RN-S14)</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-18 CA-5</td>
</tr>
<tr class="even">
<td><strong>RN-AS18</strong></td>
<td>Un activo con una asignación Vigente no se da de baja ni cambia de estado manualmente, aunque esté Dañado.</td>
<td>CRF-003, cambio 3 (regla derivada); redacción de RN-A16 y RN-A19 en la adenda</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-16 CA-4, HU-03 y HU-04 (adenda RN-A16 y RN-A19, CRF-003)</td>
</tr>
<tr class="odd">
<td><strong>RN-AS19</strong></td>
<td>buscarPorId devuelve una sola asignación con sus 7 campos o informa que no existe; cualquier operación sobre una asignación inexistente lo informa.</td>
<td>Diccionario v6 (PK) y Fase A v6 (buscarPorId). Mensajes: propuesta</td>
<td>Diccionario v6 + Fase A v6; mensajes: propuesta</td>
<td>HU-16 CA-1, HU-16 CA-5, HU-17 CA-5, HU-18 CA-6</td>
</tr>
<tr class="even">
<td><strong>RN-AS20</strong></td>
<td>listarVigentes trae solo las asignaciones Vigente, de la más antigua a la más reciente por Fecha_Entrega; si no hay, se informa.</td>
<td>Fase A v6 (listarVigentes [Nuevo]: filtra Vigente). Orden y mensaje: propuesta</td>
<td>Fase A v6 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-16 CA-2, HU-16 CA-5, HU-18 CA-7</td>
</tr>
<tr class="odd">
<td><strong>RN-AS21</strong></td>
<td>listarPorCustodio trae las asignaciones del custodio (Vigente y Cerrada), de la más reciente a la más antigua por Fecha_Entrega; si no tiene, se informa.</td>
<td>Fase A v6 (listarPorCustodio [Nuevo]) y CRF-001. Orden y mensaje: propuesta</td>
<td>Fase A v6 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-16 CA-3, HU-16 CA-5, HU-16 CA-6</td>
</tr>
<tr class="even">
<td><strong>RN-AS22</strong></td>
<td>buscarVigentePorActivo devuelve la asignación Vigente del activo (quién lo tiene) o informa que no hay; vale también si el activo está Dañado.</td>
<td>Fase A v6 (buscarVigentePorActivo [Nuevo]). Caso Dañado: CRF-003, cambio 3. Mensajes: propuesta</td>
<td>Fase A v6 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-16 CA-4, HU-16 CA-5</td>
</tr>
<tr class="odd">
<td><strong>RN-AS23</strong></td>
<td>El Empleado solo consulta las asignaciones de su propio custodio y ve únicamente las Vigentes.</td>
<td>Alcance 1.2 («sus asignaciones vigentes»). Restricción a las propias: propuesta</td>
<td>Alcance 1.2 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-16 CA-6, HU-16 CA-7</td>
</tr>
<tr class="even">
<td><strong>RN-AS24</strong></td>
<td>El Responsable de Activos asigna, actualiza, cierra y consulta las asignaciones; el Empleado consulta las suyas (actor secundario de HU-16).</td>
<td>Alcance 1.2 («asignar los activos aprobados»; el Empleado consulta «sus asignaciones vigentes»). Asignar cada acción al Responsable: Supuesto</td>
<td>Alcance 1.2 + Supuesto, pendiente de validar con el cliente</td>
<td>Antecedentes de HU-15 a HU-18 (actor), HU-16 CA-6</td>
</tr>
<tr class="odd">
<td><strong>RN-AC01</strong></td>
<td>ID_Acta identifica de forma única el acta; lo genera el sistema y no se modifica (PK sin setter).</td>
<td>Diccionario v6 (PK) y UML v6 (PK sin setter). Generación automática: propuesta</td>
<td>Diccionario v6 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-19 CA-1</td>
</tr>
<tr class="even">
<td><strong>RN-AC02</strong></td>
<td>ID_Asignacion, Ruta_Acta y Firma_Digital son obligatorios; Fecha_Firma la asigna el sistema (fecha y hora actuales).</td>
<td>Diccionario v6 (Obligatorio; Fecha_Firma: «Asignado por el sistema»)</td>
<td>Diccionario v6</td>
<td>HU-19 CA-1, HU-19 CA-2</td>
</tr>
<tr class="odd">
<td><strong>RN-AC03</strong></td>
<td>Longitudes máximas: Ruta_Acta 255 y Firma_Digital 255 caracteres.</td>
<td>Diccionario v6 (Longitud)</td>
<td>Diccionario v6</td>
<td>HU-19 CA-3</td>
</tr>
<tr class="even">
<td><strong>RN-AC04</strong></td>
<td>ID_Asignacion debe corresponder a una asignación existente.</td>
<td>Diccionario v6 (FK hacia Asignacion)</td>
<td>Diccionario v6</td>
<td>HU-19 CA-4</td>
</tr>
<tr class="odd">
<td><strong>RN-AC05</strong></td>
<td>Solo se firma el acta de una asignación Vigente.</td>
<td>Propuesta</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-19 CA-4</td>
</tr>
<tr class="even">
<td><strong>RN-AC06</strong></td>
<td>Una asignación tiene una sola acta (ID_Asignacion único); existeActaDeAsignacion() (INTERNO) protege la regla dentro de firmar().</td>
<td>Diccionario v6 (Unique) y Fase A v6 (INTERNO)</td>
<td>Diccionario v6 + Fase A v6</td>
<td>HU-19 CA-5</td>
</tr>
<tr class="odd">
<td><strong>RN-AC07</strong></td>
<td>El acta la firma el custodio de la asignación (el receptor del equipo).</td>
<td>Alcance 1.2 («firma digital del empleado receptor»), diccionario v6 («el custodio firmó el acta») y regla 1.7.3 (N-05). Que solo firme el custodio de esa asignación: propuesta</td>
<td>Alcance 1.2 + diccionario v6 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-19 CA-1, HU-19 CA-6</td>
</tr>
<tr class="even">
<td><strong>RN-AC08</strong></td>
<td>Firma_Digital es un código de validación (hash criptográfico) del receptor; no se define el algoritmo, quién lo genera ni cómo se valida.</td>
<td>Diccionario v6 (observaciones de Firma_Digital). Lo no definido: P-38</td>
<td>Diccionario v6; algoritmo y generación: sin definir (P-38)</td>
<td>HU-19 CA-1, HU-19 CA-3</td>
</tr>
<tr class="odd">
<td><strong>RN-AC09</strong></td>
<td>buscarPorAsignacion devuelve el acta única de la asignación (Vigente o Cerrada) con sus 5 campos; si no tiene acta o la asignación no existe, se informa.</td>
<td>Diccionario v6 (Unique) y Fase A v6 (buscarPorAsignacion). Mensajes: propuesta</td>
<td>Diccionario v6 + Fase A v6; mensajes: propuesta</td>
<td>HU-20 CA-1, HU-20 CA-2, HU-20 CA-3, HU-20 CA-4</td>
</tr>
<tr class="even">
<td><strong>RN-AC10</strong></td>
<td>El Empleado solo consulta el acta de su propia asignación.</td>
<td>Alcance 1.2 («sus asignaciones vigentes»); extensión al acta: propuesta</td>
<td>Alcance 1.2 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-20 CA-5</td>
</tr>
<tr class="odd">
<td><strong>RN-S21</strong></td>
<td>listarAprobadas trae solo las solicitudes Aprobada sin Asignacion (existeAsignacionDeSolicitud() = falso), ordenadas por Fecha_Solicitud ascendente; si no hay, se informa.</td>
<td>CRF-003, cambio 6 (adenda de HU-10, Bloque 4a)</td>
<td>RN propuesta, pendiente de validar con el cliente · adenda CRF-003 (cambio 6)</td>
<td>HU-10 CA-6 y fila nueva de HU-10 CA-4 (adenda CRF-003)</td>
</tr>
<tr class="even">
<td><strong>RN-D01</strong></td>
<td>ID_Devolucion identifica de forma única la devolución; lo genera el sistema y no se modifica (PK sin setter).</td>
<td>Diccionario v6 (PK) y UML v6 (PK sin setter). Generación automática: propuesta</td>
<td>Diccionario v6 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-21 CA-1, HU-23 CA-1, HU-23 CA-4</td>
</tr>
<tr class="odd">
<td><strong>RN-D02</strong></td>
<td>ID_Asignacion es obligatorio al registrar; Observaciones es opcional; Fecha_Devolucion, Estado_Recepcion, Fecha_Confirmacion e ID_Receptor no se digitan al registrar.</td>
<td>Diccionario v6 (Obligatorio; Fecha_Devolucion: «Asignado por el sistema»; Estado_Recepcion: valor inicial; Fecha_Confirmacion e ID_Receptor: «Se llena al confirmar la recepción»)</td>
<td>Diccionario v6</td>
<td>HU-21 CA-1, HU-21 CA-2, HU-21 CA-3, HU-23 CA-2</td>
</tr>
<tr class="even">
<td><strong>RN-D03</strong></td>
<td>Longitud máxima: Observaciones 255 caracteres.</td>
<td>Diccionario v6 (Longitud)</td>
<td>Diccionario v6</td>
<td>HU-21 CA-4, HU-23 CA-3</td>
</tr>
<tr class="odd">
<td><strong>RN-D04</strong></td>
<td>ID_Asignacion debe corresponder a una asignación existente.</td>
<td>Diccionario v6 (FK hacia Asignacion)</td>
<td>Diccionario v6</td>
<td>HU-21 CA-5</td>
</tr>
<tr class="even">
<td><strong>RN-D05</strong></td>
<td>Solo se registra la devolución de una asignación Vigente.</td>
<td>Propuesta: una asignación Cerrada ya fue devuelta y confirmada (RN-AS14); las fuentes no lo dicen</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-21 CA-5</td>
</tr>
<tr class="odd">
<td><strong>RN-D06</strong></td>
<td>Una asignación tiene una sola devolución (ID_Asignacion único); existeDevolucionDeAsignacion() (INTERNO) protege la regla dentro de registrar().</td>
<td>Diccionario v6 (Unique, «RN propuesta, pendiente de validar con el cliente»), Fase A v6 (INTERNO) y CRF-002, cambio 0.7</td>
<td>Diccionario v6 + Fase A v6 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-21 CA-6</td>
</tr>
<tr class="even">
<td><strong>RN-D07</strong></td>
<td>La devolución la registra el custodio de la asignación (el Empleado); solo puede registrar la devolución de su propia asignación.</td>
<td>Alcance 1.2 («se podrá registrar la devolución de los equipos»), sin nombrar al actor. Actor y restricción: propuesta (P-42)</td>
<td>Alcance 1.2 + Supuesto, pendiente de validar con el cliente</td>
<td>HU-21 CA-1, HU-21 CA-7</td>
</tr>
<tr class="odd">
<td><strong>RN-D08</strong></td>
<td>Al registrar, el sistema asigna Fecha_Devolucion (fecha y hora actuales) y Estado_Recepcion = Pendiente; Fecha_Confirmacion e ID_Receptor quedan vacíos.</td>
<td>Diccionario v6 (valores asignados por el sistema; valor inicial Pendiente)</td>
<td>Diccionario v6</td>
<td>HU-21 CA-1, HU-21 CA-2</td>
</tr>
<tr class="even">
<td><strong>RN-D09</strong></td>
<td>Estado_Recepcion solo toma los valores Pendiente y Confirmada.</td>
<td>Diccionario v6 (ENUM, valores fijos)</td>
<td>Diccionario v6</td>
<td>HU-23 CA-4, HU-24 CA-1</td>
</tr>
<tr class="odd">
<td><strong>RN-D10</strong></td>
<td>Registrar la devolución no cierra la asignación ni cambia el estado del activo: la asignación sigue Vigente y el activo Asignado hasta confirmar la recepción.</td>
<td>CRF-003, cambios 2 y 5</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-21 CA-1</td>
</tr>
<tr class="even">
<td><strong>RN-D11</strong></td>
<td>actualizar() solo modifica Observaciones y solo mientras Estado_Recepcion está Pendiente; ID_Devolucion, Fecha_Devolucion, ID_Asignacion, Estado_Recepcion, Fecha_Confirmacion e ID_Receptor no se modifican, y una devolución Confirmada no se actualiza.</td>
<td>Fase A v6 (actualizar: «corrige las observaciones de una devolución»). Solo mientras está Pendiente: propuesta (P-49)</td>
<td>Fase A v6 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-23 CA-1, HU-23 CA-2, HU-23 CA-3, HU-23 CA-4, HU-23 CA-5</td>
</tr>
<tr class="odd">
<td><strong>RN-D12</strong></td>
<td>Solo el custodio de la asignación actualiza su devolución.</td>
<td>Propuesta (patrón RN-D07)</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-23 CA-7</td>
</tr>
<tr class="even">
<td><strong>RN-D13</strong></td>
<td>confirmarRecepcion() pasa Estado_Recepcion de Pendiente a Confirmada; el sistema asigna Fecha_Confirmacion (fecha y hora actuales) e ID_Receptor (el usuario en sesión); no se digitan.</td>
<td>Diccionario v6 (Fecha_Confirmacion e ID_Receptor: «Se llena al confirmar la recepción») y Fase A v6 (confirmarRecepcion: «guarda fecha y quién la confirmó»). Que el receptor sea el usuario en sesión y no se digite: propuesta</td>
<td>Diccionario v6 + Fase A v6 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-22 CA-2, HU-24 CA-1</td>
</tr>
<tr class="odd">
<td><strong>RN-D14</strong></td>
<td>ID_Receptor debe ser un usuario existente, activo y con el rol Responsable de Activos.</td>
<td>Diccionario v6 (FK hacia Usuario; «Responsable de Activos que confirma la recepción»). Que exista, esté activo y tenga el rol: propuesta (patrón P-08)</td>
<td>Diccionario v6 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-24 CA-1, HU-24 CA-6</td>
</tr>
<tr class="even">
<td><strong>RN-D15</strong></td>
<td>Al confirmar la recepción, la asignación pasa a Cerrada (invoca Asignacion.cerrar()) y el Activo pasa a Disponible, salvo que esté Dañado (conserva Dañado).</td>
<td>CRF-003, cambios 2 y 5; RN-AS14 y RN-AS15</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-24 CA-1, HU-24 CA-2, HU-24 CA-7</td>
</tr>
<tr class="odd">
<td><strong>RN-D16</strong></td>
<td>Antes de confirmar, el sistema explica la consecuencia y permite desistir; solo se confirma al aceptar.</td>
<td>Propuesta (patrón RN-A12 y RN-AS16)</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-24 CA-1, HU-24 CA-3</td>
</tr>
<tr class="even">
<td><strong>RN-D17</strong></td>
<td>Una devolución ya Confirmada no se confirma de nuevo ni vuelve a Pendiente.</td>
<td>Propuesta (patrón RN-AS17); la Fase A v6 no tiene un método que revierta la confirmación</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-24 CA-4</td>
</tr>
<tr class="odd">
<td><strong>RN-D18</strong></td>
<td>buscarPorId devuelve una sola devolución con sus 7 campos o informa que no existe; cualquier operación sobre una devolución inexistente lo informa.</td>
<td>Diccionario v6 (PK) y Fase A v6 (buscarPorId). Mensajes: propuesta</td>
<td>Diccionario v6 + Fase A v6; mensajes: propuesta</td>
<td>HU-22 CA-1, HU-22 CA-2, HU-22 CA-3, HU-23 CA-6, HU-24 CA-5</td>
</tr>
<tr class="even">
<td><strong>RN-D19</strong></td>
<td>listarPendientesDeRecepcion trae solo las devoluciones con Estado_Recepcion = Pendiente, de la más antigua a la más reciente por Fecha_Devolucion; si no hay, se informa.</td>
<td>Fase A v6 (listarPendientesDeRecepcion [Nuevo]) y Alcance 1.2 («confirmar su recepción por parte del responsable de activos»). Orden y mensaje: propuesta</td>
<td>Fase A v6 + Alcance 1.2 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-22 CA-4, HU-22 CA-5, HU-22 CA-6</td>
</tr>
<tr class="odd">
<td><strong>RN-D20</strong></td>
<td>El Empleado solo consulta las devoluciones de sus propias asignaciones (las de su custodio).</td>
<td>Alcance 1.2 (el Empleado consulta «sus asignaciones vigentes»); extensión a las devoluciones: propuesta</td>
<td>Alcance 1.2 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-22 CA-6, HU-22 CA-7</td>
</tr>
<tr class="even">
<td><strong>RN-D21</strong></td>
<td>El Responsable de Activos consulta y confirma las devoluciones; el Empleado registra, actualiza y consulta las suyas (actor secundario de HU-22).</td>
<td>Alcance 1.2 («confirmar su recepción por parte del responsable de activos»). El resto: Supuesto</td>
<td>Alcance 1.2 + Supuesto, pendiente de validar con el cliente</td>
<td>HU-22 CA-6, Antecedentes de HU-21 a HU-24 (actor)</td>
</tr>
<tr class="odd">
<td><strong>RN-N01</strong></td>
<td>ID_Notificacion identifica de forma única la notificación; lo genera el sistema y no se modifica (PK sin setter).</td>
<td>Diccionario v6 (PK) y UML v6 (PK sin setter). Generación automática: propuesta</td>
<td>Diccionario v6 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-25 CA-1, HU-25 CA-6</td>
</tr>
<tr class="even">
<td><strong>RN-N02</strong></td>
<td>ID_Asignacion es obligatorio y debe corresponder a una asignación existente.</td>
<td>Diccionario v6 (Obligatorio; FK hacia Asignacion). Mensajes: propuesta</td>
<td>Diccionario v6; mensajes: propuesta</td>
<td>HU-25 CA-1, HU-25 CA-5</td>
</tr>
<tr class="odd">
<td><strong>RN-N03</strong></td>
<td>ID_Asignacion no es único: una asignación puede tener más de una notificación; cuándo y cuántas veces se avisa no está definido.</td>
<td>Diccionario v6 (FK hacia Asignacion, sin Unique). Frecuencia: P-44</td>
<td>Diccionario v6; frecuencia: sin definir (P-44)</td>
<td>HU-25 CA-6</td>
</tr>
<tr class="even">
<td><strong>RN-N04</strong></td>
<td>Dias_Restantes = Fecha_Devolucion_Esperada (de la asignación) − fecha actual; es un dato derivado: lo calcula calcularDiasRestantes() (INTERNO) y no se almacena.</td>
<td>Diccionario v6 («Dato derivado, no se almacena») y Fase A v6 (calcularDiasRestantes)</td>
<td>Diccionario v6 + Fase A v6</td>
<td>HU-25 CA-1, HU-25 CA-2, HU-25 CA-3</td>
</tr>
<tr class="odd">
<td><strong>RN-N05</strong></td>
<td>Solo se genera el aviso de una asignación Vigente; de una asignación Cerrada no se genera.</td>
<td>Alcance 1.2 («aviso de próximas devoluciones»): una asignación cerrada ya fue devuelta. La regla explícita: propuesta (P-46)</td>
<td>Alcance 1.2 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-25 CA-1, HU-25 CA-4</td>
</tr>
<tr class="even">
<td><strong>RN-N06</strong></td>
<td>El aviso llega por correo electrónico al Email del Usuario del custodio de la asignación (asignación → custodio → usuario).</td>
<td>Alcance 1.2 («notificación automática por correo electrónico») y diccionario v6 (Usuario.Email: «usado para notificaciones»). Cadena del destinatario: propuesta</td>
<td>Alcance 1.2 + diccionario v6 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-25 CA-1, HU-25 CA-3</td>
</tr>
<tr class="odd">
<td><strong>RN-N07</strong></td>
<td>Si el plazo ya venció (Dias_Restantes negativo), el aviso se genera igual y el correo informa los días de retraso.</td>
<td>Propuesta: las fuentes no dicen qué pasa con un plazo vencido (P-45)</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-25 CA-3</td>
</tr>
<tr class="even">
<td><strong>RN-N08</strong></td>
<td>El umbral (cuántos días antes de la fecha esperada se avisa) y la frecuencia no están definidos; los días de los ejemplos son datos de ejemplo, no una regla.</td>
<td>Alcance 1.2 («próximas devoluciones») sin plazo ni frecuencia (P-44)</td>
<td>Sin definir (P-44)</td>
<td>HU-25 CA-2</td>
</tr>
<tr class="odd">
<td><strong>RN-N09</strong></td>
<td>generarAviso() es un proceso automático del sistema, sin actor humano que lo solicite; el Empleado solo recibe el correo.</td>
<td>Alcance 1.2 («notificación automática»)</td>
<td>Alcance 1.2</td>
<td>Antecedentes de HU-25 (disparador del sistema)</td>
</tr>
<tr class="even">
<td><strong>RN-N10</strong></td>
<td>Es el único aviso automático del sistema: no hay otros avisos (aprobación o rechazo, equipo listo para recoger, reporte de daño, a TI, preventivos) ni métodos para ellos.</td>
<td>Diccionario v6 (nota de Notificacion_De_Devolucion), Alcance 1.2 (trabajo futuro) y CRF-002 (0.9)</td>
<td>Diccionario v6 + Alcance 1.2 + CRF-002</td>
<td>Nota de HU-25 y sección B.6</td>
</tr>
<tr class="odd">
<td><strong>RN-RD01</strong></td>
<td>ID_ReporteDanios identifica de forma única el reporte; lo genera el sistema y no se modifica (PK sin setter).</td>
<td>Diccionario v6 (PK) y UML v6 (PK sin setter). Generación automática: propuesta</td>
<td>Diccionario v6 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-26 CA-1, HU-28 CA-4</td>
</tr>
<tr class="even">
<td><strong>RN-RD02</strong></td>
<td>Descripcion_Danio, Tipo_Danio e ID_Activo son obligatorios; Evidencia es opcional; Fecha_Reporte la asigna el sistema (fecha y hora actuales) e ID_Custodio es el custodio de la sesión.</td>
<td>Diccionario v6 (Obligatorio; Fecha_Reporte: «Asignado por el sistema»). ID_Custodio desde la sesión: propuesta</td>
<td>Diccionario v6 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-26 CA-1, HU-26 CA-2, HU-26 CA-3, HU-28 CA-2</td>
</tr>
<tr class="odd">
<td><strong>RN-RD03</strong></td>
<td>Longitudes máximas: Descripcion_Danio 500 y Evidencia 255 caracteres. Evidencia guarda la ruta del archivo; el mecanismo de carga no está definido.</td>
<td>Diccionario v6 (Longitud; Evidencia: «Ruta del archivo»). Mecanismo de carga: P-52</td>
<td>Diccionario v6; mecanismo de carga: sin definir (P-52)</td>
<td>HU-26 CA-4, HU-28 CA-3</td>
</tr>
<tr class="even">
<td><strong>RN-RD04</strong></td>
<td>Tipo_Danio solo toma los valores Hardware, Software y Otro.</td>
<td>Diccionario v6 (ENUM, valores fijos)</td>
<td>Diccionario v6</td>
<td>HU-26 CA-1, HU-26 CA-5, HU-28 CA-2</td>
</tr>
<tr class="odd">
<td><strong>RN-RD05</strong></td>
<td>ID_Activo debe corresponder a un activo existente.</td>
<td>Diccionario v6 (FK hacia Activo)</td>
<td>Diccionario v6</td>
<td>HU-26 CA-6</td>
</tr>
<tr class="even">
<td><strong>RN-RD06</strong></td>
<td>ID_Custodio es el custodio del usuario en sesión (Carlos Mejía, custodio 3); no se digita.</td>
<td>Diccionario v6 (FK hacia Custodio: «custodio que reporta el daño»). Que salga de la sesión: propuesta</td>
<td>Diccionario v6 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-26 CA-1</td>
</tr>
<tr class="odd">
<td><strong>RN-RD07</strong></td>
<td>Solo se reporta un equipo que tiene una asignación Vigente a nombre del custodio que reporta; no el de otro custodio ni uno sin asignación Vigente.</td>
<td>Propuesta (Alcance 1.2: «reportar cuando un equipo se encuentre dañado»; P-51)</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-26 CA-1, HU-26 CA-6</td>
</tr>
<tr class="even">
<td><strong>RN-RD08</strong></td>
<td>Un activo en Baja no se reporta.</td>
<td>Propuesta (Baja es terminal, RN-A18)</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-26 CA-6</td>
</tr>
<tr class="odd">
<td><strong>RN-RD09</strong></td>
<td>Al crear el reporte, el Activo pasa a Dañado, también si estaba Asignado; la asignación sigue Vigente.</td>
<td>CRF-003, cambio 3 (D3)</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-26 CA-1, HU-26 CA-2, HU-26 CA-7</td>
</tr>
<tr class="even">
<td><strong>RN-RD10</strong></td>
<td>Un activo que ya está Dañado admite otro reporte; conserva Dañado y el reporte anterior no cambia.</td>
<td>Propuesta: no perder la información de un segundo daño (P-50)</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-26 CA-7</td>
</tr>
<tr class="odd">
<td><strong>RN-RD11</strong></td>
<td>buscarPorId devuelve un solo reporte con sus 7 campos o informa que no existe; cualquier operación sobre un reporte inexistente lo informa.</td>
<td>Diccionario v6 (PK) y Fase A v6 (buscarPorId). Mensajes: propuesta</td>
<td>Diccionario v6 + Fase A v6; mensajes: propuesta</td>
<td>HU-27 CA-1, HU-27 CA-2, HU-28 CA-6</td>
</tr>
<tr class="even">
<td><strong>RN-RD12</strong></td>
<td>listarReportes trae los reportes del más reciente al más antiguo por Fecha_Reporte; si no hay, se informa.</td>
<td>Fase A v6 (listarReportes [Nuevo]: orden del más reciente al más antiguo, RN propuesta). Mensaje: propuesta</td>
<td>Fase A v6 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-27 CA-3, HU-27 CA-4, HU-27 CA-5</td>
</tr>
<tr class="odd">
<td><strong>RN-RD13</strong></td>
<td>El Técnico de Soporte consulta todos los reportes; el Empleado solo los de su custodio.</td>
<td>Alcance 1.2 (el Técnico de Soporte consulta los reportes de daño registrados). Restricción del Empleado: propuesta (P-55)</td>
<td>Alcance 1.2 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-27 CA-5, HU-27 CA-6</td>
</tr>
<tr class="even">
<td><strong>RN-RD14</strong></td>
<td>actualizar() solo modifica Descripcion_Danio, Evidencia y Tipo_Danio; ID_ReporteDanios, ID_Activo, ID_Custodio y Fecha_Reporte no se modifican.</td>
<td>Fase A v6 (actualizar: «complementa o corrige descripción, evidencia y tipo»). Los inmutables: propuesta</td>
<td>Fase A v6 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-28 CA-1, HU-28 CA-2, HU-28 CA-4</td>
</tr>
<tr class="odd">
<td><strong>RN-RD15</strong></td>
<td>Un reporte con mantenimiento asociado (Historial_Mantenimientos.ID_ReporteDanios) no se actualiza.</td>
<td>Propuesta (P-54)</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-28 CA-5</td>
</tr>
<tr class="even">
<td><strong>RN-RD16</strong></td>
<td>Actualizar el reporte no cambia Estado_Activo.</td>
<td>CRF-003, cambio 3 (el estado lo fija crear())</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-28 CA-1</td>
</tr>
<tr class="odd">
<td><strong>RN-RD17</strong></td>
<td>Solo el custodio que reportó el daño actualiza su reporte.</td>
<td>Propuesta (patrón RN-D12)</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-28 CA-7</td>
</tr>
<tr class="even">
<td><strong>RN-RD18</strong></td>
<td>El Empleado reporta, actualiza y consulta los suyos (actor secundario de HU-27); el Técnico de Soporte consulta todos.</td>
<td>Alcance 1.2 («reportar cuando un equipo se encuentre dañado»; consulta del Técnico). Reparto de acciones: Supuesto</td>
<td>Alcance 1.2 + Supuesto, pendiente de validar con el cliente</td>
<td>HU-27 CA-5, Antecedentes de HU-26 a HU-28 (actor)</td>
</tr>
<tr class="odd">
<td><strong>RN-RD19</strong></td>
<td>El modelo no tiene baja de reportes, estado de atención ni un método de «reportes sin atender»; no se inventan.</td>
<td>Fase A v6 (Reporte_de_Danios: 4 métodos públicos) y diccionario v6 (sin estado). P-53</td>
<td>Fase A v6 + diccionario v6; necesidad: sin definir (P-53)</td>
<td>Nota de HU-27</td>
</tr>
<tr class="even">
<td><strong>RN-H01</strong></td>
<td>ID_Mantenimiento identifica de forma única el mantenimiento; lo genera el sistema y no se modifica (PK sin setter).</td>
<td>Diccionario v6 (PK) y UML v6 (PK sin setter). Generación automática: propuesta</td>
<td>Diccionario v6 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-29 CA-1, HU-31 CA-4</td>
</tr>
<tr class="odd">
<td><strong>RN-H02</strong></td>
<td>ID_Activo, Tipo_Mantenimiento, Descripcion y Fecha_Mantenimiento son obligatorios; ID_ReporteDanios, Costo y Evidencia son opcionales; la fecha la informa el técnico (el sistema no la asigna).</td>
<td>Diccionario v6 (Obligatorio; Fecha_Mantenimiento sin «Asignado por el sistema»)</td>
<td>Diccionario v6</td>
<td>HU-29 CA-1, HU-29 CA-2, HU-29 CA-3, HU-31 CA-2</td>
</tr>
<tr class="even">
<td><strong>RN-H03</strong></td>
<td>Longitudes máximas: Descripcion 300 y Evidencia 255 caracteres.</td>
<td>Diccionario v6 (Longitud)</td>
<td>Diccionario v6</td>
<td>HU-29 CA-4, HU-31 CA-3</td>
</tr>
<tr class="odd">
<td><strong>RN-H04</strong></td>
<td>Tipo_Mantenimiento solo toma los valores Preventivo y Correctivo.</td>
<td>Diccionario v6 (ENUM, valores fijos)</td>
<td>Diccionario v6</td>
<td>HU-29 CA-1, HU-29 CA-5</td>
</tr>
<tr class="even">
<td><strong>RN-H05</strong></td>
<td>ID_Activo debe corresponder a un activo existente.</td>
<td>Diccionario v6 (FK hacia Activo)</td>
<td>Diccionario v6</td>
<td>HU-29 CA-6</td>
</tr>
<tr class="odd">
<td><strong>RN-H06</strong></td>
<td>Si se informa ID_ReporteDanios, debe corresponder a un reporte existente.</td>
<td>Diccionario v6 (FK hacia Reporte_de_Danios, opcional)</td>
<td>Diccionario v6</td>
<td>HU-29 CA-1, HU-29 CA-2, HU-29 CA-6</td>
</tr>
<tr class="even">
<td><strong>RN-H07</strong></td>
<td>El reporte informado debe ser del mismo activo del mantenimiento.</td>
<td>Propuesta</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-29 CA-1, HU-29 CA-6</td>
</tr>
<tr class="odd">
<td><strong>RN-H08</strong></td>
<td>Un activo en Baja no admite mantenimiento.</td>
<td>Propuesta (Baja es terminal, RN-A18)</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-29 CA-6</td>
</tr>
<tr class="even">
<td><strong>RN-H09</strong></td>
<td>ID_Tecnico es el usuario de la sesión: debe existir, estar activo y tener el rol Técnico de Soporte; no se digita.</td>
<td>Diccionario v6 (FK hacia Usuario; «Usuario (rol Técnico de Soporte)»). Existencia, estado y que salga de la sesión: propuesta</td>
<td>Diccionario v6 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-29 CA-1, HU-29 CA-7</td>
</tr>
<tr class="odd">
<td><strong>RN-H10</strong></td>
<td>Costo es un valor en pesos, sin centavos, y no puede ser negativo.</td>
<td>Diccionario v6 (Costo: «Valor en pesos, sin centavos»; BIGINT). No negativo: propuesta (P-58)</td>
<td>Diccionario v6 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-29 CA-1, HU-29 CA-5, HU-31 CA-3</td>
</tr>
<tr class="even">
<td><strong>RN-H11</strong></td>
<td>Fecha_Mantenimiento no puede ser futura.</td>
<td>Propuesta (P-58)</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-29 CA-5</td>
</tr>
<tr class="odd">
<td><strong>RN-H12</strong></td>
<td>Registrar un mantenimiento no cambia Estado_Activo; el Responsable de Activos lo devuelve a Disponible con Activo.actualizar(), sin asignación Vigente.</td>
<td>CRF-003, cambio 4 (D4); RN-A16 (adenda)</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-29 CA-1, HU-29 CA-2</td>
</tr>
<tr class="even">
<td><strong>RN-H13</strong></td>
<td>Solo registro simple: sin programación ni recordatorios; el mantenimiento preventivo avanzado está fuera del alcance.</td>
<td>Alcance 1.2 (fuera del alcance). P-59</td>
<td>Alcance 1.2</td>
<td>HU-29 CA-2, Nota de HU-29</td>
</tr>
<tr class="odd">
<td><strong>RN-H14</strong></td>
<td>buscarPorId devuelve un solo mantenimiento con sus 9 campos o informa que no existe; cualquier operación sobre un mantenimiento inexistente lo informa.</td>
<td>Diccionario v6 (PK) y Fase A v6 (buscarPorId). Mensajes: propuesta</td>
<td>Diccionario v6 + Fase A v6; mensajes: propuesta</td>
<td>HU-30 CA-1, HU-30 CA-2, HU-31 CA-5</td>
</tr>
<tr class="even">
<td><strong>RN-H15</strong></td>
<td>listarPorActivo trae el historial de un activo del más reciente al más antiguo por Fecha_Mantenimiento; si el activo no tiene mantenimientos o no existe, se informa.</td>
<td>Fase A v6 (listarPorActivo [Nuevo]) y Alcance 1.2 («consultar el historial de reparaciones de cada activo»). Orden y mensajes: propuesta</td>
<td>Fase A v6 + Alcance 1.2 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-30 CA-3, HU-30 CA-4, HU-30 CA-5</td>
</tr>
<tr class="odd">
<td><strong>RN-H16</strong></td>
<td>El Técnico de Soporte registra, consulta y actualiza los mantenimientos.</td>
<td>Diccionario v6 (ID_Tecnico: rol Técnico de Soporte). Quién más consulta: Supuesto (P-57)</td>
<td>Diccionario v6 + Supuesto, pendiente de validar con el cliente</td>
<td>Antecedentes de HU-29 a HU-31 (actor)</td>
</tr>
<tr class="even">
<td><strong>RN-H17</strong></td>
<td>actualizar() solo modifica Descripcion, Costo y Evidencia; ID_Mantenimiento, ID_Activo, ID_ReporteDanios, Tipo_Mantenimiento, Fecha_Mantenimiento e ID_Tecnico no se modifican.</td>
<td>Fase A v6 (actualizar: «corrige descripción, costo y evidencia»). Los inmutables: propuesta</td>
<td>Fase A v6 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-31 CA-1, HU-31 CA-2, HU-31 CA-4</td>
</tr>
<tr class="odd">
<td><strong>RN-H18</strong></td>
<td>Actualizar el mantenimiento no cambia Estado_Activo.</td>
<td>CRF-003, cambio 4</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-31 CA-1</td>
</tr>
<tr class="even">
<td><strong>RN-U01</strong></td>
<td>ID_Usuario identifica de forma única la cuenta; lo genera el sistema y no se modifica (PK sin setter).</td>
<td>Diccionario v6 (PK) y UML v6 (PK sin setter). Generación automática: propuesta</td>
<td>Diccionario v6 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-32 CA-1, HU-34 CA-6</td>
</tr>
<tr class="odd">
<td><strong>RN-U02</strong></td>
<td>Nombre, Apellido, Email, Password y rol son obligatorios al registrar y no pueden quedar vacíos al actualizar (salvo Password, que no se actualiza); activo lo asigna el sistema (TRUE).</td>
<td>Diccionario v6 (Obligatorio; activo: «valor inicial TRUE asignado por el sistema al crear»)</td>
<td>Diccionario v6</td>
<td>HU-32 CA-1, HU-32 CA-2, HU-34 CA-1, HU-34 CA-2</td>
</tr>
<tr class="even">
<td><strong>RN-U03</strong></td>
<td>Longitudes máximas: Nombre 20, Apellido 20 y Email 100 caracteres. Password mide 255 como valor almacenado; la longitud permitida de la contraseña digitada no está definida.</td>
<td>Diccionario v6 (Longitud). Longitud de la contraseña digitada: sin definir (P-61)</td>
<td>Diccionario v6; contraseña digitada: sin definir (P-61)</td>
<td>HU-32 CA-3, HU-34 CA-3</td>
</tr>
<tr class="odd">
<td><strong>RN-U04</strong></td>
<td>Email es único entre todos los usuarios, activos e inactivos; existeEmail() (INTERNO) protege la regla dentro de crear() y actualizar(), y al actualizar no cuenta al propio usuario.</td>
<td>Diccionario v6 (Email: «debe ser único») y Fase A v6 (existeEmail: «protege la unicidad dentro de crear() y actualizar()»). Contar a los inactivos y mayúsculas: propuesta (P-63)</td>
<td>Diccionario v6 + Fase A v6 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-32 CA-4, HU-34 CA-5</td>
</tr>
<tr class="even">
<td><strong>RN-U05</strong></td>
<td>Email debe tener la forma usuario@dominio, sin espacios.</td>
<td>Propuesta: el diccionario solo define longitud y unicidad (P-63)</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-32 CA-5, HU-34 CA-4</td>
</tr>
<tr class="odd">
<td><strong>RN-U06</strong></td>
<td>rol solo toma los valores Responsable de Activos, Empleado, Aprobador, Técnico de Soporte y Gerente.</td>
<td>Diccionario v6 (ENUM Nombre_Rol, valores fijos: los 5 actores del Alcance 1.2)</td>
<td>Diccionario v6</td>
<td>HU-32 CA-6, HU-34 CA-4</td>
</tr>
<tr class="even">
<td><strong>RN-U07</strong></td>
<td>Password se guarda cifrada, nunca en texto plano: el valor almacenado es distinto del digitado. El mecanismo de cifrado no está definido.</td>
<td>Diccionario v6 (Password: «contraseña encriptada»). Mecanismo: sin definir (P-62)</td>
<td>Diccionario v6; mecanismo: sin definir (P-62)</td>
<td>HU-32 CA-1, HU-37 CA-1</td>
</tr>
<tr class="odd">
<td><strong>RN-U08</strong></td>
<td>La política de complejidad de la contraseña (longitud mínima, tipos de caracteres, caducidad) no está definida: solo se exige que la contraseña no esté vacía.</td>
<td>Diccionario v6 (sin política). Lo no definido: P-61</td>
<td>Sin definir (P-61)</td>
<td>HU-32 CA-2, HU-37 CA-4</td>
</tr>
<tr class="even">
<td><strong>RN-U09</strong></td>
<td>buscarPorId y buscarPorEmail devuelven el usuario con sus 6 campos (ID_Usuario, Nombre, Apellido, Email, activo y rol), esté activo o inactivo, y nunca muestran Password; buscarPorEmail exige el correo; si el usuario no existe, cualquier operación sobre él lo informa.</td>
<td>Fase A v6 (buscarPorId y buscarPorEmail [Nuevo]: clave única). Incluir inactivos, ocultar Password y mensajes: propuesta</td>
<td>Fase A v6 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-33 CA-1, HU-33 CA-2, HU-33 CA-3, HU-33 CA-4, HU-33 CA-5, HU-34 CA-7, HU-35 CA-4, HU-37 CA-6</td>
</tr>
<tr class="odd">
<td><strong>RN-U10</strong></td>
<td>actualizar() modifica Nombre, Apellido, Email y rol; ID_Usuario, activo y Password no se modifican (la contraseña se cambia con cambiarContrasena()).</td>
<td>Fase A v6 (actualizar: «modifica nombre, apellido, correo y rol de una cuenta (no la contraseña)»). Inmutabilidad de ID_Usuario y activo: propuesta (patrón RN-C12)</td>
<td>Fase A v6 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-34 CA-1, HU-34 CA-6</td>
</tr>
<tr class="even">
<td><strong>RN-U11</strong></td>
<td>No se actualiza un usuario inactivo.</td>
<td>Propuesta (patrón P-15, Bloque 1)</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-34 CA-7</td>
</tr>
<tr class="odd">
<td><strong>RN-U12</strong></td>
<td>Inactivar pone activo = FALSE; el registro nunca se elimina (jamás DELETE) y no existe reactivar. activo solo cambia con la baja.</td>
<td>Diccionario v6 (activo: baja lógica, jamás DELETE) y Fase A v6 (inactivar: «cambia activo a FALSE»; sin método de reactivación). Que actualizar no cambie activo: propuesta</td>
<td>Diccionario v6 + Fase A v6 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-35 CA-1, HU-35 CA-7</td>
</tr>
<tr class="even">
<td><strong>RN-U13</strong></td>
<td>Un usuario que ya está inactivo no se vuelve a inactivar.</td>
<td>Propuesta (patrón RN-C13)</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-35 CA-3</td>
</tr>
<tr class="odd">
<td><strong>RN-U14</strong></td>
<td>Antes de inactivar, el sistema explica la consecuencia (el usuario no podrá iniciar sesión y no se puede reactivar) y permite desistir.</td>
<td>Propuesta (patrón RN-C16)</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-35 CA-1, HU-35 CA-2</td>
</tr>
<tr class="even">
<td><strong>RN-U15</strong></td>
<td>No se inactiva a un usuario que tenga un custodio activo: primero se inactiva al custodio, lo que exige cerrar sus asignaciones Vigentes y cancelar sus solicitudes Pendientes (opción A; ver P-66). Orden de verificación: asignaciones vigentes, solicitudes pendientes y custodio activo.</td>
<td>Propuesta (coherente con RN-C14 y RN-A19)</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-35 CA-5</td>
</tr>
<tr class="odd">
<td><strong>RN-U16</strong></td>
<td>No se inactiva al único Aprobador activo mientras existan solicitudes Pendientes (opción A; ver P-66 y P-67).</td>
<td>Propuesta: la solicitud no se asigna a un Aprobador concreto; sin Aprobador activo nadie puede decidirla</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-35 CA-5</td>
</tr>
<tr class="even">
<td><strong>RN-U17</strong></td>
<td>Un usuario no puede inactivar su propio usuario.</td>
<td>Propuesta (P-68)</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-35 CA-6</td>
</tr>
<tr class="odd">
<td><strong>RN-U18</strong></td>
<td>iniciarSesion exige correo y contraseña, compara la contraseña digitada con la almacenada cifrada y, si coinciden, inicia la sesión con el rol del usuario; cualquiera de los 5 roles puede iniciar sesión.</td>
<td>Fase A v6 (iniciarSesion: «autentica a la persona con correo y contraseña») y Alcance 1.2 (los 5 actores). Campos obligatorios y mensajes: propuesta</td>
<td>Fase A v6 + Alcance 1.2 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-36 CA-1, HU-36 CA-2, HU-36 CA-5</td>
</tr>
<tr class="even">
<td><strong>RN-U19</strong></td>
<td>Si el correo no existe o la contraseña es incorrecta, el mensaje es el mismo y no revela cuál falló.</td>
<td>Propuesta (P-71)</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-36 CA-3, HU-36 CA-4</td>
</tr>
<tr class="odd">
<td><strong>RN-U20</strong></td>
<td>Un usuario inactivo no inicia sesión; el mensaje de inactividad solo se muestra cuando las credenciales son correctas.</td>
<td>Propuesta (P-71); el diccionario define activo como «cuenta activa»</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-36 CA-4</td>
</tr>
<tr class="even">
<td><strong>RN-U21</strong></td>
<td>cambiarContrasena valida la contraseña actual, exige una nueva contraseña no vacía y distinta de la actual, y guarda la nueva cifrada. La confirmación de la nueva contraseña es de interfaz.</td>
<td>Fase A v6 (cambiarContrasena: «cambia la contraseña propia validando la actual»). Nueva distinta y no vacía: propuesta</td>
<td>Fase A v6 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-37 CA-1, HU-37 CA-2, HU-37 CA-3, HU-37 CA-4</td>
</tr>
<tr class="odd">
<td><strong>RN-U22</strong></td>
<td>Un usuario solo cambia su propia contraseña.</td>
<td>Fase A v6 (cambiarContrasena: «cambia la contraseña propia»)</td>
<td>Fase A v6</td>
<td>HU-37 CA-5</td>
</tr>
<tr class="even">
<td><strong>RN-U23</strong></td>
<td>El Responsable de Activos registra, consulta, actualiza e inactiva usuarios; cualquier usuario inicia sesión y cambia su propia contraseña.</td>
<td>Alcance 1.2 («gestionar roles y permisos según el perfil de cada usuario»), sin nombrar al actor. Asignar cada acción al Responsable de Activos: Supuesto (P-60)</td>
<td>Alcance 1.2 + Supuesto, pendiente de validar con el cliente</td>
<td>Antecedentes de HU-32 a HU-35 (actor)</td>
</tr>
<tr class="odd">
<td><strong>RN-RP01</strong></td>
<td>Rol_Permiso se identifica por la clave compuesta (rol, permiso), sin identificador propio, sin FK y sin setter; ambos campos son ENUM.</td>
<td>Diccionario v6 (PK compuesta (rol, permiso), sin FK) y UML v6 ({PK, readOnly})</td>
<td>Diccionario v6</td>
<td>HU-38 CA-1</td>
</tr>
<tr class="even">
<td><strong>RN-RP02</strong></td>
<td>rol y permiso son obligatorios.</td>
<td>Diccionario v6 (Obligatorio Sí)</td>
<td>Diccionario v6</td>
<td>HU-38 CA-1, HU-38 CA-2, HU-39 CA-4</td>
</tr>
<tr class="odd">
<td><strong>RN-RP03</strong></td>
<td>rol solo toma los valores Responsable de Activos, Empleado, Aprobador, Técnico de Soporte y Gerente.</td>
<td>Diccionario v6 (ENUM Nombre_Rol)</td>
<td>Diccionario v6</td>
<td>HU-38 CA-4, HU-38 CA-5, HU-39 CA-4, HU-40 CA-4</td>
</tr>
<tr class="even">
<td><strong>RN-RP04</strong></td>
<td>permiso solo toma los valores Crear, Consultar, Actualizar, Inactivar, Aprobar, Notificar, Asignar, Devolver y Reportar.</td>
<td>Diccionario v6 (ENUM Nombre_Permiso) y CRF-002, cambio 0.4</td>
<td>Diccionario v6</td>
<td>HU-38 CA-4, HU-38 CA-5, HU-39 CA-4</td>
</tr>
<tr class="odd">
<td><strong>RN-RP05</strong></td>
<td>Un par rol–permiso no se repite; existeAsignacion() (INTERNO) protege la regla dentro de asignar().</td>
<td>Diccionario v6 (PK compuesta) y Fase A v6 (existeAsignacion: «verifica que la pareja rol–permiso no exista»)</td>
<td>Diccionario v6 + Fase A v6</td>
<td>HU-38 CA-3, HU-39 CA-5</td>
</tr>
<tr class="even">
<td><strong>RN-RP06</strong></td>
<td>retirar() elimina la fila del par rol–permiso: es la única excepción propuesta a «jamás DELETE», porque Rol_Permiso es una tabla de relación sin columna activo ni historial propio. No existe reactivar: para volver a otorgar el permiso se usa asignar().</td>
<td>Fase A v6 (retirar: «retira un permiso a un rol»). Eliminar la fila y la excepción a «jamás DELETE»: propuesta (P-78)</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-39 CA-1, HU-39 CA-5</td>
</tr>
<tr class="odd">
<td><strong>RN-RP07</strong></td>
<td>Solo se retira una asignación que existe.</td>
<td>Propuesta (patrón de «inexistente» de RN-C15)</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-39 CA-3</td>
</tr>
<tr class="even">
<td><strong>RN-RP08</strong></td>
<td>Antes de retirar, el sistema explica la consecuencia (el rol pierde esa capacidad y la asignación se elimina) y permite desistir.</td>
<td>Propuesta (patrón RN-C16)</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-39 CA-1, HU-39 CA-2</td>
</tr>
<tr class="odd">
<td><strong>RN-RP09</strong></td>
<td>retirar() elimina solo el par indicado: los demás permisos del rol y los permisos de otros roles no cambian.</td>
<td>Propuesta (derivada de la PK compuesta)</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-39 CA-1</td>
</tr>
<tr class="even">
<td><strong>RN-RP10</strong></td>
<td>consultarPermisos devuelve los permisos del rol en el orden de declaración de Nombre_Permiso, no modifica datos y, si el rol no tiene permisos, devuelve una lista vacía con un mensaje.</td>
<td>Fase A v6 (consultarPermisos: «devuelve los permisos del rol (List&lt;Nombre_Permiso&gt;); no modifica datos»). Orden y mensaje: propuesta</td>
<td>Fase A v6 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-38 CA-6, HU-40 CA-1, HU-40 CA-2, HU-40 CA-3, HU-40 CA-5</td>
</tr>
<tr class="odd">
<td><strong>RN-RP11</strong></td>
<td>La matriz inicial de permisos por rol no está definida: el sistema no la fija y los permisos se cargan con asignar().</td>
<td>Diccionario v6, Fase A v6, Alcance 1.2 y sección 1.7 (ninguna la define). Lo no definido: P-75</td>
<td>Sin definir (P-75)</td>
<td>HU-40 CA-3</td>
</tr>
<tr class="even">
<td><strong>RN-RP12</strong></td>
<td>El Responsable de Activos otorga, retira y consulta permisos por rol.</td>
<td>Alcance 1.2 («consulta, por parte del Responsable de Activos, de los permisos asignados a cada rol»): respalda solo la consulta. Otorgar y retirar: Supuesto (P-74)</td>
<td>Alcance 1.2 + Supuesto, pendiente de validar con el cliente</td>
<td>Antecedentes de HU-38 a HU-40 (actor)</td>
</tr>
<tr class="odd">
<td><strong>RN-CA01</strong></td>
<td>ID_Categoria identifica de forma única la categoría; lo genera el sistema y no se modifica (PK sin setter).</td>
<td>Diccionario v6 (PK) y UML v6 (PK sin setter). Generación automática: propuesta</td>
<td>Diccionario v6 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-41 CA-1, HU-43 CA-5</td>
</tr>
<tr class="even">
<td><strong>RN-CA02</strong></td>
<td>Nombre_Categoria es obligatorio; activo lo asigna el sistema (TRUE).</td>
<td>Diccionario v6 (Obligatorio; activo: «valor inicial TRUE»)</td>
<td>Diccionario v6</td>
<td>HU-41 CA-1, HU-41 CA-2, HU-43 CA-1, HU-43 CA-2</td>
</tr>
<tr class="odd">
<td><strong>RN-CA03</strong></td>
<td>Longitud máxima: Nombre_Categoria 50 caracteres.</td>
<td>Diccionario v6 (Longitud)</td>
<td>Diccionario v6</td>
<td>HU-41 CA-3, HU-43 CA-2</td>
</tr>
<tr class="even">
<td><strong>RN-CA04</strong></td>
<td>Nombre_Categoria es único entre todas las categorías, activas e inactivas; no distingue mayúsculas de minúsculas; existeNombreCategoria() (INTERNO) protege la regla dentro de crear() y actualizar(), y al actualizar no cuenta a la propia categoría.</td>
<td>Diccionario v6 (Unique) y Fase A v6 (existeNombreCategoria). No distinguir mayúsculas, contar a las inactivas y excluir a la propia categoría: propuesta (P-81)</td>
<td>Diccionario v6 + Fase A v6 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-41 CA-4, HU-43 CA-3</td>
</tr>
<tr class="odd">
<td><strong>RN-CA05</strong></td>
<td>listarActivas trae solo las categorías con activo = TRUE, ordenadas por Nombre_Categoria; no lista las inactivas; si no hay, se informa.</td>
<td>Fase A v6 (listarActivas [Nuevo]: «ordenadas por nombre»; RN propuesta). Mensaje: propuesta</td>
<td>Fase A v6 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-41 CA-5, HU-42 CA-3, HU-42 CA-5, HU-42 CA-6, HU-44 CA-7</td>
</tr>
<tr class="even">
<td><strong>RN-CA06</strong></td>
<td>buscarPorId devuelve la categoría con sus 3 campos, esté activa o inactiva; si no existe, cualquier operación sobre ella lo informa.</td>
<td>Diccionario v6 (PK) y Fase A v6 (buscarPorId). Incluir inactivas y mensajes: propuesta</td>
<td>Diccionario v6 + Fase A v6; mensajes: propuesta</td>
<td>HU-42 CA-1, HU-42 CA-2, HU-42 CA-4, HU-43 CA-6, HU-44 CA-4</td>
</tr>
<tr class="odd">
<td><strong>RN-CA07</strong></td>
<td>actualizar() modifica solo Nombre_Categoria; ID_Categoria y activo no se modifican (activo solo cambia con inactivar()).</td>
<td>Fase A v6 (actualizar: «modifica el nombre de una categoría»). Inmutabilidad de ID_Categoria y activo: propuesta (patrón RN-C12)</td>
<td>Fase A v6 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-43 CA-1, HU-43 CA-5</td>
</tr>
<tr class="even">
<td><strong>RN-CA08</strong></td>
<td>No se actualiza una categoría inactiva.</td>
<td>Propuesta (patrón RN-U11)</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-43 CA-4</td>
</tr>
<tr class="odd">
<td><strong>RN-CA09</strong></td>
<td>Inactivar pone activo = FALSE; el registro nunca se elimina (jamás DELETE) y no existe reactivar.</td>
<td>Diccionario v6 (activo: baja lógica, jamás DELETE) y Fase A v6 (inactivar: «cambia activo a FALSE»; sin método de reactivación)</td>
<td>Diccionario v6 + Fase A v6</td>
<td>HU-44 CA-1, HU-44 CA-7</td>
</tr>
<tr class="even">
<td><strong>RN-CA10</strong></td>
<td>Una categoría que ya está inactiva no se vuelve a inactivar.</td>
<td>Propuesta (patrón RN-C13 y RN-U13)</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-44 CA-3</td>
</tr>
<tr class="odd">
<td><strong>RN-CA11</strong></td>
<td>Antes de inactivar, el sistema explica la consecuencia (no se podrán registrar activos ni solicitudes con ella y no se puede reactivar) y permite desistir.</td>
<td>Propuesta (patrón RN-C16 y RN-U14)</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-44 CA-1, HU-44 CA-2</td>
</tr>
<tr class="even">
<td><strong>RN-CA12</strong></td>
<td>No se inactiva una categoría que tenga activos sin dar de baja (Disponible, Asignado o Dañado) ni solicitudes Pendientes (opción A; ver P-82). Orden de verificación: activos y después solicitudes. Los activos en Baja no bloquean.</td>
<td>Propuesta (coherente con RN-C14 y RN-U15)</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-44 CA-5</td>
</tr>
<tr class="odd">
<td><strong>RN-CA13</strong></td>
<td>Una categoría inactiva no admite activos ni solicitudes nuevos: inactivarla hace efectivas las reglas que ya exigen una categoría activa en Activo.crear (RN-A09) y en Solicitud.crear (RN-S07).</td>
<td>RN-A09 (piloto) y RN-S07 (Bloque 2), ambas propuestas; Fase A v6 (listarActivas)</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-44 CA-6</td>
</tr>
<tr class="even">
<td><strong>RN-CA14</strong></td>
<td>El Responsable de Activos registra, consulta, actualiza e inactiva categorías; el Empleado consulta las categorías activas al solicitar un equipo (actor secundario de HU-42).</td>
<td>Fase A v6 (listarActivas: necesidades N-01 y N-03). Asignar cada acción al Responsable de Activos y la consulta del Empleado: Supuesto (P-74, P-87)</td>
<td>Supuesto, pendiente de validar con el cliente</td>
<td>Antecedentes de HU-41 a HU-44 (actor), HU-42 CA-6</td>
</tr>
<tr class="odd">
<td><strong>RN-AU01</strong></td>
<td>ID_Auditoria identifica de forma única el registro de auditoría; lo genera el sistema y no se modifica (PK sin setter).</td>
<td>Diccionario v6 (PK) y UML v6 (PK sin setter). Generación automática: propuesta</td>
<td>Diccionario v6 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-45 CA-1</td>
</tr>
<tr class="even">
<td><strong>RN-AU02</strong></td>
<td>Los registros de auditoría los crea registrar() (INTERNO), que invocan las demás operaciones; ningún actor lo pide y no tiene HU.</td>
<td>Diccionario v6 y CRF-002, cambio 0.8 (registrar() INTERNO)</td>
<td>Diccionario v6 + CRF-002</td>
<td>Nota de HU-45 y A.6</td>
</tr>
<tr class="odd">
<td><strong>RN-AU03</strong></td>
<td>ID_Usuario, Entidad, ID_Registro y Accion son obligatorios; Detalle es opcional (hasta 300 caracteres); Fecha_Accion la asigna el sistema (fecha y hora actuales).</td>
<td>Diccionario v6 (Obligatorio; Longitud; Fecha_Accion: «Asignado por el sistema»)</td>
<td>Diccionario v6</td>
<td>HU-45 CA-1, HU-45 CA-2</td>
</tr>
<tr class="even">
<td><strong>RN-AU04</strong></td>
<td>ID_Usuario es el usuario que ejecutó la acción (FK hacia Usuario); se toma del usuario en sesión.</td>
<td>Diccionario v6 (FK hacia Usuario: «Usuario que ejecutó la acción»). Que salga de la sesión: propuesta</td>
<td>Diccionario v6 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-45 CA-6</td>
</tr>
<tr class="odd">
<td><strong>RN-AU05</strong></td>
<td>Entidad guarda el nombre de la tabla afectada (hasta 50 caracteres); no es un ENUM.</td>
<td>Diccionario v6 (Entidad: «Nombre de la tabla afectada»; VARCHAR(50)). Lista de valores: P-98</td>
<td>Diccionario v6; lista de valores: sin definir (P-98)</td>
<td>A.6 (columna Entidad)</td>
</tr>
<tr class="even">
<td><strong>RN-AU06</strong></td>
<td>ID_Registro es una referencia lógica, no una FK: el registro afectado puede no existir ya en su entidad y el registro de auditoría se conserva y se muestra igual.</td>
<td>Diccionario v6 (ID_Registro: «Referencia lógica ... no es una FK física») y UML v6</td>
<td>Diccionario v6 + UML v6</td>
<td>HU-45 CA-5</td>
</tr>
<tr class="odd">
<td><strong>RN-AU07</strong></td>
<td>Accion solo toma los 10 valores de Accion_Auditoria (Crear, Consultar, Actualizar, Inactivar, Aprobar, Rechazar, Notificar, Asignar, Devolver, Reportar); Inactivar cubre inactivar, darDeBaja, cancelar y cerrar.</td>
<td>Diccionario v6 (ENUM; observación de Accion) y CRF-002, cambio 0.6</td>
<td>Diccionario v6 + CRF-002</td>
<td>A.6 (columna Accion_Auditoria)</td>
</tr>
<tr class="even">
<td><strong>RN-AU08</strong></td>
<td>El campo Detalle nunca contiene contraseñas.</td>
<td>RN-T01 del Bloque 6a (regla transversal propuesta)</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>Nota de HU-45 y A.6 (¿Detalle?)</td>
</tr>
<tr class="odd">
<td><strong>RN-AU09</strong></td>
<td>Los registros de auditoría son inmutables: no existe operación para modificarlos ni borrarlos.</td>
<td>UML v6 y Fase A v6 (Auditoria solo tiene registrar() y buscarPorId()). Que sea una regla explícita: propuesta</td>
<td>UML v6 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-45 CA-1</td>
</tr>
<tr class="even">
<td><strong>RN-AU11</strong></td>
<td>Auditar una operación no cambia su resultado para el usuario salvo que falle el registro; qué pasa entonces no está definido.</td>
<td>CRF-002, §4 (si una operación debe fallar cuando falla su registro de auditoría). P-96</td>
<td>Sin definir (P-96)</td>
<td>Nota de A.6 y P-96</td>
</tr>
<tr class="odd">
<td><strong>RN-AU12</strong></td>
<td>Una operación sin valor propio en Accion_Auditoria (firmar, iniciar sesión, retirar permiso, asignar permiso, cambio de responsable) no se resuelve en este bloque: se propone un valor y queda en preguntas.</td>
<td>Diccionario v6 (valores de Accion) y bloques 4a, 6a y 6b. P-91 a P-95</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>A.6 (filas sin valor propio)</td>
</tr>
<tr class="even">
<td><strong>RN-AU13</strong></td>
<td>buscarPorId devuelve un solo registro de auditoría con sus 7 campos o informa que no existe.</td>
<td>Diccionario v6 (PK) y Fase A v6 (buscarPorId). Mensaje: propuesta</td>
<td>Diccionario v6 + Fase A v6; mensaje: propuesta</td>
<td>HU-45 CA-1, HU-45 CA-3</td>
</tr>
<tr class="odd">
<td><strong>RN-AU14</strong></td>
<td>ID_Auditoria debe ser un entero positivo; un valor vacío, cero, negativo o no numérico se informa como no válido.</td>
<td>Propuesta (el diccionario define INT)</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-45 CA-4</td>
</tr>
<tr class="even">
<td><strong>RN-AU15</strong></td>
<td>Solo el Gerente consulta registros de auditoría; los demás roles reciben un mensaje de falta de permiso.</td>
<td>Alcance 1.2 no nombra al actor: Supuesto (P-88)</td>
<td>Supuesto, pendiente de validar con el cliente</td>
<td>HU-45 CA-7</td>
</tr>
<tr class="odd">
<td><strong>RN-AU16</strong></td>
<td>La consulta muestra el registro aunque su usuario esté inactivo (baja lógica: el usuario no se elimina).</td>
<td>Diccionario v6 (FK hacia Usuario; «jamás DELETE»)</td>
<td>Diccionario v6 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-45 CA-6</td>
</tr>
<tr class="even">
<td><strong>RN-AU17</strong></td>
<td>La consulta de un registro de auditoría no genera, a su vez, otro registro de auditoría.</td>
<td>Propuesta (P-90)</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>A.6 (fila de HU-45)</td>
</tr>
<tr class="odd">
<td><strong>RN-R01</strong></td>
<td>Reportes es una vista (consulta) sobre Activo, Asignacion y Devolucion: no almacena datos, no tiene PK ni FK y siempre refleja los datos actuales.</td>
<td>Diccionario v6 (Vista Reportes) y UML v6 («view», dependencias «use»)</td>
<td>Diccionario v6 + UML v6</td>
<td>HU-46 CA-1</td>
</tr>
<tr class="even">
<td><strong>RN-R02</strong></td>
<td>Fecha_Inicio y Tipo_Reporte son obligatorios; Fecha_Fin es opcional.</td>
<td>Diccionario v6 (Obligatorio)</td>
<td>Diccionario v6</td>
<td>HU-46 CA-1, HU-46 CA-2, HU-46 CA-5</td>
</tr>
<tr class="odd">
<td><strong>RN-R03</strong></td>
<td>Tipo_Reporte solo toma los valores Asignados, Disponibles, Pendientes_Devolucion y Mal_Estado.</td>
<td>Diccionario v6 (ENUM, valores fijos según el Alcance 1.2)</td>
<td>Diccionario v6</td>
<td>HU-46 CA-1, HU-46 CA-5</td>
</tr>
<tr class="even">
<td><strong>RN-R04</strong></td>
<td>Si Fecha_Fin está vacía, el rango llega hasta la fecha actual.</td>
<td>Propuesta (P-104)</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-46 CA-3</td>
</tr>
<tr class="odd">
<td><strong>RN-R05</strong></td>
<td>Fecha_Fin no puede ser anterior a Fecha_Inicio; una Fecha_Fin igual a Fecha_Inicio es válida.</td>
<td>Propuesta (P-104)</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-46 CA-4</td>
</tr>
<tr class="even">
<td><strong>RN-R06</strong></td>
<td>Asignados: asignaciones Vigentes con Fecha_Entrega dentro del rango.</td>
<td>Alcance 1.2 («activos asignados»). Qué fecha filtra y que sean Vigentes: propuesta (P-101, P-102)</td>
<td>Alcance 1.2 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-46 CA-1, HU-46 CA-3</td>
</tr>
<tr class="odd">
<td><strong>RN-R07</strong></td>
<td>Pendientes_Devolucion: asignaciones Vigentes con Fecha_Devolucion_Esperada dentro del rango, con el Estado_Recepcion de su devolución si existe.</td>
<td>Alcance 1.2 («pendientes por devolver»). Qué fecha filtra y que incluya las que ya tienen devolución registrada: propuesta (P-101, P-102)</td>
<td>Alcance 1.2 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-46 CA-1</td>
</tr>
<tr class="even">
<td><strong>RN-R08</strong></td>
<td>Disponibles: activos en Estado Disponible; refleja el estado actual y las fechas no filtran.</td>
<td>Alcance 1.2 («disponibles»). Activo no tiene fecha: propuesta (P-101)</td>
<td>Alcance 1.2 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-46 CA-1</td>
</tr>
<tr class="odd">
<td><strong>RN-R09</strong></td>
<td>Mal_Estado: activos en Estado Dañado; refleja el estado actual y las fechas no filtran; un activo en Baja no es mal estado.</td>
<td>Alcance 1.2 («en mal estado»). Que sea solo Dañado y que las fechas no filtren: propuesta (P-101, P-102)</td>
<td>Alcance 1.2 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-46 CA-1</td>
</tr>
<tr class="even">
<td><strong>RN-R10</strong></td>
<td>Columnas de cada reporte, tomadas solo de Activo, Asignacion y Devolucion, sin indicadores calculados: Asignados (8), Pendientes_Devolucion (6), Disponibles (6) y Mal_Estado (6), como en el resultado esperado de HU-46 CA-1.</td>
<td>Diccionario v6 (la vista usa solo esas tres tablas). Columnas: propuesta (P-103)</td>
<td>Diccionario v6 + RN propuesta, pendiente de validar con el cliente</td>
<td>HU-46 CA-1</td>
</tr>
<tr class="odd">
<td><strong>RN-R11</strong></td>
<td>Orden: Asignados por Fecha_Entrega, la más reciente primero; Pendientes_Devolucion por Fecha_Devolucion_Esperada, la más próxima primero; Disponibles y Mal_Estado por ID_Activo ascendente.</td>
<td>Propuesta (P-103)</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-46 CA-1</td>
</tr>
<tr class="even">
<td><strong>RN-R12</strong></td>
<td>Un reporte sin filas se informa con un mensaje informativo.</td>
<td>Propuesta (patrón de los listados sin resultados)</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>HU-46 CA-6</td>
</tr>
<tr class="odd">
<td><strong>RN-R13</strong></td>
<td>Regla transversal (RN/RNF): cada consulta de reporte se registra en Auditoria con Accion = Reportar. No se repite en los criterios de aceptación.</td>
<td>Diccionario v6 (Vista Reportes) y UML v6. ID_Registro de la vista: P-97</td>
<td>Diccionario v6 + UML v6; ID_Registro: sin definir (P-97)</td>
<td>Nota de HU-46</td>
</tr>
<tr class="even">
<td><strong>RN-R14</strong></td>
<td>Solo el Gerente consulta reportes; los demás roles reciben un mensaje de falta de permiso.</td>
<td>Alcance 1.2 no nombra al actor: Supuesto (P-88)</td>
<td>Supuesto, pendiente de validar con el cliente</td>
<td>HU-46 CA-7</td>
</tr>
<tr class="odd">
<td><strong>RN-R15</strong></td>
<td>consultar() no modifica datos.</td>
<td>Diccionario v6 y UML v6 (vista de solo lectura)</td>
<td>Diccionario v6 + UML v6</td>
<td>HU-46 CA-1</td>
</tr>
<tr class="even">
<td><strong>RN-R16</strong></td>
<td>El UML declara que consultar() devuelve «Reporte», que no es una clase del modelo: se trata como un listado de filas.</td>
<td>UML v6 (hallazgo; ver C.8)</td>
<td>Sin resolver (C.8)</td>
<td>HU-46 CA-1</td>
</tr>
<tr class="odd">
<td><strong>RN-T01</strong></td>
<td>El campo Detalle de Auditoria nunca contiene contraseñas, ni en texto plano ni cifradas.</td>
<td>Propuesta (RN transversal; se compila en el bloque de Auditoria)</td>
<td>RN propuesta, pendiente de validar con el cliente</td>
<td>Transversal: se verifica en Auditoria (RN-AU08); HU-32 a HU-37 no la repiten</td>
</tr>
<tr class="even">
<td><p><strong>RN-T02</strong></p>
<p><strong>(antes RN-AU10)</strong></p></td>
<td>Regla transversal (RN/RNF): cada operación auditable de las HU-01 a HU-46 deja un registro en Auditoria con la Accion y la Entidad de la tabla A.6; las operaciones sin Accion definida quedan en preguntas.</td>
<td>Alcance 1.2 («mantener un registro completo de auditoría de todas las acciones relevantes (asignaciones, devoluciones, cambios de responsable y bajas)»). Cuáles son «relevantes»: propuesta (P-06, P-89)</td>
<td>Alcance 1.2 + RN propuesta, pendiente de validar con el cliente</td>
<td>Tabla de operaciones auditables (sección G)</td>
</tr>
<tr class="odd">
<td><strong>RN-T03</strong></td>
<td>ID_Custodio (de la solicitud y del reporte de daño), ID_Aprobador, ID_Receptor e ID_Tecnico salen del usuario en sesión; no se digitan.</td>
<td>RN-S10, RN-AP12, RN-D13, RN-RD06 y RN-H09, que ya lo dicen entidad por entidad. Regla transversal propuesta en la consolidación de la Fase C (cambio 7)</td>
<td>RN propuesta, pendiente de validar con el cliente (P-105)</td>
<td>Escenarios vigentes, sin agregar nuevos: HU-09 CA-1, HU-09 CA-5; HU-13 CA-7; HU-22 CA-2, HU-24 CA-1; HU-26 CA-1; HU-29 CA-1, HU-29 CA-7</td>
</tr>
</tbody>
</table>

**E. Catálogo de mensajes (M-01 a M-273)**

Sin códigos repetidos. M-66 y M-67 pasan a tipo Informativo. M-272 y M-273 son los dos mensajes del Bloque 2 que antes se llamaban M-92 y M-93 (M-92 y M-93 quedan para la adenda de HU-10 y para HU-15).

| **Código** | **Mensaje**                                                                                                                                                                                                                            | **Tipo**                                                 | **HU**                                          |
|------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------|-------------------------------------------------|
| **M-01**   | Activo registrado correctamente.                                                                                                                                                                                                       | Éxito                                                    | HU-01                                           |
| **M-02**   | El modelo es obligatorio.                                                                                                                                                                                                              | Error                                                    | HU-01, HU-03                                    |
| **M-03**   | El modelo no puede superar 50 caracteres.                                                                                                                                                                                              | Error                                                    | HU-01, HU-03                                    |
| **M-04**   | El número de serie es obligatorio.                                                                                                                                                                                                     | Error                                                    | HU-01, HU-03                                    |
| **M-05**   | El número de serie no puede superar 20 caracteres.                                                                                                                                                                                     | Error                                                    | HU-01, HU-03                                    |
| **M-06**   | El número de serie ya está registrado.                                                                                                                                                                                                 | Error                                                    | HU-01, HU-03                                    |
| **M-07**   | La categoría es obligatoria.                                                                                                                                                                                                           | Error                                                    | HU-01, HU-03                                    |
| **M-08**   | La categoría seleccionada está inactiva.                                                                                                                                                                                               | Error                                                    | HU-01, HU-03                                    |
| **M-09**   | La categoría seleccionada no existe.                                                                                                                                                                                                   | Error                                                    | HU-01, HU-03                                    |
| **M-10**   | La marca es obligatoria.                                                                                                                                                                                                               | Error                                                    | HU-01, HU-03                                    |
| **M-11**   | La marca no puede superar 50 caracteres.                                                                                                                                                                                               | Error                                                    | HU-01, HU-03                                    |
| **M-12**   | La placa de inventario es obligatoria.                                                                                                                                                                                                 | Error                                                    | HU-01, HU-03                                    |
| **M-13**   | La placa de inventario no puede superar 11 caracteres.                                                                                                                                                                                 | Error                                                    | HU-01, HU-03                                    |
| **M-14**   | La placa de inventario ya está registrada.                                                                                                                                                                                             | Error                                                    | HU-01, HU-03                                    |
| **M-15**   | La ubicación no puede superar 100 caracteres.                                                                                                                                                                                          | Error                                                    | HU-01, HU-03                                    |
| **M-16**   | No hay activos registrados.                                                                                                                                                                                                            | Informativo                                              | HU-02                                           |
| **M-17**   | No se encontró ningún activo con esa placa de inventario.                                                                                                                                                                              | Error                                                    | HU-02                                           |
| **M-18**   | No se encontró ningún activo con ese identificador.                                                                                                                                                                                    | Error                                                    | HU-02                                           |
| **M-19**   | No se encontró ningún activo con ese número de serie.                                                                                                                                                                                  | Error                                                    | HU-02                                           |
| **M-20**   | Activo actualizado correctamente.                                                                                                                                                                                                      | Éxito                                                    | HU-03                                           |
| **M-21**   | El activo no existe.                                                                                                                                                                                                                   | Error                                                    | HU-03, HU-04, HU-15, HU-16, HU-26, HU-29, HU-30 |
| **M-22**   | El estado Asignado solo se asigna al entregar el equipo.                                                                                                                                                                               | Error                                                    | HU-03                                           |
| **M-23**   | El estado Baja solo se asigna dando de baja el activo.                                                                                                                                                                                 | Error                                                    | HU-03                                           |
| **M-24**   | El estado no es válido.                                                                                                                                                                                                                | Error                                                    | HU-03                                           |
| **M-25**   | El identificador del activo no se puede modificar.                                                                                                                                                                                     | Error                                                    | HU-03                                           |
| **M-26**   | Un activo asignado no puede cambiar de estado hasta cerrar su asignación.                                                                                                                                                              | Error                                                    | HU-03                                           |
| **M-27**   | Un activo en baja no se puede editar.                                                                                                                                                                                                  | Error                                                    | HU-03                                           |
| **M-28**   | Activo dado de baja correctamente.                                                                                                                                                                                                     | Éxito                                                    | HU-04                                           |
| **M-29**   | Baja cancelada. El activo no fue modificado.                                                                                                                                                                                           | Informativo                                              | HU-04                                           |
| **M-30**   | El activo \<placa\> pasará a estado Baja y dejará de estar disponible para asignarse. El registro no se elimina. ¿Desea continuar?                                                                                                     | Confirmación                                             | HU-04                                           |
| **M-31**   | El activo está asignado. Cierre su asignación antes de darlo de baja.                                                                                                                                                                  | Error                                                    | HU-04                                           |
| **M-32**   | El activo ya está dado de baja.                                                                                                                                                                                                        | Error                                                    | HU-04                                           |
| **M-33**   | Custodio registrado correctamente.                                                                                                                                                                                                     | Éxito                                                    | HU-05                                           |
| **M-34**   | El número de documento es obligatorio.                                                                                                                                                                                                 | Error                                                    | HU-05, HU-07                                    |
| **M-35**   | El número de documento no puede superar 20 caracteres.                                                                                                                                                                                 | Error                                                    | HU-05, HU-07                                    |
| **M-36**   | El tipo de documento es obligatorio.                                                                                                                                                                                                   | Error                                                    | HU-05, HU-07                                    |
| **M-37**   | El tipo de documento no es válido.                                                                                                                                                                                                     | Error                                                    | HU-05, HU-07                                    |
| **M-38**   | El usuario es obligatorio.                                                                                                                                                                                                             | Error                                                    | HU-05                                           |
| **M-39**   | El usuario está inactivo.                                                                                                                                                                                                              | Error                                                    | HU-05, HU-24, HU-29                             |
| **M-40**   | El usuario no existe.                                                                                                                                                                                                                  | Error                                                    | HU-05, HU-24, HU-29                             |
| **M-41**   | El usuario no tiene el rol Empleado.                                                                                                                                                                                                   | Error                                                    | HU-05                                           |
| **M-42**   | El usuario ya está registrado como custodio.                                                                                                                                                                                           | Error                                                    | HU-05                                           |
| **M-43**   | La dirección es obligatoria.                                                                                                                                                                                                           | Error                                                    | HU-05, HU-07                                    |
| **M-44**   | La dirección no puede superar 200 caracteres.                                                                                                                                                                                          | Error                                                    | HU-05, HU-07                                    |
| **M-45**   | Ya existe un custodio con ese tipo y número de documento.                                                                                                                                                                              | Error                                                    | HU-05, HU-07                                    |
| **M-46**   | No se encontró ningún custodio con ese documento.                                                                                                                                                                                      | Error                                                    | HU-06                                           |
| **M-47**   | No se encontró ningún custodio con ese identificador.                                                                                                                                                                                  | Error                                                    | HU-06                                           |
| **M-48**   | No se encontró ningún custodio para ese usuario.                                                                                                                                                                                       | Error                                                    | HU-06                                           |
| **M-49**   | Custodio actualizado correctamente.                                                                                                                                                                                                    | Éxito                                                    | HU-07                                           |
| **M-50**   | El custodio no existe.                                                                                                                                                                                                                 | Error                                                    | HU-07, HU-08, HU-16                             |
| **M-51**   | El custodio solo se inactiva con la baja.                                                                                                                                                                                              | Error                                                    | HU-07                                           |
| **M-52**   | El usuario del custodio no se puede modificar.                                                                                                                                                                                         | Error                                                    | HU-07                                           |
| **M-53**   | La fecha de registro no se puede modificar.                                                                                                                                                                                            | Error                                                    | HU-07                                           |
| **M-54**   | Custodio inactivado correctamente.                                                                                                                                                                                                     | Éxito                                                    | HU-08                                           |
| **M-55**   | El custodio con documento \<tipo\> \<número\> pasará a estado inactivo. El registro no se elimina, no se puede reactivar y su usuario no podrá registrarse de nuevo como custodio. ¿Desea continuar?                                   | Confirmación (la frase sobre el usuario depende de P-14) | HU-08                                           |
| **M-56**   | El custodio tiene asignaciones vigentes. Ciérrelas antes de inactivarlo.                                                                                                                                                               | Error (opción A, pendiente de P-13)                      | HU-08                                           |
| **M-57**   | El custodio tiene solicitudes pendientes. Cancélelas antes de inactivarlo.                                                                                                                                                             | Error (opción A, pendiente de P-13)                      | HU-08                                           |
| **M-58**   | El custodio ya está inactivo.                                                                                                                                                                                                          | Error                                                    | HU-08                                           |
| **M-59**   | Inactivación cancelada. El custodio no fue modificado.                                                                                                                                                                                 | Informativo                                              | HU-08                                           |
| **M-60**   | El custodio es obligatorio.                                                                                                                                                                                                            | Error                                                    | HU-09                                           |
| **M-61**   | El custodio está inactivo.                                                                                                                                                                                                             | Error                                                    | HU-09                                           |
| **M-62**   | El empleado no está registrado como custodio.                                                                                                                                                                                          | Error                                                    | HU-09                                           |
| **M-63**   | El motivo es obligatorio.                                                                                                                                                                                                              | Error                                                    | HU-09, HU-11                                    |
| **M-64**   | El motivo no puede superar 255 caracteres.                                                                                                                                                                                             | Error                                                    | HU-09, HU-11                                    |
| **M-65**   | Solicitud registrada correctamente.                                                                                                                                                                                                    | Éxito                                                    | HU-09                                           |
| **M-66**   | El custodio no tiene solicitudes.                                                                                                                                                                                                      | Informativo                                              | HU-10                                           |
| **M-67**   | No hay solicitudes pendientes.                                                                                                                                                                                                         | Informativo                                              | HU-10                                           |
| **M-68**   | No se encontró ninguna solicitud con ese identificador.                                                                                                                                                                                | Error                                                    | HU-10                                           |
| **M-69**   | No tiene acceso a esa solicitud.                                                                                                                                                                                                       | Error                                                    | HU-10, HU-11, HU-12, HU-14                      |
| **M-70**   | El custodio de la solicitud no se puede modificar.                                                                                                                                                                                     | Error                                                    | HU-11                                           |
| **M-71**   | El estado de la solicitud cambia con la decisión o la cancelación.                                                                                                                                                                     | Error                                                    | HU-11                                           |
| **M-72**   | El identificador de la solicitud no se puede modificar.                                                                                                                                                                                | Error                                                    | HU-11                                           |
| **M-73**   | La fecha de la solicitud no se puede modificar.                                                                                                                                                                                        | Error                                                    | HU-11                                           |
| **M-74**   | La solicitud no existe.                                                                                                                                                                                                                | Error                                                    | HU-11, HU-12, HU-13, HU-14, HU-15               |
| **M-75**   | Solicitud actualizada correctamente.                                                                                                                                                                                                   | Éxito                                                    | HU-11                                           |
| **M-76**   | Solo se puede actualizar una solicitud pendiente.                                                                                                                                                                                      | Error                                                    | HU-11                                           |
| **M-77**   | La solicitud \<id\> pasará a estado Cancelada. El registro no se elimina y no se puede reactivar. ¿Desea continuar?                                                                                                                    | Confirmación                                             | HU-12                                           |
| **M-78**   | La solicitud ya está cancelada.                                                                                                                                                                                                        | Error                                                    | HU-12                                           |
| **M-79**   | Operación cancelada. La solicitud no fue modificada.                                                                                                                                                                                   | Informativo                                              | HU-12                                           |
| **M-80**   | Solicitud cancelada correctamente.                                                                                                                                                                                                     | Éxito                                                    | HU-12                                           |
| **M-81**   | Solo se puede cancelar una solicitud pendiente.                                                                                                                                                                                        | Error                                                    | HU-12                                           |
| **M-82**   | Decisión registrada correctamente.                                                                                                                                                                                                     | Éxito                                                    | HU-13                                           |
| **M-83**   | El motivo del rechazo es obligatorio.                                                                                                                                                                                                  | Error                                                    | HU-13                                           |
| **M-84**   | El motivo del rechazo no puede superar 300 caracteres.                                                                                                                                                                                 | Error                                                    | HU-13                                           |
| **M-85**   | El usuario no tiene el rol Aprobador.                                                                                                                                                                                                  | Error                                                    | HU-13                                           |
| **M-86**   | La decisión es obligatoria.                                                                                                                                                                                                            | Error                                                    | HU-13                                           |
| **M-87**   | La decisión no es válida.                                                                                                                                                                                                              | Error                                                    | HU-13                                           |
| **M-88**   | La solicitud ya tiene una decisión.                                                                                                                                                                                                    | Error                                                    | HU-13                                           |
| **M-89**   | Solo se puede decidir sobre una solicitud pendiente.                                                                                                                                                                                   | Error                                                    | HU-13                                           |
| **M-90**   | La solicitud aún no tiene decisión.                                                                                                                                                                                                    | Error                                                    | HU-14                                           |
| **M-91**   | La solicitud fue cancelada y no tiene decisión.                                                                                                                                                                                        | Error                                                    | HU-14                                           |
| **M-92**   | No hay solicitudes aprobadas pendientes de asignación.                                                                                                                                                                                 | Informativo                                              | HU-10 (adenda CRF-003)                          |
| **M-93**   | Equipo asignado correctamente.                                                                                                                                                                                                         | Éxito                                                    | HU-15                                           |
| **M-94**   | La solicitud es obligatoria.                                                                                                                                                                                                           | Error                                                    | HU-15                                           |
| **M-95**   | El activo es obligatorio.                                                                                                                                                                                                              | Error                                                    | HU-15, HU-26, HU-29                             |
| **M-96**   | La fecha de devolución esperada es obligatoria.                                                                                                                                                                                        | Error                                                    | HU-15, HU-17                                    |
| **M-97**   | Solo se puede asignar una solicitud aprobada.                                                                                                                                                                                          | Error                                                    | HU-15                                           |
| **M-98**   | La solicitud ya tiene una asignación.                                                                                                                                                                                                  | Error                                                    | HU-15                                           |
| **M-99**   | El activo no está disponible.                                                                                                                                                                                                          | Error                                                    | HU-15                                           |
| **M-100**  | La categoría del activo no coincide con la de la solicitud.                                                                                                                                                                            | Error                                                    | HU-15                                           |
| **M-101**  | La fecha de devolución esperada no puede ser anterior a la fecha de entrega.                                                                                                                                                           | Error                                                    | HU-15, HU-17                                    |
| **M-102**  | No se encontró ninguna asignación con ese identificador.                                                                                                                                                                               | Error                                                    | HU-16                                           |
| **M-103**  | No hay asignaciones vigentes.                                                                                                                                                                                                          | Informativo                                              | HU-16                                           |
| **M-104**  | El custodio no tiene asignaciones.                                                                                                                                                                                                     | Informativo                                              | HU-16                                           |
| **M-105**  | El activo no tiene una asignación vigente.                                                                                                                                                                                             | Informativo                                              | HU-16, HU-24                                    |
| **M-106**  | No tiene acceso a esa asignación.                                                                                                                                                                                                      | Error                                                    | HU-16                                           |
| **M-107**  | Asignación actualizada correctamente.                                                                                                                                                                                                  | Éxito                                                    | HU-17                                           |
| **M-108**  | La asignación no existe.                                                                                                                                                                                                               | Error                                                    | HU-17, HU-18, HU-19, HU-20, HU-21, HU-25        |
| **M-109**  | El identificador de la asignación no se puede modificar.                                                                                                                                                                               | Error                                                    | HU-17                                           |
| **M-110**  | La fecha de entrega no se puede modificar.                                                                                                                                                                                             | Error                                                    | HU-17                                           |
| **M-111**  | El estado de la asignación solo cambia al cerrarla.                                                                                                                                                                                    | Error                                                    | HU-17                                           |
| **M-112**  | El custodio de la asignación no se puede modificar.                                                                                                                                                                                    | Error                                                    | HU-17                                           |
| **M-113**  | El activo de la asignación no se puede modificar.                                                                                                                                                                                      | Error                                                    | HU-17                                           |
| **M-114**  | La solicitud de la asignación no se puede modificar.                                                                                                                                                                                   | Error                                                    | HU-17                                           |
| **M-115**  | Una asignación cerrada no se puede modificar.                                                                                                                                                                                          | Error                                                    | HU-17                                           |
| **M-116**  | Asignación cerrada correctamente.                                                                                                                                                                                                      | Éxito                                                    | HU-18                                           |
| **M-117**  | La asignación \<id\> pasará a estado Cerrada y el activo \<placa\> quedará Disponible, salvo que esté Dañado. El registro no se elimina y no se puede reactivar. ¿Desea continuar?                                                     | Confirmación                                             | HU-18                                           |
| **M-118**  | Se desistió de cerrar la asignación. La asignación no fue modificada.                                                                                                                                                                  | Informativo                                              | HU-18                                           |
| **M-119**  | La asignación no se puede cerrar sin una devolución confirmada.                                                                                                                                                                        | Error                                                    | HU-18                                           |
| **M-120**  | La asignación ya está cerrada.                                                                                                                                                                                                         | Error                                                    | HU-18, HU-24                                    |
| **M-121**  | Acta firmada correctamente.                                                                                                                                                                                                            | Éxito                                                    | HU-19                                           |
| **M-122**  | La asignación es obligatoria.                                                                                                                                                                                                          | Error                                                    | HU-19, HU-21                                    |
| **M-123**  | La ruta del acta es obligatoria.                                                                                                                                                                                                       | Error                                                    | HU-19                                           |
| **M-124**  | La ruta del acta no puede superar 255 caracteres.                                                                                                                                                                                      | Error                                                    | HU-19                                           |
| **M-125**  | La firma digital es obligatoria.                                                                                                                                                                                                       | Error                                                    | HU-19                                           |
| **M-126**  | La firma digital no puede superar 255 caracteres.                                                                                                                                                                                      | Error                                                    | HU-19                                           |
| **M-127**  | Solo se puede firmar el acta de una asignación vigente.                                                                                                                                                                                | Error                                                    | HU-19                                           |
| **M-128**  | La asignación ya tiene un acta.                                                                                                                                                                                                        | Error                                                    | HU-19                                           |
| **M-129**  | Solo el custodio de la asignación puede firmar su acta.                                                                                                                                                                                | Error                                                    | HU-19                                           |
| **M-130**  | La asignación aún no tiene acta.                                                                                                                                                                                                       | Informativo                                              | HU-20                                           |
| **M-131**  | No tiene acceso a esa acta.                                                                                                                                                                                                            | Error                                                    | HU-20                                           |
| **M-132**  | Devolución registrada correctamente.                                                                                                                                                                                                   | Éxito                                                    | HU-21                                           |
| **M-133**  | Las observaciones no pueden superar 255 caracteres.                                                                                                                                                                                    | Error                                                    | HU-21, HU-23                                    |
| **M-134**  | Solo se puede registrar la devolución de una asignación vigente.                                                                                                                                                                       | Error                                                    | HU-21                                           |
| **M-135**  | La asignación ya tiene una devolución.                                                                                                                                                                                                 | Error                                                    | HU-21                                           |
| **M-136**  | Solo el custodio de la asignación puede registrar su devolución.                                                                                                                                                                       | Error                                                    | HU-21                                           |
| **M-137**  | No se encontró ninguna devolución con ese identificador.                                                                                                                                                                               | Error                                                    | HU-22                                           |
| **M-138**  | No hay devoluciones pendientes de recepción.                                                                                                                                                                                           | Informativo                                              | HU-22                                           |
| **M-139**  | No tiene acceso a esa devolución.                                                                                                                                                                                                      | Error                                                    | HU-22                                           |
| **M-140**  | Devolución actualizada correctamente.                                                                                                                                                                                                  | Éxito                                                    | HU-23                                           |
| **M-141**  | La devolución no existe.                                                                                                                                                                                                               | Error                                                    | HU-23, HU-24                                    |
| **M-142**  | El identificador de la devolución no se puede modificar.                                                                                                                                                                               | Error                                                    | HU-23                                           |
| **M-143**  | La fecha de devolución no se puede modificar.                                                                                                                                                                                          | Error                                                    | HU-23                                           |
| **M-144**  | La asignación de la devolución no se puede modificar.                                                                                                                                                                                  | Error                                                    | HU-23                                           |
| **M-145**  | El estado de la recepción solo cambia al confirmarla.                                                                                                                                                                                  | Error                                                    | HU-23                                           |
| **M-146**  | La fecha de confirmación no se puede modificar.                                                                                                                                                                                        | Error                                                    | HU-23                                           |
| **M-147**  | El receptor de la devolución no se puede modificar.                                                                                                                                                                                    | Error                                                    | HU-23                                           |
| **M-148**  | Una devolución confirmada no se puede modificar.                                                                                                                                                                                       | Error                                                    | HU-23                                           |
| **M-149**  | Solo el custodio de la asignación puede actualizar su devolución.                                                                                                                                                                      | Error                                                    | HU-23                                           |
| **M-150**  | Recepción confirmada correctamente.                                                                                                                                                                                                    | Éxito                                                    | HU-24                                           |
| **M-151**  | La recepción de la devolución \<id\> quedará Confirmada, la asignación \<asignación\> pasará a estado Cerrada y el activo \<placa\> quedará Disponible, salvo que esté Dañado. La confirmación no se puede deshacer. ¿Desea continuar? | Confirmación                                             | HU-24                                           |
| **M-152**  | Se desistió de confirmar la recepción. La devolución no fue modificada.                                                                                                                                                                | Informativo                                              | HU-24                                           |
| **M-153**  | La devolución ya está confirmada.                                                                                                                                                                                                      | Error                                                    | HU-24                                           |
| **M-154**  | El usuario no tiene el rol Responsable de Activos.                                                                                                                                                                                     | Error                                                    | HU-24                                           |
| **M-155**  | La asignación no está vigente. No se genera el aviso de devolución.                                                                                                                                                                    | Informativo                                              | HU-25                                           |
| **M-156**  | Aviso de devolución de equipo                                                                                                                                                                                                          | Correo (asunto)                                          | HU-25                                           |
| **M-157**  | Hola \<nombre\>: el equipo \<placa\> que tiene asignado debe devolverse el \<fecha\>. Días restantes: \<días\>.                                                                                                                        | Correo (cuerpo)                                          | HU-25                                           |
| **M-158**  | Devolución de equipo vencida                                                                                                                                                                                                           | Correo (asunto)                                          | HU-25                                           |
| **M-159**  | Hola \<nombre\>: el plazo para devolver el equipo \<placa\> venció el \<fecha\>. Días de retraso: \<días\>.                                                                                                                            | Correo (cuerpo)                                          | HU-25                                           |
| **M-160**  | Reporte de daño registrado correctamente.                                                                                                                                                                                              | Éxito                                                    | HU-26                                           |
| **M-161**  | La descripción del daño es obligatoria.                                                                                                                                                                                                | Error                                                    | HU-26, HU-28                                    |
| **M-162**  | La descripción del daño no puede superar 500 caracteres.                                                                                                                                                                               | Error                                                    | HU-26, HU-28                                    |
| **M-163**  | La evidencia no puede superar 255 caracteres.                                                                                                                                                                                          | Error                                                    | HU-26, HU-28, HU-29, HU-31                      |
| **M-164**  | El tipo de daño es obligatorio.                                                                                                                                                                                                        | Error                                                    | HU-26, HU-28                                    |
| **M-165**  | El tipo de daño no es válido.                                                                                                                                                                                                          | Error                                                    | HU-26, HU-28                                    |
| **M-166**  | El activo está asignado a otro custodio.                                                                                                                                                                                               | Error                                                    | HU-26                                           |
| **M-167**  | Solo se puede reportar un equipo que tiene asignado.                                                                                                                                                                                   | Error                                                    | HU-26                                           |
| **M-168**  | Un activo en baja no se puede reportar.                                                                                                                                                                                                | Error                                                    | HU-26                                           |
| **M-169**  | No se encontró ningún reporte de daño con ese identificador.                                                                                                                                                                           | Error                                                    | HU-27                                           |
| **M-170**  | No hay reportes de daño registrados.                                                                                                                                                                                                   | Informativo                                              | HU-27                                           |
| **M-171**  | No tiene acceso a ese reporte de daño.                                                                                                                                                                                                 | Error                                                    | HU-27                                           |
| **M-172**  | Reporte de daño actualizado correctamente.                                                                                                                                                                                             | Éxito                                                    | HU-28                                           |
| **M-173**  | El reporte de daño no existe.                                                                                                                                                                                                          | Error                                                    | HU-28, HU-29                                    |
| **M-174**  | El identificador del reporte no se puede modificar.                                                                                                                                                                                    | Error                                                    | HU-28                                           |
| **M-175**  | El activo del reporte no se puede modificar.                                                                                                                                                                                           | Error                                                    | HU-28                                           |
| **M-176**  | El custodio del reporte no se puede modificar.                                                                                                                                                                                         | Error                                                    | HU-28                                           |
| **M-177**  | La fecha del reporte no se puede modificar.                                                                                                                                                                                            | Error                                                    | HU-28                                           |
| **M-178**  | Un reporte con mantenimiento asociado no se puede modificar.                                                                                                                                                                           | Error                                                    | HU-28                                           |
| **M-179**  | Solo el custodio que reportó el daño puede actualizar su reporte.                                                                                                                                                                      | Error                                                    | HU-28                                           |
| **M-180**  | Mantenimiento registrado correctamente.                                                                                                                                                                                                | Éxito                                                    | HU-29                                           |
| **M-181**  | El tipo de mantenimiento es obligatorio.                                                                                                                                                                                               | Error                                                    | HU-29                                           |
| **M-182**  | El tipo de mantenimiento no es válido.                                                                                                                                                                                                 | Error                                                    | HU-29                                           |
| **M-183**  | La descripción del mantenimiento es obligatoria.                                                                                                                                                                                       | Error                                                    | HU-29, HU-31                                    |
| **M-184**  | La descripción del mantenimiento no puede superar 300 caracteres.                                                                                                                                                                      | Error                                                    | HU-29, HU-31                                    |
| **M-185**  | La fecha del mantenimiento es obligatoria.                                                                                                                                                                                             | Error                                                    | HU-29                                           |
| **M-186**  | La fecha del mantenimiento no puede ser futura.                                                                                                                                                                                        | Error                                                    | HU-29                                           |
| **M-187**  | El costo no puede ser negativo.                                                                                                                                                                                                        | Error                                                    | HU-29, HU-31                                    |
| **M-188**  | El costo debe ser un valor en pesos, sin centavos.                                                                                                                                                                                     | Error                                                    | HU-29, HU-31                                    |
| **M-189**  | El reporte de daño no corresponde al activo.                                                                                                                                                                                           | Error                                                    | HU-29                                           |
| **M-190**  | Un activo en baja no admite mantenimiento.                                                                                                                                                                                             | Error                                                    | HU-29                                           |
| **M-191**  | El usuario no tiene el rol Técnico de Soporte.                                                                                                                                                                                         | Error                                                    | HU-29                                           |
| **M-192**  | No se encontró ningún mantenimiento con ese identificador.                                                                                                                                                                             | Error                                                    | HU-30                                           |
| **M-193**  | El activo no tiene mantenimientos registrados.                                                                                                                                                                                         | Informativo                                              | HU-30                                           |
| **M-194**  | Mantenimiento actualizado correctamente.                                                                                                                                                                                               | Éxito                                                    | HU-31                                           |
| **M-195**  | El mantenimiento no existe.                                                                                                                                                                                                            | Error                                                    | HU-31                                           |
| **M-196**  | El identificador del mantenimiento no se puede modificar.                                                                                                                                                                              | Error                                                    | HU-31                                           |
| **M-197**  | El activo del mantenimiento no se puede modificar.                                                                                                                                                                                     | Error                                                    | HU-31                                           |
| **M-198**  | El reporte de daño del mantenimiento no se puede modificar.                                                                                                                                                                            | Error                                                    | HU-31                                           |
| **M-199**  | El tipo de mantenimiento no se puede modificar.                                                                                                                                                                                        | Error                                                    | HU-31                                           |
| **M-200**  | La fecha del mantenimiento no se puede modificar.                                                                                                                                                                                      | Error                                                    | HU-31                                           |
| **M-201**  | El técnico del mantenimiento no se puede modificar.                                                                                                                                                                                    | Error                                                    | HU-31                                           |
| **M-202**  | Usuario registrado correctamente.                                                                                                                                                                                                      | Éxito                                                    | HU-32                                           |
| **M-203**  | El nombre es obligatorio.                                                                                                                                                                                                              | Error                                                    | HU-32, HU-34                                    |
| **M-204**  | El apellido es obligatorio.                                                                                                                                                                                                            | Error                                                    | HU-32, HU-34                                    |
| **M-205**  | El correo es obligatorio.                                                                                                                                                                                                              | Error                                                    | HU-32, HU-33, HU-34, HU-36                      |
| **M-206**  | La contraseña es obligatoria.                                                                                                                                                                                                          | Error                                                    | HU-32, HU-36                                    |
| **M-207**  | El rol es obligatorio.                                                                                                                                                                                                                 | Error                                                    | HU-32, HU-34                                    |
| **M-208**  | El nombre no puede superar 20 caracteres.                                                                                                                                                                                              | Error                                                    | HU-32, HU-34                                    |
| **M-209**  | El apellido no puede superar 20 caracteres.                                                                                                                                                                                            | Error                                                    | HU-32, HU-34                                    |
| **M-210**  | El correo no puede superar 100 caracteres.                                                                                                                                                                                             | Error                                                    | HU-32, HU-34                                    |
| **M-211**  | El correo ya está registrado.                                                                                                                                                                                                          | Error                                                    | HU-32, HU-34                                    |
| **M-212**  | El correo no tiene un formato válido.                                                                                                                                                                                                  | Error                                                    | HU-32, HU-34                                    |
| **M-213**  | El rol no es válido.                                                                                                                                                                                                                   | Error                                                    | HU-32, HU-34                                    |
| **M-214**  | No se encontró ningún usuario con ese identificador.                                                                                                                                                                                   | Error                                                    | HU-33                                           |
| **M-215**  | No se encontró ningún usuario con ese correo.                                                                                                                                                                                          | Error                                                    | HU-33                                           |
| **M-216**  | Usuario actualizado correctamente.                                                                                                                                                                                                     | Éxito                                                    | HU-34                                           |
| **M-217**  | El identificador del usuario no se puede modificar.                                                                                                                                                                                    | Error                                                    | HU-34                                           |
| **M-218**  | El estado del usuario solo cambia al inactivarlo.                                                                                                                                                                                      | Error                                                    | HU-34                                           |
| **M-219**  | La contraseña no se cambia aquí. Use el cambio de contraseña.                                                                                                                                                                          | Error                                                    | HU-34                                           |
| **M-220**  | Usuario inactivado correctamente.                                                                                                                                                                                                      | Éxito                                                    | HU-35                                           |
| **M-221**  | El usuario \<nombre\> (\<correo\>) pasará a estado inactivo. No podrá iniciar sesión, el registro no se elimina y no se puede reactivar. ¿Desea continuar?                                                                             | Confirmación                                             | HU-35                                           |
| **M-222**  | Inactivación cancelada. El usuario no fue modificado.                                                                                                                                                                                  | Informativo                                              | HU-35                                           |
| **M-223**  | El usuario ya está inactivo.                                                                                                                                                                                                           | Error                                                    | HU-35                                           |
| **M-224**  | El usuario tiene asignaciones vigentes a nombre de su custodio. Ciérrelas antes de inactivarlo.                                                                                                                                        | Error                                                    | HU-35                                           |
| **M-225**  | El usuario tiene solicitudes pendientes a nombre de su custodio. Cancélelas antes de inactivarlo.                                                                                                                                      | Error                                                    | HU-35                                           |
| **M-226**  | El usuario tiene un custodio activo. Inactive primero al custodio.                                                                                                                                                                     | Error                                                    | HU-35                                           |
| **M-227**  | Es el único Aprobador activo y hay solicitudes pendientes. Registre otro Aprobador antes de inactivarlo.                                                                                                                               | Error                                                    | HU-35                                           |
| **M-228**  | No se puede inactivar el propio usuario.                                                                                                                                                                                               | Error                                                    | HU-35                                           |
| **M-229**  | Sesión iniciada correctamente.                                                                                                                                                                                                         | Éxito                                                    | HU-36                                           |
| **M-230**  | Correo o contraseña incorrectos.                                                                                                                                                                                                       | Error                                                    | HU-36                                           |
| **M-231**  | Contraseña cambiada correctamente.                                                                                                                                                                                                     | Éxito                                                    | HU-37                                           |
| **M-232**  | La contraseña actual es incorrecta.                                                                                                                                                                                                    | Error                                                    | HU-37                                           |
| **M-233**  | La nueva contraseña debe ser distinta de la actual.                                                                                                                                                                                    | Error                                                    | HU-37                                           |
| **M-234**  | La contraseña actual es obligatoria.                                                                                                                                                                                                   | Error                                                    | HU-37                                           |
| **M-235**  | La nueva contraseña es obligatoria.                                                                                                                                                                                                    | Error                                                    | HU-37                                           |
| **M-236**  | Solo se puede cambiar la contraseña propia.                                                                                                                                                                                            | Error                                                    | HU-37                                           |
| **M-237**  | Permiso asignado correctamente.                                                                                                                                                                                                        | Éxito                                                    | HU-38, HU-39                                    |
| **M-238**  | El permiso es obligatorio.                                                                                                                                                                                                             | Error                                                    | HU-38, HU-39                                    |
| **M-239**  | El permiso no es válido.                                                                                                                                                                                                               | Error                                                    | HU-38, HU-39                                    |
| **M-240**  | El rol ya tiene ese permiso.                                                                                                                                                                                                           | Error                                                    | HU-38                                           |
| **M-241**  | Permiso retirado correctamente.                                                                                                                                                                                                        | Éxito                                                    | HU-39                                           |
| **M-242**  | El rol \<rol\> perderá el permiso \<permiso\>. La asignación se elimina del sistema y, para recuperarla, hay que otorgar el permiso de nuevo. ¿Desea continuar?                                                                        | Confirmación                                             | HU-39                                           |
| **M-243**  | Retiro cancelado. El rol conserva el permiso.                                                                                                                                                                                          | Informativo                                              | HU-39                                           |
| **M-244**  | El rol no tiene ese permiso.                                                                                                                                                                                                           | Error                                                    | HU-39                                           |
| **M-245**  | El rol no tiene permisos asignados.                                                                                                                                                                                                    | Informativo                                              | HU-40                                           |
| **M-246**  | Categoría registrada correctamente.                                                                                                                                                                                                    | Éxito                                                    | HU-41                                           |
| **M-247**  | El nombre de la categoría es obligatorio.                                                                                                                                                                                              | Error                                                    | HU-41, HU-43                                    |
| **M-248**  | El nombre de la categoría no puede superar 50 caracteres.                                                                                                                                                                              | Error                                                    | HU-41, HU-43                                    |
| **M-249**  | Ya existe una categoría con ese nombre.                                                                                                                                                                                                | Error                                                    | HU-41, HU-43                                    |
| **M-250**  | No se encontró ninguna categoría con ese identificador.                                                                                                                                                                                | Error                                                    | HU-42                                           |
| **M-251**  | No hay categorías activas.                                                                                                                                                                                                             | Informativo                                              | HU-42                                           |
| **M-252**  | Categoría actualizada correctamente.                                                                                                                                                                                                   | Éxito                                                    | HU-43                                           |
| **M-253**  | La categoría no existe.                                                                                                                                                                                                                | Error                                                    | HU-43, HU-44                                    |
| **M-254**  | El identificador de la categoría no se puede modificar.                                                                                                                                                                                | Error                                                    | HU-43                                           |
| **M-255**  | El estado de la categoría solo cambia al inactivarla.                                                                                                                                                                                  | Error                                                    | HU-43                                           |
| **M-256**  | La categoría está inactiva.                                                                                                                                                                                                            | Error                                                    | HU-43                                           |
| **M-257**  | Categoría inactivada correctamente.                                                                                                                                                                                                    | Éxito                                                    | HU-44                                           |
| **M-258**  | La categoría \<nombre\> pasará a estado inactivo. No se podrán registrar activos ni solicitudes con ella, el registro no se elimina y no se puede reactivar. ¿Desea continuar?                                                         | Confirmación                                             | HU-44                                           |
| **M-259**  | Inactivación cancelada. La categoría no fue modificada.                                                                                                                                                                                | Informativo                                              | HU-44                                           |
| **M-260**  | La categoría ya está inactiva.                                                                                                                                                                                                         | Error                                                    | HU-44                                           |
| **M-261**  | La categoría tiene activos sin dar de baja. Dé de baja o reclasifique esos activos antes de inactivarla.                                                                                                                               | Error                                                    | HU-44                                           |
| **M-262**  | La categoría tiene solicitudes pendientes. Resuélvalas o cancélelas antes de inactivarla.                                                                                                                                              | Error                                                    | HU-44                                           |
| **M-263**  | No se encontró ningún registro de auditoría con ese identificador.                                                                                                                                                                     | Error                                                    | HU-45                                           |
| **M-264**  | El identificador del registro de auditoría no es válido.                                                                                                                                                                               | Error                                                    | HU-45                                           |
| **M-265**  | No tiene permiso para consultar la auditoría.                                                                                                                                                                                          | Error                                                    | HU-45                                           |
| **M-266**  | La fecha de inicio es obligatoria.                                                                                                                                                                                                     | Error                                                    | HU-46                                           |
| **M-267**  | La fecha de fin no puede ser anterior a la fecha de inicio.                                                                                                                                                                            | Error                                                    | HU-46                                           |
| **M-268**  | El tipo de reporte es obligatorio.                                                                                                                                                                                                     | Error                                                    | HU-46                                           |
| **M-269**  | El tipo de reporte no es válido.                                                                                                                                                                                                       | Error                                                    | HU-46                                           |
| **M-270**  | No hay resultados para el reporte solicitado.                                                                                                                                                                                          | Informativo                                              | HU-46                                           |
| **M-271**  | No tiene permiso para consultar reportes.                                                                                                                                                                                              | Error                                                    | HU-46                                           |
| **M-272**  | El custodio no corresponde al empleado que solicita.                                                                                                                                                                                   | Error                                                    | HU-09                                           |
| **M-273**  | El aprobador debe ser el usuario con sesión iniciada.                                                                                                                                                                                  | Error                                                    | HU-13                                           |

**F. Transiciones de estado**

**Estado_Solicitud (sin cambios)**

| **Estado**    | **Quién lo fija (método)**               | **Condición**                                                                                 | **Fuente**                                                                                       |
|---------------|------------------------------------------|-----------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------|
| **Pendiente** | Solicitud.crear() (lo asigna el sistema) | Al registrar la solicitud; el Empleado no elige el estado.                                    | Diccionario v6 (valor inicial Pendiente). RN-S04                                                 |
| **Aprobada**  | Aprobacion.decidir()                     | Decision = Aprobada sobre una solicitud Pendiente (RN-AP09, propuesta).                       | Diccionario v6 (pasa a Aprobada o Rechazada al registrar la aprobación). RN-AP07                 |
| **Rechazada** | Aprobacion.decidir()                     | Decision = Rechazada, con Motivo_Rechazo, sobre una solicitud Pendiente (RN-AP09, propuesta). | Diccionario v6. RN-AP02, RN-AP07                                                                 |
| **Cancelada** | Solicitud.cancelar()                     | Solo desde Pendiente, con confirmación; sin reactivar (RN-S14, RN-S15, propuestas).           | Fase A v6 (cancelar) y diccionario v6 (la observación dice «al desactivar la solicitud»). RN-S13 |

**Estado_Activo (actualizada con el CRF-003 y con el Bloque 5; sin filas pendientes)**

| **Estado**     | **Quién lo fija (método)**                                    | **Condición**                                                                                                                                                                                                                                                                                                                                                                       | **Fuente**                                                                                            |
|----------------|---------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------|
| **Disponible** | Activo.crear()                                                | Nace Disponible al registrar el activo; lo asigna el sistema, la persona no lo elige.                                                                                                                                                                                                                                                                                               | Diccionario v6 (valor inicial) y Fase A v6 (crear). RN-A06                                            |
| **Asignado**   | Asignacion.asignar() (poscondición)                           | Disponible → Asignado al entregar el equipo. Solo un equipo Disponible puede entregarse (activoDisponible()).                                                                                                                                                                                                                                                                       | CRF-003, cambio 1 (propuesta). RN-AS07, RN-AS11                                                       |
| **Disponible** | Devolucion.confirmarRecepcion(), mediante Asignacion.cerrar() | Asignado → Disponible al cerrar la asignación, solo si el activo no está Dañado; si está Dañado conserva Dañado (no es una transición).                                                                                                                                                                                                                                             | CRF-003, cambios 2 y 5 (propuesta). RN-AS14, RN-AS15                                                  |
| **Dañado**     | Activo.actualizar() (manual)                                  | Disponible → Dañado, como corrección manual; los cambios manuales se conservan.                                                                                                                                                                                                                                                                                                     | Fase A v6 (actualizar modifica el estado). RN-A16 (adenda CRF-003, cambio 3)                          |
| **Dañado**     | Reporte_de_Danios.crear()                                     | Asignado → Dañado, solo con una asignación Vigente a nombre del custodio que reporta (RN-RD07, propuesta); un activo en Baja no se reporta (RN-RD08). Un activo ya Dañado admite otro reporte y conserva Dañado (RN-RD10, propuesta; P-50). Con RN-RD07 el reporte no lleva un activo Disponible a Dañado (P-51); Disponible → Dañado sigue siendo posible con Activo.actualizar(). | CRF-003, cambio 3 (propuesta). RN-RD07 a RN-RD10                                                      |
| **Disponible** | Activo.actualizar() (manual)                                  | Dañado → Disponible, solo sin asignación Vigente (buscarVigentePorActivo). Tras un mantenimiento, el Responsable de Activos lo devuelve a Disponible así; Historial_Mantenimientos.crear() no cambia el estado.                                                                                                                                                                     | CRF-003, cambio 4 (propuesta). RN-A16 (adenda), RN-AS18                                               |
| **Baja**       | Activo.darDeBaja()                                            | Disponible → Baja y Dañado → Baja, solo sin asignación Vigente; con confirmación; no si ya está en Baja. Baja es terminal: no se edita.                                                                                                                                                                                                                                             | Fase A v6 (darDeBaja) y diccionario v6 (valor Baja). RN-A19 (adenda), RN-A11, RN-A12, RN-A18, RN-AS18 |

*Resaltadas: transiciones definidas por el CRF-003 (propuesta, sin aplicar). No se agregan otras transiciones.*

*Historial_Mantenimientos.crear() y actualizar() no cambian Estado_Activo (CRF-003, cambio 4; RN-H12 y RN-H18, propuestas): el Responsable de Activos devuelve el activo a Disponible con Activo.actualizar(), sin asignación Vigente.*

**Estado_Asignacion (sin cambios)**

| **Estado**              | **Quién lo fija (método)**                                                    | **Condición**                                                                                                                                        | **Fuente**                                                                                                              |
|-------------------------|-------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------|
| **Vigente**             | Asignacion.asignar() (lo asigna el sistema)                                   | Al registrar la asignación; el Responsable de Activos no elige el estado.                                                                            | Diccionario v6 (valor inicial Vigente). RN-AS10                                                                         |
| **Cerrada**             | Asignacion.cerrar() (HU-18; la invoca Devolucion.confirmarRecepcion(), HU-24) | Vigente → Cerrada, solo con una Devolucion Confirmada y con confirmación; no si ya está Cerrada. El Activo pasa a Disponible, salvo que esté Dañado. | Diccionario v6 («cerrar() la pone Cerrada») y Fase A v6 (cerrar). CRF-003, cambios 2 y 5 (propuesta). RN-AS14 a RN-AS17 |
| **Vigente (reactivar)** | No existe en el modelo                                                        | Una asignación Cerrada no vuelve a Vigente.                                                                                                          | Fase A v6 (sin método de reactivación). RN-AS15                                                                         |

**Estado_Recepcion (nuevo)**

| **Estado**               | **Quién lo fija (método)**                    | **Condición**                                                                                                                                                                                                                                          | **Fuente**                                                                                           |
|--------------------------|-----------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------|
| **Pendiente**            | Devolucion.registrar() (lo asigna el sistema) | Al registrar la devolución de una asignación Vigente; el custodio no elige el estado. Fecha_Confirmacion e ID_Receptor quedan vacíos.                                                                                                                  | Diccionario v6 (valor inicial Pendiente). RN-D05, RN-D08                                             |
| **Confirmada**           | Devolucion.confirmarRecepcion()               | Pendiente → Confirmada, por un Responsable de Activos activo, con confirmación; no si ya está Confirmada. El sistema asigna Fecha_Confirmacion e ID_Receptor; la asignación pasa a Cerrada (cerrar()) y el Activo a Disponible, salvo que esté Dañado. | Diccionario v6 y Fase A v6 (confirmarRecepcion). CRF-003, cambios 2 y 5 (propuesta). RN-D13 a RN-D17 |
| **Pendiente (revertir)** | No existe en el modelo                        | Una devolución Confirmada no vuelve a Pendiente.                                                                                                                                                                                                       | Fase A v6 (sin método que revierta la confirmación). RN-D17                                          |

*Resaltada: transición con efecto del CRF-003 (propuesta, sin aplicar).*

**G. Operaciones auditables de las HU-01 a HU-46**

*Alcance 1.2: «mantener un registro completo de auditoría de todas las acciones relevantes (asignaciones, devoluciones, cambios de responsable y bajas)». La tabla compila los métodos públicos de las HU-01 a HU-44 con las listas de auditoría de cada bloque. Estado de cada fila: «Audita» (Accion definida), «Audita (Accion propuesta)», «Sin valor en Accion (pregunta)» y «No audita (propuesta)»; qué se considera «relevante» queda en P-06 y P-89. Resaltadas: filas con una Accion propuesta o sin valor definido. Las filas «No audita» son la propuesta de partida de P-90.*

| **Operación (Clase.método)**                   | **HU** | **Accion_Auditoria**                                                                                                                     | **Entidad**                         | **¿Detalle?**                                                                              |
|------------------------------------------------|--------|------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------|--------------------------------------------------------------------------------------------|
| **Activo.crear()**                             | HU-01  | Crear                                                                                                                                    | Activo                              | Por definir (ID_Activo y placa)                                                            |
| **Activo.buscarPorId()**                       | HU-02  | No audita (propuesta): Consulta de solo lectura; el Alcance 1.2 no la lista como acción auditable (P-90)                                 | Activo                              | —                                                                                          |
| **Activo.buscarPorNumeroSerie()**              | HU-02  | No audita (propuesta): Consulta de solo lectura; el Alcance 1.2 no la lista como acción auditable (P-90)                                 | Activo                              | —                                                                                          |
| **Activo.buscarPorPlaca()**                    | HU-02  | No audita (propuesta): Consulta de solo lectura; el Alcance 1.2 no la lista como acción auditable (P-90)                                 | Activo                              | —                                                                                          |
| **Activo.listarInventario()**                  | HU-02  | No audita (propuesta): Consulta de solo lectura; el Alcance 1.2 no la lista como acción auditable (P-90)                                 | Activo                              | —                                                                                          |
| **Activo.actualizar()**                        | HU-03  | Actualizar                                                                                                                               | Activo                              | Por definir (campos cambiados)                                                             |
| **Activo.darDeBaja()**                         | HU-04  | Inactivar (cubre darDeBaja)                                                                                                              | Activo                              | Por definir (ID_Activo)                                                                    |
| **Custodio.crear()**                           | HU-05  | Crear                                                                                                                                    | Custodio                            | Por definir (ID_Custodio, ID_Usuario)                                                      |
| **Custodio.buscarPorId()**                     | HU-06  | No audita (propuesta): Consulta de solo lectura; el Alcance 1.2 no la lista como acción auditable (P-90)                                 | Custodio                            | —                                                                                          |
| **Custodio.buscarPorUsuario()**                | HU-06  | No audita (propuesta): Consulta de solo lectura; el Alcance 1.2 no la lista como acción auditable (P-90)                                 | Custodio                            | —                                                                                          |
| **Custodio.buscarPorDocumento()**              | HU-06  | No audita (propuesta): Consulta de solo lectura; el Alcance 1.2 no la lista como acción auditable (P-90)                                 | Custodio                            | —                                                                                          |
| **Custodio.actualizar()**                      | HU-07  | Actualizar                                                                                                                               | Custodio                            | Por definir (campos cambiados)                                                             |
| **Custodio.inactivar()**                       | HU-08  | Inactivar                                                                                                                                | Custodio                            | Por definir (ID_Custodio)                                                                  |
| **Solicitud.crear()**                          | HU-09  | Crear                                                                                                                                    | Solicitud                           | Por definir (ID_Solicitud, ID_Custodio)                                                    |
| **Solicitud.buscarPorId()**                    | HU-10  | No audita (propuesta): Consulta de solo lectura; el Alcance 1.2 no la lista como acción auditable (P-90)                                 | Solicitud                           | —                                                                                          |
| **Solicitud.listarPorCustodio()**              | HU-10  | No audita (propuesta): Consulta de solo lectura; el Alcance 1.2 no la lista como acción auditable (P-90)                                 | Solicitud                           | —                                                                                          |
| **Solicitud.listarPendientes()**               | HU-10  | No audita (propuesta): Consulta de solo lectura; el Alcance 1.2 no la lista como acción auditable (P-90)                                 | Solicitud                           | —                                                                                          |
| **Solicitud.listarAprobadas()**                | HU-10  | No audita (propuesta): Consulta de solo lectura; el Alcance 1.2 no la lista como acción auditable (P-90); método agregado por el CRF-003 | Solicitud                           | —                                                                                          |
| **Solicitud.actualizar()**                     | HU-11  | Actualizar                                                                                                                               | Solicitud                           | Por definir (campos cambiados)                                                             |
| **Solicitud.cancelar()**                       | HU-12  | Inactivar (cubre cancelar)                                                                                                               | Solicitud                           | Por definir (ID_Solicitud)                                                                 |
| **Aprobacion.decidir()**                       | HU-13  | Aprobar o Rechazar, según la decisión                                                                                                    | Aprobacion (y Solicitud)            | Por definir (ID_Solicitud, Decision)                                                       |
| **Aprobacion.buscarPorSolicitud()**            | HU-14  | No audita (propuesta): Consulta de solo lectura; el Alcance 1.2 no la lista como acción auditable (P-90)                                 | Aprobacion                          | —                                                                                          |
| **Asignacion.asignar()**                       | HU-15  | Asignar                                                                                                                                  | Asignacion                          | Por definir (ID_Asignacion, ID_Solicitud, ID_Activo, ID_Custodio; cambio de Estado_Activo) |
| **Asignacion.buscarPorId()**                   | HU-16  | No audita (propuesta): Consulta de solo lectura; el Alcance 1.2 no la lista como acción auditable (P-90)                                 | Asignacion                          | —                                                                                          |
| **Asignacion.listarVigentes()**                | HU-16  | No audita (propuesta): Consulta de solo lectura; el Alcance 1.2 no la lista como acción auditable (P-90)                                 | Asignacion                          | —                                                                                          |
| **Asignacion.listarPorCustodio()**             | HU-16  | No audita (propuesta): Consulta de solo lectura; el Alcance 1.2 no la lista como acción auditable (P-90)                                 | Asignacion                          | —                                                                                          |
| **Asignacion.buscarVigentePorActivo()**        | HU-16  | No audita (propuesta): Consulta de solo lectura; el Alcance 1.2 no la lista como acción auditable (P-90)                                 | Asignacion                          | —                                                                                          |
| **Asignacion.actualizar()**                    | HU-17  | Actualizar                                                                                                                               | Asignacion                          | Por definir (campo cambiado)                                                               |
| **Asignacion.cerrar()**                        | HU-18  | Inactivar (cubre cerrar)                                                                                                                 | Asignacion                          | Por definir (cambio de Estado_Activo)                                                      |
| **Acta_De_Entrega.firmar()**                   | HU-19  | Crear (no hay un valor «Firmar»; P-91)                                                                                                   | Acta_De_Entrega                     | Por definir (ID_Asignacion)                                                                |
| **Acta_De_Entrega.buscarPorAsignacion()**      | HU-20  | No audita (propuesta): Consulta de solo lectura; el Alcance 1.2 no la lista como acción auditable (P-90)                                 | Acta_De_Entrega                     | —                                                                                          |
| **Devolucion.registrar()**                     | HU-21  | Devolver                                                                                                                                 | Devolucion                          | Por definir (ID_Devolucion, ID_Asignacion)                                                 |
| **Devolucion.buscarPorId()**                   | HU-22  | No audita (propuesta): Consulta de solo lectura; el Alcance 1.2 no la lista como acción auditable (P-90)                                 | Devolucion                          | —                                                                                          |
| **Devolucion.listarPendientesDeRecepcion()**   | HU-22  | No audita (propuesta): Consulta de solo lectura; el Alcance 1.2 no la lista como acción auditable (P-90)                                 | Devolucion                          | —                                                                                          |
| **Devolucion.actualizar()**                    | HU-23  | Actualizar                                                                                                                               | Devolucion                          | Por definir (campos cambiados)                                                             |
| **Devolucion.confirmarRecepcion()**            | HU-24  | Devolver (no hay un valor «Confirmar»); la invocación de cerrar() se audita como Inactivar (HU-18)                                       | Devolucion (y Asignacion, Activo)   | Por definir (ID_Devolucion, ID_Receptor; cambios de Estado_Asignacion y Estado_Activo)     |
| **Notificacion_De_Devolucion.generarAviso()**  | HU-25  | Notificar                                                                                                                                | Notificacion_De_Devolucion          | Por definir (ID_Asignacion, destinatario)                                                  |
| **Reporte_de_Danios.crear()**                  | HU-26  | Crear                                                                                                                                    | Reporte_de_Danios (y Activo)        | Por definir (ID_ReporteDanios, ID_Activo; cambio de Estado_Activo)                         |
| **Reporte_de_Danios.buscarPorId()**            | HU-27  | No audita (propuesta): Consulta de solo lectura; el Alcance 1.2 no la lista como acción auditable (P-90)                                 | Reporte_de_Danios                   | —                                                                                          |
| **Reporte_de_Danios.listarReportes()**         | HU-27  | No audita (propuesta): Consulta de solo lectura; el Alcance 1.2 no la lista como acción auditable (P-90)                                 | Reporte_de_Danios                   | —                                                                                          |
| **Reporte_de_Danios.actualizar()**             | HU-28  | Actualizar                                                                                                                               | Reporte_de_Danios                   | Por definir (campos cambiados)                                                             |
| **Historial_Mantenimientos.crear()**           | HU-29  | Crear (no hay un valor «Registrar»)                                                                                                      | Historial_Mantenimientos            | Por definir (ID_Mantenimiento, ID_Activo, ID_Tecnico)                                      |
| **Historial_Mantenimientos.buscarPorId()**     | HU-30  | No audita (propuesta): Consulta de solo lectura; el Alcance 1.2 no la lista como acción auditable (P-90)                                 | Historial_Mantenimientos            | —                                                                                          |
| **Historial_Mantenimientos.listarPorActivo()** | HU-30  | No audita (propuesta): Consulta de solo lectura; el Alcance 1.2 no la lista como acción auditable (P-90)                                 | Historial_Mantenimientos            | —                                                                                          |
| **Historial_Mantenimientos.actualizar()**      | HU-31  | Actualizar                                                                                                                               | Historial_Mantenimientos            | Por definir (campos cambiados)                                                             |
| **Usuario.crear()**                            | HU-32  | Crear                                                                                                                                    | Usuario                             | Por definir (ID_Usuario y rol; nunca la contraseña)                                        |
| **Usuario.buscarPorId()**                      | HU-33  | No audita (propuesta): Consulta de solo lectura; el Alcance 1.2 no la lista como acción auditable (P-90)                                 | Usuario                             | —                                                                                          |
| **Usuario.buscarPorEmail()**                   | HU-33  | No audita (propuesta): Consulta de solo lectura; el Alcance 1.2 no la lista como acción auditable (P-90)                                 | Usuario                             | —                                                                                          |
| **Usuario.actualizar()**                       | HU-34  | Actualizar                                                                                                                               | Usuario                             | Por definir (campo cambiado; nunca la contraseña)                                          |
| **Usuario.inactivar()**                        | HU-35  | Inactivar                                                                                                                                | Usuario                             | Por definir (ID_Usuario)                                                                   |
| **Usuario.iniciarSesion()**                    | HU-36  | Sin valor en Accion (pregunta): Sin valor para el ingreso (¿Consultar?; P-92)                                                            | Usuario                             | Por definir (nunca la contraseña)                                                          |
| **Usuario.cambiarContrasena()**                | HU-37  | Actualizar (no hay un valor propio; P-92)                                                                                                | Usuario                             | Por definir (solo que hubo un cambio; nunca la contraseña)                                 |
| **Rol_Permiso.asignar()**                      | HU-38  | Crear (el valor «Asignar» parece reservado a la asignación de activos; P-94)                                                             | Rol_Permiso                         | Por definir (rol y permiso)                                                                |
| **Rol_Permiso.retirar()**                      | HU-39  | Sin valor en Accion (pregunta): Sin valor adecuado; «Inactivar» con Detalle o un valor nuevo (P-93)                                      | Rol_Permiso                         | Por definir (rol y permiso retirados)                                                      |
| **Rol_Permiso.consultarPermisos()**            | HU-40  | No audita (propuesta): Consulta de solo lectura; el Alcance 1.2 no la lista como acción auditable (P-90)                                 | Rol_Permiso                         | —                                                                                          |
| **Categoria.crear()**                          | HU-41  | Crear                                                                                                                                    | Categoria                           | Por definir (ID_Categoria y nombre)                                                        |
| **Categoria.buscarPorId()**                    | HU-42  | No audita (propuesta): Consulta de solo lectura; el Alcance 1.2 no la lista como acción auditable (P-90)                                 | Categoria                           | —                                                                                          |
| **Categoria.listarActivas()**                  | HU-42  | No audita (propuesta): Consulta de solo lectura; el Alcance 1.2 no la lista como acción auditable (P-90)                                 | Categoria                           | —                                                                                          |
| **Categoria.actualizar()**                     | HU-43  | Actualizar                                                                                                                               | Categoria                           | Por definir (nombre anterior y nuevo)                                                      |
| **Categoria.inactivar()**                      | HU-44  | Inactivar                                                                                                                                | Categoria                           | Por definir (ID_Categoria)                                                                 |
| **Auditoria.buscarPorId()**                    | HU-45  | No audita (propuesta): La consulta de la auditoría no genera otro registro (RN-AU17; P-90)                                               | Auditoria                           | —                                                                                          |
| **Reportes.consultar()**                       | HU-46  | Reportar                                                                                                                                 | Reportes (vista; ID_Registro: P-97) | Por definir (tipo y rango de fechas)                                                       |
| **(cambio de responsable)**                    | —      | Sin valor en Accion_Auditoria ni método (P-31, P-95)                                                                                     | Asignacion                          | —                                                                                          |

*Auditoria.registrar() es INTERNO y no figura como operación auditable: es el mecanismo que registra las demás (RN-AU02). El «cambio de responsable» no tiene método ni valor de Accion (P-31, P-95). Qué pasa si falla el registro de una operación: P-96. El campo Detalle nunca contiene contraseñas (RN-AU08).*

**H. Preguntas para el cliente (P-01 a P-105)**

Todas las preguntas abiertas, sin repetidos. P-105 es nueva (cambio 7) y absorbe la P-27 original del Bloque 2; la P-27 vigente es la de la adenda de HU-10.

| **N°**    | **Tema**                | **Pregunta**                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            | **Se relaciona con**                                                     |
|-----------|-------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------|
| **P-01**  | Activo                  | ¿Las series y las placas tienen un formato real (prefijo, patrón, mínimo)? El diccionario solo define longitud.                                                                                                                                                                                                                                                                                                                                                                                                         | Piloto                                                                   |
| **P-02**  | Activo                  | ¿Las búsquedas por serie y placa distinguen mayúsculas o ignoran espacios? Se supuso coincidencia exacta.                                                                                                                                                                                                                                                                                                                                                                                                               | Piloto                                                                   |
| **P-03**  | Activo                  | ¿Qué permisos tiene cada rol sobre Activo?                                                                                                                                                                                                                                                                                                                                                                                                                                                                              | Piloto                                                                   |
| **P-04**  | Activo                  | ¿Se confirman RN-A16, RN-A18 y RN-A19 (cambio de estado, Baja terminal, Asignado sin baja)?                                                                                                                                                                                                                                                                                                                                                                                                                             | Piloto                                                                   |
| **P-05**  | Activo                  | ¿Un activo Asignado puede cambiar de ubicación u otros datos? RN-A16 solo restringe el estado.                                                                                                                                                                                                                                                                                                                                                                                                                          | Piloto                                                                   |
| **P-06**  | Auditoría               | ¿Qué acciones cuentan como «relevantes» y se auditan las consultas?                                                                                                                                                                                                                                                                                                                                                                                                                                                     | Piloto, RN-A17                                                           |
| **P-07**  | Activo                  | ¿Se confirma que ID_Activo lo genera el sistema de forma autonumérica?                                                                                                                                                                                                                                                                                                                                                                                                                                                  | Piloto, RN-A01                                                           |
| **P-08**  | Custodio                | ¿El usuario del custodio debe existir, estar activo y tener rol Empleado?                                                                                                                                                                                                                                                                                                                                                                                                                                               | RN-C07, RN-C08 (propuesta)                                               |
| **P-09**  | Custodio / Solicitud    | El Alcance 1.2 dice que el sistema permite «gestionar las solicitudes de equipos realizadas por los empleados»: quien solicita es el Empleado. Sigue sin definirse la secuencia: el diccionario dice que el custodio «se registra cuando solicita un equipo» y que lo registra el Responsable de Activos, pero Solicitud.ID_Custodio es obligatorio. ¿Primero se registra al custodio y después el Empleado crea la solicitud? ¿Cómo se atiende la primera solicitud de un Empleado nuevo?                              | Hallazgo 5, HU-09, Alcance 1.2                                           |
| **P-10**  | Custodio                | ¿La Cédula de extranjería (CE) es un tipo de documento válido para Nexa Servicios?                                                                                                                                                                                                                                                                                                                                                                                                                                      | RN-C04, CRF-002 (0.2, 0.11)                                              |
| **P-11**  | Custodio                | ¿El documento debe ser único por tipo y número?                                                                                                                                                                                                                                                                                                                                                                                                                                                                         | RN-C05, CRF-002 (0.10)                                                   |
| **P-12**  | Custodio                | ¿Qué datos de un custodio se pueden actualizar? Se propone: tipo y número de documento y dirección (no ID_Usuario, Fecha_Registro ni activo).                                                                                                                                                                                                                                                                                                                                                                           | RN-C10, RN-C11, RN-C12                                                   |
| **P-13**  | Custodio                | Al inactivar un custodio con asignaciones Vigentes o solicitudes Pendientes: opción A (recomendada, coherente con RN-A19): bloquear hasta cerrar y cancelar; opción B: avisar y permitir continuar. ¿Cuál se adopta?                                                                                                                                                                                                                                                                                                    | RN-C14                                                                   |
| **P-14**  | Custodio                | Como no existe reactivar y ID_Usuario es único, el usuario de un custodio inactivo no puede volver a ser custodio. ¿Se acepta, se agrega un método de reactivación (CRF aparte) o se permite un nuevo registro? Se presenta junto con P-15 (ver 7.1).                                                                                                                                                                                                                                                                   | RN-C06, RN-C12, P-15                                                     |
| **P-15**  | Custodio                | ¿Un custodio inactivo se puede editar? Ver las alternativas en 7.1. Se presenta junto con P-14.                                                                                                                                                                                                                                                                                                                                                                                                                         | HU-07, 7.1, P-14                                                         |
| **P-16**  | Custodio                | Pregunta 14 y N-10 (cambio automático de responsable: 5 de 19 y 7 más en «todas»); el Alcance 1.2 lista «cambios de responsable» entre las acciones auditables. ¿Qué debe pasar con los equipos de un custodio que se inactiva? El modelo no define transferencia ni un método de cambio de responsable.                                                                                                                                                                                                                | HU-08, Pregunta 14, N-10, Alcance 1.2                                    |
| **P-17**  | Custodio                | ¿Otros actores pueden consultar custodios? El Alcance 1.2 limita la consulta del Empleado a «el estado de sus solicitudes y sus asignaciones vigentes» y no menciona la consulta de datos de custodio por ningún actor. Se mantiene el supuesto: solo el Responsable de Activos.                                                                                                                                                                                                                                        | RN-C17 (Supuesto), Alcance 1.2                                           |
| **P-18**  | Custodio                | ¿Qué necesidad del cliente respalda registrar el documento y la dirección del custodio? N-02 habla de saber quién tiene cada equipo; el CRF-002 la califica de respaldo débil para la unicidad del documento. El Alcance 1.2 y la Tabla 5 (1.7.3) no mencionan al custodio ni su documento y dirección.                                                                                                                                                                                                                 | HU-05, RN-C05, CRF-002 (0.10), Tabla 5                                   |
| **P-19**  | Solicitud               | ¿Se exige que la categoría solicitada y el custodio estén activos?                                                                                                                                                                                                                                                                                                                                                                                                                                                      | RN-S07, RN-S09 (propuestas)                                              |
| **P-20**  | Solicitud               | N-03 pide un canal formal «con orden y prioridad», pero Solicitud no tiene un campo de prioridad. ¿Se agrega, o basta el orden por fecha? ¿Se aceptan los órdenes propuestos (por custodio, de la más reciente a la más antigua; pendientes, de la más antigua a la más reciente)?                                                                                                                                                                                                                                      | N-03, RN-S17, RN-S18                                                     |
| **P-21**  | Solicitud               | ¿El Empleado puede actualizar y cancelar sus solicitudes mientras estén Pendientes, y ver solo las suyas?                                                                                                                                                                                                                                                                                                                                                                                                               | RN-S11, RN-S14, RN-S19                                                   |
| **P-22**  | Solicitud               | ¿Una solicitud Aprobada que ya no se necesita se puede cancelar? La propuesta solo cancela las Pendientes.                                                                                                                                                                                                                                                                                                                                                                                                              | RN-S14                                                                   |
| **P-23**  | Aprobación              | ¿Un Aprobador puede decidir sobre una solicitud hecha por su propio usuario?                                                                                                                                                                                                                                                                                                                                                                                                                                            | RN-AP11                                                                  |
| **P-24**  | Aprobación              | N-04 pide conocer quién autorizó cada solicitud: ¿el Empleado ve el nombre del aprobador o solo su identificador?                                                                                                                                                                                                                                                                                                                                                                                                       | HU-14, N-04                                                              |
| **P-25**  | Aprobación              | La decisión es irrevocable. ¿Cómo se corrige una decisión equivocada?                                                                                                                                                                                                                                                                                                                                                                                                                                                   | RN-AP06                                                                  |
| **P-26**  | Aprobación              | ¿Motivo_Rechazo puede informarse cuando la decisión es Aprobada? Hoy es opcional y se admitiría.                                                                                                                                                                                                                                                                                                                                                                                                                        | RN-AP02                                                                  |
| **P-27**  | Solicitud (adenda)      | ¿El Responsable de Activos consulta las solicitudes pendientes y las aprobadas sin asignación?                                                                                                                                                                                                                                                                                                                                                                                                                          | RN-S20, RN-S21, CRF-003 (cambio 6) · adenda CRF-003                      |
| **P-28**  | Asignación              | ¿Quién asigna, actualiza, cierra y consulta las asignaciones? Se supuso el Responsable de Activos; el Alcance 1.2 dice «asignar los activos aprobados» sin nombrar al actor.                                                                                                                                                                                                                                                                                                                                            | RN-AS24 (Supuesto), Alcance 1.2                                          |
| **P-29**  | Asignación              | ¿Se exige que la categoría del activo sea la de la solicitud?                                                                                                                                                                                                                                                                                                                                                                                                                                                           | RN-AS08 (propuesta)                                                      |
| **P-30**  | Asignación              | ¿Qué reglas tiene la fecha de devolución esperada (por ejemplo, un plazo mínimo o máximo)? Solo se propone que no sea anterior a la fecha de entrega.                                                                                                                                                                                                                                                                                                                                                                   | RN-AS09 (propuesta)                                                      |
| **P-31**  | Asignación              | La Fase A v6 describe actualizar() como «modifica la fecha de devolución esperada o cambia el custodio»; se propone solo la fecha y solo si la asignación está Vigente. El Alcance 1.2 lista «cambios de responsable» entre las acciones auditables y N-10 (5 de 19 y 7 más en «todas») pide cambiarlo automáticamente. ¿actualizar() debe poder cambiar el custodio? ¿Con qué Accion_Auditoria se registra un cambio de responsable?                                                                                   | RN-AS13, HU-17, P-16, N-10, Alcance 1.2                                  |
| **P-32**  | Asignación / Activo     | CRF-003: ¿se validan los efectos sobre Estado_Activo? asignar() lo deja Asignado; confirmar la recepción (mediante cerrar()) lo deja Disponible salvo que esté Dañado; un reporte de daño lo deja Dañado aunque esté Asignado; el mantenimiento no lo cambia y el Responsable de Activos lo devuelve a Disponible con Activo.actualizar().                                                                                                                                                                              | RN-AS11, RN-AS15, RN-AS18, CRF-003 (cambios 1 a 4)                       |
| **P-33**  | Asignación              | Con el CRF-003 ningún método marca «recibido dañado»: un equipo devuelto en mal estado conserva Dañado solo si antes hubo un reporte de daño. ¿Cómo se registra el estado en que se recibe un equipo?                                                                                                                                                                                                                                                                                                                   | RN-AS15, CRF-003 (cambio 2)                                              |
| **P-34**  | Asignación              | Con el CRF-003 (cambios 2 y 5), confirmarRecepcion() invoca cerrar() y HU-18 solo procede con una Devolucion Confirmada: en el flujo normal la asignación ya queda Cerrada al confirmar. ¿Se necesita que el Responsable cierre una asignación por separado?                                                                                                                                                                                                                                                            | RN-AS14, HU-18, HU-24, CRF-003 (cambio 5)                                |
| **P-35**  | Asignación              | ¿Se puede asignar un equipo a una solicitud cuyo custodio está inactivo? Las fuentes no lo dicen y no se propone ninguna regla.                                                                                                                                                                                                                                                                                                                                                                                         | HU-15, RN-C12                                                            |
| **P-36**  | Asignación              | ¿Se aceptan los órdenes propuestos: las vigentes, de la más antigua a la más reciente por Fecha_Entrega; las de un custodio, de la más reciente a la más antigua?                                                                                                                                                                                                                                                                                                                                                       | RN-AS20, RN-AS21                                                         |
| **P-37**  | Asignación              | ¿El Empleado ve solo sus asignaciones Vigentes (Alcance 1.2) o también las Cerradas?                                                                                                                                                                                                                                                                                                                                                                                                                                    | RN-AS23, Alcance 1.2                                                     |
| **P-38**  | Acta                    | El diccionario define Firma_Digital como código de validación (hash criptográfico) del receptor. ¿Qué algoritmo se usa, quién genera el código (el sistema o el custodio) y cómo se valida?                                                                                                                                                                                                                                                                                                                             | RN-AC08, HU-19                                                           |
| **P-39**  | Acta                    | El Alcance 1.2 dice «generar automáticamente actas digitales de entrega», pero el único método es firmar(), que recibe Ruta_Acta. ¿Quién produce el documento del acta y cómo llega su ruta?                                                                                                                                                                                                                                                                                                                            | HU-19, Alcance 1.2                                                       |
| **P-40**  | Acta                    | ¿El acta solo se firma con la asignación Vigente? ¿Quién consulta el acta además del custodio (Responsable de Activos, Gerente)?                                                                                                                                                                                                                                                                                                                                                                                        | RN-AC05, RN-AC10 (propuestas)                                            |
| **P-41**  | Acta                    | La regla 1.7.3 dice que toda entrega debe quedar respaldada por un acta firmada. ¿Se exige el acta antes de entregar el equipo o antes de cerrar la asignación? El modelo no condiciona asignar() ni cerrar().                                                                                                                                                                                                                                                                                                          | N-05, HU-15, HU-18                                                       |
| **P-42**  | Devolución              | ¿Quién registra y actualiza la devolución: el custodio (Empleado), el Responsable de Activos o ambos? El Alcance 1.2 dice «se podrá registrar la devolución de los equipos» sin nombrar al actor; se supuso el Empleado custodio de la asignación, que consulta solo las suyas.                                                                                                                                                                                                                                         | RN-D07, RN-D12, RN-D20, RN-D21 (Supuesto), Alcance 1.2                   |
| **P-43**  | Devolución              | ¿Hay alguna consecuencia por devolver después de la fecha de devolución esperada (aviso, registro, sanción)? Las fuentes no definen ninguna regla de devolución tardía y no se propone ninguna: registrar() no compara las fechas.                                                                                                                                                                                                                                                                                      | HU-21, Fecha_Devolucion_Esperada                                         |
| **P-44**  | Notificación            | ¿Con cuántos días de anticipación se avisa y cada cuánto se repite el aviso? El Alcance 1.2 habla de «próximas devoluciones» sin umbral ni frecuencia; los días de los ejemplos no son una regla.                                                                                                                                                                                                                                                                                                                       | RN-N03, RN-N08, HU-25                                                    |
| **P-45**  | Notificación            | ¿Se avisa también cuando el plazo ya venció (Dias_Restantes negativo)? Se propone que sí, con un correo de plazo vencido.                                                                                                                                                                                                                                                                                                                                                                                               | RN-N07, HU-25 CA-3                                                       |
| **P-46**  | Notificación            | ¿Se sigue avisando una asignación Vigente cuya devolución ya fue registrada y espera la confirmación de recepción? Las fuentes no lo dicen y no se propone ninguna regla; solo se excluye la asignación Cerrada.                                                                                                                                                                                                                                                                                                        | RN-N05, HU-25, HU-21                                                     |
| **P-47**  | Devolución              | Estado_Recepcion solo tiene Pendiente y Confirmada: ¿cómo se maneja una recepción que el Responsable de Activos no puede confirmar (equipo incompleto o dañado)? Ver P-33 y P-34.                                                                                                                                                                                                                                                                                                                                       | RN-D09, RN-D15, HU-24, P-33, P-34                                        |
| **P-48**  | Notificación            | ¿Se aceptan los textos propuestos del correo (M-156 a M-159) y se confirma que el aviso de devolución es el único automático? La Tabla 5 (1.7.3) pide validarlo con el Responsable de Activos; la encuesta menciona notificaciones de disponibilidad, avisar a TI y alertas preventivas (N-07, N-09), que no tienen método en el modelo.                                                                                                                                                                                | RN-N10, HU-25, B.6, Tabla 5                                              |
| **P-49**  | Devolución              | ¿Qué datos de una devolución se pueden actualizar y hasta cuándo? Se propone solo Observaciones y solo mientras la recepción está Pendiente.                                                                                                                                                                                                                                                                                                                                                                            | RN-D11, HU-23                                                            |
| **P-50**  | Reporte de daños        | ¿Qué pasa si el activo ya está Dañado? Se propone admitir otro reporte (conserva Dañado) para no perder la información de un segundo daño; la alternativa es rechazarlo con un mensaje.                                                                                                                                                                                                                                                                                                                                 | RN-RD10, HU-26 CA-7                                                      |
| **P-51**  | Reporte de daños        | ¿El Empleado solo reporta el equipo que tiene con una asignación Vigente a su nombre? El Alcance 1.2 dice «reportar cuando un equipo se encuentre dañado» sin más condiciones. Con esta regla, el reporte no lleva un activo Disponible a Dañado (el CRF-003, cambio 3, incluía Disponible → Dañado): ese paso queda solo en Activo.actualizar().                                                                                                                                                                       | RN-RD07, RN-RD09, CRF-003 (cambio 3)                                     |
| **P-52**  | Reporte de daños        | El diccionario guarda en Evidencia la ruta del archivo («foto o archivo adjunto»). ¿Cómo se adjunta y guarda el archivo (carga desde el sistema, ruta compartida)? No se define el mecanismo.                                                                                                                                                                                                                                                                                                                           | RN-RD03, HU-26 (ver también P-39)                                        |
| **P-53**  | Reporte de daños        | ¿Cómo sabe el Técnico de Soporte qué reportes están sin atender? El modelo no tiene estado de atención, baja de reportes ni un método de «reportes sin atender»; solo se puede ver si un reporte tiene un mantenimiento asociado. No se inventa ninguno.                                                                                                                                                                                                                                                                | RN-RD19, HU-27                                                           |
| **P-54**  | Reporte de daños        | ¿Hasta cuándo se puede actualizar un reporte de daño? Se propone solo mientras no tenga un mantenimiento asociado.                                                                                                                                                                                                                                                                                                                                                                                                      | RN-RD15, HU-28                                                           |
| **P-55**  | Reporte de daños        | ¿Quién más consulta los reportes de daño (Responsable de Activos, Gerente)? El Alcance 1.2 nombra al Técnico de Soporte; se supuso que el Empleado ve solo los suyos.                                                                                                                                                                                                                                                                                                                                                   | RN-RD13, RN-RD18 (Supuesto), Alcance 1.2                                 |
| **P-56**  | Mantenimiento           | ¿Un mantenimiento Correctivo debe exigir un reporte de daños? Hoy ID_ReporteDanios es opcional también en los Correctivos y las fuentes no dicen otra cosa; no se decide.                                                                                                                                                                                                                                                                                                                                               | RN-H02, RN-H06, HU-29                                                    |
| **P-57**  | Mantenimiento           | ¿Quién más consulta el historial de mantenimiento (Responsable de Activos, Gerente) y quién puede actualizar un mantenimiento: cualquier técnico o solo el que lo registró?                                                                                                                                                                                                                                                                                                                                             | RN-H16 (Supuesto), RN-H17, HU-30, HU-31                                  |
| **P-58**  | Mantenimiento           | ¿Se aceptan las reglas propuestas para Costo (no negativo, además de «en pesos, sin centavos») y para Fecha_Mantenimiento (no futura)? ¿Hay un tope de costo?                                                                                                                                                                                                                                                                                                                                                           | RN-H10, RN-H11                                                           |
| **P-59**  | Mantenimiento           | N-09 pide alertas preventivas (7 de 19) y el Alcance 1.2 deja fuera el mantenimiento preventivo avanzado. ¿Basta con registrar de forma simple un mantenimiento Preventivo, sin programación ni recordatorios?                                                                                                                                                                                                                                                                                                          | RN-H13, N-09, Alcance 1.2                                                |
| **P-60**  | Usuario                 | ¿Quién registra, consulta, actualiza e inactiva usuarios? Se supuso el Responsable de Activos; el Alcance 1.2 dice «gestionar roles y permisos según el perfil de cada usuario» sin nombrar al actor.                                                                                                                                                                                                                                                                                                                   | RN-U23 (Supuesto), Alcance 1.2                                           |
| **P-61**  | Usuario                 | ¿Qué política tiene la contraseña (longitud mínima y máxima, tipos de caracteres, caducidad)? ¿Quién define la contraseña inicial y cómo se la entrega a la persona? Hoy solo se exige que no esté vacía.                                                                                                                                                                                                                                                                                                               | RN-U03, RN-U08, HU-32, HU-37                                             |
| **P-62**  | Usuario                 | El diccionario dice «contraseña encriptada»: ¿qué mecanismo de cifrado se usa y se acepta que la contraseña no se pueda recuperar?                                                                                                                                                                                                                                                                                                                                                                                      | RN-U07                                                                   |
| **P-63**  | Usuario                 | ¿Qué formato de correo se valida (se propone usuario@dominio sin espacios)? ¿El correo distingue mayúsculas para la unicidad? ¿El correo de un usuario inactivo sigue ocupado?                                                                                                                                                                                                                                                                                                                                          | RN-U04, RN-U05                                                           |
| **P-64**  | Usuario                 | La Fase A v6 permite cambiar el rol al actualizar. ¿Hay roles que no se pueden cambiar? ¿Qué pasa con un custodio cuyo usuario deja de ser Empleado (RN-C08)?                                                                                                                                                                                                                                                                                                                                                           | RN-U10, HU-34                                                            |
| **P-65**  | Usuario                 | ¿Se puede actualizar un usuario inactivo? Se propone que no.                                                                                                                                                                                                                                                                                                                                                                                                                                                            | RN-U11                                                                   |
| **P-66**  | Usuario                 | Al inactivar un usuario con custodio activo, asignaciones Vigentes o solicitudes Pendientes: opción A (recomendada, coherente con RN-C14 y P-13): bloquear hasta inactivar al custodio; opción B: avisar y permitir continuar. ¿Cuál se adopta?                                                                                                                                                                                                                                                                         | RN-U15, RN-U16, P-13                                                     |
| **P-67**  | Usuario                 | ¿Debe protegerse siempre que quede al menos un Aprobador activo, o solo cuando hay solicitudes Pendientes? ¿Y al último Responsable de Activos?                                                                                                                                                                                                                                                                                                                                                                         | RN-U16                                                                   |
| **P-68**  | Usuario                 | ¿Un usuario puede inactivarse a sí mismo? Se propone que no.                                                                                                                                                                                                                                                                                                                                                                                                                                                            | RN-U17                                                                   |
| **P-69**  | Usuario                 | No existe reactivar y el correo es único: una persona que regresa necesitaría otro correo. ¿Se acepta, o se agrega un método de reactivación (CRF aparte)? Ver P-14.                                                                                                                                                                                                                                                                                                                                                    | RN-U12, RN-U04, P-14                                                     |
| **P-70**  | Usuario                 | ¿Se necesita bloqueo por intentos fallidos, expiración de sesión o recuperación de contraseña? Las fuentes no los mencionan y no se proponen. ¿Se audita el inicio de sesión (Accion_Auditoria no tiene un valor para ello)?                                                                                                                                                                                                                                                                                            | HU-36, HU-37, P-06                                                       |
| **P-71**  | Usuario                 | ¿El mensaje de usuario inactivo puede mostrarse solo con credenciales correctas (propuesta) o el inicio de sesión debe responder igual en todos los casos?                                                                                                                                                                                                                                                                                                                                                              | RN-U19, RN-U20                                                           |
| **P-72**  | Usuario                 | ¿Otros actores consultan usuarios (Gerente, Aprobador)? El Alcance 1.2 no lo menciona; se mantiene el supuesto: solo el Responsable de Activos.                                                                                                                                                                                                                                                                                                                                                                         | RN-U23 (Supuesto), Alcance 1.2                                           |
| **P-73**  | Usuario                 | ¿Cómo se crea el primer usuario del sistema (el primer Responsable de Activos), si solo ese rol puede registrar usuarios?                                                                                                                                                                                                                                                                                                                                                                                               | RN-U23, HU-32                                                            |
| **P-74**  | Rol_Permiso / Categoria | ¿Quién otorga y retira permisos y quién gestiona categorías? Se supuso el Responsable de Activos; el Alcance 1.2 solo lo nombra para la consulta de los permisos de cada rol.                                                                                                                                                                                                                                                                                                                                           | RN-RP12, RN-CA14 (Supuesto), Alcance 1.2                                 |
| **P-75**  | Rol_Permiso             | ¿Cuál es la matriz inicial de permisos por rol (qué puede hacer cada uno de los 5 roles al empezar)? Ninguna fuente la define. ¿Se confirma el orden de la lista de permisos (el de declaración de Nombre_Permiso)?                                                                                                                                                                                                                                                                                                     | RN-RP10, RN-RP11                                                         |
| **P-76**  | Rol_Permiso             | Nombre_Permiso son 9 verbos sin entidad: ¿Crear, Consultar o Actualizar qué? ¿El alcance de cada permiso es global o por entidad?                                                                                                                                                                                                                                                                                                                                                                                       | RN-RP04                                                                  |
| **P-77**  | Rol_Permiso             | El modelo no define cómo se hace cumplir un permiso (dónde se verifica y qué mensaje se muestra). ¿Se agrega un requisito no funcional?                                                                                                                                                                                                                                                                                                                                                                                 | HU-38 a HU-40                                                            |
| **P-78**  | Rol_Permiso             | retirar() elimina la fila (propuesta, única excepción a «jamás DELETE»). ¿Se acepta, o se prefiere conservar el historial con una columna activo (CRF aparte)?                                                                                                                                                                                                                                                                                                                                                          | RN-RP06                                                                  |
| **P-79**  | Rol_Permiso             | Accion_Auditoria no cubre retirar(). ¿Se agrega «Retirar» a la enumeración (CRF aparte) o se usa «Inactivar» con detalle? ¿Otorgar un permiso se audita como «Crear»?                                                                                                                                                                                                                                                                                                                                                   | RN-RP06, P-06                                                            |
| **P-80**  | Rol_Permiso             | ¿Qué pasa si se retira un permiso crítico del Responsable de Activos (por ejemplo, el que le permite otorgar permisos)? Queda sin decidir y sin regla.                                                                                                                                                                                                                                                                                                                                                                  | RN-RP06, RN-RP12                                                         |
| **P-81**  | Categoria               | ¿El nombre de la categoría distingue mayúsculas de minúsculas? Se propone que no. ¿Y tildes y espacios al inicio o al final?                                                                                                                                                                                                                                                                                                                                                                                            | RN-CA04                                                                  |
| **P-82**  | Categoria               | Al inactivar una categoría con activos o solicitudes: opción A (recomendada, coherente con RN-C14 y RN-U15): bloquear mientras haya activos sin dar de baja o solicitudes Pendientes; opción B: avisar y permitir. ¿Cuál? ¿Y las solicitudes Aprobadas sin asignación de esa categoría?                                                                                                                                                                                                                                 | RN-CA12, P-13, P-66                                                      |
| **P-83**  | Categoria               | listarActivas() no lista las categorías inactivas y ningún método las lista todas: solo se ven por identificador. ¿Se necesita un listado de inactivas?                                                                                                                                                                                                                                                                                                                                                                 | RN-CA05, RN-CA06                                                         |
| **P-84**  | Categoria               | ¿Se puede actualizar una categoría inactiva? Se propone que no.                                                                                                                                                                                                                                                                                                                                                                                                                                                         | RN-CA08                                                                  |
| **P-85**  | Categoria               | No existe reactivar y el nombre es único: una categoría inactiva deja su nombre ocupado. ¿Se acepta, o se agrega un método de reactivación (CRF aparte)? Ver P-14 y P-69.                                                                                                                                                                                                                                                                                                                                               | RN-CA09, RN-CA04                                                         |
| **P-86**  | Categoria               | La Tabla 5 de 1.7.3 pide «una HU de gestión validada con el cliente, o datos semilla declarados en el script DDL» para el catálogo: ¿se gestiona con HU-41 a HU-44 o se carga con datos semilla?                                                                                                                                                                                                                                                                                                                        | Tabla 5 de 1.7.3, RN-CA14                                                |
| **P-87**  | Categoria               | ¿El Empleado consulta las categorías activas al solicitar un equipo (N-03)? Se supuso que sí.                                                                                                                                                                                                                                                                                                                                                                                                                           | RN-CA14 (Supuesto), HU-42                                                |
| **P-88**  | Auditoría y Reportes    | ¿Quién consulta la auditoría y los reportes? El Alcance 1.2 no nombra al actor; se supuso al Gerente. ¿También el Responsable de Activos (Administrador)?                                                                                                                                                                                                                                                                                                                                                               | RN-AU15, RN-R14 (Supuesto), HU-45, HU-46                                 |
| **P-89**  | Auditoría               | ¿Se acepta la tabla A.6 como lista de «acciones relevantes» a auditar? El Alcance 1.2 solo nombra asignaciones, devoluciones, cambios de responsable y bajas; la tabla agrega altas y cambios de las demás entidades por propuesta. ¿Qué se considera «relevante»?                                                                                                                                                                                                                                                      | RN-T02, A.6, P-06                                                        |
| **P-90**  | Auditoría               | ¿Se audita la acción «Consultar»? Opciones: A) ninguna consulta (propuesta de partida: el Alcance no las lista y se evita un volumen enorme de registros; Consultar quedaría sin uso); B) todas; C) solo las de datos sensibles (Usuario, Rol_Permiso y Auditoria). ¿Cuál se adopta?                                                                                                                                                                                                                                    | RN-AU17, A.6, P-06                                                       |
| **P-91**  | Auditoría               | Firmar el acta no tiene valor en Accion_Auditoria. Propuesta: «Crear» (se crea el acta firmada); alternativa: agregar «Firmar» (requiere un CRF). ¿Cuál?                                                                                                                                                                                                                                                                                                                                                                | HU-19, A.6, RN-AU12                                                      |
| **P-92**  | Auditoría               | Iniciar sesión no tiene valor en Accion_Auditoria (¿Consultar?) y cambiar la contraseña tampoco. Propuesta: no auditar el inicio de sesión mientras no exista un valor «Ingresar» (CRF aparte) y auditar el cambio de contraseña como «Actualizar» con un Detalle sin contraseñas. ¿Se acepta?                                                                                                                                                                                                                          | HU-36, HU-37, P-70, RN-AU08                                              |
| **P-93**  | Auditoría               | Retirar un permiso elimina una fila de Rol_Permiso y no queda cubierto por «Inactivar». Propuesta: agregar el valor «Retirar» (CRF) y, mientras tanto, «Inactivar» con un Detalle que indique el retiro. ¿Cuál?                                                                                                                                                                                                                                                                                                         | HU-39, P-79, RN-AU12                                                     |
| **P-94**  | Auditoría               | Asignar un permiso: el valor «Asignar» parece reservado a la asignación de activos. Propuesta: «Crear» (se crea el par rol–permiso). ¿Se acepta, o debe usarse «Asignar»?                                                                                                                                                                                                                                                                                                                                               | HU-38, RN-AU12                                                           |
| **P-95**  | Auditoría               | El Alcance 1.2 lista «cambios de responsable» entre las acciones auditables, pero no existe un método ni un valor de Accion para ello. ¿Cómo se registra un cambio de responsable? Ver P-31 y P-16.                                                                                                                                                                                                                                                                                                                     | HU-17, P-31, P-16, A.6                                                   |
| **P-96**  | Auditoría               | ¿Una operación debe fallar cuando falla el registro de su auditoría? Propuesta: sí (la operación y su registro se confirman juntos o ninguno), porque el Alcance pide un registro «completo». La alternativa es completar la operación y reintentar el registro.                                                                                                                                                                                                                                                        | RN-AU11, CRF-002 (0.8)                                                   |
| **P-97**  | Auditoría               | ID_Registro es un INT obligatorio, pero Rol_Permiso tiene clave compuesta de ENUM y Reportes es una vista sin PK. ¿Qué ID_Registro se guarda en esos casos? Opciones: A) un valor convencional (por ejemplo 0) documentado; B) volver ID_Registro opcional (CRF aparte).                                                                                                                                                                                                                                                | RN-R13, HU-38, HU-39, HU-46                                              |
| **P-98**  | Auditoría               | ¿Qué se guarda en Detalle (300 caracteres) y qué valores puede tener Entidad? Entidad es texto libre (nombre de la tabla): ¿se fija una lista cerrada? Propuesta: nombres de clase del modelo y un Detalle breve, sin datos sensibles ni contraseñas.                                                                                                                                                                                                                                                                   | RN-AU05, RN-AU08, A.6                                                    |
| **P-99**  | Auditoría               | ¿Basta con consultar un registro de auditoría por su identificador? Para encontrar un registro hay que conocer su ID. La alternativa B (listado filtrado por usuario, entidad, acción y rango de fechas) exige un CRF y un método nuevo; ver C.8.                                                                                                                                                                                                                                                                       | HU-45, C.8                                                               |
| **P-100** | Auditoría               | Accion_Auditoria tiene 10 valores y Nombre_Permiso 9: Rechazar no tiene permiso propio. ¿Qué permiso exige rechazar una solicitud? Propuesta: el mismo permiso Aprobar.                                                                                                                                                                                                                                                                                                                                                 | RN-AU07, HU-13, C.8                                                      |
| **P-101** | Reportes                | ¿Qué fecha filtra cada reporte? Propuesta: Asignados por Fecha_Entrega y Pendientes_Devolucion por Fecha_Devolucion_Esperada; Disponibles y Mal_Estado reflejan el estado actual y las fechas no los filtran, aunque Fecha_Inicio es obligatoria para los cuatro tipos. ¿Se acepta?                                                                                                                                                                                                                                     | RN-R06 a RN-R09, HU-46                                                   |
| **P-102** | Reportes                | ¿Asignados incluye solo asignaciones Vigentes o también Cerradas (historial)? ¿Pendientes_Devolucion excluye las que ya tienen una devolución registrada? ¿Mal_Estado es solo Dañado? Se propone Vigentes, sin excluir devoluciones registradas, y solo Dañado.                                                                                                                                                                                                                                                         | RN-R06, RN-R07, RN-R09                                                   |
| **P-103** | Reportes                | ¿Qué columnas y qué orden tiene cada reporte? Se tomaron solo de Activo, Asignacion y Devolucion, sin indicadores; por eso se muestra ID_Custodio y no el nombre del custodio. ¿Se necesita el nombre o algún total?                                                                                                                                                                                                                                                                                                    | RN-R10, RN-R11                                                           |
| **P-104** | Reportes                | Si Fecha_Fin está vacía, ¿el rango llega hasta hoy? ¿Una Fecha_Fin anterior a Fecha_Inicio debe rechazarse? Se propone que sí a ambas.                                                                                                                                                                                                                                                                                                                                                                                  | RN-R04, RN-R05                                                           |
| **P-105** | Sesión (transversal)    | ¿El custodio de la solicitud y del reporte de daño (ID_Custodio), el aprobador de la decisión (ID_Aprobador), el receptor de la devolución (ID_Receptor) y el técnico del mantenimiento (ID_Tecnico) se toman siempre del usuario en sesión o se digitan? Esta pregunta absorbe la P-27 original del Bloque 2 (custodio y aprobador). Si se toman de la sesión, la fila «ID_Custodio de otro empleado» de HU-09 CA-5, la fila «distinto del usuario en sesión» de HU-13 CA-7 y sus mensajes (M-272 y M-273) se retiran. | RN-T03, RN-S10, RN-AP12, RN-D13, RN-RD06, RN-H09, HU-09 CA-5, HU-13 CA-7 |

**I. Conteos y cobertura de métodos**

**I.1 Conteos globales (por script)**

| **Concepto**                      | **Cantidad**                                     |
|-----------------------------------|--------------------------------------------------|
| **HU**                            | 46                                               |
| **Criterios de aceptación (CA)**  | 279 (279 − 1 por HU-24 + 1 por el CA-6 de HU-10) |
| **Reglas de negocio (RN)**        | 257 (254 de entidad + 3 transversales)           |
| **Requisitos funcionales (RF)**   | 172 (RF-01 a RF-172)                             |
| **Mensajes (M)**                  | 273 (M-01 a M-273)                               |
| **Preguntas para el cliente (P)** | 105 (P-01 a P-105)                               |
| **Métodos públicos**              | 62 (61 del UML v6 + Solicitud.listarAprobadas()) |
| **Métodos INTERNO**               | 14                                               |
| **Total de métodos**              | 76                                               |

**I.2 Por bloque**

| **Bloque**                                                      | **HU** | **CA** | **RN**                                          | **RF finales** | **Mensajes nuevos**             | **Preguntas nuevas** |
|-----------------------------------------------------------------|--------|--------|-------------------------------------------------|----------------|---------------------------------|----------------------|
| **Piloto (Activo)**                                             | 4      | 25     | 19                                              | 16             | 32 (M-01 a M-32)                | 0                    |
| **Bloque 1 (Custodio)**                                         | 4      | 23     | 17                                              | 12             | 27 (M-33 a M-59)                | 18 (P-01 a P-18)     |
| **Bloque 2 (Solicitud, Aprobacion)**                            | 6      | 33     | 34                                              | 28             | 34 (M-60 a M-91, M-272 y M-273) | 8 (P-19 a P-26)      |
| **Bloque 4a (Asignacion, Acta)**                                | 6      | 37     | 35                                              | 27             | 40 (M-92 a M-131)               | 15 (P-27 a P-41)     |
| **Bloque 4b (Devolucion, Notificacion)**                        | 5      | 34     | 31                                              | 24             | 28 (M-132 a M-159)              | 8 (P-42 a P-49)      |
| **Bloque 5 (Daños, Mantenimientos)**                            | 6      | 37     | 37                                              | 23             | 42 (M-160 a M-201)              | 10 (P-50 a P-59)     |
| **Bloque 6a (Usuario)**                                         | 6      | 36     | 23                                              | 16             | 35 (M-202 a M-236)              | 14 (P-60 a P-73)     |
| **Bloque 6b (Rol_Permiso, Categoria)**                          | 7      | 40     | 26                                              | 17             | 26 (M-237 a M-262)              | 14 (P-74 a P-87)     |
| **Bloque 7 (Auditoria, Reportes)**                              | 2      | 14     | 32                                              | 9              | 9 (M-263 a M-271)               | 17 (P-88 a P-104)    |
| **Transversales (RN-T01 a RN-T03) y pregunta de consolidación** | —      | —      | 3 (RN-T01 a RN-T03; T01 y T02 vienen de 6a y 7) | —              | —                               | 1 (P-105)            |
| **TOTAL**                                                       | 46     | 279    | 257                                             | 172            | 273                             | 105                  |

*Preguntas del Bloque 2: P-19 a P-26 (la P-27 original quedó absorbida por P-105). Mensajes del Bloque 2: M-60 a M-91 más M-272 y M-273. Criterios por HU: HU-01: 6; HU-02: 6; HU-03: 7; HU-04: 6; HU-05: 6; HU-06: 5; HU-07: 6; HU-08: 6; HU-09: 5; HU-10: 6; HU-11: 5; HU-12: 5; HU-13: 7; HU-14: 5; HU-15: 7; HU-16: 7; HU-17: 5; HU-18: 7; HU-19: 6; HU-20: 5; HU-21: 7; HU-22: 7; HU-23: 7; HU-24: 7; HU-25: 6; HU-26: 7; HU-27: 6; HU-28: 7; HU-29: 7; HU-30: 5; HU-31: 5; HU-32: 6; HU-33: 5; HU-34: 7; HU-35: 7; HU-36: 5; HU-37: 6; HU-38: 6; HU-39: 5; HU-40: 5; HU-41: 5; HU-42: 6; HU-43: 6; HU-44: 7; HU-45: 7; HU-46: 7.*

**I.3 Métodos por entidad**

| **Entidad**                    | **Públicos** | **INTERNO** | **HU padre**                                 |
|--------------------------------|--------------|-------------|----------------------------------------------|
| **Activo**                     | 7            | 2           | 4 (HU-01, HU-02, HU-03, HU-04)               |
| **Custodio**                   | 6            | 2           | 4 (HU-05, HU-06, HU-07, HU-08)               |
| **Solicitud**                  | 7            | 0           | 4 (HU-09, HU-10, HU-11, HU-12)               |
| **Aprobacion**                 | 2            | 1           | 2 (HU-13, HU-14)                             |
| **Asignacion**                 | 7            | 2           | 4 (HU-15, HU-16, HU-17, HU-18)               |
| **Acta_De_Entrega**            | 2            | 1           | 2 (HU-19, HU-20)                             |
| **Devolucion**                 | 5            | 1           | 4 (HU-21, HU-22, HU-23, HU-24)               |
| **Notificacion_De_Devolucion** | 1            | 1           | 1 (HU-25)                                    |
| **Reporte_de_Danios**          | 4            | 0           | 3 (HU-26, HU-27, HU-28)                      |
| **Historial_Mantenimientos**   | 4            | 0           | 3 (HU-29, HU-30, HU-31)                      |
| **Usuario**                    | 7            | 1           | 6 (HU-32, HU-33, HU-34, HU-35, HU-36, HU-37) |
| **Rol_Permiso**                | 3            | 1           | 3 (HU-38, HU-39, HU-40)                      |
| **Categoria**                  | 5            | 1           | 4 (HU-41, HU-42, HU-43, HU-44)               |
| **Auditoria**                  | 1            | 1           | 1 (HU-45)                                    |
| **Reportes**                   | 1            | 0           | 1 (HU-46)                                    |
| **TOTAL**                      | 62           | 14          | 46                                           |

**I.4 Los 14 INTERNO y la RN que protegen**

Se cita la frase de la tabla de métodos de cada bloque. En las filas resaltadas la RN no nombra el método: el vínculo lo deduce la consolidación (aprobado el 08/10/2026).

| **Método INTERNO**                                     | **Frase de la tabla de métodos del bloque**                                                                                                                             | **RN que protege** | **Vínculo**                                  |
|--------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------|----------------------------------------------|
| **Activo.existeNumeroSerie()**                         | Verifica que el número de serie no exista (Unique en v6). Protege la unicidad dentro de crear() y actualizar().                                                         | RN-A03 (y RN-A13)  | vínculo deducido (la RN no nombra el método) |
| **Activo.existePlaca()**                               | Verifica que la placa de inventario no exista (Unique en v6). Protege la unicidad dentro de crear() y actualizar().                                                     | RN-A04 (y RN-A13)  | vínculo deducido (la RN no nombra el método) |
| **Custodio.existeCustodioDeUsuario()**                 | Verifica que el usuario no tenga ya un custodio (ID_Usuario único). Protege la unicidad dentro de crear().                                                              | RN-C06             | vínculo deducido (la RN no nombra el método) |
| **Custodio.existeDocumento()**                         | Verifica que la pareja tipo_documento + N_documento no exista. Protege la unicidad dentro de crear() y actualizar(). RN propuesta, pendiente de validar con el cliente. | RN-C05             | vínculo deducido (la RN no nombra el método) |
| **Aprobacion.existeDecisionDeSolicitud()**             | Verifica que la solicitud no tenga ya una decisión (ID_Solicitud Unique en v6). Protege la regla dentro de decidir().                                                   | RN-AP06            | vínculo deducido (la RN no nombra el método) |
| **Asignacion.existeAsignacionDeSolicitud()**           | Verifica que la solicitud no tenga ya una asignación (ID_Solicitud Unique). Protege la regla dentro de asignar().                                                       | RN-AS05 (y RN-S21) | RN nombrada en la regla                      |
| **Asignacion.activoDisponible()**                      | Verifica que el equipo esté Disponible antes de entregarlo. (RN propuesta: implícita en 1.7.3)                                                                          | RN-AS07            | RN nombrada en la regla                      |
| **Acta_De_Entrega.existeActaDeAsignacion()**           | Verifica que la asignación no tenga ya un acta (ID_Asignacion Unique). Protege la regla dentro de firmar().                                                             | RN-AC06            | RN nombrada en la regla                      |
| **Devolucion.existeDevolucionDeAsignacion()**          | Verifica que la asignación no tenga ya una devolución (ID_Asignacion Unique; RN propuesta, CRF-002 0.7). Protege la regla dentro de registrar().                        | RN-D06             | RN nombrada en la regla                      |
| **Notificacion_De_Devolucion.calcularDiasRestantes()** | Calcula Dias_Restantes = Fecha_Devolucion_Esperada − fecha actual.                                                                                                      | RN-N04             | RN nombrada en la regla                      |
| **Usuario.existeEmail()**                              | Verifica que el correo no exista (Email único). Protege la unicidad dentro de crear() y actualizar().                                                                   | RN-U04             | RN nombrada en la regla                      |
| **Rol_Permiso.existeAsignacion()**                     | Verifica que la pareja rol–permiso no exista (PK compuesta). Protege la regla dentro de asignar().                                                                      | RN-RP05            | RN nombrada en la regla                      |
| **Categoria.existeNombreCategoria()**                  | Verifica que el nombre de categoría no exista (Nombre_Categoria Unique). Protege la regla dentro de crear() y actualizar().                                             | RN-CA04            | RN nombrada en la regla                      |
| **Auditoria.registrar()**                              | Registra una acción en la auditoría. Lo invocan las demás operaciones; ningún actor lo pide. Fecha_Accion la asigna el sistema. Qué pasa si falla (P-96).               | RN-AU02 (y RN-T02) | RN nombrada en la regla                      |

**J. Observaciones de ingeniería y CRF-003**

**J.1 Observaciones solicitadas**

1\) El catálogo de la Fase A que se subió es anterior al CRF-003: tiene 75 filas (61 públicos + 14 INTERNO) y necesita la fila Solicitud.listarAprobadas() → HU-10 \[Nuevo\], con lo que quedan 62 públicos + 14 INTERNO = 76. Hasta entonces la fila está respaldada por la adenda de HU-10 del Bloque 4a (RN-S21, RF-12 (en la numeración final: RF-74) y CA-6).

2\) Cinco títulos difieren entre la ficha y el catálogo provisional de la Fase A. Se usa el título de la ficha y la numeración no cambia (HU-01 a HU-46).

| **HU**    | **Título en la ficha (se usa)** | **Título en la Fase A**         |
|-----------|---------------------------------|---------------------------------|
| **HU-33** | Consultar usuario               | Consultar usuarios              |
| **HU-38** | Asignar permiso a un rol        | Otorgar permiso a un rol        |
| **HU-39** | Retirar permiso a un rol        | Retirar permiso de un rol       |
| **HU-45** | Consultar registro de auditoría | Consultar auditoría             |
| **HU-46** | Consultar reportes              | Consultar reportes bajo demanda |

3\) Cinco INTERNO están vinculados por deducción, porque la RN que los respalda no nombra el método: Activo.existeNumeroSerie() (RN-A03) y Activo.existePlaca() (RN-A04), Custodio.existeCustodioDeUsuario() (RN-C06) y Custodio.existeDocumento() (RN-C05), y Aprobacion.existeDecisionDeSolicitud() (RN-AP06). Ver I.4.

**J.2 Colisión de códigos entre el Bloque 2 y el Bloque 4a (decisión del 08/10/2026)**

El Bloque 4a reutilizó M-92, M-93 y P-27 con otro significado. Se conserva el del Bloque 4a y los significados del Bloque 2 pasan a códigos nuevos; las citas de P-27, M-92 y M-93 que venían del Bloque 2 (RN-S10, RN-AP12, las notas de HU-09 y HU-13 y sus listas) se redirigieron.

| **Código** | **Bloque 2 (significado anterior)**                             | **Código nuevo**                                     | **Bloques 4a en adelante (se conserva)**                                                       |
|------------|-----------------------------------------------------------------|------------------------------------------------------|------------------------------------------------------------------------------------------------|
| **M-92**   | El custodio no corresponde al empleado que solicita.            | M-272                                                | No hay solicitudes aprobadas pendientes de asignación.                                         |
| **M-93**   | El aprobador debe ser el usuario con sesión iniciada.           | M-273                                                | Equipo asignado correctamente.                                                                 |
| **P-27**   | ¿El custodio y el aprobador se toman de la sesión o se digitan? | P-105 (absorbida por la nueva pregunta del cambio 7) | ¿El Responsable de Activos consulta las solicitudes pendientes y las aprobadas sin asignación? |

**J.3 Cambios aplicados de la consolidación, y si el Word vigente ya los traía**

| **N°** | **Cambio**                                                                                                                   | **Estado en el Word vigente** | **Detalle**                                                                                                                                                                                                                                                                                                                                                         |
|--------|------------------------------------------------------------------------------------------------------------------------------|-------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **1**  | Códigos renumerados (6a, 6b y 7)                                                                                             | Aplicado                      | 138 filas en K; ningún código provisional queda en el texto (se verifica en el Paso 4)                                                                                                                                                                                                                                                                              |
| **2**  | M-66 y M-67 pasan a Informativo                                                                                              | Aplicado                      | Estaban como Error (M-66 «El custodio no tiene solicitudes.», M-67 «No hay solicitudes pendientes.»)                                                                                                                                                                                                                                                                |
| **3**  | HU-24: se unen CA-6 y CA-7                                                                                                   | Aplicado                      | Pasa de 8 a 7 criterios: CA-6 «Receptor inexistente, inactivo o sin el rol Responsable de Activos» y el antiguo CA-8 pasa a CA-7; se ajustaron las verificaciones de RN-D14 y RN-D15                                                                                                                                                                                |
| **4**  | HU-18: placa del activo 5 NEX-000104 → NEX-000105                                                                            | Aplicado                      | 2 apariciones en HU-18; HU-24 ya usaba NEX-000105. HU-01 y HU-03 usan NEX-000104 para otros activos y no cambian                                                                                                                                                                                                                                                    |
| **5**  | Origen de Aprobacion.ID_Solicitud: «una sola decisión por solicitud»                                                         | Ya estaba                     | El Bloque 2 ya dice «Dominio: una sola decisión por solicitud (diccionario v6, Unique); decisiones trazables (N-04)». La frase de 1.7.3 es «Toda solicitud debe tener una decisión de aprobación atribuible a una persona identificada (N-04)»: es la necesidad N-04, no el Origen del atributo, y no se cambia. El atributo vive en el Anexo 3                     |
| **6a** | Adenda de HU-10: CA-6 y fila nueva en los Ejemplos de CA-4                                                                   | Aplicado                      | HU-10 pasa de 5 a 6 criterios; el CA-4 cita listarAprobadas() y RN-S21                                                                                                                                                                                                                                                                                              |
| **6b** | Adenda de HU-10: RN-S21, RF-12 reformulado (en la numeración final: RF-74), M-92 y P-27                                      | Ya estaban                    | Están en las listas acumuladas del Bloque 4a en adelante; aquí se toman de esas listas                                                                                                                                                                                                                                                                              |
| **6c** | Redacción nueva de RN-A16 y RN-A19 (asignación Vigente; M-26 no cambia)                                                      | Aplicado                      | En la sección D (el Bloque 4a la traía como propuesta, sin integrar)                                                                                                                                                                                                                                                                                                |
| **7**  | IDs desde el usuario en sesión (ID_Custodio, ID_Aprobador, ID_Receptor, ID_Tecnico)                                          | Aplicado                      | Solo la regla RN-T03 y la pregunta P-105; sin escenarios nuevos: el Bloque 2 vigente ya trae los escenarios y mensajes de sesión (HU-09 CA-5, HU-13 CA-7)                                                                                                                                                                                                           |
| **8**  | Acumulado de escenarios                                                                                                      | Aplicado                      | 279 criterios por script (ver I.2); no había cifra acumulada en el texto de los bloques                                                                                                                                                                                                                                                                             |
| **9**  | Actualización del 01/11/2026: RF finales y CRF-003 (campo «RF derivados», sección C, tabla de bloques, notas de J y portada) | Aplicado                      | Los 46 campos «RF derivados» y la sección C pasan a los RF finales (RF-01 a RF-172); la sección C queda como la tabla C.1 de trazabilidad HU → RF → Entidad → Clase.método; la columna de RF de la tabla de bloques se recalcula (total 172); dos notas de J agregan «en la numeración final: RF-74»; la portada cambia la fecha y agrega la frase de actualización |

**J.4 Regla transversal y pregunta del cambio 7**

RN-T03: «ID_Custodio (de la solicitud y del reporte de daño), ID_Aprobador, ID_Receptor e ID_Tecnico salen del usuario en sesión; no se digitan.» Es una regla propuesta, pendiente de validar con el cliente. La pregunta P-105 pide confirmar si custodio, aprobador, receptor y técnico se toman siempre de la sesión; si se confirma, se retiran la fila «ID_Custodio de otro empleado» de HU-09 CA-5, la fila «distinto del usuario en sesión» de HU-13 CA-7 y sus mensajes M-272 y M-273.

**J.5 CRF-003**

Decisión adoptada: A1 + M-a + B-1 con precondición + C1a. Estado_Activo cambia por poscondiciones (sin métodos nuevos); el mantenimiento no cambia el estado y el Responsable lo devuelve a Disponible con Activo.actualizar(); Asignacion.cerrar() se conserva bajo HU-18 y solo procede con una Devolucion Confirmada (lo invoca confirmarRecepcion()); se agrega Solicitud.listarAprobadas() bajo HU-10. Conteos: 62 públicos + 14 INTERNO = 76; 46 HU. Cambios (copiados del Anexo E del Bloque 4a):

| **Cambio**   | **Descripción**                                                                                                                                                                                                                                                                                                                   | **Documentos afectados**                                                                                                                                                                               |
|--------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **Cambio 1** | Asignacion.asignar() deja el Activo en Estado Asignado (poscondición).                                                                                                                                                                                                                                                            | Diccionario v6: observaciones de Activo.Estado y de la tabla Asignacion. UML v6: nota de poscondición en Asignacion. Fase A v6: descripción de asignar(). Sin métodos nuevos.                          |
| **Cambio 2** | Devolucion.confirmarRecepcion() invoca Asignacion.cerrar(): la asignación pasa a Cerrada y el Activo a Disponible, salvo que esté Dañado; en ese caso conserva Dañado (no es una transición). Ningún método marca «recibido dañado».                                                                                              | Diccionario v6: observaciones de Devolucion.Estado_Recepcion y de Activo.Estado. UML v6: nota en Devolucion. Fase A v6: descripciones de confirmarRecepcion() y cerrar(). Sin métodos nuevos.          |
| **Cambio 3** | Reporte_de_Danios.crear() deja el Activo en Dañado, también si está Asignado. Activo.actualizar() conserva los cambios manuales. M-26 no cambia. Regla derivada: las condiciones sobre «activo asignado» (RN-A16, RN-A19) se basan en que exista una Asignacion Vigente (buscarVigentePorActivo), no en Estado_Activo = Asignado. | Diccionario v6: observaciones de Reporte_de_Danios y de Activo.Estado. UML v6: nota en Reporte_de_Danios. Fase A v6: descripción de crear(). Piloto: RN-A16 y RN-A19 (adenda D.2). Sin métodos nuevos. |
| **Cambio 4** | Historial_Mantenimientos.crear() no cambia Estado_Activo; el Responsable de Activos lo devuelve a Disponible con Activo.actualizar(), sin Asignacion Vigente.                                                                                                                                                                     | Diccionario v6: observación de Historial_Mantenimientos. UML v6: nota en Historial_Mantenimientos. Fase A v6: descripción de crear(). Piloto: RN-A16. Sin métodos nuevos.                              |
| **Cambio 5** | Asignacion.cerrar() (HU-18) es la operación de cierre; Devolucion.confirmarRecepcion() (HU-24) la invoca; cerrar() solo procede si existe una Devolucion en estado Confirmada.                                                                                                                                                    | Diccionario v6: observaciones de Asignacion.Estado_Asignacion y de Devolucion. UML v6: nota en Asignacion. Fase A v6: descripciones de cerrar(), HU-18 y HU-24. Sin métodos nuevos.                    |
| **Cambio 6** | Se agrega Solicitud.listarAprobadas() (público, bajo HU-10): trae las solicitudes Aprobada sin Asignacion, de la más antigua a la más reciente. HU-10 gana al Responsable de Activos como actor secundario.                                                                                                                       | Diccionario v6: métodos de Solicitud. UML v6: clase Solicitud (+1 método). Fase A v6: tabla de métodos, conteos y trazabilidad de HU-10. Bloque 2: adenda D.1.                                         |

**J.6 Verificaciones por script**

• La tabla G tiene 63 filas: los 62 métodos públicos más «(cambio de responsable)», que no tiene método (P-31, P-95). Su introducción, copiada literal del Bloque 7, dice «HU-01 a HU-44» aunque la tabla cubre HU-01 a HU-46.

• En el Bloque 4a la lista de preguntas omite P-26 («no se usa»); el Bloque 4b la restableció con el mismo texto del Bloque 2. La lista H es continua de P-01 a P-105.

• Textos de mensaje repetidos con códigos distintos: ninguno.

**J.7 Observaciones de ingeniería del Bloque 6b**

| **Tema**                             | **Observación**                                                                                                                                                                                                 | **Tratamiento en el bloque**                                                              |
|--------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------|
| **Alcance frente a Permiso ENUM**    | El Alcance 1.2 dice «gestionar roles y permisos», pero Permiso es el ENUM Nombre_Permiso y no tiene HU de gestión (CRF-002, cambio 0.4).                                                                        | La gestión se cumple otorgando, retirando y consultando permisos por rol (HU-38 a HU-40). |
| **Permisos sin entidad**             | Nombre_Permiso son 9 verbos sin entidad: no se sabe sobre qué actúa cada uno.                                                                                                                                   | P-76.                                                                                     |
| **Cumplimiento del permiso**         | El modelo no define cómo se hace cumplir un permiso: posible requisito no funcional.                                                                                                                            | P-77.                                                                                     |
| **Matriz inicial**                   | Ninguna fuente define qué permisos tiene cada rol.                                                                                                                                                              | RN-RP11 y P-75: el sistema no la fija.                                                    |
| **Excepción a «jamás DELETE»**       | Rol_Permiso no tiene columna activo ni historial propio.                                                                                                                                                        | RN-RP06 (retirar elimina la fila) y P-78.                                                 |
| **Auditoría de retirar**             | Accion_Auditoria no tiene un valor que cubra retirar().                                                                                                                                                         | Propuesta «Retirar» o «Inactivar» con detalle (C.5, P-79).                                |
| **Permisos y acciones de auditoría** | Accion_Auditoria tiene 10 valores y Nombre_Permiso 9: Rechazar existe solo como acción de auditoría.                                                                                                            | Sin cambio; queda para la compilación de la auditoría.                                    |
| **Único catálogo gestionable**       | Tabla 5 de 1.7.3 lista «Catálogos (Categoria, Tipo_Documento)» y «Usuarios, roles y permisos (Usuario, Rol, Permiso, Rol_Permiso)», con nombres de v5. Tras el CRF-002, Rol, Permiso y Tipo_Documento son ENUM. | Categoria es el único catálogo con HU de gestión (HU-41 a HU-44); P-86.                   |
| **Categorías inactivas**             | listarActivas() no lista las inactivas y ningún método las lista todas.                                                                                                                                         | P-83.                                                                                     |

**J.8 Observaciones de ingeniería del Bloque 7**

| **Tema**                                                | **Observación**                                                                                                                                                                                                                                                                        | **Tratamiento en el bloque**                                                                      |
|---------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------|
| **Tipo de retorno de consultar()**                      | El UML declara que Reportes.consultar() devuelve «Reporte», que no es una clase del modelo ni aparece en el diccionario v6.                                                                                                                                                            | No se resuelve en este bloque. HU-46 se redacta como un listado de filas (RN-R16).                |
| **Diferencias entre el UML y el diccionario**           | Se contrastaron Auditoria y Reportes (atributos, tipos, obligatoriedad, enumeraciones y métodos). No se encontraron diferencias.                                                                                                                                                       | Sin cambio.                                                                                       |
| **Actores sin respaldo en el Alcance**                  | El Alcance 1.2 pide el registro de auditoría y los reportes bajo demanda, pero no nombra a quien los consulta. La Tabla 5 de 1.7.3 los marca «Figura en el alcance; la encuesta no la menciona. Citar el alcance y validar con el cliente».                                            | Gerente como Supuesto; Marta Rojas no se incluye como actor secundario (P-88).                    |
| **Acciones de auditoría sin cobertura**                 | No tienen un valor adecuado en Accion_Auditoria: firmar el acta, iniciar sesión, retirar un permiso, asignar un permiso (el valor «Asignar» parece reservado a los activos) y el cambio de responsable (sin método).                                                                   | Quedan en la tabla A.6 con una propuesta y en preguntas (P-91 a P-95); no se decide ninguna.      |
| **ID_Registro obligatorio**                             | ID_Registro es un INT obligatorio, pero Rol_Permiso tiene clave compuesta de ENUM y Reportes es una vista sin PK: no tienen un entero que referenciar.                                                                                                                                 | P-97.                                                                                             |
| **Entidad y Detalle abiertos**                          | Entidad es texto libre de 50 caracteres sin lista de valores y Detalle no tiene contenido definido: el riesgo es que los registros queden inconsistentes entre operaciones.                                                                                                            | P-98.                                                                                             |
| **Atomicidad de la auditoría**                          | El CRF-002 (§4) deja abierto si una operación debe fallar cuando falla su registro de auditoría. De ello depende si la auditoría es transaccional.                                                                                                                                     | RN-AU11 y P-96.                                                                                   |
| **Acciones y permisos**                                 | Accion_Auditoria tiene 10 valores y Nombre_Permiso tiene 9: Rechazar existe solo como acción de auditoría y no tiene permiso propio.                                                                                                                                                   | P-100; sin cambio.                                                                                |
| **Fecha_Inicio obligatoria sin fecha natural**          | Fecha_Inicio es obligatoria para los cuatro tipos de reporte, pero Activo no tiene una columna de fecha y Reporte_de_Danios no es una de las tablas de la vista: Disponibles y Mal_Estado no tienen una fecha natural por la que filtrar.                                              | Las fechas se exigen y no filtran esos dos tipos (RN-R08, RN-R09; P-101).                         |
| **Reportes sin datos de personas**                      | La vista usa solo Activo, Asignacion y Devolucion: no puede mostrar el nombre del custodio, solo su ID_Custodio.                                                                                                                                                                       | P-103.                                                                                            |
| **Consulta de la auditoría solo por identificador**     | Con buscarPorId() como único método (opción A), un registro solo se encuentra si se conoce su identificador: no hay forma de buscar por usuario, entidad, acción o fecha.                                                                                                              | HU-45 se redacta con buscarPorId() (opción A). La alternativa B se describe abajo y no se aplica. |
| **Alternativa B para HU-45 (no aplicada): descripción** | Agregar a Auditoria un método de listado filtrado por usuario, entidad, acción y rango de fechas, bajo HU-45 (por ejemplo, listar con esos cuatro filtros opcionales).                                                                                                                 | No se aplica. Exigiría un CRF nuevo y cambiaría el modelo.                                        |
| **Alternativa B: ventajas**                             | Cumple de verdad el «registro completo de auditoría» del Alcance 1.2, porque permite consultar lo ocurrido sin conocer el identificador; sirve para auditorías por usuario, por entidad o por período; da sentido a los valores de Accion_Auditoria.                                   | Se deja como opción para el cliente (P-99).                                                       |
| **Alternativa B: desventajas**                          | Requiere un CRF; agrega un método público no previsto en el diccionario v6 ni en el UML v6; exige definir el orden, los filtros obligatorios y un posible volumen alto de resultados (¿paginación?); obliga a repetir el análisis de la HU-45 y de las preguntas sobre quién consulta. | Se deja como opción para el cliente (P-99).                                                       |
| **Alternativa B: efecto en los conteos**                | Los métodos públicos pasarían de 62 a 63; los INTERNO seguirían en 14; el total pasaría de 76 a 77.                                                                                                                                                                                    | Sin aplicar: los conteos vigentes son 62 + 14 = 76.                                               |

**K. Tabla de equivalencias de códigos (fila por fila)**

Código provisional (o anterior) → código definitivo. Los códigos de los Bloques 6a, 6b y 7 se renumeraron a continuación del último definitivo del Bloque 5 (RF-34, M-201, P-59). Las RN con prefijo (U, RP, CA, AU, R) y las HU no se renumeran.

| **Código provisional / anterior** | **Código definitivo** | **Bloque**                          | **Observación**                                                                                          |
|-----------------------------------|-----------------------|-------------------------------------|----------------------------------------------------------------------------------------------------------|
| **RF-6A-01**                      | RF-35                 | Bloque 6a (Usuario)                 |                                                                                                          |
| **RF-6A-02**                      | RF-36                 | Bloque 6a (Usuario)                 |                                                                                                          |
| **RF-6A-03**                      | RF-37                 | Bloque 6a (Usuario)                 |                                                                                                          |
| **RF-6A-04**                      | RF-38                 | Bloque 6a (Usuario)                 |                                                                                                          |
| **RF-6A-05**                      | RF-39                 | Bloque 6a (Usuario)                 |                                                                                                          |
| **RF-6A-06**                      | RF-40                 | Bloque 6a (Usuario)                 |                                                                                                          |
| **RF-6A-07**                      | RF-41                 | Bloque 6a (Usuario)                 |                                                                                                          |
| **RF-6B-01**                      | RF-42                 | Bloque 6b (Rol_Permiso y Categoria) |                                                                                                          |
| **RF-6B-02**                      | RF-43                 | Bloque 6b (Rol_Permiso y Categoria) |                                                                                                          |
| **RF-6B-03**                      | RF-44                 | Bloque 6b (Rol_Permiso y Categoria) |                                                                                                          |
| **RF-6B-04**                      | RF-45                 | Bloque 6b (Rol_Permiso y Categoria) |                                                                                                          |
| **RF-6B-05**                      | RF-46                 | Bloque 6b (Rol_Permiso y Categoria) |                                                                                                          |
| **RF-6B-06**                      | RF-47                 | Bloque 6b (Rol_Permiso y Categoria) |                                                                                                          |
| **RF-6B-07**                      | RF-48                 | Bloque 6b (Rol_Permiso y Categoria) |                                                                                                          |
| **RF-7-01**                       | RF-49                 | Bloque 7 (Auditoria y Reportes)     |                                                                                                          |
| **RF-7-02**                       | RF-50                 | Bloque 7 (Auditoria y Reportes)     |                                                                                                          |
| **M-6A-001**                      | M-202                 | Bloque 6a (Usuario)                 |                                                                                                          |
| **M-6A-002**                      | M-203                 | Bloque 6a (Usuario)                 |                                                                                                          |
| **M-6A-003**                      | M-204                 | Bloque 6a (Usuario)                 |                                                                                                          |
| **M-6A-004**                      | M-205                 | Bloque 6a (Usuario)                 |                                                                                                          |
| **M-6A-005**                      | M-206                 | Bloque 6a (Usuario)                 |                                                                                                          |
| **M-6A-006**                      | M-207                 | Bloque 6a (Usuario)                 |                                                                                                          |
| **M-6A-007**                      | M-208                 | Bloque 6a (Usuario)                 |                                                                                                          |
| **M-6A-008**                      | M-209                 | Bloque 6a (Usuario)                 |                                                                                                          |
| **M-6A-009**                      | M-210                 | Bloque 6a (Usuario)                 |                                                                                                          |
| **M-6A-010**                      | M-211                 | Bloque 6a (Usuario)                 |                                                                                                          |
| **M-6A-011**                      | M-212                 | Bloque 6a (Usuario)                 |                                                                                                          |
| **M-6A-012**                      | M-213                 | Bloque 6a (Usuario)                 |                                                                                                          |
| **M-6A-013**                      | M-214                 | Bloque 6a (Usuario)                 |                                                                                                          |
| **M-6A-014**                      | M-215                 | Bloque 6a (Usuario)                 |                                                                                                          |
| **M-6A-015**                      | M-216                 | Bloque 6a (Usuario)                 |                                                                                                          |
| **M-6A-016**                      | M-217                 | Bloque 6a (Usuario)                 |                                                                                                          |
| **M-6A-017**                      | M-218                 | Bloque 6a (Usuario)                 |                                                                                                          |
| **M-6A-018**                      | M-219                 | Bloque 6a (Usuario)                 |                                                                                                          |
| **M-6A-019**                      | M-220                 | Bloque 6a (Usuario)                 |                                                                                                          |
| **M-6A-020**                      | M-221                 | Bloque 6a (Usuario)                 |                                                                                                          |
| **M-6A-021**                      | M-222                 | Bloque 6a (Usuario)                 |                                                                                                          |
| **M-6A-022**                      | M-223                 | Bloque 6a (Usuario)                 |                                                                                                          |
| **M-6A-023**                      | M-224                 | Bloque 6a (Usuario)                 |                                                                                                          |
| **M-6A-024**                      | M-225                 | Bloque 6a (Usuario)                 |                                                                                                          |
| **M-6A-025**                      | M-226                 | Bloque 6a (Usuario)                 |                                                                                                          |
| **M-6A-026**                      | M-227                 | Bloque 6a (Usuario)                 |                                                                                                          |
| **M-6A-027**                      | M-228                 | Bloque 6a (Usuario)                 |                                                                                                          |
| **M-6A-028**                      | M-229                 | Bloque 6a (Usuario)                 |                                                                                                          |
| **M-6A-029**                      | M-230                 | Bloque 6a (Usuario)                 |                                                                                                          |
| **M-6A-030**                      | M-231                 | Bloque 6a (Usuario)                 |                                                                                                          |
| **M-6A-031**                      | M-232                 | Bloque 6a (Usuario)                 |                                                                                                          |
| **M-6A-032**                      | M-233                 | Bloque 6a (Usuario)                 |                                                                                                          |
| **M-6A-033**                      | M-234                 | Bloque 6a (Usuario)                 |                                                                                                          |
| **M-6A-034**                      | M-235                 | Bloque 6a (Usuario)                 |                                                                                                          |
| **M-6A-035**                      | M-236                 | Bloque 6a (Usuario)                 |                                                                                                          |
| **M-6B-001**                      | M-237                 | Bloque 6b (Rol_Permiso y Categoria) |                                                                                                          |
| **M-6B-002**                      | M-238                 | Bloque 6b (Rol_Permiso y Categoria) |                                                                                                          |
| **M-6B-003**                      | M-239                 | Bloque 6b (Rol_Permiso y Categoria) |                                                                                                          |
| **M-6B-004**                      | M-240                 | Bloque 6b (Rol_Permiso y Categoria) |                                                                                                          |
| **M-6B-005**                      | M-241                 | Bloque 6b (Rol_Permiso y Categoria) |                                                                                                          |
| **M-6B-006**                      | M-242                 | Bloque 6b (Rol_Permiso y Categoria) |                                                                                                          |
| **M-6B-007**                      | M-243                 | Bloque 6b (Rol_Permiso y Categoria) |                                                                                                          |
| **M-6B-008**                      | M-244                 | Bloque 6b (Rol_Permiso y Categoria) |                                                                                                          |
| **M-6B-009**                      | M-245                 | Bloque 6b (Rol_Permiso y Categoria) |                                                                                                          |
| **M-6B-010**                      | M-246                 | Bloque 6b (Rol_Permiso y Categoria) |                                                                                                          |
| **M-6B-011**                      | M-247                 | Bloque 6b (Rol_Permiso y Categoria) |                                                                                                          |
| **M-6B-012**                      | M-248                 | Bloque 6b (Rol_Permiso y Categoria) |                                                                                                          |
| **M-6B-013**                      | M-249                 | Bloque 6b (Rol_Permiso y Categoria) |                                                                                                          |
| **M-6B-014**                      | M-250                 | Bloque 6b (Rol_Permiso y Categoria) |                                                                                                          |
| **M-6B-015**                      | M-251                 | Bloque 6b (Rol_Permiso y Categoria) |                                                                                                          |
| **M-6B-016**                      | M-252                 | Bloque 6b (Rol_Permiso y Categoria) |                                                                                                          |
| **M-6B-017**                      | M-253                 | Bloque 6b (Rol_Permiso y Categoria) |                                                                                                          |
| **M-6B-018**                      | M-254                 | Bloque 6b (Rol_Permiso y Categoria) |                                                                                                          |
| **M-6B-019**                      | M-255                 | Bloque 6b (Rol_Permiso y Categoria) |                                                                                                          |
| **M-6B-020**                      | M-256                 | Bloque 6b (Rol_Permiso y Categoria) |                                                                                                          |
| **M-6B-021**                      | M-257                 | Bloque 6b (Rol_Permiso y Categoria) |                                                                                                          |
| **M-6B-022**                      | M-258                 | Bloque 6b (Rol_Permiso y Categoria) |                                                                                                          |
| **M-6B-023**                      | M-259                 | Bloque 6b (Rol_Permiso y Categoria) |                                                                                                          |
| **M-6B-024**                      | M-260                 | Bloque 6b (Rol_Permiso y Categoria) |                                                                                                          |
| **M-6B-025**                      | M-261                 | Bloque 6b (Rol_Permiso y Categoria) |                                                                                                          |
| **M-6B-026**                      | M-262                 | Bloque 6b (Rol_Permiso y Categoria) |                                                                                                          |
| **M-7-001**                       | M-263                 | Bloque 7 (Auditoria y Reportes)     |                                                                                                          |
| **M-7-002**                       | M-264                 | Bloque 7 (Auditoria y Reportes)     |                                                                                                          |
| **M-7-003**                       | M-265                 | Bloque 7 (Auditoria y Reportes)     |                                                                                                          |
| **M-7-004**                       | M-266                 | Bloque 7 (Auditoria y Reportes)     |                                                                                                          |
| **M-7-005**                       | M-267                 | Bloque 7 (Auditoria y Reportes)     |                                                                                                          |
| **M-7-006**                       | M-268                 | Bloque 7 (Auditoria y Reportes)     |                                                                                                          |
| **M-7-007**                       | M-269                 | Bloque 7 (Auditoria y Reportes)     |                                                                                                          |
| **M-7-008**                       | M-270                 | Bloque 7 (Auditoria y Reportes)     |                                                                                                          |
| **M-7-009**                       | M-271                 | Bloque 7 (Auditoria y Reportes)     |                                                                                                          |
| **P-6A-01**                       | P-60                  | Bloque 6a (Usuario)                 |                                                                                                          |
| **P-6A-02**                       | P-61                  | Bloque 6a (Usuario)                 |                                                                                                          |
| **P-6A-03**                       | P-62                  | Bloque 6a (Usuario)                 |                                                                                                          |
| **P-6A-04**                       | P-63                  | Bloque 6a (Usuario)                 |                                                                                                          |
| **P-6A-05**                       | P-64                  | Bloque 6a (Usuario)                 |                                                                                                          |
| **P-6A-06**                       | P-65                  | Bloque 6a (Usuario)                 |                                                                                                          |
| **P-6A-07**                       | P-66                  | Bloque 6a (Usuario)                 |                                                                                                          |
| **P-6A-08**                       | P-67                  | Bloque 6a (Usuario)                 |                                                                                                          |
| **P-6A-09**                       | P-68                  | Bloque 6a (Usuario)                 |                                                                                                          |
| **P-6A-10**                       | P-69                  | Bloque 6a (Usuario)                 |                                                                                                          |
| **P-6A-11**                       | P-70                  | Bloque 6a (Usuario)                 |                                                                                                          |
| **P-6A-12**                       | P-71                  | Bloque 6a (Usuario)                 |                                                                                                          |
| **P-6A-13**                       | P-72                  | Bloque 6a (Usuario)                 |                                                                                                          |
| **P-6A-14**                       | P-73                  | Bloque 6a (Usuario)                 |                                                                                                          |
| **P-6B-01**                       | P-74                  | Bloque 6b (Rol_Permiso y Categoria) |                                                                                                          |
| **P-6B-02**                       | P-75                  | Bloque 6b (Rol_Permiso y Categoria) |                                                                                                          |
| **P-6B-03**                       | P-76                  | Bloque 6b (Rol_Permiso y Categoria) |                                                                                                          |
| **P-6B-04**                       | P-77                  | Bloque 6b (Rol_Permiso y Categoria) |                                                                                                          |
| **P-6B-05**                       | P-78                  | Bloque 6b (Rol_Permiso y Categoria) |                                                                                                          |
| **P-6B-06**                       | P-79                  | Bloque 6b (Rol_Permiso y Categoria) |                                                                                                          |
| **P-6B-07**                       | P-80                  | Bloque 6b (Rol_Permiso y Categoria) |                                                                                                          |
| **P-6B-08**                       | P-81                  | Bloque 6b (Rol_Permiso y Categoria) |                                                                                                          |
| **P-6B-09**                       | P-82                  | Bloque 6b (Rol_Permiso y Categoria) |                                                                                                          |
| **P-6B-10**                       | P-83                  | Bloque 6b (Rol_Permiso y Categoria) |                                                                                                          |
| **P-6B-11**                       | P-84                  | Bloque 6b (Rol_Permiso y Categoria) |                                                                                                          |
| **P-6B-12**                       | P-85                  | Bloque 6b (Rol_Permiso y Categoria) |                                                                                                          |
| **P-6B-13**                       | P-86                  | Bloque 6b (Rol_Permiso y Categoria) |                                                                                                          |
| **P-6B-14**                       | P-87                  | Bloque 6b (Rol_Permiso y Categoria) |                                                                                                          |
| **P-7-01**                        | P-88                  | Bloque 7 (Auditoria y Reportes)     |                                                                                                          |
| **P-7-02**                        | P-89                  | Bloque 7 (Auditoria y Reportes)     |                                                                                                          |
| **P-7-03**                        | P-90                  | Bloque 7 (Auditoria y Reportes)     |                                                                                                          |
| **P-7-04**                        | P-91                  | Bloque 7 (Auditoria y Reportes)     |                                                                                                          |
| **P-7-05**                        | P-92                  | Bloque 7 (Auditoria y Reportes)     |                                                                                                          |
| **P-7-06**                        | P-93                  | Bloque 7 (Auditoria y Reportes)     |                                                                                                          |
| **P-7-07**                        | P-94                  | Bloque 7 (Auditoria y Reportes)     |                                                                                                          |
| **P-7-08**                        | P-95                  | Bloque 7 (Auditoria y Reportes)     |                                                                                                          |
| **P-7-09**                        | P-96                  | Bloque 7 (Auditoria y Reportes)     |                                                                                                          |
| **P-7-10**                        | P-97                  | Bloque 7 (Auditoria y Reportes)     |                                                                                                          |
| **P-7-11**                        | P-98                  | Bloque 7 (Auditoria y Reportes)     |                                                                                                          |
| **P-7-12**                        | P-99                  | Bloque 7 (Auditoria y Reportes)     |                                                                                                          |
| **P-7-13**                        | P-100                 | Bloque 7 (Auditoria y Reportes)     |                                                                                                          |
| **P-7-14**                        | P-101                 | Bloque 7 (Auditoria y Reportes)     |                                                                                                          |
| **P-7-15**                        | P-102                 | Bloque 7 (Auditoria y Reportes)     |                                                                                                          |
| **P-7-16**                        | P-103                 | Bloque 7 (Auditoria y Reportes)     |                                                                                                          |
| **P-7-17**                        | P-104                 | Bloque 7 (Auditoria y Reportes)     |                                                                                                          |
| **RN-T6A-01**                     | RN-T01                | Bloque 6a (Usuario)                 | Regla transversal: Detalle de Auditoria sin contraseñas; RN-AU08 es su verificación                      |
| **RN-AU10**                       | RN-T02                | Bloque 7 (Auditoria y Reportes)     | Regla transversal de auditoría; decisión del 08/10/2026                                                  |
| **M-92 (anterior, Bloque 2)**     | M-272                 | Bloque 2 (Solicitud y Aprobacion)   | «El custodio no corresponde al empleado que solicita.»; M-92 queda para el mensaje de la adenda de HU-10 |
| **M-93 (anterior, Bloque 2)**     | M-273                 | Bloque 2 (Solicitud y Aprobacion)   | «El aprobador debe ser el usuario con sesión iniciada.»; M-93 queda para HU-15                           |
| **P-27 (anterior, Bloque 2)**     | P-105                 | Bloque 2 (Solicitud y Aprobacion)   | Absorbida por la nueva pregunta del cambio 7; P-27 queda para la adenda de HU-10                         |
| **(nuevo)**                       | P-105                 | Consolidación (cambio 7)            | Pregunta: custodio, aprobador, receptor y técnico desde la sesión                                        |
| **(nuevo)**                       | RN-T03                | Consolidación (cambio 7)            | Regla transversal propuesta: IDs desde el usuario en sesión                                              |
