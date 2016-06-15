/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.*;
import modelo.Pelicula;
import modelo.Sala;

/**
 *
 * @author DAM
 */
public class Cine {
    
    public static ArrayList<Pelicula> listaPeliculas = new ArrayList();
    public static ArrayList<Sala> listaSalas = new ArrayList();
    public static Pelicula activa;
    
    public Cine() {
    }
        
    public static Pelicula buscarPelicula(String nombrePeli) {
        for (Pelicula pelicula : listaPeliculas) {
            if(pelicula.getNombrePeli().equals(nombrePeli)){
                return pelicula;
            }
        }
        return null;
    }

    public static Sala buscarSala(int numero) {
        for (Sala sala : listaSalas) {
            if(sala.getNumeroSala() == numero){
                return sala;
            }
        }
        return null;
    }

    public static void añadirPelicula(Pelicula pelicula) {
        listaPeliculas.add(pelicula);  
    }

    public static void eliminarPelicula(Pelicula pelicula) {
        listaPeliculas.remove(pelicula);  
    }
    
    public static void añadirSala(Sala sala) {
        listaSalas.add(sala);   
    }

    public static void eliminarSala(Sala sala) {
        listaSalas.remove(sala); 
    }
    
    public static ArrayList <Pelicula> obtenerPeliculas() {   
        return listaPeliculas;
    }
    
    public static ArrayList <Sala> obtenerSalas() { 
        return listaSalas;
    } 
}