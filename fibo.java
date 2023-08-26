public class fibo {
    static int a=0,b=1,c=0;
    public static void f(int n){
        if(n>0){
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
            f(n-1);

        }
        
        }
        
    
    public static void main(String[] args) {
        int n=2;
        
        f(n);
        System.out.println();
        
    }
    
}
