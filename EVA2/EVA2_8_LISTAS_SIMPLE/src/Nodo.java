/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nidia
 */
public class Nodo {
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
