public class reverseArray {
     public static void main(String[] args) {
        int arr[]={6,8,4,7,8,10};
        printArray(arr,6);
        System.out.println("0000000000000000");
        Reversearray(arr, 0 , 6);
        printArray(arr, 6);

    }
    static void printArray(int arr[],int size){
        for(int i=0;i<size;i++){
            System.out.println(arr[i]+"....");
        }

    }
    static void Reversearray(int arr[],int start,int end){
        int s=end-1;
        while(start<s){
            int temp=arr[start];
            arr[start]=arr[s];
            arr[s]=temp;
            start++;
            end--;
        }
    }
}
