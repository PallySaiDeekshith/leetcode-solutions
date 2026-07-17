class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=(int)1e9;
        int ans=0;
        while(l<=r){
            int mid=l+(r-l)/2;
            long val=0;
            for(int i=0;i<piles.length;i++){
                val+=((long)piles[i]+mid-1)/mid;
            }
            if(val>h){
                l=mid+1;
            }
            else if(val<=h){
                ans=mid;
                r=mid-1;
            }
        }
        return ans;
    }
}