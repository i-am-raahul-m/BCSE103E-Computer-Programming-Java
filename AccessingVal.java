public class AccessingVal {
    int x = 5;
    public static void main(String[] args)
    {
        AccessingVal myObj1 = new AccessingVal();
        AccessingVal myObj2 = new AccessingVal();
        myObj2.x = 25;
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
    }
}
