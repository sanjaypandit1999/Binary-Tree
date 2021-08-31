package com.bridgelabz;

public class MyBinaryTree<T extends Comparable<T>> {
    private BinaryNode<T> root;

    public void add(T data) {
        this.root = this.addRecursively(root, data);
    }

    private BinaryNode<T> addRecursively(BinaryNode<T> current, T data) {

        if (current == null)
            return new BinaryNode<>(data);

        if (data.compareTo(current.data) > 0) {
            current.right = addRecursively(current.right, data);
            System.out.println(current.data);
        }
        else if (data.compareTo(current.data) < 0)
            current.left = addRecursively(current.left, data);

        return current;
    }
    public void getSize() {
        int size = getSizeRecursively(root);

        if (size == 0)
            System.out.println("Tree is empty");
        else
            System.out.println("Elements in tree = " + size);
    }

    private int getSizeRecursively(BinaryNode<T> root) {
        int size;

        if (root == null)
            size = 0;
        else
            size = this.getSizeRecursively(root.left) + 1 + this.getSizeRecursively(root.right);

        return size;
    }
}
