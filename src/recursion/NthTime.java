package recursion;

public class NthTime {
    public static void main(String[] args) {


        //N- Times a particular value printed using recursive call
//        printNthTimes(10,56);

        Nto1(10);
    }

    // N to 1 all values
    static void Nto1(int n){
        if(n==0){
            return;
        }
        //before recursive call
        System.out.println(n+" ");
        Nto1(n-1);


    }

    //N times a value
    static void printNthTimes(int times, int whatInt){
        if(times==0){
            return;
        }
        printNthTimes(times-1,whatInt);
        System.out.println(whatInt+" ");;

    }

    // 1 to N all values
    static void print1toN(int n) {
        if (n == 0) {
            return;
        }


        print1toN(n - 1);
        //before recursive call -->> main diff.
        System.out.println(n);

    }


}
