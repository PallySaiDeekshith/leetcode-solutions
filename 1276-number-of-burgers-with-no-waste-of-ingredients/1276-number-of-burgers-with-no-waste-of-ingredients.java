class Solution {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        List<Integer> lst=new ArrayList<>();
        if(tomatoSlices%2!=0){
            return lst;
        }
        int val=tomatoSlices/2;
        val=val-cheeseSlices;
        tomatoSlices=(tomatoSlices/2)-2*(val);
        if(val<0 || tomatoSlices<0){
            return lst;
        }
        lst.add(val);
        lst.add(tomatoSlices);
        return lst;
    }
}