class Solution {
    public long maximumValue(int n, int s, int m) {
        long ans=0;
        if(n==1){
            return s;
        }
        ans=s+((n/2)*(m-1L))+1;
        return ans;
    }
}