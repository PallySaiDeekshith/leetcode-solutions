class Solution {
    public int trap(int[] height) {
        int l=0;
        int ans=0;
        int[] left=new int[height.length];
        int[] right=new int[height.length];
        int max=-1;
        for(int i=0;i<height.length;i++){
            max=Math.max(max,height[i]);
            left[i]=max;
        }
        max=-1;
        for(int i=height.length-1;i>=0;i--){
            max=Math.max(max,height[i]);
            right[i]=max;
        }
        while(l<height.length){
            ans+=Math.min(left[l],right[l])-height[l];
            l++;
        }
        return ans;
    }
}