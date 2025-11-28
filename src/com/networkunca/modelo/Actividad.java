package com.networkunca.modelo;

public class Actividad {
    private int id;
    private String nombre;
    private int cupoMaximo;
    private int inscritosActuales;

    public Actividad(int id, String nombre, int cupoMaximo) {
        this.id = id;
        this.nombre = nombre;
        this.cupoMaximo = cupoMaximo;
        this.inscritosActuales = 0;
    }

    public boolean hayCupo() {
        return inscritosActuales < cupoMaximo;
    }
}