package arrayList;

public class CustomArrayList<E> implements CustomList<E> {
    E[] elementData;
    int size = 0;
    public CustomArrayList() {
        this.elementData = (E[]) new Object[10];
    }

    @Override
    public void add(E e) {
        if (this.size == this.elementData.length) {
            E[] tempArr = (E[])new Object[this.elementData.length];
            for(int i = 0; i < this.elementData.length; i++) {
                tempArr[i] = this.elementData[i];
            }
            this.elementData = (E[]) new Object[this.elementData.length+10];
                for(int i = 0; i < tempArr.length; i++) {
                    this.elementData[i] = tempArr[i];
            }
            
                    
        }
        this.elementData[size++] = e;
    }

    @Override
    public E get(int index) {
        return this.elementData[index];
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public E remove(int index) {
        E target = this.get(index);
        for(int i = index; i < size - 1; i++) {
            this.elementData[i] = elementData[i+1];
        }
        this.elementData[this.size--] = null;

        return target;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public void clear() {
        for(int i = 0; i < this.elementData.length; i++) {
            this.elementData[i] = null;
        }
        this.size = 0;
    }
}
