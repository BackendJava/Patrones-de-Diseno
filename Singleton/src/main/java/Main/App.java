package Main;

import Conexion.Conexion;

public class App {

    public static void main(String[] args) {
        //Instanciaci�n por constructor proh�bido por ser "private"
        //Conexion c = new Conexion();
        Conexion c = Conexion.getInstancia();
        c.conectar();
        c.desconectar();

        boolean rpta = c instanceof Conexion;
        System.out.println(rpta);
    }

    // caracteristicas esenciales del protron de dise�o singleton
    // colocar el metodo constructor en private
    // no se puede instanciar
    // los metodos de la conexion debe estar statico
}
