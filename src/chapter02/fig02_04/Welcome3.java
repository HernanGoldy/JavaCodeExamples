package chapter02.fig02_04;

// Imprimir varias líneas de texto con una sola instrucción.

public class Welcome3 {

    // el método main empieza la ejecución de la aplicación en Java
    public static void main(String[] args) {

        System.out.println("Bienvenido\na\nla programacion\nen Java!");
    } // fin del método main
} // fin de la clase Welcome3

/*
NOTA:
╔══════════╦════════════════════════════════════════════════════════════════════════════════════╗
║Secuencia ║                                                                                    ║
║de escape ║Descripción                                                                         ║
╠══════════╬════════════════════════════════════════════════════════════════════════════════════╣
║ \n       ║Nueva línea. Coloca el cursor de la pantalla al inicio de la siguiente línea.       ║
╠══════════╬════════════════════════════════════════════════════════════════════════════════════╣
║ \t       ║Tabulador horizontal. Desplaza el cursor de la pantalla hasta la siguiente posición ║
║          ║de tabulación.                                                                      ║
╠══════════╬════════════════════════════════════════════════════════════════════════════════════╣
║ \r       ║Retorno de carro. Coloca el cursor de la pantalla al inicio de la línea actual; no  ║
║          ║avanza a la siguiente línea. Cualquier carácter que se imprima después del retorno  ║
║          ║de carro sobrescribe los caracteres previamente impresos en esa línea.              ║
╠══════════╬════════════════════════════════════════════════════════════════════════════════════╣
║ \\       ║Barra diagonal inversa. Se usa para imprimir un carácter de barra diagonal inversa. ║
╠══════════╬════════════════════════════════════════════════════════════════════════════════════╣
║ \"       ║Doble comilla. Se usa para imprimir un carácter de doble comilla. Por ejemplo,      ║
║          ║    System.out.println(“\”entre comillas\””);                                       ║
║          ║muestra “entre comillas”.                                                           ║
╚══════════╩════════════════════════════════════════════════════════════════════════════════════╝
*/
