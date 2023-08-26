#include<stdio.h>
int main(){
    int a=5;
    int b=6;
    int c= a+b;
    printf("%d\n",c);
    {
    int n=11;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if(i+j<=n+1){
                printf("1");
            }
            else{
                printf("%d ",i);
            }
        }
        printf("\n");
    }
}
  int e;
    int k;
    scanf("%d%d",&e,&k);
    int z=e+k;
    int t=e-k;
    int v=e*k; 
    int g=e/k; 
    printf("The result is %d %d %d %d",z,t,v,g);
    return 0;
}