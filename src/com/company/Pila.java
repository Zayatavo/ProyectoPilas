package com.company;

/**
 * Created by Chovibys on 9/11/2017.
 */
public class Pila {

        // Puntero que indica el inicio de la pila o tambienn conocida como el tope de la pila
        private Nodo inicio;
        // Variable para registrar el tamaño de la pila.
        private int tamaño;



        /**
         * Constructor por defecto.
         */
        public void Pila(){
            inicio = null;
            tamaño = 0;
        }



        /**
         * Consulta si la pila esta vacia.
         * @return true si el primer nodo (inicio), no apunta a otro nodo.
         */
        public boolean esVacia(){
            return inicio == null;
        }
}
