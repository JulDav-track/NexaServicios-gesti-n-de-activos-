/*
 * =====================================================================
 * NexaActivos - Nexa Servicios S.A.S. · Ingeniería de Software II
 * Uniremington 2026-02 · Docente: Gloria Amparo Lora Patiño
 * Archivo : src/main/java/co/nexaservicios/nexaactivos/modelo/seguridad_acceso/Auditoria.java
 * Capa    : Modelo
 * Clase   : Auditoria (paquete Seguridad y acceso del diagrama v6 con CRF-003; Tabla 4, fila 13)
 * Métodos : 1 público y 1 INTERNO en el diagrama. Implementado en el corte:
 *           registrar() «INTERNO» (sin HU; lo invocan los Servicios de las
 *           demás entidades a través de AuditoriaServicio). Pendiente
 *           (esqueleto declarado): buscarPorId() (HU-45).
 * HU      : HU-45
 * RF      : HU-45: RF-49, RF-160
 * Uso en el corte: registro de la baja del activo, HU-04 RF-164 (acción
 *           Inactivar, entidad Activo). RF-160 (HU-45) describe el registro.
 * CU      : CU-45 (no documentado)
 * MK      : sin pantalla
 * RN      : ninguna en esta clase. RN-T02a (la baja queda registrada con quién
 *           y cuándo) se cita en ActivoServicio.darDeBaja().
 * CRF     : CRF-003 · Línea base: LB-1
 * Fuentes : Diccionario v7 (tabla Auditoria); diagrama de clases v6 con
 *           CRF-003; DDA 3.6 v3_GenC (Tablas 4 y 5).
 * Atributos: los 7 del Diccionario v7, con su tipo SQL al lado. Accesores get/set
 *           (D-13); ID_Auditoria {PK, readOnly} sin setter. Fecha_Accion la
 *           asigna la base (DEFAULT CURRENT_TIMESTAMP). ID_Registro es una
 *           referencia lógica, no FK. Detalle nunca lleva contraseñas (RNF-04).
 * Estado  : corte vertical parcial. Propuesta del equipo, pendiente de validar.
 *
 * Versión | Fecha      | Autores | Cambio
 * 1.0     | 06/11/2026 | Julián David Valencia Gamboa; Eliú Marimón Arrieta | Esqueleto inicial (entrega 4.2)
 * 1.1     | 06/11/2026 | Julián David Valencia Gamboa; Eliú Marimón Arrieta | HU-04 RF-164: atributos del Diccionario v7 y registrar() «INTERNO»
 * =====================================================================
 */
package co.nexaservicios.nexaactivos.modelo.seguridad_acceso;

import co.nexaservicios.nexaactivos.modelo.enumeraciones.Accion_Auditoria;
import co.nexaservicios.nexaactivos.soporte.ConexionBD;
import java.time.LocalDateTime;

public class Auditoria {

    private Integer idAuditoria;          // ID_Auditoria INT(11)      PK, readOnly
    private Integer idUsuario;            // ID_Usuario   INT(11)      FK hacia Usuario (quien ejecutó la acción)
    private String entidad;               // Entidad      VARCHAR(50)  obligatorio
    private Integer idRegistro;           // ID_Registro  INT(11)      referencia lógica (no FK)
    private Accion_Auditoria accion;      // Accion       ENUM Accion_Auditoria
    private LocalDateTime fechaAccion;    // Fecha_Accion DATETIME     asignada por el sistema
    private String detalle;               // Detalle      VARCHAR(300) opcional [0..1]

    public Auditoria() {
    }

    /** registrar(a : Auditoria) : void «INTERNO» · sin HU; RF-160 (HU-45) y, en el corte, RF-164 (HU-04). */
    public void registrar(Auditoria a) {
        ConexionBD.jdbc().update(
            "INSERT INTO Auditoria (ID_Usuario, Entidad, ID_Registro, Accion, Detalle) VALUES (?, ?, ?, ?, ?)",
            a.getIdUsuario(), a.getEntidad(), a.getIdRegistro(), a.getAccion().name(), a.getDetalle());
    }

    public Integer getIdAuditoria() { return idAuditoria; }
    public Integer getIdUsuario() { return idUsuario; }
    public void setIdUsuario(Integer idUsuario) { this.idUsuario = idUsuario; }
    public String getEntidad() { return entidad; }
    public void setEntidad(String entidad) { this.entidad = entidad; }
    public Integer getIdRegistro() { return idRegistro; }
    public void setIdRegistro(Integer idRegistro) { this.idRegistro = idRegistro; }
    public Accion_Auditoria getAccion() { return accion; }
    public void setAccion(Accion_Auditoria accion) { this.accion = accion; }
    public LocalDateTime getFechaAccion() { return fechaAccion; }
    public String getDetalle() { return detalle; }
    public void setDetalle(String detalle) { this.detalle = detalle; }
}
