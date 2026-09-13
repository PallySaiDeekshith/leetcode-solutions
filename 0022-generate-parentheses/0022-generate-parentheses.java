class Solution {
    void f(List<String> ans,int open,int close,int n,String s){
        if(open==n && close==n){
            ans.add(s);
            return ;
        }
        if(open<n){
            f(ans,open+1,close,n,s+"(");
        }
        if(close<open){
            f(ans,open,close+1,n,s+")");
        }
    }
    public List<String> generateParenthesis(int n) {
        int open=0;
        int close=0;
        List<String> ans=new ArrayList<>();
        f(ans,open,close,n,"");
        return ans;
    }
}