package recursion;

public class NthTime {
    public static void main(String[] args) {


        //N- Times a particular value printed using recursive call
//        printNthTimes(10,56);

//        Nto1(10);


        // Sum from 1 to N
//        int sum = sumOfNthNumber(5);
//        System.out.println(sum);
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

    //N times a value(Back LOop)
    static void printNthTimes(int times, int whatInt){
        if(times==0){
            return;
        }
        //call(NIche ni jaa rha >>>> call kre ja rha hhh thne kaam hoga )
        printNthTimes(times-1,whatInt);
        //post order after recursive call
        System.out.println(whatInt+" ");;

    }

    // 1 to N all values
    static void print1toN(int n) {
        if (n == 0) {
            return;
        }


        //before recursive call -->> main diff.
        print1toN(n - 1);

        System.out.println(n);

    }

    // sum upto N given number
    static int sumOfNthNumber(int n){
        if(n==0){
            return 0;
        }

        return n+sumOfNthNumber(n-1);
    }


}
