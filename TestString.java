package Day3;

public class TestString {
    public static void main(String[] args) {

        String s1 = "sd";
        String s2 = "sd";
        if (s1 == s2)
            System.out.println("equal by refference");
        else
            System.out.println("not equal");
        if (s1.equals(s2))
            System.out.println("equal by value being held");
        else
            System.out.println("Values not equal");
        }
    }
