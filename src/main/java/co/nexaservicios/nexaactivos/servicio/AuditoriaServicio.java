/*
 * =====================================================================
 * NexaActivos - Nexa Servicios S.A.S. · Ingeniería de Software II
 * Uniremington 2026-02 · Docente: Gloria Amparo Lora Patiño
 * Archivo : src/main/java/co/nexaservicios/nexaactivos/servicio/AuditoriaServicio.java
 * Capa    : Servicio
 * Servicio de la clase Auditoria (Tabla 4, fila 13). Tabla 5 del DDA:
 *           operación pública buscarPorId(idAuditoria) e INTERNO registrar(a).
 *           Implementado en el corte: registrar(a : Auditoria) «INTERNO»,
 *           única excepción de la regla de los INTERNO: lo invocan los
 *           Servicios de las demás entidades (3.6.1; 3.7, introducción).
 *           Pendiente (esqueleto declarado): buscarPorId() (HU-45).
 * HU      : HU-45
 * RF      : HU-45: RF-49, RF-160
 * Uso en el corte: ActivoServicio.darDeBaja() registra la baja (HU-04 RF-164,
 *           acción Inactivar).
 * CU      : CU-45 (no documentado)
 * MK      : sin pantalla
 * RN      : registrar() no tiene guardas; RN-T02a se cita en quien audita.
 * CRF     : CRF-003 · Línea base: LB-1
 * Fuentes : DDA 3.6 v3_GenC (Tablas 4 y 5); RF-160 y RF-164.
 * Estado  : corte vertical parcial. Propuesta del equipo, pendiente de validar.
 *
 * Versión | Fecha      | Autores | Cambio
 * 1.0     | 06/11/2026 | Julián David Valencia Gamboa; Eliú Marimón Arrieta | Esqueleto inicial (entrega 4.2)
 * 1.1     | 06/11/2026 | Julián David Valencia Gamboa; Eliú Marimón Arrieta | HU-04 RF-164: registrar() «INTERNO»
 * =====================================================================
 */
package co.nexaservicios.nexaactivos.servicio;

import co.nexaservicios.nexaactivos.modelo.seguridad_acceso.Auditoria;
import org.springframework.stereotype.Service;

@Service
public class AuditoriaServicio {

    private final Auditoria modeloAuditoria = new Auditoria();

    /** registrar(a : Auditoria) «INTERNO» · lo invocan los Servicios que auditan (RF-160; en el corte, RF-164). */
    public void registrar(Auditoria a) {
        modeloAuditoria.registrar(a);
    }
}
