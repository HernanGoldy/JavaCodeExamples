package chapter03.fig03_01y02;

// La clase controladora es la que contiene el método main.
// Creamos y manipulamos el objeto Cuenta.

import java.util.Scanner;

public class PruebaCuenta {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // creamos el objeto Cuenta y lo asignamos a miCuenta
        Cuenta miCuenta = new Cuenta();

        // mostramos el valor inicial del nombre (null)
        System.out.printf("El nombre inicial es: %s%n%n", miCuenta.obtenerNombre());

        // pedimos y leemos el nombre
        System.out.println("Introduzca el nombre: ");
        String elNombre = input.nextLine(); // lee la línea de texto
        miCuenta.establecerNombre(elNombre); // coloca elNombre en miCuenta
        System.out.println(); // imprime una línea en blanco

        // mostramos el nombre almacenado en el objeto miCuenta
        System.out.printf("El nombre en el objeto miCuenta es: %n%s%n", miCuenta.obtenerNombre());
    }
}
