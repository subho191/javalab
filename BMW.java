package Day4;

public class BMW extends Car{
    public BMW(){
        super("Blue");
        System.out.println("BMW constructor");
    }
    public void engineCapacity(){
        System.out.println("3000cc");
    }
    public void changeColour(){
        colour = "Blue";
        System.out.println("Coulour of BMW is" +colour);
    }
}
