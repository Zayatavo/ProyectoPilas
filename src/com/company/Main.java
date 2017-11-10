package com.company;
import java.util.Scanner;//importamos el Scanner;

public class Main {

    public static void main(String[] args) {
        Pila pila = new Pila();// creacion de la pila.

        Scanner sc = new Scanner(System.in);//inicializamos la variable Scanner;

        boolean continuar = true;
        int opcion = 0;

        // creamos nuestro menú
        System.out.println(" ");
        System.out.println("Elija una opción");
        System.out.println("( 1 ) --> Insertar");
        System.out.println("( 2 ) --> Mostrar");
        System.out.println("( 3 ) --> Buscar");
        System.out.println("( 4 ) --> Eliminar");
        System.out.println("( 5 ) --> Tamaño");
        System.out.println("( 6 ) --> Máximo");
        System.out.println("( 7 ) --> Mínimo");
        System.out.println("( 8 ) --> Terminar");
        System.out.println(" ");

        try { //creamos la excepción correspondiente para solo abmitir valores numericos como respuesta a la opcion que el usuario elija.
            opcion = sc.nextInt();//almacenamos el valor proporcionado por el usuario en la variable opcion;
        } catch (Exception e) {// el catch manda un mensaje de error,lo cual hace que el usuario corrija lo que se ingresa en el programa.
            sc = new Scanner(System.in);// se inicializa nuevamente.
            System.out.println("No es una opción");

        }
    }
}

