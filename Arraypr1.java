import java.util.Scanner;

public class Arraypr1 {
    public static void main(String[] args)
    {
        int size;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        size = scan.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.printf("Enter element %d: ", i);
            arr[i] = scan.nextInt();
        }

        for (int i : arr) System.out.println(i);
    }
}
