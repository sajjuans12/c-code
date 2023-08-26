#include<stdio.h>
void print(int arr[],int n){
for(int i=0;i<n;i++){
    printf("%d\n",arr[i]);
}
}
int main()
{
    int n;
    printf("Enter the number ");
    scanf("%d",&n);
    int arr[n];
    printf("Enter the array\n");
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    printf("unsorted array\n");
    print(arr,n);
    quick(arr,1,n-1);
    printf("sorted array\n");
    print(arr,n);

}
int quick(int arr[],int low,int high){
    if(low<high){
int p=partition(arr,low,high);
quick(arr,low,p-1);
quick(arr,p+1,high);

}
}
int partition(int arr[],int low,int high){
int pivot=arr[high];
int i=(low-1);
for(int j=low;j<=high-1;j++){
    if(arr[j]<pivot){
        i++;
       //swap(&arr[i],&arr[j]);
       int t=arr[i];
       arr[i]=arr[j];
       arr[j]=t;
    }
}
  //swap(&arr[i+1],&arr[high]);
  int t=arr[i+1];
  arr[i+1]=arr[high];
  arr[high]=t;
  return (i+1);
}
int swap(int *a,int *b)
{
    int temp=*a;
    *a=*b;
    *b=temp;
}
