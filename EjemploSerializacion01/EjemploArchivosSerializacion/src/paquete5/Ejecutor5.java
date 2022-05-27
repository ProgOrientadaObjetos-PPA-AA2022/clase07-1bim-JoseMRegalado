
package paquete5;

/**
 *
 * @author SALA I
 */
public class Ejecutor5 {
    public static void main(String[] args) {
        String nombreArchivo = "data/hospitales.data";
        
        Hospital hospital1 = new Hospital("Clínica San Agustín", 
                100, 250000,"150");
        Hospital hospital2 = new Hospital("Hospital UTPL", 
                150, 200000,"151");
        Hospital hospital3 = new Hospital("Hospital del Seguro", 
                200, 350000,"152");

        EscrituraArchivoSecuencial5 archivo = 
                new EscrituraArchivoSecuencial5(nombreArchivo);
        // establecer el valor del atributo registro
        archivo.establecerRegistroHospital(hospital1);
        // establecer en el archivo el atributo del registro
        archivo.establecerSalida();
        archivo.establecerRegistroHospital(hospital2);
        archivo.establecerSalida();
        archivo.establecerRegistroHospital(hospital3);
        archivo.establecerSalida();
        archivo.cerrarArchivo();
        
        LecturaArchivoSecuencial5 lectura = 
                new LecturaArchivoSecuencial5(nombreArchivo);
        lectura.establecerHospitales();
        System.out.println(lectura);
    }
}
