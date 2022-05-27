/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

import java.io.*;
import java.util.*;
public class ArchivoLectura {
    private Scanner entrada;
    private String nombreArchivo;
    private String rutaArchivo;
    private ArrayList<Hospital> lista;

    public ArchivoLectura(String n) {
        nombreArchivo = n;
        rutaArchivo = String.format("data/%s", nombreArchivo);
        
        File f = new File(rutaArchivo); 
        if (f.exists()) {
            try {
                entrada = new Scanner(new File(rutaArchivo));
                
            } 
            catch (FileNotFoundException e) {
                System.err.println("Error al leer del archivo: " + e);

            } 
        }
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerRutaArchivo() {
        rutaArchivo = String.format("data/%s.txt",
                obtenerNombreArchivo());
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public String obtenerRutaArchivo() {
        return rutaArchivo;
    }

    
    public void establecerLista() {
        lista = new ArrayList<>();
        File f = new File(rutaArchivo);

        if (f.exists()) {

            String linea = entrada.nextLine();
            
            ArrayList<String> linea_partes = new ArrayList<>(
                    Arrays.asList(linea.split(";")));
            
            String nombreHospital = linea_partes.get(0);
            int numCamas = Integer.parseInt(linea_partes.get(1));
            double presupuesto = Double.parseDouble(linea_partes.
                    get(2));

            Hospital h = new Hospital(nombreHospital,numCamas,presupuesto);

            lista.add(h);

        } 
    }

    public ArrayList<Hospital> obtenerLista() {

        return lista;
    }

    public void cerrarArchivo() {
        if (entrada != null) {
            entrada.close();
        } 

    }

    @Override
    public String toString() {
        String cadena = "Hospital \n";
        for (int i = 0; i < obtenerLista().size(); i++) {
            Hospital h1 = obtenerLista().get(i); 
            cadena = String.format("%s;%d;%s;%d;%.2f", cadena,
                    i + 1,
                    h1.obtenerNombre(),
                    h1.obtenerNumCamas(),
                    h1.obtenerpresupuesto());    
        }
        return cadena;
    }
}
