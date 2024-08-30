package creating_iterator;

import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        Cart cart = new Cart();

        cart.add(new Product(1, "빵"));
        cart.add(new Product(2, "우유"));
        cart.add(new Product(3, "치킨"));
        CartIterator iterator = new CartIterator(cart.products);

        Collections.shuffle(cart.getProducts());

        while(iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }

        

    }
    
}
