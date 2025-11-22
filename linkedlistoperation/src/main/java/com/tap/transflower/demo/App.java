package com.tap.transflower.demo;

import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        LinkedList list=new LinkedList();

        Scanner sc=new Scanner(System.in);
        int choice;
        do{
        System.out.println("\n---MENU---");
          System.out.println("1.insert" );
          System.out.println("2.remove" );
            System.out.println("3.search" );
            System.out.println("4.display" );
            System.out.println("5.exit" );
            System.out.println("enter your choice:");
            choice=sc.nextInt();




            switch(choice){

                case 1:
                    System.out.println("enter data to insert");
                    int dataInsert=sc.nextInt();
                    list.insert(dataInsert);
                    System.out.println("inserted" +dataInsert);

                    break;





                case 2:
                    System.out.println("enter data to remove");
                    int dataRemove=sc.nextInt();
                    list.remove(dataRemove);
                    break;     


            }


        }

        
    
       
    

}
}
