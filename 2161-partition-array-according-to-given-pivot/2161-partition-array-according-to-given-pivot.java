class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] ans=new int[nums.length];
        int l=0;
        int g=0;
        int e=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                l++;
            }
            else if(nums[i]>pivot){
                g++;
            }
            else{
                e++;
            }
        }
        int i=0;
        int j=l;
        int k=l+e;
        for(int ind=0;ind<nums.length;ind++){
            if(nums[ind]<pivot){
                ans[i]=nums[ind];
                i++;
            }
            else if(nums[ind]>pivot){
                ans[k]=nums[ind];
                k++;
            }
            else{
                ans[j]=nums[ind];
                j++;
            }
        }
        return ans;
    }
}