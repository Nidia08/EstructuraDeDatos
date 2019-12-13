
import java.util.LinkedList;

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
        LinkedList<String> sListaEnla = new LinkedList<String>();
        
        sListaEnla.add("Hola");
        sListaEnla.add(" ");
        sListaEnla.add("mundo");
        sListaEnla.add(" ");
        sListaEnla.add("cruel");
        sListaEnla.add("!!!");
        sListaEnla.addFirst("XXXXX");
        System.out.println(sListaEnla);
        for (String string : sListaEnla) {
            System.out.print(string + " - ");
        }
        System.out.println("");
        System.out.println("Número de elementos " + sListaEnla.size());
        sListaEnla.remove(3);
        System.out.println(sListaEnla);
        System.out.println("Número de elementos " + sListaEnla.size());
    }
    
}
class Algo{
    
}