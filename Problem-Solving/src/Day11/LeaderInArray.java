package Day11;

import java.util.ArrayList;

public class LeaderInArray
{
    public static void main(String[] args) {
        int arr[] = {16, 17, 4, 3, 5, 2};
        int max = arr[arr.length-1];
        ArrayList <Integer> ans = new ArrayList<>();
        ans.add(arr[arr.length-1]);
        for (int i = arr.length-2; i >=0 ; i--) {
            if(arr[i]> max){
                ans.add(arr[i]);
                max= arr[i];
            }
        }
        //for showing the answer in the reverse order
        System.out.println(ans.reversed());
    }
}
