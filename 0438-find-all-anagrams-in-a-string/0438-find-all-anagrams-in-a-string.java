class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if(s.length()<p.length()){
            return new ArrayList<>();
        }
        List<Integer> ans=new ArrayList<>();
        int[] freq=new int[26];
        int[] window=new int[26];
        for(int i=0;i<p.length();i++){
            window[s.charAt(i)-'a']++;
            freq[p.charAt(i)-'a']++;
        }
        if(Arrays.equals(freq,window)){
            ans.add(0);
        }
        int l=0;
        int r=p.length()-1;
        while(r<s.length()-1){
            window[s.charAt(l)-'a']--;
            l++;
            r++;
            window[s.charAt(r)-'a']++;
            if(Arrays.equals(freq,window)){
                ans.add(l);
            }
        }
        return ans;
    }
}