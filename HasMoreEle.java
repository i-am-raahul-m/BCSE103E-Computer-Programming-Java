import java.util.StringTokenizer;

public class HasMoreEle {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Hello everyone, I am a java developer", " ");
        System.out.println(st.nextToken());
        while (st.hasMoreElements()) {
            System.out.println(st.nextToken());
        }
    }
}
