/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Conexion.Conexion;

/**
 *
 * @author elmer
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instanciación por constructor prohíbido por ser "private"
		//Conexion c = new Conexion();
		Conexion c = Conexion.getInstancia();
		c.conectar();
		c.desconectar();
		
		boolean rpta = c instanceof Conexion; // retorna un plugs
		System.out.println(rpta);
                
                // caracteristicas esenciales del protron de diseño singleton
                // colocar el metodo constructor en private
                // no se puede instanciar
                // los metodos de la conexion debe estar statico
    }
    
}
