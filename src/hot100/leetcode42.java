package hot100;

import java.util.Deque;
import java.util.LinkedList;

public class leetcode42 {
    public int trap(int[] height) {
        // 边界条件：数组长度小于3时无法接雨水
        if (height == null || height.length < 3) {
            return 0;
        }

        int result = 0;
        // 使用双端队列作为单调栈，存储索引值，保持栈内元素对应高度单调递减
        Deque<Integer> stack = new LinkedList<>();

        for (int i = 0; i < height.length; i++) {
            // 当栈不为空且当前高度大于栈顶元素对应的高度时，说明可能形成凹槽
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                // 弹出栈顶元素作为凹槽的底部
                int mid = stack.pop();

                // 如果栈为空，说明没有左边界，无法形成凹槽
                if (stack.isEmpty()) {
                    break;
                }

                // 左边界索引
                int left = stack.peek();
                // 计算凹槽的宽度：当前索引与左边界索引的距离减1
                int width = i - left - 1;
                // 计算凹槽的高度：左右边界中较矮的高度减去凹槽底部的高度
                int heightDiff = Math.min(height[left], height[i]) - height[mid];

                // 累加雨水量
                result += width * heightDiff;
            }
            // 将当前索引入栈，维持单调递减特性
            stack.push(i);
        }

        return result;
    }

    public static void main(String[] args) {
        leetcode42 solution = new leetcode42();
        // 测试用例
        int[] height1 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("能接的雨水量：" + solution.trap(height1)); // 预期输出：6

        int[] height2 = {4, 2, 0, 3, 2, 5};
        System.out.println("能接的雨水量：" + solution.trap(height2)); // 预期输出：9
    }
}
