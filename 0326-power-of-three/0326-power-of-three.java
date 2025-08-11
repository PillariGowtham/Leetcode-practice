class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false;  // no negative or zero
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
}
