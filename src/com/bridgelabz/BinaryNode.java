package com.bridgelabz;

public class BinaryNode<T> {
    T data;
    BinaryNode<T> left;
    BinaryNode<T> right;

    public BinaryNode(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
