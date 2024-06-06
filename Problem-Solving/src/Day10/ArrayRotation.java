package Day10;

import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};

        int rotation[] = new int[arr.length];

        int first = arr[0];
        int last = arr[arr.length-1];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }

//        arr[0] = first;
//        arr[arr.length-1] = last;
        System.out.println(Arrays.toString(arr));
    }
}
