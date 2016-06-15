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
public class Pelicula {

    private String nombrePeli;
    private String nacionalidad;
    private String duracion;
    private String director;
    private String interpretes;
    private String argumento;
    private String genero;
    private String clasificacion;
    
    public ArrayList<Sesion> listaSesion;

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
        this.listaSesion = new ArrayList();
    }

    public void añadirSesion(Sesion s) {
        listaSesion.add(s);
    }

    public Sesion buscarSesion(String nombre) {
        for (Sesion sesion : this.listaSesion) {
            if(sesion.getNombreSession().equals(nombre)){
                return sesion;
            }
        }
        return null;
    }
    
    public void eliminarSesion(Sesion sesion) {
        this.listaSesion.remove(sesion);
    }
       
    public void modificarPelicula(String nombrePeli, String nacionalidad, String duracion, String director, String interpretes, String argumento, String genero, String clasificacion) {
        this.nombrePeli = nombrePeli;
        this.nacionalidad = nacionalidad;
        this.duracion = duracion;
        this.director = director;
        this.interpretes = interpretes;
        this.argumento = argumento;
        this.genero = genero;
        this.clasificacion = clasificacion;
    } 
    
    public String getNombrePeli() {
        return nombrePeli;
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
