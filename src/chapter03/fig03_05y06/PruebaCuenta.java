package chapter03.fig03_05y06;

// Fig. 3.6: PruebaCuenta.java

/*
Uso del constructor de Cuenta para inicializar la variable de instancia "nombre" al momento de crear el objeto Cuenta.
 */

public class PruebaCuenta {

    public static void main(String[] args) {

        // crear dos objetos Cuenta
        Cuenta cuenta1 = new Cuenta("Jane Green");
        Cuenta cuenta2 = new Cuenta("John Doe");

        // muestra el valor inicial de "nombre" para cada Cuenta
        System.out.printf("El nombre de cuenta1 es: %s%n", cuenta1.obtenerNombre());
        System.out.printf("El nombre de cuenta2 es: %s%n", cuenta2.obtenerNombre());
    }
}
