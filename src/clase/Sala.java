/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Sala {

    private String numeroSala;
    private int filas;
    private int columnas;
    private boolean sala3d;

    public Sala() {
    }

    public Sala(String numeroSala, int filas, int columnas, boolean sala3d) {
        this.numeroSala = numeroSala;
        this.filas = filas;
        this.columnas = columnas;
        this.sala3d = sala3d;
    }

    public String getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(String numeroSala) {
        this.numeroSala = numeroSala;
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public boolean isSala3d() {
        return sala3d;
    }

    public void setSala3d(boolean sala3d) {
        this.sala3d = sala3d;
    }

}
