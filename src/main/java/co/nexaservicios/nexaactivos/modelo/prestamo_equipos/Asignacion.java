/*
 * =====================================================================
 * NexaActivos - Nexa Servicios S.A.S. · Ingeniería de Software II
 * Uniremington 2026-02 · Docente: Gloria Amparo Lora Patiño
 * Archivo : src/main/java/co/nexaservicios/nexaactivos/modelo/prestamo_equipos/Asignacion.java
 * Capa    : Modelo
 * Clase   : Asignacion (paquete Préstamo de equipos del diagrama v6 con CRF-003; Tabla 4, fila 5)
 * Métodos : 7 públicos y 2 INTERNO en el diagrama. Implementado en el corte:
 *           buscarVigentePorActivo() (HU-16, RF-19). Pendientes (esqueleto
 *           declarado): asignar(), existeAsignacionDeSolicitud() «INTERNO»,
 *           activoDisponible() «INTERNO», buscarPorId(), listarVigentes(),
 *           listarPorCustodio(), actualizar() y cerrar().
 * HU      : HU-15, HU-16, HU-17, HU-18
 * RF      : HU-15: RF-18, RF-87, RF-88, RF-89, RF-90, RF-91, RF-161; HU-16: RF-19, RF-92, RF-93, RF-94, RF-95, RF-96; HU-17: RF-20, RF-97; HU-18: RF-21, RF-98, RF-99, RF-100, RF-101
 * Uso en el corte: AsignacionServicio.buscarVigentePorActivo() lo invoca
 *           ActivoServicio para saber si un activo tiene asignación vigente
 *           (RN-A16a en HU-03, RF-60; RN-A19 en HU-04, RF-58).
 * CU      : CU-15 (documentado, fuera del corte); CU-16 a CU-18 (no documentados)
 * MK      : MK-06, MK-13 (sin contenido en el corte)
 * RN      : ninguna. Las guardas viven en los Servicios.
 * Nota    : ID_Custodio se copia de Solicitud.ID_Custodio al asignar;
 *           desnormalización deliberada (3.4 v3, hallazgo H-01, pendiente de
 *           la docente). En el corte solo se lee.
 * CRF     : CRF-003 · Línea base: LB-1
 * Fuentes : Diccionario v7 (tabla Asignacion); diagrama de clases v6 con
 *           CRF-003; DDA 3.6 v3_GenC (Tablas 2, 4 y 5); 3.4 v3.
 * Atributos: los 7 del Diccionario v7, con su tipo SQL al lado. Accesores get/set
 *           (D-13); ID_Asignacion {PK, readOnly} sin setter.
 * Estado  : corte vertical parcial. Propuesta del equipo, pendiente de validar.
 *
 * Versión | Fecha      | Autores | Cambio
 * 1.0     | 06/11/2026 | Julián David Valencia Gamboa; Eliú Marimón Arrieta | Esqueleto inicial (entrega 4.2)
 * 1.1     | 06/11/2026 | Julián David Valencia Gamboa; Eliú Marimón Arrieta | HU-03 RF-60: atributos del Diccionario v7 y buscarVigentePorActivo()
 * =====================================================================
 */
package co.nexaservicios.nexaactivos.modelo.prestamo_equipos;

import co.nexaservicios.nexaactivos.modelo.enumeraciones.Estado_Asignacion;
import co.nexaservicios.nexaactivos.soporte.ConexionBD;
import java.time.LocalDate;
import java.util.List;
import org.springframework.jdbc.core.RowMapper;

public class Asignacion {

    private Integer idAsignacion;                 // ID_Asignacion             INT(11) PK, readOnly
    private LocalDate fechaEntrega;               // Fecha_Entrega             DATE    asignada por el sistema
    private LocalDate fechaDevolucionEsperada;    // Fecha_Devolucion_Esperada DATE    obligatoria
    private Estado_Asignacion estadoAsignacion;   // Estado_Asignacion         ENUM Estado_Asignacion, inicial Vigente
    private Integer idCustodio;                   // ID_Custodio               INT(11) FK hacia Custodio (H-01)
    private Integer idActivo;                     // ID_Activo                 INT(11) FK hacia Activo
    private Integer idSolicitud;                  // ID_Solicitud              INT(11) FK hacia Solicitud, UNIQUE

    private static final RowMapper<Asignacion> FILA = (rs, n) -> {
        Asignacion a = new Asignacion(rs.getInt("ID_Asignacion"));
        a.setFechaEntrega(rs.getObject("Fecha_Entrega", LocalDate.class));
        a.setFechaDevolucionEsperada(rs.getObject("Fecha_Devolucion_Esperada", LocalDate.class));
        a.setEstadoAsignacion(Estado_Asignacion.valueOf(rs.getString("Estado_Asignacion")));
        a.setIdCustodio(rs.getInt("ID_Custodio"));
        a.setIdActivo(rs.getInt("ID_Activo"));
        a.setIdSolicitud(rs.getInt("ID_Solicitud"));
        return a;
    };

    public Asignacion() {
    }

    public Asignacion(Integer idAsignacion) {
        this.idAsignacion = idAsignacion;
    }

    /** buscarVigentePorActivo(idActivo : int) : Asignacion · HU-16, RF-19. null si no hay asignación Vigente. */
    public Asignacion buscarVigentePorActivo(int idActivo) {
        List<Asignacion> filas = ConexionBD.jdbc().query(
            "SELECT ID_Asignacion, Fecha_Entrega, Fecha_Devolucion_Esperada, Estado_Asignacion, ID_Custodio, "
            + "ID_Activo, ID_Solicitud FROM Asignacion WHERE ID_Activo = ? AND Estado_Asignacion = ?",
            FILA, idActivo, Estado_Asignacion.Vigente.name());
        return filas.isEmpty() ? null : filas.get(0);
    }

    public Integer getIdAsignacion() { return idAsignacion; }
    public LocalDate getFechaEntrega() { return fechaEntrega; }
    public void setFechaEntrega(LocalDate fechaEntrega) { this.fechaEntrega = fechaEntrega; }
    public LocalDate getFechaDevolucionEsperada() { return fechaDevolucionEsperada; }
    public void setFechaDevolucionEsperada(LocalDate f) { this.fechaDevolucionEsperada = f; }
    public Estado_Asignacion getEstadoAsignacion() { return estadoAsignacion; }
    public void setEstadoAsignacion(Estado_Asignacion e) { this.estadoAsignacion = e; }
    public Integer getIdCustodio() { return idCustodio; }
    public void setIdCustodio(Integer idCustodio) { this.idCustodio = idCustodio; }
    public Integer getIdActivo() { return idActivo; }
    public void setIdActivo(Integer idActivo) { this.idActivo = idActivo; }
    public Integer getIdSolicitud() { return idSolicitud; }
    public void setIdSolicitud(Integer idSolicitud) { this.idSolicitud = idSolicitud; }
}
