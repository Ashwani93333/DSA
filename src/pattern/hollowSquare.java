package pattern;

public class hollowSquare {
    public static void main(String[] args) {

        //general way
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j < 4; j++) {

                //condition
                if(i==0||i==3 ||j==0||j==3){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
