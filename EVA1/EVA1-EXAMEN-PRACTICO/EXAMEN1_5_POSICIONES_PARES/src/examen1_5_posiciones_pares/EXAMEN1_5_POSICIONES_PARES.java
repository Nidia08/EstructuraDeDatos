/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_5_posiciones_pares;

/**
 *
 * @author Arman
 */
public class EXAMEN1_5_POSICIONES_PARES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aArreglo[] = new int[15];
        
        for (int i = 0; i < aArreglo.length; i++) {
            aArreglo[i] = (int)(1+Math.random()*100);
        }
        for (int i = 0; i < aArreglo.length; i++) { //Asignar numeros pares a las posiciones pares
            if(i%2!=0){//Si la posición del arreglo es par
                if(aArreglo[i]%2!=0){ //Si el elemento no es par, sumarle 1
                    aArreglo[i]++;
                }
            }
        }
        
        for (int i = 0; i < aArreglo.length; i++) { //Imprimir arreglo
            System.out.print("["+aArreglo[i]+"]");
        }
        
    }
    
}
