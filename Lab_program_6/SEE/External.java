package SEE;
import CIE.*;
import java.util.Scanner;
public class External extends Student
{
public int see_marks[]=new int[5];
public void input1()
{
Scanner sc=new Scanner(System.in);
for(int i=0;i<5;i++)
{
System.out.println("Please enter your SEE marks in course"+(i+1)+":");
see_marks[i]=sc.nextInt();
}
}
} 