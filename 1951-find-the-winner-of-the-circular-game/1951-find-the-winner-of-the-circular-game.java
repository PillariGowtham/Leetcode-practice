class Solution {
    public int findTheWinner(int n, int k) {
        int winner = 0; // 0-indexed position of the winner
        for (int i = 1; i <= n; i++) {
            winner = (winner + k) % i;
        }
        return winner + 1; // convert from 0-indexed to 1-indexed
    }
}
