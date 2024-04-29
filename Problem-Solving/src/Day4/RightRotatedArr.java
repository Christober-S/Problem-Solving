package Day1;

import java.util.Arrays;

public class RightRotatedArr {
    public static void main(String[] args) {
        int arr[] = { 2, 9, 3, 2, 34};
        int n = arr.length;
        int last = arr[n - 1];
        for (int i = n-1; i > 0 ; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = last;
        System.out.println(Arrays.toString(arr));
    }
}
