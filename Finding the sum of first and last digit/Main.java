#include <stdio.h>
int main() {
  int n, f, l, t, s;
  scanf("%d",&n);
  t=n;
  while(t>10)
  {
    t=t/10;
  }
  l=n%10;
  s=t+l;
  printf("%d",s);
	return 0;
}