-- =====================================================================
-- CABECERA DE HISTORIAL
-- Proyecto : NexaActivos - Sistema de Gestión de Activos
--            Nexa Servicios S.A.S. · Ingeniería de Software II
--            Uniremington 2026-02 · Docente: Gloria Amparo Lora Patiño
-- Archivo  : db/nexaactivos_ddl.sql
-- Motor    : MariaDB 10.4 o superior (probado en 10.4.32) (InnoDB, utf8mb4)
--            Requisito: el script supone un sql_mode que incluya
--            STRICT_TRANS_TABLES. Sin él, MariaDB acepta un valor fuera de
--            un ENUM (guarda '') y deja pasar valores que el diccionario no
--            admite. Verificación antes de ejecutar:
--              SELECT @@GLOBAL.sql_mode;
-- Fuentes  : Diccionario de Datos v7 (01/11/2026) y sección 3.2
--            (MER y Modelo Relacional: 14 tablas, 83 columnas, R1 a R19).
-- CRF vigente : CRF-003 (sin cambios de tablas, columnas, tipos, ENUM ni FK).
-- Línea base  : LB-1 (declarada con M2 pendiente de decisión de la docente).
--
-- Versión | Fecha      | Autores                                         | Cambio
-- 1.0     | 06/11/2026 | Julián David Valencia Gamboa; Eliú Marimón Arrieta | Versión inicial: imagen de 3.2 y del Diccionario v7
-- 1.1     | 06/11/2026 | Julián David Valencia Gamboa; Eliú Marimón Arrieta | Solo comentarios: D2 (intercalación) y comentario de uq_categoria_nombre; D1 cita los MOD de las 13 tablas; nueva D4 (ck_aprobacion_motivo_rechazo). Sin cambios en sentencias
-- 1.2     | 06/11/2026 | Julián David Valencia Gamboa; Eliú Marimón Arrieta | Solo comentarios: línea «Motor» con MariaDB 10.4 o superior (probado en 10.4.32) y requisito de sql_mode con STRICT_TRANS_TABLES y su verificación. Sin cambios en sentencias
--
-- Convenciones (propuesta del equipo, pendiente de validar):
--   * Cada restricción tiene nombre: pk_ (clave primaria), fk_rNN_ (clave
--     foránea con su número de relación R1 a R19 de la Tabla 1 de 3.2),
--     uq_ (única) y ck_ (verificación). Cada una cita la RN que la respalda
--     (con ficha y enunciado que respalda la restricción) o «restricción del
--     diccionario».
--   * Las 19 FK usan ON DELETE RESTRICT y ON UPDATE RESTRICT. Este script no
--     contiene DELETE ni ON DELETE CASCADE: la baja es lógica (columna activo
--     o estado). La única eliminación física del sistema es
--     Rol_Permiso.retirar() (HU-39, P-78) y se hace desde el código.
--   * Diferencias declaradas frente al Diccionario v7 (no cambian nombre,
--     tipo, longitud ni nulidad de ninguna columna):
--       D1. AUTO_INCREMENT en las 13 PK simples: el diccionario no declara
--           cómo se genera el identificador (P-07; MOD-43, MOD-45, MOD-47,
--           MOD-49, MOD-51, MOD-52, MOD-53, MOD-56 y MOD-58 de las listas
--           acumuladas de RF). Propuesta del equipo.
--       D2. ENGINE=InnoDB, CHARSET utf8mb4 y COLLATE utf8mb4_unicode_ci.
--           La intercalación es propuesta del equipo, pendiente de validar.
--           No distingue mayúsculas de minúsculas y tampoco distingue
--           tildes; esto último no lo respalda ninguna RN. Se extiende sin
--           RN a Numero_Serie, Placa_Inventario y Email, donde vuelve más
--           estricta la unicidad del diccionario (RN-A03, RN-A04 y RN-U04
--           no dicen nada de mayúsculas). Cómo se compara el nombre de la
--           categoría queda para existeNombreCategoria() (MOD-57; P-81) y
--           la misma pregunta sigue abierta para el correo (P-63).
--       D3. La vista Reportes se crea con CREATE OR REPLACE VIEW (no es tabla).
--       D4. ck_aprobacion_motivo_rechazo no figura en la Tabla 7 de 3.2; lo
--           respaldan RN-AP02b y la Observación del diccionario «Solo
--           obligatorio si Decision = Rechazada». La condición de motivo no
--           vacío (<> '') es lectura del equipo, pendiente de validar.
--   * Las coherencias entre fechas no están en el Diccionario v7 y NO se
--     implementan como CHECK; quedan solo como comentario (propuesta):
--       MOD-01 Asignacion.Fecha_Devolucion_Esperada no anterior a Fecha_Entrega.
--       MOD-19 Devolucion.Fecha_Devolucion no anterior a la Fecha_Entrega
--              de su asignación (exige consultar otra tabla).
--       MOD-29 Fecha de un mantenimiento asociado a un reporte no anterior a
--              la fecha del reporte (exige consultar otra tabla).
--       MOD-40 Reportes: Fecha_Fin no anterior a Fecha_Inicio (son
--              parámetros de la consulta, no columnas).
--     Tampoco se implementan MOD-21 (Fecha_Confirmacion e ID_Receptor
--     condicionados a Estado_Recepcion) ni MOD-28 (Costo no negativo y
--     Fecha_Mantenimiento no futura): no están en el Diccionario v7.
--   * Los datos de prueba van aparte, en db/datos_prueba.sql (solo INSERT).
--
-- Preparación (única sección con DROP; permite volver a ejecutar el script
-- en desarrollo; borra las tablas y sus datos):
-- =====================================================================

CREATE DATABASE IF NOT EXISTS nexaactivos
  CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE nexaactivos;
SET NAMES utf8mb4;

DROP TABLE IF EXISTS Historial_Mantenimientos;
DROP TABLE IF EXISTS Reporte_de_Danios;
DROP TABLE IF EXISTS Notificacion_De_Devolucion;
DROP TABLE IF EXISTS Devolucion;
DROP TABLE IF EXISTS Acta_De_Entrega;
DROP TABLE IF EXISTS Asignacion;
DROP TABLE IF EXISTS Aprobacion;
DROP TABLE IF EXISTS Solicitud;
DROP TABLE IF EXISTS Activo;
DROP TABLE IF EXISTS Custodio;
DROP TABLE IF EXISTS Auditoria;
DROP TABLE IF EXISTS Categoria;
DROP TABLE IF EXISTS Rol_Permiso;
DROP TABLE IF EXISTS Usuario;

-- =====================================================================
-- GRUPO SEGURIDAD Y ACCESO
-- =====================================================================

-- ---------------------------------------------------------------------
-- Tabla 1 de 14: Usuario (3.2, Tabla 2) · 7 columnas
-- ---------------------------------------------------------------------
CREATE TABLE Usuario (
  ID_Usuario  INT(11)      NOT NULL AUTO_INCREMENT,
  Nombre      VARCHAR(20)  NOT NULL,
  Apellido    VARCHAR(20)  NOT NULL,
  Email       VARCHAR(100) NOT NULL,
  Password    VARCHAR(255) NOT NULL,  -- valor cifrado; mecanismo pendiente (P-62)
  activo      BOOLEAN      NOT NULL DEFAULT TRUE,  -- valor inicial TRUE (diccionario)
  rol         ENUM('Responsable de Activos','Empleado','Aprobador','Técnico de Soporte','Gerente') NOT NULL,
  -- restricción del diccionario (PK)
  CONSTRAINT pk_usuario PRIMARY KEY (ID_Usuario),
  -- RN-U04: no pueden existir dos usuarios con el mismo correo electrónico
  CONSTRAINT uq_usuario_email UNIQUE (Email)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ---------------------------------------------------------------------
-- Tabla 2 de 14: Rol_Permiso (3.2, Tabla 3) · 2 columnas
-- Sin FK (Caso 4 de 4b). Rol_Permiso.retirar() elimina la fila desde el
-- código (única excepción a la baja lógica; HU-39, P-78).
-- ---------------------------------------------------------------------
CREATE TABLE Rol_Permiso (
  rol      ENUM('Responsable de Activos','Empleado','Aprobador','Técnico de Soporte','Gerente') NOT NULL,
  permiso  ENUM('Crear','Consultar','Actualizar','Inactivar','Aprobar','Notificar','Asignar','Devolver','Reportar') NOT NULL,
  -- restricción del diccionario (PK compuesta; la pareja no se repite, RN-RP05 sin ficha: CRI-10)
  CONSTRAINT pk_rol_permiso PRIMARY KEY (rol, permiso)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- =====================================================================
-- GRUPO CATÁLOGOS
-- (se crea antes de Inventario y Préstamo porque Activo y Solicitud la referencian)
-- =====================================================================

-- ---------------------------------------------------------------------
-- Tabla 3 de 14: Categoria (3.2, Tabla 15) · 3 columnas
-- ---------------------------------------------------------------------
CREATE TABLE Categoria (
  ID_Categoria      INT(11)     NOT NULL AUTO_INCREMENT,
  Nombre_Categoria  VARCHAR(50) NOT NULL,
  activo            BOOLEAN     NOT NULL DEFAULT TRUE,  -- valor inicial TRUE (diccionario)
  -- restricción del diccionario (PK)
  CONSTRAINT pk_categoria PRIMARY KEY (ID_Categoria),
  -- RN-CA04: no pueden existir dos categorías con el mismo nombre, estén
  -- activas o inactivas, sin distinguir mayúsculas de minúsculas (ver D2)
  CONSTRAINT uq_categoria_nombre UNIQUE (Nombre_Categoria)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ---------------------------------------------------------------------
-- Tabla 4 de 14: Auditoria (3.2, Tabla 4) · 7 columnas
-- ID_Registro es referencia lógica, NO es FK (diccionario v7).
-- ---------------------------------------------------------------------
CREATE TABLE Auditoria (
  ID_Auditoria  INT(11)      NOT NULL AUTO_INCREMENT,
  ID_Usuario    INT(11)      NOT NULL,
  Entidad       VARCHAR(50)  NOT NULL,
  ID_Registro   INT(11)      NOT NULL,  -- referencia lógica (sin FK física)
  Accion        ENUM('Crear','Consultar','Actualizar','Inactivar','Aprobar','Rechazar','Notificar','Asignar','Devolver','Reportar') NOT NULL,
  Fecha_Accion  DATETIME     NOT NULL DEFAULT CURRENT_TIMESTAMP,  -- asignada por el sistema
  Detalle       VARCHAR(300) NULL,
  -- restricción del diccionario (PK)
  CONSTRAINT pk_auditoria PRIMARY KEY (ID_Auditoria),
  -- R3 Usuario ejecuta Auditoria · restricción del diccionario (FK)
  CONSTRAINT fk_r03_auditoria_usuario FOREIGN KEY (ID_Usuario)
    REFERENCES Usuario (ID_Usuario) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- =====================================================================
-- GRUPO PRÉSTAMO DE EQUIPOS (Custodio) e INVENTARIO (Activo)
-- =====================================================================

-- ---------------------------------------------------------------------
-- Tabla 5 de 14: Custodio (3.2, Tabla 5) · 7 columnas
-- ---------------------------------------------------------------------
CREATE TABLE Custodio (
  ID_Custodio     INT(11)      NOT NULL AUTO_INCREMENT,
  ID_Usuario      INT(11)      NOT NULL,
  Fecha_Registro  DATE         NOT NULL DEFAULT (CURRENT_DATE),  -- asignada por el sistema
  N_documento     VARCHAR(20)  NOT NULL,
  Direccion       VARCHAR(200) NOT NULL,
  tipo_documento  ENUM('CC','CE','PA') NOT NULL,  -- CE: propuesta, pendiente de validar con el cliente
  activo          BOOLEAN      NOT NULL DEFAULT TRUE,  -- valor inicial TRUE (diccionario)
  -- restricción del diccionario (PK)
  CONSTRAINT pk_custodio PRIMARY KEY (ID_Custodio),
  -- restricción del diccionario (UNIQUE estructural 1 a 1 usuario-custodio; RN-C06 no es RN, COR-14)
  CONSTRAINT uq_custodio_id_usuario UNIQUE (ID_Usuario),
  -- RN-C05: no pueden existir dos custodios con el mismo tipo y número de documento
  CONSTRAINT uq_custodio_documento UNIQUE (tipo_documento, N_documento),
  -- R2 Usuario tiene perfil Custodio · restricción del diccionario (FK)
  CONSTRAINT fk_r02_custodio_usuario FOREIGN KEY (ID_Usuario)
    REFERENCES Usuario (ID_Usuario) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ---------------------------------------------------------------------
-- Tabla 6 de 14: Activo (3.2, Tabla 12) · 8 columnas
-- Estado: valor inicial Disponible. Las transiciones (CRF-003) las hace el
-- código; darDeBaja() no elimina: pone Estado = 'Baja'.
-- ---------------------------------------------------------------------
CREATE TABLE Activo (
  ID_Activo         INT(11)      NOT NULL AUTO_INCREMENT,
  Marca             VARCHAR(50)  NOT NULL,
  Modelo            VARCHAR(50)  NOT NULL,
  Estado            ENUM('Disponible','Asignado','Dañado','Baja') NOT NULL DEFAULT 'Disponible',
  Numero_Serie      VARCHAR(20)  NOT NULL,
  Placa_Inventario  VARCHAR(11)  NOT NULL,
  Ubicacion         VARCHAR(100) NULL,
  ID_Categoria      INT(11)      NOT NULL,
  -- restricción del diccionario (PK)
  CONSTRAINT pk_activo PRIMARY KEY (ID_Activo),
  -- RN-A03: no pueden existir dos activos con el mismo número de serie, estén o no dados de baja
  CONSTRAINT uq_activo_numero_serie UNIQUE (Numero_Serie),
  -- RN-A04: no pueden existir dos activos con la misma placa de inventario, estén o no dados de baja
  CONSTRAINT uq_activo_placa_inventario UNIQUE (Placa_Inventario),
  -- R1 Categoria clasifica Activo · restricción del diccionario (FK)
  CONSTRAINT fk_r01_activo_categoria FOREIGN KEY (ID_Categoria)
    REFERENCES Categoria (ID_Categoria) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- =====================================================================
-- GRUPO PRÉSTAMO DE EQUIPOS
-- =====================================================================

-- ---------------------------------------------------------------------
-- Tabla 7 de 14: Solicitud (3.2, Tabla 6) · 6 columnas
-- ---------------------------------------------------------------------
CREATE TABLE Solicitud (
  ID_Solicitud      INT(11)      NOT NULL AUTO_INCREMENT,
  ID_Categoria      INT(11)      NOT NULL,
  Motivo            VARCHAR(255) NOT NULL,
  Fecha_Solicitud   DATETIME     NOT NULL DEFAULT CURRENT_TIMESTAMP,  -- asignada por el sistema
  ID_Custodio       INT(11)      NOT NULL,
  Estado_Solicitud  ENUM('Pendiente','Aprobada','Rechazada','Cancelada') NOT NULL DEFAULT 'Pendiente',
  -- restricción del diccionario (PK)
  CONSTRAINT pk_solicitud PRIMARY KEY (ID_Solicitud),
  -- R6 Categoria es pedida en Solicitud · restricción del diccionario (FK)
  CONSTRAINT fk_r06_solicitud_categoria FOREIGN KEY (ID_Categoria)
    REFERENCES Categoria (ID_Categoria) ON DELETE RESTRICT ON UPDATE RESTRICT,
  -- R7 Custodio realiza Solicitud · restricción del diccionario (FK)
  CONSTRAINT fk_r07_solicitud_custodio FOREIGN KEY (ID_Custodio)
    REFERENCES Custodio (ID_Custodio) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ---------------------------------------------------------------------
-- Tabla 8 de 14: Aprobacion (3.2, Tabla 7) · 6 columnas
-- ---------------------------------------------------------------------
CREATE TABLE Aprobacion (
  ID_Aprobacion   INT(11)      NOT NULL AUTO_INCREMENT,
  ID_Solicitud    INT(11)      NOT NULL,
  ID_Aprobador    INT(11)      NOT NULL,
  Decision        ENUM('Aprobada','Rechazada') NOT NULL,
  Motivo_Rechazo  VARCHAR(300) NULL,  -- solo obligatorio si Decision = Rechazada
  Fecha_Decision  DATETIME     NOT NULL DEFAULT CURRENT_TIMESTAMP,  -- asignada por el sistema
  -- restricción del diccionario (PK)
  CONSTRAINT pk_aprobacion PRIMARY KEY (ID_Aprobacion),
  -- restricción del diccionario (UNIQUE estructural 1 a 1; la parte UNIQUE de RN-AP06 no tiene ficha, COR-26)
  CONSTRAINT uq_aprobacion_id_solicitud UNIQUE (ID_Solicitud),
  -- RN-AP02b: todo rechazo de una solicitud debe justificarse con un motivo
  -- (y observación del diccionario «Solo obligatorio si Decision = Rechazada»)
  CONSTRAINT ck_aprobacion_motivo_rechazo
    CHECK (Decision <> 'Rechazada' OR (Motivo_Rechazo IS NOT NULL AND Motivo_Rechazo <> '')),
  -- R8 Solicitud recibe Aprobacion · restricción del diccionario (FK)
  CONSTRAINT fk_r08_aprobacion_solicitud FOREIGN KEY (ID_Solicitud)
    REFERENCES Solicitud (ID_Solicitud) ON DELETE RESTRICT ON UPDATE RESTRICT,
  -- R9 Usuario decide (rol aprobador) · restricción del diccionario (FK)
  CONSTRAINT fk_r09_aprobacion_usuario FOREIGN KEY (ID_Aprobador)
    REFERENCES Usuario (ID_Usuario) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ---------------------------------------------------------------------
-- Tabla 9 de 14: Asignacion (3.2, Tabla 8) · 7 columnas
-- ID_Custodio se copia de la Solicitud al crear (lo hace el código).
-- MOD-01 (propuesta, no implementada): Fecha_Devolucion_Esperada >= Fecha_Entrega.
-- ---------------------------------------------------------------------
CREATE TABLE Asignacion (
  ID_Asignacion              INT(11) NOT NULL AUTO_INCREMENT,
  Fecha_Entrega              DATE    NOT NULL DEFAULT (CURRENT_DATE),  -- asignada por el sistema
  Fecha_Devolucion_Esperada  DATE    NOT NULL,
  Estado_Asignacion          ENUM('Vigente','Cerrada') NOT NULL DEFAULT 'Vigente',
  ID_Custodio                INT(11) NOT NULL,
  ID_Activo                  INT(11) NOT NULL,
  ID_Solicitud               INT(11) NOT NULL,
  -- restricción del diccionario (PK)
  CONSTRAINT pk_asignacion PRIMARY KEY (ID_Asignacion),
  -- RN-AS05a: una solicitud se atiende con una sola asignación
  CONSTRAINT uq_asignacion_id_solicitud UNIQUE (ID_Solicitud),
  -- R10 Custodio recibe Asignacion · restricción del diccionario (FK)
  CONSTRAINT fk_r10_asignacion_custodio FOREIGN KEY (ID_Custodio)
    REFERENCES Custodio (ID_Custodio) ON DELETE RESTRICT ON UPDATE RESTRICT,
  -- R11 Activo se entrega en Asignacion · restricción del diccionario (FK)
  CONSTRAINT fk_r11_asignacion_activo FOREIGN KEY (ID_Activo)
    REFERENCES Activo (ID_Activo) ON DELETE RESTRICT ON UPDATE RESTRICT,
  -- R12 Solicitud origina Asignacion · restricción del diccionario (FK)
  CONSTRAINT fk_r12_asignacion_solicitud FOREIGN KEY (ID_Solicitud)
    REFERENCES Solicitud (ID_Solicitud) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ---------------------------------------------------------------------
-- Tabla 10 de 14: Acta_De_Entrega (3.2, Tabla 9) · 5 columnas
-- ---------------------------------------------------------------------
CREATE TABLE Acta_De_Entrega (
  ID_Acta        INT(11)      NOT NULL AUTO_INCREMENT,
  ID_Asignacion  INT(11)      NOT NULL,
  Fecha_Firma    DATETIME     NOT NULL DEFAULT CURRENT_TIMESTAMP,  -- asignada por el sistema
  Ruta_Acta      VARCHAR(255) NOT NULL,
  Firma_Digital  VARCHAR(255) NOT NULL,  -- algoritmo pendiente (P-38, MOD-16)
  -- restricción del diccionario (PK)
  CONSTRAINT pk_acta_de_entrega PRIMARY KEY (ID_Acta),
  -- RN-AC06a: una asignación tiene una sola acta
  CONSTRAINT uq_acta_id_asignacion UNIQUE (ID_Asignacion),
  -- R4 Asignacion se firma en Acta_De_Entrega · restricción del diccionario (FK)
  CONSTRAINT fk_r04_acta_asignacion FOREIGN KEY (ID_Asignacion)
    REFERENCES Asignacion (ID_Asignacion) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ---------------------------------------------------------------------
-- Tabla 11 de 14: Devolucion (3.2, Tabla 10) · 7 columnas
-- MOD-19 y MOD-21 (propuestas, no implementadas).
-- ---------------------------------------------------------------------
CREATE TABLE Devolucion (
  ID_Devolucion       INT(11)      NOT NULL AUTO_INCREMENT,
  Fecha_Devolucion    DATETIME     NOT NULL DEFAULT CURRENT_TIMESTAMP,  -- asignada por el sistema
  Observaciones       VARCHAR(255) NULL,
  ID_Asignacion       INT(11)      NOT NULL,
  Estado_Recepcion    ENUM('Pendiente','Confirmada') NOT NULL DEFAULT 'Pendiente',
  Fecha_Confirmacion  DATETIME     NULL,  -- se llena al confirmar la recepción
  ID_Receptor         INT(11)      NULL,  -- se llena al confirmar la recepción
  -- restricción del diccionario (PK)
  CONSTRAINT pk_devolucion PRIMARY KEY (ID_Devolucion),
  -- RN-D06a: una asignación se devuelve una sola vez
  CONSTRAINT uq_devolucion_id_asignacion UNIQUE (ID_Asignacion),
  -- R13 Asignacion termina en Devolucion · restricción del diccionario (FK)
  CONSTRAINT fk_r13_devolucion_asignacion FOREIGN KEY (ID_Asignacion)
    REFERENCES Asignacion (ID_Asignacion) ON DELETE RESTRICT ON UPDATE RESTRICT,
  -- R14 Usuario confirma (rol receptor) · restricción del diccionario (FK opcional)
  CONSTRAINT fk_r14_devolucion_receptor FOREIGN KEY (ID_Receptor)
    REFERENCES Usuario (ID_Usuario) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ---------------------------------------------------------------------
-- Tabla 12 de 14: Notificacion_De_Devolucion (3.2, Tabla 11) · 2 columnas
-- /Dias_Restantes es dato derivado: NO es columna (lo calcula
-- calcularDiasRestantes() a partir de Asignacion.Fecha_Devolucion_Esperada).
-- ---------------------------------------------------------------------
CREATE TABLE Notificacion_De_Devolucion (
  ID_Notificacion  INT(11) NOT NULL AUTO_INCREMENT,
  ID_Asignacion    INT(11) NOT NULL,  -- sin UNIQUE: varios avisos por asignación
  -- restricción del diccionario (PK)
  CONSTRAINT pk_notificacion_de_devolucion PRIMARY KEY (ID_Notificacion),
  -- R5 Asignacion genera Notificacion_De_Devolucion · restricción del diccionario (FK)
  CONSTRAINT fk_r05_notificacion_asignacion FOREIGN KEY (ID_Asignacion)
    REFERENCES Asignacion (ID_Asignacion) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- =====================================================================
-- GRUPO INVENTARIO
-- =====================================================================

-- ---------------------------------------------------------------------
-- Tabla 13 de 14: Reporte_de_Danios (3.2, Tabla 13) · 7 columnas
-- ---------------------------------------------------------------------
CREATE TABLE Reporte_de_Danios (
  ID_ReporteDanios   INT(11)      NOT NULL AUTO_INCREMENT,
  Descripcion_Danio  VARCHAR(500) NOT NULL,
  Evidencia          VARCHAR(255) NULL,
  Fecha_Reporte      DATETIME     NOT NULL DEFAULT CURRENT_TIMESTAMP,  -- asignada por el sistema
  ID_Custodio        INT(11)      NOT NULL,
  Tipo_Danio         ENUM('Hardware','Software','Otro') NOT NULL,
  ID_Activo          INT(11)      NOT NULL,
  -- restricción del diccionario (PK)
  CONSTRAINT pk_reporte_de_danios PRIMARY KEY (ID_ReporteDanios),
  -- R15 Custodio reporta Reporte_de_Danios · restricción del diccionario (FK)
  CONSTRAINT fk_r15_reporte_custodio FOREIGN KEY (ID_Custodio)
    REFERENCES Custodio (ID_Custodio) ON DELETE RESTRICT ON UPDATE RESTRICT,
  -- R16 Activo afecta a Reporte_de_Danios · restricción del diccionario (FK)
  CONSTRAINT fk_r16_reporte_activo FOREIGN KEY (ID_Activo)
    REFERENCES Activo (ID_Activo) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ---------------------------------------------------------------------
-- Tabla 14 de 14: Historial_Mantenimientos (3.2, Tabla 14) · 9 columnas
-- MOD-28 y MOD-29 (propuestas, no implementadas).
-- ---------------------------------------------------------------------
CREATE TABLE Historial_Mantenimientos (
  ID_Mantenimiento     INT(11)      NOT NULL AUTO_INCREMENT,
  ID_Activo            INT(11)      NOT NULL,
  ID_ReporteDanios     INT(11)      NULL,  -- opcional
  Tipo_Mantenimiento   ENUM('Preventivo','Correctivo') NOT NULL,
  Descripcion          VARCHAR(300) NOT NULL,
  Fecha_Mantenimiento  DATETIME     NOT NULL,  -- la informa el técnico (sin DEFAULT)
  ID_Tecnico           INT(11)      NOT NULL,
  Costo                BIGINT(20)   NULL,  -- pesos, sin centavos
  Evidencia            VARCHAR(255) NULL,
  -- restricción del diccionario (PK)
  CONSTRAINT pk_historial_mantenimientos PRIMARY KEY (ID_Mantenimiento),
  -- R17 Activo recibe Historial_Mantenimientos · restricción del diccionario (FK)
  CONSTRAINT fk_r17_mantenimiento_activo FOREIGN KEY (ID_Activo)
    REFERENCES Activo (ID_Activo) ON DELETE RESTRICT ON UPDATE RESTRICT,
  -- R18 Reporte_de_Danios motiva Historial_Mantenimientos · restricción del diccionario (FK opcional)
  CONSTRAINT fk_r18_mantenimiento_reporte FOREIGN KEY (ID_ReporteDanios)
    REFERENCES Reporte_de_Danios (ID_ReporteDanios) ON DELETE RESTRICT ON UPDATE RESTRICT,
  -- R19 Usuario ejecuta (rol técnico) · restricción del diccionario (FK)
  CONSTRAINT fk_r19_mantenimiento_tecnico FOREIGN KEY (ID_Tecnico)
    REFERENCES Usuario (ID_Usuario) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- =====================================================================
-- VISTA Reportes (NO es tabla; Diccionario v7 y 3.2 «Por qué Reportes no
-- es una tabla»). Propuesta del equipo, pendiente de validar.
-- Une solo Activo, Asignacion y Devolucion, con sus columnas originales
-- (sin columnas nuevas ni alias). Los parámetros Fecha_Inicio (DATE,
-- obligatorio), Fecha_Fin (DATE, opcional) y
-- Tipo_Reporte ENUM('Asignados','Disponibles','Pendientes_Devolucion','Mal_Estado')
-- no son columnas: los aplica Reportes.consultar() como filtro. Qué filas
-- y qué fecha filtra cada tipo está pendiente (P-101, P-102); MOD-40 queda
-- como validación del parámetro en el código, no en la vista.
-- =====================================================================
CREATE OR REPLACE VIEW Reportes AS
SELECT
  act.ID_Activo, act.Marca, act.Modelo, act.Estado, act.Numero_Serie,
  act.Placa_Inventario, act.Ubicacion, act.ID_Categoria,
  asg.ID_Asignacion, asg.Fecha_Entrega, asg.Fecha_Devolucion_Esperada,
  asg.Estado_Asignacion, asg.ID_Custodio, asg.ID_Solicitud,
  dev.ID_Devolucion, dev.Fecha_Devolucion, dev.Observaciones,
  dev.Estado_Recepcion, dev.Fecha_Confirmacion, dev.ID_Receptor
FROM Activo act
LEFT JOIN Asignacion asg ON asg.ID_Activo = act.ID_Activo
LEFT JOIN Devolucion dev ON dev.ID_Asignacion = asg.ID_Asignacion;

-- Fin del script. 14 tablas, 83 columnas, 15 columnas PK, 19 FK,
-- 9 UNIQUE simples + 1 UNIQUE compuesto, 12 columnas ENUM, 1 CHECK, 1 vista.
