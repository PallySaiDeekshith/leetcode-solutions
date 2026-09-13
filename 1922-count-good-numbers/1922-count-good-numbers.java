class Solution {
    static int mod=(int)1e9+7;
    long pow(long a,long b){
        long ans=1;
        while(b!=0){
            if(b%2==0){
                a=(a*a)%mod;
                b=b/2;
            }
            else{
                ans=(ans*a)%mod;
                b=b-1;
            }
        }
        return ans%mod;
    }
    public int countGoodNumbers(long n) {
        long even=(n+1)/2;
        long odd=n/2;
        return (int)((pow(5,even)*pow(4,odd))%mod);
    }
}