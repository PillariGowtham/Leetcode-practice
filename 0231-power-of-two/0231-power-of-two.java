class Solution {
    public boolean isPowerOfTwo(int n) {
        long x=1;
        for(int i=1;x<=n;i++){
            if(x==n){
                return true;
            }
            x=(long)Math.pow(2,i);
        }
        return false;
    }
}