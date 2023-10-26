package chapter03.fig03_13.exerciceOfPractice;

/*
Modifique el programa de suma que aparece en la figura 2.7 para usar la entrada y salida en un cuadro de diálogo con
los métodos de la clase JOptionPane. Como el método showInputDialog devuelve un objeto String, debe convertir el
objeto String que introduce el usuario a un int para utilizarlo en los cálculos. El método parseInt es un método
static dela clase Integer (del paquete java.lang) que recibe un argumento String que representa a un entero y
devuelve el valor como int. Si el objeto String no contiene un entero válido, el programa terminará con un error.
 */

import javax.swing.*;

import static java.lang.Integer.parseInt;

public class Sumar {

    public static void main(String[] args) {
        // muestro un mensaje de bienvenida
        JOptionPane.showMessageDialog(null, "Bienvenido al programa de suma");

        // muestro un cuadro de diálogo
        int numero1 = parseInt(JOptionPane.showInputDialog("Introduce el primer número entero"));
        int numero2 = parseInt(JOptionPane.showInputDialog("Introduce el segundo número entero"));
        int resultado = numero1 + numero2;
        JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + resultado);
    }
}
