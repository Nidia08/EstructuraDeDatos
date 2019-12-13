import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] aArreglo= new int[15];
        int iVal;
         Scanner read = new Scanner(System.in);

        for (int i = 0; i < aArreglo.length; i++) {
             aArreglo[i]= (int)(Math.random()*100)+1;

        }
        for (int i = 0; i < aArreglo.length; i++) {
            System.out.print("["+aArreglo[i]+"]");
        }
        System.out.println("");
        System.out.println("Introduce un numero");
        iVal= read.nextInt();
        
        
        for (int i = 0; i < aArreglo.length; i++) {
            int conteo = 0;
                 for (int j = 0; j < aArreglo.length; j++) {
                    if(aArreglo[i]==iVal){
                    conteo++;
                }
            }
        if(conteo>1){
        }
        else{
        System.out.print("["+aArreglo[i]+"]");    
        }
      }
    }
}
    
    
    

