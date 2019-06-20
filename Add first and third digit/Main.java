#include<stdio.h>
int main()
{
 int a,f,l,sum;
 scanf("%d",&a);
 f=a/100;
 l=(a%100)%10;
 sum=f+l;
 printf("%d",sum);
 return 0;
}