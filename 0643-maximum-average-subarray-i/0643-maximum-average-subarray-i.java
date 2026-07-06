class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int ans=0;
        for(int i=0;i<k;i++){
            ans+=nums[i];
        }
        int r=k-1;
        int maxavg=ans;
        while(r<nums.length-1){
            r++;
            ans=ans-nums[r-k]+nums[r];
            maxavg=Math.max(maxavg,ans);
        }
        return (double)maxavg/k;

    }
}