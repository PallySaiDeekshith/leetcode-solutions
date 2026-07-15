class Solution {
    public int gcd(int a,int b){
        while(b!=0){
            int temp=a;
            a=b;
            b=temp%b;
        }
        return a;
    }
    public int gcdOfOddEvenSums(int n) {
        int oddsum=n*n;
        int evensum=n*(n+1);
        return gcd(oddsum,evensum);
    }
}