import java.util.Scanner;

public class UserInput {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter username: ");
        String username = scan.nextLine();
        System.out.println("Username is: " + username);
    }
}
