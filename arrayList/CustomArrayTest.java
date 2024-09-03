package arrayList;

public class CustomArrayTest {
    public static void main(String[] args) {
        CustomList<Integer> customList = new CustomArrayList<>();
        customList.add(1);
        customList.add(2);
        customList.add(3);

        // for(int i = 0; i < customList.size(); i++) {
        //     System.out.println(customList.get(i));
        // }

        System.out.println(customList.remove(0));
        System.out.println(customList.remove(0));
        System.out.println(customList.remove(0));

        if (customList.isEmpty()) {
            System.out.println("empty!");
        }
        else {
            System.out.println("not empty");
        }
    }
}
