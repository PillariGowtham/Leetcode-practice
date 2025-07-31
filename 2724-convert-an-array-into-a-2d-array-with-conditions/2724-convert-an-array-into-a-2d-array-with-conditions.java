class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> lli=new ArrayList<>();
        HashMap<Integer,Integer> h=new HashMap<>();
        int max=0;
        for(int i=0;i<nums.length;i++){
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
            max=Math.max(max,h.get(nums[i]));
        }
        for(int i=0;i<max;i++){
            lli.add(new ArrayList<>());
        }
        for(int k:h.keySet()){
            for(int i=0;i<h.get(k);i++){
                lli.get(i).add(k);
            }
        }
        return lli;
    }
}