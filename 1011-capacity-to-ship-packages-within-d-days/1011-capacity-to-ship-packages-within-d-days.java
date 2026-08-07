class Solution {
    int check(int capacity,int[] weights){
        int c=1;
        int sum=0;
        for(int i=0;i<weights.length;i++){
            if(weights[i]>capacity){
                return -1;
            }
            sum+=weights[i];
            if(sum>capacity){
                sum=weights[i];
                c++;
            }
        }
        return c;
    }
    public int shipWithinDays(int[] weights, int days) {
        int sum=0;
        for(int i=0;i<weights.length;i++){
            sum+=weights[i];
        }
        int l=1;
        int r=sum;
        int ans=0;
        while(l<=r){
            int mid=l+(r-l)/2;
            int decision=check(mid,weights);
            if(decision>days || decision==-1){
                l=mid+1;
            }
            else{
                ans=mid;
                r=mid-1;
            }
        }
        return ans;
    }
}