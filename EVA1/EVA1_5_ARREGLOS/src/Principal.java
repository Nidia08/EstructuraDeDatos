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
        //DECLARACION DE ARREGLOS
        int aiDatos [] = new int [10];
        //N --> NUMERO DE ELEMENTOS
        //0 --> 1ER ELEMENTO
        //N - 1 --> ÙLTIMO ELEMENTO
        System.out.println(aiDatos);
        for (int x=0; x < aiDatos.length; x++){
            aiDatos[x] = (int)(Math.random() * 100) + 1;
        }
        System.out.println("FOR NORMAL");
        //FOR NORMAL
        for (int x=0; x < aiDatos.length; x++){
            System.out.println(aiDatos[x]);
        }
        System.out.println("FOR-EACH");
        //FOR-EACH
        for (int x : aiDatos) {
            System.out.println(x);
        }
    }
    
}
