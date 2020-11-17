package CIE;
import java.util.Scanner;
public class Student
{
public String usn,name;
public int sem;
public void accept()
{

Scanner sc=new Scanner(System.in);
System.out.println("Please enter your USN:");
usn=sc.nextLine();
System.out.println("Please enter your name:");
name=sc.nextLine();
System.out.println("Please enter your semester:");
sem=sc.nextInt();
}
}
