class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
        int rs=0;
        int rend=matrix.length-1;
        int cs=0;
        int cend=matrix[0].length-1;
        while(cs<=cend && rs<=rend){
            for(int i=cs;i<=cend;i++){
                ans.add(matrix[rs][i]);
            }
            rs++;
            for(int i=rs;i<=rend;i++){
                ans.add(matrix[i][cend]);
            }
            cend--;
            if(rs<=rend){
                for(int i=cend;i>=cs;i--){
                    ans.add(matrix[rend][i]);
                }
                rend--;
            }
            if(cs<=cend){
                for(int i=rend;i>=rs;i--){
                    ans.add(matrix[i][cs]);
                }
                cs++;
            }
        }
        return ans;

    }
}