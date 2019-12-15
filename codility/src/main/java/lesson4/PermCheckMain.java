package lesson4;

import java.util.Arrays;

public class PermCheckMain {

    public static void main(String[] args) {
//        int[] A = new int[]{4, 1, 3, 2};
        int[] A = new int[]{4, 1, 3};

        Arrays.sort(A);

        int permutation = 1;
        for (int i = 0; i < A.length; i++) {
            if (i + 1 != A[i]) {
                permutation = 0;
                break;
            }
        }

        System.out.println(permutation);
    }
}
