/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

import clase.Pelicula;
import java.util.*;

/**
 *
 * @author DAM
 */
public class Cine {
    
    ArrayList<Pelicula> listaPeliculas;

    public void añadirPelicula(Pelicula p) {
        listaPeliculas.add(p);
    }

    public void eliminarPelicula(String nombre) {
        int x;
        x = buscaPelicula(nombre);
        listaPeliculas.remove(x);
    }

    public void modificarPelicula(String nombre, Pelicula p) {
        int x;
        x = buscaPelicula(nombre);
        listaPeliculas.set(x, p);
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

}
