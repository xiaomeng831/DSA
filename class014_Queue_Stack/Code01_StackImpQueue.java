package class014_Queue_Stack;

import java.util.Stack;

// leetcode https://leetcode.com/problems/implement-queue-using-stacks
// leetcode (10)
public class Code01_StackImpQueue {

    public static class MyQueue {

        public Stack<Integer> in;
        public Stack<Integer> out;

        public MyQueue() {
            in = new Stack<>();
            out = new Stack<>();
        }

        // 倒数据
        // 从in栈，把数据倒入out栈
        // 1) out空了，才能倒数据
        // 2) 如果倒数据，in必须倒完
        private void inToOut() {
            if (out.empty()) {
                while (!in.empty()) {
                    out.push(in.pop());
                }
            }
        }

        public void push(int x) {
            in.push(x);
            inToOut();
        }

        public int pop() {
            inToOut();
            return out.pop();
        }

        public int peek() {
            inToOut();
            return out.peek();
        }

        public boolean empty() {
            return in.empty() && out.empty();
        }

    }

}
