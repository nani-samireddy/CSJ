import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {


        //output
        System.out.print("one\n");
        System.out.print("two\n");

        //ln
        System.out.println("three");
        System.out.println("four");



        //format
        int number = 12;
        int numbe2 = 11;
        System.out.printf("%d is a number that comes after %d\n",number,numbe2);

        //input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any float number: ");
        String name = input.nextLine();
        System.out.printf("you have entered %s",name);

    }



}
