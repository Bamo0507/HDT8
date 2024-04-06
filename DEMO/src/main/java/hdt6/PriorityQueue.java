package hdt6;

/**
 * Interfaz que define los métodos básicos que debe tener una cola de prioridad.
 * @param <E> El tipo de elementos que se almacenarán en la cola de prioridad, deben ser comparables entre sí.
 */
public interface PriorityQueue<E extends Comparable<E>> {
    
    /**
     * Comprueba si la cola de prioridad está vacía.
     * @return true si la cola está vacía, false en caso contrario.
     */
    boolean isEmpty();
    
    /**
     * Obtiene el número de elementos en la cola de prioridad.
     * @return El número de elementos en la cola de prioridad.
     */
    int size();
    
    /**
     * Elimina todos los elementos de la cola de prioridad.
     */
    void clear();
    
    /**
     * Agrega un elemento a la cola de prioridad.
     * @param item El elemento a agregar.
     */
    void add(E item);
    
    /**
     * Elimina y devuelve el elemento de mayor prioridad de la cola de prioridad.
     * @return El elemento de mayor prioridad.
     */
    E remove();
    
    /**
     * Realiza el proceso de percolación hacia arriba para mantener la propiedad de la cola de prioridad.
     * @param item La posición del nuevo elemento.
     */
    void percolateUp(int item);
    
    /**
     * Realiza el proceso de percolación hacia abajo para mantener la propiedad de la cola de prioridad.
     * @param item La posición del elemento a ajustar.
     */
    void pushDownRoot(int item);
}
