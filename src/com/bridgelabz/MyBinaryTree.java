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
    public void searchElement(T data) {
        BinaryNode<T> currentNode = this.searchRecursively(root, data);
        if(currentNode == null){
            System.out.println("Data not found");
        }
        else
        System.out.println(currentNode.data + " Data Found");
    }

    private BinaryNode<T> searchRecursively(BinaryNode<T> currentNode, T data) {
        if (currentNode == null || currentNode.data == data)
            return currentNode;

        if (data.compareTo(currentNode.data) < 0)
            return searchRecursively(currentNode.left, data);

        if (data.compareTo(currentNode.data) > 0)
            return searchRecursively(currentNode.right, data);

        return currentNode;
    }
}
