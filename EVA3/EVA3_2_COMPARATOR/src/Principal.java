
import java.util.Comparator;
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
        LinkedList<Integer> iListaEnla = new LinkedList<Integer>();
        
        for (int i = 0; i < 5; i++) {
            iListaEnla.add((int)(Math.random()*100));
        }
        
        System.out.println(iListaEnla);
        
        Comparator c = new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                int resu;
                //CERO --> IGUAL
                //POSITIVO --> MAYOR
                //NEGATIVO --> MENOR
                Integer val1, val2;
                val1 = (Integer)o1;
                val2 = (Integer)o2;
                resu = val2 - val1;
                
                return resu;
            }
        };
        iListaEnla.sort(c);
        System.out.println(iListaEnla);
        
        //ORDENAR UNA LISTA CON STRINGS
        LinkedList<String> listStr = new LinkedList<String>();
        listStr.add("Hola");
        listStr.add(" ");
        listStr.add("mundo");
        listStr.add(" ");
        listStr.add("cruel");
        listStr.add("!!");
        Comparator cmpStr = new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                String cade1 = (String) o1;
                String cade2 = (String) o2;
                char c1 = cade1.charAt(0);
                char c2 = cade2.charAt(0);
                return c1 - c2;
            }
        };
        System.out.println(listStr);
        listStr.sort(cmpStr);
        System.out.println(listStr);
    }
    
}
