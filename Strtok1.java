import java.util.StringTokenizer;

public class Strtok1 {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("my|name,is,khan", "|");
        System.out.println(st.nextToken());
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken(","));
        }
    }

}
