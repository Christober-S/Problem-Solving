package Day10;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 8, 7, 9};
        int another[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            another[i] = arr[i];
        }
        System.out.println(Arrays.toString(another));
    }
}
