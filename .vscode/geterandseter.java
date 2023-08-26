public class geterandseter {
    public static void main(String[] args) {
      //  System.out.println("gfgjghgd");
        employee ss=new employee();
       
      //  System.out.println(ss.getName());
        ss.setName("sajja" );
        System.out.println(ss.getName());
       // System.out.println(ss.getSalary());

    }
    
}
class employee{
 private   int salary;
  private  String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        if(n=="sajjad"){
           this. name=n;
        }
        else 
        {
            System.out.println("you are worng man");
        }
        
    }
    public void id(int n){
        salary=n;
    }
}
