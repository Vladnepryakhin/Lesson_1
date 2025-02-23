public class Main2 {
    public static void main(String[] args) {
        int value = 0;

        printColor(value);
    }

    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Red");
        } else if (value > 0 && value <= 100) {
            ;
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
    }
}