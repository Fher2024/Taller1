package co.edu.uniquindio.poo.Taller1;
/*
 * Crea un algoritmo que solicite una lista de números separados por comas, los ordene en
forma ascendente y muestre el resultado. Ejercicio 3 del taller
 */

import javax.swing.JOptionPane;
import java.util.Arrays;

public class OrdinisNumerus {

    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog("Ingrese números separados por comas:");

        
        String[] numerosTexto = input.split(",");
        int[] numeros = new int[numerosTexto.length];

        for (int i = 0; i < numerosTexto.length; i++) {
            numeros[i] = Integer.parseInt(numerosTexto[i].trim()); 
        }

        Arrays.sort(numeros);


        JOptionPane.showMessageDialog(null, "Números ordenados: " + Arrays.toString(numeros),
                "Orden Ascendente", JOptionPane.INFORMATION_MESSAGE);
    }
}
