package Day4;

public class Fiat extends Car{
    public Fiat() {
        System.out.println("Fiat constructor");
    }
    public void changeColour(){
        colour = "White";
        System.out.println("Colour of fiat " +colour);
    }
}
