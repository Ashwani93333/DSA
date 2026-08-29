package Arrays;


import java.util.Arrays;


public class Shift_num {
    public static void main (String args[]) {


        int [] arr = {1,0,1,0,0,1};

        //Two pointer approach
        int i = 0;
        int j = arr.length-1;

        while (i < j) {
            if(arr[i] == 1 && arr[j]==0){
                //swap
                int  temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;


                i++;
                j--;
            }else if(arr[i]==1){
                j--;
            }else{
                i++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
