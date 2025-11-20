package com.tap.transflower.demo;

public class LinkedList {
    private  Node startNode;

    private int data;


    public LinkedList(){
        startNode.data=0;
        startNode.next=null;
    }

    public LinkedList(int data){
        startNode =new Node(data);
    }

    public void insert(int data){
        Node newNode=new Node(data);

        if(startNode==null){
            startNode=newNode;
        }

        Node current=startNode;

        while(current.next !=null){
            current=current.next;
    }
    current.next=newNode;

    }


    public void delete(int data){
        Node current = startNode;
        
        while(current.next!=null){
             Node previous = current;
             System.out.println(previous.data);
            if(current.data==data){
                previous.next=current.next;
                System.out.println(previous.data);
            }
        }
    }

    public void display(){
        System.out.println("*****************************************");
        Node current=startNode;

        while(current !=null){
            System.out.println(current.data);
            current=current.next;
        }
        System.out.println("********************");
    }
}
