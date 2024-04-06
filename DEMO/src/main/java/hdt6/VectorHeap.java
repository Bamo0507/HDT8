package hdt6;

import java.util.Vector;

public class VectorHeap<E extends Comparable<E>> implements PriorityQueue<E> {

    private Vector<E> data = new Vector<E>();

    public boolean isEmpty(){
        return data.isEmpty();
    }

    public int size(){
        return data.size();
    }

    public void clear(){
        data.clear();
    }

    public void add(E item){
        data.add(item);
        percolateUp(data.size() -1);
    }

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

    public void percolateUp(int hoja){
        int padre = (hoja -1)/2;
        E value = data.get(hoja);
        while(hoja>0 && value.compareTo(data.get(padre)) < 0){
            data.set(hoja, data.get(padre));
            hoja = padre;
            padre = (hoja-1)/2;
        }
        data.set(hoja, value); // Asignar el valor correcto en la posición hoja
    }    

    public void pushDownRoot(int raiz){
        E value = data.get(raiz);
        int hijo = 2*raiz+1;
        while(hijo<data.size()){
            if (hijo + 1 < data.size() && data.get(hijo + 1).compareTo(data.get(hijo))<0){
                hijo++;
            } 
            if(value.compareTo(data.get(hijo))<=0){
                break;
            }
            data.set(raiz, data.get(hijo));
            raiz = hijo;
            hijo = 2*raiz+1;
            
        }
        data.set(raiz, value);
    }
}
