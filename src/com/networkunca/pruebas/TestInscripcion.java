package com.networkunca.pruebas;

import com.networkunca.modelo.Actividad;
import com.networkunca.controlador.InscripcionActividadController;

/**
 * Clase de Pruebas Unitarias (Simulando JUnit).
 * Objetivo: Verificar la HU-ALUMNO-4 (Inscripción).
 */
public class TestInscripcion {

    public static void main(String[] args) {
        System.out.println("=== INICIANDO PRUEBAS UNITARIAS: MÓDULO INSCRIPCIÓN ===");

        // Ejecutar casos de prueba
        pruebaInscripcionExitosa();
        pruebaCupoLleno();

        System.out.println("=== FIN DE LAS PRUEBAS ===");
    }

    // CASO 1: Verificar que se inscribe cuando hay lugar
    public static void pruebaInscripcionExitosa() {
        System.out.print("TEST 1: Inscripción con cupo disponible... ");

        // 1. Preparación (Arrange)
        // Creamos una actividad con cupo de 10 personas
        Actividad tallerJava = new Actividad(1, "Taller Java", 10);
        InscripcionActividadController controlador = new InscripcionActividadController();

        // 2. Ejecución (Act)
        String resultado = controlador.inscribirAlumno(2021001, tallerJava);

        // 3. Verificación (Assert)
        if (resultado.contains("Éxito")) {
            System.out.println("✅ PASÓ");
        } else {
            System.out.println("❌ FALLÓ (Se esperaba éxito y dio: " + resultado + ")");
        }
    }

    // CASO 2: Verificar que RECHAZA cuando está lleno
    public static void pruebaCupoLleno() {
        System.out.print("TEST 2: Inscripción con cupo lleno... ");

        // 1. Preparación: Creamos actividad con cupo 0
        Actividad torneoFutbol = new Actividad(2, "Torneo Futbol", 0);
        InscripcionActividadController controlador = new InscripcionActividadController();

        // 2. Ejecución
        String resultado = controlador.inscribirAlumno(2021002, torneoFutbol);

        // 3. Verificación
        if (resultado.contains("Error") || resultado.contains("lleno")) {
            System.out.println("✅ PASÓ");
        } else {
            System.out.println("❌ FALLÓ (Se esperaba error y dio: " + resultado + ")");
        }
    }
}