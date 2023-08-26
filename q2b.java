import java.io.*;


public class q2b {
    public static void main(String[] args)throws IOException {
        BufferedReader t=new BufferedReader(new InputStreamReader(System.in));
        String g=t.readLine();
        g=g.toLowerCase();
        int l=g.length();
        char h;
        for(int i=0;i<l;i++){
            h=g.charAt(i);
            if(h=='p'){
                g=g.replace(h,'a');
            }
           
        }
        System.out.println();
        System.out.println(g);
    }
    
}
