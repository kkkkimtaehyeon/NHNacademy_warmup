import java.util.Scanner;

public class RationalOperator {

    public static int[] plus(int[] left, int[] right) {
        int mother = left[1] * right[1];
        int child = left[0] * right[1] + right[0] * left[1];

        //int divider = gcd(child, mother);
        int divider = uclid(mother, child);

        return new int[]{child / divider, mother / divider};
    }

    public static int gcd(int child, int mother) {
        int max = child > mother ? child : mother;
        int divider = 1;
        for(int i = max; i >= 1; i--) {
            if (child % i == 0 && mother % i == 0) {
                divider = i;
                break;
            }
        }
        return divider;
    }

    public static int uclid(int a, int b) {
        if (b == 0) {
            return a;
        }
        return uclid(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] left = new int[2];
        int[] right = new int[2];

        for(int i = 0; i < 2; i++) {
            left[i] = sc.nextInt();
        }

        for(int i = 0; i < 2; i++) {
            right[i] = sc.nextInt();
        }

        int[] result = plus(left, right);
        System.out.println(result[0] + "/" + result[1]);
        sc.close();

    }
}