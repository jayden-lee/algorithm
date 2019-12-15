package lesson4;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOneMain {

    public static void main(String[] args) {
        int[] A = new int[]{1, 3, 1, 4, 2, 3, 5, 4};
        int X = 5;

        Set<Integer> set = new HashSet<>();
        int index = -1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= X) {
                set.add(A[i]);

                if (set.size() == X) {
                    index = i;
                    break;
                }
            }
        }

        if (index > 0) {
            System.out.println(index);
        } else {
            System.out.println(-1);
        }
    }
}
