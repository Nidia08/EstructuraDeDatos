
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
        System.out.println("Escribe la posiciòn");
        iNum = Leer.nextInt();
        System.out.println(fibo(iNum));
    }
    public static int fibo(int iVal){
        if(iVal == 0){
            return 0;
        }else if(iVal==1){
            return 1;
        }else{
           return fibo(iVal-1)+fibo(iVal-2); 
        }
    }
}
