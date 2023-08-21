package chapter03.fig03_05y06;

// Fig. 3.5: Cuenta.java

// Clase Cuenta con un constructor que inicializa el nombre.

public class Cuenta {

    // atributos (características)
    private String nombre; // variable de instancia

    // constructor
    // el constructor inicializa la variable de instancia "nombre" con el parámetro "nombre"
    public Cuenta(String nombre) { // el nombre del constructor es el nombre de la clase
        this.nombre = nombre;
    }

    // métodos/funciones (comportamientos)
    // método para establecer el nombre
    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    // método para recuperar el nombre
    public String obtenerNombre() {
        return this.nombre;
    }
}
