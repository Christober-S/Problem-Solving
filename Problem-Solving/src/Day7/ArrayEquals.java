package Day7;

public class ArrayEquals {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {1, 2, 3, 9, 5};
        int count = 0;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == arr2[i]){
                count ++;
            }
        }
        if (arr1.length == count){
            System.out.println("Same");
        }
    }
}
