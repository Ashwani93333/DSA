package OOPs.Inheritance;

//Parent Class
public class Vehicle {

    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
        System.out.println("Vehicle Constructor Called");
    }

    public void start() {
        System.out.println(brand + " Vehicle Started.");
    }

    public void stop() {
        System.out.println(brand + " Vehicle Stopped.");
    }
}
