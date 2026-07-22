package recursion;

public class BasicRecursion {
    public static void main(String[] args) {
        //to print 1 to n numbers using rec.
        int ans = printNum(5);
        if (ans == 0) {
            System.out.println("exit");
        }else{
            System.out.println(ans);
        }

        int ans2 = printNum2(1);
        if (ans == 0) {
            System.out.println("exit");
        }else{
            System.out.println(ans);
        }

    }

    // upper value to lower value
    static int printNum(int n){
        if (n == 0){
            return 0;
        }
        System.out.println(n);
        return printNum(n-1);

    }

    //lower value to upper value
    static int printNum2(int n){
        if (n == 6){
            return 0;
        }

        System.out.println(n);
        return printNum2(n+1);
    }


}
