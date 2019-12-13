
import java.util.Scanner;

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
        Persona[] aPersonas = new Persona [5];
        Scanner Leer = new Scanner(System.in);
        for(int i = 0; i < aPersonas.length; i++){
            aPersonas[i] = new Persona();
            System.out.println("Introduce tu nombre");
            aPersonas[i].nombre = Leer.nextLine();
        }
            System.out.println("/////original");
            imprimirA(aPersonas);
        Persona[] aCopia = new Persona[aPersonas.length];
        for(int i = 0; i < aPersonas.length; i++){
            aCopia[i] = new Persona();
            aCopia[i].nombre = aPersonas[i].nombre;
        }
        aPersonas[2].nombre = "hola";
        System.out.println("////Copia");
        imprimirA(aCopia);
        System.out.println("/////modificado");
        imprimirA(aPersonas);
        System.out.println("/////Copia");
        imprimirA(aCopia);
    }
    public static void imprimirA(Persona[] args){
        for(int i = 0; i < args.length; i++){
            System.out.println(i+1 + ".- " + args[i].nombre);
        }
    }
}
class Persona{
    String nombre, apellido;
}
