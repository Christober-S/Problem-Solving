package Day3;

import java.util.Arrays;

public class ReverseArr2Poin {
    public static void main(String[] args) {
        int arr[] = {4, 2, 9, 8, 1, 3, 10};
        int i = 0;
        int j = arr.length - 1;
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }

}

