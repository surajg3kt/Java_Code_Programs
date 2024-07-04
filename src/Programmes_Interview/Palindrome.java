package Programmes_Interview;

public class Palindrome {

	public static void main(String[] args)
	{
		int n=145;
		int sum=0;
		int pal=n;
		
		while(n!=0)
		{
			int rem=n%10;
			  sum=(sum*10)+rem;
			  n=n/10;
		}
		System.out.println(sum);
		
		if(sum==pal)
		{
			System.out.println(pal+" is a palindrome");
		}
		else
		{
			System.out.println(pal+" is not a palindrome");
		}

	}

}
