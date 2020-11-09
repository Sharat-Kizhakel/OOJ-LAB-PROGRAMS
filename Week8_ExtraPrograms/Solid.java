import java.io.*;
import java.util.*;
abstract class Solid
{
double d1,d2,d3;
Solid()
{
}
abstract void surface_area();
abstract void volume();
}
class Cylinder extends Solid
{
Cylinder(double a,double b)
{
d1=a;
d2=b;
}
void surface_area()
{
System.out.println("Surface Area is:"+((2*3.14*d1*d1)+(2*3.14*d1*d2)));
}
void volume()
{
System.out.println("Volume is:"+(3.14*d1*d1*d2));
}
}
class Cone extends Solid
{
Cone(double a,double b,double c)
{
d1=a;
d2=b;
d3=c;
}
void surface_area()
{
System.out.println("Surface Area is:"+((3.14*d1*d1)+(3.14*d1*d2)));
}
void volume()
{
System.out.println("Volume is:"+((3.14*d1*d1*d3)/3.0));
}

}
class Sphere extends Solid
{
Sphere(double a)
{
d1=a;
}
void surface_area()
{
System.out.println("Surface Area is:"+(4*3.14*d1*d1));
}
void volume()
{
System.out.println("Volume is:"+((4*3.14*d1*d1*d1)/3));
}
}
class Solid_test
{
public static void main(String args[])
{
Cylinder c=new Cylinder(1,2);
Cone c1=new Cone(1,2,3);
Sphere s1=new Sphere(2);
c.surface_area();
c.volume();
c1.surface_area();
c1.volume();
s1.surface_area();
s1.volume();
}
}