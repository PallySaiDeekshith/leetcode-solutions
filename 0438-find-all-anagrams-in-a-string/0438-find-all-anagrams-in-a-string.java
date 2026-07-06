class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if(s.length()<p.length()){
            return new ArrayList<>();
        }
        Map<Character,Integer> mp=new HashMap<>();
        Map<Character,Integer> np=new HashMap<>();
        for(int i=0;i<p.length();i++){
            mp.put(p.charAt(i),mp.getOrDefault(p.charAt(i),0)+1);
            np.put(s.charAt(i),np.getOrDefault(s.charAt(i),0)+1);
        }
        List<Integer> ans=new ArrayList<>();
        if(mp.equals(np)){
            ans.add(0);
        }
        int l=0;
        int r=p.length()-1;
        while(r<s.length()-1){
            if(np.get(s.charAt(l))==1){
                np.remove(s.charAt(l));
            }
            else{
                np.put(s.charAt(l),np.getOrDefault(s.charAt(l),0)-1);
            }
            l++;
            r++;
            np.put(s.charAt(r),np.getOrDefault(s.charAt(r),0)+1);
            if(mp.equals(np)){
                ans.add(l);
            }
        }
        return ans;
    }
}