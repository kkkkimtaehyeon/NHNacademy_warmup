package genericBubbleSort;

public class GenericBubbleSort {
    public static <T extends Comparable<T>> void genericBubbleSort(T[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length -1 -i; j++) {
                if (arr[j].compareTo(arr[j+1]) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] stringArr = {"b", "c", "a", "x", "z", "d", "o"};
        Integer[] integerArr = {3, 5, 1, 2, 4, 3, 4, 5, 6,1, 2,3};

        genericBubbleSort(stringArr);
        genericBubbleSort(integerArr);

        for(String s: stringArr) {
            System.out.print(s + " ");
        }

        System.out.println();

        for(int i: integerArr) {
            System.out.print(i + " ");
        }
    }
}