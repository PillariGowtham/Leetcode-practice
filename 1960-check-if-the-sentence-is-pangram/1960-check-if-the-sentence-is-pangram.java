class Solution {
    public boolean checkIfPangram(String sentence) {
        char[] c=new char[26];
        for(int i=0;i<sentence.length();i++){
            char ch=sentence.charAt(i);
            c[ch-'a']=1;
        }
        for(int i=0;i<c.length;i++){
            if(c[i]==0){
                return false;
            }
        }
        return true;
    }
}