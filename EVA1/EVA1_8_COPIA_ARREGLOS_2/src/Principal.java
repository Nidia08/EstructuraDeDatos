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
        int aiDatos[] = new int[10];
        int aiCopia[] = new int[10];
        
        for(int i=0; i<aiDatos.length; i++){
            aiDatos[i] = (int)(Math.random()*100) + 1;
        }
        //aiCopia = aiDatos; //aqui copiamos direcciones
        //ELEMENTO POR ELEMENTO
        //aiDatos[0] = 99999;
        for(int i=0; i<aiCopia.length; i++){
            aiCopia[i] = aiDatos[i];
        }
        imprimirArreglo(aiDatos);
        imprimirArreglo(aiCopia);
        System.out.println(aiDatos);
        System.out.println(aiCopia);
        aiCopia[0] = 9999;
        imprimirArreglo(aiDatos);
        imprimirArreglo(aiCopia);
    }
    public static void imprimirArreglo(int[] args){
        System.out.println("");
        for(int i=0; i<args.length; i++){
            System.out.print("[" + args[i] + "]");
        }
        System.out.println("");
    }
}
