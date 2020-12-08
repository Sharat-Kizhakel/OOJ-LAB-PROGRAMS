import java.util.Random;
import java.util.*;
class MultiThread implements Runnable
{
String name;
int time;
static int check;
 int n;
 Thread t;
 
 MultiThread(String thread_name,int thread_time,int no)
 {
   n=no;
   name=thread_name;
   time=thread_time;
   t=new Thread(this,name);
  t.start();   
 }
  Random rand=new Random();
 public void run()
 {
 try
 { 
 if(n==1)
 {
 for(int i=0;i<10;i++)
 {
 check=rand.nextInt(100);
 System.out.println(check);
 Thread.sleep(time);
 }
 
 }
 else if(n==2)
  {
  for(int i=0;i<10;i++)
  {
  if(check%2==0)
  {
   System.out.println(check*check);
    
  }
  Thread.sleep(time);
  }
 }
  else if(n==3)
  {
  for(int i=0;i<10;i++)
  {
  if(check%2!=0)
  {
  System.out.println(check*check*check);
   
  }
 Thread.sleep(time);
   }
 }
 }
 catch(InterruptedException e)
 {
 System.out.println(name+"was interrupted..");
 }
  System.out.println(name+" Exiting..");
 }
}
class ThreadDemo
{
public static void main(String args[])
{
MultiThread t1=new MultiThread("Random",1000,1);
MultiThread t2=new MultiThread("Even",1001,2);
MultiThread t3=new MultiThread("Odd",1001,3);
}
}