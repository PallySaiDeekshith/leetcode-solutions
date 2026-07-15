class Solution {
    public String addBinary(String a, String b) {
        int l=a.length()-1;
        int r=b.length()-1;
        int sum=0;
        int carry=0;
        StringBuilder sb=new StringBuilder();
        while(l>=0 || r>=0){
            sum=carry;
            if(l>=0){
                sum+=a.charAt(l)-'0';
                l--;
            }
            if(r>=0){
                sum+=b.charAt(r)-'0';
                r--;
            }
            int val=sum%2;
            sb.append(val+"");
            carry=sum/2;
        }
        if(carry==1){
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}