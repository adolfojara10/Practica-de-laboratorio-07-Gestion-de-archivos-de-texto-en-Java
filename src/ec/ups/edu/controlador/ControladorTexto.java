/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.controlador;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Adolfo
 */
public class ControladorTexto {

    String ruta;
    File fichero;

    public ControladorTexto() {
    }

    public boolean comprobar(String ruta, String nombre) {
        nombre = nombre.concat(".txt");
        fichero = new File(ruta + File.separator + nombre);

        if (fichero.exists()) {
            return true;
        } else {
            return false;
        }
    }

    public String crearFichero(String ruta, String nombre) {

        nombre = nombre.concat(".txt");
        fichero = new File(ruta + File.separator + nombre);
        String devolver = null;

        try {

            fichero.createNewFile();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return fichero.getAbsolutePath();
    }

}
