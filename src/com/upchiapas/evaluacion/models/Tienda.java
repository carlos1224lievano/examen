package com.upchiapas.evaluacion.models;

public class Tienda {
    Pedido orden;
    byte opcion;
    String nombre;
    Cliente cliente;

    public Tienda(byte opcion, String nombre) {

        this.opcion = opcion;
        this.nombre = nombre;
    }
    public Pedido SendPedido(){
        return orden = new Pedido(cliente = new Cliente(nombre),opcion);
    }
}
