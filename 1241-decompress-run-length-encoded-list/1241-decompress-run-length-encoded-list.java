class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<nums.length;i+=2){
            int f=nums[i];
            int val=nums[i+1];
            for(int j=0;j<f;j++){
                al.add(val);
            }
        }
        int[] arr=new int[al.size()];
        int j=0;
        for(int i:al){
            arr[j++]=i;
        }
        return arr;
    }
}