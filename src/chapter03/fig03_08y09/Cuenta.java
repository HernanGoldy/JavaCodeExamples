package chapter03.fig03_08y09;

// Fig. 3.8: Cuenta.java

/**
 * @apiNote La clase Cuenta contiene una variable de instancia String llamada "nombre", una variable de instancia
 * «double» llamada "saldo" y un constructor. Además, esta clase Cuenta contiene un método llamado "depositar" que
 * realiza la validación.
 */

public class Cuenta {

    // atributos (características)
    private String nombre; // variable de instancia
    private double saldo; // variable de instancia

    // constructor de Cuenta que recibe dos parámetros
    public Cuenta(String nombre, double saldoInicial) {

        this.nombre = nombre; // asigna "nombre" a la variable de instancia "nombre"

        /*
        validamos que el «saldo inicial» sea mayor que 0.0; caso contrario, la variable de instancia "saldo"
        mantiene su valor inicial predeterminado que es 0.0
         */
        if (saldoInicial > 0.0) {
            this.saldo = saldoInicial; // asigna "saldoInicial" a la variable de instancia "saldo"
        }
    }

    // métodos/funciones (comportamientos)
    // 1. método que deposita (suma) solo una cantidad válida al "saldoInicial"
    public void depositar(double montoDeposito) {

        if (montoDeposito > 0.0) { // si el montoDeposito es válido
            saldo += montoDeposito; // lo suma al "saldo"
        }
    }

    // 2. método que devuelve el saldo de la cuenta
    public double obtenerSaldo() {

        return saldo;
    }

    // 3. método que establece el nombre de la cuenta
    public void establecerNombre(String nombre) {

        this.nombre = nombre;
    }

    // 4. método que devuelve el nombre de la cuenta
    public String obtenerNombre() {

        return nombre; // devuelve el valor de "nombre" a quien lo invocó
    }
}
