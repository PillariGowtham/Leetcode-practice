class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int ans=0;
        for(int i=0;i<commands.size();i++){
            if(commands.get(i).equals("DOWN")){
                ans+=n;
            }
            else if(commands.get(i).equals("UP")){
                ans-=n;
            }
            else if(commands.get(i).equals("RIGHT")){
                ans++;
            }
            else{
                ans--;
            }
        }
        return ans;
    }
}