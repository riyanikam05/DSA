class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int reverse = 0;
        int xcopy = x;

        while (x > 0) {
            reverse = (reverse*10) + (x % 10);  //x%10 finds out the last digit of x. reverse*10 shifts reverse to the left by adding a 0 to the right. For ex.: if reverse=12 then reverse*10=120.
            x /= 10;  //removes the last digit of x.
        }

        return reverse  == xcopy;
    }
}
