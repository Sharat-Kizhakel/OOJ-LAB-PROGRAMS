#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n=4;
    int c=0;
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=i;j++)
        {c++;
            printf(" %d ",c);
        }
        printf("\n");
    }
    return 0;
}
