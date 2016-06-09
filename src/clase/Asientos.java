/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

/**
 *
 * @author usuario
 */
public class Asientos {

    private String filaAsiento;
    private String numAsiento;
    private boolean disponibilidad;

    public Asientos() {

    }

    public Asientos(String filaAsiento, String numAsiento, boolean disponibilidad) {
        this.filaAsiento = filaAsiento;
        this.numAsiento = numAsiento;
        this.disponibilidad = disponibilidad;
    }

    public String getFilaAsiento() {
        return filaAsiento;
    }

    public void setFilaAsiento(String filaAsiento) {
        this.filaAsiento = filaAsiento;
    }

    public String getNumAsiento() {
        return numAsiento;
    }

    public void setNumAsiento(String numAsiento) {
        this.numAsiento = numAsiento;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

}
