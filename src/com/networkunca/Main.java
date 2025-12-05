package com.networkunca;

import com.networkunca.modelo.Actividad;
import com.networkunca.modelo.Ubicacion;
import com.networkunca.controlador.InscripcionActividadController;
import com.networkunca.controlador.MapaInteractivoController;

/**
 * CLASE PRINCIPAL - INTEGRACIÓN FINAL (Semana 4)
 * Simula la interacción del usuario con el sistema completo.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== BIENVENIDO A NETWORK UNCA (Versión Final) ===");

        // --- MÓDULO 1: MAPA INTERACTIVO (Jesús/Samuel) ---
        System.out.println("\n[1] Iniciando Módulo de Mapa...");
        MapaInteractivoController mapaController = new MapaInteractivoController();

        // Simulación: Alumno busca "Biblioteca"
        System.out.println("User Action: Buscar 'Biblioteca'");
        Ubicacion resultado = mapaController.buscarEdificio("Biblioteca");

        if (resultado != null) {
            System.out.println("Sistema: " + mapaController.obtenerDetallesSitio(resultado));
        }

        // --- MÓDULO 2: INSCRIPCIÓN (Rogelio/Edwin) ---
        System.out.println("\n[2] Iniciando Módulo de Inscripción...");
        InscripcionActividadController inscripcionController = new InscripcionActividadController();
        Actividad taller = new Actividad(101, "Taller de Gitflow", 30); // Cupo de 30

        // Simulación: Alumno se inscribe
        System.out.println("User Action: Inscribirse al 'Taller de Gitflow'");
        String respuesta = inscripcionController.inscribirAlumno(2021050, taller);
        System.out.println("Sistema: " + respuesta);

        System.out.println("\n=== INTEGRACIÓN COMPLETADA EXITOSAMENTE ===");
    }
}