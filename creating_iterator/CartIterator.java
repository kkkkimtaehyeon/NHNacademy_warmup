package creating_iterator;

import java.util.Iterator;
import java.util.List;

public class CartIterator implements Iterator<Product>{
    List<Product> products;
    int idx = 0;

    public CartIterator(List<Product> products) {
        this.products = products;
    }

    @Override
    public boolean hasNext() {
        if(idx < products.size()) {
            return true;
        }
        return false;
    }

    @Override
    public Product next() {
        return this.products.get(idx++);
    }

    
}
