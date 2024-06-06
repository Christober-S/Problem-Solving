package Day7;

import java.util.Scanner;

public class ElementPresent {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};

        Scanner scanner = new Scanner(System.in);
        int ele = scanner.nextInt();
        int n = arr.length;
        int count = 0;

        for (int i = 0; i <n ; i++) {
            if(arr[i] == ele){
                count++;
//                System.out.println("The element is present in the array");
            }
        }
        if (count == 1){
            System.out.println("The element is present in the array");
        }
        else {
            System.out.println("the element is not present in te asrray");
        }

    }
}
