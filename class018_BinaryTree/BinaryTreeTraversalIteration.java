package class018_BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeTraversalIteration {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    // 迭代和栈实现先序遍历
    public static void preorder(TreeNode head) {
        if (head != null) {
            Stack<TreeNode> stack = new Stack<>();
            stack.push(head);
            while (!stack.isEmpty()) {
                head = stack.pop();
                System.out.println(head.val + " ");
                if (head.right != null) {
                    stack.push(head.right);
                }
                if (head.left != null) {
                    stack.push(head.left);
                }
            }
        }
    }

    // 先序遍历 leetcode习题
    // leetcode https://leetcode.com/problems/binary-tree-preorder-traversal
    // leetcode (14)
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root != null) {
            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);
            while (!stack.empty()) {
                root = stack.pop();
                list.add(root.val);
                if (root.right != null) {
                    stack.push(root.right);
                }
                if (root.left != null) {
                    stack.push(root.left);
                }
            }
        }
        return list;
    }

    // 迭代和栈实现中序遍历
    public static void inorder(TreeNode head) {
        if (head != null) {
            Stack<TreeNode> stack = new Stack<>();
            while (!stack.empty() || head != null) {
                if (head != null) {
                    stack.push(head);
                    head = head.left;
                } else {
                    head = stack.pop();
                    System.out.print(head.val + " ");
                    head = head.right;
                }
            }
        }
    }

    // 中序遍历 leetcode习题
    // leetcode https://leetcode.com/problems/binary-tree-inorder-traversal
    // leetcode (15) hot100 (8)
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root != null) {
            Stack<TreeNode> stack = new Stack<>();
            while (!stack.empty() || root != null) {
                if (root != null) {
                    stack.push(root);
                    root = root.left;
                } else {
                    root = stack.pop();
                    list.add(root.val);
                    root = root.right;
                }
            }
        }
        return list;
    }

    // 迭代和栈实现后序遍历
    public static void postorder(TreeNode head) {
        if (head != null) {
            Stack<TreeNode> stack = new Stack<>();
            stack.push(head);

            // 如果始终没有打印过节点，head就一直是头节点
            // 一旦打印过节点, head就变成打印节点
            // 之后head的含义: 上一次打印的节点
            while (!stack.empty()) {
                TreeNode cur = stack.peek();
                if (cur.left != null && head != cur.left && head != cur.right) { // 有左树且左树没处理过
                    stack.push(cur.left);
                } else if (cur.right != null && head != cur.right) { // 有右树且边树没处理过
                    stack.push(cur.right);
                } else {
                    System.out.print(cur.val + " "); // 左树, 右树 没有或都处理过了
                    head = stack.pop();
                }
            }
        }
    }

    // 后序遍历 leetcode习题
    // leetcode https://leetcode.com/problems/binary-tree-postorder-traversal
    // leetcode (16)
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root != null) {
            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);

            while (!stack.empty()) {
                TreeNode cur = stack.peek();
                if (cur.left != null && root != cur.left && root != cur.right) {
                    stack.push(cur.left);
                } else if (cur.right != null && root != cur.right) {
                    stack.push(cur.right);
                } else {
                    list.add(cur.val);
                    root = stack.pop();
                }
            }
        }

        return list;
    }

}
