package chapter03.fig03_08y09;

// Fig. 3.9: PruebaCuenta.java

/*
Entrada y salida de números de punto flotante con objetos Cuenta.
 */

import java.util.Scanner;

public class PruebaCuenta {

    public static void main(String[] args) {

        Cuenta cuenta1 = new Cuenta("Jane Green", 50.00);
        Cuenta cuenta2 = new Cuenta("John Doe", -7.53);

        // muestra el saldo inicial de cada objeto
        System.out.printf("Saldo de %s: $%.2f%n",
                cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
        System.out.printf("Saldo de %s: $%.2f%n",
                cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());

        // crea un objeto de la clase Scanner para obtener la "entrada" de la ventana de comandos
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba el monto a depositar para la cuenta1: "); // indicador
        double montoDeposito = entrada.nextDouble(); // obtiene la entrada del usuario

        System.out.printf("%nsumando %.2f al saldo de cuenta1%n%n", montoDeposito);
        cuenta1.depositar(montoDeposito); // suma al saldo de cuenta1

        // muestra los saldos
        System.out.printf("Saldo de %s: $%.2f%n",
                cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
        System.out.printf("Saldo de %s: $%.2f%n",
                cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());


        System.out.print("Escriba el monto a depositar para la cuenta2: "); // indicador
        montoDeposito = entrada.nextDouble(); // obtiene la entrada del usuario

        System.out.printf("%nsumando %.2f al saldo de cuenta2%n%n", montoDeposito);
        cuenta2.depositar(montoDeposito); // suma al saldo de cuenta2

        // muestra los saldos
        System.out.printf("Saldo de %s: $%.2f%n",
                cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
        System.out.printf("Saldo de %s: $%.2f%n",
                cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());
    }
}
