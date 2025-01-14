public class Code01_ReverseList {

    public static class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
    }

    public static class DoubleNode{
        int value;
        DoubleNode pre;
        DoubleNode next;

        public DoubleNode(int value){
            this.value = value;
        }
    }

    public static Node reverseLinkedList(Node head){
        Node pre = null;
        Node next = null;

        while(head != null){
            next = head.next; //用next存当前节点后面的环境
            head.next = pre; //当前节点反转
            pre = head; //移动pre到当前节点位置
            head = next; //移动当前节点到下一个节点位置
        }
    
        return pre;
    }

    public static DoubleNode reverseDoubleList(DoubleNode head) {
		DoubleNode pre = null;
		DoubleNode next = null;

		while (head != null) {
			next = head.next; //用next存当前节点后面的环境
			head.next = pre; //当前节点反转
			head.pre = next; //当前节点反转
			pre = head; //移动pre到当前节点位置
			head = next; //移动当前节点到下一个节点位置
		}
		return pre;
	}



}

