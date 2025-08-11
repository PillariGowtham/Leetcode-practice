class Solution {
    public int[] productQueries(int n, int[][] queries) {
        List<Integer> pow = new  ArrayList<>();
        int MOD = 1000000007;
        String binary = Integer.toString(n,2);
        int m = binary.length();
        for(int i=m-1;i>=0;i--){
            if(binary.charAt(i)=='1'){
                int power = (int)Math.pow(2,m-i-1);
                pow.add(power);
            }
        }
        int arr[] = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int left = queries[i][0];
            int right = queries[i][1];
            long pro = 1;
            for(int j=left;j<=right;j++){
                pro = (pro*pow.get(j))%MOD;
            }
            arr[i] = (int)pro;
        }
        return arr;
    }
}