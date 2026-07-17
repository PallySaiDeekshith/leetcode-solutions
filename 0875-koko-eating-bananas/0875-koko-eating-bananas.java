class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        long l=1;
        long r=(int)1e9;
        int ans=0;
        while(l<=r){
            long mid=l+(r-l)/2;
            long val=0;
            for(int i=0;i<piles.length;i++){
                val+=((long)piles[i]+mid-1)/(long)mid;
            }
            if(val>h){
                l=mid+1;
            }
            else if(val<=h){
                ans=(int)mid;
                r=mid-1;
            }
        }
        return ans;
    }
}