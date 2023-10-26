package chapter03.fig03_13;

// Fig. 3.13: DialogoNombre.java
// Entrada básica con un cuadro de diálogo

import javax.swing.*;

public class DialogoNombre {

    public static void main(String[] args) {

        // pide al usuario que escriba su nombre
        String nombre = JOptionPane.showInputDialog("¿Cual es su nombre?");

        // crea el mensaje
        String mensaje = String.format("¡Bienvenido %s, a la progrmación en Java!", nombre);

        // muestra el mensaje
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
