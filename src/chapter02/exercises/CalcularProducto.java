package chapter02.exercises;

/*
Exercise0206
Ejercicio 6:
Utilice las instrucciones que escribió en el ejercicio 2.5 para escribir un programa completo que calcule e imprima el producto de tres enteros.
*/

import java.util.Scanner;

public class CalcularProducto {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x;
        int y;
        int z;
        int resultado;

        System.out.print("Escriba el primer numero entero: ");
        x = input.nextInt();

        System.out.print("Escriba el segundo numero entero: ");
        y = input.nextInt();

        System.out.print("Escriba el tercer numero entero: ");
        z = input.nextInt();

        resultado = x * y * z;

        System.out.printf("El resultado es %d%n", resultado);
    }
}
