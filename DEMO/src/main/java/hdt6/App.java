package hdt6;

import java.util.ArrayList;

public class App {
    public static void main( String[] args )
    {
        Hospital hospital = new Hospital();
        LectorPacientes lector = new LectorPacientes();
        ArrayList<Paciente> pacientes = lector.leerPacientes("pacientes.txt");

        System.out.println("--------------- BIENVENIDO DOCTOR JUAN ---------------");
        for(Paciente p: pacientes){
            hospital.agregarPaciente(p);
        }
        System.out.println("------------------------------------------------");
        System.out.println("\nA continuación se le dará el orden de atención a sus pacientes :)\n");


        hospital.atenderPacientes();

        System.out.println("\nEso sería todo, vuelva mañana.");
        System.out.println("Feliz día!");
        System.out.println("------------------------------------------------");


    }
}
