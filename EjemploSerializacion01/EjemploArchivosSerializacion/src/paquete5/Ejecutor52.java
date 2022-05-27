/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

/**
 *
 * @author SALA I
 */
public class Ejecutor52 {
    public static void main(String[] args) {
        String nombreArchivo = "data/hospitales.data";
        String id_buscar = "150";
        Hospital hospital_buscar;
        LecturaArchivoSecuencial5 lectura = 
                new LecturaArchivoSecuencial5(nombreArchivo);
        lectura.establecerIdentificador(id_buscar);
        lectura.establecerHospitalBuscado();
        hospital_buscar = lectura.obtenerHospitalBuscado();
        if(hospital_buscar!=null){
            System.out.println(hospital_buscar);
        }else{
            System.out.println("Hospital no encontrado");
        }
    }
}
