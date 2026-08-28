package Arrays;
import java.util.Arrays;
public class ShiftArrBy1 {
    public static void main(String[] args) {
        int [] arr  = {1,2,3,4,5};
        shiftArrBy1(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void shiftArrBy1(int[] arr) {
        int n = arr.length;
        int temp = arr[n-1];


        //shift
        for(int i =n-1; i>0; i--){

            arr[i ] = arr[i-1];
        }
        arr[0] = temp;
    }

}
