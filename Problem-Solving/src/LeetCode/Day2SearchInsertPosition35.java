package LeetCode;

public class Day2SearchInsertPosition35 {
    public static void main(String[] args) {
        class Solution {
            public int searchInsert(int[] nums, int target) {
                int n = nums.length;

                int l = 0;
                int r = nums.length-1;

                while (l<=r){
                    int mid = l+r;

                    if(target == nums[mid]){
                        return mid;
                    }

                    if (target > nums[mid]){
                        l = mid + 1;
                    }
                    else {
                        r = mid - 1;
                    }
                }
                return l;
            }

        }
    }
}
