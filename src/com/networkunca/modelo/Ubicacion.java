package com.networkunca.modelo;

/**
 * Representa un punto físico en el campus (Edificio, Cancha, Cafetería).
 */
public class Ubicacion {
    private String id;
    private String nombre;
    private String coordenadas; // Formato "Lat, Long"
    private String descripcion;

    public Ubicacion(String id, String nombre, String coordenadas, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.coordenadas = coordenadas;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDetalles() {
        return nombre + ": " + descripcion + " (" + coordenadas + ")";
    }
}