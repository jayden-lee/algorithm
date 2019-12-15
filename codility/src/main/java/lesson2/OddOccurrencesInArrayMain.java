package lesson2;

public class OddOccurrencesInArrayMain {

    public static void main(String[] args) {
        int[] A = new int[]{3, 8, 9, 7, 6};

        int result = 0;
        for (int number : A) {
            result ^= number;
        }

        System.out.println(result);
    }
}
