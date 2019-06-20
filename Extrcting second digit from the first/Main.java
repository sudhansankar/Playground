#include <stdio.h>
int main() {
	//Type your code
  int n, d;
  scanf("%d",&n);
  int t=n;
  while(t>100)
  {
    t=t/10;
  }
  d=t%10;
  printf("%d",d);
	return 0;
}