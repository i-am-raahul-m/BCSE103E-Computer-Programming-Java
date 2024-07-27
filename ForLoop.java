public class ForLoop {
    public static void main(String[] args)
    {
        int i = 0;
        for (;;) {
            System.out.println(i);
            i++;
            if (i == 5) {
                break;
            }
        }
        System.out.println();
        for (int j = 0; j < 5; j++) {
            System.out.println(j);
        }
    }
}
