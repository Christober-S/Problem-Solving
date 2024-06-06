package Day9;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i < n; i++) {
            boolean isPrime = true;
            //check to see if the number is prime
            for (int j=2; j < i ; j++)
            {
                if (i % j == 0)
                {
                    isPrime = false;
                    break;
                }
            }
                // print the number
            if (isPrime)
                System.out.print (i + " ");
        }
        }
    }
