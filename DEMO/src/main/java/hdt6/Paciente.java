package hdt6;

/**
 * Clase que representa a un paciente en el hospital.
 * Implementa la interfaz Comparable para permitir la comparación entre pacientes.
 */
public class Paciente implements Comparable<Paciente> {
    private String nombre;
    private String sintoma;
    private String codigoPrioridad;

    /**
     * Constructor de la clase Paciente.
     * @param nombre El nombre del paciente.
     * @param sintoma El síntoma del paciente.
     * @param codigoPrioridad El código de prioridad del paciente.
     */
    public Paciente(String nombre, String sintoma, String codigoPrioridad) {
        this.nombre = nombre;
        this.sintoma = sintoma;
        this.codigoPrioridad = codigoPrioridad;
    }

    /**
     * Método para obtener el nombre del paciente.
     * @return El nombre del paciente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para establecer el nombre del paciente.
     * @param nombre El nombre del paciente.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener el síntoma del paciente.
     * @return El síntoma del paciente.
     */
    public String getSintoma() {
        return sintoma;
    }

    /**
     * Método para establecer el síntoma del paciente.
     * @param sintoma El síntoma del paciente.
     */
    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    /**
     * Método para obtener el código de prioridad del paciente.
     * @return El código de prioridad del paciente.
     */
    public String getCodigoPrioridad() {
        return codigoPrioridad;
    }

    /**
     * Método para establecer el código de prioridad del paciente.
     * @param codigoPrioridad El código de prioridad del paciente.
     */
    public void setCodigoPrioridad(String codigoPrioridad) {
        this.codigoPrioridad = codigoPrioridad;
    }

    /**
     * Método de comparación para ordenar los pacientes por su código de prioridad.
     * @param otroPaciente Otro paciente con el que se compara.
     * @return Un valor negativo si este paciente tiene una prioridad menor,
     *         un valor positivo si este paciente tiene una prioridad mayor,
     *         o cero si ambos pacientes tienen la misma prioridad.
     */
    @Override
    public int compareTo(Paciente otroPaciente){
        return this.codigoPrioridad.compareTo(otroPaciente.getCodigoPrioridad());
    }
}
