/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.controlador;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 *Esta clase  contiene o almacena las fucnciones necesarias  para
 *que el usu de este programa sea eficaz asi como los metodos para 
 *cintrolar textos, crear diccionarios, comprobar rutas, conprobar 
 * y el metodo emcriptar.
 * @author Adolfo
 * @version 11.3
 * @author  JHON FAREZ
 * @version 8.2
 */
public class ControladorTexto {

    /**
     * Declaracion de atributos que seran usados en los metodos
     * Atributos de diferentes datos;
     */
    private String ruta;
    private File fichero;
    private List<Character> abecedario;
    private Map<Character, Character> diccionario;
 
    /**
     *Metodo  constructor que controlador texto hace la instancia de el abecedario,
     * diccionario y otro  para crear un dicionario.
     * @param
     */
    public ControladorTexto() {
        abecedario = new ArrayList<>();
        diccionario = new HashMap<>();
        diccionario = crearDiccionario();
    }
    /**
     * El  metodo crear diccionarios no reisive ningun tipo de parametro por ello 
     * declaramos  nuevas variables de tipo String eh int, dentro de bucles 
     * hace que el metodo put almacena el  valor especificado y lo asocia ala 
     * clave especificada en este  mapa
     * @return diccionario
     */

    public Map<Character, Character> crearDiccionario() {
      //Declaracion de nuevas varibles
        String abe = "abcdefghijklmnñopqrstuvwxyz";
        String num = "0123456789";
        String caritas = "☺☻♥♦♣♠•◘○◙♀";
        String espacio = " ";
        int aux = (abe.length() - 1);
  
        for (int i = 0; i < abe.length(); i++) {
            diccionario.put(abe.charAt(i), abe.charAt(aux));
            aux--;
        }

        diccionario.put(espacio.charAt(0), caritas.charAt(10));
        /**
         * Almacenamiento de el valor  en pa posision especifiacada y la 
         * asosiacion con la clave especificada en el map
         */
        diccionario.put(num.charAt(0), caritas.charAt(0));
        diccionario.put(num.charAt(1), caritas.charAt(1));
        diccionario.put(num.charAt(2), caritas.charAt(2));
        diccionario.put(num.charAt(3), caritas.charAt(3));
        diccionario.put(num.charAt(4), caritas.charAt(4));
        diccionario.put(num.charAt(5), caritas.charAt(5));
        diccionario.put(num.charAt(6), caritas.charAt(6));
        diccionario.put(num.charAt(7), caritas.charAt(7));
        diccionario.put(num.charAt(8), caritas.charAt(8));
        diccionario.put(num.charAt(9), caritas.charAt(9));

        return diccionario;
    }

    public boolean comprobarRuta(String ruta) {
        fichero = new File(ruta);
        
        if(fichero.exists()){
            return true;
        } else {
            return false;
        }
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

        try {
            fichero.createNewFile();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return fichero.getAbsolutePath();
    }
    
    public void encriptar(String rutaAbsoluta, String texto) {
        //fichero = new File(rutaAbsoluta);
        //texto = texto.toLowerCase();
        String aux = "";

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            String le = String.valueOf(letra);
            for (Map.Entry<Character, Character> letra2 : diccionario.entrySet()) {
                String le2 = String.valueOf(letra2.getKey());

                if (le.equalsIgnoreCase(le2)) {
                    if (Character.isUpperCase(letra)) {
                        aux = aux.concat(String.valueOf(letra2.getValue()).toUpperCase());
                        System.out.println(aux);
                    } else {
                        aux = aux.concat(String.valueOf(letra2.getValue()));
                        System.out.println(aux);
                    }
                }
            }
        }

        try {
            FileWriter archivoEscritura = new FileWriter(rutaAbsoluta, false);

            BufferedWriter escritura = new BufferedWriter(archivoEscritura);

            escritura.append(aux);

            escritura.close();
            archivoEscritura.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Ruta del archivo no encontrada");
        } catch (IOException ex2) {
            System.out.println("Error de escritura");
        } catch (Exception ex3) {
            System.out.println("Error General");
        }
    }

}
