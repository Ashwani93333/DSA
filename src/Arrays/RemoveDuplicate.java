package Arrays;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4};

        int size = removeDuplicates(arr);
        System.out.println("Size of obtained array is : "+ size +" Array is : "+ Arrays.toString(arr));
    }

    static int removeDuplicates(int [] nums){

        int i = 0;
        int j = 1;
        int n = nums.length;

        while (j < n){

            if(nums[i] ==nums[j]){
                j++;
            }else{
                i++;
                nums[i]=nums[j];
                j++;
            }
        }

        //return len of final unique array
        return i+1;
    }
}
