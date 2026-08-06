package OOPs;

/**
 * Student class demonstrating
 * Class, Object, Constructors,
 * Encapsulation and Object Lifecycle.
 */
public class Student {

    // Properties (Data Members)

    private int id;
    private String name;
    private int rollNumber;
    private String address;
    private String phoneNumber;

    // Default Constructor

    public Student() {
        System.out.println("Default Constructor Called.");
    }

    // =======================
    // Parameterized Constructor
    // =======================

    public Student(int id,
                   String name,
                   int rollNumber,
                   String address,
                   String phoneNumber) {

        this.id = id;
        this.name = name;
        this.rollNumber = rollNumber;
        this.address = address;
        this.phoneNumber = phoneNumber;

        System.out.println("Parameterized Constructor Called.");
    }


    // Copy Constructor

    public Student(Student student) {

        this.id = student.id;
        this.name = student.name;
        this.rollNumber = student.rollNumber;
        this.address = student.address;
        this.phoneNumber = student.phoneNumber;

        System.out.println("Copy Constructor Called.");
    }

    // =======================
    // Getters
    // =======================

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // =======================
    // Setters
    // =======================

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // =======================
    // Behaviour
    // =======================

    public void displayStudentDetails() {

        System.out.println("----------------------------------");
        System.out.println("Student Details");
        System.out.println("----------------------------------");
        System.out.println("ID          : " + id);
        System.out.println("Name        : " + name);
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Address     : " + address);
        System.out.println("Phone       : " + phoneNumber);
        System.out.println("----------------------------------");
    }

    // Method Overriding

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }


    // Demonstration Method

    public void study() {
        System.out.println(name + " is studying Java OOP concepts.");
    }
}