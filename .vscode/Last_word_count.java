public class Last_word_count {
    public static void main(String[] args) {
        String s="hello world ";
        for(int i=0;i<s.length();i++){
            char g=s.charAt(i-1);
            char r=s.charAt(i);
            if(r==' '&&g==' '||r==' '&&g!=' '){
                System.out.println("yffuj");
            }

            
        }
    }
}
