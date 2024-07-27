public class narrowing_tc
{
	public static void main(String[] args)
	{
		double myDouble = 9.78d;
        System.out.println(myDouble);  // Printing double value
		int myInt = (int) myDouble;  // Double value getting type casted into int (narrowing/forced/explicit the casting)
		System.out.println(myInt);  // Printing int value
	}
}
