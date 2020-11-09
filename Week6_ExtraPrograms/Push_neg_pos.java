import java.util.Scanner;
class Push_neg_pos
{
int p,z,n1=0;
double Full[],neg[],pos[];
Scanner sc=new Scanner(System.in);
void accept()
{
System.out.println("Enter the number of elements:");
int n=sc.nextInt();

Full=new double[n];
neg=new double[n];
pos=new double[n];
for(int i=0;i<n;i++)
{
System.out.println("Enter the element"+"["+(i+1)+"]"+":");
Full[i]=sc.nextDouble();
}
posneg();
}
void posneg()
{
for(int i=0;i<Full.length;i++)
{
if(Full[i]>0.0)
{
pos[p]=Full[i];
p++;
}
else if(Full[i]<0.0)
{
neg[n1]=Full[i];
n1++;
}
else if(Full[i]==0.0)
{
z++;
}
}
display();
}
void display()
{
System.out.println("No of positive numbers:"+p);
System.out.println("No of negative numbers:"+n1);
System.out.println("No of zeroes:"+z);

System.out.println("POSITIVE NUMBERS:");
for(int i=0;i<p;i++)
{
System.out.println(pos[i]);
}
System.out.println("NEGATIVE NUMBERS:");
for(int i=0;i<n1;i++)
{
System.out.println(neg[i]);
}
}
}
class Main
{
public static void main(String args[])
{
Push_neg_pos obj=new Push_neg_pos();

obj.accept();


}
}