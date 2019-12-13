

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author invitado
 */
public class Lista {

    private Nodo inicio;
    private Nodo fin;

    public Lista() {
        this.inicio = null;
        this.fin = null;
    }

    //Devuelve true si la lista esta vacia
    public boolean isEmpty() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    //Agregar un nodo al final de la lista
    public void add(Nodo nuevo) {
        //Primero verificar si la lista esta vacia
        if (isEmpty()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            /*Nodo temp= inicio;
            while(temp.getSiguiente()!=null){
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevo);*/
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }

    public void addBegin(Nodo nuevo) {
        if (isEmpty()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
    }

    public void insertAt(int pos, Nodo nuevo) throws Exception {

        Nodo temp = inicio;
        int iTama = size();
        if ((pos < 0) || (pos >= iTama)) {
            throw new Exception("La posicion es invalida");
        }
        if (pos == 0) {
            addBegin(nuevo);
        } else {
            for (int i = 0; i < pos - 1; i++) {
                temp = temp.getSiguiente();

            }
            nuevo.setSiguiente(temp.getSiguiente());
            temp.setSiguiente(nuevo);
        }
    }

    //Imporimir lista
    public void print() {
        Nodo temp = inicio;
        while (temp != null) {
            System.out.print(temp.getValor() + "-");
            temp = temp.getSiguiente();
        }
        System.out.println("");
    }

    //Cantidad de elemtos en la lista
    public int size() {
        int iCont = 0;
        Nodo temp = inicio;
        while (temp != null) {
            iCont++;
            temp = temp.getSiguiente();
        }
        return iCont;
    }

    public void clear() {
        inicio = null;
        fin = null;
    }

    public void deleteAt(int pos) throws Exception {
        //Borrar la primera 
        //Borrar la ultima
        //Un solo nodo

        int iTama = size();
        if (isEmpty()) {
            throw new Exception("La lista esta vacia");
        } else if ((pos < 0) || (pos >= iTama)) {
            throw new Exception("La posicion es invalida");
        } else if (iTama == 1) {
            clear();
        } else if (pos == 0) {
            inicio = inicio.getSiguiente();
        } else {
            Nodo temp = inicio;
            for (int i = 0; i < pos - 1; i++) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(temp.getSiguiente().getSiguiente());
            if (pos == (iTama - 1)) {
                fin = temp;
            }
        }
    }

    public Patient getAt(int pos) throws Exception {
        int iTama = size();
        if (isEmpty()) {
            throw new Exception("La lista esta vacia");
        } else if ((pos < 0) || (pos >= iTama)) {
            throw new Exception("La posicion es invalida");
        } else {
            Nodo temp = inicio;
            for (int i = 0; i < pos; i++) {
                temp = temp.getSiguiente();
            }
            return (Patient) temp.getValor();
        }
    }
    public Internados getAtInternados(int pos) throws Exception {
        int iTama = size();
        if (isEmpty()) {
            throw new Exception("La lista esta vacia");
        } else if ((pos < 0) || (pos >= iTama)) {
            throw new Exception("La posicion es invalida");
        } else {
            Nodo temp = inicio;
            for (int i = 0; i < pos; i++) {
                temp = temp.getSiguiente();
            }
            return (Internados) temp.getValor();
        }
    }
     public DocEnf getAtDocEnf(int pos) throws Exception {
        int iTama = size();
        if (isEmpty()) {
            throw new Exception("La lista esta vacia");
        } else if ((pos < 0) || (pos >= iTama)) {
            throw new Exception("La posicion es invalida");
        } else {
            Nodo temp = inicio;
            for (int i = 0; i < pos; i++) {
                temp = temp.getSiguiente();
            }
            return (DocEnf) temp.getValor();
        }
    }
}
