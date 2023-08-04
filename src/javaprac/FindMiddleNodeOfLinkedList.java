package javaprac;

public class FindMiddleNodeOfLinkedList {
    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow=slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode();
        head.val=1234567;
        System.out.println("middle node : "+middleNode(head).val);
    }
}
