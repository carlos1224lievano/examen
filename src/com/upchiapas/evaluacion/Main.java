package com.upchiapas.evaluacion;
//importaciones de clases
import com.upchiapas.evaluacion.models.Pedido;
import com.upchiapas.evaluacion.models.Pizza;
import com.upchiapas.evaluacion.models.Tienda;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opc;
        do {
            System.out.println("------------------");
            System.out.println("  pizzas del sur");
            System.out.println("_________________");
            System.out.println("| Que necesita  |");
            System.out.println("| 1] - ordenar  |");
            System.out.println("| 2] - salir    |");
            System.out.println("_________________");
            opc = teclado.nextInt();
            switch (opc) {
                case 1:
                    Ordenar();
                    break;
                case 2:
                    System.out.println("hasta Luego vuelva pronto");
                    break;
                default:
                    System.out.println("inetnta con los numeros del menu");
            }
        }while (opc !=2);

    }
    //Toma la orden del cliente
    public static void Ordenar(){
        String nombre;
        byte opcion;
        Pedido orden1;
        Pizza p1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese su nombre");
        nombre = teclado.nextLine();
        System.out.println("1] - Extra chesse");
        System.out.println("2] - Peperinni");
        System.out.println("3] - Hawaiana");
        opcion = teclado.nextByte();
        //Se crea un objeto
        Tienda tienda = new Tienda((byte) (opcion-1),nombre);
        //imprime en pantalla
        orden1 = tienda.SendPedido();
        p1 = orden1.SendPizza();
        System.out.println("---------------------------------------------");
        System.out.println("| Nombre del cliente: " + orden1.getCliente().getNombrecliente());
        System.out.println("| precio: " + p1.getPrecio());
        System.out.println("| nombre de la pizza: " + p1.getNombre());
        System.out.println("---------------------------------------------");

    }
}
