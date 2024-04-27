package Day2;

public class SwapVar {
    public static void main(String[] args) {
        // Swap 2 variable using temp
        int a = 10;
        int b = 20;
//        int temp = a;
//        a = b;
//        b = temp;
//        System.out.println(a);
//        System.out.println(b);

        //Swap 2 variable without using 3rd variable
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }
}
