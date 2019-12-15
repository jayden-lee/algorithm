package look_and_say_conway_sequence;

import java.util.Scanner;

/**
 * Look-and-Say Conway Sequence
 *
 * @author jayden-lee
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input");

        int startNum = scanner.nextInt();
        if (startNum < 1 || startNum > 100) {
            throw new IllegalArgumentException("첫 번째 숫자는 0보다 크고 100보다 작아야 합니다. (0 < R < 100)");
        }

        int lineNum = scanner.nextInt();
        if (lineNum < 1 || lineNum > 26) {
            throw new IllegalArgumentException("출력할 라인 숫자는 0보다 크고 26보다 작아야 합니다. (0 < L <= 25)");
        }

        String number = String.valueOf(startNum);

        for (int i = 1; i < lineNum; i++) {
            number = conwaySequence(number);
        }

        printResult(number);

        scanner.close();
    }

    private static String conwaySequence(String number) {
        StringBuilder result = new StringBuilder();

        int count = 1;
        char baseNum = number.charAt(0);
        number = number.substring(1) + " ";

        for (char compareNum : number.toCharArray()) {
            if (compareNum == baseNum) {
                count++;
            } else {
                result.append(count + "" + baseNum);
                count = 1;
                baseNum = compareNum;
            }
        }
        return result.toString();
    }

    private static void printResult(String result) {
        System.out.println();
        System.out.println("Output");
        for (char num : result.toCharArray()) {
            System.out.print(num + " ");
        }
    }
}