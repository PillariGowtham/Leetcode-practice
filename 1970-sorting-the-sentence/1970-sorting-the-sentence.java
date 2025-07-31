class Solution {
    public String sortSentence(String s) {
        String arr[]=s.split(" ");
        String b[]=new String[arr.length];
        for(String a:arr){
            int n=a.length();
            int pos=a.charAt(n-1)-'1';
            b[pos]=a.substring(0,n-1);
        }
        return String.join(" ",b);
    }
}