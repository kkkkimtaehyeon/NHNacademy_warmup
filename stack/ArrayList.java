package stack;

import java.util.Arrays;
import java.util.Iterator;
@SuppressWarnings("unchecked")
public class ArrayList<E> implements List<E>
 {
    private E[] elements;
    private int index = 0;

    public ArrayList() {
        this.elements = (E[])new Object[10];
    }

    public ArrayList(ArrayList<E> list) {
        this.elements = list.elements;
    }

    @Override
    public void add(E item) {
        this.elements[this.index++] = item;
    }

    @Override
    public E get(int index) {
        return this.elements[index];
    }
    
    @Override
    public void remove(int index) {
        for(int i = index; i < this.index - 1; i++) {
            this.elements[i] = this.elements[i+1];
            this.elements[i+1] = null;
        }
        this.index--;
    }


    public E pop() {
        return this.elements[--this.index];
    }

    @Override
    public int size() {
        return this.index;
    }

    @Override
    public boolean isEmpty() {
        if (this.index == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void clear() {
        Arrays.fill(this.elements, null);

        for(int i = 0; i < this.elements.length; i++) {
            this.elements[i] = null;
        }
        this.index = 0;
    }

    @Override
    public Iterator<E> iterator() {
        //return new ArrayListIterator<>(this);
        return Arrays.stream(this.elements).filter(x -> x != null).iterator();
    }
}