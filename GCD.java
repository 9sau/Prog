
public class GCD {

	public static long calculateGCD(long a,long b)
	{
		if(a%b==0)
			return b;
		else
			return calculateGCD(b,a%b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(GCD.calculateGCD(2700,242));
	}

}
