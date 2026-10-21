import java.util.HashSet;
class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> uniqueCandies = new HashSet<>();

        int halfCandy = candyType.length / 2;

        for (int i = 0; i <candyType.length; i++) {
              uniqueCandies.add(candyType[i]);
        }

         if (halfCandy < uniqueCandies.size() ){
            return halfCandy;
        }
        else
             return uniqueCandies.size();


    }
}