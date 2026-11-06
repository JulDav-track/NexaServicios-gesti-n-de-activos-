/*
 * =====================================================================
 * NexaActivos - Nexa Servicios S.A.S. · Ingeniería de Software II
 * Uniremington 2026-02 · Docente: Gloria Amparo Lora Patiño
 * Archivo : src/main/java/co/nexaservicios/nexaactivos/servicio/RolPermisoServicio.java
 * Capa    : Servicio
 * Servicio de la clase Rol_Permiso (Tabla 4, fila 12). Operaciones públicas de
 *           la Tabla 5 del DDA: asignar(rp), retirar(rol, permiso),
 *           consultarPermisos(rol). Implementada en el corte:
 *           consultarPermisos(rol : Nombre_Rol). Las demás quedan como
 *           esqueleto declarado (HU-38, HU-39).
 * HU      : HU-38, HU-39, HU-40
 * RF      : HU-38: RF-42, RF-166; HU-39: RF-43, RF-146; HU-40: RF-44
 * Uso en el corte: los 7 métodos públicos de ActivoServicio la invocan antes de
 *           ejecutar la operación: RF-166 (transversal, origen HU-38), medido
 *           por RNF-01; mensaje 4 de la Tabla 8 de 3.7. La autoridad por rol
 *           se decide una sola vez (CRI-01). Llamada entre Servicios: no
 *           repite la verificación (3.7.4). RolPermisoControlador sigue como
 *           esqueleto.
 * Mensaje : SIN_PERMISO = «No tiene permiso para realizar esta operación.»:
 *           propuesta del equipo, sin número M-xx (2.4.2 del Word de CU;
 *           mockups 2.5, criterios de lectura), pendiente de validar.
 * CU      : CU-38 a CU-40 (no documentados)
 * MK      : sin pantalla
 * RN      : ninguna (sin RN; RNF-01 y RF-166). Matriz rol–operación
 *           pendiente (P-75, P-77, P-100, P-RP1, P-RP2).
 * CRF     : CRF-003 · Línea base: LB-1
 * Fuentes : DDA 3.6 v3_GenC (Tablas 4 y 5); 3.7 v3 (Tabla 8); RNF-01; RF-166.
 * Estado  : corte vertical parcial. Propuesta del equipo, pendiente de validar.
 *
 * Versión | Fecha      | Autores | Cambio
 * 1.0     | 06/11/2026 | Julián David Valencia Gamboa; Eliú Marimón Arrieta | Esqueleto inicial (entrega 4.2)
 * 1.1     | 06/11/2026 | Julián David Valencia Gamboa; Eliú Marimón Arrieta | HU-38 RF-166: consultarPermisos() y texto del rechazo por rol (propuesta, sin número)
 * =====================================================================
 */
package co.nexaservicios.nexaactivos.servicio;

import co.nexaservicios.nexaactivos.modelo.enumeraciones.Nombre_Permiso;
import co.nexaservicios.nexaactivos.modelo.enumeraciones.Nombre_Rol;
import co.nexaservicios.nexaactivos.modelo.seguridad_acceso.Rol_Permiso;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class RolPermisoServicio {

    /** Rechazo por rol: propuesta del equipo, sin número M-xx (RNF-01, RF-166). */
    public static final String SIN_PERMISO = "No tiene permiso para realizar esta operación.";

    private final Rol_Permiso modeloRolPermiso = new Rol_Permiso();

    /** consultarPermisos(rol : Nombre_Rol) · HU-40. Devuelve los permisos del rol; no modifica datos. */
    public List<Nombre_Permiso> consultarPermisos(Nombre_Rol rol) {
        return modeloRolPermiso.consultarPermisos(rol);
    }
}
