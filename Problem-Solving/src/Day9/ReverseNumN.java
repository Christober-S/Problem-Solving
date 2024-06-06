package Day9;

import java.util.Scanner;

public class ReverseNumN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number n : ");
        int n =  scanner.nextInt();
        for (int i = n; i >=1 ; i--) {
            System.out.println(i);
        }
    }
}
