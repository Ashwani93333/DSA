package OOPs.Basic;

/**
 * Demonstrates:
 * 1. Object Creation
 * 2. Constructors
 * 3. Copy Constructor
 * 4. Encapsulation
 * 5. Object Lifecycle
 */
public class BasicTerminology {

    public static void main(String[] args) {

        System.out.println("========== Object Creation ==========\n");

        Student student1 = new Student(
                101,
                "Ashwani Kumar",
                24,
                "Greater Noida",
                "9876543210"
        );

        student1.displayStudentDetails();

        student1.study();

        System.out.println();

        System.out.println("========== Copy Constructor ==========\n");

        Student student2 = new Student(student1);

        student2.setName("Rahul Sharma");

        student2.displayStudentDetails();

        System.out.println();

        System.out.println("========== toString() ==========\n");

        System.out.println(student1);

        System.out.println(student2);

        System.out.println();

        System.out.println("========== Object Lifecycle ==========\n");

        student1 = null;

        System.out.println("student1 reference removed.");

        System.gc();

        System.out.println("Requested Garbage Collection.");

        System.out.println("\nProgram Finished.");
    }
}