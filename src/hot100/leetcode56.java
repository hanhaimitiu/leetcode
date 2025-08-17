package hot100;

import java.util.*;

public class leetcode56 {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return new int[0][2];
        }

        //按第一个数大小进行由小到大排列
        Arrays.sort(intervals,new Comparator<int[]> (){
            public int compare(int[] interval1, int[] interval2) {
                return interval1[0] - interval2[0];
            }
        });
        List<int[]> merged = new ArrayList<int[]>();
        for (int i = 0; i < intervals.length; ++i) {
            int L = intervals[i][0], R = intervals[i][1];
            //无重叠
            if (merged.size() == 0 || merged.get(merged.size() - 1)[1] < L) {
                merged.add(new int[]{L, R});
            } else {
                //上一个区间的右侧小于当前区间的左侧，则证明可以和上一个合并成一个区间
                //右侧进行比较，只留一个最大的合并
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], R);
            }
        }
        return merged.toArray(new int[merged.size()][]);

    }
}
