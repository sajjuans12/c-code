

    class base{
        int x;
        public int getX() {
            System.out.println("ghhhhhhhh");
            return x;
        }
        public void setX(int x) {
            this.x = x;
        }
    }
    class ghh extends base{
     
        
    }
    public class inheritence {
    public static void main(String[] args) {
        int y;
        ghh t=new ghh();
        t.setX(8);
        System.out.println(t.getX());
    }}
