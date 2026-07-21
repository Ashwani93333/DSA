package recursion;

public class BinarySearchRec {
    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
        System.out.println(binarySearchRec(arr,target,0,arr.length-1));
    }

    static int binarySearchRec(int[] arr , int target , int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid =  start + (end - start)/2;

        if(target>arr[mid]){
            return binarySearchRec(arr , target , mid+1, end);
        }else if(target<arr[mid]){
            return binarySearchRec(arr , target , start, mid-1);
        }else{
            return mid;
        }
    }
}
