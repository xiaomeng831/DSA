package class010_LinkedList_MergeTwoLists;

// leetcode 21 https://leetcode.com/problems/merge-two-sorted-lists/
// leetcode (6) hot100 (5)
public class MergeTwoLists {

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

    public static ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        if (head1 == null || head2 == null) {
            return head1 == null ? head2 : head1;
        }

        ListNode head = head1.val <= head2.val ? head1 : head2;
        ListNode cur1 = head.next;
        ListNode cur2 = head == head1 ? head2 : head1;
        ListNode pre = head;
        while (cur1 != null && cur2 != null) {
            if (cur1.val <= cur2.val) {
                pre.next = cur1;
                cur1 = cur1.next;
            } else {
                pre.next = cur2;
                cur2 = cur2.next;
            }
            pre = pre.next;
        }
        pre.next = cur1 != null ? cur2 : cur1;

        return head;
    }

    // run
    public static void main(String[] args) {
        // 创建第一个链表：1 -> 3 -> 5
        ListNode head1 = new ListNode(1, new ListNode(3, new ListNode(5)));

        // 创建第二个链表：2 -> 4 -> 6
        ListNode head2 = new ListNode(2, new ListNode(4, new ListNode(6)));

        // 合并两个有序链表
        ListNode mergedHead = mergeTwoLists(head1, head2);

        // 打印合并后的链表
        System.out.print("Merged List: ");
        while (mergedHead != null) {
            System.out.print(mergedHead.val + " ");
            mergedHead = mergedHead.next;
        }
        System.out.println();
    }

}
