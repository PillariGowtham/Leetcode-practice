class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> li=new ArrayList<>();
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        nQueens(li,board,0,n);
        return li;
    }
    public static void nQueens(List<List<String>> lli, char[][] board, int row,int n){
        if(row==n){
            ArrayList<String> li=new ArrayList<>();
            for(char[] c:board){
                li.add(new String(c));
            }
            lli.add(li);
            return;
        }
        for(int j=0;j<n;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                nQueens(lli,board,row+1,n);
                board[row][j]='.';
            }
        }
    }
    public static boolean isSafe(char[][] a,int row,int c){
        for(int i=0;i<row;i++){
            if(a[i][c]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=c-1;i>=0 &&j>=0;i--,j--){
            if(a[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=c+1;i>=0 && j<a.length;i--,j++){
            if(a[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
}