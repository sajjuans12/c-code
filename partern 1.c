#include<stdio.h>
int main()
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

