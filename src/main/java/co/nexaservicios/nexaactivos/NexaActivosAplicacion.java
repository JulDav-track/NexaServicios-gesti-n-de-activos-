/*
 * =====================================================================
 * NexaActivos - Nexa Servicios S.A.S. · Ingeniería de Software II
 * Uniremington 2026-02 · Docente: Gloria Amparo Lora Patiño
 * Archivo : src/main/java/co/nexaservicios/nexaactivos/NexaActivosAplicacion.java
 * Capa    : arranque de Spring Boot (no es Modelo, Vista, Controlador ni
 *           Servicio). Diferencia declarada D-09 con la Tabla 6 del DDA
 *           3.6 v3_GenC (ver README). No contiene lógica ni RN.
 * HU/RF   : no aplica (soporte del corte vertical de la sección 4.3)
 * CRF     : CRF-003 · Línea base: LB-1
 * Estado  : propuesta del equipo, pendiente de validar.
 *
 * Versión | Fecha      | Autores | Cambio
 * 1.0     | 06/11/2026 | Julián David Valencia Gamboa; Eliú Marimón Arrieta | Inicial (corte vertical 4.3, base técnica)
 * =====================================================================
 */
package co.nexaservicios.nexaactivos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NexaActivosAplicacion {

    public static void main(String[] args) {
        SpringApplication.run(NexaActivosAplicacion.class, args);
    }
}
