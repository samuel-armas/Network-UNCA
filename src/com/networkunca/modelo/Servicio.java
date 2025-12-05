package com.networkunca.modelo;

/**
 * Representa un servicio ofrecido dentro de una ubicación (Ej. Escolar,
 * Enfermería).
 */
public class Servicio {
    private String nombre;
    private String horarioAtencion;
    private Ubicacion ubicacion;

    public Servicio(String nombre, String horario, Ubicacion ubicacion) {
        this.nombre = nombre;
        this.horarioAtencion = horario;
        this.ubicacion = ubicacion;
    }
}