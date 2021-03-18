/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
//         //自我删除
//         if(head==null)    return null;
//         while(head.next!=null){
//             if(head.next == head)
//                 return head;
//             else{
//                 ListNode next = head.next;
//                 head.next = head;
//                 head = next;
//             }
//         }
//         return null;
        //快慢指针
        if(head == null||head.next == null)    return null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast !=null && fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow)
                break;
        }
        if(fast == null || fast.next == null)
            return null;
        fast = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}