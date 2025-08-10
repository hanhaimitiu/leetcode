package hot100;

import java.util.List;

public class leetcode160 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengtha=0;
        int lengthb =0;
        ListNode temp = headA;
        while (temp.next!=null){
            temp= temp.next;
            lengtha++;
        }

        temp = headB;
        while (temp.next!=null){
            temp= temp.next;
            lengthb++;
        }

        if(lengtha>=lengthb){
            for(int i=0;i<lengtha-lengthb;i++){
                headA=headA.next;
            }
            while (headA!=headB){
                headA=headA.next;
                headB=headB.next;
            }
            return headA;
        }else {
            for(int i=0;i<lengthb- lengtha;i++){
                headB=headB.next;
            }
            while (headA!=headB){
                headA=headA.next;
                headB=headB.next;
            }
        }
        return headA;
    }
}
