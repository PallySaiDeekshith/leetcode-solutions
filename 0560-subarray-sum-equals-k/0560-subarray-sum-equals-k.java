class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> mp=new HashMap<>();
        mp.put(0,1);
        int currsum=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            currsum+=nums[i];
            if(mp.containsKey(currsum-k)){
                c+=mp.get(currsum-k);
            }
            mp.put(currsum,mp.getOrDefault(currsum,0)+1);
        }
        return c;
    }
}