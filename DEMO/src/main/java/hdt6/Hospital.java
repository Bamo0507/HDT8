package hdt6;

/**
 * Clase que representa un hospital con una cola de pacientes para la atención.
 */
public class Hospital {
    // Cola de pacientes para la atención en el hospital
    private VectorHeap<Paciente> colaPacientes = new VectorHeap<>();

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
