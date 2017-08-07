package com.chaiwat.chaiwat_app;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App1
{
    public static void main( String[] args )
    {
        System.out.println("Waiting for input:...");
        Scanner scanner = new Scanner(System.in);
        int int_input;
        char ch_input;

        BinTree tree1 =  null;

        try {
            while(scanner.hasNext()) {
                try {
                    int_input = scanner.nextInt();
                    System.out.println("adding node: " + int_input);

                    // if this is the first time (tree is empty), then set the root node.
                    if(tree1 == null) {
                        tree1 = new BinTree();
                        tree1.addRootNode(new Node(int_input, null, null));
                    } else {

                    }
                } catch (InputMismatchException e) {
                    ch_input = (char) scanner.nextByte();
                    if(ch_input == '-') {
                        System.out.println("getting null input: " + ch_input);
                    }
                }
            }
        } catch (NoSuchElementException e) {
            // int_input is exhausted
            System.out.println("catch exception: " + e.getMessage());
        }

        scanner.close();
    }
}
