import java.util.*;
class matrix
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
System.out.println("enter number of rows:");
int r=sc.nextInt();
System.out.println("enter number of columns:");
int c=sc.nextInt();
int a[][]=new int[r][c];
int b[][]=new int[r][c];
System.out.println("enter values ");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
a[i][j]=sc.nextInt();
}
System.out.println();
}
System.out.println("The entered matrix is:");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
System.out.print(a[i][j]+"   ");
}
System.out.println();
}
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
	int l=i;
	int m=j;
b[i][j]=a[j][i];

}
}
System.out.println("Transpose of the matrix:");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
System.out.print(b[i][j]+"   ");
}
System.out.println();
}
}
}