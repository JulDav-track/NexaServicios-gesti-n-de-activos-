/*
 * =====================================================================
 * NexaActivos - Nexa Servicios S.A.S. · Ingeniería de Software II
 * Uniremington 2026-02 · Docente: Gloria Amparo Lora Patiño
 * Archivo : src/main/java/co/nexaservicios/nexaactivos/modelo/seguridad_acceso/Rol_Permiso.java
 * Capa    : Modelo
 * Clase   : Rol_Permiso (paquete Seguridad y acceso del diagrama v6 con CRF-003; Tabla 4, fila 12)
 * Métodos : 3 públicos y 1 INTERNO en el diagrama. Implementado en el corte:
 *           consultarPermisos() (HU-40; solo consulta). Pendientes (esqueleto
 *           declarado): asignar() (HU-38), existeAsignacion() «INTERNO» y
 *           retirar() (HU-39, única eliminación física del sistema, P-78).
 * HU      : HU-38, HU-39, HU-40
 * RF      : HU-38: RF-42, RF-166; HU-39: RF-43, RF-146; HU-40: RF-44
 * Uso en el corte: verificación del permiso del rol, RF-166 (transversal,
 *           origen HU-38), mensaje 4 de la Tabla 8 de 3.7.
 * CU      : CU-38 a CU-40 (no documentados)
 * MK      : sin pantalla
 * RN      : ninguna (Rol_Permiso no tiene fichas de RN; 2.2.4.12).
 * CRF     : CRF-003 · Línea base: LB-1
 * Fuentes : Diccionario v7 (tabla Rol_Permiso); diagrama de clases v6 con
 *           CRF-003; DDA 3.6 v3_GenC (Tablas 4 y 5).
 * Atributos: rol y permiso, PK compuesta, ambos {PK, readOnly}: solo getters.
 *           La matriz inicial de permisos no está definida (P-75): los
 *           permisos de db/datos_prueba.sql son de prueba.
 * Estado  : corte vertical parcial. Propuesta del equipo, pendiente de validar.
 *
 * Versión | Fecha      | Autores | Cambio
 * 1.0     | 06/11/2026 | Julián David Valencia Gamboa; Eliú Marimón Arrieta | Esqueleto inicial (entrega 4.2)
 * 1.1     | 06/11/2026 | Julián David Valencia Gamboa; Eliú Marimón Arrieta | HU-38 RF-166: atributos del Diccionario v7 y consultarPermisos()
 * =====================================================================
 */
package co.nexaservicios.nexaactivos.modelo.seguridad_acceso;

import co.nexaservicios.nexaactivos.modelo.enumeraciones.Nombre_Permiso;
import co.nexaservicios.nexaactivos.modelo.enumeraciones.Nombre_Rol;
import co.nexaservicios.nexaactivos.soporte.ConexionBD;
import java.util.List;

public class Rol_Permiso {

    private Nombre_Rol rol;               // rol     ENUM Nombre_Rol     PK compuesta, readOnly
    private Nombre_Permiso permiso;       // permiso ENUM Nombre_Permiso PK compuesta, readOnly

    public Rol_Permiso() {
    }

    /**
     * consultarPermisos(rol : Nombre_Rol) : List<Nombre_Permiso> · HU-40. Solo consulta.
     * ORDER BY sobre un ENUM ordena por el índice de declaración (orden del Diccionario v7).
     */
    public List<Nombre_Permiso> consultarPermisos(Nombre_Rol rol) {
        return ConexionBD.jdbc().query(
            "SELECT permiso FROM Rol_Permiso WHERE rol = ? ORDER BY permiso",
            (rs, n) -> Nombre_Permiso.valueOf(rs.getString("permiso")),
            rol.name().replace('_', ' '));   // D-16: Responsable_de_Activos -> 'Responsable de Activos'
    }

    public Nombre_Rol getRol() { return rol; }
    public Nombre_Permiso getPermiso() { return permiso; }
}
