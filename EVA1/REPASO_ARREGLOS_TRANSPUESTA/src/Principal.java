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
        int iArreglo [][] = new int[3][5];
        int iArregloc [][] = new int[5][3];
        
        for (int i = 0; i < iArreglo.length; i++) {
            for (int j = 0; j < iArreglo[i].length; j++) {
                iArreglo[i][j] = (int)(Math.random()*10)+1;
            }
        }
        for (int i = 0; i < iArreglo.length; i++) {
            for (int j = 0; j < iArreglo[i].length; j++) {
                System.out.print("[" + iArreglo[i][j] + "]");
            }
            System.out.println("");
        }
        
        for (int i = 0; i < iArregloc.length; i++) {
            for (int j = 0; j < iArregloc[i].length; j++) {
                iArregloc[i][j] = iArreglo[j][i];
            }
        }
        System.out.println("Transpuesta");
        for (int i = 0; i <iArregloc.length ; i++) {
            for (int j = 0; j < iArregloc[i].length ; j++) {
                System.out.print("[" + iArregloc[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
}
