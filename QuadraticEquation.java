import java.util.Scanner;

public class QuadraticEquation 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Value of a, b, c: ");
		double a = keyboard.nextDouble();
		double b = keyboard.nextDouble();
		double c = keyboard.nextDouble();
		double x = (b*b)-(4*a*c);
		double d = Math.pow(x, 0.5);
		double equation1 = (-b + d)/2*a;
		double equation2 = (-b - d)/2*a;
		if(x<0)
			System.out.print("No Solution.");
		else
			if (equation1 == equation2)
				System.out.print("The solution is: "+equation1);
			else
				System.out.print("The solutions are: "+equation1+", "+equation2);
	}

}