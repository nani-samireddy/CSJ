import java.util.Scanner;

public class NewLineError {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //input.skip("[\r\n]");
        System.out.println("Enter your Name: ");
        String name = input.nextLine();

        System.out.println("Enter your age: ");
        int age = input.nextInt();
        input.nextLine();
        System.out.println("Enter your city name: ");
        String city = input.nextLine();

        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("City: "+city);

    }
}

