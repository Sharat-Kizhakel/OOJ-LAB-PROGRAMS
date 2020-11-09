import java.util.*;
class CircleDemo
{
double radius;
double area;
double peri;
final float pi = 3.14f;
void accept()
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter the radius:");
radius=sc.nextDouble();
}
void calculate_area()
{
area=pi*radius*radius;
}
void calculate_perimeter()
{
peri=2*pi*radius;
}
void display()
{
System.out.println("-----CIRCLE DEMO-----");
System.out.println("radius is:"+radius);
System.out.println("perimeter is:"+peri);
System.out.println("area is:"+area);
}
public static void main(String args[])
{
CircleDemo c1=new CircleDemo();
c1.accept();
c1.calculate_area();
c1.calculate_perimeter();
c1.display();

}
}