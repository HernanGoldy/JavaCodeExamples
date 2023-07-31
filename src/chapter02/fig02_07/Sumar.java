package chapter02.fig02_07;

// Programa que recibe dos números y muestra la suma.

import java.util.Scanner; // el programa usa la clase Scanner

public class Sumar {

    // el método main empieza la ejecución de la aplicación en Java
    public static void main(String[] args) {

        // se crea el objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner input = new Scanner(System.in);

        int number1; // primer número a sumar
        int number2; // segundo número a sumar
        int suma; // suma de number1 y number2

        System.out.print("Escriba el primer numero entero: "); // indicador
        number1 = input.nextInt(); // lee el primer número ingresado por el usuario

        System.out.print("Escriba el segundo numero entero: "); // indicador
        number2 = input.nextInt(); // lee el segundo ingresado por el usuario

        suma = number1 + number2; // suma los números, después almacena el total en suma

        System.out.printf("La suma es %d%n", suma); // muestra la suma
    } // fin del método main
} // fin de la clase Sumar

/*
❌ ERROR DE COMPILACIÓN:
 Mensaje: “cannot find symbol”
 Significa que falta declarar (o importar) una librería.
*/
