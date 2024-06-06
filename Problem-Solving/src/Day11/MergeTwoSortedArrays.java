package Day11;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int arr1[] = {2, 4, 9};
        int arr2[] = {3, 6, 8, 10};
        int n = arr1.length;
        int m = arr2.length;
        int i = 0, j = 0, k = 0;
        int ans[] = new int[n + m];
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                ans[k] = arr1[i];
                i++;
            } else {
                ans[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < n) {
            ans[k] = arr1[i];
            i++;
            k++;
        }
        while (j < m) {
            ans[k] = arr2[j];
            j++;
            k++;
        }
        System.out.println("The merged array is: " + Arrays.toString(ans));
    }
}
