import java.util.*;


class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

public class TreeTraversal {

    public static void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void preorder(TreeNode root) {
        if (root == null) return;

        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void postorder(TreeNode root) {
        if (root == null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }

    public static void inorderIterative(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;

        while (curr != null || !stack.isEmpty()) {

            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();
            System.out.print(curr.val + " ");
            curr = curr.right;
        }
    }

    public static void preorderIterative(TreeNode root) {
        if (root == null) return;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            System.out.print(node.val + " ");

            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);
        }
    }

    public static void postorderIterative(TreeNode root) {
        if (root == null) return;

        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> output = new Stack<>();

        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            output.push(node.val);

            if (node.left != null) stack.push(node.left);
            if (node.right != null) stack.push(node.right);
        }

        while (!output.isEmpty()) {
            System.out.print(output.pop() + " ");
        }
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Recursive Traversals:");

        System.out.print("Inorder: ");
        inorder(root);
        System.out.println();

        System.out.print("Preorder: ");
        preorder(root);
        System.out.println();

        System.out.print("Postorder: ");
        postorder(root);
        System.out.println();

        System.out.println("\nIterative Traversals:");

        System.out.print("Inorder: ");
        inorderIterative(root);
        System.out.println();

        System.out.print("Preorder: ");
        preorderIterative(root);
        System.out.println();

        System.out.print("Postorder: ");
        postorderIterative(root);
        System.out.println();
    }
}