package hot100;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class leetcode2 {
    static class ListNode {
        int val;
        leetcode142.ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        int carry = 0;
        while (l1!=null&&l2!=null||carry>0){
            int val1 = (l1!=null)?l1.val:0;
            int val2 = (l2!=null)?l2.val:0;

            int sum = val1+val2+carry;

            carry = sum/10;

            int cuurent_val = sum%10;
            current.next = new ListNode(cuurent_val);
            current = current.next;
            if(l1!=null){
                l1 = l1.next;
            }
            if(l2!=null){
                l2 = l2.next;
            }
        }

        return dummy.next;
    }

}
