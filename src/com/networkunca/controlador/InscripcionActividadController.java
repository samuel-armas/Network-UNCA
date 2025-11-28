package com.networkunca.controlador;
import com.networkunca.modelo.Actividad;

public class InscripcionActividadController {
    // HU-ALUMNO-4: Inscripción a Actividades
    public String inscribirAlumno(int idAlumno, Actividad actividad) {
        if (actividad.hayCupo()) {
            return "Éxito: Inscripción realizada.";
        } else {
            return "Error: Cupo lleno.";
        }
    }
}