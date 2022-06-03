package com.upchiapas.taxis;
import models.Chofer;
import models.Taxis;

import java.util.Scanner;

public class Main {
    private static Chofer [] listaTaxis = new Chofer[5];
    private static Scanner teclado = new Scanner(System.in);
    public static void main(String[]args){
       byte opcion;

        do{
            System.out.println("Servicio Taxi");
            System.out.println("1. Alta de vehiculos");
            System.out.println("2. Alta de choferes");
            System.out.println("3. Asignar vehiculo a chofer");
            System.out.println("4. Pagos generados por el servicio");
            System.out.println("5. Impresion de lista de unidades");
            System.out.println("6. Impresion de ganancias");
            System.out.println("7. Salir");
            System.out.println("Selecione una opcion");
            opcion = teclado.nextByte();
            switch (opcion){
                case 1: addVehiculo();
                case 2: addchofer();
                case 3: Asignar();
                case 4: Pago();
                case 5: imprimirUnidades();
                case 6: imprimirGanancia();
            }

        }while (opcion <8);
    }

    public static void addchofer(){
        String nombre;
        short id;
        byte numeroTaxis;

        System.out.println("Ingrese el ID: ");
        id = teclado.nextShort();
        teclado.nextLine();
        System.out.println("Ingrese el nombre: ");
        nombre = teclado.nextLine();
        System.out.println("Vehiculo asignado: ");
        numeroTaxis = teclado.nextByte();

        Chofer chofer = new Chofer(numeroTaxis);
        chofer.setId(id);
        chofer.setnombre(nombre);
        System.out.println("El vehiculo del chofer: "+ chofer);
        byte indice = 0;
        while (listaTaxis[indice] != null)
            indice++;
        listaTaxis[indice]=chofer;


    }
    public static void addVehiculo(){}
    public static void Asignar(){}
    public static void  Pago(){}
    public static void imprimirUnidades(){}
    public static void imprimirGanancia(){}
}
