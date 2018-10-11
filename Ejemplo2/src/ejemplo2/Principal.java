/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo2;

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
        //System.out.println(p.euros);
        //p.euros =101;
       // System.out.println(p.euros);
        p.agregar(20.2);
        System.out.println(p.obtener());
    }
    
}
