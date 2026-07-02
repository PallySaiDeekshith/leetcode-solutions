class Solution {
    public int strStr(String haystack, String needle) {
        int k=0;
        for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(k)){
                k++;
                if(k==needle.length()){
                    return i-needle.length()+1;
                }
                continue;
            }
            else{
                i=i-k;
                k=0;

            }
        }
        return -1;
    }
}