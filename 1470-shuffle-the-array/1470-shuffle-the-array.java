class Solution {
    public int[] shuffle(int[] nums, int n) {
        int base=(int)1e3+1;
        for(int i=0;i<n;i++){
            nums[i]=nums[i]+(base*nums[i+n]);
        }
        int j=2*n-2;
        for(int i=n-1;i>=0;i--){
            int temp=nums[i];
            nums[j]=temp%base;
            nums[j+1]=temp/base;
            j=j-2;
        }
        return nums;
    }
}