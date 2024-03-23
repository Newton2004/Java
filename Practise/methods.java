class Music{
    public void song(){
            System.out.println("Hello Buddy");
    } 
    public String name(int cost){
        return "Bye";
    }


}



public class methods {
    public static void main(String[] a){
        Music mc = new Music();
        mc.song();
        String st=mc.name(1);
        System.out.println(st);
    }
}
