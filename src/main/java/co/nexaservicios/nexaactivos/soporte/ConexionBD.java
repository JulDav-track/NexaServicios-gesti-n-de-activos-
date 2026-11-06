/*
 * =====================================================================
 * NexaActivos - Nexa Servicios S.A.S. · Ingeniería de Software II
 * Uniremington 2026-02 · Docente: Gloria Amparo Lora Patiño
 * Archivo : src/main/java/co/nexaservicios/nexaactivos/soporte/ConexionBD.java
 * Capa    : soporte técnico de la conexión (no es una clase del diagrama
 *           v6 con CRF-003 ni una capa de repositorio). Diferencia
 *           declarada D-10 con la Tabla 6 del DDA 3.6 v3_GenC (ver README).
 * Qué hace: entrega a los métodos de las clases del modelo el JdbcTemplate
 *           de Spring, porque el DDA deja el acceso a datos en esos métodos
 *           (Tabla 1, fila Modelo; supuesto 2: sin repositorio). Al arrancar
 *           comprueba que la sesión de MariaDB tenga STRICT_TRANS_TABLES
 *           (el DDL v1.2 lo exige) y, si no lo tiene, detiene la aplicación.
 *           No valida RN, no tiene SQL de negocio y no es un repositorio.
 * HU/RF   : no aplica (soporte del corte vertical de la sección 4.3)
 * CRF     : CRF-003 · Línea base: LB-1
 * Estado  : propuesta del equipo, pendiente de validar.
 *
 * Versión | Fecha      | Autores | Cambio
 * 1.0     | 06/11/2026 | Julián David Valencia Gamboa; Eliú Marimón Arrieta | Inicial (corte vertical 4.3, base técnica)
 * =====================================================================
 */
package co.nexaservicios.nexaactivos.soporte;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class ConexionBD {

    private static final Logger LOG = LoggerFactory.getLogger(ConexionBD.class);

    private static JdbcTemplate jdbc;

    public ConexionBD(JdbcTemplate plantilla) {
        String modo = plantilla.queryForObject("SELECT @@SESSION.sql_mode", String.class);
        LOG.info("NexaActivos: sql_mode de la sesión de MariaDB = {}", modo);
        if (modo == null || !modo.contains("STRICT_TRANS_TABLES")) {
            throw new IllegalStateException(
                "La sesión de MariaDB no tiene STRICT_TRANS_TABLES; el DDL v1.2 lo exige. "
                + "Revise spring.datasource.hikari.connection-init-sql en application.properties.");
        }
        jdbc = plantilla;
    }

    public static JdbcTemplate jdbc() {
        return jdbc;
    }
}
