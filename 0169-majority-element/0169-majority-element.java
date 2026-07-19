class Solution {
    public int majorityElement(int[] nums) {
        int c=1;
        int ele=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==ele){
                c++;
            }
            else{
                c--;
            }
            if(c<0){
                c=1;
                ele=nums[i];
            }
        }
        return ele;
    }
}