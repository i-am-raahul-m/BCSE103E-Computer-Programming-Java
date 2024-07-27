public class final1
{
	public static void main(String[] args)
	{
		final int int_var = 34;  // final keyword used to convert a variable to a constant
        int_var = 67;  // Trying to change a constant value, results in error
		System.out.println(int_var);
	}
}
