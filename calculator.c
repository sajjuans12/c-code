#include<stdio.h>
int main(){
    int a;
    int b;
    printf("enter the number");
    scanf("%d",&a);
    printf("enter the second number");
    scanf("%d",&b);
    int c=a+b;
    int t=a-b;
    int v=a*b; 
    int g=a/b; 
    printf("The result is %d \n%d \n%d \n%d",c,t,v,g);
    return 0;
}