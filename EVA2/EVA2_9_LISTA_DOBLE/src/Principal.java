
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nidia González
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            ListaDoble miLista = new ListaDoble();
            
            miLista.add(new Nodo(100));
            miLista.add(new Nodo(200));
            miLista.add(new Nodo(300));
            miLista.add(new Nodo(400));
            miLista.print();
            miLista.printBack();
            miLista.addBegin(new Nodo(50));
            miLista.print();
            miLista.printBack();
            miLista.addBegin(new Nodo(25));
            miLista.print();
            miLista.printBack();
            miLista.addAt(new Nodo(20),4);
            miLista.print();
            miLista.printBack();
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
