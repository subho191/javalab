package Day4;
//inheritance
public class Car {
    public String colour = "Red";
    public Car(){
        System.out.println("Car class constructor");
    }
    public Car(String colour){
        this.colour = colour;
        System.out.println("Colour of car is " +colour);

    }

    public void engineCapacity(){
        System.out.println("1300 cc");
    }

}
