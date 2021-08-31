import java.util.*;


public class Solution {
    /**
     * lru design
     * @param operators int整型二维数组 the ops
     * @param k int整型 the k
     * @return int整型一维数组
     */
    public class Node {
        int key;
        int val;
        Node pre = null;
        Node next = null;
        public Node (int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
    private Map<Integer,Node> map = new HashMap<>();
    private Node head = new Node(-1,-1);
    private Node tail = new Node(-1,-1);
    private int k;
    
    public int[] LRU (int[][] operators, int k) {
        // write code here
        head.next = tail;
        tail.pre = head;
        this.k = k;
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0; i<operators.length; i++) {
            if (operators[i][0] == 1) {
                set(operators[i][1],operators[i][2]);
            } else if (operators[i][0] == 2) {
                res.add(get(operators[i][1]));
            }
        }
        int[] resArray = new int[res.size()];
        for(int i=0; i<res.size(); i++) {
            resArray[i] = res.get(i);
        }
        return resArray;
    }
    
    public void set (int key, int val) {
        if (get(key) != -1) {
            map.get(key).val = val;
        } else {
            Node cur = new Node(key, val);
            if (map.size() == k) {
                int toRemove = tail.pre.key;
                tail.pre.pre.next = tail;
                tail.pre = tail.pre.pre;
                map.remove(toRemove);
            }
            toHead(cur);
            map.put(key, cur);
        }
    }
    
    public int get (int key) {
        if(map.containsKey(key)) {
            Node cur = map.get(key);
            cur.pre.next = cur.next;
            cur.next.pre = cur.pre;
            toHead(cur);
            return cur.val;
        }
        return -1;
    }
    
    public void toHead (Node node) {
        head.next.pre = node;
        node.next = head.next;
        head.next = node;
        node.pre = head;
    }
}