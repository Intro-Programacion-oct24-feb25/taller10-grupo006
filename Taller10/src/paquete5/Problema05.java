/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}};

        String cadena = "";

        for (int fila = 0; fila < estudiantes.length; fila++) {
            for (int col = 0; col < estudiantes[fila].length; col++) {
                String inicial = estudiantes[fila][col].substring(0, 1);

                switch (inicial) {
                    case "S":
                    case "P":
                    case "T":
                        cadena = String.format("%s%s\n",
                                cadena,
                                estudiantes[fila][col]);
                }
            }
        }

        System.out.printf("%s\n", cadena);
    }

}
