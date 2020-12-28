#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#define pi 3.14
int main()
{
    float r,h;
    float A,V,ans1;
     int ch;
while(ch!='0')
{
   printf("\nCalculate Area and Volume of different shapes\n");
   printf("Menu: \n 1.Cylinder \n 2.Cone \n 3.Sphere \n Press 0 for EXIT \n");

  scanf("%d",&ch);
  switch(ch)
  {
      case 0:exit(0);
       break;
      case 1:

          printf("Enter the radius:");
          scanf("%f",&r);
          printf("Enter the height:");
          scanf("%f",&h);
           A=(2*pi*r*h)+(2*pi*r*r);
          V=(pi*r*r*h);
          printf("The Area of the Cylinder is %f",A);
           printf("\nThe Volume of the Cylinder is %f",V);
          break;
      case 2:

          printf("Enter the radius:");
          scanf("%f",&r);
          printf("Enter the height:");
          scanf("%f",&h);
           ans1=h*h+r*r;
           A=pi*r*(r+sqrt(ans1));
           V=(pi*r*r*h)/3.0;
           printf("The Area of the Cone is %f",A);
           printf("\nThe Volume of the Cone is %f",V);
          break;
        case 3:
          printf("Enter the radius:");
          scanf("%f",&r);
           A=4*pi*r*r;
           V=(4*pi*r*r*r)/3.0;
          printf("The Area of the Sphere is %f",A);
           printf("\nThe Volume of the Sphere is %f",V);
            break;
      default:
        printf("\n Invalid choice");
  }
}
    return 0;
}
