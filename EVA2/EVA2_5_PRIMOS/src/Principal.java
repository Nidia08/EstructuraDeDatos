
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
        Scanner Leer = new Scanner(System.in);
        int iNum;
        System.out.println("Ingresa un número");
        iNum = Leer.nextInt();
        
        if(esPrimoIneficiente(iNum))
            System.out.println("Es primo");
        else
            System.out.println("No es primo");
        
        
    }
    public static boolean esPrimoIneficiente (int iVal){
        boolean bResu = true;
        for (int i = 2; i < iVal; i++) {
           if((iVal%i)==0){
               bResu = false;
               break;
           }
        }
        return bResu;
    }
    
}
