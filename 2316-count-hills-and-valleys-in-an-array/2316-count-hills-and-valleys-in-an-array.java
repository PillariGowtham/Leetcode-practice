class Solution {
    public int countHillValley(int[] nums) {
        int n=nums.length;
        int count=0,prev=0,next=0;
        for(int i=1;i<n-1;i++){
            for(int j=i-1;j>=0;j--){
                if(nums[j]!=nums[i]){
                    prev=nums[j];
                    break;
                }
            }
            for(int j=i+1;j<n;j++){
                if(nums[j]!=nums[i]){
                    next=nums[j];
                    break;
                }
            }
            if(nums[i]!=nums[i-1]){
            if(prev<nums[i] && next<nums[i]){
                count++;
            }
            else if(prev>nums[i] && next>nums[i]){
                count++;
            }
            }
        }
        return count;
    }
}