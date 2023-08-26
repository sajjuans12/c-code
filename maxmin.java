public class maxmin {
    public static void main(String[] args) {
        int arr[]={5,48,47,69,37,500};
        int min=arr[0];
        int M=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if (M < arr[i]){
                M=arr[i];

            }
        }
        System.out.println(min+".....");
        System.out.println(M+"......");

    }
}
