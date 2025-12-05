package com.networkunca.controlador;

import com.networkunca.modelo.Ubicacion;

/**
 * Gestiona la navegación y búsqueda en el mapa del campus.
 * HU-ALUMNO-3
 */
public class MapaInteractivoController {

    /**
     * Busca un edificio o lugar por nombre clave.
     * 
     * @param query Texto de búsqueda (ej. "Biblioteca").
     * @return La ubicación encontrada o null.
     */
    public Ubicacion buscarEdificio(String query) {
        // Simulación de búsqueda en base de datos
        if (query.equalsIgnoreCase("Biblioteca")) {
            return new Ubicacion("BIB-01", "Biblioteca Central", "18.001, -96.001", "Edificio de consulta y estudio");
        }
        return null;
    }

    /**
     * Despliega la información completa de un punto del mapa.
     */
    public String obtenerDetallesSitio(Ubicacion sitio) {
        if (sitio != null) {
            return sitio.getDetalles();
        }
        return "Sitio no encontrado.";
    }
}