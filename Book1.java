import java.io.*;
import java.util.*;
class Book1
{
    private String name;
    private String author;
    private double p;
    private int np;
    Book1()
    {
        name=null;
        author=null;
         p=0.0;
         np=0;
    }
    void getdetails()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter book title:");
        name=sc.next();      
        System.out.println("Enter book author:");
        author=sc.next();
        System.out.println("Enter the book price:");
        p=sc.nextDouble();
        System.out.println("Enter the book pages:");
        np=sc.nextInt();
    }
     public String toString()
    {
        return("BOOK TITLE:"+name+"   "+"BOOK AUTHOR:"+author+"   "+" BOOK PRICE: "+p+"    "+" NUMBER OF PAGES:"+np);
}
}
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF BOOKS");
        int n=sc.nextInt();
        Book1 b[]=new Book1[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the Book details of book no:"+(i+1));
            b[i]=new Book1();
            b[i].getdetails();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("The book details of book"+(i+1));
            System.out.println(b[i]);       
        }
}
}