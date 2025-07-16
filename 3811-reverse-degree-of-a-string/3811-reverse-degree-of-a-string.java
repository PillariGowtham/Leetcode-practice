class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int n=Math.abs(s.charAt(i)-'a'-26);
            sum=sum+(n*(i+1));
        }
        return sum;
    }
}