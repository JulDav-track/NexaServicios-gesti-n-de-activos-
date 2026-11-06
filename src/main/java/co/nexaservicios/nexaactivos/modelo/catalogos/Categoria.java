/*
 * =====================================================================
 * NexaActivos - Nexa Servicios S.A.S. · Ingeniería de Software II
 * Uniremington 2026-02 · Docente: Gloria Amparo Lora Patiño
 * Archivo : src/main/java/co/nexaservicios/nexaactivos/modelo/catalogos/Categoria.java
 * Capa    : Modelo
 * Clase   : Categoria (paquete Catálogos del diagrama v6 con CRF-003; Tabla 4, fila 14)
 * Métodos : 5 públicos y 1 INTERNO en el diagrama. Implementado en el corte:
 *           buscarPorId() (HU-42, RF-46). Pendientes (esqueleto declarado):
 *           crear(), existeNombreCategoria() «INTERNO», listarActivas(),
 *           actualizar() e inactivar().
 * HU      : HU-41, HU-42, HU-43, HU-44
 * RF      : HU-41: RF-45, RF-147; HU-42: RF-46, RF-148; HU-43: RF-47, RF-149, RF-150; HU-44: RF-48, RF-151, RF-152, RF-153, RF-154
 * Uso en el corte: CategoriaServicio.buscarPorId() lo invoca ActivoServicio en
 *           CU-01 como caso incluido CU-48 (Tabla 8 de 3.7, mensaje 7:
 *           RF-52; RF-01, de HU-01).
 * CU      : CU-41 a CU-44 (no documentados); CU-48 (incluido)
 * MK      : sin pantalla
 * RN      : ninguna. Las guardas viven en los Servicios.
 * CRF     : CRF-003 · Línea base: LB-1
 * Fuentes : Diccionario v7 (tabla Categoria); diagrama de clases v6 con CRF-003;
 *           DDA 3.6 v3_GenC (Tablas 2, 4 y 5).
 * Atributos: los 3 del Diccionario v7, con su tipo SQL al lado. Accesores get/set
 *           (D-13); ID_Categoria {PK, readOnly} sin setter.
 * Estado  : corte vertical parcial. Propuesta del equipo, pendiente de validar.
 *
 * Versión | Fecha      | Autores | Cambio
 * 1.0     | 06/11/2026 | Julián David Valencia Gamboa; Eliú Marimón Arrieta | Esqueleto inicial (entrega 4.2)
 * 1.1     | 06/11/2026 | Julián David Valencia Gamboa; Eliú Marimón Arrieta | HU-01 RF-01: atributos del Diccionario v7 y buscarPorId() (incluido CU-48)
 * =====================================================================
 */
package co.nexaservicios.nexaactivos.modelo.catalogos;

import co.nexaservicios.nexaactivos.soporte.ConexionBD;
import java.util.List;
import org.springframework.jdbc.core.RowMapper;

public class Categoria {

    private Integer idCategoria;          // ID_Categoria     INT(11)     PK, readOnly
    private String nombreCategoria;       // Nombre_Categoria VARCHAR(50) obligatorio, UNIQUE
    private boolean activo;               // activo           BOOLEAN     NOT NULL DEFAULT TRUE (baja lógica)

    private static final RowMapper<Categoria> FILA = (rs, n) -> {
        Categoria c = new Categoria(rs.getInt("ID_Categoria"));
        c.setNombreCategoria(rs.getString("Nombre_Categoria"));
        c.setActivo(rs.getBoolean("activo"));
        return c;
    };

    public Categoria() {
    }

    public Categoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    /** buscarPorId(idCategoria : int) : Categoria · HU-42, RF-46. Activa o inactiva; null si no existe. */
    public Categoria buscarPorId(int idCategoria) {
        List<Categoria> filas = ConexionBD.jdbc().query(
            "SELECT ID_Categoria, Nombre_Categoria, activo FROM Categoria WHERE ID_Categoria = ?",
            FILA, idCategoria);
        return filas.isEmpty() ? null : filas.get(0);
    }

    public Integer getIdCategoria() { return idCategoria; }
    public String getNombreCategoria() { return nombreCategoria; }
    public void setNombreCategoria(String nombreCategoria) { this.nombreCategoria = nombreCategoria; }
    public boolean isActivo() { return activo; }
    public void setActivo(boolean activo) { this.activo = activo; }
}
