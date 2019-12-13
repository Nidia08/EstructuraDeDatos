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
        int aiDatos[] = new int[10];
        int aiCopia[] = new int[10];
        
        for(int i=0; i<aiDatos.length; i++){
            aiDatos[i] = (int)(Math.random()*100) + 1;
        }
        System.out.println("Datos originales");
        for(int i=0; i<aiDatos.length; i++){
            System.out.print("[" + aiDatos[i] + "]");
        }
        System.out.println("\n" + aiDatos);
        aiCopia = aiDatos;
        System.out.println(aiCopia);
        System.out.println("\nDatos copia");
        for(int i=0; i<aiCopia.length; i++){
            System.out.print("[" + aiCopia[i] + "]");
        }
    }
    
}
