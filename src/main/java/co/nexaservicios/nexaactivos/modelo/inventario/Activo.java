/*
 * =====================================================================
 * NexaActivos - Nexa Servicios S.A.S. · Ingeniería de Software II
 * Uniremington 2026-02 · Docente: Gloria Amparo Lora Patiño
 * Archivo : src/main/java/co/nexaservicios/nexaactivos/modelo/inventario/Activo.java
 * Capa    : Modelo
 * Clase   : Activo (paquete Inventario del diagrama v6 con CRF-003; Tabla 4, fila 1)
 * Métodos : 7 públicos y 2 INTERNO en el diagrama. Implementados en el corte:
 *           crear()
 *           existeNumeroSerie() «INTERNO», existePlaca() «INTERNO»
 *           buscarPorId(), buscarPorNumeroSerie(), buscarPorPlaca()
 *           listarInventario()
 * HU      : HU-01, HU-02, HU-03, HU-04
 * RF      : HU-01: RF-01, RF-02, RF-52; HU-02: RF-03, RF-56; HU-03: RF-04, RF-51, RF-53, RF-54, RF-55, RF-60; HU-04: RF-05, RF-57, RF-58, RF-59, RF-164
 * CU      : CU-01 (Tabla 8 y Figura 6 de 3.7; incluye CU-48 y CU-49); CU-02, CU-03 y CU-04 (no documentados)
 * MK      : MK-01, MK-02, MK-10, MK-11
 * RN      : ninguna. Las guardas y sus RN viven solo en ActivoServicio; esta
 *           clase guarda, consulta y modifica datos.
 * CRF     : CRF-003 · Línea base: LB-1
 * Fuentes : Diccionario v7 (tabla Activo); diagrama de clases v6 con CRF-003;
 *           DDA 3.6 v3_GenC (Tablas 1, 2, 4 y 5); 3.7 v3 (Tabla 8); matriz 3.9 v2.
 * Atributos: los 8 del Diccionario v7, con su tipo SQL al lado. Nombre Java en
 *           camelCase; la columna SQL conserva el nombre del diccionario.
 * Accesores: get/set de los atributos (convención Java, no son operaciones del
 *           diagrama; D-13). ID_Activo es {PK, readOnly}: no tiene setter, se
 *           fija una sola vez en el constructor Activo(Integer).
 * Datos   : SQL con Spring JDBC a través de ConexionBD (D-10, D-12). Sin
 *           repositorio (DDA, supuesto 2). Nunca DELETE: darDeBaja() hace
 *           UPDATE del Estado a 'Baja'.
 * Estado  : corte vertical. Propuesta del equipo, pendiente de validar.
 *
 * Versión | Fecha      | Autores | Cambio
 * 1.0     | 06/11/2026 | Julián David Valencia Gamboa; Eliú Marimón Arrieta | Esqueleto inicial (entrega 4.2)
 * 1.1     | 06/11/2026 | Julián David Valencia Gamboa; Eliú Marimón Arrieta | HU-01 RF-01: atributos del Diccionario v7 y crear()
 * 1.2     | 06/11/2026 | Julián David Valencia Gamboa; Eliú Marimón Arrieta | HU-01 RF-02: existeNumeroSerie() y existePlaca() «INTERNO»
 * 1.3     | 06/11/2026 | Julián David Valencia Gamboa; Eliú Marimón Arrieta | HU-02 RF-03: buscarPorId(), buscarPorNumeroSerie(), buscarPorPlaca()
 * 1.4     | 06/11/2026 | Julián David Valencia Gamboa; Eliú Marimón Arrieta | HU-02 RF-56: listarInventario()
 * =====================================================================
 */
package co.nexaservicios.nexaactivos.modelo.inventario;

import co.nexaservicios.nexaactivos.modelo.enumeraciones.Estado_Activo;
import co.nexaservicios.nexaactivos.soporte.ConexionBD;
import java.util.List;
import org.springframework.jdbc.core.RowMapper;

public class Activo {

    private Integer idActivo;              // ID_Activo        INT(11)      PK, readOnly (AUTO_INCREMENT, D1 del DDL)
    private String marca;                  // Marca            VARCHAR(50)  obligatorio
    private String modelo;                 // Modelo           VARCHAR(50)  obligatorio
    private Estado_Activo estado;          // Estado           ENUM Estado_Activo, valor inicial Disponible
    private String numeroSerie;            // Numero_Serie     VARCHAR(20)  obligatorio, UNIQUE
    private String placaInventario;        // Placa_Inventario VARCHAR(11)  obligatorio, UNIQUE
    private String ubicacion;              // Ubicacion        VARCHAR(100) opcional [0..1]
    private Integer idCategoria;           // ID_Categoria     INT(11)      FK hacia Categoria

    // Convierte una fila de la tabla Activo en un objeto (los nombres de columna son los del DDL v1.2)
    private static final RowMapper<Activo> FILA = (rs, n) -> {
        Activo a = new Activo(rs.getInt("ID_Activo"));
        a.setMarca(rs.getString("Marca"));
        a.setModelo(rs.getString("Modelo"));
        a.setEstado(Estado_Activo.valueOf(rs.getString("Estado")));
        a.setNumeroSerie(rs.getString("Numero_Serie"));
        a.setPlacaInventario(rs.getString("Placa_Inventario"));
        a.setUbicacion(rs.getString("Ubicacion"));
        a.setIdCategoria(rs.getInt("ID_Categoria"));
        return a;
    };

    private static final String COLUMNAS =
        "SELECT ID_Activo, Marca, Modelo, Estado, Numero_Serie, Placa_Inventario, Ubicacion, ID_Categoria FROM Activo ";

    public Activo() {
    }

    public Activo(Integer idActivo) {
        this.idActivo = idActivo;
    }

    // ----- Operaciones del diagrama de clases v6 con CRF-003 -----

    /** crear(a : Activo) : void · HU-01, RF-01. El Estado nace Disponible (Diccionario v7). */
    public void crear(Activo a) {
        ConexionBD.jdbc().update(
            "INSERT INTO Activo (Marca, Modelo, Estado, Numero_Serie, Placa_Inventario, Ubicacion, ID_Categoria) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?)",
            a.getMarca(), a.getModelo(), Estado_Activo.Disponible.name(), a.getNumeroSerie(),
            a.getPlacaInventario(), a.getUbicacion(), a.getIdCategoria());
    }

    /** existeNumeroSerie(numeroSerie : String) : boolean «INTERNO» · lo invoca solo ActivoServicio (CU-49). */
    public boolean existeNumeroSerie(String numeroSerie) {
        Integer n = ConexionBD.jdbc().queryForObject(
            "SELECT COUNT(*) FROM Activo WHERE Numero_Serie = ?", Integer.class, numeroSerie);
        return n != null && n > 0;
    }

    /** existePlaca(placa : String) : boolean «INTERNO» · lo invoca solo ActivoServicio (CU-49). */
    public boolean existePlaca(String placa) {
        Integer n = ConexionBD.jdbc().queryForObject(
            "SELECT COUNT(*) FROM Activo WHERE Placa_Inventario = ?", Integer.class, placa);
        return n != null && n > 0;
    }

    /** buscarPorId(idActivo : int) : Activo · HU-02, RF-03. Devuelve null si no existe. */
    public Activo buscarPorId(int idActivo) {
        List<Activo> filas = ConexionBD.jdbc().query(COLUMNAS + "WHERE ID_Activo = ?", FILA, idActivo);
        return filas.isEmpty() ? null : filas.get(0);
    }

    /** buscarPorNumeroSerie(numeroSerie : String) : Activo · HU-02, RF-03. Devuelve null si no existe. */
    public Activo buscarPorNumeroSerie(String numeroSerie) {
        List<Activo> filas = ConexionBD.jdbc().query(COLUMNAS + "WHERE Numero_Serie = ?", FILA, numeroSerie);
        return filas.isEmpty() ? null : filas.get(0);
    }

    /** buscarPorPlaca(placa : String) : Activo · HU-02, RF-03. Devuelve null si no existe. */
    public Activo buscarPorPlaca(String placa) {
        List<Activo> filas = ConexionBD.jdbc().query(COLUMNAS + "WHERE Placa_Inventario = ?", FILA, placa);
        return filas.isEmpty() ? null : filas.get(0);
    }

    /** listarInventario() : List<Activo> · HU-02, RF-56. Todos los estados, por placa de menor a mayor. */
    public List<Activo> listarInventario() {
        return ConexionBD.jdbc().query(COLUMNAS + "ORDER BY Placa_Inventario ASC", FILA);
    }

    // ----- Accesores (D-13). ID_Activo sin setter: {PK, readOnly} -----

    public Integer getIdActivo() { return idActivo; }
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public Estado_Activo getEstado() { return estado; }
    public void setEstado(Estado_Activo estado) { this.estado = estado; }
    public String getNumeroSerie() { return numeroSerie; }
    public void setNumeroSerie(String numeroSerie) { this.numeroSerie = numeroSerie; }
    public String getPlacaInventario() { return placaInventario; }
    public void setPlacaInventario(String placaInventario) { this.placaInventario = placaInventario; }
    public String getUbicacion() { return ubicacion; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }
    public Integer getIdCategoria() { return idCategoria; }
    public void setIdCategoria(Integer idCategoria) { this.idCategoria = idCategoria; }
}
