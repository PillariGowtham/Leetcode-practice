class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int l=0,r=0,sum=0,max=0,maxsum=0;
        HashSet<Integer> h=new HashSet<>();
        while(r<nums.length){
            while(h.contains(nums[r])){
                sum-=nums[l];
                h.remove(nums[l]);
                l++;
            }
            sum+=nums[r];
            h.add(nums[r]);
            maxsum=Math.max(sum,maxsum);
            r++;
        }
        return maxsum;
    }
}