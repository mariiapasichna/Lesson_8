package com.javaelementary;

public class Task2 {

    /*
    2*) Написать метод для обьединения 2 бинарных дерева:
    В качестве параметра передается 2 ссылки на корневые узлы девева TreeNode, результат - корневой узел нового дерева TreeNode.
    */

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(5);
        root.print(root);
        System.out.println();

        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(1);
        root2.left.right = new TreeNode(4);
        root2.right = new TreeNode(3);
        root2.right.right = new TreeNode(7);
        root2.print(root2);
        System.out.println();

        root.print(root.mergeTrees(root, root2));
    }
}