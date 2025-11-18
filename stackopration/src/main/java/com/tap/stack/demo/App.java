package com.tap.stack.demo;

import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        int choice;
         Scanner sc= new Scanner(System.in);
         Shelf motivationalBook=new Shelf();


         System.out.println("Menu");
         System.out.println("1.Add new book");
         System.out.println("2.remove the top book");
         System.out.println("3.display book");
         System.out.println("4.exit");

         do { 
             System.out.println("Enter your choice:");
             choice=sc.nextInt();


             switch(choice){
                case 1:{

                        System.out.println(" enter book id:");
                        int id=sc.nextInt();
                        sc.nextLine();


                        System.out.println(" enter book title:");
                        String title=sc.nextLine();


                        System.out.println(" enter book author");
                        String author=sc.nextLine();


                        Book newBook=new Book(id,title,author);
                        motivationalBook.push(newBook);

                        System.out.println("book push");

                        break;

                }

                case 2:{

                         Book newBook=motivationalBook.pop();
                         System.out.println("book pop" +newBook.title);

                         break;
                         




                }
                case 3:{
                    motivationalBook .display();

                    break;
                }

             }


         } while (choice !=4);

    }
}
