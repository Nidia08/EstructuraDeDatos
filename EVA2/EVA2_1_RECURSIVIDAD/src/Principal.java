
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
        System.out.println("Introduce un nùmero");
        int iVal = Leer.nextInt();
        for (int i = iVal; i >=1; i--) {
            System.out.print(i + " - ");
        }
        System.out.println("");
        forFalso(iVal);
        System.out.println("");
        forFalso2(iVal,1);
    }
    
    public static void forFalso(int iVal){
        System.out.print(iVal + " - ");
        if(iVal > 1){
            forFalso(iVal - 1);
        }
    }
    public static void forFalso2(int iVal, int incre){
        System.out.print(incre + " - ");
        if (incre < iVal){
            forFalso2(iVal, incre + 1);
        }
    }
}
