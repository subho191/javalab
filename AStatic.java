package Day2;

public class AStatic {
    static int i = 10;
    int j = 20;
    public AStatic()
    {
        System.out.println("constructor A");
    }
    static
    {
        System.out.println("Static A");
    }
}
class StaticDemo
{
    public static void main(String[] args)
    {
        System.out.println(AStatic.i);
//        System.out.println(AStatic.j);
        AStatic a = new AStatic();
        System.out.println(a.j);
    }
}