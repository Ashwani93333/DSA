package Arrays;

import java.util.HashMap;

public class MaxFreqElement {
    public static void main(String[] args) {

        int [] arr = {2,2,3,45,4,46};
        int ans = maxFreq(arr);
        System.out.println("Max is :"+ans);
    }

    static int maxFreq(int[] arr) {


        //hashMap
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int e : arr){
            freq.put(e, freq.getOrDefault(e, 0) + 1);
        }

        //get Max one
        int max = -1;
        for(int i : freq.keySet()){
            int key = i;
            int maxfreq = freq.get(key);

            if(maxfreq>max){
                max = i;
            }
        }

        return max;
    }
}
