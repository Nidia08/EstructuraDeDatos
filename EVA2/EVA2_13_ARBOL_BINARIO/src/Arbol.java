/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nidia
 */
public class Arbol {
    private Nodo root;
    
    public Arbol(){
        root = null;
    }
    public void agregarNodo(Nodo nuevo){
        agregarNodoRec(root,nuevo);
    }
    
    private void agregarNodoRec(Nodo actual, Nodo nuevo){
        if(root == null){//ARBOL VACÍO
            root = nuevo;            
        }else{
            if(nuevo.getiValor() > actual.getiValor()){//MAYOR --> DERECHA
                if(actual.getDer() == null){//ESTA VACÍO
                  actual.setDer(nuevo);
                }else{//YA HAY UN NODO
                    agregarNodoRec(actual.getDer(),nuevo);
                }
            }else if(nuevo.getiValor() < actual.getiValor()){//MENOR --> IZQUIERDA
                if(actual.getIzq() == null){//ESTA VACÍO
                  actual.setIzq(nuevo);
                }else{//YA HAY UN NODO
                    agregarNodoRec(actual.getIzq(),nuevo);
                }
            }else{//EL VALOR YA EXISTE
                System.out.println("El valor " + nuevo.getiValor() + " ya esta en el árbol");
            }
        }        
    }
    
    //PRE-ORDER --> LEER IZQ DER  POST-ORDER --> IZQ DER LEER  IN-ORDER --> IZQ LEER DER
    
    public void printPostOrder(){
        postOrder(root);
    }
    
    private void postOrder(Nodo actual){
        if(actual != null){
            //LEER IZQ
            postOrder(actual.getIzq());
            //LEER DER 
            postOrder(actual.getDer());
            //IMPRIMIR
            System.out.print(actual.getiValor() + "-");
        }
    }
    
    public void printPreOrder(){
        preOrder(root);
    }
    
    private void preOrder(Nodo actual){
        if(actual != null){
            //IMPRIMIR
            System.out.print(actual.getiValor() + "-");
            //LEER IZQ
            preOrder(actual.getIzq());
            //LEER DER 
            preOrder(actual.getDer());
        }
    }
    
    public void printInOrder(){
        inOrder(root);
    }
    
    private void inOrder(Nodo actual){
        if(actual != null){
            //LEER IZQ
            inOrder(actual.getIzq());
            //IMPRIMIR
            System.out.print(actual.getiValor() + "-");
            //LEER DER 
            inOrder(actual.getDer());
        }
    }
}
