class Solution {
    public int countPartitions(int[] nums) {
        int n=nums.length,a=nums[0],b=0,c=0;
        for(int i=1;i<n;i++){
            b+=nums[i];
        }
        if((a-b)%2==0){
            c++;
        }
        for(int i=1;i<n-1;i++){
            a+=nums[i];
            b-=nums[i];
            if((a-b)%2==0){
                c++;
            }
        }
        return c;
    }
}