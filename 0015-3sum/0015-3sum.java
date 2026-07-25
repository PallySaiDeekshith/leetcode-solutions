class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> ans=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            Set<Integer> set=new HashSet<>();
            int a=-1*nums[i];
            for(int j=i+1;j<nums.length;j++){
                int b=-1*nums[j];
                if(set.contains(a+b)){
                    ans.add(Arrays.asList(nums[i],a+b,nums[j]));
                }
                set.add(nums[j]);
            }
        }
        return new ArrayList<>(ans);
    }
}