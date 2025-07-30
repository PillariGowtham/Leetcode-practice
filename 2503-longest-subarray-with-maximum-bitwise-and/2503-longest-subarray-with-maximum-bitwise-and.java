class Solution {
    public int longestSubarray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
        }
        int count=0,ans=1;
        for(int i=0;i<n;i++){
            if(nums[i]==max){
                count++;
            }
            else{
                if(ans<count){
                    ans=count;
                }
                count=0;
            }
        }
        ans=Math.max(ans,count);
        return ans;
    }
}