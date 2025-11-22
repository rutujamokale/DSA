package com.tap.transflower.demo;

public class LinkedList {

    Node head;
    Node previousNode;
    Node toDelete;

    public LinkedList() {
        head = null;

    }
    public void insert(int data) {
        Node theNode = new Node(data);
        if (head == null) {
            head = theNode;
        }
        else{
        Node current = head;


        while (current.next != null) {
            current = current.next;
        }
        current.next = theNode;
    }
    }
    public void remove(int data) {
       if(head.data==data){
        head=head.next;
        return;
       }

      Node current=head;
      Node previous =null;

      while(current !=null){
        if(current.data==data){
            previous.next=current.next;
            System.out.println("delete node:" +current.data );
            return;
        }
        previous = current;
            current = current.next;

      }
      System.out.println(" data not found " +data);


    }

    public void search(int data) {
       Node current=head;
       while(current!=null){
        if(current.data==data){ 
            System.out.println("search node: " + current.data);
            return ;
        }
        current=current.next;
       }
      System.out.println("node not search:" +data);
    }

    public void display() {
        System.out.println("*****************************************");
        Node current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println("********************");
    }
}
