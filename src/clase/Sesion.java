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
    private Calendar hora;
    private double precio;

    ArrayList<Asientos> listaAsientos;

    Sesion() {
        this.listaAsientos = new ArrayList();
    }

    public Sesion(String nombreSession, Calendar fecha, Calendar hora, double precio) {
        this.nombreSession = nombreSession;
        this.fecha = fecha;
        this.hora = hora;
        this.precio = precio;
        this.listaAsientos = new ArrayList();
    }

    public Calendar getHora() {
        return hora;
    }

    public void setHora(Calendar hora) {
        this.hora = hora;
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
