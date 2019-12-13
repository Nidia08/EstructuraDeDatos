/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author temporal2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //INSTANCIA DE LA CLASE PERSONA
        //CREAR UN OBJETO
        Persona pObjPer = new Persona();
        Alumno aObjAlumno = new Alumno();
        Persona pObjPer2 = aObjAlumno;
    }    
}
class Alumno extends Persona implements Beca{
    //ATRIBUTO
    private String sNoControl;
    //METODOS

    public String getsNoControl() {
        return sNoControl;
    }

    public void setsNoControl(String sNoControl) {
        this.sNoControl = sNoControl;
    }

    @Override
    public void gastarBeca(int montoBeca) {
        System.out.println("Unas cheves "+montoBeca);
    }
}
interface Beca {
    //METODOS Y VARIABLES PUBLICAS
    //SOLO DECLARACION
    public void gastarBeca(int montoBeca);
}
//NIVEL DE ACCESO --> ENCAPSULAMIENTO
    class Persona{
        /*atributos*/
        //DEFINE EL ESTADO
        //Nombre
        private String nombre;
        //Edad
        private short edad;
        //Sexo
        private char sexo;
        
        /*MÉTODOS*/
        //COMPORTAMIENTO
        //METODOS GET Y SET

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public short getEdad() {
            return edad;
        }

        public void setEdad(short edad) {
            this.edad = edad;
        }

        public char getSexo() {
            return sexo;
        }

        public void setSexo(char sexo) {
            this.sexo = sexo;
        }
        
    }
