package com;

public class BinaryTree {
   static String format = "%0" + 8 + "d";
    Node root;
    public static void main(String args[])
    {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.right = new Node(22);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(12);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);
        Node target = tree.root.left.right;

        print(12335l);

    }

    public static void print(long leadId){
        System.out.println(String.format(format,leadId));
    }

    public void printKdistanceNode(Node root,int distance){

    }
}

class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }


}
