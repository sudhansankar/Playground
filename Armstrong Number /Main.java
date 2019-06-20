#include <stdio.h>
int main() {
	int n,l,sum=0,count=0;
  scanf("%d",&n);
  int t=n;
   while(t>0)
  {
    t=t/10;
     count++;
  }
  t=n;
  while(t>0)
  {
    l=t%10;
    int d=pow(l,count);
    sum=sum+d;
    t=t/10;
  }
  if(sum==n)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
	return 0;
}