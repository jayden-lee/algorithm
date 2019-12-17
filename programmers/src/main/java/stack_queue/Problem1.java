package stack_queue;

import java.util.Arrays;

public class Problem1 {

    public static void main(String[] args) {
        int[] heights = {6, 9, 5, 7, 4};
        int[] result = solution(heights);
        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(int[] heights) {
        int num = heights.length;
        int[] answer = new int[num];

        for (int i = num - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (heights[j] > heights[i])
                    answer[i] = j + 1;
            }
        }
        return answer;
    }
}