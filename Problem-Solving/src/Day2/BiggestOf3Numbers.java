package Day2;

public class BiggestOf3Numbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 50;
        int c = 30;
        if (a > b && a > c) {
            System.out.println("A is greater than b and c");
        }
        else if (b > a && b > c) {
            System.out.println("B is greater than a and c");
        }
        else {
            System.out.println("C is greater than a and c");
        }
    }
}
