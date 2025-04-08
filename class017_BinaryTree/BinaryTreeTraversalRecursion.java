package class017_BinaryTree;

public class BinaryTreeTraversalRecursion {

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }

    }

    // 先序遍历: 中 左 右
    public static void preorder(TreeNode head) {
        if (head == null) {
            return;
        }
        System.out.print(head.val + " ");
        preorder(head.left);
        preorder(head.right);
    }

    // 中序遍历: 左 中 右
    public static void inorder(TreeNode head) {
        if (head == null) {
            return;
        }
        inorder(head.left);
        System.out.print(head.val + " ");
        inorder(head.right);
    }

    // 后序遍历: 左 右 中
    public static void postorder(TreeNode head) {
        if (head == null) {
            return;
        }
        postorder(head.left);
        postorder(head.right);
        System.out.print(head.val + " ");
    }

	// 递归基本样子，用来理解递归序
    // 1, 2, 4, 4, 4, 2, 5, 5, 5, 2, 1, 3, 6, 6, 6, 3, 7, 7, 7, 3, 1
	public static void f(TreeNode head) {
		if (head == null) {
			return;
		}
		// 1
		f(head.left);
		// 2
		f(head.right);
		// 3
	}

    // run
    public static void main(String[] args) {
        TreeNode head = new TreeNode(1);
        head.left = new TreeNode(2);
        head.right = new TreeNode(3);
        head.left.left = new TreeNode(4);
        head.left.right = new TreeNode(5);
        head.right.left = new TreeNode(6);
        head.right.right = new TreeNode(7);

        preorder(head);
        System.out.println();
        System.out.println("先序遍历递归版");

        inorder(head);
        System.out.println();
        System.out.println("中序遍历递归版");

        postorder(head);
        System.out.println();
        System.out.println("后序遍历递归版");

    }
}
