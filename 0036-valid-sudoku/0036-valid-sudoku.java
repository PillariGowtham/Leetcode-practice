class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    char ch=board[i][j];
                    board[i][j]='.';
                    if(!isSafe(board,i,j,ch)){
                        return false;
                    }
                    board[i][j]=ch;
                }
            }
        }
        return true;
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