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
     * @param n int整型 
     * @return ListNode类
     */
    public ListNode removeNthFromEnd (ListNode head, int n) {
        // write code here
        ListNode fast = head;
        ListNode slow = head;
        ListNode pre = null;
        for(int i=0;i<n;i++){
            fast = fast.next;
        }
        while(fast!=null){
            fast = fast.next;
            pre = slow;
            slow = slow.next;
        }
        if(pre == null)
            return head.next;
        pre.next = slow.next;
        return head;
    }
}