package Day2;
import java.lang.Math;
public class SimpleIntrest {
    public static void main(String[] args) {

        double SI;
        double A,b;
        int P = 1000;
        int r = 2;
        int t = 4;
        SI = (P * r * t) / 100;
        A = 1+(r/100);
        b = Math.pow(A,t);
        System.out.println("Simple Interest : " +SI);
        System.out.println("Compound Intrest :"+ b*P);
    }
}
