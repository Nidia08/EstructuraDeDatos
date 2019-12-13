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
int iX;
static int iY;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(generarClave());
    }  
    public static String generarClave(){
       int iNum;
       iNum = (int)(Math.random()*10000);
       String resu = "";
       if(iNum<10){//3ceros
           resu="000"+iNum;
       }else if(iNum<100){//2ceros
           resu="00"+iNum;
       }else if(iNum<1000){//1cero
           resu="0"+iNum;
       }else{
           resu=iNum+"";
       }
       return resu;
    }
}
abstract class algo{
    
}
