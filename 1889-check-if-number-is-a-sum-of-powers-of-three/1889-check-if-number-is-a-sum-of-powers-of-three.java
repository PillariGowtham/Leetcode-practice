class Solution {
    public boolean checkPowersOfThree(int n) {
        String ans="";
        while(n>0){
            int temp=n%3;
            if(temp==2){
                return false;
            }
            n/=3;
        }
        return true;
        
    }
}