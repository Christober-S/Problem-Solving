package Day7;

public class SearchElement {
    public static void main(String[] args) {
        int arr[] = {1, 2, 8, 3, 4, 6, 9};
        int target = 4;

        for (int i = 0; i<arr.length; i++){
            if(arr[i] == target){
                System.out.println("The element present in the : "+i+" index");
            }
        }
    }
}
