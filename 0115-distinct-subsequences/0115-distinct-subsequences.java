class Solution {
    public int f(int i,int j,String s,String t,int[][] dp){
        if(j>=t.length())return 1;
        if(i>=s.length())return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(s.charAt(i)==t.charAt(j)){
            dp[i+1][j+1]=f(i+1,j+1,s,t,dp);
            dp[i+1][j]=f(i+1,j,s,t,dp);
            return dp[i+1][j+1]+dp[i+1][j];
        }
        if(dp[i+1][j]==-1){
            dp[i+1][j]=f(i+1,j,s,t,dp);
        }
        return dp[i+1][j];
    }
    public int numDistinct(String s, String t) {
        int[][] dp=new int[s.length()+1][t.length()+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return f(0,0,s,t,dp);
    }
}