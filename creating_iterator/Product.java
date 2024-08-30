package creating_iterator;
public class Product {
    private int pid;
    private String name;

    public Product(int pid, String name) {
        this.pid = pid;
        this.name = name;
    }

    public String toString() {
        return this.pid + ", " + this.name;
    }
    
}
