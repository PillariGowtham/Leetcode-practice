class Solution {
    public boolean solveSudoku(char[][] board) {
        return sudoko(board,0,0);
    }
    public static boolean sudoko(char[][] mat, int row,int col){
        if(row==9){
            return true;
        }
        int nr = row;
        int nc = col+1;
        if(nc==9){
            nc = 0;
            nr = nr+1;
        }
        if(mat[row][col]!='.'){
            return sudoko(mat,nr,nc);
        }
        for(char i='1';i<='9';i++){
            if(isSafe(mat,row,col,i)){
                mat[row][col] = i;
                if(sudoko(mat,nr,nc)){
                    return true;
                }
                mat[row][col] = '.';
            }
        }
        return false;
    }
    public static boolean isSafe(char[][] mat, int st, int ed, char val){
        int gx = st/3;
        gx = gx*3;
        int gy = ed/3;
        gy = gy*3;
        for(int i=gx;i<gx+3;i++){
            for(int j=gy;j<gy+3;j++){
                if(mat[i][j]==val){
                    return false;
                }
            }
        }
        for(int i=0;i<9;i++){
            if(mat[i][ed]==val){
                return false;
            }
        }
        for(int j=0;j<9;j++){
            if(mat[st][j]==val){
                return false;
            }
        }
        return true;
    }
}