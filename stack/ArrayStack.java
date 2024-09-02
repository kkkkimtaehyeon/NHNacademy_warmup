package stack;

@SuppressWarnings("all")
public class ArrayStack<E> implements Stackable<E>{
    // private E[] elements;
    // private int index = 0;
    private ArrayList<E> arrayList;
    

    // Default Constructor
    public ArrayStack() {
        //this.elements = (E[]) new Object[10];
        this.arrayList = new ArrayList<>();

    }

    // Copy Constructor
    public ArrayStack(ArrayStack<E> stack) {
        //this.elements = stack.elements.clone();
        this.arrayList = new ArrayList<>(stack.arrayList);
    }

    @Override
    public boolean isEmpty() {
        //return this.index == 0;
        return this.arrayList.isEmpty();
    }

    @Override
    public void push(E element) {
        //this.elements[index++] = element;
        this.arrayList.add(element);
    }

    @Override
    public E pop() {
        //return this.elements[--index];
        return this.arrayList.pop();
    }

    @Override
    public E top() {
        //return this.elements[index - 1];
        return this.arrayList.get(this.arrayList.size() - 1);
    }

    


}
