package com;

public class LinkedList {

   static class  Node{
        public Integer data ;
        public Node next;

       public Node(Integer data, Node next) {
           this.data = data;
           this.next = next;
       }
   }

    public static  void main(String[] args){
        Node n4= new Node(1,null);
        Node n3= new Node(1,n4);
        Node node= new Node(0,n3);
        Node head= new Node(1,node);
        System.out.println(getCount(head,0));
    }
    static int count=-1;
    public static long getCount(Node binary,int power){
        if(binary==null){
            return 0;
        }
        count=count+1;
        long result=getCount(binary.next,power+1);
        return  result+(binary.data*((long)(Math.pow(2, count-power))));
    }
}
