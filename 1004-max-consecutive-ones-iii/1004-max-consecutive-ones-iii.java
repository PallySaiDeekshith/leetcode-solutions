class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0;
        int r=0;
        int f=0;
        int max=0;
        while(r<nums.length){
            if(nums[r]==1){
                f++;
            }
            if(r-l+1-f<=k){
                max=Math.max(max,r-l+1);
                r++;
            }
            else{
                if(nums[l]==1){
                    f--;
                }
                l++;
            }
        }
        return max;
    }
}