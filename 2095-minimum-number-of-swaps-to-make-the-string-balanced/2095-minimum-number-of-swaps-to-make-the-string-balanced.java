class Solution {
    public int minSwaps(String s) {
        int a=0,b=0,count=0;
        for(char c:s.toCharArray()){
            if(c=='['){
                a++;
            }
            else{
                b++;
            }
            if(a<b){
                for(int j=s.length()-1;j>=0;j--){
                    char ch=s.charAt(j);
                    if(ch=='['){
                        char temp=c;
                        c=ch;
                        ch=temp;
                        count++;
                        a++;
                        b--;
                        break;
                    }
                }
            }
        }
        return count;
    }
}