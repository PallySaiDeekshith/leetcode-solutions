class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans=0.00000;
        for(int i=0;i<k;i++){
            ans+=nums[i];
        }
        int l=0;
        int r=k-1;
        double maxavg=ans;
        while(r<nums.length-1){
            ans-=nums[l];
            l++;
            r++;
            ans+=nums[r];
            maxavg=Math.max(maxavg,ans);
        }
        return maxavg/k;

    }
}