package hot100;

import java.util.HashSet;
import java.util.Set;

public class leetcode128 {
    public int longestConsecutive(int[] nums) {
        int ret = 0;
        Set<Integer> s= new HashSet<>();
        for (int num : nums) {
            s.add(num);
        }
        for (int num : s) {
            if(!s.contains(num-1)){
                int current = num;
                int currnenlength = 1;
                while (s.contains(current+1)){
                    current++;
                    currnenlength++;
                }
                ret = Math.max(currnenlength,ret);
            }
        }
        return ret;
    }
}
