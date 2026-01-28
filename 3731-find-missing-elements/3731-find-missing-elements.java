class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        ArrayList<Integer> li=new ArrayList<Integer>();
        for(int i=min;i<=max;i++){
            boolean flag=false;
            for(int j=0;j<nums.length;j++){
                if(i==nums[j]){
                    flag=true;
                }
            }
            if(!flag){
                li.add(i);
            }
        }
        Collections.sort(li);
        return li;
    }
}