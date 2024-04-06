package hdt6;

import java.util.ArrayList;

/**
 * Clase principal que contiene el método main para ejecutar la aplicación.
 */
public class App {
    
    /**
     * Método principal de la aplicación.
     * @param args Argumentos de la línea de comandos (no utilizados en este caso).
     */
    public static void main(String[] args) {
        System.out.println("---FUNCIONAMIENTO DE ATENCION DE EMERGENCIAS PARA VECTORHEAP---");
        // Se crea una instancia de Hospital
        Hospital hospital = new Hospital();
        // Se crea una instancia de LectorPacientes para leer los datos de pacientes desde un archivo
        LectorPacientes lector = new LectorPacientes();
        // Se lee la información de los pacientes desde el archivo "pacientes.txt"
        ArrayList<Paciente> pacientes = lector.leerPacientes("pacientes.txt");

        // Se muestra un mensaje de bienvenida al doctor Juan
        System.out.println("--------------- BIENVENIDO DOCTOR JUAN ---------------");
        // Se agregan los pacientes al hospital
        for(Paciente p: pacientes){
            hospital.agregarPaciente(p);
        }
        System.out.println("------------------------------------------------");
        System.out.println("\nA continuación se le dará el orden de atención a sus pacientes :)\n");

        // Se atienden a los pacientes en el hospital
        hospital.atenderPacientes();

        // Se muestra un mensaje de despedida
        System.out.println("\nEso sería todo, vuelva mañana.");
        System.out.println("Feliz día!");
        System.out.println("------------------------------------------------");
        System.out.println("\n");

        System.out.println("---FUNCIONAMEINTO DE ATENCION DE EMERGENCIAS PARA PriorityQueue del JCF");

        // Se crea una instancia de HospitalJCF
        HospitalJCF hospitalJCF = new HospitalJCF();
        // Se crea una instancia de LectorPacientes para leer los datos de pacientes desde un archivo
        LectorPacientes lectorJCF = new LectorPacientes();
        // Se lee la información de los pacientes desde el archivo "pacientes.txt"
        ArrayList<Paciente> pacientesJCF = lectorJCF.leerPacientes("pacientes.txt");

        // Se muestra un mensaje de bienvenida al doctor Juan
        System.out.println("--------------- BIENVENIDO DOCTOR JUAN ---------------");
        // Se agregan los pacientes al hospital
        for(Paciente p: pacientesJCF){
            hospitalJCF.agregarPaciente(p);
        }
        System.out.println("------------------------------------------------");
        System.out.println("\nA continuación se le dará el orden de atención a sus pacientes :)\n");

        // Se atienden a los pacientes en el hospital
        hospitalJCF.atenderPacientes();

        // Se muestra un mensaje de despedida
        System.out.println("\nEso sería todo, vuelva mañana.");
        System.out.println("Feliz día!");
        System.out.println("------------------------------------------------");
    
    }
}
