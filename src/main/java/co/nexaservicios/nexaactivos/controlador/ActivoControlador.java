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
 * =====================================================================
 */
package co.nexaservicios.nexaactivos.controlador;

import co.nexaservicios.nexaactivos.modelo.inventario.Activo;
import co.nexaservicios.nexaactivos.servicio.ActivoServicio;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
        return "mk01";
    }
}
