class Solution {
    int max=0;
    int ind1=0;
    int ind2=0;
    public void palindrome(String s,int i,int j){
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            if(max<j-i+1){
                max=j-i+1;
                ind1=i;
                ind2=j;
            }
            i--;
            j++;
        }
    }
    public String longestPalindrome(String s) {
        for(int i=0;i<s.length();i++){
            palindrome(s,i,i);
            palindrome(s,i,i+1);
        }
        return s.substring(ind1,ind2+1);

    }
}