class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb=new StringBuilder();
        String a=strs[0];
        String b=strs[0];
        for(String s:strs){
            if(s.compareTo(a)<0){
                a=s;
            }
            if(s.compareTo(b)>0){
                b=s;
            }
        }
        int l=0;
        while(l<Math.min(a.length(),b.length())){
            if(a.charAt(l)==b.charAt(l)){
                sb.append(a.charAt(l));
                l++;
            }
            else{
                break;
            }
        }
        return sb.toString();
    }
}