package stack;

@SuppressWarnings("all")
public class ArrayListStack<E> implements Stackable<E>{
    private ArrayList<E> arrayList;
    

    // Default Constructor
    public ArrayListStack() {
        this.arrayList = new ArrayList<>();

    }

    // Copy Constructor
    public ArrayListStack(ArrayListStack<E> stack) {
        this.arrayList = new ArrayList<>(stack.arrayList);
    }

    @Override
    public boolean isEmpty() {
        return this.arrayList.isEmpty();
    }

    @Override
    public void push(E element) {
        this.arrayList.add(element);
    }

    @Override
    public E pop() {
        E target = this.arrayList.get(this.arrayList.size() - 1);
        this.arrayList.remove(this.arrayList.size() - 1);
        return target;
    }

    @Override
    public E top() {
        return this.arrayList.get(this.arrayList.size() - 1);
    }
}
