package chapter03.fig03_01y02;

// Fig. 3.2: PruebaCuenta.java

// La clase controladora es la que contiene el método main.
// Creamos y manipulamos el objeto Cuenta.

import java.util.Scanner;

public class PruebaCuenta {

    public static void main(String[] args) {

        // creamos un objeto de la clase Scanner y asignamos a la variable input una referencia de ese objeto Scanner
        Scanner input = new Scanner(System.in);

        // creamos un objeto de la clase Cuenta y asignamos a la variable miCuenta una referencia de ese objeto Cuenta
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
