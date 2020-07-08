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
 *
 * @author Adolfo
 */
public class ControladorTexto {

    private String ruta;
    private File fichero;
    private List<Character> abecedario;
    private Map<Character, Character> diccionario;

    public ControladorTexto() {
        abecedario = new ArrayList<>();
        diccionario = new HashMap<>();
        diccionario = crearDiccionario();
    }

    public Map<Character, Character> crearDiccionario() {
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

    /*  public boolean comprobar(String ruta, String nombre) {
        nombre = nombre.concat(".txt");
        fichero = new File("C:\\Users\\Adolfo\\Desktop\\pruebas\\hola.txt");

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
    }*/
    public void encriptar(/*String rutaAbsoluta,*/String texto) {
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
            FileWriter archivoEscritura = new FileWriter("C:\\Users\\Adolfo\\Desktop\\pruebas\\hola.txt", false);

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
