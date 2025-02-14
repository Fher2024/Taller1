package co.edu.uniquindio.poo.Taller1;

import java.util.Random;

import javax.swing.JOptionPane;

/*
 * Diseña un programa que genere un número aleatorio entre 1 y 100, y permita al usuario
adivinarlo indicando si el número ingresado es mayor o menor hasta acertar, y cuantos
intentos tuvo que hacer para adivinar. Ejercicio 4 del taller
 */

public class JuegoAdivinaNumero {
    public static void main(String[] args) {
        int numeroSecreto = new Random().nextInt(100) + 1; 
        int intentos = 0;

        JOptionPane.showMessageDialog(null, "¡Bienvenido al juego; Soy Fher!\n\nAdivina un número entre 1 y 100.");

        while (true) {
            String input = JOptionPane.showInputDialog("Ingresa un número:");

            if (input == null) { 
                JOptionPane.showMessageDialog(null,
                        "Cancelastes el juego. pues la cuento que el número era: " + numeroSecreto);
                return;
            }

            int numeroUsuario = validarNumero(input);
            if (numeroUsuario == -1)
                continue; 

            intentos++;

            if (numeroUsuario == numeroSecreto) {
                JOptionPane.showMessageDialog(null, "¡Oyeeee Felicitaciones! Has adivinado el número " + numeroSecreto
                        + " en " + intentos + " intentos.");
                break;
            }

            JOptionPane.showMessageDialog(null, "El número secreto es "
                    + (numeroUsuario < numeroSecreto ? "mayor" : "menor") + ". Intenta de nuevo.");
        }
    }

    private static int validarNumero(String input) {
        try {
            int numero = Integer.parseInt(input);
            if (numero < 1 || numero > 100) {
                JOptionPane.showMessageDialog(null, "Por favor, ingresa un número entre 1 y 100.");
                return -1;
            }
            return numero;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Ingresa un número válido.");
            return -1;
        }
    }
}
