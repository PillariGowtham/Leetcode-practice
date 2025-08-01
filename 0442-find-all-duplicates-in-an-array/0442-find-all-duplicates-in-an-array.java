class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> h=new HashSet<>();
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(h.contains(nums[i])){
                li.add(nums[i]);
            }
            h.add(nums[i]);
        }
        return li;
    }
}