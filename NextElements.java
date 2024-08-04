import java.util.StringTokenizer;

public class NextElements {
    public static void main(String[] args)
    {
        StringTokenizer st = new StringTokenizer("Hello Everyone Hava nice day");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextElement());
        }
    }
}
