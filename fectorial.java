public class fectorial {
    public static int fec(int n){
        if(n==0){
            return 1;

        }
        else
       return n*fec(n-1);
    }
    public static void main(String[] args) {
        int n=5;
       int g= fec(n);
       System.out.println(g);
        
    }
    
}
