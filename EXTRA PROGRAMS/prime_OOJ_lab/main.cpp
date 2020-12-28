#include <iostream>
#include <math.h>
using namespace std;

int main()
{
    int flag;
    int a,b;
    printf("Generating prime numbers between limits\n");
  printf("Enter the lower bound:");
  scanf("%d",&a);
   printf("Enter the upper bound:");
  scanf("%d",&b);
  int i=a;
  while(i<=b)
  {
     if(i==1||i==0)
    {
        continue;
    }
 flag=1;
   for(int j=2;j<=sqrt(i);j++)
   {

    if((i%j)==0)
    {
        flag=0;
        break;
    }
}
if(flag==1)
    {
    printf("%d \,",i);
    }
   i++;
  }


    return 0;
}
