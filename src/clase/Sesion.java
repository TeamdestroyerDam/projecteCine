/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author usuario
 */
public class Sesion {

    private String nombreSession;
    private Calendar fecha;
    private double precio;

    ArrayList<Sesion> listaSesion;

    Sesion() {
        this.listaSesion = new ArrayList();
    }

    public Sesion(String nombreSession, Calendar fecha, double precio) {
        this.nombreSession = nombreSession;
        this.fecha = fecha;
        this.precio = precio;
        this.listaSesion = new ArrayList();
    }

    public String getNombreSession() {
        return nombreSession;
    }

    public void setNombreSession(String nombreSession) {
        this.nombreSession = nombreSession;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
