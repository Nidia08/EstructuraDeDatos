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
        Prueba[] apArreglo = new Prueba[5];
        Prueba[] apCopia = new Prueba[5];
        
        System.out.println(apArreglo);
        for(int i = 0; i < apArreglo.length; i++){
            apArreglo[i] = new Prueba();
            apArreglo[i].x = (int)(Math.random() * 10)+1;
            System.out.println(apArreglo[i]);
        }
        
        for(int i = 0; i < apArreglo.length; i++){
            apCopia[i] = new Prueba(); 
            apCopia[i].x = apArreglo [i].x;
            System.out.println("Copia" + apCopia + i + "=" + apCopia[i].x);
            System.out.println("Original" + apArreglo + i + "=" + apArreglo[i].x);
        }
    }
    
}
class Prueba{
    int x;
}
