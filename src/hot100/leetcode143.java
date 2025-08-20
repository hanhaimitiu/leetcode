package hot100;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class leetcode143 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public void reorderList1(ListNode head) {
        if(head==null){
            return ;
        }
        List<ListNode> tmp = new ArrayList<>();
       ListNode tn = head;
       while (tn!=null){
           tmp.add(tn);
           tn=tn.next;
       }
       int i=0,j= tmp.size()-1;
       while (i<j){
           tmp.get(i).next=tmp.get(j);
           i++;
           if(i==j){
               break;
           }
           tmp.get(j).next=tmp.get(i);
           j--;
       }
        tmp.get(i).next=null;
    }

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void reorderList2(ListNode head) {
        if (head == null) {
            return;
        }
        ListNode mid = middleNode(head);
        ListNode l1 = head;
        ListNode l2 = mid.next;
        mid.next = null;
        l2 = reverseList(l2);
        mergeList(l1, l2);
    }

    public ListNode reverseList(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        while (cur!=null){
            ListNode nexttemp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nexttemp;
        }
        return pre;
    }

    public void mergeList(ListNode l1, ListNode l2) {
        ListNode l1_tmp;
        ListNode l2_tmp;
        while (l1 != null && l2 != null) {
            l1_tmp = l1.next;
            l2_tmp = l2.next;

            l1.next = l2;
            l1 = l1_tmp;

            l2.next = l1;
            l2 = l2_tmp;
        }

    }
}
