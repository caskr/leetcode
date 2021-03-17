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
     * @param l1 ListNode类 
     * @param l2 ListNode类 
     * @return ListNode类
     */
    public ListNode mergeTwoLists (ListNode l1, ListNode l2) {
        // write code here
        if(l1 == null)    return l2;
        if(l2 == null)    return l1;
        ListNode res = (l1.val<=l2.val)?l1:l2;
        ListNode tail = res;
        if(res == l1)
            l1 = l1.next;
        else
            l2 = l2.next;
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                tail.next = l1;
                l1 = l1.next;
            }
            else{
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        while(l1!=null){
            tail.next = l1;
            l1 = l1.next;
            tail = tail.next;
        }
        while(l2!=null){
            tail.next = l2;
            l2 = l2.next;
            tail = tail.next;
        }
        return res;
    }
}