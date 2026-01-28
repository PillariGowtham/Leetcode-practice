class Solution {
    public int totalMoney(int n) {
        int total=0;
        int a=n/7;
        for(int i=0;i<a;i++){
            int b=i+1;
            for(int j=b;j<b+7;j++){
                total+=j;
            }
        }
        int b=n%7,x=1+a;
        for(int i=0;i<b;i++){
            total+=x;
            x++;
        }
        return total;
    }
}