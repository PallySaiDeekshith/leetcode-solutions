class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Set<Integer> set=new HashSet<>();
        for(int ele:nums){
            set.add(ele);
        }
        int ans=1;
        int count=1;
        for(int ele:set){
            if(set.contains(ele+1)){
                continue;
            }
            else{
                int val=ele;
                while(set.contains(val-1)){
                    count++;
                    val--;
                }
                ans=Math.max(ans,count);
                count=1;
            }
        }
        return ans;
    }
}