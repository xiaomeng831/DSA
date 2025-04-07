package class015_Stack;

import java.util.Stack;

// leetcode https://leetcode.com/problems/min-stack
// leetcode (12) hot100 (7)
public class GetMinStack {

    public static class MinStack1 {

        public Stack<Integer> data;
        public Stack<Integer> min;

        public MinStack1() {
            data = new Stack<>();
            min = new Stack<>();
        }

        public void push(int val) {
            data.push(val);
            if (min.empty() || min.peek() > val) {
                min.push(val);
            } else {
                min.push(min.peek());
            }
        }

        public void pop() {
            data.pop();
            min.pop();
        }

        public int top() {
            return data.peek();
        }

        public int getMin() {
            return min.peek();
        }

    }

    public static class MinStack2 {

        // leetcode的数据在测试时, 同时在栈里的数据不超过这个值
		// 这是几次提交实验出来的
		// 如果leetcode补测试数据了, 超过这个量导致出错, 就调大
        public final int MAX = 8001;
        public int[] data;
        public int[] min;
        int size;

        public MinStack2() {
            data = new int[MAX];
            min = new int[MAX];
            size = 0;
        }

        public void push(int val) {
            data[size] = val;
            // size是0时, 会发生短路, || 后面的不会被执行所以不报错
            if (size == 0 || val <= min[size - 1]) {
                min[size] = val;
            } else {
                min[size] = min[size - 1];
            }

            // 更安全一点的写法是
            // if (size == 0) {
            // min[size] = val;
            // } else {
            // min[size] = Math.min(val, min[size - 1]);
            // }

            size++;
        }

        public void pop() {
            size--;
        }

        public int top() {
            return data[size - 1];
        }

        public int getMin() {
            return min[size - 1];
        }
    }

}
