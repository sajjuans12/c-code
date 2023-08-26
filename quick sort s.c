#include<stdio.h>
int main(){
int arr[]={48,75,24,15,35,12,96};
int n=sizeof(arr)/sizeof(arr[0]);
printArray(arr,n);
quickSort(arr,0,n);
printArray(arr,n);

}
int quickSort(int arr[],int low,int high)
{
    int p=partition(arr,low,high);
    quickSort(arr,low,p-1);
    quickSort(arr,p+1,high);
}
int partition(int arr[],int low,int high)
{
    int pivot =arr[low];
    int start=low;
    int end=high;
    while(low<high){
        while(start<=pivot){
            low++;
        }
        while(end>pivot){
            high++;
        }
        if(low<high){
            int t=arr[start];
            arr[start]=arr[end];
            arr[end]=arr[low];
        }
    }

}
int printArray(int arr[],int n)
{
    for(int i=0;i<n;i++){
        printf("%d\n",arr[i]);
    }
}
