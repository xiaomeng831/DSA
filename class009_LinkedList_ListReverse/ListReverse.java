package class009_LinkedList_ListReverse;

public class ListReverse {

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

    public static class DoubleLinkedList {
        int val;
        DoubleLinkedList last;
        DoubleLinkedList next;

        public DoubleLinkedList(int val) {
            this.val = val;
        }

        public DoubleLinkedList(int val, DoubleLinkedList last, DoubleLinkedList next) {
            this(val);
            this.last = last;
            this.next = next;
        }

    }

    // 单链表反转
    // leetcode 206 https://leetcode.com/problems/reverse-linked-list
    // leetcode (5) hot100 (4)
    public static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode next = null;

        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }

        return pre;
    }

    // 双单链表反转
    public static DoubleLinkedList reverseDoubleList(DoubleLinkedList head) {
        DoubleLinkedList pre = null;
        DoubleLinkedList next = null;

        while (head != null) {
            next = head.next;
            head.next = pre;
            head.last = next;
            pre = head;
            head = next;
        }

        return pre;
    }

    // run
    public static void main(String[] args) {
        // 测试单链表反转
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;

        System.out.println("原单链表:");
        printList(node1);

        ListNode reversedList = reverseList(node1);

        System.out.println("反转后的单链表:");
        printList(reversedList);

        // 测试双链表反转
        DoubleLinkedList dNode1 = new DoubleLinkedList(1);
        DoubleLinkedList dNode2 = new DoubleLinkedList(2);
        DoubleLinkedList dNode3 = new DoubleLinkedList(3);
        dNode1.next = dNode2;
        dNode2.next = dNode3;
        dNode2.last = dNode1;
        dNode3.last = dNode2;

        System.out.println("原双链表:");
        printDoubleList(dNode1);

        DoubleLinkedList reversedDoubleList = reverseDoubleList(dNode1);

        System.out.println("反转后的双链表:");
        printDoubleList(reversedDoubleList);
    }

    // 打印单链表
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    // 打印双链表
    public static void printDoubleList(DoubleLinkedList head) {
        DoubleLinkedList current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
