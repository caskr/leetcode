import java.util.*;

/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 */

public class Solution {
    /**
     * 
     * @param head1 ListNode类 
     * @param head2 ListNode类 
     * @return ListNode类
     */
    public ListNode addInList (ListNode head1, ListNode head2) {
        // write code here
        ListNode res = new ListNode(-1);
        ListNode head = res;
        head1 = reverseList(head1);
        head2 = reverseList(head2);
        int carry = 0;
        while(head1!=null||head2!=null){
            int sum = carry;
            if(head1!=null){
                sum += head1.val;
                head1 = head1.next;
            }
            if(head2!=null){
                sum += head2.val;
                head2 = head2.next;
            }
            carry = sum / 10;
            head.next = new ListNode(sum%10);
            head = head.next;
        }
        if(carry!=0){
            head.next = new ListNode(carry);
            head = head.next;
        }
        return reverseList(res.next);
    }
    public ListNode reverseList (ListNode head){
        ListNode cur = head;
        ListNode pre = null;
        ListNode next = null;
        while(cur!=null){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}