/*
 * =====================================================================
 * NexaActivos - Nexa Servicios S.A.S. · Ingeniería de Software II
 * Uniremington 2026-02 · Docente: Gloria Amparo Lora Patiño
 * Archivo : src/main/java/co/nexaservicios/nexaactivos/modelo/enumeraciones/Estado_Activo.java
 * Capa    : Modelo, paquete Enumeraciones (DDA 3.6 v3_GenC, Tabla 2, fila 24)
 * Uso     : Activo.Estado
 * Valores : 'Disponible','Asignado','Dañado','Baja'
 *           (Diccionario v7; iguales al ENUM de db/nexaactivos_ddl.sql v1.2)
 * Orden   : el de declaración del Diccionario v7 (el mismo índice del ENUM).
 *           Solo constantes: la enumeración no tiene métodos (diagrama v6).
 * CRF     : CRF-003 · Línea base: LB-1
 * Estado  : constantes completas. Propuesta del equipo, pendiente de validar.
 *
 * Versión | Fecha      | Autores | Cambio
 * 1.0     | 06/11/2026 | Julián David Valencia Gamboa; Eliú Marimón Arrieta | Esqueleto inicial (entrega 4.2)
 * 1.1     | 06/11/2026 | Julián David Valencia Gamboa; Eliú Marimón Arrieta | Constantes del Diccionario v7 (corte vertical 4.3, HU-01 RF-01 (Activo.Estado))
 * =====================================================================
 */
package co.nexaservicios.nexaactivos.modelo.enumeraciones;

public enum Estado_Activo {
    Disponible, Asignado, Dañado, Baja
}
