public class SingletonClass {
    private static SingletonClass instance;
    private int id;

    private SingletonClass() {}

    public static SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public synchronized int nextId() {
        return this.id++;
    }

    
}

class Test{
    public static void main(String[] args) {
        SingletonClass singleton1 = SingletonClass.getInstance();
        SingletonClass singleton2 = SingletonClass.getInstance();

        if (singleton1 == singleton2) {
            System.out.printf("sigleton 1(%s) and sigleton 2(%s) is the same!\n", singleton1, singleton2);
        }else {
            System.out.printf("sigleton 1(%s) and sigleton 2(%s) is not sthe same!\n", singleton1, singleton2);
        }

        System.out.println(singleton1.nextId());
        System.out.println(singleton2.nextId());    
    }
}
