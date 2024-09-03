package arrayList;

public interface CustomList<E> {
    
    void add(E e);
    E get(int index);
    int size();
    E remove(int index);
    boolean isEmpty();
    void clear();
}
