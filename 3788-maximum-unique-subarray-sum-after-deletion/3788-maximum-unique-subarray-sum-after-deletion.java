class Solution {
    public int maxSum(int[] nums) {
        HashSet<Integer> hs=new HashSet<Integer>();
        int sum=0,max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0 && !hs.contains(nums[i])){
                hs.add(nums[i]);
                sum+=nums[i]; 
            }
            max=Math.max(max,nums[i]);
        }
        if(hs.size()==0){
            return max;
        }
        return sum;
    }
}