import java.util.StringTokenizer;

public class Strtok2 {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Demonstarting methods from StringTokenizer class\nThis is second line of the file.\n This is third line.", " ");
        System.out.println(st.nextToken());
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
