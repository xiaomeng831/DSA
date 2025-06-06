package class013_Queue_Stack_CircularQueue;

import java.util.LinkedList;
import java.util.Queue;

public class Code01_TwoKindQueues {

    // Java内部链表实现, 常数操作慢
    public static class Queue1 {
        public Queue<Integer> queue = new LinkedList<>();

        // 调用任何方法之前，先调用这个方法来判断队列内是否有东西
        public boolean isEmpty() {
            return queue.isEmpty();
        }

        // 向队列中加入num，加到尾巴
        public void offer(int num) {
            queue.offer(num);
        }

        // 从队列拿，从头拿
        public int poll() {
            return queue.poll();
        }

        // 返回队列头的元素但是不弹出
        public int peek() {
            return queue.peek();
        }

        // 返回目前队列里有几个数
        public int size() {
            return queue.size();
        }
    }

    // 实际刷题时更常见的写法，常数时间好
    // 如果可以确定加入操作的总次数不超过n，那么可以用
    // 一般笔试、面试都会有一个明确数据量，所以这是最常用的方式
    public static class Queue2 {
        public int[] queue;
        public int l;
        public int r;

        // 加入操作的总次数上限是多少，一定要明确
        public Queue2(int n) {
            queue = new int[n];
            l = 0;
            r = 0;
        }

        public boolean isEmpty() {
            return l == r;
        }

        public void offer(int num) {
            queue[r++] = num;
        }

        public int poll() {
            return queue[l++];
        }

        // [l...r) 左闭右开, 所以最后一个元素是r - 1
        public int head() {
            return queue[l];
        }

        public int tail() {
            return queue[r - 1];
        }

        public int size() {
            return r - l;
        }
    }
}
