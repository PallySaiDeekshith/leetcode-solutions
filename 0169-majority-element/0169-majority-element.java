class Solution {
    public int majorityElement(int[] nums) {
        int c=1;
        int ele=nums[0];
        for(int i=1;i<nums.length;i++){
            if(c==0){
                ele=nums[i];
            }
            if(nums[i]==ele){
                c++;
            }
            else{
                c--;
            }
        }
        return ele;
    }
}