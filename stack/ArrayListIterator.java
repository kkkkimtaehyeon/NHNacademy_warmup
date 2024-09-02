package stack;

import java.util.Iterator;

public class ArrayListIterator<E> implements Iterator<E> {

    ArrayList<E> arrayList;
    int idx = 0;

    public ArrayListIterator(ArrayList<E> arrayList) {
        this.arrayList = arrayList;

    }

    @Override
    public boolean hasNext() {
        if (this.idx == this.arrayList.idx) {
            this.idx = 0;
            return false;
        }
        return true;
    }

    @Override
    public E next() {
        return this.arrayList.get(idx++);
    }
}
