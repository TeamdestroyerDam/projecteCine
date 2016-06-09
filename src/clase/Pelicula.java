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
public class Pelicula {

    private String nombrePeli;
    private String nacionalidad;
    private String duracion;
    private String director;
    private String interpretes;
    private String argumento;
    private String genero;
    private String clasificacion;
    
    ArrayList<Sesion> listaSesion;

    public Pelicula() {
        this.listaSesion=new ArrayList();
    }

    public Pelicula(String nombrePeli, String nacionalidad, String duracion, String director, String interpretes, String argumento, String genero, String clasificacion) {
        this.nombrePeli = nombrePeli;
        this.nacionalidad = nacionalidad;
        this.duracion = duracion;
        this.director = director;
        this.interpretes = interpretes;
        this.argumento = argumento;
        this.genero = genero;
        this.clasificacion = clasificacion;
        this.listaSesion=new ArrayList();
    }

    public String getNombrePeli() {
        return nombrePeli;
    }

     public void añadirSesion(Sesion s) {
        listaSesion.add(s);
    }

    public void eliminarSesion(String nombreSession) {
        int x;
        x = buscaSesion(nombreSession);
        listaSesion.remove(x);
    }

    public void modificarSesion(String nombreSession, Sesion s) {
        int x;
        x = buscaSesion(nombreSession);
        listaSesion.set(x, s);
    }

    private int buscaSesion(String nombreSession) {
        int x = 0;
        for (Sesion ses : listaSesion) {
            if (ses.getNombreSession().equals(nombreSession)) {
                return x;
            } else {
                x++;
            }
        }
        return -1;
    }
    public void setNombrePeli(String nombrePeli) {
        this.nombrePeli = nombrePeli;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getInterpretes() {
        return interpretes;
    }

    public void setInterpretes(String interpretes) {
        this.interpretes = interpretes;
    }

    public String getArgumento() {
        return argumento;
    }

    public void setArgumento(String argumento) {
        this.argumento = argumento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

   
    
}
