package Arrays;

import java.util.HashMap;

public class FindFirstRepeatingElem {
    public static void main(String[] args) {
        int [] arr = {2,3,5,5,6};

        int ans  = firstRepeatEle(arr);
        if(ans!=-1){
            System.out.println("First Repeating Element: "+ans);
        }else{
            System.out.println("No First Repeating Element , Array is Unique");
        }
    }


    static int firstRepeatEle(int arr[]){

        HashMap<Integer, Integer> freq = new HashMap<>();

        //put elements in hashMap
        for(int e : arr){
            freq.put(e, freq.getOrDefault(e, 0)+1);
        }

        //check for duplicate
//        for(int i: freq.keySet()){
//            int currFreq = freq.get(i);
//
//            if(currFreq>0){
//                return i;
//            }
//        }
        for (int i : arr) {
            //because HashMap m aate hi freq 1 hogi us element ki
            if(freq.get(i)>1){
                return i;
            }
        }

        return -1;
    }
}
