package com.upchiapas.evaluacion.models;

public class Pizza {
    private final String nombre;
    private final int precio;
    public  Pizza(String nombresA, int preciosA){
        this.nombre = nombresA;
        this.precio = preciosA;
    }
    public String getNombre() {
        return nombre;
    }
    public int getPrecio() {
        return precio;
    }
}


