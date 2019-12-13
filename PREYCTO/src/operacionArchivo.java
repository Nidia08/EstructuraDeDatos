/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NIDIA
 */
public class operacionArchivo {

    //crea el archivo en disco, recibe como parámetro la lista de estudiantes
    public static void crearArchivo(Lista lista) {
        FileWriter flwriter = null;
        try {
            //crea el flujo para escribir en el archivo
            flwriter = new FileWriter("C:\\archivos\\patients.txt");
            //crea un buffer o flujo intermedio antes de escribir directamente en el archivo
            BufferedWriter bfwriter = new BufferedWriter(flwriter);
            for (int i = 0; i < lista.size(); i++) {
                //escribe los datos en el archivo
                Patient patient = new Patient();
                patient = lista.getAt(i);
                bfwriter.write(patient.getId().toString() + "," + patient.getName() + "," + patient.getPriority() + "\n");
            }
            //cierra el buffer intermedio
            bfwriter.close();
            System.out.println("Archivo creado satisfactoriamente..");

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            Logger.getLogger(operacionArchivo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (flwriter != null) {
                try {//cierra el flujo principal
                    flwriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //crea el archivo en disco, retorna la lista de estudiantes
    public static Lista leerArchivo(String persona) {
        // crea el flujo para leer desde el archivo
        File file = new File("C:\\archivos\\" + persona + ".txt");
        Lista listaPaciente = new Lista();
        Scanner scanner;
        try {
            //se pasa el flujo al objeto scanner
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                // el objeto scanner lee linea a linea desde el archivo
                String linea = scanner.nextLine();
                Scanner delimitar = new Scanner(linea);
                //se usa una expresión regular
                //que valida que antes o despues de una coma (,) exista cualquier cosa
                //parte la cadena recibida cada vez que encuentre una coma				
                delimitar.useDelimiter("\\s*,\\s*");
                if (persona.equals("docEnf")) {
                    DocEnf docEnf = new DocEnf();
                    docEnf.setdId(delimitar.next());
                    docEnf.setPsw(delimitar.next());
                    docEnf.setPuesto(delimitar.next());
                    listaPaciente.addBegin(new Nodo(docEnf));
                } else if (persona.equals("patients")) {
                    Patient patient = new Patient();
                    patient.setId(delimitar.next());
                    patient.setName(delimitar.next());
                    patient.setPriority(delimitar.next());
                    listaPaciente.addBegin(new Nodo(patient));
                } else if (persona.equals("internados")) {
                    Internados inter = new Internados();
                    inter.setDatos(delimitar.next());
                    inter.setObservacion(delimitar.next());
                    inter.setEnf(delimitar.next());
                    inter.setCuar(delimitar.next());
                    inter.setPrio(delimitar.next());
                    listaPaciente.addBegin(new Nodo(inter));
                }

            }
            //se cierra el ojeto scanner
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return listaPaciente;
    }

    //añadir más estudiantes al archivo
    public static void addArchivo(Lista lista, String persona) {

        FileWriter flwriter = null;
        try {//además de la ruta del archivo recibe un parámetro de tipo boolean, que le indican que se va añadir más registros 
            flwriter = new FileWriter("C:\\archivos\\" + persona + ".txt", true);
            BufferedWriter bfwriter = new BufferedWriter(flwriter);

            for (int i = 0; i < lista.size(); i++) {
                //escribe los datos en el archivo

                if (persona.equals("docEnf")) {
                    DocEnf docEnf = new DocEnf();
                    docEnf = lista.getAtDocEnf(i);
                    bfwriter.write(docEnf.getdId() + "," + docEnf.getPsw() + "," + docEnf.getPuesto() + "\n");
                } else if (persona.equals("patients")) {
                    Patient patient = new Patient();
                    patient = lista.getAt(i);
                    bfwriter.write(patient.getId() + "," + patient.getName() + "," + patient.getPriority() + "\n");
                } else if (persona.equals("internados")) {
                    Internados internados = new Internados();
                    internados = lista.getAtInternados(i);
                    bfwriter.write(internados.getDatos() + "," + internados.getObservacion() + "," + internados.getEnf() + "," + internados.getCuar() + "," + internados.getPrio() + "\n");
                }
            }
            bfwriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            Logger.getLogger(operacionArchivo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (flwriter != null) {
                try {
                    flwriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void borrar(File fichero) {
        try {
            // Comprovamos si el fichero existe  de ser así procedemos a borrar el archivo
            if (fichero.exists()) {
                fichero.delete();
                System.out.println("Ficherro Borrado");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
