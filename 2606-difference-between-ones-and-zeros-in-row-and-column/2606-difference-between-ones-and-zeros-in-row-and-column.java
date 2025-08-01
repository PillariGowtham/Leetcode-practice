class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int dif[][]=new int[n][m];
        int row[]=new int[n];
        int col[]=new int[m];
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    count++;
                }
            }
            row[i]=count;
        }
        for(int i=0;i<m;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(grid[j][i]==1){
                    count++;
                }
            }
            col[i]=count;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dif[i][j]=2*row[i]+2*col[j]-n-m;
            }
        }
        return dif;
    }
}