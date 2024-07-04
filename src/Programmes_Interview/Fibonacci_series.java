package Programmes_Interview;

public class Fibonacci_series {

	public static void main(String[] args) 
	{
		int n=10;
		int fib1=0;
		int fib2=1;
		System.out.print(fib1+" "+fib2+" ");
		for(int i=1;i<=n;i++)
		{
			int fib3=fib1+fib2;
			fib1=fib2;
			fib2=fib3;
			System.out.print(fib3+" ");
		}
		

	}

}
