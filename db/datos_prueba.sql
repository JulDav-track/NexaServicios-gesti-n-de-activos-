-- =====================================================================
-- CABECERA DE HISTORIAL
-- Proyecto : NexaActivos · Archivo: db/datos_prueba.sql
-- Contenido: datos de prueba para el corte vertical (solo INSERT).
-- Requiere : haber ejecutado antes db/nexaactivos_ddl.sql.
-- CRF vigente: CRF-003 · Línea base: LB-1
--
-- Versión | Fecha      | Autores                                            | Cambio
-- 1.0     | 06/11/2026 | Julián David Valencia Gamboa; Eliú Marimón Arrieta | Versión inicial
--
-- Diferencia con la Tabla 6 del DDA 3.6: la Tabla 6 solo prevé
-- db/nexaactivos_ddl.sql; este archivo es adicional (propuesta del equipo).
--
-- IMPORTANTE: son datos de PRUEBA inventados por el equipo, no datos del
-- cliente. El catálogo inicial de categorías no está definido (P-86, P-CA1:
-- «Portátiles y Periféricos son ejemplos») y la matriz inicial de permisos
-- tampoco (P-75). Los permisos de abajo solo habilitan el corte vertical.
-- Password: el mecanismo de cifrado está pendiente (P-62); se guarda un
-- marcador que no es una contraseña ni permite iniciar sesión.
-- =====================================================================

USE nexaactivos;
SET NAMES utf8mb4;

-- Categorías de ejemplo (P-86, P-CA1)
INSERT INTO Categoria (ID_Categoria, Nombre_Categoria, activo) VALUES
  (1, 'Portátiles',  TRUE),
  (2, 'Periféricos', TRUE),
  (3, 'Categoría inactiva de prueba', FALSE);  -- para probar RN-A09

-- Un usuario de prueba por rol (los 5 roles de Nombre_Rol)
INSERT INTO Usuario (ID_Usuario, Nombre, Apellido, Email, Password, activo, rol) VALUES
  (1, 'Ana',    'Prueba', 'responsable@prueba.local', 'SIN_DEFINIR_P-62', TRUE, 'Responsable de Activos'),
  (2, 'Bruno',  'Prueba', 'empleado@prueba.local',    'SIN_DEFINIR_P-62', TRUE, 'Empleado'),
  (3, 'Carla',  'Prueba', 'aprobador@prueba.local',   'SIN_DEFINIR_P-62', TRUE, 'Aprobador'),
  (4, 'Diego',  'Prueba', 'tecnico@prueba.local',     'SIN_DEFINIR_P-62', TRUE, 'Técnico de Soporte'),
  (5, 'Elena',  'Prueba', 'gerente@prueba.local',     'SIN_DEFINIR_P-62', TRUE, 'Gerente');

-- Permisos mínimos para el corte vertical de Activo (HU-01 a HU-04):
-- permiso genérico más cercano según la matriz rol–operación (Anexo C de 2.2):
-- crear = Crear, buscar/listar = Consultar, actualizar = Actualizar,
-- darDeBaja = Inactivar. Matriz inicial pendiente (P-75).
INSERT INTO Rol_Permiso (rol, permiso) VALUES
  ('Responsable de Activos', 'Crear'),
  ('Responsable de Activos', 'Consultar'),
  ('Responsable de Activos', 'Actualizar'),
  ('Responsable de Activos', 'Inactivar');

-- Dos activos de ejemplo para que el inventario (MK-01) no aparezca vacío
INSERT INTO Activo (ID_Activo, Marca, Modelo, Estado, Numero_Serie, Placa_Inventario, Ubicacion, ID_Categoria) VALUES
  (1, 'Lenovo', 'ThinkPad L14', 'Disponible', 'PF-TEST-0001', 'NEX-000101', 'Bodega TI', 1),
  (2, 'Logitech', 'MK270',      'Disponible', 'LG-TEST-0002', 'NEX-000102', 'Bodega TI', 2);

-- Nota: InnoDB ajusta solo el contador AUTO_INCREMENT al valor máximo + 1
-- después de estos ID explícitos; no hace falta ninguna otra sentencia.
