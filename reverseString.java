public class reverseString {
    public  String reverse(String str){
        if(str.isEmpty()){
            System.out.println("String is empty");
            return str;
        }
        else{
            return reverse(str.substring(1))+str.charAt(0);
        }
    }
    public static void main(String[] args) {
        String s="sajjad";
        reverseString r=new reverseString();
        String d=r.reverse(s);
                System.out.println(d);

    }
}
