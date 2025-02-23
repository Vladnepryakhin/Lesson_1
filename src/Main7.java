public class Main7 {
    public static void main(String[] args) {
        visokocGod();
    }

    private static void visokocGod() {
    }

    private static void visokocGod(int a ) {
        int b = a % 4;
        int c = a % 400;
        int d = a % 100;
        if ( b == 0 || c == 0 ) {
            System.out.println("true");
        } else if ( d == 0 && c > 0){
            System.out.println("false");
        }else {
            System.out.println("false");
        }
    }
}
