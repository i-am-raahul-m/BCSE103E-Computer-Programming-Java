public class StrBuilderReplace {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        sb.replace(1, 3, "Java");
        System.out.println(sb);
    }
}
