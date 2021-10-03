package tree;

public class BST {
    TreeNode root;

    public void add(int data) throws Exception {
        root = add(root, data);
    }

    private TreeNode add(TreeNode n, int data) throws Exception {
        if (n == null) {
            return new TreeNode(data);
        }
        if (data < n.data) {
            n.left = add(n.left, data);
            return n;
        } else if (data > n.data) {
            n.right = add(n.right, data);
            return n;
        } else {
            throw new Exception("Same data is not allowed.");
        }
    }

    public void inOrder() {
        inOrder(root);
        System.out.println();
    }

    private void inOrder(TreeNode n) {
        if (n == null) return;
        inOrder(n.left);
        System.out.print(n.data + " -> ");
        inOrder(n.right);
    }

    public void preOrder() {
        preOrder(root);
        System.out.println();
    }

    private void preOrder(TreeNode n) {
        if (n == null) return;
        System.out.print(n.data + " -> ");
        preOrder(n.left);
        preOrder(n.right);
    }

    public void postOrder() {
        postOrder(root);
        System.out.println();
    }

    private void postOrder(TreeNode n) {
        if (n == null) return;

        postOrder(n.left);
        postOrder(n.right);
        System.out.print(n.data + " -> ");
    }

    public void delete(int data) {
        root = delete(root, data);
    }

    private TreeNode delete(TreeNode n, int data) {
        if (n == null) return null;
        if (data < n.data) {
            n.left = delete(n.left, data);
            return n;
        } else if (data > n.data) {
            n.right = delete(n.right, data);
            return n;
        } else {
            if (n.left == null) {
                return n.right;
            } else if (n.right == null) {
                return n.left;
            } else {
                TreeNode max = max(n.left);
                if (max != null) {
                    n.data = max.data;
                    n.left = delete(n.left, n.data);
                    return n;
                }

                return null;
            }
        }
    }

    private TreeNode find(TreeNode n, int data) {
        if (n == null) return null;
        if (n.data == data) return n;
        if (data < n.data) return find(n.left, data);
        return find(n.right, data);
    }

    public TreeNode max(TreeNode n) {
        if (n == null) return null;
        TreeNode cur = n;
        while (cur.right != null) {
            cur = cur.right;
        }
        return cur;
    }

    public TreeNode min(TreeNode n) {
        if (n == null) return null;
        TreeNode cur = n;
        while (cur.left != null) {
            cur = cur.left;
        }
        return cur;
    }
}
