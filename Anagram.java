public class Anagram {
    

    public static char[] toCharArray(String word) {
        char[] result = new char[word.length()];
        for(int i = 0; i < word.length(); i++) {
            result[i] = word.charAt(i);
        }
        return result;
    }

    public static char[] removeSpace(char[] array) {
        int count = 0;
        for(char c: array) {
            if(c != ' ') {
                count++;
            }
        }

        char[] result = new char[count];

        int idx = 0;
        for(char c: array) {
            if(c != ' ') {
                result[idx++] = c;
            }
        }

        return result;
    }

    public static void toLowerCase(char[] array) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] < 97) {
                array[i] = (char) (array[i] + 32);
            }
        }
    }

    public static void bubbleSort(char[] array) {
        int limit = array.length;
        for(int i = 0; i < limit - 1; i++) {
            for(int j = 0; j < limit - 1 - i; j++) {
                if(array[j] > array[j+1]) {
                    char temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static boolean isEqual(char[] array1, char[] array2) {
        if(array1.length != array2.length) {
            return false;
        }

        for(int i = 0; i < array1.length; i++) {
            if(array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAanagram(String word1, String word2) {
        char[] arr1 = removeSpace(toCharArray(word1));  
        char[] arr2 = removeSpace(toCharArray(word2));  

        toLowerCase(arr1);
        bubbleSort(arr1);
        toLowerCase(arr2);
        bubbleSort(arr2); 

        if(isEqual(arr1, arr2)) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        String word1 = "Everland";
        String word2 = "Lavender";

        System.out.println(isAanagram(word1, word2));
    }
}
