// 배열로 스택 구현하기

import java.util.EmptyStackException;

public class MyStack {
    private int[] arr;


    public MyStack() {
        this.arr = new int[0];
    }

    public boolean isEmpty() {
        if (this.arr.length == 0) {
            return true;
        }
        return false;
    }

    public void push(int input) {
        int newLength = this.arr.length + 1;
        
        // 복사
        int[] tempArr = this.arr;
        this.arr = new int[newLength];

        for (int i = 0; i < tempArr.length; i++) {
            this.arr[i] = tempArr[i];
        }
        this.arr[newLength - 1] = input;
    }

    public int pop() {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }

        int newLength = this.arr.length - 1;

        // 복사
        int[] tempArr = this.arr;
        this.arr = new int[newLength];

        for(int i = 0; i < newLength; i++) {
            this.arr[i] = tempArr[i];
        }

        return tempArr[tempArr.length-1];
    }

    public int top() {
        return this.arr[this.arr.length - 1];
    }

}

class Test {
    public static void main(String[] args) {
        // MyStack stack = new MyStack();

        // stack.push(1);
        // stack.push(2);
        // stack.push(3);

        // System.out.println(stack.top());

        // while(!stack.isEmpty()) {
        //     System.out.println(stack.pop());
        // }
        

        // System.out.println(stack.top());
 
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
 
        // if(stack.isEmpty()) {
        //     System.out.println("stack is empty");
        // }
        // else {
        //     System.out.println("stack is not empty;");
        // }
    }
}