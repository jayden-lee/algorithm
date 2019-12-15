package lesson3;

import java.util.Arrays;

public class PermMissingElemMain {

    public static void main(String[] args) {
        int[] A = new int[]{2, 3, 1, 5};

        Arrays.sort(A);

        int k = -1;

        for (int i = 0; i < A.length; i++) {
            if ((i + 1) != A[i]) {
                k = i + 1;
                break;
            }
        }

        if (k < 0) {
            System.out.println(A.length + 1);
        } else {
            System.out.println(k);
        }
    }
}
