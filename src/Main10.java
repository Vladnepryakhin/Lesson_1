import java.util.Arrays;

public class Main10 {
    public static void main(String[] args) {
        massiveTyt();
    }

    private static void massiveTyt() {
        int [] arr = {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }
    }
}