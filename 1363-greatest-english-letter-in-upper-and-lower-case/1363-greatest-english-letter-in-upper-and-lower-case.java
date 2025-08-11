class Solution {
    public String greatestLetter(String s) {
        int small[]=new int[26];
        int cap[]=new int[26];
        for(char c:s.toCharArray()){
            if(c>='a' && c<='z'){
                small[c-'a']=1;
            }
            else{
                cap[c-'A']=1;
            }
        }
        for(int i=25;i>=0;i--){
            if(small[i]==1 && cap[i]==1){
                char c=(char)(i+'A');
                return c+"";
            }
        }
        return "";
    }
}