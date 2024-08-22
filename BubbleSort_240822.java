public class Warmup_240822 {
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 1, 2, 3, 8, 9, 10};
        bubbleSort(arr);

        for(int num: arr) {
            System.out.print(num + " ");
        }
    }
    
}
