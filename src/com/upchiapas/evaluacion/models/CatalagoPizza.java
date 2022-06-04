package com.upchiapas.evaluacion.models;

public class CatalagoPizza {
    //Asignar nombre y valor a las pizzas
    Pizza p1 = new Pizza("Extra chesse",170);
    Pizza p2 = new Pizza("Peperoni",150);
    Pizza p3 = new Pizza("Hawaiana",180);
    Pizza[] pizzas = {p1,p2,p3};


    public CatalagoPizza(){

    }

    public Pizza sendPizza(byte i){
        return pizzas[i];
    }
}
