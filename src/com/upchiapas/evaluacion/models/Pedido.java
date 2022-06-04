package com.upchiapas.evaluacion.models;

public class Pedido {
    Cliente cliente;
    CatalagoPizza pizas = new CatalagoPizza();
    byte opcion;
    Pizza pizza1;

    public Pedido(Cliente cliente, byte opcion) {
        this.cliente = cliente;
        this.opcion = opcion;
    }

    public Pizza SendPizza(){
        Pizza pizza1 = pizas.sendPizza((byte) ((byte)opcion));
        return pizza1;
    }
    public Cliente getCliente(){
        return cliente;
    }
}

