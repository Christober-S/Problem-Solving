package Day5;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {2, 3, 1, 4, 5, 9, 7, 8, 7};

        int first = arr[0];
        int second = 0;
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            }
            else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }
        System.out.println(second);
    }
}
