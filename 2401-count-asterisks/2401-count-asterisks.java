class Solution {
    public int countAsterisks(String s) {
        int a=0,count=0;
        for(char c:s.toCharArray()){
            if(c=='|' && a==1){
                a=0;
            }
            else if(c=='|'){
                a=1;
            }
            if(c=='*' && a==0){
                count++;
            }
        }
        return count;
    }
}