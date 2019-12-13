/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NIDIA
 */
public class Internados {

    private String datos;
    private String observacion;
    private String prio;
    private String Enf;
    private String Cuar;

    public String getCuar() {
        return Cuar;
    }

    public void setCuar(String Cuar) {
        this.Cuar = Cuar;
    }

    public String getEnf() {
        return Enf;
    }

    public void setEnf(String Enf) {
        this.Enf = Enf;
    }

    public String getPrio() {
        return prio;
    }

    public void setPrio(String prio) {
        this.prio = prio;
    }

    public Internados() {

    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String id) {
        this.datos = id;
    }

}
