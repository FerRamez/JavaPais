/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package folder;

/**
 *
 * @author neco3
 */
public class Pais {
    protected String nombreP, idiomaP, capitalP, monedaP;
    protected long poblacion;

    public Pais() {
    }

    public Pais(String nombreP, String idiomaP, String capitalP, String monedaP, long poblacion) {
        this.nombreP = nombreP;
        this.idiomaP = idiomaP;
        this.capitalP = capitalP;
        this.monedaP = monedaP;
        this.poblacion = poblacion;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getIdiomaP() {
        return idiomaP;
    }

    public void setIdiomaP(String idiomaP) {
        this.idiomaP = idiomaP;
    }

    public String getCapitalP() {
        return capitalP;
    }

    public void setCapitalP(String capitalP) {
        this.capitalP = capitalP;
    }

    public String getMonedaP() {
        return monedaP;
    }

    public void setMonedaP(String monedaP) {
        this.monedaP = monedaP;
    }

    public long getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(long poblacion) {
        this.poblacion = poblacion;
    }

    @Override
    public String toString() {
        return "nombre del pais " +nombreP + " \nidioma " + idiomaP + "\nCapital " + capitalP + "\nmoneda " + monedaP + "\npoblacion " + poblacion + "\n\n";
     }
    
    
}
