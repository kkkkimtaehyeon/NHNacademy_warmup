import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

@SuppressWarnings("unchecked")
public class BinarySearch {

    public static <T extends Comparable<T>> T genericBinarySearch(Object arr, T value) {

        T result = null;
        if (arr instanceof List) {
            result = listBinarySearch((List<T>)arr, value);
        }
        else {
            result = arrayBinarySearch((T[])arr, value);
        }
        return result;
    }
    
    public static <T extends Comparable<T>> T arrayBinarySearch(T[] arr, T value) {
        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;
        int mid;
        while(left <= right) {
            mid = left + (right - left)/2;
            if (arr[mid].compareTo(value) > 0) {
                right = mid - 1;
            }
            else if (arr[mid].compareTo(value) < 0){
                left = mid + 1;
            }
            else {
                return arr[mid];
            }
        }
        return null;
    }

    public static <T extends Comparable<T>> T listBinarySearch(List<T> list, T value) {
        Collections.sort(list);
    
        int left = 0;
        int right = list.size() - 1;
        int mid;
        while(left <= right) {
            mid = left + (right - left)/2;
            if (list.get(mid).compareTo(value) > 0) {
                right = mid - 1;
            }
            else if (list.get(mid).compareTo(value) < 0){
                left = mid + 1;
            }
            else {
                return list.get(mid);
            }
        }
        return null;
    }



    public static void main(String[] args) {
        Integer[] arr = {5, 3, 2, 6, 1, 7, 9};
        int result = genericBinarySearch(arr, 7);
        System.out.println(result);


        List<Integer> list = new ArrayList<>(List.of(1,3,2,6,4,7,97,4));
        result = genericBinarySearch(list, 97);
        System.out.println(result);
    }
}
