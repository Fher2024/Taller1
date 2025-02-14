package co.edu.uniquindio.poo.Taller1;

import javax.swing.JOptionPane;

/*
 * Implementa un sistema que permita registrar calificaciones de estudiantes, donde se
ingresen nombres y calificaciones, y al finalizar se muestre un informe con quién aprobó y
reprobó. Ejercicio 2 del taller
 */

public class RegistroCalificaciones {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de estudiantes:"));
        String resultado = "Aprobados:\n", reprobados = "Reprobados:\n";

        for (int i = 0; i < n; i++) {
            String nombre = JOptionPane.showInputDialog("Nombre del estudiante " + (i + 1) + ":");
            double nota = Double.parseDouble(JOptionPane.showInputDialog("Calificación de " + nombre + ":"));
            if (nota >= 3.0)
                resultado += nombre + " - " + nota + "\n";
            else
                reprobados += nombre + " - " + nota + "\n";
        }

        JOptionPane.showMessageDialog(null, resultado + "\n" + reprobados, "Informe de Calificaciones",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
