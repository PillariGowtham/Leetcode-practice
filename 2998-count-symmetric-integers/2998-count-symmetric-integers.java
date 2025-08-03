class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int num = low; num <= high; num++) {
            if (isSymmetric(num)) {
                count++;
            }
        }
        return count;
    }

    private boolean isSymmetric(int num) {
        String s = String.valueOf(num);
        int n = s.length();
        
        // Symmetric numbers must have even number of digits
        if (n % 2 != 0) return false;

        int half = n / 2;
        int sumLeft = 0, sumRight = 0;

        for (int i = 0; i < half; i++) {
            sumLeft += s.charAt(i) - '0';
            sumRight += s.charAt(i + half) - '0';
        }
        return sumLeft == sumRight;
    }
}
