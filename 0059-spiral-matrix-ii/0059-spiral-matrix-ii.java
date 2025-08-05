class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr=new int[n][n];
        int top=0,bottom=n-1;
        int left=0,right=n-1;
        int k=1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                    arr[top][i]=k++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                arr[i][right]=k++;
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    arr[bottom][i]=k++;
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    arr[i][left]=k++;
                }
                left++;
            }
        }
        return arr;
    }
}