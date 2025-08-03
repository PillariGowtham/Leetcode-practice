class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
        int n=nums1.length;
        for(int i=0;i<n;i++){
            min1=Math.min(min1,nums1[i]);
        }
        for(int i=0;i<n;i++){
            min2=Math.min(min2,nums2[i]);
        }
        return min2-min1;
    }
}