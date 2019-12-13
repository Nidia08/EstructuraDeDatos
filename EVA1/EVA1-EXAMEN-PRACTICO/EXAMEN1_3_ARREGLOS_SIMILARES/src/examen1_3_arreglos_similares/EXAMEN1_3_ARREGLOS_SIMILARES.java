/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_3_arreglos_similares;

import java.util.Scanner;

/**
 *
 * @author Arman
 */
public class EXAMEN1_3_ARREGLOS_SIMILARES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aArreglo1[] = new int[10];
        int aArreglo2[] = new int[10];
        Scanner obj = new Scanner(System.in);

        for (int i = 0; i < aArreglo1.length; i++) {
            System.out.println("Primer Arreglo[" + (i + 1) + "]" + "\t" + "Ingrese un numero:");
            aArreglo1[i] = obj.nextInt();
            obj.nextLine();
            for (int j = 0; j < i; j++) {
                if (aArreglo1[i] == aArreglo1[j]) {//En caso de ingresar un valor repetido, se cierra el programa
                    System.out.println("No se permiten valores repetidos");
                    System.exit(0);
                }
            }
        }
        for (int i = 0; i < aArreglo2.length; i++) {
            System.out.println("Segundo Arreglo[" + (i + 1) + "]" + "\t" + "Ingrese un numero:");
            aArreglo2[i] = obj.nextInt();
            obj.nextLine();
            for (int j = 0; j < i; j++) {
                if (aArreglo2[i] == aArreglo2[j]) {//En caso de ingresar un valor repetido, se cierra el programa
                    System.out.println("No se permiten valores repetidos");
                    System.exit(0);
                }
            }
        }

        //Imprimir arreglos
        System.out.println("Arreglo 1: ");
        for (int i = 0; i < aArreglo1.length; i++) {
            System.out.print("[" + aArreglo1[i] + "]");
        }
        System.out.println("");
        System.out.println("Arreglo 2: ");
        for (int i = 0; i < aArreglo2.length; i++) {
            System.out.print("[" + aArreglo2[i] + "]");
        }

        System.out.println("");
        for (int i = 0; i < aArreglo1.length; i++) {
            for (int j = 0; j < aArreglo1.length; j++) {
                if (aArreglo1[i] == aArreglo2[j]) { //Comprobar si existe el numero en el otro arreglo
                    break;
                } else if (j >= aArreglo1.length - 1) { //Si no existe, los arreglos no son similares
                    System.out.println("Los arreglos no son similares");
                    System.exit(0);
                }
            }

            if (i >= aArreglo1.length - 1) { //Si acabaron las revisiones, los arreglos son similares.
                System.out.println("Los arreglos son similares");
                break;
            }
        }

    }

}
