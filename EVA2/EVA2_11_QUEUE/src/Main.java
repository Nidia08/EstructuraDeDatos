
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nidia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cola miCola = new Cola();
        miCola.agregar(new Nodo(100));
        miCola.agregar(new Nodo(200));
        miCola.agregar(new Nodo(300));
        miCola.agregar(new Nodo(400));
        miCola.print();
        System.out.println("NODO INICIAL: " + miCola.leer());
        try {
            miCola.eraseAt(0);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        miCola.print();
    }
    
}
