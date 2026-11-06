/*
 * =====================================================================
 * NexaActivos - Nexa Servicios S.A.S. · Ingeniería de Software II
 * Uniremington 2026-02 · Docente: Gloria Amparo Lora Patiño
 * Archivo : src/main/java/co/nexaservicios/nexaactivos/servicio/CategoriaServicio.java
 * Capa    : Servicio
 * Servicio de la clase Categoria (Tabla 4, fila 14). Operaciones públicas de
 *           la Tabla 5 del DDA: crear(c), buscarPorId(idCategoria),
 *           listarActivas(), actualizar(c), inactivar(idCategoria).
 *           Implementada en el corte: buscarPorId(idCategoria : int).
 *           Las demás quedan como esqueleto declarado (HU-41, HU-43, HU-44).
 * HU      : HU-41, HU-42, HU-43, HU-44
 * RF      : HU-41: RF-45, RF-147; HU-42: RF-46, RF-148; HU-43: RF-47, RF-149, RF-150; HU-44: RF-48, RF-151, RF-152, RF-153, RF-154
 * Uso en el corte: ActivoServicio la invoca en CU-01 como «include» CU-48
 *           (Tabla 8 de 3.7, mensaje 7) y en la actualización de HU-03.
 *           Llamada entre Servicios: no repite la verificación de permiso
 *           (3.7.4, Observaciones); CategoriaControlador sigue como esqueleto,
 *           así que en el corte ningún actor llega aquí directamente.
 * CU      : CU-41 a CU-44 (no documentados); CU-48 (incluido)
 * MK      : sin pantalla
 * RN      : buscarPorId() no tiene guardas (RF-46: consulta activa o inactiva).
 *           RN-A09 (categoría inactiva) la valida ActivoServicio.
 * CRF     : CRF-003 · Línea base: LB-1
 * Fuentes : DDA 3.6 v3_GenC (Tablas 4 y 5); 3.7 v3 (Tabla 8).
 * Estado  : corte vertical parcial. Propuesta del equipo, pendiente de validar.
 *
 * Versión | Fecha      | Autores | Cambio
 * 1.0     | 06/11/2026 | Julián David Valencia Gamboa; Eliú Marimón Arrieta | Esqueleto inicial (entrega 4.2)
 * 1.1     | 06/11/2026 | Julián David Valencia Gamboa; Eliú Marimón Arrieta | HU-01 RF-01: buscarPorId() para el «include» CU-48
 * =====================================================================
 */
package co.nexaservicios.nexaactivos.servicio;

import co.nexaservicios.nexaactivos.modelo.catalogos.Categoria;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServicio {

    private final Categoria modeloCategoria = new Categoria();

    /** buscarPorId(idCategoria : int) · HU-42, RF-46. Devuelve null si no existe. */
    public Categoria buscarPorId(int idCategoria) {
        return modeloCategoria.buscarPorId(idCategoria);
    }
}
