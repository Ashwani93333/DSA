package pattern;

public class NumLoop {
    public static void main(String[] args) {

//        //sort of circle of diff nums
//        for (int i = 4; i>=1 ; i--) {
//            for (int j = 4; j>=1; j--) {
//
//                //condition is imp
//                if(i==1||i==4||j==1||j==4){
//                    System.out.print(i);
//                }else{
//                    System.out.println(" ");
//                }
//            }
//            System.out.println();
//        }


        //Number alternate
        int num = 1;
        for (int i = 0; i <4; i++) {
            for (int j = 0; j <i+1; j++) {
                System.out.print(num);
                num = num+1;
            }
            System.out.println();
        }
    }
}
