class Solution {
    public String getHappyString(int n, int k) {
        ArrayList<String> li=new ArrayList<>();
        helper(n,new StringBuilder(),li);
        if(k>li.size()){
            return "";
        }
        return li.get(k-1);
    }
    public static void helper(int n,StringBuilder sb,ArrayList<String> li){
        if(n<0){
            return;
        }
        if(n==0){
            li.add(sb.toString());
            return;
        }
        for(char ch='a';ch<='c';ch++){
            int len=sb.length();
            if(len==0 || sb.charAt(len-1)!=ch){
                sb.append(ch);
                helper(n-1,sb,li);
                sb.deleteCharAt(len);
            }
        }
    }
}