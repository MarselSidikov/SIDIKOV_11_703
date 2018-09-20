package ru.itis;

/**
 * 04.04.2018
 * BinarySearchTreeImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class BinarySearchTreeImpl<T extends Comparable<T>> implements BinarySearchTree<T> {

    private class TreeNode {
        private T value;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(T value) {
            this.value = value;
        }
    }

    private TreeNode root;

    public BinarySearchTreeImpl() {
        this.root = null;
    }

    @Override
    public void insert(T element) {
        this.root = insert(root, element);
    }

    private TreeNode insert(TreeNode root, T element) {
        if (root == null) {
            root = new TreeNode(element);
        } else if (root.value.compareTo(element) >= 0) {
            root.left = insert(root.left, element);
        } else {
            root.right = insert(root.right, element);
        }
        return root;
    }

    @Override
    public boolean remove(T element) {
        return false;
    }

    @Override
    public boolean contains(T element) {
        return false;
    }

    @Override
    public void print() {
        print(this.root);
    }

    private void print(TreeNode root) {
        if (root != null) {
            print(root.left);
            System.out.print(root.value + " ");
            print(root.right);
        }
    }

    @Override
    public void printByLevels() {

    }
}
