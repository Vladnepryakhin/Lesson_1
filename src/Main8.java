import java.util.Arrays;

public class Main8 {
    public static void main(String[] args) {
        massive();
    }

    private static void massive() {
        int[] arr = {1,0,1,0,1,0,1};
        int b = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr [i] = 0;
            }else {
                arr [i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
