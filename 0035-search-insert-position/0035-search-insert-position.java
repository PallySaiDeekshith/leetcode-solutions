class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0;
        int h=nums.length-1;
        int mid=0;
        while(l<=h){
            mid=h+((l-h)/2);
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
        return l;
    }
}