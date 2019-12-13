/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nidia
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] iArreglo = new int[5];
        System.out.println(iArreglo);
        llenarA(iArreglo);
        imprimir(iArreglo);
        madrearArreglo(iArreglo);
        System.out.println(iArreglo);
    }
    
    public static void llenarA (int [] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*100);
        }
    }
    public static void imprimir (int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[" + arr[i] + "]");
        }
        System.out.println("");
        System.out.println(arr);
    }
    public static void madrearArreglo(int[] arr){
        arr=new int[100];
        System.out.println(arr);
    }
    
}
