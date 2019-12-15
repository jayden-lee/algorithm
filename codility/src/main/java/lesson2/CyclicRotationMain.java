package lesson2;

import java.util.Arrays;

public class CyclicRotationMain {

    public static void main(String[] args) {
        int[] A = new int[]{3};
        int k = 5;

        int size = A.length;

        if (A.length == 0) {
            System.out.println(A);
        }

        if (k >= A.length) {
            k %= A.length;
        }

        if (k == 0) {
            System.out.println(A);
        }

        int[] result = new int[size];

        for (int i = 0; i < size; i++) {
            int index = i + k;

            if (index >= size) {
                result[index - size] = A[i];
            } else {
                result[index] = A[i];
            }
        }

        System.out.println(Arrays.toString(result));
    }
}
