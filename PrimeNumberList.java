public class PrimeNumberList 
{	
	public static void main(String[] args) 
	{
		for(int x=1;x<=100;x++)
		{
			if(isPrime(x))
				System.out.println(x);
		}
	}
	
	public static boolean isPrime(int i)
	{
		int result=0;
		for (int x=1;x<=i;x++)
		{
			if((i%x)==0)
				result++;
		}
		if(result==2)
			return true;
		else
			return false;	
	}
}