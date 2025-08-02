class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double min=100000;
        int n=nums.length;
        for(int i=0;i<n/2;i++){
            double a=(nums[i]+nums[n-i-1])/(double)2;
            min=Math.min(min,a);
        }
        return min;
    }
}