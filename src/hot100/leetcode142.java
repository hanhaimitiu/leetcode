package hot100;

import java.util.HashSet;
import java.util.List;

public class leetcode142 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode detectCycle1(ListNode head) {
        HashSet<ListNode> hashSet = new HashSet<>();
        ListNode s= head;
        while (s!=null){
            if(hashSet.contains(s)){
                return s;
            }else {
                hashSet.add(s);
            }
            s = s.next;
        }
        return null;
    }

    public ListNode detectCycle2(ListNode head) {
        if(head==null){
            return null;
        }

        ListNode slow = head, fast = head;
        while (fast!=null){
            slow = slow.next;
            if(fast.next!=null){
                fast = fast.next.next;
            }else {
                return null;
            }
            if(fast==slow){
                ListNode pstr = head;
                while (pstr!=slow){
                    pstr=pstr.next;
                    slow=slow.next;
                }
                return pstr;
            }
        }
        return null;
    }
}
