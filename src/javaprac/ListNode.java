package javaprac;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    public void push(int new_data)
    {
        ListNode new_node = new ListNode(new_data);
        new_node.next = next;
        next = new_node;
    }
}