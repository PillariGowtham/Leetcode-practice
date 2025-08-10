class Solution {
    public boolean reorderedPowerOf2(int n) {
        int[] freqN = digitCount(n);

        for (int i = 0; i < 31; i++) {
            if (Arrays.equals(freqN, digitCount(1 << i))) {
                return true;
            }
        }
        return false;
    }

    private int[] digitCount(int num) {
        int[] count = new int[10];
        while (num > 0) {
            count[num % 10]++;
            num /= 10;
        }
        return count;
    }
}
