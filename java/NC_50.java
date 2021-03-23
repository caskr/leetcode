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
     * @param head ListNode类 
     * @param k int整型 
     * @return ListNode类
     */
    public ListNode reverseKGroup (ListNode head, int k) {
        // write code here
        if(head == null) return null;
        ListNode tail = head;
        for(int i=0; i<k; i++){
            if(tail == null)
                return head;
            tail = tail.next;
        }
        ListNode newhead = reverse(head,tail);
        head.next = reverseKGroup(tail,k);
        return newhead;
    }
    public ListNode reverse (ListNode head,ListNode tail) {
        ListNode pre = null;
        ListNode next = null;
        while(head!=tail){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
        
}