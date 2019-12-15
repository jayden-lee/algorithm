package lesson3;

public class FrogJmpMain {

    public static void main(String[] args) {
        int X = 10;
        int Y = 85;
        int D = 30;

        int result = (Y - X) % D;
        if (result == 0) {
            System.out.println(result);
        } else {
            System.out.println(result + 1);
        }
    }
}
