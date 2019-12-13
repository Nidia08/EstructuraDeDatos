
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
        //DECLARACION
        int aiDatos[], a, b;
        int[] aiDatos2, x, y;
        //
        int aiCopia[];
        int tama = 100;
        aiDatos = new int[tama];
        
        for(int i=0; i<aiDatos.length; i++){
            aiDatos[i] = (int)(Math.random()*100) + 1;
        }
        System.out.println(aiDatos);
        tama = 200;
        aiDatos = new int[tama];
        
        for(int i=0; i<aiDatos.length; i++){
            aiDatos[i] = (int)(Math.random()*100) + 1;
        }
        System.out.println(aiDatos);
        //SON OBJETOS
        //LA MEMORIA ES CONSECUTIVA
        //SON DE ACCESO ALEATORIO
        aiDatos[4] = 5000;
        aiDatos[69] = 500;
        //SON RAPIDOS
        //SON INMUTABLES
        
    }
    
}
