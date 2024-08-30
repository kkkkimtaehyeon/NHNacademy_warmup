package creating_iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Cart implements Iterable<Product>{
    protected List<Product> products;

    public Cart() {
        this.products = new ArrayList<>();
    }

    public void add(Product product) {
        this.products.add(product);
    }

    public List<Product> getProducts() {
        return this.products;
    }

    @Override
    public Iterator<Product> iterator() {
        return new CartIterator(this.products);
        
    }
    
}
