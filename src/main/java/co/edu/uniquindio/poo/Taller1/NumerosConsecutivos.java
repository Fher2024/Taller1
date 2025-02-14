package co.edu.uniquindio.poo.Taller1;

import javax.swing.JOptionPane;

/*
 * Desarrolla un algoritmo que imprima una pirámide de números consecutivos según el
número de niveles especificado por el usuario, donde cada nivel contiene un número más
que el anterior. Ejercicio 5 del taller.
 */
public class NumerosConsecutivos {
    

    public static void main(String[] args) {
        int niveles = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de niveles:"));
        StringBuilder piramide = new StringBuilder();
        int num = 1;

        for (int i = 1; i <= niveles; i++) {
            for (int j = 1; j <= i; j++) {
                piramide.append(num++).append(" ");
            }
            piramide.append("\n");
        }

        JOptionPane.showMessageDialog(null, piramide.toString(), "Aqui les presento la PIRAMIDE", JOptionPane.INFORMATION_MESSAGE);
    }
}

    

