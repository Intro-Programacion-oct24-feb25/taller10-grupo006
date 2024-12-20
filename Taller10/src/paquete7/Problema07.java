/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete7;

import java.util.Scanner;

/**
 *
 * @author paulo
 */
public class Problema07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[][] dato = {{0, 2, 0}, {1, 0, 0}};
        double[][] dato1 = {{0, 0, 0}, {0, 0, 0}};
        double[][] suma = new double[3][3];
        String tipo;
        String cadena = "";

        for (int fila = 0; fila < dato.length; fila++) {
            for (int col = 0; col < dato[fila].length; col++) {
                suma[fila][col] = dato[fila][col] + dato1[fila][col];
                if (suma[fila][col] == 0) {
                    tipo = "NULL";
                    cadena = String.format("%sSuma de los valores:"
                            + "[%d][%d] = %s\n",
                            cadena,
                            fila,
                            col,
                            tipo);
                } else {

                    cadena = String.format("%sSuma de los valores:"
                            + "[%d][%d] = %.2f\n",
                            cadena,
                            fila,
                            col,
                            suma[fila][col]);
                }

            }
        }

        System.out.printf("%s\n", cadena);

    }

}