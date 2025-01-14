public class Code02_DeleteGivenValue {
    public static class Node{
        int value;
        Node next;
        
        public Node(int value){
            this.value = value;
        }
    }

    public static Node removeValue(Node head, int num){
        while(head != null){
            if(head.value == num){
                break;
            }
            head = head.next;
        }
        
        Node pre = head;
        Node cur = head;
        while(cur != null){
            if(cur.value == num){
                pre.next = cur.next;
            }else{
                pre = cur;
            }
            cur = cur.next;
        }
        return head;
    }
}
