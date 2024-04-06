package hdt6;

import java.util.PriorityQueue;

public class HospitalJCF {
    // Cola de pacientes para la atención en el hospital
    //IMPLEMENTACIÓN DEL HOSPITAL CON EL PRIORITY QUEUE DEL JCF
    private PriorityQueue<Paciente> colaPacientes = new PriorityQueue<>();

    /**
     * Agrega un paciente a la cola de pacientes del hospital.
     * @param paciente El paciente a agregar.
     */
    public void agregarPaciente(Paciente paciente){
        colaPacientes.add(paciente);
        System.out.println("Paciente agregado a la cola: " + paciente.getCodigoPrioridad() + " " + paciente.getNombre());
        System.out.println("Estado actual de la cola de pacientes: " + colaPacientes.size());
    }

    /**
     * Atiende a los pacientes en la cola de pacientes del hospital.
     */
    public void atenderPacientes(){
        if(colaPacientes.isEmpty()){
            System.out.println("POR ESTO ES");
        }
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
