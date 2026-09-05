class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] lmax=new int[nums.length];
        int max=nums[0];
        lmax[0]=max;
        for(int i=1;i<lmax.length;i++){
            max=Math.max(max,nums[i]);
            lmax[i]=max;
        }
        int[] rmin=new int[nums.length];
        int min=nums[nums.length-1];
        rmin[nums.length-1]=min;
        for(int i=nums.length-2;i>=0;i--){
            min=Math.min(min,nums[i]);
            rmin[i]=min;
        }
        int ans=-1;
        for(int i=0;i<nums.length;i++){
            if(lmax[i]-rmin[i]<=k){
                ans=i;
                break;
            }
        }
        return ans;
    }
}