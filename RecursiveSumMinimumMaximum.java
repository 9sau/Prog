
public class RecursiveSumMinimumMaximum {

	static int a[]={10,5,20,30,6,40,50,60,8};
	
	public static int findMinimum(int n,int min,int max)
	{
		if (n==a.length-1)
			return min+max;
		else
		{
			if (a[n]<min)
				min=a[n];
			if(a[n]>max)
				max=a[n];
			return findMinimum(n+1,min,max);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Minimum is : "+findMinimum(0, Integer.MAX_VALUE,Integer.MIN_VALUE));

	}

}
