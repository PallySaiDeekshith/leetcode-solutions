class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int r=0;
        int sum=0;
        int ans=Integer.MAX_VALUE;
        while(r<nums.length){
            if(sum<target){
                sum+=nums[r];
                r++;
            }
            while(sum>=target){
                ans=Math.min(r-l,ans);
                sum-=nums[l];
                l++;
            }
        }
        return ans==Integer.MAX_VALUE?0:ans;
    }
}