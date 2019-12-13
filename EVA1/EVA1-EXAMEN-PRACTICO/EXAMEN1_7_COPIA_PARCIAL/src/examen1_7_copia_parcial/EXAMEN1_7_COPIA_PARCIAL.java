/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_7_copia_parcial;

import java.util.Scanner;

/**
 *
 * @author Arman
 */
public class EXAMEN1_7_COPIA_PARCIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aArreglo[] = new int[15];
        Scanner obj = new Scanner(System.in);
        int a;
        int b;
        for (int i = 0; i < aArreglo.length; i++) {
            aArreglo[i] = (int)(1+Math.random()*20);
        }
        System.out.println("Arreglo Original");
        for (int i = 0; i < aArreglo.length; i++) {
            System.out.print((i+1)+":"+"["+aArreglo[i]+"] ");
        } System.out.println("");
        
        
        //Elección del rango de la copia
        System.out.println("");
        System.out.println("Se creará una copia del arreglo. Elija su comienzo. Valor Mínimo: 1 Valor Máximo: 15 ");
         a = obj.nextInt();
         obj.nextLine();
        System.out.println("Elija su final");
        b= obj.nextInt();
        obj.nextLine();
        
        int contador=0;
        for (int i = (a-1); i < b; i++) { //Contar cuantos numeros pares hay en el arreglo, los encontrados son los que se copiarán
            if(aArreglo[i]%2==0){
                contador++;
            }
        }
        
        int aCopia[] = new int[contador]; //Crear una copia con el numero de pares encontrados
        int c=0;
        for (int i = (a-1); i < b; i++) { //Ingresar pares a la copia
            if(aArreglo[a-1]%2==0){
            aCopia[c] = aArreglo[a-1];
            c++;
            a++;
            }else{ 
            a++;    
            }
        }
        
        System.out.println("");
        System.out.println("Arreglo Copia");
        for (int i = 0; i < aCopia.length; i++) {
            System.out.print("["+aCopia[i]+"]");            
        }
    }
    
}
