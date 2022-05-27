/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;


public class Ejecutor {
    public static void main(String[] args) {
        
        // nombre del archivo
        String nombreArchivo = "Hospital.txt";
        
        Hospital h1 = new Hospital("Hospital del seguro",200,150000);
        Hospital h2 = new Hospital("Clínica San Agustín",450,130000.50);
        Hospital h3 = new Hospital("Clínica San Pablo",150,100000);
        
        ArchivoEscritura archivo = new ArchivoEscritura(nombreArchivo);
        
        Hospital[] lista = {h1, h2, h3};
        
        for (int i = 0; i < lista.length; i++) {
            // establecer el valor del atributo registro
            archivo.establecerRegistro(lista[i]);
            // establecer en el archivo el atributo del registro
            archivo.establecerSalida();
        }
        
        ArchivoLectura lectura = new ArchivoLectura(nombreArchivo);
        lectura.establecerLista();
        System.out.println(lectura);
        
    }
}
