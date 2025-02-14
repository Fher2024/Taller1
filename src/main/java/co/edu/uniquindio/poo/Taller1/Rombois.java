package co.edu.uniquindio.poo.Taller1;

import javax.swing.JOptionPane;

/*
 * Crea un programa que imprima un rombo de asteriscos (*,°) según el número de filas que
indique el usuario, asegurando que la figura quede centrada. Ejercicio 7 del taller

 */

public class Rombois {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número impar:"));
        StringBuilder rombo = new StringBuilder();

        for (int i = 1; i <= n; i += 2)
            rombo.append(" ".repeat((n - i) / 2)).append("°".repeat(i)).append("\n");

        for (int i = n - 2; i > 0; i -= 2)
            rombo.append(" ".repeat((n - i) / 2)).append("°".repeat(i)).append("\n");

        JOptionPane.showMessageDialog(null, rombo.toString());
    }
}
