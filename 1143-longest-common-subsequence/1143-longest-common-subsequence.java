class Solution {
    public int f(int i,int j,String a,String b,int[][] dp){
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(a.charAt(i)==b.charAt(j)){
            dp[i][j]=1+f(i-1,j-1,a,b,dp);
            return dp[i][j];
        }
        dp[i][j]=Math.max(f(i-1,j,a,b,dp),f(i,j-1,a,b,dp));
        return dp[i][j];
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        int[][] dp=new int[n][m];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return f(n-1,m-1,text1,text2,dp);
    }
}