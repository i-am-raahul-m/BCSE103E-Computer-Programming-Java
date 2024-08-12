public class MethodCreation {
    static void myStaticMethod()
    {
        System.out.println("Static methods are called without object creating objects");
    }

    public void myPublicMethod()
    {
        System.out.println("Public methods must be called by creating objects");
    }

    public static void main(String[] args)
    {
    MethodCreation myObj = new MethodCreation();
    myStaticMethod();
    myObj.myPublicMethod();
    }
}
