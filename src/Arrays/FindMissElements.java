package Arrays;

import java.util.ArrayList;
import java.util.List;

public class FindMissElements {

    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 3};

        System.out.println(findMissElements(arr));
    }

    static List<Integer> findMissElements(int[] arr) {

        int n = arr.length;
        List<Integer> ans = new ArrayList<>();

        // Mark the index corresponding to each number
        for (int i = 0; i < n; i++) {

            int index = Math.abs(arr[i]) - 1;

            if (arr[index] > 0) {
                arr[index] = -arr[index];
            }
        }

        // Positive values mean that index was never marked
        for (int i = 0; i < n; i++) {

            if (arr[i] > 0) {
                ans.add(i + 1);
            }
        }

        return ans;
    }
}