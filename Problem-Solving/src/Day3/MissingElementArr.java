package Day3;

public class MissingElementArr {
    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 6,5};
        int n = arr.length+1;

        int total = (n*(n+1));
        total = total / 2;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        int ans = total - sum;
        System.out.println(ans);
        System.out.println(total);
        System.out.println(sum);
        System.out.println(n);
    }
}
