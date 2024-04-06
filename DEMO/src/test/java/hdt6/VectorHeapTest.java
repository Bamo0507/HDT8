package hdt6;

// Importar las clases y métodos estáticos necesarios para las aserciones y configuración de las pruebas
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

// Importar las anotaciones necesarias de JUnit
import org.junit.Before;
import org.junit.Test;

// Clase de prueba para la clase VectorHeap
public class VectorHeapTest {
    private VectorHeap<Paciente> vectorHeap; // Declaración de la cola de prioridad

    // Método de configuración que se ejecuta antes de cada prueba
    @Before
    public void setUp() {
        vectorHeap = new VectorHeap<>(); // Inicialización de la cola de prioridad
    }

    // Prueba para verificar si la cola de prioridad está vacía
    @Test
    public void testIsEmpty() {
        assertTrue(vectorHeap.isEmpty()); // Asegurar que la cola de prioridad está vacía
    }

    // Prueba para verificar el tamaño de la cola de prioridad después de agregar elementos
    @Test
    public void testSize() {
        assertEquals(0, vectorHeap.size()); // Asegurar que el tamaño inicial de la cola de prioridad es 0
        vectorHeap.add(new Paciente("Juan", "Fiebre", "A")); // Agregar un paciente a la cola de prioridad
        vectorHeap.add(new Paciente("Maria", "Dolor de cabeza", "B")); // Agregar otro paciente a la cola de prioridad
        assertEquals(2, vectorHeap.size()); // Asegurar que el tamaño de la cola de prioridad es 2 después de agregar elementos
    }

    // Prueba para verificar si la cola de prioridad se vacía correctamente después de llamar al método clear
    @Test
    public void testClear() {
        vectorHeap.add(new Paciente("Juan", "Fiebre", "A")); // Agregar un paciente a la cola de prioridad
        vectorHeap.add(new Paciente("Maria", "Dolor de cabeza", "B")); // Agregar otro paciente a la cola de prioridad
        vectorHeap.clear(); // Vaciar la cola de prioridad
        assertTrue(vectorHeap.isEmpty()); // Asegurar que la cola de prioridad está vacía después de llamar al método clear
    }

    // Prueba para verificar la adición y eliminación de elementos en la cola de prioridad
    @Test
    public void testAddAndRemove() {
        vectorHeap.add(new Paciente("Juan", "Fiebre", "A")); // Agregar un paciente a la cola de prioridad
        vectorHeap.add(new Paciente("Maria", "Dolor de cabeza", "B")); // Agregar otro paciente a la cola de prioridad
        assertEquals(2, vectorHeap.size()); // Asegurar que el tamaño de la cola de prioridad es 2 después de agregar elementos
        assertEquals("A", vectorHeap.remove().getCodigoPrioridad()); // Asegurar que el paciente con prioridad 'A' es el primero en ser removido de la cola
        assertEquals("B", vectorHeap.remove().getCodigoPrioridad()); // Asegurar que el paciente con prioridad 'B' es el siguiente en ser removido de la cola
        assertTrue(vectorHeap.isEmpty()); // Asegurar que la cola de prioridad está vacía después de remover todos los elementos
    }

    // Prueba para verificar la adición y el orden de los elementos en la cola de prioridad
    @Test
    public void testAdd() {
        // Agregar pacientes con diferentes prioridades
        vectorHeap.add(new Paciente("Juan", "Fiebre", "B"));
        vectorHeap.add(new Paciente("Maria", "Dolor de cabeza", "A"));
        vectorHeap.add(new Paciente("Pedro", "Fractura", "C"));

        // Verificar el orden correcto de los pacientes en la cola de prioridad
        assertEquals("A", vectorHeap.remove().getCodigoPrioridad()); // Asegurar que el paciente con prioridad 'A' es el primero en ser removido de la cola
        assertEquals("B", vectorHeap.remove().getCodigoPrioridad()); // Asegurar que el paciente con prioridad 'B' es el siguiente en ser removido de la cola
        assertEquals("C", vectorHeap.remove().getCodigoPrioridad()); // Asegurar que el paciente con prioridad 'C' es el siguiente en ser removido de la cola
    }
}
