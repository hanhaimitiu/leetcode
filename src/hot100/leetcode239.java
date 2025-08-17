package hot100;

import java.util.Comparator;
import java.util.PriorityQueue;

public class leetcode239 {


    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>() {
            public int compare(int[] pair1, int[] pair2) {
                return pair1[0] != pair2[0] ? pair2[0] - pair1[0] : pair2[1] - pair1[1];
            }
        });
        for (int i = 0; i < k; ++i) {
            pq.offer(new int[]{nums[i], i});
        }
        int[] ans = new int[n - k + 1];
        ans[0] = pq.peek()[0];
        for (int i = k; i < n; ++i) {
            // 加入新元素（当前窗口右边界扩展
            pq.offer(new int[]{nums[i], i});
            // 移除堆顶中不在当前窗口的元素
            // 当前窗口范围是 [i-k+1, i]，堆顶索引若 <= i-k 则超出左边界
            while (pq.peek()[1] <= i - k) {
                pq.poll();
            }
            //取最大值
            ans[i - k + 1] = pq.peek()[0];
        }
        return ans;

    }
}
