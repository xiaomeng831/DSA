package class011_LinkedList_AddTwoNumbers;

// leetcode https://leetcode.com/problems/add-two-numbers/
// leetcode (7) hot100 (6)
public class AddTwoNumbers {

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

    public static ListNode addTwoNumbers(ListNode h1, ListNode h2) {
        ListNode ans = null;
        ListNode cur = null;
        int carry = 0;

        // for(int sum, val;
        // h1 != null || h2 != null;
        // h1 = h1 == null ? null : h1.next,
        // h2 = h2 == null ? null : h2.next;
        // )
        int sum;
        int val;
        while (h1 != null || h2 != null) {
            sum = (h1 == null ? 0 : h1.val) + (h2 == null ? 0 : h2.val) + carry;
            val = sum % 10;
            carry = sum / 10;

            if (ans == null) {
                ans = new ListNode(val);
                cur = ans;
            } else {
                cur.next = new ListNode(val);
                cur = cur.next;
            }

            h1 = h1 == null ? null : h1.next;
            h2 = h2 == null ? null : h2.next;

        }

        if (carry == 1) {
            cur.next = new ListNode(1);
        }
        return ans;
    }

    // run
    public static void main(String[] args) {
        // 第一个数字：342 表示为链表 2 -> 4 -> 3
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));

        // 第二个数字：465 表示为链表 5 -> 6 -> 4
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        // 预期结果是：807 表示为链表 7 -> 0 -> 8
        ListNode result = addTwoNumbers(l1, l2);

        // 打印结果链表
        System.out.print("Result: ");
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        System.out.println();
    }

}
