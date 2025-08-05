class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> h=new HashMap<>();
        for(String s:strs){
            char c[]=s.toCharArray();
            Arrays.sort(c);
            String x=new String(c);
            h.putIfAbsent(x,new ArrayList<>());
            h.get(x).add(s);
        }
        return new ArrayList<>(h.values());
    }
}