/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    // public Node copyRandomList(Node head) {
    //     if(head == null)
    //         return head;
    //     Node newnode = new Node(-1);
    //     Node newhead = newnode;
    //     HashMap<Node, Node> node_map = new HashMap<>();
    //     Node cur = head;
    //     while(cur!=null) {
    //         newnode.next = new Node(cur.val);
    //         node_map.put(cur,newnode.next);
    //         cur = cur.next;
    //         newnode = newnode.next;
    //     }
    //     cur = newhead.next;
    //     while(head!=null) {
    //         cur.random = node_map.get(head.random);
    //         head = head.next;
    //         cur = cur.next;
    //     }
    //     return newhead.next;
    // }
    public Node copyRandomList(Node head) {
        Node cur = head;
        HashMap<Node,Node> map = new HashMap<>();
        while(cur!=null) {
            map.put(cur,new Node(cur.val));
            cur = cur.next;
        }
        cur = head;
        while(cur!=null) {
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        } 
        return map.get(head);
    }
}