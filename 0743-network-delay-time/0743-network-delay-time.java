class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        int[][] cost=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                cost[i][j]=(i==j)?0:999;
            }
        }
        for(int[] time:times){
            int u=time[0]-1;
            int v=time[1]-1;
            cost[u][v]=time[2];
        }
        int[] dist=new int[n];
        boolean[] vis=new boolean[n];
        for(int i=0;i<n;i++){
            dist[i]=cost[k-1][i];
            vis[i]=false;
        }
        dist[k-1]=0;
        vis[k-1]=true;
        for(int i=1;i<n;i++){
            int min=999;
            int u=-1;
            for(int j=0;j<n;j++){
                if(!vis[j] && dist[j]<min){
                    min=dist[j];
                    u=j;
                }
            }
            if(u==-1){
                break;
            }
            vis[u]=true;
            for(int j=0;j<n;j++){
                if(!vis[j] && dist[u]+cost[u][j]<dist[j]){
                    dist[j]=dist[u]+cost[u][j];
                }
            }
        }
        int ans=0;
        for(int i=0;i<n;i++){
            if(dist[i]==999) return -1;
            ans=Math.max(ans,dist[i]);
        }
        return ans;
    }
}