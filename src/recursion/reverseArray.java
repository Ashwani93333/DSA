package recursion;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};
        //Reverse Array
        reverseArray(arr, arr.length-1,0);
        System.out.println(Arrays.toString(arr));

        //
//        int[] arrNew = {1,2,3};
//        System.out.println(Arrays.toString(arrNew));
//        sum(arrNew);
//        System.out.println(Arrays.toString(arrNew));

    }
    //Reverse the array using recursion
    static void reverseArray(int[]arr,int right , int left){


                //Base condition
                if(left>=right){
                    return ;
                }
//            reverseArray(arr,left+1,right-1);
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
        reverseArray(arr,right-1,left+1 );
//        System.out.println(Arrays.toString(arr));
    }

    static void sum (int []arr){
        arr[0] = 45;
//        System.out.println(a);
    }
}
