package dfs_bfs;

public class Problem1 {

    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;
        int expectedResult = 5;

        int result = solution(numbers, target);

        if (expectedResult == result) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }

    public static int solution(int[] numbers, int target) {
        int answer = 0;

        answer = dfs(numbers, 0, 0, target);

        return answer;
    }

    public static int dfs(int[] numbers, int index, int sum, int target) {
        if (index == numbers.length) {
            return sum == target ? 1 : 0;
        }

        return dfs(numbers, index + 1, sum + numbers[index], target) +
            dfs(numbers, index + 1, sum - numbers[index], target);
    }
}
