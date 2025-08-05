class Solution {
    public List<String> buildArray(int[] target, int n) {
        int l=0;
        ArrayList<String> al=new ArrayList<>();
        for(int i=1;i<=n && l<target.length;i++){
            if(i==target[l]){
                al.add("Push");
                l++;
            }
            else{
                al.add("Push");
                al.add("Pop");
            }
        }
        return al;
    }
}