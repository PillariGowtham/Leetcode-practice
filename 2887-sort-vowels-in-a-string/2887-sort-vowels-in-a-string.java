class Solution {
    public String sortVowels(String s) {
        int n=s.length(),count=0,i=0;
        for(char c:s.toCharArray()){
            if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                count++;
            }
        }
        char ch[]=new char[count];
        for(char c:s.toCharArray()){
            if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                ch[i++]=c;
            }
        }
        Arrays.sort(ch);
        i=0;
        StringBuilder ans=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                ans.append(ch[i++]);
            }
            else{
                ans.append(c);
            }
        }
        return ans.toString();
    }
}