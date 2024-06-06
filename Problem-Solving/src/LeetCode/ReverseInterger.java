package LeetCode;

public class ReverseInterger {

//    Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
//
//    Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
//
//
//
//    Example 1:
//
//    Input: x = 123
//    Output: 321
//    Example 2:
//
//    Input: x = -123
//    Output: -321
//    Example 3:
//
//    Input: x = 120
//    Output: 21


    class Solution {
        public int reverse(int x) {
            int ans = 0;
            int digit;
            while (x != 0) {
                digit = x % 10;
                x = x / 10;

                // Check for overflow before updating ans
                if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && digit > 7)) {
                    return 0;
                }
                if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && digit < -8)) {
                    return 0;
                }

                ans = ans * 10 + digit;
            }
            return ans;
        }
    }

}
