package co.edu.uniquindio.poo.Taller1;

/*
 * Programa tu software administrativo, que permita gestionar un inventario de productos
donde se puedan agregar, eliminar y mostrar productos. Ejercicio 6 del taller
 */

import javax.swing.*;
import java.util.ArrayList;

public class InventarioProductos {

    public static void main(String[] args) {
        ArrayList<String> productos = new ArrayList<>();
        String menu = "1. Agregar\n2. Eliminar\n3. Mostrar\n4. Salir";

        while (true) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            if (opcion == 4)
                break;

            switch (opcion) {
                case 1 -> productos.add(JOptionPane.showInputDialog("Bienvenido \n\n¿Que Producto quiere registrar:"));
                case 2 -> productos.remove(JOptionPane.showInputDialog("Eliminar producto:"));
                case 3 -> JOptionPane.showMessageDialog(null, "Inventario:\n\n" + String.join("\n", productos));
                default -> JOptionPane.showMessageDialog(null, "Opción inválida");
            }
        }
    }
}
