import java.util.*;

public class SumOfNumbers 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Enter a postive nonzero integer: ");
		int input = keyboard.nextInt();
		while(input<1)
		{
			System.out.print("Enter a POSITIVE, NONZERO integer: ");
			input = keyboard.nextInt();
		}
		int sum=0;
		for(int i=input; i>=1;i--)
		{
		    sum+=i;	
		}
		System.out.print("The sum is: "+sum);			
	}
}