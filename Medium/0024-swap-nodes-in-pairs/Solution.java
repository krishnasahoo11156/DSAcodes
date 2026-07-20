class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode newHead = head.next;
        head.next = newHead.next;
        newHead.next = head;
        ListNode prev = head;
        ListNode curr = head.next;
        while (curr != null && curr.next != null) {
            ListNode second = curr.next;
            curr.next = second.next;
            second.next = curr;
            prev.next = second;
            prev = curr;
            curr = curr.next;
        }
        return newHead;
    }
}