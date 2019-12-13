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
        Nodo nodo1,nodo2,nodo3;
        nodo1 = new Nodo(32);
        nodo2 = new Nodo(17);
        nodo3 = new Nodo(5);
        
        nodo1.setSiguiente(nodo2);
        nodo2.setSiguiente(nodo3);
        
        Nodo temp = nodo1;
        while(temp != null){
            System.out.print(temp.getiValor() + " - ");
            temp = temp.getSiguiente();
        }
    }
    
}

class Nodo{
    private int iValor;
    private Nodo siguiente;
    
    public Nodo(){
        this.siguiente = null;
    }
    
    public Nodo(int iValor){
        this.iValor = iValor;
        this.siguiente = null;
    }

    public int getiValor() {
        return iValor;
    }

    public void setiValor(int iValor) {
        this.iValor = iValor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
