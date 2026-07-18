class Solution {
    public String rearrangeString(String s, char x, char y) {
        Map<Character,Integer> mp=new HashMap<>();
        for(char ch:s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        if(!mp.containsKey(x) || !mp.containsKey(y)){
            return s;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<mp.get(y);i++){
            sb.append(y);
        }
        for(char key:mp.keySet()){
            if(key==y){
                continue;
            }
            for(int i=0;i<mp.get(key);i++){
                sb.append(key);
            }
        }
        return sb.toString();
    }
}