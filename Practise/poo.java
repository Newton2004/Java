//JAVA Over loading the variable using methods
class computer{
    public int music(int n1, int n2)
    {
        return n1+n2;
    }
    public int music(int n1,int n2,int n3){
        return n1+n2+n3;
    }
}
public class poo {
    public static void main(String[] args)
    {
       computer cs = new computer();
        int total = cs.music(2,3,4);
        System.out.println(total);
    }
}
