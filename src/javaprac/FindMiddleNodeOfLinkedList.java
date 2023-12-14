package javaprac;

public class FindMiddleNodeOfLinkedList {
    public static ListNodeData middleNode(ListNodeData head) {
        ListNodeData slow = head;
        ListNodeData fast = head;
        while (fast != null && fast.next != null) {
            slow=slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        ListNodeData head = new ListNodeData();
        head.val=1234567;
        System.out.println("middle node : "+middleNode(head).val);
    }
}
