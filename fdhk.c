#include<stdio.h>
int main(){
    int a;
    int b;
    printf("enter v");
    scanf("%d",&b);
    scanf("%d",&a);
    int c=a+b;
    int t=a-b;
    int v=a*b; 
    int g=a/b; 
    printf("The result is %d %d %d %d",c,t,v,g);
    return 0;
}