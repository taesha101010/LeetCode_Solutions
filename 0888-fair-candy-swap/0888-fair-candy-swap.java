class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0;
        int sumB = 0;

        // add aliceSizes[i] to sumA 
        for (int i = 0; i < aliceSizes.length; i++){
            sumA += aliceSizes[i];
        }

        //add bobSizes[i] tosumB
        for (int j = 0; j < bobSizes.length; j++ ){
            sumB += bobSizes[j];
        }

        
        // Calculate the half difference
        int diff = (sumB - sumA)/2;

        //Find the boxes to exchange
        for (int i = 0; i < aliceSizes.length; i++){
             for (int j = 0; j < bobSizes.length; j++){

                if (bobSizes[j] - aliceSizes[i] == diff){
                    return new int[] {aliceSizes[i], bobSizes[j]};
                }
             }}

             return new int[0];




    }
}