package stack;

public class Test {
    public static void main(String[] args) {
        // ArrayStack<String> stack = new ArrayStack<>();
        // stack.push("zero");
        // stack.push("ond");
        // stack.push("two");


        // System.out.println(stack.top());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(0);


        for(Integer n: list) {
            System.out.println(n);
        }
    }
}
