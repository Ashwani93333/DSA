package Arrays;
import java.util.ArrayList;
import java.util.List;

public class SumOfEachRow {
    public static void main(String[] args) {
        System.out.println(rowSum());
    }

    static List<Integer> rowSum(){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int n = arr.length;
        int m = arr[0].length;
        int sum = 0;
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){

                sum += arr[i][j];

            }
            list.add(sum);
            sum = 0;
        }
        return list;
    }
}
