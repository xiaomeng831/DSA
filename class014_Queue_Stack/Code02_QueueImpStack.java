package class014_Queue_Stack;

import java.util.LinkedList;
import java.util.Queue;

// leetcode https://leetcode.com/problems/implement-stack-using-queues/
// leetcode (11)
public class Code02_QueueImpStack {

    public static class MyStack {

        public Queue<Integer> queue;

        public MyStack() {
            queue = new LinkedList<>();
        }

        public void push(int x) {
            int n = queue.size();
            queue.offer(x);
            for (int i = 0; i < n; i++) {
                queue.offer(queue.poll());
            }
        }

        public int pop() {
            return queue.poll();
        }

        public int top() {
            return queue.peek();
        }

        public boolean empty() {
            return queue.isEmpty();
        }

    }
}
