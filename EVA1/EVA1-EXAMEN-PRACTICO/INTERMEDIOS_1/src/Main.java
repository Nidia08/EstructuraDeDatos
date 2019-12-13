import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    int[] arreglo = new int[15];
    int numArreglo;
    int temp = 0;
    
    Scanner num = new Scanner(System.in);
    
        for (int i = 0; i < arreglo.length; i++) {
            
            System.out.println("Introduce un numero: ");
            numArreglo = num.nextInt();
            arreglo[i] = numArreglo;

    for (int k = 0; k < arreglo.length; k++) {
            for (int j = 0; j < arreglo.length; j++) {
                if(arreglo[k] > arreglo[j]){
                    temp = arreglo[k];
                    arreglo[k]=arreglo[j];
                    arreglo[j]=temp;
                        }
                    }  
                }
        for (int j = 14; j >= 0; j--) {                                                                
                  System.out.print("["+arreglo[j]+"]");  
            }
        }
    }
}


