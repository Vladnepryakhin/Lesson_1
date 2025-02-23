public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = -3;

        checkSumSign(a, b);
    }

    public static void checkSumSign(int a, int b) {
        int sum = a + b;

        if (sum > 0) {
            System.out.println("Сумма положительная");
        } else if (sum < 0) {
            System.out.println("Сумма отрицательная");
        }
    }
}