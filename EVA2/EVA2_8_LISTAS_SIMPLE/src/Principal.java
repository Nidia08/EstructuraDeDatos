
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
    public static void main(String[] args) throws Exception {
        Lista miLista = new Lista();
        miLista.add(new Nodo(4));
        miLista.add(new Nodo(5));
        miLista.add(new Nodo(6));
        miLista.add(new Nodo(7));
        miLista.add(new Nodo(8));

        miLista.print();

        miLista.addBegin(new Nodo(88));
        
        miLista.print();

        try {
            miLista.eraseAt(0);
            miLista.print();
            miLista.add(new Nodo(200));
            miLista.print();
            miLista.eraseAt(5);
            miLista.print();
            miLista.add(new Nodo(300));
            miLista.print();

        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName());
        }
        boolean vacia = miLista.isEmpty();
        if (vacia) {
            System.out.println("Lista vacia");
        } else {
            System.out.println("Lista con nodos");
        }
        miLista.print();
        System.out.println("Cantida de datos " + miLista.size());
        /* int array [] = new int[1000000];
       
        for (int i = 0; i < array.length; i++) {
            array[i] = (int ) (Math.random()*4);
            
        }
      
        for (int i = 0; i < 1000000; i++) {
          miLista.add(new Nodo((int)(Math.random() * 1000)));
            
        }
        
       // miLista.print();
         System.out.println(miLista.size());*/
        try {
            miLista.addAt(new Nodo(45), 2);
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName());
        }

        try {
            miLista.eraseAt(0);
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName());
        }
        miLista.print();
        System.out.println("El valor tres es " + miLista.getAt(3));
        
        int valor = 6;
        if(miLista.find(valor)==-1){
            System.out.println("No se encontro el valor en la lista");
        }else{
           System.out.println("La posición del valor " + valor + " es " + miLista.find(valor));
        }
        
    }
    
}
