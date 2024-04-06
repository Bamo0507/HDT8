package hdt6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LectorPacientes {
    public static ArrayList<Paciente> leerPacientes(String nombreArchivo) {
        ArrayList<Paciente> pacientes = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String nombre = parts[0].trim();
                String sintoma = parts[1].trim();
                String codigoPrioridad = parts[2].trim();
                Paciente paciente = new Paciente(nombre, sintoma, codigoPrioridad);
                pacientes.add(paciente);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return pacientes;
    }
}

