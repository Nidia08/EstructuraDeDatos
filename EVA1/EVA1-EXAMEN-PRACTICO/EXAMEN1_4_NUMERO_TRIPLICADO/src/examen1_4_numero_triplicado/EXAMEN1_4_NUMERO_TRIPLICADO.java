/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_4_numero_triplicado;

/**
 *
 * @author Arman
 */
public class EXAMEN1_4_NUMERO_TRIPLICADO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aArreglo[] = new int[20];
        int contador;
        
        for (int i = 0; i < aArreglo.length; i++) {
            aArreglo[i] = (int)(1+Math.random()*20);
        }
        for (int i = 0; i < aArreglo.length; i++) { //Imprimir arreglo
            System.out.print("["+aArreglo[i]+"]");
        }
        
        //Encontrar primer numero triplicado
        System.out.println("    ");
        for (int i = 0; i < aArreglo.length; i++) {
            contador = 0;
            for (int j = 0; j < aArreglo.length; j++) {
                if(aArreglo[i]==aArreglo[j]){
                    contador++;
                }
                if(contador==3){
                    System.out.println("El numero triplicado es: "+aArreglo[i]);
                    System.exit(0);
                }
            }   
            if(i>=aArreglo.length-1){
                System.out.println("No hay numero triplicado");
                break;
            }
        }
        
        
    }
    
}
