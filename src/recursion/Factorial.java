package recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Factorial is :"+factorial(5));
    }

    static int factorial(int n){
        //Base Condition
        if(n==1 || n==0){
            return 1;
        }
        //Call
        return n*factorial(n-1);
    }
}
