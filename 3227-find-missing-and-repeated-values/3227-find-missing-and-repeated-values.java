class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer> h=new HashSet<>();
        int[] result=new int[2];
        int n=grid.length,k=0;
        int[] arr=new int[n*n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[k++]=grid[i][j];
            }
        }
        Arrays.sort(arr);
        for(int i=0;i<n*n;i++){
            if(h.contains(arr[i])){
                result[0]=arr[i];
            }
            h.add(arr[i]);
            if(!h.contains(i+1)){
                result[1]=i+1;
            }
        }
        return result;
    }
}