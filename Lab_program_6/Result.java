import CIE.*;
import SEE.*;
import java.util.Scanner;
public class Result
{
	
public static void main(String Args[])
{
 int n;
 Scanner sc=new Scanner(System.in);
System.out.println("Please enter the number of Students whose final marks are to be calculated:");
n=sc.nextInt();
CIE.Student s1[]=new CIE.Student[n];
CIE.Internals c1[]=new CIE.Internals[n];
SEE.External e1[]=new SEE.External[n];
for(int i=0;i<n;i++)
{
System.out.println("Please enter the details of Student"+(i+1)+":");
s1[i]=new CIE.Student();
s1[i].accept();
c1[i]=new CIE.Internals();
c1[i].input();
e1[i]=new SEE.External();
e1[i].input1();
System.out.println("Final Marks for student:"+(i+1));
for(int j=0;j<5;j++)
{

System.out.println("marks in course:"+(j+1)+":"+(c1[i].int_marks[j]+((e1[i].see_marks[j])/2)));

}
}
}}
