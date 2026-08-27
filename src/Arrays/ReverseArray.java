package Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main (String [] args){
        int [] arr = {1,3,456,3,64};

        System.out.println("Before reverse array : "+Arrays.toString(arr));

        //calling func.
        reverse(arr);

        System.out.println("After reverse array : "+Arrays.toString(arr));
    }

    public static void reverse(int [] arr){

        int i = 0;
        int j = arr.length-1;
        while(i<j){
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;

            //update
            i++;
            j--;
        }
    }
}
