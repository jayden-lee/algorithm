package lesson3;

public class TapeEquilibriumMain {

    public static void main(String[] args) {
        int[] A = new int[]{3, 1, 2, 4, 3};

        int left = 0;
        int right = sum(A);
        int minCount = Integer.MAX_VALUE;

        for (int i = 0; i < A.length - 1; i++) {
            left += A[i];
            right -= A[i];
            minCount = Math.min(minCount, Math.abs(left - right));
        }

        System.out.println(minCount);
    }

    private static int sum(int[] A) {
        int sum = 0;
        for (int number : A) {
            sum += number;
        }
        return sum;
    }
}
