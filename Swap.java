package Day2;

public class Swap {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        b = a + b;
        a = b - a;
        b = b - b;
        System.out.println(a);
        System.out.println(b);
    }
}
