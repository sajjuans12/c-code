#include<stdio.h>
int main()
{
    int n,arr[n];
    printf("Enter the number  ");
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        printf("Enter array  \n ");
        scanf("%d",&arr[i]);
    }
    for(int i=0;i<n;i++){
        printf(" %d",arr[i]);
    }

    for(int i=0;i<n-1;i++){
        int min=i;
        for(int j=i+1;j<n;j++){
            if(arr[j]<arr[min]){
                min=j;
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
    for(int i=0;i<n;i++){
        printf("\nThe sorting number %d\n",arr[i]);
    }


}
