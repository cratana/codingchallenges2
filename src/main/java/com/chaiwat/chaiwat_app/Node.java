package com.chaiwat.chaiwat_app;

// Class Node
public class Node {
    int value;
    Node left = null;
    Node right = null;

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Node(int value) {
        this.value = value;
        left = null;
        right = null;
    }

    public Node() {
       value = 0;
       left = null;
       right = null;
    }


    @Override
    public String toString() {
        StringBuffer str = new StringBuffer();
        return "Node{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
