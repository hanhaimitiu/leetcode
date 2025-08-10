package hot100;

import java.util.ArrayList;
import java.util.List;

public class leetcode234 {
    static class ListNode {
        int val;
        leetcode160.ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean isPalindrome(ListNode head) {
        List<Integer> array = new ArrayList<>();
        while (head != null) {
            array.add(head.val);
            head = head.next;
        }
        int left = 0;
        int right = array.size()-1;
        while (left<=right){
            if(array.get(left)!=array.get(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
