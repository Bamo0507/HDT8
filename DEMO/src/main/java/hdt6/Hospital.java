package hdt6;

import java.util.ArrayList;

public class Hospital {
    private VectorHeap<Paciente> colaPacientes = new VectorHeap<>();

    public void agregarPaciente(Paciente paciente){
        colaPacientes.add(paciente);
        System.out.println("Paciente agregado a la cola: " + paciente.getCodigoPrioridad() + " " + paciente.getNombre());
        System.out.println("Estado actual de la cola de pacientes: " + colaPacientes.size());
    }

    public void atenderPacientes(){
        while(!colaPacientes.isEmpty()){
            System.out.println("------------------------------------------------");
            Paciente pacienteActual = colaPacientes.remove();
            System.out.println("Actualmente se está atendiendo al paciente con los datos: ");
            System.out.println("- Nombre: " + pacienteActual.getNombre());
            System.out.println("- Enfermedad: " + pacienteActual.getSintoma());
            System.out.println("- Prioridad: " + pacienteActual.getCodigoPrioridad());
            System.out.println("-------------------------------------------------");
        }
    }

}
