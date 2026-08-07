package OOPs.Inheritance;


//Single Inheritance
public class Car extends Vehicle {

    private int doors;

    public Car(String brand, int doors) {
        super(brand);
        this.doors = doors;
    }

    public void displayCarInfo() {

        System.out.println("Brand : " + brand);
        System.out.println("Doors : " + doors);
    }
}
