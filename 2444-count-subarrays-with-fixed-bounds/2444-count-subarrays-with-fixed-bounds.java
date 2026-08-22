class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long count=0;
        int minInd=-1;
        int maxInd=-1;
        int left=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]<minK || nums[right]>maxK){
                left=right+1;
            }
            if(nums[right]==minK){
                minInd=right;
            }
            if(nums[right]==maxK){
                maxInd=right;
            }
            if(minInd!=-1 && maxInd!=-1){
                count+=Math.max(0,Math.min(minInd,maxInd)-left+1);
            }
        }
        return count;
    }
}