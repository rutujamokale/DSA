package com.tap.transflower.demo;

import java.util.Scanner;

public class Ui {

    public void uifunction(){

        LinkedList list=new LinkedList();
        Scanner sc=new Scanner(System.in);

        int choice;
        int data;


        do { 

            System.out.println("1.insert the data");
            System.out.println("2.remove an element");
            System.out.println("3.search an element");
            System.out.println("4.display the data");
            System.out.println("5.exit");
            System.out.println("*************************");
            System.out.println("enter your choice:");
            choice=sc.nextInt();


            switch (choice) {

                case 1:
                    {
                        System.out.println("Enter the data:");
                        data=sc.nextInt();
                        list.insert(data);
                        break;

                    }
                
                case 2:
                    {
                        System.out.println("Enter the data:");
                        data=sc.nextInt();
                        list.remove(data);
                        break;
                    }    

                case 3:
                    {
                        System.out.println("Enter the data:");
                        data=sc.nextInt();
                        list.search(data);
                        break;
                    }    
                case 4:
                    {
                        list.display();
                        break;
                    }    

                case 5:
                    {
                       System.out.println("exiting");
                       break;
                    }
                
                default:
                    {
                       System.out.println("you choose to exit");
                       break;
                    }
             
                
            }
            
            
        } while (choice !=5);
        

    }
 }






    

