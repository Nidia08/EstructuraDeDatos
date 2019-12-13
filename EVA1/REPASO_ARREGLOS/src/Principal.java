
import java.util.Scanner;

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
        double dGrupo[][];
        Scanner Leer = new Scanner(System.in);
        int nG, nA, c=0, o=0, t=0;
        double dGtpro = 0, dGpro = 0;
        
        System.out.println("¿Cuántos grupos?");
            nG = Leer.nextInt();
            Leer.nextLine();
            dGrupo= new double[nG][];
        for (int i = 0; i < dGrupo.length; i++) {
            o++;
            System.out.println("Alumnos para el grupo " + o + ": ");
                nA = Leer.nextInt();
                Leer.nextLine();
            dGrupo[i] = new double[nA];
            nA = 0;
        }
        o = 0;
        for (int i = 0; i < dGrupo.length; i++) {
            o++;
            for (int j = 0; j < dGrupo[i].length; j++) {
                t++;
                System.out.println("Calificación del " + t + " alumno del grupo " + o);
                    double dCal = Leer.nextDouble();
                    Leer.nextLine();
                    dGrupo[i][j] = dCal;
                    
            }
            t=0;
        }
        o=0;
        t=0;
        System.out.println("");
        for (int i = 0; i < dGrupo.length; i++) {
            o++;
            for (int j = 0; j < dGrupo[i].length; j++) {
                t++;
                System.out.print("Calificaiones del grupo " + o + " alumno " + t + " ---> " + dGrupo[i][j] + "\n");
            }
            t=0;
            System.out.println("");
        }
        t=0;
        o=0;
        for (int i = 0; i < dGrupo.length; i++) {
            for (int j = 0; j < dGrupo[i].length; j++) {
                dGtpro = dGtpro + dGrupo[i][j];
                c++;
            }
        }
        for (int i = 0; i < dGrupo.length; i++) {
            o++;
            for (int j = 0; j < dGrupo[i].length; j++) {
                dGpro = dGpro + dGrupo[i][j];
            }
            System.out.println("Promedio del grupo " + o + "---> " + dGpro/dGrupo[i].length);
            dGpro = 0;
        }
        
        System.out.println("Promedio total: " + dGtpro/c);
    }
    
}
