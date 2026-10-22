import java.util.Arrays;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int thirdMax(int[] nums) {

        Arrays.sort(nums);

        HashSet<Integer> distinct = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            distinct.add(nums[i]);
        }

        ArrayList<Integer> list = new ArrayList<>(distinct);
        Collections.sort(list, Collections.reverseOrder());

        if (list.size() >= 3) {
            return list.get(2);
        }

        return list.get(0);
    }
}