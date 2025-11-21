package com.tap.transflower.demo;


public class App 
{
    public static void main( String[] args )
    {
        LinkedList list=new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(25);
        list.insert(45);

        list.display();

        list.remove(45);
        list.display();
        list.search(25);
    }

}
