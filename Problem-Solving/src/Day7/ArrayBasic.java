package Day7;

import java.util.Scanner;

public class ArrayBasic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[10];


        for (int i = 0; i<arr.length; i++)
        {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i+" ");
        }
    }
}
