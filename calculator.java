import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        double a, b;
        int opt;
        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.println("Scientific Calculator");
        while (true) {
            System.out.println("0: Quit");
            System.out.println("1: Addition");
            System.out.println("2: Subtraction");
            System.out.println("3: Multiplication");
            System.out.println("4: Division");
            System.out.println("5: Remainder");
            System.out.println("6: Exponentiation");
            System.out.print("Enter the serial number of operation to be performed: ");
            opt = scan.nextInt();

            if (opt == 0) {
                System.out.println("Exiting scientific calculator...");
                break;
            }
            else {
                System.out.print("Enter first operand: ");
                a = scan.nextDouble(); 
                System.out.print("Enter second operand: ");
                b = scan.nextDouble();
                if (b == 0 && opt == 4) {
                    System.out.println("-------------------------");
                    System.out.print("Ans: ");
                    System.out.println("Cannot divide by zero.");
                    System.out.println("-------------------------");
                    continue;
                }
                
                System.out.println("-------------------------");
                switch (opt)
                {
                    case 1:
                        System.out.print("Ans: ");
                        System.out.println(a+b);
                        break;
                    case 2:
                        System.out.print("Ans: ");
                        System.out.println(a-b);
                        break;
                    case 3:
                        System.out.print("Ans: ");
                        System.out.println(a*b);
                        break;
                    case 4:
                        System.out.print("Ans: ");
                        System.out.println(a/b);
                        break;
                    case 5:
                        System.out.print("Ans: ");
                        System.out.println(a%b);
                        break;
                    case 6:
                        System.out.print("Ans: ");
                        System.out.println(Math.pow(a, b));
                        break;
                    default:
                        System.out.println("Not a valid option!");
                }
                System.out.println("-------------------------");
                System.out.println();
            }
        }
    }
}
