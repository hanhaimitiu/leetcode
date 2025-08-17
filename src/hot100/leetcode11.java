package hot100;

public class leetcode11 {
    public int maxArea(int[] height) {
        int left = 0; // 左指针，初始指向最左侧柱子
        int right = height.length - 1; // 右指针，初始指向最右侧柱子
        int maxArea = 0; // 记录最大面积

        // 当左右指针未相遇时，继续计算
        while (left < right) {
            // 计算当前左右指针形成的容器面积
            // 面积 = 短板高度 × 两指针距离
            int currentArea = Math.min(height[left], height[right]) * (right - left);

            // 更新最大面积
            maxArea = Math.max(maxArea, currentArea);

            // 移动短板指针（关键逻辑）：
            // 若左指针是短板，右移左指针（尝试寻找更高的左边界）
            // 若右指针是短板，左移右指针（尝试寻找更高的右边界）
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
