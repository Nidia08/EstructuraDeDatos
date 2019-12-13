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
        System.out.println("Factorial de 5 = " + calculaFactorial(5));
    }
    public static int calculaFactorial(int iVal){
        System.out.println("Inicio " + iVal);
        if(iVal==0){
            System.out.println("Fin");
            return 1;
        }else{
            return iVal * calculaFactorial(iVal-1);  
        }
    }
}
