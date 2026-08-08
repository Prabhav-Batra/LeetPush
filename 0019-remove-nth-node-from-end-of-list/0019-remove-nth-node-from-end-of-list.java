class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int len = length(head);

        // If we need to remove the first node
        if (n == len) {
            return head.next;
        }

        ListNode curr = head;

        // Move to node before the one we want to delete
        for (int i = 1; i < len - n; i++) {
            curr = curr.next;
        }

        curr.next = curr.next.next;

        return head;
    }

    public int length(ListNode head) {
        int count = 0;

        while (head != null) {
            count++;
            head = head.next;
        }

        return count;
    }
}