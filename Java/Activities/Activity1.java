package Activities;
 class Car
{
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;
    Car()
    {
        tyres=4;
        doors=4;
    }
    public void displayCharacteristics()
    {
        System.out.println("color of the car is: "+color);
        System.out.println("Transmission of Car is of: "+transmission);
        System.out.println("Making of Car is of: "+make);
        System.out.println("Number of Tyeres in Car: "+tyres);
        System.out.println("Number of Doors in Car:"+doors);
    }

    public void accelarate()
    {
        System.out.println("Car is moving forward.");
    }
    public void brake()
    {
        System.out.println("Car has stopped.");
    }
}

public class Activity1
{
    public static void main(String[]args)
    {
        Car TATA= new Car();
        TATA.make=2014;
        TATA.color="Black";
        TATA.transmission="Manual";

        TATA.displayCharacteristics();
        TATA.accelarate();
        TATA.brake();
    }

}
