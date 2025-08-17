package hot100;

import java.util.HashSet;
import java.util.Set;

public class leetcode3 {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int res = 0;
        Set<Character> hash = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            // 如果遇到重复字符，移动左指针直到移除重复字符
            while (hash.contains(c)) {
                hash.remove(s.charAt(left));
                left++;
            }
            // 将当前字符加入集合
            hash.add(c);
            // 更新最大长度（取当前窗口长度与历史最大值的较大者）
            res = Math.max(right - left + 1, res);
        }
        return res;
    }
}
