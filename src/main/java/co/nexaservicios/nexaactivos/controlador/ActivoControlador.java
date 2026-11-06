/*
 * =====================================================================
 * NexaActivos - Nexa Servicios S.A.S. · Ingeniería de Software II
 * Uniremington 2026-02 · Docente: Gloria Amparo Lora Patiño
 * Archivo : src/main/java/co/nexaservicios/nexaactivos/controlador/ActivoControlador.java
 * Capa    : Controlador
 * Controlador de la clase Activo (Tabla 4, fila 1): recibe la acción de la
 *           Vista, invoca a ActivoServicio con la operación del mismo nombre
 *           y devuelve el resultado a la pantalla. No valida RN ni accede a
 *           datos (DDA, Tabla 1). Atrapa el rechazo del Servicio y muestra
 *           su texto (M-xx o rechazo por rol).
 * Peticiones: cada operación tiene el nombre de la Tabla 5 del DDA. Cuando la
 *           pantalla necesita mostrarse antes de enviar (MK-02, MK-10, MK-11),
 *           el método GET lleva el mismo nombre con otros parámetros (D-17).
 *           crear()            GET  /activos/nuevo           -> MK-02
 *           crear(a)           POST /activos/nuevo           -> MK-02 (mensaje 2 de la Tabla 8)
 *           buscarPorId(), buscarPorNumeroSerie(), buscarPorPlaca()
 *                              GET  /activos/buscar/id|serie|placa -> MK-01
 *           listarInventario() GET  / y /activos             -> MK-01
 *           actualizar(id)     GET  /activos/{id}/editar     -> MK-10 (precarga con buscarPorId)
 *           actualizar(id, …)  POST /activos/{id}/editar     -> MK-10
 *           darDeBaja(id, …)   GET  /activos/{id}/baja       -> MK-11 (datos recibidos de MK-01 o MK-10)
 *           darDeBaja(id)      POST /activos/{id}/baja       -> MK-11
 * HU      : HU-01, HU-02, HU-03, HU-04
 * RF      : HU-01: RF-01, RF-02, RF-52; HU-02: RF-03, RF-56; HU-03: RF-04, RF-51, RF-53, RF-54, RF-55, RF-60; HU-04: RF-05, RF-57, RF-58, RF-59, RF-164
 * CU      : CU-01 (Tabla 8 de 3.7, mensajes 2 y respuesta); CU-02 a CU-04 (no documentados)
 * MK      : MK-01, MK-02, MK-10, MK-11
 * RN      : ninguna (el Controlador no valida RN).
 * CRF     : CRF-003 · Línea base: LB-1
 * Fuentes : DDA 3.6 v3_GenC (Tablas 1, 3, 4 y 5); 3.7 v3 (Tabla 8).
 * Estado  : corte vertical. Propuesta del equipo, pendiente de validar.
 *
 * Versión | Fecha      | Autores | Cambio
 * 1.0     | 06/11/2026 | Julián David Valencia Gamboa; Eliú Marimón Arrieta | Esqueleto inicial (entrega 4.2)
 * 1.1     | 06/11/2026 | Julián David Valencia Gamboa; Eliú Marimón Arrieta | HU-01 RF-01: crear() hacia MK-02
 * 1.2     | 06/11/2026 | Julián David Valencia Gamboa; Eliú Marimón Arrieta | HU-02 RF-03: búsquedas por clave hacia MK-01
 * 1.3     | 06/11/2026 | Julián David Valencia Gamboa; Eliú Marimón Arrieta | HU-02 RF-56: listarInventario() hacia MK-01
 * 1.4     | 06/11/2026 | Julián David Valencia Gamboa; Eliú Marimón Arrieta | HU-03 RF-04: actualizar() hacia MK-10
 * 1.5     | 06/11/2026 | Julián David Valencia Gamboa; Eliú Marimón Arrieta | HU-04 RF-05: darDeBaja() hacia MK-11
 * 1.6     | 06/11/2026 | Julián David Valencia Gamboa; Eliú Marimón Arrieta | HU-04 RF-59: aviso M-30 antes de confirmar y texto M-29 para desistir
 * =====================================================================
 */
package co.nexaservicios.nexaactivos.controlador;

import co.nexaservicios.nexaactivos.modelo.enumeraciones.Estado_Activo;
import co.nexaservicios.nexaactivos.modelo.inventario.Activo;
import co.nexaservicios.nexaactivos.servicio.ActivoServicio;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ActivoControlador {

    private final ActivoServicio activoServicio;

    public ActivoControlador(ActivoServicio activoServicio) {
        this.activoServicio = activoServicio;
    }

    /** MK-02 vacía (se abre desde MK-01, «+ Registrar activo»). */
    @GetMapping("/activos/nuevo")
    public String crear(Model modelo) {
        modelo.addAttribute("activo", new Activo());
        return "mk02";
    }

    /** crear(a) · HU-01 · CU-01, mensaje 2 (MK-02 -> ActivoControlador) y respuesta M-01. */
    @PostMapping("/activos/nuevo")
    public String crear(@ModelAttribute("activo") Activo a, Model modelo) {
        try {
            activoServicio.crear(a);
            modelo.addAttribute("mensajeExito", ActivoServicio.M_01);
            modelo.addAttribute("activo", new Activo());
        } catch (IllegalArgumentException | SecurityException e) {
            modelo.addAttribute("mensajeError", e.getMessage());
        }
        return "mk02";
    }

    /** buscarPorId(idActivo) · HU-02 (MK-01, «Buscar» por ID_Activo). Vacío = 0, que no existe (D1 del DDL). */
    @GetMapping("/activos/buscar/id")
    public String buscarPorId(@RequestParam(required = false) Integer idActivo, Model modelo) {
        try {
            modelo.addAttribute("encontrado", activoServicio.buscarPorId(idActivo == null ? 0 : idActivo));
        } catch (IllegalArgumentException | SecurityException e) {
            modelo.addAttribute("mensajeError", e.getMessage());
        }
        try {
            modelo.addAttribute("activos", activoServicio.listarInventario());
            modelo.addAttribute("m16", ActivoServicio.M_16);
        } catch (IllegalArgumentException | SecurityException e) {
            modelo.addAttribute("mensajeErrorLista", e.getMessage());
        }
        return "mk01";
    }

    /** buscarPorNumeroSerie(numeroSerie) · HU-02 (MK-01, «Buscar» por Numero_Serie). */
    @GetMapping("/activos/buscar/serie")
    public String buscarPorNumeroSerie(@RequestParam(defaultValue = "") String numeroSerie, Model modelo) {
        try {
            modelo.addAttribute("encontrado", activoServicio.buscarPorNumeroSerie(numeroSerie));
        } catch (IllegalArgumentException | SecurityException e) {
            modelo.addAttribute("mensajeError", e.getMessage());
        }
        try {
            modelo.addAttribute("activos", activoServicio.listarInventario());
            modelo.addAttribute("m16", ActivoServicio.M_16);
        } catch (IllegalArgumentException | SecurityException e) {
            modelo.addAttribute("mensajeErrorLista", e.getMessage());
        }
        return "mk01";
    }

    /** buscarPorPlaca(placa) · HU-02 (MK-01, «Buscar» por Placa_Inventario). */
    @GetMapping("/activos/buscar/placa")
    public String buscarPorPlaca(@RequestParam(defaultValue = "") String placa, Model modelo) {
        try {
            modelo.addAttribute("encontrado", activoServicio.buscarPorPlaca(placa));
        } catch (IllegalArgumentException | SecurityException e) {
            modelo.addAttribute("mensajeError", e.getMessage());
        }
        try {
            modelo.addAttribute("activos", activoServicio.listarInventario());
            modelo.addAttribute("m16", ActivoServicio.M_16);
        } catch (IllegalArgumentException | SecurityException e) {
            modelo.addAttribute("mensajeErrorLista", e.getMessage());
        }
        return "mk01";
    }

    /** listarInventario() · HU-02 (MK-01, tabla de 6 columnas ordenada por placa). */
    @GetMapping({"/", "/activos"})
    public String listarInventario(Model modelo) {
        try {
            modelo.addAttribute("activos", activoServicio.listarInventario());
            modelo.addAttribute("m16", ActivoServicio.M_16);
        } catch (IllegalArgumentException | SecurityException e) {
            modelo.addAttribute("mensajeErrorLista", e.getMessage());
        }
        return "mk01";
    }

    /** MK-10 precargada (se abre desde MK-01, «Editar»): consulta con buscarPorId (HU-02). */
    @GetMapping("/activos/{idActivo}/editar")
    public String actualizar(@PathVariable int idActivo, Model modelo) {
        try {
            modelo.addAttribute("activo", activoServicio.buscarPorId(idActivo));
        } catch (IllegalArgumentException | SecurityException e) {
            modelo.addAttribute("mensajeError", e.getMessage());
        }
        modelo.addAttribute("estados", Estado_Activo.values());
        return "mk10";
    }

    /**
     * actualizar(a) · HU-03 (MK-10, «Guardar cambios»). El Controlador solo arma el
     * objeto: ID_Activo viene de la ruta (readOnly) y el Estado se convierte sin
     * validar; un valor fuera del ENUM llega vacío y el Servicio responde M-24.
     */
    @PostMapping("/activos/{idActivo}/editar")
    public String actualizar(@PathVariable int idActivo,
                             @RequestParam(required = false) String marca,
                             @RequestParam(required = false) String modelo,
                             @RequestParam(required = false) String numeroSerie,
                             @RequestParam(required = false) String placaInventario,
                             @RequestParam(required = false) String ubicacion,
                             @RequestParam(required = false) Integer idCategoria,
                             @RequestParam(required = false) String estado,
                             Model vista) {
        Activo a = new Activo(idActivo);
        a.setMarca(marca);
        a.setModelo(modelo);
        a.setNumeroSerie(numeroSerie);
        a.setPlacaInventario(placaInventario);
        a.setUbicacion(ubicacion);
        a.setIdCategoria(idCategoria);
        for (Estado_Activo e : Estado_Activo.values()) {
            if (e.name().equals(estado)) a.setEstado(e);
        }
        try {
            activoServicio.actualizar(a);
            vista.addAttribute("mensajeExito", ActivoServicio.M_20);
        } catch (IllegalArgumentException | SecurityException e) {
            vista.addAttribute("mensajeError", e.getMessage());
        }
        vista.addAttribute("activo", a);
        vista.addAttribute("estados", Estado_Activo.values());
        return "mk10";
    }

    /**
     * MK-11 (aviso modal sobre MK-01 o MK-10). Muestra los datos recibidos de la
     * pantalla anterior, sin consultar el Servicio (mockups 2.5, Tabla 23).
     */
    @GetMapping("/activos/{idActivo}/baja")
    public String darDeBaja(@PathVariable int idActivo,
                            @RequestParam(defaultValue = "") String placa,
                            @RequestParam(defaultValue = "") String estado,
                            @RequestParam(defaultValue = "") String marca,
                            @RequestParam(defaultValue = "") String modelo,
                            Model vista) {
        vista.addAttribute("idActivo", idActivo);
        vista.addAttribute("placa", placa);
        vista.addAttribute("estado", estado);
        vista.addAttribute("marca", marca);
        vista.addAttribute("modelo", modelo);
        // Aviso de consecuencia M-30 con la placa y texto M-29 para desistir · RF-59
        vista.addAttribute("aviso", ActivoServicio.M_30.replace("<placa>", placa));
        vista.addAttribute("m29", ActivoServicio.M_29);
        return "mk11";
    }

    /** darDeBaja(idActivo) · HU-04 (MK-11, «Confirmar baja»). */
    @PostMapping("/activos/{idActivo}/baja")
    public String darDeBaja(@PathVariable int idActivo, Model vista) {
        try {
            activoServicio.darDeBaja(idActivo);
            vista.addAttribute("mensajeExito", ActivoServicio.M_28);
        } catch (IllegalArgumentException | SecurityException e) {
            vista.addAttribute("mensajeError", e.getMessage());
        }
        vista.addAttribute("idActivo", idActivo);
        vista.addAttribute("resultado", true);
        return "mk11";
    }
}
