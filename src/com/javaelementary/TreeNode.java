package com.javaelementary;

public class TreeNode {
    private int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value) {
        this.value = value;
    }

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        t1.value += t2.value;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }

    public void print(TreeNode startNode) {
        if (startNode != null) {
            print(startNode.left);
            startNode.printNode();
            print(startNode.right);
        }
    }

    private void printNode() {
        System.out.print(value + " ");
    }
}