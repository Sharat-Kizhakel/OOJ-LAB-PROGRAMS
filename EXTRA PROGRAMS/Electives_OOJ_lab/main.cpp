#include <stdio.h>
#include<stdlib.h>
#include<string.h>
  char str1[50]="Internet of Things";
    char str2[50]="Advanced java";
      char str3[50]="J2EE";
     char str4[50]="Advanced Data Structures";
     char elective[50][50];
      char name[50][50];
    int cnt1=0;
    int cnt2=0;
    int cnt3=0;
    int cnt4=0;
int ch,i,n;
void check(int i)
{
printf("\n Please enter your choice of elective");
printf(" \n 1.Internet of things \n 2.Advanced Java \n 3.J2EE \n 4.Advanced Data Structures \n");
scanf("%d",&ch);
switch(ch)
{
    case 1:
        cnt1++;
        strcpy(elective[i],str1);
        printf("\n students who have chosen Internet of Things:");
         for(int j=0;j<=cnt1;j++)
          {
           if(strcmp(elective[j],str1)==0)
           {
                 printf("\n student %d: %s\n",j+1,name[j]);
           }
          }
      break;
      case 2:
        cnt2++;
       strcpy(elective[i],str2);
          printf("\n students who have chosen Advanced java:");
          for(int j=0;j<=cnt2;j++)
           {
            if(strcmp(elective[j],str2)==0)
            {
        printf("\n student %d: %s\n",j+1,name[j]);
            }
          }
      break;
     case 3:cnt3++;
       strcpy(elective[i],str3);
          printf("\n students who have chosen J2EE:");
       for(int j=0;j<=cnt3;j++)
       {
       if(strcmp(elective[j],str3)==0)
        {
        printf("\n student %d: %s\n",j+1,name[j]);
        }
       }
    break;
    case 4:cnt4++;
     strcpy(elective[i],str4);
        printf("\n students who have chosen Advanced Data Structures:");
      for(int j=0;j<=cnt4;j++)
       {
            if(strcmp(elective[j],str4)==0)
            {
       printf("\n student %d: %s\n",j+1,name[j]);
            }
       }

    break;
    default:printf("Invalid choice");
}
return;
}


int main()
{
printf("\nPlease enter the number of students:");
scanf("%d",&n);

for(int i=0;i<n;i++)
{
  printf("\n\n please enter the name of the student %d :",(i+1));
 scanf("%s",name[i]);
 check(i);
}

int n;

printf("\n****************************************************");
printf("\n Number of students in Internet of Things: %d",cnt1);
printf("\n Number of students in Advanced java: %d",cnt2);
printf("\n Number of students in J2EE: %d",cnt3);
printf("\n Number of students in Advanced Data Structures: %d",cnt4);
printf("\n****************************************************");
if(cnt1<30)
{
    printf("\nSorry the elective %s cannot be offered",str1);

 for(int i=0;i<n;i++)
 {
 if(strcmp(elective[i],str1)==0)
{
 printf("\nPlease select a choice from the other 3 %s",name[i]);
  check(i);
}
}
 }
if(cnt2<30)
{
    printf("\nSorry the elective %s cannot be offered",str2);
    printf("\nPlease select a choice from the other 3");
    for(int i=0;i<n;i++)
{
if(strcmp(elective[i],str2)==0)
{
   printf("\nPlease select a choice from the other 3 %s",name[i]);
  check(i);
}
}
 }
if(cnt3<30)
{
    printf("\nSorry the elective %s cannot be offered",str3);

for(int i=0;i<n;i++)
{

if(strcmp(elective[i],str3)==0)
{
printf("\nPlease select a choice from the other 3 %s",name[i]);
  check(i);
}
}
}
if(cnt4<2)
{
    printf("\nSorry the elective %s cannot be offered",str4);

    for(int i=0;i<n;i++)
{
if(strcmp(elective[i],str4)==0)
{
printf("\nPlease select a choice from the other 3 %s",name[i]);
  check(i);
}
}
}
printf("\n ***Internet of Things***");
for(int i=0;i<n;i++)
{
if(strcmp(elective[i],str1)==0)
{

   printf("\nthe name of student %d is: %s",i+1,name[i]);
}
}
printf("\n\n***Advanced Java***");
for(int i=0;i<n;i++)
{
    if(strcmp(elective[i],str2)==0)
{

   printf("\nthe name of student %d is: %s",i+1,name[i]);
}
}
printf("\n\n***J2EE***");
for(int i=0;i<n;i++)
{
    if(strcmp(elective[i],str3)==0)
{

   printf("\nthe name of student %d is: %s",i+1,name[i]);
}
}
printf("\n\n***Advanced Data Structures***");
for(int i=0;i<n;i++)
{
if(strcmp(elective[i],str4)==0)
{

   printf("\nthe name of student %d is: %s",i+1,name[i]);
}
}

    return 0;

}
