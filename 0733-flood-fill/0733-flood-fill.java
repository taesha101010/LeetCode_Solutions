class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
       int originalColor = image[sr][sc];

       // If the pixel already has the new color then stop..
       if (originalColor == color){
        return image;
       }
       fill(image, sr,sc,originalColor, color);
        return image;
            
    }
    public void fill(int[][] image, int r, int c, int originalColor, int color){
        //stop f outside the image
        if(r < 0 || r >= image.length || c < 0 || c >= image[0].length){
            return;
        }
        //stop IF the pixel has a different original color 
        if (image[r][c] != originalColor){
            return;
        }

        //change the current pixel to new color
        image[r][c] = color;

        //Check all four neighbouring pixels
        fill(image, r-1,c,originalColor, color);//up
        fill(image, r+1,c,originalColor, color);//down
        fill(image, r,c-1,originalColor, color);//left
        fill(image, r,c+1,originalColor, color);//right
    }

}