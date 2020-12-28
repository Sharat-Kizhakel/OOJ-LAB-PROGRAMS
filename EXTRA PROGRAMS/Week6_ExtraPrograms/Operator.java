import java.util.Scanner;
class Operator
{
	int n1,n2,result;
Scanner sc=new Scanner(System.in);
void arithmetic()
{
       System.out.println("Please enter number 1:");
         n1=sc.nextInt();
       System.out.println("Please enter number 2:");
	     n2=sc.nextInt();
		  result=n1+n2;
		  System.out.println("the Result of Addition is:"+result);
		  result=n1-n2;
		  System.out.println("the Result of Subtraction is:"+result);
		  
}
void logical()
{
     System.out.println("Please enter number 1:");
         n1=sc.nextInt();
       System.out.println("Please enter number 2:");
	     n2=sc.nextInt();
		 
		  System.out.println("the Result of logical and is:"+((n1>3)&&(n2>3)));
	
		  System.out.println("the Result of logical or is:"+((n1<5)||(n2>3)));
		  
}
void relational()
{

       System.out.println("Please enter number 1:");
         n1=sc.nextInt();
       System.out.println("Please enter number 2:");
	     n2=sc.nextInt();
		  result=n1+n2;
		  System.out.println("the Result of Equal to is:"+(n1==n2));
		  result=n1-n2;
		  System.out.println("the Result of greater than is:"+(n1>n2));
}
void assignment()
{
         System.out.println("Please enter number 1:");
         n1=sc.nextInt();
         System.out.println("Please enter number 2:");
	     n2=sc.nextInt();
		 result+=n1;
		 System.out.println("the Result of += is:"+result);
		 result*=n2;
		 System.out.println("the Result of *= is:"+result);

}

}
class Main
{
public static void main(String args[])
{
	
for(;;)
{
	Operator o1=new Operator();
Scanner sc=new Scanner(System.in);
System.out.println("*********************************************");
System.out.println("Menu:\n1.Arithmetic\n2.Logical\n3.Relational\n4.Assignment");
System.out.println("Please enter your choice");
int ch=sc.nextInt();
int n1,n2,result;
switch(ch)
{
case 1:o1.arithmetic();
break;
case 2:o1.logical();
break;
case 3:o1.relational();
break;
case 4:o1.assignment();
break;
default:
System.exit(0);
}
}
}
}