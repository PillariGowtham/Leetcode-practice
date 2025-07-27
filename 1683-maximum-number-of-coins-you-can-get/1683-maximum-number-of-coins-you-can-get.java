class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int i=0,n=piles.length-2;
        int sum=0;
        while(i<n){
            sum+=piles[n];
            n-=2;
            i++;
        }
        return sum;
    }
}