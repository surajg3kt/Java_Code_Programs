package TestCode;

 class factorial
{
	int fact(int n)
	{
		int result;
		
		if(n<=1) // base case: factorial of 0 or 1 is 1
		{
			return 1;
		}
		else {
			result=fact(n-1)*n;//recursive case
			return result;
		}
	}
}

 class recursion 
{

	public static void main(String[] args) 
	{
		factorial f=new factorial();
		System.out.println(f.fact(3));
		System.out.println(f.fact(1));

	}

}
