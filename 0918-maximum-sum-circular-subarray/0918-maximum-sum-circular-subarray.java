class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int currmin=nums[0];
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            currmin=Math.min(nums[i],currmin+nums[i]);
            min=Math.min(min,currmin);
        }
        int ans=0;
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            ans+=nums[i];
            max=Math.max(max,ans);
            if(ans<0){
                ans=0;
            }
        }
        if(max<0){
            return max;
        }
        return Math.max(max,sum-min);
    }
}