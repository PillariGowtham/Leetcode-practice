class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> hm=new HashMap<>();
        char x='a';
        for(int i=0;i<key.length();i++){
            if(!hm.containsKey(key.charAt(i)) && key.charAt(i)!=' '){
                hm.put(key.charAt(i),(char)x++);
            }
        }
        StringBuilder s=new StringBuilder();
        for(int i=0;i<message.length();i++){
            if(message.charAt(i)==' '){
                s.append(" ");
            }
            else{
            s.append(hm.get(message.charAt(i)));
            }
        }
        return s.toString();
    }
}