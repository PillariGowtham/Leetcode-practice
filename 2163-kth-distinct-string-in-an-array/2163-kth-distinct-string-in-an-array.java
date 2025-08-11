class Solution {
    public String kthDistinct(String[] arr, int k) {
        LinkedHashMap<String,Integer> h=new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++){
            h.put(arr[i],h.getOrDefault(arr[i],0)+1);
        }
        for(String s:h.keySet()){
            if(h.get(s)==1){
                k--;
                if(k==0){
                    return s;
                }
            }
        }
        return "";
    }
}