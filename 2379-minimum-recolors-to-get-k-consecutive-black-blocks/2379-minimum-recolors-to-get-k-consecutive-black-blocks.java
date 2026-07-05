class Solution {
    public int minimumRecolors(String blocks, int k) {
        int c=0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='B'){
                c++;
            }
        }
        int max=c;
        int l=0;
        int r=k-1;
        while(r<blocks.length()-1){
            if(blocks.charAt(l)=='B'){
                c--;
            }
            l++;
            r++;
            if(blocks.charAt(r)=='B'){
                c++;
            }
            max=Math.max(max,c);
        }
        return k-max;
    }
}