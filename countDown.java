public class countDown {
    public static void count(int num){
        if(num==0){
            System.out.println("Number is empty");
           return;
        }
        System.out.println(num);
        count(num-1);
      return;
    }
    public static void main(String[] args) {
        int n=5;
        count(n);
        
    }
    
}
