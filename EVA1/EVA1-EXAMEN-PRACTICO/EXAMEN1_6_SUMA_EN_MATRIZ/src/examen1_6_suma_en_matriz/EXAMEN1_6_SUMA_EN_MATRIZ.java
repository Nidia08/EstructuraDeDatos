/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_6_suma_en_matriz;

import java.util.Scanner;

/**
 *
 * @author Arman
 */
public class EXAMEN1_6_SUMA_EN_MATRIZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aMatriz[][] = new int[4][4];
        Scanner obj = new Scanner(System.in);
        
        
        for (int i = 0; i < aMatriz.length; i++) {
            for (int j = 0; j < aMatriz[i].length; j++) {
                 System.out.println("Matriz["+(i+1)+"]" + "["+(j+1)+"]"  +  "\t"+"Ingrese un numero del 0 al 9: ");
                 aMatriz[i][j] = obj.nextInt();
                 obj.nextLine();
                 if(aMatriz[i][j]>9){
                     System.out.println("Solo se permiten numeros del 0 al 9");
                     System.exit(0);
                 }
            }  
        }
        
        //Imprimir Matriz 4x4
        System.out.println("");
        for (int i = 0; i < aMatriz.length; i++) {
            for (int j = 0; j < aMatriz[i].length; j++) {
                System.out.print("["+aMatriz[i][j]+"]");
                if(j==aMatriz.length-1){ //Si se llega a la columna 4, hacer un salto de linea
                System.out.println("");
                }
            }   
        }
        
        
        int suma=0;
        int suma2=0;
        int promedio=0;
        int promedio2=0;
        
        System.out.println("");
        //VERIFICAR SUMA EN LA MATRIZ---------------------------------------------------------------------------------------
        for (int i = 0; i < aMatriz.length; i++) { //Indicador del promedio de la i-lésima fila e i-lésima columna
            promedio=0;
            promedio2=0;
            suma=0;
            suma2=0;
            
        //Indicador de la i-lésima fila e i-lésima columna
        //Filas 1x1 , 1x2, 1x3, 1x4. 2x1, 2x2, 2x3, 2x4. etc
        //Columnas 1x1, 2x1, 3x1, 4x1. 1x2, 2x2, 3x2, 4x2. etc 
            
            for (int j = 0; j< aMatriz[i].length; j++) { //Suma de la primera fila
                suma+= aMatriz[i][j] ;
            } 
            for (int j = 0; j < aMatriz[i].length; j++) { //Suma de la primera columna
                suma2+= aMatriz[j][i]; 
            }
            
            promedio = (suma)/4; //Promedio de la primera fila
            promedio2 = (suma2)/4; //Promedio de la primera columna
            if(promedio == promedio2){
            System.out.println("El promedio de la fila "+(i+1)+ "("+promedio+")" 
                    +" coincide con el promedio de la columna "+(i+1)+"("+promedio2+")");
            }else if(promedio!=promedio2){
                System.out.println("El promedio de la fila "+(i+1)+ "("+promedio+")" 
                    +" NO coincide con el promedio de la columna "+(i+1)+"("+promedio2+")");  
            }  
           
           
        }
        
        
        
       
    }
    
}
