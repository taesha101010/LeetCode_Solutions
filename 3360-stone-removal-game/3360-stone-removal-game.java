class Solution {
    public boolean canAliceWin(int n) {
         int i = 10;
         boolean aliceTurn = true;

         while(true){

            if (n < i){
                return !aliceTurn;
            }

            n = n - i;
            i--;


            aliceTurn = !aliceTurn;
         }
    }
}