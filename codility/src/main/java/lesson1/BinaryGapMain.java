package lesson1;

public class BinaryGapMain {

    public static void main(String[] args) {
        int N = 1041;
        int count = 0;
        int maxCount = 0;

        String strNumber = Integer.toBinaryString(N);

        for (char ch : strNumber.toCharArray()) {
            if (ch == '0') {
                count++;
            } else {
                if (maxCount < count) {
                    maxCount = count;
                }
                count = 0;
            }
        }

        System.out.println(maxCount);
    }
}
