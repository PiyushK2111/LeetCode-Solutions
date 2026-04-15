class Solution {
    public boolean isPalindrome(int number) {
        int reversed = 0;
        int original = number;

        if (number < 0) { 
            return false;
        }

        while (number != 0) {
            reversed = (reversed * 10) + number % 10;
            number /= 10;
        }

        if (reversed == original) {
            return true;
        } else {
            return false;
        }
    }
}
