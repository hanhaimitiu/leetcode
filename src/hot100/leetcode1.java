package hot100;

import java.util.HashMap;

public class leetcode1 {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> my = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(my.containsKey(target - nums[i])){
                return new int[]{my.get(target-nums[i]), i};
            }
            my.put(nums[i],i);
        }
        return new int[0];
    }
}
