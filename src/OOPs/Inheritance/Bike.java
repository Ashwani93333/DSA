package OOPs.Inheritance;

//
public class Bike extends Vehicle {

    public Bike(String brand) {
        super(brand);
    }

    public void wheelie() {

        System.out.println(brand + " Bike is performing a wheelie.");
    }
}
