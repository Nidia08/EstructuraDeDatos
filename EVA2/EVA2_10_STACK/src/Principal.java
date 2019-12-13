
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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pila miPila = new Pila();
        miPila.push(new Nodo(100));
        miPila.push(new Nodo(200));
        miPila.push(new Nodo(300));
        miPila.push(new Nodo(400));
        miPila.print();
        
        try {
            System.out.println("Cima de la pila " + miPila.peek());
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        miPila.print();
        try {
            System.out.println("Cima de la pila " + miPila.pop());
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        miPila.print();
        
        miPila.agregar(new Nodo(100));
        miPila.agregar(new Nodo(200));
        miPila.agregar(new Nodo(300));
        miPila.agregar(new Nodo(400));
        
        miPila.print();
    }
    
}
