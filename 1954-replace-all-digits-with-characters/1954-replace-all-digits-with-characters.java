class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isDigit(c)){
                sb.append((char)(sb.charAt(sb.length() - 1) + (c - '0')));
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}