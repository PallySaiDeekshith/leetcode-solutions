class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftproduct=new int[nums.length];
        int[] rightproduct=new int[nums.length];
        int val=1;
        leftproduct[0]=1;
        for(int i=1;i<nums.length;i++){
            val*=nums[i-1];
            leftproduct[i]=val;
        }
        val=1;
        rightproduct[nums.length-1]=1;
        for(int i=nums.length-2;i>=0;i--){
            val*=nums[i+1];
            rightproduct[i]=val;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=leftproduct[i]*rightproduct[i];
        }
        return nums;
        
    }
}