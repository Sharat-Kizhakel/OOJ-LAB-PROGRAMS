import java.util.Scanner;
import java.io.*;
class Countvowels
{
  int spaces,vowels,consonants=0;
   String s,s1;
  char ch;
Scanner sc=new Scanner(System.in);
void input()
{
System.out.println("Enter a String:");
  s=sc.nextLine();
s1=s.toUpperCase();

count();
}

void count()
{
	
for(int i=0;i<s1.length();i++)
{
   ch=s1.charAt(i);
if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
{
 vowels++;
}
else if(ch==' ')
{
spaces++;
}
else
{
consonants++;
}
}
}
void display()
{
System.out.println("No of vowels:"+vowels);
System.out.println("No of spaces:"+spaces);
System.out.println("No of consonants:"+consonants);
}
}
class Main
{
public static void main(String args[])
{
Countvowels c1=new Countvowels();
c1.input();
c1.display();
}
}