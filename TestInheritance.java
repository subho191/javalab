package Day4;

public class TestInheritance {
    public static void main(String[] args) {
        Car c = new Car();
        BMW bmw = new BMW();
        Fiat fiat = new Fiat();

        bmw.engineCapacity();
        fiat.engineCapacity();

        bmw.changeColour();
        fiat.changeColour();
    }
}
