class Solution {
    public void nextPermutation(int[] nums) {
        int c=0;
        int index=0;
        int ele=0;
        for(int i=nums.length-1;i>0;i--){
            int j=i-1;
            if(nums[i]>nums[j]){
                c++;
                index=j;
                ele=nums[j];
                Arrays.sort(nums,index+1,nums.length);
                break;
            }
        }
        int ele2=0;
        for( int i=index+1;i<nums.length;i++){
            if(nums[i]>ele && c==1){
                ele2=nums[i];
                nums[i]=ele;
                nums[index]=ele2;
                break;
            }
        }
        if(c==1){
            System.out.println(nums);
        }
        else if(c==0){
            Arrays.sort(nums);
            System.out.println(nums);
        }
    }
}