package com.bridgelabz;

import java.util.Scanner;

public class BinaryTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyBinaryTree<Integer> bst = new MyBinaryTree<>();
        while (true) {
            System.out.println("Enter the binary tree number : ");
            int input = scanner.nextInt();
            if (input == 0)
                break;

            bst.add(input);
        }
        bst.getSize();
        System.out.println("Enter data to search");
        int searchData = scanner.nextInt();
        bst.searchElement(searchData);
    }
}
