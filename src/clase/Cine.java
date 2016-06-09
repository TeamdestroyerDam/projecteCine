/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

import clase.*;
import java.util.*;

/**
 *
 * @author DAM
 */
public class Cine {

    static ArrayList<Pelicula> listaPeliculas = new ArrayList();
    static ArrayList<Sala> listaSalas = new ArrayList();

    public void añadirPelicula(Pelicula p) {
        listaPeliculas.add(p);
    }

    public void añadirSala(Sala s) {
        listaSalas.add(s);
    }

    public void eliminarPelicula(String nombre) {
        int x;
        x = buscaPelicula(nombre);
        listaPeliculas.remove(x);
    }

    public void eliminarSala(String numSala) {
        int x;
        x = buscaSala(numSala);
        listaSalas.remove(x);
    }

    public void modificarPelicula(String nombre, Pelicula p) {
        int x;
        x = buscaPelicula(nombre);
        listaPeliculas.set(x, p);
    }
    
    public void modificarSala(String numSala, Sala s) {
        int x;
        x = buscaSala(numSala);
        listaSalas.set(x, s);
    }

    private int buscaPelicula(String nombre) {
        int x = 0;
        for (Pelicula peli : listaPeliculas) {
            if (nombre.equals(peli.getNombrePeli())) {
                return x;
            } else {
                x++;
            }
        }
        return -1;
    }
    
    private int buscaSala(String numSala) {
        int x = 0;
        for (Sala sal : listaSalas) {
            if (numSala.equals(sal.getNumeroSala())) {
                return x;
            } else {
                x++;
            }
        }
        return -1;
    }
    
    public static ArrayList <Pelicula> obtenerPeliculas() {
        
        return listaPeliculas;
    }
    
    public static ArrayList <Sala> obtenerSalas() {
        
        return listaSalas;
    }
    
}
