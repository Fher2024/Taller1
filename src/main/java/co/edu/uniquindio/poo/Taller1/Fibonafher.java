package co.edu.uniquindio.poo.Taller1;

import javax.swing.JOptionPane;

/*
 * Desarrolla un algoritmo que imprima una pirámide de números consecutivos según el
número de niveles especificado por el usuario, donde cada nivel contiene un número más
que el anterior. Ejercicio 5 del taller P1.
 */

public class Fibonafher {
    public static void main(String[] args) {
        int num1 = 0, num2 = 1, suma, limite;

        String input = JOptionPane.showInputDialog(null, "Bienvenidos a este programa -  Ingrese el número fibonacci:");
        limite = Integer.parseInt(input);

        StringBuilder resultado = new StringBuilder();
        // Generar la pirámide de Fibonacci
        int contador = 1; // Para determinar cuántos números mostrar en cada fila
        int cantidadMostrada = 0;

        for (int i = 0; cantidadMostrada < limite; i++) {
            for (int j = 0; j < contador && cantidadMostrada < limite; j++) {
                resultado.append(num1).append(" ");
                suma = num1 + num2;
                num1 = num2;
                num2 = suma;
                cantidadMostrada++;
            }
            resultado.append("\n");
            contador++; // Incrementa la cantidad de números en la siguiente fila
        }

        // Mostrar la pirámide en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, resultado.toString(), "¡yyy whala! laPirámide de Fibonacci",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
