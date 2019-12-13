/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_2_comparar_arreglos;

import java.util.Scanner;

/**
 *
 * @author Arman
 */
public class EXAMEN1_2_COMPARAR_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aArreglo1[]= new int[10];
        int aArreglo2[]= new int[10];
        Scanner obj = new Scanner(System.in);
        
        for (int i = 0; i < aArreglo1.length; i++) {
            System.out.println("Primer Arreglo["+(i+1)+"]"+"\t"+"Ingrese un numero:");
            aArreglo1[i] = obj.nextInt();
            obj.nextLine();
        }
        for (int i = 0; i < aArreglo2.length; i++) {
            System.out.println("Segundo Arreglo["+(i+1)+"]"+"\t"+"Ingrese un numero:");
            aArreglo2[i] = obj.nextInt();
            obj.nextLine();
        }
        
        System.out.println("Arreglo 1: ");
        for (int i = 0; i < aArreglo1.length; i++) {
            System.out.print("["+aArreglo1[i]+"]");
        }
        System.out.println("");
        System.out.println("Arreglo 2: ");
        for (int i = 0; i < aArreglo2.length; i++) {
            System.out.print("["+aArreglo2[i]+"]");
        }
        
        System.out.println("");
        for (int i = 0; i < aArreglo1.length; i++) {
                if(aArreglo1[i] != aArreglo2[i]){
                    System.out.println("Los arreglos no son iguales");
                 break;
                }
                if(i>=aArreglo1.length-1){
                    System.out.println("Los arreglos son iguales");
                    break;
                }
        }
        
        
        
    }
    
}
