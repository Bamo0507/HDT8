package hdt6;

public interface PriorityQueue<E extends Comparable<E>> {
    boolean isEmpty();
    int size();
    void clear();
    void add(E item);
    E remove();
    void percolateUp(int item);
    void pushDownRoot(int item);
}
