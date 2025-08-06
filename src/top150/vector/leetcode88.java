package top150.vector;

public class leetcode88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[m + n];
        int i = 0, j = 0, index = 0;

        // 合并两个数组的有效元素
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                res[index++] = nums1[i++];
            } else {
                res[index++] = nums2[j++];
            }
        }

        // 复制剩余元素
        while (i < m) res[index++] = nums1[i++];
        while (j < n) res[index++] = nums2[j++];

        // 将结果复制回nums1（原数组）
        System.arraycopy(res, 0, nums1, 0, res.length);
    }
}
