#include <stdio.h>
int main() {
	//Type your code
  int n,sum=0;
  scanf("%d",&n);
  int t=n;
  while(n>0)
  {
    int l=n%10;
    int fact=1;
    for(int i=1;i<=l;i++)
    {
      fact=fact*i;
    }
    sum=sum+fact;
    n=n/10;
  }
  if(sum==t)
    printf("Yes");
  else
    printf("No");
	return 0;
}