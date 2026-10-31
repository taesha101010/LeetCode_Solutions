class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder s2 = new StringBuilder();
        
        int i = 0;
        while (i < s.length()){
            if (Character.isLetterOrDigit(s.charAt(i))){
                s2.append(Character.toLowerCase(s.charAt(i)));
            }
            
                i++;
            
        }

        
            String oriS2 = s2.toString();

        int left = 0;
        int right = s2.length() - 1;

        while(left < right){
           
           char temp = s2.charAt(left);
           s2.setCharAt(left, s2.charAt(right));
           s2.setCharAt(right, temp);
            left++;
            right--;
        }

        if (s2.toString().equals(oriS2)){
            return true;
        }
        else{
            return false;

    }
}
}