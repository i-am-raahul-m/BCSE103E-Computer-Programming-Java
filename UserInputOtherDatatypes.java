import java.util.Scanner;

public class UserInputOtherDatatypes {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter name: ");
        String username = scan.nextLine();

        System.out.println("Enter age: ");
        int age = scan.nextInt();

    }
}
