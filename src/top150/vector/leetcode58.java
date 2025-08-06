package top150.vector;

public class leetcode58 {
    public int lengthOfLastWord(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        int right = s.length() - 1;
        // 跳过末尾的空格
        while (right >= 0 && s.charAt(right) == ' ') {
            right--;
        }
        // 如果字符串全是空格
        if (right < 0) {
            return 0;
        }
        int left = right;
        // 找到单词的左边界
        while (left >= 0 && s.charAt(left) != ' ') {
            left--;
        }
        return right - left;
    }
}
