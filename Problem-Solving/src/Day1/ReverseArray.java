package Day1;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        //Print the array in reverse order
//        int arr[] = {1, 2, 3, 4, 5};
//        for (int i = arr.length-1 ; i >= 0; i--) {
//            System.out.println(arr[i]+" ");
//        }

        // Reverse array using temp variable
        // Input array
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Input Array :" + Arrays.toString(array));
        // Declaring variables for array reversal
        int n = array.length;
        int[] temp = new int[n];
        // Reversal of array using Temporary variable
        for (int i = n - 1; i > -1; i--) {
            // Storing the elements of the input array in reverse order
            temp[n - i - 1] = array[i];
        }
        // Output
        System.out.println("Reversed Array :" + Arrays.toString(temp));
    }
}

