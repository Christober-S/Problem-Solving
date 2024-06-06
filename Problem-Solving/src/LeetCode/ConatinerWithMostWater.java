package LeetCode;

public class ConatinerWithMostWater {


//    You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
//
//    Find two lines that together with the x-axis form a container, such that the container contains the most water.
//
//    Return the maximum amount of water a container can store.
//
//    Notice that you may not slant the container.
//
//    Input: height = [1,8,6,2,5,4,8,3,7]
//    Output: 49
//    Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
//    Example 2:
//
//    Input: height = [1,1]
//    Output: 1

    class Solution {
        public int maxArea(int[] height) {
            int max_Area = 0;
            int a_pointer = 0;
            int b_pointer = height.length-1;

            while(a_pointer < b_pointer){
                if(height[a_pointer] < height[b_pointer]){
                    max_Area = Math.max(max_Area, height[a_pointer]
                            *(b_pointer-a_pointer));
                    a_pointer++;
                }
                else{
                    max_Area = Math.max(max_Area, height[b_pointer]*(b_pointer-a_pointer));
                    b_pointer--;
                }
            }
            return max_Area;
        }
    }
}
