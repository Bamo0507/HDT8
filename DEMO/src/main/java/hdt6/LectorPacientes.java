package hdt6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Clase que proporciona métodos para leer pacientes desde un archivo de texto.
 */
public class LectorPacientes {
    
    /**
     * Lee la información de los pacientes desde un archivo de texto y devuelve una lista de pacientes.
     * @param nombreArchivo El nombre del archivo desde el cual leer los pacientes.
     * @return Una lista de objetos Paciente.
     */
    public static ArrayList<Paciente> leerPacientes(String nombreArchivo) {
        // Lista para almacenar los pacientes leídos
        ArrayList<Paciente> pacientes = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String line;
            // Iterar sobre cada línea del archivo
            while ((line = br.readLine()) != null) {
                // Dividir la línea en partes usando ',' como delimitador
                String[] parts = line.split(",");
                // Extraer el nombre, síntoma y código de prioridad del paciente
                String nombre = parts[0].trim();
                String sintoma = parts[1].trim();
                String codigoPrioridad = parts[2].trim();
                // Crear un nuevo objeto Paciente con la información obtenida y agregarlo a la lista
                Paciente paciente = new Paciente(nombre, sintoma, codigoPrioridad);
                pacientes.add(paciente);
            }
        } catch (IOException e) {
            // Manejar cualquier excepción de entrada/salida imprimiendo el rastreo de la pila
            e.printStackTrace();
        }

        return pacientes;
    }
}
