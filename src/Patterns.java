import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        /*
                *
                **
                ***

                  *
                 **
                ***
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int numberOfRows = scanner.nextInt();
        //3 < 3 -->false
        for (int i=0;i<numberOfRows;i++){
            //0<=2
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
           if (i!=numberOfRows-1){
               System.out.println("");
           }
        }


    }
}
