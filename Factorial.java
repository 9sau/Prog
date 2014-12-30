import java.util.Arrays;


public class Factorial {

	static int count;
	static long a[] = new long[1001];
	public static long fact(int n)
	{
		count++;
		if (a[n] !=-1)
			return a[n];
		
		if (n==1 || n==0)
			{
				a[n]=n;
				return a[n];
			}
		else 
		{
			a[n] = fact(n-2) + fact(n-1);
			return a[n];
		}
			
	}
}

class FactorialImplementation {
	public static void main(String arg[])
	{
		Arrays.fill(Factorial.a, -1);
		double start=System.currentTimeMillis();
		System.out.println(Factorial.fact(1000));
		double end=System.currentTimeMillis();
		System.out.println(Factorial.count+" Time taken : "+(end-start)+" ms");
		System.out.println(Arrays.toString(Factorial.a));
	}
}