class Solution {
    public int maxDistinct(String s) {
        int[] arr=new int[26];
        int c=0;
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)-'a']==0){
                c++;
            }
            arr[s.charAt(i)-'a']=1;

        }
        return c;
    }
}