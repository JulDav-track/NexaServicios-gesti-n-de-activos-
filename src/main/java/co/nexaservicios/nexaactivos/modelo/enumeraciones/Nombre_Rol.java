/*
 * =====================================================================
 * NexaActivos - Nexa Servicios S.A.S. · Ingeniería de Software II
 * Uniremington 2026-02 · Docente: Gloria Amparo Lora Patiño
 * Archivo : src/main/java/co/nexaservicios/nexaactivos/modelo/enumeraciones/Nombre_Rol.java
 * Capa    : Modelo, paquete Enumeraciones (DDA 3.6 v3_GenC, Tabla 2, fila 16)
 * Uso     : Usuario.rol, Rol_Permiso.rol
 * HU      : HU-32 a HU-37 (Usuario.rol) y HU-38 a HU-40 (Rol_Permiso.rol)
 * RF      : en el corte, RF-166 (transversal, origen HU-38): rol de la sesión
 *           para RolPermisoServicio.consultarPermisos()
 * CU      : CU-32 a CU-40 (no documentados)
 * MK      : sin pantalla propia; la barra de sesión de MK-01, MK-02, MK-10 y
 *           MK-11 muestra el rol
 * Valores : 'Responsable de Activos','Empleado','Aprobador','Técnico de Soporte','Gerente'
 *           (Diccionario v7; iguales al ENUM de db/nexaactivos_ddl.sql v1.2)
 * Nombres : Java no admite espacios en una constante: Responsable_de_Activos y
 *           Técnico_de_Soporte corresponden a 'Responsable de Activos' y
 *           'Técnico de Soporte' en la base; el código cambia _ por espacio al
 *           leer o escribir (diferencia declarada D-16, ver README).
 * Orden   : el de declaración del Diccionario v7 (el mismo índice del ENUM).
 *           Solo constantes: la enumeración no tiene métodos (diagrama v6).
 * CRF     : CRF-003 · Línea base: LB-1
 * Estado  : constantes completas. Propuesta del equipo, pendiente de validar.
 *
 * Versión | Fecha      | Autores | Cambio
 * 1.0     | 06/11/2026 | Julián David Valencia Gamboa; Eliú Marimón Arrieta | Esqueleto inicial (entrega 4.2)
 * 1.1     | 06/11/2026 | Julián David Valencia Gamboa; Eliú Marimón Arrieta | Constantes del Diccionario v7 (corte vertical 4.3, base técnica: SesionActual (D-11))
 * =====================================================================
 */
package co.nexaservicios.nexaactivos.modelo.enumeraciones;

public enum Nombre_Rol {
    Responsable_de_Activos, Empleado, Aprobador, Técnico_de_Soporte, Gerente
}
