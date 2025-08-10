package hot100;

import java.util.List;

public class leetcode141 {

    static class ListNode {
        int val;
        leetcode160.ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        // 处理空链表或只有一个节点的情况
        if (head == null || head.next == null) {
            return false;
        }

        // 初始化快慢指针
        ListNode slow = head;
        ListNode fast = head.next;

        // 当快慢指针不相遇时继续移动
        while (slow != fast) {
            // 如果快指针到达链表尾部，说明无环
            if (fast == null || fast.next == null) {
                return false;
            }

            // 慢指针移动1步，快指针移动2步
            slow = slow.next;
            fast = fast.next.next;
        }

        // 快慢指针相遇，说明有环
        return true;
    }
}
