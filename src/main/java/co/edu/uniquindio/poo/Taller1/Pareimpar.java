package co.edu.uniquindio.poo.Taller1;

import javax.swing.JOptionPane;

/*
 * Desarrolla un programa que solicite al usuario ingresar 10 números, imprima los números
pares e impares, y muestre cuántos de cada uno hay.Ejercicio 1 del taller
 */

public class Pareimpar {
    public static void main(String[] args) {
        int pares = 0, impares = 0;
        StringBuilder numerosPares = new StringBuilder("Pares: ");
        StringBuilder numerosImpares = new StringBuilder("Impares: ");

        // Pedir 10 números al usuario
        for (int i = 1; i <= 10; i++) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número " + i + ":"));

            if (numero % 2 == 0) {
                numerosPares.append(numero).append(" ");
                pares++;
            } else {
                numerosImpares.append(numero).append(" ");
                impares++;
            }
        }

        // Mostrar resultados
        JOptionPane.showMessageDialog(null,
                numerosPares + "\nCantidad de pares: " + pares +
                        "\n\n" + numerosImpares + "\nCantidad de impares: " + impares,
                "Resultados", JOptionPane.INFORMATION_MESSAGE);
    }
}
