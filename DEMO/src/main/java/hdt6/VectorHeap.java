package hdt6;

import java.util.Vector;

/**
 * Implementación de una cola de prioridad utilizando un Vector como estructura de datos subyacente.
 * @param <E> El tipo de elementos que se almacenarán en la cola de prioridad, deben ser comparables entre sí.
 */
public class VectorHeap<E extends Comparable<E>> implements PriorityQueue<E> {

    private Vector<E> data = new Vector<E>();

    /**
     * Comprueba si la cola de prioridad está vacía.
     * @return true si la cola está vacía, false en caso contrario.
     */
    public boolean isEmpty(){
        return data.isEmpty();
    }

    /**
     * Obtiene el número de elementos en la cola de prioridad.
     * @return El número de elementos en la cola de prioridad.
     */
    public int size(){
        return data.size();
    }

    /**
     * Elimina todos los elementos de la cola de prioridad.
     */
    public void clear(){
        data.clear();
    }

    /**
     * Agrega un elemento a la cola de prioridad.
     * @param item El elemento a agregar.
     */
    public void add(E item){
        data.add(item);
        percolateUp(data.size() -1);
    }

    /**
     * Elimina y devuelve el elemento de mayor prioridad de la cola de prioridad.
     * @return El elemento de mayor prioridad, o null si la cola está vacía.
     */
    public E remove(){
        if (data.isEmpty()){
            return null;
        }
        E minVal = data.get(0);
        data.set(0, data.get(data.size() -1));
        data.remove(data.size() -1);
        if(data.size() > 1){
            pushDownRoot(0);
        }
        return minVal;
    }

    /**
     * Realiza el proceso de percolación hacia arriba para mantener la propiedad de la cola de prioridad.
     * @param leaf La posición del nuevo elemento.
     */
    public void percolateUp(int leaf){
        int parent = (leaf -1)/2;
        E value = data.get(leaf);
        while(leaf>0 && value.compareTo(data.get(parent)) < 0){
            data.set(leaf, data.get(parent));
            leaf = parent;
            parent = (leaf-1)/2;
        }
        data.set(leaf, value);
    }

    /**
     * Realiza el proceso de percolación hacia abajo para mantener la propiedad de la cola de prioridad.
     * @param root La posición del elemento a ajustar.
     */
    public void pushDownRoot(int root){
        E value = data.get(root);
        int child = 2*root+1;
        while(child<data.size()){
            if (child + 1 < data.size() && data.get(child + 1).compareTo(data.get(child))<0){
                child++;
            } 
            if(value.compareTo(data.get(child))<=0){
                break;
            }
            data.set(root, data.get(child));
            root = child;
            child = 2*root+1;
        }
        data.set(root, value);
    }
}
