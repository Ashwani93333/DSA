package Arrays;

import java.util.ArrayList;
import java.util.List;

public class ThreeSums {
    // Brute Force approach but time complexity.. may var

    //Declare a nested list
    public static void main(String[] args) {
        System.out.println(threeSums(new int[]{-1, 0, 1, 2, -1, -4}));    }

    static List<List<Integer>> threeSums(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        int target = 0;
        int n = nums.length;

        for(int i = 0; i<n-2; i++){
            for(int j = i+1; j<n-1; j++){

                for(int k = j+1; k<n; k++){

                    if(nums[i]+ nums[k] + nums[j] == target){

                        List<Integer> temp = new ArrayList<>();

                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        output.add(temp);
                    }
                }
            }
        }
        return output;

    }
}
