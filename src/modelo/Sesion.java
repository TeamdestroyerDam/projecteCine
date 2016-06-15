/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

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
    public Sala sala;

    public ArrayList<Asiento> listaAsientos;

    public Sesion() {
        this.listaAsientos = new ArrayList();
    }

    public Sesion(String nombreSession, Calendar fecha, double precio, Sala sala) {
        this.nombreSession = nombreSession;
        this.fecha = fecha;
        this.precio = precio;
        this.sala = sala;
        this.listaAsientos = new ArrayList();
        cargarButacas();
    }

    public void modificarSesion(String nombreSession, Calendar fecha, double precio, Sala sala) {
        this.nombreSession = nombreSession;
        this.fecha = fecha;
        this.sala = sala;
        this.precio = precio;
        this.listaAsientos = new ArrayList();
        cargarButacas();
    }

    public void cargarButacas() {
        int filas = this.sala.getFilas();
        int columnas = this.sala.getColumnas();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                Asiento asiento = new Asiento(i, j, true);
                this.listaAsientos.add(asiento);
            }
        }
    }

    public String getNombreSession() {
        return nombreSession;
    }

    public void setNombreSession(String nombreSession) {
        this.nombreSession = nombreSession;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
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
