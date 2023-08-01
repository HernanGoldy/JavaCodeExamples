package chapter02.fig02_15;

// Compara enteros utilizando instrucciones if, operadores relacionales.

import java.util.Scanner;

public class Comparacion {

    // el método main empieza la ejecución de la aplicación en Java
    public static void main(String[] args) {

        // se crea el objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner input = new Scanner(System.in);

        int number1; // primer número a comparar
        int number2; // segundo número a comparar

        System.out.print("Escriba el primer numero entero a comparar: "); // indicador
        number1 = input.nextInt(); // lee el primer número ingresado por el usuario

        System.out.print("Escriba el segundo numero entero a comparar: "); // indicador
        number2 = input.nextInt(); // lee el segundo número ingresado por el usuario

        if (number1 == number2)
            System.out.printf("%d == %d%n", number1, number2);

        if (number1 != number2)
            System.out.printf("%d != %d%n", number1, number2);

        if (number1 < number2)
            System.out.printf("%d < %d%n", number1, number2);

        if (number1 > number2)
            System.out.printf("%d > %d%n", number1, number2);

        if (number1 <= number2)
            System.out.printf("%d <= %d%n", number1, number2);

        if (number1 >= number2)
            System.out.printf("%d >= %d%n", number1, number2);
    } // fin del método main
} // fin de la clase Comparacion
