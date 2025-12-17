class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] arr=new int[friends.length];
        int ind=0;
        for(int i=0;i<order.length;i++){
            int a=order[i];
            for(int j=0;j<friends.length;j++){
                if(friends[j]==a){
                    arr[ind++]=a;
                }
            }
        }
        return arr;
    }
}