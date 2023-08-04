package javaprac;

public class ListNode {
    int val;
    ListNodeData next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNodeData next) { this.val = val; this.next = next; }
    public void push(int new_data)
    {
        ListNodeData new_node = new ListNodeData(new_data);
        new_node.next = next;
        next = new_node;
    }
}