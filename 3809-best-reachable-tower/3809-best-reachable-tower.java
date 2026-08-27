class Solution {
    public int[] bestTower(int[][] towers, int[] center, int radius) {
        int[] ans=new int[2];
        Arrays.fill(ans,-1);
        int quality=-1;
        for(int i=0;i<towers.length;i++){
            int distance=Math.abs(towers[i][0]-center[0])+Math.abs(towers[i][1]-center[1]);
            if(quality<=towers[i][2] && distance<=radius){
                if(quality==towers[i][2]){
                    if((towers[i][0]<ans[0]) || (towers[i][0]==ans[0] && towers[i][1]<ans[1])){
                        ans[0]=towers[i][0];
                        ans[1]=towers[i][1];
                    }
                }
                else{
                    quality=towers[i][2];
                    ans[0]=towers[i][0];
                    ans[1]=towers[i][1];
                }
            }
        }
        return ans;
    }
}