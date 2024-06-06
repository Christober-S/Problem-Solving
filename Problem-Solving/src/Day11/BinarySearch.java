package Day11;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5, 7, 11};
        int target = 1;
        System.out.println("The value in the position of : "+binarySearch(arr, target));
//      System.out.println(Arrays.binarySearch(arr, target)); It is an inbuilt function in Java
    }
    private static int binarySearch(int [] arr, int target){
        int low = 0;
        int high = arr.length-1;

        while (low <= high){
            int mid = (low + high) / 2;
            int midValue = arr[mid];

            if(target == midValue){
                return mid;
            }

            if (target < midValue){
                high = mid-1;

            } else {
                low = mid+1;
            }
        }
        return -1;
    }
}
