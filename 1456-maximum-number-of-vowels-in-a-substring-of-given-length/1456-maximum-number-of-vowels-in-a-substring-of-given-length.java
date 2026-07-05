class Solution {
    public int maxVowels(String s, int k) {
        int ans=0;
        for(int i=0;i<k;i++){
            if("aeiou".indexOf(s.charAt(i))!=-1){
                ans++;
            }
        }
        int l=0;
        int r=k-1;
        int max=ans;
        while(r<s.length()-1){
            if("aeiou".indexOf(s.charAt(l))!=-1){
                ans--;
            }
            l++;
            r++;
            if("aeiou".indexOf(s.charAt(r))!=-1){
                ans++;
            }
            max=Math.max(max,ans);
        }
        return max;
    }
}