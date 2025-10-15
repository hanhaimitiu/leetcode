package hot100;

import java.util.List;

public class leetcode24 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode swapPairs(ListNode head) {
        // 特殊情况：链表为空 或 只有一个节点，无需交换，直接返回原头节点
        if (head == null || head.next == null) {
            return head;
        }

        // 1. 创建「虚拟头节点」：避免单独处理头节点交换的特殊情况（如示例1中1和2交换后，头节点变为2）
        // dummy 的 next 初始指向原链表头节点，最终 dummy.next 会成为交换后的新头节点
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // 2. 定义 pre 指针：指向「当前要交换的两个节点的前一个节点」，初始为虚拟头节点
        // 作用：通过 pre 连接交换后的节点，防止链表断裂
        ListNode pre = dummy;

        // 3. 循环交换：确保 pre 后面有两个节点可交换（pre.next 是第一个节点，pre.next.next 是第二个节点）
        while (pre.next != null && pre.next.next != null) {





        }

        // 4. 返回交换后的新头节点（虚拟头节点的 next）
        return dummy.next;
    }
}
