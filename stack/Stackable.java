package stack;

public interface Stackable<E> {

    // Access: if any elements in stack -> false  
    boolean isEmpty();

    void push(E element);

    E pop();

    E top();
}
