package hot100;

import java.util.stream.LongStream;

public class leetcode19 {
    static class ListNode {
        int val;
        leetcode142.ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head,fast = head;

        while (n>0){
            fast = fast.next;
            n--;
        }
        ListNode pre = slow;
        while(fast!=null){
            fast =fast.next;
            pre = slow;
            slow =slow.next;
        }
        pre.next = slow.next;
        return head;
    }
}
