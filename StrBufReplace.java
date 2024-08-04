public class StrBufReplace {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello");
        sb.replace(1, 3, "Java");
        System.out.println(sb);
    }
}
