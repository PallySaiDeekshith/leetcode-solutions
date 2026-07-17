class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=0;
        int ans=0;
        for(int pile:piles){
            r=Math.max(r,pile);
        }
        while(l<=r){
            int mid=l+(r-l)/2;
            long val=0;
            for(int i=0;i<piles.length;i++){
                val+=((long)piles[i]+mid-1)/mid;
                if(val>h) break;
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