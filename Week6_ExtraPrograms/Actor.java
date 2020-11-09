import java.util.*;
class Actor
{
String id,name;
int no_of_movies;
double no_of_years_exp;
double average;
static String actor_highest_avg;
void accept()
{
Scanner sc =new Scanner(System.in);
System.out.println("-----enter Actor details-----");
System.out.println("enter id");
id=sc.nextLine();
System.out.println("enter actor name ");
name=sc.nextLine();
System.out.println("enter no of movies till date");
no_of_movies=sc.nextInt();
System.out.println("enter no of years of experience");
no_of_years_exp=sc.nextDouble();
}
void calculate()
{
average=(no_of_movies/no_of_years_exp);
}
void display()
{
System.out.println("*********ACTOR DETAILS***********");
System.out.println(id+"    "+name+"    "+no_of_movies+"  "+no_of_years_exp+"    "+average);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter no of Actors");
int n=sc.nextInt();
Actor []obj=new Actor[n];
double highest_avg=0.0;
for(int i=0;i<n;i++)
{
obj[i]=new Actor();
obj[i].accept();
obj[i].calculate();

if(obj[i].average>highest_avg)
{
highest_avg=obj[i].average;
actor_highest_avg=obj[i].name;
}
}
for(int i=0;i<n;i++)
obj[i].display();
System.out.println();
System.out.println(" actor name with highest average experience: "+actor_highest_avg);
}
}