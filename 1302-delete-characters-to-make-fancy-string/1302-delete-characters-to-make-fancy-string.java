class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        char ch=s.charAt(0);
        int count=0;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c==ch){
                count++;
            }
            else{
                count=1;
            }
            if(count<3){
                sb.append(c);
            }
            ch=s.charAt(i);
        }
        return sb.toString();
    }
}