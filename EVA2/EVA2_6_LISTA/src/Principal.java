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
        Nodo nObj1 = new Nodo();
        nObj1.iValor = 100;
        nObj1.siguiente = new Nodo();
        nObj1.siguiente.iValor = 200;
        nObj1.siguiente.siguiente = new Nodo();
        nObj1.siguiente.siguiente.iValor = 300;
        
        System.out.println(nObj1.iValor);
        System.out.println(nObj1.siguiente.iValor);
        System.out.println(nObj1.siguiente.siguiente.iValor);
    }    
}
//NODOS
    class Nodo{
        //DATO A ALMACENAR
        int iValor;
        Nodo siguiente;
    }
