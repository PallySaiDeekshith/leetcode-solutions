class Solution {
    public String minWindow(String s, String t) {
        int minlength=1000000;
        int startindex=-1;
        Map<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<t.length();i++){
            mp.put(t.charAt(i),mp.getOrDefault(t.charAt(i),0)+1);
        }
        int size=mp.size();
        int l=0;
        int r=0;
        int count=0;
        while(r<s.length()){
            if(mp.containsKey(s.charAt(r))){
                mp.put(s.charAt(r),mp.get(s.charAt(r))-1);
                if(mp.get(s.charAt(r))==0){
                    count++;
                }
            }
            while(count==size){
                if(minlength>r-l+1){
                    minlength=r-l+1;
                    startindex=l;
                }
                if(mp.containsKey(s.charAt(l))){
                    if(mp.get(s.charAt(l))==0){
                        count--;
                    }
                    mp.put(s.charAt(l),mp.get(s.charAt(l))+1);
                }
                l++;
            }
            r++;
        }
        if(startindex==-1){
            return "";
        }
        return s.substring(startindex,startindex+minlength);
        
    }
}