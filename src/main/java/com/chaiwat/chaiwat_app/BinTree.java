package com.chaiwat.chaiwat_app;

import java.util.ArrayList;

public class BinTree {

    ArrayList<Node> nodes = null;

    public BinTree() {
        nodes = new ArrayList<Node>();

    }

    public boolean addRootNode(Node n) {
        if(nodes.isEmpty()) {
            nodes.add(n);
        }
        else
            return false;

        return true;
    }

    public Node getRootNode() {
        if(!nodes.isEmpty())
            return nodes.get(0);
        else
            return null;
    }

    public boolean addNode(Node p, Node l, Node r) {
        if(!nodes.isEmpty()) {
            p.left = l;
            p.right = r;
            return true;
        }
        else
            return false;
    }

    // addNode() requires parent node p must not == null
    // A child node c, will be assigned to p.left first if p.left == null
    // Else, c will be assigned to p.right if p.right == null, else return null.
    // Returns: A child node that was added, or null if not success.
    public Node addChild(Node p, Node c) {
        if(p != null) {
            if(p.left == null) {
                p.left = c;
                return p.left;
            } else if(p.right == null) {
                p.right = c;
                return p.right;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "BinTree{" +
                "nodes=" + nodes +
                '}';
    }
}
