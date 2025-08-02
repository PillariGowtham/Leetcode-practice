class Solution {
    public String maximumOddBinaryNumber(String s) {
        int c=0;
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch=='1'){
                c++;
                sb.append(ch);
            }
        }
        sb.deleteCharAt(sb.length()-1);
        for(int i=0;i<s.length()-c;i++){
            sb.append('0');
        }
        sb.append('1');
        return sb.toString();
    }
}