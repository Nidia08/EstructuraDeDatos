/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_1_filtrar_valores_de_un_arreglo;

/**
 *
 * @author Arman
 */
public class EXAMEN1_1_FILTRAR_VALORES_DE_UN_ARREGLO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aArreglo[] = new int[15];
        
        
        for (int i = 0; i < aArreglo.length; i++) {
            aArreglo[i] = (int)(1+Math.random()*100);
            if(aArreglo[i]%2!=0){
               aArreglo[i]++;
            } 
            for (int j = 0; j < i; j++) { //El for no avanzará hasta que se imprima un número distinto
                if(aArreglo[i]==aArreglo[j]){
                    i--;
                }
            }
        }
        
        for (int i = 0; i < aArreglo.length; i++) {
            System.out.print("["+aArreglo[i]+"]");
            
        }
        
    }
    
}
