/*
 * =====================================================================
 * NexaActivos - Nexa Servicios S.A.S. · Ingeniería de Software II
 * Uniremington 2026-02 · Docente: Gloria Amparo Lora Patiño
 * Archivo : src/main/java/co/nexaservicios/nexaactivos/servicio/ActivoServicio.java
 * Capa    : Servicio
 * Servicio de la clase Activo (Tabla 4, fila 1). Expone las 7 operaciones
 *           públicas de la Tabla 5 del DDA, con los mismos nombres y
 *           parámetros: crear(a : Activo), buscarPorId(idActivo : int),
 *           buscarPorNumeroSerie(numeroSerie : String), buscarPorPlaca(placa :
 *           String), listarInventario(), actualizar(a : Activo),
 *           darDeBaja(idActivo : int). Invoca los INTERNO de su clase
 *           (Activo.existeNumeroSerie(), Activo.existePlaca()). Aquí, y solo
 *           aquí, viven las guardas: cada una cita su RN con ficha, «sin RN»
 *           con su RF o «restricción del diccionario».
 * Orden   : crear() sigue los mensajes 3 a 8 de la Tabla 8 de 3.7 (CU-01).
 *           Las demás operaciones no tienen CU documentado (CU-02 a CU-04):
 *           su orden de verificación es propuesta del equipo (HAL-28).
 * HU      : HU-01, HU-02, HU-03, HU-04
 * RF      : HU-01: RF-01, RF-02, RF-52; HU-02: RF-03, RF-56; HU-03: RF-04, RF-51, RF-53, RF-54, RF-55, RF-60; HU-04: RF-05, RF-57, RF-58, RF-59, RF-164
 *           RF-166 es transversal (origen HU-38): verificación del permiso.
 * RN      : RN-A03, RN-A04 (unicidad de serie y placa), RN-A09 (categoría
 *           activa), RN-A16a (sin corrección de estado con asignación
 *           vigente), RN-A16b (Asignado solo al entregar y Baja solo al dar de
 *           baja), RN-A18 (activo en Baja), RN-A19 (baja con asignación
 *           vigente), RN-T02a (la baja queda registrada). Todas con ficha en
 *           el documento 2.2 de RN; cada guarda indica su RF.
 * CU      : CU-01 (Tabla 8 y Figura 6 de 3.7; «include» CU-48 y CU-49);
 *           CU-02, CU-03 y CU-04 (no documentados)
 * MK      : MK-01, MK-02, MK-10, MK-11
 * Mensajes: textos idénticos al catálogo E del Consolidado de 46 HU (M-01 a
 *           M-273), en las constantes M_xx. El rechazo por rol usa
 *           RolPermisoServicio.SIN_PERMISO (propuesta, sin número).
 * Rechazos: IllegalArgumentException con el texto M-xx (datos o RN) y
 *           SecurityException para el rechazo por rol (D-15).
 * Dependencias: CategoriaServicio (CU-48), AsignacionServicio (asignación
 *           vigente), AuditoriaServicio (registrar, INTERNO), RolPermisoServicio
 *           (RF-166) y SesionActual (usuario y rol en sesión, D-11).
 * CRF     : CRF-003 · Línea base: LB-1. Sin métodos de CRF-004 ni MOD-55.
 * Fuentes : DDA 3.6 v3_GenC (Tablas 4 y 5); 3.7 v3 (Tablas 8 y 10); matriz
 *           3.9 v2 (filas HU-01 a HU-04); C.1 y catálogo E del Consolidado;
 *           fichas de RN (2.2); RF (2.2.6); Anexo C (permiso por operación).
 * Estado  : corte vertical. Propuesta del equipo, pendiente de validar.
 *
 * Versión | Fecha      | Autores | Cambio
 * 1.0     | 06/11/2026 | Julián David Valencia Gamboa; Eliú Marimón Arrieta | Esqueleto inicial (entrega 4.2)
 * 1.1     | 06/11/2026 | Julián David Valencia Gamboa; Eliú Marimón Arrieta | HU-01 RF-01: crear() con obligatorios, longitudes y categoría existente
 * 1.2     | 06/11/2026 | Julián David Valencia Gamboa; Eliú Marimón Arrieta | HU-01 RF-02: crear() rechaza serie o placa registradas (RN-A03, RN-A04)
 * 1.3     | 06/11/2026 | Julián David Valencia Gamboa; Eliú Marimón Arrieta | HU-01 RF-52: crear() rechaza categoría inactiva (RN-A09)
 * 1.4     | 06/11/2026 | Julián David Valencia Gamboa; Eliú Marimón Arrieta | HU-02 RF-03: buscarPorId(), buscarPorNumeroSerie(), buscarPorPlaca()
 * 1.5     | 06/11/2026 | Julián David Valencia Gamboa; Eliú Marimón Arrieta | HU-02 RF-56: listarInventario()
 * 1.6     | 06/11/2026 | Julián David Valencia Gamboa; Eliú Marimón Arrieta | HU-03 RF-04: actualizar()
 * 1.7     | 06/11/2026 | Julián David Valencia Gamboa; Eliú Marimón Arrieta | HU-03 RF-51: actualizar() verifica unicidad sin contar al propio activo (RN-A03, RN-A04)
 * 1.8     | 06/11/2026 | Julián David Valencia Gamboa; Eliú Marimón Arrieta | HU-03 RF-53: actualizar() rechaza categoría inactiva (RN-A09)
 * 1.9     | 06/11/2026 | Julián David Valencia Gamboa; Eliú Marimón Arrieta | HU-03 RF-54: actualizar() solo corrige entre Disponible y Dañado (RN-A16b)
 * =====================================================================
 */
package co.nexaservicios.nexaactivos.servicio;

import co.nexaservicios.nexaactivos.modelo.catalogos.Categoria;
import co.nexaservicios.nexaactivos.modelo.enumeraciones.Estado_Activo;
import co.nexaservicios.nexaactivos.modelo.inventario.Activo;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ActivoServicio {

    // ----- Mensajes del catálogo E (M-01 a M-273), texto idéntico -----
    public static final String M_01 = "Activo registrado correctamente.";
    public static final String M_02 = "El modelo es obligatorio.";
    public static final String M_03 = "El modelo no puede superar 50 caracteres.";
    public static final String M_04 = "El número de serie es obligatorio.";
    public static final String M_05 = "El número de serie no puede superar 20 caracteres.";
    public static final String M_06 = "El número de serie ya está registrado.";
    public static final String M_07 = "La categoría es obligatoria.";
    public static final String M_08 = "La categoría seleccionada está inactiva.";
    public static final String M_09 = "La categoría seleccionada no existe.";
    public static final String M_10 = "La marca es obligatoria.";
    public static final String M_11 = "La marca no puede superar 50 caracteres.";
    public static final String M_12 = "La placa de inventario es obligatoria.";
    public static final String M_13 = "La placa de inventario no puede superar 11 caracteres.";
    public static final String M_14 = "La placa de inventario ya está registrada.";
    public static final String M_15 = "La ubicación no puede superar 100 caracteres.";
    public static final String M_16 = "No hay activos registrados.";
    public static final String M_17 = "No se encontró ningún activo con esa placa de inventario.";
    public static final String M_18 = "No se encontró ningún activo con ese identificador.";
    public static final String M_19 = "No se encontró ningún activo con ese número de serie.";
    public static final String M_20 = "Activo actualizado correctamente.";
    public static final String M_21 = "El activo no existe.";
    public static final String M_22 = "El estado Asignado solo se asigna al entregar el equipo.";
    public static final String M_23 = "El estado Baja solo se asigna dando de baja el activo.";
    public static final String M_24 = "El estado no es válido.";
    public static final String M_26 = "Un activo asignado no puede cambiar de estado hasta cerrar su asignación.";

    private final Activo modeloActivo = new Activo();
    private final CategoriaServicio categoriaServicio;

    public ActivoServicio(CategoriaServicio categoriaServicio) {
        this.categoriaServicio = categoriaServicio;
    }

    /**
     * crear(a : Activo) · HU-01 · CU-01 (Tabla 8 de 3.7, mensaje 3).
     * El Estado nace Disponible: lo fija Activo.crear() (Diccionario v7; RF-01).
     */
    public void crear(Activo a) {
        // Flujo 3a · restricción del diccionario (NOT NULL); RF-01
        if (a.getMarca() == null || a.getMarca().isBlank()) throw new IllegalArgumentException(M_10);
        if (a.getModelo() == null || a.getModelo().isBlank()) throw new IllegalArgumentException(M_02);
        if (a.getNumeroSerie() == null || a.getNumeroSerie().isBlank()) throw new IllegalArgumentException(M_04);
        if (a.getPlacaInventario() == null || a.getPlacaInventario().isBlank()) throw new IllegalArgumentException(M_12);
        if (a.getIdCategoria() == null) throw new IllegalArgumentException(M_07);
        // Flujo 4a · restricción del diccionario (longitud VARCHAR); RF-01
        if (a.getMarca().length() > 50) throw new IllegalArgumentException(M_11);
        if (a.getModelo().length() > 50) throw new IllegalArgumentException(M_03);
        if (a.getNumeroSerie().length() > 20) throw new IllegalArgumentException(M_05);
        if (a.getPlacaInventario().length() > 11) throw new IllegalArgumentException(M_13);
        if (a.getUbicacion() != null && a.getUbicacion().length() > 100) throw new IllegalArgumentException(M_15);
        // Flujo 2a · restricción del diccionario (Ubicacion opcional): vacía se guarda como NULL; RF-01
        if (a.getUbicacion() != null && a.getUbicacion().isBlank()) a.setUbicacion(null);
        // Mensajes 5 y 6 · «include» CU-49 · flujo 5a · RN-A03, RN-A04; RF-02
        boolean serieRegistrada = modeloActivo.existeNumeroSerie(a.getNumeroSerie());
        boolean placaRegistrada = modeloActivo.existePlaca(a.getPlacaInventario());
        if (serieRegistrada) throw new IllegalArgumentException(M_06);
        if (placaRegistrada) throw new IllegalArgumentException(M_14);
        // Mensaje 7 · «include» CU-48 · flujo 6a
        Categoria c = categoriaServicio.buscarPorId(a.getIdCategoria());
        // Categoría inexistente · restricción del diccionario (FK); RF-01
        if (c == null) throw new IllegalArgumentException(M_09);
        // Categoría inactiva · RN-A09; RF-52
        if (!c.isActivo()) throw new IllegalArgumentException(M_08);
        // Mensaje 8 · paso 7 · RF-01
        modeloActivo.crear(a);
    }

    /** buscarPorId(idActivo : int) · HU-02 · CU-02 (no documentado). */
    public Activo buscarPorId(int idActivo) {
        Activo a = modeloActivo.buscarPorId(idActivo);
        // Activo no encontrado · sin RN; RF-03 (HU-02 CA-4)
        if (a == null) throw new IllegalArgumentException(M_18);
        return a;
    }

    /** buscarPorNumeroSerie(numeroSerie : String) · HU-02 · CU-02 (no documentado). */
    public Activo buscarPorNumeroSerie(String numeroSerie) {
        Activo a = modeloActivo.buscarPorNumeroSerie(numeroSerie);
        // Activo no encontrado · sin RN; RF-03 (HU-02 CA-4)
        if (a == null) throw new IllegalArgumentException(M_19);
        return a;
    }

    /** buscarPorPlaca(placa : String) · HU-02 · CU-02 (no documentado). */
    public Activo buscarPorPlaca(String placa) {
        Activo a = modeloActivo.buscarPorPlaca(placa);
        // Activo no encontrado · sin RN; RF-03 (HU-02 CA-4)
        if (a == null) throw new IllegalArgumentException(M_17);
        return a;
    }

    /**
     * listarInventario() · HU-02 · CU-02 (no documentado). Lista vacía: la Vista
     * muestra M-16 (informativo; sin RN; RF-56).
     */
    public List<Activo> listarInventario() {
        // Todos los estados, por placa de menor a mayor · sin RN; RF-56
        return modeloActivo.listarInventario();
    }

    /**
     * actualizar(a : Activo) · HU-03 · CU-03 (no documentado). ID_Activo es
     * {PK, readOnly}: identifica el activo y no se modifica (M-25 sin camino).
     */
    public void actualizar(Activo a) {
        // Activo inexistente · sin RN; RF-04 (HU-03 CA-7)
        Activo actual = a.getIdActivo() == null ? null : modeloActivo.buscarPorId(a.getIdActivo());
        if (actual == null) throw new IllegalArgumentException(M_21);
        // Obligatorios · restricción del diccionario (NOT NULL); RF-04
        if (a.getMarca() == null || a.getMarca().isBlank()) throw new IllegalArgumentException(M_10);
        if (a.getModelo() == null || a.getModelo().isBlank()) throw new IllegalArgumentException(M_02);
        if (a.getNumeroSerie() == null || a.getNumeroSerie().isBlank()) throw new IllegalArgumentException(M_04);
        if (a.getPlacaInventario() == null || a.getPlacaInventario().isBlank()) throw new IllegalArgumentException(M_12);
        if (a.getIdCategoria() == null) throw new IllegalArgumentException(M_07);
        // Longitudes · restricción del diccionario (longitud VARCHAR); RF-04
        if (a.getMarca().length() > 50) throw new IllegalArgumentException(M_11);
        if (a.getModelo().length() > 50) throw new IllegalArgumentException(M_03);
        if (a.getNumeroSerie().length() > 20) throw new IllegalArgumentException(M_05);
        if (a.getPlacaInventario().length() > 11) throw new IllegalArgumentException(M_13);
        if (a.getUbicacion() != null && a.getUbicacion().length() > 100) throw new IllegalArgumentException(M_15);
        // Estado vacío o fuera del ENUM · restricción del diccionario (ENUM Estado_Activo); RF-04
        if (a.getEstado() == null) throw new IllegalArgumentException(M_24);
        // Ubicacion opcional · restricción del diccionario: vacía se guarda como NULL; RF-04
        if (a.getUbicacion() != null && a.getUbicacion().isBlank()) a.setUbicacion(null);
        // Unicidad sin contar al propio activo · RN-A03, RN-A04; RF-51 (HU-03 CA-3)
        if (!a.getNumeroSerie().equalsIgnoreCase(actual.getNumeroSerie())
                && modeloActivo.existeNumeroSerie(a.getNumeroSerie())) throw new IllegalArgumentException(M_06);
        if (!a.getPlacaInventario().equalsIgnoreCase(actual.getPlacaInventario())
                && modeloActivo.existePlaca(a.getPlacaInventario())) throw new IllegalArgumentException(M_14);
        Categoria c = categoriaServicio.buscarPorId(a.getIdCategoria());
        // Categoría inexistente · restricción del diccionario (FK); RF-04
        if (c == null) throw new IllegalArgumentException(M_09);
        // Categoría inactiva · RN-A09; RF-53 (HU-03 CA-4)
        if (!c.isActivo()) throw new IllegalArgumentException(M_08);
        if (a.getEstado() != actual.getEstado()) {
            // Asignado solo al entregar y Baja solo al dar de baja · RN-A16b; RF-54 (HU-03 CA-5)
            if (a.getEstado() == Estado_Activo.Asignado) throw new IllegalArgumentException(M_22);
            if (a.getEstado() == Estado_Activo.Baja) throw new IllegalArgumentException(M_23);
            // La corrección manual solo es entre Disponible y Dañado · RN-A16b; RF-54
            if (actual.getEstado() == Estado_Activo.Asignado) throw new IllegalArgumentException(M_26);
        }
        modeloActivo.actualizar(a);
    }
}
