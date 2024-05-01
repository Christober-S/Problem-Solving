package Day6;

import java.util.Arrays;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 2, 4, 6, 7, 3};
        int n = arr.length;
        int j = 0;
        for (int i = 1 ; i < n ; i++) {
          if (arr[i] != arr[j]){
              j++;
              arr[j]=arr[i];
          }
        }
        System.out.println(Arrays.toString(arr));
    }
}
