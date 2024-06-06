package Day7;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};

        int reversedArr[] = new int[arr.length];
        int n = arr.length;

        for (int i = 0; i < arr.length; i++) {
                reversedArr[i] = arr[n - 1];
                n--;
        }
        System.out.println(Arrays.toString(reversedArr));
    }
}
