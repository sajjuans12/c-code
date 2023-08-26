import java.io.*;
public class q2a {
    public static void main(String[] args) throws IOException{
        BufferedReader t=new BufferedReader(new InputStreamReader(System.in));
        String f=t.readLine();
        char[] ch=f.toCharArray();
        System.out.println("want to change ");
        char r=t.readLine().charAt(0);
        System.out.println("to convert");
        char h=t.readLine().charAt(0);
        
        for(int i=0;i<f.length();i++){
            if(ch[i]==r){
                ch[i]=h;
                
            }
        }
        System.out.println("      "+new String(ch));

    }
}


