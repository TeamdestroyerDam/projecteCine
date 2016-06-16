/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        String peli;

        try {
            Scanner scn = new Scanner(new File("pelicula.csv"));
            while (scn.hasNextLine()) {
                peli = scn.nextLine();
                cargaListaPeliculas(peli);

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Cine.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Pelicula buscarPelicula(String nombrePeli) {
        for (Pelicula pelicula : listaPeliculas) {
            if (pelicula.getNombrePeli().equals(nombrePeli)) {
                return pelicula;
            }
        }
        return null;
    }

    public static Sala buscarSala(int numero) {
        for (Sala sala : listaSalas) {
            if (sala.getNumeroSala() == numero) {
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

    public static ArrayList<Pelicula> obtenerPeliculas() {
        return listaPeliculas;
    }

    public static ArrayList<Sala> obtenerSalas() {
        return listaSalas;
    }

    private static void cargaListaPeliculas(String peli) {
        
        Pelicula pelicula;
        
        String nombrePeli=null;
        String nacionalidad=null;
        String duracion=null;
        String director=null;
        String interpretes=null;
        String argumento=null;
        String genero=null;
        String clasificacion=null;

        int cont = 1;

        int c1 = 0;
        String p = ";";
        
        
        for (int i = 0;i<peli.length();i++) {
            if (p.equals(peli.charAt(i))) {
                switch (cont) {
                    case 1:
                        nombrePeli = peli.substring(c1, i - 1);
                        c1 = i + 1;
                        cont++;
                        break;
                    case 2:
                        nacionalidad = peli.substring(c1, i - 1);
                        c1 = i + 1;
                        cont++;
                        break;
                    case 3:
                        duracion = peli.substring(c1, i - 1);
                        c1 = i + 1;
                        cont++;
                        break;
                    case 4:
                        director = peli.substring(c1, i - 1);
                        c1 = i + 1;
                        cont++;
                        break;
                    case 5:
                        interpretes = peli.substring(c1, i - 1);
                        c1 = i + 1;
                        cont++;
                        break;
                    case 6:
                        argumento = peli.substring(c1, i - 1);
                        c1 = i + 1;
                        cont++;
                        break;
                    case 7:
                        genero = peli.substring(c1, i - 1);
                        c1 = i + 1;
                        cont++;
                        break;
                    case 8:
                        clasificacion = peli.substring(c1);
                        c1 = i + 1;
                        break;

                }
            }
        }
        pelicula = new Pelicula(nombrePeli,nacionalidad,duracion,director,interpretes,argumento,genero,clasificacion);
        añadirPelicula(pelicula);