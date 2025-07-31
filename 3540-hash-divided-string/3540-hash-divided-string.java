class Solution {
    public String stringHash(String s, int k) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            int c=0,sum=0;
            while(c<k){
                sum+=(s.charAt(i)-'a');
                i++;
                c++;
            }
            i-=1;
            sb.append((char)(sum%26+'a'));
        }
        return sb.toString();
    }
}