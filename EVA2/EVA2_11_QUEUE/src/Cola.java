/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nidia
 */
public class Cola {
    private Nodo nodeIni;
    private Nodo nodeFin;
    
    public Cola(){
        this.nodeIni = null;
        this.nodeFin = null;
    }
    
    public boolean isEmpty(){ //Comprobar si la lista esta vacia
        if(nodeIni == null)
            return true;
        else
            return false;
    }
    
    //Agregar nodo al final de la lista
    public void add(Nodo nuevo){
        //verificar si la lista está vacia
        if(isEmpty()){
           nodeIni = nuevo;
           nodeFin = nuevo;
        }else{
           /*Nodo temp = nodeIni;
           while(temp.getNext() != null){
               temp = temp.getNext();
           }
           temp.setNext(nuevo);
           */
           nodeFin.setNext(nuevo);
           nodeFin = nuevo;
        }
    }
    //Agregar al inicio
    public void addBegin(Nodo nuevo){
        if(isEmpty()){
           nodeIni = nuevo;
           nodeFin = nuevo;
        }else{
           nuevo.setNext(nodeIni);
           nodeIni = nuevo;
        }
    }
    //Agregar nodo en una posición
    public void addAt(Nodo nuevo, int posi) throws Exception{
        if(isEmpty()){
            nodeIni = nuevo;
            nodeFin = nuevo;
        }else{
            if((posi < 0) || (posi >= size()))
                throw new Exception("La posición es inválida");
            else{
                int cont = 0;
                Nodo temp = nodeIni;
                while(cont < (posi-1)){
                    temp = temp.getNext();
                    cont++;
            }
            nuevo.setNext(temp.getNext());
            temp.setNext(nuevo);
        }
        }
    }
    //imprimir lista
    public void print(){
        Nodo temp = nodeIni;
        while(temp != null){
            System.out.print(temp.getNum()+" - ");
            temp = temp.getNext();
        }
        System.out.println("");
    }
    //regresar cantidad de nodos en la lista
    public int size(){
        int cont = 0;
        Nodo temp = nodeIni;
        while(temp != null){
            cont++;
            temp = temp.getNext();
        }
        return cont;
    }
    //Vaciar lista
    public void emptyList(){
        nodeFin = null;
        nodeIni = null;
    }
    public void eraseAt(int posi) throws Exception{
        if(isEmpty())
            throw new Exception("La lista está vacía");
        if((posi < 0) || (posi >= size()))
            throw new Exception("La posición es inválida");
        
        if(size() == 1){ //Solo un nodo
            emptyList();
        }else{ //varios nodos
            if(posi == 0){
                nodeIni = nodeIni.getNext();
            }else{
                Nodo temp = nodeIni;
                int cont = 0;
                while(cont < posi-1){
                    temp = temp.getNext();
                    cont++;
                }
                temp.setNext(temp.getNext().getNext());
                if(posi == (size()-1))
                    nodeFin = temp;
            }
        }
            
    }
    
    public int getAt(int posi){
        Nodo temp = nodeIni;
        int cont = 0;
        while(cont < posi){
            temp = temp.getNext();
            cont++;
        }
        return temp.getNum();
    }
    //hacer el find, buscar un valor y retornar la posi
    
    
    //AGREGAR UN NODO AL FINAL DE LA COLA
    public void agregar(Nodo nuevo){
        add(nuevo);
    }
    
    //LEER Y QUITAR EL NODO DEL INICIO DE LA COLA
    public int quitar() throws Exception{
        int iRes = getAt(0);
        eraseAt(0);
        return iRes;
    }
    
    //LEE EL NODO EN EL INICIO DE LA COLA
    public int leer(){
        return getAt(0);
    }
}
