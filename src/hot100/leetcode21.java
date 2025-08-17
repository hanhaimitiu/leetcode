package hot100;

public class leetcode21 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode node = new ListNode(-1); // 哑节点，简化头节点处理
        ListNode temp = node; // 用于拼接节点的指针

        // 遍历两个链表，拼接较小的节点
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                temp.next = list1;
                list1 = list1.next; // 移动list1指针
            } else {
                temp.next = list2;
                list2 = list2.next; // 移动list2指针
            }
            temp = temp.next; // 移动拼接指针
        }

        // 拼接剩余未遍历完的链表（若有）
        temp.next = (list1 != null) ? list1 : list2;

        return node.next; // 哑节点的下一个才是合并后链表的头
    }
}
