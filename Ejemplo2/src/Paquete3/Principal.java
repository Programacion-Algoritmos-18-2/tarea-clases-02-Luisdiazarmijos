/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete3;

/**
 *
 * @author USUARIO
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Precio p;
        p = new Precio();
        Precio n = new Precio (25.9);
        
        System.out.println(p.obtener());
        System.out.println(n.obtener());
    }
}
