package dstruct.binarysearchtree;

public class Tree {

    private TreeNode root;

    public void delete (int value) {

        root = delete(root, value);

        return;
    }

    private TreeNode delete (TreeNode subtree, int value) {

        if (subtree == null) return subtree;

        if (value < subtree.getData()) {
            subtree.setLeftChild(delete(subtree.getLeftChild(), value));
        }
        else if (value > subtree.getData()) {
            subtree.setRightChild(delete(subtree.getRightChild(), value));
        }
        else {
            // once we find case `value == subtree.getData()`, we have found the correct node
            // Cases for node to delete has 0 or 1 children
            if (subtree.getLeftChild() == null) {
                
                return subtree.getRightChild();
            }
            else if (subtree.getRightChild() == null) {

                return subtree.getLeftChild();
            }
            // Case 3: node to delete has 2 children
            // Replace value in subtree node with smallest value in right subtree
            subtree.setData(subtree.getRightChild().min());
            // Delete node with smallest value in right subtree
            subtree.setRightChild(delete(subtree.getRightChild(), subtree.getData()));
        }
        return subtree;
    }

    public int max () {

        if (root == null) return Integer.MAX_VALUE;

        return root.max();
    }

    public int min () {

        if (root == null) return Integer.MIN_VALUE;

        return root.min();
    }

    public TreeNode get (int value) {

        if (root != null) return root.get(value);

        return null;
    }

    public void insert (int value) {

        if (root == null) {
            root = new TreeNode(value);
        }
        else {
            root.insert(value);
        }
    }

    public void traverseInOrder () {

        if (root != null) {
            root.traverseInOrder();
        }
    }
}
