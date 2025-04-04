package class012_LinkedList_PartitionList;

// leetcode https://leetcode.com/problems/partition-list
// leetcode (8)
public class PartitionList {
    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this(val);
            this.next = next;
        }
    }

    public static ListNode partitionList(ListNode head, int num) {
        ListNode leftHead = null, leftTail = null; // < num
        ListNode rightHead = null, rightTail = null; // >= num
        ListNode next = null;
        while (head != null) {
            next = head.next;
            head.next = null;
            if (head.val < num) {
                if (leftHead == null) {
                    leftHead = head;
                } else {
                    leftTail.next = head;
                }
                leftTail = head;
            } else {
                if (rightHead == null) {
                    rightHead = head;
                } else {
                    rightTail = head.next;
                }
                rightTail = head;
            }
            head = next;
        }

        if (leftHead == null) {
            return rightHead;
        }
        leftTail.next = rightHead;
        return leftHead;
    }

}
