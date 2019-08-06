package com;

import java.awt.dnd.DnDConstants;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class DaimeterOfTree {
    DNode root;
    public static void main(String[] args) {
      DaimeterOfTree daimeterOfTree= new DaimeterOfTree();
      daimeterOfTree.insert(57);
        daimeterOfTree.insert(11);
        daimeterOfTree.insert(14);
        daimeterOfTree.insert(17);
        daimeterOfTree.insert(89);
        daimeterOfTree.insert(45);
        daimeterOfTree.insert(34);
        daimeterOfTree.insert(1);
        daimeterOfTree.insert(2);
        daimeterOfTree.insert(3);
        daimeterOfTree.levelOrderTraversal(daimeterOfTree.root);
       daimeterOfTree.zigZagTraversal(daimeterOfTree.root);
    }
   void insert(int data){
        DNode dNode = new DNode(null,null,data);
       Queue<DNode> dNodeQueue= new ArrayDeque<>();
       if(root==null){
            root=dNode;
        }else{
            dNodeQueue.add(root);
          while (!dNodeQueue.isEmpty()){
                DNode node=dNodeQueue.remove();
                if(node.left==null){
                    node.left=dNode;
                    break;
                }else if(node.right==null){
                    node.right=dNode;
                    break;
                }else {
                    dNodeQueue.add(node.left);
                    dNodeQueue.add(node.right);
                }
          }
        }
   }
   public void levelOrderTraversal(DNode root){
       int height= hight(root);
      for(int i=0; i<height;i++){
          level(root,i);
          System.out.println();
      }
   }

   public int hight(DNode root){
        if(root==null){
            return 0;
        }
        return 1+(Math.max(hight(root.left),hight(root.right)));
   }

   private void level(DNode root,int height){
        if(height==0){
            System.out.print(root.data + " ");
        }
        if(root.right!=null && height>0){
            level(root.right,height-1);
        }

       if(root.left!=null && height>0){
           level(root.left,height-1);
       }

   }
   boolean level=false;
   private void zigZagTraversal(DNode dNode){
       System.out.println("zig zag traversal ==");
       Stack<DNode> right= new Stack<>();
       Stack<DNode> left= new Stack<>();
       right.push(dNode);
       while (!right.empty() || !left.empty()){
              if(!level){
                  while (!right.empty()){
                      DNode dNoder=right.pop();
                      System.out.print(dNoder.data +" ");
                       pushNodeToStack(dNoder,left,level);
                  }
                  System.out.println();
                  level=!level;
              }else{

                  while (!left.empty()){
                      DNode dNoder=left.pop();
                      System.out.print(dNoder.data +" ");
                      pushNodeToStack(dNoder,right,level);
                  }
                  System.out.println();
                  level=!level;

              }
       }
   }

   public void pushNodeToStack(DNode dNode,Stack<DNode> dNodes,boolean level){
       if(!level){
           if(dNode.right!=null){
               dNodes.push(dNode.right);
           }
           if(dNode.left!=null){
               dNodes.push(dNode.left);
           }
       }else{
           if(dNode.left!=null){
               dNodes.push(dNode.left);
           }
           if(dNode.right!=null){
               dNodes.push(dNode.right);
           }
       }

   }
}

class DNode{
    DNode right;
    DNode left;
    int data;

    public DNode(DNode right, DNode left, int data) {
        this.right = right;
        this.left = left;
        this.data = data;
    }
}

