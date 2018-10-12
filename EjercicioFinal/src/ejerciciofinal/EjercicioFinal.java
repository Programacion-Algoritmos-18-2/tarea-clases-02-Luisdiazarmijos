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
public class EjercicioFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Equipo e = new Equipo();
        System.out.printf("%s,%s,%s\n", e.obtenernombre(), e.obtenerciudad(), e.obtenernum_jugadores());

        Equipo e2 = new Equipo("Barcelona");
        e2.agregarnum_jugadores(24);
        e2.agregarciudad("Guayaqui");
        System.out.printf("%s,%s,%s\n", e2.obtenernombre(), e2.obtenerciudad(), e2.obtenernum_jugadores());

        Equipo e3 = new Equipo("Emelec", 30);
        e3.agregarciudad("Guayaquil");
        System.out.printf("%s,%s,%s\n", e3.obtenernombre(), e3.obtenerciudad(), e3.obtenernum_jugadores());
        //System.out.printf(e2.obtenernombre(), e2.obtenernum_jugadores(), e2.obtenerciudad());

        Equipo e4 = new Equipo("Tecnico Universitario", "Ambato",28);
        System.out.printf("%s,%s,%s\n", e4.obtenernombre(), e4.obtenerciudad(), e4.obtenernum_jugadores());
    }
}
