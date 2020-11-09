/*Develop a Java program to create a class PLAYER with member variables name,
matches_played and average. This class has an abstract method cal_average(String,int,int).
Derive two classes BATSMAN and BOWLER from PLAYER. Class BATSMAN has a
member variable runs_scored. Class BOWLER has a member variable runs_given. Create m
BATSMAN objects and n BOWLER objects. Calculate and display the average runs scored
by each BATSMAN and average runs given by each BOWLER.*/

import java.util.*;
abstract class Player
{
String name;
int matches_played;
double average;
abstract void cal_average(String l,int m,int n);
}
class BATSMAN extends Player
{
int runs_scored;
void cal_average(String x,int y,int z)
{
name=x;
matches_played=y;
runs_scored=z;
average=(double)runs_scored/matches_played;
System.out.println("The averge runs scored:"+name+" is "+average);
}
}
class BOWLER extends Player
{
int runs_given;
void cal_average(String a,int b,int c)
{
name=a;
matches_played=b;
runs_given=c;
average=(double)runs_given/matches_played;
System.out.println("The average runs given by: "+name+" is "+average);
}
}
class Main
{
public static void main(String args[])
{
int m,n,i;
Scanner ss=new Scanner(System.in);
System.out.println("Enter the number of Batsman and bowlers:");
m=ss.nextInt();
n=ss.nextInt();
BATSMAN B[]=new BATSMAN[m];
for(i=0;i<m;i++)
{
B[i]=new BATSMAN();
System.out.println("Enter name,number of matches played,and number of runs scored by Batsman "+(i+1)+":");
B[i].name=ss.next();
B[i].matches_played=ss.nextInt();
B[i].runs_scored=ss.nextInt();
}
BOWLER BOW[]=new BOWLER[n];
for(i=0;i<n;i++)
{
BOW[i]=new BOWLER();
System.out.println("Enter name,number of matches played,and number of runs given by Bowler "+(i+1)+":");
BOW[i].name=ss.next();
BOW[i].matches_played=ss.nextInt();
BOW[i].runs_given=ss.nextInt();
}
for(i=0;i<m;i++)
{
B[i].cal_average(B[i].name ,B[i].matches_played,B[i].runs_scored);
}
for(i=0;i<n;i++)
{
BOW[i].cal_average(BOW[i].name ,BOW[i].matches_played,BOW[i].runs_given);
}
}
}