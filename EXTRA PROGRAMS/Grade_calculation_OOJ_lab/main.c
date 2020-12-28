#include <stdio.h>
#include <stdlib.h>

int main()
{
    int ciemarks[100];
   int totalmarks[100];
    int finalseemarks[100];
    int n;
    int subject[100];
    int seemarks[1000];
    char grade[1000];
    printf("Enter the number of subjects details that you want:");
    scanf("%d",&n);
    for(int i=0;i<n;i++)
    {
    printf("Please enter your CIE marks out of 50 for subject %d : ",(i+1));
    scanf("%d",&ciemarks[i]);
    printf("Please enter your SEE marks out of 100 for subject %d : ",(i+1));
    scanf("%d",&seemarks[i]);
    finalseemarks[i]=seemarks[i]/2;
    totalmarks[i]=ciemarks[i]+finalseemarks[i];
    if(totalmarks[i]>=90 && totalmarks[i]<=100)
    {
       grade[i]='S';
    }
    else if(totalmarks[i]>=80 && totalmarks[i]<=90)
    {
         grade[i]='A';
    }
    else if(totalmarks[i]>=70 && totalmarks[i]<=80)
    {
         grade[i]='B';
    }
     else if(totalmarks[i]>=60 && totalmarks[i]<=70)
    {
       grade[i]='C';
    }
     else if(totalmarks[i]>=50 && totalmarks[i]<=60)
    {
         grade[i]='D';
    }
     else if(totalmarks[i]>=40 && totalmarks[i]<=50)
    {
       grade[i]='E';
    }
    else
    {
       grade[i]='F';
    }
    }
    for(int i=0;i<n;i++)
    {
        printf("\n****STUDENT GRADE SHEET *****");
        printf("\nYour grade in subject %d :",(i+1));
        printf("%c",grade[i]);
    }
    return 0;
}
