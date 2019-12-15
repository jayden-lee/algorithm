package fibonacci;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Main {

    private static Map<Integer, BigInteger> map = new HashMap<>();

    static {
        map.put(0, BigInteger.ZERO);
        map.put(1, BigInteger.ONE);
        map.put(2, BigInteger.ONE);
    }

    public static BigInteger fibonacci(int n) {
        return map.computeIfAbsent(n,
            key -> fibonacci(n - 1).add(fibonacci(n - 2)));
    }

    public static void main(String[] args) {
        int N = 10;
        for (int i = 0; i < N; i++) {
            System.out.print(fibonacci(i));
            if (i != N - 1) {
                System.out.print(" -> ");
            }
        }
    }
}
