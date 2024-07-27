public class FormattedStr {
    public static void main(String[] args) {
        String s = String.format("Hello my name is %s. I am %d years old.", "Raahul M", 19);
        System.out.println(s);

        System.out.println();

        System.out.printf("%d %d %d %s %c %f %b", 10, 23, 11, "VIT Chennai", 'a', 18.323, true);
    }
}
