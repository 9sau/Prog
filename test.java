class demo2
{
	demo2()
	{
		System.out.println("In the super super class");
	}
	int y;
}
class demo extends demo2
{
	demo()
	{
		System.out.println("In the super class");
	}
	int y;
}
public class test extends demo
 {
	final int x=10;
	
	test()
	{
		System.out.println("In the sub class default constructor");
	}
 
	test(int z)
	{
		System.out.println("In the sub class parameterized constructor");
	}
	
	public static void main( String args[] )
  {
		
		test r1 = new test(10);
		//System.out.println(r1.x);
		//test r2 = new test(10);
		//System.out.println(r2.x);
		
  } // end main
 } 