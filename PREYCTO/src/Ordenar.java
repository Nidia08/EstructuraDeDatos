/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FamFG
 */
public class Ordenar {
    public static void selectionSort(Lista lista){
        for (int i = 0; i < lista.size(); i++) {
            int iMin= i;
            
            for (int j = i+1; j < lista.size(); j++) {
                Patient comp = new Patient();
                Patient comp2= new Patient();
                try {
                   comp= lista.getAt(j);
                } catch (Exception ex) {
                    Logger.getLogger(Lista.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    comp2= lista.getAt(iMin);
                } catch (Exception ex) {
                    Logger.getLogger(Lista.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(comp2.getName().compareTo(comp.getName())>0){
                    iMin=j;
                    
                }    
            }
            //Sawp
            Patient patient = new Patient();
            Patient patient2= new Patient();
            //int iVal=lista[iMin];
             //lista[iMin]=lisat[i];
            //lista[i]=iVal;
            try {
                patient = lista.getAt(i);
            } catch (Exception ex) {
                Logger.getLogger(Lista.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                patient2= lista.getAt(iMin);
            } catch (Exception ex) {
                Logger.getLogger(Lista.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                lista.insertAt(iMin, new Nodo(patient));
            } catch (Exception ex) {
                Logger.getLogger(Lista.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                lista.deleteAt(iMin+1);
            } catch (Exception ex) {
                Logger.getLogger(Lista.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                lista.insertAt(i, new Nodo(patient2));
            } catch (Exception ex) {
                Logger.getLogger(Lista.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                lista.deleteAt(i+1);
            } catch (Exception ex) {
                Logger.getLogger(Lista.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
    }
}
