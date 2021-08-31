package com.bridgelabz;

public class MyBinaryTree<T extends Comparable<T>> {
    private BinaryNode<T> root;

    public void add(T data) {
        this.root = this.addRecursively(root, data);
    }

    private BinaryNode<T> addRecursively(BinaryNode<T> current, T data) {

        if (current == null)
            return new BinaryNode<>(data);

        if (data.compareTo(current.data) > 0)
            current.right = addRecursively(current.right, data);
        else if (data.compareTo(current.data) < 0)
            current.left = addRecursively(current.left, data);

        return current;
    }
}
