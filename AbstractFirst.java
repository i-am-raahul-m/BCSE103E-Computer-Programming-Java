abstract class AbstractFirst {
    public String fname = "John";
    public int age = 24;
    public abstract void study();
    public static void main(String[] args)
    {
        
    }
}
class Student extends AbstractFirst
{
    public int graduationYear = 2018;
    public void study()
    {
        System.out.println("Study all day long");
    }
}
