public class StrBuilderInsert {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.insert(5, "World");
        System.out.println(sb);
    }
}
