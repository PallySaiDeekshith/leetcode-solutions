class Solution {
    public int uniquePaths(int m, int n) {
        int[][] a=new int[m][n];
        int i=0;
        for(int j=0;j<n;j++){
            a[i][j]=1;
        }
        int j=0;
        for(int k=0;k<m;k++){
            a[k][j]=1;
        }
        for(i=1;i<m;i++){
            for(j=1;j<n;j++){
                a[i][j]=a[i-1][j]+a[i][j-1];
            }
        }
        return a[m-1][n-1];
    }
}