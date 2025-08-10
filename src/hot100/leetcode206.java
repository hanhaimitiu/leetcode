package hot100;

public class leetcode206 {
    static class ListNode {
        int val;
        leetcode160.ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode start = new ListNode(-1); // 哨兵节点
        while (head != null) {
            ListNode next = head.next; // 保存下一个节点，避免断链
            // 将当前节点插入到start后面（头插法）
            head.next = start.next;
            start.next = head;
            head = next; // 移动到下一个节点
        }
        return start.next; // 返回反转后的头节点
    }
}
