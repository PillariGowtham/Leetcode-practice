class Solution {
    public int findNumbers(int[] nums) {
        int c=0,ans=0;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            c=0;
            while(n>0){
                c++;
                n/=10;
            }
            if(c%2==0){
                ans++;
            }
        }
        return ans;
    }
}