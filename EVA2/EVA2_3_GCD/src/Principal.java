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
        Scanner Leer = new Scanner (System.in);
        int in1,in2;
        System.out.println("Ingresa un numero");
        in1=Leer.nextInt();
        Leer.nextLine();
        System.out.println("Ingresa otro numero");
        in2=Leer.nextInt();
        Leer.nextLine();
        
        System.out.println(gcd(in1,in2));
        
        
    }
    public static int gcd(int dividendo, int divisor){
        System.out.println(dividendo + " / " + divisor);
        if(divisor==0){
            return dividendo;
        }else{
            int iRes = dividendo%divisor;
            return gcd(divisor,iRes);
        }
    }
}
