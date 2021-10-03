package tree;

public class BstMain {
    public static void main(String[] args) throws Exception {
        int[] input = {25, 20, 27, 15, 22, 17, 26, 30, 29, 32};
        BST tree = new BST();
        for (int val : input) {
            tree.add(val);
        }

        System.out.println("---- in order:");
        tree.inOrder();
        System.out.println("---- post order:");
        tree.postOrder();
        System.out.println("---- pre order:");
        tree.preOrder();

        tree.delete(27);
        tree.inOrder();
        tree.preOrder();
    }
}
