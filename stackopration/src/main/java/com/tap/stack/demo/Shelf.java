package com.tap.stack.demo;



public class Shelf {
    public int top;
    public Book[] book=new  Book[5];
    public final int SIZE=5;

    public Shelf(){
        this.top=-1;
    }

    public void push(Book newBook){
        if(top <  SIZE){
            top ++;
            this.book[top]=newBook;

        }


    }

    public Book pop(){
        if (top == -1){
            System.out.println("stack is empty");
             
        }
        Book  b1= book [top];
        top --;

        return b1;
    }

    public void display(){
       for (int i=top; i>-1;i--) {
          System.out.println(" id: "+ book[i].id + "title:" + book[i].title  + "author"+ book[i].author ); 
       }

 
}
}
