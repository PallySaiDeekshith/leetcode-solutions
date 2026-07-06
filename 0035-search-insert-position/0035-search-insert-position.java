class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0;
        int h=nums.length-1;
        if(nums[h]<target){
            return nums.length;
        }
        if(nums[l]>target){
            return 0;
        }
        int mid=0;
        while(l<h){
            mid=h+((l-h)/2);
            if(nums[mid]>target && nums[mid-1]<target){
                return mid;
            }
            if(nums[mid]<target && nums[mid+1]>target){
                return mid+1;
            }
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return mid;
    }
}