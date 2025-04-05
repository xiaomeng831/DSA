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

    // run
    public static void main(String[] args) {
        // 创建链表 1 -> 4 -> 3 -> 2 -> 5 -> 2
        PartitionList.ListNode head = new PartitionList.ListNode(1);
        head.next = new PartitionList.ListNode(4);
        head.next.next = new PartitionList.ListNode(3);
        head.next.next.next = new PartitionList.ListNode(2);
        head.next.next.next.next = new PartitionList.ListNode(5);
        head.next.next.next.next.next = new PartitionList.ListNode(2);

        int partitionValue = 3;

        // 调用分区函数
        PartitionList.ListNode result = PartitionList.partitionList(head, partitionValue);

        // 打印分区后的链表
        printList(result);
    }

    public static void printList(PartitionList.ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) {
                System.out.print(" -> ");
            }
            head = head.next;
        }
        System.out.println();
    }

}
