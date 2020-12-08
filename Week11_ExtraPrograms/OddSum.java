import java.util.*;
class OddSum implements Runnable
{
String name;
int sumodd;
int sumeven;

int ch;
Thread t;
OddSum(String thread_name,int choice)
{
ch=choice;
name=thread_name;
t=new Thread(this,name);
t.start();
}
public void run()
{
try
{
for(int i=1;i<=100;i++)
{
if(i%2!=0)
{
sumodd=sumodd+i;
}
else if(i%2==0)
{
sumeven=sumeven+i;
}
}
if(ch==1)
{
System.out.println("ODD SUM:"+sumodd);
}
else if(ch==2)
{
System.out.println("EVEN SUM:"+sumeven);
}
Thread.sleep(500);
}
catch(InterruptedException e)
{
System.out.println("Child Thread interrupted");
}
System.out.println("Child Thread exiting..");
}
}
class EvenSum
{
public static void main(String args[])
{
OddSum n1=new OddSum("Odd Sum",1);
try
{
	
System.out.println("Entering the main thread");
OddSum n2=new OddSum("Even Sum",2);
Thread.sleep(3000);

}
catch(InterruptedException e)
{
System.out.println("Main Thread interrupted");
}
System.out.println("Main Thread exiting..");
}
}