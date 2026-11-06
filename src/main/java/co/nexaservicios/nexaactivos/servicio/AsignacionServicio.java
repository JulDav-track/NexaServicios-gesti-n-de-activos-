/*
 * =====================================================================
 * NexaActivos - Nexa Servicios S.A.S. · Ingeniería de Software II
 * Uniremington 2026-02 · Docente: Gloria Amparo Lora Patiño
 * Archivo : src/main/java/co/nexaservicios/nexaactivos/servicio/AsignacionServicio.java
 * Capa    : Servicio
 * Servicio de la clase Asignacion (Tabla 4, fila 5). Operaciones públicas de
 *           la Tabla 5 del DDA: asignar(a), buscarPorId(idAsignacion),
 *           listarVigentes(), listarPorCustodio(idCustodio),
 *           buscarVigentePorActivo(idActivo), actualizar(a), cerrar(idAsignacion).
 *           Implementada en el corte: buscarVigentePorActivo(idActivo : int).
 *           Las demás quedan como esqueleto declarado (HU-15 a HU-18).
 * HU      : HU-15, HU-16, HU-17, HU-18
 * RF      : HU-15: RF-18, RF-87, RF-88, RF-89, RF-90, RF-91, RF-161; HU-16: RF-19, RF-92, RF-93, RF-94, RF-95, RF-96; HU-17: RF-20, RF-97; HU-18: RF-21, RF-98, RF-99, RF-100, RF-101
 * Uso en el corte: ActivoServicio la invoca en actualizar() (RN-A16a, RF-60,
 *           HU-03) y en darDeBaja() (RN-A19, RF-58, HU-04). Llamada entre
 *           Servicios: no repite la verificación de permiso (3.7.4); el
 *           AsignacionControlador sigue como esqueleto.
 * CU      : CU-15 (documentado, fuera del corte); CU-16 a CU-18 (no documentados)
 * MK      : MK-06, MK-13 (sin contenido en el corte)
 * RN      : buscarVigentePorActivo() no tiene guardas (RF-19).
 * CRF     : CRF-003 · Línea base: LB-1
 * Fuentes : DDA 3.6 v3_GenC (Tablas 4 y 5).
 * Estado  : corte vertical parcial. Propuesta del equipo, pendiente de validar.
 *
 * Versión | Fecha      | Autores | Cambio
 * 1.0     | 06/11/2026 | Julián David Valencia Gamboa; Eliú Marimón Arrieta | Esqueleto inicial (entrega 4.2)
 * 1.1     | 06/11/2026 | Julián David Valencia Gamboa; Eliú Marimón Arrieta | HU-03 RF-60: buscarVigentePorActivo()
 * =====================================================================
 */
package co.nexaservicios.nexaactivos.servicio;

import co.nexaservicios.nexaactivos.modelo.prestamo_equipos.Asignacion;
import org.springframework.stereotype.Service;

@Service
public class AsignacionServicio {

    private final Asignacion modeloAsignacion = new Asignacion();

    /** buscarVigentePorActivo(idActivo : int) · HU-16, RF-19. null si el activo no tiene asignación Vigente. */
    public Asignacion buscarVigentePorActivo(int idActivo) {
        return modeloAsignacion.buscarVigentePorActivo(idActivo);
    }
}
