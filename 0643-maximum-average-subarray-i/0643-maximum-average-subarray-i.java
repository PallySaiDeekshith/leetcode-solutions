class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans=0.0;
        for(int i=0;i<k;i++){
            ans+=nums[i];
        }
        int r=k-1;
        double maxavg=ans;
        while(r<nums.length-1){
            r++;
            ans=ans-nums[r-k]+nums[r];
            maxavg=Math.max(maxavg,ans);
        }
        return maxavg/k;

    }
}