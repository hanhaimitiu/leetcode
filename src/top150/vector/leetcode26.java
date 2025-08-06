package top150.vector;

public class leetcode26 {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }
        int left = 0;
        int right = 1;
        // 修正外层循环条件，确保能处理到最后一个元素
        while (right < nums.length) {
            // 找到不重复的元素
            while (right < nums.length && nums[left] == nums[right]) {
                right++;
            }
            // 只有当right还在数组范围内时才进行赋值
            if (right < nums.length) {
                left++;
                nums[left] = nums[right];
                right++; // 移动到下一个位置
            }
        }
        return left + 1;
    }

    public static void main(String[] args) {
        leetcode26 s = new leetcode26();
        s.removeDuplicates(new int[]{1,1,2});
    }
}
