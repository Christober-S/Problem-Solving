package Day1;

import java.util.Arrays;

public class LeftRotatedArr {
    public static void main(String[] args) {
        int arr[] = {3, 2, 8, 5, 13};
        int n = arr.length;
        int frist = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = frist;
        System.out.println(Arrays.toString(arr));
    }
}
