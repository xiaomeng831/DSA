package class013_Queue_Stack_CircularQueue;

import java.util.Stack;

public class Code02_TwoKindsStacks {

    // Java内部动态数组实现, 常数操作慢
    public static class Stack1{
        public Stack<Integer> stack = new Stack<>();

        public boolean isEmpty(){
            return stack.isEmpty();
        }

        public void push(int num){
            stack.push(num);
        }

        public int pop(){
            return stack.pop();
        }

        public int peek(){
            return stack.peek();
        }

        public int size(){
            return stack.size();
        }

    }

    public static class Stack2{
        public int[] stack;
        public int size;

        public Stack2(int n){
            stack = new int[n];
            size = 0;
        }


        public boolean isEmpty(){
            return size == 0;
        }

        public void push(int num){
            stack[size++] = num;
        }

        public int pop(){
            return stack[--size];
        }

        public int peek(){
            return stack[size - 1];
        }

        public int size(){
            return size;
        }       

    }

}
