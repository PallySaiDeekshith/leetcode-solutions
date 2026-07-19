class Solution {
    int max(int[][] a,int n,int j){
        int ind=0;
        int max=a[0][j];
        for(int i=1;i<n;i++){
            if(a[i][j]>max){
                max=a[i][j];
                ind=i;
            }
        }
        return ind;
    }
    public int[] findPeakGrid(int[][] mat) {
        int low=0;
        int high=mat[0].length-1;
        int n=mat.length;
        int m=mat[0].length;
        while(low<=high){
            int mid=low+(high-low)/2;
            int row=max(mat,n,mid);
            int left=(mid>0)?mat[row][mid-1]:-1;
            int right=(mid<m-1)?mat[row][mid+1]:-1;
            if(mat[row][mid]>left && mat[row][mid]>right){
                return new int[]{row,mid};
            }
            else if(mat[row][mid]<left){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
}