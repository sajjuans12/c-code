public class bouble {
    public static void main(String[] args) {
        String[] a={"sajjad","sajina","irsad","armina","karim","rahim","ansary"};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j].compareTo(a[j+1])>0){
                    String r=a[j];
                    a[j]=a[j+1];
                    a[j+1]=r;
                }
            }
            
        }
        for(String i:a){
            System.out.println(i);
        }
    }
}
