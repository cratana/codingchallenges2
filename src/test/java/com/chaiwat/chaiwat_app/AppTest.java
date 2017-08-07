package com.chaiwat.chaiwat_app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    public static String getMethodName() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        System.out.println("testing.....");
        assertTrue( true );
    }

    public void testNode()
    {
        System.out.println("testing testNode()...");
        Node left = new Node(20, null, null);
        Node right = new Node(30, null, null);
        Node n = new Node(1, null, null);

        System.out.println(n);
        assertTrue( n.value == 1 );
        assertTrue( n.left == null );
        assertTrue( n.right == null );

        Node n2 = new Node(3, left, right);
        System.out.println(n2);
        assertTrue( n2.value == 3 );
        assertTrue( n2.left == left);
        assertTrue( n2.right == right);
        assertTrue( n2.left.value == 20);
        assertTrue( n2.right.value == 30);
        assertTrue( n2.left.left == null);
        assertTrue( n2.right.right == null);
    }
    public void testBinTree()
    {
        System.out.println("testing testBinTree()...");
        Node left = new Node(20, null, null);
        Node right = new Node(30, null, null);
        Node n1 = new Node(1, null, null);
        Node n2 = new Node(3, left, right);

        BinTree binTree = new BinTree();

        // Add root node, there should be just only one root can be added
        assertTrue(binTree.addRootNode(n1));
        assertFalse(binTree.addRootNode(n1));
        System.out.println("binTree n1: " + binTree);

        assertTrue(binTree.addNode(n1, n2, null));
        System.out.println("binTree n1 + n2: " + binTree);

        assertTrue( true );

    }

    public void testFullBinTree()
    {
        System.out.println("Testing: " + getMethodName());
//        Let's test a bin tree of following structure
//        10
//        5 15
//        3 7 12 18
//        1 2 4 8 11 13 17 19

        // Root
        Node root = new Node(10);

        // L1
        Node L11 = new Node(5);
        Node L12 = new Node(15);

        // L2
        Node L21 = new Node(3);
        Node L22 = new Node(7);
        Node L23 = new Node(12);
        Node L24 = new Node(18);

        // L3
        Node L31 = new Node(1);
        Node L32 = new Node(2);
        Node L33 = new Node(4);
        Node L34 = new Node(8);
        Node L35 = new Node(11);
        Node L36 = new Node(13);
        Node L37 = new Node(17);
        Node L38 = new Node(19);

        BinTree btree = new BinTree();

        btree.addRootNode(root);

        Node current = btree.addChild(root, L11);
        btree.addChild(current, L21);
        btree.addChild(current, L22);

        current = btree.addChild(root, L12);
        btree.addChild(current, L23);
        btree.addChild(current, L24);

        current = L21;
        btree.addChild(current, L31);
        btree.addChild(current, L32);

        current = L22;
        btree.addChild(current, L33);
        btree.addChild(current, L34);

        current = L23;
        btree.addChild(current, L35);
        btree.addChild(current, L36);

        current = L24;
        btree.addChild(current, L37);
        btree.addChild(current, L38);

        System.out.println("binTree: " + btree);
        System.out.println("L21: " + L21);
        System.out.println("L22: " + L22);
    }
}
