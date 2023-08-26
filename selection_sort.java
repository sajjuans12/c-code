public class selection_sort {
    public static void main(String[] args) {
        int a[]={10,18,17,15,16};
         int min=0;
        for(int i=0;i<a.length;i++){
           min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            int t=a[i];
            a[i]=a[min];
            a[min]=t;
        }
        for(int k:a){
        System.out.println(k);}
    }
}
