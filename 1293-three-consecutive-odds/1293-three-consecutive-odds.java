class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if ((num & 1) == 1) { // odd
                count++;
                if (count == 3) return true;
            } else {
                count = 0; // reset if even
            }
        }
        return false;
    }
}
