class Solution {
    public int maxDepth(String s) {
        int c=0,max=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                c++;
            }
            if(max<c){
                max=c;
            }
            if(ch==')'){
                c--;
            }
        }
        return max;
    }
}