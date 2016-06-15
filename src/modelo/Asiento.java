/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author usuario
 */
public class Asiento {

    private int filaAsiento;
    private int numAsiento;
    private boolean disponibilidad;

    public Asiento() {
    }

    public Asiento(int filaAsiento, int numAsiento, boolean disponibilidad) {
        this.filaAsiento = filaAsiento;
        this.numAsiento = numAsiento;
        this.disponibilidad = disponibilidad;
    }

    public int getFilaAsiento() {
        return filaAsiento;
    }

    public void setFilaAsiento(int filaAsiento) {
        this.filaAsiento = filaAsiento;
    }

    public int getNumAsiento() {
        return numAsiento;
    }

    public void setNumAsiento(int numAsiento) {
        this.numAsiento = numAsiento;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

}
