public class Solution {
    public ListNode ReverseList(ListNode head) {
        //if(head == null)    return null;
        ListNode cur = head;
        ListNode pre = null;
        ListNode next = null;
        
        while(cur!=null){
        //while(cur.next != null){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        //cur.next = pre;
        return pre;
    }
}