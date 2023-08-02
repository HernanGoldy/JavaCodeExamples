package chapter03.fig03_01y02;

public class Cuenta {

    // atributos (características)
    private String nombre; // variable de instancia

    // métodos/funciones (comportamientos)
    // método para establecer el nombre en el objeto
    public void establecerNombre(String nombre) {

        this.nombre = nombre; // almacenar el nombre
    }

    // método para obtener el nombre del objeto
    public String obtenerNombre() {

        return nombre; // devuelve el valor de nombre a quién lo invocó
    }
}
