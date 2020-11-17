package CIE;
import java.util.Scanner;
public class Internals extends CIE.Student
{
public int[] int_marks=new int[5];
Scanner sc=new Scanner(System.in);
public void input()
{
for(int i=0;i<5;i++)
{
System.out.println("Please enter your cie marks in course:");
int_marks[i]=sc.nextInt();


} 
}
}