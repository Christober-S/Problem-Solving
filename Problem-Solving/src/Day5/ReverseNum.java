package Day5;

public class ReverseNum{
    public static void main(String[] args) {
        int num = 563;
        int ans = 0;
        while (num > 0) {
            int digit = num % 10;
            ans = ans * 10 + digit;
            num = num / 10;
        }
        System.out.println(ans);
    }
}
