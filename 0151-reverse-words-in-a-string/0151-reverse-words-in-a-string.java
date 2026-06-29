class Solution {
    public String reverseWords(String s) {
        String ans="";
        int i=s.length()-1;
        while(i>=0 && s.charAt(i)==' '){
            i--;
        }
        while(i>=0){
            String word="";
            while(i>=0 && s.charAt(i)!=' '){
                word=s.charAt(i)+word;
                i--;
            }
            if(i==-1 || i==0){
                ans+=word;
                break;
            }
            ans+=word;
            while(i>=0 && s.charAt(i)==' '){
                i--;
            }
            if(i>=0){
                ans+=' ';
            }
        }
        return ans;
        
    }
}