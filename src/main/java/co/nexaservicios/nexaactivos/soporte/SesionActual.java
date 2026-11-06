/*
 * =====================================================================
 * NexaActivos - Nexa Servicios S.A.S. · Ingeniería de Software II
 * Uniremington 2026-02 · Docente: Gloria Amparo Lora Patiño
 * Archivo : src/main/java/co/nexaservicios/nexaactivos/soporte/SesionActual.java
 * Capa    : soporte técnico de la sesión (no es una clase del diagrama v6
 *           con CRF-003). Diferencia declarada D-11 con la Tabla 6 del DDA
 *           3.6 v3_GenC (ver README).
 * Qué hace: guarda, por sesión HTTP, el identificador y el rol del usuario
 *           con sesión iniciada. En 3.7 (introducción) el rol y el
 *           identificador del usuario en sesión llegan con la petición
 *           (RNF-02; propuesta del equipo). Los servicios los leen aquí para
 *           RolPermisoServicio.consultarPermisos(rol) (RF-166) y para el
 *           ID_Usuario de AuditoriaServicio.registrar() (RF-164).
 * Sesión de prueba (P-62): las contraseñas de prueba son «SIN_DEFINIR_P-62»
 *           y nadie puede iniciar sesión, porque el mecanismo de cifrado de
 *           Usuario.iniciarSesion() (HU-36, RF-40) no está definido. Mientras
 *           P-62 siga abierta, si nexa.sesion-prueba.habilitada=true, cada
 *           sesión nueva toma el usuario y el rol de application.properties
 *           (variables NEXA_SESION_ID_USUARIO y NEXA_SESION_ROL). El rol debe
 *           ser el que ese usuario tiene en db/datos_prueba.sql; esta clase
 *           no lo comprueba. Sin sesión de prueba, idUsuario y rol quedan
 *           vacíos y toda operación se rechaza (RNF-02, RF-166). No se usa
 *           ningún método fuera de los 76 del diagrama.
 * HU/RF   : no aplica como operación; soporta RF-164 (HU-04) y RF-166
 *           (transversal, origen HU-38).
 * CRF     : CRF-003 · Línea base: LB-1
 * Estado  : propuesta del equipo, pendiente de validar (P-62, P-70, P-105).
 *
 * Versión | Fecha      | Autores | Cambio
 * 1.0     | 06/11/2026 | Julián David Valencia Gamboa; Eliú Marimón Arrieta | Inicial (corte vertical 4.3, base técnica)
 * =====================================================================
 */
package co.nexaservicios.nexaactivos.soporte;

import co.nexaservicios.nexaactivos.modelo.enumeraciones.Nombre_Rol;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class SesionActual {

    private final Integer idUsuario;
    private final Nombre_Rol rol;

    public SesionActual(@Value("${nexa.sesion-prueba.habilitada:false}") boolean habilitada,
                        @Value("${nexa.sesion-prueba.id-usuario:}") String idUsuarioPrueba,
                        @Value("${nexa.sesion-prueba.rol:}") String rolPrueba) {
        if (habilitada && !idUsuarioPrueba.isBlank() && !rolPrueba.isBlank()) {
            this.idUsuario = Integer.valueOf(idUsuarioPrueba.trim());
            // Nombre_Rol: la constante Java usa _ donde el valor de la base tiene espacio (D-16)
            this.rol = Nombre_Rol.valueOf(rolPrueba.trim().replace(' ', '_'));
        } else {
            this.idUsuario = null;
            this.rol = null;
        }
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public Nombre_Rol getRol() {
        return rol;
    }
}
