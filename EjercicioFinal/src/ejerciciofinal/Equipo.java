/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofinal;

/**
 *
 * @author USUARIO
 */
public class Equipo {

    private String nombre, ciudad;
    int num_jugadores;// atributos 

    public Equipo() { // constructor  sin parametros 
        agregarnombre("Nacional");
        agregarnum_jugadores(20);
        agregarciudad("Quito");
    }

    public Equipo(String x) { // constructor que recibe el parametro nombre
        agregarnombre(x);

    }

    public Equipo(String x, int a) {// Constructor que recibe parametros de nombre y num_jugadores
        agregarnombre(x);
        agregarnum_jugadores(a);
    }

    public Equipo(String x, String y, int a) { // constructor con parametros  que reciba tres parámetros para asignar valores a nombre, num_jugadores, ciudad
        agregarnombre(x);
        agregarnum_jugadores(a);
        agregarciudad(y);
    }

    public void agregarnombre(String x) {
        nombre = x;
    }

    public String obtenernombre() {
        return nombre;
    }

    public void agregarnum_jugadores(int a) {
        num_jugadores = a;
    }

    public int obtenernum_jugadores() {
        return num_jugadores;
    }

    public void agregarciudad(String y) {
        ciudad = y;
    }

    public String obtenerciudad() {
        return ciudad;

    }
}
